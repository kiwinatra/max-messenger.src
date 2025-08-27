package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hu5  reason: default package */
public final class hu5 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return qu5.a((ds5) null, (Object) null, (Object) null, this);
    }
}
