package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ym9  reason: default package */
public final class ym9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public a52 c;
    public Object o;
    public final /* synthetic */ a52 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym9(a52 a52, Continuation continuation) {
        super(continuation);
        this.v = a52;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.v.a((Object) null, this);
    }
}
