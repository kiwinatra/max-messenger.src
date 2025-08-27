package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: a91  reason: default package */
public final class a91 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallIndicatorWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a91(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.b = callIndicatorWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a91 a91 = new a91(this.b, continuation);
        a91.a = obj;
        return a91;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a91) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CallIndicatorWidget.c0(this.b).setTime((String) this.a);
        return Unit.INSTANCE;
    }
}
