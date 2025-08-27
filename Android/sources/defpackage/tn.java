package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: tn  reason: default package */
public final class tn extends gcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((sn) obj).b.E0.setVisibility(0);
                return;
            case 1:
                eo eoVar = (eo) obj;
                eoVar.E0.setVisibility(0);
                if (eoVar.E0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = gag.a;
                    t9g.c((View) eoVar.E0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                sn snVar = (sn) obj;
                snVar.b.E0.setAlpha(1.0f);
                eo eoVar = snVar.b;
                eoVar.H0.d((fcg) null);
                eoVar.H0 = null;
                return;
            case 1:
                eo eoVar2 = (eo) obj;
                eoVar2.E0.setAlpha(1.0f);
                eoVar2.H0.d((fcg) null);
                eoVar2.H0 = null;
                return;
            default:
                p7d p7d = (p7d) obj;
                ((eo) p7d.c).E0.setVisibility(8);
                eo eoVar3 = (eo) p7d.c;
                PopupWindow popupWindow = eoVar3.F0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eoVar3.E0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = gag.a;
                    t9g.c((View) eoVar3.E0.getParent());
                }
                eoVar3.E0.e();
                eoVar3.H0.d((fcg) null);
                eoVar3.H0 = null;
                ViewGroup viewGroup = eoVar3.J0;
                WeakHashMap weakHashMap2 = gag.a;
                t9g.c(viewGroup);
                return;
        }
    }
}
