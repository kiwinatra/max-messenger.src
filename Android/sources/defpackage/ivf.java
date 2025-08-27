package defpackage;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ivf  reason: default package */
public final class ivf extends dgd {
    private volatile boolean threadLocalIsSet;
    public final ThreadLocal v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ivf(kotlin.coroutines.Continuation r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            jvf r0 = defpackage.jvf.a
            kotlin.coroutines.CoroutineContext$Element r1 = r4.get(r0)
            if (r1 != 0) goto L_0x000d
            kotlin.coroutines.CoroutineContext r0 = r4.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.v = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.q04
            if (r3 != 0) goto L_0x0031
            r3 = 0
            java.lang.Object r3 = defpackage.eif.b(r4, r3)
            defpackage.eif.a(r4, r3)
            r2.n0(r4, r3)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivf.<init>(kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean l0() {
        boolean z = this.threadLocalIsSet && this.v.get() == null;
        this.v.remove();
        return !z;
    }

    public final void n0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.v.set(TuplesKt.to(coroutineContext, obj));
    }

    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.v.get();
            if (pair != null) {
                eif.a((CoroutineContext) pair.component1(), pair.component2());
            }
            this.v.remove();
        }
        Object a = lb3.a(obj);
        Continuation continuation = this.o;
        CoroutineContext context = continuation.getContext();
        ivf ivf = null;
        Object b = eif.b(context, ivf);
        if (b != eif.a) {
            ivf = o04.c(continuation, context, b);
        }
        try {
            this.o.resumeWith(a);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (ivf == null || ivf.l0()) {
                eif.a(context, b);
            }
        }
    }
}
