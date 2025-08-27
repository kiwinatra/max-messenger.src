package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a03  reason: default package */
public final class a03 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fu4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a03(fu4 fu4, Continuation continuation) {
        super(2, continuation);
        this.c = fu4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a03 a03 = new a03(this.c, continuation);
        a03.b = obj;
        return a03;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a03) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            k9a o = ((l15) this.c.g).o();
            this.a = 1;
            if (((ds5) this.b).a(o, this) == coroutine_suspended) {
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
