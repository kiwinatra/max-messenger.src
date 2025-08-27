package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: wt7  reason: default package */
public final class wt7 implements ku1 {
    public final int b;

    public wt7(int i) {
        this.b = i;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qu1 qu1 = (qu1) it.next();
            bs0.m("The camera info doesn't contain internal implementation.", qu1 instanceof qu1);
            if (qu1.h() == this.b) {
                arrayList.add(qu1);
            }
        }
        return arrayList;
    }
}
