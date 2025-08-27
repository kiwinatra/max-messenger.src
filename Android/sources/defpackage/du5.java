package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: du5  reason: default package */
public final class du5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wb c;
    public wb o;
    public ds5 v;
    public Throwable w;
    public long x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du5(wb wbVar, Continuation continuation) {
        super(continuation);
        this.c = wbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
