package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Le08;", "Lpog;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ConstraintTrackingWorker extends e08 implements pog {
    public final WorkerParameters a;
    public final Object b = new Object();
    public volatile boolean c;
    public final cyd o = new Object();
    public e08 v;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, cyd] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.a = workerParameters;
    }

    public final void a(List list) {
        h88 x = h88.x();
        String str = sj3.a;
        x.p(str, "Constraints changed for " + list);
        synchronized (this.b) {
            this.c = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void f(List list) {
    }

    public final void onStopped() {
        e08 e08 = this.v;
        if (e08 != null && !e08.isStopped()) {
            e08.stop();
        }
    }

    public final zz7 startWork() {
        getBackgroundExecutor().execute(new pr1(21, this));
        return this.o;
    }
}
