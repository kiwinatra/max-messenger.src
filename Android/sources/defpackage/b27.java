package defpackage;

import java.util.Map;

/* renamed from: b27  reason: default package */
public final class b27 extends icd {
    public final Map H;
    public xv4 I;

    public b27(cb4 cb4, ow4 ow4, fw4 fw4, Map map) {
        super(cb4, ow4, fw4);
        this.H = map;
    }

    public final ca6 m(ca6 ca6) {
        xv4 xv4;
        xv4 xv42 = this.I;
        if (xv42 == null) {
            xv42 = ca6.x0;
        }
        if (!(xv42 == null || (xv4 = (xv4) this.H.get(xv42.c)) == null)) {
            xv42 = xv4;
        }
        rp9 rp9 = ca6.X;
        rp9 rp92 = null;
        if (rp9 != null) {
            pp9[] pp9Arr = rp9.a;
            int length = pp9Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                pp9 pp9 = pp9Arr[i2];
                if ((pp9 instanceof xub) && "com.apple.streaming.transportStreamTimestamp".equals(((xub) pp9).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    pp9[] pp9Arr2 = new pp9[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            pp9Arr2[i < i2 ? i : i - 1] = pp9Arr[i];
                        }
                        i++;
                    }
                    rp92 = new rp9(pp9Arr2);
                }
            }
            if (!(xv42 == ca6.x0 && rp9 == ca6.X)) {
                aa6 a = ca6.a();
                a.n = xv42;
                a.i = rp9;
                ca6 = a.a();
            }
            return super.m(ca6);
        }
        rp9 = rp92;
        aa6 a2 = ca6.a();
        a2.n = xv42;
        a2.i = rp9;
        ca6 = a2.a();
        return super.m(ca6);
    }
}
