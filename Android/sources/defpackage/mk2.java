package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mk2  reason: default package */
public final class mk2 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ fu4 b;
    public int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mk2(fu4 fu4, Continuation continuation) {
        super(continuation);
        this.b = fu4;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= IntCompanionObject.MIN_VALUE;
        return fu4.c(this.b, (b89) null, this);
    }
}
