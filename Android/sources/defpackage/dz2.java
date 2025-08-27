package defpackage;

import kotlin.Lazy;

/* renamed from: dz2  reason: default package */
public final class dz2 {
    public final Lazy a;
    public final Lazy b;

    public dz2(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r7, defpackage.ry7 r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cz2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            cz2 r0 = (defpackage.cz2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            cz2 r0 = new cz2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            dz2 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x002c }
            goto L_0x0076
        L_0x002c:
            r7 = move-exception
            goto L_0x007b
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x002c }
            kotlin.Lazy r9 = r6.a     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x002c }
            dxa r9 = (defpackage.dxa) r9     // Catch:{ all -> 0x002c }
            r0.a = r6     // Catch:{ all -> 0x002c }
            r0.o = r4     // Catch:{ all -> 0x002c }
            kotlin.Lazy r9 = r9.a     // Catch:{ all -> 0x002c }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x002c }
            ocf r9 = (defpackage.ocf) r9     // Catch:{ all -> 0x002c }
            yt r2 = new yt     // Catch:{ all -> 0x002c }
            x3b r4 = defpackage.x3b.CHAT_CHECK_LINK     // Catch:{ all -> 0x002c }
            r5 = 13
            r2.<init>((defpackage.x3b) r4, (int) r5)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "link"
            r2.t(r4, r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = "linkType"
            java.lang.String r8 = r8.name()     // Catch:{ all -> 0x002c }
            r2.t(r7, r8)     // Catch:{ all -> 0x002c }
            java.lang.Object r7 = r9.e(r2, r0)     // Catch:{ all -> 0x002c }
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch:{ all -> 0x002c }
            if (r7 != r8) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002c }
        L_0x0073:
            if (r7 != r1) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r3)     // Catch:{ all -> 0x002c }
            goto L_0x0085
        L_0x007b:
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m23constructorimpl(r7)
        L_0x0085:
            java.lang.Throwable r8 = kotlin.Result.m26exceptionOrNullimpl(r7)
            if (r8 == 0) goto L_0x00b8
            boolean r9 = r8 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r9 == 0) goto L_0x0094
            ru.ok.tamtam.errors.TamErrorException r8 = (ru.ok.tamtam.errors.TamErrorException) r8
            qaf r6 = r8.a
            return r6
        L_0x0094:
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unknown error: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r9, r0, r3)
            kotlin.Lazy r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            m95 r6 = (defpackage.m95) r6
            ((defpackage.uta) r6).c(r8, false)
        L_0x00b8:
            boolean r6 = kotlin.Result.m29isFailureimpl(r7)
            if (r6 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r3 = r7
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz2.a(java.lang.String, ry7, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
