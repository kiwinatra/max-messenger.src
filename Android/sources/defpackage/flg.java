package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: flg  reason: default package */
public final class flg extends ContinuationImpl {
    public glg a;
    public elg b;
    public /* synthetic */ Object c;
    public final /* synthetic */ glg o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public flg(glg glg, Continuation continuation) {
        super(continuation);
        this.o = glg;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((String) null, (String) null, this);
    }
}
