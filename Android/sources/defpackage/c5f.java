package defpackage;

/* renamed from: c5f  reason: default package */
public final class c5f implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ h5f c;

    public /* synthetic */ c5f(ds5 ds5, h5f h5f, int i) {
        this.a = i;
        this.b = ds5;
        this.c = h5f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: bxf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: bxf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: bxf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: bxf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0065;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r14 instanceof defpackage.f5f
            if (r0 == 0) goto L_0x0018
            r0 = r14
            f5f r0 = (defpackage.f5f) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            f5f r0 = new f5f
            r0.<init>(r12, r14)
        L_0x001d:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0062
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            ds5 r12 = r0.c
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0056
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r14)
            bxf r13 = (defpackage.bxf) r13
            ds5 r14 = r12.b
            r0.c = r14
            r0.b = r4
            h5f r12 = r12.c
            java.lang.Object r12 = defpackage.h5f.b(r12, r13, r0)
            if (r12 != r1) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            r11 = r14
            r14 = r12
            r12 = r11
        L_0x0056:
            r13 = 0
            r0.c = r13
            r0.b = r3
            java.lang.Object r12 = r12.a(r14, r0)
            if (r12 != r1) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0064:
            return r1
        L_0x0065:
            boolean r0 = r14 instanceof defpackage.e5f
            if (r0 == 0) goto L_0x0078
            r0 = r14
            e5f r0 = (defpackage.e5f) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0078
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x007d
        L_0x0078:
            e5f r0 = new e5f
            r0.<init>(r12, r14)
        L_0x007d:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0097
            if (r2 != r3) goto L_0x008f
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0174
        L_0x008f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0097:
            kotlin.ResultKt.throwOnFailure(r14)
            bxf r13 = (defpackage.bxf) r13
            h5f r14 = r12.c
            r14.getClass()
            kxf r2 = r13.a
            xyf r2 = r2.c
            r2.getClass()
            xyf r4 = defpackage.xyf.PHOTO
            if (r2 != r4) goto L_0x00ae
            r4 = r3
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            java.lang.String r5 = r14.b
            yqf r14 = r14.a
            java.lang.String r6 = r13.b
            if (r4 != 0) goto L_0x0111
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x00be
            goto L_0x0111
        L_0x00be:
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0169
            axf r13 = r13.b()
            java.lang.String r2 = "resizeSticker: path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00f7 }
            defpackage.z68.c(r5, r2, r4)     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r2 = "png"
            kotlin.Lazy r4 = r14.f     // Catch:{ IOException -> 0x00f7 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00f7 }
            ln5 r4 = (defpackage.ln5) r4     // Catch:{ IOException -> 0x00f7 }
            java.io.File r2 = r4.a(r2)     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00f7 }
            boolean r14 = r14.e(r6, r4)     // Catch:{ IOException -> 0x00f7 }
            if (r14 == 0) goto L_0x00f9
            java.lang.String r14 = "resizeSticker: resized for path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00f7 }
            defpackage.z68.c(r5, r14, r4)     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x0108
        L_0x00f7:
            r14 = move-exception
            goto L_0x0103
        L_0x00f9:
            java.lang.String r14 = "resizeSticker: no resize needed for path = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x00f7 }
            defpackage.z68.c(r5, r14, r2)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x0108
        L_0x0103:
            java.lang.String r2 = "resizeSticker: failed"
            defpackage.z68.f(r5, r2, r14)
        L_0x0108:
            r13.b = r6
            bxf r14 = new bxf
            r14.<init>(r13)
        L_0x010f:
            r13 = r14
            goto L_0x0169
        L_0x0111:
            axf r13 = r13.b()
            java.lang.String r2 = "resizePhoto: path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0150 }
            defpackage.z68.c(r5, r2, r4)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r2 = "jpg"
            kotlin.Lazy r4 = r14.f     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0150 }
            ln5 r4 = (defpackage.ln5) r4     // Catch:{ IOException -> 0x0150 }
            java.io.File r2 = r4.a(r2)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r4 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0150 }
            kotlin.Lazy r14 = r14.g     // Catch:{ IOException -> 0x0150 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ IOException -> 0x0150 }
            ou8 r14 = (defpackage.ou8) r14     // Catch:{ IOException -> 0x0150 }
            wj0 r14 = (defpackage.wj0) r14     // Catch:{ IOException -> 0x0150 }
            bud r14 = r14.c     // Catch:{ IOException -> 0x0150 }
            boolean r14 = defpackage.o5a.X(r14, r6, r4)     // Catch:{ IOException -> 0x0150 }
            if (r14 == 0) goto L_0x0152
            java.lang.String r14 = "resizePhoto: resized for path = %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0150 }
            defpackage.z68.c(r5, r14, r4)     // Catch:{ IOException -> 0x0150 }
            java.lang.String r6 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0161
        L_0x0150:
            r14 = move-exception
            goto L_0x015c
        L_0x0152:
            java.lang.String r14 = "resizePhoto: no resize needed for path = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch:{ IOException -> 0x0150 }
            defpackage.z68.c(r5, r14, r2)     // Catch:{ IOException -> 0x0150 }
            goto L_0x0161
        L_0x015c:
            java.lang.String r2 = "resizePhoto: failed"
            defpackage.z68.f(r5, r2, r14)
        L_0x0161:
            r13.b = r6
            bxf r14 = new bxf
            r14.<init>(r13)
            goto L_0x010f
        L_0x0169:
            r0.b = r3
            ds5 r12 = r12.b
            java.lang.Object r12 = r12.a(r13, r0)
            if (r12 != r1) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0176:
            return r1
        L_0x0177:
            boolean r0 = r14 instanceof defpackage.b5f
            if (r0 == 0) goto L_0x018a
            r0 = r14
            b5f r0 = (defpackage.b5f) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x018a
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x018f
        L_0x018a:
            b5f r0 = new b5f
            r0.<init>(r12, r14)
        L_0x018f:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x01b4
            if (r2 == r5) goto L_0x01ad
            if (r2 != r4) goto L_0x01a5
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x027e
        L_0x01a5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x01ad:
            ds5 r12 = r0.c
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0273
        L_0x01b4:
            kotlin.ResultKt.throwOnFailure(r14)
            ds5 r14 = r12.b
            bxf r13 = (defpackage.bxf) r13
            h5f r12 = r12.c
            r0.c = r14
            r0.b = r5
            java.lang.String r2 = r12.b
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x01c8
            goto L_0x01e1
        L_0x01c8:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x01e1
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "prepareFilesForUpload of upload="
            r7.<init>(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            r5.d(r6, r2, r7, r3)
        L_0x01e1:
            java.lang.String r2 = r13.b
            if (r2 == 0) goto L_0x0208
            int r2 = r2.length()
            if (r2 != 0) goto L_0x01ec
            goto L_0x0208
        L_0x01ec:
            java.lang.String r12 = r12.b
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x01f4
            goto L_0x026e
        L_0x01f4:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x026e
            w78 r5 = defpackage.w78.o
            java.lang.String r6 = r13.b
            java.lang.String r7 = "prepareFilesForUpload: path already prepared="
            java.lang.String r6 = defpackage.a81.m(r7, r6)
            r2.d(r5, r12, r6, r3)
            goto L_0x026e
        L_0x0208:
            yqf r2 = r12.a
            kxf r5 = r13.a
            java.lang.String r5 = r5.a
            kotlin.Lazy r2 = r2.g
            java.lang.Object r2 = r2.getValue()
            ou8 r2 = (defpackage.ou8) r2
            wj0 r2 = (defpackage.wj0) r2
            sv3 r2 = r2.c(r5)
            if (r2 == 0) goto L_0x0290
            long r5 = r2.b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0281
            java.lang.String r5 = r2.e
            if (r5 == 0) goto L_0x0247
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0231
            goto L_0x0247
        L_0x0231:
            axf r12 = r13.b()
            java.lang.String r13 = r2.c
            r12.c = r13
            java.lang.String r13 = r2.e
            r12.b = r13
            long r5 = r2.b
            r12.f = r5
            bxf r13 = new bxf
            r13.<init>(r12)
            goto L_0x026e
        L_0x0247:
            java.lang.String r5 = r12.b
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x024e
            goto L_0x0269
        L_0x024e:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0269
            w78 r7 = defpackage.w78.o
            kxf r8 = r13.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "prepareFilesForUpload: need copy for upload="
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r6.d(r7, r5, r8, r3)
        L_0x0269:
            java.lang.Object r12 = r12.e(r13, r2, r0)
            r13 = r12
        L_0x026e:
            if (r13 != r1) goto L_0x0271
            goto L_0x0280
        L_0x0271:
            r12 = r14
            r14 = r13
        L_0x0273:
            r0.c = r3
            r0.b = r4
            java.lang.Object r12 = r12.a(r14, r0)
            if (r12 != r1) goto L_0x027e
            goto L_0x0280
        L_0x027e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0280:
            return r1
        L_0x0281:
            java.lang.String r12 = r12.b
            java.lang.String r13 = "ContentUriParams are created with zero length"
            defpackage.z68.f(r12, r13, r3)
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r13 = "content is zero length"
            r12.<init>(r13)
            throw r12
        L_0x0290:
            java.lang.String r12 = r12.b
            java.lang.String r13 = "ContentUriParams are null during preparing"
            defpackage.z68.f(r12, r13, r3)
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r13 = "failed to prepare upload files"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5f.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
