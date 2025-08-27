package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: lw  reason: default package */
public final class lw extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lw(gx gxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new lw(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lw) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gx gxVar = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = gx.F;
            this.a = 1;
            obj = ((qx2) gxVar.p.getValue()).d(gxVar.a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            gxVar.r(this.c);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        if (!a32.N()) {
            long j = a32.b.a;
            this.a = 2;
            if (((mq6) gxVar.x.getValue()).a(j, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        gxVar.r(this.c);
        return Unit.INSTANCE;
    }
}
