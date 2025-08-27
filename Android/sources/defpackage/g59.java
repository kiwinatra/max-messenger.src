package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g59  reason: default package */
public final class g59 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ pjb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g59(Object obj, Continuation continuation, pjb pjb) {
        super(2, continuation);
        this.a = obj;
        this.b = pjb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g59(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.b.a((vk3) this.a, false);
    }
}
