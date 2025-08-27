package defpackage;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: z5d  reason: default package */
public final class z5d implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c6d o;

    public z5d(c6d c6d, String str, String str2, String str3) {
        this.o = c6d;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object call() {
        c6d c6d = this.o;
        uf9 uf9 = c6d.l;
        i6d i6d = c6d.a;
        gf6 E = uf9.E();
        String str = this.a;
        if (str == null) {
            E.X(1);
        } else {
            E.h(1, str);
        }
        String str2 = this.b;
        if (str2 == null) {
            E.X(2);
        } else {
            E.h(2, str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            E.X(3);
        } else {
            E.h(3, str3);
        }
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
    }
}
