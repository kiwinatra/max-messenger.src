package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: j0h  reason: default package */
public final class j0h {
    public int a;
    public z28 b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public final Executor g;
    public volatile xx h;
    public volatile xx i;
    public final Semaphore j;
    public final Set k;

    public j0h(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = xx.y;
        context.getApplicationContext();
        this.g = threadPoolExecutor;
        this.j = new Semaphore(0);
        this.k = set;
    }

    public final void a() {
        if (this.h != null) {
            if (!this.c) {
                this.f = true;
            }
            if (this.i != null) {
                this.h.getClass();
                this.h = null;
                return;
            }
            this.h.getClass();
            xx xxVar = this.h;
            xxVar.o.set(true);
            if (xxVar.b.cancel(false)) {
                this.i = this.h;
            }
            this.h = null;
        }
    }

    public final void b() {
        if (this.i == null && this.h != null) {
            this.h.getClass();
            xx xxVar = this.h;
            Executor executor = this.g;
            if (xxVar.c != 1) {
                int y = tr1.y(xxVar.c);
                if (y == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (y != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                xxVar.c = 2;
                xxVar.a.b = null;
                executor.execute(xxVar.b);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        kv0.k(sb, this);
        sb.append(" id=");
        return wj6.l(sb, this.a, "}");
    }
}
