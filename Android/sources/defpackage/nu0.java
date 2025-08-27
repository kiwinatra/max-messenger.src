package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: nu0  reason: default package */
public final /* synthetic */ class nu0 extends FunctionReferenceImpl implements Function3 {
    public static final nu0 a = new FunctionReferenceImpl(3, ru0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ru0 ru0 = (ru0) obj;
        vpd vpd = (vpd) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ru0.o;
        ru0.getClass();
        f22 f22 = (f22) ru0.z.get(ru0);
        while (true) {
            if (ru0.x()) {
                ((upd) vpd).v = tu0.l;
                break;
            }
            long andIncrement = ru0.v.getAndIncrement(ru0);
            long j = (long) tu0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (f22.c != j2) {
                f22 m = ru0.m(j2, f22);
                if (m == null) {
                    continue;
                } else {
                    f22 = m;
                }
            }
            Object H = ru0.H(f22, i, andIncrement, vpd);
            if (H == tu0.m) {
                neg neg = vpd instanceof neg ? (neg) vpd : null;
                if (neg != null) {
                    neg.a(f22, i);
                }
            } else if (H == tu0.o) {
                if (andIncrement < ru0.q()) {
                    f22.a();
                }
            } else if (H != tu0.n) {
                f22.a();
                ((upd) vpd).v = H;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return Unit.INSTANCE;
    }
}
