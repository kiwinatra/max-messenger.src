package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qkb  reason: default package */
public final class qkb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ skb b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qkb(skb skb, String str, Continuation continuation) {
        super(2, continuation);
        this.b = skb;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new qkb(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qkb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            y59 y59 = this.b.o;
            this.a = 1;
            l59 l59 = (l59) y59;
            l59.getClass();
            Object d = e14.d(new f59(l59, this.c, (Continuation) null), this);
            if (d != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                d = Unit.INSTANCE;
            }
            if (d == coroutine_suspended) {
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
