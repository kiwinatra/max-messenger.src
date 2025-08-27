package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: lrd  reason: default package */
public final /* synthetic */ class lrd extends FunctionReferenceImpl implements Function2 {
    public static final lrd a = new FunctionReferenceImpl(2, nrd.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

    public final Object invoke(Object obj, Object obj2) {
        int i = nrd.a;
        return new ord(((Number) obj).longValue(), (ord) obj2, 0);
    }
}
