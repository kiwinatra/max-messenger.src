package defpackage;

/* renamed from: h31  reason: default package */
public final class h31 implements i31 {
    public final long a;
    public final boolean b;
    public final boolean c;

    public h31(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31 = (h31) obj;
        return this.a == h31.a && this.b == h31.b && this.c == h31.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(userId=");
        sb.append(this.a);
        sb.append(", isVideoEnabled=");
        sb.append(this.b);
        sb.append(", isAudioEnabled=");
        return tr1.m(sb, this.c, ")");
    }
}
