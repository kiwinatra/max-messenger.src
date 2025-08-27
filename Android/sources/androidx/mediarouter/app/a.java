package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ d c;

    public a(d dVar, HashMap hashMap, HashMap hashMap2) {
        this.c = dVar;
        this.a = hashMap;
        this.b = hashMap2;
    }

    public final void onGlobalLayout() {
        Map map;
        Map map2;
        n6b n6b;
        rw8 rw8;
        d dVar = this.c;
        dVar.M0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.P0;
        if (hashSet != null && dVar.Q0 != null) {
            int size = hashSet.size() - dVar.Q0.size();
            b bVar = new b(dVar);
            int firstVisiblePosition = dVar.M0.getFirstVisiblePosition();
            int i = 0;
            boolean z = false;
            while (true) {
                int childCount = dVar.M0.getChildCount();
                map = this.a;
                map2 = this.b;
                if (i >= childCount) {
                    break;
                }
                View childAt = dVar.M0.getChildAt(i);
                rw8 rw82 = (rw8) dVar.N0.getItem(firstVisiblePosition + i);
                Rect rect = (Rect) map.get(rw82);
                int top = childAt.getTop();
                int i2 = rect != null ? rect.top : (dVar.W0 * size) + top;
                AnimationSet animationSet = new AnimationSet(true);
                HashSet hashSet2 = dVar.P0;
                if (hashSet2 == null || !hashSet2.contains(rw82)) {
                    rw8 = rw82;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
                    rw8 = rw82;
                    alphaAnimation.setDuration((long) dVar.q1);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) (i2 - top), c44.DEFAULT_ASPECT_RATIO);
                translateAnimation.setDuration((long) dVar.p1);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(dVar.s1);
                if (!z) {
                    animationSet.setAnimationListener(bVar);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                rw8 rw83 = rw8;
                map.remove(rw83);
                map2.remove(rw83);
                i++;
            }
            for (Map.Entry entry : map2.entrySet()) {
                rw8 rw84 = (rw8) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(rw84);
                if (dVar.Q0.contains(rw84)) {
                    n6b = new n6b(bitmapDrawable, rect2);
                    n6b.h = 1.0f;
                    n6b.i = c44.DEFAULT_ASPECT_RATIO;
                    n6b.e = (long) dVar.r1;
                    n6b.d = dVar.s1;
                } else {
                    n6b n6b2 = new n6b(bitmapDrawable, rect2);
                    n6b2.g = dVar.W0 * size;
                    n6b2.e = (long) dVar.p1;
                    n6b2.d = dVar.s1;
                    n6b2.m = new ata(dVar, rw84, false, 17);
                    dVar.R0.add(rw84);
                    n6b = n6b2;
                }
                dVar.M0.a.add(n6b);
            }
        }
    }
}
