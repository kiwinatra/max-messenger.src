package defpackage;

/* renamed from: gn5  reason: default package */
public final class gn5 implements Runnable {
    public final /* synthetic */ hn5 a;

    public gn5(hn5 hn5) {
        this.a = hn5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085 A[SYNTHETIC, Splitter:B:33:0x0085] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = 1
            r1 = r30
            hn5 r1 = r1.a
            r1.getClass()
            java.util.concurrent.atomic.AtomicReference r2 = r1.d
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            aed r2 = (defpackage.aed) r2
            if (r2 != 0) goto L_0x0014
            return
        L_0x0014:
            ez r4 = r1.a
            java.io.File r5 = r4.c
            java.io.File r5 = r5.getParentFile()
            if (r5 == 0) goto L_0x0028
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x0025
            goto L_0x0073
        L_0x0025:
            r5.mkdirs()     // Catch:{ SecurityException -> 0x0028 }
        L_0x0028:
            wie r1 = r1.b
            java.io.File r6 = r4.c
            if (r5 == 0) goto L_0x0034
            boolean r7 = r5.exists()
            if (r7 != 0) goto L_0x005e
        L_0x0034:
            r7 = 0
            r9 = -1
        L_0x0037:
            if (r5 == 0) goto L_0x003f
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x005e
        L_0x003f:
            long[] r5 = defpackage.hn5.h
            int r9 = r9 + r0
            r10 = 4
            int r10 = java.lang.Math.min(r9, r10)
            r10 = r5[r10]
            android.os.SystemClock.sleep(r10)
            java.io.File r5 = r6.getParentFile()
            long r7 = r7 + r10
            r10 = 200(0xc8, double:9.9E-322)
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0037
            if (r1 == 0) goto L_0x005e
            java.lang.String r5 = "checkFilesDirAvailable: waiting max time! break"
            r1.g0(r5)
        L_0x005e:
            java.io.File r5 = r6.getParentFile()
            if (r5 == 0) goto L_0x0205
            boolean r6 = r5.exists()
            if (r6 != 0) goto L_0x006c
            goto L_0x0205
        L_0x006c:
            if (r1 == 0) goto L_0x0073
            java.lang.String r5 = "checkFilesDirAvailable: dir is created!"
            r1.g0(r5)
        L_0x0073:
            java.io.FileOutputStream r1 = r4.f()     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0085
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0082 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0082 }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0204
        L_0x0082:
            r0 = move-exception
            goto L_0x01fb
        L_0x0085:
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch:{ all -> 0x01ea }
            r11.<init>(r1)     // Catch:{ all -> 0x01ea }
            xe8 r12 = new xe8     // Catch:{ all -> 0x00f0 }
            r5 = 20
            r12.<init>((int) r5)     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r13 = r2.b     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r14 = r2.c     // Catch:{ all -> 0x00f0 }
            long[] r2 = r2.a     // Catch:{ all -> 0x00f0 }
            int r5 = r2.length     // Catch:{ all -> 0x00f0 }
            r15 = 2
            int r10 = r5 + -2
            if (r10 < 0) goto L_0x01d2
            r9 = 0
            r8 = r9
        L_0x009f:
            r5 = r2[r8]     // Catch:{ all -> 0x00f0 }
            r16 = r4
            long r3 = ~r5     // Catch:{ all -> 0x00f0 }
            r7 = 7
            long r3 = r3 << r7
            long r3 = r3 & r5
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r17
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01c1
            int r3 = r8 - r10
            int r3 = ~r3     // Catch:{ all -> 0x00f0 }
            int r3 = r3 >>> 31
            r4 = 8
            int r3 = 8 - r3
            r17 = r5
            r7 = r9
        L_0x00be:
            if (r7 >= r3) goto L_0x01b9
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r17 & r5
            r19 = 128(0x80, double:6.32E-322)
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a6
            int r5 = r8 << 3
            int r5 = r5 + r7
            r6 = r13[r5]     // Catch:{ all -> 0x00f0 }
            r5 = r14[r5]     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00f0 }
            if (r6 == 0) goto L_0x01a6
            if (r5 != 0) goto L_0x00d9
        L_0x00d7:
            goto L_0x01a6
        L_0x00d9:
            boolean r4 = r5 instanceof java.lang.Boolean     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x00f4
            bk3 r4 = defpackage.guf.b     // Catch:{ all -> 0x00f0 }
            r11.writeUTF(r6)     // Catch:{ all -> 0x00f0 }
            r4 = 5
            r11.writeByte(r4)     // Catch:{ all -> 0x00f0 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00f0 }
            boolean r4 = r5.booleanValue()     // Catch:{ all -> 0x00f0 }
            r11.writeBoolean(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00d7
        L_0x00f0:
            r0 = move-exception
            r2 = r0
            goto L_0x01ed
        L_0x00f4:
            boolean r4 = r5 instanceof java.lang.Float     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x010a
            bk3 r4 = defpackage.guf.b     // Catch:{ all -> 0x00f0 }
            r11.writeUTF(r6)     // Catch:{ all -> 0x00f0 }
            r11.writeByte(r0)     // Catch:{ all -> 0x00f0 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00f0 }
            float r4 = r5.floatValue()     // Catch:{ all -> 0x00f0 }
            r11.writeFloat(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00d7
        L_0x010a:
            boolean r4 = r5 instanceof java.lang.Integer     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x0120
            bk3 r4 = defpackage.guf.b     // Catch:{ all -> 0x00f0 }
            r11.writeUTF(r6)     // Catch:{ all -> 0x00f0 }
            r11.writeByte(r9)     // Catch:{ all -> 0x00f0 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00f0 }
            int r4 = r5.intValue()     // Catch:{ all -> 0x00f0 }
            r11.writeInt(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00d7
        L_0x0120:
            boolean r4 = r5 instanceof java.lang.Long     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x0136
            bk3 r4 = defpackage.guf.b     // Catch:{ all -> 0x00f0 }
            r11.writeUTF(r6)     // Catch:{ all -> 0x00f0 }
            r11.writeByte(r15)     // Catch:{ all -> 0x00f0 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x00f0 }
            long r4 = r5.longValue()     // Catch:{ all -> 0x00f0 }
            r11.writeLong(r4)     // Catch:{ all -> 0x00f0 }
            goto L_0x00d7
        L_0x0136:
            boolean r4 = r5 instanceof java.lang.String     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x0153
            guf r4 = defpackage.guf.STRING     // Catch:{ all -> 0x00f0 }
            guf r20 = defpackage.guf.BIG_STRING     // Catch:{ all -> 0x00f0 }
            r21 = r5
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ all -> 0x00f0 }
            r5 = r11
            r22 = r7
            r7 = r4
            r4 = r8
            r8 = r20
            r20 = r9
            r9 = r21
            r15 = r10
            r10 = r12
            defpackage.h88.e0(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f0 }
            goto L_0x01a3
        L_0x0153:
            r22 = r7
            r4 = r8
            r20 = r9
            r15 = r10
            boolean r7 = r5 instanceof java.util.Set     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x01a3
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x00f0 }
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)     // Catch:{ all -> 0x00f0 }
            boolean r7 = r7 instanceof java.lang.String     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x017e
            r23 = r5
            java.util.Set r23 = (java.util.Set) r23     // Catch:{ all -> 0x00f0 }
            java.lang.String r24 = ","
            r27 = 0
            r28 = 0
            r29 = 62
            r25 = 0
            r26 = 0
            java.lang.String r5 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r23, r24, r25, r26, 0, r27, r28, r29, (java.lang.Object) null)     // Catch:{ all -> 0x00f0 }
        L_0x017c:
            r9 = r5
            goto L_0x019a
        L_0x017e:
            r23 = r5
            java.lang.Iterable r23 = (java.lang.Iterable) r23     // Catch:{ all -> 0x00f0 }
            java.lang.String r24 = ","
            oo9 r5 = new oo9     // Catch:{ all -> 0x00f0 }
            r7 = 29
            r5.<init>(r7)     // Catch:{ all -> 0x00f0 }
            r27 = 0
            r29 = 30
            r25 = 0
            r26 = 0
            r28 = r5
            java.lang.String r5 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r23, r24, r25, r26, 0, r27, r28, r29, (java.lang.Object) null)     // Catch:{ all -> 0x00f0 }
            goto L_0x017c
        L_0x019a:
            guf r7 = defpackage.guf.STRINGS_SET     // Catch:{ all -> 0x00f0 }
            guf r8 = defpackage.guf.BIG_STRINGS_SET     // Catch:{ all -> 0x00f0 }
            r5 = r11
            r10 = r12
            defpackage.h88.e0(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00f0 }
        L_0x01a3:
            r5 = 8
            goto L_0x01ad
        L_0x01a6:
            r22 = r7
            r4 = r8
            r20 = r9
            r15 = r10
            goto L_0x01a3
        L_0x01ad:
            long r17 = r17 >> r5
            int r7 = r22 + 1
            r8 = r4
            r4 = r5
            r10 = r15
            r9 = r20
            r15 = 2
            goto L_0x00be
        L_0x01b9:
            r5 = r4
            r4 = r8
            r20 = r9
            r15 = r10
            if (r3 != r5) goto L_0x01d4
            goto L_0x01c5
        L_0x01c1:
            r4 = r8
            r20 = r9
            r15 = r10
        L_0x01c5:
            if (r4 == r15) goto L_0x01d4
            int r8 = r4 + 1
            r10 = r15
            r4 = r16
            r9 = r20
            r3 = 0
            r15 = 2
            goto L_0x009f
        L_0x01d2:
            r16 = r4
        L_0x01d4:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f0 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r11, r3)     // Catch:{ all -> 0x01ea }
            r4 = r16
            r4.b(r1)     // Catch:{ all -> 0x01ea }
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01ea }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01ea }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x01ea }
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ all -> 0x0082 }
            goto L_0x0204
        L_0x01ea:
            r0 = move-exception
            r2 = r0
            goto L_0x01f4
        L_0x01ed:
            throw r2     // Catch:{ all -> 0x01ee }
        L_0x01ee:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r11, r2)     // Catch:{ all -> 0x01ea }
            throw r3     // Catch:{ all -> 0x01ea }
        L_0x01f4:
            throw r2     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)     // Catch:{ all -> 0x0082 }
            throw r3     // Catch:{ all -> 0x0082 }
        L_0x01fb:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
        L_0x0204:
            return
        L_0x0205:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkFilesDirAvailable: filesDir returns "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r2 = " which is not an existing directory. See https://issuetracker.google.com/issues/36918154"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r1 == 0) goto L_0x0228
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            java.lang.Object r1 = r1.b
            y2 r1 = (defpackage.y2) r1
            java.lang.String r1 = r1.e
            defpackage.z68.f(r1, r0, r2)
        L_0x0228:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn5.run():void");
    }
}
