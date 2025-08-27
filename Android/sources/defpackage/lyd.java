package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lyd  reason: default package */
public final class lyd extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lyd(Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lyd lyd = new lyd(this.c, continuation);
        lyd.b = obj;
        return lyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lyd) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long boxLong = Boxing.boxLong(((ltb) ((jtb) this.c.getValue())).a.s());
            this.a = 1;
            if (((ds5) this.b).a(boxLong, this) == coroutine_suspended) {
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
