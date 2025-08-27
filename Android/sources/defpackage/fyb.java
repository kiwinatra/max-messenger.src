package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;

/* renamed from: fyb  reason: default package */
public final /* synthetic */ class fyb extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public static final fyb a = new AdaptedFunctionReference(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        KProperty[] kPropertyArr = syb.C0;
        return new Pair((a32) obj, (vk3) obj2);
    }
}
