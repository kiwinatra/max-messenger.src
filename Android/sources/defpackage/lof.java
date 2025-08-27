package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: lof  reason: default package */
public final class lof implements Application.ActivityLifecycleCallbacks {
    public final kxd a;
    public int b;

    public lof(kxd kxd) {
        this.a = kxd;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.a.e(true);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.b == 0) {
            this.a.e(false);
        }
        this.b++;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
