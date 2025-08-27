package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: ue2  reason: default package */
public final /* synthetic */ class ue2 implements qk3, ice {
    public final /* synthetic */ ye2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ue2(ye2 ye2, boolean z) {
        this.a = ye2;
        this.b = z;
    }

    public void accept(Object obj) {
        ve2 e;
        f72 f72;
        r62 r62;
        List list = (List) obj;
        ye2 ye2 = this.a;
        ye2.getClass();
        z68.c("ye2", "onLoad: count " + list.size(), new Object[0]);
        boolean z = this.b;
        if (z) {
            ye2.k = true;
            ye2.d.clear();
            ye2.e.clear();
        }
        ArrayList a2 = ye2.a(list, false);
        for (xe2 xe2 : ye2.o) {
            if (xe2 != null) {
                ((ActAttachesView) xe2).Z(a2);
            }
        }
        long j = ye2.a;
        r62 r622 = ye2.q;
        a32 G = r622.G(j);
        if (G != null) {
            m72 m72 = G.b;
            ArrayList d = m72.n.d(bl4.REGULAR);
            Set set = ye2.g;
            if (!r62.R(m72, set) || (f72 = r62.N(m72, set).a) == null) {
                f72 = null;
            }
            if (f72 != null) {
                Iterator it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f72 f722 = (f72) it.next();
                    f72 a3 = f72.c().a();
                    long j2 = f722.a;
                    boolean G2 = hd8.G(j2, a3);
                    long j3 = f722.b;
                    if (G2) {
                        r62 = r622;
                        if (j3 > a3.b) {
                            ap0 c = a3.c();
                            c.b(j3);
                            a3 = c.a();
                        }
                    } else {
                        r62 = r622;
                    }
                    if (hd8.G(j3, a3) && j2 < a3.a) {
                        ap0 c2 = a3.c();
                        if (j2 == -1) {
                            z68.o("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        c2.b = j2;
                        a3 = c2.a();
                    }
                    if (a3.a == f72.a && a3.b == f72.b) {
                        r622 = r62;
                    } else {
                        r622 = r62;
                        r622.i(j, false, new u00((Object) r622, (Object) set, (Object) a3, 3));
                    }
                }
            } else {
                f72 f723 = (f72) hd8.t(d).getSecond();
                if (f723 != null) {
                    r622.i(j, false, new u00((Object) r622, (Object) set, (Object) f723, 3));
                }
            }
        }
        if (!z) {
            ye2.b(true);
            return;
        }
        a32 G3 = r622.G(j);
        if (G3 != null && G3.b.i() && (e = ye2.e(false)) != null) {
            ye2.f(e);
        }
    }

    public void h(pbe pbe) {
        ye2 ye2 = this.a;
        ye2.getClass();
        List<a89> emptyList = Collections.emptyList();
        a32 G = ye2.q.G(ye2.a);
        if (G != null) {
            fa9 fa9 = ye2.r;
            boolean z = this.b;
            ed2 ed2 = ye2.s;
            if (z) {
                ed2.getClass();
                emptyList = ed2.f.b(((a74) fa9.a).c.l(ye2.a, LongCompanionObject.MAX_VALUE, ye2.f, (Integer) null, true));
            } else {
                long j = ye2.b;
                long j2 = 0;
                if (j > 0) {
                    ha9 r = fa9.r(j);
                    if (r != null) {
                        j2 = r.o;
                    }
                } else {
                    a89 a89 = G.c;
                    j2 = a89 == null ? LongCompanionObject.MAX_VALUE : a89.a.o;
                }
                ed2.getClass();
                long j3 = ye2.a;
                z6d z6d = ((a74) fa9.a).c;
                Set set = ye2.f;
                ArrayList l = z6d.l(j3, j2, set, 40, true);
                ArrayList l2 = ((a74) fa9.a).c.l(j3, j2, set, 40, false);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l);
                arrayList.addAll(l2);
                TreeSet treeSet = new TreeSet(new v00(11));
                treeSet.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(treeSet);
                Collections.sort(arrayList, new v00(12));
                emptyList = !arrayList.isEmpty() ? ed2.f.b(arrayList) : Collections.emptyList();
            }
        }
        for (a89 a892 : emptyList) {
            ye2.t.e(a892.a);
        }
        pbe.a(emptyList);
    }
}
