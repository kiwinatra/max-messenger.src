package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g7d  reason: default package */
public final class g7d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g7d(o7d o7d, List list, Continuation continuation) {
        super(2, continuation);
        this.b = o7d;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new g7d(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g7d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rne a2 = this.b.a();
            this.a = 1;
            a2.getClass();
            if (i8b.r(a2.a, new pne(a2, this.c, 0), this) == coroutine_suspended) {
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
