package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pl9  reason: default package */
public final class pl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ String o;
    public final /* synthetic */ dw0 v;
    public final /* synthetic */ xv0 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pl9(en9 en9, Long l, String str, dw0 dw0, xv0 xv0, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
        this.c = l;
        this.o = str;
        this.v = dw0;
        this.w = xv0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pl9(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            srd srd = this.b.w0;
            long longValue = this.c.longValue();
            this.a = 1;
            if (srd.E(longValue, this.o, this.v, this.w, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
