package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fn3  reason: default package */
public final class fn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fn3(pn3 pn3, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fn3(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pn3 pn3 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((eu3) pn3.p.getValue()).b(pn3.o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vk3 vk3 = (vk3) obj;
        if (vk3 == null) {
            return Unit.INSTANCE;
        }
        pn3.m.set(((jna) ((rl) pn3.A.getValue())).S(vk3.a.c.e));
        n6e n6e = pn3.e;
        h0c h0c = new h0c(new igf(ixa.V), Boxing.boxInt(cad.n));
        this.a = 2;
        if (n6e.a(h0c, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
