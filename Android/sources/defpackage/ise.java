package defpackage;

/* renamed from: ise  reason: default package */
public final class ise {
    public static final Object b = new Object();
    public static volatile ise c;
    public final r3 a;

    public ise(r3 r3Var) {
        this.a = r3Var;
    }

    public static ise a() {
        ise ise;
        synchronized (b) {
            try {
                if (c != null) {
                    ise = c;
                } else {
                    throw new IllegalStateException("You should call init() before using keyboard");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ise;
    }
}
