package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sd4  reason: default package */
public final class sd4 {
    public final x28 a;
    public final tgg b;
    public final int[] c;
    public final int d;
    public final h74 e;
    public final long f;
    public final fpb g;
    public final pd4[] h;
    public ld5 i;
    public x54 j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;

    public sd4(x28 x28, x54 x54, tgg tgg, int i2, int[] iArr, ld5 ld5, int i3, h74 h74, long j2, boolean z, ArrayList arrayList, fpb fpb) {
        sf5 sf5;
        x54 x542 = x54;
        tgg tgg2 = tgg;
        int i4 = i2;
        ld5 ld52 = ld5;
        int i5 = i3;
        fpb fpb2 = fpb;
        this.a = x28;
        this.j = x542;
        this.b = tgg2;
        this.c = iArr;
        this.i = ld52;
        this.d = i5;
        this.e = h74;
        this.k = i4;
        this.f = j2;
        this.g = fpb2;
        long d2 = x542.d(i4);
        ArrayList a2 = a();
        this.h = new pd4[ld5.length()];
        int i6 = 0;
        while (i6 < this.h.length) {
            w2d w2d = (w2d) a2.get(ld52.f(i6));
            ll0 z2 = tgg2.z(w2d.b);
            pd4[] pd4Arr = this.h;
            ll0 ll0 = z2 == null ? (ll0) w2d.b.get(0) : z2;
            ca6 ca6 = w2d.a;
            String str = ca6.Y;
            nv0 nv0 = null;
            if (uq9.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    sf5 = new vpc(ca6);
                    ArrayList arrayList2 = arrayList;
                } else {
                    ArrayList arrayList3 = arrayList;
                    int i7 = i6;
                    pd4Arr[i7] = new pd4(d2, w2d, ll0, nv0, 0, w2d.c(), 0);
                    i6 = i7 + 1;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                ArrayList arrayList4 = arrayList;
                sf5 = new kh8(1);
            } else {
                sf5 = new ud6(z ? 4 : 0, (qkf) null, arrayList, fpb2);
            }
            nv0 = new nv0(sf5, i5, ca6);
            int i72 = i6;
            pd4Arr[i72] = new pd4(d2, w2d, ll0, nv0, 0, w2d.c(), 0);
            i6 = i72 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((r9) list.get(i2)).c);
        }
        return arrayList;
    }

    public final pd4 b(int i2) {
        pd4[] pd4Arr = this.h;
        pd4 pd4 = pd4Arr[i2];
        ll0 z = this.b.z(((w2d) pd4.e).b);
        if (z == null || z.equals((ll0) pd4.f)) {
            return pd4;
        }
        pd4 pd42 = new pd4(pd4.b, (w2d) pd4.e, z, (nv0) pd4.d, pd4.c, (p64) pd4.g, 0);
        pd4Arr[i2] = pd42;
        return pd42;
    }
}
