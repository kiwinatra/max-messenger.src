package one.me.calls.ui.bottomsheet.opponents;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lkl1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallOpponentsListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallOpponentsListWidget.kt\none/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget\n+ 2 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 3 Widget.kt\none/me/sdk/arch/Widget\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 9 TextSource.kt\none/me/sdk/uikit/common/TextSourceKt\n*L\n1#1,538:1\n8#2:539\n8#2:540\n8#2:541\n8#2:552\n235#3,10:542\n410#3,8:553\n410#3,8:561\n5#4:569\n24#5:570\n28#5:576\n24#5:577\n24#5:586\n24#5:587\n24#5:588\n24#5:589\n24#5:590\n24#5:591\n24#5:592\n24#5:593\n24#5:594\n24#5:595\n24#5:596\n24#5:599\n24#5:600\n24#5:601\n24#5:621\n256#6,2:571\n256#6,2:573\n142#6,8:578\n172#6,2:597\n256#6,2:624\n1#7:575\n65#8,16:602\n93#8,3:618\n167#9:622\n167#9:623\n*S KotlinDebug\n*F\n+ 1 CallOpponentsListWidget.kt\none/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget\n*L\n91#1:539\n93#1:540\n95#1:541\n124#1:552\n101#1:542,10\n344#1:553,8\n360#1:561,8\n424#1:569\n442#1:570\n91#1:576\n140#1:577\n152#1:586\n153#1:587\n189#1:588\n194#1:589\n195#1:590\n207#1:591\n223#1:592\n224#1:593\n225#1:594\n226#1:595\n237#1:596\n245#1:599\n246#1:600\n247#1:601\n283#1:621\n462#1:571,2\n463#1:573,2\n140#1:578,8\n237#1:597,2\n287#1:624,2\n253#1:602,16\n253#1:618,3\n285#1:622\n286#1:623\n*E\n"})
public final class CallOpponentsListWidget extends Widget implements cx3, kl1 {
    public static final /* synthetic */ KProperty[] B0;
    public final sn0 A0;
    public final sn0 X;
    public final sn0 Y;
    public final sn0 Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final sn0 v0;
    public final sn0 w;
    public final sn0 w0;
    public final Lazy x;
    public final sn0 x0;
    public final sn0 y;
    public final sn0 y0;
    public final sn0 z;
    public final Lazy z0;

    static {
        Class<CallOpponentsListWidget> cls = CallOpponentsListWidget.class;
        B0 = new KProperty[]{wj6.p(cls, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0), wj6.p(cls, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "titleOpponentListView", "getTitleOpponentListView()Landroid/widget/TextView;", 0), wj6.p(cls, "searchView", "getSearchView()Landroid/widget/EditText;", 0), wj6.p(cls, "emptyStateViewStub", "getEmptyStateViewStub()Landroid/view/ViewStub;", 0), wj6.p(cls, "emptyStateView", "getEmptyStateView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), wj6.p(cls, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0)};
    }

    public CallOpponentsListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        v11 v11 = new v11(16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, v11);
        this.b = oh1.a.getAccessor().h(hl1.class);
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new ie1(this, 0));
        this.o = LazyKt.lazy(lazyThreadSafetyMode, new ie1(this, 1));
        this.v = createViewModelLazy(he1.class, new s(13, new v11(15)));
        this.w = binding(new ie1(this, 2));
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new ie1(this, 3));
        this.y = binding(new ie1(this, 4));
        this.z = binding(new ie1(this, 5));
        this.X = binding(new ie1(this, 6));
        this.Y = binding(new ie1(this, 7));
        this.Z = binding(new ie1(this, 8));
        this.v0 = binding(new ie1(this, 9));
        this.w0 = binding(new ie1(this, 10));
        this.x0 = binding(new ie1(this, 11));
        this.y0 = binding(new ie1(this, 12));
        this.z0 = LazyKt.lazy(new ie1(this, 13));
        this.A0 = binding(new ie1(this, 14));
    }

    public final AppBarLayout c0() {
        KProperty kProperty = B0[10];
        return (AppBarLayout) this.A0.getValue();
    }

    public final EditText d0() {
        KProperty kProperty = B0[7];
        return (EditText) this.w0.getValue();
    }

    public final h3b e0() {
        KProperty kProperty = B0[1];
        return (h3b) this.y.getValue();
    }

    public final he1 f0() {
        return (he1) this.v.getValue();
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wk wkVar = new wk(2, this, layoutInflater);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setBackgroundColor(l2b.d.i);
        wkVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        kr7.C(d0());
        d0().clearFocus();
        f0().v0.a.remove(this);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        d0().clearFocus();
        c0().requestFocus();
        ll1 ll1 = f0().v0;
        ll1.a.add(this);
        r(ll1.b);
        c0().a(h88.d0(new xb1(new gh5(), this, 1), c0(), getViewLifecycleOwner()));
        xme xme = f0().Z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new le1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(f0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new me1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void r(jl1 jl1) {
        KProperty kProperty = B0[5];
        ((TextView) this.Z.getValue()).setText(jl1 != null ? jl1.c : null);
    }

    public final void s(int i, Bundle bundle) {
        if (i == qqa.p) {
            f0().k(bundle);
        } else if (i == qqa.q) {
            f0().k(bundle);
        } else if (i == qqa.r) {
            he1 f0 = f0();
            aje u = ev0.u(f0.a, ((osa) f0.c).b(), f14.b, new ee1(bundle, f0, (Continuation) null));
            f0.y.setValue(f0, he1.x0[0], u);
        } else if (i == qqa.o) {
            f0().o.g();
        }
    }

    public CallOpponentsListWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
