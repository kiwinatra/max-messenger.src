package defpackage;

import java.util.List;

/* renamed from: kp8  reason: default package */
public final /* synthetic */ class kp8 implements lp8 {
    public final /* synthetic */ np8 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ kp8(np8 np8, List list, int i, int i2) {
        this.a = np8;
        this.b = list;
        this.c = i;
        this.o = i2;
    }

    public final void d(i67 i67, int i) {
        np8 np8 = this.a;
        np8.getClass();
        qb7 o2 = tb7.o();
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 >= list.size()) {
                break;
            }
            o2.a(((ir8) list.get(i2)).d(true));
            i2++;
        }
        gv0 gv0 = new gv0(o2.j());
        oxd oxd = np8.k;
        oxd.getClass();
        int f = oxd.a.f();
        int i3 = this.c;
        int i4 = this.o;
        if (f >= 2) {
            i67.N(np8.c, i, i3, i4, gv0);
            return;
        }
        wp8 wp8 = np8.c;
        i67.U(wp8, i, i4, gv0);
        i67.K(wp8, i, i3, i4);
    }
}
