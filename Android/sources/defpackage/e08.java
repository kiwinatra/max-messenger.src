package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: e08  reason: default package */
public abstract class e08 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public e08(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [zz7, java.lang.Object, cyd] */
    public zz7 getForegroundInfoAsync() {
        ? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final t64 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public wdf getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.b;
    }

    public gqg getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [zz7, java.lang.Object] */
    public final zz7 setForegroundAsync(o96 o96) {
        r96 r96 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        vog vog = (vog) r96;
        vog.getClass();
        ? obj = new Object();
        vog.a.h(new sm8(vog, obj, id, o96, applicationContext, 2));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [zz7, java.lang.Object] */
    public zz7 setProgressAsync(t64 t64) {
        p7c p7c = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        rpg rpg = (rpg) p7c;
        rpg.getClass();
        ? obj = new Object();
        rpg.b.h(new iqg(6, (Object) rpg, (Object) id, (Object) t64, (Object) obj));
        return obj;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract zz7 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
