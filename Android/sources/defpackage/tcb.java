package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tcb  reason: default package */
public final class tcb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xcb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tcb(xcb xcb, Continuation continuation) {
        super(2, continuation);
        this.b = xcb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tcb tcb = new tcb(this.b, continuation);
        tcb.a = obj;
        return tcb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tcb) create((zcb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xcb xcb = this.b;
        xcb.a(xcb, "gallery", xcb.b(xcb, (zcb) this.a));
        return Unit.INSTANCE;
    }
}
