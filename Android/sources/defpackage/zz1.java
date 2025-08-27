package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zz1  reason: default package */
public final class zz1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d02 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zz1(d02 d02, Continuation continuation) {
        super(2, continuation);
        this.b = d02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zz1 zz1 = new zz1(this.b, continuation);
        zz1.a = obj;
        return zz1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zz1) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.y, (v5a) this.a);
        return Unit.INSTANCE;
    }
}
