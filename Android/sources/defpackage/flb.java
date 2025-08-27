package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: flb  reason: default package */
public final class flb extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ glb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public flb(glb glb, Continuation continuation) {
        super(continuation);
        this.c = glb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
