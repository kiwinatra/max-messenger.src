package defpackage;

import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;

/* renamed from: d45  reason: default package */
public final /* synthetic */ class d45 extends AdaptedFunctionReference implements Function4, SuspendFunction {
    public static final d45 a = new AdaptedFunctionReference(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        KProperty[] kPropertyArr = i45.Y;
        return new Triple((List) obj, (List) obj2, (List) obj3);
    }
}
