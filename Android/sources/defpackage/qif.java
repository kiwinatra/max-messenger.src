package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: qif  reason: default package */
public final class qif extends dn7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(qif.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread v = Thread.currentThread();
    public pq4 w;

    public static void k(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final boolean h() {
        return true;
    }

    public final void i(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = x;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    k(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.v.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        k(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                pq4 pq4 = this.w;
                if (pq4 != null) {
                    pq4.dispose();
                    return;
                }
                return;
            }
        }
    }
}
