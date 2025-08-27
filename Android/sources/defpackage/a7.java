package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: a7  reason: default package */
public final class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ a7(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.I0 = actionBarOverlayLayout.o.animate().translationY(c44.DEFAULT_ASPECT_RATIO).setListener(actionBarOverlayLayout.J0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.I0 = actionBarOverlayLayout2.o.animate().translationY((float) (-actionBarOverlayLayout2.o.getHeight())).setListener(actionBarOverlayLayout2.J0);
                return;
        }
    }
}
