package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vf9  reason: default package */
public final class vf9 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xf9 o;

    public vf9(xf9 xf9, long j, long j2, String str) {
        this.o = xf9;
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final Object call() {
        xf9 xf9 = this.o;
        mi miVar = xf9.c;
        i6d i6d = xf9.a;
        gf6 E = miVar.E();
        E.k(1, this.a);
        E.k(2, this.b);
        String str = this.c;
        if (str == null) {
            E.X(3);
        } else {
            E.h(3, str);
        }
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
