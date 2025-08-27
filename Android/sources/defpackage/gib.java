package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gib  reason: default package */
public final class gib extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ eib c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gib(eib eib, Continuation continuation) {
        super(continuation);
        this.c = eib;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
