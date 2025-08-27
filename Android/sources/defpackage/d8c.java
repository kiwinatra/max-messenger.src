package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: d8c  reason: default package */
public final class d8c implements mt8, xf5, q28, v28, hcd {
    public static final Map X0;
    public static final ea6 Y0;
    public kt8 A0;
    public k77 B0;
    public jcd[] C0;
    public b8c[] D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public tgg I0;
    public snd J0;
    public long K0;
    public boolean L0;
    public int M0;
    public boolean N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public long R0;
    public long S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public final long X;
    public final long Y;
    public final l15 Z = new l15("ProgressiveMediaPeriod");
    public final Uri a;
    public final j74 b;
    public final pw4 c;
    public final nfd o;
    public final cs v;
    public final d19 v0;
    public final gw4 w;
    public final bv1 w0;
    public final i8c x;
    public final u7c x0;
    public final cb4 y;
    public final u7c y0;
    public final String z;
    public final Handler z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        X0 = Collections.unmodifiableMap(hashMap);
        ba6 ba6 = new ba6();
        ba6.a = "icy";
        ba6.m = vq9.l("application/x-icy");
        Y0 = ba6.a();
    }

    public d8c(Uri uri, j74 j74, d19 d19, pw4 pw4, gw4 gw4, nfd nfd, cs csVar, i8c i8c, cb4 cb4, String str, int i, long j) {
        this.a = uri;
        this.b = j74;
        this.c = pw4;
        this.w = gw4;
        this.o = nfd;
        this.v = csVar;
        this.x = i8c;
        this.y = cb4;
        this.z = str;
        this.X = (long) i;
        this.v0 = d19;
        this.Y = j;
        this.w0 = new bv1(2, false, false);
        this.x0 = new u7c(this, 1);
        this.y0 = new u7c(this, 2);
        this.z0 = v0g.o((Handler.Callback) null);
        this.D0 = new b8c[0];
        this.C0 = new jcd[0];
        this.S0 = -9223372036854775807L;
        this.M0 = 1;
    }

    public final void A(long j) {
    }

    public final zpf B(int i, int i2) {
        return p(new b8c(i, false));
    }

    public final void E(t28 t28, long j, long j2, boolean z2) {
        x7c x7c = (x7c) t28;
        tne tne = x7c.c;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.o.getClass();
        this.v.v(l28, 1, -1, (ea6) null, 0, (Object) null, x7c.X, this.K0);
        if (!z2) {
            for (jcd y2 : this.C0) {
                y2.y(false);
            }
            if (this.P0 > 0) {
                kt8 kt8 = this.A0;
                kt8.getClass();
                kt8.c(this);
            }
        }
    }

    public final void H(t28 t28, long j, long j2) {
        snd snd;
        x7c x7c = (x7c) t28;
        if (this.K0 == -9223372036854775807L && (snd = this.J0) != null) {
            boolean c2 = snd.c();
            long f = f(true);
            long j3 = f == Long.MIN_VALUE ? 0 : f + WorkRequest.MIN_BACKOFF_MILLIS;
            this.K0 = j3;
            this.x.v(j3, c2, this.L0);
        }
        tne tne = x7c.c;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.o.getClass();
        this.v.x(l28, 1, -1, (ea6) null, 0, (Object) null, x7c.X, this.K0);
        this.V0 = true;
        kt8 kt8 = this.A0;
        kt8.getClass();
        kt8.c(this);
    }

    public final void M(snd snd) {
        this.z0.post(new ovb(6, this, snd));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.p01 Z(defpackage.t28 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = 1
            r2 = r19
            x7c r2 = (defpackage.x7c) r2
            tne r3 = r2.c
            l28 r4 = new l28
            android.net.Uri r5 = r3.c
            java.util.Map r3 = r3.o
            r5 = r22
            r4.<init>(r5, r3)
            int r3 = defpackage.v0g.a
            nfd r3 = r0.o
            r3.getClass()
            boolean r3 = r11 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0057
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0035:
            if (r3 == 0) goto L_0x004a
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0045
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0035
        L_0x004a:
            int r3 = r25 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x0058
        L_0x0057:
            r13 = r5
        L_0x0058:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0060
            p01 r3 = defpackage.l15.w
        L_0x005e:
            r13 = r3
            goto L_0x00bb
        L_0x0060:
            int r3 = r18.e()
            int r7 = r0.U0
            r8 = 0
            if (r3 <= r7) goto L_0x006b
            r15 = r1
            goto L_0x006c
        L_0x006b:
            r15 = r8
        L_0x006c:
            boolean r7 = r0.Q0
            if (r7 != 0) goto L_0x00ae
            snd r7 = r0.J0
            if (r7 == 0) goto L_0x007d
            long r9 = r7.f()
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x007d
            goto L_0x00ae
        L_0x007d:
            boolean r3 = r0.F0
            if (r3 == 0) goto L_0x008c
            boolean r3 = r18.t()
            if (r3 != 0) goto L_0x008c
            r0.T0 = r1
            p01 r3 = defpackage.l15.v
            goto L_0x005e
        L_0x008c:
            boolean r3 = r0.F0
            r0.O0 = r3
            r5 = 0
            r0.R0 = r5
            r0.U0 = r8
            jcd[] r3 = r0.C0
            int r7 = r3.length
            r9 = r8
        L_0x009a:
            if (r9 >= r7) goto L_0x00a3
            r10 = r3[r9]
            r10.y(r8)
            int r9 = r9 + r1
            goto L_0x009a
        L_0x00a3:
            yl4 r3 = r2.x
            r3.b = r5
            r2.X = r5
            r2.z = r1
            r2.v0 = r8
            goto L_0x00b0
        L_0x00ae:
            r0.U0 = r3
        L_0x00b0:
            p01 r3 = new p01
            r16 = 5
            r17 = 0
            r12 = r3
            r12.<init>(r13, r15, r16, r17)
            goto L_0x005e
        L_0x00bb:
            boolean r3 = r13.a()
            r12 = r3 ^ 1
            long r7 = r2.X
            long r9 = r0.K0
            r3 = -1
            r5 = 0
            cs r0 = r0.v
            r2 = 1
            r6 = 0
            r14 = 0
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.z(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8c.Z(t28, long, long, java.io.IOException, int):p01");
    }

    public final void a() {
        for (jcd jcd : this.C0) {
            jcd.y(true);
            aw4 aw4 = jcd.h;
            if (aw4 != null) {
                aw4.f(jcd.e);
                jcd.h = null;
                jcd.g = null;
            }
        }
        d19 d19 = this.v0;
        tf5 tf5 = (tf5) d19.c;
        if (tf5 != null) {
            tf5.release();
            d19.c = null;
        }
        d19.a = null;
    }

    public final void b() {
        this.z0.post(this.x0);
    }

    public final void c() {
        n79.n(this.F0);
        this.I0.getClass();
        this.J0.getClass();
    }

    public final boolean d() {
        return this.Z.z() && this.w0.e();
    }

    public final int e() {
        int i = 0;
        for (jcd jcd : this.C0) {
            i += jcd.q + jcd.p;
        }
        return i;
    }

    public final long f(boolean z2) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.C0.length; i++) {
            if (!z2) {
                tgg tgg = this.I0;
                tgg.getClass();
                if (!((boolean[]) tgg.c)[i]) {
                    continue;
                }
            }
            jcd jcd = this.C0[i];
            synchronized (jcd) {
                j = jcd.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final long g(md5[] md5Arr, boolean[] zArr, lcd[] lcdArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        md5 md5;
        c();
        tgg tgg = this.I0;
        upf upf = (upf) tgg.a;
        int i = this.P0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = md5Arr.length;
            zArr3 = (boolean[]) tgg.c;
            if (i3 >= length) {
                break;
            }
            z7c z7c = lcdArr[i3];
            if (z7c != null && (md5Arr[i3] == null || !zArr[i3])) {
                int i4 = z7c.a;
                n79.n(zArr3[i4]);
                this.P0--;
                zArr3[i4] = false;
                lcdArr[i3] = null;
            }
            i3++;
        }
        boolean z2 = !this.N0 ? !(j == 0 || this.H0) : i == 0;
        for (int i5 = 0; i5 < md5Arr.length; i5++) {
            if (lcdArr[i5] == null && (md5 = md5Arr[i5]) != null) {
                n79.n(md5.length() == 1);
                n79.n(md5.f(0) == 0);
                int b2 = upf.b(md5.a());
                n79.n(!zArr3[b2]);
                this.P0++;
                zArr3[b2] = true;
                lcdArr[i5] = new z7c(this, b2);
                zArr2[i5] = true;
                if (!z2) {
                    jcd jcd = this.C0[b2];
                    z2 = jcd.n() != 0 && !jcd.A(j, true);
                }
            }
        }
        if (this.P0 == 0) {
            this.T0 = false;
            this.O0 = false;
            l15 l15 = this.Z;
            if (l15.z()) {
                jcd[] jcdArr = this.C0;
                int length2 = jcdArr.length;
                while (i2 < length2) {
                    jcdArr[i2].h();
                    i2++;
                }
                l15.j();
            } else {
                this.V0 = false;
                for (jcd y2 : this.C0) {
                    y2.y(false);
                }
            }
        } else if (z2) {
            j = s(j);
            while (i2 < lcdArr.length) {
                if (lcdArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.N0 = true;
        return j;
    }

    public final long h(long j, und und) {
        c();
        if (!this.J0.c()) {
            return 0;
        }
        qnd e = this.J0.e(j);
        return und.a(j, e.a.a, e.b.a);
    }

    public final long i() {
        return y();
    }

    public final void j(kt8 kt8, long j) {
        this.A0 = kt8;
        this.w0.g();
        q();
    }

    public final boolean k(d38 d38) {
        if (this.V0) {
            return false;
        }
        l15 l15 = this.Z;
        if (l15.s() || this.T0) {
            return false;
        }
        if (this.F0 && this.P0 == 0) {
            return false;
        }
        boolean g = this.w0.g();
        if (l15.z()) {
            return g;
        }
        q();
        return true;
    }

    public final boolean l() {
        return this.S0 != -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [tgg, java.lang.Object] */
    public final void m() {
        long j;
        int i;
        if (!this.W0 && !this.F0 && this.E0 && this.J0 != null) {
            jcd[] jcdArr = this.C0;
            int length = jcdArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (jcdArr[i2].q() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.w0.c();
            int length2 = this.C0.length;
            spf[] spfArr = new spf[length2];
            boolean[] zArr = new boolean[length2];
            int i3 = 0;
            while (true) {
                j = this.Y;
                if (i3 >= length2) {
                    break;
                }
                ea6 q = this.C0[i3].q();
                q.getClass();
                String str = q.n;
                boolean h = vq9.h(str);
                boolean z2 = h || vq9.k(str);
                zArr[i3] = z2;
                this.G0 = z2 | this.G0;
                this.H0 = j != -9223372036854775807L && length2 == 1 && vq9.i(str);
                k77 k77 = this.B0;
                if (k77 != null) {
                    if (h || this.D0[i3].b) {
                        sp9 sp9 = q.k;
                        sp9 sp92 = sp9 == null ? new sp9(k77) : sp9.a(k77);
                        ba6 a2 = q.a();
                        a2.j = sp92;
                        q = new ea6(a2);
                    }
                    if (h && q.g == -1 && q.h == -1 && (i = k77.a) != -1) {
                        ba6 a3 = q.a();
                        a3.g = i;
                        q = new ea6(a3);
                    }
                }
                int d = this.c.d(q);
                ba6 a4 = q.a();
                a4.J = d;
                spfArr[i3] = new spf(Integer.toString(i3), a4.a());
                i3++;
            }
            upf upf = new upf(spfArr);
            ? obj = new Object();
            obj.a = upf;
            obj.b = zArr;
            int i4 = upf.a;
            obj.c = new boolean[i4];
            obj.o = new boolean[i4];
            this.I0 = obj;
            if (this.H0 && this.K0 == -9223372036854775807L) {
                this.K0 = j;
                this.J0 = new v7c(this, this.J0);
            }
            this.x.v(this.K0, this.J0.c(), this.L0);
            this.F0 = true;
            kt8 kt8 = this.A0;
            kt8.getClass();
            kt8.b(this);
        }
    }

    public final void n(int i) {
        c();
        tgg tgg = this.I0;
        boolean[] zArr = (boolean[]) tgg.o;
        if (!zArr[i]) {
            ea6 ea6 = ((upf) tgg.a).a(i).d[0];
            this.v.l(vq9.g(ea6.n), ea6, 0, (Object) null, this.R0);
            zArr[i] = true;
        }
    }

    public final void o(int i) {
        c();
        boolean[] zArr = (boolean[]) this.I0.b;
        if (this.T0 && zArr[i] && !this.C0[i].s(false)) {
            this.S0 = 0;
            this.T0 = false;
            this.O0 = true;
            this.R0 = 0;
            this.U0 = 0;
            for (jcd y2 : this.C0) {
                y2.y(false);
            }
            kt8 kt8 = this.A0;
            kt8.getClass();
            kt8.c(this);
        }
    }

    public final zpf p(b8c b8c) {
        int length = this.C0.length;
        for (int i = 0; i < length; i++) {
            if (b8c.equals(this.D0[i])) {
                return this.C0[i];
            }
        }
        if (this.E0) {
            i8b.V("Extractor added new track (id=" + b8c.a + ") after finishing tracks.");
            return new ip4();
        }
        pw4 pw4 = this.c;
        pw4.getClass();
        gw4 gw4 = this.w;
        gw4.getClass();
        jcd jcd = new jcd(this.y, pw4, gw4);
        jcd.f = this;
        int i2 = length + 1;
        b8c[] b8cArr = (b8c[]) Arrays.copyOf(this.D0, i2);
        b8cArr[length] = b8c;
        int i3 = v0g.a;
        this.D0 = b8cArr;
        jcd[] jcdArr = (jcd[]) Arrays.copyOf(this.C0, i2);
        jcdArr[length] = jcd;
        this.C0 = jcdArr;
        return jcd;
    }

    public final void q() {
        x7c x7c = new x7c(this, this.a, this.b, this.v0, this, this.w0);
        if (this.F0) {
            n79.n(l());
            long j = this.K0;
            if (j == -9223372036854775807L || this.S0 <= j) {
                snd snd = this.J0;
                snd.getClass();
                long j2 = snd.e(this.S0).a.b;
                long j3 = this.S0;
                x7c.x.b = j2;
                x7c.X = j3;
                x7c.z = true;
                x7c.v0 = false;
                for (jcd jcd : this.C0) {
                    jcd.t = this.S0;
                }
                this.S0 = -9223372036854775807L;
            } else {
                this.V0 = true;
                this.S0 = -9223372036854775807L;
                return;
            }
        }
        this.U0 = e();
        this.v.C(new l28(x7c.a, x7c.Y, this.Z.F(x7c, this, this.o.p(this.M0))), 1, -1, (ea6) null, 0, (Object) null, x7c.X, this.K0);
    }

    public final void r() {
        int p = this.o.p(this.M0);
        l15 l15 = this.Z;
        IOException iOException = (IOException) l15.c;
        if (iOException == null) {
            r28 r28 = (r28) l15.b;
            if (r28 != null) {
                if (p == Integer.MIN_VALUE) {
                    p = r28.b;
                }
                IOException iOException2 = r28.o;
                if (iOException2 != null && r28.v > p) {
                    throw iOException2;
                }
            }
            if (this.V0 && !this.F0) {
                throw ParserException.a("Loading finished before preparation is complete.", (RuntimeException) null);
            }
            return;
        }
        throw iOException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long s(long r8) {
        /*
            r7 = this;
            r7.c()
            tgg r0 = r7.I0
            java.lang.Object r0 = r0.b
            boolean[] r0 = (boolean[]) r0
            snd r1 = r7.J0
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r8 = 0
        L_0x0014:
            r1 = 0
            r7.O0 = r1
            r7.R0 = r8
            boolean r2 = r7.l()
            if (r2 == 0) goto L_0x0022
            r7.S0 = r8
            return r8
        L_0x0022:
            int r2 = r7.M0
            r3 = 7
            l15 r4 = r7.Z
            if (r2 == r3) goto L_0x005f
            boolean r2 = r7.V0
            if (r2 != 0) goto L_0x0033
            boolean r2 = r4.z()
            if (r2 == 0) goto L_0x005f
        L_0x0033:
            jcd[] r2 = r7.C0
            int r2 = r2.length
            r3 = r1
        L_0x0037:
            if (r3 >= r2) goto L_0x005b
            jcd[] r5 = r7.C0
            r5 = r5[r3]
            boolean r6 = r7.H0
            if (r6 == 0) goto L_0x0048
            int r6 = r5.q
            boolean r5 = r5.z(r6)
            goto L_0x004c
        L_0x0048:
            boolean r5 = r5.A(r8, r1)
        L_0x004c:
            if (r5 != 0) goto L_0x0058
            boolean r5 = r0[r3]
            if (r5 != 0) goto L_0x0056
            boolean r5 = r7.G0
            if (r5 != 0) goto L_0x0058
        L_0x0056:
            r0 = r1
            goto L_0x005c
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r8
        L_0x005f:
            r7.T0 = r1
            r7.S0 = r8
            r7.V0 = r1
            boolean r0 = r4.z()
            if (r0 == 0) goto L_0x007c
            jcd[] r7 = r7.C0
            int r0 = r7.length
        L_0x006e:
            if (r1 >= r0) goto L_0x0078
            r2 = r7[r1]
            r2.h()
            int r1 = r1 + 1
            goto L_0x006e
        L_0x0078:
            r4.j()
            goto L_0x008d
        L_0x007c:
            r0 = 0
            r4.c = r0
            jcd[] r7 = r7.C0
            int r0 = r7.length
            r2 = r1
        L_0x0083:
            if (r2 >= r0) goto L_0x008d
            r3 = r7[r2]
            r3.y(r1)
            int r2 = r2 + 1
            goto L_0x0083
        L_0x008d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8c.s(long):long");
    }

    public final boolean t() {
        return this.O0 || l();
    }

    public final void v() {
        this.E0 = true;
        this.z0.post(this.x0);
    }

    public final long w() {
        if (!this.O0) {
            return -9223372036854775807L;
        }
        if (!this.V0 && e() <= this.U0) {
            return -9223372036854775807L;
        }
        this.O0 = false;
        return this.R0;
    }

    public final upf x() {
        c();
        return (upf) this.I0.a;
    }

    public final long y() {
        long j;
        boolean z2;
        long j2;
        c();
        if (this.V0 || this.P0 == 0) {
            return Long.MIN_VALUE;
        }
        if (l()) {
            return this.S0;
        }
        if (this.G0) {
            int length = this.C0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                tgg tgg = this.I0;
                if (((boolean[]) tgg.b)[i] && ((boolean[]) tgg.c)[i]) {
                    jcd jcd = this.C0[i];
                    synchronized (jcd) {
                        z2 = jcd.w;
                    }
                    if (!z2) {
                        jcd jcd2 = this.C0[i];
                        synchronized (jcd2) {
                            j2 = jcd2.v;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == LongCompanionObject.MAX_VALUE) {
            j = f(false);
        }
        return j == Long.MIN_VALUE ? this.R0 : j;
    }

    public final void z(long j, boolean z2) {
        if (!this.H0) {
            c();
            if (!l()) {
                boolean[] zArr = (boolean[]) this.I0.c;
                int length = this.C0.length;
                for (int i = 0; i < length; i++) {
                    this.C0[i].g(j, z2, zArr[i]);
                }
            }
        }
    }
}
