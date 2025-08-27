package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kwc  reason: default package */
public final class kwc extends ContinuationImpl {
    public pwc a;
    public qvc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pwc o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kwc(pwc pwc, Continuation continuation) {
        super(continuation);
        this.o = pwc;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return pwc.k(this.o, (qvc) null, 0, (byte[]) null, this);
    }
}
