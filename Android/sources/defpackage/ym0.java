package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ym0  reason: default package */
public final class ym0 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bn0 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym0(bn0 bn0, Continuation continuation) {
        super(continuation);
        this.c = bn0;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return bn0.e(this.c, (String) null, 0, this);
    }
}
