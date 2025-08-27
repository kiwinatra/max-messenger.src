package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ft2  reason: default package */
public final class ft2 extends ContinuationImpl {
    public wt2 a;
    public Object b;
    public List c;
    public ws o;
    public /* synthetic */ Object v;
    public final /* synthetic */ wt2 w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ft2(wt2 wt2, Continuation continuation) {
        super(continuation);
        this.w = wt2;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return wt2.a(this.w, (ks2) null, this);
    }
}
