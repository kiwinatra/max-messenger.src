package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k8  reason: default package */
public final class k8 implements Application.ActivityLifecycleCallbacks {
    public final ArrayList a = new ArrayList();
    public final dac b = new dac();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.add(new WeakReference(activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                return;
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostResumed(Activity activity) {
        this.b.d(activity);
    }

    public final void onActivityResumed(Activity activity) {
        TextView textView;
        if (activity.getClass().getName().endsWith("CSPDialogActivity")) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            int identifier = activity.getResources().getIdentifier("tvTitle", "id", activity.getPackageName());
            if (identifier != 0 && (textView = (TextView) viewGroup.findViewById(identifier)) != null) {
                textView.setText(qad.aa);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
