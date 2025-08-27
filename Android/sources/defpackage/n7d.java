package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: n7d  reason: default package */
public final class n7d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ List c;
    public final /* synthetic */ r78 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n7d(o7d o7d, List list, r78 r78, Continuation continuation) {
        super(2, continuation);
        this.b = o7d;
        this.c = list;
        this.o = r78;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new n7d(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n7d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rne a2 = this.b.a();
            this.a = 1;
            a2.getClass();
            if (i8b.r(a2.a, new ja5(2, a2, this.o, this.c), this) == coroutine_suspended) {
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
