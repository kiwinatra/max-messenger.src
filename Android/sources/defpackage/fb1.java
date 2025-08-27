package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: fb1  reason: default package */
public final class fb1 implements Function0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fb1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        AnimatorSet animatorSet = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                id1 id1 = id1.b;
                e91 e91 = (e91) ((v5a) obj2);
                String str = e91.b;
                ta4 W0 = id1.W0();
                W0.b(":call-join-link?link=" + str + "&video_enabled=" + e91.c + "&microphone_enabled=" + e91.d + "&front_camera_enabled=" + e91.e + "&is_new=false", (Bundle) null);
                KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = (CallJoinLinkPreviewWidget) obj;
                callJoinLinkPreviewWidget.getRouter().B(callJoinLinkPreviewWidget);
                return Unit.INSTANCE;
            case 1:
                q4 q4Var = (q4) obj;
                return new ct2((String) obj2, (u82) q4Var.g(u82.class), (gaf) q4Var.g(gaf.class));
            case 2:
                q4 q4Var2 = (q4) obj2;
                return new cu2((Context) q4Var2.g(Context.class), new ws2(0, (Lazy) obj), q4Var2.h(x23.class), q4Var2.h(bud.class), q4Var2.h(rtb.class), q4Var2.h(fq2.class), q4Var2.h(eq2.class));
            case 3:
                a47 a47 = (a47) obj;
                d47 d47 = (d47) obj2;
                try {
                    d47.b(this);
                    do {
                    } while (d47.a(false, this));
                    a47.a(1, 9, (IOException) null);
                } catch (IOException e) {
                    a47.a(2, 2, e);
                } catch (Throwable th) {
                    a47.a(3, 3, (IOException) null);
                    u0g.c(d47);
                    throw th;
                }
                u0g.c(d47);
                return Unit.INSTANCE;
            default:
                gwc gwc = (gwc) obj2;
                boolean z = gwc instanceof ewc;
                js9 js9 = fu4.k;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                if (z) {
                    ewc ewc = (ewc) gwc;
                    boolean z2 = ewc.b;
                    KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
                    if (!z2) {
                        recordControlsWidget.T0 = TuplesKt.to(Float.valueOf(recordControlsWidget.k0().getX()), Float.valueOf(recordControlsWidget.k0().getY()));
                        recordControlsWidget.U0 = TuplesKt.to(Float.valueOf(recordControlsWidget.s0().getTranslationX()), Float.valueOf(recordControlsWidget.s0().getTranslationY()));
                        recordControlsWidget.k0().setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                        recordControlsWidget.I0(true);
                        recordControlsWidget.Y0 = ev0.v(recordControlsWidget.getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new exc((Continuation) null, recordControlsWidget), 3);
                        recordControlsWidget.requireActivity().getWindow().addFlags(Uuid.SIZE_BITS);
                        View view = recordControlsWidget.getView();
                        if (view != null) {
                            b0h.K(view, qw6.CONFIRM);
                        }
                    } else {
                        recordControlsWidget.i0().setVisibility(0);
                        recordControlsWidget.J0();
                        if (!ewc.a) {
                            recordControlsWidget.G0();
                        } else {
                            AnimatorSet animatorSet2 = recordControlsWidget.b1;
                            if (animatorSet2 != null && animatorSet2.isRunning()) {
                                AnimatorSet animatorSet3 = recordControlsWidget.b1;
                                if (animatorSet3 != null) {
                                    animatorSet3.end();
                                }
                                AnimatorSet animatorSet4 = recordControlsWidget.b1;
                                if (animatorSet4 != null) {
                                    animatorSet4.cancel();
                                }
                            }
                            recordControlsWidget.b1 = new AnimatorSet();
                            List createListBuilder = CollectionsKt.createListBuilder();
                            createListBuilder.addAll(i8b.Q(recordControlsWidget.y0(), 1.0f, 0.5f, 150, 0));
                            ImageView y0 = recordControlsWidget.y0();
                            Property property = View.ALPHA;
                            createListBuilder.add(i8b.c(y0, property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                            createListBuilder.addAll(i8b.Q(recordControlsWidget.w0(), 0.5f, 1.0f, 150, 50));
                            createListBuilder.add(i8b.c(recordControlsWidget.w0(), property, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 50, 96));
                            createListBuilder.addAll(i8b.Q(recordControlsWidget.q0(), 0.5f, 1.0f, 150, 50));
                            createListBuilder.add(i8b.c(recordControlsWidget.q0(), property, 0.5f, 1.0f, 150, 50, 96));
                            createListBuilder.addAll(i8b.Q(recordControlsWidget.x0(), 1.0f, 0.5f, 150, 0));
                            createListBuilder.add(i8b.c(recordControlsWidget.x0(), property, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                            js9.f(recordControlsWidget.h0()).getText().getClass();
                            ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{-1, js9.f(recordControlsWidget.h0()).getText().e});
                            ofArgb.setDuration(150);
                            ofArgb.setStartDelay(50);
                            ofArgb.addUpdateListener(new qwc(recordControlsWidget, 4));
                            createListBuilder.add(ofArgb);
                            js9.f(recordControlsWidget.o0()).getIcon().getClass();
                            js9.f(recordControlsWidget.o0()).c().a.getClass();
                            ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{-16745729, i8b.Y(0.08f, -16745729)});
                            ofArgb2.setDuration(150);
                            ofArgb2.setStartDelay(50);
                            ofArgb2.addUpdateListener(new qwc(recordControlsWidget, 5));
                            createListBuilder.add(ofArgb2);
                            js9.f(recordControlsWidget.o0()).getIcon().getClass();
                            int Y = i8b.Y(0.5f, -1);
                            js9.f(recordControlsWidget.o0()).getIcon().getClass();
                            ValueAnimator ofArgb3 = ValueAnimator.ofArgb(new int[]{Y, i8b.Y(0.5f, -16745729)});
                            ofArgb3.setDuration(150);
                            ofArgb3.setStartDelay(50);
                            ofArgb3.addUpdateListener(new qwc(recordControlsWidget, 6));
                            createListBuilder.add(ofArgb3);
                            List build = CollectionsKt.build(createListBuilder);
                            AnimatorSet animatorSet5 = recordControlsWidget.b1;
                            if (animatorSet5 != null) {
                                animatorSet5.addListener(new wwc(recordControlsWidget, 10));
                            }
                            AnimatorSet animatorSet6 = recordControlsWidget.b1;
                            if (animatorSet6 != null) {
                                animatorSet6.addListener(new wwc(recordControlsWidget, 9));
                            }
                            AnimatorSet animatorSet7 = recordControlsWidget.b1;
                            if (animatorSet7 != null) {
                                animatorSet7.setInterpolator(recordControlsWidget.p0());
                            }
                            AnimatorSet animatorSet8 = recordControlsWidget.b1;
                            if (animatorSet8 != null) {
                                animatorSet8.playTogether(build);
                            }
                            AnimatorSet animatorSet9 = recordControlsWidget.b1;
                            if (animatorSet9 != null) {
                                animatorSet9.start();
                            }
                        }
                    }
                } else if (gwc instanceof fwc) {
                    fwc fwc = (fwc) gwc;
                    boolean z3 = fwc.a;
                    KProperty[] kPropertyArr3 = RecordControlsWidget.g1;
                    c80 F0 = recordControlsWidget.F0();
                    F0.x0.reset();
                    F0.v = null;
                    F0.z0 = null;
                    F0.y0 = null;
                    F0.y = false;
                    js9 js92 = js9;
                    F0.A0 = 0;
                    F0.w = 0;
                    F0.invalidate();
                    recordControlsWidget.V0 = c44.DEFAULT_ASPECT_RATIO;
                    recordControlsWidget.J0();
                    recordControlsWidget.requireActivity().getWindow().clearFlags(Uuid.SIZE_BITS);
                    if (z3) {
                        AnimatorSet animatorSet10 = recordControlsWidget.b1;
                        if (animatorSet10 != null && animatorSet10.isRunning()) {
                            AnimatorSet animatorSet11 = recordControlsWidget.b1;
                            if (animatorSet11 != null) {
                                animatorSet11.end();
                            }
                            AnimatorSet animatorSet12 = recordControlsWidget.b1;
                            if (animatorSet12 != null) {
                                animatorSet12.cancel();
                            }
                        }
                        recordControlsWidget.b1 = new AnimatorSet();
                        List createListBuilder2 = CollectionsKt.createListBuilder();
                        KProperty kProperty = RecordControlsWidget.g1[9];
                        Property property2 = View.ALPHA;
                        createListBuilder2.add(i8b.c((View) recordControlsWidget.v0.getValue(recordControlsWidget, kProperty), property2, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                        if (recordControlsWidget.w0().getVisibility() == 0) {
                            createListBuilder2.addAll(i8b.Q(recordControlsWidget.w0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0));
                            createListBuilder2.add(i8b.c(recordControlsWidget.w0(), property2, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                        } else {
                            createListBuilder2.addAll(i8b.Q(recordControlsWidget.y0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0));
                            createListBuilder2.add(i8b.c(recordControlsWidget.y0(), property2, 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0, 112));
                        }
                        createListBuilder2.addAll(i8b.Q(recordControlsWidget.z0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0));
                        Property property3 = property2;
                        createListBuilder2.add(i8b.c(recordControlsWidget.z0(), property3, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                        createListBuilder2.add(i8b.c(recordControlsWidget.l0(), property3, 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0, 112));
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{MathKt.roundToInt(((float) 96) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density)});
                        ofInt.setDuration(300);
                        ofInt.addUpdateListener(new qwc(recordControlsWidget, 3));
                        createListBuilder2.add(ofInt);
                        createListBuilder2.addAll(i8b.Q(recordControlsWidget.k0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 250, 0));
                        createListBuilder2.add(i8b.c(recordControlsWidget.k0(), property2, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                        List build2 = CollectionsKt.build(createListBuilder2);
                        AnimatorSet animatorSet13 = recordControlsWidget.b1;
                        if (animatorSet13 != null) {
                            animatorSet13.addListener(new wwc(recordControlsWidget, 4));
                        }
                        AnimatorSet animatorSet14 = recordControlsWidget.b1;
                        if (animatorSet14 != null) {
                            animatorSet14.playTogether(build2);
                        }
                        ob9 u0 = recordControlsWidget.u0();
                        if (u0 != null) {
                            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) u0;
                            if (messageWriteWidget.getView() != null) {
                                dc9 d0 = messageWriteWidget.d0();
                                d0.getClass();
                                animatorSet = new AnimatorSet();
                                List createListBuilder3 = CollectionsKt.createListBuilder();
                                createListBuilder3.add(i8b.c(d0.c, property2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 0, 112));
                                ImageView imageView = d0.b;
                                createListBuilder3.addAll(i8b.Q(imageView, c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 0));
                                createListBuilder3.add(i8b.c(imageView, property2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 0, 112));
                                Lazy lazy = d0.v;
                                if (lazy.isInitialized()) {
                                    createListBuilder3.addAll(i8b.Q((View) lazy.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 0));
                                    createListBuilder3.add(i8b.c((View) lazy.getValue(), property2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 50, 96));
                                }
                                Lazy lazy2 = d0.z;
                                if (lazy2.isInitialized()) {
                                    createListBuilder3.addAll(i8b.Q((View) lazy2.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 0));
                                    createListBuilder3.add(i8b.c((View) lazy2.getValue(), property2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 50, 96));
                                }
                                ImageView imageView2 = d0.y;
                                createListBuilder3.addAll(i8b.Q(imageView2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 0));
                                createListBuilder3.add(i8b.c(imageView2, property2, c44.DEFAULT_ASPECT_RATIO, 1.0f, 250, 0, 112));
                                List build3 = CollectionsKt.build(createListBuilder3);
                                animatorSet.addListener(new cc9(d0, 5));
                                animatorSet.addListener(new cc9(d0, 4));
                                animatorSet.playTogether(build3);
                            }
                        }
                        AnimatorSet animatorSet15 = recordControlsWidget.b1;
                        if (animatorSet15 != null) {
                            animatorSet15.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet16 = recordControlsWidget.b1;
                        if (animatorSet16 != null) {
                            animatorSet16.setInterpolator(recordControlsWidget.p0());
                        }
                        AnimatorSet animatorSet17 = recordControlsWidget.b1;
                        if (animatorSet17 != null) {
                            animatorSet17.start();
                        }
                    } else if (fwc.b) {
                        View view2 = recordControlsWidget.getView();
                        if (view2 != null) {
                            b0h.K(view2, qw6.CONFIRM);
                        }
                        AnimatorSet animatorSet18 = recordControlsWidget.b1;
                        if (animatorSet18 != null && animatorSet18.isRunning()) {
                            AnimatorSet animatorSet19 = recordControlsWidget.b1;
                            if (animatorSet19 != null) {
                                animatorSet19.end();
                            }
                            AnimatorSet animatorSet20 = recordControlsWidget.b1;
                            if (animatorSet20 != null) {
                                animatorSet20.cancel();
                            }
                        }
                        AnimatorSet animatorSet21 = recordControlsWidget.e1;
                        if (animatorSet21 != null) {
                            animatorSet21.cancel();
                        }
                        recordControlsWidget.b1 = new AnimatorSet();
                        List createListBuilder4 = CollectionsKt.createListBuilder();
                        View n0 = recordControlsWidget.n0();
                        Property property4 = View.ALPHA;
                        ObjectAnimator c2 = i8b.c(n0, property4, recordControlsWidget.n0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 150, 100, 96);
                        c2.addListener(new wwc(recordControlsWidget, 3));
                        createListBuilder4.add(c2);
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.B0(), c44.DEFAULT_ASPECT_RATIO, 1.4f, 200, 250));
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.B0(), 1.4f, 0.7f, 100, 450));
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.B0(), 0.7f, 1.0f, 100, 550));
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.B0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 700));
                        Property property5 = property4;
                        createListBuilder4.add(i8b.c(recordControlsWidget.B0(), property5, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 700, 96));
                        createListBuilder4.add(i8b.c(recordControlsWidget.m0(), property5, recordControlsWidget.m0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 200, 0, 112));
                        if (recordControlsWidget.m0().getTranslationX() == c44.DEFAULT_ASPECT_RATIO) {
                            createListBuilder4.add(i8b.c(recordControlsWidget.m0(), View.TRANSLATION_X, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * -20.0f, 200, 0, 112));
                        }
                        createListBuilder4.add(i8b.c(recordControlsWidget.o0(), property4, 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 100, 96));
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.k0(), recordControlsWidget.k0().getScaleX(), 0.4f, 150, 0));
                        createListBuilder4.add(i8b.c(recordControlsWidget.k0(), property4, 1.0f, c44.DEFAULT_ASPECT_RATIO, 150, 0, 112));
                        createListBuilder4.addAll(i8b.Q(recordControlsWidget.s0(), 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 100));
                        createListBuilder4.add(i8b.c(recordControlsWidget.s0(), property4, 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 100, 96));
                        List build4 = CollectionsKt.build(createListBuilder4);
                        AnimatorSet animatorSet22 = recordControlsWidget.b1;
                        if (animatorSet22 != null) {
                            animatorSet22.addListener(new wwc(recordControlsWidget, 2));
                        }
                        AnimatorSet animatorSet23 = recordControlsWidget.b1;
                        if (animatorSet23 != null) {
                            animatorSet23.addListener(new wwc(recordControlsWidget, 1));
                        }
                        AnimatorSet animatorSet24 = recordControlsWidget.b1;
                        if (animatorSet24 != null) {
                            animatorSet24.playTogether(build4);
                        }
                        ob9 u02 = recordControlsWidget.u0();
                        if (u02 != null) {
                            MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) u02;
                            if (messageWriteWidget2.getView() != null) {
                                dc9 d02 = messageWriteWidget2.d0();
                                d02.getClass();
                                animatorSet = new AnimatorSet();
                                List createListBuilder5 = CollectionsKt.createListBuilder();
                                createListBuilder5.add(i8b.c(d02.c, View.TRANSLATION_X, vo4.c().getDisplayMetrics().density * 44.0f, c44.DEFAULT_ASPECT_RATIO, 300, 250, 96));
                                Property property6 = property4;
                                createListBuilder5.add(i8b.c(d02.c, property6, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250, 96));
                                ImageView imageView3 = d02.b;
                                createListBuilder5.add(i8b.c(imageView3, property6, c44.DEFAULT_ASPECT_RATIO, 1.0f, 150, 850, 96));
                                createListBuilder5.addAll(i8b.Q(imageView3, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 700));
                                ImageView imageView4 = d02.y;
                                createListBuilder5.add(i8b.c(imageView4, property4, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 350, 96));
                                createListBuilder5.addAll(i8b.Q(imageView4, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                Lazy lazy3 = d02.v;
                                if (lazy3.isInitialized()) {
                                    createListBuilder5.add(i8b.c((View) lazy3.getValue(), property4, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 350, 96));
                                    createListBuilder5.addAll(i8b.Q((View) lazy3.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                }
                                Lazy lazy4 = d02.z;
                                if (lazy4.isInitialized()) {
                                    createListBuilder5.add(i8b.c((View) lazy4.getValue(), property4, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 350, 96));
                                    createListBuilder5.addAll(i8b.Q((View) lazy4.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                }
                                List build5 = CollectionsKt.build(createListBuilder5);
                                animatorSet.addListener(new cc9(d02, 3));
                                animatorSet.addListener(new cc9(d02, 2));
                                animatorSet.playTogether(build5);
                            }
                        }
                        AnimatorSet animatorSet25 = recordControlsWidget.b1;
                        if (animatorSet25 != null) {
                            animatorSet25.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet26 = recordControlsWidget.b1;
                        if (animatorSet26 != null) {
                            animatorSet26.setInterpolator(recordControlsWidget.p0());
                        }
                        AnimatorSet animatorSet27 = recordControlsWidget.b1;
                        if (animatorSet27 != null) {
                            animatorSet27.start();
                        }
                    } else {
                        AnimatorSet animatorSet28 = recordControlsWidget.b1;
                        if (animatorSet28 != null && animatorSet28.isRunning()) {
                            AnimatorSet animatorSet29 = recordControlsWidget.b1;
                            if (animatorSet29 != null) {
                                animatorSet29.end();
                            }
                            AnimatorSet animatorSet30 = recordControlsWidget.b1;
                            if (animatorSet30 != null) {
                                animatorSet30.cancel();
                            }
                        }
                        AnimatorSet animatorSet31 = recordControlsWidget.e1;
                        if (animatorSet31 != null) {
                            animatorSet31.cancel();
                        }
                        recordControlsWidget.b1 = new AnimatorSet();
                        List createListBuilder6 = CollectionsKt.createListBuilder();
                        View n02 = recordControlsWidget.n0();
                        Property property7 = View.ALPHA;
                        createListBuilder6.add(i8b.c(n02, property7, recordControlsWidget.n0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 300, 100, 96));
                        View n03 = recordControlsWidget.n0();
                        Property property8 = View.TRANSLATION_X;
                        createListBuilder6.add(i8b.c(n03, property8, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 72.0f, 300, 100, 96));
                        createListBuilder6.add(i8b.c(recordControlsWidget.o0(), property7, 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 100, 96));
                        createListBuilder6.add(i8b.c(recordControlsWidget.o0(), property8, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 72.0f, 300, 100, 96));
                        createListBuilder6.add(i8b.c(recordControlsWidget.m0(), property7, recordControlsWidget.m0().getAlpha(), c44.DEFAULT_ASPECT_RATIO, 250, 0, 112));
                        if (recordControlsWidget.m0().getTranslationX() == c44.DEFAULT_ASPECT_RATIO) {
                            createListBuilder6.add(i8b.c(recordControlsWidget.m0(), property8, c44.DEFAULT_ASPECT_RATIO, vo4.c().getDisplayMetrics().density * 70.0f, 300, 50, 96));
                        }
                        createListBuilder6.addAll(i8b.Q(recordControlsWidget.j0(), recordControlsWidget.j0().getScaleX(), c44.DEFAULT_ASPECT_RATIO, 300, 150));
                        createListBuilder6.add(i8b.c(recordControlsWidget.k0(), property7, 1.0f, c44.DEFAULT_ASPECT_RATIO, 300, 150, 96));
                        js9 js93 = js92;
                        js93.f(recordControlsWidget.h0()).a().l().e.getClass();
                        ValueAnimator ofArgb4 = ValueAnimator.ofArgb(new int[]{-1, js93.f(recordControlsWidget.h0()).a().l().e.g});
                        ofArgb4.setStartDelay(100);
                        ofArgb4.setDuration(300);
                        ofArgb4.addUpdateListener(new qwc(recordControlsWidget, 0));
                        createListBuilder6.add(ofArgb4);
                        createListBuilder6.add(i8b.c(recordControlsWidget.s0(), View.TRANSLATION_Y, recordControlsWidget.s0().getTranslationY(), ((float) -48) - (vo4.c().getDisplayMetrics().density * 2.0f), 200, 50, 96));
                        createListBuilder6.add(i8b.c(recordControlsWidget.s0(), property7, 1.0f, c44.DEFAULT_ASPECT_RATIO, 200, 0, 112));
                        List build6 = CollectionsKt.build(createListBuilder6);
                        AnimatorSet animatorSet32 = recordControlsWidget.b1;
                        if (animatorSet32 != null) {
                            animatorSet32.addListener(new wwc(recordControlsWidget, 0));
                        }
                        AnimatorSet animatorSet33 = recordControlsWidget.b1;
                        if (animatorSet33 != null) {
                            animatorSet33.playTogether(build6);
                        }
                        ob9 u03 = recordControlsWidget.u0();
                        if (u03 != null) {
                            MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) u03;
                            if (messageWriteWidget3.getView() != null) {
                                dc9 d03 = messageWriteWidget3.d0();
                                d03.getClass();
                                animatorSet = new AnimatorSet();
                                List createListBuilder7 = CollectionsKt.createListBuilder();
                                createListBuilder7.add(i8b.c(d03.c, property8, vo4.c().getDisplayMetrics().density * -74.0f, c44.DEFAULT_ASPECT_RATIO, 300, 250, 96));
                                createListBuilder7.add(i8b.c(d03.c, property7, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250, 96));
                                ImageView imageView5 = d03.b;
                                createListBuilder7.add(i8b.c(imageView5, property8, vo4.c().getDisplayMetrics().density * -74.0f, c44.DEFAULT_ASPECT_RATIO, 300, 250, 96));
                                Property property9 = property7;
                                createListBuilder7.add(i8b.c(imageView5, property9, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250, 96));
                                ImageView imageView6 = d03.y;
                                createListBuilder7.add(i8b.c(imageView6, property9, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 250, 96));
                                createListBuilder7.addAll(i8b.Q(imageView6, c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                Lazy lazy5 = d03.v;
                                if (lazy5.isInitialized()) {
                                    createListBuilder7.add(i8b.c((View) lazy5.getValue(), property7, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 250, 96));
                                    createListBuilder7.addAll(i8b.Q((View) lazy5.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                }
                                Lazy lazy6 = d03.z;
                                if (lazy6.isInitialized()) {
                                    createListBuilder7.add(i8b.c((View) lazy6.getValue(), property7, c44.DEFAULT_ASPECT_RATIO, 1.0f, 200, 250, 96));
                                    createListBuilder7.addAll(i8b.Q((View) lazy6.getValue(), c44.DEFAULT_ASPECT_RATIO, 1.0f, 300, 250));
                                }
                                List build7 = CollectionsKt.build(createListBuilder7);
                                animatorSet.addListener(new cc9(d03, 1));
                                animatorSet.addListener(new cc9(d03, 0));
                                animatorSet.playTogether(build7);
                            }
                        }
                        AnimatorSet animatorSet34 = recordControlsWidget.b1;
                        if (animatorSet34 != null) {
                            animatorSet34.playTogether(new Animator[]{animatorSet});
                        }
                        AnimatorSet animatorSet35 = recordControlsWidget.b1;
                        if (animatorSet35 != null) {
                            animatorSet35.setInterpolator(recordControlsWidget.p0());
                        }
                        AnimatorSet animatorSet36 = recordControlsWidget.b1;
                        if (animatorSet36 != null) {
                            animatorSet36.start();
                        }
                    }
                } else if (gwc instanceof dwc) {
                    boolean z4 = ((dwc) gwc).a;
                    KProperty[] kPropertyArr4 = RecordControlsWidget.g1;
                    if (!z4) {
                        recordControlsWidget.H0();
                    } else {
                        recordControlsWidget.I0(false);
                        AnimatorSet animatorSet37 = recordControlsWidget.b1;
                        if (animatorSet37 != null) {
                            animatorSet37.end();
                        }
                        recordControlsWidget.G0();
                        AnimatorSet animatorSet38 = recordControlsWidget.b1;
                        if (animatorSet38 != null) {
                            animatorSet38.end();
                        }
                        recordControlsWidget.H0();
                        AnimatorSet animatorSet39 = recordControlsWidget.b1;
                        if (animatorSet39 != null) {
                            animatorSet39.end();
                        }
                        recordControlsWidget.J0();
                        c80 F02 = recordControlsWidget.F0();
                        if (!F02.isLaidOut() || F02.isLayoutRequested()) {
                            F02.addOnLayoutChangeListener(new dr0(14, recordControlsWidget));
                        } else {
                            recordControlsWidget.K0();
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
        }
    }

    public fb1(a47 a47, d47 d47) {
        this.a = 3;
        this.c = a47;
        this.b = d47;
    }
}
