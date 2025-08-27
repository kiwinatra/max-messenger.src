package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: cbd  reason: default package */
public final class cbd extends g0 {
    public final /* synthetic */ int o;
    public final Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbd(CoroutineContext coroutineContext, AtomicReference atomicReference, int i) {
        super(coroutineContext, false, true);
        this.o = i;
        this.v = atomicReference;
    }

    public final void h0(Throwable th, boolean z) {
        switch (this.o) {
            case 0:
                try {
                    if (((pa3) ((ta3) this.v)).a(th)) {
                        return;
                    }
                } catch (Throwable th2) {
                    ExceptionsKt.addSuppressed(th, th2);
                }
                ev0.q(th, this.c);
                return;
            default:
                try {
                    if (((pbe) ((ube) this.v)).d(th)) {
                        return;
                    }
                } catch (Throwable th3) {
                    ExceptionsKt.addSuppressed(th, th3);
                }
                ev0.q(th, this.c);
                return;
        }
    }

    public final void i0(Object obj) {
        switch (this.o) {
            case 0:
                Unit unit = (Unit) obj;
                try {
                    ((pa3) ((ta3) this.v)).b();
                    return;
                } catch (Throwable th) {
                    ev0.q(th, this.c);
                    return;
                }
            default:
                try {
                    ((pbe) ((ube) this.v)).a(obj);
                    return;
                } catch (Throwable th2) {
                    ev0.q(th2, this.c);
                    return;
                }
        }
    }
}
