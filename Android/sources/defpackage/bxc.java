package defpackage;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: bxc  reason: default package */
public final class bxc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bxc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bxc bxc = new bxc(continuation, this.b);
        bxc.a = obj;
        return bxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bxc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AnimatorSet animatorSet;
        Pair pair;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MotionEvent motionEvent = (MotionEvent) this.a;
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.b;
        gwc gwc = (gwc) recordControlsWidget.D0().v0.a.getValue();
        float x = recordControlsWidget.k0().getX();
        float f = c44.DEFAULT_ASPECT_RATIO;
        if (x != c44.DEFAULT_ASPECT_RATIO && !(gwc instanceof fwc) && (((animatorSet = recordControlsWidget.b1) == null || !animatorSet.isRunning()) && (pair = recordControlsWidget.T0) != null)) {
            Float f2 = (Float) pair.getFirst();
            Pair pair2 = recordControlsWidget.T0;
            Float f3 = pair2 != null ? (Float) pair2.getSecond() : null;
            if (!(motionEvent.getAction() != 2 || f2 == null || f3 == null)) {
                float rawX = motionEvent.getRawX() - ((float) (recordControlsWidget.k0().getWidth() / 2));
                float y = motionEvent.getY() - ((float) (recordControlsWidget.k0().getWidth() / 2));
                double degrees = Math.toDegrees((double) ((float) Math.atan2((double) (-(y - f3.floatValue())), (double) (rawX - f2.floatValue()))));
                if (degrees < 0.0d) {
                    degrees += (double) 360;
                }
                int roundToInt = MathKt.roundToInt(Math.ceil(degrees));
                if (RecordControlsWidget.h1.contains(roundToInt)) {
                    recordControlsWidget.V0 = c44.DEFAULT_ASPECT_RATIO;
                    if (RangesKt.coerceIn((y - f3.floatValue()) / ((f3.floatValue() - ((float) MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density))) - f3.floatValue()), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f) * 100.0f >= 100.0f) {
                        xme xme = recordControlsWidget.D0().Z;
                        gwc gwc2 = (gwc) xme.getValue();
                        if (gwc2 instanceof ewc) {
                            xme.m((Object) null, new ewc(((ewc) gwc2).a, true));
                        }
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            b0h.K(view, qw6.CONFIRM);
                        }
                    } else {
                        if (f3.floatValue() - y > ((float) MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density))) {
                            AnimatorSet animatorSet2 = recordControlsWidget.d1;
                            if (animatorSet2 != null) {
                                animatorSet2.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet3 = recordControlsWidget.d1;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                        }
                        ohe ohe = recordControlsWidget.X0;
                        if (ohe != null) {
                            ohe.b();
                        }
                        View s0 = recordControlsWidget.s0();
                        Pair pair3 = recordControlsWidget.U0;
                        s0.setTranslationX(pair3 != null ? ((Number) pair3.getFirst()).floatValue() : 0.0f);
                        View s02 = recordControlsWidget.s0();
                        Pair pair4 = recordControlsWidget.U0;
                        if (pair4 != null) {
                            f = ((Number) pair4.getSecond()).floatValue();
                        }
                        s02.setTranslationY(recordControlsWidget.k0().getTranslationY() + f);
                        recordControlsWidget.k0().setX(f2.floatValue());
                        recordControlsWidget.k0().setY(y);
                    }
                } else if (RecordControlsWidget.i1.contains(roundToInt)) {
                    Pair pair5 = recordControlsWidget.T0;
                    float floatValue = pair5 != null ? ((Number) pair5.getFirst()).floatValue() : 0.0f;
                    float f4 = (float) 40;
                    float coerceIn = RangesKt.coerceIn((rawX - (floatValue - ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4)))) / ((floatValue - ((float) MathKt.roundToInt(((float) 90) * vo4.c().getDisplayMetrics().density))) - floatValue), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f) * 100.0f;
                    recordControlsWidget.V0 = coerceIn;
                    if (coerceIn >= 100.0f) {
                        pwc D0 = recordControlsWidget.D0();
                        D0.w();
                        fwc fwc = new fwc(1, false, true);
                        xme xme2 = D0.Z;
                        xme2.getClass();
                        xme2.m((Object) null, fwc);
                    } else {
                        if (floatValue - rawX > ((float) MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density))) {
                            AnimatorSet animatorSet4 = recordControlsWidget.c1;
                            if (animatorSet4 != null) {
                                animatorSet4.cancel();
                            }
                            AnimatorSet animatorSet5 = recordControlsWidget.d1;
                            if (animatorSet5 != null) {
                                animatorSet5.cancel();
                            }
                        } else {
                            AnimatorSet animatorSet6 = recordControlsWidget.c1;
                            if (animatorSet6 != null) {
                                animatorSet6.start();
                            }
                            AnimatorSet animatorSet7 = recordControlsWidget.d1;
                            if (animatorSet7 != null) {
                                animatorSet7.start();
                            }
                        }
                        float f5 = (float) 84;
                        float e = (((recordControlsWidget.V0 / 100.0f) * ((float) a81.e(f5, vo4.c().getDisplayMetrics().density, MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density)))) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5))) / ((float) MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
                        recordControlsWidget.k0().setScaleX(e);
                        recordControlsWidget.k0().setScaleY(e);
                        ohe ohe2 = recordControlsWidget.X0;
                        if (ohe2 != null) {
                            ohe2.a(motionEvent.getRawX() + ((float) (-recordControlsWidget.A0().getWidth())) + ((float) (MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4) / 2)));
                        }
                        View s03 = recordControlsWidget.s0();
                        Pair pair6 = recordControlsWidget.U0;
                        s03.setTranslationY(pair6 != null ? ((Number) pair6.getSecond()).floatValue() : 0.0f);
                        float roundToInt2 = floatValue - ((float) MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
                        float coerceIn2 = RangesKt.coerceIn((rawX - roundToInt2) / ((floatValue - ((float) MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density))) - roundToInt2), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f);
                        float roundToInt3 = ((float) MathKt.roundToInt(((float) -20) * vo4.c().getDisplayMetrics().density)) * coerceIn2;
                        recordControlsWidget.m0().setAlpha(1.0f - coerceIn2);
                        recordControlsWidget.m0().setTranslationX(roundToInt3);
                        recordControlsWidget.k0().setX(rawX);
                        recordControlsWidget.k0().setY(f3.floatValue());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
