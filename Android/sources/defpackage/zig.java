package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zig  reason: default package */
public final class zig extends SuspendLambda implements Function2 {
    public final /* synthetic */ hjg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zig(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.a = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zig(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zig) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        hjg hjg = this.a;
        hjg.getClass();
        h7b h7b = h7b.a;
        xme xme = hjg.B0;
        xme.getClass();
        xme.m((Object) null, h7b);
        xag.h(hjg.I0, mig.a);
        sfg sfg = (sfg) hjg.v0.getValue();
        tfg tfg = hjg.y0;
        if (tfg != null) {
            sfg.getClass();
            sfg.a(lfg.REFRESH, tfg.a, tfg.b, tfg.c, tfg.d, (String) null);
        }
        return Unit.INSTANCE;
    }
}
