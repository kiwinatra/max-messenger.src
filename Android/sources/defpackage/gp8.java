package defpackage;

import java.util.List;

/* renamed from: gp8  reason: default package */
public final /* synthetic */ class gp8 implements lp8 {
    public final /* synthetic */ np8 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long o;

    public /* synthetic */ gp8(np8 np8, List list, int i, long j) {
        this.a = np8;
        this.b = list;
        this.c = i;
        this.o = j;
    }

    public final void d(i67 i67, int i) {
        np8 np8 = this.a;
        np8.getClass();
        qb7 o2 = tb7.o();
        int i2 = 0;
        while (true) {
            List list = this.b;
            if (i2 < list.size()) {
                o2.a(((ir8) list.get(i2)).d(true));
                i2++;
            } else {
                i67 i672 = i67;
                i672.v(np8.c, i, new gv0(o2.j()), this.c, this.o);
                return;
            }
        }
    }
}
