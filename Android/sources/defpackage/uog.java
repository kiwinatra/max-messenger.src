package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: uog  reason: default package */
public final class uog implements Runnable {
    public static final String x = h88.V("WorkForegroundRunnable");
    public final cyd a = new Object();
    public final Context b;
    public final xpg c;
    public final e08 o;
    public final r96 v;
    public final wdf w;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, cyd] */
    public uog(Context context, xpg xpg, e08 e08, vog vog, wdf wdf) {
        this.b = context;
        this.c = xpg;
        this.o = e08;
        this.v = vog;
        this.w = wdf;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [o1, java.lang.Object] */
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.j((Object) null);
            return;
        }
        ? obj = new Object();
        g6d g6d = (g6d) this.w;
        ((ky6) g6d.o).execute(new l8g(3, this, obj));
        obj.d(new vj6((Object) this, (Object) obj, false, 26), (ky6) g6d.o);
    }
}
