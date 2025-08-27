package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: v09  reason: default package */
public final class v09 implements Runnable {
    public final Handler a;
    public final lrf b;
    public final long c;
    public final long o;
    public final Function1 v;
    public final String w = v09.class.getName();
    public long x = Long.MIN_VALUE;
    public int y = IntCompanionObject.MIN_VALUE;
    public final jq5 z = new jq5(false);

    public v09(Handler handler, lrf lrf, long j, long j2, vq7 vq7) {
        this.a = handler;
        this.b = lrf;
        this.c = j;
        this.o = j2;
        this.v = vq7;
    }

    public final void a() {
        String str = this.w;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "cancel", (Throwable) null);
        }
        this.a.removeCallbacks(this);
        this.x = Long.MIN_VALUE;
        this.y = IntCompanionObject.MIN_VALUE;
    }

    public final void b() {
        String str = this.w;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, "start", (Throwable) null);
        }
        this.a.postDelayed(this, this.c);
    }

    public final void run() {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lrf lrf = this.b;
        jq5 jq5 = this.z;
        int d = lrf.d(jq5);
        long j = this.x;
        if (j == Long.MIN_VALUE) {
            this.x = elapsedRealtime;
            if (d == 2) {
                this.y = jq5.b;
            }
        } else {
            String str = this.w;
            if (d != 2 || (i = jq5.b) <= this.y) {
                long j2 = elapsedRealtime - j;
                if (j2 >= this.o) {
                    z68.p(str, "it seems media transform is stuck, ~ " + (((float) j2) / 1000.0f) + " s");
                }
            } else {
                this.x = elapsedRealtime;
                this.y = i;
                z68.c(str, "media transform progress=" + i + "%", new Object[0]);
                Function1 function1 = this.v;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(((float) this.y) / 100.0f));
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
