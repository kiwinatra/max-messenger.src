package defpackage;

import android.animation.ValueAnimator;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;

/* renamed from: plb  reason: default package */
public final /* synthetic */ class plb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinchToZoomVideoViewWrapper b;

    public /* synthetic */ plb(PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper, int i) {
        this.a = i;
        this.b = pinchToZoomVideoViewWrapper;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
        switch (this.a) {
            case 0:
                int i = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.z.setAlpha((int) (255.0f * floatValue));
                if (((double) floatValue) == 0.0d) {
                    pinchToZoomVideoViewWrapper.y = false;
                }
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 1:
                int i2 = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 2:
                int i3 = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 3:
                int i4 = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            case 4:
                int i5 = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.A0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
            default:
                int i6 = PinchToZoomVideoViewWrapper.I0;
                pinchToZoomVideoViewWrapper.getClass();
                pinchToZoomVideoViewWrapper.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinchToZoomVideoViewWrapper.invalidate();
                return;
        }
    }
}
