package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pk2  reason: default package */
public final class pk2 extends SuspendLambda implements Function2 {
    public rk2 a;
    public rl b;
    public int c;
    public final /* synthetic */ rk2 o;
    public final /* synthetic */ String v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk2(rk2 rk2, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.o = rk2;
        this.v = str;
        this.w = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pk2(this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pk2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        rk2 rk2;
        rl rlVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rk2 = this.o;
            rl rlVar2 = rk2.b;
            this.a = rk2;
            this.b = rlVar2;
            this.c = 1;
            Object z = bs0.z(rk2.a, this);
            if (z == coroutine_suspended) {
                return coroutine_suspended;
            }
            rlVar = rlVar2;
            obj = z;
        } else if (i == 1) {
            rlVar = this.b;
            rk2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        jna jna = (jna) rlVar;
        rk2.i = jna.z(jna, new aw9(((ltb) jna.D()).a.n(), longValue, this.w, this.v));
        return Unit.INSTANCE;
    }
}
