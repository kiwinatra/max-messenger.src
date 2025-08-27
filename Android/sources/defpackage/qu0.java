package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: qu0  reason: default package */
public final class qu0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ ru0 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qu0(ru0 ru0, Continuation continuation) {
        super(continuation);
        this.b = ru0;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        Object D = this.b.D((f22) null, 0, 0, this);
        return D == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? D : new e22(D);
    }
}
