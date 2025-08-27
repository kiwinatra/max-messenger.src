package defpackage;

import java.util.concurrent.Callable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l14  reason: default package */
public final class l14 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c = false;
    public final /* synthetic */ i6d o;
    public final /* synthetic */ ds5 v;
    public final /* synthetic */ String[] w;
    public final /* synthetic */ Callable x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l14(i6d i6d, ds5 ds5, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.o = i6d;
        this.v = ds5;
        this.w = strArr;
        this.x = callable;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l14 l14 = new l14(this.o, this.v, this.w, this.x, continuation);
        l14.b = obj;
        return l14;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l14) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            ru0 a2 = o54.a(-1, 6, (cu0) null);
            k14 k14 = new k14(this.w, a2, 0);
            Object obj2 = Unit.INSTANCE;
            a2.s(obj2);
            xqf xqf = (xqf) d14.U().get(xqf.c);
            if (xqf == null || (coroutineContext = xqf.a) == null) {
                boolean z = this.c;
                i6d i6d = this.o;
                coroutineContext = z ? h88.C(i6d) : h88.B(i6d);
            }
            ru0 a3 = o54.a(0, 7, (cu0) null);
            ev0.v(d14, coroutineContext, (f14) null, new j14(this.o, k14, a2, this.x, a3, (Continuation) null), 2);
            this.a = 1;
            Object j = ev0.j(this.v, a3, true, this);
            if (j == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                obj2 = j;
            }
            if (obj2 == coroutine_suspended) {
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
