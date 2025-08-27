package defpackage;

/* renamed from: p45  reason: default package */
public enum p45 implements xac {
    ;

    public static void a(cla cla) {
        cla.c(a);
        cla.b();
    }

    public static void b(Throwable th, cla cla) {
        cla.c(a);
        cla.onError(th);
    }

    public static void c(Throwable th, gce gce) {
        gce.c(a);
        gce.onError(th);
    }

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean f() {
        return this == a;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final int p(int i) {
        return 2;
    }

    public final Object poll() {
        return null;
    }
}
