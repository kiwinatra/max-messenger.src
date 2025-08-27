package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rqe  reason: default package */
public final /* synthetic */ class rqe implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vqe b;
    public final /* synthetic */ List c;

    public /* synthetic */ rqe(vqe vqe, List list, int i) {
        this.a = i;
        this.b = vqe;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        vqe vqe = this.b;
        int i = this.a;
        List list2 = (List) obj;
        vqe.getClass();
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return lbe.h(list);
                }
                wv5 a2 = wv5.a(lbe.h(list), vqe.d(list2));
                iq.h0(IntCompanionObject.MAX_VALUE, "maxConcurrency");
                lw5 lw5 = new lw5(a2);
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                return new aw5(lw5, new fj6(arrayList), new mqd(7));
            default:
                return new wbe(new mha(jha.n(list), new uqe(0, list2), 1).B(), new rqe(vqe, list2, 0), 0);
        }
    }
}
