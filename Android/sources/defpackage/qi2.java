package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: qi2  reason: default package */
public final class qi2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ aj2 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qi2(aj2 aj2, Continuation continuation) {
        super(2, continuation);
        this.a = aj2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qi2(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qi2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = aj2.b1;
        aj2 aj2 = this.a;
        hr8 r = aj2.r();
        etc etc = aj2.U0;
        hr8 hr8 = ((ci2) etc.a.getValue()).a;
        boolean z = r instanceof fr8;
        n6e n6e = aj2.V0;
        if (!z || !Intrinsics.areEqual((Object) hr8, (Object) r)) {
            n6e.d(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        ci2 ci2 = new ci2((fr8) null, 3);
        xme xme = aj2.T0;
        xme.getClass();
        xme.m((Object) null, ci2);
        xme.setValue((ci2) etc.a.getValue());
        n6e.d(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
