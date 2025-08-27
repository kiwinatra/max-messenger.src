package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: vw1  reason: default package */
public final class vw1 extends View implements lze {
    public final ArrayList a = new ArrayList();
    public List b = Collections.emptyList();
    public int c = 0;
    public float o = 0.0533f;
    public yw1 v = yw1.g;
    public float w = 0.08f;

    public vw1(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void a(List list, yw1 yw1, float f, int i, float f2) {
        this.b = list;
        this.v = yw1;
        this.o = f;
        this.c = i;
        this.w = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() < list.size()) {
                arrayList.add(new fze(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            java.util.List r2 = r0.b
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = r38.getHeight()
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingTop()
            int r6 = r38.getWidth()
            int r7 = r38.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r38.getPaddingBottom()
            int r7 = r3 - r7
            if (r7 <= r5) goto L_0x04de
            if (r6 > r4) goto L_0x002e
            goto L_0x04de
        L_0x002e:
            int r8 = r7 - r5
            int r9 = r0.c
            float r10 = r0.o
            float r9 = defpackage.hi7.U(r10, r9, r3, r8)
            r10 = 0
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 > 0) goto L_0x003e
            return
        L_0x003e:
            int r11 = r2.size()
            r13 = 0
        L_0x0043:
            if (r13 >= r11) goto L_0x04de
            java.lang.Object r14 = r2.get(r13)
            m44 r14 = (defpackage.m44) r14
            int r15 = r14.y0
            r17 = 1065353216(0x3f800000, float:1.0)
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r12) goto L_0x008a
            k44 r15 = r14.a()
            r15.h = r10
            r15.i = r12
            r12 = 0
            r15.c = r12
            int r12 = r14.w
            float r10 = r14.v
            if (r12 != 0) goto L_0x006f
            float r10 = r17 - r10
            r15.e = r10
            r10 = 0
            r15.f = r10
            goto L_0x0077
        L_0x006f:
            float r10 = -r10
            float r10 = r10 - r17
            r15.e = r10
            r10 = 1
            r15.f = r10
        L_0x0077:
            int r10 = r14.x
            if (r10 == 0) goto L_0x0083
            r12 = 2
            if (r10 == r12) goto L_0x007f
            goto L_0x0086
        L_0x007f:
            r10 = 0
            r15.g = r10
            goto L_0x0086
        L_0x0083:
            r12 = 2
            r15.g = r12
        L_0x0086:
            m44 r14 = r15.a()
        L_0x008a:
            int r10 = r14.w0
            float r12 = r14.x0
            float r10 = defpackage.hi7.U(r12, r10, r3, r8)
            java.util.ArrayList r12 = r0.a
            java.lang.Object r12 = r12.get(r13)
            fze r12 = (defpackage.fze) r12
            yw1 r15 = r0.v
            r19 = r2
            float r2 = r0.w
            r12.getClass()
            android.graphics.Bitmap r0 = r14.o
            r20 = r3
            r21 = r8
            if (r0 != 0) goto L_0x00ad
            r3 = 1
            goto L_0x00ae
        L_0x00ad:
            r3 = 0
        L_0x00ae:
            java.lang.CharSequence r8 = r14.a
            if (r3 == 0) goto L_0x00d9
            boolean r22 = android.text.TextUtils.isEmpty(r8)
            if (r22 == 0) goto L_0x00cb
            r0 = r1
            r36 = r4
            r35 = r5
            r34 = r6
            r33 = r7
            r32 = r9
            r22 = r11
            r23 = r13
        L_0x00c7:
            r7 = 0
            r9 = 0
            goto L_0x04c4
        L_0x00cb:
            r22 = r11
            boolean r11 = r14.Z
            if (r11 == 0) goto L_0x00d4
            int r11 = r14.v0
            goto L_0x00d6
        L_0x00d4:
            int r11 = r15.c
        L_0x00d6:
            r23 = r13
            goto L_0x00de
        L_0x00d9:
            r22 = r11
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00d6
        L_0x00de:
            java.lang.CharSequence r13 = r12.i
            android.text.TextPaint r1 = r12.f
            r32 = r3
            float r3 = r14.Y
            r33 = r7
            float r7 = r14.X
            r34 = r6
            int r6 = r14.z
            r35 = r5
            float r5 = r14.y
            r36 = r4
            int r4 = r14.x
            r24 = r2
            int r2 = r14.w
            r25 = r10
            float r10 = r14.v
            android.text.Layout$Alignment r14 = r14.b
            if (r13 == r8) goto L_0x0114
            if (r13 == 0) goto L_0x010b
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            r13 = r1
            r26 = r2
            r1 = r32
            r2 = r39
            goto L_0x01e4
        L_0x0114:
            android.text.Layout$Alignment r13 = r12.j
            boolean r13 = defpackage.t0g.a(r13, r14)
            if (r13 == 0) goto L_0x010b
            android.graphics.Bitmap r13 = r12.k
            if (r13 != r0) goto L_0x010b
            float r13 = r12.l
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x010b
            int r13 = r12.m
            if (r13 != r2) goto L_0x010b
            int r13 = r12.n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r26 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x01e1
            float r2 = r12.o
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            int r2 = r12.p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x01e1
            float r2 = r12.q
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            float r2 = r12.r
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            int r2 = r12.s
            int r13 = r15.a
            if (r2 != r13) goto L_0x01e1
            int r2 = r12.t
            int r13 = r15.b
            if (r2 != r13) goto L_0x01e1
            int r2 = r12.u
            if (r2 != r11) goto L_0x01e1
            int r2 = r12.w
            int r13 = r15.d
            if (r2 != r13) goto L_0x01e1
            int r2 = r12.v
            int r13 = r15.e
            if (r2 != r13) goto L_0x01e1
            android.graphics.Typeface r2 = r1.getTypeface()
            android.graphics.Typeface r13 = r15.f
            boolean r2 = defpackage.t0g.a(r2, r13)
            if (r2 == 0) goto L_0x01e1
            float r2 = r12.x
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            float r2 = r12.y
            int r2 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            float r2 = r12.z
            int r2 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r2 != 0) goto L_0x01e1
            int r2 = r12.A
            r13 = r36
            if (r2 != r13) goto L_0x01db
            int r2 = r12.B
            r27 = r1
            r1 = r35
            if (r2 != r1) goto L_0x01d6
            int r2 = r12.C
            r35 = r1
            r1 = r34
            if (r2 != r1) goto L_0x01d1
            int r2 = r12.D
            r34 = r1
            r1 = r33
            if (r2 != r1) goto L_0x01c6
            r2 = r39
            r33 = r1
            r36 = r13
            r1 = r32
            r12.a(r2, r1)
            r0 = r2
            r32 = r9
            goto L_0x00c7
        L_0x01c6:
            r2 = r39
            r33 = r1
        L_0x01ca:
            r36 = r13
            r13 = r27
        L_0x01ce:
            r1 = r32
            goto L_0x01e4
        L_0x01d1:
            r2 = r39
            r34 = r1
            goto L_0x01ca
        L_0x01d6:
            r2 = r39
            r35 = r1
            goto L_0x01ca
        L_0x01db:
            r2 = r39
            r36 = r13
        L_0x01df:
            r13 = r1
            goto L_0x01ce
        L_0x01e1:
            r2 = r39
            goto L_0x01df
        L_0x01e4:
            r12.i = r8
            r12.j = r14
            r12.k = r0
            r12.l = r10
            r0 = r26
            r12.m = r0
            r12.n = r4
            r12.o = r5
            r12.p = r6
            r12.q = r7
            r12.r = r3
            int r0 = r15.a
            r12.s = r0
            int r0 = r15.b
            r12.t = r0
            r12.u = r11
            int r0 = r15.d
            r12.w = r0
            int r0 = r15.e
            r12.v = r0
            android.graphics.Typeface r0 = r15.f
            r13.setTypeface(r0)
            r12.x = r9
            r0 = r25
            r12.y = r0
            r0 = r24
            r12.z = r0
            r0 = r36
            r12.A = r0
            r3 = r35
            r12.B = r3
            r6 = r34
            r12.C = r6
            r4 = r33
            r12.D = r4
            if (r1 == 0) goto L_0x043e
            java.lang.CharSequence r5 = r12.i
            r5.getClass()
            java.lang.CharSequence r5 = r12.i
            boolean r7 = r5 instanceof android.text.SpannableStringBuilder
            if (r7 == 0) goto L_0x023b
            android.text.SpannableStringBuilder r5 = (android.text.SpannableStringBuilder) r5
            goto L_0x0242
        L_0x023b:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r7 = r12.i
            r5.<init>(r7)
        L_0x0242:
            int r7 = r12.C
            int r8 = r12.A
            int r7 = r7 - r8
            int r8 = r12.D
            int r10 = r12.B
            int r8 = r8 - r10
            float r10 = r12.x
            r13.setTextSize(r10)
            float r10 = r12.x
            r11 = 1040187392(0x3e000000, float:0.125)
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            int r11 = r10 * 2
            int r14 = r7 - r11
            float r15 = r12.q
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r24 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r24 == 0) goto L_0x026a
            float r14 = (float) r14
            float r14 = r14 * r15
            int r14 = (int) r14
        L_0x026a:
            if (r14 > 0) goto L_0x027c
            r36 = r0
            r37 = r1
            r35 = r3
            r33 = r4
            r34 = r6
            r32 = r9
        L_0x0278:
            r7 = 0
            r9 = 0
            goto L_0x0438
        L_0x027c:
            float r15 = r12.y
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            r36 = r0
            if (r15 <= 0) goto L_0x029d
            android.text.style.AbsoluteSizeSpan r15 = new android.text.style.AbsoluteSizeSpan
            float r0 = r12.y
            int r0 = (int) r0
            r15.<init>(r0)
            int r0 = r5.length()
            r35 = r3
            r33 = r4
            r3 = 0
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r5.setSpan(r15, r3, r0, r4)
            goto L_0x02a2
        L_0x029d:
            r35 = r3
            r33 = r4
            r3 = 0
        L_0x02a2:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r5)
            int r4 = r12.w
            r15 = 1
            if (r4 != r15) goto L_0x02c8
            int r4 = r0.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r15 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r4 = r0.getSpans(r3, r4, r15)
            android.text.style.ForegroundColorSpan[] r4 = (android.text.style.ForegroundColorSpan[]) r4
            int r3 = r4.length
            r15 = 0
        L_0x02ba:
            if (r15 >= r3) goto L_0x02c8
            r25 = r3
            r3 = r4[r15]
            r0.removeSpan(r3)
            int r15 = r15 + 1
            r3 = r25
            goto L_0x02ba
        L_0x02c8:
            int r3 = r12.t
            int r3 = android.graphics.Color.alpha(r3)
            if (r3 <= 0) goto L_0x0300
            int r3 = r12.w
            if (r3 == 0) goto L_0x02d7
            r4 = 2
            if (r3 != r4) goto L_0x02dd
        L_0x02d7:
            r34 = r6
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r15 = 0
            goto L_0x02f1
        L_0x02dd:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r4 = r12.t
            r3.<init>(r4)
            int r4 = r0.length()
            r34 = r6
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            r15 = 0
            r0.setSpan(r3, r15, r4, r6)
            goto L_0x0302
        L_0x02f1:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r4 = r12.t
            r3.<init>(r4)
            int r4 = r5.length()
            r5.setSpan(r3, r15, r4, r6)
            goto L_0x0302
        L_0x0300:
            r34 = r6
        L_0x0302:
            android.text.Layout$Alignment r3 = r12.j
            if (r3 != 0) goto L_0x0308
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0308:
            android.text.StaticLayout r4 = new android.text.StaticLayout
            float r6 = r12.e
            r31 = 1
            float r15 = r12.d
            r24 = r4
            r25 = r5
            r26 = r13
            r27 = r14
            r28 = r3
            r29 = r15
            r30 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r12.E = r4
            int r4 = r4.getHeight()
            android.text.StaticLayout r6 = r12.E
            int r6 = r6.getLineCount()
            r32 = r9
            r9 = 0
            r15 = 0
        L_0x0331:
            if (r15 >= r6) goto L_0x0350
            r24 = r6
            android.text.StaticLayout r6 = r12.E
            float r6 = r6.getLineWidth(r15)
            r37 = r1
            double r1 = (double) r6
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r9 = java.lang.Math.max(r1, r9)
            int r15 = r15 + 1
            r2 = r39
            r6 = r24
            r1 = r37
            goto L_0x0331
        L_0x0350:
            r37 = r1
            float r1 = r12.q
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x035e
            if (r9 >= r14) goto L_0x035e
            goto L_0x035f
        L_0x035e:
            r14 = r9
        L_0x035f:
            int r14 = r14 + r11
            float r1 = r12.o
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x038b
            float r2 = (float) r7
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            int r2 = r12.A
            int r1 = r1 + r2
            int r6 = r12.p
            r7 = 1
            if (r6 == r7) goto L_0x037a
            r9 = 2
            if (r6 == r9) goto L_0x0378
            goto L_0x037f
        L_0x0378:
            int r1 = r1 - r14
            goto L_0x037f
        L_0x037a:
            r9 = 2
            int r1 = r1 * 2
            int r1 = r1 - r14
            int r1 = r1 / r9
        L_0x037f:
            int r1 = java.lang.Math.max(r1, r2)
            int r14 = r14 + r1
            int r2 = r12.C
            int r2 = java.lang.Math.min(r14, r2)
            goto L_0x0393
        L_0x038b:
            r9 = 2
            int r7 = r7 - r14
            int r7 = r7 / r9
            int r1 = r12.A
            int r1 = r1 + r7
            int r2 = r1 + r14
        L_0x0393:
            int r2 = r2 - r1
            if (r2 > 0) goto L_0x0398
            goto L_0x0278
        L_0x0398:
            float r6 = r12.l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x03f9
            int r7 = r12.m
            if (r7 != 0) goto L_0x03bf
            float r7 = (float) r8
            float r7 = r7 * r6
            int r6 = java.lang.Math.round(r7)
            int r7 = r12.B
            int r6 = r6 + r7
            int r7 = r12.n
            r8 = 2
            if (r7 != r8) goto L_0x03b5
            int r6 = r6 - r4
            goto L_0x03bc
        L_0x03b5:
            r9 = 1
            if (r7 != r9) goto L_0x03bc
            int r6 = r6 * 2
            int r6 = r6 - r4
            int r6 = r6 / r8
        L_0x03bc:
            r7 = 0
            r9 = 0
            goto L_0x03ea
        L_0x03bf:
            android.text.StaticLayout r6 = r12.E
            r7 = 0
            int r6 = r6.getLineBottom(r7)
            android.text.StaticLayout r8 = r12.E
            int r8 = r8.getLineTop(r7)
            int r6 = r6 - r8
            float r8 = r12.l
            r9 = 0
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x03de
            float r6 = (float) r6
            float r8 = r8 * r6
            int r6 = java.lang.Math.round(r8)
            int r8 = r12.B
            int r6 = r6 + r8
            goto L_0x03ea
        L_0x03de:
            float r8 = r8 + r17
            float r6 = (float) r6
            float r8 = r8 * r6
            int r6 = java.lang.Math.round(r8)
            int r8 = r12.D
            int r6 = r6 + r8
            int r6 = r6 - r4
        L_0x03ea:
            int r8 = r6 + r4
            int r11 = r12.D
            if (r8 <= r11) goto L_0x03f3
            int r6 = r11 - r4
            goto L_0x0404
        L_0x03f3:
            int r4 = r12.B
            if (r6 >= r4) goto L_0x0404
            r6 = r4
            goto L_0x0404
        L_0x03f9:
            r7 = 0
            r9 = 0
            int r6 = r12.D
            int r6 = r6 - r4
            float r4 = (float) r8
            float r8 = r12.z
            float r4 = r4 * r8
            int r4 = (int) r4
            int r6 = r6 - r4
        L_0x0404:
            android.text.StaticLayout r4 = new android.text.StaticLayout
            float r8 = r12.e
            r31 = 1
            float r11 = r12.d
            r24 = r4
            r25 = r5
            r26 = r13
            r27 = r2
            r28 = r3
            r29 = r11
            r30 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r12.E = r4
            android.text.StaticLayout r4 = new android.text.StaticLayout
            float r5 = r12.e
            float r8 = r12.d
            r24 = r4
            r25 = r0
            r29 = r8
            r30 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r12.F = r4
            r12.G = r1
            r12.H = r6
            r12.I = r10
        L_0x0438:
            r0 = r39
            r1 = r37
            goto L_0x04c1
        L_0x043e:
            r36 = r0
            r37 = r1
            r35 = r3
            r33 = r4
            r34 = r6
            r32 = r9
            r7 = 0
            r9 = 0
            android.graphics.Bitmap r0 = r12.k
            r0.getClass()
            android.graphics.Bitmap r0 = r12.k
            int r1 = r12.C
            int r2 = r12.A
            int r1 = r1 - r2
            int r3 = r12.D
            int r4 = r12.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r12.o
            float r5 = r5 * r1
            float r5 = r5 + r2
            float r2 = (float) r4
            float r3 = (float) r3
            float r4 = r12.l
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = r12.q
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x047f
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
            goto L_0x0490
        L_0x047f:
            float r2 = (float) r1
            int r3 = r0.getHeight()
            float r3 = (float) r3
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            float r3 = r3 * r2
            int r0 = java.lang.Math.round(r3)
        L_0x0490:
            int r2 = r12.p
            r3 = 2
            if (r2 != r3) goto L_0x0498
            float r2 = (float) r1
        L_0x0496:
            float r5 = r5 - r2
            goto L_0x049f
        L_0x0498:
            r3 = 1
            if (r2 != r3) goto L_0x049f
            int r2 = r1 / 2
            float r2 = (float) r2
            goto L_0x0496
        L_0x049f:
            int r2 = java.lang.Math.round(r5)
            int r3 = r12.n
            r5 = 2
            if (r3 != r5) goto L_0x04ab
            float r3 = (float) r0
        L_0x04a9:
            float r4 = r4 - r3
            goto L_0x04b2
        L_0x04ab:
            r5 = 1
            if (r3 != r5) goto L_0x04b2
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x04a9
        L_0x04b2:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r12.J = r4
            goto L_0x0438
        L_0x04c1:
            r12.a(r0, r1)
        L_0x04c4:
            int r13 = r23 + 1
            r1 = r0
            r10 = r9
            r2 = r19
            r3 = r20
            r8 = r21
            r11 = r22
            r9 = r32
            r7 = r33
            r6 = r34
            r5 = r35
            r4 = r36
            r0 = r38
            goto L_0x0043
        L_0x04de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw1.dispatchDraw(android.graphics.Canvas):void");
    }
}
