package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: s7d  reason: default package */
public final class s7d extends u08 {
    public final i6d l;
    public final npg m;
    public final boolean n = true;
    public final Callable o;
    public final k14 p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final r7d t;
    public final r7d u;

    public s7d(i6d i6d, npg npg, czf czf, String[] strArr) {
        this.l = i6d;
        this.m = npg;
        this.o = czf;
        this.p = new k14(strArr, this, 1);
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new r7d(this, 0);
        this.u = new r7d(this, 1);
    }

    public final void g() {
        Executor executor;
        ((Set) this.m.c).add(this);
        Executor executor2 = null;
        boolean z = this.n;
        i6d i6d = this.l;
        if (!z ? (executor = i6d.b) != null : (executor = i6d.c) != null) {
            executor2 = executor;
        }
        executor2.execute(this.t);
    }

    public final void h() {
        ((Set) this.m.c).remove(this);
    }
}
