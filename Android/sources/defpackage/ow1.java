package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ow1  reason: default package */
public final class ow1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ oc b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ow1(oc ocVar, Continuation continuation) {
        super(continuation);
        this.b = ocVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a((Object) null, this);
    }
}
