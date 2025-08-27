package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: e5f  reason: default package */
public final class e5f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ c5f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e5f(c5f c5f, Continuation continuation) {
        super(continuation);
        this.c = c5f;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
