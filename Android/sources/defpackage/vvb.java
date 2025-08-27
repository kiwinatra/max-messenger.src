package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vvb  reason: default package */
public final class vvb extends ContinuationImpl {
    public Function0 a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return wvb.a((cwb) null, (Function0) null, this);
    }
}
