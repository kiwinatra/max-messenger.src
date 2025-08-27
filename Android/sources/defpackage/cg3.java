package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: cg3  reason: default package */
public final class cg3 extends SuspendLambda implements Function2 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eg3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cg3(eg3 eg3, Continuation continuation) {
        super(2, continuation);
        this.o = eg3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        cg3 cg3 = new cg3(this.o, continuation);
        cg3.c = obj;
        return cg3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cg3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        r12 = r14;
        r14 = r13;
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        defpackage.z68.f(r13.getClass().getName(), "fail to update safe mode", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e2, code lost:
        r13 = r13.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        if (r13 != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e8, code lost:
        defpackage.xag.h(r4.X, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0015, B:12:0x002e] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0015, B:18:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d A[ExcHandler: TamErrorException (r13v10 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:5:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.b
            r2 = 0
            r3 = 2
            eg3 r4 = r13.o
            r5 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r5) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            java.lang.Object r13 = r13.c
            d14 r13 = (defpackage.d14) r13
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ TamErrorException -> 0x001d, all -> 0x001a }
            goto L_0x00c4
        L_0x001a:
            r14 = move-exception
            goto L_0x00d0
        L_0x001d:
            r13 = move-exception
            goto L_0x00e2
        L_0x0020:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0028:
            long r6 = r13.a
            java.lang.Object r1 = r13.c
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ TamErrorException -> 0x001d, all -> 0x0033 }
            r14 = r1
            goto L_0x005f
        L_0x0033:
            r14 = move-exception
            r13 = r1
            goto L_0x00d0
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.c
            d14 r14 = (defpackage.d14) r14
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r6 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r6 = kotlin.time.DurationKt.toDuration((long) r6, (kotlin.time.DurationUnit) r1)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.Lazy r1 = r4.o     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            ywf r1 = (defpackage.ywf) r1     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r13.c = r14     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r13.a = r6     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r13.b = r5     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.Object r1 = r1.a(r5, r13)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            if (r1 != r0) goto L_0x005f
            return r0
        L_0x005f:
            kotlin.Lazy r1 = r4.c     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            x23 r1 = (defpackage.x23) r1     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.String r8 = r4.b     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            a33 r1 = (defpackage.a33) r1     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.String r10 = "app.pin_"
            r9.<init>(r10)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r10 = r1.s()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r9.append(r10)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.String r9 = r9.toString()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r1.l(r9, r8)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.Lazy r1 = r4.c     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            x23 r1 = (defpackage.x23) r1     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            a33 r1 = (defpackage.a33) r1     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.String r8 = "app.onboarding.safe_mode"
            r1.i(r8, r5)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r8 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r8 = kotlin.time.DurationKt.toDuration((long) r8, (kotlin.time.DurationUnit) r1)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r6 = kotlin.time.Duration.m1388minusLRDsOJo(r8, r6)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r8 = kotlin.time.DurationKt.toDuration((int) r5, (kotlin.time.DurationUnit) r1)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r6 = kotlin.time.Duration.m1388minusLRDsOJo(r8, r6)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            long r8 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r6)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c3
            r13.c = r14     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            r13.b = r3     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            java.lang.Object r13 = defpackage.xk4.c(r6, r13)     // Catch:{ TamErrorException -> 0x001d, all -> 0x00be }
            if (r13 != r0) goto L_0x00c3
            return r0
        L_0x00be:
            r13 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x00d0
        L_0x00c3:
            r13 = r14
        L_0x00c4:
            defpackage.e14.e(r13)     // Catch:{ TamErrorException -> 0x001d, all -> 0x001a }
            s85 r14 = r4.Y     // Catch:{ TamErrorException -> 0x001d, all -> 0x001a }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ TamErrorException -> 0x001d, all -> 0x001a }
            defpackage.xag.h(r14, r0)     // Catch:{ TamErrorException -> 0x001d, all -> 0x001a }
            r2 = r5
            goto L_0x00ed
        L_0x00d0:
            boolean r0 = r14 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x00ed
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r0 = "fail to update safe mode"
            defpackage.z68.f(r13, r0, r14)
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r13 = r13.getLocalizedMessage()
            if (r13 == 0) goto L_0x00ed
            s85 r14 = r4.X
            defpackage.xag.h(r14, r13)
        L_0x00ed:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
