package defpackage;

/* renamed from: rw1  reason: default package */
public final class rw1 extends q0 {
    public volatile boolean a;

    public final void cancel() {
        this.a = true;
    }

    public final void dispose() {
        this.a = true;
    }

    public final boolean f() {
        return this.a;
    }
}
