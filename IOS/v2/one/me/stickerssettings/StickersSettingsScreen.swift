package one.me.stickerssettings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lqg3;", "<init>", "()V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickersSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickersSettingsScreen.kt\none/me/stickerssettings/StickersSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,243:1\n235#2,10:244\n410#2,8:263\n410#2,8:271\n17#3,8:254\n1#4:262\n135#5,3:279\n138#5,8:296\n33#6,14:282\n*S KotlinDebug\n*F\n+ 1 StickersSettingsScreen.kt\none/me/stickerssettings/StickersSettingsScreen\n*L\n58#1:244,10\n163#1:263,8\n164#1:271,8\n96#1:254,8\n228#1:279,3\n228#1:296,8\n228#1:282,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class StickersSettingsScreen extends Widget implements cx3, qg3 {
    public static final /* synthetic */ KProperty[] w = {wj6.p(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final w28 a = new w28(new dle(7), (Function0) null, 6);
    public final Lazy b = createViewModelLazy(zue.class, new mle(5, new dle(8)));
    public final ReadOnlyProperty c = viewBinding(m1b.f);
    public yl7 o;
    public final lue v = new lue(((aua) mue.a.getAccessor().g(aua.class)).a(), new oue(this, 2), new oue(this, 3), new oue(this, 4));

    public StickersSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        bs0.K(new ps5(c0().z, new pue((Continuation) null, this), 5), getLifecycleScope());
    }

    public final zue c0() {
        return (zue) this.b.getValue();
    }

    public final void g(int i, Bundle bundle) {
        zue c0 = c0();
        Long l = c0.z0;
        if (l != null) {
            long longValue = l.longValue();
            c0.z0 = null;
            if (i == m1b.b) {
                aje u = ev0.u(c0.a, ((osa) c0.c).b(), f14.b, new wue(c0, longValue, (Continuation) null));
                c0.B0.setValue(c0, zue.C0[2], u);
            }
        }
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
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
        d.setId(m1b.x);
        d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        d.setTitle(n1b.G);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new oue(this, 0)));
        linearLayout.addView(d);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(m1b.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.v);
        nqd nqd = new nqd(15, this);
        js9 js9 = fu4.k;
        recyclerView.j(new mnd(js9.e(recyclerView.getContext()).f(), nqd, (h9) null, 12));
        recyclerView.j(new vo3(js9.e(recyclerView.getContext()).f()));
        recyclerView.j(new jz0(6));
        yl7 yl7 = new yl7(new sl7(new r6(21, this), new oue(this, 1)));
        this.o = yl7;
        yl7.i(recyclerView);
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 14));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.getValue(this, w[0])).setAdapter((tyc) null);
        yl7 yl7 = this.o;
        if (yl7 != null) {
            yl7.i((RecyclerView) null);
        }
        this.o = null;
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        s85 s85 = c0().X;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new que((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().Y, getViewLifecycleOwner().getLifecycle(), iu7), new rue((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        zue c0 = c0();
        Long l = c0.y0;
        if (l != null) {
            long longValue = l.longValue();
            c0.y0 = null;
            aje u = ev0.u(c0.a, ((osa) c0.c).a(), f14.b, new yue(c0, longValue, i, (Continuation) null));
            c0.A0.setValue(c0, zue.C0[1], u);
        }
    }
}
