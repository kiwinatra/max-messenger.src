package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l12  reason: default package */
public final class l12 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m12 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l12(m12 m12, Continuation continuation) {
        super(2, continuation);
        this.c = m12;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l12 l12 = new l12(this.c, continuation);
        l12.b = obj;
        return l12;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l12) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.c.m((ds5) this.b, this) == coroutine_suspended) {
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
