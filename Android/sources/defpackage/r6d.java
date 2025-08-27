package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: r6d  reason: default package */
public final class r6d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bl4 b;
    public final /* synthetic */ z6d c;
    public final /* synthetic */ long o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r6d(bl4 bl4, z6d z6d, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.b = bl4;
        this.c = z6d;
        this.o = j;
        this.v = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r6d(this.b, this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int ordinal = this.b.ordinal();
            z6d z6d = this.c;
            if (ordinal == 0) {
                aj9 d = z6d.d();
                this.a = 1;
                d.getClass();
                if (i8b.r(d.a, new xi9(d, this.o, this.v, 0), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (ordinal == 1) {
                aj9 d2 = z6d.d();
                this.a = 2;
                d2.getClass();
                if (i8b.r(d2.a, new xi9(d2, this.o, this.v, 1), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
