package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: o32  reason: default package */
public final class o32 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ q32 c;
    public final /* synthetic */ a32 o;
    public final /* synthetic */ List v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o32(Object obj, Continuation continuation, q32 q32, a32 a32, List list) {
        super(2, continuation);
        this.b = obj;
        this.c = q32;
        this.o = a32;
        this.v = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o32(this.b, continuation, this.c, this.o, this.v);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o32) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = ((Number) this.b).longValue();
            q32 q32 = this.c;
            long j = q32.b;
            a32 a32 = this.o;
            long j2 = a32.b.a;
            int f = a32.f(longValue);
            this.a = 1;
            ((jna) ((rl) ((sl4) q32.w.getValue()).a.getValue())).Q(j, j2, this.v, true, f);
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
