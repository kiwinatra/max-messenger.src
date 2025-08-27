package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: ujd  reason: default package */
public final class ujd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ SdkCoroutineWorker b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ujd(SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.b = sdkCoroutineWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ujd(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ujd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (this.b.onStopWork(this) == coroutine_suspended) {
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
