package one.me.sdk.tasks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"one/me/sdk/tasks/TaskMonitor$TaskMonitorWorker", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Leef;", "taskRepository", "Ljbf;", "schedulers", "Ljqg;", "workerService", "Lx23;", "clientPrefs", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Leef;Ljbf;Ljqg;Lx23;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class TaskMonitor$TaskMonitorWorker extends Worker {
    public final eef b;
    public final jbf c;
    public final jqg o;
    public final x23 v;
    public final tp0 w = new CountDownLatch(1);

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.concurrent.CountDownLatch, tp0] */
    public TaskMonitor$TaskMonitorWorker(Context context, WorkerParameters workerParameters, eef eef, jbf jbf, jqg jqg, x23 x23) {
        super(context, workerParameters);
        this.b = eef;
        this.c = jbf;
        this.o = jqg;
        this.v = x23;
    }

    /* JADX WARNING: type inference failed for: r11v10, types: [java.lang.Object, d08] */
    public final d08 b() {
        Boolean bool;
        z68.c("bef", "work %s started at %s", getId(), Integer.valueOf(System.identityHashCode(this)));
        if (!c()) {
            UUID id = getId();
            z68.c("bef", "work " + id + " No tasks to be executed", new Object[0]);
            return d08.b();
        }
        ((qjd) this.v).w(true);
        rvd.A(this.o);
        dac dac = this.b.c;
        aef aef = new aef(this);
        dac.getClass();
        mha mha = new mha(dac, aef, 2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        lfd b2 = ((kbf) this.c).b();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(b2, "scheduler is null");
        zka zka = new zka(mha, 15000, timeUnit, b2);
        aef aef2 = new aef(this);
        tp0 tp0 = this.w;
        Objects.requireNonNull(tp0, "observer is null");
        try {
            zka.a(new zia(tp0, aef2, 1));
            try {
                bool = (Boolean) tp0.a();
            } catch (Throwable th) {
                UUID id2 = getId();
                z68.f("bef", "work " + id2 + " Exception", th);
                bool = null;
            }
            if (bool == null) {
                UUID id3 = getId();
                z68.f("bef", "work " + id3 + " result null. Set failure state", (Throwable) null);
                return d08.a();
            } else if (!bool.booleanValue()) {
                UUID id4 = getId();
                z68.p("bef", "work " + id4 + " Timeout. Set retry state");
                return new Object();
            } else {
                UUID id5 = getId();
                z68.c("bef", "work " + id5 + " finished", new Object[0]);
                return d08.b();
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            hd8.Z(th2);
            n54.D(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final boolean c() {
        eef eef = this.b;
        int k = eef.k();
        UUID id = getId();
        z68.c("bef", "work " + id + " Task count to be executed = " + k, new Object[0]);
        if (1 <= k && k < 10) {
            String p = CollectionsKt___CollectionsKt.joinToString$default(eef.m(), "; ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new duc(20), 30, (Object) null);
            UUID id2 = getId();
            z68.c("bef", "work " + id2 + " Last task to execute: " + p, new Object[0]);
        }
        return k > 0;
    }

    public final void onStopped() {
        UUID id = getId();
        int identityHashCode = System.identityHashCode(this);
        z68.c("bef", "work " + id + " requested to stop " + identityHashCode, new Object[0]);
        tp0 tp0 = this.w;
        tp0.dispose();
        tp0.countDown();
        UUID id2 = getId();
        int identityHashCode2 = System.identityHashCode(this);
        z68.c("bef", "work " + id2 + " stopped " + identityHashCode2, new Object[0]);
    }
}
