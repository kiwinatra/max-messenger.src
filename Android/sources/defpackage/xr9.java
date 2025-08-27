package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xr9  reason: default package */
public final class xr9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ is9 c;
    public final /* synthetic */ long[] o;
    public final /* synthetic */ jz9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xr9(Pair pair, is9 is9, long[] jArr, jz9 jz9, Continuation continuation) {
        super(2, continuation);
        this.b = pair;
        this.c = is9;
        this.o = jArr;
        this.v = jz9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xr9 xr9 = new xr9(this.b, this.c, this.o, this.v, continuation);
        xr9.a = obj;
        return xr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xr9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        jz9 jz9 = this.v;
        int i = 0;
        Pair pair = this.b;
        long[] jArr = this.o;
        is9 is9 = this.c;
        if (pair != null) {
            boolean k = is9.k();
            ws wsVar = is9.z;
            if (k && e14.f(d14)) {
                jo3 jo3 = (jo3) pair.getFirst();
                pr3 pr3 = (pr3) pair.getSecond();
                try {
                    no3 no3 = (no3) is9.c.getValue();
                    if (jo3 != null) {
                        no3.b(jo3, jArr, 0);
                        if (pr3 != null) {
                            ((rtb) is9.o.getValue()).i(0, qe8.n(pr3.c));
                        }
                        wsVar.removeAll(ArraysKt.toSet(jArr));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (Throwable th) {
                    wsVar.removeAll(ArraysKt.toSet(jArr));
                    throw th;
                }
            }
        }
        is9.z.removeAll(ArraysKt.toSet(jArr));
        int i2 = jz9.d;
        int length = jArr.length;
        while (i < length) {
            long j = jArr[i];
            jz9.b[jz9.h(j)] = j;
            i++;
        }
        return Unit.INSTANCE;
    }
}
