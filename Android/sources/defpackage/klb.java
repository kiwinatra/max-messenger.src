package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.pinbars.PinBarsWidget;

/* renamed from: klb  reason: default package */
public final class klb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PinBarsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public klb(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.b = pinBarsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        klb klb = new klb(continuation, this.b);
        klb.a = obj;
        return klb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((klb) create((pa4) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        olb.b.Y0((pa4) this.a);
        return Unit.INSTANCE;
    }
}
