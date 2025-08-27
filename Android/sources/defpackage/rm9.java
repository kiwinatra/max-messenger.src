package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rm9  reason: default package */
public final class rm9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ en9 a;
    public final /* synthetic */ ha9 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ l20 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rm9(en9 en9, ha9 ha9, boolean z, l20 l20, Continuation continuation) {
        super(2, continuation);
        this.a = en9;
        this.b = ha9;
        this.c = z;
        this.o = l20;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rm9(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.F(this.b.b, this.c, false, this.o.d());
        return Unit.INSTANCE;
    }
}
