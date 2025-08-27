package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tpd  reason: default package */
public final class tpd extends ContinuationImpl {
    public upd a;
    public /* synthetic */ Object b;
    public final /* synthetic */ upd c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tpd(upd upd, Continuation continuation) {
        super(continuation);
        this.c = upd;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.d(this);
    }
}
