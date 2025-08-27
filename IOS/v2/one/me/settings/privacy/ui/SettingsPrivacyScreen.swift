package one.me.settings.privacy.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lj75;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingsPrivacyScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPrivacyScreen.kt\none/me/settings/privacy/ui/SettingsPrivacyScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n235#2,10:200\n410#2,8:218\n410#2,8:226\n17#3,8:210\n1863#4,2:234\n135#5,3:236\n138#5,8:253\n33#6,14:239\n1#7:261\n*S KotlinDebug\n*F\n+ 1 SettingsPrivacyScreen.kt\none/me/settings/privacy/ui/SettingsPrivacyScreen\n*L\n45#1:200,10\n99#1:218,8\n128#1:226,8\n86#1:210,8\n151#1:234,2\n160#1:236,3\n160#1:253,8\n160#1:239,14\n*E\n"})
public final class SettingsPrivacyScreen extends Widget implements qg3, j75 {
    public static final /* synthetic */ KProperty[] x = {wj6.p(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public static final String y = "settings-privacy";
    public final w28 a = new w28(jgd.SETTINGS_PRIVACY);
    public final yh7 b = yh7.d;
    public final Lazy c = createViewModelLazy(y3e.class, new zfa(26, new j3e(this, 0)));
    public final String o = y;
    public final ReadOnlyProperty v = viewBinding(tza.r);
    public final c3e w;

    public SettingsPrivacyScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        c3e c3e = new c3e(new syc(3, this), ((aua) e3e.a.getAccessor().g(aua.class)).a());
        this.w = c3e;
        bs0.K(new ps5(c0().v0, new p2c(2, c3e, c3e.class, "submitList", "submitList(Ljava/util/List;)V", 4, 3), 5), getLifecycleScope());
    }

    public final y3e c0() {
        return (y3e) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        y3e c0 = c0();
        c0.getClass();
        int i2 = tza.l;
        wie wie = c0.w0;
        if (i == i2) {
            wie.setValue(c0, y3e.I0[0], xag.g(c0, (CoroutineContext) null, (f14) null, new t3e(c0, true, (Continuation) null), 3));
        } else if (i == tza.m) {
            if (((hq) c0.l()).g.getBoolean("app.privacy.online.show", true)) {
                c0.q(xzd.g);
            }
        } else if (i == tza.o) {
        } else {
            if (i == tza.n) {
                wie.setValue(c0, y3e.I0[0], xag.g(c0, (CoroutineContext) null, (f14) null, new t3e(c0, false, (Continuation) null), 3));
                return;
            }
            int i3 = tza.h;
            wie wie2 = c0.x0;
            if (i == i3) {
                wie2.setValue(c0, y3e.I0[1], xag.g(c0, (CoroutineContext) null, (f14) null, new w3e(c0, 1, (Continuation) null), 3));
            } else if (i == tza.i) {
                wie2.setValue(c0, y3e.I0[1], xag.g(c0, (CoroutineContext) null, (f14) null, new w3e(c0, 3, (Continuation) null), 3));
            } else {
                int i4 = tza.f;
                wie wie3 = c0.y0;
                if (i == i4) {
                    wie3.setValue(c0, y3e.I0[2], xag.g(c0, (CoroutineContext) null, (f14) null, new v3e(c0, 1, (Continuation) null), 3));
                } else if (i == tza.g) {
                    wie3.setValue(c0, y3e.I0[2], xag.g(c0, (CoroutineContext) null, (f14) null, new v3e(c0, 3, (Continuation) null), 3));
                } else {
                    int i5 = tza.p;
                    wie wie4 = c0.z0;
                    if (i == i5) {
                        wie4.setValue(c0, y3e.I0[3], xag.g(c0, (CoroutineContext) null, (f14) null, new x3e(c0, 1, (Continuation) null), 3));
                    } else if (i == tza.q) {
                        wie4.setValue(c0, y3e.I0[3], xag.g(c0, (CoroutineContext) null, (f14) null, new x3e(c0, 3, (Continuation) null), 3));
                    } else if (i == tza.k && c0.B0 == null) {
                        String g = ((f8f) c0.x.getValue()).g();
                        List emptyList = (g == null || StringsKt.isBlank(g)) ? CollectionsKt.emptyList() : CollectionsKt.listOf(g);
                        jna jna = (jna) c0.k();
                        c0.B0 = Long.valueOf(jna.z(jna, new ua2(1, ((ltb) jna.D()).a.n(), emptyList)));
                    }
                }
            }
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1573getScopeIdIluPPks() {
        return this.o;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(tza.u);
        d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        d.setTitle(vza.E);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(20, (Object) this)));
        linearLayout.addView(d);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(tza.r);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.w);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new nqd(5, this), (h9) null, 12));
        recyclerView.j(new jz0(5));
        recyclerView.j(new m3e(recyclerView.getContext()));
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 13));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.v.getValue(this, x[0])).setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        y3e c0 = c0();
        xag.g(c0, ((osa) c0.o).a(), (f14) null, new r3e(c0, (Continuation) null), 2);
        dtc dtc = c0().G0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(dtc, getViewLifecycleOwner().getLifecycle(), iu7), new k3e((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().H0, getViewLifecycleOwner().getLifecycle(), iu7), new l3e((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
