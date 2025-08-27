package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r07  reason: default package */
public final class r07 implements mt8, s17 {
    public final long A0;
    public kt8 B0;
    public int C0;
    public upf D0;
    public e27[] E0;
    public e27[] F0;
    public int G0;
    public vc3 H0;
    public final IdentityHashMap X;
    public final p1e Y;
    public final p9a Z;
    public final m07 a;
    public final vf4 b;
    public final rt6 c;
    public final brf o;
    public final pw4 v;
    public final boolean v0;
    public final gw4 w;
    public final int w0;
    public final nfd x;
    public final boolean x0;
    public final cs y;
    public final mpb y0;
    public final cb4 z;
    public final b8d z0 = new b8d((Object) this);

    public r07(m07 m07, vf4 vf4, rt6 rt6, brf brf, pw4 pw4, gw4 gw4, nfd nfd, cs csVar, cb4 cb4, p9a p9a, boolean z2, int i, boolean z3, mpb mpb, long j) {
        this.a = m07;
        this.b = vf4;
        this.c = rt6;
        this.o = brf;
        this.v = pw4;
        this.w = gw4;
        this.x = nfd;
        this.y = csVar;
        this.z = cb4;
        this.Z = p9a;
        this.v0 = z2;
        this.w0 = i;
        this.x0 = z3;
        this.y0 = mpb;
        this.A0 = j;
        p9a.getClass();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        this.H0 = new vc3(k0d, k0d);
        this.X = new IdentityHashMap();
        this.Y = new p1e();
        this.E0 = new e27[0];
        this.F0 = new e27[0];
    }

    public static ea6 e(ea6 ea6, ea6 ea62, boolean z2) {
        List list;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        sp9 sp9;
        String str3;
        lx5 lx5 = tb7.b;
        List list2 = k0d.v;
        int i4 = -1;
        if (ea62 != null) {
            str3 = ea62.j;
            sp9 = ea62.k;
            i3 = ea62.B;
            i2 = ea62.e;
            i = ea62.f;
            str2 = ea62.d;
            str = ea62.b;
            list = ea62.c;
        } else {
            String v2 = v0g.v(1, ea6.j);
            sp9 = ea6.k;
            if (z2) {
                i3 = ea6.B;
                i2 = ea6.e;
                i = ea6.f;
                str2 = ea6.d;
                str = ea6.b;
                list2 = ea6.c;
            } else {
                i2 = 0;
                str2 = null;
                i3 = -1;
                i = 0;
                str = null;
            }
            List list3 = list2;
            str3 = v2;
            list = list3;
        }
        String c2 = vq9.c(str3);
        int i5 = z2 ? ea6.g : -1;
        if (z2) {
            i4 = ea6.h;
        }
        ba6 ba6 = new ba6();
        ba6.a = ea6.a;
        ba6.b = str;
        ba6.c = tb7.p(list);
        ba6.l = vq9.l(ea6.m);
        ba6.m = vq9.l(c2);
        ba6.i = str3;
        ba6.j = sp9;
        ba6.g = i5;
        ba6.h = i4;
        ba6.A = i3;
        ba6.e = i2;
        ba6.f = i;
        ba6.d = str2;
        return new ea6(ba6);
    }

    public final void A(long j) {
        this.H0.A(j);
    }

    public final void a() {
        for (e27 e27 : this.E0) {
            ArrayList arrayList = e27.w0;
            if (!arrayList.isEmpty()) {
                p07 p07 = (p07) b0h.w(arrayList);
                int b2 = e27.o.b(p07);
                if (b2 == 1) {
                    p07.U0 = true;
                } else if (b2 == 0) {
                    e27.A0.post(new uo5(7, (Object) e27, (Object) p07));
                } else if (b2 == 2 && !e27.c1) {
                    l15 l15 = e27.X;
                    if (l15.z()) {
                        l15.j();
                    }
                }
            }
        }
        this.B0.c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r4 != false) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.net.Uri r17, defpackage.j28 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            e27[] r2 = r0.E0
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L_0x0009:
            if (r6 >= r3) goto L_0x00a6
            r8 = r2[r6]
            j07 r9 = r8.o
            android.net.Uri[] r10 = r9.e
            boolean r10 = defpackage.v0g.m(r10, r1)
            if (r10 != 0) goto L_0x001d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L_0x00a1
        L_0x001d:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L_0x003f
            md5 r12 = r9.r
            z35 r12 = defpackage.h88.o(r12)
            nfd r8 = r8.z
            r8.getClass()
            r8 = r18
            p01 r12 = defpackage.nfd.o(r12, r8)
            if (r12 == 0) goto L_0x0041
            int r13 = r12.b
            r14 = 2
            if (r13 != r14) goto L_0x0041
            long r12 = r12.c
            goto L_0x0042
        L_0x003f:
            r8 = r18
        L_0x0041:
            r12 = r10
        L_0x0042:
            r14 = 0
        L_0x0043:
            android.net.Uri[] r15 = r9.e
            int r5 = r15.length
            r4 = -1
            if (r14 >= r5) goto L_0x0055
            r5 = r15[r14]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r14 = r14 + 1
            goto L_0x0043
        L_0x0055:
            r14 = r4
        L_0x0056:
            if (r14 != r4) goto L_0x005b
        L_0x0058:
            r4 = 1
            r5 = 1
            goto L_0x0098
        L_0x005b:
            md5 r5 = r9.r
            int r5 = r5.p(r14)
            if (r5 != r4) goto L_0x0064
            goto L_0x0058
        L_0x0064:
            boolean r4 = r9.t
            android.net.Uri r14 = r9.p
            boolean r14 = r1.equals(r14)
            r4 = r4 | r14
            r9.t = r4
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0096
            md5 r4 = r9.r
            boolean r4 = r4.u(r5, r12)
            if (r4 == 0) goto L_0x0093
            vf4 r4 = r9.g
            java.util.HashMap r4 = r4.b
            java.lang.Object r4 = r4.get(r1)
            uf4 r4 = (defpackage.uf4) r4
            if (r4 == 0) goto L_0x008e
            boolean r4 = defpackage.uf4.a(r4, r12)
            r5 = 1
            r4 = r4 ^ r5
            goto L_0x0090
        L_0x008e:
            r5 = 1
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x0094
            goto L_0x0097
        L_0x0093:
            r5 = 1
        L_0x0094:
            r4 = 0
            goto L_0x0098
        L_0x0096:
            r5 = 1
        L_0x0097:
            r4 = r5
        L_0x0098:
            if (r4 == 0) goto L_0x00a0
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            r4 = r5
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L_0x0009
        L_0x00a6:
            kt8 r1 = r0.B0
            r1.c(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r07.b(android.net.Uri, j28, boolean):boolean");
    }

