package defpackage;

import android.view.View;

/* renamed from: su2  reason: default package */
public final class su2 implements xrf {
    public final /* synthetic */ View a;
    public final /* synthetic */ tu2 b;
    public final /* synthetic */ boolean c;

    public su2(View view, tu2 tu2, boolean z) {
        this.a = view;
        this.b = tu2;
        this.c = z;
    }

    public final void a(yrf yrf) {
        View view = this.a;
        if (view != null) {
            h3b h3b = (h3b) kne.q(view, this.b.v0);
            if (this.c) {
                pza searchView = h3b.getSearchView();
                if (searchView != null) {
                    searchView.d();
                    return;
                }
                return;
            }
            pza searchView2 = h3b.getSearchView();
            if (searchView2 != null) {
                searchView2.b();
            }
        }
    }

    public final void b() {
    }

    public final void c(yrf yrf) {
    }

    public final void f() {
    }

    public final void g(yrf yrf) {
    }
}
