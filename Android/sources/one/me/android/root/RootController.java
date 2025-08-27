package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Ll9d;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRootController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootController.kt\none/me/android/root/RootController\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,433:1\n156#1,8:435\n171#1,12:443\n151#1,13:455\n166#1,17:468\n347#2:434\n256#2,2:489\n256#2,2:491\n347#2:495\n326#2,4:496\n254#2:502\n254#2:503\n28#3:485\n24#3:486\n24#3:487\n24#3:488\n28#3:493\n24#3:494\n28#3:500\n28#3:501\n24#3:504\n*S KotlinDebug\n*F\n+ 1 RootController.kt\none/me/android/root/RootController\n*L\n106#1:435,8\n119#1:443,12\n131#1:455,13\n142#1:468,17\n103#1:434\n350#1:489,2\n358#1:491,2\n370#1:495\n373#1:496,4\n417#1:502\n420#1:503\n229#1:485\n233#1:486\n237#1:487\n241#1:488\n359#1:493\n369#1:494\n383#1:500\n385#1:501\n65#1:504\n*E\n"})
public final class RootController extends Widget implements l9d {
    public static final /* synthetic */ KProperty[] z;
    public final Lazy a = oh1.a.c();
    public AnimatorSet b;
    public final sn0 c = binding(new u7d(this, 0));
    public final sn0 o = binding(new u7d(this, 1));
    public final ReadWriteProperty v;
    public final ReadWriteProperty w;
    public final ReadWriteProperty x;
    public final w5 y;

