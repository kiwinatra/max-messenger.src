package defpackage;

import java.util.concurrent.Executor;

/* renamed from: s38  reason: default package */
public abstract class s38 implements xvb {
    public final Executor a;
    public final p7d b;

    public s38(Executor executor, p7d p7d) {
        this.a = executor;
        this.b = p7d;
    }

    public final void a(zi0 zi0, yvb yvb) {
        ik0 ik0 = (ik0) yvb;
        bwb bwb = ik0.c;
        ik0.h("local", "fetch");
        r38 r38 = new r38(this, zi0, bwb, yvb, e(), ik0.a, bwb, yvb);
        ik0.a(new o38(r38, 1));
        this.a.execute(r38);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        defpackage.a43.b(r4);
        defpackage.y33.U((defpackage.y33) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x0005, B:4:0x0011, B:15:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.j55 c(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            p7d r3 = r3.b
            r0 = 0
            if (r5 > 0) goto L_0x002c
            r3.getClass()     // Catch:{ all -> 0x0025 }
            f69 r5 = new f69     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x0025 }
            d69 r1 = (defpackage.d69) r1     // Catch:{ all -> 0x0025 }
            r5.<init>(r1)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0027 }
            ni0 r3 = (defpackage.ni0) r3     // Catch:{ all -> 0x0027 }
            r3.l(r4, r5)     // Catch:{ all -> 0x0027 }
            e69 r3 = r5.n()     // Catch:{ all -> 0x0027 }
            r5.close()     // Catch:{ all -> 0x0025 }
            jd4 r3 = defpackage.y33.p0(r3)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            r0 = r3
            goto L_0x004b
        L_0x0025:
            r3 = move-exception
            goto L_0x005c
        L_0x0027:
            r3 = move-exception
            r5.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x002c:
            r3.getClass()     // Catch:{ all -> 0x0025 }
            f69 r1 = new f69     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r3.b     // Catch:{ all -> 0x0025 }
            d69 r2 = (defpackage.d69) r2     // Catch:{ all -> 0x0025 }
            r1.<init>(r2, r5)     // Catch:{ all -> 0x0025 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0057 }
            ni0 r3 = (defpackage.ni0) r3     // Catch:{ all -> 0x0057 }
            r3.l(r4, r1)     // Catch:{ all -> 0x0057 }
            e69 r3 = r1.n()     // Catch:{ all -> 0x0057 }
            r1.close()     // Catch:{ all -> 0x0025 }
            jd4 r3 = defpackage.y33.p0(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x004b:
            j55 r3 = new j55     // Catch:{ all -> 0x0025 }
            r3.<init>(r0)     // Catch:{ all -> 0x0025 }
            defpackage.a43.b(r4)
            defpackage.y33.U(r0)
            return r3
        L_0x0057:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x005c:
            defpackage.a43.b(r4)
            defpackage.y33.U(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s38.c(java.io.InputStream, int):j55");
    }

    public abstract j55 d(qa7 qa7);

    public abstract String e();
}
