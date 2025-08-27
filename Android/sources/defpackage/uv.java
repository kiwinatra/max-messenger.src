package defpackage;

/* renamed from: uv  reason: default package */
public final class uv extends wv {
    public final long a;
    public final boolean b;

    public uv(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        return this.a == uvVar.a && this.b == uvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingNext(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return tr1.m(sb, this.b, ")");
    }
}
