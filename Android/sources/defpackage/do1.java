package defpackage;

import java.util.concurrent.Executor;

/* renamed from: do1  reason: default package */
public final class do1 {
    public Object a;
    public go1 b;
    public z3d c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        z3d z3d = this.c;
        if (z3d != null) {
            z3d.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        boolean z = true;
        this.d = true;
        go1 go1 = this.b;
        if (go1 == null || !go1.b.i(obj)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        go1 go1 = this.b;
        if (go1 != null && go1.b.cancel(true)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final boolean d(Throwable th) {
        boolean z = true;
        this.d = true;
        go1 go1 = this.b;
        if (go1 == null || !go1.b.j(th)) {
            z = false;
        }
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        z3d z3d;
        go1 go1 = this.b;
        if (go1 != null) {
            fo1 fo1 = go1.b;
            if (!fo1.isDone()) {
                fo1.j(new v0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (!this.d && (z3d = this.c) != null) {
            z3d.i((Object) null);
        }
    }
}
