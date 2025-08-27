package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tye  reason: default package */
public enum tye implements rye {
    ;

    public static void a(AtomicReference atomicReference) {
        rye rye;
        rye rye2 = (rye) atomicReference.get();
        tye tye = a;
        if (rye2 != tye && (rye = (rye) atomicReference.getAndSet(tye)) != tye && rye != null) {
            rye.cancel();
        }
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        rye rye = (rye) atomicReference.get();
        if (rye != null) {
            rye.g(j);
        } else if (d(j)) {
            h88.c(atomicLong, j);
            rye rye2 = (rye) atomicReference.get();
            if (rye2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    rye2.g(andSet);
                }
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, rye rye) {
        Objects.requireNonNull(rye, "s is null");
        while (!atomicReference.compareAndSet((Object) null, rye)) {
            if (atomicReference.get() != null) {
                rye.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                n54.D(new IllegalStateException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        n54.D(new IllegalArgumentException(wj6.i(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(rye rye, rye rye2) {
        if (rye2 == null) {
            n54.D(new NullPointerException("next is null"));
            return false;
        } else if (rye == null) {
            return true;
        } else {
            rye2.cancel();
            n54.D(new IllegalStateException("Subscription already set!"));
            return false;
        }
    }

    public final void cancel() {
    }

    public final void g(long j) {
    }
}
