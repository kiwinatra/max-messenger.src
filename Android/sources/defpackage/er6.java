package defpackage;

import kotlin.Lazy;

/* renamed from: er6  reason: default package */
public final class er6 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final String e = er6.class.getName();

    public er6(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r11, java.lang.Long r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.cr6
            if (r0 == 0) goto L_0x0013
            r0 = r15
            cr6 r0 = (defpackage.cr6) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            cr6 r0 = new cr6
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x0051
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.String r10 = r0.b
            java.lang.Object r11 = r0.a
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0100
        L_0x0037:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003f:
            long r10 = r0.o
            java.lang.String r12 = r0.c
            java.lang.String r13 = r0.b
            java.lang.Object r14 = r0.a
            er6 r14 = (defpackage.er6) r14
            kotlin.ResultKt.throwOnFailure(r15)
            r8 = r10
            r10 = r12
            r11 = r8
            goto L_0x00e6
        L_0x0051:
            long r11 = r0.o
            java.lang.Object r10 = r0.a
            er6 r10 = (defpackage.er6) r10
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x005b }
            goto L_0x00a2
        L_0x005b:
            r13 = move-exception
            goto L_0x00ab
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r15)
            jw9 r15 = new jw9
            if (r14 == 0) goto L_0x006a
            boolean r2 = kotlin.text.StringsKt.isBlank(r14)
            if (r2 == 0) goto L_0x006b
        L_0x006a:
            r14 = r6
        L_0x006b:
            x3b r2 = defpackage.x3b.WEB_APP_INIT_DATA
            r7 = 21
            r15.<init>(r2, r7)
            java.lang.String r2 = "botId"
            r15.p(r11, r2)
            if (r13 == 0) goto L_0x0082
            java.lang.Object r2 = r15.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r7 = "chatId"
            r2.put(r7, r13)
        L_0x0082:
            if (r14 == 0) goto L_0x0089
            java.lang.String r13 = "startParam"
            r15.t(r13, r14)
        L_0x0089:
            kotlin.Result$Companion r13 = kotlin.Result.Companion     // Catch:{ all -> 0x005b }
            kotlin.Lazy r13 = r10.a     // Catch:{ all -> 0x005b }
            java.lang.Object r13 = r13.getValue()     // Catch:{ all -> 0x005b }
            rl r13 = (defpackage.rl) r13     // Catch:{ all -> 0x005b }
            r0.a = r10     // Catch:{ all -> 0x005b }
            r0.o = r11     // Catch:{ all -> 0x005b }
            r0.x = r5     // Catch:{ all -> 0x005b }
            jna r13 = (defpackage.jna) r13     // Catch:{ all -> 0x005b }
            java.lang.Object r15 = r13.T(r15, r0)     // Catch:{ all -> 0x005b }
            if (r15 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            ahg r15 = (defpackage.ahg) r15     // Catch:{ all -> 0x005b }
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r15)     // Catch:{ all -> 0x005b }
        L_0x00a8:
            r14 = r10
            r10 = r11
            goto L_0x00b6
        L_0x00ab:
            kotlin.Result$Companion r14 = kotlin.Result.Companion
            java.lang.Object r13 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r13 = kotlin.Result.m23constructorimpl(r13)
            goto L_0x00a8
        L_0x00b6:
            boolean r12 = kotlin.Result.m29isFailureimpl(r13)
            if (r12 == 0) goto L_0x00bd
            r13 = r6
        L_0x00bd:
            ahg r13 = (defpackage.ahg) r13
            if (r13 != 0) goto L_0x00c2
            return r6
        L_0x00c2:
            java.lang.String r12 = r13.c
            if (r12 != 0) goto L_0x00c7
            return r6
        L_0x00c7:
            kotlin.Lazy r15 = r14.c
            java.lang.Object r15 = r15.getValue()
            eu3 r15 = (defpackage.eu3) r15
            r0.a = r14
            r0.b = r12
            java.lang.String r13 = r13.o
            r0.c = r13
            r0.o = r10
            r0.x = r4
            java.lang.Object r15 = r15.b(r10, r0)
            if (r15 != r1) goto L_0x00e2
            return r1
        L_0x00e2:
            r8 = r13
            r13 = r12
            r11 = r10
            r10 = r8
        L_0x00e6:
            vk3 r15 = (defpackage.vk3) r15
            if (r15 == 0) goto L_0x00f0
            java.lang.String r15 = r15.f()
            if (r15 != 0) goto L_0x0103
        L_0x00f0:
            r0.a = r13
            r0.b = r10
            r0.c = r6
            r0.x = r3
            java.lang.Object r15 = r14.b(r11, r0)
            if (r15 != r1) goto L_0x00ff
            return r1
        L_0x00ff:
            r11 = r13
        L_0x0100:
            java.lang.String r15 = (java.lang.String) r15
            r13 = r11
        L_0x0103:
            xq9 r11 = new xq9
            java.lang.CharSequence r12 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r15)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12, r13, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er6.a(long, java.lang.Long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.dr6
            if (r0 == 0) goto L_0x0013
            r0 = r9
            dr6 r0 = (defpackage.dr6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            dr6 r0 = new dr6
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            long r7 = r0.c
            long[] r6 = r0.b
            er6 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0033 }
            r5 = r9
            r9 = r6
            r6 = r0
            r0 = r5
            goto L_0x007d
        L_0x0033:
            r9 = move-exception
            r5 = r9
            r9 = r6
            r6 = r0
            r0 = r5
            goto L_0x0085
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r9)
            long[] r9 = new long[r3]
            r2 = 0
            r9[r2] = r7
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0084 }
            kotlin.Lazy r2 = r6.b     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0084 }
            tra r2 = (defpackage.tra) r2     // Catch:{ all -> 0x0084 }
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)     // Catch:{ all -> 0x0084 }
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r4)     // Catch:{ all -> 0x0084 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0084 }
            r0.a = r6     // Catch:{ all -> 0x0084 }
            r0.b = r9     // Catch:{ all -> 0x0084 }
            r0.c = r7     // Catch:{ all -> 0x0084 }
            r0.w = r3     // Catch:{ all -> 0x0084 }
            kotlin.Lazy r2 = r2.a     // Catch:{ all -> 0x0084 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0084 }
            ocf r2 = (defpackage.ocf) r2     // Catch:{ all -> 0x0084 }
            np2 r3 = new np2     // Catch:{ all -> 0x0084 }
            long[] r4 = kotlin.collections.CollectionsKt.toLongArray(r4)     // Catch:{ all -> 0x0084 }
            r3.<init>(r4)     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r2.e(r3, r0)     // Catch:{ all -> 0x0084 }
            if (r0 != r1) goto L_0x007d
            return r1
        L_0x007d:
            jo3 r0 = (defpackage.jo3) r0     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0084 }
            goto L_0x008f
        L_0x0084:
            r0 = move-exception
        L_0x0085:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x008f:
            boolean r1 = kotlin.Result.m30isSuccessimpl(r0)
            if (r1 == 0) goto L_0x00a3
            r1 = r0
            jo3 r1 = (defpackage.jo3) r1
            kotlin.Lazy r2 = r6.d
            java.lang.Object r2 = r2.getValue()
            no3 r2 = (defpackage.no3) r2
            r2.b(r1, r9, r7)
        L_0x00a3:
            java.lang.Throwable r7 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r7 == 0) goto L_0x00ae
            java.lang.String r8 = r6.e
            r7.toString()
        L_0x00ae:
            boolean r7 = kotlin.Result.m29isFailureimpl(r0)
            if (r7 == 0) goto L_0x00b5
            r0 = 0
        L_0x00b5:
            jo3 r0 = (defpackage.jo3) r0
            if (r0 == 0) goto L_0x00cb
            java.util.List r7 = r0.d()
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            fo3 r7 = (defpackage.fo3) r7
            if (r7 == 0) goto L_0x00cb
            java.lang.String r7 = r7.a()
            if (r7 != 0) goto L_0x00cf
        L_0x00cb:
            java.lang.String r6 = r6.e
            java.lang.String r7 = ""
        L_0x00cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.er6.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
