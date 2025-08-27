package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: c8c  reason: default package */
public final class c8c implements lt8, wf5, p28, u28, gcd {
    public static final Map V0;
    public static final ca6 W0;
    public j77 A0;
    public icd[] B0;
    public a8c[] C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public m7f G0;
    public rnd H0;
    public long I0;
    public boolean J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public long O0;
    public long P0;
    public long Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public final long X;
    public final w28 Y;
    public final l15 Z;
    public final Uri a;
    public final h74 b;
    public final ow4 c;
    public final gga o;
    public final uz8 v;
    public final bv1 v0;
    public final fw4 w;
    public final t7c w0;
    public final h8c x;
    public final t7c x0;
    public final cb4 y;
    public final Handler y0;
    public final String z = null;
    public jt8 z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        V0 = Collections.unmodifiableMap(hashMap);
        aa6 aa6 = new aa6();
        aa6.a = "icy";
        aa6.k = "application/x-icy";
        W0 = aa6.a();
    }

    public c8c(Uri uri, h74 h74, l15 l15, ow4 ow4, fw4 fw4, gga gga, uz8 uz8, h8c h8c, cb4 cb4, int i) {
        this.a = uri;
        this.b = h74;
        this.c = ow4;
        this.w = fw4;
        this.o = gga;
        this.v = uz8;
        this.x = h8c;
        this.y = cb4;
        this.X = (long) i;
        this.Y = new w28("ProgressiveMediaPeriod", 0);
        this.Z = l15;
        this.v0 = new bv1(1, false, false);
        this.w0 = new t7c(this, 0);
        this.x0 = new t7c(this, 1);
        this.y0 = t0g.m((Handler.Callback) null);
        this.C0 = new a8c[0];
        this.B0 = new icd[0];
        this.Q0 = -9223372036854775807L;
        this.O0 = -1;
        this.I0 = -9223372036854775807L;
        this.K0 = 1;
    }

    public final void A(long j) {
    }

    public final ypf B(int i, int i2) {
        return l(new a8c(i, false));
    }

    public final p01 C(s28 s28, long j, long j2, IOException iOException, int i) {
        long j3;
        p01 p01;
        rnd rnd;
        IOException iOException2 = iOException;
        w7c w7c = (w7c) s28;
        if (this.O0 == -1) {
            this.O0 = w7c.Z;
        }
        sne sne = w7c.c;
        k28 k28 = new k28(w7c.a, w7c.Y, sne.c, sne.o, j, j2, sne.b);
        int i2 = t0g.a;
        this.o.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i3 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        if (j3 == -9223372036854775807L) {
            p01 = w28.x;
        } else {
            int e = e();
            int i4 = e > this.S0 ? 1 : 0;
            if (this.O0 != -1 || ((rnd = this.H0) != null && rnd.f() != -9223372036854775807L)) {
                this.S0 = e;
            } else if (!this.E0 || o()) {
                this.M0 = this.E0;
                this.P0 = 0;
                this.S0 = 0;
                for (icd z2 : this.B0) {
                    z2.z(false);
                }
                w7c.x.b = 0;
                w7c.X = 0;
                w7c.z = true;
                w7c.w0 = false;
            } else {
                this.R0 = true;
                p01 = w28.w;
            }
            p01 = new p01(j3, i4, 4, false);
        }
        p01 p012 = p01;
        this.v.h(k28, 1, -1, (ca6) null, 0, (Object) null, w7c.X, this.I0, iOException, !p012.a());
        return p012;
    }

    public final long F(long j, tnd tnd) {
        c();
        if (!this.H0.c()) {
            return 0;
        }
        pnd e = this.H0.e(j);
        return tnd.a(j, e.a.a, e.b.a);
    }

    public final void K(rnd rnd) {
        this.y0.post(new ovb(5, this, rnd));
    }

    public final boolean M(long j) {
        if (this.T0) {
            return false;
        }
        w28 w28 = this.Y;
        if (w28.L() || this.R0) {
            return false;
        }
        if (this.E0 && this.N0 == 0) {
            return false;
        }
        boolean g = this.v0.g();
        if (w28.M()) {
            return g;
        }
        m();
        return true;
    }

    public final void S(jt8 jt8, long j) {
        this.z0 = jt8;
        this.v0.g();
        m();
    }

    public final long T(ld5[] ld5Arr, boolean[] zArr, kcd[] kcdArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        ld5 ld5;
        c();
        m7f m7f = this.G0;
        tpf tpf = (tpf) m7f.a;
        int i = this.N0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = ld5Arr.length;
            zArr3 = (boolean[]) m7f.c;
            if (i3 >= length) {
                break;
            }
            y7c y7c = kcdArr[i3];
            if (y7c != null && (ld5Arr[i3] == null || !zArr[i3])) {
                int i4 = y7c.a;
                y64.j(zArr3[i4]);
                this.N0--;
                zArr3[i4] = false;
                kcdArr[i3] = null;
            }
            i3++;
        }
        boolean z2 = !this.L0 ? j != 0 : i == 0;
        for (int i5 = 0; i5 < ld5Arr.length; i5++) {
            if (kcdArr[i5] == null && (ld5 = ld5Arr[i5]) != null) {
                y64.j(ld5.length() == 1);
                y64.j(ld5.f(0) == 0);
                int b2 = tpf.b(ld5.a());
                y64.j(!zArr3[b2]);
                this.N0++;
                zArr3[b2] = true;
                kcdArr[i5] = new y7c(this, b2);
                zArr2[i5] = true;
                if (!z2) {
                    icd icd = this.B0[b2];
                    z2 = !icd.A(j, true) && icd.o() != 0;
                }
            }
        }
        if (this.N0 == 0) {
            this.R0 = false;
            this.M0 = false;
            w28 w28 = this.Y;
            if (w28.M()) {
                icd[] icdArr = this.B0;
                int length2 = icdArr.length;
                while (i2 < length2) {
                    icdArr[i2].i();
                    i2++;
                }
                w28.A();
            } else {
                for (icd z3 : this.B0) {
                    z3.z(false);
                }
            }
        } else if (z2) {
            j = s(j);
            while (i2 < kcdArr.length) {
                if (kcdArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.L0 = true;
        return j;
    }

    public final void a() {
        for (icd icd : this.B0) {
            icd.z(true);
            zv4 zv4 = icd.h;
            if (zv4 != null) {
                zv4.f(icd.e);
                icd.h = null;
                icd.g = null;
            }
        }
        l15 l15 = this.Z;
        sf5 sf5 = (sf5) l15.b;
        if (sf5 != null) {
            sf5.release();
            l15.b = null;
        }
        l15.c = null;
    }

    public final void b() {
        this.y0.post(this.w0);
    }

    public final void c() {
        y64.j(this.E0);
        this.G0.getClass();
        this.H0.getClass();
    }

    public final boolean d() {
        boolean z2;
        if (this.Y.M()) {
            bv1 bv1 = this.v0;
            synchronized (bv1) {
                z2 = bv1.b;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        int i = 0;
        for (icd icd : this.B0) {
            i += icd.q + icd.p;
        }
        return i;
    }

    public final long f() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (icd icd : this.B0) {
            synchronized (icd) {
                j = icd.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final boolean g() {
        return this.Q0 != -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, m7f] */
    public final void h() {
        int i;
        rp9 rp9;
        if (!this.U0 && !this.E0 && this.D0 && this.H0 != null) {
            icd[] icdArr = this.B0;
            int length = icdArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (icdArr[i2].r() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            bv1 bv1 = this.v0;
            synchronized (bv1) {
                bv1.b = false;
            }
            int length2 = this.B0.length;
            rpf[] rpfArr = new rpf[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                ca6 r = this.B0[i3].r();
                r.getClass();
                String str = r.Z;
                boolean h = uq9.h(str);
                boolean z2 = h || uq9.j(str);
                zArr[i3] = z2;
                this.F0 = z2 | this.F0;
                j77 j77 = this.A0;
                if (j77 != null) {
                    if (h || this.C0[i3].b) {
                        rp9 rp92 = r.X;
                        if (rp92 == null) {
                            rp9 = new rp9(j77);
                        } else {
                            int i4 = t0g.a;
                            pp9[] pp9Arr = rp92.a;
                            Object[] copyOf = Arrays.copyOf(pp9Arr, pp9Arr.length + 1);
                            System.arraycopy(new pp9[]{j77}, 0, copyOf, pp9Arr.length, 1);
                            rp9 = new rp9((pp9[]) copyOf);
                        }
                        aa6 a2 = r.a();
                        a2.i = rp9;
                        r = new ca6(a2);
                    }
                    if (h && r.w == -1 && r.x == -1 && (i = j77.a) != -1) {
                        aa6 a3 = r.a();
                        a3.f = i;
                        r = new ca6(a3);
                    }
                }
                int b2 = this.c.b(r);
                aa6 a4 = r.a();
                a4.D = b2;
                rpfArr[i3] = new rpf(Integer.toString(i3), a4.a());
            }
            tpf tpf = new tpf(rpfArr);
            ? obj = new Object();
            obj.a = tpf;
            obj.b = zArr;
            int i5 = tpf.a;
            obj.c = new boolean[i5];
            obj.o = new boolean[i5];
            this.G0 = obj;
            this.E0 = true;
            jt8 jt8 = this.z0;
            jt8.getClass();
            jt8.c(this);
        }
    }

    public final long i() {
        if (this.N0 == 0) {
            return Long.MIN_VALUE;
        }
        return y();
    }

    public final void j(int i) {
        c();
        m7f m7f = this.G0;
        boolean[] zArr = (boolean[]) m7f.o;
        if (!zArr[i]) {
            ca6 ca6 = ((tpf) m7f.a).a(i).c[0];
            this.v.b(uq9.g(ca6.Z), ca6, 0, (Object) null, this.P0);
            zArr[i] = true;
        }
    }

    public final void k(int i) {
        c();
        boolean[] zArr = (boolean[]) this.G0.b;
        if (this.R0 && zArr[i] && !this.B0[i].t(false)) {
            this.Q0 = 0;
            this.R0 = false;
            this.M0 = true;
            this.P0 = 0;
            this.S0 = 0;
            for (icd z2 : this.B0) {
                z2.z(false);
            }
            jt8 jt8 = this.z0;
            jt8.getClass();
            jt8.b(this);
        }
    }

    public final icd l(a8c a8c) {
        int length = this.B0.length;
        for (int i = 0; i < length; i++) {
            if (a8c.equals(this.C0[i])) {
                return this.B0[i];
            }
        }
        ow4 ow4 = this.c;
        ow4.getClass();
        fw4 fw4 = this.w;
        fw4.getClass();
        icd icd = new icd(this.y, ow4, fw4);
        icd.f = this;
        int i2 = length + 1;
        a8c[] a8cArr = (a8c[]) Arrays.copyOf(this.C0, i2);
        a8cArr[length] = a8c;
        int i3 = t0g.a;
        this.C0 = a8cArr;
        icd[] icdArr = (icd[]) Arrays.copyOf(this.B0, i2);
        icdArr[length] = icd;
        this.B0 = icdArr;
        return icd;
    }

    public final void m() {
        w7c w7c = new w7c(this, this.a, this.b, this.Z, this, this.v0);
        if (this.E0) {
            y64.j(g());
            long j = this.I0;
            if (j == -9223372036854775807L || this.Q0 <= j) {
                rnd rnd = this.H0;
                rnd.getClass();
                long j2 = rnd.e(this.Q0).a.b;
                long j3 = this.Q0;
                w7c.x.b = j2;
                w7c.X = j3;
                w7c.z = true;
                w7c.w0 = false;
                for (icd icd : this.B0) {
                    icd.t = this.Q0;
                }
                this.Q0 = -9223372036854775807L;
            } else {
                this.T0 = true;
                this.Q0 = -9223372036854775807L;
                return;
            }
        }
        this.S0 = e();
        this.v.k(new k28(w7c.a, w7c.Y, this.Y.P(w7c, this, this.o.o(this.K0))), 1, -1, (ca6) null, 0, (Object) null, w7c.X, this.I0);
    }

    public final void n(s28 s28, long j, long j2, boolean z2) {
        w7c w7c = (w7c) s28;
        sne sne = w7c.c;
        k28 k28 = new k28(w7c.a, w7c.Y, sne.c, sne.o, j, j2, sne.b);
        this.o.getClass();
        this.v.d(k28, 1, -1, (ca6) null, 0, (Object) null, w7c.X, this.I0);
        if (!z2) {
            if (this.O0 == -1) {
                this.O0 = w7c.Z;
            }
            for (icd z3 : this.B0) {
                z3.z(false);
            }
            if (this.N0 > 0) {
                jt8 jt8 = this.z0;
                jt8.getClass();
                jt8.b(this);
            }
        }
    }

    public final boolean o() {
        return this.M0 || g();
    }

    public final void r() {
        int o2 = this.o.o(this.K0);
        w28 w28 = this.Y;
        IOException iOException = (IOException) w28.o;
        if (iOException == null) {
            r28 r28 = (r28) w28.c;
            if (r28 != null) {
                if (o2 == Integer.MIN_VALUE) {
                    o2 = r28.b;
                }
                IOException iOException2 = r28.o;
                if (iOException2 != null && r28.v > o2) {
                    throw iOException2;
                }
            }
            if (this.T0 && !this.E0) {
                throw ParserException.a("Loading finished before preparation is complete.", (RuntimeException) null);
            }
            return;
        }
        throw iOException;
    }

    public final long s(long j) {
        c();
        boolean[] zArr = (boolean[]) this.G0.b;
        if (!this.H0.c()) {
            j = 0;
        }
        this.M0 = false;
        this.P0 = j;
        if (g()) {
            this.Q0 = j;
            return j;
        }
        if (this.K0 != 7) {
            int length = this.B0.length;
            int i = 0;
            while (i < length) {
                if (this.B0[i].A(j, false) || (!zArr[i] && this.F0)) {
                    i++;
                }
            }
            return j;
        }
        this.R0 = false;
        this.Q0 = j;
        this.T0 = false;
        w28 w28 = this.Y;
        if (w28.M()) {
            for (icd i2 : this.B0) {
                i2.i();
            }
            w28.A();
        } else {
            w28.o = null;
            for (icd z2 : this.B0) {
                z2.z(false);
            }
        }
        return j;
    }

    public final void u(s28 s28, long j, long j2) {
        rnd rnd;
        w7c w7c = (w7c) s28;
        if (this.I0 == -9223372036854775807L && (rnd = this.H0) != null) {
            boolean c2 = rnd.c();
            long f = f();
            long j3 = f == Long.MIN_VALUE ? 0 : f + WorkRequest.MIN_BACKOFF_MILLIS;
            this.I0 = j3;
            this.x.q(j3, c2, this.J0);
        }
        sne sne = w7c.c;
        k28 k28 = new k28(w7c.a, w7c.Y, sne.c, sne.o, j, j2, sne.b);
        this.o.getClass();
        this.v.f(k28, 1, -1, (ca6) null, 0, (Object) null, w7c.X, this.I0);
        if (this.O0 == -1) {
            this.O0 = w7c.Z;
        }
        this.T0 = true;
        jt8 jt8 = this.z0;
        jt8.getClass();
        jt8.b(this);
    }

    public final void v() {
        this.D0 = true;
        this.y0.post(this.w0);
    }

    public final long w() {
        if (!this.M0) {
            return -9223372036854775807L;
        }
        if (!this.T0 && e() <= this.S0) {
            return -9223372036854775807L;
        }
        this.M0 = false;
        return this.P0;
    }

    public final tpf x() {
        c();
        return (tpf) this.G0.a;
    }

    public final long y() {
        long j;
        boolean z2;
        long j2;
        c();
        boolean[] zArr = (boolean[]) this.G0.b;
        if (this.T0) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.Q0;
        }
        if (this.F0) {
            int length = this.B0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    icd icd = this.B0[i];
                    synchronized (icd) {
                        z2 = icd.w;
                    }
                    if (!z2) {
                        icd icd2 = this.B0[i];
                        synchronized (icd2) {
                            j2 = icd2.v;
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
            j = f();
        }
        return j == Long.MIN_VALUE ? this.P0 : j;
    }

    public final void z(long j, boolean z2) {
        c();
        if (!g()) {
            boolean[] zArr = (boolean[]) this.G0.c;
            int length = this.B0.length;
            for (int i = 0; i < length; i++) {
                this.B0[i].h(j, z2, zArr[i]);
            }
        }
    }
}
