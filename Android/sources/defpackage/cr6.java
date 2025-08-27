package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cr6  reason: default package */
public final class cr6 extends ContinuationImpl {
    public Object a;
    public String b;
    public String c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ er6 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cr6(er6 er6, Continuation continuation) {
        super(continuation);
        this.w = er6;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.a(0, (Long) null, (String) null, this);
    }
}
