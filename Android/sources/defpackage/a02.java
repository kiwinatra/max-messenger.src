package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a02  reason: default package */
public final class a02 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ d02 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a02(d02 d02, Continuation continuation) {
        super(2, continuation);
        this.b = d02;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        a02 a02 = new a02(this.b, continuation);
        a02.a = obj;
        return a02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a02) create((hxb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xag.h(this.b.z, (hxb) this.a);
        return Unit.INSTANCE;
    }
}
