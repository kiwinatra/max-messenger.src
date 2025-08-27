package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: tu2  reason: default package */
public final class tu2 extends j6e {
    public String v0 = "";

    public final void m(ViewGroup viewGroup, View view, View view2, yrf yrf, boolean z, j50 j50) {
        pza searchView;
        String string = viewGroup.getResources().getString(jra.q);
        this.v0 = string;
        if (!(view2 == null || z || (searchView = ((h3b) kne.q(view2, string)).getSearchView()) == null)) {
            searchView.c();
        }
        super.m(viewGroup, view, view2, yrf, z, j50);
    }

    public final void o() {
        String str = this.v0;
        this.x.put(str, str);
    }

    public final gsf p(View view, boolean z) {
        gsf gsf = new gsf();
        gsf.Q(new su2(view, this, z));
        return gsf;
    }
}
