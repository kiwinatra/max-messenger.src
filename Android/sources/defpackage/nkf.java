package defpackage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: nkf  reason: default package */
public final class nkf extends ContinuationImpl {
    public Function2 a;
    public Ref.ObjectRef b;
    public /* synthetic */ Object c;
    public int o;

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return okf.c(0, (Function2) null, this);
    }
}
