package defpackage;

import kotlin.collections.CollectionsKt;

/* renamed from: tud  reason: default package */
public final class tud extends ivd {
    public final long x0;
    public final long y0;
    public final long z0;

    public tud(sud sud) {
        super(sud);
        this.x0 = sud.l;
        this.y0 = sud.m;
        this.z0 = sud.n;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, m20] */
    public final ga9 A() {
        ha9 r = p().r(this.y0);
        String str = null;
        if (!(h().G(this.x0) == null || r == null)) {
            w28 w28 = r.x0;
            int G = w28.G();
            int i = 0;
            while (i < G) {
                l20 F = w28.F(i);
                if (F == null) {
                    return null;
                }
                boolean f = F.f();
                x10 x10 = F.b;
                long j = this.z0;
                if ((!f || x10.y != j) && ((!F.i() || F.d.a != j) && ((!F.h() || F.f.a != j) && (!F.g() || F.g.a != j)))) {
                    i++;
                } else {
                    if (F.f()) {
                        x10 a = x10.b().a();
                        j10 j2 = F.j();
                        j2.b = a;
                        F = j2.a();
                    }
                    ? obj = new Object();
                    obj.a = CollectionsKt.listOf(F);
                    w28 c = obj.c();
                    if (F.g()) {
                        str = F.g.b;
                    }
                    ga9 ga9 = new ga9();
                    ga9.g = str;
                    ga9.n = c;
                    return ga9;
                }
            }
        }
        return null;
    }
}
