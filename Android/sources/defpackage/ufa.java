package defpackage;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ufa  reason: default package */
public final /* synthetic */ class ufa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    public /* synthetic */ ufa(NotificationsSettingsScreen notificationsSettingsScreen, int i) {
        this.a = i;
        this.b = notificationsSettingsScreen;
    }

    public final Object invoke() {
        NotificationsSettingsScreen notificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = NotificationsSettingsScreen.Y;
                h3b d = o54.d(notificationsSettingsScreen.getContext(), (AttributeSet) null);
                d.setId(rwa.x);
                d.setForm(z2b.a);
                d.setTitle(swa.r);
                d.setLeftActions(new p2b(new oo9(3)));
                return d;
            case 1:
                KProperty[] kPropertyArr2 = NotificationsSettingsScreen.Y;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(rwa.u);
                endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter(new rd3(notificationsSettingsScreen.x, notificationsSettingsScreen.v));
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.j(new mnd(fu4.k.e(endlessRecyclerView2.getContext()).f(), new g18(28, endlessRecyclerView2, notificationsSettingsScreen), (h9) null, 12));
                endlessRecyclerView2.j(new jz0(3));
                return endlessRecyclerView2;
            default:
                KProperty[] kPropertyArr3 = NotificationsSettingsScreen.Y;
                OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(rwa.v);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                float f = (float) 12;
                layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setAppearance(xpa.b);
                oneMeButton.setSize(aqa.b);
                oneMeButton.setMode(zpa.c);
                oneMeButton.setText(swa.p);
                ct.G(oneMeButton, 300, new u99(9, (Object) notificationsSettingsScreen));
                return oneMeButton;
        }
    }
}
