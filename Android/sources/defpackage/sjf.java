package defpackage;

import android.os.SystemClock;

/* renamed from: sjf  reason: default package */
public final class sjf implements rjf {
    public Long a;
    public Long b;

    public final Long a() {
        Long l = this.b;
        if (l == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        Long l2 = this.a;
        if (l2 != null) {
            return Long.valueOf(l2.longValue() + elapsedRealtime);
        }
        return null;
    }
}
