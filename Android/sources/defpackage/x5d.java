package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: x5d  reason: default package */
public final class x5d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c6d c;

    public /* synthetic */ x5d(c6d c6d, String str, int i) {
        this.a = i;
        this.c = c6d;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                c6d c6d = this.c;
                t5d t5d = c6d.g;
                i6d i6d = c6d.a;
                gf6 E = t5d.E();
                String str = this.b;
                if (str == null) {
                    E.X(1);
                } else {
                    E.h(1, str);
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
                c6d c6d2 = this.c;
                t5d t5d2 = c6d2.i;
                i6d i6d2 = c6d2.a;
                gf6 E2 = t5d2.E();
                String str2 = this.b;
                if (str2 == null) {
                    E2.X(1);
                } else {
                    E2.h(1, str2);
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
