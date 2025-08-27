package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* renamed from: y8e  reason: default package */
public final /* synthetic */ class y8e extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public static final y8e a = new AdaptedFunctionReference(3, w8e.class, "<init>", "<init>(Ljava/util/List;Ljava/util/List;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        return new w8e((List) obj, (List) obj2);
    }
}
