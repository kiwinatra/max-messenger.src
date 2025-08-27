package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* renamed from: z5f  reason: default package */
public final class z5f implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6f b;

    public /* synthetic */ z5f(a6f a6f, float f, int i) {
        this.a = i;
        this.b = a6f;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        zx3 c0;
        switch (this.a) {
            case 0:
                a6f a6f = this.b;
                a6f.m = null;
                ViewGroup viewGroup = a6f.c;
                viewGroup.removeView(viewGroup.findViewById(mhc.swipe_fade));
                u5f u5f = this.b.q;
                if (u5f != null) {
                    SwipeWidget swipeWidget = (SwipeWidget) u5f;
                    i9d i9d = (i9d) CollectionsKt.lastOrNull(swipeWidget.getRouter().e());
                    if (!(i9d == null || (c0 = swipeWidget.c0()) == null)) {
                        SwipeWidget.g0(c0);
                        View view = c0.getView();
                        if (view != null) {
                            ey3 b2 = i9d.b();
                            if (b2 == null || b2.d()) {
                                if (view.getParent() != null) {
                                    String str = swipeWidget.a;
                                    a67 a67 = z68.b;
                                    if (a67 != null && a67.c()) {
                                        a67.d(w78.o, str, "clearUnderlyingViewsOnCancel: detaching underlying view", (Throwable) null);
                                    }
                                    ((ViewGroup) view.getParent()).removeView(view);
                                }
                                if (c0.getRetainViewMode() != yx3.b) {
                                    String str2 = swipeWidget.a;
                                    a67 a672 = z68.b;
                                    if (a672 != null && a672.c()) {
                                        a672.d(w78.o, str2, "clearUnderlyingViewsOnCancel: destroying underlying view", (Throwable) null);
                                    }
                                    Context context = swipeWidget.getContext();
                                    Method method = (Method) hy3.c.getValue((Object) null, hy3.a[1]);
                                    if (method != null) {
                                        method.invoke(c0, new Object[]{context});
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str3 = swipeWidget.a;
                                a67 a673 = z68.b;
                                if (a673 != null && a673.c()) {
                                    a673.d(w78.o, str3, "clearUnderlyingViewsOnCancel: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", (Throwable) null);
                                }
                            }
                        }
                    }
                    swipeWidget.d0();
                    return;
                }
                return;
            default:
                a6f a6f2 = this.b;
                View view2 = a6f2.b;
                h6f h6f = view2 instanceof h6f ? (h6f) view2 : null;
                if (h6f != null) {
                    h6f.setOnTouch((Function1) null);
                    h6f.setOnRequestInterceptTouchEvent((Function0) null);
                }
                ViewGroup viewGroup2 = a6f2.c;
                viewGroup2.removeView(a6f2.b);
                viewGroup2.removeView(viewGroup2.findViewById(mhc.swipe_fade));
                u5f u5f2 = a6f2.q;
                if (u5f2 != null) {
                    ((SwipeWidget) u5f2).getRouter().C();
                }
                a6f2.q = null;
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }
}
