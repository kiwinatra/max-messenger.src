package one.me.notifications.settings.screens.dialog;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/dialog/DialogNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDialogNotificationsSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNotificationsSettingsScreen.kt\none/me/notifications/settings/screens/dialog/DialogNotificationsSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,97:1\n235#2,10:98\n410#2,8:109\n24#3:108\n*S KotlinDebug\n*F\n+ 1 DialogNotificationsSettingsScreen.kt\none/me/notifications/settings/screens/dialog/DialogNotificationsSettingsScreen\n*L\n31#1:98,10\n93#1:109,8\n83#1:108\n*E\n"})
@SuppressLint({"ValidController"})
public final class DialogNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ KProperty[] w;
    public final yh7 a = yh7.d;
    public final Lazy b = createViewModelLazy(fo4.class, new rn2(21, new qr3(13)));
    public final k1e c = new k1e(new ch2(6, this), rfa.a.getExecutors().a());
    public final sn0 o = binding(new co4(this, 0));
    public final sn0 v = binding(new co4(this, 1));

    static {
        Class<DialogNotificationsSettingsScreen> cls = DialogNotificationsSettingsScreen.class;
        w = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    public DialogNotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(rwa.i);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = (float) 12;
        linearLayout.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), 0);
        KProperty[] kPropertyArr = w;
        KProperty kProperty = kPropertyArr[0];
        linearLayout.addView((h3b) this.o.getValue());
        KProperty kProperty2 = kPropertyArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.v.getValue());
        b0h.H(linearLayout, new o(3, (Continuation) null, 3));
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        bs0.K(new ps5(ct.k(((fo4) this.b.getValue()).w, getViewLifecycleOwner().getLifecycle(), iu7.o), new do4((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
