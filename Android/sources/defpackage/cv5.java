package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: cv5  reason: default package */
public final class cv5 extends ContinuationImpl {
    public Ref.ObjectRef a;
    public wu5 b;
    public /* synthetic */ Object c;
    public int o;

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return bs0.C((bs5) null, this);
    }
}
