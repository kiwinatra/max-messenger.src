package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: or3  reason: default package */
public class or3 extends qm implements lcf {
    public final /* synthetic */ int o;
    public final long v;
    public final Object w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or3(int i, long j, long j2, Object obj) {
        super(j);
        this.o = i;
        this.v = j2;
        this.w = obj;
    }

    private final void u(ibf ibf) {
    }

    public void e(ibf ibf) {
        switch (this.o) {
            case 0:
                pr3 pr3 = (pr3) ibf;
                rm rmVar = null;
                if (this.v > 0) {
                    Map map = pr3.c;
                    rm rmVar2 = this.c;
                    if (rmVar2 == null) {
                        rmVar2 = null;
                    }
                    map.put(Long.valueOf(((qjd) ((x23) rmVar2.e.getValue())).s()), ntb.c);
                }
                rm rmVar3 = this.c;
                if (rmVar3 != null) {
                    rmVar = rmVar3;
                }
                ((rtb) rmVar.R.getValue()).i(pr3.o, qe8.n(pr3.c));
                r62 l = l();
                Map map2 = pr3.c;
                l.getClass();
                ArrayList arrayList = new ArrayList(map2.keySet());
                z68.c("r62", "invalidateChatsContacts, contactsIds.size() = " + arrayList.size(), new Object[0]);
                for (a32 a32 : l.I(r62.I)) {
                    ArrayList k = a32.k();
                    ArrayList arrayList2 = new ArrayList(k.size());
                    Iterator it = k.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(Long.valueOf(((vk3) it.next()).r()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!Collections.disjoint(arrayList, arrayList2)) {
                        a32.p0((km3) l.r.get());
                    }
                }
                return;
            case 1:
                t((qv9) ibf);
                return;
            default:
                return;
        }
    }

    public final fbf g() {
        switch (this.o) {
            case 0:
                np2 np2 = new np2((x3b) null, 10);
                long[] jArr = (long[]) this.w;
                if (jArr != null) {
                    np2.j("contactIds", jArr);
                }
                long j = this.v;
                if (j > 0) {
                    np2.p(j, "sync");
                }
                return np2;
            case 1:
                return new np2(this.v, (List) this.w);
            default:
                long j2 = this.v;
                if (j2 == 0) {
                    return null;
                }
                b10 b10 = (b10) this.w;
                String str = b10 != null ? b10.a : null;
                jw9 jw9 = new jw9((x3b) null, 1);
                jw9.p(j2, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    jw9.t("type", str);
                }
                return jw9;
        }
    }

    public void h(qaf qaf) {
        switch (this.o) {
            case 0:
                k().c(new hj0(this.a, qaf));
                return;
            case 1:
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                rmVar.b().c(new sv9(this.a, qaf, this.v, (List) this.w));
                return;
            default:
                k().c(new hj0(this.a, qaf));
                return;
        }
    }

    public void t(qv9 qv9) {
        a32 a32;
        qv9 qv92 = qv9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (b89 b89 : qv92.o) {
            if (b89.v != re9.o) {
                arrayList2.add(b89);
                arrayList.add(Long.valueOf(b89.a));
            }
        }
        rm rmVar = null;
        if (!arrayList2.isEmpty()) {
            rm rmVar2 = this.c;
            if (rmVar2 == null) {
                rmVar2 = null;
            }
            a32 D = rmVar2.c().D(qv92.c);
            if (D != null) {
                rm rmVar3 = this.c;
                if (rmVar3 == null) {
                    rmVar3 = null;
                }
                fa9 d = rmVar3.d();
                List list = qv92.o;
                rm rmVar4 = this.c;
                if (rmVar4 == null) {
                    rmVar4 = null;
                }
                d.h(D.a, ((ltb) ((jtb) rmVar4.c.getValue())).a.s(), list);
            }
            a32 = D;
        } else {
            a32 = null;
        }
        rm rmVar5 = this.c;
        if (rmVar5 == null) {
            rmVar5 = null;
        }
        rmVar5.b().c(new tv9(this.a, this.v, arrayList, qv92.o, (List) this.w));
        if (a32 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b89 b892 = (b89) it.next();
                rm rmVar6 = this.c;
                if (rmVar6 == null) {
                    rmVar6 = null;
                }
                ha9 k = rmVar6.d().k(a32.a, b892.a);
                if (k != null) {
                    rm rmVar7 = this.c;
                    if (rmVar7 == null) {
                        rmVar7 = null;
                    }
                    rmVar7.b().c(new twf(0, a32.a, k.b));
                }
            }
        }
        rm rmVar8 = this.c;
        if (rmVar8 != null) {
            rmVar = rmVar8;
        }
        rvd.A((jqg) rmVar.g.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or3(long j, long[] jArr, long j2) {
        super(j);
        this.o = 0;
        this.w = jArr;
        this.v = j2;
    }
}
