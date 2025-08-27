package defpackage;

/* renamed from: j3c  reason: default package */
public final class j3c extends m3c {
    public final int a;

    public j3c(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3c) && hi7.l(this.a, ((j3c) obj).a);
    }

    public final long getItemId() {
        return (long) 1024;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final int i() {
        return this.a;
    }

    public final String toString() {
        return wj6.k("Loading(itemViewType=", hi7.d0(this.a), ")");
    }
}
