package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "dbe", "qa", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBaseBottomSheetWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBottomSheetWidget.kt\none/me/sdk/bottomsheet/BaseBottomSheetWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,182:1\n419#2:183\n81#3:184\n28#4:185\n*S KotlinDebug\n*F\n+ 1 BaseBottomSheetWidget.kt\none/me/sdk/bottomsheet/BaseBottomSheetWidget\n*L\n32#1:183\n83#1:184\n148#1:185\n*E\n"})
public abstract class BaseBottomSheetWidget extends Widget {
    public static final dbe v = new dbe(7);
    public static final /* synthetic */ KProperty[] w;
    public static final String x = "need_dim";
    public orb a;
    public final is b;
    public final ReadOnlyProperty c;
    public final yh7 o;

    static {
        Class<BaseBottomSheetWidget> cls = BaseBottomSheetWidget.class;
        w = new KProperty[]{rae.s(cls, "needDim", "getNeedDim()Z", 0), wj6.p(cls, "cardView", "getCardView()Landroid/view/View;", 0)};
    }

    public BaseBottomSheetWidget() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public FrameLayout c0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(hya.b);
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new lr0(vo4.c().getDisplayMetrics().density * 20.0f, 1));
        m0(frameLayout, layoutInflater, bundle);
        b0h.H(frameLayout, new sa((Object) this, (Continuation) null, 1));
        return frameLayout;
    }

    public frb d0() {
        return new qa(this, 1);
    }

    public yh7 e0() {
        return this.o;
    }

    public final View f0() {
        return (View) this.c.getValue(this, w[1]);
    }

    public k2b g0() {
        return null;
    }

    public boolean h0() {
        return true;
    }

    public boolean handleBack() {
        i0(true);
        return true;
    }

    public final void i0(boolean z) {
        orb orb = this.a;
        if (orb == null) {
            j0();
        } else if (orb.getScrollState() != lrb.a) {
            k0();
            orb.j(z);
        }
    }

    public boolean isDialog() {
        return !(this instanceof WebAppRootScreen);
    }

    public void j0() {
        k0();
        getRouter().B(this);
    }

    public void k0() {
    }

    public final void l0(boolean z) {
        KProperty kProperty = w[0];
        this.b.b(this, Boolean.valueOf(z));
    }

    public abstract void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    public void onAttach(View view) {
        super.onAttach(view);
        orb orb = this.a;
        if (orb != null && orb.getScrollState() == lrb.a) {
            u3b.a(orb, new cf(5, orb, orb));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        orb orb = new orb(layoutInflater.getContext());
        orb.setId(hya.a);
        FrameLayout c0 = c0(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = c0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        orb.addView(c0, layoutParams);
        orb.setCallback(d0());
        h88.f(c0, e0(), (Function1) null);
        b0h.H(orb, new x2(this, (Continuation) null, 2));
        this.a = orb;
        return orb;
    }

    public void onDestroyView(View view) {
        orb orb = this.a;
        if (orb != null) {
            orb.setCallback((frb) null);
        }
        orb orb2 = this.a;
        if (orb2 != null) {
            ValueAnimator valueAnimator = orb2.v;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            orb2.v = null;
        }
        this.a = null;
        super.onDestroyView(view);
    }

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.b = new is(Boolean.class, Boolean.TRUE, x);
        this.c = viewBinding(hya.b);
        nr0 nr0 = new nr0(jdb.b, mr0.c, false);
        jdb jdb = jdb.o;
        jdb jdb2 = anf.a;
        this.o = new yh7(jdb, nr0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseBottomSheetWidget(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }
}
