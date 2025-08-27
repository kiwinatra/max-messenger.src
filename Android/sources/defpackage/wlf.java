package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wlf  reason: default package */
public final class wlf extends ContinuationImpl {
    public xlf a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xlf c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wlf(xlf xlf, Continuation continuation) {
        super(continuation);
        this.c = xlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.b((ulf) null, this);
    }
}
