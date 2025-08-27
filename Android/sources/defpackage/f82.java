package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: f82  reason: default package */
public final class f82 extends SuspendLambda implements Function2 {
    public AtomicLong a;
    public int b;
    public final /* synthetic */ m82 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f82(m82 m82, Continuation continuation) {
        super(2, continuation);
        this.c = m82;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new f82(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f82) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AtomicLong atomicLong;
        Number number;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        m82 m82 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 p = m82.p();
            if (p == null) {
                return Unit.INSTANCE;
            }
            atomicLong = m82.m;
            d1d d1d = (d1d) m82.y.getValue();
            this.a = atomicLong;
            this.b = 1;
            x62 x62 = x62.b;
            r62 n = ((my2) ((qx2) d1d.a.getValue())).n();
            long j = p.a;
            n.d(j, x62);
            a32 h = ((my2) ((qx2) d1d.a.getValue())).h(j, new duc(2));
            if (h == null) {
                number = Boxing.boxLong(0);
            } else {
                ((sv0) d1d.c.getValue()).c(new xy2(CollectionsKt.listOf(Boxing.boxLong(j)), false, false, (bl4) null, (zub) null, 124));
                number = Boxing.boxLong(((jna) ((rl) d1d.b.getValue())).p(j, h.b.a, (String) null, "", (a20) null));
            }
            if (number == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            AtomicLong atomicLong2 = this.a;
            ResultKt.throwOnFailure(obj);
            atomicLong = atomicLong2;
            number = obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atomicLong.set(number.longValue());
        n6e n6e = m82.e;
        h0c h0c = new h0c(new igf(ixa.V), Boxing.boxInt(cad.n));
        this.a = null;
        this.b = 2;
        if (n6e.a(h0c, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
