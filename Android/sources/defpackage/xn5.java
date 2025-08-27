package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xn5  reason: default package */
public final class xn5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ do5 c;
    public final /* synthetic */ AsynchronousFileChannel o;
    public final /* synthetic */ cwb v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xn5(AtomicBoolean atomicBoolean, do5 do5, AsynchronousFileChannel asynchronousFileChannel, cwb cwb, Continuation continuation) {
        super(2, continuation);
        this.b = atomicBoolean;
        this.c = do5;
        this.o = asynchronousFileChannel;
        this.v = cwb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xn5 xn5 = new xn5(this.b, this.c, this.o, this.v, continuation);
        xn5.a = obj;
        return xn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xn5) create((ulf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ulf ulf = (ulf) this.a;
        if (!this.b.get()) {
            return Unit.INSTANCE;
        }
        do5 do5 = this.c;
        ev0.v(do5.q, do5.p, (f14) null, new wn5(do5, ulf, this.o, this.b, this.v, (Continuation) null), 2);
        return Unit.INSTANCE;
    }
}
