package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d52  reason: default package */
public final class d52 extends SuspendLambda implements Function2 {
    public final /* synthetic */ h52 a;
    public final /* synthetic */ g02 b;
    public final /* synthetic */ a32 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d52(h52 h52, g02 g02, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.a = h52;
        this.b = g02;
        this.c = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d52(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d52) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h52 h52 = this.a;
        AtomicLong atomicLong = h52.u;
        g02 g02 = this.b;
        int ordinal = g02.b.ordinal();
        Lazy lazy = h52.o;
        a32 a32 = this.c;
        if (ordinal == 0) {
            j = ((jna) ((rl) lazy.getValue())).o(a32.a, a32.b.a, 1, g02.c, false, (HashMap) null);
        } else if (ordinal == 1) {
            j = ((jna) ((rl) lazy.getValue())).o(a32.a, a32.b.a, 2, (String) null, false, (HashMap) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        atomicLong.set(j);
        h52.x.set(true);
        return Unit.INSTANCE;
    }
}
