package androidx.work;

import android.content.Context;

public abstract class Worker extends e08 {
    public cyd a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract d08 b();

    /* JADX WARNING: type inference failed for: r0v0, types: [zz7, java.lang.Object] */
    public final zz7 getForegroundInfoAsync() {
        ? obj = new Object();
        getBackgroundExecutor().execute(new uj6((Object) this, (Object) obj, false, 28));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, cyd] */
    public final zz7 startWork() {
        this.a = new Object();
        getBackgroundExecutor().execute(new haf(11, (Object) this));
        return this.a;
    }
}
