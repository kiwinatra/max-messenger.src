package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: su5  reason: default package */
public final class su5 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ tu5 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public su5(tu5 tu5, Continuation continuation) {
        super(continuation);
        this.b = tu5;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return this.b.e((bs5) null, this);
    }
}
