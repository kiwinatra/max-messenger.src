package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h14  reason: default package */
public final class h14 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ CoroutineWorker b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h14(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.b = coroutineWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h14(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        CoroutineWorker coroutineWorker = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = coroutineWorker.doWork(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                coroutineWorker.b.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineWorker.b.j((d08) obj);
        return Unit.INSTANCE;
    }
}
