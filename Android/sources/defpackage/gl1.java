package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gl1  reason: default package */
public final /* synthetic */ class gl1 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gl1(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((k2b) obj).getIcon().e);
            case 1:
                k2b k2b = (k2b) obj;
                k2b.getIcon().getClass();
                k2b.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 2:
                ((Long) obj).longValue();
                KProperty[] kPropertyArr = ChangeOwnerScreen.X;
                return CollectionsKt.emptyList();
            case 3:
                return Integer.valueOf(((k2b) obj).getIcon().i);
            case 4:
                k2b k2b2 = (k2b) obj;
                k2b2.getIcon().getClass();
                k2b2.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 5:
                return Long.valueOf(((b89) obj).a);
            case 6:
                return Integer.valueOf(((k2b) obj).getText().g);
            case 7:
                return Integer.valueOf(((k2b) obj).getText().g);
            case 8:
                return new k2g(0, ((k2b) obj).getIcon().a.c);
            case 9:
                return Integer.valueOf(((k2b) obj).getText().g);
            case 10:
                return Integer.valueOf(((k2b) obj).getIcon().i);
            case 11:
                return Integer.valueOf(((k2b) obj).getText().g);
            case 12:
                return Integer.valueOf(((k2b) obj).getText().f);
            case 13:
                View view = (View) obj;
                KProperty[] kPropertyArr2 = ChatMediaTabWidget.Z;
                r4c.b.t1();
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                w62 w62 = (w62) obj;
                z62 z62 = w62.r;
                if (z62 == null) {
                    z62 = z62.g;
                }
                y62 a2 = z62.a();
                a2.c = 0;
                w62.r = a2.a();
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Long.valueOf(((a32) obj).b.a);
            case 16:
                bd9 bd9 = (bd9) obj;
                return new jga(bd9.c, bd9.e, bd9.i, hx4.DO_NOT_DISTURB_MODE);
            case LangUtils.HASH_SEED /*17*/:
                View view2 = (View) obj;
                KProperty[] kPropertyArr3 = ChatNotificationsSettingsScreen.w;
                wea.b.W0().d();
                return Unit.INSTANCE;
            case 18:
                k2b k2b3 = (k2b) obj;
                KProperty[] kPropertyArr4 = ChatScreen.d1;
                k2b3.a().l().c.getClass();
                return new k2g(-1, k2b3.a().l().c.a);
            case 19:
                return vzg.y((String) obj);
            case 20:
                if (((xk2) obj).z0 != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                a32 a32 = (a32) obj;
                m72 m72 = a32.b;
                if ((m72.b != l72.c && m72.a == 0 && m72.j == 0 && m72.f0 == null) || a32.H() || (a32.b.H.g && a32.c == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                View view3 = (View) obj;
                KProperty[] kPropertyArr5 = ChatsListSearchScreen.F0;
                return Unit.INSTANCE;
            case 23:
                return ((xk2) obj).A0;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Boolean.valueOf(((a32) obj).O());
            case 25:
                View view4 = (View) obj;
                KProperty[] kPropertyArr6 = ChatsTabWidget.z0;
                ox2.b.W0().b(":start-conversation", (Bundle) null);
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 27:
                String str = (String) obj;
                return Unit.INSTANCE;
            case 28:
                z68.f("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj));
                return Unit.INSTANCE;
            default:
                z68.f("OneMeExecutors", "hanged threads", new ThreadExecutorStuckException((Collection) obj));
                return Unit.INSTANCE;
        }
    }
}
