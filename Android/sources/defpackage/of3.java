package defpackage;

import android.view.View;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.DevMenuScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.messages.gallery.GalleryViewModel;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: of3  reason: default package */
public final /* synthetic */ class of3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ of3(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return n79.C(((TamErrorException) obj).a);
            case 1:
                k2b k2b = (k2b) obj;
                k2b.getIcon().getClass();
                k2b.getIcon().getClass();
                return new k2g(-1, -16745729);
            case 2:
                if (((wk3) obj) == wk3.o) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                if (((wk3) obj) == wk3.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return Boolean.valueOf(((zs3) obj).b);
            case 5:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 7:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof q04) {
                    return (q04) element;
                }
                return null;
            case 8:
                View view = (View) obj;
                int i = DevMenuScreen.z;
                vm4.b.W0().d();
                return Unit.INSTANCE;
            case 9:
                View view2 = (View) obj;
                KProperty[] kPropertyArr = DialogNotificationsSettingsScreen.w;
                wea.b.W0().d();
                return Unit.INSTANCE;
            case 10:
                if (((ta9) obj).c == sa9.w) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                Map map = ((ta9) obj).f;
                Object obj2 = map != null ? map.get("url") : null;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                return null;
            case 12:
                return obj;
            case 13:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof x95) {
                    return (x95) element2;
                }
                return null;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ThreadsKt.thread$default(true, true, (ClassLoader) null, wj6.h(la5.X.getAndIncrement(), "service-watchdog-"), 0, new ha5((Runnable) obj, 0), 20, (Object) null);
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                if (((mj5) obj).f != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                return Long.valueOf(((mj5) obj).f);
            case LangUtils.HASH_SEED /*17*/:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 18:
                return obj;
            case 19:
                return (CharSequence) ((Pair) obj).getSecond();
            case 20:
                x16 x16 = (x16) obj;
                return Unit.INSTANCE;
            case 21:
                x16 x162 = (x16) obj;
                m58 m58 = x162.b;
                boolean z2 = m58 instanceof s67;
                String str = x162.c;
                if (z2 && str.length() == 0) {
                    return ((s67) m58).k;
                }
                if (!z2) {
                    return str;
                }
                s67 s67 = (s67) m58;
                if (s67.k.length() <= 0) {
                    return str;
                }
                return s67.k + " " + str;
            case 22:
                return Boolean.valueOf(((w16) obj).d);
            case 23:
                w16 w16 = (w16) obj;
                return new iqd(w16.a, w16.b, w16.e);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                View view3 = (View) obj;
                mt7.n1();
                return null;
            case 25:
                z68.f(GalleryViewModel.T, "CoroutineExceptionHandler got throwable", (Throwable) obj);
                return Unit.INSTANCE;
            case 26:
                return Boolean.valueOf(!(((gz6) obj) instanceof fz6));
            case 27:
                return Long.valueOf(((gz6) obj).getId());
            case 28:
                OneMeButton oneMeButton = (OneMeButton) obj;
                KProperty[] kPropertyArr2 = InputNameScreen.z0;
                oneMeButton.setText(nlc.oneme_login_input_name_continue_button_disabled);
                oneMeButton.setMode(zpa.a);
                oneMeButton.setAppearance(xpa.o);
                oneMeButton.setSize(aqa.c);
                oneMeButton.setEnabled(false);
                return Unit.INSTANCE;
            default:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                KProperty[] kPropertyArr3 = InputNameScreen.z0;
                oneMeButton2.setId(xgc.oneme_login_input_name_continue_btn);
                oneMeButton2.setText(nlc.oneme_login_input_name_continue_button_active);
                oneMeButton2.setMode(zpa.a);
                oneMeButton2.setAppearance(xpa.o);
                oneMeButton2.setSize(aqa.c);
                oneMeButton2.setEnabled(true);
                return Unit.INSTANCE;
        }
    }
}
