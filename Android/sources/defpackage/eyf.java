package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: eyf  reason: default package */
public final class eyf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ UploadFileAttachWorker b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.b = uploadFileAttachWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new eyf(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((eyf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        UploadFileAttachWorker uploadFileAttachWorker = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            z68.c("UploadFileAttachWorker", "save %s", uploadFileAttachWorker.c());
            na3 na3 = new na3(4, ((yf9) uploadFileAttachWorker.b.getValue()).b(), new td8(18, uploadFileAttachWorker.c()));
            this.a = 1;
            if (bs0.e(na3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("UploadFileAttachWorker", "save failed!", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z68.c("UploadFileAttachWorker", "save finish %s", uploadFileAttachWorker.c());
        return Unit.INSTANCE;
    }
}
