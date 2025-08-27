package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: w5d  reason: default package */
public final class w5d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6d b;

    public /* synthetic */ w5d(c6d c6d, int i) {
        this.a = i;
        this.b = c6d;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.b;
                t5d t5d = c6d.f;
                i6d i6d = c6d.a;
                gf6 E = t5d.E();
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
                c6d c6d2 = this.b;
                t5d t5d2 = c6d2.j;
                i6d i6d2 = c6d2.a;
                gf6 E2 = t5d2.E();
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
