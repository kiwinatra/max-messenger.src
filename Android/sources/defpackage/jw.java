package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jw  reason: default package */
public final class jw extends ContinuationImpl {
    public gx a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gx c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jw(gx gxVar, Continuation continuation) {
        super(continuation);
        this.c = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return gx.c(this.c, (u0d) null, 0, this);
    }
}
