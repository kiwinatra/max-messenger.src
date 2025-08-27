package defpackage;

/* renamed from: d55  reason: default package */
public enum d55 implements zac {
    ;

    public static void a(pye pye) {
        pye.e(a);
        pye.b();
    }

    public static void b(Throwable th, pye pye) {
        pye.e(a);
        pye.onError(th);
    }

    public final void cancel() {
    }

    public final void clear() {
    }

    public final void g(long j) {
        tye.d(j);
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

    public final String toString() {
        return "EmptySubscription";
    }
}
