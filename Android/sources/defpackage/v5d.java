package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: v5d  reason: default package */
public final class v5d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c6d o;

    public /* synthetic */ v5d(c6d c6d, boolean z, String str, int i) {
        this.a = i;
        this.o = c6d;
        this.b = z;
        this.c = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.o;
                t5d t5d = c6d.e;
                i6d i6d = c6d.a;
                gf6 E = t5d.E();
                E.k(1, this.b ? 1 : 0);
                String str = this.c;
                if (str == null) {
                    E.X(2);
                } else {
                    E.h(2, str);
                }
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
                c6d c6d2 = this.o;
                t5d t5d2 = c6d2.m;
                i6d i6d2 = c6d2.a;
                gf6 E2 = t5d2.E();
                E2.k(1, this.b ? 1 : 0);
                String str2 = this.c;
                if (str2 == null) {
                    E2.X(2);
                } else {
                    E2.h(2, str2);
                }
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
