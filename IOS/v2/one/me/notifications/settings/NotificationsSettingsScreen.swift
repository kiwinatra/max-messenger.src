package one.me.notifications.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lys3;", "Lkcb;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNotificationsSettingsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsSettingsScreen.kt\none/me/notifications/settings/NotificationsSettingsScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,214:1\n235#2,10:215\n235#2,10:225\n410#2,8:235\n410#2,8:243\n410#2,8:251\n410#2,8:259\n24#3:267\n24#3:268\n*S KotlinDebug\n*F\n+ 1 NotificationsSettingsScreen.kt\none/me/notifications/settings/NotificationsSettingsScreen\n*L\n52#1:215,10\n71#1:225,10\n174#1:235,8\n182#1:243,8\n186#1:251,8\n190#1:259,8\n106#1:267\n107#1:268\n*E\n"})
@SuppressLint({"ValidController"})
public final class NotificationsSettingsScreen extends Widget implements ys3, kcb {
    public static final /* synthetic */ KProperty[] Y;
    public final sn0 X;
    public final w28 a = new w28(new h49(8), (Function0) null, 6);
    public final yh7 b = yh7.d;
    public final Lazy c = createViewModelLazy(fga.class, new zfa(0, new h49(9)));
    public final Lazy o;
    public final k1e v;
    public final Lazy w;
    public final t56 x;
    public final sn0 y;
    public final sn0 z;

    static {
        Class<NotificationsSettingsScreen> cls = NotificationsSettingsScreen.class;
        Y = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public NotificationsSettingsScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        rfa rfa = rfa.a;
        this.o = rfa.getAccessor().h(edb.class);
        this.v = new k1e(new ch2(20, this), rfa.getExecutors().a());
        this.w = createViewModelLazy(wh0.class, new zfa(1, new h49(10)));
        this.x = new t56((Object) this, rfa.getExecutors().a(), 4);
        this.y = binding(new ufa(this, 0));
        this.z = binding(new ufa(this, 1));
        this.X = binding(new ufa(this, 2));
    }

    public final void O(boolean z2) {
        if (!z2) {
            fga c0 = c0();
            Boolean bool = Boolean.TRUE;
            xme xme = c0.z;
            xme.getClass();
            xme.m((Object) null, bool);
        }
    }

    public final fga c0() {
        return (fga) this.c.getValue();
    }

    public final void f(xs3 xs3) {
        if (xs3 == xs3.v) {
            xag.h(c0().w0, tfa.b);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        fga c0 = c0();
        xme xme = c0.Z;
        Boolean valueOf = Boolean.valueOf(c0.b.c());
        xme.getClass();
        xme.m((Object) null, valueOf);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(rwa.n);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        KProperty[] kPropertyArr = Y;
        KProperty kProperty = kPropertyArr[0];
        linearLayout.addView((h3b) this.y.getValue());
        KProperty kProperty2 = kPropertyArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.z.getValue());
        KProperty kProperty3 = kPropertyArr[2];
        linearLayout.addView((OneMeButton) this.X.getValue());
        b0h.H(linearLayout, new o(3, (Continuation) null, 7));
        return linearLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            fga c0 = c0();
            boolean z2 = false;
            if (iArr[0] != 0) {
                z2 = true;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            xme xme = c0.z;
            xme.getClass();
            xme.m((Object) null, valueOf);
        }
    }

    public final void onViewCreated(View view) {
        etc etc = c0().Y;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new vfa((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new i21(((wh0) this.w.getValue()).y, c0().X, new t86(3, (Continuation) null, 2), 4), getViewLifecycleOwner().getLifecycle(), iu7), new wfa((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().y, getViewLifecycleOwner().getLifecycle(), iu7), new xfa((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().w0, getViewLifecycleOwner().getLifecycle(), iu7), new yfa((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
