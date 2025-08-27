package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: asf  reason: default package */
public abstract class asf extends ey3 {
    public boolean o;
    public boolean v;
    public cy3 w;

    public final void a() {
        this.v = true;
    }

    public final boolean d() {
        return true;
    }

    public void f() {
        this.o = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, cy3 cy3) {
        ViewGroup viewGroup2 = viewGroup;
        cy3 cy32 = cy3;
        this.w = cy32;
        if (this.o) {
            cy3.n();
        } else if (this.v) {
            k(viewGroup, view, view2, (yrf) null, z);
            cy3.n();
        } else {
            haf haf = new haf(7, (Object) cy32);
            gsf l = l(view, view2, viewGroup2, z);
            l.a(new zrf(this, viewGroup2, haf));
            m(viewGroup, view, view2, l, z, new j50(this, viewGroup, l, view, view2, z, haf, 6));
        }
    }

    public void k(ViewGroup viewGroup, View view, View view2, yrf yrf, boolean z) {
        if (view != null && view.getParent() == viewGroup) {
            viewGroup.removeView(view);
        }
        if (view2 != null && view2.getParent() == null) {
            viewGroup.addView(view2);
        }
    }

    public abstract gsf l(View view, View view2, ViewGroup viewGroup, boolean z);

    public void m(ViewGroup viewGroup, View view, View view2, yrf yrf, boolean z, j50 j50) {
        j50.g();
    }
}
