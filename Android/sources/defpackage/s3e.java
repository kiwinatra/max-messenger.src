package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: s3e  reason: default package */
public final class s3e extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ y3e c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s3e(y3e y3e, Continuation continuation) {
        super(2, continuation);
        this.c = y3e;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        s3e s3e = new s3e(this.c, continuation);
        s3e.b = obj;
        return s3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((s3e) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r4 = r6;
        r6 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        defpackage.z68.f(r5.getClass().getName(), "fail to disable SAFE_MODE", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r5 = r5.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        defpackage.xag.h(r2.H0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0011, B:11:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017 A[ExcHandler: TamErrorException (r5v8 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:4:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.a
            y3e r2 = r5.c
            r3 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r5 = r5.b
            d14 r5 = (defpackage.d14) r5
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ TamErrorException -> 0x0017, all -> 0x0015 }
            goto L_0x005d
        L_0x0015:
            r6 = move-exception
            goto L_0x0040
        L_0x0017:
            r5 = move-exception
            goto L_0x0052
        L_0x0019:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.b
            d14 r6 = (defpackage.d14) r6
            kotlin.Lazy r1 = r2.X     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            ywf r1 = (defpackage.ywf) r1     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            r5.b = r6     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            r5.a = r3     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            r3 = 0
            java.lang.Object r5 = r1.a(r3, r5)     // Catch:{ TamErrorException -> 0x0017, all -> 0x003c }
            if (r5 != r0) goto L_0x005d
            return r0
        L_0x003c:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0040:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x005d
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "fail to disable SAFE_MODE"
            defpackage.z68.f(r5, r0, r6)
            goto L_0x005d
        L_0x0052:
            java.lang.String r5 = r5.getLocalizedMessage()
            if (r5 == 0) goto L_0x005d
            s85 r6 = r2.H0
            defpackage.xag.h(r6, r5)
        L_0x005d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
