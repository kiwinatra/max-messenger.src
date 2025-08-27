package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ms8  reason: default package */
public final class ms8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ a89 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ns8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ms8(Object obj, Continuation continuation, a89 a89, boolean z, ns8 ns8) {
        super(2, continuation);
        this.a = obj;
        this.b = a89;
        this.c = z;
        this.o = ns8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ms8(this.a, continuation, this.b, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ms8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        l29 l29;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l20 l20 = (l20) this.a;
        long hashCode = (long) l20.q.hashCode();
        jl0 jl0 = jl0.b;
        kl0 kl0 = kl0.b;
        a89 a89 = this.b;
        k20 k20 = l20.d;
        if (k20 != null) {
            return new l29(hashCode, a89.a.b, k20.a, po5.s(cjf.A(k20.c, kl0, jl0)), k29.b, Boxing.boxLong(k20.b), l20.q, this.c, (Uri) null, false);
        }
        ns8 ns8 = this.o;
        d20 d20 = l20.n;
        x10 x10 = l20.b;
        if (x10 != null && x10.v) {
            l29 = new l29(hashCode, a89.a.b, x10.y, po5.s(cjf.A(x10.Y, kl0, jl0)), k29.c, (Long) null, l20.q, this.c, (Uri) null, !ns8.c.c(true) && !d20.c());
        } else if (x10 != null) {
            l29 = new l29(hashCode, a89.a.b, x10.y, po5.s(cjf.A(x10.a, kl0, jl0)), k29.a, (Long) null, l20.q, this.c, ((o20) ns8.d.getValue()).c(l20, false), !ns8.c.e() && !d20.c());
        } else {
            String name = ns8.getClass().getName();
            long j = a89.a.b;
            throw new IllegalStateException((name + ": Unknown type in PhotoVideoAttach with messageId = " + j).toString());
        }
        return l29;
    }
}
