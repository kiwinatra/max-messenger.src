package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ks8  reason: default package */
public final class ks8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ a89 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ks8(Object obj, Continuation continuation, a89 a89) {
        super(2, continuation);
        this.a = obj;
        this.b = a89;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ks8(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ks8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l20 l20 = (l20) this.a;
        if ((l20 != null ? l20.g : null) == null) {
            return null;
        }
        long j = this.b.a.b;
        c20 c20 = l20.g;
        return new j29((long) l20.q.hashCode(), j, c20.a, ev0.F(l20), c20.c, c20.d, c20.b);
    }
}
