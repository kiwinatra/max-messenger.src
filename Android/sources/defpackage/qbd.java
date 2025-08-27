package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: qbd  reason: default package */
public final /* synthetic */ class qbd extends FunctionReferenceImpl implements Function3, SuspendFunction {
    public static final qbd a = new FunctionReferenceImpl(3, ds5.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ds5) obj).a(obj2, (Continuation) obj3);
    }
}
