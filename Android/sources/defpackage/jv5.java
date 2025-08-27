package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jv5  reason: default package */
public final class jv5 extends ContinuationImpl {
    public kv5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kv5 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jv5(kv5 kv5, Continuation continuation) {
        super(continuation);
        this.c = kv5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
