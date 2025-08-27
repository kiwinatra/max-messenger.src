package defpackage;

/* renamed from: vv  reason: default package */
public final class vv extends wv {
    public final long a;
    public final boolean b;

    public vv(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv)) {
            return false;
        }
        vv vvVar = (vv) obj;
        return this.a == vvVar.a && this.b == vvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingPrev(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return tr1.m(sb, this.b, ")");
    }
}
