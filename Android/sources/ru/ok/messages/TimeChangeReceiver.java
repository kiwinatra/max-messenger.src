package ru.ok.messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/messages/TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "TaskTimeChangeWorker", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TimeChangeReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ok/messages/TimeChangeReceiver$TaskTimeChangeWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lesb;", "preProcessDataCache", "Lr62;", "chatController", "Lsv0;", "uiBus", "Ltcf;", "themeController", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lesb;Lr62;Lsv0;Ltcf;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
    public static final class TaskTimeChangeWorker extends Worker {
        public final esb b;
        public final r62 c;
        public final sv0 o;
        public final tcf v;

        public TaskTimeChangeWorker(Context context, WorkerParameters workerParameters, esb esb, r62 r62, sv0 sv0, tcf tcf) {
            super(context, workerParameters);
            this.b = esb;
            this.c = r62;
            this.o = sv0;
            this.v = tcf;
        }

        public final d08 b() {
            int i = TimeChangeReceiver.a;
            z68.c("ru.ok.messages.TimeChangeReceiver", "work %s started", getId());
            synchronized (j4b.b) {
                j4b.a = null;
            }
            synchronized (j4b.d) {
                j4b.c = null;
            }
            synchronized (j4b.f) {
                j4b.e = null;
            }
            synchronized (j4b.h) {
                j4b.g = null;
            }
            synchronized (j4b.j) {
                j4b.i = null;
            }
            synchronized (j4b.l) {
                j4b.k = null;
            }
            synchronized (j4b.n) {
                j4b.m = null;
            }
            synchronized (j4b.o) {
            }
            synchronized (j4b.v) {
                j4b.u = null;
            }
            synchronized (j4b.t) {
                j4b.s = null;
            }
            this.b.a();
            r62 r62 = this.c;
            if (r62.i) {
                for (a32 a32 : r62.f.values()) {
                    a32.x0 = null;
                }
                r62.m.c(new xy2(Collections.emptyList(), true));
            }
            this.o.c(new ij0());
            this.v.j();
            new TimeChangeReceiver();
            getApplicationContext();
            TimeChangeReceiver.a();
            z68.c("ru.ok.messages.TimeChangeReceiver", "work %s finished", getId());
            return d08.b();
        }
    }

    public static void a() {
        ipg ipg = (ipg) ((qra) ym.e()).getAccessor().g(ipg.class);
        v3b v3b = new v3b(TaskTimeChangeWorker.class);
        ag0 ag0 = ag0.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v3b v3b2 = (v3b) v3b.setBackoffCriteria(ag0, WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        d84 g = d84.g(System.currentTimeMillis(), TimeZone.getDefault());
        long h = new d84(g.a, g.b, g.c, (Integer) null, (Integer) null, (Integer) null, (Integer) null).l(1).h(TimeZone.getDefault()) - d84.g(System.currentTimeMillis(), TimeZone.getDefault()).h(TimeZone.getDefault());
        if (h > 0) {
            v3b2.setInitialDelay(h, timeUnit);
        }
        w3b w3b = (w3b) ((v3b) v3b2.addTag("TIME_CHANGE")).build();
        UUID id = w3b.getId();
        z68.c("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule on next date", new Object[0]);
        fb5 fb5 = fb5.c;
        KProperty[] kPropertyArr = ipg.n;
        ipg.b("TIME_CHANGE", fb5, w3b, false).v();
    }

    public final void onReceive(Context context, Intent intent) {
        w3b w3b = (w3b) ((v3b) ((v3b) new v3b(TaskTimeChangeWorker.class).setBackoffCriteria(ag0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("TIME_CHANGE")).build();
        UUID id = w3b.getId();
        z68.c("ru.ok.messages.TimeChangeReceiver", "work " + id + " try to add TIME_CHANGE request. Schedule now", new Object[0]);
        fb5 fb5 = fb5.a;
        KProperty[] kPropertyArr = ipg.n;
        ((ipg) ((qra) ym.e()).getAccessor().g(ipg.class)).b("TIME_CHANGE", fb5, w3b, false).v();
    }
}
