package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: ov5  reason: default package */
public final class ov5 extends ContinuationImpl {
    public pv5 a;
    public Ref.ObjectRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pv5 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov5(pv5 pv5, Continuation continuation) {
        super(continuation);
        this.o = pv5;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
