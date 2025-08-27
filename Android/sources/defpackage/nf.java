package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: nf  reason: default package */
public final class nf extends n22 {
    public final /* synthetic */ int c = 0;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf(int i, of ofVar) {
        super(i);
        this.e = ofVar;
    }

    public void b(vng vng) {
        switch (this.c) {
            case 0:
                of ofVar = (of) this.e;
                if (!ofVar.g && ofVar.k == vng.a.c()) {
                    ofVar.k = -1;
                    ofVar.i();
                    iog iog = ofVar.e;
                    if (iog != null) {
                        ofVar.c(iog);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(vng vng) {
        switch (this.c) {
            case 0:
                of ofVar = (of) this.e;
                if (!ofVar.g && ofVar.k == -1 && (vng.a.c() & ofVar.j) != 0) {
                    ofVar.k = vng.a.c();
                    this.d = ofVar.e;
                    ofVar.j();
                    return;
                }
                return;
            default:
                if ((vng.a.c() & 8) != 0) {
                    xr8 xr8 = (xr8) this.e;
                    View view = xr8.c;
                    int c2 = xr8.c();
                    View view2 = xr8.b;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                    view2.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    gag.l((View) this.d, (n22) null);
                    return;
                }
                return;
        }
    }

    public final iog d(iog iog, List list) {
        Object obj;
        switch (this.c) {
            case 0:
                of ofVar = (of) this.e;
                if (ofVar.g) {
                    return iog;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((vng) obj).a.c() == ofVar.k) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return ((vng) obj) != null ? ofVar.h(of.f(ofVar, iog)) : iog;
            default:
                return iog;
        }
    }

    public h0h e(vng vng, h0h h0h) {
        iog iog;
        switch (this.c) {
            case 0:
                of ofVar = (of) this.e;
                if (!ofVar.g && (iog = (iog) this.d) != null && ofVar.k == vng.a.c()) {
                    iog f = of.f(ofVar, iog);
                    ofVar.g(f, h0h);
                    ofVar.h(f);
                }
                return h0h;
            default:
                return h0h;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nf(View view, xr8 xr8) {
        super(1);
        this.d = view;
        this.e = xr8;
    }
}
