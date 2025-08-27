package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.android.OneMeApplication;

/* renamed from: tna  reason: default package */
public final class tna extends n45 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final /* synthetic */ OneMeApplication b;

    public tna(OneMeApplication oneMeApplication) {
        this.b = oneMeApplication;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.add(new WeakReference(activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.a.removeIf(new rz5(2, new tq(activity, 1)));
    }

    public final void onActivityResumed(Activity activity) {
        Object value;
        xme xme = (xme) fu4.k.e(this.b).i;
        do {
            value = xme.getValue();
        } while (!xme.b(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }
}
