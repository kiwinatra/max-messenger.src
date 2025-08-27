package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: z86  reason: default package */
public final class z86 implements r15 {
    public final Context a;
    public final soc b;
    public final o9a c;
    public final Object o = new Object();
    public Handler v;
    public Executor w;
    public ThreadPoolExecutor x;
    public kv0 y;

    public z86(Context context, soc soc) {
        o9a o9a = a96.i;
        bs0.q(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = soc;
        this.c = o9a;
    }

    public final void a() {
        synchronized (this.o) {
            try {
                this.y = null;
                Handler handler = this.v;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.v = null;
                ThreadPoolExecutor threadPoolExecutor = this.x;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.w = null;
                this.x = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.o) {
            try {
                if (this.y != null) {
                    if (this.w == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new td3(0, "emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.x = threadPoolExecutor;
                        this.w = threadPoolExecutor;
                    }
                    this.w.execute(new y86(0, (Object) this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k96 c() {
        try {
            o9a o9a = this.c;
            Context context = this.a;
            soc soc = this.b;
            o9a.getClass();
            ni0 t = hi7.t(context, soc);
            int i = t.b;
            if (i == 0) {
                k96[] k96Arr = (k96[]) t.c;
                if (k96Arr != null && k96Arr.length != 0) {
                    return k96Arr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(a81.j(i, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    public final void h(kv0 kv0) {
        synchronized (this.o) {
            this.y = kv0;
        }
        b();
    }
}
