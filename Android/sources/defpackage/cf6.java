package defpackage;

/* renamed from: cf6  reason: default package */
public final class cf6 extends RuntimeException {
    public final int a;
    public final Throwable b;

    public cf6(Throwable th, int i) {
        super(th);
        this.a = i;
        this.b = th;
    }

    public final Throwable getCause() {
        return this.b;
    }
}
