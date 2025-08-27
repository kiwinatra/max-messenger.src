package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g14  reason: default package */
public final class g14 extends SuspendLambda implements Function2 {
    public cn7 a;
    public int b;
    public final /* synthetic */ cn7 c;
    public final /* synthetic */ CoroutineWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g14(cn7 cn7, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.c = cn7;
        this.o = coroutineWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g14(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = this.c;
            this.b = 1;
            this.o.getClass();
            throw new IllegalStateException("Not implemented");
        } else if (i == 1) {
            cn7 cn7 = this.a;
            ResultKt.throwOnFailure(obj);
            cn7.a.j(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
