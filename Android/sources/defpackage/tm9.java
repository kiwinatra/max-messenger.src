package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: tm9  reason: default package */
public final class tm9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ f3g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm9(en9 en9, f3g f3g, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = f3g;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tm9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            f3g f3g = this.c;
            long j = f3g.a;
            String str = f3g.b;
            long j2 = f3g.d;
            long j3 = f3g.e;
            boolean z = f3g.f;
            this.a = 1;
            if (((cdd) this.b.Z0.getValue()).a(j, str, j2, j3, z, this) == coroutine_suspended) {
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
