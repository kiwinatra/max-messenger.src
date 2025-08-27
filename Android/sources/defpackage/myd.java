package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: myd  reason: default package */
public final class myd extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ eu3 c;
    public final /* synthetic */ wyd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public myd(Lazy lazy, eu3 eu3, wyd wyd, Continuation continuation) {
        super(2, continuation);
        this.b = lazy;
        this.c = eu3;
        this.o = wyd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new myd(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((myd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = this.b;
            kyd kyd = new kyd(new ps5(kv0.h(((ltb) ((jtb) lazy.getValue())).a.t()), new lyd(lazy, (Continuation) null)), 0);
            this.a = 1;
            obj = bs0.z(kyd, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        etc c2 = this.c.c(((Number) obj).longValue());
        bx bxVar = new bx(12, (Object) this.o);
        this.a = 2;
        Object e = c2.a.e(new tu5(bxVar, 1), this);
        if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            e = Unit.INSTANCE;
        }
        if (e == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
