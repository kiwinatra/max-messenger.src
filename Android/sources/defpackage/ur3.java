package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ur3  reason: default package */
public final class ur3 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ vr3 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ur3(vr3 vr3, Continuation continuation) {
        super(continuation);
        this.b = vr3;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.t(this);
    }
}
