package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: gyf  reason: default package */
public final class gyf extends SuspendLambda implements Function2 {
    public final /* synthetic */ UploadFileAttachWorker a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.a = uploadFileAttachWorker;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gyf(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gyf) create((tf9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!(this.a.A0 instanceof a08));
    }
}
