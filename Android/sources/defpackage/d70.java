package defpackage;

import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.i2;
import java.util.List;

/* renamed from: d70  reason: default package */
public final /* synthetic */ class d70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object v;

    public /* synthetic */ d70(Object obj, Object obj2, long j, long j2, int i) {
        this.a = i;
        this.v = obj;
        this.b = obj2;
        this.c = j;
        this.o = j2;
    }

    public final void run() {
        Object obj = this.b;
        Object obj2 = this.v;
        switch (this.a) {
            case 0:
                wsb wsb = (wsb) obj2;
                wsb.getClass();
                int i = t0g.a;
                vb4 vb4 = ((mc5) wsb.b).a.z0;
                sd P = vb4.P();
                vb4.Q(P, 1008, new zb2(P, (String) obj, this.o, this.c));
                return;
            case 1:
                p7d p7d = (p7d) obj2;
                p7d.getClass();
                int i2 = v0g.a;
                wb4 wb4 = ((nc5) p7d.c).a.A0;
                td J = wb4.J();
                wb4.K(J, 1008, new gb4(J, (String) obj, this.o, this.c, 0));
                return;
            case 2:
                for (b89 f : (List) obj2) {
                    ((z6d) obj).f(this.c, this.o, f, false);
                }
                return;
            case 3:
                m8g m8g = (m8g) obj2;
                m8g.getClass();
                int i3 = v0g.a;
                wb4 wb42 = ((nc5) m8g.b).a.A0;
                td J2 = wb42.J();
                wb42.K(J2, 1016, new gb4(J2, (String) obj, this.o, this.c, 2));
                return;
            case 4:
                npg npg = (npg) obj2;
                npg.getClass();
                int i4 = t0g.a;
                vb4 vb42 = ((mc5) npg.c).a.z0;
                sd P2 = vb42.P();
                vb42.Q(P2, 1016, new a62(P2, (String) obj, this.o, this.c));
                return;
            case 5:
                ((i2) obj2).a((Boolean) obj, this.c, this.o);
                return;
            default:
                ((i2) obj2).a((b3) obj, this.c, this.o);
                return;
        }
    }
}
