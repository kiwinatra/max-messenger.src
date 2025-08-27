package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.android.OneMeApplication;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: oo9  reason: default package */
public final /* synthetic */ class oo9 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ oo9() {
        this.a = 10;
        a8d a8d = a8d.a;
    }

    public final Object invoke(Object obj) {
        String str;
        boolean z = false;
        switch (this.a) {
            case 0:
                hea hea = (hea) obj;
                if (!(!hea.b || (str = hea.a) == null || str.length() == 0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((rd9) obj).b.b;
            case 2:
                if (((zs3) obj).a == xs3.v) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                View view = (View) obj;
                KProperty[] kPropertyArr = NotificationsSettingsScreen.Y;
                wea.b.W0().d();
                return Unit.INSTANCE;
            case 4:
                zi8 zi8 = (zi8) obj;
                int i = OneMeApplication.X;
                return "    " + zi8.a + ": executing=" + zi8.o.toMillis(zi8.c) + "ms";
            case 5:
                zi8 zi82 = (zi8) obj;
                int i2 = OneMeApplication.X;
                return "    " + zi82.a + ": waiting=" + zi82.o.toMillis(zi82.b) + "ms";
            case 6:
                zi8 zi83 = (zi8) obj;
                int i3 = OneMeApplication.X;
                String str2 = zi83.a;
                TimeUnit timeUnit = zi83.o;
                return "    " + str2 + ": executing=" + timeUnit.toMillis(zi83.c) + "ms, waiting=" + timeUnit.toMillis(zi83.b);
            case 7:
                int intValue = ((Integer) obj).intValue();
                return Integer.valueOf(intValue != 0 ? intValue != 1 ? 10 : 15 : 18);
            case 8:
                Long l = (Long) obj;
                return cvg.a();
            case 9:
                View view2 = (View) obj;
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() == 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new mag(0, viewGroup);
                }
                return null;
            case 10:
                View view3 = (View) obj;
                if (view3 instanceof ViewGroup) {
                    ((ViewGroup) view3).setOnHierarchyChangeListener(a8d.a);
                }
                return Boolean.TRUE;
            case 11:
                Collection collection = (Collection) obj;
                return Unit.INSTANCE;
            case 12:
                Collection collection2 = (Collection) obj;
                return Unit.INSTANCE;
            case 13:
                ((k2b) obj).getText().getClass();
                return -16745729;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((k2b) obj).getText().getClass();
                return -16745729;
            case 16:
                return ((pm3) obj).a();
            case LangUtils.HASH_SEED /*17*/:
                View view4 = (View) obj;
                KProperty[] kPropertyArr2 = OtherNotificationsSettingsScreen.w;
                wea.b.W0().d();
                return Unit.INSTANCE;
            case 18:
                return ((xk2) obj).A0;
            case 19:
                woa woa = (woa) obj;
                KProperty[] kPropertyArr3 = PickerChatsTabWidget.Z;
                return Boolean.FALSE;
            case 20:
                woa woa2 = (woa) obj;
                KProperty[] kPropertyArr4 = PickerChatsTabWidget2.Z;
                return Boolean.FALSE;
            case 21:
                ((Integer) obj).getClass();
                KProperty[] kPropertyArr5 = PickerContactsListWidget.x0;
                return Boolean.FALSE;
            case 22:
                Long l2 = (Long) obj;
                return f6e.a((Object) null);
            case 23:
                View view5 = (View) obj;
                KProperty[] kPropertyArr6 = ProfileInviteScreen.w;
                r4c.b.t1();
                return Unit.INSTANCE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return Integer.valueOf(((k2b) obj).getText().f);
            case 25:
                View view6 = (View) obj;
                KProperty[] kPropertyArr7 = ProfileScreen.D0;
                r4c.b.t1();
                return Unit.INSTANCE;
            case 26:
                k2b k2b = (k2b) obj;
                KProperty[] kPropertyArr8 = ProfileScreen.D0;
                k2b.getIcon().getClass();
                k2b.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 27:
                k2b k2b2 = (k2b) obj;
                KProperty[] kPropertyArr9 = ProfileScreen.D0;
                k2b2.getIcon().getClass();
                k2b2.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 28:
                return new pqc((Context) obj);
            default:
                return String.valueOf(obj);
        }
    }

    public /* synthetic */ oo9(int i) {
        this.a = i;
    }
}
