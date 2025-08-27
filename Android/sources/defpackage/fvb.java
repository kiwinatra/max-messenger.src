package defpackage;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.JvmStatic;

/* renamed from: fvb  reason: default package */
public abstract class fvb {
    @JvmStatic
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
