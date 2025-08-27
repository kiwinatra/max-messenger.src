package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: wjd  reason: default package */
public final class wjd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ SdkCoroutineWorker b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wjd(SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.b = sdkCoroutineWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wjd(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wjd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        SdkCoroutineWorker sdkCoroutineWorker = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = sdkCoroutineWorker.doWork(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                sdkCoroutineWorker.future.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sdkCoroutineWorker.future.j((d08) obj);
        return Unit.INSTANCE;
    }
}
