package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.android.services.HeartbeatScheduler$TaskHeartbeatWorker;

/* renamed from: zx6  reason: default package */
public final class zx6 extends ContinuationImpl {
    public HeartbeatScheduler$TaskHeartbeatWorker a;
    public /* synthetic */ Object b;
    public final /* synthetic */ HeartbeatScheduler$TaskHeartbeatWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zx6(HeartbeatScheduler$TaskHeartbeatWorker heartbeatScheduler$TaskHeartbeatWorker, Continuation continuation) {
        super(continuation);
        this.c = heartbeatScheduler$TaskHeartbeatWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.doWork(this);
    }
}
