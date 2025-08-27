package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: d27  reason: default package */
public final class d27 implements p28, u28, psd, wf5, gcd {
    public static final Set h1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final Handler A0;
    public final ArrayList B0;
    public final Map C0;
    public k03 D0;
    public b27[] E0;
    public int[] F0;
    public final HashSet G0;
    public final SparseIntArray H0;
    public z17 I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public ca6 O0;
    public ca6 P0;
    public boolean Q0;
    public tpf R0;
    public Set S0;
    public int[] T0;
    public int U0;
    public boolean V0;
    public boolean[] W0;
    public final w28 X = new w28("Loader:HlsSampleStreamWrapper", 0);
    public boolean[] X0;
    public final uz8 Y;
    public long Y0;
    public final int Z;
    public long Z0;
    public final String a;
    public boolean a1;
    public final int b;
    public boolean b1;
    public final q07 c;
    public boolean c1;
    public boolean d1;
    public long e1;
    public xv4 f1;
    public o07 g1;
    public final i07 o;
    public final cb4 v;
    public final he v0;
    public final ca6 w;
    public final ArrayList w0;
    public final ow4 x;
    public final List x0;
    public final fw4 y;
    public final x17 y0;
    public final gga z;
    public final x17 z0;

    public d27(String str, int i, q07 q07, i07 i07, Map map, cb4 cb4, long j, ca6 ca6, ow4 ow4, fw4 fw4, gga gga, uz8 uz8, int i2) {
        this.a = str;
        this.b = i;
        this.c = q07;
        this.o = i07;
        this.C0 = map;
        this.v = cb4;
        this.w = ca6;
        this.x = ow4;
        this.y = fw4;
        this.z = gga;
        this.Y = uz8;
        this.Z = i2;
        he heVar = new he(10, (byte) 0);
        heVar.c = null;
        heVar.b = false;
        heVar.o = null;
        this.v0 = heVar;
        this.F0 = new int[0];
        Set set = h1;
        this.G0 = new HashSet(set.size());
        this.H0 = new SparseIntArray(set.size());
        this.E0 = new b27[0];
        this.X0 = new boolean[0];
        this.W0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.w0 = arrayList;
        this.x0 = Collections.unmodifiableList(arrayList);
        this.B0 = new ArrayList();
        this.y0 = new x17(this, 0);
        this.z0 = new x17(this, 1);
        this.A0 = t0g.m((Handler.Callback) null);
        this.Y0 = j;
        this.Z0 = j;
    }

