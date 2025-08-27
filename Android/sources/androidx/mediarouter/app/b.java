package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.Iterator;

public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.M0;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            n6b n6b = (n6b) it.next();
            if (!n6b.k) {
                n6b.j = overlayListView.getDrawingTime();
                n6b.k = true;
            }
        }
        dVar.M0.postDelayed(dVar.w1, (long) dVar.p1);
    }
}
