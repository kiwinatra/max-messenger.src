package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ic2  reason: default package */
public final class ic2 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jc2 o;

    public ic2(jc2 jc2, long j, long j2, long j3) {
        this.o = jc2;
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final Object call() {
        jc2 jc2 = this.o;
        mi miVar = jc2.d;
        i6d i6d = jc2.a;
        gf6 E = miVar.E();
        E.k(1, this.a);
        E.k(2, this.b);
        E.k(3, this.c);
        try {
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            miVar.S(E);
            return null;
        } catch (Throwable th) {
            miVar.S(E);
            throw th;
        }
    }
}