    public static ca6 f(ca6 ca6, ca6 ca62, boolean z2) {
        String str;
        String str2;
        if (ca6 == null) {
            return ca62;
        }
        String str3 = ca62.Z;
        int g = uq9.g(str3);
        String str4 = ca6.z;
        if (t0g.p(g, str4) == 1) {
            str2 = t0g.q(g, str4);
            str = uq9.c(str2);
        } else {
            String a2 = uq9.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        aa6 a3 = ca62.a();
        a3.a = ca6.a;
        a3.b = ca6.b;
        a3.c = ca6.c;
        a3.d = ca6.o;
        a3.e = ca6.v;
        a3.f = z2 ? ca6.w : -1;
        a3.g = z2 ? ca6.x : -1;
        a3.h = str2;
        if (g == 2) {
            a3.p = ca6.z0;
            a3.q = ca6.A0;
            a3.r = ca6.B0;
        }
        if (str != null) {
            a3.k = str;
        }
        int i = ca6.H0;
        if (i != -1 && g == 1) {
            a3.x = i;
        }
        rp9 rp9 = ca6.X;
        if (rp9 != null) {
            rp9 rp92 = ca62.X;
            if (rp92 != null) {
                pp9[] pp9Arr = rp9.a;
                if (pp9Arr.length == 0) {
                    rp9 = rp92;
                } else {
                    pp9[] pp9Arr2 = rp92.a;
                    Object[] copyOf = Arrays.copyOf(pp9Arr2, pp9Arr2.length + pp9Arr.length);
                    System.arraycopy(pp9Arr, 0, copyOf, pp9Arr2.length, pp9Arr.length);
                    rp9 = new rp9((pp9[]) copyOf);
                }
            }
            a3.i = rp9;
        }
        return new ca6(a3);
    }

    public static int j(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A(long j) {
        w28 w28 = this.X;
        if (!w28.L() && !k()) {
            boolean M = w28.M();
            i07 i07 = this.o;
            List list = this.x0;
            if (M) {
                this.D0.getClass();
                if (i07.n != null ? false : i07.q.u(j, this.D0, list)) {
                    w28.A();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && i07.b((o07) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                g(size);
            }
            int size2 = (i07.n != null || i07.q.length() < 2) ? list.size() : i07.q.g(j, list);
            if (size2 < this.w0.size()) {
                g(size2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [xx4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ypf B(int r12, int r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.util.Set r2 = h1
            boolean r1 = r2.contains(r1)
            java.util.HashSet r3 = r11.G0
            android.util.SparseIntArray r4 = r11.H0
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            defpackage.y64.g(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0057
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r3.add(r1)
            if (r1 == 0) goto L_0x0034
            int[] r1 = r11.F0
            r1[r2] = r12
        L_0x0034:
            int[] r1 = r11.F0
            r1 = r1[r2]
            if (r1 != r12) goto L_0x0040
            b27[] r1 = r11.E0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0057
        L_0x0040:
            xx4 r1 = new xx4
            r1.<init>()
            goto L_0x003e
        L_0x0046:
            r1 = r5
        L_0x0047:
            b27[] r2 = r11.E0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0057
            int[] r7 = r11.F0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0055
            r6 = r2[r1]
            goto L_0x0057
        L_0x0055:
            int r1 = r1 + r0
            goto L_0x0047
        L_0x0057:
            if (r6 != 0) goto L_0x00e9
            boolean r1 = r11.d1
            if (r1 == 0) goto L_0x0063
            xx4 r11 = new xx4
            r11.<init>()
            return r11
        L_0x0063:
            b27[] r1 = r11.E0
            int r1 = r1.length
            if (r13 == r0) goto L_0x006b
            r2 = 2
            if (r13 != r2) goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            b27 r6 = new b27
            cb4 r2 = r11.v
            java.util.Map r7 = r11.C0
            ow4 r8 = r11.x
            fw4 r9 = r11.y
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.Y0
            r6.t = r7
            if (r5 == 0) goto L_0x0085
            xv4 r2 = r11.f1
            r6.I = r2
            r6.z = r0
        L_0x0085:
            long r7 = r11.e1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0091
            r6.F = r7
            r6.z = r0
        L_0x0091:
            o07 r2 = r11.g1
            if (r2 == 0) goto L_0x0099
            int r2 = r2.Y
            r6.C = r2
        L_0x0099:
            r6.f = r11
            int[] r2 = r11.F0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.F0 = r2
            r2[r1] = r12
            b27[] r12 = r11.E0
            int r2 = defpackage.t0g.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            b27[] r0 = (defpackage.b27[]) r0
            r11.E0 = r0
            boolean[] r12 = r11.X0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.X0 = r12
            r12[r1] = r5
            boolean r12 = r11.V0
            r12 = r12 | r5
            r11.V0 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r3.add(r12)
            r4.append(r13, r1)
            int r12 = j(r13)
            int r0 = r11.J0
            int r0 = j(r0)
            if (r12 <= r0) goto L_0x00e1
            r11.K0 = r1
            r11.J0 = r13
        L_0x00e1:
            boolean[] r12 = r11.W0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.W0 = r12
        L_0x00e9:
            r12 = 5
            if (r13 != r12) goto L_0x00fc
            z17 r12 = r11.I0
            if (r12 != 0) goto L_0x00f9
            z17 r12 = new z17
            int r13 = r11.Z
            r12.<init>(r6, r13)
            r11.I0 = r12
        L_0x00f9:
            z17 r11 = r11.I0
            return r11
        L_0x00fc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d27.B(int, int):ypf");
    }

    public final p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        boolean z2;
        p01 p01;
        int i2;
        IOException iOException2 = iOException;
        k03 k03 = (k03) s28;
        boolean z3 = k03 instanceof o07;
        if (z3 && !((o07) k03).T0 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).c) == 410 || i2 == 404)) {
            return w28.v;
        }
        long j3 = k03.z.b;
        sne sne = k03.z;
        k28 k28 = new k28(k03.a, k03.b, sne.c, sne.o, j, j2, j3);
        t0g.M(k03.x);
        t0g.M(k03.y);
        j28 j28 = new j28(i, iOException2);
        i07 i07 = this.o;
        z35 k = i8b.k(i07.q);
        this.z.getClass();
        p01 n = gga.n(k, j28);
        boolean z4 = false;
        if (n == null || n.b != 2) {
            z2 = false;
        } else {
            ld5 ld5 = i07.q;
            z2 = ld5.r(ld5.p(i07.h.a(k03.o)), n.c);
        }
        if (z2) {
            if (z3 && j3 == 0) {
                ArrayList arrayList = this.w0;
                if (((o07) arrayList.remove(arrayList.size() - 1)) == k03) {
                    z4 = true;
                }
                y64.j(z4);
                if (arrayList.isEmpty()) {
                    this.Z0 = this.Y0;
                } else {
                    ((o07) b0h.w(arrayList)).S0 = true;
                }
            }
            p01 = w28.w;
        } else {
            long p = gga.p(j28);
            p01 = p != -9223372036854775807L ? new p01(p, 0, 4, false) : w28.x;
        }
        p01 p012 = p01;
        boolean z5 = !p012.a();
        this.Y.h(k28, k03.c, this.b, k03.o, k03.v, k03.w, k03.x, k03.y, iOException, z5);
        if (z5) {
            this.D0 = null;
        }
        if (z2) {
            if (!this.M0) {
                M(this.Y0);
            } else {
                this.c.b(this);
            }
        }
        return p012;
    }

    public final void K(rnd rnd) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(long r56) {
        /*
            r55 = this;
            r0 = r55
            r10 = 1
            boolean r1 = r0.c1
            r11 = 0
            if (r1 != 0) goto L_0x0016
            w28 r12 = r0.X
            boolean r1 = r12.M()
            if (r1 != 0) goto L_0x0016
            boolean r1 = r12.L()
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            r0 = r11
            goto L_0x053b
        L_0x0019:
            boolean r1 = r55.k()
            if (r1 == 0) goto L_0x0036
            java.util.List r1 = java.util.Collections.emptyList()
            long r2 = r0.Z0
            b27[] r4 = r0.E0
            int r5 = r4.length
            r6 = r11
        L_0x0029:
            if (r6 >= r5) goto L_0x0033
            r7 = r4[r6]
            long r8 = r0.Z0
            r7.t = r8
            int r6 = r6 + r10
            goto L_0x0029
        L_0x0033:
            r8 = r1
            r14 = r2
            goto L_0x004e
        L_0x0036:
            o07 r1 = r55.h()
            boolean r2 = r1.Q0
            if (r2 == 0) goto L_0x0042
            long r1 = r1.y
        L_0x0040:
            r2 = r1
            goto L_0x004b
        L_0x0042:
            long r2 = r0.Y0
            long r4 = r1.x
            long r1 = java.lang.Math.max(r2, r4)
            goto L_0x0040
        L_0x004b:
            java.util.List r1 = r0.x0
            goto L_0x0033
        L_0x004e:
            he r13 = r0.v0
            r9 = 0
            r13.c = r9
            r13.b = r11
            r13.o = r9
            boolean r1 = r0.M0
            if (r1 != 0) goto L_0x0065
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r21 = r11
            goto L_0x0067
        L_0x0065:
            r21 = r10
        L_0x0067:
            i07 r6 = r0.o
            r6.getClass()
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L_0x0074
            r7 = r9
            goto L_0x007b
        L_0x0074:
            java.lang.Object r1 = defpackage.b0h.w(r8)
            o07 r1 = (defpackage.o07) r1
            r7 = r1
        L_0x007b:
            if (r7 != 0) goto L_0x007f
            r5 = -1
            goto L_0x0088
        L_0x007f:
            rpf r1 = r6.h
            ca6 r2 = r7.o
            int r1 = r1.a(r2)
            r5 = r1
        L_0x0088:
            long r1 = r14 - r56
            r17 = r5
            long r4 = r6.r
            r22 = r12
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x009c
            long r4 = r4 - r56
            goto L_0x009d
        L_0x009c:
            r4 = r11
        L_0x009d:
            if (r7 == 0) goto L_0x00c0
            boolean r3 = r6.p
            if (r3 != 0) goto L_0x00c0
            long r9 = r7.y
            long r11 = r7.x
            long r9 = r9 - r11
            long r1 = r1 - r9
            r11 = 0
            long r1 = java.lang.Math.max(r11, r1)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x00c0
            long r4 = r4 - r9
            long r3 = java.lang.Math.max(r11, r4)
            r9 = r3
        L_0x00be:
            r4 = r1
            goto L_0x00c2
        L_0x00c0:
            r9 = r4
            goto L_0x00be
        L_0x00c2:
            zm8[] r11 = r6.a(r7, r14)
            ld5 r1 = r6.q
            r2 = r56
            r12 = r17
            r0 = -1
            r0 = r6
            r57 = r7
            r6 = r9
            r10 = 0
            r9 = r11
            r1.t(r2, r4, r6, r8, r9)
            ld5 r1 = r0.q
            int r5 = r1.i()
            if (r12 == r5) goto L_0x00e0
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            android.net.Uri[] r2 = r0.e
            r3 = r2[r5]
            vf4 r4 = r0.g
            boolean r6 = r4.d(r3)
            if (r6 != 0) goto L_0x00ff
            r13.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            r0 = r13
            goto L_0x0476
        L_0x00ff:
            r6 = 1
            b17 r7 = r4.a(r3, r6)
            r7.getClass()
            boolean r6 = r7.c
            r0.p = r6
            boolean r6 = r7.o
            long r8 = r7.h
            if (r6 == 0) goto L_0x0119
            r23 = r7
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0122
        L_0x0119:
            long r10 = r7.u
            long r10 = r10 + r8
            r23 = r7
            long r6 = r4.x
            long r6 = r10 - r6
        L_0x0122:
            r0.r = r6
            long r6 = r4.x
            long r8 = r8 - r6
            r7 = r13
            r13 = r0
            r10 = r14
            r14 = r57
            r15 = r1
            r16 = r23
            r17 = r8
            r19 = r10
            android.util.Pair r6 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r13 = r6.first
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r16 = r5
            r17 = r6
            r15 = r23
            long r5 = r15.k
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0188
            r5 = r57
            if (r5 == 0) goto L_0x018a
            if (r1 == 0) goto L_0x018a
            r3 = r2[r12]
            r1 = 1
            b17 r2 = r4.a(r3, r1)
            r2.getClass()
            long r8 = r4.x
            long r13 = r2.h
            long r8 = r13 - r8
            r15 = 0
            r13 = r0
            r14 = r5
            r16 = r2
            r17 = r8
            r19 = r10
            android.util.Pair r1 = r13.c(r14, r15, r16, r17, r19)
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r13 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15 = r2
            goto L_0x018e
        L_0x0188:
            r5 = r57
        L_0x018a:
            r12 = r16
            r1 = r17
        L_0x018e:
            long r10 = r15.k
            int r2 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x019e
            com.google.android.exoplayer2.source.BehindLiveWindowException r1 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r1.<init>()
            r0.n = r1
        L_0x019b:
            r0 = r7
            goto L_0x0476
        L_0x019e:
            r16 = r8
            long r8 = r13 - r10
            int r2 = (int) r8
            tb7 r4 = r15.r
            int r6 = r4.size()
            tb7 r8 = r15.s
            r18 = 1
            if (r2 != r6) goto L_0x01c6
            r6 = -1
            if (r1 == r6) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r2 = r8.size()
            if (r1 >= r2) goto L_0x0218
            h07 r9 = new h07
            java.lang.Object r2 = r8.get(r1)
            y07 r2 = (defpackage.y07) r2
            r9.<init>((defpackage.y07) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01c6:
            java.lang.Object r6 = r4.get(r2)
            w07 r6 = (defpackage.w07) r6
            r9 = -1
            if (r1 != r9) goto L_0x01d6
            h07 r1 = new h07
            r1.<init>((defpackage.y07) r6, (long) r13, (int) r9)
            r9 = r1
            goto L_0x0219
        L_0x01d6:
            tb7 r9 = r6.v0
            int r9 = r9.size()
            if (r1 >= r9) goto L_0x01ec
            h07 r9 = new h07
            tb7 r2 = r6.v0
            java.lang.Object r2 = r2.get(r1)
            y07 r2 = (defpackage.y07) r2
            r9.<init>((defpackage.y07) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x01ec:
            r1 = 1
            int r2 = r2 + r1
            int r1 = r4.size()
            if (r2 >= r1) goto L_0x0203
            h07 r9 = new h07
            java.lang.Object r1 = r4.get(r2)
            y07 r1 = (defpackage.y07) r1
            long r13 = r13 + r18
            r2 = -1
            r9.<init>((defpackage.y07) r1, (long) r13, (int) r2)
            goto L_0x0219
        L_0x0203:
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x0218
            h07 r9 = new h07
            r1 = 0
            java.lang.Object r2 = r8.get(r1)
            y07 r2 = (defpackage.y07) r2
            long r13 = r13 + r18
            r9.<init>((defpackage.y07) r2, (long) r13, (int) r1)
            goto L_0x0219
        L_0x0218:
            r9 = 0
        L_0x0219:
            if (r9 != 0) goto L_0x024e
            boolean r1 = r15.o
            if (r1 != 0) goto L_0x0230
            r7.o = r3
            boolean r1 = r0.s
            android.net.Uri r2 = r0.o
            boolean r2 = r3.equals(r2)
            r1 = r1 & r2
            r0.s = r1
            r0.o = r3
            goto L_0x019b
        L_0x0230:
            if (r21 != 0) goto L_0x0238
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x023a
        L_0x0238:
            r0 = 1
            goto L_0x0250
        L_0x023a:
            h07 r9 = new h07
            java.lang.Object r1 = defpackage.b0h.w(r4)
            y07 r1 = (defpackage.y07) r1
            int r2 = r4.size()
            long r13 = (long) r2
            long r10 = r10 + r13
            long r10 = r10 - r18
            r2 = -1
            r9.<init>((defpackage.y07) r1, (long) r10, (int) r2)
        L_0x024e:
            r1 = 0
            goto L_0x0254
        L_0x0250:
            r7.b = r0
            goto L_0x019b
        L_0x0254:
            r0.s = r1
            r1 = 0
            r0.o = r1
            java.lang.Comparable r1 = r9.d
            y07 r1 = (defpackage.y07) r1
            w07 r2 = r1.b
            java.lang.String r4 = r15.a
            if (r2 == 0) goto L_0x026d
            java.lang.String r2 = r2.x
            if (r2 != 0) goto L_0x0268
            goto L_0x026d
        L_0x0268:
            android.net.Uri r2 = defpackage.tf6.k0(r4, r2)
            goto L_0x026e
        L_0x026d:
            r2 = 0
        L_0x026e:
            b07 r8 = r0.d(r2, r12)
            r7.c = r8
            if (r8 == 0) goto L_0x0278
        L_0x0276:
            goto L_0x019b
        L_0x0278:
            java.lang.String r8 = r1.x
            if (r8 != 0) goto L_0x027e
            r8 = 0
            goto L_0x0282
        L_0x027e:
            android.net.Uri r8 = defpackage.tf6.k0(r4, r8)
        L_0x0282:
            b07 r10 = r0.d(r8, r12)
            r7.c = r10
            if (r10 == 0) goto L_0x028b
            goto L_0x0276
        L_0x028b:
            long r10 = r1.v
            if (r5 != 0) goto L_0x0296
            java.util.concurrent.atomic.AtomicInteger r13 = defpackage.o07.U0
        L_0x0291:
            r19 = r7
            r53 = 0
            goto L_0x02cd
        L_0x0296:
            android.net.Uri r13 = r5.v0
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x02a3
            boolean r13 = r5.Q0
            if (r13 == 0) goto L_0x02a3
            goto L_0x0291
        L_0x02a3:
            long r13 = r16 + r10
            boolean r6 = r1 instanceof defpackage.s07
            r19 = r7
            boolean r7 = r15.c
            if (r6 == 0) goto L_0x02bf
            r6 = r1
            s07 r6 = (defpackage.s07) r6
            boolean r6 = r6.Z
            if (r6 != 0) goto L_0x02bd
            int r6 = r9.b
            if (r6 != 0) goto L_0x02bb
            if (r7 == 0) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r6 = 0
            goto L_0x02be
        L_0x02bd:
            r6 = 1
        L_0x02be:
            r7 = r6
        L_0x02bf:
            if (r7 == 0) goto L_0x02ca
            long r6 = r5.y
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            r6 = 0
            goto L_0x02cb
        L_0x02ca:
            r6 = 1
        L_0x02cb:
            r53 = r6
        L_0x02cd:
            boolean r6 = r9.c
            if (r53 == 0) goto L_0x02d7
            if (r6 == 0) goto L_0x02d7
            r0 = r19
            goto L_0x0476
        L_0x02d7:
            ca6[] r7 = r0.f
            r28 = r7[r12]
            ld5 r7 = r0.q
            int r35 = r7.k()
            ld5 r7 = r0.q
            java.lang.Object r36 = r7.m()
            boolean r7 = r0.l
            wie r12 = r0.j
            if (r8 != 0) goto L_0x02f2
            r12.getClass()
            r8 = 0
            goto L_0x02fc
        L_0x02f2:
            java.lang.Object r13 = r12.b
            wi6 r13 = (defpackage.wi6) r13
            java.lang.Object r8 = r13.get(r8)
            byte[] r8 = (byte[]) r8
        L_0x02fc:
            if (r2 != 0) goto L_0x0300
            r2 = 0
            goto L_0x030a
        L_0x0300:
            java.lang.Object r12 = r12.b
            wi6 r12 = (defpackage.wi6) r12
            java.lang.Object r2 = r12.get(r2)
            byte[] r2 = (byte[]) r2
        L_0x030a:
            java.util.concurrent.atomic.AtomicInteger r12 = defpackage.o07.U0
            java.util.Map r43 = java.util.Collections.emptyMap()
            java.lang.String r12 = r1.a
            android.net.Uri r38 = defpackage.tf6.k0(r4, r12)
            if (r6 == 0) goto L_0x031d
            r12 = 8
            r49 = r12
            goto L_0x031f
        L_0x031d:
            r49 = 0
        L_0x031f:
            if (r38 == 0) goto L_0x0533
            p74 r27 = new p74
            r48 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            long r12 = r1.z
            r14 = r6
            r20 = r7
            long r6 = r1.X
            r37 = r27
            r44 = r12
            r46 = r6
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r8 == 0) goto L_0x0342
            r29 = 1
            goto L_0x0344
        L_0x0342:
            r29 = 0
        L_0x0344:
            if (r29 == 0) goto L_0x0350
            java.lang.String r6 = r1.y
            r6.getClass()
            byte[] r6 = defpackage.o07.e(r6)
            goto L_0x0351
        L_0x0350:
            r6 = 0
        L_0x0351:
            h74 r7 = r0.b
            if (r8 == 0) goto L_0x0360
            r6.getClass()
            ec r12 = new ec
            r12.<init>(r7, r8, r6)
            r26 = r12
            goto L_0x0362
        L_0x0360:
            r26 = r7
        L_0x0362:
            w07 r6 = r1.b
            if (r6 == 0) goto L_0x03b6
            if (r2 == 0) goto L_0x036a
            r8 = 1
            goto L_0x036b
        L_0x036a:
            r8 = 0
        L_0x036b:
            if (r8 == 0) goto L_0x0377
            java.lang.String r12 = r6.y
            r12.getClass()
            byte[] r12 = defpackage.o07.e(r12)
            goto L_0x0378
        L_0x0377:
            r12 = 0
        L_0x0378:
            java.lang.String r13 = r6.a
            android.net.Uri r38 = defpackage.tf6.k0(r4, r13)
            p74 r4 = new p74
            r56 = r8
            r13 = r9
            long r8 = r6.z
            r21 = r13
            r57 = r14
            long r13 = r6.X
            java.util.Map r43 = java.util.Collections.emptyMap()
            r49 = 0
            r50 = 0
            r39 = 0
            r41 = 1
            r42 = 0
            r48 = 0
            r37 = r4
            r44 = r8
            r46 = r13
            r37.<init>(r38, r39, r41, r42, r43, r44, r46, r48, r49, r50)
            if (r2 == 0) goto L_0x03b0
            r12.getClass()
            ec r6 = new ec
            r6.<init>(r7, r2, r12)
            r9 = r6
            goto L_0x03b1
        L_0x03b0:
            r9 = r7
        L_0x03b1:
            r32 = r56
            r30 = r9
            goto L_0x03bf
        L_0x03b6:
            r21 = r9
            r57 = r14
            r4 = 0
            r30 = 0
            r32 = 0
        L_0x03bf:
            long r37 = r16 + r10
            long r6 = r1.c
            long r39 = r37 + r6
            int r2 = r15.j
            int r6 = r1.o
            int r2 = r2 + r6
            if (r5 == 0) goto L_0x0414
            p74 r6 = r5.z0
            if (r4 == r6) goto L_0x03e9
            if (r4 == 0) goto L_0x03e7
            if (r6 == 0) goto L_0x03e7
            android.net.Uri r7 = r4.a
            android.net.Uri r8 = r6.a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x03e7
            long r7 = r4.f
            long r9 = r6.f
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x03e7
            goto L_0x03e9
        L_0x03e7:
            r6 = 0
            goto L_0x03ea
        L_0x03e9:
            r6 = 1
        L_0x03ea:
            android.net.Uri r7 = r5.v0
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x03f8
            boolean r7 = r5.Q0
            if (r7 == 0) goto L_0x03f8
            r7 = 1
            goto L_0x03f9
        L_0x03f8:
            r7 = 0
        L_0x03f9:
            if (r6 == 0) goto L_0x0408
            if (r7 == 0) goto L_0x0408
            boolean r6 = r5.S0
            if (r6 != 0) goto L_0x0408
            int r6 = r5.Z
            if (r6 != r2) goto L_0x0408
            jk3 r9 = r5.L0
            goto L_0x0409
        L_0x0408:
            r9 = 0
        L_0x0409:
            r77 r6 = r5.H0
            g1g r5 = r5.I0
            r52 = r5
            r51 = r6
            r50 = r9
            goto L_0x0427
        L_0x0414:
            r77 r5 = new r77
            r6 = 0
            r5.<init>(r6)
            g1g r7 = new g1g
            r8 = 10
            r7.<init>((int) r8)
            r51 = r5
            r50 = r6
            r52 = r7
        L_0x0427:
            o07 r5 = new o07
            r6 = 1
            r44 = r57 ^ 1
            pl7 r6 = r0.d
            android.util.SparseArray r6 = r6.a
            java.lang.Object r7 = r6.get(r2)
            qkf r7 = (defpackage.qkf) r7
            if (r7 != 0) goto L_0x0445
            qkf r7 = new qkf
            r8 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r7.<init>(r8)
            r6.put(r2, r7)
        L_0x0445:
            r48 = r7
            r9 = r21
            int r6 = r9.b
            r43 = r6
            boolean r6 = r1.Y
            r46 = r6
            l07 r6 = r0.a
            r25 = r6
            java.util.List r6 = r0.i
            r34 = r6
            long r6 = r9.a
            r41 = r6
            xv4 r1 = r1.w
            r49 = r1
            lpb r0 = r0.k
            r54 = r0
            r24 = r5
            r31 = r4
            r33 = r3
            r45 = r2
            r47 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0 = r19
            r0.c = r5
        L_0x0476:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            k03 r2 = (defpackage.k03) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x048f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r55
            r1.Z0 = r3
            r0 = 1
            r1.c1 = r0
            return r0
        L_0x048f:
            r1 = r55
            if (r2 != 0) goto L_0x04a8
            if (r0 == 0) goto L_0x04a6
            q07 r1 = r1.c
            vf4 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            tf4 r0 = (defpackage.tf4) r0
            android.net.Uri r1 = r0.a
            r0.c(r1)
        L_0x04a6:
            r0 = 0
            return r0
        L_0x04a8:
            boolean r0 = r2 instanceof defpackage.o07
            if (r0 == 0) goto L_0x04fe
            r0 = r2
            o07 r0 = (defpackage.o07) r0
            r1.g1 = r0
            ca6 r3 = r0.o
            r1.O0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.Z0 = r3
            java.util.ArrayList r3 = r1.w0
            r3.add(r0)
            qb7 r3 = defpackage.tb7.o()
            b27[] r4 = r1.E0
            int r5 = r4.length
            r6 = 0
        L_0x04c9:
            if (r6 >= r5) goto L_0x04dc
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x04c9
        L_0x04dc:
            k0d r3 = r3.j()
            r0.M0 = r1
            r0.R0 = r3
            b27[] r3 = r1.E0
            int r4 = r3.length
            r11 = 0
        L_0x04e8:
            if (r11 >= r4) goto L_0x04fe
            r5 = r3[r11]
            r5.getClass()
            int r6 = r0.Y
            r5.C = r6
            boolean r6 = r0.w0
            if (r6 == 0) goto L_0x04fb
            r6 = 1
            r5.G = r6
            goto L_0x04fc
        L_0x04fb:
            r6 = 1
        L_0x04fc:
            int r11 = r11 + r6
            goto L_0x04e8
        L_0x04fe:
            r1.D0 = r2
            gga r0 = r1.z
            int r3 = r2.c
            int r0 = r0.o(r3)
            r3 = r22
            long r8 = r3.P(r2, r1, r0)
            k28 r11 = new k28
            long r5 = r2.a
            p74 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.v
            java.lang.Object r0 = r2.w
            uz8 r10 = r1.Y
            int r12 = r2.c
            int r13 = r1.b
            ca6 r14 = r2.o
            long r3 = r2.x
            long r1 = r2.y
            r16 = r0
            r17 = r3
            r19 = r1
            r10.k(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
            return r0
        L_0x0533:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        L_0x053b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d27.M(long):boolean");
    }

    public final void a() {
        for (b27 b27 : this.E0) {
            b27.z(true);
            zv4 zv4 = b27.h;
            if (zv4 != null) {
                zv4.f(b27.e);
                b27.h = null;
                b27.g = null;
            }
        }
    }

    public final void b() {
        this.A0.post(this.y0);
    }

    public final void c() {
        y64.j(this.M0);
        this.R0.getClass();
        this.S0.getClass();
    }

    public final boolean d() {
        return this.X.M();
    }

    public final tpf e(rpf[] rpfArr) {
        for (int i = 0; i < rpfArr.length; i++) {
            rpf rpf = rpfArr[i];
            ca6[] ca6Arr = new ca6[rpf.a];
            for (int i2 = 0; i2 < rpf.a; i2++) {
                ca6 ca6 = rpf.c[i2];
                int b2 = this.x.b(ca6);
                aa6 a2 = ca6.a();
                a2.D = b2;
                ca6Arr[i2] = a2.a();
            }
            rpfArr[i] = new rpf(rpf.b, ca6Arr);
        }
        return new tpf(rpfArr);
    }

    public final void g(int i) {
        ArrayList arrayList;
        y64.j(!this.X.M());
        int i2 = i;
        loop0:
        while (true) {
            arrayList = this.w0;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    o07 o07 = (o07) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.E0.length) {
                        if (this.E0[i4].o() <= o07.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((o07) arrayList.get(i3)).w0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = h().y;
            o07 o072 = (o07) arrayList.get(i2);
            t0g.I(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.E0.length; i5++) {
                this.E0[i5].k(o072.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.Z0 = this.Y0;
            } else {
                ((o07) b0h.w(arrayList)).S0 = true;
            }
            this.c1 = false;
            int i6 = this.J0;
            long j2 = o072.x;
            uz8 uz8 = this.Y;
            uz8.m(new es8(1, i6, (Object) null, 3, (Object) null, uz8.a(j2), uz8.a(j)));
        }
    }

    public final o07 h() {
        return (o07) a81.h(1, this.w0);
    }

    public final long i() {
        if (k()) {
            return this.Z0;
        }
        if (this.c1) {
            return Long.MIN_VALUE;
        }
        return h().y;
    }

    public final boolean k() {
        return this.Z0 != -9223372036854775807L;
    }

    public final void l() {
        boolean z2;
        if (!this.Q0 && this.T0 == null && this.L0) {
            b27[] b27Arr = this.E0;
            int length = b27Arr.length;
            boolean z3 = false;
            int i = 0;
            while (i < length) {
                if (b27Arr[i].r() != null) {
                    i++;
                } else {
                    return;
                }
            }
            tpf tpf = this.R0;
            if (tpf != null) {
                int i2 = tpf.a;
                int[] iArr = new int[i2];
                this.T0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        b27[] b27Arr2 = this.E0;
                        if (i4 >= b27Arr2.length) {
                            break;
                        }
                        ca6 r = b27Arr2[i4].r();
                        y64.k(r);
                        ca6 ca6 = this.R0.a(i3).c[0];
                        String str = ca6.Z;
                        String str2 = r.Z;
                        int g = uq9.g(str2);
                        if (g == 3) {
                            if (t0g.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || r.M0 == ca6.M0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == uq9.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.T0[i3] = i4;
                }
                Iterator it = this.B0.iterator();
                while (it.hasNext()) {
                    ((v17) it.next()).a();
                }
                return;
            }
            int length2 = this.E0.length;
            int i5 = 0;
            int i6 = -1;
            int i7 = -2;
            while (true) {
                int i8 = 1;
                if (i5 >= length2) {
                    break;
                }
                ca6 r2 = this.E0[i5].r();
                y64.k(r2);
                String str3 = r2.Z;
                if (uq9.j(str3)) {
                    i8 = 2;
                } else if (!uq9.h(str3)) {
                    i8 = uq9.i(str3) ? 3 : -2;
                }
                if (j(i8) > j(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            rpf rpf = this.o.h;
            int i9 = rpf.a;
            this.U0 = -1;
            this.T0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.T0[i10] = i10;
            }
            rpf[] rpfArr = new rpf[length2];
            int i11 = 0;
            while (i11 < length2) {
                ca6 r3 = this.E0[i11].r();
                y64.k(r3);
                String str4 = this.a;
                ca6 ca62 = this.w;
                if (i11 == i6) {
                    ca6[] ca6Arr = new ca6[i9];
                    for (int i12 = z3; i12 < i9; i12++) {
                        ca6 ca63 = rpf.c[i12];
                        if (i7 == 1 && ca62 != null) {
                            ca63 = ca63.d(ca62);
                        }
                        ca6Arr[i12] = i9 == 1 ? r3.d(ca63) : f(ca63, r3, true);
                    }
                    rpfArr[i11] = new rpf(str4, ca6Arr);
                    this.U0 = i11;
                    z2 = false;
                } else {
                    if (i7 != 2 || !uq9.h(r3.Z)) {
                        ca62 = null;
                    }
                    int i13 = i11 < i6 ? i11 : i11 - 1;
                    StringBuilder sb = new StringBuilder(g63.f(18, str4));
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i13);
                    z2 = false;
                    rpfArr[i11] = new rpf(sb.toString(), f(ca62, r3, false));
                }
                i11++;
                z3 = z2;
            }
            boolean z4 = z3;
            this.R0 = e(rpfArr);
            y64.j(this.S0 == null ? true : z4);
            this.S0 = Collections.emptySet();
            this.M0 = true;
            this.c.h();
        }
    }

    public final void m() {
        this.X.b();
        i07 i07 = this.o;
        BehindLiveWindowException behindLiveWindowException = i07.n;
        if (behindLiveWindowException == null) {
            Uri uri = i07.o;
            if (uri != null && i07.s) {
                tf4 tf4 = (tf4) i07.g.b.get(uri);
                tf4.b.b();
                IOException iOException = tf4.X;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    public final void n(s28 s28, long j, long j2, boolean z2) {
        k03 k03 = (k03) s28;
        this.D0 = null;
        long j3 = k03.a;
        sne sne = k03.z;
        k28 k28 = new k28(j3, k03.b, sne.c, sne.o, j, j2, sne.b);
        this.z.getClass();
        k28 k282 = k28;
        this.Y.d(k282, k03.c, this.b, k03.o, k03.v, k03.w, k03.x, k03.y);
        if (!z2) {
            if (k() || this.N0 == 0) {
                p();
            }
            if (this.N0 > 0) {
                this.c.b(this);
            }
        }
    }

    public final void o(rpf[] rpfArr, int... iArr) {
        this.R0 = e(rpfArr);
        this.S0 = new HashSet();
        for (int a2 : iArr) {
            this.S0.add(this.R0.a(a2));
        }
        this.U0 = 0;
        Handler handler = this.A0;
        q07 q07 = this.c;
        Objects.requireNonNull(q07);
        handler.post(new y86(11, (Object) q07));
        this.M0 = true;
    }

    public final void p() {
        for (b27 z2 : this.E0) {
            z2.z(this.a1);
        }
        this.a1 = false;
    }

    public final boolean q(long j, boolean z2) {
        this.Y0 = j;
        if (k()) {
            this.Z0 = j;
            return true;
        }
        if (this.L0 && !z2) {
            int length = this.E0.length;
            int i = 0;
            while (i < length) {
                if (this.E0[i].A(j, false) || (!this.X0[i] && this.V0)) {
                    i++;
                }
            }
            return false;
        }
        this.Z0 = j;
        this.c1 = false;
        this.w0.clear();
        w28 w28 = this.X;
        if (w28.M()) {
            if (this.L0) {
                for (b27 i2 : this.E0) {
                    i2.i();
                }
            }
            w28.A();
        } else {
            w28.o = null;
            p();
        }
        return true;
    }

    public final void u(s28 s28, long j, long j2) {
        k03 k03 = (k03) s28;
        this.D0 = null;
        i07 i07 = this.o;
        i07.getClass();
        if (k03 instanceof b07) {
            b07 b07 = (b07) k03;
            i07.m = b07.X;
            Uri uri = b07.b.a;
            byte[] bArr = b07.Z;
            bArr.getClass();
            wie wie = i07.j;
            wie.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((wi6) wie.b).put(uri, bArr);
        }
        long j3 = k03.a;
        sne sne = k03.z;
        k28 k28 = new k28(j3, k03.b, sne.c, sne.o, j, j2, sne.b);
        this.z.getClass();
        k28 k282 = k28;
        this.Y.f(k282, k03.c, this.b, k03.o, k03.v, k03.w, k03.x, k03.y);
        if (!this.M0) {
            M(this.Y0);
        } else {
            this.c.b(this);
        }
    }

    public final void v() {
        this.d1 = true;
        this.A0.post(this.z0);
    }

    public final long y() {
        long j;
        if (this.c1) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.Z0;
        }
        long j2 = this.Y0;
        o07 h = h();
        if (!h.Q0) {
            ArrayList arrayList = this.w0;
            h = arrayList.size() > 1 ? (o07) a81.h(2, arrayList) : null;
        }
        if (h != null) {
            j2 = Math.max(j2, h.y);
        }
        if (this.L0) {
            for (b27 b27 : this.E0) {
                synchronized (b27) {
                    j = b27.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }
}
