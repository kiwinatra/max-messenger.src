package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j6e  reason: default package */
public abstract class j6e extends asf {
    public yrf X;
    public yrf Y;
    public yrf Z;
    public final ts x = new qae(0);
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();

    public static void n(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (lag.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                n(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public final void f() {
        this.o = true;
        this.z.clear();
    }

    public final void k(ViewGroup viewGroup, View view, View view2, yrf yrf, boolean z2) {
        if (view2 != null) {
            ArrayList arrayList = this.z;
            if (arrayList.size() > 0) {
                view2.setVisibility(0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i6e i6e = (i6e) it.next();
                    i6e.b.addView(i6e.a);
                }
                arrayList.clear();
            }
        }
        super.k(viewGroup, view, view2, yrf, z2);
    }

    public final gsf l(View view, View view2, ViewGroup viewGroup, boolean z2) {
        yrf yrf;
        this.X = null;
        this.Y = null;
        gsf p = p(view2, z2);
        this.Z = p;
        yrf yrf2 = this.Y;
        if (yrf2 == null || (yrf = this.X) == null || (!(this instanceof tu2))) {
            return kne.D(0, this.X, yrf2, p);
        }
        return kne.D(0, kne.D(1, yrf, yrf2), this.Z);
    }

    public void m(ViewGroup viewGroup, View view, View view2, yrf yrf, boolean z2, j50 j50) {
        View view3 = view2;
        j50 j502 = new j50(this, viewGroup, view, view2, yrf, z2, j50, 4);
        o();
        if (view3 == null || view2.getParent() != null || this.y.size() <= 0) {
            j502.g();
            return;
        }
        view2.getViewTreeObserver().addOnPreDrawListener(new d6e(this, view2, j502));
        ViewGroup viewGroup2 = viewGroup;
        viewGroup.addView(view2);
    }

    public abstract void o();

    public abstract gsf p(View view, boolean z2);
}
