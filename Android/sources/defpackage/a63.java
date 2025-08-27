package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: a63  reason: default package */
public final class a63 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ bs5[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AtomicInteger o;
    public final /* synthetic */ x02 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a63(bs5[] bs5Arr, int i, AtomicInteger atomicInteger, ru0 ru0, Continuation continuation) {
        super(2, continuation);
        this.b = bs5Arr;
        this.c = i;
        this.o = atomicInteger;
        this.v = ru0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new a63(this.b, this.c, this.o, (ru0) this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a63) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        AtomicInteger atomicInteger = this.o;
        x02 x02 = this.v;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bs5[] bs5Arr = this.b;
            int i2 = this.c;
            bs5 bs5 = bs5Arr[i2];
            z53 z53 = new z53((ru0) x02, i2, 0);
            this.a = 1;
            if (bs5.e(z53, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    x02.p((Throwable) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (atomicInteger.decrementAndGet() == 0) {
            x02.p((Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
