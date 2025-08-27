package defpackage;

import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.reflect.KProperty;

/* renamed from: iac  reason: default package */
public final class iac implements s98 {
    public static final String A0;
    public static final /* synthetic */ KProperty[] z0;
    public final hs7 X;
    public final hs7 Y;
    public final hs7 Z;
    public final lfd a;
    public final lfd b;
    public final hs7 c;
    public final hs7 o;
    public final hs7 v;
    public final hs7 v0;
    public final hs7 w;
    public final hs7 w0;
    public final hs7 x;
    public final hs7 x0;
    public final hs7 y;
    public final ifg y0 = new ifg();
    public final hs7 z;

    static {
        Class<iac> cls = iac.class;
        z0 = new KProperty[]{wj6.p(cls, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), wj6.p(cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0), wj6.p(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0), wj6.p(cls, "messagesNotificationDispatcher", "getMessagesNotificationDispatcher()Lru/ok/tamtam/android/notifications/DebounceNotificationDispatcher;", 0), wj6.p(cls, "taskMonitor", "getTaskMonitor()Lone/me/sdk/tasks/TaskMonitor;", 0), wj6.p(cls, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0), wj6.p(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0), wj6.p(cls, "devicePowerManagerAnalytics", "getDevicePowerManagerAnalytics()Lru/ok/tamtam/android/notifications/messages/DevicePowerManagerAnalytics;", 0), wj6.p(cls, "fcmNotificationsRepository", "getFcmNotificationsRepository()Lru/ok/tamtam/android/notifications/messages/newpush/fcm/storage/FcmNotificationsRepository;", 0), wj6.p(cls, "notificationsTracker", "getNotificationsTracker()Lru/ok/tamtam/android/notifications/messages/tracker/NotificationsTracker;", 0), wj6.p(cls, "notificationsSelfReadMarkChangedListener", "getNotificationsSelfReadMarkChangedListener()Lru/ok/tamtam/readmarks/NotificationsSelfReadMarkChangedListener;", 0), wj6.p(cls, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0), wj6.p(cls, "pushWakelockLogic", "getPushWakelockLogic()Lru/ok/tamtam/android/notifications/PushWakelockLogic;", 0)};
        A0 = cls.getName();
    }

    public iac(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78, hs7 hs79, hs7 hs710, lfd lfd, lfd lfd2, hs7 hs711, hs7 hs712, hs7 hs713) {
        this.a = lfd;
        this.b = lfd2;
        this.c = hs7;
        this.o = hs72;
        this.v = hs73;
        this.w = hs74;
        this.x = hs75;
        this.y = hs76;
        this.z = hs77;
        this.X = hs78;
        this.Y = hs79;
        this.Z = hs710;
        this.v0 = hs711;
        this.w0 = hs712;
        this.x0 = hs713;
    }

    public final void a() {
        this.y0.d();
    }

    public final nh3 b() {
        KProperty kProperty = z0[0];
        return (nh3) this.c.get();
    }

    public final boolean c() {
        KProperty kProperty = z0[1];
        if (((fn4) this.o.get()).d() || b().f()) {
            return true;
        }
        return (!b().e() || !b().a().f()) && !b().d();
    }

    public final boolean d(long j, long j2) {
        KProperty kProperty = z0[11];
        zq0 d = ((doa) this.w0.get()).d();
        boolean z2 = d.b;
        boolean z3 = d.a;
        if (z3 && !z2) {
            return false;
        }
        z68.p(A0, "onMessagePush: skipped (authorized=" + z3 + ", external=" + z2 + "), chatServerId=" + j + ", messageId=" + j2);
        return true;
    }

    public final void g(mj5 mj5, cj5 cj5) {
        long j = mj5.a;
        long j2 = mj5.b;
        if (!d(j, j2)) {
            z68.c(A0, "onMessagePush: chatServerId=" + j + ", messageId=" + j2, new Object[0]);
            KProperty kProperty = z0[8];
            xa3 i = new na3(4, ((rj5) this.Y.get()).a.n().i(mz4.c), new ch2(9, mj5)).l(this.a).i(this.b);
            na3 na3 = new na3(new qa3(1, new r99(this, mj5, cj5, 3)).h(sq6.w));
            ao1 ao1 = new ao1(0, sx6.x, new p00(16, this, mj5));
            Objects.requireNonNull(ao1, "observer is null");
            try {
                i.j(new ao1(1, ao1, na3));
                this.y0.a(ao1);
                h(false, c());
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                hd8.Z(th);
                n54.D(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public final void h(boolean z2, boolean z3) {
        z68.c(A0, "onPush: callPush=" + z2 + ", forceConnection=" + z3, new Object[0]);
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[2];
        hs7 hs7 = this.v;
        ((ltb) ((jtb) hs7.get())).a.k("app.last.firebase_push_time", Long.valueOf(System.currentTimeMillis()));
        if (z3) {
            KProperty kProperty2 = kPropertyArr[2];
            ((ltb) ((jtb) hs7.get())).a.w(true);
            KProperty kProperty3 = kPropertyArr[6];
            KProperty kProperty4 = kPropertyArr[1];
            ((jna) ((rl) this.z.get())).O(((fn4) this.o.get()).d());
            KProperty kProperty5 = kPropertyArr[4];
            ((bef) this.x.get()).a();
        }
        KProperty kProperty6 = kPropertyArr[5];
        ((nd) this.y.get()).e("ACTION_FCM_PUSH");
        KProperty kProperty7 = kPropertyArr[7];
        mn4 mn4 = (mn4) this.X.get();
        if (mn4.c.d()) {
            z68.c("mn4", "onPush: skip, app is visible", new Object[0]);
            return;
        }
        z68.c("mn4", "onPush: schedule, call=%b", Boolean.valueOf(z2));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mn4.b.d(new ln4(mn4, SystemClock.elapsedRealtime(), z2), (long) 6000, timeUnit);
    }
}
