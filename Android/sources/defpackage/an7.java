package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: an7  reason: default package */
public abstract class an7 extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, zm7> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<um7> mCompatQueue = null;
    zm7 mCompatWorkEnqueuer;
    sm7 mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    tm7 mJobImpl;
    boolean mStopped = false;

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static zm7 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, zm7> hashMap = sClassWorkEnqueuer;
        zm7 zm7 = hashMap.get(componentName);
        if (zm7 != null) {
            return zm7;
        }
        if (z) {
            ym7 ym7 = new ym7(context, componentName, i);
            hashMap.put(componentName, ym7);
            return ym7;
        }
        throw new IllegalArgumentException("Can't be here without a job id");
    }

    public abstract vm7 dequeueWork();

    public boolean doStopCurrentWork() {
        sm7 sm7 = this.mCurProcessor;
        if (sm7 != null) {
            sm7.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new sm7(this);
            zm7 zm7 = this.mCompatWorkEnqueuer;
            if (zm7 != null && z) {
                zm7.getClass();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        tm7 tm7 = this.mJobImpl;
        if (tm7 != null) {
            return tm7.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new xm7(this, 0);
        this.mCompatWorkEnqueuer = null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<um7> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<um7> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new um7(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<um7> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<um7> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                zm7 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.a(i);
                ym7 ym7 = (ym7) workEnqueuer;
                ym7.d.enqueue(ym7.c, new JobWorkItem(intent));
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
