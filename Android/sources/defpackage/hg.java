package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: hg  reason: default package */
public final /* synthetic */ class hg implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hg(View view, int i) {
        this.a = i;
        this.b = view;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x004a;
                case 2: goto L_0x003a;
                case 3: goto L_0x0025;
                case 4: goto L_0x0015;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            r4.setAlpha(r5)
            return
        L_0x0015:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            r4.setRotation(r5)
            return
        L_0x0025:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            android.view.View r4 = r4.b
            int r0 = r4.getTop()
            int r5 = r5 - r0
            r4.offsetTopAndBottom(r5)
            return
        L_0x003a:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            r4.setAlpha(r5)
            return
        L_0x004a:
            java.lang.Object r5 = r5.getAnimatedValue()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            android.view.View r4 = r4.b
            defpackage.kne.L(r4, r5)
            return
        L_0x005a:
            java.lang.String r0 = "top"
            java.lang.Object r0 = r5.getAnimatedValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto L_0x0068
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0069
        L_0x0068:
            r0 = r2
        L_0x0069:
            android.view.View r4 = r4.b
            r1 = 0
            if (r0 == 0) goto L_0x0073
            int r0 = r0.intValue()
            goto L_0x0085
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r3 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x007e
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            if (r0 == 0) goto L_0x0084
            int r0 = r0.topMargin
            goto L_0x0085
        L_0x0084:
            r0 = r1
        L_0x0085:
            java.lang.String r3 = "bottom"
            java.lang.Object r5 = r5.getAnimatedValue(r3)
            boolean r3 = r5 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0092
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x0093
        L_0x0092:
            r5 = r2
        L_0x0093:
            if (r5 == 0) goto L_0x009a
            int r1 = r5.intValue()
            goto L_0x00a9
        L_0x009a:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r3 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x00a5
            r2 = r5
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
        L_0x00a5:
            if (r2 == 0) goto L_0x00a9
            int r1 = r2.bottomMargin
        L_0x00a9:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            r5.topMargin = r0
            r5.bottomMargin = r1
            r4.setLayoutParams(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
