package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ive  reason: default package */
public final class ive extends ContinuationImpl {
    public mve a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mve c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ive(mve mve, Continuation continuation) {
        super(continuation);
        this.c = mve;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return mve.j(this.c, (List) null, (fue) null, this);
    }
}
