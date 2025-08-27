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
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/SettingMediaScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "<init>", "()V", "settings-media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingMediaScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingMediaScreen.kt\none/me/settings/privacy/ui/SettingMediaScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n235#2,10:157\n410#2,8:175\n17#3,8:167\n1863#4,2:183\n135#5,3:185\n138#5,8:202\n33#6,14:188\n1#7:210\n*S KotlinDebug\n*F\n+ 1 SettingMediaScreen.kt\none/me/settings/privacy/ui/SettingMediaScreen\n*L\n40#1:157,10\n83#1:175,8\n70#1:167,8\n113#1:183,2\n122#1:185,3\n122#1:202,8\n122#1:188,14\n*E\n"})
public final class SettingMediaScreen extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] w = {wj6.p(SettingMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final w28 a = new w28(new red(11), (Function0) null, 6);
    public final yh7 b = yh7.d;
    public final Lazy c = createViewModelLazy(jzd.class, new zfa(23, new red(12)));
    public final ReadOnlyProperty o = viewBinding(qza.B);
    public final k2e v;

    public SettingMediaScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        k2e k2e = new k2e(new nob((Object) this), ((aua) l2e.a.getAccessor().g(aua.class)).a());
        this.v = k2e;
        bs0.K(new ps5(c0().w, new p2c(2, k2e, k2e.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 5), getLifecycleScope());
    }

    public final jzd c0() {
        return (jzd) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        c0().l(i);
    }

    public final yh7 getInsetsConfig() {
        return this.b;
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
        d.setId(qza.E);
        d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        d.setTitle(rza.u);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(18, (Object) this)));
        linearLayout.addView(d);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(qza.B);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.v);
        recyclerView.setItemAnimator((yyc) null);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), new nqd(4, this), (h9) null, 12));
        recyclerView.j(new jz0(4));
        linearLayout.addView(recyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 11));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((RecyclerView) this.o.getValue(this, w[0])).setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(ct.k(c0().x0, getViewLifecycleOwner().getLifecycle(), iu7.o), new yyd((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
