package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vh0  reason: default package */
public final class vh0 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ oc c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vh0(oc ocVar, Continuation continuation) {
        super(continuation);
        this.c = ocVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
