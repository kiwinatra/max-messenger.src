package defpackage;

import android.app.Application;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.settings.SettingsListScreen;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.StartConversationScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* renamed from: red  reason: default package */
public final /* synthetic */ class red implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ red(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<gaf> cls = gaf.class;
        switch (this.a) {
            case 0:
                return new zed();
            case 1:
                KProperty[] kPropertyArr = ScheduledSendPickerViewModel.q;
                return hd8.D(0);
            case 2:
                KProperty[] kPropertyArr2 = ScheduledSendPickerViewModel.q;
                return hd8.I(0);
            case 3:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1));
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Pattern.compile("^([0-9]+)X([0-9]+)");
            case 8:
                return new c3c(lxa.H, (ogf) null, 6);
            case 9:
                KProperty[] kPropertyArr3 = ServerHostBottomSheet.E0;
                return new c37();
            case 10:
                KProperty[] kPropertyArr4 = ServerPortBottomSheet.z0;
                return new wrb();
            case 11:
                KProperty[] kPropertyArr5 = SettingMediaScreen.w;
                return jgd.SETTINGS_MEDIA;
            case 12:
                KProperty[] kPropertyArr6 = SettingMediaScreen.w;
                l2e l2e = l2e.a;
                return new jzd(l2e.getAccessor().h(cls), l2e.getAccessor().h(pid.class), l2e.getAccessor().h(rk.class));
            case 13:
                KProperty[] kPropertyArr7 = SettingsBlacklistScreen.x;
                e3e e3e = e3e.a;
                return new n0e(new jp0(e3e.getAccessor().h(sv0.class), e3e.c()));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new u2g(300);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new u2g(300);
            case 16:
                return CollectionsKt.listOf(gyd.DEV_MENU);
            case LangUtils.HASH_SEED:
                return CollectionsKt.listOf(gyd.APPEARANCE);
            case 18:
                return CollectionsKt.listOf(gyd.ESIA_CONNECT);
            case 19:
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(gyd.SUPPORT);
                createListBuilder.add(gyd.ABOUT);
                return CollectionsKt.build(createListBuilder);
            case 20:
                List createListBuilder2 = CollectionsKt.createListBuilder();
                createListBuilder2.add(gyd.BATTERY);
                createListBuilder2.add(gyd.STORAGE);
                return CollectionsKt.build(createListBuilder2);
            case 21:
                KProperty[] kPropertyArr8 = SettingsListScreen.y0;
                v1e v1e = v1e.a;
                return new wyd(v1e.getAccessor().h(jtb.class), v1e.getAccessor().h(mbf.class), (vpa) v1e.getAccessor().g(vpa.class), (qq6) v1e.getAccessor().g(qq6.class), (u1c) v1e.getAccessor().g(u1c.class), v1e.getAccessor().h(cls), v1e.getAccessor().h(edb.class), v1e.getAccessor().h(Application.class), v1e.getAccessor().h(po5.class), v1e.getAccessor().h(rl.class), (eu3) v1e.getAccessor().h(eu3.class).getValue(), v1e.getAccessor().h(qx2.class));
            case 22:
                int i = SetupPinCodeScreen.o;
                return new d4e();
            case 23:
                KProperty[] kPropertyArr9 = ShareDataPickerScreen.A0;
                return new sr8((uq7) null, 15);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return CollectionsKt.listOf("", "Нажмите еще раз чтобы увидеть анекдот", "\"Едет отец с сыном на девятке. Перевернулись. Дальше едут на шестерке.\"", "Анекдотов больше нет :c");
            case 25:
                return ct.h;
            case 26:
                return new ConcurrentHashMap();
            case 27:
                return new AccelerateDecelerateInterpolator();
            case 28:
                return new k41(2);
            default:
                KProperty[] kPropertyArr10 = StartConversationScreen.E0;
                return jgd.CREATE_CHAT;
        }
    }

    public /* synthetic */ red(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = 0;
    }
}
