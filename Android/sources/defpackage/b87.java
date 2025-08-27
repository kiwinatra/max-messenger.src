package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: b87  reason: default package */
public final /* synthetic */ class b87 implements dwd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b87(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(fwd fwd) {
        switch (this.a) {
            case 0:
                g87 g87 = (g87) this.b;
                if (g87.c() != null) {
                    ev0.g();
                    cwd cwd = g87.s;
                    if (cwd != null) {
                        cwd.b();
                        g87.s = null;
                    }
                    za7 za7 = g87.r;
                    if (za7 != null) {
                        za7.a();
                        g87.r = null;
                    }
                    g87.o.c();
                    g87.e();
                    hc0 hc0 = g87.g;
                    hc0.getClass();
                    bwd D = g87.D((j87) g87.f, hc0);
                    g87.q = D;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = new Object[]{D.c()}[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    g87.C(Collections.unmodifiableList(arrayList));
                    g87.o();
                    return;
                }
                return;
            case 1:
                y87 y87 = (y87) this.b;
                if (y87.c() != null) {
                    k9f k9f = y87.w;
                    k9f.getClass();
                    ev0.g();
                    k9f.w = true;
                    k3d k3d = k9f.o;
                    if (k3d != null) {
                        ev0.g();
                        if (!k3d.d.b.isDone()) {
                            Exception exc = new Exception("The request is aborted silently and retried.", (Throwable) null);
                            ev0.g();
                            k3d.g = true;
                            zz7 zz7 = k3d.i;
                            Objects.requireNonNull(zz7);
                            zz7.cancel(true);
                            k3d.e.d(exc);
                            k3d.f.b((Object) null);
                            k9f k9f2 = k3d.b;
                            k9f2.getClass();
                            ev0.g();
                            k9f2.a.addFirst(k3d.a);
                            k9f2.c();
                        }
                    }
                    y87.D(true);
                    hc0 hc02 = y87.g;
                    hc02.getClass();
                    bwd E = y87.E(y87.e(), (z87) y87.f, hc02);
                    y87.u = E;
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = new Object[]{E.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    y87.C(Collections.unmodifiableList(arrayList2));
                    y87.o();
                    k9f k9f3 = y87.w;
                    k9f3.getClass();
                    ev0.g();
                    k9f3.w = false;
                    k9f3.c();
                    return;
                }
                return;
            case 2:
                kq9 kq9 = (kq9) this.b;
                kq9.b = kq9.d();
                mr1 mr1 = (mr1) kq9.v;
                if (mr1 != null) {
                    xr1 xr1 = mr1.b;
                    xr1.getClass();
                    try {
                        if (((Boolean) m5a.F(new mr1(xr1, 0)).b.get()).booleanValue()) {
                            kq9 kq92 = xr1.F0;
                            xr1 xr12 = xr1;
                            xr1.c.execute(new or1(xr12, xr1.v(kq92), (fwd) kq92.b, (jq9) kq92.c, (hc0) null, Collections.singletonList(b0g.w), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                } else {
                    return;
                }
            case 3:
                bub bub = (bub) this.b;
                if (bub.c() != null) {
                    bub.F((cub) bub.f, bub.g);
                    bub.o();
                    return;
                }
                return;
            case 4:
                Iterator it = ((ewd) this.b).m.iterator();
                while (it.hasNext()) {
                    ((dwd) it.next()).a(fwd);
                }
                return;
            default:
                ((r3g) this.b).L();
                return;
        }
    }
}
