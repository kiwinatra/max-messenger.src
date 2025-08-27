package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xwf  reason: default package */
public final class xwf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ywf c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwf(boolean z, ywf ywf, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = ywf;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xwf(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xwf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r13v12, types: [l0g, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        ywf ywf = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ? obj2 = new Object();
            boolean z = this.b;
            obj2.u = Boolean.valueOf(z);
            if (z) {
                obj2.o = 3;
                obj2.p = 3;
                obj2.v = 3;
            }
            np2 np2 = new np2((String) null, 0, new ue3(new n0g(obj2)), false);
            this.a = 1;
            obj = ((jna) ((rl) ywf.a.getValue())).T(np2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n0g n0g = ((me3) obj).o;
        if (n0g != null) {
            ((hq) ((fq) ywf.b.getValue())).H(n0g);
            if (Intrinsics.areEqual((Object) n0g.u, (Object) Boxing.boxBoolean(false))) {
                a33 a33 = (a33) ((x23) ywf.c.getValue());
                a33.l("app.pin_" + a33.s(), (String) null);
            }
            qe3 qe3 = (qe3) ywf.f.getValue();
            qe3.getClass();
            ev0.v(qe3.b, (CoroutineContext) null, (f14) null, new pe3(qe3, (Continuation) null), 3);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
