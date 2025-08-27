package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: cu2  reason: default package */
public final class cu2 {
    public final Context a;
    public final Function0 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public cu2(Context context, Function0 function0, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = context;
        this.b = function0;
        this.c = lazy;
        this.d = lazy2;
        this.e = lazy3;
        this.f = lazy4;
        this.g = lazy5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0238, code lost:
        if (r3.z() == true) goto L_0x0240;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xk2 a(defpackage.a32 r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            vk3 r3 = r38.m()
            kotlin.Lazy r4 = r0.c
            java.lang.Object r4 = r4.getValue()
            x23 r4 = (defpackage.x23) r4
            qjd r4 = (defpackage.qjd) r4
            long r4 = r4.s()
            m72 r6 = r1.b
            boolean r4 = r6.h(r4)
            r5 = 1
            if (r4 != 0) goto L_0x0047
            if (r3 == 0) goto L_0x0047
            kotlin.Lazy r7 = r0.e
            java.lang.Object r7 = r7.getValue()
            rtb r7 = (defpackage.rtb) r7
            long r8 = r3.r()
            ptb r7 = r7.e()
            mtb r7 = r7.b(r8)
            int r7 = r7.a
            r8 = 10
            if (r7 == r8) goto L_0x0044
            r8 = 20
            if (r7 == r8) goto L_0x0044
            r8 = 40
            if (r7 == r8) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r19 = r5
            goto L_0x0049
        L_0x0047:
            r19 = 0
        L_0x0049:
            if (r4 != 0) goto L_0x0055
            if (r3 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            kl0 r7 = defpackage.kl0.c
            java.lang.String r7 = r3.t(r7)
            goto L_0x005d
        L_0x0055:
            kl0 r7 = defpackage.kl0.b
            jl0 r8 = defpackage.jl0.a
            java.lang.String r7 = r1.h(r7, r8)
        L_0x005d:
            r8 = 0
            if (r7 == 0) goto L_0x0070
            boolean r9 = kotlin.text.StringsKt.isBlank(r7)
            if (r9 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r7 = r8
        L_0x0068:
            if (r7 == 0) goto L_0x0070
            android.net.Uri r7 = defpackage.o5a.x(r7)
            r12 = r7
            goto L_0x0071
        L_0x0070:
            r12 = r8
        L_0x0071:
            kotlin.jvm.functions.Function0 r7 = r0.b
            java.lang.Object r7 = r7.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x008a
            m72 r7 = r1.b
            d72 r7 = r7.a()
            long r13 = r7.e
            r28 = r13
            goto L_0x008c
        L_0x008a:
            r28 = 0
        L_0x008c:
            if (r3 == 0) goto L_0x00b4
            boolean r7 = r3.w()
            if (r7 != r5) goto L_0x00b4
            java.lang.Class<cu2> r7 = defpackage.cu2.class
            java.lang.String r7 = r7.getName()
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x009f
            goto L_0x00b4
        L_0x009f:
            boolean r13 = r11.c()
            if (r13 == 0) goto L_0x00b4
            w78 r13 = defpackage.w78.o
            long r14 = r3.r()
            java.lang.String r6 = "ONEME-6453| show chat with blocked user, userId="
            java.lang.String r6 = defpackage.wj6.i(r14, r6)
            r11.d(r13, r7, r6, r8)
        L_0x00b4:
            kotlin.Lazy r6 = r0.f
            java.lang.Object r6 = r6.getValue()
            fq2 r6 = (defpackage.fq2) r6
            vb2 r6 = (defpackage.vb2) r6
            r6.getClass()
            pb2 r7 = new pb2
            r7.<init>(r1)
            sb2 r6 = r6.w
            java.lang.Object r6 = r6.c(r7)
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x00d7
            boolean r7 = kotlin.text.StringsKt.isBlank(r7)
            if (r7 == 0) goto L_0x00d8
        L_0x00d7:
            r6 = r8
        L_0x00d8:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 != 0) goto L_0x00e6
            if (r4 == 0) goto L_0x00e6
            android.content.Context r4 = r0.a
            int r6 = defpackage.jad.f
            java.lang.String r6 = r4.getString(r6)
        L_0x00e6:
            long r13 = r1.a
            kotlin.Lazy r4 = r0.f
            java.lang.Object r4 = r4.getValue()
            fq2 r4 = (defpackage.fq2) r4
            vb2 r4 = (defpackage.vb2) r4
            r4.getClass()
            r38.l0()
            java.lang.CharSequence r4 = r1.X
            kotlin.Lazy r7 = r0.g
            java.lang.Object r7 = r7.getValue()
            eq2 r7 = (defpackage.eq2) r7
            java.lang.CharSequence r7 = r7.a(r1)
            if (r6 != 0) goto L_0x010a
            java.lang.String r6 = ""
        L_0x010a:
            r15 = r6
            kotlin.Lazy r6 = r0.f
            java.lang.Object r6 = r6.getValue()
            fq2 r6 = (defpackage.fq2) r6
            vb2 r6 = (defpackage.vb2) r6
            r6.getClass()
            m72 r11 = r1.b
            pt4 r11 = r11.f0
            if (r11 != 0) goto L_0x0122
        L_0x011e:
            r5 = r8
            r23 = r15
            goto L_0x018a
        L_0x0122:
            java.lang.CharSequence r11 = r11.getText()
            if (r11 != 0) goto L_0x0129
            goto L_0x011e
        L_0x0129:
            int r8 = defpackage.qad.r2
            android.content.Context r9 = r6.a
            java.lang.String r8 = r9.getString(r8)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            aif r5 = new aif
            js9 r2 = defpackage.fu4.k
            fu4 r2 = r2.e(r9)
            k2b r2 = r2.f()
            gl1 r9 = new gl1
            r23 = r15
            r15 = 6
            r9.<init>(r15)
            r5.<init>(r2, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            defpackage.j4b.b(r10, r8, r2)
            bge r2 = new bge
            float r5 = (float) r15
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 * r8
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r2.<init>(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r5 = 8288(0x2060, float:1.1614E-41)
            defpackage.j4b.a(r10, r5, r2)
            kotlin.Lazy r2 = r6.d
            java.lang.Object r2 = r2.getValue()
            yva r2 = (defpackage.yva) r2
            u25 r2 = r2.k
            java.lang.CharSequence r2 = r2.c(r11)
            r10.append(r2)
            int r2 = defpackage.gge.a
            r2 = 1
            gge r5 = defpackage.sq6.A(r10, r2)
        L_0x018a:
            kotlin.Lazy r2 = r0.f
            java.lang.Object r2 = r2.getValue()
            fq2 r2 = (defpackage.fq2) r2
            long r8 = r1.a
            vb2 r2 = (defpackage.vb2) r2
            java.lang.CharSequence r2 = r2.f(r8)
            long r32 = r38.n()
            r8 = 0
            int r6 = (r32 > r8 ? 1 : (r32 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01a6
            r6 = 0
            goto L_0x01cc
        L_0x01a6:
            java.lang.String r6 = r1.x0
            if (r6 != 0) goto L_0x01ca
            eq2 r6 = r1.z0
            hs7 r6 = r6.b
            java.lang.Object r6 = r6.get()
            yva r6 = (defpackage.yva) r6
            a33 r8 = r6.c
            java.util.Locale r31 = r8.u()
            long r34 = r8.m()
            android.content.Context r6 = r6.a
            r36 = 1
            r30 = r6
            java.lang.String r6 = defpackage.j4b.r(r30, r31, r32, r34, r36)
            r1.x0 = r6
        L_0x01ca:
            java.lang.String r6 = r1.x0
        L_0x01cc:
            a89 r8 = r1.c
            if (r8 == 0) goto L_0x01ec
            vk3 r8 = r8.b
            if (r8 == 0) goto L_0x01ec
            long r8 = r8.r()
            kotlin.Lazy r10 = r0.c
            java.lang.Object r10 = r10.getValue()
            x23 r10 = (defpackage.x23) r10
            qjd r10 = (defpackage.qjd) r10
            long r10 = r10.s()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x01ec
            r8 = 1
            goto L_0x01ed
        L_0x01ec:
            r8 = 0
        L_0x01ed:
            a89 r9 = r1.c
            if (r9 == 0) goto L_0x0229
            if (r8 != 0) goto L_0x01f4
            goto L_0x0229
        L_0x01f4:
            ha9 r8 = r9.a
            oa9 r8 = r8.X
            if (r8 != 0) goto L_0x01fd
            r8 = -1
        L_0x01fb:
            r9 = 1
            goto L_0x0206
        L_0x01fd:
            int[] r9 = defpackage.bu2.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r9[r8]
            goto L_0x01fb
        L_0x0206:
            if (r8 == r9) goto L_0x0226
            r9 = 2
            if (r8 == r9) goto L_0x0223
            r9 = 3
            if (r8 == r9) goto L_0x0220
            r9 = 4
            if (r8 == r9) goto L_0x021d
            r9 = 5
            if (r8 != r9) goto L_0x0217
            wk2 r8 = defpackage.wk2.v
            goto L_0x022b
        L_0x0217:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x021d:
            wk2 r8 = defpackage.wk2.o
            goto L_0x022b
        L_0x0220:
            wk2 r8 = defpackage.wk2.c
            goto L_0x022b
        L_0x0223:
            wk2 r8 = defpackage.wk2.b
            goto L_0x022b
        L_0x0226:
            wk2 r8 = defpackage.wk2.a
            goto L_0x022b
        L_0x0229:
            wk2 r8 = defpackage.wk2.a
        L_0x022b:
            boolean r9 = r38.Y()
            if (r9 != 0) goto L_0x023f
            if (r3 == 0) goto L_0x023b
            boolean r3 = r3.z()
            r9 = 1
            if (r3 != r9) goto L_0x023c
            goto L_0x0240
        L_0x023b:
            r9 = 1
        L_0x023c:
            r20 = 0
            goto L_0x0242
        L_0x023f:
            r9 = 1
        L_0x0240:
            r20 = r9
        L_0x0242:
            long r21 = r38.p()
            m72 r3 = r1.b
            int r3 = r3.m
            kotlin.Lazy r10 = r0.c
            java.lang.Object r10 = r10.getValue()
            x23 r10 = (defpackage.x23) r10
            boolean r25 = r1.X(r10)
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            bud r0 = (defpackage.bud) r0
            r0.getClass()
            gqc r0 = defpackage.gqc.a
            gqc r0 = defpackage.gqc.a
            m72 r0 = r1.b
            java.lang.String r0 = r0.m0
            if (r0 == 0) goto L_0x0275
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0272
            goto L_0x0275
        L_0x0272:
            r26 = r9
            goto L_0x0277
        L_0x0275:
            r26 = 0
        L_0x0277:
            boolean r27 = r38.D()
            vk3 r0 = r38.m()
            if (r0 == 0) goto L_0x0292
            long r9 = r0.r()
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            boolean r9 = r38.i0()
            if (r9 == 0) goto L_0x0292
            r30 = r0
            goto L_0x0294
        L_0x0292:
            r30 = 0
        L_0x0294:
            long r31 = r38.g()
            r38.m0()
            java.lang.CharSequence r0 = r1.v0
            xk2 r1 = new xk2
            r9 = r1
            r10 = r13
            r13 = r4
            r14 = r7
            r15 = r23
            r16 = r5
            r17 = r2
            r18 = r6
            r23 = r8
            r24 = r3
            r33 = r0
            r9.<init>(r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu2.a(a32):xk2");
    }
}
