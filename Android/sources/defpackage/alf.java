package defpackage;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: alf  reason: default package */
public final class alf extends ContinuationImpl {
    public rlf a;
    public ByteBuffer b;
    public rlf c;
    public /* synthetic */ Object o;
    public final /* synthetic */ rlf v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alf(rlf rlf, Continuation continuation) {
        super(continuation);
        this.v = rlf;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return this.v.a((ByteBuffer) null, this);
    }
}
