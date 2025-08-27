package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: a6d  reason: default package */
public final class a6d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c6d c;

    public /* synthetic */ a6d(c6d c6d, long j, int i) {
        this.a = i;
        this.c = c6d;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.c;
                t5d t5d = c6d.n;
                i6d i6d = c6d.a;
                gf6 E = t5d.E();
                E.k(1, this.b);
                try {
                    i6d.c();
                    E.n();
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
                c6d c6d2 = this.c;
                t5d t5d2 = c6d2.n;
                i6d i6d2 = c6d2.a;
                gf6 E2 = t5d2.E();
                E2.k(1, this.b);
                try {
                    i6d2.c();
                    E2.n();
                    i6d2.r();
                    Unit unit2 = Unit.INSTANCE;
                    i6d2.l();
                    t5d2.S(E2);
                    return unit2;
                } catch (Throwable th2) {
                    t5d2.S(E2);
                    throw th2;
                }
        }
    }
}
