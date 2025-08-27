package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: pn7  reason: default package */
public final /* synthetic */ class pn7 extends FunctionReferenceImpl implements Function3 {
    public static final pn7 a = new FunctionReferenceImpl(3, qn7.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qn7 qn7 = (qn7) obj;
        vpd vpd = (vpd) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qn7.a;
        qn7.getClass();
        while (true) {
            Object obj4 = qn7.a.get(qn7);
            if (obj4 instanceof oe7) {
                if (qn7.c0(obj4) >= 0) {
                    ((upd) vpd).c = kv0.H(qn7, new nn7(qn7, vpd));
                    break;
                }
            } else {
                ((upd) vpd).v = Unit.INSTANCE;
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
