package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import androidx.fragment.app.a;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import ru.ok.messages.settings.FrgAppearanceSettings;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.settings.notification.FrgNotificationSettings;
import ru.ok.messages.views.dialogs.ClearChatDialog;
import ru.ok.messages.views.dialogs.FrgDlgNightMode;
import ru.ok.messages.views.dialogs.FrgDlgNightTheme;
import ru.ok.messages.views.dialogs.FrgDlgNotification;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.InputDialog;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: w13  reason: default package */
public final /* synthetic */ class w13 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w13(a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    /* JADX WARNING: type inference failed for: r9v43, types: [l0g, java.lang.Object] */
    public final void onClick(DialogInterface dialogInterface, int i) {
        long m;
        long j;
        long j2 = -1;
        FrgNotificationSettings frgNotificationSettings = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                ClearChatDialog clearChatDialog = (ClearChatDialog) this.b;
                CheckBox checkBox = (CheckBox) clearChatDialog.W2().findViewById(lic.dialog_checkbox__checkbox);
                boolean z2 = checkBox != null && checkBox.isChecked();
                a32 a32 = (a32) this.c;
                if (a32.K() || z2) {
                    z = true;
                }
                ((qra) ((id3) clearChatDialog.E1.b)).getClass();
                sjd.a.A().a(new jud(a32.a, z));
                ((x13) clearChatDialog.b3()).y();
                return;
            case 1:
                FrgCachingSettings frgCachingSettings = (FrgCachingSettings) this.b;
                frgCachingSettings.getClass();
                int progress = ((l9e) this.c).getProgress();
                hq hqVar = frgCachingSettings.E1;
                if (progress == 0) {
                    hqVar.k("app.media.caching.limit", 536870912L);
                } else if (progress == 1) {
                    hqVar.k("app.media.caching.limit", 1073741824L);
                } else if (progress == 2) {
                    hqVar.k("app.media.caching.limit", 2147483648L);
                } else if (progress == 3) {
                    hqVar.k("app.media.caching.limit", 4294967296L);
                } else if (progress == 4) {
                    hqVar.k("app.media.caching.limit", -1L);
                }
                frgCachingSettings.k3();
                return;
            case 2:
                FrgCachingSettings frgCachingSettings2 = (FrgCachingSettings) this.b;
                frgCachingSettings2.getClass();
                CharSequence charSequence = ((CharSequence[]) this.c)[i];
                boolean equals = charSequence.equals(frgCachingSettings2.S1(qad.z4));
                hq hqVar2 = frgCachingSettings2.E1;
                if (equals) {
                    hqVar2.j(0, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.S1(qad.B4))) {
                    hqVar2.j(1, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.S1(qad.A4))) {
                    hqVar2.j(2, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.S1(qad.C4))) {
                    hqVar2.j(3, "app.media.caching.time");
                }
                frgCachingSettings2.k3();
                return;
            case 3:
                FrgCachingSettings frgCachingSettings3 = (FrgCachingSettings) this.b;
                frgCachingSettings3.getClass();
                HashSet hashSet = new HashSet();
                for (dx0 dx0 : (List) this.c) {
                    if (dx0.d) {
                        hashSet.add(dx0.b);
                    }
                }
                wx0 wx0 = frgCachingSettings3.H1;
                synchronized (wx0) {
                    if (wx0.k == null) {
                        z68.f("wx0", "onClearCacheTypesPicked: invalid state no cacheData", (Throwable) null);
                        ((FrgBase) wx0.h).a3();
                        wx0.h.r1();
                        return;
                    }
                    wx0.h.j1();
                    lja s = new oa3(4, new hb3(0, new qa3(1, new tx0(wx0, hashSet, 0)).g(new tx0(wx0, hashSet, 1)), "wx0"), new sx0(wx0, 1)).x(wx0.f).s(wx0.g);
                    or7 or7 = new or7(new sx0(wx0, 2), new sx0(wx0, 3), m58.e);
                    s.a(or7);
                    wx0.a(or7);
                    return;
                }
            case 4:
                FrgDlgNightMode frgDlgNightMode = (FrgDlgNightMode) this.b;
                frgDlgNightMode.getClass();
                CharSequence charSequence2 = (CharSequence) ((ArrayList) this.c).get(i);
                boolean equals2 = charSequence2.equals(frgDlgNightMode.S1(qad.g9));
                js9 js9 = fu4.k;
                if (equals2) {
                    FrgAppearanceSettings frgAppearanceSettings = (FrgAppearanceSettings) ((qh6) frgDlgNightMode.b3());
                    frgAppearanceSettings.n3();
                    fu4 e = js9.e(frgAppearanceSettings.O1());
                    TimeUnit timeUnit = TimeUnit.HOURS;
                    int millis = (int) timeUnit.toMillis(7);
                    Duration.Companion companion = Duration.Companion;
                    DurationUnit durationUnit = DurationUnit.MILLISECONDS;
                    e.j(new i9a(DurationKt.toDuration((int) timeUnit.toMillis(23), durationUnit), DurationKt.toDuration(millis, durationUnit)));
                    frgAppearanceSettings.Q1.F("app.night.mode.schedule");
                    frgAppearanceSettings.p3();
                    frgAppearanceSettings.o3();
                    frgAppearanceSettings.S1.j();
                    frgAppearanceSettings.S1.b(true);
                    ((qra) ym.e()).c().f("ACTION_NIGHT_MODE_CHANGED", "scheduled");
                    return;
                } else if (charSequence2.equals(frgDlgNightMode.S1(qad.c9))) {
                    FrgAppearanceSettings frgAppearanceSettings2 = (FrgAppearanceSettings) ((qh6) frgDlgNightMode.b3());
                    frgAppearanceSettings2.getClass();
                    ((ksd) ((qra) ym.e()).getAccessor().g(ksd.class)).b(frgAppearanceSettings2);
                    frgAppearanceSettings2.Q1.F("app.night.mode.auto");
                    js9.e(frgAppearanceSettings2.O1()).j(new e9a(30));
                    frgAppearanceSettings2.p3();
                    frgAppearanceSettings2.o3();
                    tcf tcf = frgAppearanceSettings2.S1;
                    if ((!tcf.b.c.w().equals("app.night.mode")) && tcf.b.c.w().equals("app.night.mode.auto")) {
                        ((ksd) tcf.x.getValue()).b(tcf);
                    }
                    frgAppearanceSettings2.S1.b(true);
                    ((qra) ym.e()).c().f("ACTION_NIGHT_MODE_CHANGED", "auto");
                    return;
                } else if (charSequence2.equals(frgDlgNightMode.S1(qad.i9))) {
                    FrgAppearanceSettings frgAppearanceSettings3 = (FrgAppearanceSettings) ((qh6) frgDlgNightMode.b3());
                    frgAppearanceSettings3.n3();
                    js9.e(frgAppearanceSettings3.O1()).j(j9a.b);
                    frgAppearanceSettings3.Q1.F("app.night.mode.system");
                    frgAppearanceSettings3.p3();
                    frgAppearanceSettings3.o3();
                    frgAppearanceSettings3.S1.j();
                    frgAppearanceSettings3.S1.b(true);
                    ((qra) ym.e()).c().f("ACTION_NIGHT_MODE_CHANGED", "system");
                    return;
                } else {
                    FrgAppearanceSettings frgAppearanceSettings4 = (FrgAppearanceSettings) ((qh6) frgDlgNightMode.b3());
                    frgAppearanceSettings4.n3();
                    js9.e(frgAppearanceSettings4.O1()).j(g9a.b);
                    frgAppearanceSettings4.Q1.F("app.night.mode");
                    frgAppearanceSettings4.p3();
                    frgAppearanceSettings4.o3();
                    tcf I = ((qra) ym.e()).I();
                    tcf tcf2 = frgAppearanceSettings4.S1;
                    I.a(tcf2.e(tcf2.g()).e, false);
                    ((qra) ym.e()).c().f("ACTION_NIGHT_MODE_CHANGED", "disabled");
                    return;
                }
            case 5:
                FrgDlgNightTheme frgDlgNightTheme = (FrgDlgNightTheme) this.b;
                rh6 rh6 = (rh6) frgDlgNightTheme.b3();
                if (rh6 != null) {
                    String str = ((scf) ((List) this.c).get(i)).e;
                    FrgAppearanceSettings frgAppearanceSettings5 = (FrgAppearanceSettings) rh6;
                    tcf tcf3 = frgAppearanceSettings5.S1;
                    tcf3.A0 = null;
                    tcf3.b.c.l("app.night.theme", str);
                    l15 l15 = (l15) fu4.k.e(tcf3.a).g;
                    SharedPreferences.Editor edit = l15.q().edit();
                    edit.putString("nighttheme", str);
                    edit.apply();
                    Unit unit = Unit.INSTANCE;
                    ((n6e) l15.b).d("nighttheme");
                    frgAppearanceSettings5.p3();
                    frgAppearanceSettings5.o3();
                    frgAppearanceSettings5.S1.b(true);
                }
                frgDlgNightTheme.T2(false, false);
                return;
            case 6:
                FrgDlgNotification frgDlgNotification = (FrgDlgNotification) this.b;
                frgDlgNotification.getClass();
                CharSequence charSequence3 = (CharSequence) ((List) this.c).get(i);
                eaf.a().getClass();
                a33 a33 = ((ltb) ((sjd) eaf.b()).u()).a;
                if (!charSequence3.equals(frgDlgNotification.S1(qad.f6))) {
                    if (charSequence3.equals(frgDlgNotification.S1(qad.W5))) {
                        m = a33.m();
                        j = 3600000;
                    } else if (charSequence3.equals(frgDlgNotification.S1(qad.X5))) {
                        m = a33.m();
                        j = 14400000;
                    } else if (charSequence3.equals(frgDlgNotification.S1(qad.V5))) {
                        m = a33.m();
                        j = 86400000;
                    } else {
                        j2 = 0;
                    }
                    j2 = m + j;
                }
                tw6 tw6 = frgDlgNotification.G0;
                if ((tw6 != null ? (FrgNotificationSettings) tw6 : null) != null) {
                    if (tw6 != null) {
                        frgNotificationSettings = (FrgNotificationSettings) tw6;
                    }
                    frgNotificationSettings.E1 = true;
                    rl e2 = ((qra) ym.e()).e();
                    ? obj = new Object();
                    obj.b = Long.valueOf(j2);
                    e2.a(new n0g(obj));
                    frgNotificationSettings.H1.k("app.notification.dontDisturbUntil", Long.valueOf(j2));
                    frgNotificationSettings.k3();
                    ((qra) ((id3) frgNotificationSettings.p1.b)).f().a().getClass();
                    ((qra) ((id3) frgNotificationSettings.p1.b)).f().b().a(1);
                    return;
                }
                return;
            case 7:
                FrgDlgStopLiveLocation frgDlgStopLiveLocation = (FrgDlgStopLiveLocation) this.b;
                frgDlgStopLiveLocation.getClass();
                ((yh6) frgDlgStopLiveLocation.b3()).k0(((a32) this.c).a);
                return;
            case 8:
                ((InputDialog) this.b).a3((TextInputEditText) this.c);
                return;
            case 9:
                b4g b4g = new b4g(((y3g[]) this.c)[i]);
                VideoCompressionModeDialog videoCompressionModeDialog = (VideoCompressionModeDialog) this.b;
                videoCompressionModeDialog.getClass();
                z68.c("ru.ok.messages.views.dialogs.VideoCompressionModeDialog", "set fragment result " + b4g, new Object[0]);
                videoCompressionModeDialog.Q1().f0("VideoCompressionModeDialog:result:request", o54.f(TuplesKt.to("VideoCompressionModeDialog:result:key", b4g)));
                return;
            default:
                ((VideoQualityPickerDialog) this.b).c3(new x7g(((uac) ((ArrayList) this.c).get(i)).a.a));
                return;
        }
    }
}
