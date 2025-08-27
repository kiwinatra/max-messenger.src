package defpackage;

/* renamed from: fod  reason: default package */
public final class fod {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public fod(fee fee, int i, int i2) {
        this.a = v0g.S(fee.a);
        this.b = v0g.S(fee.b);
        int i3 = fee.c;
        this.c = i3;
        int i4 = i3;
        while (true) {
            if (i4 <= 0) {
                break;
            }
            boolean z = true;
            if ((i4 & 1) == 1) {
                z = (i4 >> 1) != 0 ? false : z;
                n79.m("Invalid speed divisor: " + i3, z);
            } else {
                i2++;
                i4 >>= 1;
            }
        }
        this.d = Math.min(i2, i);
    }
}
