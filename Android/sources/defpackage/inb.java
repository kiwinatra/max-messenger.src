package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.services.PipWorker;

/* renamed from: inb  reason: default package */
public final class inb extends ContinuationImpl {
    public PipWorker a;
    public PipWorker b;
    public /* synthetic */ Object c;
    public final /* synthetic */ PipWorker o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public inb(PipWorker pipWorker, Continuation continuation) {
        super(continuation);
        this.o = pipWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.doWork(this);
    }
}
