package defpackage;

/* renamed from: v53  reason: default package */
public abstract class v53 {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v53.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r33, android.content.res.XmlResourceParser r34, android.util.AttributeSet r35, android.content.res.Resources.Theme r36) {
        /*
            r0 = r33
            r1 = r35
            r2 = r36
            java.lang.String r3 = r34.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0361
            int r3 = r34.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r34.next()
            if (r9 == r4) goto L_0x0350
            int r10 = r34.getDepth()
            if (r10 >= r3) goto L_0x002f
            r11 = 3
            if (r9 == r11) goto L_0x0350
        L_0x002f:
            r11 = 2
            if (r9 != r11) goto L_0x0040
            if (r10 > r3) goto L_0x0040
            java.lang.String r9 = r34.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0046
        L_0x0040:
            r28 = r3
            r17 = r4
            goto L_0x0343
        L_0x0046:
            int[] r9 = defpackage.foc.ColorStateListItem
            if (r2 != 0) goto L_0x004f
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x0053
        L_0x004f:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x0053:
            int r10 = defpackage.foc.ColorStateListItem_android_color
            r12 = -1
            int r10 = r9.getResourceId(r10, r12)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            r14 = 31
            if (r10 == r12) goto L_0x0093
            java.lang.ThreadLocal r12 = a
            java.lang.Object r15 = r12.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x0073
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r12.set(r15)
        L_0x0073:
            r0.getValue(r10, r15, r4)
            int r12 = r15.type
            r15 = 28
            if (r12 < r15) goto L_0x007f
            if (r12 > r14) goto L_0x007f
            goto L_0x0093
        L_0x007f:
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ Exception -> 0x008c }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008c }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008c }
            goto L_0x0099
        L_0x008c:
            int r10 = defpackage.foc.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
            goto L_0x0099
        L_0x0093:
            int r10 = defpackage.foc.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
        L_0x0099:
            int r12 = defpackage.foc.ColorStateListItem_android_alpha
            boolean r12 = r9.hasValue(r12)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00aa
            int r12 = defpackage.foc.ColorStateListItem_android_alpha
            float r12 = r9.getFloat(r12, r13)
            goto L_0x00ba
        L_0x00aa:
            int r12 = defpackage.foc.ColorStateListItem_alpha
            boolean r12 = r9.hasValue(r12)
            if (r12 == 0) goto L_0x00b9
            int r12 = defpackage.foc.ColorStateListItem_alpha
            float r12 = r9.getFloat(r12, r13)
            goto L_0x00ba
        L_0x00b9:
            r12 = r13
        L_0x00ba:
            int r15 = android.os.Build.VERSION.SDK_INT
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r15 < r14) goto L_0x00cf
            int r14 = defpackage.foc.ColorStateListItem_android_lStar
            boolean r14 = r9.hasValue(r14)
            if (r14 == 0) goto L_0x00cf
            int r14 = defpackage.foc.ColorStateListItem_android_lStar
            float r11 = r9.getFloat(r14, r11)
            goto L_0x00d5
        L_0x00cf:
            int r14 = defpackage.foc.ColorStateListItem_lStar
            float r11 = r9.getFloat(r14, r11)
        L_0x00d5:
            r9.recycle()
            int r9 = r35.getAttributeCount()
            int[] r14 = new int[r9]
            r4 = r7
            r15 = r4
        L_0x00e0:
            if (r15 >= r9) goto L_0x010e
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x0106
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x0106
            int r7 = defpackage.adc.alpha
            if (r13 == r7) goto L_0x0106
            int r7 = defpackage.adc.lStar
            if (r13 == r7) goto L_0x0106
            int r7 = r4 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            int r13 = -r13
        L_0x0103:
            r14[r4] = r13
            r4 = r7
        L_0x0106:
            int r15 = r15 + 1
            r0 = r33
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00e0
        L_0x010e:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r4)
            r4 = 0
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x0121
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x0121
            r7 = 1
        L_0x011e:
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0123
        L_0x0121:
            r7 = 0
            goto L_0x011e
        L_0x0123:
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x0130
            if (r7 != 0) goto L_0x0130
            r4 = r0
            r28 = r3
            r17 = 1
            goto L_0x02ff
        L_0x0130:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r12
            r12 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r12
            int r12 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r12 = defpackage.h88.l(r12, r14, r13)
            if (r7 == 0) goto L_0x02f2
            yq1 r7 = defpackage.yq1.a(r10)
            bdg r10 = defpackage.bdg.k
            float r13 = r7.b
            double r14 = (double) r13
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x0168
            int r14 = java.lang.Math.round(r11)
            double r14 = (double) r14
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x0168
            int r14 = java.lang.Math.round(r11)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x016f
        L_0x0168:
            r4 = r0
            r28 = r3
            r17 = 1
            goto L_0x02ed
        L_0x016f:
            float r7 = r7.a
            int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x0177
            r7 = r4
            goto L_0x017d
        L_0x0177:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r7 = java.lang.Math.min(r14, r7)
        L_0x017d:
            r20 = r4
            r15 = r13
            r14 = 0
            r19 = 1
        L_0x0183:
            float r21 = r20 - r13
            float r21 = java.lang.Math.abs(r21)
            r22 = 1053609165(0x3ecccccd, float:0.4)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x02dc
            r21 = 1148846080(0x447a0000, float:1000.0)
            r23 = r4
            r24 = r9
            r22 = r21
            r25 = 0
        L_0x019a:
            float r26 = r23 - r24
            float r26 = java.lang.Math.abs(r26)
            r27 = 1008981770(0x3c23d70a, float:0.01)
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            r27 = 1073741824(0x40000000, float:2.0)
            if (r26 <= 0) goto L_0x0291
            float r26 = r24 - r23
            float r26 = r26 / r27
            float r4 = r26 + r23
            yq1 r9 = defpackage.yq1.b(r4, r15, r7)
            bdg r1 = defpackage.bdg.k
            int r1 = r9.c(r1)
            int r9 = android.graphics.Color.red(r1)
            float r9 = defpackage.hi7.z(r9)
            int r28 = android.graphics.Color.green(r1)
            float r28 = defpackage.hi7.z(r28)
            int r29 = android.graphics.Color.blue(r1)
            float r29 = defpackage.hi7.z(r29)
            float[][] r30 = defpackage.hi7.f
            r17 = 1
            r30 = r30[r17]
            r18 = 0
            r31 = r30[r18]
            float r9 = r9 * r31
            r31 = r30[r17]
            float r28 = r28 * r31
            float r28 = r28 + r9
            r9 = 2
            r16 = r30[r9]
            float r29 = r29 * r16
            float r29 = r29 + r28
            r16 = 1120403456(0x42c80000, float:100.0)
            float r9 = r29 / r16
            r28 = 1007753895(0x3c111aa7, float:0.008856452)
            int r28 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
            if (r28 > 0) goto L_0x01fd
            r28 = 1147261687(0x4461d2f7, float:903.2963)
            float r9 = r9 * r28
            r28 = r3
            goto L_0x020c
        L_0x01fd:
            r28 = r3
            double r2 = (double) r9
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r9 = r2 - r3
        L_0x020c:
            float r2 = r11 - r9
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0264
            yq1 r1 = defpackage.yq1.a(r1)
            float r3 = r1.c
            r29 = r2
            float r2 = r1.b
            yq1 r2 = defpackage.yq1.b(r3, r2, r7)
            float r3 = r1.d
            r30 = r4
            float r4 = r2.d
            float r3 = r3 - r4
            float r4 = r1.e
            r31 = r7
            float r7 = r2.e
            float r4 = r4 - r7
            float r7 = r1.f
            float r2 = r2.f
            float r7 = r7 - r2
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r4 = r4 + r3
            float r7 = r7 * r7
            float r7 = r7 + r4
            double r2 = (double) r7
            double r2 = java.lang.Math.sqrt(r2)
            r4 = r0
            r7 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0262
            r22 = r0
            r25 = r7
            r21 = r29
        L_0x0262:
            r0 = 0
            goto L_0x026c
        L_0x0264:
            r30 = r4
            r31 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = r0
            goto L_0x0262
        L_0x026c:
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0277
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0277
        L_0x0274:
            r2 = r25
            goto L_0x02a1
        L_0x0277:
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x027e
            r23 = r30
            goto L_0x0280
        L_0x027e:
            r24 = r30
        L_0x0280:
            r1 = r35
            r2 = r36
            r9 = r16
            r3 = r28
            r7 = r31
            r32 = r4
            r4 = r0
            r0 = r32
            goto L_0x019a
        L_0x0291:
            r28 = r3
            r31 = r7
            r16 = r9
            r1 = 1065353216(0x3f800000, float:1.0)
            r17 = 1
            r32 = r4
            r4 = r0
            r0 = r32
            goto L_0x0274
        L_0x02a1:
            if (r19 == 0) goto L_0x02c4
            if (r2 == 0) goto L_0x02ab
            int r0 = r2.c(r10)
        L_0x02a9:
            r10 = r0
            goto L_0x02f7
        L_0x02ab:
            float r2 = r13 - r20
            float r2 = r2 / r27
            float r15 = r2 + r20
            r1 = r35
            r2 = r36
            r9 = r16
            r3 = r28
            r7 = r31
            r19 = 0
        L_0x02bd:
            r32 = r4
            r4 = r0
            r0 = r32
            goto L_0x0183
        L_0x02c4:
            if (r2 != 0) goto L_0x02c8
            r13 = r15
            goto L_0x02cb
        L_0x02c8:
            r14 = r2
            r20 = r15
        L_0x02cb:
            float r2 = r13 - r20
            float r2 = r2 / r27
            float r15 = r2 + r20
            r1 = r35
            r2 = r36
            r9 = r16
            r3 = r28
            r7 = r31
            goto L_0x02bd
        L_0x02dc:
            r4 = r0
            r28 = r3
            r17 = 1
            if (r14 != 0) goto L_0x02e8
            int r0 = defpackage.hi7.x(r11)
            goto L_0x02a9
        L_0x02e8:
            int r0 = r14.c(r10)
            goto L_0x02a9
        L_0x02ed:
            int r0 = defpackage.hi7.x(r11)
            goto L_0x02a9
        L_0x02f2:
            r4 = r0
            r28 = r3
            r17 = 1
        L_0x02f7:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r12 << 24
            r10 = r0 | r1
        L_0x02ff:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            r3 = 4
            if (r0 <= r1) goto L_0x0314
            if (r8 > r3) goto L_0x030b
            r1 = r2
            goto L_0x030d
        L_0x030b:
            int r1 = r8 * 2
        L_0x030d:
            int[] r1 = new int[r1]
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r1, r7, r8)
            r5 = r1
        L_0x0314:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x0331
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r8 > r3) goto L_0x0324
            goto L_0x0326
        L_0x0324:
            int r2 = r8 * 2
        L_0x0326:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x0331:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r1 = r35
            r2 = r36
            r8 = r0
            r4 = r17
            r3 = r28
            r7 = 0
            r0 = r33
            goto L_0x0020
        L_0x0343:
            r0 = r33
            r1 = r35
            r2 = r36
            r4 = r17
            r3 = r28
            r7 = 0
            goto L_0x0020
        L_0x0350:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0361:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r34.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v53.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
