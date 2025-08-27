package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x8a  reason: default package */
public final class x8a extends xag {
    public final jhf X;
    public final etc Y;
    public final n6e Z;
    public final /* synthetic */ l7a b;
    public final Lazy c;
    public final frd o;
    public volatile q7a v;
    public final dtc v0;
    public final xme w;
    public final i21 w0;
    public volatile int x;
    public final xme x0;
    public final s85 y;
    public final ql8 y0;
    public final k6e z;

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, q40] */
    public x8a(Long l, f0d f0d, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        i0d i0d;
        onb onb = onb.a;
        n88 n88 = n88.a;
        Lazy h = n88.getAccessor().h(edb.class);
        Lazy h2 = n88.getAccessor().h(po5.class);
        Lazy h3 = n88.getAccessor().h(Application.class);
        Lazy h4 = n88.getAccessor().h(bud.class);
        Lazy h5 = n88.getAccessor().h(rl.class);
        Lazy h6 = n88.getAccessor().h(e0b.class);
        Lazy h7 = n88.getAccessor().h(eu3.class);
        Lazy h8 = n88.getAccessor().h(r80.class);
        Lazy e = n88.getAccessor().e(wla.class, false);
        l7a l7a = new l7a(h, lazy4, h2, h3, h4, h6);
        this.b = l7a;
        this.c = lazy;
        if (f0d != null) {
            i0d = new i0d(f0d, this.a, new s8a(this, 0), lazy3, lazy5, lazy2, lazy4, h5, h8, e);
        } else if (l != null) {
            long longValue = l.longValue();
            jx3 jx3 = this.a;
            s8a s8a = new s8a(this, 1);
            ? obj = new Object();
            obj.a = s8a;
            obj.v = h5;
            n6e a = m5a.a(1, 1, cu0.b);
            obj.b = a;
            obj.c = new dtc(a);
            xme a2 = f6e.a(onb);
            obj.o = a2;
            obj.w = new etc(a2);
            bs0.K(new ps5(((eu3) h7.getValue()).c(longValue), new i6c(obj, (Continuation) null), 5), jx3);
            i0d = obj;
        } else {
            throw new IllegalStateException("Pass registrationData or contactId to work with NeuroAvatarsDelegate".toString());
        }
        this.o = i0d;
        bs5 ql8 = new ql8(l7a.j, 11);
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.w = a3;
        this.y = new s85(0);
        oh3 oh3 = i0d instanceof oh3 ? i0d : null;
        this.z = oh3 != null ? oh3.e() : null;
        this.X = i0d.g();
        this.Y = bs0.X(new ps5(bs0.w(new i21(bs0.M(i0d.f(), ql8), i0d.c(), new sa(3, (Continuation) null, 22), 4)), new u8a(this, (Continuation) null), 5), this.a, z6e.a, new gqd((fqd) null, onb));
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        this.Z = b2;
        this.v0 = new dtc(b2);
        n6e a4 = m5a.a(1, 1, cu0.b);
        this.w0 = new i21(new etc(a3), a4, new y98(3, (Continuation) null, 2), 4);
        xme a5 = f6e.a(MapsKt.emptyMap());
        this.x0 = a5;
        this.y0 = new ql8(new etc(a5), 12);
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < 16; i++) {
            arrayList.add(new Object());
        }
        a4.d(arrayList);
        u7a u7a = (u7a) lazy.getValue();
        u7a.getClass();
        bs0.K(bs0.F(new ps5(bs0.F(new sbd(new t7a(u7a, (Continuation) null)), ((osa) ((gaf) u7a.c.getValue())).b()), new t8a(this, (Continuation) null), 5), ((osa) ((gaf) lazy4.getValue())).b()), this.a);
    }

    public final void i() {
        kv0.n(this.b.f.a, (CancellationException) null);
    }

    public final void j() {
        l7a l7a = this.b;
        if (!((edb) l7a.a.getValue()).b(edb.l)) {
            l7a.g.d(nd0.a);
            return;
        }
        ev0.v(l7a.f, (CoroutineContext) null, (f14) null, new k7a(l7a, (Continuation) null), 3);
    }
}
