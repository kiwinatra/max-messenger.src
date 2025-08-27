package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: tf0  reason: default package */
public final class tf0 extends ContinuationImpl {
    public BacklogWorker a;
    public List b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ BacklogWorker v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tf0(BacklogWorker backlogWorker, Continuation continuation) {
        super(continuation);
        this.v = backlogWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.g((List) null, this);
    }
}
