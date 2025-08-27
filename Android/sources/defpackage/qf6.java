package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: qf6  reason: default package */
public final class qf6 implements e97 {
    public static final Lazy c = LazyKt.lazy(new a46(11));
    public static final Lazy d = LazyKt.lazy(new a46(12));
    public final Lazy a;
    public final Lazy b;

    public qf6(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r6 = r6.getGroupValues();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(kotlin.text.Regex r5, java.lang.String r6) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            kotlin.text.MatchResult r6 = kotlin.text.Regex.find$default(r5, r6, r0, r1, r2)
            if (r6 == 0) goto L_0x0017
            java.util.List r6 = r6.getGroupValues()
            if (r6 == 0) goto L_0x0017
            r0 = 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0018
        L_0x0017:
            r6 = r2
        L_0x0018:
            if (r6 == 0) goto L_0x0023
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0024
        L_0x0023:
            r6 = r2
        L_0x0024:
            if (r6 == 0) goto L_0x002b
            int r5 = r6.intValue()
            return r5
        L_0x002b:
            java.lang.Class<qf6> r6 = defpackage.qf6.class
            java.lang.String r6 = r6.getName()
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0036
            goto L_0x004f
        L_0x0036:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x004f
            w78 r1 = defpackage.w78.w
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't determine SVG size by regex "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.d(r1, r6, r5, r2)
        L_0x004f:
            r5 = 100
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf6.b(kotlin.text.Regex, java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.v33 a(defpackage.j55 r12, int r13, defpackage.tac r14, defpackage.c97 r15) {
        /*
            r11 = this;
            kotlin.Lazy r0 = r11.a
            java.lang.Object r0 = r0.getValue()
            oqb r0 = (defpackage.oqb) r0
            zq5 r0 = r0.b()
            jd4 r0 = r0.a(r13)
            java.lang.Object r1 = r0.e0()     // Catch:{ all -> 0x00a1 }
            r2 = r1
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x00a1 }
            kotlin.collections.ArraysKt___ArraysJvmKt.fill$default((byte[]) r2, (byte) 0, 0, 0, 6, (java.lang.Object) null)     // Catch:{ all -> 0x00a1 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x00a1 }
            y33 r12 = r12.a     // Catch:{ all -> 0x00a1 }
            y33 r12 = defpackage.y33.o(r12)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r12 = r12.e0()     // Catch:{ all -> 0x00a1 }
            e69 r12 = (defpackage.e69) r12     // Catch:{ all -> 0x00a1 }
            r2 = 0
            r12.U(r2, r2, r13, r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x00a1 }
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8     // Catch:{ all -> 0x00a1 }
            r12.<init>(r1, r2, r13, r3)     // Catch:{ all -> 0x00a1 }
            r13 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r13)
            kotlin.Lazy r0 = c
            java.lang.Object r0 = r0.getValue()
            kotlin.text.Regex r0 = (kotlin.text.Regex) r0
            int r9 = b(r0, r12)
            kotlin.Lazy r0 = d
            java.lang.Object r0 = r0.getValue()
            kotlin.text.Regex r0 = (kotlin.text.Regex) r0
            int r10 = b(r0, r12)
            kotlin.Lazy r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            ynb r11 = (defpackage.ynb) r11
            android.graphics.Bitmap$Config r15 = r15.a
            y33 r11 = r11.c(r9, r10, r15)
            java.lang.Object r15 = r11.e0()     // Catch:{ all -> 0x0091 }
            r3 = r15
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x0091 }
            r3.eraseColor(r2)     // Catch:{ all -> 0x0091 }
            kotlin.Result$Companion r15 = kotlin.Result.Companion     // Catch:{ all -> 0x0072 }
            int[] r12 = one.me.sdk.uikit.qr.QrCodeGenerator.nativeRenderSvg(r12, r9, r10)     // Catch:{ all -> 0x0072 }
            java.lang.Object r12 = kotlin.Result.m23constructorimpl(r12)     // Catch:{ all -> 0x0072 }
            goto L_0x007d
        L_0x0072:
            r12 = move-exception
            kotlin.Result$Companion r15 = kotlin.Result.Companion     // Catch:{ all -> 0x0091 }
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)     // Catch:{ all -> 0x0091 }
            java.lang.Object r12 = kotlin.Result.m23constructorimpl(r12)     // Catch:{ all -> 0x0091 }
        L_0x007d:
            boolean r15 = kotlin.Result.m29isFailureimpl(r12)     // Catch:{ all -> 0x0091 }
            if (r15 == 0) goto L_0x0084
            r12 = r13
        L_0x0084:
            r4 = r12
            int[] r4 = (int[]) r4     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r8 = 0
            r5 = 0
            r7 = 0
            r6 = r9
            r3.setPixels(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0091 }
            goto L_0x0093
        L_0x0091:
            r12 = move-exception
            goto L_0x009b
        L_0x0093:
            com.facebook.imagepipeline.image.CloseableStaticBitmap r12 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r11, r14, r2)     // Catch:{ all -> 0x0091 }
            kotlin.io.CloseableKt.closeFinally(r11, r13)
            return r12
        L_0x009b:
            throw r12     // Catch:{ all -> 0x009c }
        L_0x009c:
            r13 = move-exception
            kotlin.io.CloseableKt.closeFinally(r11, r12)
            throw r13
        L_0x00a1:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf6.a(j55, int, tac, c97):v33");
    }
}
