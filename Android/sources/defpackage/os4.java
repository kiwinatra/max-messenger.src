package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: os4  reason: default package */
public final class os4 extends ContinuationImpl {
    public DownloadFileAttachWorker a;
    public ha9 b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ DownloadFileAttachWorker v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public os4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.v = downloadFileAttachWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.h((ha9) null, (d20) null, 0, 0, 0, (File) null, this);
    }
}
