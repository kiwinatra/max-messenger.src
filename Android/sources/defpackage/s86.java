package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: s86  reason: default package */
public final class s86 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref.LongRef c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s86(Ref.LongRef longRef, long j, Continuation continuation) {
        super(2, continuation);
        this.c = longRef;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s86 s86 = new s86(this.c, this.o, continuation);
        s86.b = obj;
        return s86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s86) create((jx6) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        jx6 jx6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jx6 jx62 = (jx6) this.b;
            long currentTimeMillis = System.currentTimeMillis() - this.c.element;
            long j = this.o;
            if (currentTimeMillis > j) {
                return jx62;
            }
            this.b = jx62;
            this.a = 1;
            if (xk4.b(j - currentTimeMillis, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jx6 = jx62;
        } else if (i == 1) {
            jx6 = (jx6) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jx6;
    }
}
