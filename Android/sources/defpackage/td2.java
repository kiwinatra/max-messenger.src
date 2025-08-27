package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: td2  reason: default package */
public final class td2 extends ContinuationImpl {
    public wd2 a;
    public String b;
    public k20 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ wd2 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public td2(wd2 wd2, Continuation continuation) {
        super(continuation);
        this.v = wd2;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return wd2.j(this.v, (String) null, (k20) null, (ha9) null, this);
    }
}
