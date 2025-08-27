package one.me.profileedit.screens.changelink;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lvwb;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lgzb;", "type", "Lfzb;", "flow", "(JLgzb;Lfzb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileChangeLinkScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileChangeLinkScreen.kt\none/me/profileedit/screens/changelink/ProfileChangeLinkScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt$frameLayoutScope$1\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,355:1\n420#2:356\n420#2:357\n235#2,10:358\n410#2,8:381\n9#3,6:368\n15#3:375\n1#4:374\n1#4:378\n12#5:376\n24#6:377\n24#6:379\n81#7:380\n*S KotlinDebug\n*F\n+ 1 ProfileChangeLinkScreen.kt\none/me/profileedit/screens/changelink/ProfileChangeLinkScreen\n*L\n63#1:356\n64#1:357\n76#1:358,10\n299#1:381,8\n188#1:368,6\n188#1:375\n188#1:374\n188#1:376\n203#1:377\n263#1:379\n277#1:380\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileChangeLinkScreen extends Widget implements qg3, vwb, cx3 {
    public static final /* synthetic */ KProperty[] Y;
    public final ReadOnlyProperty X;
    public final is a;
    public final is b;
    public final w28 c;
    public final yh7 o;
    public final Lazy v;
    public final t56 w;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty z;

    static {
        Class<ProfileChangeLinkScreen> cls = ProfileChangeLinkScreen.class;
        Y = new KProperty[]{wj6.p(cls, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0), wj6.p(cls, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), wj6.p(cls, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(fzb.class, "entity:flow_type");
        this.b = new is(gzb.class, "entity:id_type");
        this.c = new w28(new ifb(6, this), (Function0) null, 6);
        this.o = yh7.d;
        this.v = createViewModelLazy(d02.class, new zfa(13, new vra(8, bundle, this)));
        this.w = new t56(((aua) bzb.a.getAccessor().g(aua.class)).a(), (Object) this, 19);
        this.x = viewBinding(fxa.w0);
        this.y = viewBinding(fxa.y0);
        this.z = viewBinding(fxa.D0);
        this.X = viewBinding(fxa.x0);
        bs0.K(new ps5(new on2(g0().v, 28), new wwb((Continuation) null, this), 5), getLifecycleScope());
        bs0.K(new ps5(g0().z, new xwb((Continuation) null, this), 5), getLifecycleScope());
    }

    public static final OneMeButton c0(ProfileChangeLinkScreen profileChangeLinkScreen) {
        profileChangeLinkScreen.getClass();
        return (OneMeButton) profileChangeLinkScreen.z.getValue(profileChangeLinkScreen, Y[4]);
    }

    public final void d0() {
        View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
    }

    public final fzb e0() {
        KProperty kProperty = Y[0];
        return (fzb) this.a.a(this);
    }

    public final h3b f0() {
        return (h3b) this.y.getValue(this, Y[3]);
    }

    public final void g(int i, Bundle bundle) {
        g0().b.h(i);
    }

    public final d02 g0() {
        return (d02) this.v.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.o;
    }

    public final pgd getScreenDelegate() {
        return this.c;
    }

    public final boolean handleBack() {
        d0();
        return super.handleBack();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v2b v2b;
        int i;
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(fxa.x0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 48);
        float f = (float) 16;
        layoutParams2.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.w);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.setClipChildren(false);
        y3a y3a = new y3a(14, (Object) this);
        js9 js9 = fu4.k;
        recyclerView.j(new mnd(js9.e(recyclerView.getContext()).f(), y3a, (h9) null, 12));
        recyclerView.j(new ue8(0));
        frameLayout.addView(recyclerView);
        h3b d = o54.d(frameLayout.getContext(), (AttributeSet) null);
        d.setId(fxa.y0);
        jkb jkb = new jkb(5, (Object) this);
        int ordinal = e0().ordinal();
        if (ordinal == 0) {
            v2b = new p2b(new v12(4, (Function1) jkb));
        } else if (ordinal == 1) {
            v2b = new q2b(new v12(5, (Function1) jkb));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d.setLeftActions(v2b);
        d.setRightActions(s2b.a);
        d.setForm(z2b.a);
        d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        d.setBackgroundColor(js9.e(d.getContext()).f().c().h);
        frameLayout.addView(d);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(fxa.D0);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setAppearance(xpa.c);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams3.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams3);
        int ordinal2 = e0().ordinal();
        if (ordinal2 == 0) {
            i = ixa.O1;
        } else if (ordinal2 == 1) {
            i = ixa.P1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oneMeButton.setText(i);
        ct.G(oneMeButton, 300, new u99(18, (Object) this));
        frameLayout.addView(oneMeButton);
        b0h.H(frameLayout, new x2(this, (Continuation) null, 24));
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        h3b f0 = f0();
        u3b.a(f0, new vj6(15, (Object) f0, (Object) this));
        bs0.K(new ps5(new on2(g0().x, 28), new zwb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(g0().y, getViewLifecycleOwner().getLifecycle(), iu7.o), new ywb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        g0().b.i(i);
    }

    public ProfileChangeLinkScreen(long j, gzb gzb, fzb fzb) {
        this(o54.f(TuplesKt.to("entity:id", Long.valueOf(j)), TuplesKt.to("entity:id_type", gzb), TuplesKt.to("entity:flow_type", fzb)));
    }
}
