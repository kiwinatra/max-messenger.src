package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* renamed from: qn  reason: default package */
public final class qn implements Executor {
    public final /* synthetic */ int a;
    public final ArrayDeque b;
    public final Executor c;
    public Runnable o;
    public final Object v;

    public qn(Executor executor, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = executor;
                this.b = new ArrayDeque();
                this.v = new Object();
                return;
            default:
                this.c = executor;
                this.b = new ArrayDeque();
                this.v = new Object();
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.v) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.o = runnable;
                        if (runnable != null) {
                            this.c.execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.b.poll();
                this.o = runnable2;
                if (runnable2 != null) {
                    this.c.execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.v) {
                    try {
                        Object poll = this.b.poll();
                        Runnable runnable3 = (Runnable) poll;
                        this.o = runnable3;
                        if (poll != null) {
                            this.c.execute(runnable3);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.v) {
                    try {
                        this.b.add(new c(4, this, runnable));
                        if (this.o == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                synchronized (this.v) {
                    try {
                        this.b.add(new vj6(19, (Object) this, (Object) runnable));
                        if (this.o == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.v) {
                    try {
                        this.b.offer(new s6e(16, runnable, this));
                        if (this.o == null) {
                            a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }

    public qn(ep4 ep4) {
        this.a = 0;
        this.v = new Object();
        this.b = new ArrayDeque();
        this.c = ep4;
    }
}
