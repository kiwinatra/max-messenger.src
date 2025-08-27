package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pw  reason: default package */
public final class pw extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gx b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pw(gx gxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.b = gxVar;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pw(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pw) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        long j = this.c;
        gx gxVar = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            u0d u0d = gxVar.k;
            this.a = 1;
            obj = gx.c(gxVar, u0d, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() >= 0) {
            xme xme = gxVar.C;
            Object uvVar = new uv(j, true);
            do {
                value = xme.getValue();
                Object obj3 = (wv) value;
                obj2 = obj3 instanceof tv ? (tv) obj3 : null;
                if (obj2 == null) {
                    obj2 = uvVar;
                }
            } while (!xme.b(value, obj2));
        }
        return Unit.INSTANCE;
    }
}
