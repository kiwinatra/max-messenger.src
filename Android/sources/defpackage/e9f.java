package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: e9f  reason: default package */
public final class e9f extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ sx7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e9f(sx7 sx7, Continuation continuation) {
        super(continuation);
        this.c = sx7;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
