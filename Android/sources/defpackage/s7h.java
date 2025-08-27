package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: s7h  reason: default package */
public final class s7h extends Task {
    public final Object a = new Object();
    public final he b = new he();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final s7h a(Executor executor, hma hma) {
        this.b.w(new d4h(executor, hma));
        q();
        return this;
    }

    public final s7h b(Executor executor, ima ima) {
        this.b.w(new d4h(executor, ima));
        q();
        return this;
    }

    public final s7h c(Executor executor, lma lma) {
        this.b.w(new d4h(executor, lma));
        q();
        return this;
    }

    public final s7h d(Executor executor, vma vma) {
        this.b.w(new d4h(executor, vma));
        q();
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                vzg.o("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final s7h i(ima ima) {
        this.b.w(new d4h((Executor) xdf.a, ima));
        q();
        return this;
    }

    public final s7h j(Executor executor, mx3 mx3) {
        s7h s7h = new s7h();
        this.b.w(new f0h(executor, mx3, s7h, 0));
        q();
        return s7h;
    }

    public final s7h k(Executor executor, mx3 mx3) {
        s7h s7h = new s7h();
        this.b.w(new f0h(executor, mx3, s7h, 1));
        q();
        return s7h;
    }

    public final s7h l(Executor executor, mze mze) {
        s7h s7h = new s7h();
        this.b.w(new d4h(executor, mze, s7h));
        q();
        return s7h;
    }

    public final void m(Exception exc) {
        vzg.n(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.x(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.x(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.d = true;
                    this.b.x(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void p() {
        IllegalStateException illegalStateException;
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (g()) {
                Exception e2 = e();
                illegalStateException = new IllegalStateException("Complete with: ".concat(e2 == null ? !h() ? this.d ? "cancellation" : "unknown issue" : "result ".concat(String.valueOf(f())) : "failure"), e2);
            } else {
                illegalStateException = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException;
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.x(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
