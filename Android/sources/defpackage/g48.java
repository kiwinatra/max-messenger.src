package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g48  reason: default package */
public final class g48 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ h48 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g48(h48 h48, String str, Continuation continuation) {
        super(2, continuation);
        this.b = h48;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g48(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g48) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        String str = this.c;
        h48 h48 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            wk6 wk6 = (wk6) h48.g.get(str);
            if (wk6 == null) {
                return Unit.INSTANCE;
            }
            s48 s48 = h48.c;
            this.a = 1;
            if (((yd7) s48).e(wk6, 40, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h48.a.c(new i48(str));
        return Unit.INSTANCE;
    }
}
