package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f75  reason: default package */
public abstract class f75 extends Service {
    public final ExecutorService a;
    public mog b;
    public final Object c = new Object();
    public int o;
    public int v = 0;

    public f75() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j5a("Firebase-Messaging-Intent-Handle", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            seg.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.v - 1;
                this.v = i;
                if (i == 0) {
                    stopSelfResult(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new mog(new xv1(19, (Object) this));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b;
    }

    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.o = i2;
            this.v++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) eud.j().v).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        qdf qdf = new qdf();
        this.a.execute(new x55((Object) this, (Object) intent2, (Object) qdf, 4));
        s7h s7h = qdf.a;
        if (s7h.g()) {
            a(intent);
            return 2;
        }
        s7h.b(new fs(2), new ib4(14, this, intent));
        return 3;
    }
}
