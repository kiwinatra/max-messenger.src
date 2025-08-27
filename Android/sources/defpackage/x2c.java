package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: x2c  reason: default package */
public final class x2c extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ a52 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x2c(a52 a52, Continuation continuation) {
        super(continuation);
        this.c = a52;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
