package defpackage;

import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;

/* renamed from: ha  reason: default package */
public final class ha implements ukb {
    public static final /* synthetic */ KProperty[] i = {rae.s(ha.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;", 0)};
    public final long a;
    public final Lazy b;
    public final Lazy c;
    public d14 d;
    public final n6e e;
    public final dtc f;
    public final wie g = o5a.U();
    public final boolean h;

    public ha(long j, Lazy lazy, Lazy lazy2) {
        this.a = j;
        this.b = lazy;
        this.c = lazy2;
        boolean z = false;
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.e = b2;
        this.f = new dtc(b2);
        a32 a32 = (a32) ((my2) ((qx2) lazy.getValue())).o(j).a.getValue();
        if (a32 != null && a32.K()) {
            z = true;
        }
        this.h = z;
    }

    public final void a() {
        this.d = null;
    }

    public final void b(dkb dkb) {
    }

    public final void c(d14 d14) {
        this.d = d14;
    }

    public final void d(long j) {
    }
}
