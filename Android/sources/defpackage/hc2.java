package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hc2  reason: default package */
public final class hc2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ jc2 c;

    public /* synthetic */ hc2(jc2 jc2, long j, int i) {
        this.a = i;
        this.c = jc2;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                jc2 jc2 = this.c;
                mi miVar = jc2.c;
                i6d i6d = jc2.a;
                gf6 E = miVar.E();
                E.k(1, this.b);
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
            default:
                jc2 jc22 = this.c;
                mi miVar2 = jc22.e;
                i6d i6d2 = jc22.a;
                gf6 E2 = miVar2.E();
                E2.k(1, this.b);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    i6d2.l();
                    miVar2.S(E2);
                    return null;
                } catch (Throwable th2) {
                    miVar2.S(E2);
                    throw th2;
                }
        }
    }
}
