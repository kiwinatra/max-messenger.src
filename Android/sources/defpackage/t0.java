package defpackage;

/* renamed from: t0  reason: default package */
public final class t0 {
    public static final t0 c;
    public static final t0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (n1.o) {
            d = null;
            c = null;
            return;
        }
        d = new t0(false, (RuntimeException) null);
        c = new t0(true, (RuntimeException) null);
    }

    public t0(boolean z, RuntimeException runtimeException) {
        this.a = z;
        this.b = runtimeException;
    }
}
