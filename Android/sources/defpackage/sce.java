package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* renamed from: sce  reason: default package */
public final class sce implements mt8, q28 {
    public final ea6 X;
    public final boolean Y;
    public boolean Z;
    public final q74 a;
    public final g74 b;
    public final brf c;
    public final nfd o;
    public final cs v;
    public byte[] v0;
    public final upf w;
    public int w0;
    public final ArrayList x = new ArrayList();
    public final long y;
    public final l15 z = new l15("SingleSampleMediaPeriod");

    public sce(q74 q74, g74 g74, brf brf, ea6 ea6, long j, nfd nfd, cs csVar, boolean z2) {
        this.a = q74;
        this.b = g74;
        this.c = brf;
        this.X = ea6;
        this.y = j;
        this.o = nfd;
        this.v = csVar;
        this.Y = z2;
        this.w = new upf(new spf("", ea6));
    }

    public final void A(long j) {
    }

    public final void E(t28 t28, long j, long j2, boolean z2) {
        tne tne = ((rce) t28).c;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.o.getClass();
        this.v.v(l28, 1, -1, (ea6) null, 0, (Object) null, 0, this.y);
    }

    public final void H(t28 t28, long j, long j2) {
        rce rce = (rce) t28;
        this.w0 = (int) rce.c.b;
        byte[] bArr = rce.o;
        bArr.getClass();
        this.v0 = bArr;
        this.Z = true;
        tne tne = rce.c;
        Uri uri = tne.c;
        l28 l28 = new l28(j2, tne.o);
        this.o.getClass();
        this.v.x(l28, 1, -1, this.X, 0, (Object) null, 0, this.y);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.p01 Z(defpackage.t28 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = r25
            r2 = 1
            r3 = r19
            rce r3 = (defpackage.rce) r3
            tne r3 = r3.c
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
            if (r3 != 0) goto L_0x0059
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0059
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0059
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0059
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0037:
            if (r3 == 0) goto L_0x004c
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0047
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0047
            goto L_0x0059
        L_0x0047:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0037
        L_0x004c:
            int r3 = r1 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x005a
        L_0x0059:
            r13 = r5
        L_0x005a:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r15 = 0
            if (r3 == 0) goto L_0x0065
            r5 = 3
            if (r1 < r5) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r1 = r15
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            boolean r5 = r0.Y
            if (r5 == 0) goto L_0x0077
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = "Loading failed, treating as end-of-stream."
            defpackage.i8b.W(r1, r11)
            r0.Z = r2
            p01 r1 = defpackage.l15.v
        L_0x0075:
            r13 = r1
            goto L_0x0087
        L_0x0077:
            if (r3 == 0) goto L_0x0084
            p01 r1 = new p01
            r16 = 5
            r17 = 0
            r12 = r1
            r12.<init>(r13, r15, r16, r17)
            goto L_0x0075
        L_0x0084:
            p01 r1 = defpackage.l15.w
            goto L_0x0075
        L_0x0087:
            boolean r1 = r13.a()
            r12 = r1 ^ 1
            r7 = 0
            long r9 = r0.y
            cs r1 = r0.v
            r2 = 1
            r3 = -1
            ea6 r5 = r0.X
            r6 = 0
            r14 = 0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.z(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sce.Z(t28, long, long, java.io.IOException, int):p01");
    }

    public final boolean d() {
        return this.z.z();
    }

    public final long g(md5[] md5Arr, boolean[] zArr, lcd[] lcdArr, boolean[] zArr2, long j) {
        for (int i = 0; i < md5Arr.length; i++) {
            lcd lcd = lcdArr[i];
            ArrayList arrayList = this.x;
            if (lcd != null && (md5Arr[i] == null || !zArr[i])) {
                arrayList.remove(lcd);
                lcdArr[i] = null;
            }
            if (lcdArr[i] == null && md5Arr[i] != null) {
                qce qce = new qce(this);
                arrayList.add(qce);
                lcdArr[i] = qce;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public final long h(long j, und und) {
        return j;
    }

    public final long i() {
        return (this.Z || this.z.z()) ? Long.MIN_VALUE : 0;
    }

    public final void j(kt8 kt8, long j) {
        kt8.b(this);
    }

    public final boolean k(d38 d38) {
        if (this.Z) {
            return false;
        }
        l15 l15 = this.z;
        if (l15.z() || l15.s()) {
            return false;
        }
        j74 a2 = this.b.a();
        brf brf = this.c;
        if (brf != null) {
            a2.H(brf);
        }
        rce rce = new rce(a2, this.a);
        this.v.C(new l28(rce.a, this.a, l15.F(rce, this, this.o.p(1))), 1, -1, this.X, 0, (Object) null, 0, this.y);
        return true;
    }

    public final void r() {
    }

    public final long s(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                return j;
            }
            qce qce = (qce) arrayList.get(i);
            if (qce.a == 2) {
                qce.a = 1;
            }
            i++;
        }
    }

    public final long w() {
        return -9223372036854775807L;
    }

    public final upf x() {
        return this.w;
    }

    public final long y() {
        return this.Z ? Long.MIN_VALUE : 0;
    }

    public final void z(long j, boolean z2) {
    }
}
