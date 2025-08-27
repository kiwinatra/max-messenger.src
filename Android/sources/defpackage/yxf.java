package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: yxf  reason: default package */
public final class yxf extends ContinuationImpl {
    public UploadExternalGifWorker a;
    public d08 b;
    public UploadExternalGifWorker c;
    public /* synthetic */ Object o;
    public final /* synthetic */ UploadExternalGifWorker v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yxf(UploadExternalGifWorker uploadExternalGifWorker, Continuation continuation) {
        super(continuation);
        this.v = uploadExternalGifWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.doForegroundWork(this);
    }
}
