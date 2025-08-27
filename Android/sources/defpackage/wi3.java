package defpackage;

/* renamed from: wi3  reason: default package */
public final class wi3 extends ui3 implements aod {
    public final int y;
    public final long z;

    public wi3(long j, long j2, int i, int i2, boolean z2) {
        super(j, j2, i, i2, z2);
        this.y = i;
        this.z = j == -1 ? -1 : j;
    }

    public final long a() {
        return this.z;
    }

    public final long b(long j) {
        return (Math.max(0, j - this.b) * 8000000) / ((long) this.v);
    }

    public final int h() {
        return this.y;
    }
}
