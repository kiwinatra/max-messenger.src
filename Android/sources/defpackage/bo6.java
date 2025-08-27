package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bo6  reason: default package */
public final class bo6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gp6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bo6(gp6 gp6, Continuation continuation) {
        super(2, continuation);
        this.c = gp6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bo6 bo6 = new bo6(this.c, continuation);
        bo6.b = obj;
        return bo6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bo6) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        gp6 gp6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            int intValue = ((Number) pair.component1()).intValue();
            vm6 vm6 = (vm6) pair.component2();
            if (Intrinsics.areEqual((Object) vm6, (Object) rm6.b)) {
                boolean b2 = ((edb) gp6.y.getValue()).b(edb.l);
                ru0 ru0 = gp6.B0;
                if (b2) {
                    xl6 xl6 = xl6.a;
                    this.a = 1;
                    if (ru0.t(xl6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    yl6 yl6 = yl6.a;
                    this.a = 2;
                    if (ru0.t(yl6, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (vm6 instanceof tm6) {
                s85 s85 = gp6.w.c;
                if (gp6.b.a) {
                    intValue--;
                }
                xag.h(s85, new jm6(intValue, ((wk6) gp6.A0.a.getValue()).a.b(), ((tm6) vm6).c));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xag.h(gp6.w.c, hm6.a);
        return Unit.INSTANCE;
    }
}
