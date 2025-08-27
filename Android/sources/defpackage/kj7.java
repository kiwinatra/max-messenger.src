package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: kj7  reason: default package */
public final class kj7 extends AbstractOwnableSynchronizer implements Runnable {
    public final htf a;

    public kj7(htf htf) {
        this.a = htf;
    }

    public static void a(kj7 kj7, Thread thread) {
        kj7.setExclusiveOwnerThread(thread);
    }

    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
