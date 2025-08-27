package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ghg  reason: default package */
public final class ghg extends ContinuationImpl {
    public hhg a;
    public fhg b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hhg o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ghg(hhg hhg, Continuation continuation) {
        super(continuation);
        this.o = hhg;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((String) null, (String) null, this);
    }
}
