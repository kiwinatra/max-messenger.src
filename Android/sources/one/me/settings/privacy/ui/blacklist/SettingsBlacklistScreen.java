package one.me.settings.privacy.ui.blacklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSettingsBlacklistScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsBlacklistScreen.kt\none/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ViewGroupBuilders.kt\none/me/sdk/uikit/common/ViewGroupBuildersKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 6 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n235#2,10:159\n410#2,8:177\n410#2,8:185\n17#3,8:169\n1863#4,2:193\n135#5,3:195\n138#5,8:212\n33#6,14:198\n1#7:220\n*S KotlinDebug\n*F\n+ 1 SettingsBlacklistScreen.kt\none/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen\n*L\n42#1:159,10\n85#1:177,8\n89#1:185,8\n73#1:169,8\n117#1:193,2\n126#1:195,3\n126#1:212,8\n126#1:198,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class SettingsBlacklistScreen extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] x;
    public final w28 a = new w28(jgd.SETTINGS_PRIVACY_BLOCK_LIST);
    public final yh7 b = yh7.d;
    public final Lazy c = createViewModelLazy(n0e.class, new zfa(24, new red(13)));
    public final ReadOnlyProperty o = viewBinding(tza.b);
    public final ReadOnlyProperty v = viewBinding(tza.a);
    public final t56 w = new t56((Object) new bpa(5, this), ((aua) e3e.a.getAccessor().g(aua.class)).a(), 24);

    static {
        Class<SettingsBlacklistScreen> cls = SettingsBlacklistScreen.class;
        x = new KProperty[]{wj6.p(cls, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), wj6.p(cls, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    }

    public SettingsBlacklistScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final n0e c0() {
        return (n0e) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == tza.d) {
            n0e c0 = c0();
            c0.getClass();
            if (bundle != null) {
                xag.g(c0, ((osa) ((gaf) c0.y.getValue())).b(), (f14) null, new m0e(c0, bundle.getLong("user_unblock_id"), (Continuation) null), 2);
            }
        }
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
        d.setId(tza.c);
        d.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        d.setTitle(vza.e);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new jkb(19, (Object) this)));
        linearLayout.addView(d);
        OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(linearLayout.getContext(), (AttributeSet) null);
        oneMeEmptyView.setId(tza.a);
        oneMeEmptyView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        oneMeEmptyView.setIcon(cad.m0);
        oneMeEmptyView.setTitle(new igf(vza.d));
        oneMeEmptyView.onThemeChanged(fu4.k.e(oneMeEmptyView.getContext()).f());
        linearLayout.addView(oneMeEmptyView);
        EndlessRecyclerView endlessRecyclerView = new EndlessRecyclerView(linearLayout.getContext(), (AttributeSet) null);
        endlessRecyclerView.setId(tza.b);
        endlessRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView.getContext();
        endlessRecyclerView.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView.setAdapter(this.w);
        endlessRecyclerView.setHasFixedSize(true);
        endlessRecyclerView.setPager(c0());
        linearLayout.addView(endlessRecyclerView);
        b0h.H(linearLayout, new o(3, (Continuation) null, 12));
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        ((EndlessRecyclerView) this.o.getValue(this, x[0])).setAdapter((tyc) null);
        super.onDestroyView(view);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        etc etc = c0().X;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new g0e((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new h0e((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
