package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: wf3  reason: default package */
public final class wf3 extends xag implements oh3 {
    public static final /* synthetic */ KProperty[] E0;
    public static final String F0;
    public final xme A0;
    public volatile String B0;
    public aje C0;
    public final wie D0;
    public final Lazy X;
    public final Lazy Y;
    public final n6e Z;
    public final /* synthetic */ abg b;
    public final int c;
    public String o;
    public final String v;
    public final g12 v0;
    public final Lazy w;
    public final s85 w0 = new s85(0);
    public final Lazy x;
    public final xme x0;
    public final Lazy y;
    public final etc y0;
    public final Lazy z;
    public final k6e z0;

    static {
        Class<wf3> cls = wf3.class;
        E0 = new KProperty[]{rae.s(cls, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;", 0)};
        F0 = cls.getName();
    }

    public wf3(int i, String str, String str2, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        n88 n88 = n88.a;
        Lazy h = n88.getAccessor().h(e24.class);
        Lazy h2 = n88.getAccessor().h(bfe.class);
        abg abg = new abg(lazy5, new of3(0));
        this.b = abg;
        this.c = i;
        this.o = str;
        this.v = str2;
        this.w = lazy;
        this.x = lazy2;
        this.y = lazy3;
        this.z = lazy4;
        this.X = h;
        this.Y = h2;
        n6e b2 = m5a.b(0, 1, cu0.b, 1);
        this.Z = b2;
        g12 M = bs0.M(b2, new on2(new on2(abg.o, 28), 13));
        this.v0 = M;
        xme a = f6e.a(60L);
        this.x0 = a;
        this.y0 = bs0.X(new on2(a, 14), this.a, z6e.a, (Object) null);
        this.z0 = ((wt6) ((bfe) h2.getValue())).c;
        this.A0 = f6e.a(Boolean.FALSE);
        this.D0 = o5a.U();
        bs0.K(bs0.F(new ps5(M, new pf3(this, h, (Continuation) null), 5), ((osa) ((gaf) lazy4.getValue())).a()), this.a);
    }

    public final dtc e() {
        return this.b.o;
    }

    public final void i() {
        aje aje = this.C0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.C0 = null;
        KProperty[] kPropertyArr = E0;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.D0;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
    }
}
