package org.apache.http.impl.conn;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;

@Deprecated
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected boolean alwaysShutDown;
    protected ClientConnectionOperator connOperator;
    protected long connectionExpiresTime;
    protected volatile boolean isShutDown;
    protected long lastReleaseTime;
    private final Log log = LogFactory.getLog((Class) getClass());
    protected ConnAdapter managedConn;
    protected SchemeRegistry schemeRegistry;
    protected PoolEntry uniquePoolEntry;

    public class ConnAdapter extends AbstractPooledConnAdapter {
        public ConnAdapter(PoolEntry poolEntry, HttpRoute httpRoute) {
            super(SingleClientConnManager.this, poolEntry);
            markReusable();
            poolEntry.route = httpRoute;
        }
    }

    public class PoolEntry extends AbstractPoolEntry {
        public PoolEntry() {
            super(SingleClientConnManager.this.connOperator, (HttpRoute) null);
        }

        public void close() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        public void shutdown() throws IOException {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            this.connOperator = createConnectionOperator(schemeRegistry2);
            this.uniquePoolEntry = new PoolEntry();
            this.managedConn = null;
            this.lastReleaseTime = -1;
            this.alwaysShutDown = false;
            this.isShutDown = false;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    public final void assertStillUp() throws IllegalStateException {
        if (this.isShutDown) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    public void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0, TimeUnit.MILLISECONDS);
        }
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        assertStillUp();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        } else if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
            if (this.lastReleaseTime <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.uniquePoolEntry.close();
                } catch (IOException e) {
                    this.log.debug("Problem closing idle connection.", e);
                }
            }
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        boolean z;
        if (httpRoute != null) {
            assertStillUp();
            if (this.log.isDebugEnabled()) {
                this.log.debug("Get connection for route " + httpRoute);
            }
            if (this.managedConn != null) {
                revokeConnection();
            }
            closeExpiredConnections();
            boolean z2 = true;
            boolean z3 = false;
            if (this.uniquePoolEntry.connection.isOpen()) {
                RouteTracker routeTracker = this.uniquePoolEntry.tracker;
                z3 = routeTracker == null || !routeTracker.toRoute().equals(httpRoute);
                z = false;
            } else {
                z = true;
            }
            if (z3) {
                try {
                    this.uniquePoolEntry.shutdown();
                } catch (IOException e) {
                    this.log.debug("Problem shutting down connection.", e);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                this.uniquePoolEntry = new PoolEntry();
            }
            try {
                Socket socket = this.uniquePoolEntry.connection.getSocket();
                if (socket != null) {
                    TrafficStats.tagSocket(socket);
                }
            } catch (IOException e2) {
                this.log.debug("Problem tagging socket.", e2);
            }
            ConnAdapter connAdapter = new ConnAdapter(this.uniquePoolEntry, httpRoute);
            this.managedConn = connAdapter;
            return connAdapter;
        }
        throw new IllegalArgumentException("Route may not be null.");
    }

    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r10 > 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r8.connectionExpiresTime = r12.toMillis(r10) + r8.lastReleaseTime;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r8.connectionExpiresTime = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ae, code lost:
        if (r10 <= 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseConnection(org.apache.http.conn.ManagedClientConnection r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            r8.assertStillUp()
            boolean r0 = r9 instanceof org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter
            if (r0 == 0) goto L_0x00ce
            org.apache.commons.logging.Log r0 = r8.log
            boolean r0 = r0.isDebugEnabled()
            if (r0 == 0) goto L_0x0022
            org.apache.commons.logging.Log r0 = r8.log
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Releasing connection "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.debug(r1)
        L_0x0022:
            org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter r9 = (org.apache.http.impl.conn.SingleClientConnManager.ConnAdapter) r9
            org.apache.http.impl.conn.AbstractPoolEntry r0 = r9.poolEntry
            if (r0 != 0) goto L_0x0029
            return
        L_0x0029:
            org.apache.http.conn.ClientConnectionManager r0 = r9.getManager()
            if (r0 == 0) goto L_0x003a
            if (r0 != r8) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        L_0x003a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r4 = 0
            org.apache.http.impl.conn.SingleClientConnManager$PoolEntry r5 = r8.uniquePoolEntry     // Catch:{ IOException -> 0x0052 }
            org.apache.http.conn.OperatedClientConnection r5 = r5.connection     // Catch:{ IOException -> 0x0052 }
            java.net.Socket r5 = r5.getSocket()     // Catch:{ IOException -> 0x0052 }
            if (r5 == 0) goto L_0x0054
            android.net.TrafficStats.untagSocket(r5)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0054
        L_0x0050:
            r5 = move-exception
            goto L_0x00b2
        L_0x0052:
            r5 = move-exception
            goto L_0x0092
        L_0x0054:
            boolean r5 = r9.isOpen()     // Catch:{ IOException -> 0x0052 }
            if (r5 == 0) goto L_0x0076
            boolean r5 = r8.alwaysShutDown     // Catch:{ IOException -> 0x0052 }
            if (r5 != 0) goto L_0x0064
            boolean r5 = r9.isMarkedReusable()     // Catch:{ IOException -> 0x0052 }
            if (r5 != 0) goto L_0x0076
        L_0x0064:
            org.apache.commons.logging.Log r5 = r8.log     // Catch:{ IOException -> 0x0052 }
            boolean r5 = r5.isDebugEnabled()     // Catch:{ IOException -> 0x0052 }
            if (r5 == 0) goto L_0x0073
            org.apache.commons.logging.Log r5 = r8.log     // Catch:{ IOException -> 0x0052 }
            java.lang.String r6 = "Released connection open but not reusable."
            r5.debug(r6)     // Catch:{ IOException -> 0x0052 }
        L_0x0073:
            r9.shutdown()     // Catch:{ IOException -> 0x0052 }
        L_0x0076:
            r9.detach()
            r8.managedConn = r4
            long r4 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r4
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x008f
        L_0x0085:
            long r9 = r12.toMillis(r10)
            long r11 = r8.lastReleaseTime
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9
            goto L_0x00b1
        L_0x008f:
            r8.connectionExpiresTime = r0
            goto L_0x00b1
        L_0x0092:
            org.apache.commons.logging.Log r6 = r8.log     // Catch:{ all -> 0x0050 }
            boolean r6 = r6.isDebugEnabled()     // Catch:{ all -> 0x0050 }
            if (r6 == 0) goto L_0x00a1
            org.apache.commons.logging.Log r6 = r8.log     // Catch:{ all -> 0x0050 }
            java.lang.String r7 = "Exception shutting down released connection."
            r6.debug(r7, r5)     // Catch:{ all -> 0x0050 }
        L_0x00a1:
            r9.detach()
            r8.managedConn = r4
            long r4 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r4
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x008f
            goto L_0x0085
        L_0x00b1:
            return
        L_0x00b2:
            r9.detach()
            r8.managedConn = r4
            long r6 = java.lang.System.currentTimeMillis()
            r8.lastReleaseTime = r6
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cb
            long r9 = r12.toMillis(r10)
            long r11 = r8.lastReleaseTime
            long r9 = r9 + r11
            r8.connectionExpiresTime = r9
            goto L_0x00cd
        L_0x00cb:
            r8.connectionExpiresTime = r0
        L_0x00cd:
            throw r5
        L_0x00ce:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Connection class mismatch, connection not obtained from this manager."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.SingleClientConnManager.releaseConnection(org.apache.http.conn.ManagedClientConnection, long, java.util.concurrent.TimeUnit):void");
    }

    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() {
            public void abortRequest() {
            }

            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return SingleClientConnManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    public void revokeConnection() {
        if (this.managedConn != null) {
            this.log.warn(MISUSE_MESSAGE);
            this.managedConn.detach();
            try {
                this.uniquePoolEntry.shutdown();
            } catch (IOException e) {
                this.log.debug("Problem while shutting down connection.", e);
            }
        }
    }

    public void shutdown() {
        this.isShutDown = true;
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter != null) {
            connAdapter.detach();
        }
        try {
            PoolEntry poolEntry = this.uniquePoolEntry;
            if (poolEntry != null) {
                poolEntry.shutdown();
            }
        } catch (IOException e) {
            this.log.debug("Problem while shutting down manager.", e);
        } catch (Throwable th) {
            this.uniquePoolEntry = null;
            throw th;
        }
        this.uniquePoolEntry = null;
    }
}
