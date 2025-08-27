package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p3e  reason: default package */
public final class p3e extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y3e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p3e(y3e y3e, Continuation continuation) {
        super(2, continuation);
        this.c = y3e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        p3e p3e = new p3e(this.c, continuation);
        p3e.b = obj;
        return p3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p3e) create((ne3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual((Object) (ne3) this.b, (Object) ne3.a)) {
                this.a = 1;
                if (y3e.j(this.c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
