package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nyd  reason: default package */
public final class nyd extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wyd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nyd(wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.b = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nyd nyd = new nyd(this.b, continuation);
        nyd.a = obj;
        return nyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nyd) create((l1c) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        l1c l1c = (l1c) this.a;
        if (l1c instanceof l1c) {
            Long l = l1c.a;
            wyd wyd = this.b;
            long j = wyd.C0.get();
            ngf ngf = l1c.b;
            s85 s85 = wyd.v0;
            if (l != null && l.longValue() == j) {
                ev0.v(wyd.a, ((osa) wyd.k()).b(), (f14) null, new ryd(wyd, (Continuation) null), 2);
                xag.h(s85, new z2e(ngf, Integer.valueOf(cad.K)));
            } else if (l == null) {
                xag.h(s85, new z2e(ngf, Integer.valueOf(cad.K)));
            }
        }
        return Unit.INSTANCE;
    }
}
