package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rx7  reason: default package */
public final class rx7 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sx7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rx7(sx7 sx7, Continuation continuation) {
        super(continuation);
        this.c = sx7;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
