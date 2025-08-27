package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: dvc  reason: default package */
public final /* synthetic */ class dvc implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gvc b;
    public final /* synthetic */ List c;

    public /* synthetic */ dvc(gvc gvc, List list, int i) {
        this.a = i;
        this.b = gvc;
        this.c = list;
    }

    public final void run() {
        x10 x10;
        List<ouc> list = this.c;
        gvc gvc = this.b;
        switch (this.a) {
            case 0:
                gvc.getClass();
                ArrayList arrayList = new ArrayList();
                for (ouc ouc : list) {
                    int ordinal = ouc.a.ordinal();
                    Long l = null;
                    if (ordinal == 2) {
                        vpe vpe = ouc instanceof vpe ? (vpe) ouc : null;
                        if (vpe != null) {
                            l = Long.valueOf(vpe.c);
                        }
                    } else if (ordinal == 3) {
                        rr6 rr6 = ouc instanceof rr6 ? (rr6) ouc : null;
                        if (!(rr6 == null || (x10 = rr6.c) == null)) {
                            l = Long.valueOf(x10.y);
                        }
                    }
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((jna) ((rl) gvc.d.getValue())).g(cjf.i(arrayList), 6);
                    return;
                }
                return;
            default:
                List list2 = gvc.h;
                ((jna) ((rl) gvc.d.getValue())).g(cjf.i(list), 6);
                return;
        }
    }
}
