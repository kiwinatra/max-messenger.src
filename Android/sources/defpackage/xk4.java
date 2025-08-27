package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: xk4  reason: default package */
public abstract class xk4 {
    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlin.coroutines.Continuation r4) {
        /*
            boolean r0 = r4 instanceof defpackage.wk4
            if (r0 == 0) goto L_0x0013
            r0 = r4
            wk4 r0 = (defpackage.wk4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0018
        L_0x0013:
            wk4 r0 = new wk4
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0052
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r4)
            r0.b = r3
            lw1 r4 = new lw1
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r4.<init>(r3, r2)
            r4.u()
            java.lang.Object r4 = r4.t()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r2) goto L_0x004f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L_0x004f:
            if (r4 != r1) goto L_0x0052
            return r1
        L_0x0052:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk4.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object b(long j, Continuation continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(continuation));
        lw1.u();
        if (j < LongCompanionObject.MAX_VALUE) {
            d(lw1.v).o(j, lw1);
        }
        Object t = lw1.t();
        if (t == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return t == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? t : Unit.INSTANCE;
    }

    public static final Object c(long j, Continuation continuation) {
        Object b = b(e(j), continuation);
        return b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
    }

    public static final vk4 d(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key);
        vk4 vk4 = element instanceof vk4 ? (vk4) element : null;
        return vk4 == null ? ff4.a : vk4;
    }

    public static final long e(long j) {
        boolean r0 = Duration.m1387isPositiveimpl(j);
        if (r0) {
            return Duration.m1371getInWholeMillisecondsimpl(Duration.m1389plusLRDsOJo(j, DurationKt.toDuration(999999, DurationUnit.NANOSECONDS)));
        }
        if (!r0) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
