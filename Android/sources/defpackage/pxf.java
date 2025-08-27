package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: pxf  reason: default package */
public final class pxf extends ContinuationImpl {
    public UploadDraftMediaWorker a;
    public UploadDraftMediaWorker b;
    public /* synthetic */ Object c;
    public final /* synthetic */ UploadDraftMediaWorker o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pxf(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(continuation);
        this.o = uploadDraftMediaWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.doForegroundWork(this);
    }
}
