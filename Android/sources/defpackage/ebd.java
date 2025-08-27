package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ebd  reason: default package */
public final class ebd extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oka c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ebd(oka oka, Continuation continuation) {
        super(2, continuation);
        this.c = oka;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ebd ebd = new ebd(this.c, continuation);
        ebd.b = obj;
        return ebd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ebd) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cwb cwb = (cwb) this.b;
            AtomicReference atomicReference = new AtomicReference();
            this.c.a(new xe8(23, cwb, atomicReference));
            nz3 nz3 = new nz3(atomicReference, 3);
            this.a = 1;
            if (wvb.a(cwb, nz3, this) == coroutine_suspended) {
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
