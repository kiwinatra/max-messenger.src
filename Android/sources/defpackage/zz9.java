package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* renamed from: zz9  reason: default package */
public final class zz9 implements kw1, neg {
    public final lw1 a;
    public final Object b = null;
    public final /* synthetic */ a0a c;

    public zz9(a0a a0a, lw1 lw1) {
        this.c = a0a;
        this.a = lw1;
    }

    public final void a(iod iod, int i) {
        this.a.a(iod, i);
    }

    public final bpa f(Object obj, Function3 function3) {
        a0a a0a = this.c;
        ju0 ju0 = new ju0(1, a0a, this);
        bpa E = this.a.E((Unit) obj, ju0);
        if (E != null) {
            a0a.h.set(a0a, this.b);
        }
        return E;
    }

    public final CoroutineContext getContext() {
        return this.a.v;
    }

    public final void i(q04 q04, Object obj) {
        this.a.i(q04, (Unit) obj);
    }

    public final boolean isActive() {
        return this.a.isActive();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final void k(Function1 function1) {
        this.a.k(function1);
    }

    public final void l(Object obj, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a0a.h;
        Object obj2 = this.b;
        a0a a0a = this.c;
        atomicReferenceFieldUpdater.set(a0a, obj2);
        wk wkVar = new wk(24, a0a, this);
        lw1 lw1 = this.a;
        lw1.C((Unit) obj, lw1.c, new ir0(2, wkVar));
    }

    public final bpa o(Throwable th) {
        return this.a.o(th);
    }

    public final boolean q(Throwable th) {
        return this.a.q(th);
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }

    public final void v(Object obj) {
        this.a.v(obj);
    }
}
