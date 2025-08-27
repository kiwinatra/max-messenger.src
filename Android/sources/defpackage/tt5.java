package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tt5  reason: default package */
public final class tt5 extends ContinuationImpl {
    public Throwable a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return xt5.a((xif) null, (Function3) null, (Throwable) null, this);
    }
}
