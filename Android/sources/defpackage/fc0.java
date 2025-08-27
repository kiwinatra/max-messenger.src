package defpackage;

/* renamed from: fc0  reason: default package */
public final class fc0 {
    public final Throwable a;

    public fc0(Throwable th) {
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("Null error");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        return this.a.equals(((fc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.a + "}";
    }
}
