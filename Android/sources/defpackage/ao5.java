package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ao5  reason: default package */
public final class ao5 extends ContinuationImpl {
    public do5 a;
    public ulf b;
    public cxf c;
    public AsynchronousFileChannel o;
    public Function2 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ do5 x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao5(do5 do5, Continuation continuation) {
        super(continuation);
        this.x = do5;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return do5.a(this.x, (ulf) null, (cxf) null, (AsynchronousFileChannel) null, (vn5) null, this);
    }
}
