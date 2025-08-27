package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: r5e  reason: default package */
public final class r5e extends SuspendLambda implements Function2 {
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuspendLambda(2, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r5e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = (e0b) tm4.a.getAccessor().g(e0b.class);
        e0b.i("Скачивание логов началось");
        e0b.b("Для успешного скачивания логов не покидайте экран");
        return e0b.j();
    }
}
