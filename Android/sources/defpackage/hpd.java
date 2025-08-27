package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: hpd  reason: default package */
public final class hpd extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ opd b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hpd(opd opd, Continuation continuation) {
        super(continuation);
        this.b = opd;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.j(this);
    }
}
