package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* renamed from: u96  reason: default package */
public final class u96 extends ContinuationImpl {
    public ForegroundWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ForegroundWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u96(ForegroundWorker foregroundWorker, Continuation continuation) {
        super(continuation);
        this.c = foregroundWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.getForegroundInfo(this);
    }
}
