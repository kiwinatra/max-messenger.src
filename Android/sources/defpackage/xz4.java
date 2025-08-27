package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: xz4  reason: default package */
public abstract class xz4 {
    public final d14 a;
    public final Lazy b;
    public final xme c;
    public final xme d;
    public final n6e e = m5a.b(0, 0, (cu0) null, 7);
    public final n6e f = m5a.b(0, 0, (cu0) null, 7);
    public final bs5 g;
    public final Lazy h;
    public final Lazy i;
    public final xme j;
    public final xme k;
    public a05 l;
    public final AtomicLong m;
    public final AtomicLong n;

    public xz4(d14 d14) {
        this.a = d14;
        Lazy e2 = bzb.a.e();
        this.b = e2;
        xme a2 = f6e.a((Object) null);
        this.c = a2;
        xme a3 = f6e.a(CollectionsKt.emptyList());
        this.d = a3;
        this.g = bs0.F(new i21(new on2(a2, 28), a3, new sa(3, (Continuation) null, 8), 4), ((osa) ((gaf) e2.getValue())).a());
        qr3 qr3 = new qr3(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = LazyKt.lazy(lazyThreadSafetyMode, qr3);
        this.i = LazyKt.lazy(lazyThreadSafetyMode, new qr3(18));
        this.j = f6e.a((Object) null);
        xme a4 = f6e.a((Object) null);
        this.k = a4;
        this.m = new AtomicLong();
        this.n = new AtomicLong();
        bs0.K(bs0.F(new ps5(a4, new vz4(this, (Continuation) null), 5), ((osa) ((gaf) e2.getValue())).a()), d14);
    }

    public abstract void a(int i2);

    public abstract void b();

    public final zz4 c() {
        return (zz4) this.i.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    public final qz4 f() {
        return (qz4) this.h.getValue();
    }

    public abstract void g(int i2);

    public abstract Object h(String str, RectF rectF, Continuation continuation);

    public abstract Unit i();

    public abstract void j();

    public abstract void k();

    public abstract Object l(Continuation continuation);

    public abstract void m(int i2, String str);
}
