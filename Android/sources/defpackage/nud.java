package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nud  reason: default package */
public final class nud extends gud {
    public final long b;
    public final List c;
    public final z93 o;
    public final boolean v;
    public final bl4 w;
    public final String x = nud.class.getName();

    public nud(long j, List list, z93 z93, boolean z, bl4 bl4) {
        this.b = j;
        this.c = list;
        this.o = z93;
        this.v = z;
        this.w = bl4;
    }

    public final void A(ArrayList arrayList) {
        a32 G;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ha9 ha9 = (ha9) it.next();
            if (!(ha9 == null || (G = h().G(ha9.z)) == null)) {
                hud hud = this.a;
                if (hud == null) {
                    hud = null;
                }
                long j = G.b.a;
                ((d6b) hud.C.getValue()).getClass();
                d6b.b(j, ha9.b);
            }
        }
    }

    public final void z() {
        m72 m72;
        String str;
        List list;
        String str2;
        r62 h = h();
        long j = this.b;
        a32 G = h.G(j);
        if (G == null) {
            ((uta) j()).c(new Exception("chat is null"), true);
            return;
        }
        List<Number> list2 = this.c;
        if (list2 == null) {
            aj9 d = ((a74) p().a).c.d();
            i6d i6d = d.a;
            i6d.b();
            uf9 uf9 = d.s;
            gf6 E = uf9.E();
            E.k(1, j);
            E.k(2, 0);
            E.k(3, 0);
            try {
                i6d.c();
                E.n();
                i6d.r();
                i6d.l();
                uf9.S(E);
                aj9 d2 = ((a74) p().a).c.d();
                sq6 sq6 = qe9.b;
                i6d i6d2 = d2.a;
                i6d2.b();
                uf9 uf92 = d2.l;
                gf6 E2 = uf92.E();
                d2.a().getClass();
                E2.k(1, (long) 10);
                E2.k(2, j);
                E2.k(3, 0);
                E2.k(4, 0);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    i6d2.l();
                    uf92.S(E2);
                    if (this.w == bl4.REGULAR) {
                        h().A(j);
                    }
                    jna jna = (jna) a();
                    long j2 = this.b;
                    if (jna.r(j2)) {
                        jna.A(jna, new lv9(((ltb) jna.D()).a.n(), j2, 0, 0, this.w));
                    }
                    u().c(new kv9(this.b, 0, 0, this.w));
                } catch (Throwable th) {
                    uf92.S(E2);
                    throw th;
                }
            } catch (Throwable th2) {
                uf9.S(E);
                throw th2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Number longValue : list2) {
                ha9 r = p().r(longValue.longValue());
                if (r != null) {
                    if (r.c == 0) {
                        arrayList2.add(r);
                        m().b(r);
                    } else {
                        arrayList.add(r);
                    }
                }
            }
            m72 m722 = G.b;
            long j3 = m722.a;
            boolean isEmpty = arrayList.isEmpty();
            String str3 = this.x;
            if (isEmpty) {
                m72 = m722;
                str = str3;
                list = list2;
                str2 = ", messages.size() = ";
            } else {
                z68.c(str3, "deleteServerMessages: chatId = " + j + ", messages.size() = " + arrayList.size(), new Object[0]);
                ArrayList arrayList3 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList3.add(Long.valueOf(((ha9) it.next()).b));
                    } catch (Throwable th3) {
                        throw new RuntimeException(th3);
                    }
                }
                ((a74) p().a).c.d().o(j, arrayList3, qe9.DELETED);
                rl a = a();
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        String str4 = str3;
                        List list3 = list2;
                        arrayList4.add(Long.valueOf(((ha9) it2.next()).c));
                        list2 = list3;
                        str3 = str4;
                    } catch (Throwable th4) {
                        throw new RuntimeException(th4);
                    }
                }
                str = str3;
                list = list2;
                long j4 = this.b;
                m72 = m722;
                ArrayList arrayList5 = arrayList4;
                long j5 = j4;
                str2 = ", messages.size() = ";
                ((jna) a).I(j5, j3, arrayList3, arrayList5, this.o, this.v, this.w);
                A(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                z68.c(str, "deleteLocalMessages: chatId = " + j + str2 + arrayList2.size(), new Object[0]);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ha9 ha9 = (ha9) it3.next();
                    hud hud = this.a;
                    if (hud == null) {
                        hud = null;
                    }
                    rf9 rf9 = (rf9) hud.c0.getValue();
                    long j6 = ha9.b;
                    rf9.getClass();
                    z68.c("rf9", "cancel: messageId=" + j6, new Object[0]);
                    ((gl5) rf9.c.getValue()).a(j6);
                }
                fa9 p = p();
                ArrayList arrayList6 = new ArrayList(arrayList2.size());
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    try {
                        arrayList6.add(Long.valueOf(((ha9) it4.next()).b));
                    } catch (Throwable th5) {
                        throw new RuntimeException(th5);
                    }
                }
                ((a74) p.a).c.d().o(j, arrayList6, qe9.DELETED);
                A(arrayList2);
            }
            m72 m723 = m72;
            List list4 = list;
            if (list4.contains(Long.valueOf(m723.j))) {
                h().A(j);
            } else if (list4.contains(Long.valueOf(m723.x))) {
                h().z(this.b, (w62) null, 0);
            }
            u().c(new kv9(j, list4, (bl4) null));
        }
    }
}
