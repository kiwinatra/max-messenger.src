package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: qxf  reason: default package */
public final class qxf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ UploadDraftMediaWorker b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qxf(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(2, continuation);
        this.b = uploadDraftMediaWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qxf(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qxf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        UploadDraftMediaWorker uploadDraftMediaWorker = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            na3 na3 = new na3(4, ((ju4) uploadDraftMediaWorker.b.getValue()).a(), new ch2(7, uploadDraftMediaWorker.d()));
            this.a = 1;
            if (bs0.e(na3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                z68.f("UploadDraftMediaWorker", "storeDraftUpload: failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        au4 d = uploadDraftMediaWorker.d();
        z68.c("UploadDraftMediaWorker", "storeDraftUpload: finish store upload = " + d, new Object[0]);
        return Unit.INSTANCE;
    }
}
