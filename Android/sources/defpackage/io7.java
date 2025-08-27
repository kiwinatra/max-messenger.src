package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: io7  reason: default package */
public final class io7 extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lo7 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io7(lo7 lo7, Continuation continuation) {
        super(continuation);
        this.o = lo7;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return this.o.d((Function2) null, this);
    }
}
