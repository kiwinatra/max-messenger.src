package defpackage;

import android.os.SystemClock;

/* renamed from: ln4  reason: default package */
public final /* synthetic */ class ln4 implements Runnable {
    public final /* synthetic */ mn4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ln4(mn4 mn4, long j, boolean z) {
        this.a = mn4;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        mn4 mn4 = this.a;
        mn4.c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        String str = this.c ? "CALL" : "COMMON_PUSH";
        int i = (elapsedRealtime > ((long) 9000) ? 1 : (elapsedRealtime == ((long) 9000) ? 0 : -1));
        nd ndVar = mn4.a;
        if (i > 0) {
            ndVar.d(elapsedRealtime, "DEVICE_IDLE_AFTER_PUSH", str);
        } else {
            ndVar.f("DEVICE_ACTIVE_AFTER_PUSH", str);
        }
    }
}
