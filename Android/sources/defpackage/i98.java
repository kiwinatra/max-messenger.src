package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: i98  reason: default package */
public final class i98 extends ContinuationImpl {
    public j98 a;
    public Object b;
    public String c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ j98 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i98(j98 j98, Continuation continuation) {
        super(continuation);
        this.w = j98;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.a((String) null, (String) null, this);
    }
}
