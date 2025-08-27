package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sl9  reason: default package */
public final class sl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ en9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.b = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sl9(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            en9 en9 = this.b;
            qx2 qx2 = en9.y;
            long j = en9.b.a;
            this.a = 1;
            obj = qx2.d(j, this);
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
        long j2 = ((a32) obj).o.a.b;
        String str = this.b.z0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, wj6.i(j2, "Scrolling to last mention with id="), (Throwable) null);
        }
        en9 en92 = this.b;
        this.a = 2;
        if (en9.k(en92, j2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
