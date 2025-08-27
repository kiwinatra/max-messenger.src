package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: bn  reason: default package */
public final /* synthetic */ class bn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                int i = AppBarLayout.L0;
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                appBarLayout.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((bh8) obj2).k(floatValue);
                Drawable drawable = appBarLayout.H0;
                if (drawable instanceof bh8) {
                    ((bh8) drawable).k(floatValue);
                }
                Iterator it = appBarLayout.D0.iterator();
                if (it.hasNext()) {
                    rae.w(it.next());
                    throw null;
                }
                return;
            case 1:
                tm1.R((jg) obj, (tm1) obj2);
                return;
            case 2:
                e33 e33 = (e33) obj;
                e33.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TransitionValues transitionValues = (TransitionValues) obj2;
                iq.x(e33.a, transitionValues.view);
                if (e33.b) {
                    double d = (double) floatValue2;
                    if (d > 0.5d && transitionValues.view.getClipBounds() != null) {
                        Rect clipBounds = transitionValues.view.getClipBounds();
                        int i2 = clipBounds.top;
                        if (i2 != 0) {
                            clipBounds.top = i2 - ((int) (((d - 0.5d) * ((double) transitionValues.view.getClipBounds().top)) / 0.5d));
                        }
                        if (clipBounds.bottom < transitionValues.view.getHeight()) {
                            clipBounds.bottom += (int) (((d - 0.5d) * ((double) (transitionValues.view.getHeight() - clipBounds.bottom))) / 0.5d);
                        }
                        transitionValues.view.setClipBounds(clipBounds);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                KProperty[] kPropertyArr = FakeInAppReviewBottomSheet.F0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                fakeInAppReviewBottomSheet.getClass();
                KProperty[] kPropertyArr2 = FakeInAppReviewBottomSheet.F0;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj2;
                ((ConstraintLayout) fakeInAppReviewBottomSheet.w0.getValue(fakeInAppReviewBottomSheet, kPropertyArr2[0])).setAlpha(1.0f - valueAnimator2.getAnimatedFraction());
                ((FrameLayout) fakeInAppReviewBottomSheet.x0.getValue(fakeInAppReviewBottomSheet, kPropertyArr2[1])).setAlpha(valueAnimator2.getAnimatedFraction());
                return;
            case 4:
                KProperty[] kPropertyArr3 = MediaKeyboardWidget.A0;
                float floatValue3 = ((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue();
                for (View view : (View[]) obj2) {
                    view.setScaleX(floatValue3);
                    view.setScaleY(floatValue3);
                }
                return;
            case 5:
                nrb nrb = (nrb) obj;
                nrb.getClass();
                nrb.b.d().offsetTopAndBottom(((Integer) valueAnimator.getAnimatedValue()).intValue() - nrb.b.d().getTop());
                grb grb = (grb) obj2;
                if (grb != null) {
                    try {
                        grb.a(Float.valueOf(valueAnimator.getAnimatedFraction()));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                npg npg = (npg) obj;
                npg.getClass();
                pv1 pv1 = new pv1(7, (Object) (Integer) valueAnimator.getAnimatedValue(), (Object) (AtomicBoolean) obj2);
                a4a a4a = (a4a) npg.b;
                if (a4a != null) {
                    pv1.accept(a4a);
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj2;
                if (valueAnimator.getAnimatedFraction() > 0.5f) {
                    Ref.BooleanRef booleanRef = (Ref.BooleanRef) obj;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        recordControlsWidget.K0();
                    }
                }
                recordControlsWidget.F0().setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
