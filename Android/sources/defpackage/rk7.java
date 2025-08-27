package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rk7  reason: default package */
public final class rk7 extends ContinuationImpl {
    public Long a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return xk7.k((String) null, (xk7) null, this);
    }
}
