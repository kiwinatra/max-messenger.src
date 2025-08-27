package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mwc  reason: default package */
public final class mwc extends ContinuationImpl {
    public pwc a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pwc c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mwc(pwc pwc, Continuation continuation) {
        super(continuation);
        this.c = pwc;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return pwc.l(this.c, 0, this);
    }
}
