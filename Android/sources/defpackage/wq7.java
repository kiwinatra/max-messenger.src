package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: wq7  reason: default package */
public final class wq7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ KeyboardStickersWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wq7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.b = keyboardStickersWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wq7 wq7 = new wq7(this.b, continuation);
        wq7.a = obj;
        return wq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wq7) create((rve) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rve rve = (rve) this.a;
        KeyboardStickersWidget keyboardStickersWidget = this.b;
        keyboardStickersWidget.w.G(rve.a);
        keyboardStickersWidget.x.G(rve.b);
        return Unit.INSTANCE;
    }
}
