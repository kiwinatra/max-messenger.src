package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j73  reason: default package */
public final class j73 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ k73 b;
    public final /* synthetic */ ke7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j73(k73 k73, ke7 ke7, Continuation continuation) {
        super(2, continuation);
        this.b = k73;
        this.c = ke7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j73(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j73) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        q10 q10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        f73 f73 = null;
        ke7 ke7 = this.c;
        k73 k73 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q04 b2 = ((osa) k73.b).b();
            i73 i73 = new i73(k73, ke7, (Continuation) null);
            this.a = 1;
            obj = ev0.I(b2, i73, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a89 a89 = (a89) obj;
        if (a89 == null) {
            return Unit.INSTANCE;
        }
        l20 a2 = a89.a.a(g20.b);
        if (a2 == null || (q10 = a2.c) == null) {
            return Unit.INSTANCE;
        }
        p10 p10 = q10.a;
        int i2 = p10 == null ? -1 : h73.$EnumSwitchMapping$0[p10.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            f73 = new d73(ke7.b);
        } else if (i2 == 4 || i2 == 5) {
            f73 = new e73(ke7.b);
        }
        if (f73 == null) {
            return Unit.INSTANCE;
        }
        k73.a(f73);
        return Unit.INSTANCE;
    }
}
