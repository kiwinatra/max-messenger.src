package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: t3g  reason: default package */
public final class t3g extends qm implements lcf {
    public final long o;
    public final int v = 100;
    public final boolean w;
    public final String x;

    public t3g(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.w = z;
        this.x = t3g.class.getName();
    }

    public final void e(ibf ibf) {
        u3g u3g = (u3g) ibf;
        ak3 ak3 = new ak3();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (t61 t61 : u3g.c) {
            a32 D = l().D(t61.a);
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            b89 b89 = t61.b;
            if (i == 0 || b89.b < j2) {
                j2 = b89.b;
            }
            if (j3 == 0 || b89.b > j3) {
                j3 = b89.b;
            }
            if (D != null) {
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((a74) ((s74) rmVar.W.getValue())).c.e(D.a, ((ltb) q()).a.s(), t61.b);
            } else {
                Long valueOf = Long.valueOf(t61.a);
                Long valueOf2 = Long.valueOf(b89.a);
                LinkedHashMap linkedHashMap = (LinkedHashMap) ak3.a;
                List list = (List) linkedHashMap.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(valueOf, list);
                }
                list.add(valueOf2);
            }
            j = 0;
        }
        String U = iq.U(Long.valueOf(j2));
        String U2 = iq.U(Long.valueOf(j3));
        int a = ak3.a();
        StringBuilder r = rae.r("onSuccess: startTime: ", U, " endTime: ", U2, " missedMessages: ");
        r.append(a);
        z68.c(this.x, r.toString(), new Object[0]);
        sv0 k = k();
        long j4 = u3g.o;
        long j5 = u3g.v;
        boolean z = u3g.w;
        long j6 = this.a;
        v3g v3g = r2;
        v3g v3g2 = new v3g(j6, j2, j3, j4, j5, z, ak3);
        k.c(v3g);
    }

    public final fbf g() {
        jw9 jw9 = new jw9((x3b) null, 17);
        long j = this.o;
        if (j > 0) {
            jw9.p(j, "marker");
        }
        jw9.h(this.v, NewHtcHomeBadger.COUNT);
        jw9.d("forward", this.w);
        return jw9;
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
    }
}
