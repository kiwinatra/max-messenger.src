package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: va6  reason: default package */
public final class va6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ya6 a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public va6(ya6 ya6, String str, Continuation continuation) {
        super(2, continuation);
        this.a = ya6;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new va6(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((va6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        e0b e0b = (e0b) this.a.j.getValue();
        e0b.i(this.b);
        e0b.j();
        return Unit.INSTANCE;
    }
}
