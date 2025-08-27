package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rme  reason: default package */
public final class rme extends ContinuationImpl {
    public sme a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sme c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rme(sme sme, Continuation continuation) {
        super(continuation);
        this.c = sme;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
