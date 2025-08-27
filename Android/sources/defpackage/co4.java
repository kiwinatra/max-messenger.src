package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: co4  reason: default package */
public final /* synthetic */ class co4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogNotificationsSettingsScreen b;

    public /* synthetic */ co4(DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = dialogNotificationsSettingsScreen;
    }

    public final Object invoke() {
        DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = DialogNotificationsSettingsScreen.w;
                h3b d = o54.d(dialogNotificationsSettingsScreen.getContext(), (AttributeSet) null);
                d.setId(rwa.l);
                d.setForm(z2b.a);
                d.setTitle(swa.i);
                d.setLeftActions(new p2b(new of3(9)));
                return d;
            default:
                KProperty[] kPropertyArr2 = DialogNotificationsSettingsScreen.w;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(dialogNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(rwa.j);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                endlessRecyclerView2.setAdapter(dialogNotificationsSettingsScreen.c);
                endlessRecyclerView2.j(new mnd(fu4.k.e(endlessRecyclerView2.getContext()).f(), new tb4(27), (h9) null, 12));
                endlessRecyclerView2.j(new cl2(1));
                return endlessRecyclerView2;
        }
    }
}
