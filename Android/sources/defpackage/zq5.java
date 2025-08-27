package defpackage;

/* renamed from: zq5  reason: default package */
public final class zq5 {
    public final vs6 a;
    public final yq5 b;

    /* JADX WARNING: type inference failed for: r0v2, types: [qp6, yq5] */
    public zq5(u9a u9a, pqb pqb) {
        if (pqb.d > 0) {
            this.b = new qp6(u9a, pqb, v9a.a());
            this.a = new vs6(21, (Object) this);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final jd4 a(int i) {
        return y33.q0((byte[]) this.b.get(i), this.a, y33.w);
    }
}
