package defpackage;

import java.util.concurrent.Executor;

/* renamed from: m87  reason: default package */
public final class m87 extends h87 {
    public final Executor w0;
    public final Object x0 = new Object();
    public ha7 y0;
    public l87 z0;

    public m87(Executor executor) {
        this.w0 = executor;
    }

    public final ha7 a(ja7 ja7) {
        return ja7.e();
    }

    public final void c() {
        synchronized (this.x0) {
            try {
                ha7 ha7 = this.y0;
                if (ha7 != null) {
                    ha7.close();
                    this.y0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.ha7 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.x0
            monitor-enter(r0)
            boolean r1 = r5.v0     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            r6.close()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r5 = move-exception
            goto L_0x0054
        L_0x000e:
            l87 r1 = r5.z0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0039
            l97 r1 = r6.getImageInfo()     // Catch:{ all -> 0x000c }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x000c }
            l87 r3 = r5.z0     // Catch:{ all -> 0x000c }
            ha7 r3 = r3.b     // Catch:{ all -> 0x000c }
            l97 r3 = r3.getImageInfo()     // Catch:{ all -> 0x000c }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x000c }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002e
            r6.close()     // Catch:{ all -> 0x000c }
            goto L_0x0037
        L_0x002e:
            ha7 r1 = r5.y0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x0035:
            r5.y0 = r6     // Catch:{ all -> 0x000c }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0039:
            l87 r1 = new l87     // Catch:{ all -> 0x000c }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x000c }
            r5.z0 = r1     // Catch:{ all -> 0x000c }
            zz7 r5 = r5.b(r1)     // Catch:{ all -> 0x000c }
            e4 r6 = new e4     // Catch:{ all -> 0x000c }
            r2 = 21
            r6.<init>((int) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x000c }
            ep4 r1 = defpackage.ryg.j()     // Catch:{ all -> 0x000c }
            defpackage.hd8.a(r5, r6, r1)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m87.e(ha7):void");
    }
}
