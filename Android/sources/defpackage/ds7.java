package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ds7  reason: default package */
public final class ds7 {
    public final m95 a;
    public final String b = ds7.class.getName();
    public final Lazy c;
    public final z3a d;
    public final ThreadLocal e;

    public ds7(gaf gaf, m95 m95) {
        this.a = m95;
        this.c = LazyKt.lazy(new tx2(gaf, 1));
        this.d = new z3a(9, m95);
        this.e = ThreadLocal.withInitial(new vk(1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.text.BoringLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.text.StaticLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.text.StaticLayout} */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r15.charAt(0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout a(java.lang.CharSequence r15, android.text.TextPaint r16, int r17, int r18, boolean r19, android.text.TextUtils.TruncateAt r20) {
        /*
            r14 = this;
            r10 = r14
            r0 = r15
            r9 = r16
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r2 = r15.length()
            if (r2 != 0) goto L_0x000e
            goto L_0x001e
        L_0x000e:
            char r2 = r15.charAt(r1)
            r3 = 1424(0x590, float:1.995E-42)
            if (r3 > r2) goto L_0x001e
            r3 = 1792(0x700, float:2.511E-42)
            if (r2 >= r3) goto L_0x001e
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x001c:
            r11 = r2
            goto L_0x0021
        L_0x001e:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x001c
        L_0x0021:
            int r2 = r15.length()
            float r1 = r9.measureText(r15, r1, r2)
            int r12 = kotlin.math.MathKt.roundToInt((float) r1)
            java.lang.ThreadLocal r1 = r10.e
            java.lang.Object r2 = r1.get()
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            android.text.BoringLayout$Metrics r2 = android.text.BoringLayout.isBoring(r15, r9, r2)
            if (r2 == 0) goto L_0x0082
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x0076
            android.text.BoringLayout$Metrics r2 = (android.text.BoringLayout.Metrics) r2
            int r2 = r2.width
            r13 = r17
            if (r2 > r13) goto L_0x0084
            java.lang.Object r1 = r1.get()
            r7 = r1
            android.text.BoringLayout$Metrics r7 = (android.text.BoringLayout.Metrics) r7
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r8 = 0
            r1 = r15
            r2 = r16
            r3 = r12
            r4 = r11
            android.text.BoringLayout r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8)
            int r2 = r1.getHeight()
            if (r2 != 0) goto L_0x0096
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0096
        L_0x0076:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0082:
            r13 = r17
        L_0x0084:
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r12
            r5 = r17
            r6 = r11
            r7 = r19
            r8 = r20
            r9 = r18
            android.text.StaticLayout r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0096:
            kotlin.Lazy r0 = r10.c     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00ae }
            at6 r0 = (defpackage.at6) r0     // Catch:{ all -> 0x00ae }
            r0.getClass()     // Catch:{ all -> 0x00ae }
            zs6 r2 = new zs6     // Catch:{ all -> 0x00ae }
            r3 = 0
            r2.<init>(r1, r0, r3)     // Catch:{ all -> 0x00ae }
            d14 r0 = r0.a     // Catch:{ all -> 0x00ae }
            r4 = 3
            defpackage.ev0.v(r0, r3, r3, r2, r4)     // Catch:{ all -> 0x00ae }
            goto L_0x00b6
        L_0x00ae:
            r0 = move-exception
            java.lang.String r2 = r10.b
            java.lang.String r3 = "could not warm layout"
            defpackage.z68.o(r2, r3, r0)
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds7.a(java.lang.CharSequence, android.text.TextPaint, int, int, boolean, android.text.TextUtils$TruncateAt):android.text.Layout");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0176 A[SYNTHETIC, Splitter:B:64:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.StaticLayout c(java.lang.CharSequence r18, android.text.TextPaint r19, int r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            r17 = this;
            r1 = r17
            r10 = r21
            java.lang.String r11 = r1.b
            r12 = 0
            float r0 = android.text.Layout.getDesiredWidth(r18, r19)     // Catch:{ all -> 0x0012 }
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)     // Catch:{ all -> 0x0012 }
            r2 = r20
            goto L_0x0024
        L_0x0012:
            r0 = move-exception
            java.lang.String r2 = "fail to getDesiredWidth for message %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r18}
            defpackage.z68.h(r11, r0, r2, r3)
            m95 r2 = r1.a
            ((defpackage.uta) r2).c(r0, false)
            r2 = r20
            r0 = r12
        L_0x0024:
            int r0 = java.lang.Math.max(r0, r2)
            int r13 = kotlin.ranges.RangesKt.coerceAtMost((int) r0, (int) r10)
            z3a r2 = r1.d     // Catch:{ all -> 0x0041 }
            r3 = r18
            r4 = r19
            r5 = r13
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.j(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            r2 = r0
            goto L_0x005d
        L_0x0041:
            r0 = move-exception
            java.lang.String r2 = "static layout create error"
            defpackage.z68.f(r11, r2, r0)
            z3a r2 = r1.d
            java.lang.String r3 = r18.toString()
            r4 = r19
            r5 = r13
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x003f
        L_0x005d:
            int r0 = r2.getLineCount()
            r14 = 1
            if (r0 <= r14) goto L_0x01b1
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0099 }
            int r0 = r2.getLineCount()     // Catch:{ all -> 0x0099 }
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r12, (int) r0)     // Catch:{ all -> 0x0099 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0099 }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x00a8
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3     // Catch:{ all -> 0x0099 }
            int r3 = r3.nextInt()     // Catch:{ all -> 0x0099 }
            float r3 = r2.getLineMax(r3)     // Catch:{ all -> 0x0099 }
        L_0x0083:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x009b
            r4 = r0
            kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4     // Catch:{ all -> 0x0099 }
            int r4 = r4.nextInt()     // Catch:{ all -> 0x0099 }
            float r4 = r2.getLineMax(r4)     // Catch:{ all -> 0x0099 }
            float r3 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x0099 }
            goto L_0x0083
        L_0x0099:
            r0 = move-exception
            goto L_0x00ae
        L_0x009b:
            int r0 = kotlin.math.MathKt.roundToInt((float) r3)     // Catch:{ all -> 0x0099 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0099 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0099 }
            goto L_0x00b8
        L_0x00a8:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0099 }
            r0.<init>()     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x00ae:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x00b8:
            boolean r3 = kotlin.Result.m29isFailureimpl(r0)
            r15 = 0
            if (r3 == 0) goto L_0x00c0
            r0 = r15
        L_0x00c0:
            r16 = r0
            java.lang.Integer r16 = (java.lang.Integer) r16
            if (r16 == 0) goto L_0x0164
            int r0 = r16.intValue()
            if (r0 >= r13) goto L_0x0167
            z3a r2 = r1.d     // Catch:{ all -> 0x00e2 }
            r3 = r18
            r4 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.j(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e2 }
        L_0x00e0:
            r2 = r0
            goto L_0x00ff
        L_0x00e2:
            r0 = move-exception
            java.lang.String r2 = "static layout create error 2"
            defpackage.z68.f(r11, r2, r0)
            z3a r2 = r1.d
            java.lang.String r3 = r18.toString()
            r4 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            android.text.StaticLayout r0 = r2.j(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00e0
        L_0x00ff:
            int r0 = r2.getLineCount()
            if (r0 != r14) goto L_0x0164
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x013a }
            int r0 = r2.getLineCount()     // Catch:{ all -> 0x013a }
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r12, (int) r0)     // Catch:{ all -> 0x013a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x013a }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x013a }
            if (r3 == 0) goto L_0x0149
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3     // Catch:{ all -> 0x013a }
            int r3 = r3.nextInt()     // Catch:{ all -> 0x013a }
            float r3 = r2.getLineMax(r3)     // Catch:{ all -> 0x013a }
        L_0x0124:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x013a }
            if (r4 == 0) goto L_0x013c
            r4 = r0
            kotlin.collections.IntIterator r4 = (kotlin.collections.IntIterator) r4     // Catch:{ all -> 0x013a }
            int r4 = r4.nextInt()     // Catch:{ all -> 0x013a }
            float r4 = r2.getLineMax(r4)     // Catch:{ all -> 0x013a }
            float r3 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x013a }
            goto L_0x0124
        L_0x013a:
            r0 = move-exception
            goto L_0x014f
        L_0x013c:
            int r0 = kotlin.math.MathKt.roundToInt((float) r3)     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x013a }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x013a }
            goto L_0x0159
        L_0x0149:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x013a }
            r0.<init>()     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x014f:
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x0159:
            boolean r3 = kotlin.Result.m29isFailureimpl(r0)
            if (r3 == 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r15 = r0
        L_0x0161:
            java.lang.Integer r15 = (java.lang.Integer) r15
            goto L_0x0174
        L_0x0164:
            r15 = r16
            goto L_0x0174
        L_0x0167:
            int r0 = r16.intValue()
            if (r0 < r13) goto L_0x0164
            if (r13 != r10) goto L_0x0164
            java.lang.String r0 = "maxLineWidth more than maxWidth"
            defpackage.z68.p(r11, r0)
        L_0x0174:
            if (r15 == 0) goto L_0x01b1
            z3a r3 = r1.d     // Catch:{ all -> 0x0190 }
            int r0 = r15.intValue()     // Catch:{ all -> 0x0190 }
            int r6 = r0 + 2
            r4 = r18
            r5 = r19
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            android.text.StaticLayout r0 = r3.j(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0190 }
        L_0x018e:
            r2 = r0
            goto L_0x01b1
        L_0x0190:
            r0 = move-exception
            java.lang.String r2 = "static layout create error 3"
            defpackage.z68.f(r11, r2, r0)
            java.lang.String r4 = r18.toString()
            int r0 = r15.intValue()
            int r6 = r0 + 2
            z3a r3 = r1.d
            r5 = r19
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            android.text.StaticLayout r0 = r3.j(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x018e
        L_0x01b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds7.c(java.lang.CharSequence, android.text.TextPaint, int, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }
}
