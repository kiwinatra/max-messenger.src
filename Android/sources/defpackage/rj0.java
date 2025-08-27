package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: rj0  reason: default package */
public final /* synthetic */ class rj0 implements qk3, osb, ice {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rj0(long j, boolean z, zb2 zb2) {
        this.b = j;
        this.c = z;
        this.o = zb2;
    }

    public void accept(Object obj) {
        Map map = (Map) obj;
        vd8 vd8 = (vd8) this.o;
        vd8.getClass();
        boolean z = this.c;
        ao0 ao0 = z ? (ao0) map.get(zd8.a) : (ao0) map.get(zd8.c);
        for (sj0 sj0 : vd8.b.values()) {
            int i = (sj0.b.j > this.b ? 1 : (sj0.b.j == this.b ? 0 : -1));
            e4 e4Var = sj0.a;
            if (i != 0) {
                e4Var.z(ao0);
            } else if (z) {
                e4Var.z((ao0) map.get(zd8.b));
            } else {
                e4Var.z((ao0) map.get(zd8.o));
            }
            e4Var.B();
        }
    }

    public void h(pbe pbe) {
        long j = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 2:
                ye2 ye2 = (ye2) obj;
                ye2.getClass();
                z68.c("ye2", "loadNetworkPrevPage, messageId = " + j, new Object[0]);
                fa9 fa9 = ye2.r;
                ha9 r = fa9.r(j);
                ArrayList l = ((a74) fa9.a).c.l(ye2.a, r != null ? r.o : LongCompanionObject.MAX_VALUE, ye2.f, (Integer) null, this.c);
                ArrayList b2 = ye2.u.b(l);
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    ye2.t.e((ha9) it.next());
                }
                pbe.a(b2);
                return;
            default:
                km3 km3 = (km3) obj;
                km3.d();
                vk3 n = km3.n(j, this.c);
                if (n != null) {
                    if (!pbe.f()) {
                        pbe.a(n);
                        return;
                    }
                    return;
                } else if (!pbe.f()) {
                    pbe.onError(new Exception(wj6.i(j, "contact not found: ")));
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean test(Object obj) {
        a32 a32 = (a32) obj;
        if (a32.b.h(this.b)) {
            if (!this.c || a32.b.k <= 0) {
                return false;
            }
        } else if (!r62.N.test(a32)) {
            return false;
        } else {
            osb osb = (osb) this.o;
            if (osb != null && !osb.test(a32)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ rj0(ye2 ye2, long j, boolean z) {
        this.o = ye2;
        this.b = j;
        this.c = z;
    }

    public /* synthetic */ rj0(km3 km3, long j) {
        this.o = km3;
        this.b = j;
        this.c = false;
    }

    public /* synthetic */ rj0(vd8 vd8, boolean z, long j) {
        this.o = vd8;
        this.c = z;
        this.b = j;
    }
}
