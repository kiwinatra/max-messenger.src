package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: qm9  reason: default package */
public final class qm9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;
    public final /* synthetic */ ha9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qm9(en9 en9, ha9 ha9, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
        this.b = ha9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qm9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long j = this.b.b;
        KProperty[] kPropertyArr = en9.A1;
        this.a.F(j, false, false, false);
        return Unit.INSTANCE;
    }
}
