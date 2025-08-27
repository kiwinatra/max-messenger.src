package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: go3  reason: default package */
public final class go3 extends qm implements lcf {
    public final /* synthetic */ int o;
    public final Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go3(long j, Object obj, int i) {
        super(j);
        this.o = i;
        this.v = obj;
    }

    public final void e(ibf ibf) {
        List list;
        switch (this.o) {
            case 0:
                jo3 jo3 = (jo3) ibf;
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((no3) rmVar.S.getValue()).b(jo3, (long[]) this.v, this.a);
                return;
            default:
                l6f l6f = (l6f) ibf;
                rm rmVar2 = this.c;
                if (rmVar2 == null) {
                    rmVar2 = null;
                }
                sv0 b = rmVar2.b();
                List list2 = l6f.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list2) {
                        try {
                            if (((fo3) next) != do3.y0) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    list = arrayList;
                } else {
                    list = Collections.emptyList();
                }
                b.c(new o6f(list, l6f.o, (HashMap) ((Map) this.v)));
                return;
        }
    }

    public final fbf g() {
        switch (this.o) {
            case 0:
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((fn4) rmVar.b.getValue()).e();
                return new np2((long[]) this.v);
            default:
                jw9 jw9 = new jw9(x3b.SYNC, 16);
                HashMap hashMap = new HashMap();
                ((Map) this.v).forEach(new y23(1, hashMap));
                jw9.s("contactList", hashMap);
                return jw9;
        }
    }

    public final void h(qaf qaf) {
        switch (this.o) {
            case 0:
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((no3) rmVar.S.getValue()).a(qaf, (long[]) this.v, this.a);
                return;
            default:
                rm rmVar2 = this.c;
                if (rmVar2 == null) {
                    rmVar2 = null;
                }
                rmVar2.b().c(new hj0(this.a, qaf));
                return;
        }
    }
}
