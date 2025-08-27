package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ph7  reason: default package */
public final class ph7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ph7(vb vbVar, Continuation continuation) {
        super(continuation);
        this.c = vbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
