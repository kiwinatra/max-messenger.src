package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: px  reason: default package */
public final class px extends ContinuationImpl {
    public final /* synthetic */ ux X;
    public int Y;
    public ux a;
    public Object b;
    public Object c;
    public Ref.IntRef o;
    public Ref.LongRef v;
    public Ref.LongRef w;
    public ma2 x;
    public long y;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public px(ux uxVar, Continuation continuation) {
        super(continuation);
        this.X = uxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.Y |= IntCompanionObject.MIN_VALUE;
        return this.X.a(0, 0, 0, 0, 0, this);
    }
}
