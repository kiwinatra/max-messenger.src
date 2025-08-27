package ru.ok.tamtam.android.services;

import android.app.RemoteInput;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/services/NotificationTamService;", "Landroid/app/Service;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationTamService extends Service {
    public static final /* synthetic */ int X = 0;
    public z9f a;
    public final Lazy b = LazyKt.lazy(new zea(this, 0));
    public final Lazy c = LazyKt.lazy(new zea(this, 1));
    public final Lazy o = LazyKt.lazy(new zea(this, 2));
    public final Lazy v = LazyKt.lazy(new zea(this, 3));
    public final Lazy w = LazyKt.lazy(new zea(this, 4));
    public final Lazy x = LazyKt.lazy(new zea(this, 5));
    public final Lazy y = LazyKt.lazy(new zea(this, 6));
    public final Lazy z = LazyKt.lazy(new zea(this, 7));

    public static final void a(long j, CharSequence charSequence, NotificationTamService notificationTamService, long j2) {
        if (j2 == 0) {
            z68.g("ru.ok.tamtam.android.services.NotificationTamService", "directReply: failed to send message, no chat in cache for chatServerId=%d", Long.valueOf(j));
            return;
        }
        mvd b2 = new kvd(j2, charSequence.toString(), true, CollectionsKt.emptyList()).b();
        z9f z9f = notificationTamService.a;
        if (z9f == null) {
            z9f = null;
        }
        ((sjd) z9f).A().a(b2);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = o5a.R(getApplicationContext());
    }

    public final void onDestroy() {
        super.onDestroy();
        z68.c("ru.ok.tamtam.android.services.NotificationTamService", "onDestroy", new Object[0]);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        long j;
        Intent intent2 = intent;
        if (intent2 == null) {
            return 2;
        }
        long longExtra = intent2.getLongExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", -1);
        String action = intent.getAction();
        if (action == null) {
            return 2;
        }
        switch (action.hashCode()) {
            case -929068635:
                Object obj = "trid";
                Object obj2 = "eKey";
                String str = ", eventKey=";
                Object obj3 = "p_op";
                String str2 = "Action";
                if (!action.equals("ru.ok.tamtam.action.DIRECT_REPLY") || longExtra == -1) {
                    return 2;
                }
                long longExtra2 = intent2.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0);
                String stringExtra = intent2.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY");
                intent2.getLongExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", -1);
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                CharSequence charSequence = resultsFromIntent == null ? null : resultsFromIntent.getCharSequence("ru.ok.tamtam.extra.TEXT_REPLY");
                CharSequence trim = charSequence != null ? StringsKt.trim(charSequence) : null;
                if (trim == null || trim.length() == 0) {
                    ((qwa) this.o.getValue()).d(SetsKt.setOf(Long.valueOf(longExtra)));
                    iga c2 = ((hga) this.y.getValue()).c();
                    c2.getClass();
                    String str3 = iga.d;
                    z68.c(str3, "onNotificationQuickRepliedWithEmptyText: pushId=" + longExtra2 + str + stringExtra, new Object[0]);
                    if (stringExtra == null) {
                        return 2;
                    }
                    try {
                        c2.b().a(str2, MapsKt.mapOf(TuplesKt.to(obj, Long.valueOf(longExtra2)), TuplesKt.to(obj2, stringExtra), TuplesKt.to(obj3, "n_q_rep_empty")));
                        return 2;
                    } catch (Exception e) {
                        z68.f(str3, "onNotificationQuickRepliedWithEmptyText: failed", e);
                        ((uta) c2.c()).c(new Exception("failed log quick reply empty text", e), true);
                        return 2;
                    }
                } else {
                    if (!((r62) this.v.getValue()).i) {
                        j = longExtra2;
                        xfd.b().c(new ca2((Object) this, longExtra, (Object) charSequence, 3));
                    } else {
                        j = longExtra2;
                        a32 D = ((r62) this.v.getValue()).D(longExtra);
                        a(longExtra, charSequence, this, D != null ? D.a : 0);
                    }
                    iga c3 = ((hga) this.y.getValue()).c();
                    c3.getClass();
                    StringBuilder sb = new StringBuilder("onNotificationQuickReplied: chatServerId=");
                    long j2 = j;
                    sb.append(j2);
                    sb.append(", lastMessage=");
                    sb.append(stringExtra);
                    String sb2 = sb.toString();
                    String str4 = iga.d;
                    z68.c(str4, sb2, new Object[0]);
                    if (stringExtra == null) {
                        return 2;
                    }
                    try {
                        c3.b().a(str2, MapsKt.mapOf(TuplesKt.to(obj, Long.valueOf(j2)), TuplesKt.to(obj2, stringExtra), TuplesKt.to(obj3, "n_q_rep")));
                        return 2;
                    } catch (Exception e2) {
                        z68.f(str4, "onNotificationQuickReplied: failed", e2);
                        ((uta) c3.c()).c(new Exception("failed to log quick replied for chat", e2), true);
                        return 2;
                    }
                }
            case -822886915:
                if (!action.equals("ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED") || longExtra == -1) {
                    return 2;
                }
                long longExtra3 = intent2.getLongExtra("ru.ok.tamtam.extra.MARK", -1);
                long longExtra4 = intent2.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0);
                String stringExtra2 = intent2.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY");
                qfa qfa = (qfa) this.z.getValue();
                qfa.getClass();
                z68.c(qfa.z, "onNotificationsSelfReadMarkChanged: chatServerId=%d, mark=%d", Long.valueOf(longExtra), Long.valueOf(longExtra3));
                wbe b2 = qfa.b(longExtra, longExtra3);
                String str5 = "Action";
                Object obj4 = "p_op";
                ur1 ur1 = r5;
                Object obj5 = "trid";
                Object obj6 = "eKey";
                ur1 ur12 = new ur1(qfa, longExtra, longExtra3);
                qa3 qa3 = new qa3(3, new tbe(b2, ur1, 3));
                KProperty kProperty = qfa.y[1];
                xa3 l = qa3.l((lfd) qfa.b.get());
                ao1 ao1 = new ao1(0, new yl4(longExtra, 10), m58.e);
                l.j(ao1);
                qfa.x.a(ao1);
                iga c4 = ((hga) this.y.getValue()).c();
                c4.getClass();
                String str6 = iga.d;
                z68.c(str6, "onNotificationCancelledBundledChat: pushId=" + longExtra4 + ", eventKey=" + stringExtra2, new Object[0]);
                if (stringExtra2 == null) {
                    return 2;
                }
                try {
                    c4.b().a(str5, MapsKt.mapOf(TuplesKt.to(obj5, Long.valueOf(longExtra4)), TuplesKt.to(obj6, stringExtra2), TuplesKt.to(obj4, "n_canceled_ch")));
                    return 2;
                } catch (Exception e3) {
                    z68.f(str6, "onNotificationCancelledBundledChat: failed", e3);
                    ((uta) c4.c()).c(new Exception("failed to log mark as read chat", e3), true);
                    return 2;
                }
            case 426083642:
                if (!action.equals("ru.ok.tamtam.action.NOTIF_CANCEL")) {
                    return 2;
                }
                ((ltb) ((jtb) this.b.getValue())).a.i("notif.isVisible", false);
                iga c5 = ((hga) this.y.getValue()).c();
                c5.getClass();
                String str7 = iga.d;
                z68.c(str7, "onNotificationCancelled", new Object[0]);
                try {
                    c5.b().a("Action", MapsKt.mapOf(TuplesKt.to("p_op", "n_canceled")));
                    return 2;
                } catch (Exception e4) {
                    z68.f(str7, "onNotificationMarkAsRead: failed", e4);
                    ((uta) c5.c()).c(new Exception("failed to log mark as read", e4), true);
                    return 2;
                }
            case 1008773314:
                if (!action.equals("ru.ok.tamtam.action.MARK_AS_READ") || longExtra == -1) {
                    return 2;
                }
                long longExtra5 = intent2.getLongExtra("ru.ok.tamtam.extra.PUSH_ID", 0);
                String stringExtra3 = intent2.getStringExtra("ru.ok.tamtam.extra.EVENT_KEY");
                long longExtra6 = intent2.getLongExtra("ru.ok.tamtam.extra.MARK", -1);
                long longExtra7 = intent2.getLongExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", -1);
                boolean z2 = ((r62) this.v.getValue()).D(longExtra) == null;
                afa afa = r1;
                afa afa2 = new afa(this, longExtra, longExtra6, longExtra7, z2, longExtra5, stringExtra3, (Continuation) null);
                ev0.v((d14) this.c.getValue(), (CoroutineContext) null, (f14) null, afa, 3);
                return 2;
            default:
                return 2;
        }
    }
}
