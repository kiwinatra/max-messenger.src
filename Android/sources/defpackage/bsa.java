package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bsa  reason: default package */
public final class bsa extends ContinuationImpl {
    public ge8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ esa c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsa(esa esa, Continuation continuation) {
        super(continuation);
        this.c = esa;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((he8) null, this);
    }
}
