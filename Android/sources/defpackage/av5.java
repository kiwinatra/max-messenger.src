package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: av5  reason: default package */
public final class av5 extends ContinuationImpl {
    public Function2 a;
    public Ref.ObjectRef b;
    public yu5 c;
    public /* synthetic */ Object o;
    public int v;

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return bs0.A((ome) null, (fv5) null, this);
    }
}
