package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ck5  reason: default package */
public final class ck5 extends ContinuationImpl {
    public qa7 a;
    public boolean b;
    public /* synthetic */ Object c;
    public int o;

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return ld9.t((ba7) null, (qa7) null, 0, (Object) null, false, this);
    }
}
