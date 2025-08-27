package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.calls.ui.ui.pip.PipScreen;

/* renamed from: k81  reason: default package */
public final class k81 implements dy3 {
    public final /* synthetic */ o81 a;

    public k81(o81 o81) {
        this.a = o81;
    }

    public final void a(zx3 zx3, zx3 zx32, boolean z) {
        une une;
        boolean z2;
        zx3 zx33 = zx3;
        zx3 zx34 = zx32;
        boolean z3 = false;
        o81 o81 = this.a;
        if (zx33 != null) {
            ki1 ki1 = (ki1) o81.w.getValue();
            boolean g = o81.g(zx3);
            boolean a2 = ki1.a();
            o81 o812 = ki1.a;
            if (g) {
                o81.e(o812);
                if (a2) {
                    o812.f(true);
                } else {
                    Activity activity = o812.x;
                    if (activity != null) {
                        boolean y = qra.a.z().e().y();
                        z68.c("PipAppController", "try to hide call indicator hasCall=" + o812.a(), new Object[0]);
                        if (y) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                            if (childAt != null) {
                                String name = fu4.k.e(childAt.getContext()).f().getName();
                                l2b l2b = l2b.a;
                                if (Intrinsics.areEqual((Object) name, (Object) "one.me.sdk.design.OneMeThemeDark")) {
                                    z2 = true;
                                    kne.k(activity, z2);
                                }
                            }
                            z2 = false;
                            kne.k(activity, z2);
                        }
                    }
                }
            } else if (a2) {
                Activity activity2 = o812.x;
                if (activity2 != null) {
                    ((ng5) o812.b).e(activity2, o81.c());
                }
            } else {
                Activity activity3 = o812.x;
                if (activity3 != null) {
                    boolean a3 = o812.a();
                    i9d i9d = (i9d) CollectionsKt.lastOrNull(o81.c().e());
                    zx3 zx35 = i9d != null ? i9d.a : null;
                    boolean z4 = !(o81.g(zx35) || zx35 == null);
                    z68.c("PipAppController", "try to show call indicator hasCall=" + a3 + " canShow=" + z4 + ".", new Object[0]);
                    if (z4 && a3 && qra.a.z().e().j(new CallIndicatorWidget())) {
                        kne.k(activity3, true);
                    }
                    if (!a3) {
                        z68.c("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                        o812.f(true);
                    }
                }
            }
        }
        boolean z5 = zx33 instanceof PipScreen;
        if (z5 && !(zx34 instanceof PipScreen)) {
            String str = ((mp1) o81.a).j().c;
            vne vne = (vne) ((nf1) o81.y.getValue());
            xme xme = vne.a;
            Object value = xme.getValue();
            une une2 = une.b;
            if (value != une2) {
                tq1 tq1 = (tq1) vne.c.getValue();
                tq1.getClass();
                une = une2;
                tq1.a(tq1, "PIP_ENABLED", str, (String) null, 1, (String) null, (String) null, false, 116);
            } else {
                une = une2;
            }
            xme.m((Object) null, une);
        }
        boolean z6 = zx34 instanceof PipScreen;
        if (z6 && !z5) {
            String str2 = ((mp1) o81.a).j().c;
            vne vne2 = (vne) ((nf1) o81.y.getValue());
            xme xme2 = vne2.a;
            if (xme2.getValue() == une.b) {
                tq1 tq12 = (tq1) vne2.c.getValue();
                tq12.getClass();
                tq1.a(tq12, "PIP_ENABLED", str2, (String) null, 0, (String) null, (String) null, false, 116);
            }
            xme2.m((Object) null, une.a);
        }
        if (!z6 || zx33 != null) {
            o81.getClass();
            if (o81.g(zx32) || zx34 == null) {
                if (((mp1) o81.a).p() && ((ki1) o81.w.getValue()).a()) {
                    z3 = true;
                }
                o81.Y = z3;
                return;
            }
            return;
        }
        z68.c("PipAppController", "pip screen was hidden quietly, skip hide fake pip.", new Object[0]);
    }

    public final void b(zx3 zx3, zx3 zx32, boolean z) {
        o81 o81 = this.a;
        if (zx3 != null) {
            ki1 ki1 = (ki1) o81.w.getValue();
            boolean g = o81.g(zx3);
            boolean a2 = ki1.a();
            boolean z2 = true;
            o81 o812 = ki1.a;
            if (g) {
                o812.f(true);
                o81.e(o812);
            } else {
                o812.h(false);
                if (a2) {
                    Activity activity = o812.x;
                    yg5 yg5 = o812.b;
                    if (activity != null) {
                        ((ng5) yg5).e(activity, o81.c());
                    }
                    Activity activity2 = o812.x;
                    if (activity2 != null && o812.Y) {
                        e9d c = o81.c();
                        ng5 ng5 = (ng5) yg5;
                        ng5.getClass();
                        z68.c("FakePipController", "try to show local pip", new Object[0]);
                        rf1 rf1 = ng5.g;
                        if (!Intrinsics.areEqual(rf1 != null ? Float.valueOf(rf1.getAlpha()) : null, 1.0f) || !y7e.F(rf1)) {
                            ng5.e(activity2, c);
                            if (rf1 != null) {
                                rf1.setVisibility(8);
                            }
                            String str = ((mp1) ((dp1) ng5.e.getValue())).j().c;
                            vne vne = (vne) ((nf1) ng5.a.getValue());
                            xme xme = vne.a;
                            Object value = xme.getValue();
                            une une = une.b;
                            if (value != une) {
                                tq1 tq1 = (tq1) vne.c.getValue();
                                tq1.getClass();
                                tq1.a(tq1, "PIP_ENABLED", str, (String) null, 1, (String) null, (String) null, false, 116);
                            }
                            xme.m((Object) null, une);
                            if (rf1 != null) {
                                y7e.k(rf1, true, 0, (Function1) null, 4);
                            }
                        } else {
                            z68.c("FakePipController", "local pip already in show progress", new Object[0]);
                        }
                        if (o81.c().e().size() >= 2) {
                            z2 = false;
                        }
                        o812.w0.f(z2);
                    }
                } else {
                    o81.e(o812);
                }
            }
        }
        o81.k();
    }
}
