package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g22  reason: default package */
public final class g22 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qrd c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g22(qrd qrd, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = qrd;
        this.o = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g22 g22 = new g22(this.c, this.o, continuation);
        g22.b = obj;
        return g22;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g22) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            qrd qrd = this.c;
            Object obj3 = this.o;
            Result.Companion companion = Result.Companion;
            this.a = 1;
            if (qrd.t(obj3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m23constructorimpl(Unit.INSTANCE);
        return new e22(Result.m30isSuccessimpl(obj2) ? Unit.INSTANCE : new c22(Result.m26exceptionOrNullimpl(obj2)));
    }
}
