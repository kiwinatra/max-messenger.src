package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: gl9  reason: default package */
public final class gl9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;
    public final /* synthetic */ io9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gl9(en9 en9, io9 io9, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
        this.b = io9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gl9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.b.a;
        KProperty[] kPropertyArr = en9.A1;
        this.a.F(j, false, true, false);
        return Unit.INSTANCE;
    }
}
