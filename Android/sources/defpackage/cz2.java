package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cz2  reason: default package */
public final class cz2 extends ContinuationImpl {
    public dz2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dz2 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cz2(dz2 dz2, Continuation continuation) {
        super(continuation);
        this.c = dz2;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((String) null, (ry7) null, this);
    }
}
