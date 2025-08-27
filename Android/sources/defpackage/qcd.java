package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qcd  reason: default package */
public final class qcd extends ContinuationImpl {
    public vcd a;
    public qa7 b;
    public boolean c;
    public boolean o;
    public /* synthetic */ Object v;
    public final /* synthetic */ vcd w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qcd(vcd vcd, Continuation continuation) {
        super(continuation);
        this.w = vcd;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return vcd.a(this.w, (String) null, false, false, this);
    }
}
