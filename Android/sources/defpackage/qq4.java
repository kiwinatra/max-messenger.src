package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qq4  reason: default package */
public enum qq4 implements mq4 {
    ;

    public static boolean a(AtomicReference atomicReference) {
        mq4 mq4;
        mq4 mq42 = (mq4) atomicReference.get();
        qq4 qq4 = a;
        if (mq42 == qq4 || (mq4 = (mq4) atomicReference.getAndSet(qq4)) == qq4) {
            return false;
        }
        if (mq4 == null) {
            return true;
        }
        mq4.dispose();
        return true;
    }

    public static boolean b(mq4 mq4) {
        return mq4 == a;
    }

    public static boolean c(AtomicReference atomicReference, mq4 mq4) {
        while (true) {
            mq4 mq42 = (mq4) atomicReference.get();
            if (mq42 != a) {
                while (true) {
                    if (atomicReference.compareAndSet(mq42, mq4)) {
                        return true;
                    }
                    if (atomicReference.get() != mq42) {
                    }
                }
            } else if (mq4 == null) {
                return false;
            } else {
                mq4.dispose();
                return false;
            }
        }
    }

    public static boolean d(AtomicReference atomicReference, mq4 mq4) {
        while (true) {
            mq4 mq42 = (mq4) atomicReference.get();
            if (mq42 != a) {
                while (true) {
                    if (atomicReference.compareAndSet(mq42, mq4)) {
                        if (mq42 == null) {
                            return true;
                        }
                        mq42.dispose();
                        return true;
                    } else if (atomicReference.get() != mq42) {
                    }
                }
            } else if (mq4 == null) {
                return false;
            } else {
                mq4.dispose();
                return false;
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, mq4 mq4) {
        Objects.requireNonNull(mq4, "d is null");
        while (!atomicReference.compareAndSet((Object) null, mq4)) {
            if (atomicReference.get() != null) {
                mq4.dispose();
                if (atomicReference.get() == a) {
                    return false;
                }
                n54.D(new IllegalStateException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean g(mq4 mq4, mq4 mq42) {
        if (mq42 == null) {
            n54.D(new NullPointerException("next is null"));
            return false;
        } else if (mq4 == null) {
            return true;
        } else {
            mq42.dispose();
            n54.D(new IllegalStateException("Disposable already set!"));
            return false;
        }
    }

    public final void dispose() {
    }

    public final boolean f() {
        return true;
    }
}
