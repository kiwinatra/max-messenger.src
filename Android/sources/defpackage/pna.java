package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.rlottie.RLottie;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;
import ru.ok.tamtam.nano.Protos;

/* renamed from: pna  reason: default package */
public final /* synthetic */ class pna implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ pna(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: type inference failed for: r12v133, types: [java.lang.Object, wpc] */
    public final Object invoke() {
        Class<ipg> cls = ipg.class;
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = OneMeApplication.X;
                ba7 ba7 = (ba7) qra.a.getAccessor().g(ba7.class);
                return Unit.INSTANCE;
            case 1:
                int i3 = OneMeApplication.X;
                qra qra = qra.a;
                ng0 ng0 = (ng0) qra.getAccessor().g(ng0.class);
                bs0.K(new ps5(new wb(2, new pc(new ps5(((wi0) ng0.c).b(), new SuspendLambda(2, (Continuation<Object>) null)), 4), ng0), new mg0(ng0, (Continuation) null), 5), ng0.o);
                ((c8e) qra.getAccessor().g(c8e.class)).d();
                return Unit.INSTANCE;
            case 2:
                int i4 = OneMeApplication.X;
                ay6 ay6 = (ay6) sjd.a.getAccessor().g(ay6.class);
                ay6.getClass();
                icb icb = (icb) ((hcb) new hcb(HeartbeatScheduler$TaskHeartbeatWorker.class, 15, TimeUnit.MINUTES).addTag("HEART_BEAT")).build();
                z68.c("ay6", "work %s try to add %s request", icb.getId(), "HEART_BEAT");
                ipg.e(ay6.a, "HEART_BEAT", 2, icb, true, 8);
                return Unit.INSTANCE;
            case 3:
                int i5 = OneMeApplication.X;
                p9a p9a = h3b.E0;
                akd c = ktb.a.c();
                c.getClass();
                boolean m = c.m(PmsKey.f87newtoolbarenabled, false);
                p9a.getClass();
                h3b.G0 = m;
                return Unit.INSTANCE;
            case 4:
                int i6 = OneMeApplication.X;
                opa opa = (opa) qra.a.getAccessor().g(opa.class);
                a33 a33 = (a33) opa.b;
                String string = a33.g.getString("version.force.update.received", "");
                opa.d.getClass();
                if (!Intrinsics.areEqual((Object) string, (Object) "25.6.4")) {
                    a33.l("version.force.update.received", (String) null);
                }
                return Unit.INSTANCE;
            case 5:
                int i7 = OneMeApplication.X;
                ((vpa) qra.a.getAccessor().g(vpa.class)).getClass();
                return Boolean.FALSE;
            case 6:
                int i8 = OneMeApplication.X;
                sjd sjd = sjd.a;
                sjd.i().d();
                sjd.g().f();
                return Unit.INSTANCE;
            case 7:
                int i9 = OneMeApplication.X;
                Lazy lazy = LazyKt.lazy(new pna(13));
                int i10 = ev0.l;
                ConcurrentComponent.INSTANCE.getExecutors().b().submit(new o99(18, lazy));
                return Unit.INSTANCE;
            case 8:
                int i11 = OneMeApplication.X;
                ipg ipg = (ipg) sjd.a.getAccessor().g(cls);
                h2g.a.d().getClass();
                z68.p("SendUnsentCrashReportsWorker", "schedule not scheduling, send unsent reports disabled!");
                return Unit.INSTANCE;
            case 9:
                int i12 = OneMeApplication.X;
                Regex regex = DailyAnalyticsWorker.y;
                icb icb2 = (icb) ((hcb) ((hcb) new hcb(DailyAnalyticsWorker.class, 1, TimeUnit.DAYS).setConstraints(new wj3(1, false, false, false, false, -1, -1, CollectionsKt.toSet(new LinkedHashSet())))).addTag("ru.ok.messages.analytics.DailyAnalyticsWorker")).build();
                UUID id = icb2.getId();
                z68.c("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id + " try to add ru.ok.messages.analytics.DailyAnalyticsWorker request", new Object[0]);
                ipg.e((ipg) sjd.a.getAccessor().g(cls), "ru.ok.messages.analytics.DailyAnalyticsWorker", 2, icb2, false, 24);
                return Unit.INSTANCE;
            case 10:
                int i13 = OneMeApplication.X;
                ffa ffa = (ffa) sjd.a.getAccessor().g(ffa.class);
                ffa.getClass();
                z68.c("ffa", "schedule task", new Object[0]);
                TimeUnit timeUnit = TimeUnit.DAYS;
                ipg.e(ffa.a, "ffa", 2, (icb) ((hcb) ((hcb) new hcb(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class, 7, timeUnit).setInitialDelay(7, timeUnit)).addTag("ffa")).build(), true, 8);
                return Unit.INSTANCE;
            case 11:
                int i14 = OneMeApplication.X;
                ((uq7) qra.a.getAccessor().g(uq7.class)).a();
                return Unit.INSTANCE;
            case 12:
                int i15 = OneMeApplication.X;
                if (QrCodeGenerator.b) {
                    QrCodeGenerator.a.getClass();
                    z68.c("QrCodeGenerator", "Native library (qrcode) was successfully loaded", new Object[0]);
                }
                return Unit.INSTANCE;
            case 13:
                int i16 = OneMeApplication.X;
                return (s48) qra.a.getAccessor().g(s48.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i17 = OneMeApplication.X;
                RLottie.init((RLottie.Config) qra.a.getAccessor().g(RLottie.Config.class));
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int i18 = OneMeApplication.X;
                k45 k45 = (k45) qra.a.getAccessor().g(k45.class);
                v25 v25 = (v25) k45.b.getValue();
                m35 m35 = (m35) k45.e.getValue();
                int lastIndex = ArraysKt.getLastIndex((T[]) (Bitmap[]) m35.a.b);
                if (lastIndex >= 0) {
                    while (true) {
                        m35.g.computeIfAbsent(Integer.valueOf(i), new yi(9, new j9(m35, i, 2)));
                        if (i != lastIndex) {
                            i++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 16:
                int i19 = OneMeApplication.X;
                gk gkVar = (gk) qra.a.getAccessor().g(gk.class);
                aje v = ev0.v(gkVar.j, (CoroutineContext) null, f14.b, new ek(gkVar, (Continuation) null), 1);
                gkVar.k.setValue(gkVar, gk.p[0], v);
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED /*17*/:
                return new woa("", "", voa.b, uoa.n, (Drawable) null, (Drawable) null);
            case 18:
                return mzf.c(cad.T1).toString();
            case 19:
                bi4 bi4 = dq4.a;
                return lc8.a;
            case 20:
                return new ysa(999, ead.m0, Integer.valueOf(cad.B0), "NARNIA");
            case 21:
                dle dle = new dle(20);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, dle);
                Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, new dle(21));
                return new j6f((GradientDrawable) lazy3.getValue(), (GradientDrawable) lazy2.getValue(), (GradientDrawable) lazy3.getValue(), (GradientDrawable) lazy2.getValue());
            case 22:
                dle dle2 = new dle(16);
                LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
                Lazy lazy4 = LazyKt.lazy(lazyThreadSafetyMode2, dle2);
                return new j6f((GradientDrawable) LazyKt.lazy(lazyThreadSafetyMode2, new dle(17)).getValue(), (GradientDrawable) lazy4.getValue(), (GradientDrawable) LazyKt.lazy(lazyThreadSafetyMode2, new dle(18)).getValue(), (GradientDrawable) LazyKt.lazy(lazyThreadSafetyMode2, new dle(19)).getValue());
            case 23:
                m2b.h.getClass();
                return new d2b(vo4.c().getDisplayMetrics().density * 4.0f, MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new zff(CollectionsKt.emptyList());
            case 25:
                return new LinearInterpolator();
            case 26:
                return new LinearInterpolator();
            case 27:
                ? obj = new Object();
                obj.a = new ThreadLocal();
                obj.b = new ThreadLocal();
                return obj;
            case 28:
                KProperty[] kPropertyArr = OtherNotificationsSettingsScreen.w;
                return new s5b();
            default:
                KProperty[] kPropertyArr2 = PickChatMembers.Z;
                return jgd.CREATE_CHAT_MEMBERS_PICKER;
        }
    }
}
