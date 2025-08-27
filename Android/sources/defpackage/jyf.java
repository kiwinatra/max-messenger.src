package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: jyf  reason: default package */
public final class jyf extends ContinuationImpl {
    public UploadFileAttachWorker a;
    public UploadFileAttachWorker b;
    public long c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ UploadFileAttachWorker w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.w = uploadFileAttachWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.l(this);
    }
}
