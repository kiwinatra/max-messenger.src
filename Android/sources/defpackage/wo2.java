package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wo2  reason: default package */
public final class wo2 extends SuspendLambda implements Function2 {
    public bvd a;
    public int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ s58 o;
    public final /* synthetic */ float v;
    public final /* synthetic */ long w;
    public final /* synthetic */ lp2 x;
    public final /* synthetic */ Long y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo2(long j, s58 s58, float f, long j2, lp2 lp2, Long l, Continuation continuation) {
        super(2, continuation);
        this.c = j;
        this.o = s58;
        this.v = f;
        this.w = j2;
        this.x = lp2;
        this.y = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wo2(this.c, this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wo2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        bvd bvd;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        lp2 lp2 = this.x;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.c;
            bvd I = cjf.I(j);
            I.m = this.o;
            I.n = this.v;
            I.o = this.w;
            this.a = I;
            this.b = 1;
            Object a2 = ((ej9) lp2.A0.getValue()).a(j, this.y, this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            bvd bvd2 = I;
            obj = a2;
            bvd = bvd2;
        } else if (i == 1) {
            bvd = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bvd.b = (mc9) obj;
        ((jqg) lp2.z0.getValue()).a(new cvd(bvd));
        return Unit.INSTANCE;
    }
}
