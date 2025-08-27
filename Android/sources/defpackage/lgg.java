package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: lgg  reason: default package */
public final class lgg extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mgg c;
    public final /* synthetic */ pgg o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lgg(mgg mgg, pgg pgg, Continuation continuation) {
        super(2, continuation);
        this.c = mgg;
        this.o = pgg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lgg lgg = new lgg(this.c, this.o, continuation);
        lgg.b = obj;
        return lgg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lgg) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        vo7 vo7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.b;
            mgg mgg = this.c;
            mgg.getClass();
            egg egg = th instanceof egg ? (egg) th : null;
            if (egg instanceof cgg) {
                vo7 = new to7(new wo7("download_failed", 1));
            } else if (egg instanceof dgg) {
                vo7 = new to7(new wo7("invalid_params", 2));
            } else if (egg == null) {
                vo7 = uo7.d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            vo7 vo72 = vo7;
            fgg fgg = fgg.b;
            String str = this.o.a;
            this.a = 1;
            if (((d93) mgg.c.getValue()).a(mgg.f, vo72, fgg, str, this) == coroutine_suspended) {
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
