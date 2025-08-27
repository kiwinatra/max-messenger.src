package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: dga  reason: default package */
public final class dga extends SuspendLambda implements Function2 {
    public final /* synthetic */ fga a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dga(fga fga, Continuation continuation) {
        super(2, continuation);
        this.a = fga;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dga(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dga) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = fga.A0;
        fga fga = this.a;
        long j = 0;
        if (((hq) fga.j()).z() == 0) {
            j = -1;
        }
        ((hq) fga.j()).k("app.notification.dontDisturbUntil", Long.valueOf(j));
        ? obj2 = new Object();
        obj2.b = Boxing.boxLong(j);
        ((rl) fga.o.getValue()).a(new n0g(obj2));
        xme xme = fga.v0;
        xme.setValue(Boxing.boxInt(((Number) xme.getValue()).intValue() + 1));
        return Unit.INSTANCE;
    }
}
