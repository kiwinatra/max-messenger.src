package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.JvmStatic;

/* renamed from: n2d  reason: default package */
public final class n2d implements Application.ActivityLifecycleCallbacks {
    public static final m2d Companion = new Object();

    @JvmStatic
    public static final void registerIn(Activity activity) {
        Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new n2d());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        int i = o2d.a;
        ryg.k(activity, hu7.ON_STOP);
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
