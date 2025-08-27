package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ug2  reason: default package */
public final class ug2 extends ContinuationImpl {
    public gh2 a;
    public List b;
    public tz9 c;
    public Object o;
    public long v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ gh2 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug2(gh2 gh2, Continuation continuation) {
        super(continuation);
        this.y = gh2;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.w(0, false, this);
    }
}
