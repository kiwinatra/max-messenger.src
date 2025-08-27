package org.apache.http.impl.conn.tsccm;

import java.util.Date;
import java.util.concurrent.locks.Condition;

@Deprecated
public class WaitingThread {
    private boolean aborted;
    private final Condition cond;
    private final RouteSpecificPool pool;
    private Thread waiter;

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        if (condition != null) {
            this.cond = condition;
            this.pool = routeSpecificPool;
            return;
        }
        throw new IllegalArgumentException("Condition must not be null.");
    }

    public boolean await(Date date) throws InterruptedException {
        boolean z;
        if (this.waiter != null) {
            throw new IllegalStateException("A thread is already waiting on this object.\ncaller: " + Thread.currentThread() + "\nwaiter: " + this.waiter);
        } else if (!this.aborted) {
            this.waiter = Thread.currentThread();
            if (date != null) {
                try {
                    z = this.cond.awaitUntil(date);
                } catch (Throwable th) {
                    this.waiter = null;
                    throw th;
                }
            } else {
                this.cond.await();
                z = true;
            }
            if (!this.aborted) {
                this.waiter = null;
                return z;
            }
            throw new InterruptedException("Operation interrupted");
        } else {
            throw new InterruptedException("Operation interrupted");
        }
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }

    public void wakeup() {
        if (this.waiter != null) {
            this.cond.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }
}
