package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: zt5  reason: default package */
public final class zt5 extends ContinuationImpl {
    public Ref.ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return bs0.l((bs5) null, (ds5) null, this);
    }
}
