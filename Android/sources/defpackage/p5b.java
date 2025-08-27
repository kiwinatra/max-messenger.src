package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: p5b  reason: default package */
public final /* synthetic */ class p5b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OtherNotificationsSettingsScreen b;

    public /* synthetic */ p5b(OtherNotificationsSettingsScreen otherNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = otherNotificationsSettingsScreen;
    }

    public final Object invoke() {
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = OtherNotificationsSettingsScreen.w;
                h3b d = o54.d(otherNotificationsSettingsScreen.getContext(), (AttributeSet) null);
                d.setId(rwa.t);
                d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                d.setForm(z2b.a);
                d.setTitle(swa.o);
                d.setLeftActions(new p2b(new oo9(17)));
                return d;
            default:
                KProperty[] kPropertyArr2 = OtherNotificationsSettingsScreen.w;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(otherNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(rwa.r);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(otherNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new mnd(fu4.k.e(endlessRecyclerView2.getContext()).f(), new q0a(28), (h9) null, 12));
                endlessRecyclerView2.j(new cl2(1));
                return endlessRecyclerView2;
        }
    }
}
