package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rfb  reason: default package */
public final class rfb extends SuspendLambda implements Function2 {
    public xme a;
    public int b;
    public final /* synthetic */ sfb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfb(sfb sfb, Continuation continuation) {
        super(2, continuation);
        this.c = sfb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rfb(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rfb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sfb sfb = this.c;
            xme xme2 = sfb.d;
            this.a = xme2;
            this.b = 1;
            obj = ((eu3) sfb.a.getValue()).e();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            xme = xme2;
        } else if (i == 1) {
            xme = this.a;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        xme.setValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
