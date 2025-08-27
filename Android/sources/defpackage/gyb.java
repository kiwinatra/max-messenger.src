package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gyb  reason: default package */
public final class gyb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ syb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gyb(syb syb, Continuation continuation) {
        super(2, continuation);
        this.c = syb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gyb gyb = new gyb(this.c, continuation);
        gyb.b = obj;
        return gyb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gyb) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        tz9 tz9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            a32 a32 = (a32) pair.component1();
            vk3 vk3 = (vk3) pair.component2();
            syb syb = this.c;
            if (!syb.w0) {
                xme xme = syb.Z;
                this.b = xme;
                this.a = 1;
                obj = syb.j(syb, a32, vk3, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tz9 = xme;
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            tz9 = (tz9) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tz9.setValue(obj);
        return Unit.INSTANCE;
    }
}
