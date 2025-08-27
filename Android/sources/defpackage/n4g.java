package defpackage;

import java.util.concurrent.Callable;

/* renamed from: n4g  reason: default package */
public final class n4g implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ o4g w;

    public n4g(o4g o4g, String str, qac qac, float f, float f2, boolean z) {
        this.w = o4g;
        this.a = str;
        this.b = qac;
        this.c = f;
        this.o = f2;
        this.v = z;
    }

    public final Object call() {
        o4g o4g = this.w;
        t5d t5d = o4g.c;
        i6d i6d = o4g.a;
        gf6 E = t5d.E();
        String str = this.a;
        if (str == null) {
            E.X(1);
        } else {
            E.h(1, str);
        }
        E.k(2, (long) this.b.b);
        E.T((double) this.c, 3);
        E.T((double) this.o, 4);
        E.k(5, this.v ? 1 : 0);
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
