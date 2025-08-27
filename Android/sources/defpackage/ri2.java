package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ri2  reason: default package */
public final class ri2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ aj2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ boolean x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ri2(aj2 aj2, long j, String str, long j2, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = aj2;
        this.c = j;
        this.o = str;
        this.v = j2;
        this.w = j3;
        this.x = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ri2(this.b, this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ri2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (((cdd) this.b.A0.getValue()).a(this.c, this.o, this.v, this.w, this.x, this) == coroutine_suspended) {
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
