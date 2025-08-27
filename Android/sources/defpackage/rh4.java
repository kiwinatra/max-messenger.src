package defpackage;

import java.util.HashMap;
import java.util.Random;

/* renamed from: rh4  reason: default package */
public final class rh4 {
    public static final ad3 h = new ad3(2);
    public static final Random i = new Random();
    public final hkf a = new hkf();
    public final ekf b = new ekf();
    public final HashMap c = new HashMap();
    public ys8 d;
    public jkf e = jkf.a;
    public String f;
    public long g = -1;

    public final void a(qh4 qh4) {
        long j = qh4.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r13 != -1) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qh4 b(int r16, defpackage.nz8 r17) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0015:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x009b
            java.lang.Object r8 = r4.next()
            qh4 r8 = (defpackage.qh4) r8
            long r9 = r8.c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0051
            int r9 = r8.b
            if (r1 != r9) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            rh4 r9 = r8.g
            java.util.HashMap r10 = r9.c
            java.lang.String r13 = r9.f
            java.lang.Object r10 = r10.get(r13)
            qh4 r10 = (defpackage.qh4) r10
            if (r10 == 0) goto L_0x0044
            long r13 = r10.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0044
            goto L_0x0049
        L_0x0044:
            long r9 = r9.g
            r13 = 1
            long r13 = r13 + r9
        L_0x0049:
            long r9 = r2.d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L_0x0051
            r8.c = r9
        L_0x0051:
            nz8 r9 = r8.d
            if (r2 != 0) goto L_0x005a
            int r10 = r8.b
            if (r1 != r10) goto L_0x0015
            goto L_0x007d
        L_0x005a:
            long r13 = r2.d
            if (r9 != 0) goto L_0x006b
            boolean r10 = r17.b()
            if (r10 != 0) goto L_0x0015
            long r11 = r8.c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0015
            goto L_0x007d
        L_0x006b:
            long r10 = r9.d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0015
            int r10 = r2.b
            int r11 = r9.b
            if (r10 != r11) goto L_0x0015
            int r10 = r2.c
            int r11 = r9.c
            if (r10 != r11) goto L_0x0015
        L_0x007d:
            long r10 = r8.c
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0097
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x008a
            goto L_0x0097
        L_0x008a:
            if (r12 != 0) goto L_0x0015
            int r10 = defpackage.v0g.a
            nz8 r10 = r5.d
            if (r10 == 0) goto L_0x0015
            if (r9 == 0) goto L_0x0015
            r5 = r8
            goto L_0x0015
        L_0x0097:
            r5 = r8
            r6 = r10
            goto L_0x0015
        L_0x009b:
            if (r5 != 0) goto L_0x00ad
            ad3 r4 = h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            qh4 r5 = new qh4
            r5.<init>(r15, r4, r1, r2)
            r3.put(r4, r5)
        L_0x00ad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh4.b(int, nz8):qh4");
    }

    public final synchronized String c(jkf jkf, nz8 nz8) {
        return b(jkf.h(nz8.a, this.b).c, nz8).a;
    }

    public final void d(td tdVar) {
        nz8 nz8;
        boolean q = tdVar.b.q();
        HashMap hashMap = this.c;
        if (q) {
            String str = this.f;
            if (str != null) {
                qh4 qh4 = (qh4) hashMap.get(str);
                qh4.getClass();
                a(qh4);
                return;
            }
            return;
        }
        qh4 qh42 = (qh4) hashMap.get(this.f);
        int i2 = tdVar.c;
        nz8 nz82 = tdVar.d;
        this.f = b(i2, nz82).a;
        e(tdVar);
        if (nz82 != null && nz82.b()) {
            long j = nz82.d;
            if (qh42 == null || qh42.c != j || (nz8 = qh42.d) == null || nz8.b != nz82.b || nz8.c != nz82.c) {
                b(i2, new nz8(nz82.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(defpackage.td r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            ys8 r0 = r9.d     // Catch:{ all -> 0x0050 }
            r0.getClass()     // Catch:{ all -> 0x0050 }
            jkf r0 = r10.b     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.q()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r9)
            return
        L_0x0010:
            nz8 r0 = r10.d     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0053
            long r0 = r0.d     // Catch:{ all -> 0x0050 }
            java.util.HashMap r2 = r9.c     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r9.f     // Catch:{ all -> 0x0050 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0050 }
            qh4 r2 = (defpackage.qh4) r2     // Catch:{ all -> 0x0050 }
            r3 = -1
            if (r2 == 0) goto L_0x002b
            long r5 = r2.c     // Catch:{ all -> 0x0050 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            long r5 = r9.g     // Catch:{ all -> 0x0050 }
            r7 = 1
            long r5 = r5 + r7
        L_0x0030:
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            java.util.HashMap r0 = r9.c     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r9.f     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0050 }
            qh4 r0 = (defpackage.qh4) r0     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0053
            long r1 = r0.c     // Catch:{ all -> 0x0050 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            int r0 = r0.b     // Catch:{ all -> 0x0050 }
            int r1 = r10.c     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x0053
            monitor-exit(r9)
            return
        L_0x0050:
            r10 = move-exception
            goto L_0x00fc
        L_0x0053:
            int r0 = r10.c     // Catch:{ all -> 0x0050 }
            nz8 r1 = r10.d     // Catch:{ all -> 0x0050 }
            qh4 r0 = r9.b(r0, r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r9.f     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x0050 }
            r9.f = r1     // Catch:{ all -> 0x0050 }
        L_0x0063:
            nz8 r1 = r10.d     // Catch:{ all -> 0x0050 }
            r2 = 1
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r1.b()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x00b3
            nz8 r1 = new nz8     // Catch:{ all -> 0x0050 }
            nz8 r3 = r10.d     // Catch:{ all -> 0x0050 }
            java.lang.Object r4 = r3.a     // Catch:{ all -> 0x0050 }
            long r5 = r3.d     // Catch:{ all -> 0x0050 }
            int r3 = r3.b     // Catch:{ all -> 0x0050 }
            r1.<init>(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            int r3 = r10.c     // Catch:{ all -> 0x0050 }
            qh4 r1 = r9.b(r3, r1)     // Catch:{ all -> 0x0050 }
            boolean r3 = r1.e     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x00b3
            r1.e = r2     // Catch:{ all -> 0x0050 }
            jkf r1 = r10.b     // Catch:{ all -> 0x0050 }
            nz8 r3 = r10.d     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.a     // Catch:{ all -> 0x0050 }
            ekf r4 = r9.b     // Catch:{ all -> 0x0050 }
            r1.h(r3, r4)     // Catch:{ all -> 0x0050 }
            ekf r1 = r9.b     // Catch:{ all -> 0x0050 }
            nz8 r3 = r10.d     // Catch:{ all -> 0x0050 }
            int r3 = r3.b     // Catch:{ all -> 0x0050 }
            long r3 = r1.d(r3)     // Catch:{ all -> 0x0050 }
            long r3 = defpackage.v0g.h0(r3)     // Catch:{ all -> 0x0050 }
            ekf r1 = r9.b     // Catch:{ all -> 0x0050 }
            long r5 = r1.e     // Catch:{ all -> 0x0050 }
            long r5 = defpackage.v0g.h0(r5)     // Catch:{ all -> 0x0050 }
            long r3 = r3 + r5
            r5 = 0
            java.lang.Math.max(r5, r3)     // Catch:{ all -> 0x0050 }
            ys8 r1 = r9.d     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
        L_0x00b3:
            boolean r1 = r0.e     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x00be
            r0.e = r2     // Catch:{ all -> 0x0050 }
            ys8 r1 = r9.d     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
        L_0x00be:
            java.lang.String r1 = r0.a     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r9.f     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x00fa
            boolean r1 = r0.f     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x00fa
            r0.f = r2     // Catch:{ all -> 0x0050 }
            ys8 r1 = r9.d     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0050 }
            r1.getClass()     // Catch:{ all -> 0x0050 }
            nz8 r2 = r10.d     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x00e0
            boolean r2 = r2.b()     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x00e0
            goto L_0x00fa
        L_0x00e0:
            r1.b()     // Catch:{ all -> 0x0050 }
            r1.z = r0     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = defpackage.xs8.g()     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = r0.setPlayerName("AndroidXMedia3")     // Catch:{ all -> 0x0050 }
            android.media.metrics.PlaybackMetrics$Builder r0 = r0.setPlayerVersion("1.4.1")     // Catch:{ all -> 0x0050 }
            r1.X = r0     // Catch:{ all -> 0x0050 }
            jkf r0 = r10.b     // Catch:{ all -> 0x0050 }
            nz8 r10 = r10.d     // Catch:{ all -> 0x0050 }
            r1.c(r0, r10)     // Catch:{ all -> 0x0050 }
        L_0x00fa:
            monitor-exit(r9)
            return
        L_0x00fc:
            monitor-exit(r9)     // Catch:{ all -> 0x0050 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh4.e(td):void");
    }
}
