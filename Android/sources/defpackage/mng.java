package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: mng  reason: default package */
public final class mng extends gcg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ong b;

    public /* synthetic */ mng(ong ong, int i) {
        this.a = i;
        this.b = ong;
    }

    public final void c() {
        View view;
        ong ong = this.b;
        switch (this.a) {
            case 0:
                if (ong.K && (view = ong.C) != null) {
                    view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    ong.z.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                }
                ong.z.setVisibility(8);
                ong.z.setTransitioning(false);
                ong.O = null;
                a8 a8Var = ong.G;
                if (a8Var != null) {
                    a8Var.i(ong.F);
                    ong.F = null;
                    ong.G = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ong.y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = gag.a;
                    t9g.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                ong.O = null;
                ong.z.requestLayout();
                return;
        }
    }
}
