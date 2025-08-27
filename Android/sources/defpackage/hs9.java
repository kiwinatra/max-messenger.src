package defpackage;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hs9  reason: default package */
public final class hs9 extends SuspendLambda implements Function2 {
    public nk4 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long[] o;
    public final /* synthetic */ is9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hs9(is9 is9, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.o = jArr;
        this.v = is9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hs9 hs9 = new hs9(this.v, continuation, this.o);
        hs9.c = obj;
        return hs9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hs9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        nk4 nk4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d142 = (d14) this.c;
            long[] jArr = this.o;
            if (jArr.length != 0) {
                is9 is9 = this.v;
                if (is9.k() && e14.f(d142)) {
                    nk4 d = ev0.d(d142, (q04) null, new gs9(is9, (Continuation) null, jArr), 3);
                    mk4[] mk4Arr = {d, null};
                    this.c = d142;
                    this.a = d;
                    this.b = 1;
                    if (j4b.g(ArraysKt.filterNotNull(mk4Arr), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    d14 = d142;
                    nk4 = d;
                }
            }
            return null;
        } else if (i == 1) {
            nk4 = this.a;
            d14 = (d14) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e14.e(d14);
        return TuplesKt.to((jo3) nk4.m(), null);
    }
}
