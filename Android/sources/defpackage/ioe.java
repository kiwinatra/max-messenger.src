package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ioe  reason: default package */
public final /* synthetic */ class ioe implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ moe b;
    public final /* synthetic */ List c;

    public /* synthetic */ ioe(moe moe, List list, int i) {
        this.a = i;
        this.b = moe;
        this.c = list;
    }

    public final Object apply(Object obj) {
        List list = this.c;
        moe moe = this.b;
        int i = this.a;
        List list2 = (List) obj;
        moe.getClass();
        switch (i) {
            case 0:
                if (list2.isEmpty()) {
                    return lbe.h(list);
                }
                wv5 a2 = wv5.a(lbe.h(list), moe.g(list2));
                iq.h0(IntCompanionObject.MAX_VALUE, "maxConcurrency");
                lw5 lw5 = new lw5(a2);
                ArrayList arrayList = new ArrayList();
                return new aw5(lw5, new fj6(arrayList), new mqd(7));
            default:
                return new wbe(new mha(jha.n(list), new x52(27, list2), 1).B(), new ioe(moe, list2, 0), 0);
        }
    }
}
