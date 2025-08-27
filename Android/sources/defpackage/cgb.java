package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cgb  reason: default package */
public final class cgb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ egb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cgb(egb egb, Continuation continuation) {
        super(2, continuation);
        this.c = egb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cgb cgb = new cgb(this.c, continuation);
        cgb.b = obj;
        return cgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cgb) create((hgb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hgb hgb = (hgb) this.b;
            boolean z = hgb instanceof fgb;
            egb egb = this.c;
            if (z) {
                if (((fgb) hgb).a != egb.i.get()) {
                    return Unit.INSTANCE;
                }
                n6e n6e = egb.g;
                yfb yfb = yfb.a;
                this.a = 1;
                if (n6e.a(yfb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (!(hgb instanceof ggb)) {
                throw new NoWhenBranchMatchedException();
            } else if (((ggb) hgb).a != egb.i.get()) {
                return Unit.INSTANCE;
            } else {
                n6e n6e2 = egb.g;
                zfb zfb = new zfb(egb.a);
                this.a = 2;
                if (n6e2.a(zfb, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
