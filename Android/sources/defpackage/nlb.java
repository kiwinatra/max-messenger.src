package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: nlb  reason: default package */
public final class nlb {
    public final Context a;
    public final Class b = p6.class;
    public final hq c;
    public final xq d;
    public boolean e;

    public nlb(Context context, hq hqVar, xq xqVar) {
        this.a = context;
        this.c = hqVar;
        this.e = false;
        this.d = xqVar;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.c.f("pinLock.pinCode", (String) null));
    }

    public final boolean b(Activity activity) {
        Activity activity2 = activity;
        String name = activity.getClass().getName();
        z68.c("nlb", "shouldLockScreen, activity = %s", name);
        if (!a()) {
            z68.c("nlb", "shouldLockScreen, activity = %s: pin code not set", name);
            return false;
        }
        if (activity2 instanceof m5) {
            m5 m5Var = (m5) activity2;
        }
        boolean z = !((udg) this.d).c();
        hq hqVar = this.c;
        long e2 = hqVar.e("pinLock.timeout", 60000);
        long e3 = hqVar.e("pinLock.lastActiveTime", 0);
        long elapsedRealtime = SystemClock.elapsedRealtime() - e3;
        boolean z2 = elapsedRealtime < 0 || e3 <= 0 || elapsedRealtime > e2;
        z68.c("nlb", "shouldLockScreen, activity = %s: forceCheck = %s, isNotVisible = %s, isReachedTimeout = %s, lastActiveTime = %d, current time = %d, timeout = %d", name, Boolean.valueOf(this.e), Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(hqVar.e("pinLock.lastActiveTime", 0)), Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(e2));
        return (z || this.e) && z2;
    }
}
