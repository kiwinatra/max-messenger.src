package one.me.profileedit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "Lqc6;", "Lw0c;", "Lqg3;", "Lmd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lgzb;", "type", "(JLgzb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditScreen.kt\none/me/profileedit/ProfileEditScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,562:1\n235#2,10:563\n1#3:573\n5#4:574\n24#5:575\n24#5:576\n24#5:577\n24#5:578\n*S KotlinDebug\n*F\n+ 1 ProfileEditScreen.kt\none/me/profileedit/ProfileEditScreen\n*L\n110#1:563,10\n432#1:574\n480#1:575\n491#1:576\n494#1:577\n380#1:578\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileEditScreen extends Widget implements qc6, w0c, qg3, md0 {
    public static final /* synthetic */ KProperty[] w0;
    public final ReadOnlyProperty X;
    public final Lazy Y;
    public final Lazy Z;
    public final long a;
    public final w28 b;
    public final yh7 c;
    public final Lazy o;
    public final t56 v;
    public final sn0 v0;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty x;
    public final ReadOnlyProperty y;
    public final ReadOnlyProperty z;

    static {
        Class<ProfileEditScreen> cls = ProfileEditScreen.class;
        w0 = new KProperty[]{wj6.p(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0)};
    }

    public ProfileEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = bundle.getLong("profile:id");
        this.b = new w28(new m0c(this, 0), (Function0) null, 6);
        this.c = yh7.d;
        this.o = createViewModelLazy(j1c.class, new zfa(15, new vra(10, this, bundle)));
        bzb bzb = bzb.a;
        this.v = new t56(((aua) bzb.getAccessor().g(aua.class)).a(), (Object) this, 21);
        this.w = viewBinding(fxa.U);
        this.x = viewBinding(fxa.r0);
        this.y = viewBinding(fxa.q0);
        this.z = viewBinding(fxa.b0);
        this.X = viewBinding(fxa.V);
        this.Y = bzb.getAccessor().h(edb.class);
        this.Z = bzb.getAccessor().h(z5a.class);
        bs0.K(new ps5(new on2(d0().Y, 28), new p0c(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(ct.k(new ps5(new on2(d0().w0, 28), new q0c(this, (Continuation) null), 5), this.lifecycleOwner.getLifecycle(), iu7.v), getLifecycleScope());
        bs0.K(new ps5(d0().x0, new r0c(this, (Continuation) null), 5), getLifecycleScope());
        this.v0 = binding(new m0c(this, 1));
    }

    public final void a(String str, RectF rectF, Rect rect) {
        j1c d0 = d0();
        ev0.v(d0.a, ((osa) d0.j()).b(), (f14) null, new e1c(d0, str, rectF, (Continuation) null), 2);
    }

    public final h3b c0() {
        return (h3b) this.y.getValue(this, w0[2]);
    }

    public final j1c d0() {
        return (j1c) this.o.getValue();
    }

    public final void g(int i, Bundle bundle) {
        j1c d0 = d0();
        d0.getClass();
        int i2 = fxa.d0;
        s85 s85 = d0.w0;
        if (i == i2) {
            xag.h(s85, d0c.b);
        } else if (i == fxa.c0) {
            xag.h(s85, p33.b);
        } else if (i == fxa.a0) {
            xag.h(s85, f0c.b);
        } else {
            int i3 = fxa.Y;
            xz4 xz4 = d0.b;
            if (i == i3) {
                vzb vzb = vzb.b;
                long e = xz4.e();
                vzb.getClass();
                a81.r(":neuro-avatars?id=" + e, s85);
            } else if (i == fxa.Z) {
                d0.k();
            } else if (i == fxa.X) {
                xz4.j();
            } else if (i != fxa.e && i != fxa.g0 && i != fxa.W) {
                xz4.g(i);
            }
        }
    }

    public final yh7 getInsetsConfig() {
        return this.c;
    }

    public final pgd getScreenDelegate() {
        return this.b;
    }

    public final boolean handleBack() {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        j1c d0 = d0();
        xz4 xz4 = d0.b;
        a05 a05 = (a05) xz4.j.getValue();
        Boolean bool = null;
        if (a05 != null && a05.a((a05) xz4.k.getValue())) {
            xag.h(d0.w0, new g0c(new igf(ixa.T), (ngf) null, CollectionsKt.listOf(new pg3(fxa.d0, new igf(ixa.U), og3.c), new pg3(fxa.c0, new igf(ixa.S), og3.b))));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : super.handleBack();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                z68.f(ProfileEditScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                d0().m();
                return;
            }
            j1c d0 = d0();
            ev0.v(d0.a, ((osa) d0.j()).b(), (f14) null, new f1c(intent, d0, (Continuation) null), 2);
        } else if (i2 == -1) {
            j1c d02 = d0();
            ev0.v(d02.a, ((osa) d02.j()).b(), (f14) null, new c1c(d02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        n0c n0c = new n0c(this, 1);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(fxa.a);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b0h.H(coordinatorLayout, new s0c(3, (Continuation) null, 0));
        n0c.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((edb) this.Y.getValue()).b(strArr)) {
            d0().k();
        }
    }

    public final void onViewCreated(View view) {
        gh5 gh5 = new gh5();
        KProperty[] kPropertyArr = w0;
        KProperty kProperty = kPropertyArr[0];
        ReadOnlyProperty readOnlyProperty = this.w;
        ((AppBarLayout) readOnlyProperty.getValue(this, kProperty)).a(h88.d0(new xb1(gh5, this, 2), (AppBarLayout) readOnlyProperty.getValue(this, kPropertyArr[0]), getViewLifecycleOwner()));
        bs0.K(new ps5(new on2(d0().v0, 28), new t0c(this, view, (Continuation) null), 5), getViewLifecycleScope());
    }

    public ProfileEditScreen(long j, gzb gzb) {
        this(o54.f(TuplesKt.to("profile:id", Long.valueOf(j)), TuplesKt.to("profile:type", gzb)));
    }
}
