package defpackage;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: m14  reason: default package */
public final class m14 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6d c;
    public final /* synthetic */ String[] o;
    public final /* synthetic */ Callable v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m14(i6d i6d, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.c = i6d;
        this.o = strArr;
        this.v = callable;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m14 m14 = new m14(this.c, this.o, this.v, continuation);
        m14.b = obj;
        return m14;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m14) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            l14 l14 = new l14(this.c, (ds5) this.b, this.o, this.v, (Continuation) null);
            this.a = 1;
            if (e14.d(l14, this) == coroutine_suspended) {
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
