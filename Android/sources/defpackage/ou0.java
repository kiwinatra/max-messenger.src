package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: ou0  reason: default package */
public final /* synthetic */ class ou0 extends FunctionReferenceImpl implements Function3 {
    public static final ou0 a = new FunctionReferenceImpl(3, ru0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ru0 ru0 = (ru0) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ru0.o;
        ru0.getClass();
        if (obj3 == tu0.l) {
            obj3 = new c22(ru0.n());
        }
        return new e22(obj3);
    }
}
