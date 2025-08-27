package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.location.live.LiveLocationWorker;

/* renamed from: w18  reason: default package */
public final class w18 extends ContinuationImpl {
    public LiveLocationWorker a;
    public String b;
    public LiveLocationWorker c;
    public /* synthetic */ Object o;
    public final /* synthetic */ LiveLocationWorker v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w18(LiveLocationWorker liveLocationWorker, Continuation continuation) {
        super(continuation);
        this.v = liveLocationWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.doWork(this);
    }
}
