package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: f22  reason: default package */
public final class f22 extends iod {
    public final ru0 v;
    public final /* synthetic */ AtomicReferenceArray w = new AtomicReferenceArray(tu0.b * 2);

    public f22(long j, f22 f22, ru0 ru0, int i) {
        super(j, f22, i);
        this.v = ru0;
    }

    public final int g() {
        return tu0.b;
    }

    public final void h(int i, CoroutineContext coroutineContext) {
        ru0 ru0;
        Function1 function1;
        Function1 function12;
        int i2 = tu0.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.w.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof neg;
            ru0 = this.v;
            if (z2 || (l instanceof oeg)) {
                if (k(i, l, z ? tu0.j : tu0.k)) {
                    n(i, (Object) null);
                    m(i, !z);
                    if (z && (function1 = ru0.b) != null) {
                        iq.o(function1, obj, coroutineContext);
                        return;
                    }
                    return;
                }
            } else if (l == tu0.j || l == tu0.k) {
                n(i, (Object) null);
            } else if (!(l == tu0.g || l == tu0.f)) {
                if (l != tu0.i && l != tu0.d && l != tu0.l) {
                    throw new IllegalStateException(("unexpected state: " + l).toString());
                }
                return;
            }
        }
        n(i, (Object) null);
        if (z && (function12 = ru0.b) != null) {
            iq.o(function12, obj, coroutineContext);
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.w;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.w.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            this.v.J((this.c * ((long) tu0.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.w.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.w.set((i * 2) + 1, obj);
    }
}
