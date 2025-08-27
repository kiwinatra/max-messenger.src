package defpackage;

import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: td4  reason: default package */
public final class td4 {
    public final y28 a;
    public final qpg b;
    public final int[] c;
    public final int d;
    public final j74 e;
    public final long f;
    public final int g;
    public final gpb h;
    public final pd4[] i;
    public md5 j;
    public y54 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public td4(qf4 qf4, y28 y28, y54 y54, qpg qpg, int i2, int[] iArr, md5 md5, int i3, j74 j74, long j2, int i4, boolean z, ArrayList arrayList, gpb gpb) {
        y54 y542 = y54;
        qpg qpg2 = qpg;
        int i5 = i2;
        md5 md52 = md5;
        this.a = y28;
        this.k = y542;
        this.b = qpg2;
        this.c = iArr;
        this.j = md52;
        this.d = i3;
        this.e = j74;
        this.l = i5;
        this.f = j2;
        this.g = i4;
        this.h = gpb;
        long d2 = y542.d(i5);
        ArrayList a2 = a();
        this.i = new pd4[md5.length()];
        int i6 = 0;
        while (i6 < this.i.length) {
            x2d x2d = (x2d) a2.get(md52.f(i6));
            ml0 w = qpg2.w(x2d.b);
            int i7 = i6;
            this.i[i7] = new pd4(d2, x2d, w == null ? (ml0) x2d.b.get(0) : w, qf4.b(i3, x2d.a, z, arrayList, gpb), 0, x2d.c(), 1);
            i6 = i7 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i2 : this.c) {
            arrayList.addAll(((s9) list.get(i2)).c);
        }
        return arrayList;
    }

    public final pd4 b(int i2) {
        pd4[] pd4Arr = this.i;
        pd4 pd4 = pd4Arr[i2];
        ml0 w = this.b.w(((x2d) pd4.e).b);
        if (w == null || w.equals((ml0) pd4.f)) {
            return pd4;
        }
        pd4 pd42 = new pd4(pd4.b, (x2d) pd4.e, w, (n03) pd4.d, pd4.c, (q64) pd4.g, 1);
        pd4Arr[i2] = pd42;
        return pd42;
    }

    public final void c(md5 md5) {
        this.j = md5;
    }
}
