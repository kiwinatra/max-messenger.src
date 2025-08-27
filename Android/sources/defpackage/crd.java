package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: crd  reason: default package */
public final class crd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ drd b;
    public final /* synthetic */ long c;
    public final /* synthetic */ erd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public crd(drd drd, long j, erd erd, Continuation continuation) {
        super(2, continuation);
        this.b = drd;
        this.c = j;
        this.o = erd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new crd(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((crd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            zqd zqd = this.b.a;
            yqd yqd = new yqd(this.c, this.o);
            this.a = 1;
            zqd.getClass();
            if (i8b.r((i6d) zqd.b, new ni(25, zqd, yqd), this) == coroutine_suspended) {
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
