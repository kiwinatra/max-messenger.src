package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: dv5  reason: default package */
public final class dv5 extends ContinuationImpl {
    public Ref.ObjectRef a;
    public yu5 b;
    public /* synthetic */ Object c;
    public int o;

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return bs0.B((bs5) null, (v6g) null, this);
    }
}
