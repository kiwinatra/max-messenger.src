package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: f64  reason: default package */
public final class f64 implements lt8, nsd, t03 {
    public static final Pattern G0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern H0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public v03[] A0 = new v03[0];
    public e95[] B0 = new e95[0];
    public wie C0;
    public x54 D0;
    public int E0;
    public List F0;
    public final tpf X;
    public final d64[] Y;
    public final o9a Z;
    public final int a;
    public final grg b;
    public final arf c;
    public final ow4 o;
    public final gga v;
    public final hpb v0;
    public final tgg w;
    public final IdentityHashMap w0 = new IdentityHashMap();
    public final long x;
    public final uz8 x0;
    public final x28 y;
    public final fw4 y0;
    public final cb4 z;
    public jt8 z0;

    public f64(int i, x54 x54, tgg tgg, int i2, grg grg, arf arf, ow4 ow4, fw4 fw4, gga gga, uz8 uz8, long j, x28 x28, cb4 cb4, o9a o9a, vs6 vs6, lpb lpb) {
        int i3;
        int i4;
        List list;
        int i5;
        int i6;
        ca6[] ca6Arr;
        ca6[] f;
        nm4 a2;
        x54 x542 = x54;
        int i7 = i2;
        ow4 ow42 = ow4;
        cb4 cb42 = cb4;
        this.a = i;
        this.D0 = x542;
        this.w = tgg;
        this.E0 = i7;
        this.b = grg;
        this.c = arf;
        this.o = ow42;
        this.y0 = fw4;
        this.v = gga;
        this.x0 = uz8;
        this.x = j;
        this.y = x28;
        this.z = cb42;
        this.Z = o9a;
        this.v0 = new hpb(x542, vs6, cb42);
        int i8 = 0;
        v03[] v03Arr = this.A0;
        o9a.getClass();
        this.C0 = new wie(12, (Object) v03Arr);
        fcb b2 = x542.b(i7);
        List list2 = b2.d;
        this.F0 = list2;
        List list3 = b2.c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            sparseIntArray.put(((r9) list3.get(i9)).a, i9);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i9));
            arrayList.add(arrayList2);
            sparseArray.put(i9, arrayList2);
        }
        int i10 = 0;
        while (i10 < size) {
            r9 r9Var = (r9) list3.get(i10);
            nm4 a3 = a("http://dashif.org/guidelines/trickmode", r9Var.e);
            List list4 = r9Var.f;
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a3;
            int i11 = (a3 == null || (i11 = sparseIntArray.get(Integer.parseInt(a3.b), -1)) == -1) ? i10 : i11;
            if (i11 == i10 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i12 = t0g.a;
                String[] split = a2.b.split(",", -1);
                int length = split.length;
                for (int i13 = i8; i13 < length; i13++) {
                    int i14 = sparseIntArray.get(Integer.parseInt(split[i13]), -1);
                    if (i14 != -1) {
                        i11 = Math.min(i11, i14);
                    }
                }
            }
            if (i11 != i10) {
                List list5 = (List) sparseArray.get(i10);
                List list6 = (List) sparseArray.get(i11);
                list6.addAll(list5);
                sparseArray.put(i10, list6);
                arrayList.remove(list5);
            }
            i10++;
            i8 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i15 = 0; i15 < size2; i15++) {
            int[] L = cvg.L((Collection) arrayList.get(i15));
            iArr[i15] = L;
            Arrays.sort(L);
        }
        boolean[] zArr = new boolean[size2];
        ca6[][] ca6Arr2 = new ca6[size2][];
        int i16 = 0;
        int i17 = 0;
        while (i16 < size2) {
            int[] iArr2 = iArr[i16];
            int length2 = iArr2.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length2) {
                    break;
                }
                List list7 = ((r9) list3.get(iArr2[i18])).c;
                for (int i19 = 0; i19 < list7.size(); i19++) {
                    if (!((w2d) list7.get(i19)).o.isEmpty()) {
                        zArr[i16] = true;
                        i17++;
                        break;
                    }
                }
                i18++;
            }
            int[] iArr3 = iArr[i16];
            int length3 = iArr3.length;
            int i20 = 0;
            while (i20 < length3) {
                int i21 = iArr3[i20];
                r9 r9Var2 = (r9) list3.get(i21);
                List list8 = ((r9) list3.get(i21)).d;
                int[] iArr4 = iArr3;
                int i22 = 0;
                while (i22 < list8.size()) {
                    nm4 nm4 = (nm4) list8.get(i22);
                    int i23 = length3;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(nm4.a)) {
                        aa6 aa6 = new aa6();
                        aa6.k = "application/cea-608";
                        int i24 = r9Var2.a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i24);
                        sb.append(":cea608");
                        aa6.a = sb.toString();
                        f = f(nm4, G0, new ca6(aa6));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(nm4.a)) {
                        aa6 aa62 = new aa6();
                        aa62.k = "application/cea-708";
                        int i25 = r9Var2.a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i25);
                        sb2.append(":cea708");
                        aa62.a = sb2.toString();
                        f = f(nm4, H0, new ca6(aa62));
                    } else {
                        i22++;
                        length3 = i23;
                        list8 = list9;
                    }
                    ca6Arr = f;
                    i6 = 1;
                }
                int i26 = length3;
                i20++;
                iArr3 = iArr4;
            }
            i6 = 1;
            ca6Arr = new ca6[0];
            ca6Arr2[i16] = ca6Arr;
            if (ca6Arr.length != 0) {
                i17 += i6;
            }
            i16 += i6;
        }
        int size3 = list2.size() + i17 + size2;
        rpf[] rpfArr = new rpf[size3];
        d64[] d64Arr = new d64[size3];
        int i27 = 0;
        int i28 = 0;
        while (i28 < size2) {
            int[] iArr5 = iArr[i28];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i29 = size2;
            int i30 = 0;
            while (i30 < length4) {
                arrayList3.addAll(((r9) list3.get(iArr5[i30])).c);
                i30++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            ca6[] ca6Arr3 = new ca6[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size4;
                ca6 ca6 = ((w2d) arrayList3.get(i31)).a;
                ArrayList arrayList4 = arrayList3;
                int b3 = ow42.b(ca6);
                aa6 a4 = ca6.a();
                a4.D = b3;
                ca6Arr3[i31] = a4.a();
                i31++;
                size4 = i32;
                arrayList3 = arrayList4;
            }
            r9 r9Var3 = (r9) list3.get(iArr5[0]);
            int i33 = r9Var3.a;
            String num = i33 != -1 ? Integer.toString(i33) : i2a.h(17, i28, "unset:");
            int i34 = i27 + 1;
            if (zArr[i28]) {
                i4 = i27 + 2;
                i3 = i34;
            } else {
                i4 = i34;
                i3 = -1;
            }
            if (ca6Arr2[i28].length != 0) {
                i5 = i4;
                i4++;
                list = list3;
            } else {
                list = list3;
                i5 = -1;
            }
            rpfArr[i27] = new rpf(num, ca6Arr3);
            d64Arr[i27] = new d64(r9Var3.b, 0, iArr5, i27, i3, i5, -1);
            int i35 = i3;
            int i36 = -1;
            if (i35 != -1) {
                String concat = String.valueOf(num).concat(":emsg");
                aa6 aa63 = new aa6();
                aa63.a = concat;
                aa63.k = "application/x-emsg";
                rpfArr[i35] = new rpf(concat, new ca6(aa63));
                d64Arr[i35] = new d64(5, 1, iArr5, i27, -1, -1, -1);
                i36 = -1;
            }
            if (i5 != i36) {
                rpfArr[i5] = new rpf(String.valueOf(num).concat(":cc"), ca6Arr2[i28]);
                d64Arr[i5] = new d64(3, 1, iArr5, i27, -1, -1, -1);
            }
            i28++;
            size2 = i29;
            iArr = iArr6;
            i27 = i4;
            list3 = list;
        }
        int i37 = 0;
        while (i37 < list2.size()) {
            h95 h95 = (h95) list2.get(i37);
            aa6 aa64 = new aa6();
            aa64.a = h95.a();
            aa64.k = "application/x-emsg";
            ca6 ca62 = new ca6(aa64);
            String a5 = h95.a();
            StringBuilder sb3 = new StringBuilder(g63.f(12, a5));
            sb3.append(a5);
            sb3.append(":");
            sb3.append(i37);
            rpfArr[i27] = new rpf(sb3.toString(), ca62);
            d64Arr[i27] = new d64(5, 2, new int[0], -1, -1, -1, i37);
            i37++;
            i27++;
        }
        Pair create = Pair.create(new tpf(rpfArr), d64Arr);
        this.X = (tpf) create.first;
        this.Y = (d64[]) create.second;
    }

    public static nm4 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            nm4 nm4 = (nm4) list.get(i);
            if (str.equals(nm4.a)) {
                return nm4;
            }
        }
        return null;
    }

    public static ca6[] f(nm4 nm4, Pattern pattern, ca6 ca6) {
        String str = nm4.b;
        if (str == null) {
            return new ca6[]{ca6};
        }
        int i = t0g.a;
        String[] split = str.split(";", -1);
        ca6[] ca6Arr = new ca6[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new ca6[]{ca6};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            aa6 a2 = ca6.a();
            String str2 = ca6.a;
            StringBuilder sb = new StringBuilder(g63.f(12, str2));
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            a2.a = sb.toString();
            a2.C = parseInt;
            a2.c = matcher.group(2);
            ca6Arr[i2] = new ca6(a2);
        }
        return ca6Arr;
    }

    public final void A(long j) {
        this.C0.A(j);
    }

    public final long F(long j, tnd tnd) {
        long j2 = j;
        for (v03 v03 : this.A0) {
            if (v03.a == 2) {
                for (pd4 pd4 : v03.v.h) {
                    p64 p64 = (p64) pd4.g;
                    if (p64 != null) {
                        long j3 = pd4.b;
                        long u = p64.u(j2, j3);
                        long j4 = pd4.c;
                        long j5 = u + j4;
                        long g = pd4.g(j5);
                        p64 p642 = (p64) pd4.g;
                        long D = p642.D(j3);
                        return tnd.a(j, g, (g >= j2 || (D != -1 && j5 >= ((p642.C() + j4) + D) - 1)) ? g : pd4.g(j5 + 1));
                    }
                }
                return j2;
            }
        }
        return j2;
    }

    public final boolean M(long j) {
        return this.C0.M(j);
    }

    public final void S(jt8 jt8, long j) {
        this.z0 = jt8;
        jt8.c(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kcd[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long T(defpackage.ld5[] r38, boolean[] r39, defpackage.kcd[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r14 = r37
            r0 = r38
            r15 = r40
            r12 = r42
            int r1 = r0.length
            int[] r11 = new int[r1]
            r16 = 0
            r1 = r16
        L_0x000f:
            int r2 = r0.length
            r10 = -1
            if (r1 >= r2) goto L_0x0029
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0024
            tpf r3 = r14.X
            rpf r2 = r2.a()
            int r2 = r3.b(r2)
            r11[r1] = r2
            goto L_0x0026
        L_0x0024:
            r11[r1] = r10
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0029:
            r1 = r16
        L_0x002b:
            int r2 = r0.length
            r17 = 0
            if (r1 >= r2) goto L_0x005e
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r39[r1]
            if (r2 != 0) goto L_0x005b
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.v03
            if (r3 == 0) goto L_0x0044
            v03 r2 = (defpackage.v03) r2
            r2.o(r14)
            goto L_0x0059
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.r03
            if (r3 == 0) goto L_0x0059
            r03 r2 = (defpackage.r03) r2
            v03 r3 = r2.v
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            defpackage.y64.j(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x0059:
            r15[r1] = r17
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x005e:
            r1 = r16
        L_0x0060:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x00a9
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.v45
            if (r3 != 0) goto L_0x006e
            boolean r2 = r2 instanceof defpackage.r03
            if (r2 == 0) goto L_0x00a6
        L_0x006e:
            int r2 = r14.e(r1, r11)
            if (r2 != r10) goto L_0x0079
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.v45
            goto L_0x008b
        L_0x0079:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.r03
            if (r4 == 0) goto L_0x0088
            r03 r3 = (defpackage.r03) r3
            v03 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r8 = r16
        L_0x008a:
            r2 = r8
        L_0x008b:
            if (r2 != 0) goto L_0x00a6
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.r03
            if (r3 == 0) goto L_0x00a4
            r03 r2 = (defpackage.r03) r2
            v03 r3 = r2.v
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            defpackage.y64.j(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x00a4:
            r15[r1] = r17
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x00a9:
            r9 = r16
        L_0x00ab:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01fb
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00b9
            r18 = r9
            r36 = r11
            r0 = r15
            goto L_0x01ee
        L_0x00b9:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01df
            r41[r9] = r8
            r2 = r11[r9]
            d64[] r3 = r14.Y
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x01b9
            int r3 = r2.f
            if (r3 == r10) goto L_0x00d0
            r29 = r8
            goto L_0x00d2
        L_0x00d0:
            r29 = r16
        L_0x00d2:
            if (r29 == 0) goto L_0x00dc
            tpf r4 = r14.X
            rpf r3 = r4.a(r3)
            r4 = r8
            goto L_0x00e0
        L_0x00dc:
            r4 = r16
            r3 = r17
        L_0x00e0:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00e6
            r6 = r8
            goto L_0x00e8
        L_0x00e6:
            r6 = r16
        L_0x00e8:
            if (r6 == 0) goto L_0x00f4
            tpf r7 = r14.X
            rpf r5 = r7.a(r5)
            int r7 = r5.a
            int r4 = r4 + r7
            goto L_0x00f6
        L_0x00f4:
            r5 = r17
        L_0x00f6:
            ca6[] r7 = new defpackage.ca6[r4]
            int[] r4 = new int[r4]
            if (r29 == 0) goto L_0x0107
            ca6[] r3 = r3.c
            r3 = r3[r16]
            r7[r16] = r3
            r3 = 5
            r4[r16] = r3
            r3 = r8
            goto L_0x0109
        L_0x0107:
            r3 = r16
        L_0x0109:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r6 == 0) goto L_0x0129
            r6 = r16
        L_0x0112:
            int r8 = r5.a
            if (r6 >= r8) goto L_0x0128
            ca6[] r8 = r5.c
            r8 = r8[r6]
            r7[r3] = r8
            r18 = 3
            r4[r3] = r18
            r10.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r6 = r6 + 1
            goto L_0x0112
        L_0x0128:
            r8 = 1
        L_0x0129:
            x54 r3 = r14.D0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x013e
            if (r29 == 0) goto L_0x013e
            hpb r3 = r14.v0
            fpb r5 = new fpb
            java.lang.Object r6 = r3.x
            cb4 r6 = (defpackage.cb4) r6
            r5.<init>(r3, r6)
            r6 = r5
            goto L_0x0140
        L_0x013e:
            r6 = r17
        L_0x0140:
            grg r3 = r14.b
            x28 r5 = r14.y
            x54 r8 = r14.D0
            r32 = r9
            tgg r9 = r14.w
            r33 = r11
            int r11 = r14.E0
            int[] r12 = r2.a
            int r13 = r2.b
            r35 = r6
            r34 = r7
            long r6 = r14.x
            arf r0 = r14.c
            java.lang.Object r3 = r3.b
            f74 r3 = (defpackage.f74) r3
            h74 r3 = r3.a()
            if (r0 == 0) goto L_0x0167
            r3.O(r0)
        L_0x0167:
            sd4 r0 = new sd4
            r18 = r0
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r3
            r27 = r6
            r30 = r10
            r31 = r35
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            v03 r13 = new v03
            int r2 = r2.b
            cb4 r7 = r14.z
            ow4 r10 = r14.o
            fw4 r11 = r14.y0
            gga r12 = r14.v
            uz8 r8 = r14.x0
            r1 = r13
            r3 = r4
            r4 = r34
            r5 = r0
            r0 = r35
            r6 = r37
            r19 = r8
            r18 = r32
            r8 = r42
            r36 = r33
            r15 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r37)
            java.util.IdentityHashMap r1 = r14.w0     // Catch:{ all -> 0x01b6 }
            r1.put(r15, r0)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            r0 = r40
            r1 = r15
            r0[r18] = r1
            goto L_0x01ee
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            throw r0
        L_0x01b9:
            r18 = r9
            r36 = r11
            r0 = r15
            r4 = 2
            if (r3 != r4) goto L_0x01ee
            java.util.List r3 = r14.F0
            int r2 = r2.d
            java.lang.Object r2 = r3.get(r2)
            h95 r2 = (defpackage.h95) r2
            rpf r1 = r1.a()
            ca6[] r1 = r1.c
            r1 = r1[r16]
            e95 r3 = new e95
            x54 r4 = r14.D0
            boolean r4 = r4.d
            r3.<init>(r2, r1, r4)
            r0[r18] = r3
            goto L_0x01ee
        L_0x01df:
            r18 = r9
            r36 = r11
            r0 = r15
            boolean r3 = r2 instanceof defpackage.v03
            if (r3 == 0) goto L_0x01ee
            v03 r2 = (defpackage.v03) r2
            sd4 r2 = r2.v
            r2.i = r1
        L_0x01ee:
            int r9 = r18 + 1
            r12 = r42
            r15 = r0
            r11 = r36
            r8 = 1
            r10 = -1
            r0 = r38
            goto L_0x00ab
        L_0x01fb:
            r36 = r11
            r0 = r15
            r1 = r38
            r2 = r16
        L_0x0202:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0273
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0268
            r3 = r1[r2]
            if (r3 == 0) goto L_0x0268
            r3 = r36
            r4 = r3[r2]
            d64[] r5 = r14.Y
            r4 = r5[r4]
            int r5 = r4.c
            r6 = 1
            if (r5 != r6) goto L_0x0264
            int r5 = r14.e(r2, r3)
            r7 = -1
            if (r5 != r7) goto L_0x022b
            v45 r4 = new v45
            r4.<init>()
            r0[r2] = r4
            r10 = r42
            goto L_0x026e
        L_0x022b:
            r5 = r0[r5]
            v03 r5 = (defpackage.v03) r5
            int r4 = r4.b
            r8 = r16
        L_0x0233:
            icd[] r9 = r5.w0
            int r10 = r9.length
            if (r8 >= r10) goto L_0x025e
            int[] r10 = r5.b
            r10 = r10[r8]
            if (r10 != r4) goto L_0x0259
            boolean[] r4 = r5.o
            boolean r10 = r4[r8]
            r10 = r10 ^ r6
            defpackage.y64.j(r10)
            r4[r8] = r6
            r4 = r9[r8]
            r10 = r42
            r4.A(r10, r6)
            r03 r4 = new r03
            r9 = r9[r8]
            r4.<init>(r5, r5, r9, r8)
            r0[r2] = r4
            goto L_0x026e
        L_0x0259:
            r10 = r42
            int r8 = r8 + 1
            goto L_0x0233
        L_0x025e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0264:
            r10 = r42
        L_0x0266:
            r7 = -1
            goto L_0x026e
        L_0x0268:
            r10 = r42
            r3 = r36
            r6 = 1
            goto L_0x0266
        L_0x026e:
            int r2 = r2 + 1
            r36 = r3
            goto L_0x0202
        L_0x0273:
            r10 = r42
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = r16
        L_0x0282:
            if (r4 >= r3) goto L_0x029c
            r5 = r0[r4]
            boolean r6 = r5 instanceof defpackage.v03
            if (r6 == 0) goto L_0x0290
            v03 r5 = (defpackage.v03) r5
            r1.add(r5)
            goto L_0x0299
        L_0x0290:
            boolean r6 = r5 instanceof defpackage.e95
            if (r6 == 0) goto L_0x0299
            e95 r5 = (defpackage.e95) r5
            r2.add(r5)
        L_0x0299:
            int r4 = r4 + 1
            goto L_0x0282
        L_0x029c:
            int r0 = r1.size()
            v03[] r0 = new defpackage.v03[r0]
            r14.A0 = r0
            r1.toArray(r0)
            int r0 = r2.size()
            e95[] r0 = new defpackage.e95[r0]
            r14.B0 = r0
            r2.toArray(r0)
            o9a r0 = r14.Z
            v03[] r1 = r14.A0
            r0.getClass()
            wie r0 = new wie
            r2 = 12
            r0.<init>((int) r2, (java.lang.Object) r1)
            r14.C0 = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.T(ld5[], boolean[], kcd[], boolean[], long):long");
    }

    public final void b(psd psd) {
        v03 v03 = (v03) psd;
        this.z0.b(this);
    }

    public final boolean d() {
        return this.C0.d();
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        d64[] d64Arr = this.Y;
        int i3 = d64Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && d64Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final long i() {
        return this.C0.i();
    }

    public final void r() {
        this.y.b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long s(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            v03[] r3 = r0.A0
            int r4 = r3.length
            r6 = 0
        L_0x0008:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= r4) goto L_0x00fa
            r10 = r3[r6]
            r10.C0 = r1
            boolean r11 = r10.k()
            if (r11 == 0) goto L_0x0021
            r10.B0 = r1
            r16 = r6
        L_0x001e:
            r6 = 0
            goto L_0x00f5
        L_0x0021:
            r11 = 0
        L_0x0022:
            java.util.ArrayList r12 = r10.Y
            int r12 = r12.size()
            r13 = 0
            if (r11 >= r12) goto L_0x004a
            java.util.ArrayList r12 = r10.Y
            java.lang.Object r12 = r12.get(r11)
            tj0 r12 = (defpackage.tj0) r12
            long r14 = r12.x
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r16 = r6
            if (r14 != 0) goto L_0x0042
            long r5 = r12.Y
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            if (r14 <= 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            int r11 = r11 + 1
            r6 = r16
            goto L_0x0022
        L_0x004a:
            r16 = r6
        L_0x004c:
            r12 = r13
        L_0x004d:
            if (r12 == 0) goto L_0x0081
            icd r5 = r10.v0
            r6 = 0
            int r7 = r12.d(r6)
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x0077 }
            r5.s = r6     // Catch:{ all -> 0x007c }
            ccd r6 = r5.a     // Catch:{ all -> 0x007c }
            java.lang.Object r8 = r6.f     // Catch:{ all -> 0x007c }
            vy r8 = (defpackage.vy) r8     // Catch:{ all -> 0x007c }
            r6.g = r8     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            int r6 = r5.q     // Catch:{ all -> 0x0077 }
            if (r7 < r6) goto L_0x0079
            int r8 = r5.p     // Catch:{ all -> 0x0077 }
            int r8 = r8 + r6
            if (r7 <= r8) goto L_0x006d
            goto L_0x0079
        L_0x006d:
            r11 = -9223372036854775808
            r5.t = r11     // Catch:{ all -> 0x0077 }
            int r7 = r7 - r6
            r5.s = r7     // Catch:{ all -> 0x0077 }
            monitor-exit(r5)
            r5 = r9
            goto L_0x0092
        L_0x0077:
            r0 = move-exception
            goto L_0x007f
        L_0x0079:
            monitor-exit(r5)
            r5 = 0
            goto L_0x0092
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x0081:
            icd r5 = r10.v0
            long r6 = r10.i()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            r6 = r9
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            boolean r5 = r5.A(r1, r6)
        L_0x0092:
            if (r5 == 0) goto L_0x00af
            icd r5 = r10.v0
            int r5 = r5.o()
            r6 = 0
            int r5 = r10.m(r5, r6)
            r10.D0 = r5
            icd[] r5 = r10.w0
            int r6 = r5.length
            r7 = 0
        L_0x00a5:
            if (r7 >= r6) goto L_0x001e
            r8 = r5[r7]
            r8.A(r1, r9)
            int r7 = r7 + 1
            goto L_0x00a5
        L_0x00af:
            r10.B0 = r1
            r5 = 0
            r10.F0 = r5
            java.util.ArrayList r6 = r10.Y
            r6.clear()
            r10.D0 = r5
            w28 r5 = r10.z
            boolean r5 = r5.M()
            if (r5 == 0) goto L_0x00dd
            icd r5 = r10.v0
            r5.i()
            icd[] r5 = r10.w0
            int r6 = r5.length
            r7 = 0
        L_0x00cc:
            if (r7 >= r6) goto L_0x00d6
            r8 = r5[r7]
            r8.i()
            int r7 = r7 + 1
            goto L_0x00cc
        L_0x00d6:
            w28 r5 = r10.z
            r5.A()
            goto L_0x001e
        L_0x00dd:
            w28 r5 = r10.z
            r5.o = r13
            icd r5 = r10.v0
            r6 = 0
            r5.z(r6)
            icd[] r5 = r10.w0
            int r7 = r5.length
            r8 = r6
        L_0x00eb:
            if (r8 >= r7) goto L_0x00f5
            r9 = r5[r8]
            r9.z(r6)
            int r8 = r8 + 1
            goto L_0x00eb
        L_0x00f5:
            int r5 = r16 + 1
            r6 = r5
            goto L_0x0008
        L_0x00fa:
            r6 = 0
            e95[] r0 = r0.B0
            int r3 = r0.length
            r5 = r6
        L_0x00ff:
            if (r5 >= r3) goto L_0x011c
            r4 = r0[r5]
            long[] r6 = r4.c
            int r6 = defpackage.t0g.b(r6, r1, r9)
            r4.x = r6
            boolean r10 = r4.o
            if (r10 == 0) goto L_0x0116
            long[] r10 = r4.c
            int r10 = r10.length
            if (r6 != r10) goto L_0x0116
            r10 = r1
            goto L_0x0117
        L_0x0116:
            r10 = r7
        L_0x0117:
            r4.y = r10
            int r5 = r5 + 1
            goto L_0x00ff
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.s(long):long");
    }

    public final long w() {
        return -9223372036854775807L;
    }

    public final tpf x() {
        return this.X;
    }

    public final long y() {
        return this.C0.y();
    }

    public final void z(long j, boolean z2) {
        long j2;
        for (v03 v03 : this.A0) {
            if (!v03.k()) {
                icd icd = v03.v0;
                int i = icd.q;
                icd.h(j, z2, true);
                icd icd2 = v03.v0;
                int i2 = icd2.q;
                if (i2 > i) {
                    synchronized (icd2) {
                        j2 = icd2.p == 0 ? Long.MIN_VALUE : icd2.n[icd2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        icd[] icdArr = v03.w0;
                        if (i3 >= icdArr.length) {
                            break;
                        }
                        icdArr[i3].h(j2, z2, v03.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(v03.m(i2, 0), v03.D0);
                if (min > 0) {
                    t0g.I(v03.Y, 0, min);
                    v03.D0 -= min;
                }
            }
        }
    }
}
