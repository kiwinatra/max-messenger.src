package org.apache.http.impl.conn.tsccm;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;

@Deprecated
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected ClientConnectionOperator connOperator;
    protected final AbstractConnPool connectionPool;
    /* access modifiers changed from: private */
    public final Log log = LogFactory.getLog((Class) getClass());
    protected SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        if (httpParams != null) {
            this.schemeRegistry = schemeRegistry2;
            this.connOperator = createConnectionOperator(schemeRegistry2);
            this.connectionPool = createConnectionPool(httpParams);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public void closeExpiredConnections() {
        this.connectionPool.closeExpiredConnections();
        this.connectionPool.deleteClosedConnections();
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        this.connectionPool.closeIdleConnections(j, timeUnit);
        this.connectionPool.deleteClosedConnections();
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        ConnPoolByRoute connPoolByRoute = new ConnPoolByRoute(this.connOperator, httpParams);
        connPoolByRoute.enableConnectionGC();
        return connPoolByRoute;
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return ((ConnPoolByRoute) this.connectionPool).getConnectionsInPool(httpRoute);
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [org.apache.http.impl.conn.AbstractPoolEntry] */
    /* JADX WARNING: type inference failed for: r0v10, types: [org.apache.http.impl.conn.AbstractPoolEntry] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter
            if (r0 == 0) goto L_0x00a2
            org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter r9 = (org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter) r9
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.getPoolEntry()
            if (r0 == 0) goto L_0x001b
            org.apache.http.conn.ClientConnectionManager r0 = r9.getManager()
            if (r0 != r8) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        L_0x001b:
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.getPoolEntry()     // Catch:{ IOException -> 0x0031 }
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r0 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r0     // Catch:{ IOException -> 0x0031 }
            org.apache.http.conn.OperatedClientConnection r0 = r0.getConnection()     // Catch:{ IOException -> 0x0031 }
            java.net.Socket r0 = r0.getSocket()     // Catch:{ IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            android.net.TrafficStats.untagSocket(r0)     // Catch:{ IOException -> 0x0031 }
            goto L_0x0033
        L_0x002f:
            r0 = move-exception
            goto L_0x008a
        L_0x0031:
            r0 = move-exception
            goto L_0x0069
        L_0x0033:
            boolean r0 = r9.isOpen()     // Catch:{ IOException -> 0x0031 }
            if (r0 == 0) goto L_0x0051
            boolean r0 = r9.isMarkedReusable()     // Catch:{ IOException -> 0x0031 }
            if (r0 != 0) goto L_0x0051
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x0031 }
            boolean r0 = r0.isDebugEnabled()     // Catch:{ IOException -> 0x0031 }
            if (r0 == 0) goto L_0x004e
            org.apache.commons.logging.Log r0 = r8.log     // Catch:{ IOException -> 0x0031 }
            java.lang.String r1 = "Released connection open but not marked reusable."
            r0.debug(r1)     // Catch:{ IOException -> 0x0031 }
        L_0x004e:
            r9.shutdown()     // Catch:{ IOException -> 0x0031 }
        L_0x0051:
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.getPoolEntry()
            r2 = r0
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r2 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r2
            boolean r3 = r9.isMarkedReusable()
            r9.detach()
            if (r2 == 0) goto L_0x0089
        L_0x0061:
            org.apache.http.impl.conn.tsccm.AbstractConnPool r1 = r8.connectionPool
            r4 = r10
            r6 = r12
            r1.freeEntry(r2, r3, r4, r6)
            goto L_0x0089
        L_0x0069:
            org.apache.commons.logging.Log r1 = r8.log     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isDebugEnabled()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0078
            org.apache.commons.logging.Log r1 = r8.log     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "Exception shutting down released connection."
            r1.debug(r2, r0)     // Catch:{ all -> 0x002f }
        L_0x0078:
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.getPoolEntry()
            r2 = r0
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r2 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r2
            boolean r3 = r9.isMarkedReusable()
            r9.detach()
            if (r2 == 0) goto L_0x0089
            goto L_0x0061
        L_0x0089:
            return
        L_0x008a:
            org.apache.http.impl.conn.AbstractPoolEntry r1 = r9.getPoolEntry()
            r3 = r1
            org.apache.http.impl.conn.tsccm.BasicPoolEntry r3 = (org.apache.http.impl.conn.tsccm.BasicPoolEntry) r3
            boolean r4 = r9.isMarkedReusable()
            r9.detach()
            if (r3 == 0) goto L_0x00a1
            org.apache.http.impl.conn.tsccm.AbstractConnPool r2 = r8.connectionPool
            r5 = r10
            r7 = r12
            r2.freeEntry(r3, r4, r5, r7)
        L_0x00a1:
            throw r0
        L_0x00a2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection class mismatch, connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        final PoolEntryRequest requestPoolEntry = this.connectionPool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() {
            public void abortRequest() {
                requestPoolEntry.abortRequest();
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException {
                if (httpRoute != null) {
                    if (ThreadSafeClientConnManager.this.log.isDebugEnabled()) {
                        Log access$000 = ThreadSafeClientConnManager.this.log;
                        access$000.debug("ThreadSafeClientConnManager.getConnection: " + httpRoute + ", timeout = " + j);
                    }
                    BasicPoolEntry poolEntry = requestPoolEntry.getPoolEntry(j, timeUnit);
                    try {
                        Socket socket = poolEntry.getConnection().getSocket();
                        if (socket != null) {
                            TrafficStats.tagSocket(socket);
                        }
                    } catch (IOException e) {
                        ThreadSafeClientConnManager.this.log.debug("Problem tagging socket.", e);
                    }
                    return new BasicPooledConnAdapter(ThreadSafeClientConnManager.this, poolEntry);
                }
                throw new IllegalArgumentException("Route may not be null.");
            }
        };
    }

    public void shutdown() {
        this.connectionPool.shutdown();
    }

    public int getConnectionsInPool() {
        int i;
        synchronized (this.connectionPool) {
            i = this.connectionPool.numConnections;
        }
        return i;
    }
}
