package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: c40  reason: default package */
public final class c40 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ f40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c40(f40 f40, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.b = f40;
        this.c = j;
        this.o = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new c40(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c40) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        l20 I;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        f40 f40 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            q04 b2 = ((osa) ((gaf) f40.X.getValue())).b();
            b40 b40 = new b40(f40, this.o, (Continuation) null);
            this.a = 1;
            obj = ev0.I(b2, b40, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 == null || !ha9.w()) {
            return Unit.INSTANCE;
        }
        w28 w28 = ha9.x0;
        if (w28 == null || (I = w28.I(g20.v)) == null) {
            return Unit.INSTANCE;
        }
        i10 i10 = I.e;
        if (i10 == null) {
            return Unit.INSTANCE;
        }
        fa9 fa9 = (fa9) f40.y.getValue();
        fa9.getClass();
        fa9.u(ha9, I.q, new v52(fa9, this.c, i10.c));
        return Unit.INSTANCE;
    }
}
