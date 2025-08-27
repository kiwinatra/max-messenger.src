package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: su0  reason: default package */
public final /* synthetic */ class su0 extends FunctionReferenceImpl implements Function2 {
    public static final su0 a = new FunctionReferenceImpl(2, tu0.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        f22 f22 = (f22) obj2;
        f22 f222 = tu0.a;
        return new f22(longValue, f22, f22.v, 0);
    }
}
