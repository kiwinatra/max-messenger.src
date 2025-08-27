package ru.ok.messages;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;
import ru.ok.messages.TimeChangeReceiver;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.messages.controllers.NotificationDraftScheduler$TaskNotificationDraftWorker;
import ru.ok.messages.location.StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker;
import ru.ok.messages.store.SendUnsentCrashReportsWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

public final class a extends gqg {
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;

    public a(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16, Lazy lazy17) {
        this.b = lazy15;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
        this.h = lazy6;
        this.i = lazy7;
        this.j = lazy8;
        this.k = lazy9;
        this.l = lazy10;
        this.m = lazy11;
        this.n = lazy12;
        this.o = lazy13;
        this.p = lazy14;
        this.q = lazy16;
        this.r = lazy17;
    }

    public final e08 a(Context context, String str, WorkerParameters workerParameters) {
        if (Intrinsics.areEqual((Object) str, (Object) SendUnsentCrashReportsWorker.class.getName())) {
            return new SendUnsentCrashReportsWorker(context, workerParameters, this.b);
        }
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) DailyAnalyticsWorker.class.getName());
        Lazy lazy = this.d;
        if (areEqual) {
            return new DailyAnalyticsWorker(context, workerParameters, (nd) this.c.getValue(), (cq) lazy.getValue(), (rh3) this.e.getValue(), (hn4) this.f.getValue(), (cxe) this.g.getValue(), (xcb) this.r.getValue());
        }
        boolean areEqual2 = Intrinsics.areEqual((Object) str, (Object) TaskMonitor$TaskMonitorWorker.class.getName());
        Lazy lazy2 = this.h;
        if (areEqual2) {
            a33 a33 = ((ltb) ((jtb) lazy2.getValue())).a;
            return new TaskMonitor$TaskMonitorWorker(context, workerParameters, (eef) this.i.getValue(), (jbf) this.q.getValue(), (jqg) this.j.getValue(), a33);
        } else if (Intrinsics.areEqual((Object) str, (Object) HeartbeatScheduler$TaskHeartbeatWorker.class.getName())) {
            return new HeartbeatScheduler$TaskHeartbeatWorker(context, workerParameters, (yx6) this.k.getValue());
        } else {
            if (Intrinsics.areEqual((Object) str, (Object) TimeChangeReceiver.TaskTimeChangeWorker.class.getName())) {
                return new TimeChangeReceiver.TaskTimeChangeWorker(context, workerParameters, (esb) this.l.getValue(), (r62) this.m.getValue(), (jd8) this.n.getValue(), (tcf) this.o.getValue());
            } else if (Intrinsics.areEqual((Object) str, (Object) NotificationDraftScheduler$TaskNotificationDraftWorker.class.getName())) {
                return new NotificationDraftScheduler$TaskNotificationDraftWorker(context, workerParameters, (lu4) ((cq) lazy.getValue()).p.getValue());
            } else {
                if (Intrinsics.areEqual((Object) str, (Object) StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker.class.getName())) {
                    return new StopLiveLocationSchedulerImpl$StopLiveLocationSchedulerWorker(context, workerParameters, (d18) this.p.getValue());
                }
                if (Intrinsics.areEqual((Object) str, (Object) NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker.class.getName())) {
                    return new NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker(context, workerParameters, (hga) ((cq) lazy.getValue()).j.getValue(), ((ltb) ((jtb) lazy2.getValue())).a);
                }
                return null;
            }
        }
    }
}
