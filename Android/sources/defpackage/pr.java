package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pr  reason: default package */
public final class pr extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ u32 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pr(u32 u32, Continuation continuation) {
        super(2, continuation);
        this.b = u32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pr prVar = new pr(this.b, continuation);
        prVar.a = obj;
        return prVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pr) create((ul2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.b.a((ul2) this.a);
        return Unit.INSTANCE;
    }
}
