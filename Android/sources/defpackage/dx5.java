package defpackage;

import java.util.ArrayList;

/* renamed from: dx5  reason: default package */
public final class dx5 extends lbe implements ij6 {
    public final /* synthetic */ int a;
    public final wv5 b;

    public /* synthetic */ dx5(s0 s0Var, int i) {
        this.a = i;
        this.b = s0Var;
    }

    public final wv5 b() {
        switch (this.a) {
            case 0:
                return new cx5(this.b, (Object) null, 0);
            default:
                return new yw5(this.b, ns.a, 1);
        }
    }

    public final void m(gce gce) {
        wv5 wv5 = this.b;
        switch (this.a) {
            case 0:
                wv5.c(new zv5(gce, (Object) null));
                return;
            default:
                try {
                    ArrayList arrayList = new ArrayList();
                    o95 o95 = p95.a;
                    wv5.c(new kx5(gce, arrayList));
                    return;
                } catch (Throwable th) {
                    hd8.Z(th);
                    p45.c(th, gce);
                    return;
                }
        }
    }
}
