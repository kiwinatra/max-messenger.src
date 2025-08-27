package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: ys4  reason: default package */
public final class ys4 extends ContinuationImpl {
    public DownloadFileFromWebAppWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zs4 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ys4(zs4 zs4, Continuation continuation) {
        super(continuation);
        this.c = zs4;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b(c44.DEFAULT_ASPECT_RATIO, 0, 0, this);
    }
}
