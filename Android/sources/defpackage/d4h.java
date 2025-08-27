package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* renamed from: d4h  reason: default package */
public final class d4h implements s6h, vma, lma, hma {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object o;

    public d4h(Executor executor, hma hma) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.o = hma;
    }

    public void a(Object obj) {
        ((s7h) this.o).n(obj);
    }

    public final void b(Task task) {
        switch (this.a) {
            case 0:
                if (((s7h) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((hma) this.o) != null) {
                                this.b.execute(new haf(20, (Object) this));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 1:
                synchronized (this.c) {
                    try {
                        if (((ima) this.o) != null) {
                            this.b.execute(new tvg((s6h) this, task, 3));
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
            case 2:
                if (!task.h() && !((s7h) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((lma) this.o) != null) {
                                this.b.execute(new r1h((s6h) this, task, 2));
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            case 3:
                if (task.h()) {
                    synchronized (this.c) {
                        try {
                            if (((vma) this.o) != null) {
                                this.b.execute(new tvg((s6h) this, task, 4));
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            while (true) {
                                throw th4;
                                break;
                            }
                        }
                    }
                } else {
                    return;
                }
            default:
                this.b.execute(new tvg((s6h) this, task, 5));
                return;
        }
    }

    public void onFailure(Exception exc) {
        ((s7h) this.o).m(exc);
    }

    public void r() {
        ((s7h) this.o).o();
    }

    public d4h(Executor executor, ima ima) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.o = ima;
    }

    public d4h(Executor executor, lma lma) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.o = lma;
    }

    public d4h(Executor executor, vma vma) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.o = vma;
    }

    public d4h(Executor executor, mze mze, s7h s7h) {
        this.a = 4;
        this.b = executor;
        this.c = mze;
        this.o = s7h;
    }
}