    static {
        Class<RootController> cls = RootController.class;
        z = new KProperty[]{wj6.p(cls, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), wj6.p(cls, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), rae.s(cls, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;", 0), rae.s(cls, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;", 0), rae.s(cls, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    }

    public RootController() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        Delegates delegates = Delegates.INSTANCE;
        this.v = delegates.notNull();
        this.w = delegates.notNull();
        this.x = delegates.notNull();
        this.y = new w5(2, this);
    }

    public static final boolean c0(RootController rootController, oz1 oz1) {
        rootController.getClass();
        Object tag = oz1.getTag(qqa.c);
        boolean areEqual = Intrinsics.areEqual(tag, (Object) "SHOW_ANIMATION_TAG");
        boolean areEqual2 = Intrinsics.areEqual(tag, (Object) "HIDE_ANIMATION_TAG");
        if (tag == null) {
            if (oz1.getVisibility() != 0) {
                return false;
            }
        } else if (!areEqual && (areEqual2 || oz1.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static final void d0(RootController rootController, boolean z2) {
        if (z2) {
            if (rootController.k0().getTranslationY() == vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO) {
                return;
            }
        } else if (rootController.k0().getTranslationY() == (-(vo4.c().getDisplayMetrics().density * 100.0f))) {
            return;
        }
        z68.c("RootController", "validateStateIsNeeded for isVisible=" + z2 + ".", new Object[0]);
        rootController.h0(z2);
    }

    public final e9d K() {
        return (e9d) this.w.getValue(this, z[3]);
    }

    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z2) {
        if (!j0().n() || !c0(this, k0())) {
            z68.c("RootController", "showTopController show call indicator force=" + z2 + ".", new Object[0]);
            f0(true, z2, callIndicatorWidget);
            return true;
        }
        d0(this, true);
        z68.c("RootController", "showTopController call indicator already shown.", new Object[0]);
        return false;
    }

    public final void e0(boolean z2, zx3 zx3) {
        String str = z2 ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z2 && !j0().n() && zx3 != null) {
            j0().R(iq.n(zx3, (ey3) null, (ey3) null));
        }
        k0().setTag(qqa.c, str);
        k0().setVisibility(0);
    }

    public final void f0(boolean z2, boolean z3, zx3 zx3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        e0(z2, zx3);
        animatorSet3.setDuration(z3 ? 0 : 250);
        int i = ((wgd) ((c91) ((b91) this.a.getValue())).c.getValue()).c;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (z2) {
            createListBuilder.add(ObjectAnimator.ofFloat(k0(), View.Y, new float[]{k0().getY(), vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO}));
            oz1 i0 = i0();
            float y2 = i0().getY();
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y2, (i0().getY() + ((float) MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density))) - ((float) i)})});
            ofPropertyValuesHolder.addUpdateListener(new v7d(y2, i0));
            createListBuilder.add(ofPropertyValuesHolder);
        } else {
            float f = (float) 100;
            createListBuilder.add(ObjectAnimator.ofFloat(k0(), View.Y, new float[]{k0().getY(), -((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f))}));
            oz1 i02 = i0();
            float y3 = i0().getY();
            ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("topMarginProp", new float[]{y3, (i0().getY() - ((float) MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density))) + ((float) i)})});
            ofPropertyValuesHolder2.addUpdateListener(new v7d(y3, i02));
            createListBuilder.add(ofPropertyValuesHolder2);
        }
        animatorSet3.playTogether(CollectionsKt.build(createListBuilder));
        animatorSet3.addListener(new yy3(this, z2, 4));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void g0(boolean z2, zx3 zx3) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.b) == null)) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        e0(z2, zx3);
        View findViewById = k0().findViewById(qqa.A);
        oi1 oi1 = findViewById instanceof oi1 ? (oi1) findViewById : null;
        animatorSet3.setDuration(250);
        List createListBuilder = CollectionsKt.createListBuilder();
        if (oi1 != null) {
            oi1.C(animatorSet3.getDuration(), createListBuilder, z2);
        }
        animatorSet3.playTogether(CollectionsKt.build(createListBuilder));
        animatorSet3.addListener(new dg5(oi1, z2, this));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void h0(boolean z2) {
        View findViewById = k0().findViewById(qqa.A);
        oi1 oi1 = findViewById instanceof oi1 ? (oi1) findViewById : null;
        if (oi1 != null) {
            oi1.a(z2);
        }
        k0().setTag(qqa.c, (Object) null);
        k0().setVisibility(z2 ? 0 : 8);
        k0().setTranslationY(z2 ? vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO : -(vo4.c().getDisplayMetrics().density * 100.0f));
        l0(z2);
        if (!z2 && j0().n()) {
            j0().C();
            z68.c("RootController", "call indicator was destroyed", new Object[0]);
        }
    }

    public final oz1 i0() {
        KProperty kProperty = z[0];
        return (oz1) this.c.getValue();
    }

    public final boolean j(CallIndicatorWidget callIndicatorWidget) {
        if (!j0().n() || !c0(this, k0())) {
            z68.c("RootController", "showWithScalingTopController show call indicator force=false.", new Object[0]);
            g0(true, callIndicatorWidget);
            return true;
        }
        d0(this, true);
        z68.c("RootController", "showWithScalingTopController call indicator already shown.", new Object[0]);
        return false;
    }

    public final e9d j0() {
        return (e9d) this.x.getValue(this, z[4]);
    }

    public final oz1 k0() {
        KProperty kProperty = z[1];
        return (oz1) this.o.getValue();
    }

    public final void l0(boolean z2) {
        int i = 0;
        int roundToInt = z2 ? MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density) - ((wgd) ((c91) ((b91) this.a.getValue())).c.getValue()).c : MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = i0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        }
        if (i != roundToInt) {
            oz1 i0 = i0();
            ViewGroup.LayoutParams layoutParams2 = i0.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = roundToInt;
                i0.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        bta z2 = qra.a.z();
        w7d w7d = new w7d(this, 0);
        z2.getClass();
        KProperty kProperty = bta.f[0];
        z2.d.D(w7d);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, x7d, android.view.View, android.view.ViewGroup] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ? coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(dgc.root_view_group);
        coordinatorLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        coordinatorLayout.addView(i0());
        coordinatorLayout.addView(k0());
        oz1 a2 = kv0.a(coordinatorLayout.getContext());
        a2.setId(dgc.root_dialogs_container);
        coordinatorLayout.addView(a2, new wz3(-1, -1));
        coordinatorLayout.onThemeChanged(fu4.k.e(coordinatorLayout.getContext()).f());
        return coordinatorLayout;
    }

    public final void onViewCreated(View view) {
        e9d childRouter = getChildRouter((ViewGroup) view.findViewById(dgc.root_screen), "root:screen");
        childRouter.e = 1;
        childRouter.Q(true);
        KProperty[] kPropertyArr = z;
        this.v.setValue(this, kPropertyArr[2], childRouter);
        x().a(this.y);
        e9d childRouter2 = getChildRouter((ViewGroup) view.findViewById(dgc.root_dialogs_container), "root:dialog");
        childRouter2.e = 3;
        childRouter2.Q(true);
        this.w.setValue(this, kPropertyArr[3], childRouter2);
        e9d childRouter3 = getChildRouter((ViewGroup) view.findViewById(dgc.root_top_indicator), "root:topindicator");
        childRouter3.e = 1;
        childRouter3.Q(false);
        this.x.setValue(this, kPropertyArr[4], childRouter3);
        bta z2 = qra.a.z();
        w7d w7d = new w7d(this, 1);
        z2.getClass();
        KProperty kProperty = bta.f[0];
        z2.d.D(w7d);
    }

    public final int p() {
        ViewGroup.LayoutParams layoutParams = i0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final boolean w(boolean z2) {
        if (!j0().n()) {
            z68.c("RootController", "hideTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!c0(this, k0())) {
            d0(this, false);
            z68.c("RootController", "hideTopController call indicator already hidden force=" + z2, new Object[0]);
            return false;
        } else {
            z68.c("RootController", "hideTopController hide call indicator force=" + z2, new Object[0]);
            f0(false, z2, (zx3) null);
            return true;
        }
    }

    public final e9d x() {
        return (e9d) this.v.getValue(this, z[2]);
    }

    public final boolean y() {
        if (!j0().n()) {
            z68.c("RootController", "hideWithScalingTopController call indicator wasn't init", new Object[0]);
            return false;
        } else if (!c0(this, k0())) {
            d0(this, false);
            z68.c("RootController", "hideWithScalingTopController call indicator already hidden force=false", new Object[0]);
            return false;
        } else {
            z68.c("RootController", "hideWithScalingTopController hide call indicator force=false", new Object[0]);
            g0(false, (zx3) null);
            return true;
        }
    }
}
