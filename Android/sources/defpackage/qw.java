package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qw  reason: default package */
public final class qw extends ContinuationImpl {
    public gx a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gx o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw(gx gxVar, Continuation continuation) {
        super(continuation);
        this.o = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return gx.d(this.o, 0, this);
    }
}
