package defpackage;

import android.animation.Animator;
import android.text.Layout;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.reflect.KProperty;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: tf  reason: default package */
public final class tf implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                vf vfVar = (vf) this.b;
                vfVar.o = null;
                vf.a(vfVar, (OneMeButton) this.c);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                vf vfVar = (vf) obj;
                vfVar.o = null;
                vf.a(vfVar, (OneMeButton) obj2);
                return;
            case 1:
                return;
            case 2:
                KProperty[] kPropertyArr = FakeInAppReviewBottomSheet.F0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                fakeInAppReviewBottomSheet.getClass();
                ((ConstraintLayout) fakeInAppReviewBottomSheet.w0.getValue(fakeInAppReviewBottomSheet, FakeInAppReviewBottomSheet.F0[0])).setVisibility(8);
                ((FrameLayout) obj2).postDelayed(fakeInAppReviewBottomSheet.D0, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                return;
            default:
                ((cf8) obj).setAlpha(((wf) obj2).b.floatValue());
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((rd5) this.b).x = (Layout) this.c;
                return;
            default:
                return;
        }
    }
}
