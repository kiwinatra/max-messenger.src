package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ro  reason: default package */
public final class ro implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ap apVar = (ap) this.b;
                if (!apVar.getInternalPopup().a()) {
                    apVar.w.m(apVar.getTextDirection(), apVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = apVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                xo xoVar = (xo) this.b;
                ap apVar2 = xoVar.N0;
                xoVar.getClass();
                if (!apVar2.isAttachedToWindow() || !apVar2.getGlobalVisibleRect(xoVar.L0)) {
                    xoVar.dismiss();
                    return;
                }
                xoVar.s();
                xoVar.b();
                return;
            case 2:
                rx1 rx1 = (rx1) this.b;
                if (rx1.a()) {
                    ArrayList arrayList = rx1.z;
                    if (arrayList.size() > 0 && !((qx1) arrayList.get(0)).a.H0) {
                        View view = rx1.y0;
                        if (view == null || !view.isShown()) {
                            rx1.dismiss();
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((qx1) it.next()).a.b();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                d dVar = (d) this.b;
                dVar.M0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.P0;
                if (hashSet == null || hashSet.size() == 0) {
                    dVar.k(true);
                    return;
                }
                fv8 fv8 = new fv8(0, dVar);
                int firstVisiblePosition = dVar.M0.getFirstVisiblePosition();
                boolean z = false;
                for (int i = 0; i < dVar.M0.getChildCount(); i++) {
                    View childAt = dVar.M0.getChildAt(i);
                    if (dVar.P0.contains((rw8) dVar.N0.getItem(firstVisiblePosition + i))) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(c44.DEFAULT_ASPECT_RATIO, 1.0f);
                        alphaAnimation.setDuration((long) dVar.q1);
                        alphaAnimation.setFillEnabled(true);
                        alphaAnimation.setFillAfter(true);
                        if (!z) {
                            alphaAnimation.setAnimationListener(fv8);
                            z = true;
                        }
                        childAt.clearAnimation();
                        childAt.startAnimation(alphaAnimation);
                    }
                }
                return;
            default:
                dje dje = (dje) this.b;
                if (dje.a() && !dje.z.H0) {
                    View view2 = dje.w0;
                    if (view2 == null || !view2.isShown()) {
                        dje.dismiss();
                        return;
                    } else {
                        dje.z.b();
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
