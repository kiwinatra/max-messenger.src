package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: nk2  reason: default package */
public final class nk2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ fu4 b;
    public final /* synthetic */ b89 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nk2(fu4 fu4, b89 b89, Continuation continuation) {
        super(2, continuation);
        this.b = fu4;
        this.c = b89;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nk2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nk2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean z = true;
        fu4 fu4 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = bs0.z(((rk2) fu4.c).a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        b89 b89 = this.c;
        ha9 k = ((fa9) ((Lazy) fu4.a).getValue()).k(longValue, b89.a);
        if (k == null) {
            long s = ((qjd) ((x23) ((Lazy) fu4.f).getValue())).s();
            Lazy lazy = (Lazy) fu4.a;
            k = ((fa9) lazy.getValue()).r(((fa9) lazy.getValue()).g(longValue, s, this.c));
            r62 r62 = (r62) ((Lazy) fu4.e).getValue();
            if (b89.o != s) {
                z = false;
            }
            r62.b0(longValue, z, k, false, 0);
        }
        return k;
    }
}
