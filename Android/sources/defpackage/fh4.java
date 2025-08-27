package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: fh4  reason: default package */
public final class fh4 implements lz8 {
    public final ce a;
    public g74 b;
    public gze c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    /* JADX WARNING: type inference failed for: r1v1, types: [ce, java.lang.Object] */
    public fh4(Context context, jf4 jf4) {
        g74 ud4 = new ud4(context);
        this.b = ud4;
        ece ece = new ece(10);
        this.c = ece;
        ? obj = new Object();
        obj.b = jf4;
        obj.w = ece;
        obj.c = new HashMap();
        obj.o = new HashMap();
        obj.a = true;
        this.a = obj;
        if (ud4 != ((g74) obj.v)) {
            obj.v = ud4;
            ((HashMap) obj.c).clear();
            ((HashMap) obj.o).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static lz8 f(Class cls, g74 g74) {
        try {
            return (lz8) cls.getConstructor(new Class[]{g74.class}).newInstance(new Object[]{g74});
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final lz8 a() {
        n79.k((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.i = z;
        ce ceVar = this.a;
        ceVar.a = z;
        ((zf5) ceVar.b).i(z);
        for (lz8 b2 : ((HashMap) ceVar.o).values()) {
            b2.b(z);
        }
    }

    public final lz8 c() {
        n79.k((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: m33} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: qq8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: sq8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yj0 d(defpackage.ir8 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = 10
            r3 = 1
            xq8 r4 = r1.b
            r4.getClass()
            xq8 r4 = r1.b
            android.net.Uri r4 = r4.a
            java.lang.String r4 = r4.getScheme()
            r5 = 0
            if (r4 == 0) goto L_0x0021
            java.lang.String r6 = "ssai"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            throw r5
        L_0x0021:
            xq8 r4 = r1.b
            java.lang.String r4 = r4.b
            java.lang.String r6 = "application/x-image-uri"
            boolean r4 = java.util.Objects.equals(r4, r6)
            if (r4 != 0) goto L_0x0268
            xq8 r4 = r1.b
            android.net.Uri r6 = r4.a
            java.lang.String r4 = r4.b
            int r4 = defpackage.v0g.J(r6, r4)
            xq8 r6 = r1.b
            long r6 = r6.i
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            ce r6 = r0.a
            java.lang.Object r6 = r6.b
            zf5 r6 = (defpackage.zf5) r6
            boolean r7 = r6 instanceof defpackage.jf4
            if (r7 == 0) goto L_0x0058
            jf4 r6 = (defpackage.jf4) r6
            monitor-enter(r6)
            r6.x = r3     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)
            goto L_0x0058
        L_0x0055:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x0058:
            ce r6 = r0.a     // Catch:{ ClassNotFoundException -> 0x0261 }
            lz8 r4 = r6.i(r4)     // Catch:{ ClassNotFoundException -> 0x0261 }
            wq8 r6 = r1.c
            uq8 r6 = r6.a()
            wq8 r7 = r1.c
            long r10 = r7.a
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0070
            long r10 = r0.d
            r6.a = r10
        L_0x0070:
            float r10 = r7.d
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x007d
            float r10 = r0.g
            r6.d = r10
        L_0x007d:
            float r10 = r7.e
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0087
            float r10 = r0.h
            r6.e = r10
        L_0x0087:
            long r10 = r7.b
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0091
            long r10 = r0.e
            r6.b = r10
        L_0x0091:
            long r10 = r7.c
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x009b
            long r7 = r0.f
            r6.c = r7
        L_0x009b:
            wq8 r7 = new wq8
            r7.<init>(r6)
            wq8 r6 = r1.c
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x00b6
            nq8 r1 = r35.a()
            uq8 r6 = r7.a()
            r1.m = r6
            ir8 r1 = r1.a()
        L_0x00b6:
            yj0 r4 = r4.d(r1)
            xq8 r6 = r1.b
            tb7 r6 = r6.g
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0223
            int r7 = r6.size()
            int r7 = r7 + r3
            yj0[] r7 = new defpackage.yj0[r7]
            r8 = 0
            r7[r8] = r4
            r4 = r8
        L_0x00cf:
            int r9 = r6.size()
            if (r4 >= r9) goto L_0x021e
            boolean r9 = r0.i
            if (r9 == 0) goto L_0x01fc
            ba6 r9 = new ba6
            r9.<init>()
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            java.lang.String r10 = r10.b
            java.lang.String r10 = defpackage.vq9.l(r10)
            r9.m = r10
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            java.lang.String r10 = r10.c
            r9.d = r10
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            int r10 = r10.d
            r9.e = r10
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            int r10 = r10.e
            r9.f = r10
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            java.lang.String r10 = r10.f
            r9.b = r10
            java.lang.Object r10 = r6.get(r4)
            er8 r10 = (defpackage.er8) r10
            java.lang.String r10 = r10.g
            r9.a = r10
            ea6 r10 = new ea6
            r10.<init>(r9)
            ib4 r9 = new ib4
            r11 = 6
            r9.<init>(r11, r0, r10)
            g74 r14 = r0.b
            y3a r15 = new y3a
            r10 = 19
            r15.<init>((int) r10, (java.lang.Object) r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            nfd r10 = new nfd
            r10.<init>(r2)
            int r11 = r4 + 1
            java.lang.Object r12 = r6.get(r4)
            er8 r12 = (defpackage.er8) r12
            android.net.Uri r12 = r12.a
            java.lang.String r12 = r12.toString()
            oq8 r13 = new oq8
            r13.<init>()
            gc4 r8 = new gc4
            r8.<init>()
            java.util.List r21 = java.util.Collections.emptyList()
            k0d r23 = defpackage.k0d.v
            uq8 r3 = new uq8
            r3.<init>()
            ar8 r33 = defpackage.ar8.d
            if (r12 != 0) goto L_0x0166
            r17 = r5
            goto L_0x016c
        L_0x0166:
            android.net.Uri r12 = android.net.Uri.parse(r12)
            r17 = r12
        L_0x016c:
            java.lang.Object r12 = r8.e
            android.net.Uri r12 = (android.net.Uri) r12
            if (r12 == 0) goto L_0x017b
            java.lang.Object r12 = r8.d
            java.util.UUID r12 = (java.util.UUID) r12
            if (r12 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r12 = 0
            goto L_0x017c
        L_0x017b:
            r12 = 1
        L_0x017c:
            defpackage.n79.n(r12)
            if (r17 == 0) goto L_0x01a6
            xq8 r12 = new xq8
            java.lang.Object r2 = r8.d
            java.util.UUID r2 = (java.util.UUID) r2
            if (r2 == 0) goto L_0x0191
            tq8 r2 = new tq8
            r2.<init>(r8)
            r19 = r2
            goto L_0x0193
        L_0x0191:
            r19 = r5
        L_0x0193:
            r20 = 0
            r22 = 0
            r18 = 0
            r24 = 0
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01a7
        L_0x01a6:
            r12 = r5
        L_0x01a7:
            ir8 r2 = new ir8
            sq8 r8 = new sq8
            r8.<init>(r13)
            wq8 r13 = new wq8
            r13.<init>(r3)
            us8 r32 = defpackage.us8.J
            java.lang.String r28 = ""
            r27 = r2
            r29 = r8
            r30 = r12
            r31 = r13
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r12.getClass()
            i8c r3 = new i8c
            xq8 r8 = r2.b
            r8.getClass()
            xq8 r8 = r2.b
            tq8 r8 = r8.c
            if (r8 != 0) goto L_0x01d7
            kw4 r8 = defpackage.pw4.a
        L_0x01d4:
            r16 = r8
            goto L_0x01eb
        L_0x01d7:
            monitor-enter(r9)
            boolean r12 = r8.equals(r5)     // Catch:{ all -> 0x01e3 }
            if (r12 != 0) goto L_0x01e5
            pe4 r8 = defpackage.jk3.g(r8)     // Catch:{ all -> 0x01e3 }
            goto L_0x01e6
        L_0x01e3:
            r0 = move-exception
            goto L_0x01fa
        L_0x01e5:
            r8 = r5
        L_0x01e6:
            r8.getClass()     // Catch:{ all -> 0x01e3 }
            monitor-exit(r9)     // Catch:{ all -> 0x01e3 }
            goto L_0x01d4
        L_0x01eb:
            r18 = 1048576(0x100000, float:1.469368E-39)
            r12 = r3
            r13 = r2
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r7[r11] = r3
            r8 = 10
            r9 = 1
            goto L_0x0218
        L_0x01fa:
            monitor-exit(r9)     // Catch:{ all -> 0x01e3 }
            throw r0
        L_0x01fc:
            g74 r2 = r0.b
            r2.getClass()
            nfd r3 = new nfd
            r8 = 10
            r3.<init>(r8)
            r9 = 1
            int r10 = r4 + 1
            java.lang.Object r11 = r6.get(r4)
            er8 r11 = (defpackage.er8) r11
            tce r12 = new tce
            r12.<init>(r11, r2, r3)
            r7[r10] = r12
        L_0x0218:
            int r4 = r4 + r9
            r2 = r8
            r3 = r9
            r8 = 0
            goto L_0x00cf
        L_0x021e:
            y79 r4 = new y79
            r4.<init>(r7)
        L_0x0223:
            r9 = r4
            sq8 r0 = r1.e
            long r10 = r0.b
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x023b
            long r2 = r0.d
            r4 = -9223372036854775808
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x023b
            boolean r2 = r0.f
            if (r2 != 0) goto L_0x023b
            goto L_0x024f
        L_0x023b:
            m33 r2 = new m33
            long r12 = r0.d
            boolean r3 = r0.g
            r4 = 1
            r14 = r3 ^ 1
            boolean r15 = r0.e
            boolean r0 = r0.f
            r8 = r2
            r16 = r0
            r8.<init>(r9, r10, r12, r14, r15, r16)
            r9 = r2
        L_0x024f:
            xq8 r0 = r1.b
            r0.getClass()
            xq8 r0 = r1.b
            mq8 r0 = r0.d
            if (r0 != 0) goto L_0x025b
            goto L_0x0260
        L_0x025b:
            java.lang.String r0 = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."
            defpackage.i8b.V(r0)
        L_0x0260:
            return r9
        L_0x0261:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0268:
            xq8 r0 = r1.b
            long r0 = r0.i
            int r0 = defpackage.v0g.a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh4.d(ir8):yj0");
    }

    public final void e(ece ece) {
        ece.getClass();
        this.c = ece;
        ce ceVar = this.a;
        ceVar.w = ece;
        ((zf5) ceVar.b).e(ece);
        for (lz8 e2 : ((HashMap) ceVar.o).values()) {
            e2.e(ece);
        }
    }
}
