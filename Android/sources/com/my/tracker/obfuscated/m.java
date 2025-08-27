package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class m {
    public static final Handler a;
    public static final Executor b = Executors.newSingleThreadExecutor();
    public static final Executor c = Executors.newSingleThreadExecutor();
    public static final Executor d = Executors.newSingleThreadExecutor();
    public static final Executor e = Executors.newSingleThreadExecutor();
    public static final Executor f = Executors.newSingleThreadExecutor();
    private static final Executor g;
    private static final a h = new a();

    public static final class a {
        private final ArrayDeque a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.m$a$a  reason: collision with other inner class name */
        public static final class C0001a implements Runnable {
            final a a;
            volatile Runnable b;

            public C0001a(a aVar) {
                this.a = aVar;
            }

            public void run() {
                a aVar;
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    aVar = this.a;
                    if (aVar == null) {
                        return;
                    }
                } catch (Throwable th) {
                    a aVar2 = this.a;
                    if (aVar2 != null) {
                        aVar2.a(this);
                    }
                    throw th;
                }
                aVar.a(this);
            }
        }

        public a() {
            for (int i = 0; i < 64; i++) {
                this.a.add(new C0001a(this));
            }
        }

        public void a(C0001a aVar) {
            synchronized (this) {
                aVar.b = null;
                this.a.add(aVar);
            }
        }

        public Runnable a(Runnable runnable) {
            C0001a aVar;
            synchronized (this) {
                aVar = (C0001a) this.a.pollFirst();
            }
            if (aVar == null) {
                aVar = new C0001a((a) null);
            }
            aVar.b = runnable;
            return aVar;
        }
    }

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        a = handler;
        g = new oc4(handler, 0);
    }

    public static void a(Runnable runnable) {
        b.execute(h.a(runnable));
    }

    public static void b(Runnable runnable) {
        c.execute(h.a(runnable));
    }

    public static void c(Runnable runnable) {
        d.execute(h.a(runnable));
    }

    public static void d(Runnable runnable) {
        e.execute(h.a(runnable));
    }

    public static void e(Runnable runnable) {
        f.execute(h.a(runnable));
    }

    public static void f(Runnable runnable) {
        Runnable a2 = h.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a2.run();
        } else {
            g.execute(a2);
        }
    }
}
