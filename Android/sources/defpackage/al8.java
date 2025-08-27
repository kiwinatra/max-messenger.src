package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;

/* renamed from: al8  reason: default package */
public final /* synthetic */ class al8 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public static final al8 a = new AdaptedFunctionReference(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Continuation continuation = (Continuation) obj3;
        KProperty[] kPropertyArr = il8.G0;
        return new Pair(Boxing.boxBoolean(booleanValue), (List) obj2);
    }
}
