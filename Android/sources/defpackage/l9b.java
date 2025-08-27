package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: l9b  reason: default package */
public final class l9b extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ m9b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9b(m9b m9b, Continuation continuation) {
        super(continuation);
        this.c = m9b;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= IntCompanionObject.MIN_VALUE;
        return this.c.a((Object) null, this);
    }
}
