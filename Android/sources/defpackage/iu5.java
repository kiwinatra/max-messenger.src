package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: iu5  reason: default package */
public final class iu5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ eu5 c;
    public Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iu5(eu5 eu5, Continuation continuation) {
        super(continuation);
        this.c = eu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.e((ds5) null, this);
    }
}
