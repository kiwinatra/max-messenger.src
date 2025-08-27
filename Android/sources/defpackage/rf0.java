package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: rf0  reason: default package */
public final class rf0 extends ContinuationImpl {
    public Ref.ObjectRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BacklogWorker c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.c = backlogWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.d(this);
    }
}
