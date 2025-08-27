package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jv2  reason: default package */
public final class jv2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ov2 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jv2(ov2 ov2, long j, Continuation continuation) {
        super(2, continuation);
        this.b = ov2;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jv2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ov2 ov2 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            km3 km3 = ((eu3) ov2.Z.getValue()).a;
            km3.getClass();
            long j = this.c;
            jbd.a(new k62(km3, j, 1), km3.n, (x6) null, new zb2(11), (lfd) null);
            qx2 k = ov2.k();
            this.a = 1;
            obj = ((my2) k).u(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a32 a32 = (a32) obj;
        if (a32 != null) {
            xag.h(ov2.F0, ox2.b.o1(a32.a));
        }
        return Unit.INSTANCE;
    }
}
