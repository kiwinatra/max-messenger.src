package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.avatar.OneMeAvatarView;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqg3;", "Lmd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lf0d;", "registrationData", "Lytb;", "presetAvatars", "(Lf0d;Lytb;)V", "", "contactId", "(J)V", "d8a", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNeuroAvatarsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NeuroAvatarsScreen.kt\none/me/login/neuroavatars/NeuroAvatarsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 9 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,736:1\n420#2:737\n420#2:738\n420#2:739\n235#2,10:740\n410#2,8:763\n410#2,8:771\n410#2,8:779\n410#2,8:787\n410#2,8:795\n410#2,8:803\n1#3:750\n24#4:751\n24#4:752\n24#4:753\n24#4:754\n24#4:755\n24#4:756\n24#4:759\n24#4:762\n24#4:811\n24#4:812\n256#5,2:757\n37#5:760\n53#5:761\n23#6:813\n1863#7,2:814\n135#8,3:816\n138#8,8:833\n33#9,14:819\n*S KotlinDebug\n*F\n+ 1 NeuroAvatarsScreen.kt\none/me/login/neuroavatars/NeuroAvatarsScreen\n*L\n177#1:737\n178#1:738\n179#1:739\n181#1:740,10\n488#1:763,8\n516#1:771,8\n550#1:779,8\n574#1:787,8\n590#1:795,8\n602#1:803,8\n291#1:751\n302#1:752\n348#1:753\n366#1:754\n377#1:755\n400#1:756\n418#1:759\n476#1:762\n650#1:811\n651#1:812\n402#1:757,2\n442#1:760\n442#1:761\n201#1:813\n506#1:814,2\n509#1:816,3\n509#1:833,8\n509#1:819,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class NeuroAvatarsScreen extends Widget implements qg3, md0 {
    public static final /* synthetic */ KProperty[] K0;
    public final b8a A0;
    public final is B0;
    public final is C0;
    public final is D0;
    public final Lazy E0;
    public final ExecutorService F0;
    public final t56 G0;
    public final o8a H0;
    public final nfd I0;
    public final Lazy J0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final /* synthetic */ bk3 a;
    public final yh7 b;
    public final w28 c;
    public final Lazy o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty v0;
    public final ReadOnlyProperty w;
    public final gh5 w0;
    public final ReadOnlyProperty x;
    public final Lazy x0;
    public final ReadOnlyProperty y;
    public final Lazy y0;
    public final ReadOnlyProperty z;
    public final n8a z0;

    static {
        Class<NeuroAvatarsScreen> cls = NeuroAvatarsScreen.class;
        K0 = new KProperty[]{wj6.p(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), wj6.p(cls, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0), wj6.p(cls, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), wj6.p(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "buttonBackground", "getButtonBackground()Landroid/view/View;", 0), wj6.p(cls, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0), wj6.p(cls, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), wj6.p(cls, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0), wj6.p(cls, "contactId", "getContactId()Ljava/lang/Long;", 0)};
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, bk3] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new Object();
        jdb jdb = jdb.b;
        jdb jdb2 = anf.a;
        this.b = new yh7(jdb, (nr0) null);
        this.c = new w28(new a8a(this, 2), (Function0) null, 6);
        n88 n88 = n88.a;
        this.o = n88.getAccessor().h(r80.class);
        this.v = viewBinding(xgc.oneme_login_neuro_avatars_tabs);
        this.w = viewBinding(xgc.oneme_login_neuro_avatars_avatar);
        this.x = viewBinding(xgc.oneme_login_neuro_avatars_collapsible);
        this.y = viewBinding(xgc.oneme_login_neuro_avatars_appbar);
        this.z = viewBinding(xgc.oneme_login_neuro_avatars_toolbar);
        this.X = viewBinding(xgc.oneme_login_neuro_avatars_recycler_view);
        this.Y = viewBinding(xgc.oneme_login_neuro_avatars_button_background);
        this.Z = viewBinding(xgc.oneme_login_neuro_avatars_continue_btn);
        this.v0 = viewBinding(xgc.oneme_login_neuro_avatars_tabs_shimmer);
        this.w0 = new gh5();
        this.x0 = n88.getAccessor().h(edb.class);
        this.y0 = n88.getAccessor().h(z5a.class);
        this.z0 = new n8a(0, this);
        this.A0 = new b8a(this);
        this.B0 = new is(f0d.class, "registration_data_args");
        this.C0 = new is(ytb.class, "avatars_args");
        this.D0 = new is(Long.class, "contact_id_args");
        this.E0 = createViewModelLazy(x8a.class, new i76(29, new a8a(this, 3)));
        ExecutorService a2 = ((aua) n88.getAccessor().g(aua.class)).a();
        this.F0 = a2;
        t56 t56 = new t56(a2, (Object) new g8a(h0()), 18);
        this.G0 = t56;
        this.H0 = new o8a(t56, new hq7(h0()));
        this.I0 = new nfd(15);
        this.J0 = LazyKt.lazy(new a8a(this, 4));
        bs0.K(new ps5(h0().w0, new c8a((Continuation) null, this), 5), getLifecycleScope());
    }

    public final void a(String str, RectF rectF, Rect rect) {
        x8a h0 = h0();
        sd0 sd0 = sd0.b;
        l7a l7a = h0.b;
        l7a.getClass();
        ev0.v(l7a.f, (CoroutineContext) null, (f14) null, new i7a(str, rect, l7a, rectF, sd0, (Continuation) null), 3);
    }

    public final AppBarLayout c0() {
        return (AppBarLayout) this.y.getValue(this, K0[3]);
    }

    public final RecyclerView d0() {
        return (RecyclerView) this.X.getValue(this, K0[5]);
    }

    public final f0d e0() {
        KProperty kProperty = K0[9];
        return (f0d) this.B0.a(this);
    }

    public final OneMeAvatarView f0() {
        return (OneMeAvatarView) this.w.getValue(this, K0[1]);
    }

    public final void g(int i, Bundle bundle) {
        if (i == xgc.oneme_login_neuro_avatars_load_from_gallery_action) {
            f98 f98 = f98.b;
            f98.getClass();
            Unit unit = Unit.INSTANCE;
            f98.W0().b(":media-picker/select/photo", (Bundle) null);
        } else if (i == xgc.oneme_login_neuro_avatars_take_photo_action) {
            h0().j();
        } else if (i == xgc.oneme_login_neuro_avatars_remove_photo_action) {
            x8a h0 = h0();
            h0.o.a((dqd) null);
            h0.b.i.setValue((Object) null);
        }
    }

    public final c2b g0() {
        return (c2b) this.v.getValue(this, K0[0]);
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.c;
    }

    public final x8a h0() {
        return (x8a) this.E0.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 555) {
            if (i == 666 && i2 == -1) {
                l7a l7a = h0().b;
                l7a.getClass();
                if (intent == null) {
                    z68.f(l7a.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                    l7a.b();
                    return;
                }
                ev0.v(l7a.f, (CoroutineContext) null, (f14) null, new j7a(intent, l7a, (Continuation) null), 3);
            }
        } else if (i2 == -1) {
            x8a h0 = h0();
            Uri data = intent != null ? intent.getData() : null;
            l7a l7a2 = h0.b;
            l7a2.getClass();
            ev0.v(l7a2.f, (CoroutineContext) null, (f14) null, new h7a(l7a2, data, (Continuation) null), 3);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(xgc.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        b0h.H(frameLayout, new sn2(3, (Continuation) null, 4));
        z7a z7a = new z7a(this, 6);
        CoordinatorLayout coordinatorLayout = Build.VERSION.SDK_INT >= 30 ? new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null) : new CoordinatorLayout(frameLayout.getContext(), (AttributeSet) null);
        z7a.invoke(coordinatorLayout);
        frameLayout.addView(coordinatorLayout);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        b8a b8a;
        d0().setAdapter((tyc) null);
        d0().u0(this.H0);
        g0().X0.remove(this.z0);
        ArrayList arrayList = c0().y;
        if (arrayList != null && (b8a = this.A0) != null) {
            arrayList.remove(b8a);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((edb) this.x0.getValue()).b(strArr)) {
            h0().j();
        }
    }

    public final void onViewCreated(View view) {
        etc etc = h0().Y;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new j8a((Continuation) null, this), 5), getViewLifecycleScope());
        k6e k6e = h0().z;
        if (k6e != null) {
            bs0.K(new ps5(ct.k(k6e, getViewLifecycleOwner().getLifecycle(), iu7), new k8a((Continuation) null, this), 5), getViewLifecycleScope());
        }
        bs0.K(new ps5(ct.k(h0().y, getViewLifecycleOwner().getLifecycle(), iu7), new l8a((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().v0, getViewLifecycleOwner().getLifecycle(), iu7), new m8a((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().b.h, getViewLifecycleOwner().getLifecycle(), iu7), new i8a((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(h0().y0, getViewLifecycleOwner().getLifecycle(), iu7), new h8a((Continuation) null, this), 5), getViewLifecycleScope());
        ct.G((OneMeButton) this.Z.getValue(this, K0[7]), 300, new y7a(this, 0));
        g0().a(this.z0);
        c0().a(h88.d0(this.A0, c0(), getViewLifecycleOwner()));
        ct.G(f0(), 300, new y7a(this, 1));
        t56 t56 = this.G0;
        t56.A(new jwe(1, this, t56));
    }

    public NeuroAvatarsScreen(f0d f0d, ytb ytb) {
        this(o54.f(TuplesKt.to("registration_data_args", f0d), TuplesKt.to("avatars_args", ytb)));
    }

    public NeuroAvatarsScreen(long j) {
        this(o54.f(TuplesKt.to("contact_id_args", Long.valueOf(j))));
    }
}
