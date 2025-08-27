package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j26  reason: default package */
public final class j26 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tu5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j26(tu5 tu5, Continuation continuation) {
        super(continuation);
        this.c = tu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
