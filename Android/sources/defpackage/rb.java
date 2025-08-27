package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rb  reason: default package */
public final class rb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rb(xb xbVar, Continuation continuation) {
        super(2, continuation);
        this.c = xbVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rb rbVar = new rb(this.c, continuation);
        rbVar.b = obj;
        return rbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n6e n6e = this.c.x;
            this.a = 1;
            if (n6e.a((List) this.b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
