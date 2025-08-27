package defpackage;

import java.util.Collection;

/* renamed from: oha  reason: default package */
public final class oha extends lbe implements kj6 {
    public final /* synthetic */ int a = 1;
    public final oka b;
    public final Object c;

    public oha(oka oka) {
        this.b = oka;
        this.c = new cj6();
    }

    public final jha d() {
        switch (this.a) {
            case 0:
                return new mha(this.b, (nsb) this.c, 0);
            default:
                return new lka(this.b, (cj6) this.c, 1);
        }
    }

    public final void m(gce gce) {
        oka oka = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                oka.a(new nha(gce, (nsb) obj));
                return;
            default:
                try {
                    Object obj2 = ((cj6) obj).get();
                    o95 o95 = p95.a;
                    oka.a(new ab3(5, gce, (Collection) obj2));
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.c(th, gce);
                    return;
                }
        }
    }

    public oha(oka oka, nsb nsb) {
        this.b = oka;
        this.c = nsb;
    }
}
