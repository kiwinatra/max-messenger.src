package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: s80  reason: default package */
public final class s80 extends ContinuationImpl {
    public t80 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t80 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s80(t80 t80, Continuation continuation) {
        super(continuation);
        this.c = t80;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((String) null, (String) null, this);
    }
}
