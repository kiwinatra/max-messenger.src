package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ml9  reason: default package */
public final class ml9 extends ContinuationImpl {
    public en9 a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ en9 o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ml9(en9 en9, Continuation continuation) {
        super(continuation);
        this.o = en9;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        return en9.k(this.o, 0, this);
    }
}
