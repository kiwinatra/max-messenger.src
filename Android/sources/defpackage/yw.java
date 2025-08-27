package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yw  reason: default package */
public final class yw extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw(g12 g12, Continuation continuation) {
        super(2, continuation);
        this.c = g12;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yw ywVar = new yw((g12) this.c, continuation);
        ywVar.b = obj;
        return ywVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yw) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oc ocVar = new oc((ds5) this.b, 4);
            this.a = 1;
            if (this.c.e(ocVar, this) == coroutine_suspended) {
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
