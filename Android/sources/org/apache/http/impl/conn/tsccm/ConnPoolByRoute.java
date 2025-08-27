package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

@Deprecated
public class ConnPoolByRoute extends AbstractConnPool {
    private final ConnPerRoute connPerRoute;
    protected Queue<BasicPoolEntry> freeConnections;
    private final Log log = LogFactory.getLog((Class) getClass());
    protected final int maxTotalConnections;
    protected final ClientConnectionOperator operator;
    protected final Map<HttpRoute, RouteSpecificPool> routeToPool;
    protected Queue<WaitingThread> waitingThreads;

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        if (clientConnectionOperator != null) {
            this.operator = clientConnectionOperator;
            this.freeConnections = createFreeConnQueue();
            this.waitingThreads = createWaitingThreadQueue();
            this.routeToPool = createRouteToPoolMap();
            this.maxTotalConnections = ConnManagerParams.getMaxTotalConnections(httpParams);
            this.connPerRoute = ConnManagerParams.getMaxConnectionsPerRoute(httpParams);
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    public BasicPoolEntry createEntry(RouteSpecificPool routeSpecificPool, ClientConnectionOperator clientConnectionOperator) {
        if (this.log.isDebugEnabled()) {
            this.log.debug("Creating new connection [" + routeSpecificPool.getRoute() + "]");
        }
        BasicPoolEntry basicPoolEntry = new BasicPoolEntry(clientConnectionOperator, routeSpecificPool.getRoute(), this.refQueue);
        this.poolLock.lock();
        try {
            routeSpecificPool.createdEntry(basicPoolEntry);
            this.numConnections++;
            this.issuedConnections.add(basicPoolEntry.getWeakRef());
            return basicPoolEntry;
        } finally {
            this.poolLock.unlock();
        }
    }

    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    public Map<HttpRoute, RouteSpecificPool> createRouteToPoolMap() {
        return new HashMap();
    }

    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    public void deleteClosedConnections() {
        this.poolLock.lock();
        try {
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                if (!next.getConnection().isOpen()) {
                    it.remove();
                    deleteEntry(next);
                }
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void deleteEntry(BasicPoolEntry basicPoolEntry) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Deleting connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            closeConnection(basicPoolEntry.getConnection());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            routePool.deleteEntry(basicPoolEntry);
            this.numConnections--;
            if (routePool.isUnused()) {
                this.routeToPool.remove(plannedRoute);
            }
            this.idleConnHandler.remove(basicPoolEntry.getConnection());
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public void deleteLeastUsedEntry() {
        try {
            this.poolLock.lock();
            BasicPoolEntry remove = this.freeConnections.remove();
            if (remove != null) {
                deleteEntry(remove);
            } else if (this.log.isDebugEnabled()) {
                this.log.debug("No free connection to delete.");
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    public void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit) {
        HttpRoute plannedRoute = basicPoolEntry.getPlannedRoute();
        if (this.log.isDebugEnabled()) {
            this.log.debug("Freeing connection [" + plannedRoute + "][" + basicPoolEntry.getState() + "]");
        }
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                closeConnection(basicPoolEntry.getConnection());
                return;
            }
            this.issuedConnections.remove(basicPoolEntry.getWeakRef());
            RouteSpecificPool routePool = getRoutePool(plannedRoute, true);
            if (z) {
                routePool.freeEntry(basicPoolEntry);
                this.freeConnections.add(basicPoolEntry);
                this.idleConnHandler.add(basicPoolEntry.getConnection(), j, timeUnit);
            } else {
                routePool.dropEntry();
                this.numConnections--;
            }
            notifyWaitingThread(routePool);
            this.poolLock.unlock();
        } finally {
            this.poolLock.unlock();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        this.poolLock.lock();
        int i = 0;
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, false);
            if (routePool != null) {
                i = routePool.getEntryCount();
            }
            return i;
        } finally {
            this.poolLock.unlock();
        }
    }

    public BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) throws ConnectionPoolTimeoutException, InterruptedException {
        RouteSpecificPool routePool;
        WaitingThread waitingThread;
        BasicPoolEntry basicPoolEntry = null;
        Date date = j > 0 ? new Date(timeUnit.toMillis(j) + System.currentTimeMillis()) : null;
        this.poolLock.lock();
        try {
            routePool = getRoutePool(httpRoute, true);
            waitingThread = null;
            while (true) {
                if (basicPoolEntry != null) {
                    break;
                } else if (!this.isShutDown) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Total connections kept alive: " + this.freeConnections.size());
                        this.log.debug("Total issued connections: " + this.issuedConnections.size());
                        this.log.debug("Total allocated connection: " + this.numConnections + " out of " + this.maxTotalConnections);
                    }
                    basicPoolEntry = getFreeEntry(routePool, obj);
                    if (basicPoolEntry != null) {
                        break;
                    }
                    boolean z = routePool.getCapacity() > 0;
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Available capacity: " + routePool.getCapacity() + " out of " + routePool.getMaxEntries() + " [" + httpRoute + "][" + obj + "]");
                    }
                    if (z && this.numConnections < this.maxTotalConnections) {
                        basicPoolEntry = createEntry(routePool, this.operator);
                    } else if (!z || this.freeConnections.isEmpty()) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Need to wait for connection [" + httpRoute + "][" + obj + "]");
                        }
                        if (waitingThread == null) {
                            waitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                            waitingThreadAborter.setWaitingThread(waitingThread);
                        }
                        routePool.queueThread(waitingThread);
                        this.waitingThreads.add(waitingThread);
                        boolean await = waitingThread.await(date);
                        routePool.removeThread(waitingThread);
                        this.waitingThreads.remove(waitingThread);
                        if (!await && date != null) {
                            if (date.getTime() <= System.currentTimeMillis()) {
                                throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                            }
                        }
                    } else {
                        deleteLeastUsedEntry();
                        basicPoolEntry = createEntry(routePool, this.operator);
                    }
                } else {
                    throw new IllegalStateException("Connection pool shut down.");
                }
            }
            this.poolLock.unlock();
            return basicPoolEntry;
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public BasicPoolEntry getFreeEntry(RouteSpecificPool routeSpecificPool, Object obj) {
        this.poolLock.lock();
        BasicPoolEntry basicPoolEntry = null;
        boolean z = false;
        while (!z) {
            try {
                basicPoolEntry = routeSpecificPool.allocEntry(obj);
                if (basicPoolEntry != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Getting free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                    }
                    this.freeConnections.remove(basicPoolEntry);
                    if (!this.idleConnHandler.remove(basicPoolEntry.getConnection())) {
                        if (this.log.isDebugEnabled()) {
                            this.log.debug("Closing expired free connection [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                        }
                        closeConnection(basicPoolEntry.getConnection());
                        routeSpecificPool.dropEntry();
                        this.numConnections--;
                    } else {
                        this.issuedConnections.add(basicPoolEntry.getWeakRef());
                    }
                } else if (this.log.isDebugEnabled()) {
                    this.log.debug("No free connections [" + routeSpecificPool.getRoute() + "][" + obj + "]");
                }
                z = true;
            } catch (Throwable th) {
                this.poolLock.unlock();
                throw th;
            }
        }
        this.poolLock.unlock();
        return basicPoolEntry;
    }

    public RouteSpecificPool getRoutePool(HttpRoute httpRoute, boolean z) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routeSpecificPool = this.routeToPool.get(httpRoute);
            if (routeSpecificPool == null && z) {
                routeSpecificPool = newRouteSpecificPool(httpRoute);
                this.routeToPool.put(httpRoute, routeSpecificPool);
            }
            return routeSpecificPool;
        } finally {
            this.poolLock.unlock();
        }
    }

    public void handleLostEntry(HttpRoute httpRoute) {
        this.poolLock.lock();
        try {
            RouteSpecificPool routePool = getRoutePool(httpRoute, true);
            routePool.dropEntry();
            if (routePool.isUnused()) {
                this.routeToPool.remove(httpRoute);
            }
            this.numConnections--;
            notifyWaitingThread(routePool);
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public RouteSpecificPool newRouteSpecificPool(HttpRoute httpRoute) {
        return new RouteSpecificPool(httpRoute, this.connPerRoute.getMaxForRoute(httpRoute));
    }

    public WaitingThread newWaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        return new WaitingThread(condition, routeSpecificPool);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b A[Catch:{ all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Notifying thread waiting on pool ["
            java.util.concurrent.locks.Lock r1 = r3.poolLock
            r1.lock()
            if (r4 == 0) goto L_0x0039
            boolean r1 = r4.hasThread()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0039
            org.apache.commons.logging.Log r1 = r3.log     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0034
            org.apache.commons.logging.Log r1 = r3.log     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            org.apache.http.conn.routing.HttpRoute r0 = r4.getRoute()     // Catch:{ all -> 0x0032 }
            r2.append(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "]"
            r2.append(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0032 }
            r1.debug(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            goto L_0x0074
        L_0x0034:
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = r4.nextThread()     // Catch:{ all -> 0x0032 }
            goto L_0x0069
        L_0x0039:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch:{ all -> 0x0032 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0059
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0032 }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0050
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "Notifying thread waiting on any pool"
            r4.debug(r0)     // Catch:{ all -> 0x0032 }
        L_0x0050:
            java.util.Queue<org.apache.http.impl.conn.tsccm.WaitingThread> r4 = r3.waitingThreads     // Catch:{ all -> 0x0032 }
            java.lang.Object r4 = r4.remove()     // Catch:{ all -> 0x0032 }
            org.apache.http.impl.conn.tsccm.WaitingThread r4 = (org.apache.http.impl.conn.tsccm.WaitingThread) r4     // Catch:{ all -> 0x0032 }
            goto L_0x0069
        L_0x0059:
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0032 }
            boolean r4 = r4.isDebugEnabled()     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x0068
            org.apache.commons.logging.Log r4 = r3.log     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "Notifying no-one, there are no waiting threads"
            r4.debug(r0)     // Catch:{ all -> 0x0032 }
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 == 0) goto L_0x006e
            r4.wakeup()     // Catch:{ all -> 0x0032 }
        L_0x006e:
            java.util.concurrent.locks.Lock r3 = r3.poolLock
            r3.unlock()
            return
        L_0x0074:
            java.util.concurrent.locks.Lock r3 = r3.poolLock
            r3.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ConnPoolByRoute.notifyWaitingThread(org.apache.http.impl.conn.tsccm.RouteSpecificPool):void");
    }

    public PoolEntryRequest requestPoolEntry(final HttpRoute httpRoute, final Object obj) {
        final WaitingThreadAborter waitingThreadAborter = new WaitingThreadAborter();
        return new PoolEntryRequest() {
            public void abortRequest() {
                ConnPoolByRoute.this.poolLock.lock();
                try {
                    waitingThreadAborter.abort();
                } finally {
                    ConnPoolByRoute.this.poolLock.unlock();
                }
            }

            public BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                return ConnPoolByRoute.this.getEntryBlocking(httpRoute, obj, j, timeUnit, waitingThreadAborter);
            }
        };
    }

    public void shutdown() {
        this.poolLock.lock();
        try {
            super.shutdown();
            Iterator<BasicPoolEntry> it = this.freeConnections.iterator();
            while (it.hasNext()) {
                it.remove();
                closeConnection(it.next().getConnection());
            }
            Iterator<WaitingThread> it2 = this.waitingThreads.iterator();
            while (it2.hasNext()) {
                it2.remove();
                it2.next().wakeup();
            }
            this.routeToPool.clear();
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }
}
