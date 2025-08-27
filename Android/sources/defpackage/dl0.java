package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;

/* renamed from: dl0  reason: default package */
public final class dl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il0 b;

    public /* synthetic */ dl0(il0 il0, int i) {
        this.a = i;
        this.b = il0;
    }

    public final void run() {
        Context context;
        Rect rect;
        il0 il0 = this.b;
        switch (this.a) {
            case 0:
                if (il0.i != null && (context = il0.h) != null) {
                    int i = te8.h;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    hl0 hl0 = il0.i;
                    hl0.getLocationInWindow(iArr);
                    int height2 = (height - (hl0.getHeight() + iArr[1])) + ((int) il0.i.getTranslationY());
                    int i2 = il0.q;
                    if (height2 >= i2) {
                        il0.r = i2;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = il0.i.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        gh5 gh5 = il0.v;
                        return;
                    }
                    int i3 = il0.q;
                    il0.r = i3;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                    il0.i.requestLayout();
                    return;
                }
                return;
            case 1:
                il0.c();
                return;
            default:
                hl0 hl02 = il0.i;
                if (hl02 != null) {
                    ViewParent parent = hl02.getParent();
                    hl0 hl03 = il0.i;
                    if (parent != null) {
                        hl03.setVisibility(0);
                    }
                    if (hl03.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
                        ofFloat.setInterpolator(il0.d);
                        ofFloat.addUpdateListener(new bl0(il0, 0, (byte) 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                        ofFloat2.setInterpolator(il0.f);
                        ofFloat2.addUpdateListener(new bl0(il0, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                        animatorSet.setDuration((long) il0.a);
                        animatorSet.addListener(new al0(il0, 3));
                        animatorSet.start();
                        return;
                    }
                    int height3 = hl03.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = hl03.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    hl03.setTranslationY((float) height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{height3, 0});
                    valueAnimator.setInterpolator(il0.e);
                    valueAnimator.setDuration((long) il0.c);
                    valueAnimator.addListener(new al0(il0, 1));
                    valueAnimator.addUpdateListener(new bl0(il0, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
