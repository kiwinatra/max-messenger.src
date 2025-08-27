package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ro2  reason: default package */
public final class ro2 extends SuspendLambda implements Function2 {
    public fu4 a;
    public int b;
    public final /* synthetic */ lp2 c;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ Long v;
    public final /* synthetic */ Long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ro2(lp2 lp2, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.c = lp2;
        this.o = charSequence;
        this.v = l;
        this.w = l2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ro2(this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ro2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        fu4 fu4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lp2 lp2 = this.c;
            fu4 = lp2.y;
            this.a = fu4;
            this.b = 1;
            obj = lp2.q(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            fu4 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fu4 fu42 = fu4;
        long longValue = ((Number) obj).longValue();
        this.a = null;
        this.b = 2;
        Object I = ev0.I(((osa) ((gaf) ((Lazy) fu42.j).getValue())).b(), new eu4(fu42, longValue, this.o, this.w, this.v, (Continuation) null), this);
        if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            I = Unit.INSTANCE;
        }
        if (I == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
