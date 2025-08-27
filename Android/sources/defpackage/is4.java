package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: is4  reason: default package */
public final class is4 extends ContinuationImpl {
    public DownloadFileAttachWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DownloadFileAttachWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public is4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.c = downloadFileAttachWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.doForegroundWork(this);
    }
}
