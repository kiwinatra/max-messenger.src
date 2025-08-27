package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: pu1  reason: default package */
public final /* synthetic */ class pu1 implements ku1 {
    public final /* synthetic */ qu1 b;

    public /* synthetic */ pu1(qu1 qu1) {
        this.b = qu1;
    }

    public final List a(List list) {
        String e = this.b.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qu1 qu1 = (qu1) it.next();
            bs0.n(qu1 instanceof qu1);
            if (qu1.e().equals(e)) {
                return Collections.singletonList(qu1);
            }
        }
        throw new IllegalStateException(wj6.k("Unable to find camera with id ", e, " from list of available cameras."));
    }
}
