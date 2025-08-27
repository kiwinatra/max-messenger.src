package one.me.notifications.settings.screens.other;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/other/OtherNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOtherNotificationsSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherNotificationsSettingsScreen.kt\none/me/notifications/settings/screens/other/OtherNotificationsSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,99:1\n235#2,10:100\n410#2,8:111\n24#3:110\n*S KotlinDebug\n*F\n+ 1 OtherNotificationsSettingsScreen.kt\none/me/notifications/settings/screens/other/OtherNotificationsSettingsScreen\n*L\n32#1:100,10\n95#1:111,8\n85#1:110\n*E\n"})
@SuppressLint({"ValidController"})
public final class OtherNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ KProperty[] w;
    public final yh7 a = yh7.d;
    public final Lazy b = createViewModelLazy(s5b.class, new zfa(2, new pna(28)));
    public final k1e c = new k1e(new ch2(21, this), rfa.a.getExecutors().a());
    public final sn0 o = binding(new p5b(this, 0));
    public final sn0 v = binding(new p5b(this, 1));

    static {
        Class<OtherNotificationsSettingsScreen> cls = OtherNotificationsSettingsScreen.class;
        w = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public OtherNotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(rwa.p);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = (float) 12;
        linearLayout.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        KProperty[] kPropertyArr = w;
        KProperty kProperty = kPropertyArr[0];
        linearLayout.addView((h3b) this.o.getValue());
        KProperty kProperty2 = kPropertyArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.v.getValue());
        b0h.H(linearLayout, new o(3, (Continuation) null, 8));
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(ct.k(((s5b) this.b.getValue()).w, getViewLifecycleOwner().getLifecycle(), iu7.o), new q5b((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
