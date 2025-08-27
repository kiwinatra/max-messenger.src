package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: cme  reason: default package */
public final class cme extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ dme b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cme(dme dme, Continuation continuation) {
        super(continuation);
        this.b = dme;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.e(0, this);
    }
}
