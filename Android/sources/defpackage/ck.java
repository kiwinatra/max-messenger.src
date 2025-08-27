package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ck  reason: default package */
public final class ck extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gk c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ck(gk gkVar, Continuation continuation) {
        super(2, continuation);
        this.c = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ck ckVar = new ck(this.c, continuation);
        ckVar.b = obj;
        return ckVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ck) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gk gkVar = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            Result.Companion companion = Result.Companion;
            rl rlVar = gkVar.a;
            yt ytVar = new yt(10, ((qjd) gkVar.c).g.getLong("user.reactionsLastSync", 0), 0, 0);
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
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = Result.m23constructorimpl((qu) obj);
        if (Result.m29isFailureimpl(obj2)) {
            obj2 = null;
        }
        qu quVar = (qu) obj2;
        if (quVar == null) {
            return Unit.INSTANCE;
        }
        ((qjd) gkVar.c).k("user.reactionsLastSync", Long.valueOf(quVar.c));
        List list = quVar.o;
        Map map = quVar.y;
        this.a = 2;
        if (gk.c(gkVar, list, map, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
