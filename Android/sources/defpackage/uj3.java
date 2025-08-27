package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: uj3  reason: default package */
public final class uj3 extends tj3 {
    public int A0;
    public xy1[] B0;
    public xy1[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final xl0 L0;
    public ArrayList q0 = new ArrayList();
    public final o5h r0;
    public final em4 s0;
    public int t0;
    public l8c u0;
    public boolean v0;
    public final gw7 w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r0v1, types: [o5h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, em4] */
    public uj3() {
        ? obj = new Object();
        obj.a = new ArrayList();
        obj.b = new xl0(0);
        obj.c = this;
        this.r0 = obj;
        ? obj2 = new Object();
        obj2.a = true;
        obj2.b = true;
        obj2.e = new ArrayList();
        new ArrayList();
        obj2.g = null;
        obj2.h = new xl0(0);
        obj2.f = new ArrayList();
        obj2.c = this;
        obj2.d = this;
        this.s0 = obj2;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new gw7();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new xy1[4];
        this.C0 = new xy1[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new xl0(0);
    }

    public static void V(tj3 tj3, l8c l8c, xl0 xl0) {
        int i;
        int i2;
        if (l8c != null) {
            if (tj3.g0 == 8 || (tj3 instanceof iv6) || (tj3 instanceof ii0)) {
                xl0.g = 0;
                xl0.h = 0;
                return;
            }
            int[] iArr = tj3.p0;
            xl0.b = iArr[0];
            xl0.d = iArr[1];
            xl0.e = tj3.q();
            xl0.f = tj3.k();
            xl0.k = false;
            xl0.j = 0;
            boolean z = xl0.b == 3;
            boolean z2 = xl0.d == 3;
            boolean z3 = z && tj3.W > c44.DEFAULT_ASPECT_RATIO;
            boolean z4 = z2 && tj3.W > c44.DEFAULT_ASPECT_RATIO;
            if (z && tj3.t(0) && tj3.r == 0 && !z3) {
                xl0.b = 2;
                if (z2 && tj3.s == 0) {
                    xl0.b = 1;
                }
                z = false;
            }
            if (z2 && tj3.t(1) && tj3.s == 0 && !z4) {
                xl0.d = 2;
                if (z && tj3.r == 0) {
                    xl0.d = 1;
                }
                z2 = false;
            }
            if (tj3.A()) {
                xl0.b = 1;
                z = false;
            }
            if (tj3.B()) {
                xl0.d = 1;
                z2 = false;
            }
            int[] iArr2 = tj3.t;
            if (z3) {
                if (iArr2[0] == 4) {
                    xl0.b = 1;
                } else if (!z2) {
                    if (xl0.d == 1) {
                        i2 = xl0.f;
                    } else {
                        xl0.b = 2;
                        l8c.c(tj3, xl0);
                        i2 = xl0.h;
                    }
                    xl0.b = 1;
                    xl0.e = (int) (tj3.W * ((float) i2));
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    xl0.d = 1;
                } else if (!z) {
                    if (xl0.b == 1) {
                        i = xl0.e;
                    } else {
                        xl0.d = 2;
                        l8c.c(tj3, xl0);
                        i = xl0.g;
                    }
                    xl0.d = 1;
                    if (tj3.X == -1) {
                        xl0.f = (int) (((float) i) / tj3.W);
                    } else {
                        xl0.f = (int) (tj3.W * ((float) i));
                    }
                }
            }
            l8c.c(tj3, xl0);
            tj3.O(xl0.g);
            tj3.L(xl0.h);
            tj3.E = xl0.c;
            tj3.I(xl0.i);
            xl0.j = 0;
        }
    }

    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        X();
    }

    public final void F(g6d g6d) {
        super.F(g6d);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((tj3) this.q0.get(i)).F(g6d);
        }
    }

    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((tj3) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(tj3 tj3, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            xy1[] xy1Arr = this.C0;
            if (i2 >= xy1Arr.length) {
                this.C0 = (xy1[]) Arrays.copyOf(xy1Arr, xy1Arr.length * 2);
            }
            xy1[] xy1Arr2 = this.C0;
            int i3 = this.z0;
            xy1Arr2[i3] = new xy1(tj3, 0, this.v0);
            this.z0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.A0 + 1;
            xy1[] xy1Arr3 = this.B0;
            if (i4 >= xy1Arr3.length) {
                this.B0 = (xy1[]) Arrays.copyOf(xy1Arr3, xy1Arr3.length * 2);
            }
            xy1[] xy1Arr4 = this.B0;
            int i5 = this.A0;
            xy1Arr4[i5] = new xy1(tj3, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(gw7 gw7) {
        boolean W = W(64);
        b(gw7, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            tj3 tj3 = (tj3) this.q0.get(i);
            boolean[] zArr = tj3.S;
            zArr[0] = false;
            zArr[1] = false;
            if (tj3 instanceof ii0) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                tj3 tj32 = (tj3) this.q0.get(i2);
                if (tj32 instanceof ii0) {
                    ii0 ii0 = (ii0) tj32;
                    for (int i3 = 0; i3 < ii0.r0; i3++) {
                        tj3 tj33 = ii0.q0[i3];
                        if (ii0.t0 || tj33.c()) {
                            int i4 = ii0.s0;
                            if (i4 == 0 || i4 == 1) {
                                tj33.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                tj33.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            tj3 tj34 = (tj3) this.q0.get(i5);
            tj34.getClass();
            boolean z2 = tj34 instanceof cs5;
            if (z2 || (tj34 instanceof iv6)) {
                if (z2) {
                    hashSet.add(tj34);
                } else {
                    tj34.b(gw7, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cs5 cs5 = (cs5) ((tj3) it.next());
                int i6 = 0;
                while (true) {
                    if (i6 < cs5.r0) {
                        if (hashSet.contains(cs5.q0[i6])) {
                            cs5.b(gw7, W);
                            hashSet.remove(cs5);
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((tj3) it2.next()).b(gw7, W);
                }
                hashSet.clear();
            }
        }
        if (gw7.p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                tj3 tj35 = (tj3) this.q0.get(i7);
                tj35.getClass();
                if (!(tj35 instanceof cs5) && !(tj35 instanceof iv6)) {
                    hashSet2.add(tj35);
                }
            }
            a(this, gw7, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                tj3 tj36 = (tj3) it3.next();
                ev0.h(this, gw7, tj36);
                tj36.b(gw7, W);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                tj3 tj37 = (tj3) this.q0.get(i8);
                if (tj37 instanceof uj3) {
                    int[] iArr = tj37.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        tj37.M(1);
                    }
                    if (i10 == 2) {
                        tj37.N(1);
                    }
                    tj37.b(gw7, W);
                    if (i9 == 2) {
                        tj37.M(i9);
                    }
                    if (i10 == 2) {
                        tj37.N(i10);
                    }
                } else {
                    ev0.h(this, gw7, tj37);
                    if (!(tj37 instanceof cs5) && !(tj37 instanceof iv6)) {
                        tj37.b(gw7, W);
                    }
                }
            }
        }
        if (this.z0 > 0) {
            bs0.d(this, gw7, (ArrayList) null, 0);
        }
        if (this.A0 > 0) {
            bs0.d(this, gw7, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T(int r13, boolean r14) {
        /*
            r12 = this;
            em4 r12 = r12.s0
            java.lang.Object r0 = r12.c
            uj3 r0 = (defpackage.uj3) r0
            r1 = 0
            int r2 = r0.j(r1)
            r3 = 1
            int r4 = r0.j(r3)
            int r5 = r0.r()
            int r6 = r0.s()
            java.lang.Object r7 = r12.e
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r14 == 0) goto L_0x0073
            r8 = 2
            if (r2 == r8) goto L_0x0023
            if (r4 != r8) goto L_0x0073
        L_0x0023:
            java.util.Iterator r9 = r7.iterator()
        L_0x0027:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x003e
            java.lang.Object r10 = r9.next()
            gng r10 = (defpackage.gng) r10
            int r11 = r10.f
            if (r11 != r13) goto L_0x0027
            boolean r10 = r10.k()
            if (r10 != 0) goto L_0x0027
            r14 = r1
        L_0x003e:
            if (r13 != 0) goto L_0x005a
            if (r14 == 0) goto L_0x0073
            if (r2 != r8) goto L_0x0073
            r0.M(r3)
            int r14 = r12.d(r0, r1)
            r0.O(r14)
            s27 r14 = r0.d
            uo4 r14 = r14.e
            int r8 = r0.q()
            r14.d(r8)
            goto L_0x0073
        L_0x005a:
            if (r14 == 0) goto L_0x0073
            if (r4 != r8) goto L_0x0073
            r0.N(r3)
            int r14 = r12.d(r0, r3)
            r0.L(r14)
            w2g r14 = r0.e
            uo4 r14 = r14.e
            int r8 = r0.k()
            r14.d(r8)
        L_0x0073:
            int[] r14 = r0.p0
            r8 = 4
            if (r13 != 0) goto L_0x0094
            r14 = r14[r1]
            if (r14 == r3) goto L_0x007e
            if (r14 != r8) goto L_0x009b
        L_0x007e:
            int r14 = r0.q()
            int r14 = r14 + r5
            s27 r6 = r0.d
            fm4 r6 = r6.i
            r6.d(r14)
            s27 r6 = r0.d
            uo4 r6 = r6.e
            int r14 = r14 - r5
            r6.d(r14)
        L_0x0092:
            r14 = r3
            goto L_0x00b2
        L_0x0094:
            r14 = r14[r3]
            if (r14 == r3) goto L_0x009d
            if (r14 != r8) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r14 = r1
            goto L_0x00b2
        L_0x009d:
            int r14 = r0.k()
            int r14 = r14 + r6
            w2g r5 = r0.e
            fm4 r5 = r5.i
            r5.d(r14)
            w2g r5 = r0.e
            uo4 r5 = r5.e
            int r14 = r14 - r6
            r5.d(r14)
            goto L_0x0092
        L_0x00b2:
            r12.g()
            java.util.Iterator r12 = r7.iterator()
        L_0x00b9:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r12.next()
            gng r5 = (defpackage.gng) r5
            int r6 = r5.f
            if (r6 == r13) goto L_0x00ca
            goto L_0x00b9
        L_0x00ca:
            tj3 r6 = r5.b
            if (r6 != r0) goto L_0x00d3
            boolean r6 = r5.g
            if (r6 != 0) goto L_0x00d3
            goto L_0x00b9
        L_0x00d3:
            r5.e()
            goto L_0x00b9
        L_0x00d7:
            java.util.Iterator r12 = r7.iterator()
        L_0x00db:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x010c
            java.lang.Object r5 = r12.next()
            gng r5 = (defpackage.gng) r5
            int r6 = r5.f
            if (r6 == r13) goto L_0x00ec
            goto L_0x00db
        L_0x00ec:
            if (r14 != 0) goto L_0x00f3
            tj3 r6 = r5.b
            if (r6 != r0) goto L_0x00f3
            goto L_0x00db
        L_0x00f3:
            fm4 r6 = r5.h
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x00fa
            goto L_0x010d
        L_0x00fa:
            fm4 r6 = r5.i
            boolean r6 = r6.j
            if (r6 != 0) goto L_0x0101
            goto L_0x010d
        L_0x0101:
            boolean r6 = r5 instanceof defpackage.yy1
            if (r6 != 0) goto L_0x00db
            uo4 r5 = r5.e
            boolean r5 = r5.j
            if (r5 != 0) goto L_0x00db
            goto L_0x010d
        L_0x010c:
            r1 = r3
        L_0x010d:
            r0.M(r2)
            r0.N(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.T(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a4, code lost:
        r27 = r0;
        r26 = r3;
        r25 = r7;
        r28 = r8;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0610, code lost:
        r5 = r21;
        r4 = r25;
        r3 = r27;
        r2 = r28;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x061b  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x071a A[SYNTHETIC, Splitter:B:433:0x071a] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0740 A[SYNTHETIC, Splitter:B:440:0x0740] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0773 A[Catch:{ Exception -> 0x0798 }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x079c A[Catch:{ Exception -> 0x0790 }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x07c1  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0825 A[LOOP:34: B:501:0x0823->B:502:0x0825, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x088b  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x08b3  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x08b7  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x08ee  */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x08f2  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x08f3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U() {
        /*
            r31 = this;
            r1 = r31
            r2 = 0
            r1.Y = r2
            r1.Z = r2
            r1.E0 = r2
            r1.F0 = r2
            java.util.ArrayList r0 = r1.q0
            int r3 = r0.size()
            int r0 = r31.q()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r31.k()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.p0
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.t0
            aj3 r10 = r1.J
            aj3 r11 = r1.I
            if (r9 != 0) goto L_0x0255
            int r9 = r1.D0
            boolean r9 = defpackage.ev0.k(r9, r6)
            if (r9 == 0) goto L_0x0255
            l8c r9 = r1.u0
            r14 = r5[r2]
            r15 = r5[r6]
            r31.E()
            java.util.ArrayList r12 = r1.q0
            int r13 = r12.size()
        L_0x0047:
            if (r2 >= r13) goto L_0x0055
            java.lang.Object r18 = r12.get(r2)
            tj3 r18 = (defpackage.tj3) r18
            r18.E()
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0055:
            boolean r2 = r1.v0
            if (r14 != r6) goto L_0x0062
            int r14 = r31.q()
            r6 = 0
            r1.J(r6, r14)
            goto L_0x0068
        L_0x0062:
            r6 = 0
            r11.l(r6)
            r1.Y = r6
        L_0x0068:
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x006c:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r6 >= r13) goto L_0x00d6
            java.lang.Object r21 = r12.get(r6)
            r22 = r11
            r11 = r21
            tj3 r11 = (defpackage.tj3) r11
            r21 = r4
            boolean r4 = r11 instanceof defpackage.iv6
            if (r4 == 0) goto L_0x00bd
            iv6 r11 = (defpackage.iv6) r11
            int r4 = r11.u0
            r23 = r5
            r5 = 1
            if (r4 != r5) goto L_0x00cd
            int r4 = r11.r0
            r5 = -1
            if (r4 == r5) goto L_0x0092
            r11.R(r4)
            goto L_0x00bb
        L_0x0092:
            int r4 = r11.s0
            if (r4 == r5) goto L_0x00a7
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00a7
            int r4 = r31.q()
            int r5 = r11.s0
            int r4 = r4 - r5
            r11.R(r4)
            goto L_0x00bb
        L_0x00a7:
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00bb
            float r4 = r11.q0
            int r5 = r31.q()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r4 = r4 + r20
            int r4 = (int) r4
            r11.R(r4)
        L_0x00bb:
            r14 = 1
            goto L_0x00cd
        L_0x00bd:
            r23 = r5
            boolean r4 = r11 instanceof defpackage.ii0
            if (r4 == 0) goto L_0x00cd
            ii0 r11 = (defpackage.ii0) r11
            int r4 = r11.U()
            if (r4 != 0) goto L_0x00cd
            r19 = 1
        L_0x00cd:
            int r6 = r6 + 1
            r4 = r21
            r11 = r22
            r5 = r23
            goto L_0x006c
        L_0x00d6:
            r21 = r4
            r23 = r5
            r22 = r11
            if (r14 == 0) goto L_0x00fb
            r4 = 0
        L_0x00df:
            if (r4 >= r13) goto L_0x00fb
            java.lang.Object r5 = r12.get(r4)
            tj3 r5 = (defpackage.tj3) r5
            boolean r6 = r5 instanceof defpackage.iv6
            if (r6 == 0) goto L_0x00f7
            iv6 r5 = (defpackage.iv6) r5
            int r6 = r5.u0
            r11 = 1
            if (r6 != r11) goto L_0x00f7
            r6 = 0
            defpackage.fqc.v(r6, r5, r9, r2)
            goto L_0x00f8
        L_0x00f7:
            r6 = 0
        L_0x00f8:
            int r4 = r4 + 1
            goto L_0x00df
        L_0x00fb:
            r6 = 0
            defpackage.fqc.v(r6, r1, r9, r2)
            if (r19 == 0) goto L_0x0125
            r4 = 0
        L_0x0102:
            if (r4 >= r13) goto L_0x0125
            java.lang.Object r5 = r12.get(r4)
            tj3 r5 = (defpackage.tj3) r5
            boolean r6 = r5 instanceof defpackage.ii0
            if (r6 == 0) goto L_0x0121
            ii0 r5 = (defpackage.ii0) r5
            int r6 = r5.U()
            if (r6 != 0) goto L_0x0121
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x0121
            r6 = 1
            defpackage.fqc.v(r6, r5, r9, r2)
            goto L_0x0122
        L_0x0121:
            r6 = 1
        L_0x0122:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x0125:
            r6 = 1
            if (r15 != r6) goto L_0x0131
            int r4 = r31.k()
            r5 = 0
            r1.K(r5, r4)
            goto L_0x0137
        L_0x0131:
            r5 = 0
            r10.l(r5)
            r1.Z = r5
        L_0x0137:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x013a:
            if (r4 >= r13) goto L_0x0191
            java.lang.Object r11 = r12.get(r4)
            tj3 r11 = (defpackage.tj3) r11
            boolean r14 = r11 instanceof defpackage.iv6
            if (r14 == 0) goto L_0x0180
            iv6 r11 = (defpackage.iv6) r11
            int r14 = r11.u0
            if (r14 != 0) goto L_0x018e
            int r5 = r11.r0
            r14 = -1
            if (r5 == r14) goto L_0x0155
            r11.R(r5)
            goto L_0x017e
        L_0x0155:
            int r5 = r11.s0
            if (r5 == r14) goto L_0x016a
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x016a
            int r5 = r31.k()
            int r14 = r11.s0
            int r5 = r5 - r14
            r11.R(r5)
            goto L_0x017e
        L_0x016a:
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x017e
            float r5 = r11.q0
            int r14 = r31.k()
            float r14 = (float) r14
            float r5 = r5 * r14
            float r5 = r5 + r20
            int r5 = (int) r5
            r11.R(r5)
        L_0x017e:
            r5 = 1
            goto L_0x018e
        L_0x0180:
            boolean r14 = r11 instanceof defpackage.ii0
            if (r14 == 0) goto L_0x018e
            ii0 r11 = (defpackage.ii0) r11
            int r11 = r11.U()
            r14 = 1
            if (r11 != r14) goto L_0x018e
            r6 = 1
        L_0x018e:
            int r4 = r4 + 1
            goto L_0x013a
        L_0x0191:
            if (r5 == 0) goto L_0x01ad
            r4 = 0
        L_0x0194:
            if (r4 >= r13) goto L_0x01ad
            java.lang.Object r5 = r12.get(r4)
            tj3 r5 = (defpackage.tj3) r5
            boolean r11 = r5 instanceof defpackage.iv6
            if (r11 == 0) goto L_0x01aa
            iv6 r5 = (defpackage.iv6) r5
            int r11 = r5.u0
            if (r11 != 0) goto L_0x01aa
            r11 = 1
            defpackage.fqc.T(r11, r5, r9)
        L_0x01aa:
            int r4 = r4 + 1
            goto L_0x0194
        L_0x01ad:
            r4 = 0
            defpackage.fqc.T(r4, r1, r9)
            if (r6 == 0) goto L_0x01d5
            r4 = 0
        L_0x01b4:
            if (r4 >= r13) goto L_0x01d5
            java.lang.Object r5 = r12.get(r4)
            tj3 r5 = (defpackage.tj3) r5
            boolean r6 = r5 instanceof defpackage.ii0
            if (r6 == 0) goto L_0x01d2
            ii0 r5 = (defpackage.ii0) r5
            int r6 = r5.U()
            r11 = 1
            if (r6 != r11) goto L_0x01d2
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x01d2
            defpackage.fqc.T(r11, r5, r9)
        L_0x01d2:
            int r4 = r4 + 1
            goto L_0x01b4
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            if (r4 >= r13) goto L_0x020e
            java.lang.Object r5 = r12.get(r4)
            tj3 r5 = (defpackage.tj3) r5
            boolean r6 = r5.z()
            if (r6 == 0) goto L_0x020b
            boolean r6 = defpackage.fqc.d(r5)
            if (r6 == 0) goto L_0x020b
            xl0 r6 = defpackage.fqc.a
            V(r5, r9, r6)
            boolean r6 = r5 instanceof defpackage.iv6
            if (r6 == 0) goto L_0x0204
            r6 = r5
            iv6 r6 = (defpackage.iv6) r6
            int r6 = r6.u0
            if (r6 != 0) goto L_0x01ff
            r6 = 0
            defpackage.fqc.T(r6, r5, r9)
            goto L_0x020b
        L_0x01ff:
            r6 = 0
            defpackage.fqc.v(r6, r5, r9, r2)
            goto L_0x020b
        L_0x0204:
            r6 = 0
            defpackage.fqc.v(r6, r5, r9, r2)
            defpackage.fqc.T(r6, r5, r9)
        L_0x020b:
            int r4 = r4 + 1
            goto L_0x01d6
        L_0x020e:
            r2 = 0
        L_0x020f:
            if (r2 >= r3) goto L_0x025b
            java.util.ArrayList r4 = r1.q0
            java.lang.Object r4 = r4.get(r2)
            tj3 r4 = (defpackage.tj3) r4
            boolean r5 = r4.z()
            if (r5 == 0) goto L_0x0252
            boolean r5 = r4 instanceof defpackage.iv6
            if (r5 != 0) goto L_0x0252
            boolean r5 = r4 instanceof defpackage.ii0
            if (r5 != 0) goto L_0x0252
            boolean r5 = r4 instanceof defpackage.cs5
            if (r5 != 0) goto L_0x0252
            boolean r5 = r4.F
            if (r5 != 0) goto L_0x0252
            r5 = 0
            int r6 = r4.j(r5)
            r5 = 1
            int r9 = r4.j(r5)
            r11 = 3
            if (r6 != r11) goto L_0x0247
            int r6 = r4.r
            if (r6 == r5) goto L_0x0247
            if (r9 != r11) goto L_0x0247
            int r6 = r4.s
            if (r6 == r5) goto L_0x0247
            goto L_0x0252
        L_0x0247:
            xl0 r5 = new xl0
            r6 = 0
            r5.<init>(r6)
            l8c r6 = r1.u0
            V(r4, r6, r5)
        L_0x0252:
            int r2 = r2 + 1
            goto L_0x020f
        L_0x0255:
            r21 = r4
            r23 = r5
            r22 = r11
        L_0x025b:
            gw7 r2 = r1.w0
            r5 = 2
            if (r3 <= r5) goto L_0x0265
            if (r8 == r5) goto L_0x0274
            if (r7 != r5) goto L_0x0265
            goto L_0x0274
        L_0x0265:
            r26 = r3
            r4 = r7
            r24 = r10
            r5 = r21
            r3 = r0
            r30 = r8
            r8 = r2
            r2 = r30
            goto L_0x0657
        L_0x0274:
            int r9 = r1.D0
            r11 = 1024(0x400, float:1.435E-42)
            boolean r9 = defpackage.ev0.k(r9, r11)
            if (r9 == 0) goto L_0x0265
            l8c r9 = r1.u0
            java.util.ArrayList r11 = r1.q0
            int r12 = r11.size()
            r13 = 0
        L_0x0287:
            if (r13 >= r12) goto L_0x02ba
            java.lang.Object r14 = r11.get(r13)
            tj3 r14 = (defpackage.tj3) r14
            r15 = 0
            r6 = r23[r15]
            r18 = 1
            r5 = r23[r18]
            int[] r4 = r14.p0
            r24 = r10
            r10 = r4[r15]
            r4 = r4[r18]
            boolean r4 = defpackage.cvg.R(r6, r5, r10, r4)
            if (r4 != 0) goto L_0x02af
        L_0x02a4:
            r27 = r0
            r26 = r3
            r25 = r7
            r28 = r8
            r8 = r2
            goto L_0x0610
        L_0x02af:
            boolean r4 = r14 instanceof defpackage.cs5
            if (r4 == 0) goto L_0x02b4
            goto L_0x02a4
        L_0x02b4:
            int r13 = r13 + 1
            r10 = r24
            r5 = 2
            goto L_0x0287
        L_0x02ba:
            r24 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02c3:
            if (r4 >= r12) goto L_0x03a4
            java.lang.Object r25 = r11.get(r4)
            r26 = r3
            r3 = r25
            tj3 r3 = (defpackage.tj3) r3
            r25 = r7
            r17 = 0
            r7 = r23[r17]
            r27 = r0
            r18 = 1
            r0 = r23[r18]
            r28 = r8
            int[] r8 = r3.p0
            r29 = r2
            r2 = r8[r17]
            r8 = r8[r18]
            boolean r0 = defpackage.cvg.R(r7, r0, r2, r8)
            if (r0 != 0) goto L_0x02f0
            xl0 r0 = r1.L0
            V(r3, r9, r0)
        L_0x02f0:
            boolean r0 = r3 instanceof defpackage.iv6
            if (r0 == 0) goto L_0x0314
            r2 = r3
            iv6 r2 = (defpackage.iv6) r2
            int r7 = r2.u0
            if (r7 != 0) goto L_0x0305
            if (r10 != 0) goto L_0x0302
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0302:
            r10.add(r2)
        L_0x0305:
            int r7 = r2.u0
            r8 = 1
            if (r7 != r8) goto L_0x0314
            if (r5 != 0) goto L_0x0311
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0311:
            r5.add(r2)
        L_0x0314:
            boolean r2 = r3 instanceof defpackage.cy6
            if (r2 == 0) goto L_0x0358
            boolean r2 = r3 instanceof defpackage.ii0
            if (r2 == 0) goto L_0x0341
            r2 = r3
            ii0 r2 = (defpackage.ii0) r2
            int r7 = r2.U()
            if (r7 != 0) goto L_0x032f
            if (r6 != 0) goto L_0x032c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x032c:
            r6.add(r2)
        L_0x032f:
            int r7 = r2.U()
            r8 = 1
            if (r7 != r8) goto L_0x0358
            if (r13 != 0) goto L_0x033d
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x033d:
            r13.add(r2)
            goto L_0x0358
        L_0x0341:
            r2 = r3
            cy6 r2 = (defpackage.cy6) r2
            if (r6 != 0) goto L_0x034b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x034b:
            r6.add(r2)
            if (r13 != 0) goto L_0x0355
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0355:
            r13.add(r2)
        L_0x0358:
            aj3 r2 = r3.I
            aj3 r2 = r2.f
            if (r2 != 0) goto L_0x0374
            aj3 r2 = r3.K
            aj3 r2 = r2.f
            if (r2 != 0) goto L_0x0374
            if (r0 != 0) goto L_0x0374
            boolean r2 = r3 instanceof defpackage.ii0
            if (r2 != 0) goto L_0x0374
            if (r14 != 0) goto L_0x0371
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0371:
            r14.add(r3)
        L_0x0374:
            aj3 r2 = r3.J
            aj3 r2 = r2.f
            if (r2 != 0) goto L_0x0396
            aj3 r2 = r3.L
            aj3 r2 = r2.f
            if (r2 != 0) goto L_0x0396
            aj3 r2 = r3.M
            aj3 r2 = r2.f
            if (r2 != 0) goto L_0x0396
            if (r0 != 0) goto L_0x0396
            boolean r0 = r3 instanceof defpackage.ii0
            if (r0 != 0) goto L_0x0396
            if (r15 != 0) goto L_0x0393
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0393:
            r15.add(r3)
        L_0x0396:
            int r4 = r4 + 1
            r7 = r25
            r3 = r26
            r0 = r27
            r8 = r28
            r2 = r29
            goto L_0x02c3
        L_0x03a4:
            r27 = r0
            r29 = r2
            r26 = r3
            r25 = r7
            r28 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03cb
            java.util.Iterator r2 = r5.iterator()
        L_0x03b9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cb
            java.lang.Object r3 = r2.next()
            iv6 r3 = (defpackage.iv6) r3
            r4 = 0
            r5 = 0
            defpackage.cvg.t(r3, r4, r0, r5)
            goto L_0x03b9
        L_0x03cb:
            r4 = 0
            r5 = 0
            if (r6 == 0) goto L_0x03ec
            java.util.Iterator r2 = r6.iterator()
        L_0x03d3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ec
            java.lang.Object r3 = r2.next()
            cy6 r3 = (defpackage.cy6) r3
            fng r6 = defpackage.cvg.t(r3, r4, r0, r5)
            r3.R(r4, r6, r0)
            r6.a(r0)
            r4 = 0
            r5 = 0
            goto L_0x03d3
        L_0x03ec:
            r2 = 2
            aj3 r3 = r1.i(r2)
            java.util.HashSet r2 = r3.a
            if (r2 == 0) goto L_0x040d
            java.util.Iterator r2 = r2.iterator()
        L_0x03f9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x040d
            java.lang.Object r3 = r2.next()
            aj3 r3 = (defpackage.aj3) r3
            tj3 r3 = r3.d
            r4 = 0
            r5 = 0
            defpackage.cvg.t(r3, r4, r0, r5)
            goto L_0x03f9
        L_0x040d:
            r2 = 4
            aj3 r2 = r1.i(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L_0x042e
            java.util.Iterator r2 = r2.iterator()
        L_0x041a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x042e
            java.lang.Object r3 = r2.next()
            aj3 r3 = (defpackage.aj3) r3
            tj3 r3 = r3.d
            r4 = 0
            r5 = 0
            defpackage.cvg.t(r3, r4, r0, r5)
            goto L_0x041a
        L_0x042e:
            r2 = 7
            aj3 r3 = r1.i(r2)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x044f
            java.util.Iterator r3 = r3.iterator()
        L_0x043b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x044f
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r4 = r4.d
            r5 = 0
            r6 = 0
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x043b
        L_0x044f:
            r5 = 0
            r6 = 0
            if (r14 == 0) goto L_0x0467
            java.util.Iterator r3 = r14.iterator()
        L_0x0457:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0467
            java.lang.Object r4 = r3.next()
            tj3 r4 = (defpackage.tj3) r4
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x0457
        L_0x0467:
            if (r10 == 0) goto L_0x047e
            java.util.Iterator r3 = r10.iterator()
        L_0x046d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x047e
            java.lang.Object r4 = r3.next()
            iv6 r4 = (defpackage.iv6) r4
            r5 = 1
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x046d
        L_0x047e:
            r5 = 1
            if (r13 == 0) goto L_0x049e
            java.util.Iterator r3 = r13.iterator()
        L_0x0485:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049e
            java.lang.Object r4 = r3.next()
            cy6 r4 = (defpackage.cy6) r4
            fng r7 = defpackage.cvg.t(r4, r5, r0, r6)
            r4.R(r5, r7, r0)
            r7.a(r0)
            r5 = 1
            r6 = 0
            goto L_0x0485
        L_0x049e:
            r3 = 3
            aj3 r4 = r1.i(r3)
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x04bf
            java.util.Iterator r3 = r3.iterator()
        L_0x04ab:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04bf
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r4 = r4.d
            r5 = 1
            r6 = 0
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x04ab
        L_0x04bf:
            r3 = 6
            aj3 r3 = r1.i(r3)
            java.util.HashSet r3 = r3.a
            if (r3 == 0) goto L_0x04e0
            java.util.Iterator r3 = r3.iterator()
        L_0x04cc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r4 = r4.d
            r5 = 1
            r6 = 0
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x04cc
        L_0x04e0:
            r3 = 5
            aj3 r4 = r1.i(r3)
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x0501
            java.util.Iterator r3 = r3.iterator()
        L_0x04ed:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0501
            java.lang.Object r4 = r3.next()
            aj3 r4 = (defpackage.aj3) r4
            tj3 r4 = r4.d
            r5 = 1
            r6 = 0
            defpackage.cvg.t(r4, r5, r0, r6)
            goto L_0x04ed
        L_0x0501:
            aj3 r2 = r1.i(r2)
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L_0x0521
            java.util.Iterator r2 = r2.iterator()
        L_0x050d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0521
            java.lang.Object r3 = r2.next()
            aj3 r3 = (defpackage.aj3) r3
            tj3 r3 = r3.d
            r4 = 1
            r5 = 0
            defpackage.cvg.t(r3, r4, r0, r5)
            goto L_0x050d
        L_0x0521:
            r4 = 1
            r5 = 0
            if (r15 == 0) goto L_0x0539
            java.util.Iterator r2 = r15.iterator()
        L_0x0529:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0539
            java.lang.Object r3 = r2.next()
            tj3 r3 = (defpackage.tj3) r3
            defpackage.cvg.t(r3, r4, r0, r5)
            goto L_0x0529
        L_0x0539:
            r2 = 0
        L_0x053a:
            if (r2 >= r12) goto L_0x0590
            java.lang.Object r3 = r11.get(r2)
            tj3 r3 = (defpackage.tj3) r3
            int[] r4 = r3.p0
            r5 = 0
            r6 = r4[r5]
            r5 = 3
            if (r6 != r5) goto L_0x058d
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x058d
            int r4 = r3.n0
            int r6 = r0.size()
            r7 = 0
        L_0x0556:
            if (r7 >= r6) goto L_0x0566
            java.lang.Object r8 = r0.get(r7)
            fng r8 = (defpackage.fng) r8
            int r9 = r8.b
            if (r4 != r9) goto L_0x0563
            goto L_0x0567
        L_0x0563:
            int r7 = r7 + 1
            goto L_0x0556
        L_0x0566:
            r8 = 0
        L_0x0567:
            int r3 = r3.o0
            int r4 = r0.size()
            r6 = 0
        L_0x056e:
            if (r6 >= r4) goto L_0x057e
            java.lang.Object r7 = r0.get(r6)
            fng r7 = (defpackage.fng) r7
            int r9 = r7.b
            if (r3 != r9) goto L_0x057b
            goto L_0x057f
        L_0x057b:
            int r6 = r6 + 1
            goto L_0x056e
        L_0x057e:
            r7 = 0
        L_0x057f:
            if (r8 == 0) goto L_0x058d
            if (r7 == 0) goto L_0x058d
            r3 = 0
            r8.c(r3, r7)
            r3 = 2
            r7.c = r3
            r0.remove(r8)
        L_0x058d:
            int r2 = r2 + 1
            goto L_0x053a
        L_0x0590:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x059b
            r8 = r29
            goto L_0x0610
        L_0x059b:
            r2 = 0
            r3 = r23[r2]
            r2 = 2
            if (r3 != r2) goto L_0x05d3
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x05a7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05c7
            java.lang.Object r5 = r2.next()
            fng r5 = (defpackage.fng) r5
            int r6 = r5.c
            r7 = 1
            if (r6 != r7) goto L_0x05b9
            goto L_0x05a7
        L_0x05b9:
            r8 = r29
            r6 = 0
            int r9 = r5.b(r8, r6)
            if (r9 <= r3) goto L_0x05c4
            r4 = r5
            r3 = r9
        L_0x05c4:
            r29 = r8
            goto L_0x05a7
        L_0x05c7:
            r8 = r29
            r7 = 1
            if (r4 == 0) goto L_0x05d6
            r1.M(r7)
            r1.O(r3)
            goto L_0x05d7
        L_0x05d3:
            r8 = r29
            r7 = 1
        L_0x05d6:
            r4 = 0
        L_0x05d7:
            r2 = r23[r7]
            r3 = 2
            if (r2 != r3) goto L_0x0607
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05e2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05fd
            java.lang.Object r5 = r0.next()
            fng r5 = (defpackage.fng) r5
            int r6 = r5.c
            if (r6 != 0) goto L_0x05f3
            goto L_0x05e2
        L_0x05f3:
            r6 = 1
            int r7 = r5.b(r8, r6)
            if (r7 <= r2) goto L_0x05e2
            r3 = r5
            r2 = r7
            goto L_0x05e2
        L_0x05fd:
            r6 = 1
            if (r3 == 0) goto L_0x0607
            r1.N(r6)
            r1.L(r2)
            goto L_0x0608
        L_0x0607:
            r3 = 0
        L_0x0608:
            if (r4 != 0) goto L_0x060c
            if (r3 == 0) goto L_0x0610
        L_0x060c:
            r2 = r28
            r3 = 2
            goto L_0x0619
        L_0x0610:
            r5 = r21
            r4 = r25
            r3 = r27
            r2 = r28
            goto L_0x0657
        L_0x0619:
            if (r2 != r3) goto L_0x0634
            int r0 = r31.q()
            r3 = r27
            if (r3 >= r0) goto L_0x062c
            if (r3 <= 0) goto L_0x062c
            r1.O(r3)
            r4 = 1
            r1.E0 = r4
            goto L_0x0636
        L_0x062c:
            int r0 = r31.q()
        L_0x0630:
            r4 = r25
            r3 = 2
            goto L_0x0638
        L_0x0634:
            r3 = r27
        L_0x0636:
            r0 = r3
            goto L_0x0630
        L_0x0638:
            if (r4 != r3) goto L_0x0650
            int r3 = r31.k()
            r5 = r21
            if (r5 >= r3) goto L_0x064b
            if (r5 <= 0) goto L_0x064b
            r1.L(r5)
            r3 = 1
            r1.F0 = r3
            goto L_0x0652
        L_0x064b:
            int r3 = r31.k()
            goto L_0x0653
        L_0x0650:
            r5 = r21
        L_0x0652:
            r3 = r5
        L_0x0653:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0658
        L_0x0657:
            r0 = 0
        L_0x0658:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L_0x066b
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L_0x0669
            goto L_0x066b
        L_0x0669:
            r7 = 0
            goto L_0x066c
        L_0x066b:
            r7 = 1
        L_0x066c:
            r8.getClass()
            r9 = 0
            r8.g = r9
            int r10 = r1.D0
            if (r10 == 0) goto L_0x067c
            if (r7 == 0) goto L_0x067c
            r7 = 1
            r8.g = r7
            goto L_0x067d
        L_0x067c:
            r7 = 1
        L_0x067d:
            java.util.ArrayList r10 = r1.q0
            r11 = r23[r9]
            r12 = 2
            if (r11 == r12) goto L_0x068b
            r11 = r23[r7]
            if (r11 != r12) goto L_0x0689
            goto L_0x068b
        L_0x0689:
            r7 = r9
            goto L_0x068c
        L_0x068b:
            r7 = 1
        L_0x068c:
            r1.z0 = r9
            r1.A0 = r9
            r11 = r26
            r9 = 0
        L_0x0693:
            if (r9 >= r11) goto L_0x06a9
            java.util.ArrayList r12 = r1.q0
            java.lang.Object r12 = r12.get(r9)
            tj3 r12 = (defpackage.tj3) r12
            boolean r13 = r12 instanceof defpackage.uj3
            if (r13 == 0) goto L_0x06a6
            uj3 r12 = (defpackage.uj3) r12
            r12.U()
        L_0x06a6:
            int r9 = r9 + 1
            goto L_0x0693
        L_0x06a9:
            boolean r9 = r1.W(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L_0x06b0:
            if (r13 == 0) goto L_0x08f9
            r14 = 1
            int r15 = r0 + 1
            r8.t()     // Catch:{ Exception -> 0x06d1 }
            r14 = 0
            r1.z0 = r14     // Catch:{ Exception -> 0x06d1 }
            r1.A0 = r14     // Catch:{ Exception -> 0x06d1 }
            r1.g(r8)     // Catch:{ Exception -> 0x06d1 }
            r0 = 0
        L_0x06c1:
            if (r0 >= r11) goto L_0x06d8
            java.util.ArrayList r14 = r1.q0     // Catch:{ Exception -> 0x06d1 }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x06d1 }
            tj3 r14 = (defpackage.tj3) r14     // Catch:{ Exception -> 0x06d1 }
            r14.g(r8)     // Catch:{ Exception -> 0x06d1 }
            int r0 = r0 + 1
            goto L_0x06c1
        L_0x06d1:
            r0 = move-exception
            r21 = r12
            r6 = 0
        L_0x06d5:
            r14 = 5
            goto L_0x07a7
        L_0x06d8:
            r1.S(r8)     // Catch:{ Exception -> 0x06d1 }
            java.lang.ref.WeakReference r0 = r1.G0     // Catch:{ Exception -> 0x07a3 }
            if (r0 == 0) goto L_0x0714
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0710 }
            if (r0 == 0) goto L_0x0714
            java.lang.ref.WeakReference r0 = r1.G0     // Catch:{ Exception -> 0x0710 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0710 }
            aj3 r0 = (defpackage.aj3) r0     // Catch:{ Exception -> 0x0710 }
            r14 = r24
            sfe r13 = r8.k(r14)     // Catch:{ Exception -> 0x070a }
            gw7 r6 = r1.w0     // Catch:{ Exception -> 0x070a }
            sfe r0 = r6.k(r0)     // Catch:{ Exception -> 0x070a }
            r21 = r12
            r24 = r14
            r12 = 5
            r14 = 0
            r6.f(r0, r13, r14, r12)     // Catch:{ Exception -> 0x0706 }
            r6 = 0
            r1.G0 = r6     // Catch:{ Exception -> 0x0706 }
            goto L_0x0716
        L_0x0706:
            r0 = move-exception
        L_0x0707:
            r6 = 0
            r13 = 1
            goto L_0x06d5
        L_0x070a:
            r0 = move-exception
            r21 = r12
            r24 = r14
            goto L_0x0707
        L_0x0710:
            r0 = move-exception
            r21 = r12
            goto L_0x0707
        L_0x0714:
            r21 = r12
        L_0x0716:
            java.lang.ref.WeakReference r0 = r1.I0     // Catch:{ Exception -> 0x0798 }
            if (r0 == 0) goto L_0x073c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0706 }
            if (r0 == 0) goto L_0x073c
            java.lang.ref.WeakReference r0 = r1.I0     // Catch:{ Exception -> 0x0706 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0706 }
            aj3 r0 = (defpackage.aj3) r0     // Catch:{ Exception -> 0x0706 }
            aj3 r6 = r1.L     // Catch:{ Exception -> 0x0706 }
            sfe r6 = r8.k(r6)     // Catch:{ Exception -> 0x0706 }
            gw7 r12 = r1.w0     // Catch:{ Exception -> 0x0706 }
            sfe r0 = r12.k(r0)     // Catch:{ Exception -> 0x0706 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0706 }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0706 }
        L_0x073c:
            java.lang.ref.WeakReference r0 = r1.H0     // Catch:{ Exception -> 0x0798 }
            if (r0 == 0) goto L_0x0769
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0706 }
            if (r0 == 0) goto L_0x0769
            java.lang.ref.WeakReference r0 = r1.H0     // Catch:{ Exception -> 0x0706 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0706 }
            aj3 r0 = (defpackage.aj3) r0     // Catch:{ Exception -> 0x0706 }
            r6 = r22
            sfe r12 = r8.k(r6)     // Catch:{ Exception -> 0x0765 }
            gw7 r13 = r1.w0     // Catch:{ Exception -> 0x0765 }
            sfe r0 = r13.k(r0)     // Catch:{ Exception -> 0x0765 }
            r22 = r6
            r6 = 5
            r14 = 0
            r13.f(r0, r12, r14, r6)     // Catch:{ Exception -> 0x0706 }
            r6 = 0
            r1.H0 = r6     // Catch:{ Exception -> 0x0706 }
            goto L_0x0769
        L_0x0765:
            r0 = move-exception
            r22 = r6
            goto L_0x0707
        L_0x0769:
            java.lang.ref.WeakReference r0 = r1.J0     // Catch:{ Exception -> 0x0798 }
            if (r0 == 0) goto L_0x079c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0798 }
            if (r0 == 0) goto L_0x079c
            java.lang.ref.WeakReference r0 = r1.J0     // Catch:{ Exception -> 0x0798 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0798 }
            aj3 r0 = (defpackage.aj3) r0     // Catch:{ Exception -> 0x0798 }
            aj3 r6 = r1.K     // Catch:{ Exception -> 0x0798 }
            sfe r6 = r8.k(r6)     // Catch:{ Exception -> 0x0798 }
            gw7 r12 = r1.w0     // Catch:{ Exception -> 0x0796 }
            sfe r0 = r12.k(r0)     // Catch:{ Exception -> 0x0796 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0793 }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x0790 }
            goto L_0x079e
        L_0x0790:
            r0 = move-exception
        L_0x0791:
            r13 = 1
            goto L_0x07a7
        L_0x0793:
            r0 = move-exception
            r6 = 0
            goto L_0x0791
        L_0x0796:
            r0 = move-exception
            goto L_0x0799
        L_0x0798:
            r0 = move-exception
        L_0x0799:
            r6 = 0
            r14 = 5
            goto L_0x0791
        L_0x079c:
            r6 = 0
            r14 = 5
        L_0x079e:
            r8.p()     // Catch:{ Exception -> 0x0790 }
            r13 = 1
            goto L_0x07bd
        L_0x07a3:
            r0 = move-exception
            r21 = r12
            goto L_0x0799
        L_0x07a7:
            r0.printStackTrace()
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "EXCEPTION : "
            r6.<init>(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.println(r0)
        L_0x07bd:
            boolean[] r0 = defpackage.ev0.h
            if (r13 == 0) goto L_0x07fe
            r6 = 0
            r12 = 2
            r0[r12] = r6
            r6 = 64
            boolean r12 = r1.W(r6)
            r1.Q(r8, r12)
            java.util.ArrayList r13 = r1.q0
            int r13 = r13.size()
            r14 = 0
            r16 = 0
        L_0x07d7:
            if (r14 >= r13) goto L_0x07fc
            java.util.ArrayList r6 = r1.q0
            java.lang.Object r6 = r6.get(r14)
            tj3 r6 = (defpackage.tj3) r6
            r6.Q(r8, r12)
            r26 = r12
            int r12 = r6.h
            r27 = r13
            r13 = -1
            if (r12 != r13) goto L_0x07f1
            int r6 = r6.i
            if (r6 == r13) goto L_0x07f3
        L_0x07f1:
            r16 = 1
        L_0x07f3:
            int r14 = r14 + 1
            r12 = r26
            r13 = r27
            r6 = 64
            goto L_0x07d7
        L_0x07fc:
            r13 = -1
            goto L_0x0815
        L_0x07fe:
            r13 = -1
            r1.Q(r8, r9)
            r6 = 0
        L_0x0803:
            if (r6 >= r11) goto L_0x0813
            java.util.ArrayList r12 = r1.q0
            java.lang.Object r12 = r12.get(r6)
            tj3 r12 = (defpackage.tj3) r12
            r12.Q(r8, r9)
            int r6 = r6 + 1
            goto L_0x0803
        L_0x0813:
            r16 = 0
        L_0x0815:
            r6 = 8
            if (r7 == 0) goto L_0x087b
            if (r15 >= r6) goto L_0x087b
            r12 = 2
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x087b
            r0 = 0
            r12 = 0
            r14 = 0
        L_0x0823:
            if (r0 >= r11) goto L_0x084a
            java.util.ArrayList r13 = r1.q0
            java.lang.Object r13 = r13.get(r0)
            tj3 r13 = (defpackage.tj3) r13
            int r6 = r13.Y
            int r27 = r13.q()
            int r6 = r27 + r6
            int r12 = java.lang.Math.max(r12, r6)
            int r6 = r13.Z
            int r13 = r13.k()
            int r13 = r13 + r6
            int r14 = java.lang.Math.max(r14, r13)
            int r0 = r0 + 1
            r6 = 8
            r13 = -1
            goto L_0x0823
        L_0x084a:
            int r0 = r1.b0
            int r0 = java.lang.Math.max(r0, r12)
            int r6 = r1.c0
            int r6 = java.lang.Math.max(r6, r14)
            r12 = 2
            if (r2 != r12) goto L_0x0869
            int r13 = r31.q()
            if (r13 >= r0) goto L_0x0869
            r1.O(r0)
            r13 = 0
            r23[r13] = r12
            r16 = 1
            r21 = 1
        L_0x0869:
            if (r4 != r12) goto L_0x087b
            int r0 = r31.k()
            if (r0 >= r6) goto L_0x087b
            r1.L(r6)
            r6 = 1
            r23[r6] = r12
            r16 = 1
            r21 = 1
        L_0x087b:
            int r0 = r1.b0
            int r6 = r31.q()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r31.q()
            if (r0 <= r6) goto L_0x0897
            r1.O(r0)
            r6 = 1
            r12 = 0
            r23[r12] = r6
            r16 = r6
            r18 = r16
            goto L_0x089a
        L_0x0897:
            r6 = 1
            r18 = r21
        L_0x089a:
            int r0 = r1.c0
            int r12 = r31.k()
            int r0 = java.lang.Math.max(r0, r12)
            int r12 = r31.k()
            if (r0 <= r12) goto L_0x08b3
            r1.L(r0)
            r23[r6] = r6
            r0 = r6
            r16 = r0
            goto L_0x08b5
        L_0x08b3:
            r0 = r18
        L_0x08b5:
            if (r0 != 0) goto L_0x08ee
            r12 = 0
            r13 = r23[r12]
            r14 = 2
            if (r13 != r14) goto L_0x08cf
            if (r3 <= 0) goto L_0x08cf
            int r13 = r31.q()
            if (r13 <= r3) goto L_0x08cf
            r1.E0 = r6
            r23[r12] = r6
            r1.O(r3)
            r0 = r6
            r16 = r0
        L_0x08cf:
            r12 = r23[r6]
            r13 = 2
            if (r12 != r13) goto L_0x08e8
            if (r5 <= 0) goto L_0x08e8
            int r12 = r31.k()
            if (r12 <= r5) goto L_0x08e8
            r1.F0 = r6
            r23[r6] = r6
            r1.L(r5)
            r0 = 8
            r6 = 1
            r12 = 1
            goto L_0x08f0
        L_0x08e8:
            r12 = r0
            r6 = r16
            r0 = 8
            goto L_0x08f0
        L_0x08ee:
            r13 = 2
            goto L_0x08e8
        L_0x08f0:
            if (r15 <= r0) goto L_0x08f3
            r6 = 0
        L_0x08f3:
            r13 = r6
            r0 = r15
            r6 = 64
            goto L_0x06b0
        L_0x08f9:
            r21 = r12
            r1.q0 = r10
            if (r21 == 0) goto L_0x0905
            r3 = 0
            r23[r3] = r2
            r2 = 1
            r23[r2] = r4
        L_0x0905:
            g6d r0 = r8.l
            r1.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.U():void");
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    public final void X() {
        this.q0.clear();
        super.C();
    }

    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        Iterator it = this.q0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
