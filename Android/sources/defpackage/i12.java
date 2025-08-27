package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: i12  reason: default package */
public final class i12 extends ContinuationImpl {
    public j12 a;
    public bs5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j12 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i12(j12 j12, Continuation continuation) {
        super(continuation);
        this.o = j12;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.e((bs5) null, this);
    }
}
