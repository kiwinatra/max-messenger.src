package defpackage;

import android.os.CancellationSignal;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u6d  reason: default package */
public final class u6d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ z6d b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u6d(z6d z6d, long j, Continuation continuation) {
        super(2, continuation);
        this.b = z6d;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u6d(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        z6d z6d = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            aj9 d = z6d.d();
            this.a = 1;
            d.getClass();
            d7d a2 = d7d.a(1, "SELECT * FROM messages WHERE id = ?");
            a2.k(1, this.c);
            obj = i8b.q(d.a, new CancellationSignal(), new yi9(d, a2, 0), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return (ha9) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ya9 ya9 = (ya9) obj;
        if (ya9 == null) {
            return null;
        }
        this.a = 2;
        obj = z6d.h(ya9, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (ha9) obj;
    }
}
