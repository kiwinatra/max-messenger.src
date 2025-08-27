package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rcb  reason: default package */
public final class rcb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xcb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rcb(xcb xcb, Continuation continuation) {
        super(2, continuation);
        this.b = xcb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rcb rcb = new rcb(this.b, continuation);
        rcb.a = obj;
        return rcb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rcb) create((zcb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xcb xcb = this.b;
        xcb.a(xcb, "push", xcb.b(xcb, (zcb) this.a));
        return Unit.INSTANCE;
    }
}
