package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;

/* renamed from: zve  reason: default package */
public final /* synthetic */ class zve extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public static final zve a = new AdaptedFunctionReference(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        KProperty[] kPropertyArr = gwe.B0;
        return new Pair((bqe) obj, (Boolean) obj2);
    }
}
