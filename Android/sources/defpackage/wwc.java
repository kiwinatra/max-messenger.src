package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.Pair;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: wwc  reason: default package */
public final class wwc implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordControlsWidget b;

    public /* synthetic */ wwc(RecordControlsWidget recordControlsWidget, int i) {
        this.a = i;
        this.b = recordControlsWidget;
    }

    private final void A(Animator animator) {
    }

    private final void B(Animator animator) {
    }

    private final void C(Animator animator) {
    }

    private final void D(Animator animator) {
    }

    private final void E(Animator animator) {
    }

    private final void F(Animator animator) {
    }

    private final void G(Animator animator) {
    }

    private final void H(Animator animator) {
    }

    private final void I(Animator animator) {
    }

    private final void J(Animator animator) {
    }

    private final void K(Animator animator) {
    }

    private final void L(Animator animator) {
    }

    private final void M(Animator animator) {
    }

    private final void N(Animator animator) {
    }

    private final void O(Animator animator) {
    }

    private final void P(Animator animator) {
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

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    private final void v(Animator animator) {
    }

    private final void w(Animator animator) {
    }

    private final void x(Animator animator) {
    }

    private final void y(Animator animator) {
    }

    private final void z(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                recordControlsWidget.A0().setVisibility(8);
                RecordControlsWidget.d0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.r0().setText((CharSequence) null);
                recordControlsWidget.s0().setAlpha(1.0f);
                recordControlsWidget.j0().setScaleX(1.0f);
                recordControlsWidget.k0().setAlpha(1.0f);
                c33 c0 = RecordControlsWidget.c0(recordControlsWidget);
                if (c0 != null) {
                    ((MessageWriteWidget) c0).c0(true);
                }
                RecordControlsWidget.e0(recordControlsWidget);
                recordControlsWidget.g0();
                recordControlsWidget.D0().Z.setValue((Object) null);
                return;
            case 1:
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                recordControlsWidget.A0().setVisibility(8);
                RecordControlsWidget.d0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.k0().setVisibility(8);
                recordControlsWidget.n0().setScaleX(1.0f);
                recordControlsWidget.n0().setScaleY(1.0f);
                recordControlsWidget.n0().setAlpha(1.0f);
                recordControlsWidget.n0().setVisibility(0);
                recordControlsWidget.B0().setVisibility(8);
                recordControlsWidget.B0().setScaleX(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.B0().setScaleY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.o0().setAlpha(1.0f);
                recordControlsWidget.k0().setScaleX(1.0f);
                recordControlsWidget.k0().setScaleY(1.0f);
                recordControlsWidget.k0().setAlpha(1.0f);
                recordControlsWidget.s0().setScaleX(1.0f);
                recordControlsWidget.s0().setScaleY(1.0f);
                recordControlsWidget.s0().setAlpha(1.0f);
                c33 c02 = RecordControlsWidget.c0(recordControlsWidget);
                if (c02 != null) {
                    ((MessageWriteWidget) c02).c0(true);
                }
                RecordControlsWidget.e0(recordControlsWidget);
                recordControlsWidget.g0();
                recordControlsWidget.D0().Z.setValue((Object) null);
                return;
            case 2:
                return;
            case 3:
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                recordControlsWidget.n0().setVisibility(8);
                recordControlsWidget.B0().setVisibility(0);
                recordControlsWidget.B0().setAlpha(1.0f);
                return;
            case 4:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                recordControlsWidget.A0().setVisibility(8);
                recordControlsWidget.l0().setAlpha(1.0f);
                ((View) recordControlsWidget.v0.getValue(recordControlsWidget, RecordControlsWidget.g1[9])).setAlpha(1.0f);
                recordControlsWidget.z0().setScaleX(1.0f);
                recordControlsWidget.z0().setScaleY(1.0f);
                recordControlsWidget.y0().setScaleX(1.0f);
                recordControlsWidget.y0().setScaleY(1.0f);
                recordControlsWidget.w0().setScaleX(1.0f);
                recordControlsWidget.w0().setScaleY(1.0f);
                GradientDrawable E0 = recordControlsWidget.E0();
                js9 js9 = fu4.k;
                js9.f(recordControlsWidget.o0()).c().a.getClass();
                E0.setColor(i8b.Y(0.08f, -16745729));
                recordControlsWidget.r0().setTextColor(js9.f(recordControlsWidget.h0()).getText().e);
                recordControlsWidget.k0().setScaleX(1.0f);
                recordControlsWidget.k0().setScaleY(1.0f);
                recordControlsWidget.k0().setAlpha(1.0f);
                recordControlsWidget.x0().setVisibility(8);
                recordControlsWidget.l0().setVisibility(8);
                c33 c03 = RecordControlsWidget.c0(recordControlsWidget);
                if (c03 != null) {
                    ((MessageWriteWidget) c03).c0(true);
                }
                RecordControlsWidget.e0(recordControlsWidget);
                recordControlsWidget.g0();
                recordControlsWidget.D0().Z.setValue((Object) null);
                return;
            case 5:
                RecordControlsWidget.d0(recordControlsWidget).setVisibility(8);
                recordControlsWidget.n0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.n0().setAlpha(1.0f);
                recordControlsWidget.o0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.o0().setAlpha(1.0f);
                recordControlsWidget.m0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.m0().setAlpha(1.0f);
                recordControlsWidget.l0().setAlpha(1.0f);
                recordControlsWidget.z0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.z0().setAlpha(1.0f);
                recordControlsWidget.w0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.w0().setAlpha(1.0f);
                RecordControlsWidget.f0(recordControlsWidget);
                return;
            case 6:
                return;
            case 7:
                KProperty[] kPropertyArr5 = RecordControlsWidget.g1;
                recordControlsWidget.w0().setVisibility(8);
                return;
            case 8:
                return;
            case 9:
                KProperty[] kPropertyArr6 = RecordControlsWidget.g1;
                recordControlsWidget.y0().setVisibility(8);
                RecordControlsWidget.f0(recordControlsWidget);
                return;
            case 10:
            case 11:
                return;
            case 12:
                KProperty[] kPropertyArr7 = RecordControlsWidget.g1;
                recordControlsWidget.n0().setAlpha(1.0f);
                return;
            default:
                KProperty[] kPropertyArr8 = RecordControlsWidget.g1;
                recordControlsWidget.q0().setAlpha(1.0f);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        RecordControlsWidget recordControlsWidget = this.b;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ohe ohe = recordControlsWidget.X0;
                if (ohe != null) {
                    ohe.b();
                    return;
                }
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                KProperty[] kPropertyArr = RecordControlsWidget.g1;
                recordControlsWidget.z0().setTranslationY(vo4.c().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.z0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.w0().setTranslationY(vo4.c().getDisplayMetrics().density * 48.0f);
                recordControlsWidget.w0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.w0().setVisibility(0);
                recordControlsWidget.y0().setVisibility(8);
                recordControlsWidget.k0().setScaleX(1.0f);
                recordControlsWidget.k0().setScaleY(1.0f);
                Pair pair = recordControlsWidget.T0;
                if (pair != null) {
                    recordControlsWidget.k0().setX(((Number) pair.getFirst()).floatValue());
                }
                recordControlsWidget.h0().setImageDrawable((Drawable) recordControlsWidget.L0.getValue());
                recordControlsWidget.q0().setVisibility(0);
                recordControlsWidget.q0().setAlpha(1.0f);
                recordControlsWidget.q0().setScaleX(1.0f);
                recordControlsWidget.q0().setScaleY(1.0f);
                recordControlsWidget.l0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.l0().setVisibility(0);
                return;
            case 7:
                return;
            case 8:
                KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                recordControlsWidget.y0().setVisibility(0);
                recordControlsWidget.w0().setVisibility(0);
                recordControlsWidget.x0().setVisibility(0);
                recordControlsWidget.q0().setVisibility(8);
                AnimatorSet animatorSet = recordControlsWidget.f1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                recordControlsWidget.h0().setImageDrawable((Drawable) recordControlsWidget.L0.getValue());
                recordControlsWidget.q0().setVisibility(0);
                recordControlsWidget.y0().setVisibility(0);
                recordControlsWidget.w0().setVisibility(0);
                return;
            case 11:
                KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                recordControlsWidget.n0().setTranslationX(vo4.c().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.n0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.o0().setTranslationX(vo4.c().getDisplayMetrics().density * 72.0f);
                recordControlsWidget.o0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.m0().setTranslationX(vo4.c().getDisplayMetrics().density * 70.0f);
                recordControlsWidget.m0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.j0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.k0().setScaleX(1.0f);
                recordControlsWidget.k0().setScaleY(1.0f);
                recordControlsWidget.h0().setImageDrawable(recordControlsWidget.v0());
                recordControlsWidget.s0().setAlpha(c44.DEFAULT_ASPECT_RATIO);
                recordControlsWidget.s0().setVisibility(0);
                RecordControlsWidget.d0(recordControlsWidget).setVisibility(0);
                recordControlsWidget.k0().setVisibility(0);
                recordControlsWidget.A0().setVisibility(0);
                c33 c0 = RecordControlsWidget.c0(recordControlsWidget);
                if (c0 != null) {
                    ((MessageWriteWidget) c0).c0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
