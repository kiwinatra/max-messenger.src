package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: wk4  reason: default package */
public final class wk4 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return xk4.a(this);
    }
}
