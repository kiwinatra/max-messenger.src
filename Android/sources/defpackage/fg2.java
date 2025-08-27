package defpackage;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* renamed from: fg2  reason: default package */
public final /* synthetic */ class fg2 implements Function0 {
    public final /* synthetic */ gh2 a;
    public final /* synthetic */ r62 b;
    public final /* synthetic */ ed2 c;
    public final /* synthetic */ jtb o;
    public final /* synthetic */ gcf v;
    public final /* synthetic */ jbf w;
    public final /* synthetic */ m95 x;

    public /* synthetic */ fg2(gh2 gh2, r62 r62, ed2 ed2, jtb jtb, gcf gcf, jbf jbf, m95 m95) {
        this.a = gh2;
        this.b = r62;
        this.c = ed2;
        this.o = jtb;
        this.v = gcf;
        this.w = jbf;
        this.x = m95;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [n09, java.lang.Object] */
    public final Object invoke() {
        Set set;
        gh2 gh2 = this.a;
        a32 o2 = gh2.o();
        se2 se2 = null;
        a89 a89 = o2 != null ? o2.c : null;
        if (a89 != null) {
            kbf kbf = (kbf) this.w;
            lfd c2 = kbf.c();
            ba baVar = new ba(20, kbf, gh2);
            a32 o3 = gh2.o();
            int i = kg2.$EnumSwitchMapping$1[gh2.c.ordinal()];
            if (i == 1) {
                set = e19.d;
            } else if (i == 2) {
                set = e19.e;
            } else if (i == 3) {
                set = e19.f;
            } else if (i == 4) {
                set = e19.c;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Set set2 = set;
            Set d = ye2.d(set2);
            ha9 ha9 = a89.a;
            r62 r62 = this.b;
            srd srd = new srd((Object) o3, (Object) ha9, (Object) r62, (Object) d);
            ed2 ed2 = this.c;
            fa9 fa9 = gh2.v;
            r62 r622 = r62;
            eud eud = new eud(4, ed2, fa9, o3, set2);
            jtb jtb = this.o;
            gcf gcf = this.v;
            rl rlVar = gh2.w;
            ? obj = new Object();
            obj.b = eud;
            obj.c = r622;
            obj.a = fa9;
            obj.o = jtb;
            obj.v = rlVar;
            obj.w = gcf;
            obj.x = o3;
            obj.y = d;
            obj.z = gh2;
            zz6 zz6 = new zz6(srd, eud, obj, 40, new kn5("se2", (byte) 0), false, 96);
            StringBuilder m = g63.m("se2", "#");
            m.append(bl4.REGULAR.name().substring(0, 3));
            m.append("-");
            m.append(o3.a);
            se2 = new se2(zz6, baVar, c2, this.x, m.toString());
        }
        return se2;
    }
}
