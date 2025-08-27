package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: fyf  reason: default package */
public final class fyf extends ContinuationImpl {
    public UploadFileAttachWorker a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ UploadFileAttachWorker o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fyf(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.o = uploadFileAttachWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.k(this);
    }
}
