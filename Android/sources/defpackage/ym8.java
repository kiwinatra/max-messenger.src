package defpackage;

/* renamed from: ym8  reason: default package */
public abstract class ym8 extends m03 {
    public final long X;

    public ym8(j74 j74, q74 q74, ea6 ea6, int i, Object obj, long j, long j2, long j3) {
        super(j74, q74, 1, ea6, i, obj, j, j2);
        ea6.getClass();
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
