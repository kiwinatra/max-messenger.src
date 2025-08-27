package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* renamed from: jud  reason: default package */
public final class jud extends gud {
    public final long b;
    public final boolean c;
    public final String o = jud.class.getName();

    public jud(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    public final void z() {
        m72 m72;
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder("process, chatsIds = ");
        long j = this.b;
        sb.append(j);
        sb.append(" , forAll = ");
        boolean z = this.c;
        sb.append(z);
        z68.c(this.o, sb.toString(), new Object[0]);
        if (j != 0) {
            ArrayList arrayList3 = new ArrayList();
            a32 G = h().G(j);
            if (G != null) {
                m72 m722 = G.b;
                long j2 = m722.k;
                p().A(this.b, j2, qe9.DELETED);
                h().A(j);
                r62 h = h();
                h.getClass();
                x62 x62 = x62.o;
                long j3 = G.a;
                h.d(j3, x62);
                h.i(j3, false, new fm0(21));
                rl a = a();
                boolean z2 = G.H() || z;
                jna jna = (jna) a;
                long j4 = G.a;
                if (!jna.r(j4)) {
                    arrayList = arrayList3;
                    m72 = m722;
                } else {
                    long n = ((ltb) jna.D()).a.n();
                    arrayList = arrayList3;
                    long j5 = m722.a;
                    m72 = m722;
                    i52 i52 = r7;
                    i52 i522 = new i52(n, j4, j5, j2, z2);
                    jna.A(jna, i52);
                }
                u().c(new j52(j));
                vk3 m = G.m();
                if (m != null) {
                    arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(m.r()));
                } else {
                    arrayList2 = arrayList;
                }
                m().a(p().j(j));
                hud hud = this.a;
                if (hud == null) {
                    hud = null;
                }
                ((qwa) hud.Z.getValue()).a(m72.a);
                if (!arrayList2.isEmpty()) {
                    u().c(new zu3((Collection) arrayList2));
                }
                u().c(new xy2(CollectionsKt.listOf(Long.valueOf(j)), true, false, (bl4) null, (zub) null, 124));
            }
        }
    }
}
