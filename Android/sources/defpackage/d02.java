package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: d02  reason: default package */
public final class d02 extends xag {
    public static final /* synthetic */ KProperty[] Y = {rae.s(d02.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;", 0)};
    public final wie X;
    public final rz1 b;
    public final Lazy c;
    public final xme o;
    public final etc v;
    public final xme w;
    public final etc x;
    public final s85 y;
    public final s85 z;

    public d02(long j, gzb gzb, fzb fzb) {
        rz1 rz1;
        int ordinal = gzb.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            rz1 = new h52(j, this.a, fzb);
        } else if (ordinal == 2) {
            rz1 = new cm3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = rz1;
        Lazy e = bzb.a.e();
        this.c = e;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.o = a;
        this.v = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.w = a2;
        this.x = new etc(a2);
        this.y = new s85(0);
        this.z = new s85(0);
        this.X = o5a.U();
        bs0.K(bs0.F(new ps5(new on2(rz1.f(), 28), new yz1(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).a()), this.a);
        bs0.K(bs0.F(new ps5(rz1.e, new zz1(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).a()), this.a);
        bs0.K(bs0.F(new ps5(rz1.f, new a02(this, (Continuation) null), 5), ((osa) ((gaf) e.getValue())).c()), this.a);
    }

    public final void i() {
        this.b.b();
    }
}
