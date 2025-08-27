package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: rwf  reason: default package */
public final class rwf extends ContinuationImpl {
    public swf a;
    public long b;
    public long c;
    public /* synthetic */ Object o;
    public final /* synthetic */ swf v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rwf(swf swf, Continuation continuation) {
        super(continuation);
        this.v = swf;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.a(0, 0, (String) null, (d20) null, this);
    }
}
