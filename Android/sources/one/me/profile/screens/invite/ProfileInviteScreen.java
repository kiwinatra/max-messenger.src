package one.me.profile.screens.invite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "Ll2c;", "Lqg3;", "Lp5e;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nProfileInviteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileInviteScreen.kt\none/me/profile/screens/invite/ProfileInviteScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,268:1\n235#2,10:269\n1#3:279\n24#4:280\n24#4:289\n24#4:290\n24#4:291\n24#4:292\n24#4:293\n24#4:294\n24#4:295\n142#5,8:281\n*S KotlinDebug\n*F\n+ 1 ProfileInviteScreen.kt\none/me/profile/screens/invite/ProfileInviteScreen\n*L\n68#1:269,10\n194#1:280\n221#1:289\n222#1:290\n226#1:291\n227#1:292\n231#1:293\n232#1:294\n233#1:295\n194#1:281,8\n*E\n"})
@SuppressLint({"ValidController"})
public final class ProfileInviteScreen extends Widget implements l2c, qg3, p5e, cx3 {
    public static final /* synthetic */ KProperty[] w = {wj6.p(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0)};
    public final w28 a;
    public final yh7 b;
    public final Lazy c;
    public final m2c o;
    public final ReadOnlyProperty v;

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new w28(new mxb(9), (Function0) null, 6);
        this.b = yh7.d;
        this.c = createViewModelLazy(z2c.class, new zfa(16, new bg2(bundle, 3)));
        m2c m2c = new m2c(((aua) jxb.a.getAccessor().g(aua.class)).a(), this);
        this.o = m2c;
        this.v = viewBinding(jxa.J);
        etc etc = c0().z0;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, lifecycle, iu7), new wq0(2, m2c, m2c.class, "submitList", "submitList(Ljava/util/List;)V", 4, 29), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(c0().B0, this.lifecycleOwner.getLifecycle(), iu7), new i2c(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(c0().A0, this.lifecycleOwner.getLifecycle(), iu7), new j2c(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final z2c c0() {
        return (z2c) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        z2c c0 = c0();
        c0.getClass();
        if (i == jxa.N) {
            r4c r4c = r4c.b;
            wc8 wc8 = txb.b;
            r4c.getClass();
            xag.h(c0.A0, new pa4(wj6.m(new StringBuilder(":profile?id="), c0.b, "&type=local_chat")));
            c0.x0.set(false);
        } else if (i == jxa.G) {
            aje v2 = ev0.v(c0.a, ((osa) ((gaf) c0.o.getValue())).b(), (f14) null, new s2c(c0, (Continuation) null), 2);
            c0.Z.setValue(c0, z2c.C0[0], v2);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jkb jkb = new jkb(8, (Object) this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        b0h.H(linearLayout, new ed1(3, (Continuation) null, 2));
        jkb.invoke(linearLayout);
        return linearLayout;
    }

    public final void s(int i, Bundle bundle) {
        z2c c0 = c0();
        c0.getClass();
        if (i == jxa.K) {
            xag.h(c0.B0, new c2c(new igf(lxa.Z0), new igf(lxa.Y0), CollectionsKt.listOf(new pg3(jxa.G, new igf(lxa.V0), og3.c), new pg3(jxa.y, new igf(lxa.W0), og3.b))));
        }
    }

    public ProfileInviteScreen(long j) {
        this(o54.f(TuplesKt.to("id", Long.valueOf(j))));
    }
}
