package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mu5  reason: default package */
public final class mu5 extends ContinuationImpl {
    public os5 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ os5 o;
    public Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mu5(os5 os5, Continuation continuation) {
        super(continuation);
        this.o = os5;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.o.a((Object) null, this);
    }
}
