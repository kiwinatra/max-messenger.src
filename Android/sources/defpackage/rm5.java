package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rm5  reason: default package */
public final class rm5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ um5 a;
    public final /* synthetic */ List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rm5(um5 um5, List list, Continuation continuation) {
        super(2, continuation);
        this.a = um5;
        this.b = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rm5(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rm5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        um5.a(this.a, this.b);
        return Unit.INSTANCE;
    }
}
