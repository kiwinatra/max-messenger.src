package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: gl2  reason: default package */
public final /* synthetic */ class gl2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatNotificationsSettingsScreen b;

    public /* synthetic */ gl2(ChatNotificationsSettingsScreen chatNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = chatNotificationsSettingsScreen;
    }

    public final Object invoke() {
        ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatNotificationsSettingsScreen.w;
                h3b d = o54.d(chatNotificationsSettingsScreen.getContext(), (AttributeSet) null);
                d.setId(rwa.e);
                d.setForm(z2b.a);
                d.setTitle(swa.d);
                d.setLeftActions(new p2b(new gl1(17)));
                return d;
            default:
                KProperty[] kPropertyArr2 = ChatNotificationsSettingsScreen.w;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(chatNotificationsSettingsScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(rwa.c);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setOverScrollMode(2);
                k1e k1e = chatNotificationsSettingsScreen.c;
                endlessRecyclerView2.setAdapter(k1e);
                endlessRecyclerView2.j(new mnd(fu4.k.e(endlessRecyclerView2.getContext()).f(), new ms1(15, chatNotificationsSettingsScreen), (h9) null, 12));
                endlessRecyclerView2.j(new cl2(0));
                nwe nwe = new nwe(endlessRecyclerView2, k1e, new fl2(0, new wk(4, chatNotificationsSettingsScreen, endlessRecyclerView2)));
                endlessRecyclerView2.j(nwe);
                b0h.H(endlessRecyclerView2, new hl2(nwe, (Continuation) null, 0));
                return endlessRecyclerView2;
        }
    }
}
