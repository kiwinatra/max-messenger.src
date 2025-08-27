package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import sun.misc.Unsafe;

/* renamed from: b2h  reason: default package */
public final class b2h implements l2h {
    public static final int[] k = new int[0];
    public static final Unsafe l = k3h.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final azg e;
    public final int[] f;
    public final int g;
    public final int h;
    public final g1h i;
    public final c3h j;

    public b2h(int[] iArr, Object[] objArr, int i2, int i3, azg azg, int[] iArr2, int i4, int i5, g1h g1h, c3h c3h, yzg yzg) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.i = g1h;
        this.j = c3h;
        this.e = azg;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder r = rae.r("Field ", str, " for ", name, " not found. Known fields are ");
            r.append(arrays);
            throw new RuntimeException(r.toString());
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p0h) {
            return ((p0h) obj).l();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.b2h u(defpackage.j2h r33, defpackage.g1h r34, defpackage.c3h r35, defpackage.yzg r36) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof defpackage.j2h
            if (r1 == 0) goto L_0x0402
            java.lang.String r1 = r33.c()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0023
            r4 = 1
        L_0x0019:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0024
            r4 = r7
            goto L_0x0019
        L_0x0023:
            r7 = 1
        L_0x0024:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0043
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0030:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0040
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0030
        L_0x0040:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0043:
            if (r7 != 0) goto L_0x0053
            int[] r7 = k
            r9 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r16 = r14
            r15 = r7
            r7 = r16
            goto L_0x0167
        L_0x0053:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0072
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x005f:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x006f
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x005f
        L_0x006f:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0072:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0091
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007e:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x007e
        L_0x008e:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0091:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x009d:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00ad
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x009d
        L_0x00ad:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b0:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00cf
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bc:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto L_0x00cc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bc
        L_0x00cc:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00cf:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r6) goto L_0x00ee
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00db:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00eb
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00db
        L_0x00eb:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00ee:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x010d
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fa:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x010a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fa
        L_0x010a:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x010d:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x012e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0119:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x012a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0119
        L_0x012a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x012e:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0151
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013a:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x014c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013a
        L_0x014c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0151:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r13 = r9
            r9 = r16
            r16 = r14
            r14 = r10
            r32 = r7
            r7 = r4
            r4 = r15
            r15 = r32
        L_0x0167:
            sun.misc.Unsafe r10 = l
            java.lang.Object[] r17 = r33.d()
            azg r18 = r33.a()
            java.lang.Class r3 = r18.getClass()
            int r18 = r16 + r12
            int r12 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r22 = r16
            r23 = r18
            r20 = 0
            r21 = 0
        L_0x0187:
            if (r4 >= r2) goto L_0x03e5
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x01af
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r24
            r24 = 13
        L_0x0197:
            int r25 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r6) goto L_0x01a9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r24
            r4 = r4 | r8
            int r24 = r24 + 13
            r8 = r25
            goto L_0x0197
        L_0x01a9:
            int r8 = r8 << r24
            r4 = r4 | r8
            r8 = r25
            goto L_0x01b1
        L_0x01af:
            r8 = r24
        L_0x01b1:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r6) goto L_0x01d7
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bf:
            int r26 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x01d1
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r24
            r8 = r8 | r5
            int r24 = r24 + 13
            r5 = r26
            goto L_0x01bf
        L_0x01d1:
            int r5 = r5 << r24
            r8 = r8 | r5
            r5 = r26
            goto L_0x01d9
        L_0x01d7:
            r5 = r24
        L_0x01d9:
            r6 = r8 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x01e3
            int r6 = r20 + 1
            r15[r20] = r21
            r20 = r6
        L_0x01e3:
            r6 = r8 & 255(0xff, float:3.57E-43)
            r0 = r8 & 2048(0x800, float:2.87E-42)
            r26 = r2
            r2 = 51
            if (r6 < r2) goto L_0x029f
            int r2 = r5 + 1
            char r5 = r1.charAt(r5)
            r27 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r2) goto L_0x0221
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r30 = 13
            r32 = r27
            r27 = r5
            r5 = r32
        L_0x0204:
            int r31 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r2) goto L_0x021a
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r30
            r27 = r27 | r2
            int r30 = r30 + 13
            r5 = r31
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0204
        L_0x021a:
            int r2 = r5 << r30
            r5 = r27 | r2
            r2 = r31
            goto L_0x0223
        L_0x0221:
            r2 = r27
        L_0x0223:
            r27 = r2
            int r2 = r6 + -51
            r30 = r14
            r14 = 9
            if (r2 == r14) goto L_0x0231
            r14 = 17
            if (r2 != r14) goto L_0x0233
        L_0x0231:
            r14 = 1
            goto L_0x0251
        L_0x0233:
            r14 = 12
            if (r2 != r14) goto L_0x025e
            int r2 = r33.b()
            r14 = 1
            if (r2 == r14) goto L_0x0243
            if (r0 == 0) goto L_0x0241
            goto L_0x0243
        L_0x0241:
            r0 = 0
            goto L_0x025e
        L_0x0243:
            int r2 = r9 + 1
            int r25 = r21 / 3
            int r25 = r25 + r25
            int r25 = r25 + 1
            r9 = r17[r9]
            r12[r25] = r9
        L_0x024f:
            r9 = r2
            goto L_0x025e
        L_0x0251:
            int r2 = r9 + 1
            int r25 = r21 / 3
            int r25 = r25 + r25
            int r28 = r25 + 1
            r9 = r17[r9]
            r12[r28] = r9
            goto L_0x024f
        L_0x025e:
            int r5 = r5 + r5
            r2 = r17[r5]
            boolean r14 = r2 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x026a
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L_0x0267:
            r31 = r13
            goto L_0x0273
        L_0x026a:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = E(r3, r2)
            r17[r5] = r2
            goto L_0x0267
        L_0x0273:
            long r13 = r10.objectFieldOffset(r2)
            int r2 = (int) r13
            int r5 = r5 + 1
            r13 = r17[r5]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0283
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x028b
        L_0x0283:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = E(r3, r13)
            r17[r5] = r13
        L_0x028b:
            long r13 = r10.objectFieldOffset(r13)
            int r5 = (int) r13
            r29 = r0
            r25 = r1
            r28 = r4
            r14 = r5
            r4 = r27
            r0 = 55296(0xd800, float:7.7486E-41)
            r5 = 0
            goto L_0x03a9
        L_0x029f:
            r31 = r13
            r30 = r14
            int r2 = r9 + 1
            r13 = r17[r9]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = E(r3, r13)
            r14 = 9
            if (r6 == r14) goto L_0x02b5
            r14 = 17
            if (r6 != r14) goto L_0x02ba
        L_0x02b5:
            r28 = r4
            r4 = 1
            goto L_0x0324
        L_0x02ba:
            r14 = 27
            if (r6 == r14) goto L_0x0316
            r14 = 49
            if (r6 != r14) goto L_0x02c8
            int r9 = r9 + 2
            r28 = r4
            r4 = 1
            goto L_0x031b
        L_0x02c8:
            r14 = 12
            if (r6 == r14) goto L_0x02fc
            r14 = 30
            if (r6 == r14) goto L_0x02fc
            r14 = 44
            if (r6 != r14) goto L_0x02d5
            goto L_0x02fc
        L_0x02d5:
            r14 = 50
            if (r6 != r14) goto L_0x02f3
            int r14 = r9 + 2
            int r28 = r22 + 1
            r15[r22] = r21
            int r22 = r21 / 3
            r2 = r17[r2]
            int r22 = r22 + r22
            r12[r22] = r2
            if (r0 == 0) goto L_0x02f7
            int r22 = r22 + 1
            int r2 = r9 + 3
            r9 = r17[r14]
            r12[r22] = r9
            r22 = r28
        L_0x02f3:
            r28 = r4
            r4 = 1
            goto L_0x032e
        L_0x02f7:
            r2 = r14
            r22 = r28
            r0 = 0
            goto L_0x02f3
        L_0x02fc:
            int r14 = r33.b()
            r28 = r4
            r4 = 1
            if (r14 == r4) goto L_0x030a
            if (r0 == 0) goto L_0x0308
            goto L_0x030a
        L_0x0308:
            r0 = 0
            goto L_0x032e
        L_0x030a:
            int r9 = r9 + 2
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r4
            r2 = r17[r2]
            r12[r14] = r2
        L_0x0314:
            r2 = r9
            goto L_0x032e
        L_0x0316:
            r28 = r4
            r4 = 1
            int r9 = r9 + 2
        L_0x031b:
            int r14 = r21 / 3
            int r14 = r14 + r14
            int r14 = r14 + r4
            r2 = r17[r2]
            r12[r14] = r2
            goto L_0x0314
        L_0x0324:
            int r9 = r21 / 3
            int r9 = r9 + r9
            int r9 = r9 + r4
            java.lang.Class r14 = r13.getType()
            r12[r9] = r14
        L_0x032e:
            long r13 = r10.objectFieldOffset(r13)
            int r9 = (int) r13
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == 0) goto L_0x038c
            r13 = 17
            if (r6 > r13) goto L_0x038c
            int r13 = r5 + 1
            char r5 = r1.charAt(r5)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r14) goto L_0x0364
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r24 = 13
        L_0x034d:
            int r25 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x035f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r24
            r5 = r5 | r13
            int r24 = r24 + 13
            r13 = r25
            goto L_0x034d
        L_0x035f:
            int r13 = r13 << r24
            r5 = r5 | r13
            r13 = r25
        L_0x0364:
            int r24 = r7 + r7
            int r25 = r5 / 32
            int r25 = r25 + r24
            r4 = r17[r25]
            boolean r14 = r4 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0377
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
        L_0x0372:
            r29 = r0
            r25 = r1
            goto L_0x0380
        L_0x0377:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = E(r3, r4)
            r17[r25] = r4
            goto L_0x0372
        L_0x0380:
            long r0 = r10.objectFieldOffset(r4)
            int r0 = (int) r0
            int r5 = r5 % 32
            r14 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0395
        L_0x038c:
            r29 = r0
            r25 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r13 = r5
            r5 = 0
        L_0x0395:
            r1 = 18
            if (r6 < r1) goto L_0x03a3
            r1 = 49
            if (r6 > r1) goto L_0x03a3
            int r1 = r23 + 1
            r15[r23] = r9
            r23 = r1
        L_0x03a3:
            r4 = r13
            r32 = r9
            r9 = r2
            r2 = r32
        L_0x03a9:
            int r1 = r21 + 1
            r11[r21] = r28
            int r13 = r21 + 2
            r0 = r8 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b7
        L_0x03b6:
            r0 = 0
        L_0x03b7:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x03be
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03bf
        L_0x03be:
            r8 = 0
        L_0x03bf:
            if (r29 == 0) goto L_0x03c4
            r27 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03c6
        L_0x03c4:
            r27 = 0
        L_0x03c6:
            int r6 = r6 << 20
            r0 = r0 | r8
            r0 = r0 | r27
            r0 = r0 | r6
            r0 = r0 | r2
            r11[r1] = r0
            int r21 = r21 + 3
            int r0 = r5 << 20
            r0 = r0 | r14
            r11[r13] = r0
            r0 = r33
            r1 = r25
            r2 = r26
            r14 = r30
            r13 = r31
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0187
        L_0x03e5:
            r31 = r13
            r30 = r14
            b2h r0 = new b2h
            azg r14 = r33.a()
            r9 = r0
            r10 = r11
            r11 = r12
            r12 = r31
            r13 = r30
            r17 = r18
            r18 = r34
            r19 = r35
            r20 = r36
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0402:
            defpackage.rae.w(r33)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2h.u(j2h, g1h, c3h, yzg):b2h");
    }

    public static int v(long j2, Object obj) {
        return ((Integer) k3h.i(j2, obj)).intValue();
    }

    public static int x(int i2) {
        return (i2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j2, Object obj) {
        return ((Long) k3h.i(j2, obj)).longValue();
    }

    public final t0h A(int i2) {
        int i3 = i2 / 3;
        return (t0h) this.b[i3 + i3 + 1];
    }

    public final l2h B(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        Object[] objArr = this.b;
        l2h l2h = (l2h) objArr[i4];
        if (l2h != null) {
            return l2h;
        }
        l2h a2 = h2h.c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a2;
        return a2;
    }

    public final Object C(int i2, Object obj) {
        l2h B = B(i2);
        int y = y(i2) & 1048575;
        if (!p(i2, obj)) {
            return B.a();
        }
        Object object = l.getObject(obj, (long) y);
        if (r(object)) {
            return object;
        }
        p0h a2 = B.a();
        if (object != null) {
            B.h(a2, object);
        }
        return a2;
    }

    public final Object D(int i2, int i3, Object obj) {
        l2h B = B(i3);
        if (!s(i2, i3, obj)) {
            return B.a();
        }
        Object object = l.getObject(obj, (long) (y(i3) & 1048575));
        if (r(object)) {
            return object;
        }
        p0h a2 = B.a();
        if (object != null) {
            B.h(a2, object);
        }
        return a2;
    }

    public final p0h a() {
        return (p0h) ((p0h) this.e).m(4);
    }

    public final void b(Object obj) {
        if (r(obj)) {
            int i2 = 0;
            if (obj instanceof p0h) {
                p0h p0h = (p0h) obj;
                p0h.j();
                p0h.zza = 0;
                p0h.h();
            }
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int y = y(i2);
                    int i3 = 1048575 & y;
                    int x = x(y);
                    long j2 = (long) i3;
                    if (x != 9) {
                        if (x == 60 || x == 68) {
                            if (s(iArr[i2], i2, obj)) {
                                B(i2).b(l.getObject(obj, j2));
                            }
                            i2 += 3;
                        } else {
                            switch (x) {
                                case LangUtils.HASH_SEED /*17*/:
                                    break;
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case LangUtils.HASH_OFFSET /*37*/:
                                case 38:
                                case 39:
                                case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    this.i.a(j2, obj);
                                    continue;
                                case 50:
                                    Unsafe unsafe = l;
                                    Object object = unsafe.getObject(obj, j2);
                                    if (object != null) {
                                        ((t1h) object).h();
                                        unsafe.putObject(obj, j2, object);
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                        }
                    }
                    if (p(i2, obj)) {
                        B(i2).b(l.getObject(obj, j2));
                    }
                    i2 += 3;
                } else {
                    this.j.getClass();
                    c3h.c(obj);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v162, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r18, defpackage.p1e r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = 1
            sun.misc.Unsafe r10 = l
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
            r0 = r11
            r1 = r12
            r13 = r1
        L_0x0010:
            int[] r2 = r6.a
            int r3 = r2.length
            if (r13 >= r3) goto L_0x0551
            int r3 = r6.y(r13)
            int r4 = x(r3)
            r14 = r2[r13]
            r5 = 17
            if (r4 > r5) goto L_0x003e
            int r5 = r13 + 2
            r5 = r2[r5]
            r15 = r5 & r11
            if (r15 == r0) goto L_0x0036
            if (r15 != r11) goto L_0x002f
            r1 = r12
            goto L_0x0035
        L_0x002f:
            long r0 = (long) r15
            int r0 = r10.getInt(r7, r0)
            r1 = r0
        L_0x0035:
            r0 = r15
        L_0x0036:
            int r5 = r5 >>> 20
            int r5 = r9 << r5
            r15 = r0
            r16 = r1
            goto L_0x0042
        L_0x003e:
            r15 = r0
            r16 = r1
            r5 = r12
        L_0x0042:
            r0 = r3 & r11
            long r0 = (long) r0
            switch(r4) {
                case 0: goto L_0x0530;
                case 1: goto L_0x0519;
                case 2: goto L_0x0502;
                case 3: goto L_0x04eb;
                case 4: goto L_0x04d3;
                case 5: goto L_0x04bb;
                case 6: goto L_0x04a3;
                case 7: goto L_0x048b;
                case 8: goto L_0x0462;
                case 9: goto L_0x0446;
                case 10: goto L_0x042c;
                case 11: goto L_0x0414;
                case 12: goto L_0x03fc;
                case 13: goto L_0x03e4;
                case 14: goto L_0x03cc;
                case 15: goto L_0x03b4;
                case 16: goto L_0x039c;
                case 17: goto L_0x037f;
                case 18: goto L_0x0372;
                case 19: goto L_0x0365;
                case 20: goto L_0x0358;
                case 21: goto L_0x034b;
                case 22: goto L_0x033e;
                case 23: goto L_0x0331;
                case 24: goto L_0x0324;
                case 25: goto L_0x0317;
                case 26: goto L_0x0300;
                case 27: goto L_0x02da;
                case 28: goto L_0x02c3;
                case 29: goto L_0x02b6;
                case 30: goto L_0x02a9;
                case 31: goto L_0x029c;
                case 32: goto L_0x028f;
                case 33: goto L_0x0282;
                case 34: goto L_0x0275;
                case 35: goto L_0x0268;
                case 36: goto L_0x025b;
                case 37: goto L_0x024e;
                case 38: goto L_0x0241;
                case 39: goto L_0x0234;
                case 40: goto L_0x0227;
                case 41: goto L_0x021a;
                case 42: goto L_0x020d;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f3;
                case 45: goto L_0x01e6;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01cc;
                case 48: goto L_0x01bf;
                case 49: goto L_0x0199;
                case 50: goto L_0x0185;
                case 51: goto L_0x0170;
                case 52: goto L_0x015b;
                case 53: goto L_0x014c;
                case 54: goto L_0x013d;
                case 55: goto L_0x012e;
                case 56: goto L_0x011f;
                case 57: goto L_0x0110;
                case 58: goto L_0x00fb;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c8;
                case 61: goto L_0x00b7;
                case 62: goto L_0x00a8;
                case 63: goto L_0x0099;
                case 64: goto L_0x008a;
                case 65: goto L_0x007b;
                case 66: goto L_0x006c;
                case 67: goto L_0x005d;
                case 68: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0546
        L_0x004a:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r0)
            l2h r1 = r6.B(r13)
            r8.y(r14, r0, r1)
            goto L_0x0546
        L_0x005d:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            long r0 = z(r0, r7)
            r8.j(r14, r0)
            goto L_0x0546
        L_0x006c:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.i(r14, r0)
            goto L_0x0546
        L_0x007b:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            long r0 = z(r0, r7)
            r8.E(r14, r0)
            goto L_0x0546
        L_0x008a:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.D(r14, r0)
            goto L_0x0546
        L_0x0099:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.t(r14, r0)
            goto L_0x0546
        L_0x00a8:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.l(r14, r0)
            goto L_0x0546
        L_0x00b7:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r0)
            fzg r0 = (defpackage.fzg) r0
            r8.p(r14, r0)
            goto L_0x0546
        L_0x00c8:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r0)
            l2h r1 = r6.B(r13)
            r8.B(r14, r0, r1)
            goto L_0x0546
        L_0x00db:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x00f4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.a
            wzg r1 = (defpackage.wzg) r1
            r1.Q(r14, r0)
            goto L_0x0546
        L_0x00f4:
            fzg r0 = (defpackage.fzg) r0
            r8.p(r14, r0)
            goto L_0x0546
        L_0x00fb:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = defpackage.k3h.i(r0, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.o(r14, r0)
            goto L_0x0546
        L_0x0110:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.v(r14, r0)
            goto L_0x0546
        L_0x011f:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            long r0 = z(r0, r7)
            r8.w(r14, r0)
            goto L_0x0546
        L_0x012e:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            int r0 = v(r0, r7)
            r8.z(r14, r0)
            goto L_0x0546
        L_0x013d:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            long r0 = z(r0, r7)
            r8.m(r14, r0)
            goto L_0x0546
        L_0x014c:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            long r0 = z(r0, r7)
            r8.A(r14, r0)
            goto L_0x0546
        L_0x015b:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = defpackage.k3h.i(r0, r7)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r8.x(r0, r14)
            goto L_0x0546
        L_0x0170:
            boolean r2 = r6.s(r14, r13, r7)
            if (r2 == 0) goto L_0x0546
            java.lang.Object r0 = defpackage.k3h.i(r0, r7)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r8.r(r0, r14)
            goto L_0x0546
        L_0x0185:
            java.lang.Object r0 = r10.getObject(r7, r0)
            if (r0 != 0) goto L_0x018d
            goto L_0x0546
        L_0x018d:
            int r13 = r13 / 3
            java.lang.Object[] r0 = r6.b
            int r13 = r13 + r13
            r0 = r0[r13]
            defpackage.rae.w(r0)
            r0 = 0
            throw r0
        L_0x0199:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            l2h r1 = r6.B(r13)
            java.lang.Class r3 = defpackage.o2h.a
            if (r0 == 0) goto L_0x0546
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0546
            r3 = r12
        L_0x01b0:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x0546
            java.lang.Object r4 = r0.get(r3)
            r8.y(r2, r4, r1)
            int r3 = r3 + r9
            goto L_0x01b0
        L_0x01bf:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.c(r2, r0, r8, r9)
            goto L_0x0546
        L_0x01cc:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.b(r2, r0, r8, r9)
            goto L_0x0546
        L_0x01d9:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.a(r2, r0, r8, r9)
            goto L_0x0546
        L_0x01e6:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.C(r2, r0, r8, r9)
            goto L_0x0546
        L_0x01f3:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.w(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0200:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.d(r2, r0, r8, r9)
            goto L_0x0546
        L_0x020d:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.u(r2, r0, r8, r9)
            goto L_0x0546
        L_0x021a:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.x(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0227:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.y(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0234:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.A(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0241:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.e(r2, r0, r8, r9)
            goto L_0x0546
        L_0x024e:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.B(r2, r0, r8, r9)
            goto L_0x0546
        L_0x025b:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.z(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0268:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.v(r2, r0, r8, r9)
            goto L_0x0546
        L_0x0275:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.c(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0282:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.b(r2, r0, r8, r12)
            goto L_0x0546
        L_0x028f:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.a(r2, r0, r8, r12)
            goto L_0x0546
        L_0x029c:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.C(r2, r0, r8, r12)
            goto L_0x0546
        L_0x02a9:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.w(r2, r0, r8, r12)
            goto L_0x0546
        L_0x02b6:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.d(r2, r0, r8, r12)
            goto L_0x0546
        L_0x02c3:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            if (r0 == 0) goto L_0x0546
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0546
            r8.q(r2, r0)
            goto L_0x0546
        L_0x02da:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            l2h r1 = r6.B(r13)
            java.lang.Class r3 = defpackage.o2h.a
            if (r0 == 0) goto L_0x0546
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0546
            r3 = r12
        L_0x02f1:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x0546
            java.lang.Object r4 = r0.get(r3)
            r8.B(r2, r4, r1)
            int r3 = r3 + r9
            goto L_0x02f1
        L_0x0300:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            if (r0 == 0) goto L_0x0546
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0546
            r8.k(r2, r0)
            goto L_0x0546
        L_0x0317:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.u(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0324:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.x(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0331:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.y(r2, r0, r8, r12)
            goto L_0x0546
        L_0x033e:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.A(r2, r0, r8, r12)
            goto L_0x0546
        L_0x034b:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.e(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0358:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.B(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0365:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.z(r2, r0, r8, r12)
            goto L_0x0546
        L_0x0372:
            r2 = r2[r13]
            java.lang.Object r0 = r10.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            defpackage.o2h.v(r2, r0, r8, r12)
            goto L_0x0546
        L_0x037f:
            r3 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r11 = r3
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r11)
            l2h r1 = r6.B(r13)
            r8.y(r14, r0, r1)
            goto L_0x0546
        L_0x039c:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            long r0 = r10.getLong(r7, r11)
            r8.j(r14, r0)
            goto L_0x0546
        L_0x03b4:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.i(r14, r0)
            goto L_0x0546
        L_0x03cc:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            long r0 = r10.getLong(r7, r11)
            r8.E(r14, r0)
            goto L_0x0546
        L_0x03e4:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.D(r14, r0)
            goto L_0x0546
        L_0x03fc:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.t(r14, r0)
            goto L_0x0546
        L_0x0414:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.l(r14, r0)
            goto L_0x0546
        L_0x042c:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r11)
            fzg r0 = (defpackage.fzg) r0
            r8.p(r14, r0)
            goto L_0x0546
        L_0x0446:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r11)
            l2h r1 = r6.B(r13)
            r8.B(r14, r0, r1)
            goto L_0x0546
        L_0x0462:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            java.lang.Object r0 = r10.getObject(r7, r11)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0484
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.a
            wzg r1 = (defpackage.wzg) r1
            r1.Q(r14, r0)
            goto L_0x0546
        L_0x0484:
            fzg r0 = (defpackage.fzg) r0
            r8.p(r14, r0)
            goto L_0x0546
        L_0x048b:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            boolean r0 = defpackage.k3h.t(r11, r7)
            r8.o(r14, r0)
            goto L_0x0546
        L_0x04a3:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.v(r14, r0)
            goto L_0x0546
        L_0x04bb:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            long r0 = r10.getLong(r7, r11)
            r8.w(r14, r0)
            goto L_0x0546
        L_0x04d3:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            int r0 = r10.getInt(r7, r11)
            r8.z(r14, r0)
            goto L_0x0546
        L_0x04eb:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            long r0 = r10.getLong(r7, r11)
            r8.m(r14, r0)
            goto L_0x0546
        L_0x0502:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            long r0 = r10.getLong(r7, r11)
            r8.A(r14, r0)
            goto L_0x0546
        L_0x0519:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            float r0 = defpackage.k3h.e(r11, r7)
            r8.x(r0, r14)
            goto L_0x0546
        L_0x0530:
            r11 = r0
            r0 = r17
            r1 = r18
            r2 = r13
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0546
            double r0 = defpackage.k3h.d(r11, r7)
            r8.r(r0, r14)
        L_0x0546:
            int r13 = r13 + 3
            r0 = r15
            r1 = r16
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
            goto L_0x0010
        L_0x0551:
            c3h r0 = r6.j
            r0.getClass()
            b3h r0 = defpackage.c3h.b(r18)
            defpackage.c3h.d(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2h.c(java.lang.Object, p1e):void");
    }

    public final void d(Object obj, byte[] bArr, int i2, int i3, gv1 gv1) {
        t(obj, bArr, i2, i3, 0, gv1);
    }

    public final boolean e(Object obj) {
        int i2;
        int i3;
        Object obj2 = obj;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int y = y(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = l.getInt(obj2, (long) i10);
                }
                i2 = i4;
                i3 = i10;
            } else {
                i3 = i6;
                i2 = i4;
            }
            if ((268435456 & y) != 0 && !q(obj, i7, i3, i2, i11)) {
                return false;
            }
            int x = x(y);
            if (x != 9 && x != 17) {
                if (x != 27) {
                    if (x == 60 || x == 68) {
                        if (s(i8, i7, obj2) && !B(i7).e(k3h.i((long) (y & 1048575), obj2))) {
                            return false;
                        }
                    } else if (x != 49) {
                        if (x == 50 && !((t1h) k3h.i((long) (y & 1048575), obj2)).isEmpty()) {
                            int i12 = i7 / 3;
                            rae.w(this.b[i12 + i12]);
                            throw null;
                        }
                    }
                }
                List list = (List) k3h.i((long) (y & 1048575), obj2);
                if (!list.isEmpty()) {
                    l2h B = B(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!B.e(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (q(obj, i7, i3, i2, i11) && !B(i7).e(k3h.i((long) (y & 1048575), obj2))) {
                return false;
            }
            i5++;
            i6 = i3;
            i4 = i2;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r1 = r1 + ((int) (r2 ^ (r2 >>> 32)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        if (r2 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        r6 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r1 = r6 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0182, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ea, code lost:
        if (r2 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r1 = r2 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int[] r2 = r10.a
            int r3 = r2.length
            if (r0 >= r3) goto L_0x023e
            int r3 = r10.y(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = x(r3)
            r2 = r2[r0]
            long r4 = (long) r4
            r6 = 1237(0x4d5, float:1.733E-42)
            r7 = 1231(0x4cf, float:1.725E-42)
            r8 = 37
            r9 = 32
            switch(r3) {
                case 0: goto L_0x022a;
                case 1: goto L_0x021c;
                case 2: goto L_0x0212;
                case 3: goto L_0x0208;
                case 4: goto L_0x0200;
                case 5: goto L_0x01f6;
                case 6: goto L_0x01ee;
                case 7: goto L_0x01e0;
                case 8: goto L_0x01d2;
                case 9: goto L_0x01c5;
                case 10: goto L_0x01b9;
                case 11: goto L_0x01b1;
                case 12: goto L_0x01a9;
                case 13: goto L_0x01a1;
                case 14: goto L_0x0197;
                case 15: goto L_0x018f;
                case 16: goto L_0x0185;
                case 17: goto L_0x0176;
                case 18: goto L_0x016a;
                case 19: goto L_0x016a;
                case 20: goto L_0x016a;
                case 21: goto L_0x016a;
                case 22: goto L_0x016a;
                case 23: goto L_0x016a;
                case 24: goto L_0x016a;
                case 25: goto L_0x016a;
                case 26: goto L_0x016a;
                case 27: goto L_0x016a;
                case 28: goto L_0x016a;
                case 29: goto L_0x016a;
                case 30: goto L_0x016a;
                case 31: goto L_0x016a;
                case 32: goto L_0x016a;
                case 33: goto L_0x016a;
                case 34: goto L_0x016a;
                case 35: goto L_0x016a;
                case 36: goto L_0x016a;
                case 37: goto L_0x016a;
                case 38: goto L_0x016a;
                case 39: goto L_0x016a;
                case 40: goto L_0x016a;
                case 41: goto L_0x016a;
                case 42: goto L_0x016a;
                case 43: goto L_0x016a;
                case 44: goto L_0x016a;
                case 45: goto L_0x016a;
                case 46: goto L_0x016a;
                case 47: goto L_0x016a;
                case 48: goto L_0x016a;
                case 49: goto L_0x016a;
                case 50: goto L_0x015e;
                case 51: goto L_0x0144;
                case 52: goto L_0x012c;
                case 53: goto L_0x011c;
                case 54: goto L_0x010c;
                case 55: goto L_0x00fe;
                case 56: goto L_0x00ee;
                case 57: goto L_0x00e0;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008f;
                case 62: goto L_0x0082;
                case 63: goto L_0x0075;
                case 64: goto L_0x0068;
                case 65: goto L_0x0059;
                case 66: goto L_0x004c;
                case 67: goto L_0x0037;
                case 68: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x023a
        L_0x0023:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
        L_0x0033:
            int r2 = r2 + r1
            r1 = r2
            goto L_0x023a
        L_0x0037:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            long r2 = z(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
        L_0x0045:
            long r4 = r2 >>> r9
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r1 = r1 + r2
            goto L_0x023a
        L_0x004c:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x0059:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            long r2 = z(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x0068:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x0075:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x0082:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x008f:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x00a0:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x00b1:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x00c5:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.nio.charset.Charset r3 = defpackage.y0h.a
            if (r2 == 0) goto L_0x00dc
        L_0x00db:
            r6 = r7
        L_0x00dc:
            int r6 = r6 + r1
            r1 = r6
            goto L_0x023a
        L_0x00e0:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x00ee:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            long r2 = z(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x00fe:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            int r2 = v(r4, r11)
            goto L_0x0033
        L_0x010c:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            long r2 = z(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x011c:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            long r2 = z(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x012c:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0033
        L_0x0144:
            boolean r2 = r10.s(r2, r0, r11)
            if (r2 == 0) goto L_0x023a
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x015e:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x016a:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x0176:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            if (r2 == 0) goto L_0x0182
            int r8 = r2.hashCode()
        L_0x0182:
            int r1 = r1 + r8
            goto L_0x023a
        L_0x0185:
            int r1 = r1 * 53
            long r2 = defpackage.k3h.g(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x018f:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x0197:
            int r1 = r1 * 53
            long r2 = defpackage.k3h.g(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x01a1:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x01a9:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x01b1:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x01b9:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x01c5:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            if (r2 == 0) goto L_0x0182
            int r8 = r2.hashCode()
            goto L_0x0182
        L_0x01d2:
            int r1 = r1 * 53
            java.lang.Object r2 = defpackage.k3h.i(r4, r11)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L_0x0033
        L_0x01e0:
            int r1 = r1 * 53
            j3h r2 = defpackage.k3h.c
            boolean r2 = r2.m1(r4, r11)
            java.nio.charset.Charset r3 = defpackage.y0h.a
            if (r2 == 0) goto L_0x00dc
            goto L_0x00db
        L_0x01ee:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x01f6:
            int r1 = r1 * 53
            long r2 = defpackage.k3h.g(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x0200:
            int r1 = r1 * 53
            int r2 = defpackage.k3h.f(r4, r11)
            goto L_0x0033
        L_0x0208:
            int r1 = r1 * 53
            long r2 = defpackage.k3h.g(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x0212:
            int r1 = r1 * 53
            long r2 = defpackage.k3h.g(r4, r11)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x021c:
            int r1 = r1 * 53
            j3h r2 = defpackage.k3h.c
            float r2 = r2.h1(r4, r11)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L_0x0033
        L_0x022a:
            int r1 = r1 * 53
            j3h r2 = defpackage.k3h.c
            double r2 = r2.g1(r4, r11)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            java.nio.charset.Charset r4 = defpackage.y0h.a
            goto L_0x0045
        L_0x023a:
            int r0 = r0 + 3
            goto L_0x0002
        L_0x023e:
            int r1 = r1 * 53
            c3h r10 = r10.j
            r10.getClass()
            p0h r11 = (defpackage.p0h) r11
            b3h r10 = r11.zzc
            int r10 = r10.hashCode()
            int r10 = r10 + r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2h.f(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03a1, code lost:
        r2 = (r2 * r1) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a3, code lost:
        r13 = r13 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04d3, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04dd, code lost:
        r13 = r13 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = 1
            sun.misc.Unsafe r9 = l
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r11
            r1 = 0
            r12 = 0
            r13 = 0
        L_0x000e:
            int[] r2 = r6.a
            int r3 = r2.length
            if (r12 >= r3) goto L_0x078b
            int r3 = r6.y(r12)
            int r4 = x(r3)
            int r5 = r12 + 2
            r14 = r2[r12]
            r2 = r2[r5]
            r5 = r2 & r11
            r15 = 17
            if (r4 > r15) goto L_0x003d
            if (r5 == r0) goto L_0x0034
            if (r5 != r11) goto L_0x002d
            r1 = 0
            goto L_0x0033
        L_0x002d:
            long r0 = (long) r5
            int r0 = r9.getInt(r7, r0)
            r1 = r0
        L_0x0033:
            r0 = r5
        L_0x0034:
            int r2 = r2 >>> 20
            int r2 = r8 << r2
            r15 = r0
            r16 = r1
            r5 = r2
            goto L_0x0041
        L_0x003d:
            r15 = r0
            r16 = r1
            r5 = 0
        L_0x0041:
            r0 = r3 & r11
            a0h r1 = defpackage.a0h.DOUBLE_LIST_PACKED
            int r1 = r1.a()
            if (r4 < r1) goto L_0x0050
            a0h r1 = defpackage.a0h.SINT64_LIST_PACKED
            r1.getClass()
        L_0x0050:
            long r2 = (long) r0
            r17 = 63
            r1 = 4
            r0 = 8
            switch(r4) {
                case 0: goto L_0x076c;
                case 1: goto L_0x0756;
                case 2: goto L_0x0737;
                case 3: goto L_0x0718;
                case 4: goto L_0x06f8;
                case 5: goto L_0x06e1;
                case 6: goto L_0x06ca;
                case 7: goto L_0x06b4;
                case 8: goto L_0x067f;
                case 9: goto L_0x0662;
                case 10: goto L_0x063d;
                case 11: goto L_0x061e;
                case 12: goto L_0x05fe;
                case 13: goto L_0x05e7;
                case 14: goto L_0x05d0;
                case 15: goto L_0x05ac;
                case 16: goto L_0x0588;
                case 17: goto L_0x0568;
                case 18: goto L_0x055c;
                case 19: goto L_0x0550;
                case 20: goto L_0x0530;
                case 21: goto L_0x0514;
                case 22: goto L_0x04f8;
                case 23: goto L_0x04ec;
                case 24: goto L_0x04e0;
                case 25: goto L_0x04c5;
                case 26: goto L_0x0468;
                case 27: goto L_0x043a;
                case 28: goto L_0x040c;
                case 29: goto L_0x03f2;
                case 30: goto L_0x03d8;
                case 31: goto L_0x03cc;
                case 32: goto L_0x03c0;
                case 33: goto L_0x03a6;
                case 34: goto L_0x0387;
                case 35: goto L_0x036f;
                case 36: goto L_0x0357;
                case 37: goto L_0x033f;
                case 38: goto L_0x0327;
                case 39: goto L_0x030f;
                case 40: goto L_0x02f7;
                case 41: goto L_0x02df;
                case 42: goto L_0x02c5;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0295;
                case 45: goto L_0x027d;
                case 46: goto L_0x0265;
                case 47: goto L_0x024d;
                case 48: goto L_0x0235;
                case 49: goto L_0x020d;
                case 50: goto L_0x01d9;
                case 51: goto L_0x01cb;
                case 52: goto L_0x01bd;
                case 53: goto L_0x01a7;
                case 54: goto L_0x0191;
                case 55: goto L_0x017a;
                case 56: goto L_0x016c;
                case 57: goto L_0x015e;
                case 58: goto L_0x0150;
                case 59: goto L_0x0125;
                case 60: goto L_0x0111;
                case 61: goto L_0x00f2;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00c6;
                case 64: goto L_0x00b8;
                case 65: goto L_0x00aa;
                case 66: goto L_0x008f;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0781
        L_0x005b:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            java.lang.Object r0 = r9.getObject(r7, r2)
            azg r0 = (defpackage.azg) r0
            l2h r1 = r6.B(r12)
            int r0 = defpackage.wzg.V(r14, r0, r1)
        L_0x006f:
            int r13 = r13 + r0
            goto L_0x0781
        L_0x0072:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = z(r2, r7)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = defpackage.wzg.Y(r0)
            long r1 = r1 ^ r3
            int r1 = defpackage.wzg.Z(r1)
        L_0x008b:
            int r1 = r1 + r0
            int r13 = r13 + r1
            goto L_0x0781
        L_0x008f:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = v(r2, r7)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = defpackage.wzg.Y(r0)
            r1 = r1 ^ r2
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x00aa:
            boolean r1 = r6.s(r14, r12, r7)
            if (r1 == 0) goto L_0x0781
            int r1 = r14 << 3
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x00b8:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r1, r13)
            goto L_0x0781
        L_0x00c6:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = v(r2, r7)
            long r1 = (long) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x00dc:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = v(r2, r7)
            int r0 = defpackage.wzg.Y(r0)
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x00f2:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            java.lang.Object r1 = r9.getObject(r7, r2)
            fzg r1 = (defpackage.fzg) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = r1.e()
            int r2 = defpackage.wzg.Y(r1)
        L_0x010c:
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r13 = r13 + r2
            goto L_0x0781
        L_0x0111:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            java.lang.Object r0 = r9.getObject(r7, r2)
            l2h r1 = r6.B(r12)
            int r0 = defpackage.o2h.n(r14, r0, r1)
            goto L_0x006f
        L_0x0125:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            java.lang.Object r1 = r9.getObject(r7, r2)
            boolean r2 = r1 instanceof defpackage.fzg
            if (r2 == 0) goto L_0x0144
            fzg r1 = (defpackage.fzg) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = r1.e()
            int r2 = defpackage.wzg.Y(r1)
            goto L_0x010c
        L_0x0144:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.X(r1)
            goto L_0x008b
        L_0x0150:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r8, r13)
            goto L_0x0781
        L_0x015e:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r1, r13)
            goto L_0x0781
        L_0x016c:
            boolean r1 = r6.s(r14, r12, r7)
            if (r1 == 0) goto L_0x0781
            int r1 = r14 << 3
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x017a:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = v(r2, r7)
            long r1 = (long) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x0191:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = z(r2, r7)
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x01a7:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = z(r2, r7)
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x01bd:
            boolean r0 = r6.s(r14, r12, r7)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r1, r13)
            goto L_0x0781
        L_0x01cb:
            boolean r1 = r6.s(r14, r12, r7)
            if (r1 == 0) goto L_0x0781
            int r1 = r14 << 3
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x01d9:
            java.lang.Object r0 = r9.getObject(r7, r2)
            int r1 = r12 / 3
            java.lang.Object[] r2 = r6.b
            int r1 = r1 + r1
            r1 = r2[r1]
            t1h r0 = (defpackage.t1h) r0
            defpackage.rae.w(r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0781
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x01ff
            goto L_0x0781
        L_0x01ff:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
        L_0x020d:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            l2h r1 = r6.B(r12)
            java.lang.Class r2 = defpackage.o2h.a
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0221
            r4 = 0
            goto L_0x0232
        L_0x0221:
            r3 = 0
            r4 = 0
        L_0x0223:
            if (r3 >= r2) goto L_0x0232
            java.lang.Object r5 = r0.get(r3)
            azg r5 = (defpackage.azg) r5
            int r5 = defpackage.wzg.V(r14, r5, r1)
            int r4 = r4 + r5
            int r3 = r3 + r8
            goto L_0x0223
        L_0x0232:
            int r13 = r13 + r4
            goto L_0x0781
        L_0x0235:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.p(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x024d:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.o(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x0265:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.k(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x027d:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.i(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x0295:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.g(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x02ad:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.q(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x02c5:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x02df:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.i(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x02f7:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.k(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x030f:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.l(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x0327:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.r(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x033f:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.m(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x0357:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.i(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x036f:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.k(r0)
            if (r0 <= 0) goto L_0x0781
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r2 = defpackage.wzg.Y(r0)
            goto L_0x010c
        L_0x0387:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0397
        L_0x0395:
            r2 = 0
            goto L_0x03a3
        L_0x0397:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.p(r0)
            int r2 = defpackage.wzg.Y(r2)
        L_0x03a1:
            int r2 = r2 * r1
            int r2 = r2 + r0
        L_0x03a3:
            int r13 = r13 + r2
            goto L_0x0781
        L_0x03a6:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03b5
            goto L_0x0395
        L_0x03b5:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.o(r0)
            int r2 = defpackage.wzg.Y(r2)
            goto L_0x03a1
        L_0x03c0:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.j(r14, r0)
            goto L_0x006f
        L_0x03cc:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.h(r14, r0)
            goto L_0x006f
        L_0x03d8:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x03e7
            goto L_0x0395
        L_0x03e7:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.g(r0)
            int r2 = defpackage.wzg.Y(r2)
            goto L_0x03a1
        L_0x03f2:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0401
            goto L_0x0395
        L_0x0401:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.q(r0)
            int r2 = defpackage.wzg.Y(r2)
            goto L_0x03a1
        L_0x040c:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x041c
            goto L_0x0395
        L_0x041c:
            int r2 = r14 << 3
            int r2 = defpackage.wzg.Y(r2)
            int r2 = r2 * r1
            r1 = 0
        L_0x0424:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x03a3
            java.lang.Object r3 = r0.get(r1)
            fzg r3 = (defpackage.fzg) r3
            int r3 = r3.e()
            int r2 = defpackage.wzf.h(r3, r3, r2)
            int r1 = r1 + r8
            goto L_0x0424
        L_0x043a:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            l2h r1 = r6.B(r12)
            java.lang.Class r2 = defpackage.o2h.a
            int r2 = r0.size()
            if (r2 != 0) goto L_0x044e
            r3 = 0
            goto L_0x0465
        L_0x044e:
            int r3 = r14 << 3
            int r3 = defpackage.wzg.Y(r3)
            int r3 = r3 * r2
            r4 = 0
        L_0x0456:
            if (r4 >= r2) goto L_0x0465
            java.lang.Object r5 = r0.get(r4)
            azg r5 = (defpackage.azg) r5
            int r5 = defpackage.wzg.W(r5, r1)
            int r3 = r3 + r5
            int r4 = r4 + r8
            goto L_0x0456
        L_0x0465:
            int r13 = r13 + r3
            goto L_0x0781
        L_0x0468:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0478
            goto L_0x0395
        L_0x0478:
            int r2 = r14 << 3
            int r2 = defpackage.wzg.Y(r2)
            int r2 = r2 * r1
            boolean r3 = r0 instanceof defpackage.c1h
            if (r3 == 0) goto L_0x04a5
            c1h r0 = (defpackage.c1h) r0
            r3 = 0
        L_0x0486:
            if (r3 >= r1) goto L_0x03a3
            java.lang.Object r4 = r0.k(r3)
            boolean r5 = r4 instanceof defpackage.fzg
            if (r5 == 0) goto L_0x049b
            fzg r4 = (defpackage.fzg) r4
            int r4 = r4.e()
            int r2 = defpackage.wzf.h(r4, r4, r2)
            goto L_0x04a3
        L_0x049b:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = defpackage.wzg.X(r4)
            int r4 = r4 + r2
            r2 = r4
        L_0x04a3:
            int r3 = r3 + r8
            goto L_0x0486
        L_0x04a5:
            r3 = 0
        L_0x04a6:
            if (r3 >= r1) goto L_0x03a3
            java.lang.Object r4 = r0.get(r3)
            boolean r5 = r4 instanceof defpackage.fzg
            if (r5 == 0) goto L_0x04bb
            fzg r4 = (defpackage.fzg) r4
            int r4 = r4.e()
            int r2 = defpackage.wzf.h(r4, r4, r2)
            goto L_0x04c3
        L_0x04bb:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = defpackage.wzg.X(r4)
            int r4 = r4 + r2
            r2 = r4
        L_0x04c3:
            int r3 = r3 + r8
            goto L_0x04a6
        L_0x04c5:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x04d5
        L_0x04d3:
            r1 = 0
            goto L_0x04dd
        L_0x04d5:
            int r1 = r14 << 3
            int r1 = defpackage.wzg.Y(r1)
            int r1 = r1 + r8
            int r1 = r1 * r0
        L_0x04dd:
            int r13 = r13 + r1
            goto L_0x0781
        L_0x04e0:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.h(r14, r0)
            goto L_0x006f
        L_0x04ec:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.j(r14, r0)
            goto L_0x006f
        L_0x04f8:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0508
            goto L_0x0395
        L_0x0508:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.l(r0)
            int r2 = defpackage.wzg.Y(r2)
            goto L_0x03a1
        L_0x0514:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0524
            goto L_0x0395
        L_0x0524:
            int r2 = r14 << 3
            int r0 = defpackage.o2h.r(r0)
            int r2 = defpackage.wzg.Y(r2)
            goto L_0x03a1
        L_0x0530:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Class r1 = defpackage.o2h.a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x053f
            goto L_0x04d3
        L_0x053f:
            int r1 = r14 << 3
            int r2 = defpackage.o2h.m(r0)
            int r0 = r0.size()
            int r1 = defpackage.wzg.Y(r1)
            int r1 = r1 * r0
            int r1 = r1 + r2
            goto L_0x04dd
        L_0x0550:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.h(r14, r0)
            goto L_0x006f
        L_0x055c:
            java.lang.Object r0 = r9.getObject(r7, r2)
            java.util.List r0 = (java.util.List) r0
            int r0 = defpackage.o2h.j(r14, r0)
            goto L_0x006f
        L_0x0568:
            r0 = r18
            r1 = r19
            r3 = r2
            r2 = r12
            r10 = r3
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            java.lang.Object r0 = r9.getObject(r7, r10)
            azg r0 = (defpackage.azg) r0
            l2h r1 = r6.B(r12)
            int r0 = defpackage.wzg.V(r14, r0, r1)
            goto L_0x006f
        L_0x0588:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = r9.getLong(r7, r10)
            long r3 = r1 + r1
            long r1 = r1 >> r17
            int r0 = defpackage.wzg.Y(r0)
            long r1 = r1 ^ r3
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x05ac:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = r9.getInt(r7, r10)
            int r2 = r1 + r1
            int r1 = r1 >> 31
            int r0 = defpackage.wzg.Y(r0)
            r1 = r1 ^ r2
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x05d0:
            r10 = r0
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
            goto L_0x0781
        L_0x05e7:
            r0 = r18
            r10 = r1
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
            goto L_0x0781
        L_0x05fe:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = r9.getInt(r7, r10)
            long r1 = (long) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x061e:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = r9.getInt(r7, r10)
            int r0 = defpackage.wzg.Y(r0)
            int r13 = defpackage.wzf.h(r1, r0, r13)
            goto L_0x0781
        L_0x063d:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            java.lang.Object r1 = r9.getObject(r7, r10)
            fzg r1 = (defpackage.fzg) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = r1.e()
            int r2 = defpackage.wzg.Y(r1)
            goto L_0x010c
        L_0x0662:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            java.lang.Object r0 = r9.getObject(r7, r10)
            l2h r1 = r6.B(r12)
            int r0 = defpackage.o2h.n(r14, r0, r1)
            goto L_0x006f
        L_0x067f:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            java.lang.Object r1 = r9.getObject(r7, r10)
            boolean r2 = r1 instanceof defpackage.fzg
            if (r2 == 0) goto L_0x06a8
            fzg r1 = (defpackage.fzg) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = r1.e()
            int r2 = defpackage.wzg.Y(r1)
            goto L_0x010c
        L_0x06a8:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.X(r1)
            goto L_0x008b
        L_0x06b4:
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r8, r13)
            goto L_0x0781
        L_0x06ca:
            r10 = r1
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
            goto L_0x0781
        L_0x06e1:
            r10 = r0
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
            goto L_0x0781
        L_0x06f8:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r1 = r9.getInt(r7, r10)
            long r1 = (long) r1
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x0718:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = r9.getLong(r7, r10)
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x0737:
            r10 = r2
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            long r1 = r9.getLong(r7, r10)
            int r0 = defpackage.wzg.Y(r0)
            int r1 = defpackage.wzg.Z(r1)
            goto L_0x008b
        L_0x0756:
            r10 = r1
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
            goto L_0x0781
        L_0x076c:
            r10 = r0
            r0 = r18
            r1 = r19
            r2 = r12
            r3 = r15
            r4 = r16
            boolean r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0781
            int r0 = r14 << 3
            int r13 = defpackage.wzf.h(r0, r10, r13)
        L_0x0781:
            int r12 = r12 + 3
            r0 = r15
            r1 = r16
            r11 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000e
        L_0x078b:
            c3h r0 = r6.j
            r0.getClass()
            b3h r0 = defpackage.c3h.b(r19)
            int r0 = defpackage.c3h.a(r0)
            int r0 = r0 + r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2h.g(java.lang.Object):int");
    }

    public final void h(Object obj, Object obj2) {
        if (r(obj)) {
            obj2.getClass();
            int i2 = 0;
            while (true) {
                int[] iArr = this.a;
                if (i2 < iArr.length) {
                    int y = y(i2);
                    int i3 = y & 1048575;
                    int x = x(y);
                    int i4 = iArr[i2];
                    long j2 = (long) i3;
                    switch (x) {
                        case 0:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.l(obj, j2, k3h.c.g1(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 1:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.m(obj, j2, k3h.c.h1(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 2:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.o(obj, j2, k3h.g(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 3:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.o(obj, j2, k3h.g(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 4:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case 5:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.o(obj, j2, k3h.g(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 6:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case 7:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.k(obj, j2, k3h.c.m1(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 8:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.p(j2, obj, k3h.i(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 9:
                            j(i2, obj, obj2);
                            break;
                        case 10:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.p(j2, obj, k3h.i(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case 11:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case 12:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case 13:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case Protos.Attaches.Attach.LOCATION /*14*/:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.o(obj, j2, k3h.g(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.n(k3h.f(j2, obj2), j2, obj);
                                l(i2, obj);
                                break;
                            }
                        case 16:
                            if (!p(i2, obj2)) {
                                break;
                            } else {
                                k3h.o(obj, j2, k3h.g(j2, obj2));
                                l(i2, obj);
                                break;
                            }
                        case LangUtils.HASH_SEED /*17*/:
                            j(i2, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case LangUtils.HASH_OFFSET /*37*/:
                        case 38:
                        case 39:
                        case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.i.b(j2, obj, obj2);
                            break;
                        case 50:
                            Class cls = o2h.a;
                            k3h.p(j2, obj, v1h.a(k3h.i(j2, obj), k3h.i(j2, obj2)));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!s(i4, i2, obj2)) {
                                break;
                            } else {
                                k3h.p(j2, obj, k3h.i(j2, obj2));
                                k3h.n(i4, (long) (iArr[i2 + 2] & 1048575), obj);
                                break;
                            }
                        case 60:
                            k(i2, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!s(i4, i2, obj2)) {
                                break;
                            } else {
                                k3h.p(j2, obj, k3h.i(j2, obj2));
                                k3h.n(i4, (long) (iArr[i2 + 2] & 1048575), obj);
                                break;
                            }
                        case 68:
                            k(i2, obj, obj2);
                            break;
                    }
                    i2 += 3;
                } else {
                    o2h.t(this.j, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final boolean i(Object obj, Object obj2) {
        boolean z;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 < iArr.length) {
                int y = y(i2);
                long j2 = (long) (y & 1048575);
                switch (x(y)) {
                    case 0:
                        if (!o(i2, obj, obj2)) {
                            break;
                        } else {
                            j3h j3h = k3h.c;
                            if (Double.doubleToLongBits(j3h.g1(j2, obj)) != Double.doubleToLongBits(j3h.g1(j2, obj2))) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 1:
                        if (!o(i2, obj, obj2)) {
                            break;
                        } else {
                            j3h j3h2 = k3h.c;
                            if (Float.floatToIntBits(j3h2.h1(j2, obj)) != Float.floatToIntBits(j3h2.h1(j2, obj2))) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 2:
                        if (o(i2, obj, obj2) && k3h.g(j2, obj) == k3h.g(j2, obj2)) {
                            continue;
                        }
                    case 3:
                        if (o(i2, obj, obj2) && k3h.g(j2, obj) == k3h.g(j2, obj2)) {
                            continue;
                        }
                    case 4:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case 5:
                        if (o(i2, obj, obj2) && k3h.g(j2, obj) == k3h.g(j2, obj2)) {
                            continue;
                        }
                    case 6:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case 7:
                        if (!o(i2, obj, obj2)) {
                            break;
                        } else {
                            j3h j3h3 = k3h.c;
                            if (j3h3.m1(j2, obj) != j3h3.m1(j2, obj2)) {
                                break;
                            } else {
                                continue;
                            }
                        }
                    case 8:
                        if (o(i2, obj, obj2) && o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2))) {
                            continue;
                        }
                    case 9:
                        if (o(i2, obj, obj2) && o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2))) {
                            continue;
                        }
                    case 10:
                        if (o(i2, obj, obj2) && o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2))) {
                            continue;
                        }
                    case 11:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case 12:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case 13:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        if (o(i2, obj, obj2) && k3h.g(j2, obj) == k3h.g(j2, obj2)) {
                            continue;
                        }
                    case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                        if (o(i2, obj, obj2) && k3h.f(j2, obj) == k3h.f(j2, obj2)) {
                            continue;
                        }
                    case 16:
                        if (o(i2, obj, obj2) && k3h.g(j2, obj) == k3h.g(j2, obj2)) {
                            continue;
                        }
                    case LangUtils.HASH_SEED /*17*/:
                        if (o(i2, obj, obj2) && o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2))) {
                            continue;
                        }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case LangUtils.HASH_OFFSET /*37*/:
                    case 38:
                    case 39:
                    case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2));
                        break;
                    case 50:
                        z = o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = (long) (iArr[i2 + 2] & 1048575);
                        if (k3h.f(j3, obj) == k3h.f(j3, obj2) && o2h.f(k3h.i(j2, obj), k3h.i(j2, obj2))) {
                            continue;
                        }
                }
                if (z) {
                    i2 += 3;
                }
            } else {
                this.j.getClass();
                return ((p0h) obj).zzc.equals(((p0h) obj2).zzc);
            }
        }
        return false;
    }

    public final void j(int i2, Object obj, Object obj2) {
        if (p(i2, obj2)) {
            Unsafe unsafe = l;
            long y = (long) (y(i2) & 1048575);
            Object object = unsafe.getObject(obj2, y);
            if (object != null) {
                l2h B = B(i2);
                if (!p(i2, obj)) {
                    if (!r(object)) {
                        unsafe.putObject(obj, y, object);
                    } else {
                        p0h a2 = B.a();
                        B.h(a2, object);
                        unsafe.putObject(obj, y, a2);
                    }
                    l(i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, y);
                if (!r(object2)) {
                    p0h a3 = B.a();
                    B.h(a3, object2);
                    unsafe.putObject(obj, y, a3);
                    object2 = a3;
                }
                B.h(object2, object);
                return;
            }
            int i3 = this.a[i2];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    public final void k(int i2, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (s(i3, i2, obj2)) {
            Unsafe unsafe = l;
            long y = (long) (y(i2) & 1048575);
            Object object = unsafe.getObject(obj2, y);
            if (object != null) {
                l2h B = B(i2);
                if (!s(i3, i2, obj)) {
                    if (!r(object)) {
                        unsafe.putObject(obj, y, object);
                    } else {
                        p0h a2 = B.a();
                        B.h(a2, object);
                        unsafe.putObject(obj, y, a2);
                    }
                    k3h.n(i3, (long) (iArr[i2 + 2] & 1048575), obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, y);
                if (!r(object2)) {
                    p0h a3 = B.a();
                    B.h(a3, object2);
                    unsafe.putObject(obj, y, a3);
                    object2 = a3;
                }
                B.h(object2, object);
                return;
            }
            int i4 = iArr[i2];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i4 + " is present but null: " + obj3);
        }
    }

    public final void l(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            k3h.n((1 << (i3 >>> 20)) | k3h.f(j2, obj), j2, obj);
        }
    }

    public final void m(int i2, Object obj, Object obj2) {
        l.putObject(obj, (long) (y(i2) & 1048575), obj2);
        l(i2, obj);
    }

    public final void n(int i2, Object obj, Object obj2, int i3) {
        l.putObject(obj, (long) (y(i3) & 1048575), obj2);
        k3h.n(i2, (long) (this.a[i3 + 2] & 1048575), obj);
    }

    public final boolean o(int i2, Object obj, Object obj2) {
        return p(i2, obj) == p(i2, obj2);
    }

    public final boolean p(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & k3h.f(j2, obj)) != 0;
        }
        int y = y(i2);
        long j3 = (long) (y & 1048575);
        switch (x(y)) {
            case 0:
                return Double.doubleToRawLongBits(k3h.c.g1(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(k3h.c.h1(j3, obj)) != 0;
            case 2:
                return k3h.g(j3, obj) != 0;
            case 3:
                return k3h.g(j3, obj) != 0;
            case 4:
                return k3h.f(j3, obj) != 0;
            case 5:
                return k3h.g(j3, obj) != 0;
            case 6:
                return k3h.f(j3, obj) != 0;
            case 7:
                return k3h.c.m1(j3, obj);
            case 8:
                Object i4 = k3h.i(j3, obj);
                if (i4 instanceof String) {
                    return !((String) i4).isEmpty();
                }
                if (i4 instanceof fzg) {
                    return !fzg.c.equals(i4);
                }
                throw new IllegalArgumentException();
            case 9:
                return k3h.i(j3, obj) != null;
            case 10:
                return !fzg.c.equals(k3h.i(j3, obj));
            case 11:
                return k3h.f(j3, obj) != 0;
            case 12:
                return k3h.f(j3, obj) != 0;
            case 13:
                return k3h.f(j3, obj) != 0;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return k3h.g(j3, obj) != 0;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return k3h.f(j3, obj) != 0;
            case 16:
                return k3h.g(j3, obj) != 0;
            case LangUtils.HASH_SEED /*17*/:
                return k3h.i(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean q(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? p(i2, obj) : (i4 & i5) != 0;
    }

    public final boolean s(int i2, int i3, Object obj) {
        return k3h.f((long) (this.a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v117, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v124, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v130, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v133, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v138, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v139, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v141, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v68, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v103, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v70, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v106, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v71, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v72, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v73, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v150, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v96, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v77, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v79, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v118, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v97, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v120, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v121, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r1v118, types: [x0h, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0406, code lost:
        r6 = r41;
        r3 = r8;
        r10 = r9;
        r16 = r17;
        r18 = r19;
        r9 = r33;
        r17 = r1;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0414, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0415, code lost:
        r13 = r5;
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0437, code lost:
        r6 = r41;
        r3 = r8;
        r10 = r9;
        r16 = r17;
        r18 = r19;
        r9 = r33;
        r8 = r1;
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x046b, code lost:
        r5 = r40;
        r6 = r41;
        r3 = r8;
        r2 = r13;
        r16 = r17;
        r8 = r18;
        r18 = r19;
        r17 = r10;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0519, code lost:
        r23 = r39;
        r3 = r4;
        r34 = r5;
        r13 = r8;
        r24 = r14;
        r20 = r17;
        r5 = r18;
        r25 = r32;
        r8 = r33;
        r14 = r7;
        r17 = r10;
        r7 = r0;
        r10 = r9;
        r9 = r19;
        r0 = r41;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x064b, code lost:
        r5 = r8;
        r12 = r11;
        r8 = r13;
        r25 = r32;
        r11 = r33;
        r0 = true;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0653, code lost:
        r13 = r10;
        r10 = r9;
        r9 = r18;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0661, code lost:
        r8 = r13;
        r25 = r32;
        r11 = r33;
        r0 = true;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0667, code lost:
        r13 = r10;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0668, code lost:
        r10 = r9;
        r9 = r18;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0691, code lost:
        r5 = r8;
        r12 = r11;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0770, code lost:
        r5 = r8;
        r12 = r11;
        r8 = r13;
        r0 = r19;
        r25 = r32;
        r11 = r2;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0819, code lost:
        r5 = r4;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x088d, code lost:
        r11 = r2;
        r12 = r3;
        r5 = r4;
        r0 = true;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08ff, code lost:
        r11 = r2;
        r12 = r3;
        r5 = r4;
        r0 = true;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0927, code lost:
        r1 = r0;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x09c0, code lost:
        r11 = r2;
        r12 = r3;
        r5 = r4;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0aaa, code lost:
        r1 = r12;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0aab, code lost:
        if (r1 == r12) goto L_0x0abf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0aad, code lost:
        r6 = r41;
        r14 = r0;
        r18 = r10;
        r9 = r11;
        r3 = r13;
        r16 = r20;
        r13 = r34;
        r2 = 3;
        r0 = r36;
        r10 = r5;
        r5 = r8;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0abf, code lost:
        r0 = r41;
        r3 = r1;
        r14 = r7;
        r8 = r11;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0b2f, code lost:
        r7 = r36;
        r39 = r5;
        r5 = r9;
        r19 = r10;
        r8 = r14;
        r14 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0b6f, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0b92, code lost:
        r13 = r2;
        r39 = r5;
        r14 = r6;
        r19 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0b99, code lost:
        r13 = r2;
        r39 = r5;
        r14 = r6;
        r19 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0b9f, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0c06, code lost:
        r13 = r2;
        r39 = r5;
        r19 = r14;
        r5 = r3;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a4, code lost:
        r9 = r33;
        r17 = r1;
        r8 = r2;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ab, code lost:
        r35 = r13;
        r13 = r5;
        r5 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b4, code lost:
        r19 = r25;
        r18 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0d9b, code lost:
        r10 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0d9d, code lost:
        if (r1 == r4) goto L_0x0db1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d9f, code lost:
        r5 = r40;
        r6 = r41;
        r0 = r7;
        r9 = r8;
        r3 = r13;
        r7 = r14;
        r18 = r19;
        r16 = r20;
        r13 = r34;
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0db1, code lost:
        r0 = r41;
        r3 = r1;
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b8, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0021, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0021, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0021, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x024b, code lost:
        r19 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x028c, code lost:
        r10 = r9;
        r9 = r33;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x0dca  */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0770 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02e6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.gv1 r42) {
        /*
            r36 = this;
            r0 = r36
            r7 = r37
            r15 = r38
            r5 = r40
            r6 = r41
            r3 = r42
            r2 = 3
            r14 = 1
            boolean r8 = r(r37)
            if (r8 == 0) goto L_0x0e4c
            sun.misc.Unsafe r13 = l
            r8 = r39
            r9 = -1
            r10 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r17 = 0
            r18 = 0
        L_0x0021:
            java.lang.Object[] r1 = r0.b
            int[] r11 = r0.a
            r21 = 0
            if (r8 >= r5) goto L_0x0dee
            int r4 = r8 + 1
            byte r8 = r15[r8]
            if (r8 >= 0) goto L_0x0035
            int r4 = defpackage.bs0.m0(r8, r15, r4, r3)
            int r8 = r3.a
        L_0x0035:
            int r14 = r8 >>> 3
            int r12 = r0.d
            r39 = r1
            int r1 = r0.c
            if (r14 <= r9) goto L_0x004d
            int r10 = r10 / r2
            if (r14 < r1) goto L_0x0049
            if (r14 > r12) goto L_0x0049
            int r1 = r0.w(r14, r10)
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            r12 = r1
            r1 = 0
            goto L_0x005a
        L_0x004d:
            if (r14 < r1) goto L_0x0058
            if (r14 > r12) goto L_0x0058
            r1 = 0
            int r9 = r0.w(r14, r1)
            r12 = r9
            goto L_0x005a
        L_0x0058:
            r1 = 0
            r12 = -1
        L_0x005a:
            b3h r10 = defpackage.b3h.f
            r9 = -1
            if (r12 != r9) goto L_0x0077
            r23 = r39
            r24 = r1
            r5 = r10
            r25 = r11
            r34 = r13
            r20 = r16
            r10 = r24
            r13 = r3
            r3 = r4
            r16 = r9
            r9 = r8
            r8 = r14
            r14 = r7
            r7 = r0
            r0 = r6
            goto L_0x0db6
        L_0x0077:
            r1 = r8 & 7
            r18 = 1
            int r22 = r12 + 1
            r9 = r11[r22]
            int r2 = x(r9)
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r9 & r20
            long r5 = (long) r5
            r25 = r8
            r8 = 17
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            r27 = 0
            r29 = r10
            java.lang.String r10 = ""
            if (r2 > r8) goto L_0x0534
            r19 = 2
            int r8 = r12 + 2
            r8 = r11[r8]
            int r31 = r8 >>> 20
            r23 = 1
            int r31 = r23 << r31
            r32 = r11
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r11
            r20 = r10
            r10 = r16
            r16 = r12
            if (r8 == r10) goto L_0x00c8
            if (r10 == r11) goto L_0x00bc
            long r11 = (long) r10
            r10 = r17
            r13.putInt(r7, r11, r10)
            r11 = 1048575(0xfffff, float:1.469367E-39)
        L_0x00bc:
            if (r8 != r11) goto L_0x00c0
            r10 = 0
            goto L_0x00c5
        L_0x00c0:
            long r11 = (long) r8
            int r10 = r13.getInt(r7, r11)
        L_0x00c5:
            r17 = r8
            goto L_0x00ce
        L_0x00c8:
            r35 = r17
            r17 = r10
            r10 = r35
        L_0x00ce:
            switch(r2) {
                case 0: goto L_0x04e4;
                case 1: goto L_0x04c1;
                case 2: goto L_0x049b;
                case 3: goto L_0x049b;
                case 4: goto L_0x047d;
                case 5: goto L_0x0446;
                case 6: goto L_0x041a;
                case 7: goto L_0x03e3;
                case 8: goto L_0x0291;
                case 9: goto L_0x024f;
                case 10: goto L_0x0223;
                case 11: goto L_0x047d;
                case 12: goto L_0x01bc;
                case 13: goto L_0x041a;
                case 14: goto L_0x0446;
                case 15: goto L_0x017b;
                case 16: goto L_0x0122;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            r2 = 3
            if (r1 != r2) goto L_0x0110
            r1 = r10 | r31
            r5 = r16
            java.lang.Object r6 = r0.C(r5, r7)
            int r8 = r14 << 3
            r16 = r8 | 4
            l2h r9 = r0.B(r5)
            r12 = r25
            r8 = r6
            r18 = -1
            r10 = r38
            r11 = r4
            r4 = r12
            r12 = r40
            r22 = r13
            r13 = r16
            r33 = r14
            r14 = r42
            int r8 = defpackage.bs0.p0(r8, r9, r10, r11, r12, r13, r14)
            r0.m(r5, r7, r6)
            r6 = r41
            r18 = r4
            r10 = r5
            r16 = r17
            r13 = r22
            r9 = r33
            r14 = 1
            r5 = r40
            r17 = r1
            goto L_0x0021
        L_0x0110:
            r33 = r14
            r18 = -1
            r8 = r3
            r5 = r13
            r9 = r16
            r16 = r18
            r19 = r25
            r18 = r29
            r14 = 0
        L_0x011f:
            r13 = r2
            goto L_0x0519
        L_0x0122:
            r11 = r5
            r22 = r13
            r33 = r14
            r5 = r16
            r14 = r25
            r2 = 3
            r13 = 0
            r18 = -1
            if (r1 != 0) goto L_0x016b
            r8 = r10 | r31
            int r9 = defpackage.bs0.o0(r15, r4, r3)
            r25 = r14
            long r13 = r3.b
            long r13 = defpackage.n54.a0(r13)
            r10 = r19
            r1 = r22
            r6 = r2
            r2 = r37
            r39 = r8
            r16 = r18
            r8 = r3
            r3 = r11
            r11 = r40
            r12 = r41
            r18 = r9
            r9 = r5
            r5 = r13
            r1.putLong(r2, r3, r5)
            r3 = r8
            r10 = r9
            r5 = r11
            r6 = r12
            r16 = r17
            r8 = r18
            r13 = r22
            r18 = r25
            r9 = r33
            r2 = 3
            r14 = 1
            r17 = r39
            goto L_0x0021
        L_0x016b:
            r11 = r40
            r12 = r41
            r8 = r3
            r9 = r5
            r16 = r18
            r19 = r14
            r5 = r22
            r18 = r29
            r14 = r13
            goto L_0x011f
        L_0x017b:
            r8 = r3
            r11 = r5
            r22 = r13
            r33 = r14
            r9 = r16
            r14 = r19
            r16 = -1
            r13 = r40
            r6 = r41
            if (r1 != 0) goto L_0x01b2
            r1 = r10 | r31
            int r2 = defpackage.bs0.l0(r15, r4, r8)
            int r3 = r8.a
            int r3 = defpackage.n54.Z(r3)
            r5 = r22
            r5.putInt(r7, r11, r3)
            r3 = r8
            r10 = r9
            r16 = r17
            r18 = r25
        L_0x01a4:
            r9 = r33
            r14 = 1
            r17 = r1
            r8 = r2
            r2 = 3
        L_0x01ab:
            r35 = r13
            r13 = r5
            r5 = r35
            goto L_0x0021
        L_0x01b2:
            r5 = r22
        L_0x01b4:
            r19 = r25
            r18 = r29
        L_0x01b8:
            r13 = 3
            r14 = 0
            goto L_0x0519
        L_0x01bc:
            r8 = r3
            r11 = r5
            r3 = r9
            r5 = r13
            r33 = r14
            r9 = r16
            r14 = r19
            r16 = -1
            r13 = r40
            r6 = r41
            if (r1 != 0) goto L_0x01b4
            int r1 = defpackage.bs0.l0(r15, r4, r8)
            int r2 = r8.a
            t0h r4 = r0.A(r9)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r18
            if (r3 == 0) goto L_0x01e6
            if (r4 == 0) goto L_0x01e6
            boolean r3 = r4.a(r2)
            if (r3 == 0) goto L_0x01e9
        L_0x01e6:
            r3 = r25
            goto L_0x0210
        L_0x01e9:
            r3 = r7
            p0h r3 = (defpackage.p0h) r3
            b3h r4 = r3.zzc
            r11 = r29
            if (r4 != r11) goto L_0x01f8
            b3h r4 = defpackage.b3h.b()
            r3.zzc = r4
        L_0x01f8:
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = r25
            r4.c(r3, r2)
            r18 = r3
            r3 = r8
            r16 = r17
            r2 = 3
            r14 = 1
            r8 = r1
            r17 = r10
            r10 = r9
            r9 = r33
            goto L_0x01ab
        L_0x0210:
            r4 = r10 | r31
            r5.putInt(r7, r11, r2)
            r18 = r3
            r3 = r8
            r10 = r9
            r16 = r17
            r9 = r33
            r2 = 3
            r14 = 1
            r8 = r1
            r17 = r4
            goto L_0x01ab
        L_0x0223:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r14 = r19
            r3 = r25
            r18 = r29
            r16 = -1
            r13 = r40
            r6 = r41
            if (r1 != r14) goto L_0x024b
            r1 = r10 | r31
            int r2 = defpackage.bs0.f0(r15, r4, r8)
            java.lang.Object r4 = r8.c
            r5.putObject(r7, r11, r4)
            r18 = r3
            r3 = r8
            r10 = r9
            r16 = r17
            goto L_0x01a4
        L_0x024b:
            r19 = r3
            goto L_0x01b8
        L_0x024f:
            r6 = r41
            r8 = r3
            r5 = r13
            r33 = r14
            r9 = r16
            r14 = r19
            r3 = r25
            r18 = r29
            r16 = -1
            r13 = r40
            if (r1 != r14) goto L_0x024b
            r10 = r10 | r31
            java.lang.Object r11 = r0.C(r9, r7)
            l2h r2 = r0.B(r9)
            r1 = r11
            r19 = r3
            r3 = r38
            r12 = r5
            r5 = r40
            r6 = r42
            int r1 = defpackage.bs0.q0(r1, r2, r3, r4, r5, r6)
            r0.m(r9, r7, r11)
            r6 = r41
            r3 = r8
            r5 = r13
            r16 = r17
            r18 = r19
            r2 = 3
            r14 = 1
            r8 = r1
            r17 = r10
            r13 = r12
        L_0x028c:
            r10 = r9
            r9 = r33
            goto L_0x0021
        L_0x0291:
            r8 = r3
            r11 = r5
            r3 = r9
            r5 = r13
            r33 = r14
            r9 = r16
            r14 = r19
            r19 = r25
            r18 = r29
            r16 = -1
            r13 = r40
            if (r1 != r14) goto L_0x01b8
            r1 = r3 & r26
            if (r1 == 0) goto L_0x03a8
            int r1 = defpackage.bs0.l0(r15, r4, r8)
            int r2 = r8.a
            if (r2 < 0) goto L_0x03a3
            r3 = r10 | r31
            if (r2 != 0) goto L_0x02bf
            r6 = r20
            r8.c = r6
            r39 = r3
            r13 = 3
            r14 = 0
            goto L_0x0384
        L_0x02bf:
            js9 r4 = defpackage.r3h.a
            int r4 = r15.length
            int r6 = r4 - r1
            r10 = r1 | r2
            int r6 = r6 - r2
            r6 = r6 | r10
            if (r6 < 0) goto L_0x0387
            int r4 = r1 + r2
            char[] r2 = new char[r2]
            r6 = 0
        L_0x02cf:
            if (r1 >= r4) goto L_0x0370
            byte r10 = r15[r1]
            boolean r18 = defpackage.tf6.H0(r10)
            if (r18 == 0) goto L_0x0370
            r14 = 1
            int r1 = r1 + r14
            int r18 = r6 + 1
            char r10 = (char) r10
            r2[r6] = r10
            r6 = r18
            r14 = 2
            goto L_0x02cf
        L_0x02e4:
            if (r1 >= r4) goto L_0x0378
            int r10 = r1 + 1
            byte r14 = r15[r1]
            boolean r18 = defpackage.tf6.H0(r14)
            if (r18 == 0) goto L_0x030f
            r18 = 1
            int r1 = r6 + 1
            char r14 = (char) r14
            r2[r6] = r14
            r6 = r1
            r1 = r10
        L_0x02f9:
            if (r1 >= r4) goto L_0x030c
            byte r10 = r15[r1]
            boolean r14 = defpackage.tf6.H0(r10)
            if (r14 == 0) goto L_0x030c
            int r1 = r1 + 1
            int r14 = r6 + 1
            char r10 = (char) r10
            r2[r6] = r10
            r6 = r14
            goto L_0x02f9
        L_0x030c:
            r14 = r18
            goto L_0x02e4
        L_0x030f:
            r39 = r3
            r18 = 1
            r3 = -32
            if (r14 >= r3) goto L_0x032f
            if (r10 >= r4) goto L_0x032a
            int r3 = r6 + 1
            r20 = 2
            int r1 = r1 + 2
            byte r10 = r15[r10]
            defpackage.tf6.F0(r14, r10, r2, r6)
            r6 = r3
            r14 = r18
        L_0x0327:
            r3 = r39
            goto L_0x02e4
        L_0x032a:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x032f:
            r20 = 2
            r3 = -16
            if (r14 >= r3) goto L_0x0350
            int r3 = r4 + -1
            if (r10 >= r3) goto L_0x034b
            int r3 = r6 + 1
            int r18 = r1 + 2
            byte r10 = r15[r10]
            r13 = 3
            int r1 = r1 + r13
            byte r13 = r15[r18]
            defpackage.tf6.D0(r14, r10, r13, r2, r6)
            r13 = r40
            r6 = r3
            r14 = 1
            goto L_0x0327
        L_0x034b:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x0350:
            int r3 = r4 + -2
            if (r10 >= r3) goto L_0x0373
            int r3 = r1 + 2
            byte r26 = r15[r10]
            r13 = 3
            int r10 = r1 + 3
            byte r27 = r15[r3]
            int r1 = r1 + 4
            byte r28 = r15[r10]
            r25 = r14
            r29 = r2
            r30 = r6
            defpackage.tf6.C0(r25, r26, r27, r28, r29, r30)
            r3 = 2
            int r6 = r6 + r3
            r3 = r39
            r13 = r40
        L_0x0370:
            r14 = 1
            goto L_0x02e4
        L_0x0373:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x0378:
            r39 = r3
            r13 = 3
            java.lang.String r1 = new java.lang.String
            r14 = 0
            r1.<init>(r2, r14, r6)
            r8.c = r1
            r1 = r4
        L_0x0384:
            r3 = r39
            goto L_0x03c5
        L_0x0387:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r2}
            java.lang.String r2 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x03a3:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x03a8:
            r6 = r20
            r13 = 3
            r14 = 0
            int r1 = defpackage.bs0.l0(r15, r4, r8)
            int r2 = r8.a
            if (r2 < 0) goto L_0x03de
            r3 = r10 | r31
            if (r2 != 0) goto L_0x03bb
            r8.c = r6
            goto L_0x03c5
        L_0x03bb:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r6 = defpackage.y0h.a
            r4.<init>(r15, r1, r2, r6)
            r8.c = r4
            int r1 = r1 + r2
        L_0x03c5:
            java.lang.Object r2 = r8.c
            r5.putObject(r7, r11, r2)
            r6 = r41
            r10 = r9
            r2 = r13
            r16 = r17
            r18 = r19
            r9 = r33
            r14 = 1
            r17 = r3
            r13 = r5
            r3 = r8
            r5 = r40
        L_0x03db:
            r8 = r1
            goto L_0x0021
        L_0x03de:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x03e3:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r19 = r25
            r18 = r29
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != 0) goto L_0x0519
            r1 = r10 | r31
            int r2 = defpackage.bs0.o0(r15, r4, r8)
            long r3 = r8.b
            int r3 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r3 == 0) goto L_0x0402
            r3 = 1
            goto L_0x0403
        L_0x0402:
            r3 = r14
        L_0x0403:
            defpackage.k3h.k(r7, r11, r3)
        L_0x0406:
            r6 = r41
            r3 = r8
            r10 = r9
            r16 = r17
            r18 = r19
            r9 = r33
            r14 = 1
            r17 = r1
            r8 = r2
        L_0x0414:
            r2 = r13
        L_0x0415:
            r13 = r5
            r5 = r40
            goto L_0x0021
        L_0x041a:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r19 = r25
            r18 = r29
            r2 = 5
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != r2) goto L_0x0519
            int r1 = r4 + 4
            r2 = r10 | r31
            int r3 = defpackage.bs0.g0(r4, r15)
            r5.putInt(r7, r11, r3)
        L_0x0437:
            r6 = r41
            r3 = r8
            r10 = r9
            r16 = r17
            r18 = r19
            r9 = r33
            r14 = 1
            r8 = r1
            r17 = r2
            goto L_0x0414
        L_0x0446:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r2 = r23
            r19 = r25
            r18 = r29
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != r2) goto L_0x0519
            int r18 = r4 + 8
            r10 = r10 | r31
            long r21 = defpackage.bs0.r0(r4, r15)
            r1 = r5
            r2 = r37
            r3 = r11
            r11 = r5
            r5 = r21
            r1.putLong(r2, r3, r5)
        L_0x046b:
            r5 = r40
            r6 = r41
            r3 = r8
            r2 = r13
            r16 = r17
            r8 = r18
            r18 = r19
            r14 = 1
            r17 = r10
            r13 = r11
            goto L_0x028c
        L_0x047d:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r19 = r25
            r18 = r29
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != 0) goto L_0x0519
            r1 = r10 | r31
            int r2 = defpackage.bs0.l0(r15, r4, r8)
            int r3 = r8.a
            r5.putInt(r7, r11, r3)
            goto L_0x0406
        L_0x049b:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r19 = r25
            r18 = r29
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != 0) goto L_0x0519
            r10 = r10 | r31
            int r18 = defpackage.bs0.o0(r15, r4, r8)
            long r3 = r8.b
            r1 = r5
            r2 = r37
            r21 = r3
            r3 = r11
            r11 = r5
            r5 = r21
            r1.putLong(r2, r3, r5)
            goto L_0x046b
        L_0x04c1:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r19 = r25
            r18 = r29
            r2 = 5
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != r2) goto L_0x0519
            int r1 = r4 + 4
            r2 = r10 | r31
            int r3 = defpackage.bs0.g0(r4, r15)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            defpackage.k3h.m(r7, r11, r3)
            goto L_0x0437
        L_0x04e4:
            r8 = r3
            r11 = r5
            r5 = r13
            r33 = r14
            r9 = r16
            r2 = r23
            r19 = r25
            r18 = r29
            r13 = 3
            r14 = 0
            r16 = -1
            if (r1 != r2) goto L_0x0519
            int r1 = r4 + 8
            r3 = r10 | r31
            long r21 = defpackage.bs0.r0(r4, r15)
            r39 = r3
            double r2 = java.lang.Double.longBitsToDouble(r21)
            defpackage.k3h.l(r7, r11, r2)
            r6 = r41
            r3 = r8
            r10 = r9
            r2 = r13
            r16 = r17
            r18 = r19
            r9 = r33
            r14 = 1
            r17 = r39
            r8 = r1
            goto L_0x0415
        L_0x0519:
            r23 = r39
            r3 = r4
            r34 = r5
            r13 = r8
            r24 = r14
            r20 = r17
            r5 = r18
            r25 = r32
            r8 = r33
            r14 = r7
            r17 = r10
            r7 = r0
            r10 = r9
            r9 = r19
            r0 = r41
            goto L_0x0db6
        L_0x0534:
            r8 = r3
            r3 = r9
            r32 = r11
            r9 = r12
            r33 = r14
            r19 = r25
            r18 = r29
            r14 = 0
            r22 = 1
            r11 = r5
            r6 = r10
            r5 = r13
            r10 = r16
            r16 = -1
            r13 = 27
            r23 = 10
            if (r2 != r13) goto L_0x05be
            r13 = 2
            if (r1 != r13) goto L_0x05a6
            java.lang.Object r1 = r5.getObject(r7, r11)
            x0h r1 = (defpackage.x0h) r1
            bzg r1 = (defpackage.bzg) r1
            boolean r2 = r1.d()
            if (r2 != 0) goto L_0x0573
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0569
        L_0x0566:
            r2 = r23
            goto L_0x056c
        L_0x0569:
            int r23 = r2 + r2
            goto L_0x0566
        L_0x056c:
            x0h r1 = r1.c(r2)
            r5.putObject(r7, r11, r1)
        L_0x0573:
            l2h r2 = r0.B(r9)
            r3 = r8
            r8 = r2
            r2 = r9
            r9 = r19
            r20 = r10
            r10 = r38
            r11 = r4
            r12 = r40
            r6 = r40
            r4 = r13
            r24 = r14
            r14 = 3
            r13 = r1
            r15 = r14
            r1 = r19
            r4 = r22
            r14 = r42
            int r8 = defpackage.bs0.i0(r8, r9, r10, r11, r12, r13, r14)
            r18 = r1
            r10 = r2
            r14 = r4
            r13 = r5
            r5 = r6
            r2 = r15
            r16 = r20
            r9 = r33
            r15 = r38
            r6 = r41
            goto L_0x0021
        L_0x05a6:
            r20 = r10
            r24 = r14
            r15 = r38
            r23 = r39
            r34 = r5
            r13 = r8
            r5 = r9
            r9 = r18
            r10 = r19
            r25 = r32
            r14 = r33
            r8 = r40
            goto L_0x0b17
        L_0x05be:
            r13 = r40
            r20 = r10
            r24 = r14
            r15 = 3
            r10 = r8
            r8 = r9
            r9 = r19
            r14 = 49
            if (r2 > r14) goto L_0x0ad9
            r22 = r5
            r14 = r6
            long r5 = (long) r3
            sun.misc.Unsafe r3 = l
            java.lang.Object r19 = r3.getObject(r7, r11)
            x0h r19 = (defpackage.x0h) r19
            r15 = r19
            bzg r15 = (defpackage.bzg) r15
            boolean r19 = r15.d()
            if (r19 != 0) goto L_0x05f9
            int r19 = r15.size()
            if (r19 != 0) goto L_0x05ee
        L_0x05e9:
            r19 = r14
            r14 = r23
            goto L_0x05f1
        L_0x05ee:
            int r23 = r19 + r19
            goto L_0x05e9
        L_0x05f1:
            x0h r14 = r15.c(r14)
            r3.putObject(r7, r11, r14)
            goto L_0x05fc
        L_0x05f9:
            r19 = r14
            r14 = r15
        L_0x05fc:
            switch(r2) {
                case 18: goto L_0x0a77;
                case 19: goto L_0x0a37;
                case 20: goto L_0x09fe;
                case 21: goto L_0x09fe;
                case 22: goto L_0x09cc;
                case 23: goto L_0x0990;
                case 24: goto L_0x093d;
                case 25: goto L_0x0905;
                case 26: goto L_0x0829;
                case 27: goto L_0x07e8;
                case 28: goto L_0x077a;
                case 29: goto L_0x09cc;
                case 30: goto L_0x06ef;
                case 31: goto L_0x093d;
                case 32: goto L_0x0990;
                case 33: goto L_0x069b;
                case 34: goto L_0x066d;
                case 35: goto L_0x0a77;
                case 36: goto L_0x0a37;
                case 37: goto L_0x09fe;
                case 38: goto L_0x09fe;
                case 39: goto L_0x09cc;
                case 40: goto L_0x0990;
                case 41: goto L_0x093d;
                case 42: goto L_0x0905;
                case 43: goto L_0x09cc;
                case 44: goto L_0x06ef;
                case 45: goto L_0x093d;
                case 46: goto L_0x0990;
                case 47: goto L_0x069b;
                case 48: goto L_0x066d;
                default: goto L_0x05ff;
            }
        L_0x05ff:
            r11 = 3
            if (r1 != r11) goto L_0x0659
            r1 = r9 & -8
            r12 = r1 | 4
            l2h r15 = r0.B(r8)
            r23 = r39
            r1 = r15
            r2 = r38
            r3 = r4
            r6 = r4
            r4 = r40
            r34 = r22
            r5 = r12
            r11 = r6
            r6 = r42
            int r1 = defpackage.bs0.h0(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r10.c
            r14.add(r2)
        L_0x0622:
            if (r1 >= r13) goto L_0x0649
            r6 = r38
            r5 = 3
            int r3 = defpackage.bs0.l0(r6, r1, r10)
            int r2 = r10.a
            if (r9 != r2) goto L_0x0647
            r1 = r15
            r2 = r38
            r4 = r40
            r39 = r15
            r15 = r5
            r5 = r12
            r15 = r6
            r6 = r42
            int r1 = defpackage.bs0.h0(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r10.c
            r14.add(r2)
            r15 = r39
            goto L_0x0622
        L_0x0647:
            r15 = r6
            goto L_0x064b
        L_0x0649:
            r15 = r38
        L_0x064b:
            r5 = r8
            r12 = r11
            r8 = r13
            r25 = r32
            r11 = r33
            r0 = 1
        L_0x0653:
            r13 = r10
            r10 = r9
            r9 = r18
            goto L_0x0aab
        L_0x0659:
            r15 = r38
            r23 = r39
            r34 = r22
            r12 = r4
            r5 = r8
        L_0x0661:
            r8 = r13
            r25 = r32
            r11 = r33
            r0 = 1
        L_0x0667:
            r13 = r10
        L_0x0668:
            r10 = r9
            r9 = r18
            goto L_0x0aaa
        L_0x066d:
            r15 = r38
            r23 = r39
            r11 = r4
            r34 = r22
            r12 = 2
            if (r1 != r12) goto L_0x068f
            defpackage.wzf.o(r14)
            int r1 = defpackage.bs0.l0(r15, r11, r10)
            int r2 = r10.a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x068b
            if (r1 != r2) goto L_0x0686
            goto L_0x064b
        L_0x0686:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x068b:
            defpackage.bs0.o0(r15, r1, r10)
            throw r21
        L_0x068f:
            if (r1 == 0) goto L_0x0694
        L_0x0691:
            r5 = r8
            r12 = r11
            goto L_0x0661
        L_0x0694:
            defpackage.wzf.o(r14)
            defpackage.bs0.o0(r15, r11, r10)
            throw r21
        L_0x069b:
            r15 = r38
            r23 = r39
            r11 = r4
            r34 = r22
            r12 = 2
            if (r1 != r12) goto L_0x06c6
            r0h r14 = (defpackage.r0h) r14
            int r1 = defpackage.bs0.l0(r15, r11, r10)
            int r2 = r10.a
            int r2 = r2 + r1
        L_0x06ae:
            if (r1 >= r2) goto L_0x06be
            int r1 = defpackage.bs0.l0(r15, r1, r10)
            int r3 = r10.a
            int r3 = defpackage.n54.Z(r3)
            r14.e(r3)
            goto L_0x06ae
        L_0x06be:
            if (r1 != r2) goto L_0x06c1
            goto L_0x064b
        L_0x06c1:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x06c6:
            if (r1 != 0) goto L_0x0691
            r0h r14 = (defpackage.r0h) r14
            int r1 = defpackage.bs0.l0(r15, r11, r10)
            int r2 = r10.a
            int r2 = defpackage.n54.Z(r2)
            r14.e(r2)
        L_0x06d7:
            if (r1 >= r13) goto L_0x064b
            int r2 = defpackage.bs0.l0(r15, r1, r10)
            int r3 = r10.a
            if (r9 != r3) goto L_0x064b
            int r1 = defpackage.bs0.l0(r15, r2, r10)
            int r2 = r10.a
            int r2 = defpackage.n54.Z(r2)
            r14.e(r2)
            goto L_0x06d7
        L_0x06ef:
            r15 = r38
            r23 = r39
            r11 = r4
            r34 = r22
            r12 = 2
            if (r1 != r12) goto L_0x06fe
            int r1 = defpackage.bs0.j0(r15, r11, r14, r10)
            goto L_0x070d
        L_0x06fe:
            if (r1 != 0) goto L_0x0691
            r1 = r9
            r2 = r38
            r3 = r11
            r4 = r40
            r5 = r14
            r6 = r42
            int r1 = defpackage.bs0.n0(r1, r2, r3, r4, r5, r6)
        L_0x070d:
            t0h r2 = r0.A(r8)
            java.lang.Class r3 = defpackage.o2h.a
            if (r2 == 0) goto L_0x0768
            int r3 = r14.size()
            r6 = r21
            r4 = r24
            r5 = r4
        L_0x071e:
            if (r4 >= r3) goto L_0x0758
            java.lang.Object r19 = r14.get(r4)
            r12 = r19
            java.lang.Integer r12 = (java.lang.Integer) r12
            r39 = r1
            int r1 = r12.intValue()
            boolean r19 = r2.a(r1)
            if (r19 == 0) goto L_0x0742
            if (r4 == r5) goto L_0x0739
            r14.set(r5, r12)
        L_0x0739:
            r19 = 1
            int r5 = r5 + 1
            r25 = r2
            r2 = r33
            goto L_0x074e
        L_0x0742:
            r19 = 1
            c3h r12 = r0.j
            r25 = r2
            r2 = r33
            java.lang.Object r6 = defpackage.o2h.s(r7, r2, r1, r6, r12)
        L_0x074e:
            int r4 = r4 + 1
            r1 = r39
            r33 = r2
            r2 = r25
            r12 = 2
            goto L_0x071e
        L_0x0758:
            r39 = r1
            r2 = r33
            r19 = 1
            if (r5 == r3) goto L_0x076e
            java.util.List r1 = r14.subList(r5, r3)
            r1.clear()
            goto L_0x076e
        L_0x0768:
            r39 = r1
            r2 = r33
            r19 = 1
        L_0x076e:
            r1 = r39
        L_0x0770:
            r5 = r8
            r12 = r11
            r8 = r13
            r0 = r19
            r25 = r32
            r11 = r2
            goto L_0x0653
        L_0x077a:
            r15 = r38
            r23 = r39
            r11 = r4
            r34 = r22
            r2 = r33
            r3 = 2
            r19 = 1
            if (r1 != r3) goto L_0x07de
            int r1 = defpackage.bs0.l0(r15, r11, r10)
            int r3 = r10.a
            if (r3 < 0) goto L_0x07d9
            int r4 = r15.length
            int r4 = r4 - r1
            if (r3 > r4) goto L_0x07d4
            if (r3 != 0) goto L_0x079c
            fzg r3 = defpackage.fzg.c
            r14.add(r3)
            goto L_0x07a4
        L_0x079c:
            fzg r4 = defpackage.fzg.g(r1, r15, r3)
            r14.add(r4)
        L_0x07a3:
            int r1 = r1 + r3
        L_0x07a4:
            if (r1 >= r13) goto L_0x0770
            int r3 = defpackage.bs0.l0(r15, r1, r10)
            int r4 = r10.a
            if (r9 != r4) goto L_0x0770
            int r1 = defpackage.bs0.l0(r15, r3, r10)
            int r3 = r10.a
            if (r3 < 0) goto L_0x07cf
            int r4 = r15.length
            int r4 = r4 - r1
            if (r3 > r4) goto L_0x07ca
            if (r3 != 0) goto L_0x07c2
            fzg r3 = defpackage.fzg.c
            r14.add(r3)
            goto L_0x07a4
        L_0x07c2:
            fzg r4 = defpackage.fzg.g(r1, r15, r3)
            r14.add(r4)
            goto L_0x07a3
        L_0x07ca:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x07cf:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x07d4:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x07d9:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x07de:
            r5 = r8
            r12 = r11
            r8 = r13
            r0 = r19
            r25 = r32
            r11 = r2
            goto L_0x0667
        L_0x07e8:
            r15 = r38
            r23 = r39
            r11 = r4
            r34 = r22
            r2 = r33
            r3 = 2
            r19 = 1
            if (r1 != r3) goto L_0x081c
            l2h r1 = r0.B(r8)
            r4 = r8
            r8 = r1
            r1 = r9
            r5 = r10
            r6 = r18
            r10 = r38
            r12 = r11
            r25 = r32
            r0 = r3
            r3 = r12
            r12 = r40
            r13 = r14
            r14 = r42
            int r8 = defpackage.bs0.i0(r8, r9, r10, r11, r12, r13, r14)
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r5
            r9 = r6
            r1 = r8
            r0 = 1
            r8 = r40
        L_0x0819:
            r5 = r4
            goto L_0x0aab
        L_0x081c:
            r0 = r3
            r25 = r32
            r5 = r8
            r13 = r10
            r12 = r11
            r0 = r19
            r8 = r40
            r11 = r2
            goto L_0x0668
        L_0x0829:
            r15 = r38
            r23 = r39
            r3 = r4
            r4 = r8
            r13 = r10
            r34 = r22
            r25 = r32
            r2 = r33
            r0 = 2
            r10 = r9
            r9 = r18
            if (r1 != r0) goto L_0x08fd
            r11 = 536870912(0x20000000, double:2.652494739E-315)
            long r5 = r5 & r11
            int r1 = (r5 > r27 ? 1 : (r5 == r27 ? 0 : -1))
            if (r1 != 0) goto L_0x0898
            int r1 = defpackage.bs0.l0(r15, r3, r13)
            int r5 = r13.a
            if (r5 < 0) goto L_0x0893
            if (r5 != 0) goto L_0x0856
            r6 = r19
            r14.add(r6)
        L_0x0853:
            r8 = r40
            goto L_0x0864
        L_0x0856:
            r6 = r19
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r11 = defpackage.y0h.a
            r8.<init>(r15, r1, r5, r11)
            r14.add(r8)
            int r1 = r1 + r5
            goto L_0x0853
        L_0x0864:
            if (r1 >= r8) goto L_0x088d
            int r5 = defpackage.bs0.l0(r15, r1, r13)
            int r11 = r13.a
            if (r10 != r11) goto L_0x088d
            int r1 = defpackage.bs0.l0(r15, r5, r13)
            int r5 = r13.a
            if (r5 < 0) goto L_0x0888
            if (r5 != 0) goto L_0x087c
            r14.add(r6)
            goto L_0x0864
        L_0x087c:
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = defpackage.y0h.a
            r11.<init>(r15, r1, r5, r12)
            r14.add(r11)
            int r1 = r1 + r5
            goto L_0x0864
        L_0x0888:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x088d:
            r11 = r2
            r12 = r3
            r5 = r4
            r0 = 1
            goto L_0x0aab
        L_0x0893:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x0898:
            r8 = r40
            r6 = r19
            int r1 = defpackage.bs0.l0(r15, r3, r13)
            int r5 = r13.a
            if (r5 < 0) goto L_0x08f8
            if (r5 != 0) goto L_0x08aa
            r14.add(r6)
            goto L_0x08bd
        L_0x08aa:
            int r11 = r1 + r5
            boolean r12 = defpackage.r3h.d(r1, r15, r11)
            if (r12 == 0) goto L_0x08f3
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.y0h.a
            r12.<init>(r15, r1, r5, r0)
            r14.add(r12)
            r1 = r11
        L_0x08bd:
            if (r1 >= r8) goto L_0x088d
            int r0 = defpackage.bs0.l0(r15, r1, r13)
            int r5 = r13.a
            if (r10 != r5) goto L_0x088d
            int r1 = defpackage.bs0.l0(r15, r0, r13)
            int r0 = r13.a
            if (r0 < 0) goto L_0x08ee
            if (r0 != 0) goto L_0x08d5
            r14.add(r6)
            goto L_0x08bd
        L_0x08d5:
            int r5 = r1 + r0
            boolean r11 = defpackage.r3h.d(r1, r15, r5)
            if (r11 == 0) goto L_0x08e9
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = defpackage.y0h.a
            r11.<init>(r15, r1, r0, r12)
            r14.add(r11)
            r1 = r5
            goto L_0x08bd
        L_0x08e9:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x08ee:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x08f3:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x08f8:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.b()
            throw r0
        L_0x08fd:
            r8 = r40
        L_0x08ff:
            r11 = r2
            r12 = r3
            r5 = r4
            r0 = 1
            goto L_0x0aaa
        L_0x0905:
            r15 = r38
            r23 = r39
            r3 = r4
            r4 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r2 = r33
            r0 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r0) goto L_0x0933
            defpackage.wzf.o(r14)
            int r0 = defpackage.bs0.l0(r15, r3, r13)
            int r1 = r13.a
            int r1 = r1 + r0
            if (r0 < r1) goto L_0x092f
            if (r0 != r1) goto L_0x092a
        L_0x0927:
            r1 = r0
            goto L_0x088d
        L_0x092a:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x092f:
            defpackage.bs0.o0(r15, r0, r13)
            throw r21
        L_0x0933:
            if (r1 == 0) goto L_0x0936
            goto L_0x08ff
        L_0x0936:
            defpackage.wzf.o(r14)
            defpackage.bs0.o0(r15, r3, r13)
            throw r21
        L_0x093d:
            r15 = r38
            r23 = r39
            r3 = r4
            r4 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r2 = r33
            r0 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r0) goto L_0x096e
            r0h r14 = (defpackage.r0h) r14
            int r0 = defpackage.bs0.l0(r15, r3, r13)
            int r1 = r13.a
            int r1 = r1 + r0
        L_0x095a:
            if (r0 >= r1) goto L_0x0966
            int r5 = defpackage.bs0.g0(r0, r15)
            r14.e(r5)
            int r0 = r0 + 4
            goto L_0x095a
        L_0x0966:
            if (r0 != r1) goto L_0x0969
            goto L_0x0927
        L_0x0969:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x096e:
            r0 = 5
            if (r1 != r0) goto L_0x08ff
            int r0 = r3 + 4
            r0h r14 = (defpackage.r0h) r14
            int r1 = defpackage.bs0.g0(r3, r15)
            r14.e(r1)
        L_0x097c:
            if (r0 >= r8) goto L_0x0927
            int r1 = defpackage.bs0.l0(r15, r0, r13)
            int r5 = r13.a
            if (r10 != r5) goto L_0x0927
            int r0 = defpackage.bs0.g0(r1, r15)
            r14.e(r0)
            int r0 = r1 + 4
            goto L_0x097c
        L_0x0990:
            r15 = r38
            r23 = r39
            r3 = r4
            r4 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r2 = r33
            r0 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r0) goto L_0x09bd
            defpackage.wzf.o(r14)
            int r0 = defpackage.bs0.l0(r15, r3, r13)
            int r1 = r13.a
            int r1 = r1 + r0
            if (r0 < r1) goto L_0x09b9
            if (r0 != r1) goto L_0x09b4
            goto L_0x0927
        L_0x09b4:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x09b9:
            defpackage.bs0.r0(r0, r15)
            throw r21
        L_0x09bd:
            r0 = 1
            if (r1 == r0) goto L_0x09c5
        L_0x09c0:
            r11 = r2
            r12 = r3
            r5 = r4
            goto L_0x0aaa
        L_0x09c5:
            defpackage.wzf.o(r14)
            defpackage.bs0.r0(r3, r15)
            throw r21
        L_0x09cc:
            r15 = r38
            r23 = r39
            r3 = r4
            r4 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r2 = r33
            r0 = 1
            r5 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r5) goto L_0x09e9
            int r1 = defpackage.bs0.j0(r15, r3, r14, r13)
            r11 = r2
            r12 = r3
            goto L_0x0819
        L_0x09e9:
            if (r1 != 0) goto L_0x09c0
            r1 = r10
            r11 = r2
            r2 = r38
            r12 = r3
            r6 = r4
            r4 = r40
            r5 = r14
            r14 = r6
            r6 = r42
            int r1 = defpackage.bs0.n0(r1, r2, r3, r4, r5, r6)
            r5 = r14
            goto L_0x0aab
        L_0x09fe:
            r15 = r38
            r23 = r39
            r12 = r4
            r5 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r11 = r33
            r0 = 1
            r2 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r2) goto L_0x0a2c
            defpackage.wzf.o(r14)
            int r1 = defpackage.bs0.l0(r15, r12, r13)
            int r2 = r13.a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0a28
            if (r1 != r2) goto L_0x0a23
            goto L_0x0aab
        L_0x0a23:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x0a28:
            defpackage.bs0.o0(r15, r1, r13)
            throw r21
        L_0x0a2c:
            if (r1 == 0) goto L_0x0a30
            goto L_0x0aaa
        L_0x0a30:
            defpackage.wzf.o(r14)
            defpackage.bs0.o0(r15, r12, r13)
            throw r21
        L_0x0a37:
            r15 = r38
            r23 = r39
            r12 = r4
            r5 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r11 = r33
            r0 = 1
            r2 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r2) goto L_0x0a68
            defpackage.wzf.o(r14)
            int r1 = defpackage.bs0.l0(r15, r12, r13)
            int r2 = r13.a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0a60
            if (r1 != r2) goto L_0x0a5b
            goto L_0x0aab
        L_0x0a5b:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x0a60:
            int r0 = defpackage.bs0.g0(r1, r15)
            java.lang.Float.intBitsToFloat(r0)
            throw r21
        L_0x0a68:
            r2 = 5
            if (r1 == r2) goto L_0x0a6c
            goto L_0x0aaa
        L_0x0a6c:
            defpackage.wzf.o(r14)
            int r0 = defpackage.bs0.g0(r12, r15)
            java.lang.Float.intBitsToFloat(r0)
            throw r21
        L_0x0a77:
            r15 = r38
            r23 = r39
            r12 = r4
            r5 = r8
            r8 = r13
            r34 = r22
            r25 = r32
            r11 = r33
            r0 = 1
            r2 = 2
            r13 = r10
            r10 = r9
            r9 = r18
            if (r1 != r2) goto L_0x0aa8
            defpackage.wzf.o(r14)
            int r1 = defpackage.bs0.l0(r15, r12, r13)
            int r2 = r13.a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0aa0
            if (r1 != r2) goto L_0x0a9b
            goto L_0x0aab
        L_0x0a9b:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.d()
            throw r0
        L_0x0aa0:
            long r0 = defpackage.bs0.r0(r1, r15)
            java.lang.Double.longBitsToDouble(r0)
            throw r21
        L_0x0aa8:
            if (r1 == r0) goto L_0x0ace
        L_0x0aaa:
            r1 = r12
        L_0x0aab:
            if (r1 == r12) goto L_0x0abf
            r6 = r41
            r14 = r0
            r18 = r10
            r9 = r11
            r3 = r13
            r16 = r20
            r13 = r34
            r2 = 3
            r0 = r36
            r10 = r5
            r5 = r8
            goto L_0x03db
        L_0x0abf:
            r0 = r41
            r3 = r1
            r14 = r7
            r8 = r11
        L_0x0ac4:
            r7 = r36
            r35 = r10
            r10 = r5
            r5 = r9
            r9 = r35
            goto L_0x0db6
        L_0x0ace:
            defpackage.wzf.o(r14)
            long r0 = defpackage.bs0.r0(r12, r15)
            java.lang.Double.longBitsToDouble(r0)
            throw r21
        L_0x0ad9:
            r15 = r38
            r23 = r39
            r34 = r5
            r5 = r8
            r8 = r13
            r25 = r32
            r14 = r33
            r13 = r10
            r10 = r9
            r9 = r18
            r0 = 50
            if (r2 != r0) goto L_0x0b1d
            r0 = 2
            if (r1 != r0) goto L_0x0b17
            sun.misc.Unsafe r0 = l
            r1 = 3
            int r1 = r5 / 3
            int r1 = r1 + r1
            r1 = r23[r1]
            java.lang.Object r2 = r0.getObject(r7, r11)
            r3 = r2
            t1h r3 = (defpackage.t1h) r3
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x0b13
            t1h r3 = defpackage.t1h.a()
            t1h r3 = r3.e()
            defpackage.v1h.a(r3, r2)
            r0.putObject(r7, r11, r3)
        L_0x0b13:
            defpackage.rae.w(r1)
            throw r21
        L_0x0b17:
            r0 = r41
            r3 = r4
            r8 = r14
            r14 = r7
            goto L_0x0ac4
        L_0x0b1d:
            r0 = 2
            int r18 = r5 + 2
            sun.misc.Unsafe r0 = l
            r18 = r25[r18]
            r29 = r6
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18 & r6
            long r6 = (long) r8
            switch(r2) {
                case 51: goto L_0x0d77;
                case 52: goto L_0x0d54;
                case 53: goto L_0x0d36;
                case 54: goto L_0x0d36;
                case 55: goto L_0x0d17;
                case 56: goto L_0x0cf7;
                case 57: goto L_0x0cd7;
                case 58: goto L_0x0cb0;
                case 59: goto L_0x0c68;
                case 60: goto L_0x0c31;
                case 61: goto L_0x0c0f;
                case 62: goto L_0x0d17;
                case 63: goto L_0x0bc3;
                case 64: goto L_0x0cd7;
                case 65: goto L_0x0cf7;
                case 66: goto L_0x0ba2;
                case 67: goto L_0x0b72;
                case 68: goto L_0x0b3b;
                default: goto L_0x0b2f;
            }
        L_0x0b2f:
            r7 = r36
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r14 = r37
            goto L_0x0d9a
        L_0x0b3b:
            r0 = 3
            if (r1 != r0) goto L_0x0b2f
            r0 = r10 & -8
            r0 = r0 | 4
            r3 = 2
            r7 = r36
            r6 = r37
            java.lang.Object r1 = r7.D(r14, r5, r6)
            l2h r2 = r7.B(r5)
            r12 = r40
            r8 = r1
            r11 = r9
            r9 = r2
            r2 = r10
            r10 = r38
            r3 = r11
            r11 = r4
            r18 = r2
            r2 = r13
            r13 = r0
            r0 = r14
            r14 = r42
            int r8 = defpackage.bs0.p0(r8, r9, r10, r11, r12, r13, r14)
            r7.n(r0, r6, r1, r5)
            r13 = r2
            r39 = r5
            r14 = r6
            r1 = r8
            r19 = r18
            r8 = r0
        L_0x0b6f:
            r5 = r3
            goto L_0x0d9b
        L_0x0b72:
            r3 = r9
            r18 = r10
            r2 = r13
            r8 = r14
            r9 = r6
            r7 = r36
            r6 = r37
            if (r1 != 0) goto L_0x0b99
            int r1 = defpackage.bs0.o0(r15, r4, r2)
            long r13 = r2.b
            long r13 = defpackage.n54.a0(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r0.putObject(r6, r11, r13)
            r0.putInt(r6, r9, r8)
        L_0x0b92:
            r13 = r2
            r39 = r5
            r14 = r6
            r19 = r18
            goto L_0x0b6f
        L_0x0b99:
            r13 = r2
            r39 = r5
            r14 = r6
            r19 = r18
        L_0x0b9f:
            r5 = r3
            goto L_0x0d9a
        L_0x0ba2:
            r3 = r9
            r18 = r10
            r2 = r13
            r8 = r14
            r9 = r6
            r7 = r36
            r6 = r37
            if (r1 != 0) goto L_0x0b99
            int r1 = defpackage.bs0.l0(r15, r4, r2)
            int r13 = r2.a
            int r13 = defpackage.n54.Z(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.putObject(r6, r11, r13)
            r0.putInt(r6, r9, r8)
            goto L_0x0b92
        L_0x0bc3:
            r3 = r9
            r18 = r10
            r2 = r13
            r8 = r14
            r9 = r6
            r7 = r36
            r6 = r37
            if (r1 != 0) goto L_0x0b99
            int r1 = defpackage.bs0.l0(r15, r4, r2)
            int r13 = r2.a
            t0h r14 = r7.A(r5)
            if (r14 == 0) goto L_0x0be1
            boolean r14 = r14.a(r13)
            if (r14 == 0) goto L_0x0be4
        L_0x0be1:
            r14 = r18
            goto L_0x0bfc
        L_0x0be4:
            r0 = r6
            p0h r0 = (defpackage.p0h) r0
            b3h r9 = r0.zzc
            if (r9 != r3) goto L_0x0bf1
            b3h r9 = defpackage.b3h.b()
            r0.zzc = r9
        L_0x0bf1:
            long r10 = (long) r13
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r14 = r18
            r9.c(r14, r0)
            goto L_0x0c06
        L_0x0bfc:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.putObject(r6, r11, r13)
            r0.putInt(r6, r9, r8)
        L_0x0c06:
            r13 = r2
            r39 = r5
            r19 = r14
            r5 = r3
            r14 = r6
            goto L_0x0d9b
        L_0x0c0f:
            r3 = r9
            r2 = r13
            r8 = r14
            r13 = 2
            r14 = r10
            r9 = r6
            r7 = r36
            r6 = r37
            if (r1 != r13) goto L_0x0c28
            int r1 = defpackage.bs0.f0(r15, r4, r2)
            java.lang.Object r13 = r2.c
            r0.putObject(r6, r11, r13)
            r0.putInt(r6, r9, r8)
            goto L_0x0c06
        L_0x0c28:
            r13 = r2
            r39 = r5
            r19 = r14
            r5 = r3
            r14 = r6
            goto L_0x0d9a
        L_0x0c31:
            r7 = r36
            r6 = r37
            r3 = r9
            r2 = r13
            r8 = r14
            r0 = 2
            r14 = r10
            if (r1 != r0) goto L_0x0c60
            java.lang.Object r9 = r7.D(r8, r5, r6)
            l2h r10 = r7.B(r5)
            r1 = r9
            r13 = r2
            r2 = r10
            r10 = r0
            r0 = r3
            r3 = r38
            r11 = r4
            r12 = r5
            r5 = r40
            r19 = r14
            r14 = r6
            r6 = r42
            int r1 = defpackage.bs0.q0(r1, r2, r3, r4, r5, r6)
            r7.n(r8, r14, r9, r12)
            r5 = r0
            r39 = r12
            goto L_0x0d9b
        L_0x0c60:
            r13 = r2
            r19 = r14
            r14 = r6
            r39 = r5
            goto L_0x0b9f
        L_0x0c68:
            r2 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r14 = r37
            r9 = r6
            r6 = 2
            r7 = r36
            if (r1 != r6) goto L_0x0cac
            int r1 = defpackage.bs0.l0(r15, r4, r13)
            int r6 = r13.a
            if (r6 != 0) goto L_0x0c85
            r39 = r2
            r2 = r29
            r0.putObject(r14, r11, r2)
            goto L_0x0ca7
        L_0x0c85:
            r39 = r2
            r2 = r3 & r26
            int r3 = r1 + r6
            if (r2 == 0) goto L_0x0c99
            boolean r2 = defpackage.r3h.d(r1, r15, r3)
            if (r2 == 0) goto L_0x0c94
            goto L_0x0c99
        L_0x0c94:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.a()
            throw r0
        L_0x0c99:
            java.lang.String r2 = new java.lang.String
            r18 = r3
            java.nio.charset.Charset r3 = defpackage.y0h.a
            r2.<init>(r15, r1, r6, r3)
            r0.putObject(r14, r11, r2)
            r1 = r18
        L_0x0ca7:
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0cac:
            r39 = r2
            goto L_0x0d9a
        L_0x0cb0:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != 0) goto L_0x0d9a
            int r1 = defpackage.bs0.o0(r15, r4, r13)
            long r2 = r13.b
            int r2 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0cc9
            r2 = 1
            goto L_0x0ccb
        L_0x0cc9:
            r2 = r24
        L_0x0ccb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0cd7:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r2 = 5
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != r2) goto L_0x0d9a
            int r1 = r4 + 4
            int r2 = defpackage.bs0.g0(r4, r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0cf7:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r2 = 1
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != r2) goto L_0x0d9a
            int r1 = r4 + 8
            long r2 = defpackage.bs0.r0(r4, r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0d17:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != 0) goto L_0x0d9a
            int r1 = defpackage.bs0.l0(r15, r4, r13)
            int r2 = r13.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0d36:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != 0) goto L_0x0d9a
            int r1 = defpackage.bs0.o0(r15, r4, r13)
            long r2 = r13.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0d54:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r2 = 5
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != r2) goto L_0x0d9a
            int r1 = r4 + 4
            int r2 = defpackage.bs0.g0(r4, r15)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0d77:
            r39 = r5
            r5 = r9
            r19 = r10
            r8 = r14
            r2 = 1
            r14 = r37
            r9 = r6
            r7 = r36
            if (r1 != r2) goto L_0x0d9a
            int r1 = r4 + 8
            long r2 = defpackage.bs0.r0(r4, r15)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.putObject(r14, r11, r2)
            r0.putInt(r14, r9, r8)
            goto L_0x0d9b
        L_0x0d9a:
            r1 = r4
        L_0x0d9b:
            r10 = r39
            if (r1 == r4) goto L_0x0db1
            r5 = r40
            r6 = r41
            r0 = r7
            r9 = r8
            r3 = r13
            r7 = r14
            r18 = r19
            r16 = r20
            r13 = r34
            r2 = 3
            r14 = 1
            goto L_0x03db
        L_0x0db1:
            r0 = r41
            r3 = r1
            r9 = r19
        L_0x0db6:
            if (r9 != r0) goto L_0x0dc3
            if (r0 == 0) goto L_0x0dc3
            r8 = r3
            r2 = r17
        L_0x0dbd:
            r1 = r20
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0dfe
        L_0x0dc3:
            r1 = r14
            p0h r1 = (defpackage.p0h) r1
            b3h r2 = r1.zzc
            if (r2 != r5) goto L_0x0dd0
            b3h r2 = defpackage.b3h.b()
            r1.zzc = r2
        L_0x0dd0:
            r5 = r2
            r1 = r9
            r2 = r38
            r4 = r40
            r11 = 2
            r6 = r42
            int r1 = defpackage.bs0.k0(r1, r2, r3, r4, r5, r6)
            r5 = r40
            r6 = r0
            r0 = r7
            r18 = r9
            r3 = r13
            r7 = r14
            r16 = r20
            r13 = r34
            r2 = 3
            r14 = 1
            r9 = r8
            goto L_0x03db
        L_0x0dee:
            r23 = r1
            r14 = r7
            r25 = r11
            r34 = r13
            r20 = r16
            r7 = r0
            r0 = r6
            r2 = r17
            r9 = r18
            goto L_0x0dbd
        L_0x0dfe:
            if (r1 == r3) goto L_0x0e06
            long r4 = (long) r1
            r1 = r34
            r1.putInt(r14, r4, r2)
        L_0x0e06:
            int r1 = r7.g
        L_0x0e08:
            int r2 = r7.h
            if (r1 >= r2) goto L_0x0e34
            int[] r2 = r7.f
            r2 = r2[r1]
            r4 = r25[r2]
            int r4 = r7.y(r2)
            r4 = r4 & r3
            long r4 = (long) r4
            java.lang.Object r4 = defpackage.k3h.i(r4, r14)
            if (r4 != 0) goto L_0x0e20
        L_0x0e1e:
            r5 = 1
            goto L_0x0e27
        L_0x0e20:
            t0h r5 = r7.A(r2)
            if (r5 != 0) goto L_0x0e29
            goto L_0x0e1e
        L_0x0e27:
            int r1 = r1 + r5
            goto L_0x0e08
        L_0x0e29:
            t1h r4 = (defpackage.t1h) r4
            r0 = 3
            int r2 = r2 / r0
            int r2 = r2 + r2
            r0 = r23[r2]
            defpackage.rae.w(r0)
            throw r21
        L_0x0e34:
            if (r0 != 0) goto L_0x0e40
            r1 = r40
            if (r8 != r1) goto L_0x0e3b
            goto L_0x0e46
        L_0x0e3b:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.c()
            throw r0
        L_0x0e40:
            r1 = r40
            if (r8 > r1) goto L_0x0e47
            if (r9 != r0) goto L_0x0e47
        L_0x0e46:
            return r8
        L_0x0e47:
            com.google.android.gms.internal.play_billing.zzdn r0 = com.google.android.gms.internal.play_billing.zzdn.c()
            throw r0
        L_0x0e4c:
            r14 = r7
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r37)
            java.lang.String r2 = "Mutating immutable message: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2h.t(java.lang.Object, byte[], int, int, int, gv1):int");
    }

    public final int w(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final int y(int i2) {
        return this.a[i2 + 1];
    }
}
