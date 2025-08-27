package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: zn5  reason: default package */
public final class zn5 extends ContinuationImpl {
    public do5 a;
    public ulf b;
    public cxf c;
    public /* synthetic */ Object o;
    public final /* synthetic */ do5 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn5(do5 do5, Continuation continuation) {
        super(continuation);
        this.v = do5;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.d((ulf) null, (cxf) null, this);
    }
}
