package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: qwc  reason: default package */
public final /* synthetic */ class qwc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ qwc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                iq.a0(recordControlsWidget.h0().getDrawable(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                recordControlsWidget.r0().setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 2:
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                recordControlsWidget.E0().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                View A0 = recordControlsWidget.A0();
                ViewGroup.LayoutParams layoutParams = A0.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    A0.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 4:
                KProperty[] kPropertyArr5 = RecordControlsWidget.g1;
                recordControlsWidget.r0().setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                KProperty[] kPropertyArr6 = RecordControlsWidget.g1;
                recordControlsWidget.E0().setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                KProperty[] kPropertyArr7 = RecordControlsWidget.g1;
                recordControlsWidget.F0().setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                KProperty[] kPropertyArr8 = RecordControlsWidget.g1;
                View A02 = recordControlsWidget.A0();
                ViewGroup.LayoutParams layoutParams3 = A02.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    A02.setLayoutParams(layoutParams4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            default:
                KProperty[] kPropertyArr9 = RecordControlsWidget.g1;
                iq.a0(recordControlsWidget.v0(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
