package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aj5  reason: default package */
public final class aj5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aj5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                bj5 bj5 = (bj5) this.c;
                mi miVar = bj5.e;
                i6d i6d = bj5.a;
                gf6 E = miVar.E();
                E.k(1, this.b);
                try {
                    i6d.c();
                    Integer valueOf = Integer.valueOf(E.n());
                    i6d.r();
                    i6d.l();
                    miVar.S(E);
                    return valueOf;
                } catch (Throwable th) {
                    miVar.S(E);
                    throw th;
                }
            case 1:
                gfa gfa = (gfa) this.c;
                uf9 uf9 = gfa.d;
                i6d i6d2 = gfa.a;
                gf6 E2 = uf9.E();
                E2.k(1, this.b);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    i6d2.l();
                    uf9.S(E2);
                    return null;
                } catch (Throwable th2) {
                    uf9.S(E2);
                    throw th2;
                }
            case 2:
                oga oga = (oga) this.c;
                uf9 uf92 = oga.c;
                i6d i6d3 = oga.a;
                gf6 E3 = uf92.E();
                E3.k(1, this.b);
                try {
                    i6d3.c();
                    Integer valueOf2 = Integer.valueOf(E3.n());
                    i6d3.r();
                    i6d3.l();
                    uf92.S(E3);
                    return valueOf2;
                } catch (Throwable th3) {
                    uf92.S(E3);
                    throw th3;
                }
            default:
                dzf dzf = (dzf) this.c;
                t5d t5d = dzf.d;
                i6d i6d4 = dzf.a;
                gf6 E4 = t5d.E();
                E4.k(1, this.b);
                try {
                    i6d4.c();
                    E4.n();
                    i6d4.r();
                    i6d4.l();
                    t5d.S(E4);
                    return null;
                } catch (Throwable th4) {
                    t5d.S(E4);
                    throw th4;
                }
        }
    }
}
