package defpackage;

import java.util.ArrayList;

/* renamed from: aba  reason: default package */
public final class aba extends ibf {
    public ArrayList c;
    public ArrayList o;
    public ArrayList v;

    public aba(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        ArrayList arrayList = null;
        int i = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -989040443:
                if (str.equals("phones")) {
                    c2 = 0;
                    break;
                }
                break;
            case -930898016:
                if (str.equals("rindex")) {
                    c2 = 1;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (pf9.n().a() == 7) {
                    arrayList = new ArrayList();
                    int t0 = pf9.t0();
                    while (i < t0) {
                        arrayList.add(ryg.g0(pf9));
                        i++;
                    }
                } else {
                    pf9.A();
                }
                this.c = arrayList;
                return;
            case 1:
                if (pf9.n().a() == 7) {
                    arrayList = new ArrayList();
                    int t02 = pf9.t0();
                    while (i < t02) {
                        arrayList.add(Integer.valueOf(ryg.c0(pf9)));
                        i++;
                    }
                } else {
                    pf9.A();
                }
                this.o = arrayList;
                return;
            case 2:
                if (pf9.n().a() == 7) {
                    arrayList = new ArrayList();
                    int t03 = pf9.t0();
                    while (i < t03) {
                        arrayList.add(Long.valueOf(ryg.d0(pf9, 0)));
                        i++;
                    }
                } else {
                    pf9.A();
                }
                this.v = arrayList;
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int o3 = kv0.o(this.o);
        return wj6.l(a81.n("{phones=", o2, ", rindex=", o3, ", ids="), kv0.o(this.v), "}");
    }
}
