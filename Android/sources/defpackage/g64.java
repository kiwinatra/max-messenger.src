package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: g64  reason: default package */
public final class g64 implements mt8, osd, u03 {
    public static final Pattern G0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern H0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public w03[] A0 = new w03[0];
    public f95[] B0 = new f95[0];
    public vc3 C0;
    public y54 D0;
    public int E0;
    public List F0;
    public final upf X;
    public final e64[] Y;
    public final p9a Z;
    public final int a;
    public final cs b;
    public final brf c;
    public final pw4 o;
    public final nfd v;
    public final hpb v0;
    public final qpg w;
    public final IdentityHashMap w0 = new IdentityHashMap();
    public final long x;
    public final cs x0;
    public final y28 y;
    public final gw4 y0;
    public final cb4 z;
    public kt8 z0;

    public g64(int i, y54 y54, qpg qpg, int i2, cs csVar, brf brf, pw4 pw4, gw4 gw4, nfd nfd, cs csVar2, long j, y28 y28, cb4 cb4, p9a p9a, rt6 rt6, mpb mpb) {
        int i3;
        int i4;
        int i5;
        ea6[] ea6Arr;
        ea6[] l;
        om4 a2;
        Integer num;
        y54 y542 = y54;
        int i6 = i2;
        cs csVar3 = csVar;
        pw4 pw42 = pw4;
        cb4 cb42 = cb4;
        this.a = i;
        this.D0 = y542;
        this.w = qpg;
        this.E0 = i6;
        this.b = csVar3;
        this.c = brf;
        this.o = pw42;
        this.y0 = gw4;
        this.v = nfd;
        this.x0 = csVar2;
        this.x = j;
        this.y = y28;
        this.z = cb42;
        this.Z = p9a;
        this.v0 = new hpb(y542, rt6, cb42);
        int i7 = 0;
        p9a.getClass();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        this.C0 = new vc3(k0d, k0d);
        gcb b2 = y542.b(i6);
        List list = b2.d;
        this.F0 = list;
        List list2 = b2.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(hd8.f(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            hashMap.put(Long.valueOf(((s9) list2.get(i8)).a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            s9 s9Var = (s9) list2.get(i9);
            om4 a3 = a("http://dashif.org/guidelines/trickmode", s9Var.e);
            List list3 = s9Var.f;
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", list3) : a3;
            int intValue = (a3 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a3.b)))) == null) ? i9 : num.intValue();
            if (intValue == i9 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i10 = v0g.a;
                String[] split = a2.b.split(",", -1);
                int length = split.length;
                for (int i11 = i7; i11 < length; i11++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i11])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i9) {
                List list4 = (List) sparseArray.get(i9);
                List list5 = (List) sparseArray.get(intValue);
                list5.addAll(list4);
                sparseArray.put(i9, list5);
                arrayList.remove(list4);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] L = cvg.L((Collection) arrayList.get(i12));
            iArr[i12] = L;
            Arrays.sort(L);
        }
        boolean[] zArr = new boolean[size2];
        ea6[][] ea6Arr2 = new ea6[size2][];
        int i13 = 0;
        int i14 = 0;
        while (i13 < size2) {
            int[] iArr2 = iArr[i13];
            int length2 = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    break;
                }
                List list6 = ((s9) list2.get(iArr2[i15])).c;
                int[] iArr3 = iArr2;
                for (int i16 = 0; i16 < list6.size(); i16++) {
                    if (!((x2d) list6.get(i16)).o.isEmpty()) {
                        zArr[i13] = true;
                        i14++;
                        break;
                    }
                }
                i15++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i17 = 0;
            while (i17 < length3) {
                int i18 = iArr4[i17];
                s9 s9Var2 = (s9) list2.get(i18);
                List list7 = ((s9) list2.get(i18)).d;
                int[] iArr5 = iArr4;
                int i19 = length3;
                int i20 = 0;
                while (i20 < list7.size()) {
                    om4 om4 = (om4) list7.get(i20);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(om4.a)) {
                        ba6 ba6 = new ba6();
                        ba6.m = vq9.l("application/cea-608");
                        ba6.a = wj6.m(new StringBuilder(), s9Var2.a, ":cea608");
                        l = l(om4, G0, new ea6(ba6));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(om4.a)) {
                        ba6 ba62 = new ba6();
                        ba62.m = vq9.l("application/cea-708");
                        ba62.a = wj6.m(new StringBuilder(), s9Var2.a, ":cea708");
                        l = l(om4, H0, new ea6(ba62));
                    } else {
                        i20++;
                        list7 = list8;
                    }
                    ea6Arr = l;
                    i5 = 1;
                }
                i17++;
                iArr4 = iArr5;
                length3 = i19;
            }
            i5 = 1;
            ea6Arr = new ea6[0];
            ea6Arr2[i13] = ea6Arr;
            if (ea6Arr.length != 0) {
                i14 += i5;
            }
            i13 += i5;
            int i21 = i5;
        }
        int size3 = list.size() + i14 + size2;
        spf[] spfArr = new spf[size3];
        e64[] e64Arr = new e64[size3];
        int i22 = 0;
        int i23 = 0;
        while (i22 < size2) {
            int[] iArr6 = iArr[i22];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i24 = size2;
            int i25 = 0;
            while (i25 < length4) {
                arrayList3.addAll(((s9) list2.get(iArr6[i25])).c);
                i25++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            ea6[] ea6Arr3 = new ea6[size4];
            int i26 = 0;
            while (i26 < size4) {
                int i27 = size4;
                ea6 ea6 = ((x2d) arrayList3.get(i26)).a;
                ArrayList arrayList4 = arrayList3;
                ba6 a4 = ea6.a();
                a4.J = pw42.d(ea6);
                ea6Arr3[i26] = new ea6(a4);
                i26++;
                size4 = i27;
                arrayList3 = arrayList4;
            }
            s9 s9Var3 = (s9) list2.get(iArr6[0]);
            long j2 = s9Var3.a;
            String l2 = j2 != -1 ? Long.toString(j2) : wj6.h(i22, "unset:");
            int i28 = i23 + 1;
            if (zArr[i22]) {
                i3 = i28;
                i28 = i23 + 2;
            } else {
                i3 = -1;
            }
            if (ea6Arr2[i22].length != 0) {
                i4 = i28;
                i28++;
            } else {
                i4 = -1;
            }
            f(csVar3, ea6Arr3);
            List list9 = list2;
            spfArr[i23] = new spf(l2, ea6Arr3);
            lx5 lx52 = tb7.b;
            k0d k0d2 = k0d.v;
            e64Arr[i23] = new e64(s9Var3.b, 0, iArr6, i23, i3, i4, -1, k0d2);
            int i29 = i3;
            int i30 = -1;
            if (i29 != -1) {
                String j3 = tr1.j(l2, ":emsg");
                ba6 ba63 = new ba6();
                ba63.a = j3;
                ba63.m = vq9.l("application/x-emsg");
                spfArr[i29] = new spf(j3, new ea6(ba63));
                e64Arr[i29] = new e64(5, 1, iArr6, i23, -1, -1, -1, k0d2);
                i30 = -1;
            }
            if (i4 != i30) {
                String j4 = tr1.j(l2, ":cc");
                e64Arr[i4] = new e64(3, 1, iArr6, i23, -1, -1, -1, tb7.q(ea6Arr2[i22]));
                f(csVar3, ea6Arr2[i22]);
                spfArr[i4] = new spf(j4, ea6Arr2[i22]);
            }
            i22++;
            size2 = i24;
            pw42 = pw4;
            iArr = iArr7;
            i23 = i28;
            list2 = list9;
        }
        int i31 = 0;
        while (i31 < list.size()) {
            i95 i95 = (i95) list.get(i31);
            ba6 ba64 = new ba6();
            ba64.a = i95.a();
            ba64.m = vq9.l("application/x-emsg");
            spfArr[i23] = new spf(i95.a() + ":" + i31, new ea6(ba64));
            lx5 lx53 = tb7.b;
            e64Arr[i23] = new e64(5, 2, new int[0], -1, -1, -1, i31, k0d.v);
            i31++;
            i23++;
        }
        Pair create = Pair.create(new upf(spfArr), e64Arr);
        this.X = (upf) create.first;
        this.Y = (e64[]) create.second;
    }

    public static om4 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            om4 om4 = (om4) list.get(i);
            if (str.equals(om4.a)) {
                return om4;
            }
        }
        return null;
    }

    public static void f(cs csVar, ea6[] ea6Arr) {
        for (int i = 0; i < ea6Arr.length; i++) {
            ea6 ea6 = ea6Arr[i];
            qf4 qf4 = (qf4) csVar.o;
            if (qf4.c && qf4.b.k(ea6)) {
                ba6 a2 = ea6.a();
                a2.m = vq9.l("application/x-media3-cues");
                a2.G = qf4.b.D(ea6);
                StringBuilder sb = new StringBuilder();
                sb.append(ea6.n);
                String str = ea6.j;
                sb.append(str != null ? " ".concat(str) : "");
                a2.i = sb.toString();
                a2.r = LongCompanionObject.MAX_VALUE;
                ea6 = a2.a();
            }
            ea6Arr[i] = ea6;
        }
    }

    public static ea6[] l(om4 om4, Pattern pattern, ea6 ea6) {
        String str = om4.b;
        if (str == null) {
            return new ea6[]{ea6};
        }
        int i = v0g.a;
        String[] split = str.split(";", -1);
        ea6[] ea6Arr = new ea6[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new ea6[]{ea6};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            ba6 a2 = ea6.a();
            a2.a = ea6.a + ":" + parseInt;
            a2.F = parseInt;
            a2.d = matcher.group(2);
            ea6Arr[i2] = new ea6(a2);
        }
        return ea6Arr;
    }

    public final void A(long j) {
        this.C0.A(j);
    }

    public final void c(qsd qsd) {
        w03 w03 = (w03) qsd;
        this.z0.c(this);
    }

    public final boolean d() {
        return this.C0.d();
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        e64[] e64Arr = this.Y;
        int i3 = e64Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && e64Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: lcd[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.md5[] r37, boolean[] r38, defpackage.lcd[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r14 = r36
            r0 = r37
            r15 = r39
            r12 = r41
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
            upf r3 = r14.X
            spf r2 = r2.a()
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
            if (r1 >= r2) goto L_0x0052
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r38[r1]
            if (r2 != 0) goto L_0x004f
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.w03
            if (r3 == 0) goto L_0x0044
            w03 r2 = (defpackage.w03) r2
            r2.u(r14)
            goto L_0x004d
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.s03
            if (r3 == 0) goto L_0x004d
            s03 r2 = (defpackage.s03) r2
            r2.d()
        L_0x004d:
            r15[r1] = r17
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0052:
            r1 = r16
        L_0x0054:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x0091
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.w45
            if (r3 != 0) goto L_0x0062
            boolean r2 = r2 instanceof defpackage.s03
            if (r2 == 0) goto L_0x008e
        L_0x0062:
            int r2 = r14.e(r1, r11)
            if (r2 != r10) goto L_0x006d
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.w45
            goto L_0x007f
        L_0x006d:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.s03
            if (r4 == 0) goto L_0x007c
            s03 r3 = (defpackage.s03) r3
            w03 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r8 = r16
        L_0x007e:
            r2 = r8
        L_0x007f:
            if (r2 != 0) goto L_0x008e
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.s03
            if (r3 == 0) goto L_0x008c
            s03 r2 = (defpackage.s03) r2
            r2.d()
        L_0x008c:
            r15[r1] = r17
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0091:
            r9 = r16
        L_0x0093:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01cf
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00a1
            r18 = r9
            r35 = r11
            r4 = r15
            goto L_0x01c2
        L_0x00a1:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01b0
            r40[r9] = r8
            r2 = r11[r9]
            e64[] r3 = r14.Y
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x018a
            int r3 = r2.f
            if (r3 == r10) goto L_0x00b8
            r28 = r8
            goto L_0x00ba
        L_0x00b8:
            r28 = r16
        L_0x00ba:
            if (r28 == 0) goto L_0x00c4
            upf r4 = r14.X
            spf r3 = r4.a(r3)
            r4 = r8
            goto L_0x00c8
        L_0x00c4:
            r4 = r16
            r3 = r17
        L_0x00c8:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00d3
            e64[] r6 = r14.Y
            r5 = r6[r5]
            tb7 r5 = r5.h
            goto L_0x00d7
        L_0x00d3:
            k0d r5 = defpackage.tb7.s()
        L_0x00d7:
            int r6 = r5.size()
            int r6 = r6 + r4
            ea6[] r4 = new defpackage.ea6[r6]
            int[] r6 = new int[r6]
            if (r28 == 0) goto L_0x00ed
            ea6 r3 = r3.c()
            r4[r16] = r3
            r3 = 5
            r6[r16] = r3
            r3 = r8
            goto L_0x00ef
        L_0x00ed:
            r3 = r16
        L_0x00ef:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r10 = r16
        L_0x00f6:
            int r8 = r5.size()
            if (r10 >= r8) goto L_0x0110
            java.lang.Object r8 = r5.get(r10)
            ea6 r8 = (defpackage.ea6) r8
            r4[r3] = r8
            r18 = 3
            r6[r3] = r18
            r7.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x0110:
            r8 = 1
            y54 r3 = r14.D0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0121
            if (r28 == 0) goto L_0x0121
            hpb r3 = r14.v0
            gpb r3 = r3.a()
            r10 = r3
            goto L_0x0123
        L_0x0121:
            r10 = r17
        L_0x0123:
            cs r3 = r14.b
            y28 r5 = r14.y
            y54 r8 = r14.D0
            r32 = r9
            qpg r9 = r14.w
            r33 = r11
            int r11 = r14.E0
            int[] r12 = r2.a
            int r13 = r2.b
            r34 = r6
            r29 = r7
            long r6 = r14.x
            brf r0 = r14.c
            r18 = r3
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r6
            r30 = r10
            r31 = r0
            td4 r5 = r18.i(r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            w03 r0 = new w03
            int r2 = r2.b
            cb4 r7 = r14.z
            pw4 r11 = r14.o
            gw4 r12 = r14.y0
            nfd r13 = r14.v
            cs r8 = r14.x0
            r1 = r0
            r3 = r34
            r6 = r36
            r19 = r8
            r18 = r32
            r8 = r41
            r15 = r10
            r10 = r11
            r35 = r33
            r11 = r12
            r12 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r36)
            java.util.IdentityHashMap r1 = r14.w0     // Catch:{ all -> 0x0187 }
            r1.put(r0, r15)     // Catch:{ all -> 0x0187 }
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            r4 = r39
            r4[r18] = r0
            goto L_0x01c2
        L_0x0187:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            throw r0
        L_0x018a:
            r18 = r9
            r35 = r11
            r4 = r15
            r0 = 2
            if (r3 != r0) goto L_0x01c2
            java.util.List r0 = r14.F0
            int r2 = r2.d
            java.lang.Object r0 = r0.get(r2)
            i95 r0 = (defpackage.i95) r0
            spf r1 = r1.a()
            ea6 r1 = r1.c()
            f95 r2 = new f95
            y54 r3 = r14.D0
            boolean r3 = r3.d
            r2.<init>(r0, r1, r3)
            r4[r18] = r2
            goto L_0x01c2
        L_0x01b0:
            r18 = r9
            r35 = r11
            r4 = r15
            boolean r0 = r2 instanceof defpackage.w03
            if (r0 == 0) goto L_0x01c2
            w03 r2 = (defpackage.w03) r2
            td4 r0 = r2.m()
            r0.c(r1)
        L_0x01c2:
            int r9 = r18 + 1
            r0 = r37
            r12 = r41
            r15 = r4
            r11 = r35
            r8 = 1
            r10 = -1
            goto L_0x0093
        L_0x01cf:
            r35 = r11
            r4 = r15
            r0 = r37
            r1 = r16
        L_0x01d6:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x021d
            r2 = r4[r1]
            if (r2 != 0) goto L_0x0212
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0212
            r2 = r35
            r3 = r2[r1]
            e64[] r5 = r14.Y
            r3 = r5[r3]
            int r5 = r3.c
            r6 = 1
            if (r5 != r6) goto L_0x020e
            int r5 = r14.e(r1, r2)
            r7 = -1
            if (r5 != r7) goto L_0x01ff
            w45 r3 = new w45
            r3.<init>()
            r4[r1] = r3
            r8 = r41
            goto L_0x0218
        L_0x01ff:
            r5 = r4[r5]
            w03 r5 = (defpackage.w03) r5
            int r3 = r3.b
            r8 = r41
            s03 r3 = r5.v(r3, r8)
            r4[r1] = r3
            goto L_0x0218
        L_0x020e:
            r8 = r41
        L_0x0210:
            r7 = -1
            goto L_0x0218
        L_0x0212:
            r8 = r41
            r2 = r35
            r6 = 1
            goto L_0x0210
        L_0x0218:
            int r1 = r1 + 1
            r35 = r2
            goto L_0x01d6
        L_0x021d:
            r8 = r41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r4.length
            r3 = r16
        L_0x022c:
            if (r3 >= r2) goto L_0x0246
            r5 = r4[r3]
            boolean r6 = r5 instanceof defpackage.w03
            if (r6 == 0) goto L_0x023a
            w03 r5 = (defpackage.w03) r5
            r0.add(r5)
            goto L_0x0243
        L_0x023a:
            boolean r6 = r5 instanceof defpackage.f95
            if (r6 == 0) goto L_0x0243
            f95 r5 = (defpackage.f95) r5
            r1.add(r5)
        L_0x0243:
            int r3 = r3 + 1
            goto L_0x022c
        L_0x0246:
            int r2 = r0.size()
            w03[] r2 = new defpackage.w03[r2]
            r14.A0 = r2
            r0.toArray(r2)
            int r2 = r1.size()
            f95[] r2 = new defpackage.f95[r2]
            r14.B0 = r2
            r1.toArray(r2)
            p9a r1 = r14.Z
            zb2 r2 = new zb2
            r3 = 27
            r2.<init>(r3)
            java.util.AbstractList r2 = defpackage.gsg.H(r2, r0)
            r1.getClass()
            vc3 r1 = new vc3
            r1.<init>(r0, r2)
            r14.C0 = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g64.g(md5[], boolean[], lcd[], boolean[], long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r3 < (((r0.C() + r8) + r6) - 1)) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h(long r18, defpackage.und r20) {
        /*
            r17 = this;
            r1 = r18
            r0 = r17
            w03[] r0 = r0.A0
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L_0x0009:
            if (r5 >= r3) goto L_0x0074
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L_0x0071
            td4 r0 = r6.v
            pd4[] r0 = r0.i
            int r3 = r0.length
        L_0x0017:
            if (r4 >= r3) goto L_0x006f
            r5 = r0[r4]
            java.lang.Object r6 = r5.g
            q64 r6 = (defpackage.q64) r6
            if (r6 == 0) goto L_0x006c
            long r6 = r5.e()
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            goto L_0x006c
        L_0x002c:
            java.lang.Object r0 = r5.g
            q64 r0 = (defpackage.q64) r0
            defpackage.n79.o(r0)
            long r3 = r5.b
            long r3 = r0.u(r1, r3)
            long r8 = r5.c
            long r3 = r3 + r8
            long r10 = r5.g(r3)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0061
            r12 = -1
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r13 = 1
            if (r12 == 0) goto L_0x005a
            defpackage.n79.o(r0)
            long r15 = r0.C()
            long r15 = r15 + r8
            long r15 = r15 + r6
            long r15 = r15 - r13
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            long r3 = r3 + r13
            long r3 = r5.g(r3)
            r5 = r3
            goto L_0x0062
        L_0x0061:
            r5 = r10
        L_0x0062:
            r0 = r20
            r1 = r18
            r3 = r10
            long r0 = r0.a(r1, r3, r5)
            goto L_0x0070
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x006f:
            r0 = r1
        L_0x0070:
            return r0
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g64.h(long, und):long");
    }

    public final long i() {
        return this.C0.i();
    }

    public final void j(kt8 kt8, long j) {
        this.z0 = kt8;
        kt8.b(this);
    }

    public final boolean k(d38 d38) {
        return this.C0.k(d38);
    }

    public final void r() {
        this.y.b();
    }

    public final long s(long j) {
        int i;
        ArrayList arrayList;
        uj0 uj0;
        boolean z2;
        long j2 = j;
        w03[] w03Arr = this.A0;
        int length = w03Arr.length;
        int i2 = 0;
        while (i2 < length) {
            w03 w03 = w03Arr[i2];
            w03.C0 = j2;
            if (w03.p()) {
                w03.B0 = j2;
                i = i2;
            } else {
                int i3 = 0;
                while (true) {
                    arrayList = w03.Y;
                    if (i3 >= arrayList.size()) {
                        i = i2;
                        break;
                    }
                    uj0 = (uj0) arrayList.get(i3);
                    int i4 = (uj0.x > j2 ? 1 : (uj0.x == j2 ? 0 : -1));
                    i = i2;
                    if (i4 == 0 && uj0.Y == -9223372036854775807L) {
                        break;
                    } else if (i4 > 0) {
                        break;
                    } else {
                        i3++;
                        i2 = i;
                    }
                }
                uj0 = null;
                jcd jcd = w03.v0;
                if (uj0 != null) {
                    z2 = jcd.z(uj0.d(0));
                } else {
                    z2 = jcd.A(j2, j2 < w03.i());
                }
                jcd[] jcdArr = w03.w0;
                if (z2) {
                    w03.D0 = w03.t(jcd.n(), 0);
                    for (jcd A : jcdArr) {
                        A.A(j2, true);
                    }
                } else {
                    w03.B0 = j2;
                    w03.F0 = false;
                    arrayList.clear();
                    w03.D0 = 0;
                    l15 l15 = w03.z;
                    if (l15.z()) {
                        jcd.h();
                        for (jcd h : jcdArr) {
                            h.h();
                        }
                        l15.j();
                    } else {
                        l15.c = null;
                        jcd.y(false);
                        for (jcd y2 : jcdArr) {
                            y2.y(false);
                        }
                        i2 = i + 1;
                    }
                }
            }
            i2 = i + 1;
        }
        for (f95 f95 : this.B0) {
            int b2 = v0g.b(f95.c, j2, true);
            f95.x = b2;
            f95.y = (!f95.o || b2 != f95.c.length) ? -9223372036854775807L : j2;
        }
        return j2;
    }

    public final long w() {
        return -9223372036854775807L;
    }

    public final upf x() {
        return this.X;
    }

    public final long y() {
        return this.C0.y();
    }

    public final void z(long j, boolean z2) {
        long j2;
        for (w03 w03 : this.A0) {
            if (!w03.p()) {
                jcd jcd = w03.v0;
                int i = jcd.q;
                jcd.g(j, z2, true);
                jcd jcd2 = w03.v0;
                int i2 = jcd2.q;
                if (i2 > i) {
                    synchronized (jcd2) {
                        j2 = jcd2.p == 0 ? Long.MIN_VALUE : jcd2.n[jcd2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        jcd[] jcdArr = w03.w0;
                        if (i3 >= jcdArr.length) {
                            break;
                        }
                        jcdArr[i3].g(j2, z2, w03.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(w03.t(i2, 0), w03.D0);
                if (min > 0) {
                    v0g.X(w03.Y, 0, min);
                    w03.D0 -= min;
                }
            }
        }
    }
}
