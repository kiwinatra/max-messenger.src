package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

@Deprecated
public class IdleConnectionHandler {
    private final Map<HttpConnection, TimeValues> connectionToTimes = new HashMap();
    private final Log log = LogFactory.getLog((Class) getClass());

    public static class TimeValues {
        /* access modifiers changed from: private */
        public final long timeAdded;
        /* access modifiers changed from: private */
        public final long timeExpires;

        public TimeValues(long j, long j2, TimeUnit timeUnit) {
            this.timeAdded = j;
            if (j2 > 0) {
                this.timeExpires = timeUnit.toMillis(j2) + j;
            } else {
                this.timeExpires = LongCompanionObject.MAX_VALUE;
            }
        }
    }

    public void add(HttpConnection httpConnection, long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        Long valueOf = Long.valueOf(currentTimeMillis);
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Adding connection at: " + valueOf);
        }
        this.connectionToTimes.put(httpConnection, new TimeValues(currentTimeMillis, j, timeUnit));
    }

    public void closeExpiredConnections() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Checking for expired connections, now: " + currentTimeMillis);
        }
        Iterator<HttpConnection> it = this.connectionToTimes.keySet().iterator();
        while (it.hasNext()) {
            HttpConnection next = it.next();
            TimeValues timeValues = this.connectionToTimes.get(next);
            if (timeValues.timeExpires <= currentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    Log log3 = this.log;
                    log3.debug("Closing connection, expired @: " + timeValues.timeExpires);
                }
                it.remove();
                try {
                    next.close();
                } catch (IOException e) {
                    this.log.debug("I/O error closing connection", e);
                }
            }
        }
    }

    public void closeIdleConnections(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            log2.debug("Checking for connections, idleTimeout: " + currentTimeMillis);
        }
        Iterator<HttpConnection> it = this.connectionToTimes.keySet().iterator();
        while (it.hasNext()) {
            HttpConnection next = it.next();
            long access$100 = this.connectionToTimes.get(next).timeAdded;
            Long valueOf = Long.valueOf(access$100);
            if (access$100 <= currentTimeMillis) {
                if (this.log.isDebugEnabled()) {
                    Log log3 = this.log;
                    log3.debug("Closing connection, connection time: " + valueOf);
                }
                it.remove();
                try {
                    next.close();
                } catch (IOException e) {
                    this.log.debug("I/O error closing connection", e);
                }
            }
        }
    }

    public boolean remove(HttpConnection httpConnection) {
        TimeValues remove = this.connectionToTimes.remove(httpConnection);
        if (remove != null) {
            return System.currentTimeMillis() <= remove.timeExpires;
        }
        this.log.warn("Removing a connection that never existed!");
        return true;
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }
}
