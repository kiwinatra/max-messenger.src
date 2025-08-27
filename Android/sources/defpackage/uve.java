package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uve  reason: default package */
public final class uve extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ gwe b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uve(gwe gwe, Continuation continuation) {
        super(2, continuation);
        this.b = gwe;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new uve(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uve) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gwe gwe = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((gvc) gwe.x.getValue()).a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            return Unit.INSTANCE;
        }
        xag.h(gwe.z0, new s0e(cad.y, new igf(n1b.C)));
        return Unit.INSTANCE;
    }
}
