package defpackage;

/* renamed from: yu  reason: default package */
public final /* synthetic */ class yu implements za3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ se2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ yu(se2 se2, long j, int i) {
        this.a = i;
        this.b = se2;
        this.c = j;
    }

    public final void b(pa3 pa3) {
        switch (this.a) {
            case 0:
                zz6 zz6 = this.b.b;
                kn5 kn5 = zz6.e;
                long j = this.c;
                if (kn5 != null) {
                    String b2 = kn5.b(j);
                    kn5.c("loadPrev: " + b2);
                }
                zz6.q();
                if (!zz6.d().i().isEmpty()) {
                    gz6 r = kv0.r(zz6.f(j));
                    if (r != null) {
                        j = r.h();
                    }
                    long j2 = j;
                    zz6.j(zz6.b, j2, true, false, false);
                    zz6.k(zz6.c, j2, true, false);
                } else {
                    zz6.l(j);
                }
                if (kn5 != null) {
                    n54.y(kn5, zz6.e());
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
            default:
                zz6 zz62 = this.b.b;
                kn5 kn52 = zz62.e;
                long j3 = this.c;
                if (kn52 != null) {
                    String b3 = kn5.b(j3);
                    kn52.c("load: " + b3);
                }
                zz62.q();
                if (!zz62.d().i().isEmpty()) {
                    zz62.j(zz62.b, j3, true, true, false);
                    zz62.k(zz62.c, j3, true, true);
                } else {
                    zz62.l(j3);
                }
                if (kn52 != null) {
                    n54.y(kn52, zz62.e());
                }
                if (!pa3.f()) {
                    pa3.b();
                    return;
                }
                return;
        }
    }
}
