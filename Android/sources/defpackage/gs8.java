package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gs8  reason: default package */
public final class gs8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ a89 b;
    public final /* synthetic */ ns8 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs8(Object obj, Continuation continuation, a89 a89, ns8 ns8) {
        super(2, continuation);
        this.a = obj;
        this.b = a89;
        this.c = ns8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gs8(this.a, continuation, this.b, this.c);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gs8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l20 l20 = (l20) this.a;
        i10 i10 = l20 != null ? l20.e : null;
        if (i10 == null) {
            return null;
        }
        long hashCode = (long) l20.q.hashCode();
        a89 a89 = this.b;
        boolean z = a89.b.w;
        ns8 ns8 = this.c;
        String p = z ? q8.p(ewa.P, ns8.a) : a89.v.b().toString();
        String c2 = b0h.c(i10.c);
        Context context = ns8.a;
        Locale u = ((qjd) ns8.b).u();
        ha9 ha9 = a89.a;
        return new c29(hashCode, ha9.b, i10.a, l20.q, i10.b, p, g63.i(c2, " · ", j4b.C(context, u, ha9.o, true)), ns8.a.getString(ewa.Q), ((cpb) ns8.e.getValue()).e);
    }
}
