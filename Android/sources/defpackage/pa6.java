package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: pa6  reason: default package */
public final class pa6 extends ContinuationImpl {
    public a89 a;
    public long b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ qa6 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pa6(qa6 qa6, Continuation continuation) {
        super(continuation);
        this.v = qa6;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return qa6.a(this.v, (mk4) null, (a89) null, this);
    }
}
