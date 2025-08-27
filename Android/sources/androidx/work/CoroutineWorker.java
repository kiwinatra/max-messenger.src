package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Le08;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1})
public abstract class CoroutineWorker extends e08 {
    public final qm7 a = kv0.b();
    public final cyd b;
    public final bi4 c;

    /* JADX WARNING: type inference failed for: r2v2, types: [o1, java.lang.Object, cyd] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ? obj = new Object();
        this.b = obj;
        obj.d(new pr1(23, this), (qn) ((g6d) getTaskExecutor()).b);
        this.c = dq4.a;
    }

    public abstract Object doWork(Continuation continuation);

    public final zz7 getForegroundInfoAsync() {
        qm7 b2 = kv0.b();
        jx3 a2 = e14.a(this.c.plus(b2));
        cn7 cn7 = new cn7(b2);
        ev0.v(a2, (CoroutineContext) null, (f14) null, new g14(cn7, this, (Continuation) null), 3);
        return cn7;
    }

    public final void onStopped() {
        this.b.cancel(false);
    }

    public final zz7 startWork() {
        ev0.v(e14.a(this.c.plus(this.a)), (CoroutineContext) null, (f14) null, new h14(this, (Continuation) null), 3);
        return this.b;
    }
}
