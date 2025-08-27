package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uq4  reason: default package */
public final class uq4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ vq4 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq4(vq4 vq4, Continuation continuation) {
        super(continuation);
        this.b = vq4;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Object) null, this);
    }
}
