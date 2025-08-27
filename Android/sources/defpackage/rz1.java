package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: rz1  reason: default package */
public abstract class rz1 {
    public final long a;
    public final d14 b;
    public final xme c = f6e.a((Object) null);
    public final xme d = f6e.a(CollectionsKt.emptyList());
    public final n6e e = m5a.b(0, 0, (cu0) null, 7);
    public final n6e f = m5a.b(0, 0, (cu0) null, 7);
    public final Lazy g = LazyKt.lazy(new lj1(20));
    public final xme h = f6e.a((Object) null);
    public final xme i = f6e.a((Object) null);

    public rz1(long j, d14 d14) {
        this.a = j;
        this.b = d14;
    }

    public void a() {
    }

    public abstract void b();

    public Object c(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final void d(qz1 qz1) {
        this.c.setValue(qz1.a);
        this.d.setValue(qz1.b);
    }

    public void e() {
    }

    public abstract bs5 f();

    public void g(int i2) {
    }

    public void h(int i2) {
    }

    public void i(int i2) {
    }

    public abstract Object j(Continuation continuation);

    public abstract void k(String str);

    public void l(int i2) {
    }
}
