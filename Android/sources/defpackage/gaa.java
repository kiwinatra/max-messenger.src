package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gaa  reason: default package */
public final class gaa extends ContinuationImpl {
    public haa a;
    public /* synthetic */ Object b;
    public final /* synthetic */ haa c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gaa(haa haa, Continuation continuation) {
        super(continuation);
        this.c = haa;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return this.c.c((jz9) null, this);
    }
}
