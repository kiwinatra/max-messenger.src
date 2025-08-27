package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: fo3  reason: default package */
public class fo3 implements Serializable {
    public final List X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final String c;
    public final String o;
    public final List v;
    public final String v0;
    public final long w;
    public final ak3 w0;
    public final long x;
    public final int[] x0;
    public final os3 y;
    public final int z;

    public fo3(long j, long j2, String str, String str2, List list, long j3, long j4, os3 os3, int i, List list2, String str3, String str4, String str5, ak3 ak3, int[] iArr) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.o = str2;
        List list3 = list;
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparing(new mm3(1)));
        this.v = Collections.unmodifiableList(arrayList);
        this.w = j3;
        this.x = j4;
        this.y = os3;
        this.z = i == 0 ? 1 : i;
        this.X = list2;
        this.Y = str3;
        this.Z = str4;
        this.v0 = str5;
        this.w0 = ak3;
        this.x0 = iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: dr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: ak3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: dr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: dr3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: ak3} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03a4, code lost:
        r9 = r9 + r6;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.fo3 e(defpackage.pf9 r33) {
        /*
            int r7 = defpackage.ryg.e0(r33)
            r8 = 0
            if (r7 != 0) goto L_0x0008
            return r8
        L_0x0008:
            r9 = 0
            r16 = r8
            r17 = r16
            r18 = r17
            r23 = r18
            r26 = r23
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r12 = r9
            r14 = r12
            r19 = r14
            r21 = r19
            r9 = 0
            r24 = 0
            r10 = r30
        L_0x0027:
            if (r9 >= r7) goto L_0x03a8
            java.lang.String r0 = r33.A0()
            r0.getClass()
            java.lang.String r11 = ""
            int r25 = r0.hashCode()
            switch(r25) {
                case -2078600011: goto L_0x00e8;
                case -1724546052: goto L_0x00dc;
                case -1249512767: goto L_0x00d0;
                case -1249474914: goto L_0x00c4;
                case -913939087: goto L_0x00b8;
                case -892481550: goto L_0x00ad;
                case -863791528: goto L_0x00a2;
                case -595295507: goto L_0x0097;
                case -332625698: goto L_0x008a;
                case -295931082: goto L_0x007d;
                case 3355: goto L_0x0070;
                case 3018746: goto L_0x0063;
                case 3321850: goto L_0x0056;
                case 104585032: goto L_0x0049;
                case 106642798: goto L_0x003c;
                default: goto L_0x0039;
            }
        L_0x0039:
            r0 = -1
            goto L_0x00f3
        L_0x003c:
            java.lang.String r4 = "phone"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0045
            goto L_0x0039
        L_0x0045:
            r0 = 14
            goto L_0x00f3
        L_0x0049:
            java.lang.String r4 = "names"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0052
            goto L_0x0039
        L_0x0052:
            r0 = 13
            goto L_0x00f3
        L_0x0056:
            java.lang.String r4 = "link"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x005f
            goto L_0x0039
        L_0x005f:
            r0 = 12
            goto L_0x00f3
        L_0x0063:
            java.lang.String r4 = "bday"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x006c
            goto L_0x0039
        L_0x006c:
            r0 = 11
            goto L_0x00f3
        L_0x0070:
            java.lang.String r4 = "id"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0079
            goto L_0x0039
        L_0x0079:
            r0 = 10
            goto L_0x00f3
        L_0x007d:
            java.lang.String r4 = "updateTime"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0086
            goto L_0x0039
        L_0x0086:
            r0 = 9
            goto L_0x00f3
        L_0x008a:
            java.lang.String r4 = "baseUrl"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0093
            goto L_0x0039
        L_0x0093:
            r0 = 8
            goto L_0x00f3
        L_0x0097:
            java.lang.String r4 = "photoId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0039
        L_0x00a0:
            r0 = 7
            goto L_0x00f3
        L_0x00a2:
            java.lang.String r4 = "baseRawUrl"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ab
            goto L_0x0039
        L_0x00ab:
            r0 = 6
            goto L_0x00f3
        L_0x00ad:
            java.lang.String r4 = "status"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00b6
            goto L_0x0039
        L_0x00b6:
            r0 = 5
            goto L_0x00f3
        L_0x00b8:
            java.lang.String r4 = "menuButton"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00c2
            goto L_0x0039
        L_0x00c2:
            r0 = 4
            goto L_0x00f3
        L_0x00c4:
            java.lang.String r4 = "options"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0039
        L_0x00ce:
            r0 = 3
            goto L_0x00f3
        L_0x00d0:
            java.lang.String r4 = "gender"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00da
            goto L_0x0039
        L_0x00da:
            r0 = 2
            goto L_0x00f3
        L_0x00dc:
            java.lang.String r4 = "description"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0039
        L_0x00e6:
            r0 = 1
            goto L_0x00f3
        L_0x00e8:
            java.lang.String r4 = "profileOptions"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00f2
            goto L_0x0039
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            switch(r0) {
                case 0: goto L_0x036d;
                case 1: goto L_0x0365;
                case 2: goto L_0x034d;
                case 3: goto L_0x0320;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01bf;
                case 7: goto L_0x01b7;
                case 8: goto L_0x01b1;
                case 9: goto L_0x01aa;
                case 10: goto L_0x01a3;
                case 11: goto L_0x019d;
                case 12: goto L_0x0197;
                case 13: goto L_0x0105;
                case 14: goto L_0x0100;
                default: goto L_0x00f6;
            }
        L_0x00f6:
            r33.A()
        L_0x00f9:
            r1 = 2
            r2 = 5
        L_0x00fb:
            r5 = -1
            r6 = 1
            r11 = 3
            goto L_0x03a4
        L_0x0100:
            long r21 = r33.x0()
            goto L_0x00f9
        L_0x0105:
            int r0 = defpackage.ryg.X(r33)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r2 = 0
        L_0x010f:
            if (r2 >= r0) goto L_0x0193
            int r3 = r33.y0()
            r18 = r8
            r1 = r11
            r5 = 0
        L_0x0119:
            dr3 r31 = defpackage.dr3.c
            if (r5 >= r3) goto L_0x017b
            java.lang.String r6 = r33.A0()
            r6.getClass()
            int r32 = r6.hashCode()
            switch(r32) {
                case -1459599807: goto L_0x0149;
                case 3575610: goto L_0x013c;
                case 132835675: goto L_0x012f;
                default: goto L_0x012b;
            }
        L_0x012b:
            r32 = r0
        L_0x012d:
            r0 = -1
            goto L_0x0155
        L_0x012f:
            r32 = r0
            java.lang.String r0 = "firstName"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x013a
            goto L_0x0153
        L_0x013a:
            r0 = 2
            goto L_0x0155
        L_0x013c:
            r32 = r0
            java.lang.String r0 = "type"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0147
            goto L_0x0153
        L_0x0147:
            r0 = 1
            goto L_0x0155
        L_0x0149:
            r32 = r0
            java.lang.String r0 = "lastName"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0154
        L_0x0153:
            goto L_0x012d
        L_0x0154:
            r0 = 0
        L_0x0155:
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x0162;
                case 2: goto L_0x015d;
                default: goto L_0x0158;
            }
        L_0x0158:
            r33.A()
        L_0x015b:
            r6 = 1
            goto L_0x0177
        L_0x015d:
            java.lang.String r8 = defpackage.ryg.g0(r33)
            goto L_0x015b
        L_0x0162:
            java.lang.String r0 = defpackage.ryg.g0(r33)
            if (r0 != 0) goto L_0x016b
            r18 = r31
            goto L_0x015b
        L_0x016b:
            dr3 r0 = defpackage.dr3.valueOf(r0)
            r18 = r0
            goto L_0x015b
        L_0x0172:
            java.lang.String r1 = defpackage.ryg.g0(r33)
            goto L_0x015b
        L_0x0177:
            int r5 = r5 + r6
            r0 = r32
            goto L_0x0119
        L_0x017b:
            r32 = r0
            r6 = 1
            if (r18 != 0) goto L_0x0183
            r0 = r31
            goto L_0x0185
        L_0x0183:
            r0 = r18
        L_0x0185:
            er3 r3 = new er3
            r3.<init>(r8, r0, r1)
            r4.add(r3)
            int r2 = r2 + r6
            r0 = r32
            r8 = 0
            goto L_0x010f
        L_0x0193:
            r18 = r4
            goto L_0x00f9
        L_0x0197:
            java.lang.String r27 = defpackage.ryg.g0(r33)
            goto L_0x00f9
        L_0x019d:
            java.lang.String r28 = defpackage.ryg.g0(r33)
            goto L_0x00f9
        L_0x01a3:
            long r0 = r33.x0()
            r12 = r0
            goto L_0x00f9
        L_0x01aa:
            long r0 = r33.x0()
            r14 = r0
            goto L_0x00f9
        L_0x01b1:
            java.lang.String r16 = defpackage.ryg.g0(r33)
            goto L_0x00f9
        L_0x01b7:
            long r0 = r33.x0()
            r19 = r0
            goto L_0x00f9
        L_0x01bf:
            java.lang.String r17 = defpackage.ryg.g0(r33)
            goto L_0x00f9
        L_0x01c5:
            q1 r0 = r33.B0()
            int r1 = r0.g()
            if (r1 == 0) goto L_0x01f3
            r2 = 1
            if (r1 != r2) goto L_0x01db
            r6 = r2
            r1 = 2
            r2 = 5
            r5 = -1
            r11 = 3
            r23 = 0
            goto L_0x03a4
        L_0x01db:
            int r1 = r0.g()
            r2 = 5
            if (r1 != r2) goto L_0x01f0
            jc7 r0 = r0.v()
            p1 r0 = (defpackage.p1) r0
            java.lang.String r0 = r0.E()
            os3 r23 = defpackage.os3.valueOf(r0)
        L_0x01f0:
            r1 = 2
            goto L_0x00fb
        L_0x01f3:
            r1 = 0
            throw r1
        L_0x01f5:
            r1 = r8
            r2 = 5
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.ryg.e0(r33)     // Catch:{ all -> 0x0201 }
            r5 = r0
            goto L_0x0234
        L_0x0201:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x020c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x021c
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r5)
            goto L_0x020c
        L_0x021c:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0233
            r6 = 1
            if (r0 == r6) goto L_0x0232
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0232:
            throw r5
        L_0x0233:
            r5 = 0
        L_0x0234:
            if (r5 != 0) goto L_0x0239
            r29 = r1
            goto L_0x01f0
        L_0x0239:
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r6.element = r11
            r8 = 0
        L_0x0241:
            if (r8 >= r5) goto L_0x0308
            java.lang.String r0 = defpackage.ryg.g0(r33)     // Catch:{ all -> 0x0248 }
            goto L_0x027e
        L_0x0248:
            r0 = move-exception
            r11 = r0
            defpackage.z68.o(r4, r3, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0253:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x0266
            java.lang.Object r29 = r0.next()
            r1 = r29
            xm r1 = (defpackage.xm) r1
            r1.a(r11)
            r1 = 0
            goto L_0x0253
        L_0x0266:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x027d
            r1 = 1
            if (r0 == r1) goto L_0x027c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x027c:
            throw r11
        L_0x027d:
            r0 = 0
        L_0x027e:
            if (r0 != 0) goto L_0x0283
        L_0x0280:
            r11 = 1
            goto L_0x0304
        L_0x0283:
            java.lang.String r1 = "text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x02cc
            java.lang.String r0 = defpackage.ryg.g0(r33)     // Catch:{ all -> 0x0290 }
            goto L_0x02c3
        L_0x0290:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r4, r3, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x029b:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x02ab
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r1)
            goto L_0x029b
        L_0x02ab:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02c2
            r11 = 1
            if (r0 == r11) goto L_0x02c1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c1:
            throw r1
        L_0x02c2:
            r0 = 0
        L_0x02c3:
            if (r0 != 0) goto L_0x02c9
        L_0x02c5:
            r29 = 0
            goto L_0x01f0
        L_0x02c9:
            r6.element = r0
            goto L_0x0280
        L_0x02cc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r33.A()     // Catch:{ all -> 0x02d2 }
            goto L_0x0280
        L_0x02d2:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r4, r3, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02dd:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x02ed
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r1)
            goto L_0x02dd
        L_0x02ed:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0280
            r11 = 1
            if (r0 == r11) goto L_0x0303
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0303:
            throw r1
        L_0x0304:
            int r8 = r8 + r11
            r1 = 0
            goto L_0x0241
        L_0x0308:
            T r0 = r6.element
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0313
            goto L_0x02c5
        L_0x0313:
            ak3 r0 = new ak3
            T r1 = r6.element
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>((java.lang.String) r1)
            r29 = r0
            goto L_0x01f0
        L_0x0320:
            r2 = 5
            int r0 = r33.t0()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r1 = 0
        L_0x032b:
            if (r1 >= r0) goto L_0x01f0
            java.lang.String r3 = defpackage.ryg.g0(r33)
            if (r3 != 0) goto L_0x0335
            r3 = 0
            goto L_0x0345
        L_0x0335:
            eo3[] r4 = defpackage.eo3.values()
            iz1 r5 = new iz1
            r6 = 2
            r5.<init>(r3, r6)
            java.lang.Object r3 = kotlin.collections.ArraysKt___ArraysKt.firstOrNull((T[]) r4, r5)
            eo3 r3 = (defpackage.eo3) r3
        L_0x0345:
            if (r3 == 0) goto L_0x034a
            r10.add(r3)
        L_0x034a:
            r3 = 1
            int r1 = r1 + r3
            goto L_0x032b
        L_0x034d:
            r2 = 5
            r3 = 1
            int r0 = r33.w0()
            if (r0 == r3) goto L_0x0360
            r1 = 2
            if (r0 == r1) goto L_0x035c
            r24 = 1
            goto L_0x00fb
        L_0x035c:
            r24 = 3
            goto L_0x00fb
        L_0x0360:
            r1 = 2
            r24 = r1
            goto L_0x00fb
        L_0x0365:
            r1 = 2
            r2 = 5
            java.lang.String r26 = defpackage.ryg.g0(r33)
            goto L_0x00fb
        L_0x036d:
            r1 = 2
            r2 = 5
            int r0 = r33.t0()
            int[] r3 = new int[r0]
            r4 = 0
        L_0x0376:
            if (r4 >= r0) goto L_0x039f
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            hb9 r8 = r33.n()
            int r8 = r8.a()
            r11 = 3
            if (r8 != r11) goto L_0x0391
            int r6 = r33.w0()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0394
        L_0x0391:
            r33.A()
        L_0x0394:
            int r6 = r6.intValue()
            if (r6 == r5) goto L_0x039c
            r3[r4] = r6
        L_0x039c:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0376
        L_0x039f:
            r5 = -1
            r6 = 1
            r11 = 3
            r30 = r3
        L_0x03a4:
            int r9 = r9 + r6
            r8 = 0
            goto L_0x0027
        L_0x03a8:
            if (r10 != 0) goto L_0x03b2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r25 = r0
            goto L_0x03b4
        L_0x03b2:
            r25 = r10
        L_0x03b4:
            fo3 r0 = new fo3
            r11 = r0
            r11.<init>(r12, r14, r16, r17, r18, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo3.e(pf9):fo3");
    }

    public final String a() {
        List list = this.v;
        if (list.isEmpty()) {
            return null;
        }
        return ((er3) list.get(0)).a();
    }

    public final String b() {
        kl0 kl0 = kl0.c;
        String str = this.c;
        if (!cvg.A(str)) {
            return cjf.A(str, kl0, jl0.a);
        }
        return null;
    }

    public final boolean c() {
        return this.X.contains(eo3.BOT);
    }

    public final boolean d() {
        return this.X.contains(eo3.SERVICE_ACCOUNT);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.y);
        sb.append(", options=");
        return tr1.l(sb, this.X, "}");
    }
}
