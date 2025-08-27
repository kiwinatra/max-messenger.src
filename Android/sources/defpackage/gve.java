package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* renamed from: gve  reason: default package */
public final /* synthetic */ class gve extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public static final gve a = new AdaptedFunctionReference(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        return new Pair((List) obj, (fue) obj2);
    }
}
