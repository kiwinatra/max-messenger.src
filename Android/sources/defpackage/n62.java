package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* renamed from: n62  reason: default package */
public final /* synthetic */ class n62 implements qk3, f0b {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ n62(r62 r62, long j, ha9 ha9, long j2) {
        this.c = r62;
        this.a = j;
        this.o = ha9;
        this.b = j2;
    }

    public void accept(Object obj) {
        a89 a89;
        w62 w62 = (w62) obj;
        r62 r62 = (r62) this.c;
        r62.getClass();
        if (w62.a == 0) {
            w62.a = this.a;
        }
        ha9 ha9 = (ha9) this.o;
        boolean z = ha9.z();
        long j = this.b;
        if (z) {
            r62.Z(j, w62, ha9);
        }
        g72 g72 = w62.n;
        cl4 cl4 = ha9.R0;
        long j2 = cl4 != null ? cl4.a : ha9.o;
        bl4 bl4 = ha9.S0;
        if (g72.c(bl4) == 0) {
            g72.a(new f72(j2, j2), bl4);
        } else {
            Pair t = hd8.t(g72.d(bl4));
            if (((f72) t.getSecond()).b < j2) {
                ap0 c2 = ((f72) t.getSecond()).c();
                c2.b(j2);
                g72.d(bl4).remove(((Integer) t.getFirst()).intValue());
                g72.e(bl4);
                g72.a(c2.a(), bl4);
            }
        }
        bl4 bl42 = bl4.REGULAR;
        if (bl4 == bl42) {
            a32 G = r62.G(j);
            if (!(G == null || (a89 = G.c) == null || a89.a.c >= ha9.c)) {
                r62.v0(w62, ha9);
            }
            if (G != null) {
                m72 m72 = G.b;
                if (m72.x == 0 && m72.n.c(bl42) == 0) {
                    r62.z(j, w62, 0);
                }
            }
            if (G != null && G.o() < ha9.m() && G.b.m == 0) {
                long Q = r62.Q();
                Map e = w62.e();
                if (((Long) w62.e().get(Long.valueOf(Q))) != null) {
                    e.put(Long.valueOf(Q), Long.valueOf(ha9.m()));
                    w62.e = e;
                }
            }
        }
    }

    public void l(g0b g0b) {
        if (g0b == g0b.v) {
            zlb zlb = (zlb) this.c;
            ev0.v(zlb.d, ((osa) zlb.b).b(), (f14) null, new wlb(zlb, (a32) this.o, this.a, this.b, (Continuation) null), 2);
        }
    }

    public /* synthetic */ n62(zlb zlb, a32 a32, long j, long j2) {
        this.c = zlb;
        this.o = a32;
        this.a = j;
        this.b = j2;
    }
}
