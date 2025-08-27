package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: ws4  reason: default package */
public final class ws4 extends ContinuationImpl {
    public DownloadFileFromWebAppWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DownloadFileFromWebAppWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ws4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, Continuation continuation) {
        super(continuation);
        this.c = downloadFileFromWebAppWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.doForegroundWork(this);
    }
}
