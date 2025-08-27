package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: xi9  reason: default package */
public final class xi9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ aj9 o;

    public /* synthetic */ xi9(aj9 aj9, long j, long j2, int i) {
        this.a = i;
        this.o = aj9;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                aj9 aj9 = this.o;
                uf9 uf9 = aj9.q;
                i6d i6d = aj9.a;
                gf6 E = uf9.E();
                E.k(1, this.b);
                E.k(2, this.c);
                try {
                    i6d.c();
                    E.n();
                    i6d.r();
                    Unit unit = Unit.INSTANCE;
                    i6d.l();
                    uf9.S(E);
                    return unit;
                } catch (Throwable th) {
                    uf9.S(E);
                    throw th;
                }
            default:
                aj9 aj92 = this.o;
                uf9 uf92 = aj92.r;
                i6d i6d2 = aj92.a;
                gf6 E2 = uf92.E();
                E2.k(1, this.b);
                E2.k(2, this.c);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    Unit unit2 = Unit.INSTANCE;
                    i6d2.l();
                    uf92.S(E2);
                    return unit2;
                } catch (Throwable th2) {
                    uf92.S(E2);
                    throw th2;
                }
        }
    }
}
