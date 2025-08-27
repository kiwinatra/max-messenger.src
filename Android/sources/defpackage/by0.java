package defpackage;

/* renamed from: by0  reason: default package */
public final class by0 {
    public final jx0 a;
    public final bx0 b;
    public final q74 c;
    public final String d;
    public final byte[] e;
    public final ay0 f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public by0(jx0 jx0, q74 q74, byte[] bArr, ay0 ay0) {
        this.a = jx0;
        this.b = jx0.a;
        this.c = q74;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = ay0;
        this.d = jx0.v.b(q74);
        this.g = q74.f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e8 A[Catch:{ IOException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ IOException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0103 A[Catch:{ IOException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013b A[Catch:{ IOException -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0.j
            if (r1 != 0) goto L_0x0170
            q74 r1 = r0.c
            long r3 = r1.f
            long r6 = r1.g
            bx0 r2 = r0.b
            r14 = r2
            tae r14 = (defpackage.tae) r14
            java.lang.String r5 = r0.d
            r2 = r14
            long r2 = r2.g(r3, r5, r6)
            r0.i = r2
            long r2 = r1.g
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0028
            long r6 = r1.f
            long r6 = r6 + r2
            r0.h = r6
            goto L_0x0039
        L_0x0028:
            java.lang.String r2 = r0.d
            od4 r2 = r14.i(r2)
            long r2 = defpackage.nv3.a(r2)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0037
            r2 = r4
        L_0x0037:
            r0.h = r2
        L_0x0039:
            ay0 r6 = r0.f
            if (r6 == 0) goto L_0x0048
            long r7 = r24.b()
            long r9 = r0.i
            r11 = 0
            r6.b(r7, r9, r11)
        L_0x0048:
            long r2 = r0.h
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0056
            long r6 = r0.g
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return
        L_0x0056:
            boolean r2 = r0.j
            if (r2 != 0) goto L_0x016a
            long r2 = r0.h
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 != 0) goto L_0x0067
            r12 = r15
            goto L_0x006b
        L_0x0067:
            long r6 = r0.g
            long r2 = r2 - r6
            r12 = r2
        L_0x006b:
            long r9 = r0.g
            java.lang.String r11 = r0.d
            r8 = r14
            long r2 = r8.h(r9, r11, r12)
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0082
            long r6 = r0.g
            long r6 = r6 + r2
            r0.g = r6
            r11 = r14
            goto L_0x0165
        L_0x0082:
            long r2 = -r2
            int r6 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x0088
            r2 = r4
        L_0x0088:
            long r6 = r0.g
            long r8 = r6 + r2
            long r10 = r0.h
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x009b
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r8 = r10
            goto L_0x009c
        L_0x009b:
            r8 = r9
        L_0x009c:
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            jx0 r12 = r0.a
            if (r11 == 0) goto L_0x00b6
            o74 r11 = r1.a()
            r11.g = r6
            r11.h = r2
            q74 r2 = r11.b()
            long r2 = r12.G(r2)     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b8
        L_0x00b3:
            defpackage.b0h.l(r12)
        L_0x00b6:
            r2 = r4
            r9 = r10
        L_0x00b8:
            if (r9 != 0) goto L_0x00db
            boolean r2 = r0.j
            if (r2 != 0) goto L_0x00d5
            o74 r2 = r1.a()
            r2.g = r6
            r2.h = r4
            q74 r2 = r2.b()
            long r2 = r12.G(r2)     // Catch:{ IOException -> 0x00cf }
            goto L_0x00db
        L_0x00cf:
            r0 = move-exception
            r1 = r0
            defpackage.b0h.l(r12)
            throw r1
        L_0x00d5:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x00db:
            if (r8 == 0) goto L_0x00fe
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00fe
            long r2 = r2 + r6
            long r4 = r0.h     // Catch:{ IOException -> 0x0130 }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00e9
            goto L_0x00fe
        L_0x00e9:
            r0.h = r2     // Catch:{ IOException -> 0x0130 }
            ay0 r2 = r0.f     // Catch:{ IOException -> 0x0130 }
            if (r2 == 0) goto L_0x00fe
            long r18 = r24.b()     // Catch:{ IOException -> 0x0130 }
            long r3 = r0.i     // Catch:{ IOException -> 0x0130 }
            r22 = 0
            r17 = r2
            r20 = r3
            r17.b(r18, r20, r22)     // Catch:{ IOException -> 0x0130 }
        L_0x00fe:
            r2 = r10
            r3 = r2
        L_0x0100:
            r4 = -1
            if (r2 == r4) goto L_0x0138
            boolean r2 = r0.j     // Catch:{ IOException -> 0x0130 }
            if (r2 != 0) goto L_0x0132
            byte[] r2 = r0.e     // Catch:{ IOException -> 0x0130 }
            int r5 = r2.length     // Catch:{ IOException -> 0x0130 }
            int r2 = r12.read(r2, r10, r5)     // Catch:{ IOException -> 0x0130 }
            if (r2 == r4) goto L_0x0100
            long r4 = (long) r2     // Catch:{ IOException -> 0x0130 }
            long r10 = r0.i     // Catch:{ IOException -> 0x0130 }
            long r10 = r10 + r4
            r0.i = r10     // Catch:{ IOException -> 0x0130 }
            ay0 r10 = r0.f     // Catch:{ IOException -> 0x0130 }
            if (r10 == 0) goto L_0x012b
            long r18 = r24.b()     // Catch:{ IOException -> 0x0130 }
            r11 = r14
            long r13 = r0.i     // Catch:{ IOException -> 0x0130 }
            r17 = r10
            r20 = r13
            r22 = r4
            r17.b(r18, r20, r22)     // Catch:{ IOException -> 0x0130 }
            goto L_0x012c
        L_0x012b:
            r11 = r14
        L_0x012c:
            int r3 = r3 + r2
            r14 = r11
            r10 = 0
            goto L_0x0100
        L_0x0130:
            r0 = move-exception
            goto L_0x015a
        L_0x0132:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0130 }
            r0.<init>()     // Catch:{ IOException -> 0x0130 }
            throw r0     // Catch:{ IOException -> 0x0130 }
        L_0x0138:
            r11 = r14
            if (r8 == 0) goto L_0x015e
            long r4 = (long) r3     // Catch:{ IOException -> 0x0130 }
            long r4 = r4 + r6
            long r8 = r0.h     // Catch:{ IOException -> 0x0130 }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0144
            goto L_0x015e
        L_0x0144:
            r0.h = r4     // Catch:{ IOException -> 0x0130 }
            ay0 r2 = r0.f     // Catch:{ IOException -> 0x0130 }
            if (r2 == 0) goto L_0x015e
            long r18 = r24.b()     // Catch:{ IOException -> 0x0130 }
            long r4 = r0.i     // Catch:{ IOException -> 0x0130 }
            r22 = 0
            r17 = r2
            r20 = r4
            r17.b(r18, r20, r22)     // Catch:{ IOException -> 0x0130 }
            goto L_0x015e
        L_0x015a:
            defpackage.b0h.l(r12)
            throw r0
        L_0x015e:
            r12.close()
            long r2 = (long) r3
            long r6 = r6 + r2
            r0.g = r6
        L_0x0165:
            r14 = r11
            r4 = -1
            goto L_0x0048
        L_0x016a:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0170:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by0.a():void");
    }

    public final long b() {
        long j2 = this.h;
        if (j2 == -1) {
            return -1;
        }
        return j2 - this.c.f;
    }
}
