package defpackage;

/* renamed from: q54  reason: default package */
public final class q54 {
    public final pac a;
    public final boolean b;

    public q54(pac pac, boolean z) {
        this.a = pac;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q54)) {
            return false;
        }
        q54 q54 = (q54) obj;
        return q54.a.equals(this.a) && q54.b == this.b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
