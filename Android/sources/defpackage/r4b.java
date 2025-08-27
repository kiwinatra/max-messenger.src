package defpackage;

/* renamed from: r4b  reason: default package */
public final class r4b extends y64 {
    public final Throwable f;

    public r4b(Throwable th) {
        this.f = th;
    }

    public final String toString() {
        return "FAILURE (" + this.f.getMessage() + ")";
    }
}
