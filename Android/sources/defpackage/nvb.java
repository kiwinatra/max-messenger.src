package defpackage;

/* renamed from: nvb  reason: default package */
public final /* synthetic */ class nvb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pvb b;
    public final /* synthetic */ vb0 c;

    public /* synthetic */ nvb(pvb pvb, vb0 vb0, int i) {
        this.a = i;
        this.b = pvb;
        this.c = vb0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0173 A[SYNTHETIC, Splitter:B:65:0x0173] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0064;
                default: goto L_0x0007;
            }
        L_0x0007:
            pvb r1 = r0.b
            r1.getClass()
            vb0 r0 = r0.c
            qvb r2 = r0.a
            r2.getClass()     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            ha7 r0 = r1.b(r0)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            ew6 r1 = defpackage.ryg.G()     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            sx8 r3 = new sx8     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            r4 = 29
            r3.<init>(r4, r2, r0)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            r1.execute(r3)     // Catch:{ ImageCaptureException -> 0x002a, OutOfMemoryError -> 0x0028, RuntimeException -> 0x0026 }
            goto L_0x0063
        L_0x0026:
            r0 = move-exception
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            goto L_0x0041
        L_0x002a:
            r0 = move-exception
            goto L_0x0056
        L_0x002c:
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed."
            r1.<init>(r3, r0)
            ew6 r0 = defpackage.ryg.G()
            ovb r3 = new ovb
            r4 = 1
            r3.<init>(r4, r2, r1)
            r0.execute(r3)
            goto L_0x0063
        L_0x0041:
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed due to low memory."
            r1.<init>(r3, r0)
            ew6 r0 = defpackage.ryg.G()
            ovb r3 = new ovb
            r4 = 1
            r3.<init>(r4, r2, r1)
            r0.execute(r3)
            goto L_0x0063
        L_0x0056:
            ew6 r1 = defpackage.ryg.G()
            ovb r3 = new ovb
            r4 = 1
            r3.<init>(r4, r2, r0)
            r1.execute(r3)
        L_0x0063:
            return
        L_0x0064:
            pvb r1 = r0.b
            ub0 r2 = r1.b
            int r2 = r2.d
            r3 = 1
            r4 = 0
            r5 = 256(0x100, float:3.59E-43)
            r6 = 35
            if (r2 == r6) goto L_0x0077
            if (r2 != r5) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r7 = r4
            goto L_0x0078
        L_0x0077:
            r7 = r3
        L_0x0078:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Postview only support YUV and JPEG output formats. Output format: "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            defpackage.bs0.m(r2, r7)
            vb0 r2 = r0.c
            qvb r0 = r2.a
            sq6 r7 = r1.c     // Catch:{ Exception -> 0x0177 }
            java.lang.Object r7 = r7.o(r2)     // Catch:{ Exception -> 0x0177 }
            qb0 r7 = (defpackage.qb0) r7     // Catch:{ Exception -> 0x0177 }
            int r8 = r7.c     // Catch:{ Exception -> 0x0177 }
            sx6 r1 = r1.i     // Catch:{ Exception -> 0x0177 }
            r1.getClass()     // Catch:{ Exception -> 0x0177 }
            java.lang.String r1 = "Can't convert "
            java.lang.String r9 = "Invalid postview image format : "
            r10 = 0
            java.lang.Object r11 = r7.a     // Catch:{ Exception -> 0x0177 }
            int r7 = r7.f     // Catch:{ Exception -> 0x0177 }
            if (r8 != r6) goto L_0x0108
            ha7 r11 = (defpackage.ha7) r11     // Catch:{ UnsupportedOperationException -> 0x00ba }
            int r5 = r7 % 180
            if (r5 == 0) goto L_0x00af
            r5 = r3
            goto L_0x00b0
        L_0x00af:
            r5 = r4
        L_0x00b0:
            if (r5 == 0) goto L_0x00bd
            int r9 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            goto L_0x00c1
        L_0x00b7:
            r0 = move-exception
            goto L_0x0171
        L_0x00ba:
            r0 = move-exception
            goto L_0x0153
        L_0x00bd:
            int r9 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00ba }
        L_0x00c1:
            if (r5 == 0) goto L_0x00c8
            int r5 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            goto L_0x00cc
        L_0x00c8:
            int r5 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00ba }
        L_0x00cc:
            obd r12 = new obd     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r13 = 2
            he r3 = defpackage.b59.n(r9, r5, r3, r13)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r12.<init>(r3)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            int r3 = r11.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            int r5 = r11.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            int r3 = r3 * r5
            int r3 = r3 * 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            l87 r3 = androidx.camera.core.ImageProcessingUtil.c(r11, r12, r3, r7, r4)     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            r11.close()     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            if (r3 == 0) goto L_0x0100
            android.graphics.Bitmap r4 = defpackage.ld9.p(r3)     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            r3.close()     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            r10 = r12
            goto L_0x012e
        L_0x00f7:
            r10 = r12
            goto L_0x0171
        L_0x00fa:
            r10 = r12
            goto L_0x0153
        L_0x00fc:
            r0 = move-exception
            goto L_0x00f7
        L_0x00fe:
            r0 = move-exception
            goto L_0x00fa
        L_0x0100:
            androidx.camera.core.ImageCaptureException r0 = new androidx.camera.core.ImageCaptureException     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            java.lang.String r3 = "Can't covert YUV to RGB"
            r0.<init>(r3, r10)     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x00fe, all -> 0x00fc }
        L_0x0108:
            if (r8 != r5) goto L_0x0141
            ha7 r11 = (defpackage.ha7) r11     // Catch:{ UnsupportedOperationException -> 0x00ba }
            android.graphics.Bitmap r12 = defpackage.ld9.p(r11)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r11.close()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            float r4 = (float) r7     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r3.postRotate(r4)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            int r15 = r12.getWidth()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            int r16 = r12.getHeight()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r13 = 0
            r14 = 0
            r18 = 1
            r17 = r3
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ UnsupportedOperationException -> 0x00ba }
        L_0x012e:
            if (r10 == 0) goto L_0x0133
            r10.close()     // Catch:{ Exception -> 0x0177 }
        L_0x0133:
            ew6 r1 = defpackage.ryg.G()     // Catch:{ Exception -> 0x0177 }
            ovb r3 = new ovb     // Catch:{ Exception -> 0x0177 }
            r5 = 0
            r3.<init>(r5, r0, r4)     // Catch:{ Exception -> 0x0177 }
            r1.execute(r3)     // Catch:{ Exception -> 0x0177 }
            goto L_0x017c
        L_0x0141:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ UnsupportedOperationException -> 0x00ba }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r3.<init>(r9)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r3.append(r8)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            java.lang.String r3 = r3.toString()     // Catch:{ UnsupportedOperationException -> 0x00ba }
            r0.<init>(r3)     // Catch:{ UnsupportedOperationException -> 0x00ba }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x00ba }
        L_0x0153:
            if (r8 != r6) goto L_0x0158
            java.lang.String r3 = "YUV"
            goto L_0x015a
        L_0x0158:
            java.lang.String r3 = "JPEG"
        L_0x015a:
            androidx.camera.core.ImageCaptureException r4 = new androidx.camera.core.ImageCaptureException     // Catch:{ all -> 0x00b7 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r5.<init>(r1)     // Catch:{ all -> 0x00b7 }
            r5.append(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = " to bitmap"
            r5.append(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00b7 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x00b7 }
            throw r4     // Catch:{ all -> 0x00b7 }
        L_0x0171:
            if (r10 == 0) goto L_0x0176
            r10.close()     // Catch:{ Exception -> 0x0177 }
        L_0x0176:
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x0177:
            ha7 r0 = r2.b
            r0.close()
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvb.run():void");
    }
}
