package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x4f  reason: default package */
public final class x4f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ glb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x4f(glb glb, Continuation continuation) {
        super(continuation);
        this.c = glb;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
