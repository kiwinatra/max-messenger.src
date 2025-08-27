package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h9f  reason: default package */
public final class h9f extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ zc4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tqd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h9f(zc4 zc4, String str, tqd tqd, Continuation continuation) {
        super(2, continuation);
        this.b = zc4;
        this.c = str;
        this.o = tqd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h9f(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h9f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            g9f g9f = new g9f(this.b, this.c, this.o, (Continuation) null);
            this.a = 1;
            if (e14.d(g9f, this) == coroutine_suspended) {
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
