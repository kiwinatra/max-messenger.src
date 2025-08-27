package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;

/* renamed from: fq6  reason: default package */
public final class fq6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gq6 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fq6(gq6 gq6, long j, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = gq6;
        this.o = j;
        this.v = j2;
        this.w = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fq6 fq6 = new fq6(this.c, this.o, this.v, this.w, continuation);
        fq6.b = obj;
        return fq6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fq6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wb c2 = gt5.c(bs0.D(((eu3) this.c.a.getValue()).c(this.o), new dq6((d14) this.b, this.o, this.c, this.v, this.w, (Continuation) null)), Duration.m1371getInWholeMillisecondsimpl(this.v), new SuspendLambda(2, (Continuation<Object>) null));
            this.a = 1;
            obj = bs0.z(c2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object r13 = ((Result) obj).m32unboximpl();
        if (Result.m29isFailureimpl(r13)) {
            return null;
        }
        return r13;
    }
}
