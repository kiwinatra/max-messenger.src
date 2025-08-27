package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: tj3  reason: default package */
public class tj3 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final aj3 I;
    public final aj3 J;
    public final aj3 K;
    public final aj3 L;
    public final aj3 M;
    public final aj3 N;
    public final aj3 O;
    public final aj3 P;
    public final aj3[] Q;
    public final ArrayList R;
    public final boolean[] S;
    public tj3 T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public boolean a = false;
    public int a0;
    public yy1 b;
    public int b0;
    public yy1 c;
    public int c0;
    public s27 d = null;
    public float d0;
    public w2g e = null;
    public float e0;
    public final boolean[] f = {true, true};
    public Object f0;
    public boolean g = true;
    public int g0;
    public int h = -1;
    public String h0;
    public int i = -1;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final tj3[] l0;
    public boolean m;
    public final tj3[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public tj3() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{IntCompanionObject.MAX_VALUE, IntCompanionObject.MAX_VALUE};
        this.D = c44.DEFAULT_ASPECT_RATIO;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        aj3 aj3 = new aj3(this, 2);
        this.I = aj3;
        aj3 aj32 = new aj3(this, 3);
        this.J = aj32;
        aj3 aj33 = new aj3(this, 4);
        this.K = aj33;
        aj3 aj34 = new aj3(this, 5);
        this.L = aj34;
        aj3 aj35 = new aj3(this, 6);
        this.M = aj35;
        aj3 aj36 = new aj3(this, 8);
        this.N = aj36;
        aj3 aj37 = new aj3(this, 9);
        this.O = aj37;
        aj3 aj38 = new aj3(this, 7);
        this.P = aj38;
        aj3 aj39 = aj38;
        this.Q = new aj3[]{aj3, aj33, aj32, aj34, aj35, aj39};
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        this.S = new boolean[2];
        this.p0 = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = c44.DEFAULT_ASPECT_RATIO;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        this.g0 = 0;
        this.h0 = null;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new float[]{-1.0f, -1.0f};
        this.l0 = new tj3[]{null, null};
        this.m0 = new tj3[]{null, null};
        this.n0 = -1;
        this.o0 = -1;
        arrayList.add(aj3);
        arrayList.add(aj32);
        arrayList.add(aj33);
        arrayList.add(aj34);
        arrayList.add(aj36);
        arrayList.add(aj37);
        arrayList.add(aj39);
        arrayList.add(aj35);
    }

    public static void G(StringBuilder sb, int i2, int i3, String str) {
        if (i2 != i3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i2);
            sb.append(",\n");
        }
    }

    public static void H(StringBuilder sb, String str, float f2, float f3) {
        if (f2 != f3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f2);
            sb.append(",\n");
        }
    }

    public static void o(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        G(sb, i2, 0, "      size");
        G(sb, i3, 0, "      min");
        G(sb, i4, IntCompanionObject.MAX_VALUE, "      max");
        G(sb, i5, 0, "      matchMin");
        G(sb, i6, 0, "      matchDef");
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, aj3 aj3) {
        if (aj3.f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(aj3.f);
            sb.append("'");
            if (!(aj3.h == Integer.MIN_VALUE && aj3.g == 0)) {
                sb.append(",");
                sb.append(aj3.g);
                if (aj3.h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(aj3.h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public boolean A() {
        return this.k || (this.I.c && this.K.c);
    }

    public boolean B() {
        return this.l || (this.J.c && this.L.c);
    }

    public void C() {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = null;
        this.D = c44.DEFAULT_ASPECT_RATIO;
        this.U = 0;
        this.V = 0;
        this.W = c44.DEFAULT_ASPECT_RATIO;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.5f;
        this.e0 = 0.5f;
        int[] iArr = this.p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f0 = null;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        float[] fArr = this.k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = IntCompanionObject.MAX_VALUE;
        this.y = IntCompanionObject.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.F = false;
        boolean[] zArr2 = this.S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr3 = this.t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void D() {
        tj3 tj3 = this.T;
        if (tj3 != null && (tj3 instanceof uj3)) {
            ((uj3) tj3).getClass();
        }
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((aj3) arrayList.get(i2)).j();
        }
    }

    public final void E() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList arrayList = this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            aj3 aj3 = (aj3) arrayList.get(i2);
            aj3.c = false;
            aj3.b = 0;
        }
    }

    public void F(g6d g6d) {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
    }

    public final void I(int i2) {
        this.a0 = i2;
        this.E = i2 > 0;
    }

    public final void J(int i2, int i3) {
        if (!this.k) {
            this.I.l(i2);
            this.K.l(i3);
            this.Y = i2;
            this.U = i3 - i2;
            this.k = true;
        }
    }

    public final void K(int i2, int i3) {
        if (!this.l) {
            this.J.l(i2);
            this.L.l(i3);
            this.Z = i2;
            this.V = i3 - i2;
            if (this.E) {
                this.M.l(i2 + this.a0);
            }
            this.l = true;
        }
    }

    public final void L(int i2) {
        this.V = i2;
        int i3 = this.c0;
        if (i2 < i3) {
            this.V = i3;
        }
    }

    public final void M(int i2) {
        this.p0[0] = i2;
    }

    public final void N(int i2) {
        this.p0[1] = i2;
    }

    public final void O(int i2) {
        this.U = i2;
        int i3 = this.b0;
        if (i2 < i3) {
            this.U = i3;
        }
    }

    public void P(boolean z2, boolean z3) {
        int i2;
        int i3;
        s27 s27 = this.d;
        boolean z4 = z2 & s27.g;
        w2g w2g = this.e;
        boolean z5 = z3 & w2g.g;
        int i4 = s27.h.g;
        int i5 = w2g.h.g;
        int i6 = s27.i.g;
        int i7 = w2g.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.Y = i4;
        }
        if (z5) {
            this.Z = i5;
        }
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        if (z4) {
            if (iArr[0] == 1 && i9 < (i3 = this.U)) {
                i9 = i3;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i10 < (i2 = this.V)) {
                i10 = i2;
            }
            this.V = i10;
            int i12 = this.c0;
            if (i10 < i12) {
                this.V = i12;
            }
        }
    }

    public void Q(gw7 gw7, boolean z2) {
        int i2;
        int i3;
        w2g w2g;
        s27 s27;
        aj3 aj3 = this.I;
        gw7.getClass();
        int n2 = gw7.n(aj3);
        int n3 = gw7.n(this.J);
        int n4 = gw7.n(this.K);
        int n5 = gw7.n(this.L);
        if (z2 && (s27 = this.d) != null) {
            fm4 fm4 = s27.h;
            if (fm4.j) {
                fm4 fm42 = s27.i;
                if (fm42.j) {
                    n2 = fm4.g;
                    n4 = fm42.g;
                }
            }
        }
        if (z2 && (w2g = this.e) != null) {
            fm4 fm43 = w2g.h;
            if (fm43.j) {
                fm4 fm44 = w2g.i;
                if (fm44.j) {
                    n3 = fm43.g;
                    n5 = fm44.g;
                }
            }
        }
        int i4 = n5 - n3;
        if (n4 - n2 < 0 || i4 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        int i5 = n4 - n2;
        int i6 = n5 - n3;
        this.Y = n2;
        this.Z = n3;
        if (this.g0 == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.p0;
        int i7 = iArr[0];
        if (i7 == 1 && i5 < (i3 = this.U)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.V)) {
            i6 = i2;
        }
        this.U = i5;
        this.V = i6;
        int i8 = this.c0;
        if (i6 < i8) {
            this.V = i8;
        }
        int i9 = this.b0;
        if (i5 < i9) {
            this.U = i9;
        }
        int i10 = this.v;
        if (i10 > 0 && i7 == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.y;
        if (i11 > 0 && iArr[1] == 3) {
            this.V = Math.min(this.V, i11);
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.h = i12;
        }
        int i13 = this.V;
        if (i6 != i13) {
            this.i = i13;
        }
    }

    public final void a(uj3 uj3, gw7 gw7, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                ev0.h(uj3, gw7, this);
                hashSet.remove(this);
                b(gw7, uj3.W(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet hashSet2 = this.I.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((aj3) it.next()).d.a(uj3, gw7, hashSet, i2, true);
                }
            }
            HashSet hashSet3 = this.K.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((aj3) it2.next()).d.a(uj3, gw7, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.J.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((aj3) it3.next()).d.a(uj3, gw7, hashSet, i2, true);
            }
        }
        HashSet hashSet5 = this.L.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((aj3) it4.next()).d.a(uj3, gw7, hashSet, i2, true);
            }
        }
        HashSet hashSet6 = this.M.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((aj3) it5.next()).d.a(uj3, gw7, hashSet, i2, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v92, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v93, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v94, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06ad  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.gw7 r59, boolean r60) {
        /*
            r58 = this;
            r15 = r58
            r14 = r59
            aj3 r0 = r15.I
            sfe r13 = r14.k(r0)
            aj3 r1 = r15.K
            sfe r12 = r14.k(r1)
            aj3 r2 = r15.J
            sfe r9 = r14.k(r2)
            aj3 r8 = r15.L
            sfe r7 = r14.k(r8)
            aj3 r6 = r15.M
            sfe r5 = r14.k(r6)
            tj3 r3 = r15.T
            r4 = 2
            r11 = 0
            if (r3 == 0) goto L_0x004a
            int[] r3 = r3.p0
            r10 = r3[r11]
            if (r10 != r4) goto L_0x0032
            r10 = 1
            r18 = 1
            goto L_0x0035
        L_0x0032:
            r18 = r11
            r10 = 1
        L_0x0035:
            r3 = r3[r10]
            if (r3 != r4) goto L_0x003b
            r3 = r10
            goto L_0x003c
        L_0x003b:
            r3 = r11
        L_0x003c:
            int r11 = r15.q
            if (r11 == r10) goto L_0x0052
            if (r11 == r4) goto L_0x004f
            r10 = 3
            if (r11 == r10) goto L_0x004a
            r28 = r3
            r29 = r18
            goto L_0x0056
        L_0x004a:
            r28 = 0
        L_0x004c:
            r29 = 0
            goto L_0x0056
        L_0x004f:
            r28 = r3
            goto L_0x004c
        L_0x0052:
            r29 = r18
            r28 = 0
        L_0x0056:
            int r3 = r15.g0
            boolean[] r10 = r15.S
            r11 = 8
            if (r3 != r11) goto L_0x008d
            java.util.ArrayList r3 = r15.R
            int r4 = r3.size()
            r11 = 0
        L_0x0065:
            if (r11 >= r4) goto L_0x0082
            java.lang.Object r21 = r3.get(r11)
            r22 = r3
            r3 = r21
            aj3 r3 = (defpackage.aj3) r3
            java.util.HashSet r3 = r3.a
            if (r3 != 0) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007d
            goto L_0x008d
        L_0x007d:
            int r11 = r11 + 1
            r3 = r22
            goto L_0x0065
        L_0x0082:
            r3 = 0
            boolean r4 = r10[r3]
            if (r4 != 0) goto L_0x008d
            r3 = 1
            boolean r4 = r10[r3]
            if (r4 != 0) goto L_0x008d
            return
        L_0x008d:
            boolean r3 = r15.k
            if (r3 != 0) goto L_0x0095
            boolean r4 = r15.l
            if (r4 == 0) goto L_0x0172
        L_0x0095:
            if (r3 == 0) goto L_0x00f2
            int r3 = r15.Y
            r14.d(r13, r3)
            int r3 = r15.Y
            int r4 = r15.U
            int r3 = r3 + r4
            r14.d(r12, r3)
            if (r29 == 0) goto L_0x00f2
            tj3 r3 = r15.T
            if (r3 == 0) goto L_0x00f2
            uj3 r3 = (defpackage.uj3) r3
            java.lang.ref.WeakReference r4 = r3.H0
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x00c8
            int r4 = r0.d()
            java.lang.ref.WeakReference r11 = r3.H0
            java.lang.Object r11 = r11.get()
            aj3 r11 = (defpackage.aj3) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x00cf
        L_0x00c8:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.H0 = r4
        L_0x00cf:
            java.lang.ref.WeakReference r4 = r3.J0
            if (r4 == 0) goto L_0x00eb
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x00eb
            int r4 = r1.d()
            java.lang.ref.WeakReference r11 = r3.J0
            java.lang.Object r11 = r11.get()
            aj3 r11 = (defpackage.aj3) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x00f2
        L_0x00eb:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            r3.J0 = r4
        L_0x00f2:
            boolean r3 = r15.l
            if (r3 == 0) goto L_0x0164
            int r3 = r15.Z
            r14.d(r9, r3)
            int r3 = r15.Z
            int r4 = r15.V
            int r3 = r3 + r4
            r14.d(r7, r3)
            java.util.HashSet r3 = r6.a
            if (r3 != 0) goto L_0x0108
            goto L_0x0116
        L_0x0108:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0116
            int r3 = r15.Z
            int r4 = r15.a0
            int r3 = r3 + r4
            r14.d(r5, r3)
        L_0x0116:
            if (r28 == 0) goto L_0x0164
            tj3 r3 = r15.T
            if (r3 == 0) goto L_0x0164
            uj3 r3 = (defpackage.uj3) r3
            java.lang.ref.WeakReference r4 = r3.G0
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x013a
            int r4 = r2.d()
            java.lang.ref.WeakReference r11 = r3.G0
            java.lang.Object r11 = r11.get()
            aj3 r11 = (defpackage.aj3) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x0141
        L_0x013a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.G0 = r4
        L_0x0141:
            java.lang.ref.WeakReference r4 = r3.I0
            if (r4 == 0) goto L_0x015d
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x015d
            int r4 = r8.d()
            java.lang.ref.WeakReference r11 = r3.I0
            java.lang.Object r11 = r11.get()
            aj3 r11 = (defpackage.aj3) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x0164
        L_0x015d:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r8)
            r3.I0 = r4
        L_0x0164:
            boolean r3 = r15.k
            if (r3 == 0) goto L_0x0172
            boolean r3 = r15.l
            if (r3 == 0) goto L_0x0172
            r3 = 0
            r15.k = r3
            r15.l = r3
            return
        L_0x0172:
            boolean[] r4 = r15.f
            if (r60 == 0) goto L_0x0205
            s27 r3 = r15.d
            if (r3 == 0) goto L_0x0205
            w2g r11 = r15.e
            if (r11 == 0) goto L_0x0205
            r21 = r10
            fm4 r10 = r3.h
            r22 = r6
            boolean r6 = r10.j
            if (r6 == 0) goto L_0x0203
            fm4 r3 = r3.i
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x0203
            fm4 r3 = r11.h
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x0203
            fm4 r3 = r11.i
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x0203
            int r0 = r10.g
            r14.d(r13, r0)
            s27 r0 = r15.d
            fm4 r0 = r0.i
            int r0 = r0.g
            r14.d(r12, r0)
            w2g r0 = r15.e
            fm4 r0 = r0.h
            int r0 = r0.g
            r14.d(r9, r0)
            w2g r0 = r15.e
            fm4 r0 = r0.i
            int r0 = r0.g
            r14.d(r7, r0)
            w2g r0 = r15.e
            fm4 r0 = r0.k
            int r0 = r0.g
            r14.d(r5, r0)
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x01fd
            if (r29 == 0) goto L_0x01e1
            r0 = 0
            boolean r1 = r4[r0]
            if (r1 == 0) goto L_0x01e1
            boolean r1 = r58.x()
            if (r1 != 0) goto L_0x01e1
            tj3 r1 = r15.T
            aj3 r1 = r1.K
            sfe r1 = r14.k(r1)
            r2 = 8
            r14.f(r1, r12, r0, r2)
        L_0x01e1:
            if (r28 == 0) goto L_0x01fd
            r0 = 1
            boolean r0 = r4[r0]
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r58.y()
            if (r0 != 0) goto L_0x01fd
            tj3 r0 = r15.T
            aj3 r0 = r0.L
            sfe r0 = r14.k(r0)
            r1 = 8
            r3 = 0
            r14.f(r0, r7, r3, r1)
            goto L_0x01fe
        L_0x01fd:
            r3 = 0
        L_0x01fe:
            r15.k = r3
            r15.l = r3
            return
        L_0x0203:
            r3 = 0
            goto L_0x020a
        L_0x0205:
            r22 = r6
            r21 = r10
            goto L_0x0203
        L_0x020a:
            tj3 r6 = r15.T
            if (r6 == 0) goto L_0x0280
            boolean r6 = r15.w(r3)
            if (r6 == 0) goto L_0x021e
            tj3 r6 = r15.T
            uj3 r6 = (defpackage.uj3) r6
            r6.R(r15, r3)
            r3 = 1
        L_0x021c:
            r6 = 1
            goto L_0x0223
        L_0x021e:
            boolean r3 = r58.x()
            goto L_0x021c
        L_0x0223:
            boolean r10 = r15.w(r6)
            if (r10 == 0) goto L_0x0232
            tj3 r10 = r15.T
            uj3 r10 = (defpackage.uj3) r10
            r10.R(r15, r6)
            r6 = 1
            goto L_0x0236
        L_0x0232:
            boolean r6 = r58.y()
        L_0x0236:
            if (r3 != 0) goto L_0x0258
            if (r29 == 0) goto L_0x0258
            int r10 = r15.g0
            r11 = 8
            if (r10 == r11) goto L_0x0258
            aj3 r10 = r0.f
            if (r10 != 0) goto L_0x0258
            aj3 r10 = r1.f
            if (r10 != 0) goto L_0x0258
            tj3 r10 = r15.T
            aj3 r10 = r10.K
            sfe r10 = r14.k(r10)
            r23 = r3
            r3 = 0
            r11 = 1
            r14.f(r10, r12, r3, r11)
            goto L_0x025a
        L_0x0258:
            r23 = r3
        L_0x025a:
            if (r6 != 0) goto L_0x027b
            if (r28 == 0) goto L_0x027b
            int r3 = r15.g0
            r10 = 8
            if (r3 == r10) goto L_0x027b
            aj3 r3 = r2.f
            if (r3 != 0) goto L_0x027b
            aj3 r3 = r8.f
            if (r3 != 0) goto L_0x027b
            if (r22 != 0) goto L_0x027b
            tj3 r3 = r15.T
            aj3 r3 = r3.L
            sfe r3 = r14.k(r3)
            r10 = 1
            r11 = 0
            r14.f(r3, r7, r11, r10)
        L_0x027b:
            r30 = r6
            r31 = r23
            goto L_0x0284
        L_0x0280:
            r30 = 0
            r31 = 0
        L_0x0284:
            int r3 = r15.U
            int r6 = r15.b0
            if (r3 >= r6) goto L_0x028b
            goto L_0x028c
        L_0x028b:
            r6 = r3
        L_0x028c:
            int r10 = r15.V
            int r11 = r15.c0
            r23 = r9
            if (r10 >= r11) goto L_0x0295
            goto L_0x0296
        L_0x0295:
            r11 = r10
        L_0x0296:
            int[] r9 = r15.p0
            r27 = r5
            r19 = 0
            r5 = r9[r19]
            r24 = r6
            r6 = 3
            r32 = r7
            r16 = 1
            if (r5 == r6) goto L_0x02aa
            r25 = 1
            goto L_0x02ac
        L_0x02aa:
            r25 = 0
        L_0x02ac:
            r7 = r9[r16]
            r26 = r11
            if (r7 == r6) goto L_0x02b4
            r6 = 1
            goto L_0x02b5
        L_0x02b4:
            r6 = 0
        L_0x02b5:
            int r11 = r15.X
            r15.A = r11
            r33 = r4
            float r4 = r15.W
            r15.B = r4
            r34 = r12
            int r12 = r15.r
            r35 = r13
            int r13 = r15.s
            r36 = 0
            int r36 = (r4 > r36 ? 1 : (r4 == r36 ? 0 : -1))
            if (r36 <= 0) goto L_0x03eb
            int r14 = r15.g0
            r39 = r9
            r9 = 8
            if (r14 == r9) goto L_0x03e8
            r9 = 3
            if (r5 != r9) goto L_0x02db
            if (r12 != 0) goto L_0x02db
            r12 = r9
        L_0x02db:
            if (r7 != r9) goto L_0x02e0
            if (r13 != 0) goto L_0x02e0
            r13 = r9
        L_0x02e0:
            if (r5 != r9) goto L_0x0395
            if (r7 != r9) goto L_0x0395
            if (r12 != r9) goto L_0x0395
            if (r13 != r9) goto L_0x0395
            r9 = -1
            if (r11 != r9) goto L_0x0302
            if (r25 == 0) goto L_0x02f3
            if (r6 != 0) goto L_0x02f3
            r3 = 0
            r15.A = r3
            goto L_0x0302
        L_0x02f3:
            if (r25 != 0) goto L_0x0302
            if (r6 == 0) goto L_0x0302
            r3 = 1
            r15.A = r3
            if (r11 != r9) goto L_0x0302
            r3 = 1065353216(0x3f800000, float:1.0)
            float r14 = r3 / r4
            r15.B = r14
        L_0x0302:
            int r3 = r15.A
            if (r3 != 0) goto L_0x0314
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0312
            boolean r3 = r8.h()
            if (r3 != 0) goto L_0x0314
        L_0x0312:
            r3 = 1
            goto L_0x0316
        L_0x0314:
            r3 = 1
            goto L_0x0319
        L_0x0316:
            r15.A = r3
            goto L_0x032c
        L_0x0319:
            int r4 = r15.A
            if (r4 != r3) goto L_0x032c
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x0329
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x032c
        L_0x0329:
            r3 = 0
            r15.A = r3
        L_0x032c:
            int r3 = r15.A
            r4 = -1
            if (r3 != r4) goto L_0x0370
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x0370
        L_0x0349:
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0359
            boolean r2 = r8.h()
            if (r2 == 0) goto L_0x0359
            r2 = 0
            r15.A = r2
            goto L_0x0370
        L_0x0359:
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0370
            boolean r0 = r1.h()
            if (r0 == 0) goto L_0x0370
            float r0 = r15.B
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.B = r14
            r0 = 1
            r15.A = r0
        L_0x0370:
            int r0 = r15.A
            r1 = -1
            if (r0 != r1) goto L_0x0392
            int r0 = r15.u
            if (r0 <= 0) goto L_0x0381
            int r1 = r15.x
            if (r1 != 0) goto L_0x0381
            r1 = 0
            r15.A = r1
            goto L_0x0392
        L_0x0381:
            if (r0 != 0) goto L_0x0392
            int r0 = r15.x
            if (r0 <= 0) goto L_0x0392
            float r0 = r15.B
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.B = r14
            r0 = 1
            r15.A = r0
        L_0x0392:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03df
        L_0x0395:
            r0 = r9
            if (r5 != r0) goto L_0x03b8
            if (r12 != r0) goto L_0x03b8
            r1 = 0
            r15.A = r1
            float r1 = (float) r10
            float r4 = r4 * r1
            int r6 = (int) r4
            if (r7 == r0) goto L_0x03ad
            r41 = r13
            r40 = r26
            r14 = 1065353216(0x3f800000, float:1.0)
            r38 = 0
            r42 = 4
            goto L_0x03f8
        L_0x03ad:
            r42 = r12
            r41 = r13
            r40 = r26
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x03b5:
            r38 = 1
            goto L_0x03f8
        L_0x03b8:
            if (r7 != r0) goto L_0x0392
            if (r13 != r0) goto L_0x0392
            r1 = 1
            r15.A = r1
            r1 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r11 != r1) goto L_0x03c8
            float r1 = r14 / r4
            r15.B = r1
        L_0x03c8:
            float r1 = r15.B
            float r2 = (float) r3
            float r1 = r1 * r2
            int r11 = (int) r1
            r40 = r11
            r42 = r12
            if (r5 == r0) goto L_0x03da
            r6 = r24
            r38 = 0
            r41 = 4
            goto L_0x03f8
        L_0x03da:
            r41 = r13
            r6 = r24
            goto L_0x03b5
        L_0x03df:
            r42 = r12
            r41 = r13
            r6 = r24
            r40 = r26
            goto L_0x03b5
        L_0x03e8:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ee
        L_0x03eb:
            r39 = r9
            goto L_0x03e8
        L_0x03ee:
            r42 = r12
            r41 = r13
            r6 = r24
            r40 = r26
            r38 = 0
        L_0x03f8:
            int[] r0 = r15.t
            r1 = 0
            r0[r1] = r42
            r1 = 1
            r0[r1] = r41
            if (r38 == 0) goto L_0x040c
            int r0 = r15.A
            r1 = -1
            if (r0 == 0) goto L_0x0409
            if (r0 != r1) goto L_0x040d
        L_0x0409:
            r36 = 1
            goto L_0x040f
        L_0x040c:
            r1 = -1
        L_0x040d:
            r36 = 0
        L_0x040f:
            if (r38 == 0) goto L_0x041c
            int r0 = r15.A
            r2 = 1
            if (r0 == r2) goto L_0x0418
            if (r0 != r1) goto L_0x041c
        L_0x0418:
            r0 = 0
            r43 = 1
            goto L_0x041f
        L_0x041c:
            r0 = 0
            r43 = 0
        L_0x041f:
            r1 = r39[r0]
            r0 = 2
            if (r1 != r0) goto L_0x042a
            boolean r0 = r15 instanceof defpackage.uj3
            if (r0 == 0) goto L_0x042a
            r9 = 1
            goto L_0x042b
        L_0x042a:
            r9 = 0
        L_0x042b:
            if (r9 == 0) goto L_0x042f
            r13 = 0
            goto L_0x0430
        L_0x042f:
            r13 = r6
        L_0x0430:
            aj3 r12 = r15.P
            boolean r0 = r12.h()
            r1 = 1
            r44 = r0 ^ 1
            r0 = 0
            boolean r45 = r21[r0]
            boolean r46 = r21[r1]
            int r0 = r15.o
            int[] r7 = r15.C
            r47 = 0
            r4 = 2
            if (r0 == r4) goto L_0x04b2
            boolean r0 = r15.k
            if (r0 != 0) goto L_0x04b2
            if (r60 == 0) goto L_0x045d
            s27 r0 = r15.d
            if (r0 == 0) goto L_0x045d
            fm4 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x045d
            fm4 r0 = r0.i
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x0467
        L_0x045d:
            r6 = r59
            r1 = r34
            r5 = r35
            r3 = 4
            r11 = 8
            goto L_0x04c3
        L_0x0467:
            if (r60 == 0) goto L_0x04b0
            int r0 = r1.g
            r6 = r59
            r5 = r35
            r3 = 4
            r6.d(r5, r0)
            s27 r0 = r15.d
            fm4 r0 = r0.i
            int r0 = r0.g
            r1 = r34
            r6.d(r1, r0)
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x049c
            if (r29 == 0) goto L_0x049c
            r0 = 0
            boolean r2 = r33[r0]
            if (r2 == 0) goto L_0x049c
            boolean r2 = r58.x()
            if (r2 != 0) goto L_0x049c
            tj3 r2 = r15.T
            aj3 r2 = r2.K
            sfe r2 = r6.k(r2)
            r11 = 8
            r6.f(r2, r1, r0, r11)
        L_0x049c:
            r54 = r1
            r55 = r5
            r52 = r8
            r37 = r12
            r50 = r22
            r53 = r23
            r49 = r27
            r51 = r32
        L_0x04ac:
            r32 = r7
            goto L_0x0559
        L_0x04b0:
            r6 = r59
        L_0x04b2:
            r52 = r8
            r37 = r12
            r50 = r22
            r53 = r23
            r49 = r27
            r51 = r32
            r54 = r34
            r55 = r35
            goto L_0x04ac
        L_0x04c3:
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x04d0
            aj3 r0 = r0.K
            sfe r0 = r6.k(r0)
            r18 = r0
            goto L_0x04d2
        L_0x04d0:
            r18 = r47
        L_0x04d2:
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x04e0
            aj3 r0 = r0.I
            sfe r0 = r6.k(r0)
            r19 = r0
        L_0x04de:
            r0 = 0
            goto L_0x04e3
        L_0x04e0:
            r19 = r47
            goto L_0x04de
        L_0x04e3:
            boolean r20 = r33[r0]
            r21 = r39[r0]
            int r2 = r15.Y
            int r10 = r15.b0
            r34 = r7[r0]
            r35 = r2
            float r2 = r15.d0
            r17 = 1
            r0 = r39[r17]
            r3 = 3
            if (r0 != r3) goto L_0x04fb
            r48 = r17
            goto L_0x04fd
        L_0x04fb:
            r48 = 0
        L_0x04fd:
            int r0 = r15.u
            r24 = r0
            int r0 = r15.v
            r25 = r0
            float r0 = r15.w
            r26 = r0
            aj3 r0 = r15.I
            r16 = r10
            r10 = r0
            aj3 r0 = r15.K
            r3 = 0
            r11 = r0
            r0 = 1
            r17 = r35
            r35 = r2
            r2 = r0
            r0 = r58
            r37 = r1
            r1 = r59
            r3 = r29
            r4 = r28
            r49 = r27
            r27 = r5
            r5 = r20
            r50 = r22
            r6 = r19
            r51 = r32
            r32 = r7
            r7 = r18
            r52 = r8
            r8 = r21
            r53 = r23
            r54 = r37
            r37 = r12
            r12 = r17
            r55 = r27
            r14 = r16
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r48
            r19 = r31
            r20 = r30
            r21 = r45
            r22 = r42
            r23 = r41
            r27 = r44
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0559:
            if (r60 == 0) goto L_0x05bd
            r15 = r58
            w2g r0 = r15.e
            if (r0 == 0) goto L_0x05b0
            fm4 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x05b0
            fm4 r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x05b0
            int r0 = r1.g
            r14 = r59
            r13 = r53
            r14.d(r13, r0)
            w2g r0 = r15.e
            fm4 r0 = r0.i
            int r0 = r0.g
            r12 = r51
            r14.d(r12, r0)
            w2g r0 = r15.e
            fm4 r0 = r0.k
            int r0 = r0.g
            r1 = r49
            r14.d(r1, r0)
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x05aa
            if (r30 != 0) goto L_0x05aa
            if (r28 == 0) goto L_0x05aa
            r9 = 1
            boolean r2 = r33[r9]
            if (r2 == 0) goto L_0x05a6
            aj3 r0 = r0.L
            sfe r0 = r14.k(r0)
            r2 = 8
            r8 = 0
            r14.f(r0, r12, r8, r2)
            goto L_0x05ae
        L_0x05a6:
            r2 = 8
            r8 = 0
            goto L_0x05ae
        L_0x05aa:
            r2 = 8
            r8 = 0
            r9 = 1
        L_0x05ae:
            r10 = r8
            goto L_0x05cc
        L_0x05b0:
            r14 = r59
            r1 = r49
            r12 = r51
            r13 = r53
            r2 = 8
            r8 = 0
            r9 = 1
            goto L_0x05cb
        L_0x05bd:
            r2 = 8
            r8 = 0
            r9 = 1
            r15 = r58
            r14 = r59
            r1 = r49
            r12 = r51
            r13 = r53
        L_0x05cb:
            r10 = r9
        L_0x05cc:
            int r0 = r15.p
            r7 = 2
            if (r0 != r7) goto L_0x05d3
            r11 = r8
            goto L_0x05d4
        L_0x05d3:
            r11 = r10
        L_0x05d4:
            r6 = 5
            if (r11 == 0) goto L_0x06a5
            boolean r0 = r15.l
            if (r0 != 0) goto L_0x06a5
            r0 = r39[r9]
            if (r0 != r7) goto L_0x05e6
            boolean r0 = r15 instanceof defpackage.uj3
            if (r0 == 0) goto L_0x05e6
            r16 = r9
            goto L_0x05e8
        L_0x05e6:
            r16 = r8
        L_0x05e8:
            if (r16 == 0) goto L_0x05ec
            r40 = r8
        L_0x05ec:
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x05f8
            aj3 r0 = r0.L
            sfe r0 = r14.k(r0)
            r5 = r0
            goto L_0x05fa
        L_0x05f8:
            r5 = r47
        L_0x05fa:
            tj3 r0 = r15.T
            if (r0 == 0) goto L_0x0606
            aj3 r0 = r0.J
            sfe r0 = r14.k(r0)
            r47 = r0
        L_0x0606:
            int r0 = r15.a0
            if (r0 > 0) goto L_0x060e
            int r3 = r15.g0
            if (r3 != r2) goto L_0x0641
        L_0x060e:
            r3 = r50
            aj3 r4 = r3.f
            if (r4 == 0) goto L_0x0632
            r14.e(r1, r13, r0, r2)
            aj3 r0 = r3.f
            sfe r0 = r14.k(r0)
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x062f
            r0 = r52
            sfe r0 = r14.k(r0)
            r14.f(r5, r0, r8, r6)
        L_0x062f:
            r27 = r8
            goto L_0x0643
        L_0x0632:
            int r4 = r15.g0
            if (r4 != r2) goto L_0x063e
            int r0 = r3.e()
            r14.e(r1, r13, r0, r2)
            goto L_0x0641
        L_0x063e:
            r14.e(r1, r13, r0, r2)
        L_0x0641:
            r27 = r44
        L_0x0643:
            boolean r17 = r33[r9]
            r18 = r39[r9]
            int r4 = r15.Z
            int r3 = r15.c0
            r19 = r32[r9]
            float r1 = r15.e0
            r0 = r39[r8]
            r2 = 3
            if (r0 != r2) goto L_0x0657
            r20 = r9
            goto L_0x0659
        L_0x0657:
            r20 = r8
        L_0x0659:
            int r0 = r15.x
            r24 = r0
            int r0 = r15.y
            r25 = r0
            float r0 = r15.z
            r26 = r0
            aj3 r10 = r15.J
            aj3 r11 = r15.L
            r0 = 0
            r2 = r0
            r0 = r58
            r21 = r1
            r1 = r59
            r22 = r3
            r3 = r28
            r23 = r4
            r4 = r29
            r28 = r5
            r5 = r17
            r6 = r47
            r7 = r28
            r8 = r18
            r9 = r16
            r56 = r12
            r12 = r23
            r57 = r13
            r13 = r40
            r14 = r22
            r15 = r19
            r16 = r21
            r17 = r43
            r18 = r20
            r19 = r30
            r20 = r31
            r21 = r46
            r22 = r41
            r23 = r42
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06a9
        L_0x06a5:
            r56 = r12
            r57 = r13
        L_0x06a9:
            r0 = r58
            if (r38 == 0) goto L_0x070a
            int r1 = r0.A
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x06df
            float r1 = r0.B
            vs r3 = r59.l()
            ls r4 = r3.d
            r5 = r56
            r4.j(r5, r2)
            ls r2 = r3.d
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.j(r4, r6)
            ls r2 = r3.d
            r7 = r54
            r2.j(r7, r1)
            ls r2 = r3.d
            float r1 = -r1
            r8 = r55
            r2.j(r8, r1)
            r1 = r59
            r1.c(r3)
            goto L_0x070c
        L_0x06df:
            r1 = r59
            r7 = r54
            r8 = r55
            r5 = r56
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.B
            vs r9 = r59.l()
            ls r10 = r9.d
            r10.j(r7, r2)
            ls r2 = r9.d
            r2.j(r8, r6)
            ls r2 = r9.d
            r2.j(r5, r3)
            ls r2 = r9.d
            float r3 = -r3
            r2.j(r4, r3)
            r1.c(r9)
            goto L_0x070c
        L_0x070a:
            r1 = r59
        L_0x070c:
            boolean r2 = r37.h()
            if (r2 == 0) goto L_0x07c4
            r2 = r37
            aj3 r3 = r2.f
            tj3 r3 = r3.d
            float r4 = r0.D
            r5 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            int r2 = r2.e()
            r5 = 2
            aj3 r6 = r0.i(r5)
            sfe r6 = r1.k(r6)
            r7 = 3
            aj3 r8 = r0.i(r7)
            sfe r8 = r1.k(r8)
            r9 = 4
            aj3 r10 = r0.i(r9)
            sfe r10 = r1.k(r10)
            r11 = 5
            aj3 r12 = r0.i(r11)
            sfe r12 = r1.k(r12)
            aj3 r5 = r3.i(r5)
            sfe r5 = r1.k(r5)
            aj3 r7 = r3.i(r7)
            sfe r7 = r1.k(r7)
            aj3 r9 = r3.i(r9)
            sfe r9 = r1.k(r9)
            aj3 r3 = r3.i(r11)
            sfe r3 = r1.k(r3)
            vs r11 = r59.l()
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r9
            r60 = r10
            double r9 = (double) r2
            r17 = r4
            r2 = r5
            double r4 = r15 * r9
            float r4 = (float) r4
            ls r5 = r11.d
            r15 = 1056964608(0x3f000000, float:0.5)
            r5.j(r7, r15)
            ls r5 = r11.d
            r5.j(r3, r15)
            ls r3 = r11.d
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.j(r8, r5)
            ls r3 = r11.d
            r3.j(r12, r5)
            float r3 = -r4
            r11.b = r3
            r1.c(r11)
            vs r3 = r59.l()
            double r7 = java.lang.Math.cos(r13)
            double r7 = r7 * r9
            float r4 = (float) r7
            ls r7 = r3.d
            r7.j(r2, r15)
            ls r2 = r3.d
            r7 = r17
            r2.j(r7, r15)
            ls r2 = r3.d
            r2.j(r6, r5)
            ls r2 = r3.d
            r6 = r60
            r2.j(r6, r5)
            float r2 = -r4
            r3.b = r2
            r1.c(r3)
        L_0x07c4:
            r1 = 0
            r0.k = r1
            r0.l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.b(gw7, boolean):void");
    }

    public boolean c() {
        return this.g0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x046f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:342:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:346:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.gw7 r31, boolean r32, boolean r33, boolean r34, boolean r35, defpackage.sfe r36, defpackage.sfe r37, int r38, boolean r39, defpackage.aj3 r40, defpackage.aj3 r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            r30 = this;
            r0 = r30
            r10 = r31
            r11 = r36
            r12 = r37
            r13 = r40
            r14 = r41
            r15 = r44
            r1 = r45
            r2 = r53
            r3 = r54
            r4 = r55
            r5 = r56
            sfe r9 = r10.k(r13)
            sfe r8 = r10.k(r14)
            aj3 r6 = r13.f
            sfe r7 = r10.k(r6)
            aj3 r6 = r14.f
            sfe r6 = r10.k(r6)
            boolean r16 = r40.h()
            boolean r17 = r41.h()
            aj3 r12 = r0.P
            boolean r12 = r12.h()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r47 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r52
        L_0x004d:
            int r11 = defpackage.tr1.y(r38)
            r19 = r6
            r6 = 1
            if (r11 == 0) goto L_0x005b
            if (r11 == r6) goto L_0x005b
            r6 = 2
            if (r11 == r6) goto L_0x005d
        L_0x005b:
            r6 = 0
            goto L_0x0061
        L_0x005d:
            r6 = 4
            if (r14 == r6) goto L_0x005b
            r6 = 1
        L_0x0061:
            int r11 = r0.h
            r5 = -1
            if (r11 == r5) goto L_0x006d
            if (r32 == 0) goto L_0x006d
            r0.h = r5
            r43 = 0
            goto L_0x0071
        L_0x006d:
            r11 = r43
            r43 = r6
        L_0x0071:
            int r6 = r0.i
            if (r6 == r5) goto L_0x007c
            if (r32 != 0) goto L_0x007c
            r0.i = r5
            r11 = r6
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r43
        L_0x007e:
            int r5 = r0.g0
            r43 = r11
            r11 = 8
            if (r5 != r11) goto L_0x0089
            r5 = 0
            r6 = 0
            goto L_0x008b
        L_0x0089:
            r5 = r43
        L_0x008b:
            if (r57 == 0) goto L_0x00ad
            if (r16 != 0) goto L_0x009d
            if (r17 != 0) goto L_0x009d
            if (r12 != 0) goto L_0x009d
            r11 = r42
            r10.d(r9, r11)
        L_0x0098:
            r22 = r12
            r12 = 8
            goto L_0x00b0
        L_0x009d:
            if (r16 == 0) goto L_0x0098
            if (r17 != 0) goto L_0x0098
            int r11 = r40.e()
            r22 = r12
            r12 = 8
            r10.e(r9, r7, r11, r12)
            goto L_0x00b0
        L_0x00ad:
            r22 = r12
            r12 = r11
        L_0x00b0:
            if (r6 != 0) goto L_0x00d7
            if (r39 == 0) goto L_0x00c9
            r11 = 3
            r12 = 0
            r10.e(r8, r9, r12, r11)
            r11 = 8
            if (r15 <= 0) goto L_0x00c0
            r10.f(r8, r9, r15, r11)
        L_0x00c0:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r5) goto L_0x00ce
            r10.g(r8, r9, r1, r11)
            goto L_0x00ce
        L_0x00c9:
            r11 = r12
            r12 = 0
            r10.e(r8, r9, r5, r11)
        L_0x00ce:
            r11 = r35
            r23 = r2
            r12 = r3
            r24 = r6
            goto L_0x01aa
        L_0x00d7:
            r1 = 2
            r12 = 0
            if (r2 == r1) goto L_0x00fa
            if (r47 != 0) goto L_0x00fa
            r1 = 1
            if (r14 == r1) goto L_0x00e2
            if (r14 != 0) goto L_0x00fa
        L_0x00e2:
            int r1 = java.lang.Math.max(r3, r5)
            if (r4 <= 0) goto L_0x00ec
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00ec:
            r5 = 8
            r10.e(r8, r9, r1, r5)
            r11 = r35
            r23 = r2
            r24 = r12
            r12 = r3
            goto L_0x01aa
        L_0x00fa:
            r1 = -2
            if (r3 != r1) goto L_0x00fe
            r3 = r5
        L_0x00fe:
            if (r4 != r1) goto L_0x0101
            r4 = r5
        L_0x0101:
            if (r5 <= 0) goto L_0x0107
            r1 = 1
            if (r14 == r1) goto L_0x0107
            r5 = r12
        L_0x0107:
            r1 = 8
            if (r3 <= 0) goto L_0x0112
            r10.f(r8, r9, r3, r1)
            int r5 = java.lang.Math.max(r5, r3)
        L_0x0112:
            r11 = 1
            if (r4 <= 0) goto L_0x0121
            if (r33 == 0) goto L_0x011a
            if (r14 != r11) goto L_0x011a
            goto L_0x011d
        L_0x011a:
            r10.g(r8, r9, r4, r1)
        L_0x011d:
            int r5 = java.lang.Math.min(r5, r4)
        L_0x0121:
            if (r14 != r11) goto L_0x013c
            if (r33 == 0) goto L_0x012a
            r10.e(r8, r9, r5, r1)
            r11 = 5
            goto L_0x00ce
        L_0x012a:
            if (r49 == 0) goto L_0x0134
            r11 = 5
            r10.e(r8, r9, r5, r11)
            r10.g(r8, r9, r5, r1)
            goto L_0x00ce
        L_0x0134:
            r11 = 5
            r10.e(r8, r9, r5, r11)
            r10.g(r8, r9, r5, r1)
            goto L_0x00ce
        L_0x013c:
            r1 = 2
            r11 = 5
            if (r14 != r1) goto L_0x01a4
            int r5 = r13.e
            r12 = 3
            if (r5 == r12) goto L_0x0147
            if (r5 != r11) goto L_0x0149
        L_0x0147:
            r11 = 4
            goto L_0x015f
        L_0x0149:
            tj3 r5 = r0.T
            aj3 r5 = r5.i(r1)
            sfe r1 = r10.k(r5)
            tj3 r5 = r0.T
            r11 = 4
            aj3 r5 = r5.i(r11)
            sfe r5 = r10.k(r5)
            goto L_0x0175
        L_0x015f:
            tj3 r1 = r0.T
            r5 = 3
            aj3 r1 = r1.i(r5)
            sfe r1 = r10.k(r1)
            tj3 r12 = r0.T
            r5 = 5
            aj3 r12 = r12.i(r5)
            sfe r5 = r10.k(r12)
        L_0x0175:
            vs r12 = r31.l()
            ls r11 = r12.d
            r23 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.j(r8, r2)
            ls r2 = r12.d
            r11 = 1065353216(0x3f800000, float:1.0)
            r2.j(r9, r11)
            ls r2 = r12.d
            r11 = r56
            r2.j(r5, r11)
            ls r2 = r12.d
            float r5 = -r11
            r2.j(r1, r5)
            r10.c(r12)
            if (r33 == 0) goto L_0x019d
            r5 = 0
            goto L_0x019e
        L_0x019d:
            r5 = r6
        L_0x019e:
            r11 = r35
            r12 = r3
            r24 = r5
            goto L_0x01aa
        L_0x01a4:
            r23 = r2
            r12 = r3
            r24 = r6
            r11 = 1
        L_0x01aa:
            if (r57 == 0) goto L_0x0506
            if (r49 == 0) goto L_0x01bd
            r1 = r36
            r3 = r37
            r2 = r8
            r13 = r9
            r35 = r11
            r4 = r23
            r5 = 2
            r29 = 1
            goto L_0x0513
        L_0x01bd:
            if (r16 != 0) goto L_0x01cd
            if (r17 != 0) goto L_0x01cd
            if (r22 != 0) goto L_0x01cd
            r14 = r41
            r2 = r8
            r35 = r11
            r0 = r19
        L_0x01ca:
            r3 = 5
            goto L_0x04eb
        L_0x01cd:
            if (r16 == 0) goto L_0x01eb
            if (r17 != 0) goto L_0x01eb
            aj3 r0 = r13.f
            tj3 r0 = r0.d
            if (r33 == 0) goto L_0x01de
            boolean r0 = r0 instanceof defpackage.ii0
            if (r0 == 0) goto L_0x01de
            r0 = 8
            goto L_0x01df
        L_0x01de:
            r0 = 5
        L_0x01df:
            r14 = r41
            r2 = r8
            r35 = r11
            r11 = r0
            r0 = r19
            r19 = r33
            goto L_0x04ee
        L_0x01eb:
            if (r16 != 0) goto L_0x0214
            if (r17 == 0) goto L_0x0214
            int r0 = r41.e()
            int r0 = -r0
            r6 = r19
            r1 = 8
            r10.e(r8, r6, r0, r1)
            if (r33 == 0) goto L_0x020d
            r5 = r36
            r0 = 0
            r1 = 5
            r10.f(r9, r5, r0, r1)
            r14 = r41
            r3 = r1
            r0 = r6
            r2 = r8
            r35 = r11
            goto L_0x04eb
        L_0x020d:
            r14 = r41
            r0 = r6
            r2 = r8
            r35 = r11
            goto L_0x01ca
        L_0x0214:
            r5 = r36
            r6 = r19
            if (r16 == 0) goto L_0x020d
            if (r17 == 0) goto L_0x020d
            aj3 r1 = r13.f
            tj3 r3 = r1.d
            r2 = r41
            aj3 r1 = r2.f
            tj3 r1 = r1.d
            tj3 r13 = r0.T
            r16 = 6
            if (r24 == 0) goto L_0x035d
            if (r14 != 0) goto L_0x0287
            if (r4 != 0) goto L_0x0257
            if (r12 != 0) goto L_0x0257
            boolean r4 = r7.w
            if (r4 == 0) goto L_0x024c
            boolean r4 = r6.w
            if (r4 == 0) goto L_0x024c
            int r0 = r40.e()
            r1 = 8
            r10.e(r9, r7, r0, r1)
            int r0 = r41.e()
            int r0 = -r0
            r10.e(r8, r6, r0, r1)
            return
        L_0x024c:
            r32 = 8
            r17 = 0
            r19 = 1
            r21 = 0
            r22 = 8
            goto L_0x0261
        L_0x0257:
            r32 = 5
            r17 = 1
            r19 = 0
            r21 = 1
            r22 = 5
        L_0x0261:
            boolean r4 = r3 instanceof defpackage.ii0
            if (r4 != 0) goto L_0x027d
            boolean r4 = r1 instanceof defpackage.ii0
            if (r4 == 0) goto L_0x026a
            goto L_0x027d
        L_0x026a:
            r4 = r32
            r20 = r21
            r23 = r22
            r15 = 1
            r22 = r16
        L_0x0273:
            r21 = r19
            r19 = r17
            r17 = r14
        L_0x0279:
            r14 = r37
            goto L_0x03aa
        L_0x027d:
            r4 = r32
            r22 = r16
            r20 = r21
            r15 = 1
            r23 = 4
            goto L_0x0273
        L_0x0287:
            r15 = 2
            if (r14 != r15) goto L_0x02b1
            boolean r4 = r3 instanceof defpackage.ii0
            if (r4 != 0) goto L_0x02a2
            boolean r4 = r1 instanceof defpackage.ii0
            if (r4 == 0) goto L_0x0293
            goto L_0x02a2
        L_0x0293:
            r17 = r14
            r22 = r16
            r4 = 5
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r23 = 5
            goto L_0x0279
        L_0x02a2:
            r17 = r14
            r22 = r16
            r4 = 5
        L_0x02a7:
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r23 = 4
            goto L_0x0279
        L_0x02b1:
            r15 = 1
            if (r14 != r15) goto L_0x02bb
            r17 = r14
            r22 = r16
            r4 = 8
            goto L_0x02a7
        L_0x02bb:
            r15 = 3
            if (r14 != r15) goto L_0x034e
            int r15 = r0.A
            r17 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02eb
            if (r50 == 0) goto L_0x02dd
            r14 = r37
            r4 = 8
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 1
            if (r33 == 0) goto L_0x02da
            r22 = 5
        L_0x02d6:
            r23 = 5
            goto L_0x03aa
        L_0x02da:
            r22 = 4
            goto L_0x02d6
        L_0x02dd:
            r14 = r37
            r4 = 8
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 8
            goto L_0x02d6
        L_0x02eb:
            if (r47 == 0) goto L_0x0309
            r14 = r53
            r15 = 2
            if (r14 == r15) goto L_0x02fa
            r15 = 1
            if (r14 != r15) goto L_0x02f6
            goto L_0x02fb
        L_0x02f6:
            r4 = 8
            r14 = 5
            goto L_0x02fd
        L_0x02fa:
            r15 = 1
        L_0x02fb:
            r4 = 5
            r14 = 4
        L_0x02fd:
            r23 = r14
            r19 = r15
            r20 = r19
            r21 = r20
            r22 = r16
            goto L_0x0279
        L_0x0309:
            r15 = 1
            if (r4 <= 0) goto L_0x0318
            r14 = r37
            r19 = r15
            r20 = r19
            r21 = r20
            r22 = r16
            r4 = 5
            goto L_0x02d6
        L_0x0318:
            if (r4 != 0) goto L_0x0342
            if (r12 != 0) goto L_0x0342
            if (r50 != 0) goto L_0x032d
            r14 = r37
            r19 = r15
            r20 = r19
            r21 = r20
            r22 = r16
            r4 = 5
            r23 = 8
            goto L_0x03aa
        L_0x032d:
            if (r3 == r13) goto L_0x0333
            if (r1 == r13) goto L_0x0333
            r4 = 4
            goto L_0x0334
        L_0x0333:
            r4 = 5
        L_0x0334:
            r14 = r37
            r19 = r15
            r20 = r19
            r21 = r20
            r22 = r16
        L_0x033e:
            r23 = 4
            goto L_0x03aa
        L_0x0342:
            r14 = r37
            r19 = r15
            r20 = r19
            r21 = r20
            r22 = r16
            r4 = 5
            goto L_0x033e
        L_0x034e:
            r17 = r14
            r15 = 1
            r14 = r37
            r22 = r16
            r4 = 5
            r19 = 0
            r20 = 0
        L_0x035a:
            r21 = 0
            goto L_0x033e
        L_0x035d:
            r17 = r14
            r15 = 1
            boolean r4 = r7.w
            if (r4 == 0) goto L_0x03a0
            boolean r4 = r6.w
            if (r4 == 0) goto L_0x03a0
            int r0 = r40.e()
            int r1 = r41.e()
            r3 = 8
            r47 = r31
            r48 = r9
            r49 = r7
            r50 = r0
            r51 = r46
            r52 = r6
            r53 = r8
            r54 = r1
            r55 = r3
            r47.b(r48, r49, r50, r51, r52, r53, r54, r55)
            if (r33 == 0) goto L_0x039f
            if (r11 == 0) goto L_0x039f
            aj3 r0 = r2.f
            if (r0 == 0) goto L_0x0396
            int r5 = r41.e()
            r14 = r37
            goto L_0x0399
        L_0x0396:
            r14 = r37
            r5 = 0
        L_0x0399:
            if (r6 == r14) goto L_0x039f
            r0 = 5
            r10.f(r14, r8, r5, r0)
        L_0x039f:
            return
        L_0x03a0:
            r14 = r37
            r19 = r15
            r20 = r19
            r22 = r16
            r4 = 5
            goto L_0x035a
        L_0x03aa:
            if (r20 == 0) goto L_0x03b5
            if (r7 != r6) goto L_0x03b5
            if (r3 == r13) goto L_0x03b5
            r20 = 0
            r25 = 0
            goto L_0x03b7
        L_0x03b5:
            r25 = r15
        L_0x03b7:
            if (r19 == 0) goto L_0x0402
            if (r24 != 0) goto L_0x03cc
            if (r48 != 0) goto L_0x03cc
            if (r50 != 0) goto L_0x03cc
            if (r7 != r5) goto L_0x03cc
            if (r6 != r14) goto L_0x03cc
            r19 = 0
            r22 = 8
            r25 = 0
            r26 = 8
            goto L_0x03d2
        L_0x03cc:
            r19 = r33
            r26 = r22
            r22 = r4
        L_0x03d2:
            int r4 = r40.e()
            int r27 = r41.e()
            r15 = r1
            r1 = r31
            r14 = r2
            r2 = r9
            r35 = r11
            r11 = r3
            r3 = r7
            r39 = r12
            r12 = r5
            r5 = r46
            r32 = r6
            r28 = 4
            r29 = 1
            r12 = r7
            r7 = r8
            r38 = r13
            r13 = r8
            r8 = r27
            r27 = r13
            r13 = r9
            r9 = r26
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r22
        L_0x03ff:
            r6 = r25
            goto L_0x0418
        L_0x0402:
            r14 = r2
            r32 = r6
            r27 = r8
            r35 = r11
            r39 = r12
            r38 = r13
            r29 = r15
            r28 = 4
            r15 = r1
            r11 = r3
            r12 = r7
            r13 = r9
            r19 = r33
            goto L_0x03ff
        L_0x0418:
            int r0 = r0.g0
            r1 = 8
            if (r0 != r1) goto L_0x042b
            java.util.HashSet r0 = r14.a
            if (r0 != 0) goto L_0x0423
            goto L_0x042a
        L_0x0423:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x042a
            goto L_0x042b
        L_0x042a:
            return
        L_0x042b:
            r0 = r32
            if (r20 == 0) goto L_0x0451
            if (r19 == 0) goto L_0x043f
            if (r12 == r0) goto L_0x043f
            if (r24 != 0) goto L_0x043f
            boolean r1 = r11 instanceof defpackage.ii0
            if (r1 != 0) goto L_0x043d
            boolean r1 = r15 instanceof defpackage.ii0
            if (r1 == 0) goto L_0x043f
        L_0x043d:
            r4 = r16
        L_0x043f:
            int r1 = r40.e()
            r10.f(r13, r12, r1, r4)
            int r1 = r41.e()
            int r1 = -r1
            r2 = r27
            r10.g(r2, r0, r1, r4)
            goto L_0x0453
        L_0x0451:
            r2 = r27
        L_0x0453:
            if (r19 == 0) goto L_0x0469
            if (r51 == 0) goto L_0x0469
            boolean r1 = r11 instanceof defpackage.ii0
            if (r1 != 0) goto L_0x0469
            boolean r1 = r15 instanceof defpackage.ii0
            if (r1 != 0) goto L_0x0469
            r1 = r38
            if (r15 == r1) goto L_0x046b
            r3 = r16
            r4 = r3
            r6 = r29
            goto L_0x046d
        L_0x0469:
            r1 = r38
        L_0x046b:
            r3 = r23
        L_0x046d:
            if (r6 == 0) goto L_0x04ba
            if (r21 == 0) goto L_0x049a
            if (r50 == 0) goto L_0x0475
            if (r34 == 0) goto L_0x049a
        L_0x0475:
            if (r11 == r1) goto L_0x047c
            if (r15 != r1) goto L_0x047a
            goto L_0x047c
        L_0x047a:
            r16 = r3
        L_0x047c:
            boolean r5 = r11 instanceof defpackage.iv6
            if (r5 != 0) goto L_0x0484
            boolean r5 = r15 instanceof defpackage.iv6
            if (r5 == 0) goto L_0x0486
        L_0x0484:
            r16 = 5
        L_0x0486:
            boolean r5 = r11 instanceof defpackage.ii0
            if (r5 != 0) goto L_0x048e
            boolean r5 = r15 instanceof defpackage.ii0
            if (r5 == 0) goto L_0x0490
        L_0x048e:
            r16 = 5
        L_0x0490:
            if (r50 == 0) goto L_0x0494
            r5 = 5
            goto L_0x0496
        L_0x0494:
            r5 = r16
        L_0x0496:
            int r3 = java.lang.Math.max(r5, r3)
        L_0x049a:
            r6 = r3
            if (r19 == 0) goto L_0x04ab
            int r6 = java.lang.Math.min(r4, r6)
            if (r47 == 0) goto L_0x04ab
            if (r50 != 0) goto L_0x04ab
            if (r11 == r1) goto L_0x04a9
            if (r15 != r1) goto L_0x04ab
        L_0x04a9:
            r6 = r28
        L_0x04ab:
            int r1 = r40.e()
            r10.e(r13, r12, r1, r6)
            int r1 = r41.e()
            int r1 = -r1
            r10.e(r2, r0, r1, r6)
        L_0x04ba:
            if (r19 == 0) goto L_0x04cd
            r1 = r36
            r3 = r12
            if (r1 != r3) goto L_0x04c6
            int r5 = r40.e()
            goto L_0x04c7
        L_0x04c6:
            r5 = 0
        L_0x04c7:
            if (r3 == r1) goto L_0x04cd
            r3 = 5
            r10.f(r13, r1, r5, r3)
        L_0x04cd:
            if (r19 == 0) goto L_0x04e2
            if (r24 == 0) goto L_0x04e2
            if (r44 != 0) goto L_0x04e2
            if (r39 != 0) goto L_0x04e2
            if (r24 == 0) goto L_0x04e4
            r3 = r17
            r1 = 3
            if (r3 != r1) goto L_0x04e4
            r1 = 0
            r3 = 8
            r10.f(r2, r13, r1, r3)
        L_0x04e2:
            r3 = 5
            goto L_0x04e9
        L_0x04e4:
            r1 = 0
            r3 = 5
            r10.f(r2, r13, r1, r3)
        L_0x04e9:
            r11 = r3
            goto L_0x04ee
        L_0x04eb:
            r19 = r33
            goto L_0x04e9
        L_0x04ee:
            if (r19 == 0) goto L_0x0505
            if (r35 == 0) goto L_0x0505
            aj3 r1 = r14.f
            if (r1 == 0) goto L_0x04fd
            int r5 = r41.e()
            r3 = r37
            goto L_0x0500
        L_0x04fd:
            r3 = r37
            r5 = 0
        L_0x0500:
            if (r0 == r3) goto L_0x0505
            r10.f(r3, r2, r5, r11)
        L_0x0505:
            return
        L_0x0506:
            r1 = r36
            r3 = r37
            r2 = r8
            r13 = r9
            r35 = r11
            r4 = r23
            r29 = 1
            r5 = 2
        L_0x0513:
            if (r4 >= r5) goto L_0x0553
            if (r33 == 0) goto L_0x0553
            if (r35 == 0) goto L_0x0553
            r4 = 0
            r5 = 8
            r10.f(r13, r1, r4, r5)
            aj3 r0 = r0.M
            if (r32 != 0) goto L_0x052a
            aj3 r1 = r0.f
            if (r1 != 0) goto L_0x0528
            goto L_0x052a
        L_0x0528:
            r6 = 0
            goto L_0x052c
        L_0x052a:
            r6 = r29
        L_0x052c:
            if (r32 != 0) goto L_0x054b
            aj3 r0 = r0.f
            if (r0 == 0) goto L_0x054b
            tj3 r0 = r0.d
            float r1 = r0.W
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x054a
            int[] r0 = r0.p0
            r1 = 0
            r4 = r0[r1]
            r1 = 3
            if (r4 != r1) goto L_0x054a
            r0 = r0[r29]
            if (r0 != r1) goto L_0x054a
            r6 = r29
            goto L_0x054b
        L_0x054a:
            r6 = 0
        L_0x054b:
            if (r6 == 0) goto L_0x0553
            r0 = 0
            r1 = 8
            r10.f(r3, r2, r0, r1)
        L_0x0553:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.d(gw7, boolean, boolean, boolean, boolean, sfe, sfe, int, boolean, aj3, aj3, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i2, tj3 tj3, int i3, int i4) {
        boolean z2;
        if (i2 == 7) {
            if (i3 == 7) {
                aj3 i5 = i(2);
                aj3 i6 = i(4);
                aj3 i7 = i(3);
                aj3 i8 = i(5);
                boolean z3 = true;
                if ((i5 == null || !i5.h()) && (i6 == null || !i6.h())) {
                    e(2, tj3, 2, 0);
                    e(4, tj3, 4, 0);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 == null || !i7.h()) && (i8 == null || !i8.h())) {
                    e(3, tj3, 3, 0);
                    e(5, tj3, 5, 0);
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    i(7).a(tj3.i(7), 0);
                } else if (z2) {
                    i(8).a(tj3.i(8), 0);
                } else if (z3) {
                    i(9).a(tj3.i(9), 0);
                }
            } else if (i3 == 2 || i3 == 4) {
                e(2, tj3, i3, 0);
                e(4, tj3, i3, 0);
                i(7).a(tj3.i(i3), 0);
            } else if (i3 == 3 || i3 == 5) {
                e(3, tj3, i3, 0);
                e(5, tj3, i3, 0);
                i(7).a(tj3.i(i3), 0);
            }
        } else if (i2 == 8 && (i3 == 2 || i3 == 4)) {
            aj3 i9 = i(2);
            aj3 i10 = tj3.i(i3);
            aj3 i11 = i(4);
            i9.a(i10, 0);
            i11.a(i10, 0);
            i(8).a(i10, 0);
        } else if (i2 == 9 && (i3 == 3 || i3 == 5)) {
            aj3 i12 = tj3.i(i3);
            i(3).a(i12, 0);
            i(5).a(i12, 0);
            i(9).a(i12, 0);
        } else if (i2 == 8 && i3 == 8) {
            i(2).a(tj3.i(2), 0);
            i(4).a(tj3.i(4), 0);
            i(8).a(tj3.i(i3), 0);
        } else if (i2 == 9 && i3 == 9) {
            i(3).a(tj3.i(3), 0);
            i(5).a(tj3.i(5), 0);
            i(9).a(tj3.i(i3), 0);
        } else {
            aj3 i13 = i(i2);
            aj3 i14 = tj3.i(i3);
            if (i13.i(i14)) {
                if (i2 == 6) {
                    aj3 i15 = i(3);
                    aj3 i16 = i(5);
                    if (i15 != null) {
                        i15.j();
                    }
                    if (i16 != null) {
                        i16.j();
                    }
                } else if (i2 == 3 || i2 == 5) {
                    aj3 i17 = i(6);
                    if (i17 != null) {
                        i17.j();
                    }
                    aj3 i18 = i(7);
                    if (i18.f != i14) {
                        i18.j();
                    }
                    aj3 f2 = i(i2).f();
                    aj3 i19 = i(9);
                    if (i19.h()) {
                        f2.j();
                        i19.j();
                    }
                } else if (i2 == 2 || i2 == 4) {
                    aj3 i20 = i(7);
                    if (i20.f != i14) {
                        i20.j();
                    }
                    aj3 f3 = i(i2).f();
                    aj3 i21 = i(8);
                    if (i21.h()) {
                        f3.j();
                        i21.j();
                    }
                }
                i13.a(i14, i4);
            }
        }
    }

    public final void f(aj3 aj3, aj3 aj32, int i2) {
        if (aj3.d == this) {
            e(aj3.e, aj32.d, aj32.e, i2);
        }
    }

    public final void g(gw7 gw7) {
        gw7.k(this.I);
        gw7.k(this.J);
        gw7.k(this.K);
        gw7.k(this.L);
        if (this.a0 > 0) {
            gw7.k(this.M);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [gng, w2g] */
    /* JADX WARNING: type inference failed for: r0v3, types: [gng, s27] */
    public final void h() {
        if (this.d == null) {
            ? gng = new gng(this);
            gng.h.e = 4;
            gng.i.e = 5;
            gng.f = 0;
            this.d = gng;
        }
        if (this.e == null) {
            ? gng2 = new gng(this);
            fm4 fm4 = new fm4(gng2);
            gng2.k = fm4;
            gng2.l = null;
            gng2.h.e = 6;
            gng2.i.e = 7;
            fm4.e = 8;
            gng2.f = 1;
            this.e = gng2;
        }
    }

    public aj3 i(int i2) {
        switch (tr1.y(i2)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(g63.p(i2));
        }
    }

    public final int j(int i2) {
        int[] iArr = this.p0;
        if (i2 == 0) {
            return iArr[0];
        }
        if (i2 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r1.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tj3 l(int r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x000f
            aj3 r1 = r1.K
            aj3 r2 = r1.f
            if (r2 == 0) goto L_0x001f
            aj3 r0 = r2.f
            if (r0 != r1) goto L_0x001f
            tj3 r1 = r2.d
            return r1
        L_0x000f:
            r0 = 1
            if (r2 != r0) goto L_0x001f
            aj3 r1 = r1.L
            aj3 r2 = r1.f
            if (r2 == 0) goto L_0x001f
            aj3 r0 = r2.f
            if (r0 != r1) goto L_0x001f
            tj3 r1 = r2.d
            return r1
        L_0x001f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.l(int):tj3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r1.J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tj3 m(int r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x000f
            aj3 r1 = r1.I
            aj3 r2 = r1.f
            if (r2 == 0) goto L_0x001f
            aj3 r0 = r2.f
            if (r0 != r1) goto L_0x001f
            tj3 r1 = r2.d
            return r1
        L_0x000f:
            r0 = 1
            if (r2 != r0) goto L_0x001f
            aj3 r1 = r1.J
            aj3 r2 = r1.f
            if (r2 == 0) goto L_0x001f
            aj3 r0 = r2.f
            if (r0 != r1) goto L_0x001f
            tj3 r1 = r2.d
            return r1
        L_0x001f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.m(int):tj3");
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.Z);
        sb.append("\n");
        p(sb, "left", this.I);
        p(sb, "top", this.J);
        p(sb, "right", this.K);
        p(sb, "bottom", this.L);
        p(sb, "baseline", this.M);
        p(sb, "centerX", this.N);
        p(sb, "centerY", this.O);
        int i2 = this.U;
        int i3 = this.b0;
        int[] iArr = this.C;
        int i4 = iArr[0];
        int i5 = this.u;
        int i6 = this.r;
        float f2 = this.w;
        float[] fArr = this.k0;
        float f3 = fArr[0];
        o(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.V;
        int i8 = this.c0;
        int i9 = iArr[1];
        int i10 = this.x;
        int i11 = this.s;
        float f4 = this.z;
        float f5 = fArr[1];
        o(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.W;
        int i12 = this.X;
        if (f6 != c44.DEFAULT_ASPECT_RATIO) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.d0, 0.5f);
        H(sb, "    verticalBias", this.e0, 0.5f);
        G(sb, this.i0, 0, "    horizontalChainStyle");
        G(sb, this.j0, 0, "    verticalChainStyle");
        sb.append("  }");
    }

    public final int q() {
        if (this.g0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final int r() {
        tj3 tj3 = this.T;
        return (tj3 == null || !(tj3 instanceof uj3)) ? this.Y : ((uj3) tj3).x0 + this.Y;
    }

    public final int s() {
        tj3 tj3 = this.T;
        return (tj3 == null || !(tj3 instanceof uj3)) ? this.Z : ((uj3) tj3).y0 + this.Z;
    }

    public final boolean t(int i2) {
        if (i2 == 0) {
            return (this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) < 2;
        }
        return ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0)) + (this.M.f != null ? 1 : 0) < 2;
    }

    public String toString() {
        String str = "";
        StringBuilder o2 = tr1.o(str);
        if (this.h0 != null) {
            str = wj6.n(new StringBuilder("id: "), this.h0, " ");
        }
        o2.append(str);
        o2.append("(");
        o2.append(this.Y);
        o2.append(", ");
        o2.append(this.Z);
        o2.append(") - (");
        o2.append(this.U);
        o2.append(" x ");
        return wj6.l(o2, this.V, ")");
    }

    public final boolean u(int i2, int i3) {
        aj3 aj3;
        aj3 aj32;
        aj3 aj33;
        aj3 aj34;
        if (i2 == 0) {
            aj3 aj35 = this.I;
            aj3 aj36 = aj35.f;
            if (aj36 != null && aj36.c && (aj34 = aj33.f) != null && aj34.c) {
                return (aj34.d() - (aj33 = this.K).e()) - (aj35.e() + aj35.f.d()) >= i3;
            }
        } else {
            aj3 aj37 = this.J;
            aj3 aj38 = aj37.f;
            if (aj38 != null && aj38.c && (aj32 = (aj3 = this.L).f) != null && aj32.c) {
                return (aj32.d() - aj3.e()) - (aj37.e() + aj37.f.d()) >= i3;
            }
        }
        return false;
    }

    public final void v(int i2, int i3, int i4, int i5, tj3 tj3) {
        i(i2).b(tj3.i(i3), i4, i5, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2[r3 + 1];
        r3 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(int r3) {
        /*
            r2 = this;
            int r3 = r3 * 2
            aj3[] r2 = r2.Q
            r0 = r2[r3]
            aj3 r1 = r0.f
            if (r1 == 0) goto L_0x001b
            aj3 r1 = r1.f
            if (r1 == r0) goto L_0x001b
            r0 = 1
            int r3 = r3 + r0
            r2 = r2[r3]
            aj3 r3 = r2.f
            if (r3 == 0) goto L_0x001b
            aj3 r3 = r3.f
            if (r3 != r2) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.w(int):boolean");
    }

    public final boolean x() {
        aj3 aj3 = this.I;
        aj3 aj32 = aj3.f;
        if (aj32 != null && aj32.f == aj3) {
            return true;
        }
        aj3 aj33 = this.K;
        aj3 aj34 = aj33.f;
        return aj34 != null && aj34.f == aj33;
    }

    public final boolean y() {
        aj3 aj3 = this.J;
        aj3 aj32 = aj3.f;
        if (aj32 != null && aj32.f == aj3) {
            return true;
        }
        aj3 aj33 = this.L;
        aj3 aj34 = aj33.f;
        return aj34 != null && aj34.f == aj33;
    }

    public final boolean z() {
        return this.g && this.g0 != 8;
    }
}
