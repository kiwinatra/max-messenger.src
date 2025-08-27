package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ej7  reason: default package */
public final class ej7 implements f3d, bwb {
    public final g3d a;
    public final bwb b;
    public final g3d c;
    public final f3d d;

    public ej7(zb6 zb6, f3d f3d) {
        this.a = zb6;
        this.b = f3d;
        this.c = zb6;
        this.d = f3d;
    }

    public final void a(yvb yvb, String str, Map map) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.i(((ik0) yvb).b, str, map);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.a(yvb, str, map);
        }
    }

    public final void b(yvb yvb) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.g(((ik0) yvb).b);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.b(yvb);
        }
    }

    public final void c(yvb yvb) {
        g3d g3d = this.c;
        if (g3d != null) {
            ik0 ik0 = (ik0) yvb;
            boolean g = ik0.g();
            g3d.b(ik0.a, ik0.o, ik0.b, g);
        }
        f3d f3d = this.d;
        if (f3d != null) {
            f3d.c(yvb);
        }
    }

    public final void d(yvb yvb, String str, Throwable th, Map map) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.j(((ik0) yvb).b, str, th, map);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.d(yvb, str, th, map);
        }
    }

    public final void e(yvb yvb, String str, boolean z) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.f(((ik0) yvb).b, str, z);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.e(yvb, str, z);
        }
    }

    public final void f(yvb yvb, Throwable th) {
        g3d g3d = this.c;
        if (g3d != null) {
            ik0 ik0 = (ik0) yvb;
            g3d.c(((ik0) yvb).a, ik0.b, th, ik0.g());
        }
        f3d f3d = this.d;
        if (f3d != null) {
            f3d.f(yvb, th);
        }
    }

    public final void g(yvb yvb) {
        g3d g3d = this.c;
        if (g3d != null) {
            ik0 ik0 = (ik0) yvb;
            g3d.a(((ik0) yvb).a, ik0.b, ik0.g());
        }
        f3d f3d = this.d;
        if (f3d != null) {
            f3d.g(yvb);
        }
    }

    public final void h(yvb yvb) {
        g3d g3d = this.c;
        if (g3d != null) {
            g3d.k(((ik0) yvb).b);
        }
        f3d f3d = this.d;
        if (f3d != null) {
            f3d.h(yvb);
        }
    }

    public final boolean i(yvb yvb, String str) {
        Boolean bool = null;
        g3d g3d = this.a;
        Boolean valueOf = g3d != null ? Boolean.valueOf(g3d.h(((ik0) yvb).b)) : null;
        if (!Intrinsics.areEqual((Object) valueOf, (Object) Boolean.TRUE)) {
            bwb bwb = this.b;
            if (bwb != null) {
                bool = Boolean.valueOf(bwb.i(yvb, str));
            }
            valueOf = bool;
        }
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void j(yvb yvb, String str) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.d(((ik0) yvb).b, str);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.j(yvb, str);
        }
    }

    public final void k(yvb yvb, String str) {
        g3d g3d = this.a;
        if (g3d != null) {
            g3d.e(((ik0) yvb).b, str);
        }
        bwb bwb = this.b;
        if (bwb != null) {
            bwb.k(yvb, str);
        }
    }
}
