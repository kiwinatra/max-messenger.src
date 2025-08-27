package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: ak5  reason: default package */
public final class ak5 extends ContinuationImpl {
    public bk5 a;
    public Ref.ObjectRef b;
    public Ref.ObjectRef c;
    public long o;
    public /* synthetic */ Object v;
    public final /* synthetic */ bk5 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak5(bk5 bk5, Continuation continuation) {
        super(continuation);
        this.w = bk5;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.a(this);
    }
}
