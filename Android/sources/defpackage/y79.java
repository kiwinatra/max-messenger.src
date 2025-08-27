package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: y79  reason: default package */
public final class y79 extends sc3 {
    public static final ir8 r;
    public final yj0[] k;
    public final jkf[] l;
    public final ArrayList m;
    public final p9a n;
    public int o = -1;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        oq8 oq8 = new oq8();
        gc4 gc4 = new gc4();
        Collections.emptyList();
        k0d k0d = k0d.v;
        uq8 uq8 = new uq8();
        ar8 ar8 = ar8.d;
        n79.n(((Uri) gc4.e) == null || ((UUID) gc4.d) != null);
        r = new ir8("MergingMediaSource", oq8.c(), (xq8) null, uq8.a(), us8.J, ar8);
    }

    public y79(yj0... yj0Arr) {
        p9a p9a = new p9a(10);
        this.k = yj0Arr;
        this.n = p9a;
        this.m = new ArrayList(Arrays.asList(yj0Arr));
        this.l = new jkf[yj0Arr.length];
        this.p = new long[0][];
        new HashMap();
        m5a.m(8, "expectedKeys");
        new kx9().f().f();
    }

    public final boolean a(ir8 ir8) {
        yj0[] yj0Arr = this.k;
        return yj0Arr.length > 0 && yj0Arr[0].a(ir8);
    }

    public final mt8 c(nz8 nz8, cb4 cb4, long j) {
        yj0[] yj0Arr = this.k;
        int length = yj0Arr.length;
        mt8[] mt8Arr = new mt8[length];
        jkf[] jkfArr = this.l;
        int b = jkfArr[0].b(nz8.a);
        for (int i = 0; i < length; i++) {
            mt8Arr[i] = yj0Arr[i].c(nz8.a(jkfArr[i].m(b)), cb4, j - this.p[b][i]);
        }
        return new w79(this.n, this.p[b], mt8Arr);
    }

    public final ir8 i() {
        yj0[] yj0Arr = this.k;
        return yj0Arr.length > 0 ? yj0Arr[0].i() : r;
    }

    public final void k() {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException == null) {
            super.k();
            return;
        }
        throw mergingMediaSource$IllegalMergeException;
    }

    public final void m(brf brf) {
        this.j = brf;
        this.i = v0g.o((Handler.Callback) null);
        int i = 0;
        while (true) {
            yj0[] yj0Arr = this.k;
            if (i < yj0Arr.length) {
                y(Integer.valueOf(i), yj0Arr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void o(mt8 mt8) {
        w79 w79 = (w79) mt8;
        int i = 0;
        while (true) {
            yj0[] yj0Arr = this.k;
            if (i < yj0Arr.length) {
                yj0 yj0 = yj0Arr[i];
                mt8 mt82 = w79.a[i];
                if (mt82 instanceof kjf) {
                    mt82 = ((kjf) mt82).a;
                }
                yj0.o(mt82);
                i++;
            } else {
                return;
            }
        }
    }

    public final void q() {
        super.q();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    public final void t(ir8 ir8) {
        this.k[0].t(ir8);
    }

    public final nz8 u(Object obj, nz8 nz8) {
        if (((Integer) obj).intValue() == 0) {
            return nz8;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException, java.io.IOException] */
    public final void x(Object obj, yj0 yj0, jkf jkf) {
        Integer num = (Integer) obj;
        if (this.q == null) {
            if (this.o == -1) {
                this.o = jkf.i();
            } else if (jkf.i() != this.o) {
                this.q = new IOException();
                return;
            }
            int length = this.p.length;
            jkf[] jkfArr = this.l;
            if (length == 0) {
                int i = this.o;
                int[] iArr = new int[2];
                iArr[1] = jkfArr.length;
                iArr[0] = i;
                this.p = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(yj0);
            jkfArr[num.intValue()] = jkf;
            if (arrayList.isEmpty()) {
                n(jkfArr[0]);
            }
        }
    }
}
