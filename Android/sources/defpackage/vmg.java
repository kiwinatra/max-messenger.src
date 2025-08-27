package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: vmg  reason: default package */
public final class vmg extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ nbg b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vmg(nbg nbg, Continuation continuation) {
        super(continuation);
        this.b = nbg;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.a(this);
    }
}
