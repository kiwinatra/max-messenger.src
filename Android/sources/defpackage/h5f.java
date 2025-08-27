package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: h5f  reason: default package */
public final class h5f {
    public final yqf a;
    public final String b = h5f.class.getName();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final a0a h;
    public final qz9 i;

    public h5f(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, yqf yqf) {
        this.a = yqf;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
        this.h = cvg.a();
        long[] jArr = bed.a;
        this.i = new qz9(6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, axf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.h5f r4, defpackage.kxf r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.o4f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            o4f r0 = (defpackage.o4f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            o4f r0 = new o4f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kxf r5 = r0.b
            h5f r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002d }
            goto L_0x0056
        L_0x002d:
            r6 = move-exception
            goto L_0x005d
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x002d }
            kotlin.Lazy r6 = r4.f     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x002d }
            fzf r6 = (defpackage.fzf) r6     // Catch:{ all -> 0x002d }
            nh8 r6 = r6.d(r5)     // Catch:{ all -> 0x002d }
            r0.a = r4     // Catch:{ all -> 0x002d }
            r0.b = r5     // Catch:{ all -> 0x002d }
            r0.v = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = defpackage.bs0.h(r6, r0)     // Catch:{ all -> 0x002d }
            if (r6 != r1) goto L_0x0056
            goto L_0x00f8
        L_0x0056:
            bxf r6 = (defpackage.bxf) r6     // Catch:{ all -> 0x002d }
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)     // Catch:{ all -> 0x002d }
            goto L_0x0067
        L_0x005d:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m23constructorimpl(r6)
        L_0x0067:
            boolean r0 = kotlin.Result.m29isFailureimpl(r6)
            r1 = 0
            if (r0 == 0) goto L_0x006f
            r6 = r1
        L_0x006f:
            bxf r6 = (defpackage.bxf) r6
            if (r6 != 0) goto L_0x00d7
            java.lang.String r4 = r4.b
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x0087
            w78 r0 = defpackage.w78.o
            java.lang.String r2 = "No upload in repository, created new"
            r6.d(r0, r4, r2, r1)
        L_0x0087:
            axf r4 = new axf
            r4.<init>()
            wyf r6 = defpackage.wyf.UNKNOWN
            r4.g = r6
            r4.a = r5
            wyf r6 = defpackage.wyf.UPLOADING
            r4.g = r6
            java.lang.String r5 = r5.a
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00aa }
            r6.<init>(r5)     // Catch:{ all -> 0x00aa }
            long r5 = r6.length()     // Catch:{ all -> 0x00aa }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00aa }
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)     // Catch:{ all -> 0x00aa }
            goto L_0x00b5
        L_0x00aa:
            r5 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m23constructorimpl(r5)
        L_0x00b5:
            r0 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            boolean r0 = kotlin.Result.m29isFailureimpl(r5)
            if (r0 == 0) goto L_0x00c2
            r5 = r6
        L_0x00c2:
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r4.f = r5
            long r5 = java.lang.System.currentTimeMillis()
            r4.i = r5
            bxf r5 = new bxf
            r5.<init>(r4)
            r1 = r5
            goto L_0x00f8
        L_0x00d7:
            java.lang.String r4 = r4.b
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x00de
            goto L_0x00f7
        L_0x00de:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00f7
            w78 r0 = defpackage.w78.o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Found upload in repository = "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.d(r0, r4, r2, r1)
        L_0x00f7:
            r1 = r6
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.a(h5f, kxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r11v9, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v12, types: [uyf, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.h5f r9, defpackage.bxf r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.q4f
            if (r0 == 0) goto L_0x0016
            r0 = r11
            q4f r0 = (defpackage.q4f) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            q4f r0 = new q4f
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            bxf r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ef
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r10.d
            r2 = 0
            if (r11 == 0) goto L_0x006a
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0047
            goto L_0x006a
        L_0x0047:
            java.lang.String r9 = r9.b
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x004f
            goto L_0x0179
        L_0x004f:
            boolean r0 = r11.c()
            if (r0 == 0) goto L_0x0179
            w78 r0 = defpackage.w78.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "requestUploadUrl: already has upload url for="
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r11.d(r0, r9, r1, r2)
            goto L_0x0179
        L_0x006a:
            java.lang.String r11 = r9.b
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x0071
            goto L_0x008a
        L_0x0071:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x008a
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "requestUploadUrl: requesting uploadUrl for="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r11, r7, r2)
        L_0x008a:
            kotlin.Lazy r11 = r9.c
            java.lang.Object r11 = r11.getValue()
            rl r11 = (defpackage.rl) r11
            kxf r11 = r10.a
            xyf r11 = r11.c
            int r5 = r11.ordinal()
            switch(r5) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00b1;
                default: goto L_0x009d;
            }
        L_0x009d:
            one.me.sdk.transfer.domain.UploadException r9 = new one.me.sdk.transfer.domain.UploadException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "tamRequestFromUploadType, can't request url for unknown media type="
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00b1:
            jw9 r11 = new jw9
            r5 = 14
            r11.<init>(r2, r5)
            goto L_0x00da
        L_0x00b9:
            jw9 r11 = new jw9
            r11.<init>((boolean) r4)
            goto L_0x00da
        L_0x00bf:
            np2 r11 = new np2
            r11.<init>()
            goto L_0x00da
        L_0x00c5:
            jw9 r11 = new jw9
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r11.<init>((java.lang.Boolean) r2)
            goto L_0x00da
        L_0x00cd:
            jw9 r11 = new jw9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r11.<init>((java.lang.Boolean) r2)
            goto L_0x00da
        L_0x00d5:
            jw9 r11 = new jw9
            r11.<init>((boolean) r3)
        L_0x00da:
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
            long r5 = kotlin.time.DurationKt.toDuration((int) r4, (kotlin.time.DurationUnit) r2)
            r0.a = r10
            r0.o = r4
            java.lang.Object r11 = r9.i(r11, r5, r0)
            if (r11 != r1) goto L_0x00ef
            r10 = r1
            goto L_0x0179
        L_0x00ef:
            ibf r11 = (defpackage.ibf) r11
            boolean r9 = r11 instanceof defpackage.b9g
            if (r9 == 0) goto L_0x0122
            b9g r11 = (defpackage.b9g) r11
            java.util.List r9 = r11.c
            java.lang.Object r9 = r9.get(r3)
            c9g r9 = (defpackage.c9g) r9
            axf r10 = r10.b()
            java.lang.String r11 = r9.a
            r10.d = r11
            uyf r11 = new uyf
            r11.<init>()
            java.lang.String r0 = r9.c
            r11.a = r0
            long r0 = r9.b
            r11.b = r0
            vyf r9 = new vyf
            r9.<init>(r11)
            r10.h = r9
            bxf r9 = new bxf
            r9.<init>(r10)
        L_0x0120:
            r10 = r9
            goto L_0x0179
        L_0x0122:
            boolean r9 = r11 instanceof defpackage.rn5
            if (r9 == 0) goto L_0x0152
            rn5 r11 = (defpackage.rn5) r11
            java.util.List r9 = r11.c
            java.lang.Object r9 = r9.get(r3)
            sn5 r9 = (defpackage.sn5) r9
            axf r10 = r10.b()
            java.lang.String r11 = r9.c
            r10.d = r11
            uyf r11 = new uyf
            r11.<init>()
            java.lang.String r0 = r9.b
            r11.a = r0
            long r0 = r9.a
            r11.b = r0
            vyf r9 = new vyf
            r9.<init>(r11)
            r10.h = r9
            bxf r9 = new bxf
            r9.<init>(r10)
            goto L_0x0120
        L_0x0152:
            boolean r9 = r11 instanceof defpackage.jfb
            if (r9 == 0) goto L_0x0166
            axf r9 = r10.b()
            jfb r11 = (defpackage.jfb) r11
            java.lang.String r10 = r11.c
            r9.d = r10
            bxf r10 = new bxf
            r10.<init>(r9)
            goto L_0x0179
        L_0x0166:
            boolean r9 = r11 instanceof defpackage.wre
            if (r9 == 0) goto L_0x017a
            axf r9 = r10.b()
            wre r11 = (defpackage.wre) r11
            java.lang.String r10 = r11.c
            r9.d = r10
            bxf r10 = new bxf
            r10.<init>(r9)
        L_0x0179:
            return r10
        L_0x017a:
            one.me.sdk.transfer.domain.UploadException r9 = new one.me.sdk.transfer.domain.UploadException
            kxf r10 = r10.a
            xyf r10 = r10.c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "can't request url for unknown media type="
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.b(h5f, bxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b9, code lost:
        if (r7 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.h5f r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 1
            r5.getClass()
            boolean r1 = r7 instanceof defpackage.s4f
            if (r1 == 0) goto L_0x0017
            r1 = r7
            s4f r1 = (defpackage.s4f) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.c = r2
            goto L_0x001c
        L_0x0017:
            s4f r1 = new s4f
            r1.<init>(r5, r7)
        L_0x001c:
            java.lang.Object r7 = r1.a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.c
            r4 = 2
            if (r3 == 0) goto L_0x003c
            if (r3 == r0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00d4
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0086
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Lazy r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            hxd r7 = (defpackage.hxd) r7
            jxd r7 = (defpackage.jxd) r7
            int r7 = r7.h
            boolean r7 = defpackage.gcf.a(r7)
            if (r7 != 0) goto L_0x008b
            java.lang.String r6 = r5.b
            java.lang.String r7 = "shouldRetryOnException: no connection, await for connection available"
            defpackage.z68.c(r6, r7, new java.lang.Object[0])
            kotlin.Lazy r6 = r5.e
            java.lang.Object r6 = r6.getValue()
            hxd r6 = (defpackage.hxd) r6
            jxd r6 = (defpackage.jxd) r6
            om0 r6 = r6.e
            pf6 r7 = defpackage.pf6.x
            r6.getClass()
            mha r3 = new mha
            r3.<init>(r6, r7, r0)
            xga r6 = new xga
            r7 = 7
            r6.<init>(r7, r5)
            gga r5 = defpackage.m58.f
            dj6 r7 = defpackage.m58.e
            iia r4 = new iia
            r4.<init>(r3, r6, r5, r7)
            r1.c = r0
            java.lang.Object r5 = defpackage.bs0.g(r4, r1)
            if (r5 != r2) goto L_0x0086
            goto L_0x00d8
        L_0x0086:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            goto L_0x00d8
        L_0x008b:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException
            r3 = 0
            if (r7 == 0) goto L_0x0099
            java.lang.String r5 = r5.b
            java.lang.String r6 = "shouldRetryOnException: skipped retry on TamHttpUrlExpiredException"
            defpackage.z68.p(r5, r6)
        L_0x0097:
            r0 = r3
            goto L_0x00d4
        L_0x0099:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.TamHttpErrorException
            if (r7 == 0) goto L_0x00bc
            r7 = r6
            one.me.sdk.transfer.exceptions.TamHttpErrorException r7 = (one.me.sdk.transfer.exceptions.TamHttpErrorException) r7
            u47 r7 = r7.a
            boolean r7 = defpackage.b59.J(r7)
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "shouldRetryOnException: error isCritical="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            defpackage.z68.f(r5, r1, r6)
            if (r7 != 0) goto L_0x0097
            goto L_0x00d4
        L_0x00bc:
            java.lang.String r5 = r5.b
            java.lang.String r7 = "shouldRetryOnException: can retry error"
            defpackage.z68.o(r5, r7, r6)
            kotlin.time.Duration$Companion r5 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.SECONDS
            long r5 = kotlin.time.DurationKt.toDuration((int) r0, (kotlin.time.DurationUnit) r5)
            r1.c = r4
            java.lang.Object r5 = defpackage.xk4.c(r5, r1)
            if (r5 != r2) goto L_0x00d4
            goto L_0x00d8
        L_0x00d4:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
        L_0x00d8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.c(h5f, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.kxf r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.m4f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            m4f r0 = (defpackage.m4f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            m4f r0 = new m4f
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x007a
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            kxf r10 = r0.b
            h5f r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x006d
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r9.b
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0047
            goto L_0x0060
        L_0x0047:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x0060
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cancelling upload="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L_0x0060:
            r0.a = r9
            r0.b = r10
            r0.v = r5
            java.lang.Object r11 = r9.h(r10, r0)
            if (r11 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r0.a = r3
            r0.b = r3
            r0.v = r4
            java.lang.Object r9 = r9.g(r10, r0)
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.d(kxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.bxf r9, defpackage.sv3 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.n4f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            n4f r0 = (defpackage.n4f) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            n4f r0 = new n4f
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            sv3 r10 = r0.c
            bxf r9 = r0.b
            h5f r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x006d
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = r8.b
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0042
            goto L_0x0057
        L_0x0042:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0057
            w78 r5 = defpackage.w78.o
            kxf r6 = r9.a
            java.lang.String r6 = r6.a
            java.lang.String r7 = "copyFromUri: started for uri="
            java.lang.String r6 = defpackage.a81.m(r7, r6)
            r2.d(r5, r11, r6, r3)
        L_0x0057:
            sz0 r11 = new sz0
            r2 = 14
            r11.<init>((java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r2)
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.w = r4
            java.lang.Object r11 = defpackage.ryg.W(r11, r0)
            if (r11 != r1) goto L_0x006d
            return r1
        L_0x006d:
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = defpackage.wc8.i(r11)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r8 = r8.b
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x007c
            goto L_0x0091
        L_0x007c:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0091
            w78 r1 = defpackage.w78.o
            kxf r2 = r9.a
            java.lang.String r2 = r2.a
            java.lang.String r4 = "copyFromUri: finished for uri="
            java.lang.String r2 = defpackage.a81.m(r4, r2)
            r0.d(r1, r8, r2, r3)
        L_0x0091:
            axf r8 = r9.b()
            r8.b = r11
            java.lang.String r9 = r10.c
            r8.c = r9
            long r9 = r10.b
            r8.f = r9
            bxf r9 = new bxf
            r9.<init>(r8)
            return r9
        L_0x00a5:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = "failed to copy file"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.e(bxf, sv3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(bxf bxf, Continuation continuation) {
        String str = this.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "putInRepository: started for=" + bxf, (Throwable) null);
        }
        Object e2 = bs0.e(((fzf) this.f.getValue()).a(bxf), continuation);
        return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.kxf r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.p4f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            p4f r0 = (defpackage.p4f) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            p4f r0 = new p4f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            a0a r4 = r0.c
            kxf r5 = r0.b
            h5f r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r4
            r4 = r0
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r4
            r0.b = r5
            a0a r6 = r4.h
            r0.c = r6
            r0.w = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = 0
            qz9 r4 = r4.i     // Catch:{ all -> 0x005a }
            java.lang.Object r4 = r4.i(r5)     // Catch:{ all -> 0x005a }
            bs5 r4 = (defpackage.bs5) r4     // Catch:{ all -> 0x005a }
            r6.e(r0)
            return r4
        L_0x005a:
            r4 = move-exception
            r6.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.g(kxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object h(kxf kxf, Continuation continuation) {
        String str = this.b;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, str, "removeFromRepository: started for=" + kxf, (Throwable) null);
        }
        Object e2 = bs0.e(((fzf) this.f.getValue()).c(kxf), continuation);
        return e2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e2 : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.fbf r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r17 = this;
            r0 = r21
            r1 = 1
            boolean r2 = r0 instanceof defpackage.r4f
            if (r2 == 0) goto L_0x0018
            r2 = r0
            r4f r2 = (defpackage.r4f) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.x = r3
            r3 = r17
            goto L_0x001f
        L_0x0018:
            r4f r2 = new r4f
            r3 = r17
            r2.<init>(r3, r0)
        L_0x001f:
            java.lang.Object r0 = r2.v
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.x
            r6 = 3
            r7 = 2
            if (r5 == 0) goto L_0x0061
            if (r5 == r1) goto L_0x0053
            if (r5 == r7) goto L_0x0046
            if (r5 != r6) goto L_0x003e
            long r8 = r2.o
            ibf r3 = r2.c
            fbf r5 = r2.b
            h5f r10 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x010f
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            long r8 = r2.o
            ibf r3 = r2.c
            fbf r5 = r2.b
            h5f r10 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0111
        L_0x0053:
            long r8 = r2.o
            ibf r3 = r2.c
            fbf r5 = r2.b
            h5f r10 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x005f }
            goto L_0x008e
        L_0x005f:
            r0 = move-exception
            goto L_0x00a2
        L_0x0061:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = 0
            r8 = r19
            r10 = r0
            r5 = r2
            r2 = r18
        L_0x006b:
            kotlin.Lazy r0 = r3.c     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00a0 }
            rl r0 = (defpackage.rl) r0     // Catch:{ all -> 0x00a0 }
            r5.a = r3     // Catch:{ all -> 0x00a0 }
            r5.b = r2     // Catch:{ all -> 0x00a0 }
            r5.c = r10     // Catch:{ all -> 0x00a0 }
            r5.o = r8     // Catch:{ all -> 0x00a0 }
            r5.x = r1     // Catch:{ all -> 0x00a0 }
            jna r0 = (defpackage.jna) r0     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = r0.T(r2, r5)     // Catch:{ all -> 0x00a0 }
            if (r0 != r4) goto L_0x0086
            return r4
        L_0x0086:
            r15 = r5
            r5 = r2
            r2 = r15
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x008e:
            ibf r0 = (defpackage.ibf) r0     // Catch:{ all -> 0x005f }
            r3 = r10
            r10 = r0
            r15 = r5
            r5 = r2
            r2 = r15
            goto L_0x0119
        L_0x0097:
            r15 = r5
            r5 = r2
            r2 = r15
            r16 = r10
            r10 = r3
            r3 = r16
            goto L_0x00a2
        L_0x00a0:
            r0 = move-exception
            goto L_0x0097
        L_0x00a2:
            boolean r11 = defpackage.gcf.d(r0)
            if (r11 == 0) goto L_0x00f8
            kotlin.Lazy r11 = r10.e
            java.lang.Object r11 = r11.getValue()
            hxd r11 = (defpackage.hxd) r11
            jxd r11 = (defpackage.jxd) r11
            int r11 = r11.h
            boolean r11 = defpackage.gcf.a(r11)
            if (r11 != 0) goto L_0x00f8
            java.lang.String r0 = r10.b
            java.lang.String r11 = "retry api request: no connection, await for connection available"
            defpackage.z68.c(r0, r11, new java.lang.Object[0])
            kotlin.Lazy r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            hxd r0 = (defpackage.hxd) r0
            jxd r0 = (defpackage.jxd) r0
            om0 r0 = r0.e
            bk3 r11 = defpackage.bk3.x
            r0.getClass()
            mha r12 = new mha
            r12.<init>(r0, r11, r1)
            ykb r0 = new ykb
            r11 = 8
            r0.<init>(r11, r10)
            gga r11 = defpackage.m58.f
            dj6 r13 = defpackage.m58.e
            iia r14 = new iia
            r14.<init>(r12, r0, r11, r13)
            r2.a = r10
            r2.b = r5
            r2.c = r3
            r2.o = r8
            r2.x = r7
            java.lang.Object r0 = defpackage.bs0.g(r14, r2)
            if (r0 != r4) goto L_0x0111
            return r4
        L_0x00f8:
            boolean r11 = defpackage.gcf.c(r0)
            if (r11 == 0) goto L_0x0134
            r2.a = r10
            r2.b = r5
            r2.c = r3
            r2.o = r8
            r2.x = r6
            java.lang.Object r0 = defpackage.xk4.c(r8, r2)
            if (r0 != r4) goto L_0x010f
            return r4
        L_0x010f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0111:
            r15 = r5
            r5 = r2
            r2 = r15
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x0119:
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            boolean r0 = defpackage.kv0.I(r0)
            if (r0 == 0) goto L_0x0125
            if (r10 == 0) goto L_0x006b
        L_0x0125:
            if (r10 == 0) goto L_0x0128
            return r10
        L_0x0128:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0134:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5f.i(fbf, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
