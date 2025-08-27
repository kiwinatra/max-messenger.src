package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: kw  reason: default package */
public final class kw extends ContinuationImpl {
    public gx a;
    public Collection b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ gx v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw(gx gxVar, Continuation continuation) {
        super(continuation);
        this.v = gxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.v(0, this);
    }
}