    public final e27 c(String str, int i, Uri[] uriArr, ea6[] ea6Arr, ea6 ea6, List list, Map map, long j) {
        Uri[] uriArr2 = uriArr;
        ea6[] ea6Arr2 = ea6Arr;
        j07 j07 = new j07(this.a, this.b, uriArr2, ea6Arr2, this.c, this.o, this.Y, this.A0, list, this.y0);
        gw4 gw4 = this.w;
        nfd nfd = this.x;
        return new e27(str, i, this.z0, j07, map, this.z, j, ea6, this.v, gw4, nfd, this.y, this.w0);
    }

    public final boolean d() {
        return this.H0.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: w17} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x028d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.md5[] r37, boolean[] r38, defpackage.lcd[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r39
            r12 = r41
            int r3 = r1.length
            int[] r14 = new int[r3]
            int r3 = r1.length
            int[] r15 = new int[r3]
            r3 = 0
        L_0x000f:
            int r4 = r1.length
            java.util.IdentityHashMap r10 = r0.X
            r8 = -1
            if (r3 >= r4) goto L_0x004d
            r4 = r2[r3]
            if (r4 != 0) goto L_0x001b
            r4 = r8
            goto L_0x0025
        L_0x001b:
            java.lang.Object r4 = r10.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x0025:
            r14[r3] = r4
            r15[r3] = r8
            r4 = r1[r3]
            if (r4 == 0) goto L_0x004a
            spf r4 = r4.a()
            r5 = 0
        L_0x0032:
            e27[] r6 = r0.E0
            int r7 = r6.length
            if (r5 >= r7) goto L_0x004a
            r6 = r6[r5]
            r6.c()
            upf r6 = r6.R0
            int r6 = r6.b(r4)
            if (r6 == r8) goto L_0x0047
            r15[r3] = r5
            goto L_0x004a
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x004d:
            r10.clear()
            int r9 = r1.length
            lcd[] r6 = new defpackage.lcd[r9]
            int r7 = r1.length
            lcd[] r4 = new defpackage.lcd[r7]
            int r5 = r1.length
            md5[] r3 = new defpackage.md5[r5]
            e27[] r11 = r0.E0
            int r11 = r11.length
            e27[] r11 = new defpackage.e27[r11]
            r17 = r9
            r9 = 0
            r18 = 0
            r19 = 0
        L_0x0065:
            e27[] r8 = r0.E0
            int r8 = r8.length
            if (r9 >= r8) goto L_0x0349
            r21 = r6
            r8 = 0
        L_0x006d:
            int r6 = r1.length
            r22 = r7
            if (r8 >= r6) goto L_0x008b
            r6 = r14[r8]
            if (r6 != r9) goto L_0x0079
            r6 = r2[r8]
            goto L_0x007a
        L_0x0079:
            r6 = 0
        L_0x007a:
            r4[r8] = r6
            r6 = r15[r8]
            if (r6 != r9) goto L_0x0083
            r7 = r1[r8]
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            r3[r8] = r7
            int r8 = r8 + 1
            r7 = r22
            goto L_0x006d
        L_0x008b:
            e27[] r6 = r0.E0
            r8 = r6[r9]
            r8.c()
            int r6 = r8.N0
            r24 = r9
            r7 = 0
        L_0x0097:
            if (r7 >= r5) goto L_0x00ef
            r25 = r4[r7]
            r9 = r25
            w17 r9 = (defpackage.w17) r9
            if (r9 == 0) goto L_0x00ac
            r25 = r3[r7]
            if (r25 == 0) goto L_0x00a9
            boolean r25 = r38[r7]
            if (r25 != 0) goto L_0x00ac
        L_0x00a9:
            r25 = r10
            goto L_0x00b2
        L_0x00ac:
            r25 = r10
            r27 = r11
            r2 = -1
            goto L_0x00e6
        L_0x00b2:
            int r10 = r8.N0
            r26 = 1
            int r10 = r10 + -1
            r8.N0 = r10
            int r10 = r9.c
            r27 = r11
            r11 = -1
            if (r10 == r11) goto L_0x00e2
            e27 r10 = r9.b
            r10.c()
            int[] r11 = r10.T0
            r11.getClass()
            int[] r11 = r10.T0
            int r2 = r9.a
            r2 = r11[r2]
            boolean[] r11 = r10.W0
            boolean r11 = r11[r2]
            defpackage.n79.n(r11)
            boolean[] r10 = r10.W0
            r11 = 0
            r10[r2] = r11
            r2 = -1
            r9.c = r2
        L_0x00e0:
            r9 = 0
            goto L_0x00e4
        L_0x00e2:
            r2 = r11
            goto L_0x00e0
        L_0x00e4:
            r4[r7] = r9
        L_0x00e6:
            int r7 = r7 + 1
            r2 = r39
            r10 = r25
            r11 = r27
            goto L_0x0097
        L_0x00ef:
            r25 = r10
            r27 = r11
            r2 = -1
            if (r19 != 0) goto L_0x0106
            boolean r7 = r8.b1
            if (r7 == 0) goto L_0x00fd
            if (r6 != 0) goto L_0x0104
            goto L_0x0106
        L_0x00fd:
            long r6 = r8.Y0
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r6 = 0
            goto L_0x0107
        L_0x0106:
            r6 = 1
        L_0x0107:
            j07 r11 = r8.o
            md5 r7 = r11.r
            r20 = r6
            r10 = r7
            r6 = 0
        L_0x010f:
            vf4 r9 = r11.g
            android.net.Uri[] r2 = r11.e
            if (r6 >= r5) goto L_0x0185
            r28 = r5
            r5 = r3[r6]
            if (r5 != 0) goto L_0x011e
            r29 = r3
            goto L_0x017b
        L_0x011e:
            r29 = r3
            upf r3 = r8.R0
            spf r0 = r5.a()
            int r0 = r3.b(r0)
            int r3 = r8.U0
            if (r0 != r3) goto L_0x0146
            md5 r3 = r11.r
            int r3 = r3.i()
            r2 = r2[r3]
            java.util.HashMap r3 = r9.b
            java.lang.Object r2 = r3.get(r2)
            uf4 r2 = (defpackage.uf4) r2
            if (r2 == 0) goto L_0x0143
            r3 = 0
            r2.Y = r3
        L_0x0143:
            r11.r = r5
            r10 = r5
        L_0x0146:
            r2 = r4[r6]
            if (r2 != 0) goto L_0x017b
            int r2 = r8.N0
            r3 = 1
            int r2 = r2 + r3
            r8.N0 = r2
            w17 r2 = new w17
            r2.<init>(r8, r0)
            r4[r6] = r2
            r40[r6] = r3
            int[] r5 = r8.T0
            if (r5 == 0) goto L_0x017b
            r2.a()
            if (r20 != 0) goto L_0x017b
            c27[] r2 = r8.E0
            int[] r5 = r8.T0
            r0 = r5[r0]
            r0 = r2[r0]
            int r2 = r0.n()
            if (r2 == 0) goto L_0x0178
            boolean r0 = r0.A(r12, r3)
            if (r0 != 0) goto L_0x0178
            r0 = 1
            goto L_0x0179
        L_0x0178:
            r0 = 0
        L_0x0179:
            r20 = r0
        L_0x017b:
            int r6 = r6 + 1
            r0 = r36
            r5 = r28
            r3 = r29
            r2 = -1
            goto L_0x010f
        L_0x0185:
            r29 = r3
            r28 = r5
            int r0 = r8.N0
            java.util.ArrayList r3 = r8.w0
            if (r0 != 0) goto L_0x01ea
            md5 r0 = r11.r
            int r0 = r0.i()
            r0 = r2[r0]
            java.util.HashMap r2 = r9.b
            java.lang.Object r0 = r2.get(r0)
            uf4 r0 = (defpackage.uf4) r0
            r2 = 0
            if (r0 == 0) goto L_0x01a4
            r0.Y = r2
        L_0x01a4:
            r0 = 0
            r11.o = r0
            r8.P0 = r0
            r0 = 1
            r8.a1 = r0
            r3.clear()
            l15 r3 = r8.X
            boolean r5 = r3.z()
            if (r5 == 0) goto L_0x01cd
            boolean r5 = r8.L0
            if (r5 == 0) goto L_0x01c9
            c27[] r5 = r8.E0
            int r6 = r5.length
            r7 = r2
        L_0x01bf:
            if (r7 >= r6) goto L_0x01c9
            r9 = r5[r7]
            r9.h()
            int r7 = r7 + 1
            goto L_0x01bf
        L_0x01c9:
            r3.j()
            goto L_0x01d0
        L_0x01cd:
            r8.C()
        L_0x01d0:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x029f
        L_0x01ea:
            r0 = 1
            r2 = 0
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x026e
            boolean r3 = defpackage.v0g.a(r10, r7)
            if (r3 != 0) goto L_0x026e
            boolean r3 = r8.b1
            if (r3 != 0) goto L_0x0250
            r5 = 0
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0203
            long r5 = -r12
        L_0x0203:
            r6 = r5
            p07 r9 = r8.n()
            an8[] r16 = r11.a(r9, r12)
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r5 = r8.x0
            r23 = r29
            r3 = r10
            r26 = r4
            r29 = r5
            r4 = r41
            r0 = r21
            r2 = r22
            r22 = r14
            r32 = r17
            r33 = r24
            r17 = -1
            r24 = r0
            r0 = r8
            r14 = r9
            r8 = r30
            r34 = r25
            r25 = r10
            r10 = r29
            r21 = r15
            r35 = r27
            r15 = r11
            r11 = r16
            r3.r(r4, r6, r8, r10, r11)
            ea6 r3 = r14.o
            spf r4 = r15.h
            int r3 = r4.d(r3)
            int r4 = r25.i()
            if (r4 == r3) goto L_0x024e
        L_0x024c:
            r3 = 1
            goto L_0x0269
        L_0x024e:
            r3 = 1
            goto L_0x0287
        L_0x0250:
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
            goto L_0x024c
        L_0x0269:
            r0.a1 = r3
            r4 = r3
            r9 = r4
            goto L_0x028b
        L_0x026e:
            r3 = r0
            r26 = r4
            r0 = r8
            r32 = r17
            r2 = r22
            r33 = r24
            r34 = r25
            r35 = r27
            r23 = r29
            r17 = -1
            r22 = r14
            r24 = r21
            r21 = r15
            r15 = r11
        L_0x0287:
            r4 = r19
            r9 = r20
        L_0x028b:
            if (r9 == 0) goto L_0x029d
            r0.D(r12, r4)
            r11 = 0
        L_0x0291:
            if (r11 >= r2) goto L_0x029d
            r4 = r26[r11]
            if (r4 == 0) goto L_0x0299
            r40[r11] = r3
        L_0x0299:
            int r11 = r11 + 1
            r3 = 1
            goto L_0x0291
        L_0x029d:
            r20 = r9
        L_0x029f:
            java.util.ArrayList r3 = r0.B0
            r3.clear()
            r11 = 0
        L_0x02a5:
            if (r11 >= r2) goto L_0x02b3
            r4 = r26[r11]
            if (r4 == 0) goto L_0x02b0
            w17 r4 = (defpackage.w17) r4
            r3.add(r4)
        L_0x02b0:
            int r11 = r11 + 1
            goto L_0x02a5
        L_0x02b3:
            r4 = 1
            r0.b1 = r4
            r3 = 0
            r11 = 0
        L_0x02b8:
            int r4 = r1.length
            if (r11 >= r4) goto L_0x02e8
            r4 = r26[r11]
            r5 = r21[r11]
            r6 = r33
            if (r5 != r6) goto L_0x02d3
            r4.getClass()
            r24[r11] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5 = r34
            r5.put(r4, r3)
            r3 = 1
            goto L_0x02e1
        L_0x02d3:
            r5 = r34
            r7 = r22[r11]
            if (r7 != r6) goto L_0x02e1
            if (r4 != 0) goto L_0x02dd
            r4 = 1
            goto L_0x02de
        L_0x02dd:
            r4 = 0
        L_0x02de:
            defpackage.n79.n(r4)
        L_0x02e1:
            int r11 = r11 + 1
            r34 = r5
            r33 = r6
            goto L_0x02b8
        L_0x02e8:
            r6 = r33
            r5 = r34
            if (r3 == 0) goto L_0x0329
            r4 = r18
            r3 = r35
            r3[r4] = r0
            int r18 = r4 + 1
            if (r4 != 0) goto L_0x031b
            r4 = 1
            r15.m = r4
            if (r20 != 0) goto L_0x030c
            r7 = r36
            e27[] r8 = r7.F0
            int r9 = r8.length
            if (r9 == 0) goto L_0x030a
            r9 = 0
            r8 = r8[r9]
            if (r0 == r8) goto L_0x0330
            goto L_0x030f
        L_0x030a:
            r9 = 0
            goto L_0x030f
        L_0x030c:
            r9 = 0
            r7 = r36
        L_0x030f:
            p1e r0 = r7.Y
            java.lang.Object r0 = r0.a
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r0.clear()
            r19 = r4
            goto L_0x0330
        L_0x031b:
            r4 = 1
            r9 = 0
            r7 = r36
            int r0 = r7.G0
            if (r6 >= r0) goto L_0x0325
            r11 = r4
            goto L_0x0326
        L_0x0325:
            r11 = r9
        L_0x0326:
            r15.m = r11
            goto L_0x0330
        L_0x0329:
            r9 = 0
            r7 = r36
            r4 = r18
            r3 = r35
        L_0x0330:
            int r0 = r6 + 1
            r9 = r0
            r11 = r3
            r10 = r5
            r0 = r7
            r15 = r21
            r14 = r22
            r3 = r23
            r6 = r24
            r4 = r26
            r5 = r28
            r17 = r32
            r7 = r2
            r2 = r39
            goto L_0x0065
        L_0x0349:
            r7 = r0
            r0 = r2
            r8 = r6
            r3 = r11
            r6 = r17
            r4 = r18
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r0, r9, r6)
            java.lang.Object[] r0 = defpackage.v0g.U(r4, r3)
            e27[] r0 = (defpackage.e27[]) r0
            r7.F0 = r0
            k0d r0 = defpackage.tb7.q(r0)
            ip5 r1 = new ip5
            r2 = 28
            r1.<init>(r2)
            java.util.AbstractList r1 = defpackage.gsg.H(r1, r0)
            p9a r2 = r7.Z
            r2.getClass()
            vc3 r2 = new vc3
            r2.<init>(r0, r1)
            r7.H0 = r2
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r07.g(md5[], boolean[], lcd[], boolean[], long):long");
    }

    public final long h(long j, und und) {
        e27[] e27Arr = this.F0;
        int length = e27Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            e27 e27 = e27Arr[i];
            if (e27.J0 == 2) {
                j07 j07 = e27.o;
                int b2 = j07.r.b();
                Uri[] uriArr = j07.e;
                int length2 = uriArr.length;
                vf4 vf4 = j07.g;
                c17 b3 = (b2 >= length2 || b2 == -1) ? null : vf4.b(uriArr[j07.r.i()], true);
                if (b3 != null) {
                    tb7 tb7 = b3.r;
                    if (!tb7.isEmpty() && b3.c) {
                        long j2 = b3.h - vf4.x;
                        long j3 = j - j2;
                        int d = v0g.d(Long.valueOf(j3), tb7, true);
                        long j4 = ((x07) tb7.get(d)).v;
                        return und.a(j3, j4, d != tb7.size() - 1 ? ((x07) tb7.get(d + 1)).v : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    public final long i() {
        return this.H0.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0121, code lost:
        if (r2[r7] != 1) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.kt8 r27, long r28) {
        /*
            r26 = this;
            r10 = r26
            r11 = 1
            r0 = r27
            r10.B0 = r0
            vf4 r0 = r10.b
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.c
            r1.add(r10)
            java.lang.Object r0 = r0.w0
            r12 = r0
            k17 r12 = (defpackage.k17) r12
            r12.getClass()
            boolean r0 = r10.x0
            r13 = 0
            if (r0 == 0) goto L_0x008d
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r12.m
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r13
        L_0x002b:
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x008b
            java.lang.Object r4 = r1.get(r3)
            yv4 r4 = (defpackage.yv4) r4
            java.lang.String r5 = r4.c
            int r3 = r3 + r11
            r6 = r3
        L_0x003b:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0087
            java.lang.Object r7 = r0.get(r6)
            yv4 r7 = (defpackage.yv4) r7
            java.lang.String r8 = r7.c
            boolean r8 = android.text.TextUtils.equals(r8, r5)
            if (r8 == 0) goto L_0x0085
            java.lang.String r8 = r4.c
            java.lang.String r9 = r7.c
            if (r8 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0060
            boolean r14 = android.text.TextUtils.equals(r8, r9)
            if (r14 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r14 = r13
            goto L_0x0061
        L_0x0060:
            r14 = r11
        L_0x0061:
            defpackage.n79.n(r14)
            if (r8 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r8 = r9
        L_0x0068:
            int r9 = defpackage.v0g.a
            wv4[] r4 = r4.a
            int r9 = r4.length
            wv4[] r7 = r7.a
            int r14 = r7.length
            int r9 = r9 + r14
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r4, r9)
            int r4 = r4.length
            int r14 = r7.length
            java.lang.System.arraycopy(r7, r13, r9, r4, r14)
            wv4[] r9 = (defpackage.wv4[]) r9
            yv4 r4 = new yv4
            r4.<init>(r8, r11, r9)
            r0.remove(r6)
            goto L_0x003b
        L_0x0085:
            int r6 = r6 + r11
            goto L_0x003b
        L_0x0087:
            r2.put(r5, r4)
            goto L_0x002b
        L_0x008b:
            r14 = r2
            goto L_0x0092
        L_0x008d:
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto L_0x008b
        L_0x0092:
            java.util.List r0 = r12.e
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r11
            r10.C0 = r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            m07 r9 = r10.a
            boolean r7 = r10.v0
            java.util.List r6 = r12.g
            if (r1 == 0) goto L_0x02b6
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r3 = r13
            r4 = r3
            r5 = r4
        L_0x00b6:
            int r13 = r0.size()
            if (r3 >= r13) goto L_0x00eb
            java.lang.Object r13 = r0.get(r3)
            i17 r13 = (defpackage.i17) r13
            ea6 r13 = r13.b
            int r11 = r13.u
            if (r11 > 0) goto L_0x00e3
            java.lang.String r11 = r13.j
            r13 = 2
            java.lang.String r17 = defpackage.v0g.v(r13, r11)
            if (r17 == 0) goto L_0x00d4
            r11 = 2
            r13 = 1
            goto L_0x00e5
        L_0x00d4:
            r13 = 1
            java.lang.String r11 = defpackage.v0g.v(r13, r11)
            if (r11 == 0) goto L_0x00df
            r2[r3] = r13
            int r5 = r5 + r13
            goto L_0x00e8
        L_0x00df:
            r11 = -1
            r2[r3] = r11
            goto L_0x00e8
        L_0x00e3:
            r13 = 1
            r11 = 2
        L_0x00e5:
            r2[r3] = r11
            int r4 = r4 + r13
        L_0x00e8:
            int r3 = r3 + r13
            r11 = r13
            goto L_0x00b6
        L_0x00eb:
            if (r4 <= 0) goto L_0x00f1
            r11 = r4
            r1 = 1
        L_0x00ef:
            r3 = 0
            goto L_0x00fb
        L_0x00f1:
            if (r5 >= r1) goto L_0x00f8
            int r1 = r1 - r5
            r11 = r1
            r1 = 0
            r3 = 1
            goto L_0x00fb
        L_0x00f8:
            r11 = r1
            r1 = 0
            goto L_0x00ef
        L_0x00fb:
            android.net.Uri[] r4 = new android.net.Uri[r11]
            ea6[] r13 = new defpackage.ea6[r11]
            int[] r5 = new int[r11]
            r17 = r7
            r19 = r8
            r7 = 0
            r18 = 0
        L_0x0108:
            int r8 = r0.size()
            if (r7 >= r8) goto L_0x0140
            if (r1 == 0) goto L_0x011a
            r8 = r2[r7]
            r20 = r9
            r9 = 2
            if (r8 != r9) goto L_0x0118
            goto L_0x011c
        L_0x0118:
            r9 = 1
            goto L_0x0124
        L_0x011a:
            r20 = r9
        L_0x011c:
            if (r3 == 0) goto L_0x0126
            r8 = r2[r7]
            r9 = 1
            if (r8 == r9) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r8 = r9
            goto L_0x013c
        L_0x0126:
            r9 = 1
        L_0x0127:
            java.lang.Object r8 = r0.get(r7)
            i17 r8 = (defpackage.i17) r8
            android.net.Uri r9 = r8.a
            r4[r18] = r9
            ea6 r8 = r8.b
            r13[r18] = r8
            r8 = 1
            int r9 = r18 + 1
            r5[r18] = r7
            r18 = r9
        L_0x013c:
            int r7 = r7 + r8
            r9 = r20
            goto L_0x0108
        L_0x0140:
            r20 = r9
            r7 = 0
            r8 = 1
            r0 = r13[r7]
            java.lang.String r0 = r0.j
            r2 = 2
            int r9 = defpackage.v0g.u(r2, r0)
            int r7 = defpackage.v0g.u(r8, r0)
            if (r7 == r8) goto L_0x015b
            if (r7 != 0) goto L_0x0164
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0164
        L_0x015b:
            if (r9 > r8) goto L_0x0164
            int r0 = r7 + r9
            if (r0 <= 0) goto L_0x0164
            r18 = 1
            goto L_0x0166
        L_0x0164:
            r18 = 0
        L_0x0166:
            if (r1 != 0) goto L_0x016c
            if (r7 <= 0) goto L_0x016c
            r2 = 1
            goto L_0x016d
        L_0x016c:
            r2 = 0
        L_0x016d:
            java.lang.String r8 = "main"
            ea6 r3 = r12.j
            java.util.List r1 = r12.k
            r0 = r26
            r21 = r1
            r1 = r8
            r22 = r3
            r3 = r4
            r4 = r13
            r10 = r5
            r5 = r22
            r22 = r6
            r6 = r21
            r21 = r7
            r7 = r14
            r24 = r8
            r23 = r14
            r14 = r19
            r19 = r20
            r20 = r9
            r8 = r28
            e27 r0 = r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.add(r0)
            r14.add(r10)
            if (r17 == 0) goto L_0x02bf
            if (r18 == 0) goto L_0x02bf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ea6 r2 = r12.j
            if (r20 <= 0) goto L_0x0263
            ea6[] r3 = new defpackage.ea6[r11]
            r4 = 0
        L_0x01ac:
            if (r4 >= r11) goto L_0x020a
            r5 = r13[r4]
            java.lang.String r6 = r5.j
            r7 = 2
            java.lang.String r6 = defpackage.v0g.v(r7, r6)
            java.lang.String r8 = defpackage.vq9.c(r6)
            ba6 r9 = new ba6
            r9.<init>()
            java.lang.String r10 = r5.a
            r9.a = r10
            java.lang.String r10 = r5.b
            r9.b = r10
            java.util.List r10 = r5.c
            tb7 r10 = defpackage.tb7.p(r10)
            r9.c = r10
            java.lang.String r10 = r5.m
            java.lang.String r10 = defpackage.vq9.l(r10)
            r9.l = r10
            java.lang.String r8 = defpackage.vq9.l(r8)
            r9.m = r8
            r9.i = r6
            sp9 r6 = r5.k
            r9.j = r6
            int r6 = r5.g
            r9.g = r6
            int r6 = r5.h
            r9.h = r6
            int r6 = r5.t
            r9.s = r6
            int r6 = r5.u
            r9.t = r6
            float r6 = r5.v
            r9.u = r6
            int r6 = r5.e
            r9.e = r6
            int r5 = r5.f
            r9.f = r5
            ea6 r5 = new ea6
            r5.<init>(r9)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x01ac
        L_0x020a:
            spf r4 = new spf
            r5 = r24
            r4.<init>(r5, r3)
            r1.add(r4)
            if (r21 <= 0) goto L_0x0233
            if (r2 != 0) goto L_0x021e
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x0233
        L_0x021e:
            spf r3 = new spf
            r4 = 0
            r5 = r13[r4]
            ea6 r2 = e(r5, r2, r4)
            ea6[] r2 = new defpackage.ea6[]{r2}
            java.lang.String r4 = "main:audio"
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0233:
            java.util.List r2 = r12.k
            if (r2 == 0) goto L_0x0261
            r3 = 0
        L_0x0238:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0261
            java.lang.String r4 = "main:cc:"
            java.lang.String r4 = defpackage.wj6.h(r3, r4)
            spf r5 = new spf
            java.lang.Object r6 = r2.get(r3)
            ea6 r6 = (defpackage.ea6) r6
            r9 = r19
            qf4 r9 = (defpackage.qf4) r9
            ea6 r6 = r9.c(r6)
            ea6[] r6 = new defpackage.ea6[]{r6}
            r5.<init>(r4, r6)
            r1.add(r5)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0238
        L_0x0261:
            r4 = 1
            goto L_0x027d
        L_0x0263:
            r5 = r24
            r4 = 1
            ea6[] r3 = new defpackage.ea6[r11]
            r6 = 0
        L_0x0269:
            if (r6 >= r11) goto L_0x0275
            r7 = r13[r6]
            ea6 r7 = e(r7, r2, r4)
            r3[r6] = r7
            int r6 = r6 + r4
            goto L_0x0269
        L_0x0275:
            spf r2 = new spf
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x027d:
            spf r2 = new spf
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r4 = "ID3"
            r3.a = r4
            java.lang.String r4 = "application/id3"
            java.lang.String r4 = defpackage.vq9.l(r4)
            r3.m = r4
            ea6 r4 = new ea6
            r4.<init>(r3)
            ea6[] r3 = new defpackage.ea6[]{r4}
            java.lang.String r4 = "main:id3"
            r2.<init>(r4, r3)
            r1.add(r2)
            r3 = 0
            spf[] r4 = new defpackage.spf[r3]
            java.lang.Object[] r3 = r1.toArray(r4)
            spf[] r3 = (defpackage.spf[]) r3
            int r1 = r1.indexOf(r2)
            int[] r1 = new int[]{r1}
            r0.u(r3, r1)
            goto L_0x02bf
        L_0x02b6:
            r22 = r6
            r17 = r7
            r19 = r9
            r23 = r14
            r14 = r8
        L_0x02bf:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r22.size()
            r10.<init>(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = r22.size()
            r11.<init>(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r22.size()
            r13.<init>(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x02e0:
            int r0 = r22.size()
            if (r9 >= r0) goto L_0x03b1
            r7 = r22
            java.lang.Object r0 = r7.get(r9)
            g17 r0 = (defpackage.g17) r0
            java.lang.String r0 = r0.c
            boolean r1 = r8.add(r0)
            if (r1 != 0) goto L_0x02ff
            r18 = r7
            r20 = r8
            r21 = r9
        L_0x02fc:
            r0 = 1
            goto L_0x03a9
        L_0x02ff:
            r10.clear()
            r11.clear()
            r13.clear()
            r1 = 0
            r16 = 1
        L_0x030b:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x034a
            java.lang.Object r2 = r7.get(r1)
            g17 r2 = (defpackage.g17) r2
            java.lang.String r2 = r2.c
            boolean r2 = defpackage.v0g.a(r0, r2)
            if (r2 == 0) goto L_0x0347
            java.lang.Object r2 = r7.get(r1)
            g17 r2 = (defpackage.g17) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13.add(r3)
            android.net.Uri r3 = r2.a
            r10.add(r3)
            ea6 r2 = r2.b
            r11.add(r2)
            java.lang.String r2 = r2.j
            r3 = 1
            int r2 = defpackage.v0g.u(r3, r2)
            if (r2 != r3) goto L_0x0341
            r2 = r3
            goto L_0x0342
        L_0x0341:
            r2 = 0
        L_0x0342:
            r2 = r16 & r2
            r16 = r2
            goto L_0x0348
        L_0x0347:
            r3 = 1
        L_0x0348:
            int r1 = r1 + r3
            goto L_0x030b
        L_0x034a:
            java.lang.String r1 = "audio:"
            java.lang.String r6 = defpackage.a81.m(r1, r0)
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            int r2 = defpackage.v0g.a
            java.lang.Object[] r1 = r10.toArray(r1)
            r3 = r1
            android.net.Uri[] r3 = (android.net.Uri[]) r3
            ea6[] r1 = new defpackage.ea6[r0]
            java.lang.Object[] r0 = r11.toArray(r1)
            r4 = r0
            ea6[] r4 = (defpackage.ea6[]) r4
            java.util.List r18 = java.util.Collections.emptyList()
            r2 = 1
            r5 = 0
            r0 = r26
            r1 = r6
            r25 = r6
            r6 = r18
            r18 = r7
            r7 = r23
            r20 = r8
            r21 = r9
            r8 = r28
            e27 r0 = r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = defpackage.cvg.L(r13)
            r14.add(r1)
            r15.add(r0)
            if (r17 == 0) goto L_0x02fc
            if (r16 == 0) goto L_0x02fc
            r1 = 0
            ea6[] r2 = new defpackage.ea6[r1]
            java.lang.Object[] r2 = r11.toArray(r2)
            ea6[] r2 = (defpackage.ea6[]) r2
            spf r3 = new spf
            r4 = r25
            r3.<init>(r4, r2)
            spf[] r2 = new defpackage.spf[]{r3}
            int[] r3 = new int[r1]
            r0.u(r2, r3)
            goto L_0x02fc
        L_0x03a9:
            int r9 = r21 + 1
            r22 = r18
            r8 = r20
            goto L_0x02e0
        L_0x03b1:
            int r0 = r15.size()
            r10 = r26
            r10.G0 = r0
            r11 = 0
        L_0x03ba:
            java.util.List r0 = r12.h
            int r1 = r0.size()
            if (r11 >= r1) goto L_0x0423
            java.lang.Object r0 = r0.get(r11)
            g17 r0 = (defpackage.g17) r0
            java.lang.String r1 = "subtitle:"
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = defpackage.wj6.o(r11, r1, r2)
            java.lang.String r2 = r0.c
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            android.net.Uri r1 = r0.a
            android.net.Uri[] r3 = new android.net.Uri[]{r1}
            ea6 r8 = r0.b
            ea6[] r4 = new defpackage.ea6[]{r8}
            java.util.List r6 = java.util.Collections.emptyList()
            r2 = 3
            r5 = 0
            r0 = r26
            r1 = r13
            r7 = r23
            r16 = r12
            r12 = r8
            r8 = r28
            e27 r0 = r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            int[] r1 = new int[]{r11}
            r14.add(r1)
            r15.add(r0)
            spf r1 = new spf
            r9 = r19
            qf4 r9 = (defpackage.qf4) r9
            ea6 r2 = r9.c(r12)
            ea6[] r2 = new defpackage.ea6[]{r2}
            r1.<init>(r13, r2)
            spf[] r1 = new defpackage.spf[]{r1}
            r7 = 0
            int[] r2 = new int[r7]
            r0.u(r1, r2)
            r0 = 1
            int r11 = r11 + r0
            r12 = r16
            goto L_0x03ba
        L_0x0423:
            r7 = 0
            e27[] r0 = new defpackage.e27[r7]
            java.lang.Object[] r0 = r15.toArray(r0)
            e27[] r0 = (defpackage.e27[]) r0
            r10.E0 = r0
            int[][] r0 = new int[r7][]
            java.lang.Object[] r0 = r14.toArray(r0)
            int[][] r0 = (int[][]) r0
            e27[] r0 = r10.E0
            int r0 = r0.length
            r10.C0 = r0
            r0 = r7
        L_0x043c:
            int r1 = r10.G0
            if (r0 >= r1) goto L_0x044b
            e27[] r1 = r10.E0
            r1 = r1[r0]
            j07 r1 = r1.o
            r2 = 1
            r1.m = r2
            int r0 = r0 + r2
            goto L_0x043c
        L_0x044b:
            e27[] r0 = r10.E0
            int r1 = r0.length
            r13 = r7
        L_0x044f:
            if (r13 >= r1) goto L_0x046b
            r2 = r0[r13]
            boolean r3 = r2.M0
            if (r3 != 0) goto L_0x0468
            c38 r3 = new c38
            r3.<init>()
            long r4 = r2.Y0
            r3.a = r4
            d38 r4 = new d38
            r4.<init>(r3)
            r2.k(r4)
        L_0x0468:
            r2 = 1
            int r13 = r13 + r2
            goto L_0x044f
        L_0x046b:
            e27[] r0 = r10.E0
            r10.F0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r07.j(kt8, long):void");
    }

    public final boolean k(d38 d38) {
        if (this.D0 != null) {
            return this.H0.k(d38);
        }
        for (e27 e27 : this.E0) {
            if (!e27.M0) {
                c38 c38 = new c38();
                c38.a = e27.Y0;
                e27.k(new d38(c38));
            }
        }
        return false;
    }

    public final void r() {
        e27[] e27Arr = this.E0;
        int length = e27Arr.length;
        int i = 0;
        while (i < length) {
            e27 e27 = e27Arr[i];
            e27.t();
            if (!e27.c1 || e27.M0) {
                i++;
            } else {
                throw ParserException.a("Loading finished before preparation is complete.", (RuntimeException) null);
            }
        }
    }

    public final long s(long j) {
        e27[] e27Arr = this.F0;
        if (e27Arr.length > 0) {
            boolean D = e27Arr[0].D(j, false);
            int i = 1;
            while (true) {
                e27[] e27Arr2 = this.F0;
                if (i >= e27Arr2.length) {
                    break;
                }
                e27Arr2[i].D(j, D);
                i++;
            }
            if (D) {
                ((SparseArray) this.Y.a).clear();
            }
        }
        return j;
    }

    public final long w() {
        return -9223372036854775807L;
    }

    public final upf x() {
        upf upf = this.D0;
        upf.getClass();
        return upf;
    }

    public final long y() {
        return this.H0.y();
    }

    public final void z(long j, boolean z2) {
        for (e27 e27 : this.F0) {
            if (e27.L0 && !e27.p()) {
                int length = e27.E0.length;
                for (int i = 0; i < length; i++) {
                    e27.E0[i].g(j, z2, e27.W0[i]);
                }
            }
        }
    }
}
