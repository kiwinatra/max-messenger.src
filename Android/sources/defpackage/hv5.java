package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hv5  reason: default package */
public final class hv5 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ a7e b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ sz9 o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv5(a7e a7e, bs5 bs5, xme xme, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = a7e;
        this.c = bs5;
        this.o = xme;
        this.v = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hv5(this.b, this.c, (xme) this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hv5) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [fv5, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        bs5 bs5 = this.c;
        sz9 sz9 = this.o;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else if (!(i == 3 || i == 4)) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        a7e a7e = z6e.a;
        a7e a7e2 = this.b;
        if (a7e2 == a7e) {
            this.a = 1;
            if (bs5.e(sz9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (a7e2 == z6e.b) {
            ome g = sz9.g();
            ? suspendLambda = new SuspendLambda(2, (Continuation<Object>) null);
            this.a = 2;
            if (bs0.A(g, suspendLambda, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            bs5 w = bs0.w(a7e2.b(sz9.g()));
            gv5 gv5 = new gv5(bs5, (xme) sz9, this.v, (Continuation) null);
            this.a = 4;
            if (bs0.t(w, gv5, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
        this.a = 3;
        if (bs5.e(sz9, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
