package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dwe  reason: default package */
public final class dwe extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hwe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dwe(hwe hwe, Continuation continuation) {
        super(2, continuation);
        this.b = hwe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dwe(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dwe) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gvc gvc = (gvc) this.b.o.getValue();
            xa3 l = new wia(gvc.b().a(CollectionsKt.listOf(cvc.STICKER)), new ch2(22, gvc)).l((lfd) gvc.c.getValue());
            this.a = 1;
            if (bs0.e(l, this) == coroutine_suspended) {
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
