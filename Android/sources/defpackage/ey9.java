package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ey9  reason: default package */
public final class ey9 extends ContinuationImpl {
    public fy9 a;
    public ha9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fy9 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey9(fy9 fy9, Continuation continuation) {
        super(continuation);
        this.o = fy9;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.a(this);
    }
}
