package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.IdleConnectionHandler;

@Deprecated
public abstract class AbstractConnPool implements RefQueueHandler {
    protected IdleConnectionHandler idleConnHandler = new IdleConnectionHandler();
    protected volatile boolean isShutDown;
    protected Set<BasicPoolEntryRef> issuedConnections = new HashSet();
    private final Log log = LogFactory.getLog((Class) getClass());
    protected int numConnections;
    protected final Lock poolLock = new ReentrantLock(false);
    protected ReferenceQueue<Object> refQueue;
    private RefQueueWorker refWorker;

    public void closeConnection(OperatedClientConnection operatedClientConnection) {
        if (operatedClientConnection != null) {
            try {
                operatedClientConnection.close();
            } catch (IOException e) {
                this.log.debug("I/O error closing connection", e);
            }
        }
    }

    public void closeExpiredConnections() {
        this.poolLock.lock();
        try {
            this.idleConnHandler.closeExpiredConnections();
        } finally {
            this.poolLock.unlock();
        }
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            this.poolLock.lock();
            try {
                this.idleConnHandler.closeIdleConnections(timeUnit.toMillis(j));
            } finally {
                this.poolLock.unlock();
            }
        } else {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
    }

    public abstract void deleteClosedConnections();

    /* JADX INFO: finally extract failed */
    public void enableConnectionGC() throws IllegalStateException {
        if (this.refQueue == null) {
            this.poolLock.lock();
            try {
                if (this.numConnections <= 0) {
                    this.poolLock.unlock();
                    ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
                    this.refQueue = referenceQueue;
                    this.refWorker = new RefQueueWorker(referenceQueue, this);
                    Thread thread = new Thread(this.refWorker);
                    thread.setDaemon(true);
                    thread.setName("RefQueueWorker@" + this);
                    thread.start();
                    return;
                }
                throw new IllegalStateException("Pool already in use.");
            } catch (Throwable th) {
                this.poolLock.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("Connection GC already enabled.");
        }
    }

    public abstract void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit);

    public final BasicPoolEntry getEntry(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit) throws ConnectionPoolTimeoutException, InterruptedException {
        return requestPoolEntry(httpRoute, obj).getPoolEntry(j, timeUnit);
    }

    public abstract void handleLostEntry(HttpRoute httpRoute);

    public void handleReference(Reference reference) {
        this.poolLock.lock();
        try {
            if ((reference instanceof BasicPoolEntryRef) && this.issuedConnections.remove(reference)) {
                HttpRoute route = ((BasicPoolEntryRef) reference).getRoute();
                if (this.log.isDebugEnabled()) {
                    Log log2 = this.log;
                    log2.debug("Connection garbage collected. " + route);
                }
                handleLostEntry(route);
            }
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }

    public abstract PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj);

    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                this.poolLock.unlock();
                return;
            }
            RefQueueWorker refQueueWorker = this.refWorker;
            if (refQueueWorker != null) {
                refQueueWorker.shutdown();
            }
            Iterator<BasicPoolEntryRef> it = this.issuedConnections.iterator();
            while (it.hasNext()) {
                it.remove();
                BasicPoolEntry basicPoolEntry = (BasicPoolEntry) it.next().get();
                if (basicPoolEntry != null) {
                    closeConnection(basicPoolEntry.getConnection());
                }
            }
            this.idleConnHandler.removeAll();
            this.isShutDown = true;
            this.poolLock.unlock();
        } catch (Throwable th) {
            this.poolLock.unlock();
            throw th;
        }
    }
}
