package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: mi2  reason: default package */
public final class mi2 extends ContinuationImpl {
    public aj2 a;
    public bd2 b;
    public zh2 c;
    public int o;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ aj2 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mi2(aj2 aj2, Continuation continuation) {
        super(continuation);
        this.x = aj2;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.y(0, (hr8) null, 0, this);
    }
}
