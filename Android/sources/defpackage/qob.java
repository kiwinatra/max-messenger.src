package defpackage;

/* renamed from: qob  reason: default package */
public final class qob {
    public final xq5 a;

    public qob(xq5 xq5) {
        this.a = xq5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qob)) {
            return false;
        }
        return this.a.equals(((qob) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
