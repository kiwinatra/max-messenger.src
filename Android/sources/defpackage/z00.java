package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: z00  reason: default package */
public final /* synthetic */ class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: o4d} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Object r5 = r6.b
            int r6 = r6.a
            switch(r6) {
                case 0: goto L_0x02a4;
                case 1: goto L_0x028f;
                case 2: goto L_0x027d;
                case 3: goto L_0x0260;
                case 4: goto L_0x025a;
                case 5: goto L_0x0243;
                case 6: goto L_0x022e;
                case 7: goto L_0x0203;
                case 8: goto L_0x01cc;
                case 9: goto L_0x01b7;
                case 10: goto L_0x018f;
                case 11: goto L_0x017d;
                case 12: goto L_0x015d;
                case 13: goto L_0x0157;
                case 14: goto L_0x0143;
                case 15: goto L_0x012d;
                case 16: goto L_0x011b;
                case 17: goto L_0x0104;
                case 18: goto L_0x00f4;
                case 19: goto L_0x00e2;
                case 20: goto L_0x00c6;
                case 21: goto L_0x00c0;
                case 22: goto L_0x00a4;
                case 23: goto L_0x009c;
                case 24: goto L_0x008c;
                case 25: goto L_0x006a;
                case 26: goto L_0x0053;
                case 27: goto L_0x003b;
                case 28: goto L_0x001f;
                default: goto L_0x000d;
            }
        L_0x000d:
            p1e r5 = (defpackage.p1e) r5
            java.lang.Object r6 = r5.a
            ong r6 = (defpackage.ong) r6
            androidx.appcompat.widget.ActionBarContainer r6 = r6.z
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            r6.invalidate()
            return
        L_0x001f:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            y6g r5 = (defpackage.y6g) r5
            r5.z0 = r6
            lu7 r7 = r5.X
            if (r7 == 0) goto L_0x0035
            rv1 r7 = r7.c
            o4d r2 = r7.z0
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.d(r6)
        L_0x003a:
            return
        L_0x003b:
            int r6 = ru.ok.messages.secret.widgets.TimerView.w0
            ru.ok.messages.secret.widgets.TimerView r5 = (ru.ok.messages.secret.widgets.TimerView) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r6 = r6 * r1
            r5.v = r6
            r5.invalidate()
            return
        L_0x0053:
            int r6 = ru.ok.messages.settings.view.ThemePreviewView.z
            ru.ok.messages.settings.view.ThemePreviewView r5 = (ru.ok.messages.settings.view.ThemePreviewView) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.w = r6
            r5.invalidate()
            return
        L_0x006a:
            int r6 = ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout.z0
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r5 = (ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout) r5
            ru.ok.messages.stickers.widgets.StickersView r7 = r5.x0
            if (r7 != 0) goto L_0x007d
            r7 = r2
        L_0x007d:
            int r7 = r7.getTop()
            int r6 = r6 - r7
            ru.ok.messages.stickers.widgets.StickersView r7 = r5.x0
            if (r7 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r2 = r7
        L_0x0088:
            r2.offsetTopAndBottom(r6)
            return
        L_0x008c:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setWidth(r6)
            return
        L_0x009c:
            int r6 = ru.ok.messages.views.widgets.SlideOutLayout.A0
            ru.ok.messages.views.widgets.SlideOutLayout r5 = (ru.ok.messages.views.widgets.SlideOutLayout) r5
            r5.e()
            return
        L_0x00a4:
            l9e r5 = (defpackage.l9e) r5
            r5.getClass()
            boolean r6 = r7.isRunning()
            if (r6 != 0) goto L_0x00b0
            goto L_0x00bf
        L_0x00b0:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5.P0 = r6
            r5.invalidate()
        L_0x00bf:
            return
        L_0x00c0:
            f7e r5 = (defpackage.f7e) r5
            r5.invalidateSelf()
            return
        L_0x00c6:
            tgd r5 = (defpackage.tgd) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            r6.floatValue()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5.setAlpha(r6)
            return
        L_0x00e2:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            nqc r5 = (defpackage.nqc) r5
            r5.o = r6
            r5.invalidate()
            return
        L_0x00f4:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.graphics.drawable.GradientDrawable r5 = (android.graphics.drawable.GradientDrawable) r5
            r5.setColor(r6)
            return
        L_0x0104:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            android.view.View[] r5 = (android.view.View[]) r5
            int r7 = r5.length
        L_0x010d:
            if (r4 >= r7) goto L_0x011a
            r0 = r5[r4]
            float r1 = r6.floatValue()
            r0.setRotation(r1)
            int r4 = r4 + r3
            goto L_0x010d
        L_0x011a:
            return
        L_0x011b:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            wsa r5 = (defpackage.wsa) r5
            r5.v = r6
            r5.invalidate()
            return
        L_0x012d:
            d99 r5 = (defpackage.d99) r5
            android.view.View r6 = r5.G0
            android.graphics.drawable.Drawable r6 = r6.getForeground()
            java.lang.Object r7 = r7.getAnimatedValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setAlpha(r7)
            return
        L_0x0143:
            ce r5 = (defpackage.ce) r5
            java.lang.Object r6 = r5.b
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r7 = r7.getAnimatedValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setPadding(r4, r4, r4, r7)
            return
        L_0x0157:
            b38 r5 = (defpackage.b38) r5
            r5.invalidateSelf()
            return
        L_0x015d:
            float r6 = r7.getAnimatedFraction()
            r7 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            yt7 r5 = (defpackage.yt7) r5
            if (r0 > 0) goto L_0x0176
            boolean r0 = r5.a
            if (r0 == 0) goto L_0x0176
            r5.a = r4
            ks6 r6 = r5.b
            r6.a()
            goto L_0x017c
        L_0x0176:
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x017c
            r5.a = r3
        L_0x017c:
            return
        L_0x017d:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            ks6 r5 = (defpackage.ks6) r5
            r5.v = r6
            r5.invalidate()
            return
        L_0x018f:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            rd5 r5 = (defpackage.rd5) r5
            r5.y0 = r6
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            if (r6 == 0) goto L_0x01af
            java.lang.Object r7 = r7.getAnimatedValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.height = r7
            r5.setLayoutParams(r6)
            return
        L_0x01af:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r6.<init>(r7)
            throw r6
        L_0x01b7:
            kx4 r5 = (defpackage.kx4) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            com.google.android.material.internal.CheckableImageButton r7 = r5.d
            r7.setAlpha(r6)
            return
        L_0x01cc:
            e44 r5 = (defpackage.e44) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            int r7 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x01e0
            goto L_0x0202
        L_0x01e0:
            android.graphics.Matrix r7 = r5.Y
            float r0 = com.yalantis.ucrop.util.MatrixUtils.getMatrixValue(r7, r4)
            float r6 = r6 / r0
            android.graphics.RectF r0 = r5.x
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.postScale(r6, r2, r1, r0)
            android.graphics.Matrix r6 = r5.X
            r6.set(r7)
            asg r6 = r5.b
            if (r6 == 0) goto L_0x0202
            r6.b(r7)
        L_0x0202:
            return
        L_0x0203:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r7 = 100
            float r7 = (float) r7
            float r7 = r7 * r6
            float r7 = r7 / r1
            q14 r5 = (defpackage.q14) r5
            long r0 = r5.x
            float r0 = (float) r0
            float r0 = r0 * r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r7
            int r7 = (int) r0
            f13 r0 = r5.z
            r0.b = r6
            r0.invalidateSelf()
            int r7 = r7 / 1000
            int r7 = r7 + r3
            java.lang.String r6 = java.lang.String.valueOf(r7)
            r5.setText(r6)
            return
        L_0x022e:
            qk3 r5 = (defpackage.qk3) r5
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            r5.accept(r6)     // Catch:{ all -> 0x023a }
            goto L_0x0242
        L_0x023a:
            r6 = move-exception
            java.lang.String r7 = "mqf"
            java.lang.String r0 = "animateContainer: failed to update value"
            defpackage.z68.b(r7, r0, r6)
        L_0x0242:
            return
        L_0x0243:
            mqf r5 = (defpackage.mqf) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r5.v
            android.view.View r7 = (android.view.View) r7
            defpackage.iq.O(r7, r6)
            return
        L_0x025a:
            v81 r5 = (defpackage.v81) r5
            r5.invalidateSelf()
            return
        L_0x0260:
            int r6 = ru.ok.messages.settings.view.BrightnessSeekBar.x
            ru.ok.messages.settings.view.BrightnessSeekBar r5 = (ru.ok.messages.settings.view.BrightnessSeekBar) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5.v = r6
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0279
            r5.v = r0
        L_0x0279:
            r5.invalidate()
            return
        L_0x027d:
            f3a r5 = (defpackage.f3a) r5
            androidx.appcompat.widget.AppCompatImageView r6 = r5.A0
            java.lang.Object r7 = r7.getAnimatedValue()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r6.setTranslationY(r7)
            return
        L_0x028f:
            r20 r5 = (defpackage.r20) r5
            r5.getClass()
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.b = r6
            r5.invalidateSelf()
            return
        L_0x02a4:
            java.lang.Object r6 = r7.getAnimatedValue()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            a10 r5 = (defpackage.a10) r5
            r5.f = r6
            r5.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z00.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public /* synthetic */ z00(p1e p1e, View view) {
        this.a = 29;
        this.b = p1e;
    }
}
