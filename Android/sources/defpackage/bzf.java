package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bzf  reason: default package */
public final class bzf implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ xyf b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dzf o;

    public bzf(dzf dzf, String str, xyf xyf, long j) {
        this.o = dzf;
        this.a = str;
        this.b = xyf;
        this.c = j;
    }

    public final Object call() {
        dzf dzf = this.o;
        t5d t5d = dzf.c;
        i6d i6d = dzf.a;
        gf6 E = t5d.E();
        String str = this.a;
        if (str == null) {
            E.X(1);
        } else {
            E.h(1, str);
        }
        E.k(2, (long) this.b.a);
        E.k(3, this.c);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            t5d.S(E);
            return null;
        } catch (Throwable th) {
            t5d.S(E);
            throw th;
        }
    }
}
