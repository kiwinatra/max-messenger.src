package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;

/* renamed from: egb  reason: default package */
public final class egb implements ukb {
    public static final /* synthetic */ KProperty[] l = {rae.s(egb.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;", 0)};
    public final long a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final n6e g;
    public final dtc h;
    public final AtomicLong i = new AtomicLong();
    public final wie j = o5a.U();
    public d14 k;

    public egb(long j2, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = j2;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
        this.f = lazy5;
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.g = b2;
        this.h = new dtc(b2);
    }

    public final void a() {
        this.k = null;
    }

    public final void b(dkb dkb) {
    }

    public final void c(d14 d14) {
        this.k = d14;
        bs0.K(new ps5(new dtc(((kgb) this.e.getValue()).a), new cgb(this, (Continuation) null), 5), d14);
    }

    public final void d(long j2) {
    }
}
