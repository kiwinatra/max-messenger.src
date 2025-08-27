package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: t6d  reason: default package */
public final class t6d extends ContinuationImpl {
    public Object a;
    public Object b;
    public ga9 c;
    public ga9 o;
    public /* synthetic */ Object v;
    public final /* synthetic */ z6d w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t6d(z6d z6d, Continuation continuation) {
        super(continuation);
        this.w = z6d;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.h((ya9) null, this);
    }
}
