package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* renamed from: tjd  reason: default package */
public final class tjd extends SuspendLambda implements Function2 {
    public cn7 a;
    public int b;
    public final /* synthetic */ cn7 c;
    public final /* synthetic */ SdkCoroutineWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tjd(cn7 cn7, SdkCoroutineWorker sdkCoroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.c = cn7;
        this.o = sdkCoroutineWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new tjd(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tjd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        cn7 cn7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cn7 cn72 = this.c;
            this.a = cn72;
            this.b = 1;
            Object foregroundInfo = this.o.getForegroundInfo(this);
            if (foregroundInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn7 cn73 = cn72;
            obj = foregroundInfo;
            cn7 = cn73;
        } else if (i == 1) {
            cn7 = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cn7.a.j(obj);
        return Unit.INSTANCE;
    }
}
