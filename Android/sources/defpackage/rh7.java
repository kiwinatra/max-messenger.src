package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;

/* renamed from: rh7  reason: default package */
public final class rh7 extends xag implements oh3 {
    public static final /* synthetic */ KProperty[] B0;
    public final Regex A0;
    public final s85 X;
    public final g12 Y;
    public final wie Z;
    public final /* synthetic */ abg b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final wie v0;
    public final Lazy w;
    public final xme w0;
    public final Lazy x;
    public final etc x0;
    public final s85 y = new s85(0);
    public final xme y0;
    public final n6e z;
    public final bs5 z0;

    static {
        Class<rh7> cls = rh7.class;
        B0 = new KProperty[]{rae.s(cls, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;", 0)};
    }

    public rh7(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        n88 n88 = n88.a;
        Lazy h = n88.getAccessor().h(e24.class);
        Lazy h2 = n88.getAccessor().h(zbf.class);
        Lazy h3 = n88.getAccessor().h(aeb.class);
        abg abg = new abg(lazy3, new wg7(1));
        this.b = abg;
        this.c = lazy;
        this.o = lazy2;
        this.v = h;
        this.w = h3;
        this.x = h2;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.z = b2;
        this.X = new s85(0);
        g12 M = bs0.M(b2, new on2(abg.o, 28));
        this.Y = M;
        this.Z = o5a.U();
        this.v0 = o5a.U();
        xme a = f6e.a(xsa.b);
        this.w0 = a;
        va1 va1 = new va1(2, a, this, lazy2, h3);
        w14 w14 = new w14((ysa) a.getValue(), IntCompanionObject.MAX_VALUE, new igf(nlc.oneme_login_input_default_phone_hint));
        this.x0 = bs0.X(va1, this.a, z6e.a, w14);
        xme a2 = f6e.a("");
        this.y0 = a2;
        this.z0 = bs0.F(new i21(new wb(22, a2, this), new h11(a, h3, 2), new kh7(3, (Continuation) null, 0), 4), ((osa) ((gaf) lazy2.getValue())).a());
        this.A0 = new Regex("[^0-9+]");
        bs0.K(bs0.F(new ps5(M, new ih7(this, h, (Continuation) null), 5), ((osa) ((gaf) lazy2.getValue())).a()), this.a);
    }

    public final dtc e() {
        return this.b.o;
    }

    public final void i() {
        KProperty[] kPropertyArr = B0;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.Z;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[0], (Object) null);
        KProperty kProperty2 = kPropertyArr[1];
        wie wie2 = this.v0;
        pm7 pm72 = (pm7) wie2.getValue(this, kProperty2);
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        wie2.setValue(this, kPropertyArr[1], (Object) null);
    }
}
