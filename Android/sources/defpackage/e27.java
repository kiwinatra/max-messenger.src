package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
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

/* renamed from: e27  reason: default package */
public final class e27 implements q28, v28, qsd, xf5, hcd {
    public static final Set h1 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));
    public final Handler A0;
    public final ArrayList B0;
    public final Map C0;
    public m03 D0;
    public c27[] E0;
    public int[] F0;
    public final HashSet G0;
    public final SparseIntArray H0;
    public a27 I0;
    public int J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public ea6 O0;
    public ea6 P0;
    public boolean Q0;
    public upf R0;
    public Set S0;
    public int[] T0;
    public int U0;
    public boolean V0;
    public boolean[] W0;
    public final l15 X = new l15("Loader:HlsSampleStreamWrapper");
    public boolean[] X0;
    public final cs Y;
    public long Y0;
    public final int Z;
    public long Z0;
    public final String a;
    public boolean a1;
    public final int b;
    public boolean b1;
    public final b8d c;
    public boolean c1;
    public boolean d1;
    public long e1;
    public yv4 f1;
    public p07 g1;
    public final j07 o;
    public final cb4 v;
    public final he v0;
    public final ea6 w;
    public final ArrayList w0;
    public final pw4 x;
    public final List x0;
    public final gw4 y;
    public final y17 y0;
    public final nfd z;
    public final y17 z0;

    public e27(String str, int i, b8d b8d, j07 j07, Map map, cb4 cb4, long j, ea6 ea6, pw4 pw4, gw4 gw4, nfd nfd, cs csVar, int i2) {
        this.a = str;
        this.b = i;
        this.c = b8d;
        this.o = j07;
        this.C0 = map;
        this.v = cb4;
        this.w = ea6;
        this.x = pw4;
        this.y = gw4;
        this.z = nfd;
        this.Y = csVar;
        this.Z = i2;
        he heVar = new he(11, (byte) 0);
        heVar.c = null;
        heVar.b = false;
        heVar.o = null;
        this.v0 = heVar;
        this.F0 = new int[0];
        Set set = h1;
        this.G0 = new HashSet(set.size());
        this.H0 = new SparseIntArray(set.size());
        this.E0 = new c27[0];
        this.X0 = new boolean[0];
        this.W0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.w0 = arrayList;
        this.x0 = Collections.unmodifiableList(arrayList);
        this.B0 = new ArrayList();
        this.y0 = new y17(this, 0);
        this.z0 = new y17(this, 1);
        this.A0 = v0g.o((Handler.Callback) null);
        this.Y0 = j;
        this.Z0 = j;
    }

    public static ip4 e(int i, int i2) {
        i8b.V("Unmapped track with id " + i + " of type " + i2);
        return new ip4();
    }

    public static ea6 l(ea6 ea6, ea6 ea62, boolean z2) {
        String str;
        String str2;
        if (ea6 == null) {
            return ea62;
        }
        String str3 = ea62.n;
        int g = vq9.g(str3);
        String str4 = ea6.j;
        if (v0g.u(g, str4) == 1) {
            str2 = v0g.v(g, str4);
            str = vq9.c(str2);
        } else {
            String a2 = vq9.a(str4, str3);
            str = str3;
            str2 = a2;
        }
        ba6 a3 = ea62.a();
        a3.a = ea6.a;
        a3.b = ea6.b;
        a3.c = tb7.p(ea6.c);
        a3.d = ea6.d;
        a3.e = ea6.e;
        a3.f = ea6.f;
        a3.g = z2 ? ea6.g : -1;
        a3.h = z2 ? ea6.h : -1;
        a3.i = str2;
        if (g == 2) {
            a3.s = ea6.t;
            a3.t = ea6.u;
            a3.u = ea6.v;
        }
        if (str != null) {
            a3.d(str);
        }
        int i = ea6.B;
        if (i != -1 && g == 1) {
            a3.A = i;
        }
        sp9 sp9 = ea6.k;
        if (sp9 != null) {
            sp9 sp92 = ea62.k;
            if (sp92 != null) {
                sp9 = sp92.b(sp9);
            }
            a3.j = sp9;
        }
        return new ea6(a3);
    }

    public static int o(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public final void A(long j) {
        l15 l15 = this.X;
        if (!l15.s() && !p()) {
            boolean z2 = l15.z();
            j07 j07 = this.o;
            List list = this.x0;
            if (z2) {
                this.D0.getClass();
                if (j07.o != null ? false : j07.r.t(j, this.D0, list)) {
                    l15.j();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && j07.b((p07) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                m(size);
            }
            int size2 = (j07.o != null || j07.r.length() < 2) ? list.size() : j07.r.g(j, list);
            if (size2 < this.w0.size()) {
                m(size2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [ip4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zpf B(int r12, int r13) {
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
            if (r1 == 0) goto L_0x0045
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            boolean r1 = r2.contains(r1)
            defpackage.n79.g(r1)
            r1 = -1
            int r2 = r4.get(r13, r1)
            if (r2 != r1) goto L_0x0026
            goto L_0x0056
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
            c27[] r1 = r11.E0
            r1 = r1[r2]
        L_0x003e:
            r6 = r1
            goto L_0x0056
        L_0x0040:
            ip4 r1 = e(r12, r13)
            goto L_0x003e
        L_0x0045:
            r1 = r5
        L_0x0046:
            c27[] r2 = r11.E0
            int r7 = r2.length
            if (r1 >= r7) goto L_0x0056
            int[] r7 = r11.F0
            r7 = r7[r1]
            if (r7 != r12) goto L_0x0054
            r6 = r2[r1]
            goto L_0x0056
        L_0x0054:
            int r1 = r1 + r0
            goto L_0x0046
        L_0x0056:
            if (r6 != 0) goto L_0x00e8
            boolean r1 = r11.d1
            if (r1 == 0) goto L_0x0061
            ip4 r11 = e(r12, r13)
            return r11
        L_0x0061:
            c27[] r1 = r11.E0
            int r1 = r1.length
            if (r13 == r0) goto L_0x0069
            r2 = 2
            if (r13 != r2) goto L_0x006a
        L_0x0069:
            r5 = r0
        L_0x006a:
            c27 r6 = new c27
            cb4 r2 = r11.v
            java.util.Map r7 = r11.C0
            pw4 r8 = r11.x
            gw4 r9 = r11.y
            r6.<init>(r2, r8, r9, r7)
            long r7 = r11.Y0
            r6.t = r7
            if (r5 == 0) goto L_0x0083
            yv4 r2 = r11.f1
            r6.I = r2
            r6.z = r0
        L_0x0083:
            long r7 = r11.e1
            long r9 = r6.F
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x008f
            r6.F = r7
            r6.z = r0
        L_0x008f:
            p07 r2 = r11.g1
            if (r2 == 0) goto L_0x0098
            int r2 = r2.Y
            long r7 = (long) r2
            r6.C = r7
        L_0x0098:
            r6.f = r11
            int[] r2 = r11.F0
            int r7 = r1 + 1
            int[] r2 = java.util.Arrays.copyOf(r2, r7)
            r11.F0 = r2
            r2[r1] = r12
            c27[] r12 = r11.E0
            int r2 = defpackage.v0g.a
            int r2 = r12.length
            int r2 = r2 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r12, r2)
            int r12 = r12.length
            r0[r12] = r6
            c27[] r0 = (defpackage.c27[]) r0
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
            int r12 = o(r13)
            int r0 = r11.J0
            int r0 = o(r0)
            if (r12 <= r0) goto L_0x00e0
            r11.K0 = r1
            r11.J0 = r13
        L_0x00e0:
            boolean[] r12 = r11.W0
            boolean[] r12 = java.util.Arrays.copyOf(r12, r7)
            r11.W0 = r12
        L_0x00e8:
            r12 = 5
            if (r13 != r12) goto L_0x00fb
            a27 r12 = r11.I0
            if (r12 != 0) goto L_0x00f8
            a27 r12 = new a27
            int r13 = r11.Z
            r12.<init>(r6, r13)
            r11.I0 = r12
        L_0x00f8:
            a27 r11 = r11.I0
            return r11
        L_0x00fb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e27.B(int, int):zpf");
    }

    public final void C() {
        for (c27 y2 : this.E0) {
            y2.y(this.a1);
        }
        this.a1 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r11 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(long r9, boolean r11) {
        /*
            r8 = this;
            r8.Y0 = r9
            boolean r0 = r8.p()
            r1 = 1
            if (r0 == 0) goto L_0x000c
            r8.Z0 = r9
            return r1
        L_0x000c:
            j07 r0 = r8.o
            boolean r0 = r0.q
            r2 = 0
            java.util.ArrayList r3 = r8.w0
            r4 = 0
            if (r0 == 0) goto L_0x002d
            r0 = r4
        L_0x0017:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x002d
            java.lang.Object r5 = r3.get(r0)
            p07 r5 = (defpackage.p07) r5
            long r6 = r5.x
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x002d:
            r5 = r2
        L_0x002e:
            boolean r0 = r8.L0
            if (r0 == 0) goto L_0x0062
            if (r11 != 0) goto L_0x0062
            c27[] r11 = r8.E0
            int r11 = r11.length
            r0 = r4
        L_0x0038:
            if (r0 >= r11) goto L_0x005e
            c27[] r6 = r8.E0
            r6 = r6[r0]
            if (r5 == 0) goto L_0x0049
            int r7 = r5.f(r0)
            boolean r6 = r6.z(r7)
            goto L_0x004d
        L_0x0049:
            boolean r6 = r6.A(r9, r4)
        L_0x004d:
            if (r6 != 0) goto L_0x005b
            boolean[] r6 = r8.X0
            boolean r6 = r6[r0]
            if (r6 != 0) goto L_0x0059
            boolean r6 = r8.V0
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r11 = r4
            goto L_0x005f
        L_0x005b:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x005e:
            r11 = r1
        L_0x005f:
            if (r11 == 0) goto L_0x0062
            return r4
        L_0x0062:
            r8.Z0 = r9
            r8.c1 = r4
            r3.clear()
            l15 r9 = r8.X
            boolean r10 = r9.z()
            if (r10 == 0) goto L_0x0086
            boolean r10 = r8.L0
            if (r10 == 0) goto L_0x0082
            c27[] r8 = r8.E0
            int r10 = r8.length
        L_0x0078:
            if (r4 >= r10) goto L_0x0082
            r11 = r8[r4]
            r11.h()
            int r4 = r4 + 1
            goto L_0x0078
        L_0x0082:
            r9.j()
            goto L_0x008b
        L_0x0086:
            r9.c = r2
            r8.C()
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e27.D(long, boolean):boolean");
    }

    public final void E(t28 t28, long j, long j2, boolean z2) {
        m03 m03 = (m03) t28;
        this.D0 = null;
        long j3 = m03.a;
        tne tne = m03.z;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.z.getClass();
        this.Y.v(l28, m03.c, this.b, m03.o, m03.v, m03.w, m03.x, m03.y);
        if (!z2) {
            if (p() || this.N0 == 0) {
                C();
            }
            if (this.N0 > 0) {
                this.c.c(this);
            }
        }
    }

    public final void H(t28 t28, long j, long j2) {
        m03 m03 = (m03) t28;
        this.D0 = null;
        j07 j07 = this.o;
        j07.getClass();
        if (m03 instanceof c07) {
            c07 c07 = (c07) m03;
            j07.n = c07.X;
            Uri uri = c07.b.a;
            byte[] bArr = c07.Z;
            bArr.getClass();
            e4 e4Var = j07.j;
            e4Var.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((wi6) e4Var.b).put(uri, bArr);
        }
        long j3 = m03.a;
        tne tne = m03.z;
        Uri uri2 = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.z.getClass();
        this.Y.x(l28, m03.c, this.b, m03.o, m03.v, m03.w, m03.x, m03.y);
        if (!this.M0) {
            c38 c38 = new c38();
            c38.a = this.Y0;
            k(new d38(c38));
            return;
        }
        this.c.c(this);
    }

    public final void M(snd snd) {
    }

    public final p01 Z(t28 t28, long j, long j2, IOException iOException, int i) {
        boolean z2;
        p01 p01;
        int i2;
        IOException iOException2 = iOException;
        m03 m03 = (m03) t28;
        boolean z3 = m03 instanceof p07;
        if (z3 && !((p07) m03).U0 && (iOException2 instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException2).o) == 410 || i2 == 404)) {
            return l15.o;
        }
        long j3 = m03.z.b;
        tne tne = m03.z;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        v0g.h0(m03.x);
        v0g.h0(m03.y);
        j28 j28 = new j28(i, iOException2);
        j07 j07 = this.o;
        z35 o2 = h88.o(j07.r);
        this.z.getClass();
        p01 o3 = nfd.o(o2, j28);
        boolean z4 = false;
        if (o3 == null || o3.b != 2) {
            z2 = false;
        } else {
            md5 md5 = j07.r;
            z2 = md5.u(md5.p(j07.h.d(m03.o)), o3.c);
        }
        if (z2) {
            if (z3 && j3 == 0) {
                ArrayList arrayList = this.w0;
                if (((p07) arrayList.remove(arrayList.size() - 1)) == m03) {
                    z4 = true;
                }
                n79.n(z4);
                if (arrayList.isEmpty()) {
                    this.Z0 = this.Y0;
                } else {
                    ((p07) b0h.w(arrayList)).T0 = true;
                }
            }
            p01 = l15.v;
        } else {
            long q = nfd.q(j28);
            p01 = q != -9223372036854775807L ? new p01(q, 0, 5, false) : l15.w;
        }
        p01 p012 = p01;
        boolean z5 = !p012.a();
        this.Y.z(l28, m03.c, this.b, m03.o, m03.v, m03.w, m03.x, m03.y, iOException, z5);
        if (z5) {
            this.D0 = null;
        }
        if (z2) {
            if (!this.M0) {
                c38 c38 = new c38();
                c38.a = this.Y0;
                k(new d38(c38));
            } else {
                this.c.c(this);
            }
        }
        return p012;
    }

    public final void a() {
        for (c27 c27 : this.E0) {
            c27.y(true);
            aw4 aw4 = c27.h;
            if (aw4 != null) {
                aw4.f(c27.e);
                c27.h = null;
                c27.g = null;
            }
        }
    }

    public final void b() {
        this.A0.post(this.y0);
    }

    public final void c() {
        n79.n(this.M0);
        this.R0.getClass();
        this.S0.getClass();
    }

    public final boolean d() {
        return this.X.z();
    }

    public final upf f(spf[] spfArr) {
        for (int i = 0; i < spfArr.length; i++) {
            spf spf = spfArr[i];
            ea6[] ea6Arr = new ea6[spf.a];
            for (int i2 = 0; i2 < spf.a; i2++) {
                ea6 ea6 = spf.d[i2];
                int d = this.x.d(ea6);
                ba6 a2 = ea6.a();
                a2.J = d;
                ea6Arr[i2] = a2.a();
            }
            spfArr[i] = new spf(spf.b, ea6Arr);
        }
        return new upf(spfArr);
    }

    public final long i() {
        if (p()) {
            return this.Z0;
        }
        if (this.c1) {
            return Long.MIN_VALUE;
        }
        return n().y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(defpackage.d38 r60) {
        /*
            r59 = this;
            r0 = r59
            r1 = 1
            boolean r2 = r0.c1
            r3 = 0
            if (r2 != 0) goto L_0x0016
            l15 r2 = r0.X
            boolean r4 = r2.z()
            if (r4 != 0) goto L_0x0016
            boolean r4 = r2.s()
            if (r4 == 0) goto L_0x0019
        L_0x0016:
            r0 = r3
            goto L_0x0583
        L_0x0019:
            boolean r4 = r59.p()
            if (r4 == 0) goto L_0x0035
            java.util.List r4 = java.util.Collections.emptyList()
            long r5 = r0.Z0
            c27[] r7 = r0.E0
            int r8 = r7.length
            r9 = r3
        L_0x0029:
            if (r9 >= r8) goto L_0x0033
            r10 = r7[r9]
            long r11 = r0.Z0
            r10.t = r11
            int r9 = r9 + r1
            goto L_0x0029
        L_0x0033:
            r14 = r4
            goto L_0x004d
        L_0x0035:
            p07 r4 = r59.n()
            boolean r5 = r4.R0
            if (r5 == 0) goto L_0x0041
            long r4 = r4.y
        L_0x003f:
            r5 = r4
            goto L_0x004a
        L_0x0041:
            long r5 = r0.Y0
            long r7 = r4.x
            long r4 = java.lang.Math.max(r5, r7)
            goto L_0x003f
        L_0x004a:
            java.util.List r4 = r0.x0
            goto L_0x0033
        L_0x004d:
            he r4 = r0.v0
            r15 = 0
            r4.c = r15
            r4.b = r3
            r4.o = r15
            boolean r7 = r0.M0
            if (r7 != 0) goto L_0x0064
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r16 = r3
            goto L_0x0066
        L_0x0064:
            r16 = r1
        L_0x0066:
            j07 r12 = r0.o
            r12.getClass()
            boolean r7 = r14.isEmpty()
            if (r7 == 0) goto L_0x0073
            r13 = r15
            goto L_0x007a
        L_0x0073:
            java.lang.Object r7 = defpackage.b0h.w(r14)
            p07 r7 = (defpackage.p07) r7
            r13 = r7
        L_0x007a:
            if (r13 != 0) goto L_0x0080
            r7 = r60
            r11 = -1
            goto L_0x008b
        L_0x0080:
            spf r7 = r12.h
            ea6 r8 = r13.o
            int r7 = r7.d(r8)
            r11 = r7
            r7 = r60
        L_0x008b:
            long r8 = r7.a
            long r17 = r5 - r8
            r20 = r11
            long r10 = r12.s
            r21 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00a0
            long r10 = r10 - r8
            goto L_0x00a1
        L_0x00a0:
            r10 = r1
        L_0x00a1:
            if (r13 == 0) goto L_0x00ca
            boolean r7 = r12.q
            if (r7 != 0) goto L_0x00ca
            r22 = r4
            long r3 = r13.y
            long r1 = r13.x
            long r3 = r3 - r1
            long r1 = r17 - r3
            r23 = r14
            r14 = 0
            long r1 = java.lang.Math.max(r14, r1)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x00c8
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r14, r10)
        L_0x00c6:
            r10 = r1
            goto L_0x00d1
        L_0x00c8:
            r3 = r10
            goto L_0x00c6
        L_0x00ca:
            r22 = r4
            r23 = r14
            r3 = r10
            r10 = r17
        L_0x00d1:
            an8[] r15 = r12.a(r13, r5)
            md5 r7 = r12.r
            r1 = r20
            r2 = -1
            r14 = r12
            r60 = r13
            r12 = r3
            r3 = r14
            r14 = r23
            r4 = 0
            r7.r(r8, r10, r12, r14, r15)
            md5 r7 = r3.r
            int r12 = r7.i()
            if (r1 == r12) goto L_0x00ef
            r13 = 1
            goto L_0x00f0
        L_0x00ef:
            r13 = 0
        L_0x00f0:
            android.net.Uri[] r14 = r3.e
            r15 = r14[r12]
            vf4 r10 = r3.g
            boolean r7 = r10.d(r15)
            if (r7 != 0) goto L_0x0110
            r7 = r22
            r7.o = r15
            boolean r1 = r3.t
            android.net.Uri r2 = r3.p
            boolean r2 = r15.equals(r2)
            r1 = r1 & r2
            r3.t = r1
            r3.p = r15
            r0 = r7
            goto L_0x04c3
        L_0x0110:
            r7 = r22
            r8 = 1
            c17 r11 = r10.b(r15, r8)
            r11.getClass()
            boolean r8 = r11.c
            r3.q = r8
            boolean r8 = r11.o
            r17 = r5
            long r4 = r11.h
            if (r8 == 0) goto L_0x012d
            r8 = r3
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0138
        L_0x012d:
            long r8 = r11.u
            long r8 = r8 + r4
            r19 = r3
            long r2 = r10.x
            long r2 = r8 - r2
            r8 = r19
        L_0x0138:
            r8.s = r2
            long r2 = r10.x
            long r2 = r4 - r2
            r9 = r7
            r7 = 0
            r4 = r8
            r5 = r60
            r6 = r13
            r19 = r12
            r12 = r7
            r7 = r11
            r22 = r8
            r12 = r9
            r8 = r2
            r24 = r2
            r3 = r10
            r2 = r11
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r7 = r2.k
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a6
            r10 = r60
            if (r10 == 0) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            r15 = r14[r1]
            r2 = 1
            c17 r13 = r3.b(r15, r2)
            r13.getClass()
            long r4 = r3.x
            long r6 = r13.h
            long r24 = r6 - r4
            r6 = 0
            r4 = r22
            r5 = r10
            r7 = r13
            r8 = r24
            r2 = r10
            r10 = r17
            android.util.Pair r4 = r4.c(r5, r6, r7, r8, r10)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r11 = r1
            r7 = r2
            r2 = r13
            goto L_0x01aa
        L_0x01a4:
            r7 = r10
            goto L_0x01a8
        L_0x01a6:
            r7 = r60
        L_0x01a8:
            r11 = r19
        L_0x01aa:
            if (r11 == r1) goto L_0x01be
            r8 = -1
            if (r1 == r8) goto L_0x01be
            r1 = r14[r1]
            java.util.HashMap r3 = r3.b
            java.lang.Object r1 = r3.get(r1)
            uf4 r1 = (defpackage.uf4) r1
            if (r1 == 0) goto L_0x01be
            r3 = 0
            r1.Y = r3
        L_0x01be:
            long r8 = r2.k
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x01d0
            androidx.media3.exoplayer.source.BehindLiveWindowException r1 = new androidx.media3.exoplayer.source.BehindLiveWindowException
            r1.<init>()
            r3 = r22
            r3.o = r1
        L_0x01cd:
            r0 = r12
            goto L_0x04c3
        L_0x01d0:
            r3 = r22
            long r13 = r5 - r8
            int r1 = (int) r13
            tb7 r10 = r2.r
            int r13 = r10.size()
            r17 = 1
            tb7 r14 = r2.s
            if (r1 != r13) goto L_0x01fb
            r13 = -1
            if (r4 == r13) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            r4 = 0
        L_0x01e6:
            int r1 = r14.size()
            if (r4 >= r1) goto L_0x01f8
            h07 r1 = new h07
            java.lang.Object r13 = r14.get(r4)
            z07 r13 = (defpackage.z07) r13
            r1.<init>((defpackage.z07) r13, (long) r5, (int) r4)
            goto L_0x01f9
        L_0x01f8:
            r1 = 0
        L_0x01f9:
            r0 = r1
            goto L_0x024d
        L_0x01fb:
            java.lang.Object r13 = r10.get(r1)
            x07 r13 = (defpackage.x07) r13
            r0 = -1
            if (r4 != r0) goto L_0x020a
            h07 r1 = new h07
            r1.<init>((defpackage.z07) r13, (long) r5, (int) r0)
            goto L_0x01f9
        L_0x020a:
            tb7 r0 = r13.v0
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0220
            h07 r0 = new h07
            tb7 r1 = r13.v0
            java.lang.Object r1 = r1.get(r4)
            z07 r1 = (defpackage.z07) r1
            r0.<init>((defpackage.z07) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0220:
            r0 = 1
            int r1 = r1 + r0
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0237
            h07 r0 = new h07
            java.lang.Object r1 = r10.get(r1)
            z07 r1 = (defpackage.z07) r1
            long r5 = r5 + r17
            r4 = -1
            r0.<init>((defpackage.z07) r1, (long) r5, (int) r4)
            goto L_0x024d
        L_0x0237:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x024c
            h07 r0 = new h07
            r1 = 0
            java.lang.Object r4 = r14.get(r1)
            z07 r4 = (defpackage.z07) r4
            long r5 = r5 + r17
            r0.<init>((defpackage.z07) r4, (long) r5, (int) r1)
            goto L_0x024d
        L_0x024c:
            r0 = 0
        L_0x024d:
            if (r0 != 0) goto L_0x0282
            boolean r0 = r2.o
            if (r0 != 0) goto L_0x0264
            r12.o = r15
            boolean r0 = r3.t
            android.net.Uri r1 = r3.p
            boolean r1 = r15.equals(r1)
            r0 = r0 & r1
            r3.t = r0
            r3.p = r15
            goto L_0x01cd
        L_0x0264:
            if (r16 != 0) goto L_0x026c
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x026e
        L_0x026c:
            r0 = 1
            goto L_0x0284
        L_0x026e:
            h07 r0 = new h07
            java.lang.Object r1 = defpackage.b0h.w(r10)
            z07 r1 = (defpackage.z07) r1
            int r4 = r10.size()
            long r4 = (long) r4
            long r8 = r8 + r4
            long r8 = r8 - r17
            r4 = -1
            r0.<init>((defpackage.z07) r1, (long) r8, (int) r4)
        L_0x0282:
            r1 = 0
            goto L_0x0288
        L_0x0284:
            r12.b = r0
            goto L_0x01cd
        L_0x0288:
            r3.t = r1
            r1 = 0
            r3.p = r1
            android.os.SystemClock.elapsedRealtime()
            java.lang.Comparable r1 = r0.d
            z07 r1 = (defpackage.z07) r1
            x07 r4 = r1.b
            java.lang.String r5 = r2.a
            if (r4 == 0) goto L_0x02a5
            java.lang.String r4 = r4.x
            if (r4 != 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            android.net.Uri r4 = defpackage.hi7.V(r5, r4)
        L_0x02a3:
            r6 = 1
            goto L_0x02a7
        L_0x02a5:
            r4 = 0
            goto L_0x02a3
        L_0x02a7:
            c07 r8 = r3.d(r4, r11, r6)
            r12.c = r8
            if (r8 == 0) goto L_0x02b1
        L_0x02af:
            goto L_0x01cd
        L_0x02b1:
            java.lang.String r6 = r1.x
            if (r6 != 0) goto L_0x02b8
            r6 = 0
        L_0x02b6:
            r8 = 0
            goto L_0x02bd
        L_0x02b8:
            android.net.Uri r6 = defpackage.hi7.V(r5, r6)
            goto L_0x02b6
        L_0x02bd:
            c07 r9 = r3.d(r6, r11, r8)
            r12.c = r9
            if (r9 == 0) goto L_0x02c6
            goto L_0x02af
        L_0x02c6:
            long r8 = r1.v
            if (r7 != 0) goto L_0x02d3
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.p07.V0
        L_0x02cc:
            r16 = r8
            r22 = r12
            r57 = 0
            goto L_0x030c
        L_0x02d3:
            android.net.Uri r10 = r7.v0
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x02e0
            boolean r10 = r7.R0
            if (r10 == 0) goto L_0x02e0
            goto L_0x02cc
        L_0x02e0:
            long r13 = r24 + r8
            boolean r10 = r1 instanceof defpackage.t07
            r22 = r12
            boolean r12 = r2.c
            if (r10 == 0) goto L_0x02fc
            r10 = r1
            t07 r10 = (defpackage.t07) r10
            boolean r10 = r10.Z
            if (r10 != 0) goto L_0x02fa
            int r10 = r0.b
            if (r10 != 0) goto L_0x02f8
            if (r12 == 0) goto L_0x02f8
            goto L_0x02fa
        L_0x02f8:
            r10 = 0
            goto L_0x02fb
        L_0x02fa:
            r10 = 1
        L_0x02fb:
            r12 = r10
        L_0x02fc:
            r16 = r8
            if (r12 == 0) goto L_0x0309
            long r8 = r7.y
            int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r8 = 0
            goto L_0x030a
        L_0x0309:
            r8 = 1
        L_0x030a:
            r57 = r8
        L_0x030c:
            boolean r8 = r0.c
            if (r57 == 0) goto L_0x0316
            if (r8 == 0) goto L_0x0316
            r0 = r22
            goto L_0x04c3
        L_0x0316:
            ea6[] r9 = r3.f
            r30 = r9[r11]
            md5 r9 = r3.r
            int r37 = r9.k()
            md5 r9 = r3.r
            java.lang.Object r38 = r9.m()
            boolean r9 = r3.m
            e4 r10 = r3.j
            if (r6 != 0) goto L_0x0331
            r10.getClass()
            r6 = 0
            goto L_0x033b
        L_0x0331:
            java.lang.Object r11 = r10.b
            wi6 r11 = (defpackage.wi6) r11
            java.lang.Object r6 = r11.get(r6)
            byte[] r6 = (byte[]) r6
        L_0x033b:
            if (r4 != 0) goto L_0x033f
            r4 = 0
            goto L_0x0349
        L_0x033f:
            java.lang.Object r10 = r10.b
            wi6 r10 = (defpackage.wi6) r10
            java.lang.Object r4 = r10.get(r4)
            byte[] r4 = (byte[]) r4
        L_0x0349:
            java.util.concurrent.atomic.AtomicInteger r10 = defpackage.p07.V0
            java.util.Map r45 = java.util.Collections.emptyMap()
            java.lang.String r10 = r1.a
            android.net.Uri r10 = defpackage.hi7.V(r5, r10)
            if (r8 == 0) goto L_0x035c
            r11 = 8
            r51 = r11
            goto L_0x035e
        L_0x035c:
            r51 = 0
        L_0x035e:
            java.lang.String r11 = "The uri must be set."
            defpackage.n79.p(r10, r11)
            q74 r29 = new q74
            r50 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r1.z
            r14 = r8
            r18 = r9
            long r8 = r1.X
            r39 = r29
            r40 = r10
            r46 = r12
            r48 = r8
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r6 == 0) goto L_0x0386
            r31 = 1
            goto L_0x0388
        L_0x0386:
            r31 = 0
        L_0x0388:
            if (r31 == 0) goto L_0x0394
            java.lang.String r8 = r1.y
            r8.getClass()
            byte[] r8 = defpackage.p07.e(r8)
            goto L_0x0395
        L_0x0394:
            r8 = 0
        L_0x0395:
            j74 r9 = r3.b
            if (r6 == 0) goto L_0x03a4
            r8.getClass()
            fc r10 = new fc
            r10.<init>(r9, r6, r8)
            r28 = r10
            goto L_0x03a6
        L_0x03a4:
            r28 = r9
        L_0x03a6:
            x07 r6 = r1.b
            if (r6 == 0) goto L_0x03fc
            if (r4 == 0) goto L_0x03ae
            r8 = 1
            goto L_0x03af
        L_0x03ae:
            r8 = 0
        L_0x03af:
            if (r8 == 0) goto L_0x03bb
            java.lang.String r10 = r6.y
            r10.getClass()
            byte[] r10 = defpackage.p07.e(r10)
            goto L_0x03bc
        L_0x03bb:
            r10 = 0
        L_0x03bc:
            java.lang.String r12 = r6.a
            android.net.Uri r5 = defpackage.hi7.V(r5, r12)
            java.util.Map r45 = java.util.Collections.emptyMap()
            defpackage.n79.p(r5, r11)
            q74 r11 = new q74
            r51 = 0
            r52 = 0
            r41 = 0
            r43 = 1
            r44 = 0
            long r12 = r6.z
            r60 = r14
            r19 = r15
            long r14 = r6.X
            r50 = 0
            r39 = r11
            r40 = r5
            r46 = r12
            r48 = r14
            r39.<init>(r40, r41, r43, r44, r45, r46, r48, r50, r51, r52)
            if (r4 == 0) goto L_0x03f6
            r10.getClass()
            fc r5 = new fc
            r5.<init>(r9, r4, r10)
            r15 = r5
            goto L_0x03f7
        L_0x03f6:
            r15 = r9
        L_0x03f7:
            r34 = r8
            r32 = r15
            goto L_0x0405
        L_0x03fc:
            r60 = r14
            r19 = r15
            r11 = 0
            r32 = 0
            r34 = 0
        L_0x0405:
            long r39 = r24 + r16
            long r4 = r1.c
            long r41 = r39 + r4
            int r2 = r2.j
            int r4 = r1.o
            int r2 = r2 + r4
            if (r7 == 0) goto L_0x045c
            q74 r4 = r7.z0
            if (r11 == r4) goto L_0x042f
            if (r11 == 0) goto L_0x042d
            if (r4 == 0) goto L_0x042d
            android.net.Uri r5 = r11.a
            android.net.Uri r6 = r4.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x042d
            long r5 = r11.f
            long r8 = r4.f
            int r4 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r4 = 0
            goto L_0x0430
        L_0x042f:
            r4 = 1
        L_0x0430:
            android.net.Uri r5 = r7.v0
            r15 = r19
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x0440
            boolean r5 = r7.R0
            if (r5 == 0) goto L_0x0440
            r5 = 1
            goto L_0x0441
        L_0x0440:
            r5 = 0
        L_0x0441:
            if (r4 == 0) goto L_0x0450
            if (r5 == 0) goto L_0x0450
            boolean r4 = r7.T0
            if (r4 != 0) goto L_0x0450
            int r4 = r7.Z
            if (r4 != r2) goto L_0x0450
            pv0 r4 = r7.M0
            goto L_0x0451
        L_0x0450:
            r4 = 0
        L_0x0451:
            s77 r5 = r7.H0
            l8b r6 = r7.I0
            r54 = r4
            r55 = r5
        L_0x0459:
            r56 = r6
            goto L_0x0470
        L_0x045c:
            r15 = r19
            s77 r4 = new s77
            r5 = 0
            r4.<init>(r5)
            l8b r6 = new l8b
            r7 = 10
            r6.<init>((int) r7)
            r55 = r4
            r54 = r5
            goto L_0x0459
        L_0x0470:
            p07 r4 = new p07
            r5 = 1
            r46 = r60 ^ 1
            p1e r5 = r3.d
            java.lang.Object r5 = r5.a
            android.util.SparseArray r5 = (android.util.SparseArray) r5
            java.lang.Object r6 = r5.get(r2)
            rkf r6 = (defpackage.rkf) r6
            if (r6 != 0) goto L_0x0490
            rkf r6 = new rkf
            r7 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r6.<init>(r7)
            r5.put(r2, r6)
        L_0x0490:
            r50 = r6
            boolean r5 = r1.Y
            r48 = r5
            long r5 = r3.l
            r51 = r5
            m07 r5 = r3.a
            r27 = r5
            java.util.List r5 = r3.i
            r36 = r5
            long r5 = r0.a
            r43 = r5
            int r0 = r0.b
            r45 = r0
            yv4 r0 = r1.w
            r53 = r0
            mpb r0 = r3.k
            r58 = r0
            r26 = r4
            r33 = r11
            r35 = r15
            r47 = r2
            r49 = r18
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46, r47, r48, r49, r50, r51, r53, r54, r55, r56, r57, r58)
            r0 = r22
            r0.c = r4
        L_0x04c3:
            boolean r1 = r0.b
            java.lang.Object r2 = r0.c
            m03 r2 = (defpackage.m03) r2
            java.lang.Object r0 = r0.o
            android.net.Uri r0 = (android.net.Uri) r0
            if (r1 == 0) goto L_0x04dc
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r59
            r1.Z0 = r3
            r3 = 1
            r1.c1 = r3
            return r3
        L_0x04dc:
            r1 = r59
            r3 = 1
            if (r2 != 0) goto L_0x04f8
            if (r0 == 0) goto L_0x04f6
            b8d r1 = r1.c
            java.lang.Object r1 = r1.a
            r07 r1 = (defpackage.r07) r1
            vf4 r1 = r1.b
            java.util.HashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r0)
            uf4 r0 = (defpackage.uf4) r0
            r0.c(r3)
        L_0x04f6:
            r0 = 0
            return r0
        L_0x04f8:
            boolean r0 = r2 instanceof defpackage.p07
            if (r0 == 0) goto L_0x054f
            r0 = r2
            p07 r0 = (defpackage.p07) r0
            r1.g1 = r0
            ea6 r3 = r0.o
            r1.O0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.Z0 = r3
            java.util.ArrayList r3 = r1.w0
            r3.add(r0)
            qb7 r3 = defpackage.tb7.o()
            c27[] r4 = r1.E0
            int r5 = r4.length
            r6 = 0
        L_0x0519:
            if (r6 >= r5) goto L_0x052c
            r7 = r4[r6]
            int r8 = r7.q
            int r7 = r7.p
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.a(r7)
            r7 = 1
            int r6 = r6 + r7
            goto L_0x0519
        L_0x052c:
            k0d r3 = r3.j()
            r0.N0 = r1
            r0.S0 = r3
            c27[] r3 = r1.E0
            int r4 = r3.length
            r5 = 0
        L_0x0538:
            if (r5 >= r4) goto L_0x054f
            r6 = r3[r5]
            r6.getClass()
            int r7 = r0.Y
            long r7 = (long) r7
            r6.C = r7
            boolean r7 = r0.w0
            if (r7 == 0) goto L_0x054c
            r7 = 1
            r6.G = r7
            goto L_0x054d
        L_0x054c:
            r7 = 1
        L_0x054d:
            int r5 = r5 + r7
            goto L_0x0538
        L_0x054f:
            r1.D0 = r2
            nfd r0 = r1.z
            int r3 = r2.c
            int r0 = r0.p(r3)
            r3 = r21
            long r8 = r3.F(r2, r1, r0)
            l28 r11 = new l28
            long r5 = r2.a
            q74 r7 = r2.b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r15 = r2.v
            java.lang.Object r0 = r2.w
            cs r10 = r1.Y
            int r12 = r2.c
            int r13 = r1.b
            ea6 r14 = r2.o
            long r3 = r2.x
            long r1 = r2.y
            r16 = r0
            r17 = r3
            r19 = r1
            r10.C(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 1
        L_0x0583:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e27.k(d38):boolean");
    }

    public final void m(int i) {
        ArrayList arrayList;
        n79.n(!this.X.z());
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
                    p07 p07 = (p07) arrayList.get(i2);
                    int i4 = 0;
                    while (i4 < this.E0.length) {
                        if (this.E0[i4].n() <= p07.f(i4)) {
                            i4++;
                        }
                    }
                    break loop0;
                } else if (((p07) arrayList.get(i3)).w0) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 != -1) {
            long j = n().y;
            p07 p072 = (p07) arrayList.get(i2);
            v0g.X(arrayList, i2, arrayList.size());
            for (int i5 = 0; i5 < this.E0.length; i5++) {
                this.E0[i5].j(p072.f(i5));
            }
            if (arrayList.isEmpty()) {
                this.Z0 = this.Y0;
            } else {
                ((p07) b0h.w(arrayList)).T0 = true;
            }
            this.c1 = false;
            int i6 = this.J0;
            long j2 = p072.x;
            cs csVar = this.Y;
            csVar.getClass();
            csVar.M(new es8(1, i6, (Object) null, 3, (Object) null, v0g.h0(j2), v0g.h0(j)));
        }
    }

    public final p07 n() {
        return (p07) a81.h(1, this.w0);
    }

    public final boolean p() {
        return this.Z0 != -9223372036854775807L;
    }

    public final void q() {
        boolean z2;
        if (!this.Q0 && this.T0 == null && this.L0) {
            c27[] c27Arr = this.E0;
            int length = c27Arr.length;
            boolean z3 = false;
            int i = 0;
            while (i < length) {
                if (c27Arr[i].q() != null) {
                    i++;
                } else {
                    return;
                }
            }
            upf upf = this.R0;
            if (upf != null) {
                int i2 = upf.a;
                int[] iArr = new int[i2];
                this.T0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        c27[] c27Arr2 = this.E0;
                        if (i4 >= c27Arr2.length) {
                            break;
                        }
                        ea6 q = c27Arr2[i4].q();
                        n79.o(q);
                        ea6 ea6 = this.R0.a(i3).d[0];
                        String str = ea6.n;
                        String str2 = q.n;
                        int g = vq9.g(str2);
                        if (g == 3) {
                            if (v0g.a(str2, str)) {
                                if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q.G == ea6.G) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else if (g == vq9.g(str)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    this.T0[i3] = i4;
                }
                Iterator it = this.B0.iterator();
                while (it.hasNext()) {
                    ((w17) it.next()).a();
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
                ea6 q2 = this.E0[i5].q();
                n79.o(q2);
                String str3 = q2.n;
                if (vq9.k(str3)) {
                    i8 = 2;
                } else if (!vq9.h(str3)) {
                    i8 = vq9.j(str3) ? 3 : -2;
                }
                if (o(i8) > o(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            spf spf = this.o.h;
            int i9 = spf.a;
            this.U0 = -1;
            this.T0 = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.T0[i10] = i10;
            }
            spf[] spfArr = new spf[length2];
            int i11 = 0;
            while (i11 < length2) {
                ea6 q3 = this.E0[i11].q();
                n79.o(q3);
                String str4 = this.a;
                ea6 ea62 = this.w;
                if (i11 == i6) {
                    ea6[] ea6Arr = new ea6[i9];
                    for (int i12 = z3; i12 < i9; i12++) {
                        ea6 ea63 = spf.d[i12];
                        if (i7 == 1 && ea62 != null) {
                            ea63 = ea63.f(ea62);
                        }
                        ea6Arr[i12] = i9 == 1 ? q3.f(ea63) : l(ea63, q3, true);
                    }
                    spfArr[i11] = new spf(str4, ea6Arr);
                    this.U0 = i11;
                    z2 = false;
                } else {
                    if (i7 != 2 || !vq9.h(q3.n)) {
                        ea62 = null;
                    }
                    StringBuilder m = g63.m(str4, ":muxed:");
                    m.append(i11 < i6 ? i11 : i11 - 1);
                    z2 = false;
                    spfArr[i11] = new spf(m.toString(), l(ea62, q3, false));
                }
                i11++;
                z3 = z2;
            }
            boolean z4 = z3;
            this.R0 = f(spfArr);
            n79.n(this.S0 == null ? true : z4);
            this.S0 = Collections.emptySet();
            this.M0 = true;
            this.c.u();
        }
    }

    public final void t() {
        this.X.b();
        j07 j07 = this.o;
        BehindLiveWindowException behindLiveWindowException = j07.o;
        if (behindLiveWindowException == null) {
            Uri uri = j07.p;
            if (uri != null && j07.t) {
                uf4 uf4 = (uf4) j07.g.b.get(uri);
                uf4.b.b();
                IOException iOException = uf4.X;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw behindLiveWindowException;
    }

    public final void u(spf[] spfArr, int... iArr) {
        this.R0 = f(spfArr);
        this.S0 = new HashSet();
        for (int a2 : iArr) {
            this.S0.add(this.R0.a(a2));
        }
        this.U0 = 0;
        Handler handler = this.A0;
        b8d b8d = this.c;
        Objects.requireNonNull(b8d);
        handler.post(new y86(12, (Object) b8d));
        this.M0 = true;
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
        if (p()) {
            return this.Z0;
        }
        long j2 = this.Y0;
        p07 n = n();
        if (!n.R0) {
            ArrayList arrayList = this.w0;
            n = arrayList.size() > 1 ? (p07) a81.h(2, arrayList) : null;
        }
        if (n != null) {
            j2 = Math.max(j2, n.y);
        }
        if (this.L0) {
            for (c27 c27 : this.E0) {
                synchronized (c27) {
                    j = c27.v;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }
}
