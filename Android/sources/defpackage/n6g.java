package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: n6g  reason: default package */
public final class n6g extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ hjb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6g(hjb hjb, Continuation continuation) {
        super(continuation);
        this.c = hjb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
