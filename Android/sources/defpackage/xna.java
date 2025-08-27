package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xna  reason: default package */
public final class xna extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ Handler c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xna(AtomicBoolean atomicBoolean, Handler handler, Continuation continuation) {
        super(2, continuation);
        this.b = atomicBoolean;
        this.c = handler;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xna xna = new xna(this.b, this.c, continuation);
        xna.a = obj;
        return xna;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xna) create((il) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        il ilVar = (il) this.a;
        if (!this.b.get()) {
            return Unit.INSTANCE;
        }
        npg w = ct.w();
        ilVar.initCause((Throwable) w.c);
        z68.o("ANR", "detect " + ilVar, ilVar);
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.v, "ANR-ThreadDump", w.toString(), (Throwable) null);
        }
        h2g.a.d().a((String) null, ilVar);
        if (this.b.compareAndSet(true, false)) {
            this.c.postAtFrontOfQueue(new o99(12, this.b));
        }
        return Unit.INSTANCE;
    }
}
