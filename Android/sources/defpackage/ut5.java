package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ut5  reason: default package */
public final class ut5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vt5 c;
    public Object o;
    public ds5 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut5(vt5 vt5, Continuation continuation) {
        super(continuation);
        this.c = vt5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
