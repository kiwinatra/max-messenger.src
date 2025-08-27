package defpackage;

import android.os.CancellationSignal;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j7d  reason: default package */
public final class j7d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o7d b;
    public final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j7d(o7d o7d, long j, Continuation continuation) {
        super(2, continuation);
        this.b = o7d;
        this.c = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new j7d(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j7d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rne a2 = this.b.a();
            this.a = 1;
            a2.getClass();
            d7d a3 = d7d.a(1, "SELECT * FROM events WHERE id = ?");
            a3.k(1, this.c);
            obj = i8b.q(a2.a, new CancellationSignal(), new qne(a2, a3, 1), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hme hme = (hme) obj;
        if (hme == null) {
            return null;
        }
        return new q78(hme.a, hme.c, hme.b, hme.d);
    }
}
