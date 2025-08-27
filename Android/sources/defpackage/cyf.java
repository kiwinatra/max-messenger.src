package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: cyf  reason: default package */
public final class cyf extends ContinuationImpl {
    public UploadFileAttachWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ UploadFileAttachWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.c = uploadFileAttachWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.doForegroundWork(this);
    }
}
