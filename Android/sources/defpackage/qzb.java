package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qzb  reason: default package */
public final class qzb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ szb b;
    public final /* synthetic */ k1c c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qzb(szb szb, k1c k1c, Continuation continuation) {
        super(2, continuation);
        this.b = szb;
        this.c = k1c;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qzb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qzb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            szb szb = this.b;
            n6e n6e = szb.a;
            lzb lzb = new lzb((Long) null, szb.a(szb, this.c.b));
            this.a = 1;
            if (n6e.a(lzb, this) == coroutine_suspended) {
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
