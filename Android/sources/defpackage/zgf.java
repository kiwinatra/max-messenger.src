package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zgf  reason: default package */
public final class zgf extends SuspendLambda implements Function2 {
    public /* synthetic */ float a;
    public final /* synthetic */ bhf b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zgf(bhf bhf, Continuation continuation) {
        super(2, continuation);
        this.b = bhf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zgf zgf = new zgf(this.b, continuation);
        zgf.a = ((Number) obj).floatValue();
        return zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zgf) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        float f = this.a;
        bhf bhf = this.b;
        bhf.b.setTextSize(0, bhf.o + f);
        return Unit.INSTANCE;
    }
}
