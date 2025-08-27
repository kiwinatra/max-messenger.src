package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: y5d  reason: default package */
public final class y5d implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ c6d o;

    public y5d(c6d c6d, long j, String str) {
        this.o = c6d;
        this.c = j;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.o;
                t5d t5d = c6d.h;
                i6d i6d = c6d.a;
                gf6 E = t5d.E();
                E.k(1, this.c);
                String str = this.b;
                if (str == null) {
                    E.X(2);
                } else {
                    E.h(2, str);
                }
                try {
                    i6d.c();
                    E.m();
                    i6d.r();
                    Unit unit = Unit.INSTANCE;
                    i6d.l();
                    t5d.S(E);
                    return unit;
                } catch (Throwable th) {
                    t5d.S(E);
                    throw th;
                }
            default:
                c6d c6d2 = this.o;
                uf9 uf9 = c6d2.k;
                i6d i6d2 = c6d2.a;
                gf6 E2 = uf9.E();
                String str2 = this.b;
                if (str2 == null) {
                    E2.X(1);
                } else {
                    E2.h(1, str2);
                }
                E2.k(2, this.c);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    Unit unit2 = Unit.INSTANCE;
                    i6d2.l();
                    uf9.S(E2);
                    return unit2;
                } catch (Throwable th2) {
                    uf9.S(E2);
                    throw th2;
                }
        }
    }

    public y5d(c6d c6d, String str, long j) {
        this.o = c6d;
        this.b = str;
        this.c = j;
    }
}
