package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xjb  reason: default package */
public final class xjb extends SuspendLambda implements Function2 {
    public final /* synthetic */ akb a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xjb(akb akb, String str, Continuation continuation) {
        super(2, continuation);
        this.a = akb;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xjb(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xjb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((tz9) this.a.c.g.getValue()).setValue(this.b);
        return Unit.INSTANCE;
    }
}
