package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: lk2  reason: default package */
public final class lk2 extends xag {
    public final ArrayList X;
    public final AtomicBoolean Y;
    public final pr2 Z;
    public final long b;
    public final boolean c;
    public final Lazy o;
    public final Lazy v;
    public final s85 v0;
    public final Lazy w;
    public final bs5 w0;
    public final Lazy x;
    public final m7f y;
    public aje z;

    public lk2(int i, long j, boolean z2) {
        z2 = (i & 2) != 0 ? false : z2;
        jxb jxb = jxb.a;
        Lazy c2 = jxb.c();
        Lazy e = jxb.e();
        Lazy f = jxb.f();
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new r52(17));
        this.b = j;
        this.c = z2;
        this.o = c2;
        this.v = e;
        this.w = f;
        this.x = lazy;
        this.y = new m7f();
        this.X = new ArrayList();
        this.Y = new AtomicBoolean(false);
        a32 j2 = j();
        this.Z = (j2 == null || !j2.K()) ? pr2.b : pr2.a;
        this.v0 = new s85(0);
        this.w0 = bs0.w(new gk2(bs0.F(new on2(((my2) ((qx2) c2.getValue())).o(j), 28), ((osa) ((gaf) f.getValue())).b()), this, 1));
    }

    public static boolean m(a32 a32) {
        boolean e = a32.b.e();
        boolean z2 = a32.u() || a32.B();
        if (!a32.e0()) {
            return e && z2;
        }
        return true;
    }

    public final a32 j() {
        return (a32) ((my2) ((qx2) this.o.getValue())).o(this.b).a.getValue();
    }

    public final List k() {
        a32 j = j();
        m7f m7f = this.y;
        m7f.getClass();
        List createListBuilder = CollectionsKt.createListBuilder();
        if (j != null && j.u()) {
            if (!this.c) {
                createListBuilder.add((ow3) ((Lazy) m7f.a).getValue());
            }
            if (j.K()) {
                createListBuilder.add((ow3) ((Lazy) m7f.c).getValue());
            } else {
                createListBuilder.add((ow3) ((Lazy) m7f.b).getValue());
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final bs5 l() {
        return bs0.w(bs0.F(new gk2(new on2(((my2) ((qx2) this.o.getValue())).o(this.b), 28), this, 0), ((osa) ((gaf) this.w.getValue())).b()));
    }

    public final void n(List list, boolean z2) {
        egf egf;
        this.Y.set(z2);
        ArrayList arrayList = this.X;
        arrayList.clear();
        arrayList.addAll(list);
        int ordinal = this.Z.ordinal();
        if (ordinal == 0) {
            egf = new egf(kxa.c, list.size());
        } else if (ordinal == 1) {
            egf = new egf(kxa.d, list.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xag.h(this.v0, new v3c(egf));
    }

    public final void o() {
        egf egf;
        this.Y.set(false);
        ArrayList arrayList = this.X;
        arrayList.clear();
        int ordinal = this.Z.ordinal();
        if (ordinal == 0) {
            egf = new egf(kxa.e, arrayList.size());
        } else if (ordinal == 1) {
            egf = new egf(kxa.f, arrayList.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xag.h(this.v0, new w3c(egf));
    }

    public final void q() {
        ArrayList arrayList = this.X;
        List list = CollectionsKt.toList(arrayList);
        arrayList.clear();
        aje aje = this.z;
        if ((aje == null || !aje.isActive()) && !list.isEmpty()) {
            this.z = xag.g(this, ((osa) ((gaf) this.w.getValue())).b().plus(caa.a), (f14) null, new kk2(this, list, (Continuation) null), 2);
        }
    }
}
