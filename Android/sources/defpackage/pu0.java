package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pu0  reason: default package */
public final class pu0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ ru0 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pu0(ru0 ru0, Continuation continuation) {
        super(continuation);
        this.b = ru0;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        Object C = ru0.C(this.b, this);
        return C == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? C : new e22(C);
    }
}
