package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: wma  reason: default package */
public final /* synthetic */ class wma extends FunctionReferenceImpl implements Function3 {
    public static final wma a = new FunctionReferenceImpl(3, xma.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xma xma = (xma) obj;
        vpd vpd = (vpd) obj2;
        long j = xma.a;
        if (j <= 0) {
            ((upd) vpd).v = Unit.INSTANCE;
        } else {
            uj6 uj6 = new uj6(15, vpd, xma);
            upd upd = (upd) vpd;
            CoroutineContext coroutineContext = upd.a;
            upd.c = xk4.d(coroutineContext).U(j, uj6, coroutineContext);
        }
        return Unit.INSTANCE;
    }
}
