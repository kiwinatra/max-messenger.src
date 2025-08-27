package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qd2  reason: default package */
public final class qd2 extends ContinuationImpl {
    public wd2 a;
    public String b;
    public s10 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ wd2 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qd2(wd2 wd2, Continuation continuation) {
        super(continuation);
        this.v = wd2;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.l((String) null, (s10) null, this);
    }
}
