package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: xlg  reason: default package */
public final class xlg extends FrameLayout implements lze {
    public final vw1 a;
    public final vlg b;
    public List c = Collections.emptyList();
    public yw1 o = yw1.g;
    public float v = 0.0533f;
    public int w = 0;
    public float x = 0.08f;

    /* JADX WARNING: type inference failed for: r3v0, types: [vlg, android.view.View, android.webkit.WebView] */
    public xlg(Context context) {
        super(context, (AttributeSet) null);
        vw1 vw1 = new vw1(context);
        this.a = vw1;
        ? webView = new WebView(context, (AttributeSet) null);
        this.b = webView;
        webView.setBackgroundColor(0);
        addView(vw1);
        addView(webView);
    }

    public final void a(List list, yw1 yw1, float f, int i, float f2) {
        this.o = yw1;
        this.v = f;
        this.w = i;
        this.x = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            m44 m44 = (m44) list.get(i2);
            if (m44.o != null) {
                arrayList.add(m44);
            } else {
                arrayList2.add(m44);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.a.a(arrayList, yw1, f, i, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float U = hi7.U(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (U == -3.4028235E38f) {
            return "unset";
        }
        int i2 = t0g.a;
        return String.format(Locale.US, "%.2fpx", new Object[]{Float.valueOf(U / getContext().getResources().getDisplayMetrics().density)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f8, code lost:
        if (r1 != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fa, code lost:
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01fd, code lost:
        r4 = "left";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ff, code lost:
        r25 = r4;
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0204, code lost:
        if (r1 != false) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x06af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r46 = this;
            r0 = r46
            r1 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            yw1 r3 = r0.o
            int r3 = r3.a
            java.lang.String r3 = defpackage.y64.K(r3)
            int r4 = r0.w
            float r5 = r0.v
            java.lang.String r4 = r0.b(r5, r4)
            r5 = 1067030938(0x3f99999a, float:1.2)
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            yw1 r7 = r0.o
            int r8 = r7.d
            r9 = 2
            java.lang.String r10 = "unset"
            r11 = 3
            int r7 = r7.e
            if (r8 == r1) goto L_0x0061
            if (r8 == r9) goto L_0x0052
            if (r8 == r11) goto L_0x0043
            r12 = 4
            if (r8 == r12) goto L_0x0034
            r7 = r10
            goto L_0x0073
        L_0x0034:
            java.lang.String r7 = defpackage.y64.K(r7)
            int r8 = defpackage.t0g.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "-0.05em -0.05em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0043:
            java.lang.String r7 = defpackage.y64.K(r7)
            int r8 = defpackage.t0g.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "0.06em 0.08em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0052:
            java.lang.String r7 = defpackage.y64.K(r7)
            int r8 = defpackage.t0g.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = "0.1em 0.12em 0.15em "
            java.lang.String r7 = r8.concat(r7)
            goto L_0x0073
        L_0x0061:
            java.lang.String r7 = defpackage.y64.K(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            int r8 = defpackage.t0g.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r12 = "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"
            java.lang.String r7 = java.lang.String.format(r8, r12, r7)
        L_0x0073:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r6, r7}
            int r4 = defpackage.t0g.a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>"
            java.lang.String r3 = java.lang.String.format(r4, r6, r3)
            r2.append(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "default_bg"
            java.lang.String r4 = defpackage.y64.p(r4)
            yw1 r6 = r0.o
            int r6 = r6.b
            java.lang.String r6 = defpackage.y64.K(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "background-color:"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = ";"
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r3.put(r4, r7)
            r7 = 0
        L_0x00ae:
            java.util.List r12 = r0.c
            int r12 = r12.size()
            if (r7 >= r12) goto L_0x06c8
            java.util.List r12 = r0.c
            java.lang.Object r12 = r12.get(r7)
            m44 r12 = (defpackage.m44) r12
            float r13 = r12.y
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r15 == 0) goto L_0x00cc
            float r13 = r13 * r16
            goto L_0x00ce
        L_0x00cc:
            r13 = 1112014848(0x42480000, float:50.0)
        L_0x00ce:
            r17 = -100
            int r15 = r12.z
            if (r15 == r1) goto L_0x00db
            if (r15 == r9) goto L_0x00d8
            r15 = 0
            goto L_0x00dd
        L_0x00d8:
            r15 = r17
            goto L_0x00dd
        L_0x00db:
            r15 = -50
        L_0x00dd:
            float r11 = r12.v
            int r18 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            java.lang.String r4 = "%.2f%%"
            int r14 = r12.y0
            if (r18 == 0) goto L_0x0159
            int r5 = r12.w
            if (r5 == r1) goto L_0x0122
            float r11 = r11 * r16
            java.lang.Float r5 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r5 = java.lang.String.format(r11, r4, r5)
            int r11 = r12.x
            if (r14 != r1) goto L_0x0112
            if (r11 == r1) goto L_0x010c
            if (r11 == r9) goto L_0x0109
            r11 = 0
            goto L_0x010e
        L_0x0109:
            r11 = r17
            goto L_0x010e
        L_0x010c:
            r11 = -50
        L_0x010e:
            int r11 = -r11
            r17 = r11
            goto L_0x011b
        L_0x0112:
            if (r11 == r1) goto L_0x0119
            if (r11 == r9) goto L_0x011b
            r17 = 0
            goto L_0x011b
        L_0x0119:
            r17 = -50
        L_0x011b:
            r26 = r5
            r1 = 0
            r5 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0170
        L_0x0122:
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            java.lang.String r9 = "%.2fem"
            if (r5 < 0) goto L_0x0140
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r11 = r11 * r5
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r1, r9, r11)
            r26 = r1
            r1 = 0
        L_0x013d:
            r17 = 0
            goto L_0x0170
        L_0x0140:
            r5 = 1067030938(0x3f99999a, float:1.2)
            float r1 = -r11
            float r1 = r1 - r19
            float r1 = r1 * r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r11, r9, r1)
            r26 = r1
            r1 = 1
            goto L_0x013d
        L_0x0159:
            float r1 = r0.x
            float r19 = r19 - r1
            float r19 = r19 * r16
            java.lang.Float r1 = java.lang.Float.valueOf(r19)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r9, r4, r1)
            r26 = r1
            r1 = 0
        L_0x0170:
            float r9 = r12.X
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x018c
            float r9 = r9 * r16
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r4 = java.lang.String.format(r11, r4, r9)
        L_0x0189:
            r28 = r4
            goto L_0x018f
        L_0x018c:
            java.lang.String r4 = "fit-content"
            goto L_0x0189
        L_0x018f:
            java.lang.String r4 = "start"
            java.lang.String r9 = "end"
            java.lang.String r11 = "center"
            android.text.Layout$Alignment r5 = r12.b
            if (r5 != 0) goto L_0x01a0
            r21 = r4
            r29 = r11
            r4 = 2
        L_0x019e:
            r5 = 1
            goto L_0x01ba
        L_0x01a0:
            int[] r21 = defpackage.wlg.a
            int r5 = r5.ordinal()
            r5 = r21[r5]
            r21 = r4
            r4 = 1
            if (r5 == r4) goto L_0x01b6
            r4 = 2
            if (r5 == r4) goto L_0x01b3
            r29 = r11
            goto L_0x019e
        L_0x01b3:
            r29 = r9
            goto L_0x019e
        L_0x01b6:
            r4 = 2
            r29 = r21
            goto L_0x019e
        L_0x01ba:
            if (r14 == r5) goto L_0x01c6
            if (r14 == r4) goto L_0x01c3
            java.lang.String r4 = "horizontal-tb"
        L_0x01c0:
            r30 = r4
            goto L_0x01c9
        L_0x01c3:
            java.lang.String r4 = "vertical-lr"
            goto L_0x01c0
        L_0x01c6:
            java.lang.String r4 = "vertical-rl"
            goto L_0x01c0
        L_0x01c9:
            int r4 = r12.w0
            float r5 = r12.x0
            java.lang.String r31 = r0.b(r5, r4)
            boolean r4 = r12.Z
            if (r4 == 0) goto L_0x01d8
            int r4 = r12.v0
            goto L_0x01dc
        L_0x01d8:
            yw1 r4 = r0.o
            int r4 = r4.c
        L_0x01dc:
            java.lang.String r32 = defpackage.y64.K(r4)
            java.lang.String r4 = "right"
            java.lang.String r5 = "top"
            java.lang.String r22 = "left"
            r23 = r4
            r4 = 1
            if (r14 == r4) goto L_0x0204
            r4 = 2
            if (r14 == r4) goto L_0x01f8
            if (r1 == 0) goto L_0x01f2
            java.lang.String r5 = "bottom"
        L_0x01f2:
            r25 = r5
            r23 = r22
        L_0x01f6:
            r1 = 2
            goto L_0x0207
        L_0x01f8:
            if (r1 == 0) goto L_0x01fd
        L_0x01fa:
            r4 = r23
            goto L_0x01ff
        L_0x01fd:
            r4 = r22
        L_0x01ff:
            r25 = r4
            r23 = r5
            goto L_0x01f6
        L_0x0204:
            if (r1 == 0) goto L_0x01fa
            goto L_0x01fd
        L_0x0207:
            if (r14 == r1) goto L_0x0212
            r1 = 1
            if (r14 != r1) goto L_0x020d
            goto L_0x0212
        L_0x020d:
            java.lang.String r1 = "width"
            r27 = r1
            goto L_0x021c
        L_0x0212:
            java.lang.String r1 = "height"
            r27 = r1
            r45 = r17
            r17 = r15
            r15 = r45
        L_0x021c:
            android.content.Context r1 = r46.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            java.util.regex.Pattern r4 = defpackage.jge.a
            p0d r4 = defpackage.p0d.y
            java.lang.String r5 = "</span>"
            r36 = r9
            java.lang.String r9 = ";'>"
            r37 = r11
            java.lang.String r11 = ""
            java.lang.CharSequence r0 = r12.a
            if (r0 != 0) goto L_0x0254
            wsb r0 = new wsb
            r0.<init>(r11, r4)
            r39 = r2
            r38 = r5
            r40 = r6
            r41 = r8
            r42 = r9
            r22 = r11
        L_0x024d:
            r44 = r12
            r35 = r14
            r5 = 3
            goto L_0x05e8
        L_0x0254:
            r22 = r11
            boolean r11 = r0 instanceof android.text.Spanned
            if (r11 != 0) goto L_0x026f
            wsb r1 = new wsb
            java.lang.String r0 = defpackage.jge.a(r0)
            r1.<init>(r0, r4)
            r0 = r1
            r39 = r2
            r38 = r5
            r40 = r6
            r41 = r8
            r42 = r9
            goto L_0x024d
        L_0x026f:
            android.text.Spanned r0 = (android.text.Spanned) r0
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r11 = r0.length()
            r38 = r5
            java.lang.Class<android.text.style.BackgroundColorSpan> r5 = android.text.style.BackgroundColorSpan.class
            r39 = r2
            r2 = 0
            java.lang.Object[] r5 = r0.getSpans(r2, r11, r5)
            android.text.style.BackgroundColorSpan[] r5 = (android.text.style.BackgroundColorSpan[]) r5
            int r2 = r5.length
            r11 = 0
        L_0x0289:
            if (r11 >= r2) goto L_0x029f
            r24 = r5[r11]
            int r24 = r24.getBackgroundColor()
            r33 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r4.add(r2)
            r2 = 1
            int r11 = r11 + r2
            r2 = r33
            goto L_0x0289
        L_0x029f:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ee
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r24 = r4
            r4 = 14
            r11.<init>(r4)
            java.lang.String r4 = "bg_"
            r11.append(r4)
            r11.append(r5)
            java.lang.String r4 = r11.toString()
            java.lang.String r4 = defpackage.y64.p(r4)
            java.lang.String r5 = defpackage.y64.K(r5)
            int r11 = defpackage.t0g.a
            java.util.Locale r11 = java.util.Locale.US
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r8)
            r11.append(r5)
            r11.append(r6)
            java.lang.String r5 = r11.toString()
            r2.put(r4, r5)
            r4 = r24
            goto L_0x02a8
        L_0x02ee:
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            int r5 = r0.length()
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r40 = r6
            r6 = 0
            java.lang.Object[] r5 = r0.getSpans(r6, r5, r11)
            int r6 = r5.length
            r11 = 0
        L_0x0302:
            if (r11 >= r6) goto L_0x0561
            r24 = r6
            r6 = r5[r11]
            r33 = r5
            boolean r5 = r6 instanceof android.text.style.StrikethroughSpan
            r34 = 0
            if (r5 == 0) goto L_0x0320
            java.lang.String r35 = "<span style='text-decoration:line-through;'>"
            r43 = r1
            r41 = r8
            r42 = r9
            r44 = r12
            r8 = r35
            r35 = r14
            goto L_0x048d
        L_0x0320:
            r41 = r8
            boolean r8 = r6 instanceof android.text.style.ForegroundColorSpan
            if (r8 == 0) goto L_0x0345
            r8 = r6
            android.text.style.ForegroundColorSpan r8 = (android.text.style.ForegroundColorSpan) r8
            int r8 = r8.getForegroundColor()
            java.lang.String r8 = defpackage.y64.K(r8)
            int r35 = defpackage.t0g.a
            java.util.Locale r35 = java.util.Locale.US
            r35 = r14
            java.lang.String r14 = "<span style='color:"
            java.lang.String r8 = defpackage.wj6.k(r14, r8, r9)
            r43 = r1
            r42 = r9
        L_0x0341:
            r44 = r12
            goto L_0x048d
        L_0x0345:
            r35 = r14
            boolean r8 = r6 instanceof android.text.style.BackgroundColorSpan
            if (r8 == 0) goto L_0x0363
            r8 = r6
            android.text.style.BackgroundColorSpan r8 = (android.text.style.BackgroundColorSpan) r8
            int r8 = r8.getBackgroundColor()
            int r14 = defpackage.t0g.a
            java.util.Locale r14 = java.util.Locale.US
            java.lang.String r14 = "<span class='bg_"
            r42 = r9
            java.lang.String r9 = "'>"
            java.lang.String r8 = defpackage.a81.j(r8, r14, r9)
        L_0x0360:
            r43 = r1
            goto L_0x0341
        L_0x0363:
            r42 = r9
            boolean r8 = r6 instanceof defpackage.q27
            if (r8 == 0) goto L_0x036c
            java.lang.String r8 = "<span style='text-combine-upright:all;'>"
            goto L_0x0360
        L_0x036c:
            boolean r8 = r6 instanceof android.text.style.AbsoluteSizeSpan
            if (r8 == 0) goto L_0x0398
            r8 = r6
            android.text.style.AbsoluteSizeSpan r8 = (android.text.style.AbsoluteSizeSpan) r8
            boolean r9 = r8.getDip()
            if (r9 == 0) goto L_0x037f
            int r8 = r8.getSize()
            float r8 = (float) r8
            goto L_0x0385
        L_0x037f:
            int r8 = r8.getSize()
            float r8 = (float) r8
            float r8 = r8 / r1
        L_0x0385:
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            int r9 = defpackage.t0g.a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r14 = "<span style='font-size:%.2fpx;'>"
            java.lang.String r8 = java.lang.String.format(r9, r14, r8)
            goto L_0x0360
        L_0x0398:
            boolean r8 = r6 instanceof android.text.style.RelativeSizeSpan
            if (r8 == 0) goto L_0x03b8
            r8 = r6
            android.text.style.RelativeSizeSpan r8 = (android.text.style.RelativeSizeSpan) r8
            float r8 = r8.getSizeChange()
            float r8 = r8 * r16
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            int r9 = defpackage.t0g.a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r14 = "<span style='font-size:%.2f%%;'>"
            java.lang.String r8 = java.lang.String.format(r9, r14, r8)
            goto L_0x0360
        L_0x03b8:
            boolean r8 = r6 instanceof android.text.style.TypefaceSpan
            if (r8 == 0) goto L_0x03d5
            r8 = r6
            android.text.style.TypefaceSpan r8 = (android.text.style.TypefaceSpan) r8
            java.lang.String r8 = r8.getFamily()
            if (r8 == 0) goto L_0x03d2
            int r9 = defpackage.t0g.a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r9 = "<span style='font-family:\""
            java.lang.String r14 = "\";'>"
            java.lang.String r8 = defpackage.wj6.k(r9, r8, r14)
            goto L_0x0360
        L_0x03d2:
            r8 = r34
            goto L_0x0360
        L_0x03d5:
            boolean r8 = r6 instanceof android.text.style.StyleSpan
            if (r8 == 0) goto L_0x03fd
            r8 = r6
            android.text.style.StyleSpan r8 = (android.text.style.StyleSpan) r8
            int r8 = r8.getStyle()
            r9 = 1
            if (r8 == r9) goto L_0x03f9
            r9 = 2
            if (r8 == r9) goto L_0x03f5
            r9 = 3
            if (r8 == r9) goto L_0x03f1
        L_0x03e9:
            r43 = r1
            r44 = r12
            r8 = r34
            goto L_0x048d
        L_0x03f1:
            java.lang.String r8 = "<b><i>"
            goto L_0x0360
        L_0x03f5:
            java.lang.String r8 = "<i>"
            goto L_0x0360
        L_0x03f9:
            java.lang.String r8 = "<b>"
            goto L_0x0360
        L_0x03fd:
            boolean r8 = r6 instanceof defpackage.vad
            if (r8 == 0) goto L_0x041c
            r8 = r6
            vad r8 = (defpackage.vad) r8
            int r8 = r8.b
            r9 = -1
            if (r8 == r9) goto L_0x0418
            r9 = 1
            if (r8 == r9) goto L_0x0414
            r9 = 2
            if (r8 == r9) goto L_0x0410
            goto L_0x03e9
        L_0x0410:
            java.lang.String r8 = "<ruby style='ruby-position:under;'>"
            goto L_0x0360
        L_0x0414:
            java.lang.String r8 = "<ruby style='ruby-position:over;'>"
            goto L_0x0360
        L_0x0418:
            java.lang.String r8 = "<ruby style='ruby-position:unset;'>"
            goto L_0x0360
        L_0x041c:
            boolean r8 = r6 instanceof android.text.style.UnderlineSpan
            if (r8 == 0) goto L_0x0424
            java.lang.String r8 = "<u>"
            goto L_0x0360
        L_0x0424:
            boolean r8 = r6 instanceof defpackage.kff
            if (r8 == 0) goto L_0x03e9
            r8 = r6
            kff r8 = (defpackage.kff) r8
            int r9 = r8.a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r43 = r1
            int r1 = r8.b
            r44 = r12
            r12 = 1
            if (r1 == r12) goto L_0x0445
            r12 = 2
            if (r1 == r12) goto L_0x043f
            goto L_0x044b
        L_0x043f:
            java.lang.String r1 = "open "
            r14.append(r1)
            goto L_0x044b
        L_0x0445:
            r12 = 2
            java.lang.String r1 = "filled "
            r14.append(r1)
        L_0x044b:
            if (r9 == 0) goto L_0x046b
            r1 = 1
            if (r9 == r1) goto L_0x0465
            if (r9 == r12) goto L_0x045f
            r1 = 3
            if (r9 == r1) goto L_0x0459
            r14.append(r10)
            goto L_0x0470
        L_0x0459:
            java.lang.String r1 = "sesame"
            r14.append(r1)
            goto L_0x0470
        L_0x045f:
            java.lang.String r1 = "dot"
            r14.append(r1)
            goto L_0x0470
        L_0x0465:
            java.lang.String r1 = "circle"
            r14.append(r1)
            goto L_0x0470
        L_0x046b:
            java.lang.String r1 = "none"
            r14.append(r1)
        L_0x0470:
            java.lang.String r1 = r14.toString()
            int r8 = r8.c
            r9 = 2
            if (r8 == r9) goto L_0x047c
            java.lang.String r8 = "over right"
            goto L_0x047e
        L_0x047c:
            java.lang.String r8 = "under left"
        L_0x047e:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r8}
            int r8 = defpackage.t0g.a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>"
            java.lang.String r1 = java.lang.String.format(r8, r9, r1)
            r8 = r1
        L_0x048d:
            if (r5 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof android.text.style.ForegroundColorSpan
            if (r1 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof android.text.style.BackgroundColorSpan
            if (r1 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof defpackage.q27
            if (r1 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof android.text.style.AbsoluteSizeSpan
            if (r1 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof android.text.style.RelativeSizeSpan
            if (r1 != 0) goto L_0x04a7
            boolean r1 = r6 instanceof defpackage.kff
            if (r1 == 0) goto L_0x04aa
        L_0x04a7:
            r5 = 3
            goto L_0x0511
        L_0x04aa:
            boolean r1 = r6 instanceof android.text.style.TypefaceSpan
            if (r1 == 0) goto L_0x04bd
            r1 = r6
            android.text.style.TypefaceSpan r1 = (android.text.style.TypefaceSpan) r1
            java.lang.String r1 = r1.getFamily()
            if (r1 == 0) goto L_0x04b9
            r34 = r38
        L_0x04b9:
            r1 = r34
            r5 = 3
            goto L_0x0513
        L_0x04bd:
            boolean r1 = r6 instanceof android.text.style.StyleSpan
            if (r1 == 0) goto L_0x04df
            r1 = r6
            android.text.style.StyleSpan r1 = (android.text.style.StyleSpan) r1
            int r1 = r1.getStyle()
            r5 = 1
            if (r1 == r5) goto L_0x04db
            r5 = 2
            if (r1 == r5) goto L_0x04d7
            r5 = 3
            if (r1 == r5) goto L_0x04d2
            goto L_0x04d4
        L_0x04d2:
            java.lang.String r34 = "</i></b>"
        L_0x04d4:
            r1 = r34
            goto L_0x0513
        L_0x04d7:
            r5 = 3
            java.lang.String r34 = "</i>"
            goto L_0x04d4
        L_0x04db:
            r5 = 3
            java.lang.String r34 = "</b>"
            goto L_0x04d4
        L_0x04df:
            r5 = 3
            boolean r1 = r6 instanceof defpackage.vad
            if (r1 == 0) goto L_0x050a
            r1 = r6
            vad r1 = (defpackage.vad) r1
            java.lang.String r1 = r1.a
            java.lang.String r1 = defpackage.jge.a(r1)
            r9 = 16
            int r9 = defpackage.g63.f(r9, r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            java.lang.String r9 = "<rt>"
            r12.append(r9)
            r12.append(r1)
            java.lang.String r1 = "</rt></ruby>"
            r12.append(r1)
            java.lang.String r34 = r12.toString()
            goto L_0x04d4
        L_0x050a:
            boolean r1 = r6 instanceof android.text.style.UnderlineSpan
            if (r1 == 0) goto L_0x04d4
            java.lang.String r34 = "</u>"
            goto L_0x04d4
        L_0x0511:
            r1 = r38
        L_0x0513:
            int r9 = r0.getSpanStart(r6)
            int r6 = r0.getSpanEnd(r6)
            if (r8 == 0) goto L_0x054f
            r1.getClass()
            hge r12 = new hge
            r12.<init>(r8, r9, r6, r1)
            java.lang.Object r1 = r4.get(r9)
            ige r1 = (defpackage.ige) r1
            if (r1 != 0) goto L_0x0535
            ige r1 = new ige
            r1.<init>()
            r4.put(r9, r1)
        L_0x0535:
            java.util.ArrayList r1 = r1.a
            r1.add(r12)
            java.lang.Object r1 = r4.get(r6)
            ige r1 = (defpackage.ige) r1
            if (r1 != 0) goto L_0x054a
            ige r1 = new ige
            r1.<init>()
            r4.put(r6, r1)
        L_0x054a:
            java.util.ArrayList r1 = r1.b
            r1.add(r12)
        L_0x054f:
            r1 = 1
            int r11 = r11 + r1
            r6 = r24
            r5 = r33
            r14 = r35
            r8 = r41
            r9 = r42
            r1 = r43
            r12 = r44
            goto L_0x0302
        L_0x0561:
            r41 = r8
            r42 = r9
            r44 = r12
            r35 = r14
            r5 = 3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r6 = r0.length()
            r1.<init>(r6)
            r6 = 0
            r8 = 0
        L_0x0575:
            int r9 = r4.size()
            if (r6 >= r9) goto L_0x05d0
            int r9 = r4.keyAt(r6)
            java.lang.CharSequence r8 = r0.subSequence(r8, r9)
            java.lang.String r8 = defpackage.jge.a(r8)
            r1.append(r8)
            java.lang.Object r8 = r4.get(r9)
            ige r8 = (defpackage.ige) r8
            java.util.ArrayList r11 = r8.b
            oj4 r12 = defpackage.hge.f
            java.util.Collections.sort(r11, r12)
            java.util.ArrayList r11 = r8.b
            java.util.Iterator r11 = r11.iterator()
        L_0x059d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x05af
            java.lang.Object r12 = r11.next()
            hge r12 = (defpackage.hge) r12
            java.lang.String r12 = r12.d
            r1.append(r12)
            goto L_0x059d
        L_0x05af:
            java.util.ArrayList r8 = r8.a
            oj4 r11 = defpackage.hge.e
            java.util.Collections.sort(r8, r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x05ba:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x05cc
            java.lang.Object r11 = r8.next()
            hge r11 = (defpackage.hge) r11
            java.lang.String r11 = r11.c
            r1.append(r11)
            goto L_0x05ba
        L_0x05cc:
            r11 = 1
            int r6 = r6 + r11
            r8 = r9
            goto L_0x0575
        L_0x05d0:
            int r4 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r8, r4)
            java.lang.String r0 = defpackage.jge.a(r0)
            r1.append(r0)
            wsb r0 = new wsb
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2)
        L_0x05e8:
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05f0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x061c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r3.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r3.put(r2, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0617
            java.lang.Object r2 = r3.get(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0615
            goto L_0x0617
        L_0x0615:
            r2 = 0
            goto L_0x0618
        L_0x0617:
            r2 = 1
        L_0x0618:
            defpackage.y64.j(r2)
            goto L_0x05f0
        L_0x061c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Float r24 = java.lang.Float.valueOf(r13)
            java.lang.Integer r33 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r34 = java.lang.Integer.valueOf(r17)
            r12 = r44
            float r2 = r12.z0
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x0657
            r6 = r35
            r4 = 2
            if (r6 == r4) goto L_0x0640
            r4 = 1
            if (r6 != r4) goto L_0x063d
            goto L_0x0640
        L_0x063d:
            java.lang.String r4 = "skewX"
            goto L_0x0642
        L_0x0640:
            java.lang.String r4 = "skewY"
        L_0x0642:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            int r4 = defpackage.t0g.a
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r6 = "%s(%.2fdeg)"
            java.lang.String r2 = java.lang.String.format(r4, r6, r2)
            r35 = r2
            goto L_0x0659
        L_0x0657:
            r35 = r22
        L_0x0659:
            r22 = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35}
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r4 = "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>"
            java.lang.String r1 = java.lang.String.format(r2, r4, r1)
            r2 = r39
            r2.append(r1)
            java.lang.String r1 = "<span class='default_bg'>"
            r2.append(r1)
            java.lang.Object r0 = r0.a
            java.lang.String r0 = (java.lang.String) r0
            android.text.Layout$Alignment r1 = r12.c
            if (r1 == 0) goto L_0x06af
            int[] r4 = defpackage.wlg.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            r4 = 1
            if (r1 == r4) goto L_0x068d
            r4 = 2
            if (r1 == r4) goto L_0x068a
            r1 = r37
            goto L_0x0690
        L_0x068a:
            r1 = r36
            goto L_0x0690
        L_0x068d:
            r4 = 2
            r1 = r21
        L_0x0690:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "<span style='display:inline-block; text-align:"
            r6.<init>(r8)
            r6.append(r1)
            r1 = r42
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r2.append(r1)
            r2.append(r0)
            r0 = r38
            r2.append(r0)
            goto L_0x06b3
        L_0x06af:
            r4 = 2
            r2.append(r0)
        L_0x06b3:
            java.lang.String r0 = "</span></div>"
            r2.append(r0)
            r0 = 1
            int r7 = r7 + r0
            r1 = r0
            r9 = r4
            r11 = r5
            r6 = r40
            r8 = r41
            r5 = 1067030938(0x3f99999a, float:1.2)
            r0 = r46
            goto L_0x00ae
        L_0x06c8:
            java.lang.String r0 = "</div></body></html>"
            r2.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<html><head><style>"
            r0.<init>(r1)
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x06dc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x06ff
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r5 = "{"
            r0.append(r5)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            goto L_0x06dc
        L_0x06ff:
            java.lang.String r1 = "</style></head>"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.insert(r1, r0)
            java.lang.String r0 = r2.toString()
            java.nio.charset.Charset r1 = defpackage.x22.c
            byte[] r0 = r0.getBytes(r1)
            r1 = 1
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "base64"
            r3 = r46
            vlg r3 = r3.b
            r3.loadData(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlg.c():void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.c.isEmpty()) {
            c();
        }
    }
}
