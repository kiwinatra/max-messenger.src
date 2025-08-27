package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: du4  reason: default package */
public final class du4 extends ContinuationImpl {
    public fu4 a;
    public pt4 b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ fu4 v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du4(fu4 fu4, Continuation continuation) {
        super(continuation);
        this.v = fu4;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return fu4.b(this.v, 0, (mta) null, this);
    }
}
