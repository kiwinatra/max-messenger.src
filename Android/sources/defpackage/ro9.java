package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: ro9  reason: default package */
public final class ro9 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ to9 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ b89 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ro9(to9 to9, long j, b89 b89, Continuation continuation) {
        super(1, continuation);
        this.b = to9;
        this.c = j;
        this.o = b89;
    }

    public final Continuation create(Continuation continuation) {
        return new ro9(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj) {
        return ((ro9) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        b89 b89 = this.o;
        to9 to9 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = b89.a;
            this.a = 1;
            obj = to9.a.j(this.c, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 3) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 4) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ha9 ha9 = (ha9) obj;
        if (ha9 != null) {
            return ha9;
        }
        b89 b892 = this.o;
        long j2 = b892.w;
        if (j2 == 0) {
            long e = to9.a.e(this.c, ((Number) to9.b.getValue()).longValue(), b892);
            this.a = 2;
            obj = to9.a(e, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
        z6d z6d = to9.a;
        aj9 d = z6d.d();
        long j3 = this.c;
        ya9 h = d.h(j3, j2);
        ha9 b2 = h != null ? z6d.b(h) : null;
        if (b2 != null) {
            cd4 cd4 = oa9.b;
            z6d z6d2 = to9.a;
            z6d2.getClass();
            z6d2.o(b89, j3, false, (qe9) null);
            ca9 ca9 = new ca9(b2, qe8.g(b89.y, (bjd) to9.c.getValue()), 1);
            long j4 = b2.b;
            z6d2.n(j4, ca9);
            this.a = 3;
            obj = to9.a(j4, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
        long e2 = to9.a.e(this.c, ((Number) to9.b.getValue()).longValue(), this.o);
        this.a = 4;
        obj = to9.a(e2, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
