package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: d6e  reason: default package */
public final class d6e implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ j50 c;
    public final /* synthetic */ j6e o;

    public d6e(j6e j6e, View view, j50 j50) {
        this.o = j6e;
        this.b = view;
        this.c = j50;
    }

    public final boolean onPreDraw() {
        ArrayList arrayList = new ArrayList();
        j6e j6e = this.o;
        Iterator it = j6e.y.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View view = this.b;
            if (kne.q(view, str) == null) {
                return false;
            }
            arrayList.add(kne.q(view, str));
        }
        if (this.a) {
            return false;
        }
        this.a = true;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            j6e j6e2 = j6e;
            View view3 = view2;
            h6e.a(view2, new sm8(j6e2, view3, this.b, this, this.c, 1));
        }
        return false;
    }
}
