package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rj  reason: default package */
public final class rj extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gk c;
    public final /* synthetic */ va8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj(gk gkVar, jz9 jz9, Continuation continuation) {
        super(2, continuation);
        this.c = gkVar;
        this.o = jz9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rj rjVar = new rj(this.c, (jz9) this.o, continuation);
        rjVar.b = obj;
        return rjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rj) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            gk gkVar = this.c;
            va8 va8 = this.o;
            Result.Companion companion = Result.Companion;
            rl rlVar = gkVar.a;
            yt ytVar = new yt(wa8.b((jz9) va8), 9);
            this.a = 1;
            obj = ((jna) rlVar).T(ytVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m23constructorimpl((du) obj);
        if (Result.m29isFailureimpl(obj2)) {
            return null;
        }
        return obj2;
    }
}
