package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: si1  reason: default package */
public final class si1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ jj1 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public si1(jj1 jj1, Continuation continuation) {
        super(2, continuation);
        this.b = jj1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        si1 si1 = new si1(this.b, continuation);
        si1.a = obj;
        return si1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((si1) create((ehd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int ordinal = ((ehd) this.a).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                xag.h(this.b.K0, new gi1(new igf(sqa.v0)));
            } else if (!(ordinal == 2 || ordinal == 3)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
