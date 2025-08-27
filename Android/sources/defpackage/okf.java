package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: okf  reason: default package */
public abstract class okf {
    public static final Object a(mkf mkf, Function2 function2) {
        Object obj;
        kv0.H(mkf, new tq4(0, xk4.d(mkf.o.getContext()).U(mkf.v, mkf, mkf.c)));
        try {
            obj = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, mkf, mkf) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(mkf, mkf);
        } catch (Throwable th) {
            obj = new jb3(th, false);
        }
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object S = mkf.S(obj);
        if (S == ld9.e) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (S instanceof jb3) {
            Throwable th2 = ((jb3) S).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).a != mkf) {
                throw th2;
            } else if (obj instanceof jb3) {
                throw ((jb3) obj).a;
            }
        } else {
            obj = ld9.U(S);
        }
        return obj;
    }

    public static final Object b(long j, Function2 function2, Continuation continuation) {
        if (j > 0) {
            Object a = a(new mkf(j, continuation), function2);
            if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return a;
        }
        throw new TimeoutCancellationException("Timed out immediately", (pm7) null);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(long r7, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.nkf
            if (r0 == 0) goto L_0x0013
            r0 = r10
            nkf r0 = (defpackage.nkf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            nkf r0 = new nkf
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ TimeoutCancellationException -> 0x002c }
            goto L_0x0067
        L_0x002c:
            r8 = move-exception
            goto L_0x0068
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return r3
        L_0x0040:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.a = r9     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.b = r10     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r0.o = r4     // Catch:{ TimeoutCancellationException -> 0x0060 }
            mkf r2 = new mkf     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            r10.element = r2     // Catch:{ TimeoutCancellationException -> 0x0060 }
            java.lang.Object r7 = a(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ TimeoutCancellationException -> 0x0060 }
            if (r7 != r8) goto L_0x0063
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch:{ TimeoutCancellationException -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            r8 = move-exception
            r7 = r10
            goto L_0x0068
        L_0x0063:
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r10 = r7
        L_0x0067:
            return r10
        L_0x0068:
            pm7 r9 = r8.a
            T r7 = r7.element
            if (r9 != r7) goto L_0x006f
            return r3
        L_0x006f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okf.c(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
