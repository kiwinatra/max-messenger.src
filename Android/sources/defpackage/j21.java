package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: j21  reason: default package */
public final class j21 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k21 b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j21(long j, k21 k21, Continuation continuation) {
        super(2, continuation);
        this.b = k21;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j21(this.c, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j21) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        long j = this.c;
        k21 k21 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = k21.p;
            this.a = 1;
            obj = ((my2) ((qx2) k21.b.getValue())).u(j, this);
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
        a32 a32 = (a32) obj;
        if (a32 == null) {
            return Unit.INSTANCE;
        }
        KProperty[] kPropertyArr2 = k21.p;
        long j2 = a32.a;
        aje a2 = k21.a(bs0.M(((my2) ((qx2) k21.b.getValue())).o(j2), new i21(new wn3(((bo3) k21.h.getValue()).a(), j, 0), k21, a32, 0)), j2);
        k21.n.setValue(k21, k21.p[1], a2);
        if (((km3) k21.g.getValue()).u(j)) {
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
            this.a = 2;
            if (((is9) k21.i.getValue()).u(this.c, duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
