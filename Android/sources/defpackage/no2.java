package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: no2  reason: default package */
public final class no2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ a32 b;
    public final /* synthetic */ lp2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no2(a32 a32, lp2 lp2, Continuation continuation) {
        super(2, continuation);
        this.b = a32;
        this.c = lp2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new no2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((no2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        pa4 pa4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.c;
            long s = ((qjd) ((x23) lp2.Y.getValue())).s();
            a32 a32 = this.b;
            boolean h = a32.b.h(s);
            long j = a32.a;
            if (h) {
                wn2.b.getClass();
                pa4 = new pa4(":profile/attaches?id=" + j);
            } else {
                wn2 wn2 = wn2.b;
                boolean n = lp2.n();
                wn2.getClass();
                pa4 = new pa4(":profile?id=" + j + "&type=local_chat&is_opened_from_dialog=" + n);
            }
            n6e n6e = lp2.S0;
            this.a = 1;
            if (n6e.a(pa4, this) == coroutine_suspended) {
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
