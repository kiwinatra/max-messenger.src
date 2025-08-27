package defpackage;

/* renamed from: xm8  reason: default package */
public abstract class xm8 extends k03 {
    public final long X;

    public xm8(h74 h74, p74 p74, ca6 ca6, int i, Object obj, long j, long j2, long j3) {
        super(h74, p74, 1, ca6, i, obj, j, j2);
        ca6.getClass();
        this.X = j3;
    }

    public long b() {
        long j = this.X;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    public abstract boolean c();
}
