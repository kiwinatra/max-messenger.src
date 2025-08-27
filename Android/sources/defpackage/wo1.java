package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wo1  reason: default package */
public final class wo1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ap1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo1(ap1 ap1, Continuation continuation) {
        super(2, continuation);
        this.b = ap1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wo1 wo1 = new wo1(this.b, continuation);
        wo1.a = obj;
        return wo1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wo1) create((ze1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ze1 ze1 = (ze1) this.a;
        ap1 ap1 = this.b;
        if (ap1.b().h) {
            ap1.e(ze1, true);
        } else {
            ap1.f(((v9b) ap1.d).c().a.getId());
        }
        return Unit.INSTANCE;
    }
}
