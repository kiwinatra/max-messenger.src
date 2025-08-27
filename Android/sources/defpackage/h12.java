package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h12  reason: default package */
public final class h12 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bs5 b;
    public final /* synthetic */ fsd c;
    public final /* synthetic */ jrd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h12(bs5 bs5, fsd fsd, mrd mrd, Continuation continuation) {
        super(2, continuation);
        this.b = bs5;
        this.c = fsd;
        this.o = mrd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h12(this.b, this.c, (mrd) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h12) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        jrd jrd = this.o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bs5 bs5 = this.b;
            fsd fsd = this.c;
            this.a = 1;
            if (bs5.e(fsd, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                ((mrd) jrd).c();
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((mrd) jrd).c();
        return Unit.INSTANCE;
    }
}
