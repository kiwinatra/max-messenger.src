package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n32  reason: default package */
public final class n32 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ q32 o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n32(etc etc, Continuation continuation, q32 q32, long j) {
        super(2, continuation);
        this.c = etc;
        this.o = q32;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        n32 n32 = new n32((etc) this.c, continuation, this.o, this.v);
        n32.b = obj;
        return n32;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n32) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            m32 m32 = new m32((ds5) this.b, this.o, this.v);
            this.a = 1;
            if (this.c.e(m32, this) == coroutine_suspended) {
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
