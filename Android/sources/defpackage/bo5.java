package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: bo5  reason: default package */
public final class bo5 extends ContinuationImpl {
    public do5 a;
    public ulf b;
    public cxf c;
    public AsynchronousFileChannel o;
    public Function2 v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ do5 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo5(do5 do5, Continuation continuation) {
        super(continuation);
        this.y = do5;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.e((ulf) null, (cxf) null, (AsynchronousFileChannel) null, (Function2) null, this);
    }
}
