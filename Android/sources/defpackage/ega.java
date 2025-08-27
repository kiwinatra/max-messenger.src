package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: ega  reason: default package */
public final class ega extends SuspendLambda implements Function2 {
    public final /* synthetic */ fga a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ega(fga fga, Continuation continuation) {
        super(2, continuation);
        this.a = fga;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ega(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ega) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = fga.A0;
        fga fga = this.a;
        ((hq) fga.j()).E();
        rl rlVar = (rl) fga.o.getValue();
        rlVar.getClass();
        ((jna) rlVar).w((n0g) null, true);
        xme xme = fga.v0;
        xme.setValue(Boxing.boxInt(((Number) xme.getValue()).intValue() + 1));
        return Unit.INSTANCE;
    }
}
