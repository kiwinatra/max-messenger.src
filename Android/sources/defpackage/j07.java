package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: j07  reason: default package */
public final class j07 {
    public final m07 a;
    public final j74 b;
    public final j74 c;
    public final p1e d;
    public final Uri[] e;
    public final ea6[] f;
    public final vf4 g;
    public final spf h;
    public final List i;
    public final e4 j = new e4(19);
    public final mpb k;
    public final long l;
    public boolean m;
    public byte[] n = v0g.f;
    public BehindLiveWindowException o;
    public Uri p;
    public boolean q;
    public md5 r;
    public long s = -9223372036854775807L;
    public boolean t;

    /* JADX WARNING: type inference failed for: r3v1, types: [zk0, g07, md5] */
    public j07(m07 m07, vf4 vf4, Uri[] uriArr, ea6[] ea6Arr, rt6 rt6, brf brf, p1e p1e, long j2, List list, mpb mpb) {
        this.a = m07;
        this.g = vf4;
        this.e = uriArr;
        this.f = ea6Arr;
        this.d = p1e;
        this.l = j2;
        this.i = list;
        this.k = mpb;
        j74 a2 = ((g74) rt6.b).a();
        this.b = a2;
        if (brf != null) {
            a2.H(brf);
        }
        this.c = ((g74) rt6.b).a();
        this.h = new spf("", ea6Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((ea6Arr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        spf spf = this.h;
        int[] L = cvg.L(arrayList);
        ? zk0 = new zk0(spf, L);
        zk0.g = zk0.s(spf.d[L[0]]);
        this.r = zk0;
    }

    public final an8[] a(p07 p07, long j2) {
        int i2;
        List list;
        p07 p072 = p07;
        int d2 = p072 == null ? -1 : this.h.d(p072.o);
        int length = this.r.length();
        an8[] an8Arr = new an8[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.r.f(i3);
            Uri uri = this.e[f2];
            vf4 vf4 = this.g;
            if (!vf4.d(uri)) {
                an8Arr[i3] = an8.T;
                i2 = i3;
            } else {
                c17 b2 = vf4.b(uri, z);
                b2.getClass();
                long j3 = b2.h - vf4.x;
                boolean z2 = f2 != d2 ? true : z;
                long j4 = j3;
                i2 = i3;
                c17 c17 = b2;
                Pair c2 = c(p07, z2, b2, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - c17.k);
                if (i4 >= 0) {
                    tb7 tb7 = c17.r;
                    if (tb7.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < tb7.size()) {
                            if (intValue != -1) {
                                x07 x07 = (x07) tb7.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(x07);
                                } else if (intValue < x07.v0.size()) {
                                    tb7 tb72 = x07.v0;
                                    arrayList.addAll(tb72.subList(intValue, tb72.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(tb7.subList(i4, tb7.size()));
                            intValue = 0;
                        }
                        if (c17.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            tb7 tb73 = c17.s;
                            if (intValue < tb73.size()) {
                                arrayList.addAll(tb73.subList(intValue, tb73.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        an8Arr[i2] = new e07(j4, list);
                    }
                }
                lx5 lx5 = tb7.b;
                list = k0d.v;
                an8Arr[i2] = new e07(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return an8Arr;
    }

    public final int b(p07 p07) {
        if (p07.x0 == -1) {
            return 1;
        }
        c17 b2 = this.g.b(this.e[this.h.d(p07.o)], false);
        b2.getClass();
        int i2 = (int) (p07.X - b2.k);
        if (i2 < 0) {
            return 1;
        }
        tb7 tb7 = b2.r;
        tb7 tb72 = i2 < tb7.size() ? ((x07) tb7.get(i2)).v0 : b2.s;
        int size = tb72.size();
        int i3 = p07.x0;
        if (i3 >= size) {
            return 2;
        }
        t07 t07 = (t07) tb72.get(i3);
        if (t07.v0) {
            return 0;
        }
        return v0g.a(Uri.parse(hi7.T(b2.a, t07.a)), p07.b.a) ? 1 : 2;
    }

    public final Pair c(p07 p07, boolean z, c17 c17, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (p07 == null || z) {
            long j4 = c17.u + j2;
            if (p07 != null && !this.q) {
                j3 = p07.x;
            }
            boolean z3 = c17.o;
            long j5 = c17.k;
            tb7 tb7 = c17.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) tb7.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.w && p07 != null) {
                z2 = false;
            }
            int d2 = v0g.d(valueOf, tb7, z2);
            long j7 = ((long) d2) + j5;
            if (d2 >= 0) {
                x07 x07 = (x07) tb7.get(d2);
                int i4 = (j6 > (x07.v + x07.c) ? 1 : (j6 == (x07.v + x07.c) ? 0 : -1));
                tb7 tb72 = c17.s;
                tb7 tb73 = i4 < 0 ? x07.v0 : tb72;
                while (true) {
                    if (i3 >= tb73.size()) {
                        break;
                    }
                    t07 t07 = (t07) tb73.get(i3);
                    if (j6 >= t07.v + t07.c) {
                        i3++;
                    } else if (t07.Z) {
                        j7 += tb73 == tb72 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = p07.R0;
        long j8 = p07.X;
        int i5 = p07.x0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = p07.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final c07 d(Uri uri, int i2, boolean z) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        e4 e4Var = this.j;
        byte[] bArr = (byte[]) ((wi6) e4Var.b).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((wi6) e4Var.b).put(uri2, bArr);
            return null;
        }
        q74 q74 = new q74(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        ea6 ea6 = this.f[i2];
        int k2 = this.r.k();
        Object m2 = this.r.m();
        byte[] bArr3 = this.n;
        m03 m03 = new m03(this.c, q74, 3, ea6, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = v0g.f;
        }
        m03.X = bArr3;
        return m03;
    }
}
