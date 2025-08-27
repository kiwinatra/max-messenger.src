package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;

/* renamed from: bu3  reason: default package */
public final class bu3 implements ukb {
    public static final /* synthetic */ KProperty[] h = {rae.s(bu3.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;", 0)};
    public final zc4 a;
    public final Lazy b;
    public final Lazy c;
    public d14 d;
    public final wie e = o5a.U();
    public final n6e f;
    public final dtc g;

    public bu3(zc4 zc4, Lazy lazy, Lazy lazy2) {
        this.a = zc4;
        this.b = lazy;
        this.c = lazy2;
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.f = b2;
        this.g = new dtc(b2);
    }

    public final void a() {
        this.d = null;
    }

    public final void b(dkb dkb) {
        ((AtomicReference) this.a.v).updateAndGet(new n01(7, dkb));
    }

    public final void c(d14 d14) {
        this.d = d14;
    }

    public final void d(long j) {
        ((AtomicReference) this.a.v).updateAndGet(new grd(j));
    }
}
