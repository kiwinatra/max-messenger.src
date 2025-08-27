package defpackage;

import java.io.Serializable;

/* renamed from: bj2  reason: default package */
public final class bj2 implements Serializable {
    public final fo3 a;
    public final ntb b;
    public final long c;

    public bj2(fo3 fo3, ntb ntb, long j) {
        this.a = fo3;
        this.b = ntb;
        this.c = j;
    }

    public static bj2 a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        fo3 fo3 = null;
        if (e0 == 0) {
            return null;
        }
        ntb ntb = null;
        long j = 0;
        for (int i = 0; i < e0; i++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case -1276666629:
                    if (A0.equals("presence")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -867755645:
                    if (A0.equals("readMark")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 951526432:
                    if (A0.equals("contact")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    ntb = ntb.a(pf9);
                    break;
                case 1:
                    j = ryg.d0(pf9, 0);
                    break;
                case 2:
                    fo3 = fo3.e(pf9);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new bj2(fo3, ntb, j);
    }
}
