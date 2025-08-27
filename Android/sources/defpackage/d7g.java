package defpackage;

import android.animation.ValueAnimator;
import android.view.ScaleGestureDetector;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.reflect.KProperty;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: d7g  reason: default package */
public final class d7g implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ VideoMessageWidget a;

    public d7g(VideoMessageWidget videoMessageWidget) {
        this.a = videoMessageWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r4 = (defpackage.yrg) (r4 = ((defpackage.p4d) r4).b.s()).d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r4) {
        /*
            r3 = this;
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.videomsg.VideoMessageWidget.X
            one.me.chatscreen.videomsg.VideoMessageWidget r3 = r3.a
            s6g r3 = r3.d0()
            float r4 = r4.getScaleFactor()
            y6g r3 = (defpackage.y6g) r3
            android.animation.ValueAnimator r0 = r3.A0
            r1 = 1
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x0020
            android.animation.ValueAnimator r0 = r3.A0
            if (r0 == 0) goto L_0x0020
            r0.cancel()
        L_0x0020:
            float r0 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = defpackage.i2a.f(r4, r0, r2, r0)
            float r0 = r3.z0
            float r0 = r0 * r4
            r3.z0 = r0
            qu1 r4 = r3.l()
            if (r4 == 0) goto L_0x0049
            p4d r4 = (defpackage.p4d) r4
            qu1 r4 = r4.b
            u08 r4 = r4.s()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.d()
            yrg r4 = (defpackage.yrg) r4
            if (r4 == 0) goto L_0x0049
            float r4 = r4.b()
            goto L_0x004b
        L_0x0049:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x004b:
            qu1 r2 = r3.l()
            if (r2 == 0) goto L_0x0068
            p4d r2 = (defpackage.p4d) r2
            qu1 r2 = r2.b
            u08 r2 = r2.s()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r2.d()
            yrg r2 = (defpackage.yrg) r2
            if (r2 == 0) goto L_0x0068
            float r2 = r2.a()
            goto L_0x006a
        L_0x0068:
            r2 = 1092616192(0x41200000, float:10.0)
        L_0x006a:
            float r4 = kotlin.ranges.RangesKt.coerceIn((float) r0, (float) r4, (float) r2)
            lu7 r3 = r3.X
            if (r3 == 0) goto L_0x0077
            rv1 r3 = r3.c
            o4d r3 = r3.z0
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 == 0) goto L_0x007d
            r3.d(r4)
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7g.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        KProperty[] kPropertyArr = VideoMessageWidget.X;
        y6g y6g = (y6g) this.a.d0();
        ValueAnimator valueAnimator = y6g.A0;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{y6g.z0, 1.0f});
            ofFloat.setDuration(150);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new z00(28, (Object) y6g));
            ofFloat.addListener(new uf(11, y6g));
            y6g.A0 = ofFloat;
            ofFloat.start();
        }
    }
}
