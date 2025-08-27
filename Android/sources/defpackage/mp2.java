package defpackage;

import java.util.List;

/* renamed from: mp2  reason: default package */
public final class mp2 extends ibf {
    public List c;
    public int o;
    public String v;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1081306054:
                if (str.equals("marker")) {
                    c2 = 0;
                    break;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110549828:
                if (str.equals("total")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.v = ryg.g0(pf9);
                return;
            case 1:
                this.c = a00.l(pf9);
                return;
            case 2:
                this.o = pf9.w0();
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int i = this.o;
        return wj6.n(a81.n("{result=", o2, ", total=", i, ", marker='"), this.v, "'}");
    }
}
