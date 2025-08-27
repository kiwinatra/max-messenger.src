package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: q59  reason: default package */
public final class q59 extends SuspendLambda implements Function2 {
    public a32 a;
    public int b;
    public final /* synthetic */ x59 c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q59(x59 x59, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = x59;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new q59(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q59) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        a32 a32;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        x59 x59 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z68.c(x59.H0, "load members with read status", new Object[0]);
            a32 = x59.m();
            if (a32 == null) {
                return Unit.INSTANCE;
            }
            this.a = a32;
            this.b = 1;
            if (x59.k(x59, a32, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            a32 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            x59.j(x59);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.o) {
            return Unit.INSTANCE;
        }
        this.a = null;
        this.b = 2;
        if (x59.l(x59, a32, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        x59.j(x59);
        return Unit.INSTANCE;
    }
}
