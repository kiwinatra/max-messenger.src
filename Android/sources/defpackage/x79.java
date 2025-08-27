package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: x79  reason: default package */
public final class x79 extends rc3 {
    public static final gr8 r;
    public final xj0[] k;
    public final ikf[] l;
    public final ArrayList m;
    public final o9a n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    /* JADX WARNING: type inference failed for: r4v0, types: [pq8, rq8] */
    static {
        oq8 oq8 = new oq8();
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        Collections.emptyList();
        k0d k0d2 = k0d.v;
        r = new gr8("MergingMediaSource", new pq8(oq8), (zq8) null, new vq8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), ts8.Q0);
    }

    public x79(xj0... xj0Arr) {
        o9a o9a = new o9a(10);
        this.k = xj0Arr;
        this.n = o9a;
        this.m = new ArrayList(Arrays.asList(xj0Arr));
        this.l = new ikf[xj0Arr.length];
        this.p = new long[0][];
        new HashMap();
        m5a.m(8, "expectedKeys");
        new kx9().f().f();
    }

    public final lt8 a(mz8 mz8, cb4 cb4, long j) {
        xj0[] xj0Arr = this.k;
        int length = xj0Arr.length;
        lt8[] lt8Arr = new lt8[length];
        ikf[] ikfArr = this.l;
        int b = ikfArr[0].b(mz8.a);
        for (int i = 0; i < length; i++) {
            lt8Arr[i] = xj0Arr[i].a(mz8.b(ikfArr[i].m(b)), cb4, j - this.p[b][i]);
        }
        return new v79(this.n, this.p[b], lt8Arr);
    }

    public final gr8 f() {
        xj0[] xj0Arr = this.k;
        return xj0Arr.length > 0 ? xj0Arr[0].f() : r;
    }

    public final void g() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.g();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void i(arf arf) {
        this.j = arf;
        this.i = t0g.m((Handler.Callback) null);
        int i = 0;
        while (true) {
            xj0[] xj0Arr = this.k;
            if (i < xj0Arr.length) {
                r(Integer.valueOf(i), xj0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void k(lt8 lt8) {
        v79 v79 = (v79) lt8;
        int i = 0;
        while (true) {
            xj0[] xj0Arr = this.k;
            if (i < xj0Arr.length) {
                xj0 xj0 = xj0Arr[i];
                lt8 lt82 = v79.a[i];
                if (lt82 instanceof t79) {
                    lt82 = ((t79) lt82).a;
                }
                xj0.k(lt82);
                i++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        super.m();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final mz8 p(Object obj, mz8 mz8) {
        if (((Integer) obj).intValue() == 0) {
            return mz8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.io.IOException, com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException] */
    public final void q(Integer num, xj0 xj0, ikf ikf) {
        if (this.q == null) {
            if (this.o == -1) {
                this.o = ikf.i();
            } else if (ikf.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            ikf[] ikfArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = ikfArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(xj0);
            ikfArr[num.intValue()] = ikf;
            if (arrayList.isEmpty()) {
                j(ikfArr[0]);
            }
        }
    }
}
