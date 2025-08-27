package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rrd  reason: default package */
public final class rrd extends ContinuationImpl {
    public srd a;
    public String b;
    public dw0 c;
    public xv0 o;
    public ha9 v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ srd y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rrd(srd srd, Continuation continuation) {
        super(continuation);
        this.y = srd;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.E(0, (String) null, (dw0) null, (xv0) null, this);
    }
}
