package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Lazy;
import kotlin.math.MathKt;

/* renamed from: t8c  reason: default package */
public final class t8c {
    public final Context a;
    public final Lazy b;
    public final Lazy c;

    public t8c(Context context, Lazy lazy, Lazy lazy2) {
        this.a = context;
        this.b = lazy;
        this.c = lazy2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f7 A[SYNTHETIC, Splitter:B:31:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0013 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r9, defpackage.rf7[] r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x012c
            int r0 = r10.length
            if (r0 != 0) goto L_0x0007
            goto L_0x012c
        L_0x0007:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r0.append(r9)
            java.util.Iterator r9 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r10)
        L_0x0013:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0126
            java.lang.Object r10 = r9.next()
            rf7 r10 = (defpackage.rf7) r10
            int r1 = r10.a
            kotlin.Lazy r2 = r8.c
            r3 = 1
            r4 = 0
            android.content.Context r5 = r8.a
            if (r1 == r3) goto L_0x00b4
            r3 = 2
            if (r1 == r3) goto L_0x008c
            r3 = 3
            r6 = 4
            if (r1 == r3) goto L_0x004e
            if (r1 == r6) goto L_0x0034
            goto L_0x00f4
        L_0x0034:
            sf7 r1 = new sf7
            r1.<init>()
            byte[] r2 = r10.d
            ad9 r1 = defpackage.ad9.mergeFrom(r1, r2)
            sf7 r1 = (defpackage.sf7) r1
            int r2 = r1.a
            if (r2 <= 0) goto L_0x00f4
            bge r2 = new bge
            int r1 = r1.a
            r2.<init>(r1)
            goto L_0x00f5
        L_0x004e:
            mf7 r1 = new mf7
            r1.<init>()
            byte[] r3 = r10.d
            ad9 r1 = defpackage.ad9.mergeFrom(r1, r3)
            mf7 r1 = (defpackage.mf7) r1
            byte[] r3 = r1.b
            int r3 = r3.length
            if (r3 != 0) goto L_0x0061
            goto L_0x0013
        L_0x0061:
            java.lang.Object r2 = r2.getValue()
            no0 r2 = (defpackage.no0) r2
            byte[] r3 = r1.b
            r2.getClass()
            android.graphics.Bitmap r2 = defpackage.no0.a(r3)
            if (r2 == 0) goto L_0x00f4
            bq5 r3 = new bq5
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r5.getResources()
            r7.<init>(r5, r2)
            kotlin.enums.EnumEntries r2 = defpackage.vp5.v
            int r1 = r1.a
            java.lang.Object r1 = r2.get(r1)
            vp5 r1 = (defpackage.vp5) r1
            r3.<init>((android.graphics.drawable.Drawable) r7, (defpackage.vp5) r1, (int) r6)
            r2 = r3
            goto L_0x00f5
        L_0x008c:
            tf7 r1 = new tf7
            r1.<init>()
            byte[] r2 = r10.d
            ad9 r1 = defpackage.ad9.mergeFrom(r1, r2)
            tf7 r1 = (defpackage.tf7) r1
            int r2 = r1.a
            if (r2 == 0) goto L_0x00f4
            aif r2 = new aif
            js9 r3 = defpackage.fu4.k
            fu4 r3 = r3.e(r5)
            k2b r3 = r3.f()
            jkb r5 = new jkb
            r6 = 10
            r5.<init>((int) r6, (java.lang.Object) r1)
            r2.<init>(r3, r5)
            goto L_0x00f5
        L_0x00b4:
            lf7 r1 = new lf7
            r1.<init>()
            byte[] r3 = r10.d
            ad9 r1 = defpackage.ad9.mergeFrom(r1, r3)
            lf7 r1 = (defpackage.lf7) r1
            byte[] r3 = r1.a
            int r3 = r3.length
            if (r3 != 0) goto L_0x00c8
            goto L_0x0013
        L_0x00c8:
            java.lang.Object r2 = r2.getValue()
            no0 r2 = (defpackage.no0) r2
            byte[] r1 = r1.a
            r2.getClass()
            android.graphics.Bitmap r1 = defpackage.no0.a(r1)
            if (r1 == 0) goto L_0x00f4
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r5.getResources()
            r2.<init>(r3, r1)
            int r3 = r1.getWidth()
            int r1 = r1.getHeight()
            r2.setBounds(r4, r4, r3, r1)
            i35 r1 = new i35
            r1.<init>(r2)
            r2 = r1
            goto L_0x00f5
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            if (r2 == 0) goto L_0x0013
            int r1 = r10.b     // Catch:{ all -> 0x0100 }
            int r3 = r10.c     // Catch:{ all -> 0x0100 }
            r0.setSpan(r2, r1, r3, r4)     // Catch:{ all -> 0x0100 }
            goto L_0x0013
        L_0x0100:
            r1 = move-exception
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = r10.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fail to set span "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r10 = " of type "
            r4.append(r10)
            r4.append(r3)
            java.lang.String r10 = r4.toString()
            defpackage.z68.f(r2, r10, r1)
            goto L_0x0013
        L_0x0126:
            android.text.SpannedString r8 = new android.text.SpannedString
            r8.<init>(r0)
            return r8
        L_0x012c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8c.a(java.lang.CharSequence, rf7[]):java.lang.CharSequence");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList b(java.lang.CharSequence r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 != 0) goto L_0x000a
            return r4
        L_0x000a:
            int r3 = r26.length()
            if (r3 != 0) goto L_0x0011
            return r4
        L_0x0011:
            r5 = r1
            android.text.Spanned r5 = (android.text.Spanned) r5
            r6 = 0
            int r7 = r5.nextSpanTransition(r6, r3, r4)
            if (r7 != r3) goto L_0x001c
            return r4
        L_0x001c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r26.length()
            boolean r9 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x0036 }
            if (r9 == 0) goto L_0x002c
            android.text.Spanned r1 = (android.text.Spanned) r1     // Catch:{ all -> 0x0036 }
            goto L_0x002d
        L_0x002c:
            r1 = r4
        L_0x002d:
            if (r1 == 0) goto L_0x0036
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            java.lang.Object[] r1 = r1.getSpans(r6, r8, r9)     // Catch:{ all -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r1 = r4
        L_0x0037:
            if (r1 == 0) goto L_0x0282
            int r8 = r1.length
            r9 = r6
        L_0x003b:
            if (r9 >= r8) goto L_0x0282
            r10 = r1[r9]
            int r11 = r5.getSpanStart(r10)
            if (r11 < 0) goto L_0x0047
            if (r11 <= r3) goto L_0x004f
        L_0x0047:
            r26 = r1
            r24 = r3
            r3 = r4
        L_0x004c:
            r1 = 1
            goto L_0x0279
        L_0x004f:
            int r12 = r5.getSpanEnd(r10)
            if (r12 < 0) goto L_0x0047
            if (r12 <= r3) goto L_0x0058
            goto L_0x0047
        L_0x0058:
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            boolean r14 = r10 instanceof defpackage.i35
            kotlin.Lazy r15 = r0.c
            if (r14 == 0) goto L_0x016a
            i35 r10 = (defpackage.i35) r10
            android.graphics.drawable.Drawable r14 = r10.w
            boolean r6 = r14 instanceof android.graphics.drawable.BitmapDrawable
            if (r6 == 0) goto L_0x0072
            android.graphics.drawable.BitmapDrawable r14 = (android.graphics.drawable.BitmapDrawable) r14
            android.graphics.Bitmap r6 = r14.getBitmap()
            goto L_0x0084
        L_0x0072:
            boolean r6 = r14 instanceof defpackage.qhe
            if (r6 == 0) goto L_0x0083
            qhe r14 = (defpackage.qhe) r14
            rhe r6 = r14.a
            l15 r14 = r6.e
            k25 r6 = r6.a
            android.graphics.Bitmap r6 = r14.E(r6)
            goto L_0x0084
        L_0x0083:
            r6 = r4
        L_0x0084:
            if (r6 != 0) goto L_0x0087
            goto L_0x0047
        L_0x0087:
            android.graphics.drawable.Drawable r10 = r10.w
            boolean r14 = r10 instanceof android.graphics.drawable.BitmapDrawable
            if (r14 == 0) goto L_0x0099
            android.graphics.Rect r14 = new android.graphics.Rect
            android.graphics.drawable.BitmapDrawable r10 = (android.graphics.drawable.BitmapDrawable) r10
            android.graphics.Rect r10 = r10.getBounds()
            r14.<init>(r10)
            goto L_0x00ab
        L_0x0099:
            boolean r14 = r10 instanceof defpackage.qhe
            if (r14 == 0) goto L_0x00aa
            qhe r10 = (defpackage.qhe) r10
            r10.getClass()
            android.graphics.Rect r14 = new android.graphics.Rect
            android.graphics.Rect r10 = r10.b
            r14.<init>(r10)
            goto L_0x00ab
        L_0x00aa:
            r14 = r4
        L_0x00ab:
            if (r14 != 0) goto L_0x00ae
            goto L_0x0047
        L_0x00ae:
            java.lang.Object r10 = r15.getValue()
            no0 r10 = (defpackage.no0) r10
            g43 r15 = r10.a
            kotlin.Lazy r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            byte[] r15 = (byte[]) r15
            boolean r16 = r14.isEmpty()
            if (r16 != 0) goto L_0x00e9
            boolean r16 = r6.isRecycled()
            if (r16 != 0) goto L_0x00e9
            int r16 = defpackage.vo0.d(r6)
            if (r16 != 0) goto L_0x00d1
            goto L_0x00e9
        L_0x00d1:
            int r2 = r14.width()
            int r4 = r6.getWidth()
            if (r2 != r4) goto L_0x00ee
            int r2 = r14.height()
            int r4 = r6.getHeight()
            if (r2 != r4) goto L_0x00ee
            byte[] r15 = defpackage.no0.c(r6, r15)
        L_0x00e9:
            r26 = r1
            r24 = r3
            goto L_0x014c
        L_0x00ee:
            kotlin.Lazy r2 = r10.c
            java.lang.Object r2 = r2.getValue()
            ea7 r2 = (defpackage.ea7) r2
            ynb r16 = r2.h()
            int r2 = r14.width()
            int r4 = r14.height()
            r16.getClass()
            defpackage.ynb.a(r2, r4)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            int r14 = r6.getWidth()
            r26 = r1
            int r1 = r6.getHeight()
            float r2 = (float) r2
            r24 = r3
            float r3 = (float) r14
            float r2 = r2 / r3
            float r3 = (float) r4
            float r4 = (float) r1
            float r3 = r3 / r4
            r10.setScale(r2, r3)
            r19 = 0
            r18 = 0
            r17 = r6
            r20 = r14
            r21 = r1
            r22 = r10
            jd4 r1 = r16.b(r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r1.e0()     // Catch:{ all -> 0x0143 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x0143 }
            byte[] r15 = defpackage.no0.c(r2, r15)     // Catch:{ all -> 0x0143 }
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L_0x014c
        L_0x0141:
            r2 = r0
            goto L_0x0145
        L_0x0143:
            r0 = move-exception
            goto L_0x0141
        L_0x0145:
            throw r2     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r3
        L_0x014c:
            int r1 = r15.length
            if (r1 != 0) goto L_0x0153
            r1 = 1
            r23 = 1
            goto L_0x0156
        L_0x0153:
            r1 = 1
            r23 = 0
        L_0x0156:
            r2 = r23 ^ 1
            if (r2 == 0) goto L_0x0167
            lf7 r1 = new lf7
            r1.<init>()
            r1.a = r15
            r13.element = r1
            r1 = 1
        L_0x0164:
            r3 = 0
            goto L_0x025a
        L_0x0167:
            r3 = 0
            goto L_0x0259
        L_0x016a:
            r26 = r1
            r24 = r3
            boolean r1 = r10 instanceof defpackage.aif
            if (r1 == 0) goto L_0x0181
            tf7 r1 = new tf7
            r1.<init>()
            aif r10 = (defpackage.aif) r10
            int r2 = r10.b
            r1.a = r2
            r13.element = r1
            r1 = 2
            goto L_0x0164
        L_0x0181:
            boolean r1 = r10 instanceof defpackage.bge
            if (r1 == 0) goto L_0x0194
            sf7 r1 = new sf7
            r1.<init>()
            bge r10 = (defpackage.bge) r10
            int r2 = r10.a
            r1.a = r2
            r13.element = r1
            r1 = 4
            goto L_0x0164
        L_0x0194:
            boolean r1 = r10 instanceof defpackage.dl
            r2 = 3
            if (r1 == 0) goto L_0x01f6
            r1 = r10
            dl r1 = (defpackage.dl) r1
            cl r1 = r1.y
            android.graphics.drawable.Drawable r1 = r1.Y
            jd4 r1 = r0.c(r1)
            if (r1 == 0) goto L_0x0167
            java.lang.Object r3 = r15.getValue()     // Catch:{ all -> 0x01e2 }
            no0 r3 = (defpackage.no0) r3     // Catch:{ all -> 0x01e2 }
            java.lang.Object r4 = r1.e0()     // Catch:{ all -> 0x01e2 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x01e2 }
            g43 r3 = r3.a     // Catch:{ all -> 0x01e2 }
            kotlin.Lazy r3 = r3.a     // Catch:{ all -> 0x01e2 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x01e2 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x01e2 }
            byte[] r3 = defpackage.no0.c(r4, r3)     // Catch:{ all -> 0x01e2 }
            int r4 = r3.length     // Catch:{ all -> 0x01e2 }
            if (r4 != 0) goto L_0x01c7
            r4 = 1
            r23 = 1
            goto L_0x01ca
        L_0x01c7:
            r4 = 1
            r23 = 0
        L_0x01ca:
            r6 = r23 ^ 1
            if (r6 == 0) goto L_0x01e5
            mf7 r4 = new mf7     // Catch:{ all -> 0x01e2 }
            r4.<init>()     // Catch:{ all -> 0x01e2 }
            dl r10 = (defpackage.dl) r10     // Catch:{ all -> 0x01e2 }
            vp5 r6 = r10.a     // Catch:{ all -> 0x01e2 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x01e2 }
            r4.a = r6     // Catch:{ all -> 0x01e2 }
            r4.b = r3     // Catch:{ all -> 0x01e2 }
            r13.element = r4     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            r2 = r0
            goto L_0x01ef
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x01e2 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r3)
        L_0x01ec:
            r1 = r2
            goto L_0x025a
        L_0x01ef:
            throw r2     // Catch:{ all -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r3
        L_0x01f6:
            boolean r1 = r10 instanceof defpackage.bq5
            if (r1 == 0) goto L_0x0276
            r1 = r10
            android.text.style.ImageSpan r1 = (android.text.style.ImageSpan) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 != 0) goto L_0x0205
            r1 = 0
            goto L_0x0209
        L_0x0205:
            jd4 r1 = r0.c(r1)
        L_0x0209:
            if (r1 == 0) goto L_0x0167
            java.lang.Object r3 = r15.getValue()     // Catch:{ all -> 0x0247 }
            no0 r3 = (defpackage.no0) r3     // Catch:{ all -> 0x0247 }
            java.lang.Object r4 = r1.e0()     // Catch:{ all -> 0x0247 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ all -> 0x0247 }
            g43 r3 = r3.a     // Catch:{ all -> 0x0247 }
            kotlin.Lazy r3 = r3.a     // Catch:{ all -> 0x0247 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0247 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0247 }
            byte[] r3 = defpackage.no0.c(r4, r3)     // Catch:{ all -> 0x0247 }
            int r4 = r3.length     // Catch:{ all -> 0x0247 }
            if (r4 != 0) goto L_0x022c
            r4 = 1
            r23 = 1
            goto L_0x022f
        L_0x022c:
            r4 = 1
            r23 = 0
        L_0x022f:
            r6 = r23 ^ 1
            if (r6 == 0) goto L_0x024a
            mf7 r4 = new mf7     // Catch:{ all -> 0x0247 }
            r4.<init>()     // Catch:{ all -> 0x0247 }
            bq5 r10 = (defpackage.bq5) r10     // Catch:{ all -> 0x0247 }
            vp5 r6 = r10.a     // Catch:{ all -> 0x0247 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0247 }
            r4.a = r6     // Catch:{ all -> 0x0247 }
            r4.b = r3     // Catch:{ all -> 0x0247 }
            r13.element = r4     // Catch:{ all -> 0x0247 }
            goto L_0x024b
        L_0x0247:
            r0 = move-exception
            r2 = r0
            goto L_0x0252
        L_0x024a:
            r2 = 0
        L_0x024b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0247 }
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r3)
            goto L_0x01ec
        L_0x0252:
            throw r2     // Catch:{ all -> 0x0253 }
        L_0x0253:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r3
        L_0x0259:
            r1 = 0
        L_0x025a:
            T r2 = r13.element
            if (r2 == 0) goto L_0x004c
            ad9 r2 = (defpackage.ad9) r2
            byte[] r2 = defpackage.ad9.toByteArray(r2)
            rf7 r4 = new rf7
            r4.<init>()
            r4.b = r11
            r4.c = r12
            r4.a = r1
            r4.d = r2
            r7.add(r4)
            goto L_0x004c
        L_0x0276:
            r3 = 0
            goto L_0x004c
        L_0x0279:
            int r9 = r9 + r1
            r1 = r26
            r4 = r3
            r3 = r24
            r6 = 0
            goto L_0x003b
        L_0x0282:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8c.b(java.lang.CharSequence):java.util.ArrayList");
    }

    public final jd4 c(Drawable drawable) {
        try {
            ynb h = ((ea7) this.b.getValue()).h();
            int width = drawable.getBounds().width();
            int height = drawable.getBounds().height();
            if (width <= 0) {
                width = MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density);
            }
            if (height <= 0) {
                height = MathKt.roundToInt(((float) 18) * vo4.c().getDisplayMetrics().density);
            }
            Rect bounds = drawable.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            y33 c2 = h.c(width, height, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, width, height);
            Canvas canvas = new Canvas((Bitmap) c2.e0());
            canvas.drawColor(0, PorterDuff.Mode.SRC);
            drawable.draw(canvas);
            drawable.setBounds(i, i2, i3, i4);
            return (jd4) c2;
        } catch (Throwable th) {
            z68.f(drawable.getClass().getName(), "fail to fetch image from Drawable", th);
            return null;
        }
    }
}
