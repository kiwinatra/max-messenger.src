package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: i07  reason: default package */
public final class i07 {
    public final l07 a;
    public final h74 b;
    public final h74 c;
    public final pl7 d;
    public final Uri[] e;
    public final ca6[] f;
    public final vf4 g;
    public final rpf h;
    public final List i;
    public final wie j = new wie(21);
    public final lpb k;
    public boolean l;
    public byte[] m = t0g.f;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public ld5 q;
    public long r = -9223372036854775807L;
    public boolean s;

    /* JADX WARNING: type inference failed for: r3v1, types: [f07, ld5, yk0] */
    public i07(l07 l07, vf4 vf4, Uri[] uriArr, ca6[] ca6Arr, vs6 vs6, arf arf, pl7 pl7, List list, lpb lpb) {
        this.a = l07;
        this.g = vf4;
        this.e = uriArr;
        this.f = ca6Arr;
        this.d = pl7;
        this.i = list;
        this.k = lpb;
        h74 a2 = ((f74) vs6.b).a();
        this.b = a2;
        if (arf != null) {
            a2.O(arf);
        }
        this.c = ((f74) vs6.b).a();
        this.h = new rpf("", ca6Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((ca6Arr[i2].v & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        rpf rpf = this.h;
        int[] L = cvg.L(arrayList);
        ? yk0 = new yk0(rpf, L);
        yk0.g = yk0.q(rpf.c[L[0]]);
        this.q = yk0;
    }

    public final zm8[] a(o07 o07, long j2) {
        int i2;
        List list;
        o07 o072 = o07;
        int a2 = o072 == null ? -1 : this.h.a(o072.o);
        int length = this.q.length();
        zm8[] zm8Arr = new zm8[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.q.f(i3);
            Uri uri = this.e[f2];
            vf4 vf4 = this.g;
            if (!vf4.d(uri)) {
                zm8Arr[i3] = zm8.S;
                i2 = i3;
            } else {
                b17 a3 = vf4.a(uri, z);
                a3.getClass();
                long j3 = a3.h - vf4.x;
                boolean z2 = f2 != a2 ? true : z;
                long j4 = j3;
                i2 = i3;
                b17 b17 = a3;
                Pair c2 = c(o07, z2, a3, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - b17.k);
                if (i4 >= 0) {
                    tb7 tb7 = b17.r;
                    if (tb7.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < tb7.size()) {
                            if (intValue != -1) {
                                w07 w07 = (w07) tb7.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(w07);
                                } else if (intValue < w07.v0.size()) {
                                    tb7 tb72 = w07.v0;
                                    arrayList.addAll(tb72.subList(intValue, tb72.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(tb7.subList(i4, tb7.size()));
                            intValue = 0;
                        }
                        if (b17.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            tb7 tb73 = b17.s;
                            if (intValue < tb73.size()) {
                                arrayList.addAll(tb73.subList(intValue, tb73.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        zm8Arr[i2] = new d07(j4, list);
                    }
                }
                lx5 lx5 = tb7.b;
                list = k0d.v;
                zm8Arr[i2] = new d07(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return zm8Arr;
    }

    public final int b(o07 o07) {
        if (o07.x0 == -1) {
            return 1;
        }
        b17 a2 = this.g.a(this.e[this.h.a(o07.o)], false);
        a2.getClass();
        int i2 = (int) (o07.X - a2.k);
        if (i2 < 0) {
            return 1;
        }
        tb7 tb7 = a2.r;
        tb7 tb72 = i2 < tb7.size() ? ((w07) tb7.get(i2)).v0 : a2.s;
        int size = tb72.size();
        int i3 = o07.x0;
        if (i3 >= size) {
            return 2;
        }
        s07 s07 = (s07) tb72.get(i3);
        if (s07.v0) {
            return 0;
        }
        return t0g.a(Uri.parse(tf6.j0(a2.a, s07.a)), o07.b.a) ? 1 : 2;
    }

    public final Pair c(o07 o07, boolean z, b17 b17, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (o07 == null || z) {
            long j4 = b17.u + j2;
            if (o07 != null && !this.p) {
                j3 = o07.x;
            }
            boolean z3 = b17.o;
            long j5 = b17.k;
            tb7 tb7 = b17.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) tb7.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.w && o07 != null) {
                z2 = false;
            }
            int e2 = t0g.e(valueOf, tb7, z2);
            long j7 = ((long) e2) + j5;
            if (e2 >= 0) {
                w07 w07 = (w07) tb7.get(e2);
                int i4 = (j6 > (w07.v + w07.c) ? 1 : (j6 == (w07.v + w07.c) ? 0 : -1));
                tb7 tb72 = b17.s;
                tb7 tb73 = i4 < 0 ? w07.v0 : tb72;
                while (true) {
                    if (i3 >= tb73.size()) {
                        break;
                    }
                    s07 s07 = (s07) tb73.get(i3);
                    if (j6 >= s07.v + s07.c) {
                        i3++;
                    } else if (s07.Z) {
                        j7 += tb73 == tb72 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = o07.Q0;
        long j8 = o07.X;
        int i5 = o07.x0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = o07.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final b07 d(Uri uri, int i2) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        wie wie = this.j;
        byte[] bArr = (byte[]) ((wi6) wie.b).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((wi6) wie.b).put(uri2, bArr);
            return null;
        }
        p74 p74 = new p74(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        ca6 ca6 = this.f[i2];
        int k2 = this.q.k();
        Object m2 = this.q.m();
        byte[] bArr3 = this.m;
        k03 k03 = new k03(this.c, p74, 3, ca6, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = t0g.f;
        }
        k03.X = bArr3;
        return k03;
    }
}
