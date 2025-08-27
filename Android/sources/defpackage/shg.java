package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: shg  reason: default package */
public final class shg extends ContinuationImpl {
    public vhg a;
    public yhg b;
    public i3d c;
    public /* synthetic */ Object o;
    public final /* synthetic */ vhg v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public shg(vhg vhg, Continuation continuation) {
        super(continuation);
        this.v = vhg;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.e((String) null, this);
    }
}
