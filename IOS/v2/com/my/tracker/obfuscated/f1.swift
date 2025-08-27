package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;

public final class f1 {
    final d1 a;
    final int b;
    final int c;
    final int d;
    final int e;
    long f;
    long g;

    private f1(d1 d1Var, int i, int i2, int i3, int i4) {
        this.a = d1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        Long b2 = d1Var.b("timestamp_base");
        this.f = b2 == null ? 0 : b2.longValue();
        this.g = d1Var.l();
    }

    public boolean a() {
        d1.f a2;
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.a.a("custom_events_skipped_count", (Long) null);
            long j = 0;
            this.g = 0;
            a2 = this.a.a("default_session");
            if (a2.b()) {
                j = a2.m();
            }
            c(j);
            a2.close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
        throw th;
    }

    public x1 b() {
        return new y1(this.a);
    }

    public z1 c() {
        return new a2(this.a, "default_session");
    }

    public b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r1 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List e() {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.my.tracker.obfuscated.d1 r8 = r8.a     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.d1$b r1 = r8.h()     // Catch:{ all -> 0x003c }
        L_0x000c:
            boolean r8 = r1.b()     // Catch:{ all -> 0x003c }
            if (r8 == 0) goto L_0x0044
            java.lang.String r2 = r1.m()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r1.n()     // Catch:{ all -> 0x003c }
            java.lang.String r4 = r1.o()     // Catch:{ all -> 0x003c }
            int r5 = r1.p()     // Catch:{ all -> 0x003c }
            long r6 = r1.e()     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.f r8 = com.my.tracker.obfuscated.f.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003c }
            if (r8 == 0) goto L_0x000c
            long r2 = r1.a()     // Catch:{ all -> 0x003c }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.f r8 = r8.a((java.lang.Long) r2)     // Catch:{ all -> 0x003c }
            r0.add(r8)     // Catch:{ all -> 0x003c }
            goto L_0x000c
        L_0x003c:
            r8 = move-exception
            java.lang.String r2 = "MyTrackerRepository error: error while reading purchases"
            com.my.tracker.obfuscated.x2.b(r2, r8)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0047
        L_0x0044:
            r1.close()
        L_0x0047:
            return r0
        L_0x0048:
            r8 = move-exception
            if (r1 == 0) goto L_0x004e
            r1.close()
        L_0x004e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.f1.e():java.util.List");
    }

    public long f() {
        try {
            Long b2 = this.a.b("custom_events_skipped_count");
            if (b2 == null) {
                return 0;
            }
            return b2.longValue();
        } catch (Throwable th) {
            x2.b("Error: get custom events skipped count", th);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List g() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.my.tracker.obfuscated.d1 r5 = r5.a     // Catch:{ all -> 0x0034 }
            com.my.tracker.obfuscated.d1$e r1 = r5.k()     // Catch:{ all -> 0x0034 }
        L_0x000c:
            boolean r5 = r1.b()     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = r1.m()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r1.n()     // Catch:{ all -> 0x0034 }
            long r3 = r1.e()     // Catch:{ all -> 0x0034 }
            com.my.tracker.obfuscated.o0 r5 = com.my.tracker.obfuscated.o0.a((java.lang.String) r5, (java.lang.String) r2, (long) r3)     // Catch:{ all -> 0x0034 }
            if (r5 == 0) goto L_0x000c
            long r2 = r1.a()     // Catch:{ all -> 0x0034 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0034 }
            com.my.tracker.obfuscated.o0 r5 = r5.a((java.lang.Long) r2)     // Catch:{ all -> 0x0034 }
            r0.add(r5)     // Catch:{ all -> 0x0034 }
            goto L_0x000c
        L_0x0034:
            r5 = move-exception
            java.lang.String r2 = "MyTrackerRepository error: error while reading purchases"
            com.my.tracker.obfuscated.x2.b(r2, r5)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x003f
        L_0x003c:
            r1.close()
        L_0x003f:
            return r0
        L_0x0040:
            r5 = move-exception
            if (r1 == 0) goto L_0x0046
            r1.close()
        L_0x0046:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.f1.g():java.util.List");
    }

    public long h() {
        return this.g;
    }

    public long i() {
        return this.f;
    }

    public boolean j() {
        d1.c i;
        d1.f a2;
        try {
            i = this.a.i();
            int b2 = i.b();
            try {
                i.close();
                a2 = this.a.a("default_session");
                if (a2.b()) {
                    b2++;
                }
                a2.close();
            } catch (Exception unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            return b2 != 0;
            throw th;
            throw th;
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public boolean k(byte[] bArr, long j) {
        return c(13, bArr, j);
    }

    public boolean l(byte[] bArr, long j) {
        return a(25, bArr, false, true, j);
    }

    public boolean m(byte[] bArr, long j) {
        return a(7, bArr, true, true, j);
    }

    public boolean n(byte[] bArr, long j) {
        return a(26, bArr, false, true, j);
    }

    public boolean o(byte[] bArr, long j) {
        return a(28, bArr, false, true, j);
    }

    public boolean p(byte[] bArr, long j) {
        return a(29, bArr, false, true, j);
    }

    public boolean q(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean r(byte[] bArr, long j) {
        return a(8, bArr, true, true, j);
    }

    public boolean s(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    public void a(long j) {
        try {
            this.a.c(j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(32, bArr, true, false, j);
    }

    public boolean d(byte[] bArr, long j) {
        try {
            if (this.a.f(6) >= ((long) this.c)) {
                long j2 = 0;
                if (this.a.a(6, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long b2 = this.a.b("custom_events_skipped_count");
                    if (b2 != null) {
                        j2 = b2.longValue();
                    }
                    long j3 = j2 + 1;
                    x2.a("MyTrackerRepository: skipped custom events count: " + j3);
                    this.a.a("custom_events_skipped_count", Long.valueOf(j3));
                    return false;
                }
            }
            return a(6, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    public boolean e(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public boolean f(byte[] bArr, long j) {
        return a(10, bArr, true, false, j);
    }

    public boolean g(byte[] bArr, long j) {
        return a(27, bArr, false, true, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public boolean i(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public boolean j(byte[] bArr, long j) {
        return c(9, bArr, j);
    }

    private boolean c(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(int i, byte[] bArr, long j) {
        return a(i, bArr, true, true, j);
    }

    public boolean b(long j) {
        return c(3, new byte[0], j);
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    public boolean b(int i, byte[] bArr, long j) {
        boolean z = i == 20 || i == 21;
        if (i == 24) {
            try {
                long j2 = (long) i;
                if (this.a.f(j2) >= ((long) this.c) && this.a.a(j2, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
                return false;
            }
        }
        return a(i, bArr, z, true, j);
    }

    public void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.f = j;
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(f fVar) {
        String jSONObject = fVar.e().toString();
        String a2 = fVar.a();
        String f2 = fVar.f();
        int g2 = fVar.g();
        try {
            if (this.a.g() >= ((long) this.e)) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: appgalleery raw purchase with data: " + jSONObject + ", signature " + a2 + " isn't inserted");
                return;
            }
            long a3 = this.a.a(jSONObject, a2, f2, g2, fVar.h());
            if (a3 >= 0) {
                x2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + a3 + ", data: " + jSONObject + ", signature: " + a2);
                fVar.a(Long.valueOf(a3));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + jSONObject + ", signature " + a2, th);
        }
    }

    public void b(f fVar) {
        Long b2 = fVar.b();
        if (b2 != null) {
            try {
                this.a.a(b2.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + b2, th);
            }
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long j2;
        d1.a aVar;
        int i2 = i;
        byte[] bArr2 = bArr;
        boolean z3 = z;
        long j3 = j;
        try {
            long j4 = d1.y;
            if (z2) {
                aVar = null;
                long j5 = j4;
                d1.c b2 = this.a.b((long) i2, bArr2);
                if (b2.b()) {
                    j4 = b2.a();
                    j2 = b2.c();
                } else {
                    j4 = j5;
                    j2 = 0;
                }
                b2.close();
            } else {
                long j6 = j4;
                j2 = 0;
            }
            if (j4 == d1.y) {
                x2.a("MyTrackerRepository: insert " + i2 + " event");
                j4 = this.a.a(i2, bArr2, z3);
                if (j4 != d1.y && z3) {
                    this.g++;
                }
            } else {
                x2.a("MyTrackerRepository: aggregate " + i2 + " event");
            }
            if (j4 == d1.y) {
                x2.b("MyTrackerRepository error: event insertion failed, type: " + i2);
                return false;
            }
            if (this.f == 0) {
                c(j3);
            }
            this.a.c(j4, j3 - this.f);
            long d2 = this.a.d(j4);
            x2.a("MyTrackerRepository: event timestamps count: " + d2);
            long j7 = (long) this.b;
            if (d2 <= j7) {
                return true;
            }
            long a2 = this.a.a(j4, d2 - j7);
            this.a.d(j4, j2 + a2);
            x2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a2);
            return true;
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event insertion failed, type: " + i2, th);
            return false;
        }
    }

    public void b(o0 o0Var) {
        Long b2 = o0Var.b();
        if (b2 != null) {
            try {
                this.a.b(b2.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw purchase with id " + b2, th);
            }
        }
    }

    public void a(o0 o0Var) {
        String jSONObject = o0Var.d().toString();
        String a2 = o0Var.a();
        try {
            if (this.a.j() >= ((long) this.e)) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: raw purchase with data: " + jSONObject + ", signature " + a2 + " isn't inserted");
                return;
            }
            long a3 = this.a.a(jSONObject, a2, o0Var.f());
            if (a3 >= 0) {
                x2.a("MyTrackerRepository: raw purchase was inserted; id: " + a3 + ", data: " + jSONObject + ", signature: " + a2);
                o0Var.a(Long.valueOf(a3));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert raw purchase with data: " + jSONObject + ", signature " + a2, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(long r24, long r26) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "MyTrackerRepository error: session insertion failed "
            java.lang.String r2 = "default_session"
            java.lang.String r3 = "MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: "
            java.lang.String r4 = "MyTrackerRepository: session timestamps count: "
            r6 = 0
            com.my.tracker.obfuscated.d1 r7 = r0.a     // Catch:{ all -> 0x00d5 }
            com.my.tracker.obfuscated.d1$f r6 = r7.a((java.lang.String) r2)     // Catch:{ all -> 0x00d5 }
            boolean r7 = r6.b()     // Catch:{ all -> 0x00a6 }
            r8 = 0
            if (r7 == 0) goto L_0x00aa
            long r13 = r6.a()     // Catch:{ all -> 0x00a6 }
            long r10 = r6.m()     // Catch:{ all -> 0x00a6 }
            long r18 = r6.c()     // Catch:{ all -> 0x00a6 }
            r20 = r6
            long r5 = r0.f     // Catch:{ all -> 0x0031 }
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0036
            r0.c(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0036
        L_0x0031:
            r0 = move-exception
            r6 = r20
            goto L_0x00d6
        L_0x0036:
            java.lang.String r2 = "MyTrackerRepository: finish previous session"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            int r2 = (r26 > r8 ? 1 : (r26 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0051
            com.my.tracker.obfuscated.d1 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r5 = r0.f     // Catch:{ all -> 0x0031 }
            long r5 = r10 - r5
            r15 = 1
            r16 = 0
            r10 = r2
            r11 = r13
            r21 = r13
            r13 = r5
            r10.a(r11, r13, r15, r16)     // Catch:{ all -> 0x0031 }
            goto L_0x0062
        L_0x0051:
            r21 = r13
            com.my.tracker.obfuscated.d1 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r5 = r0.f     // Catch:{ all -> 0x0031 }
            long r13 = r10 - r5
            long r16 = r26 - r5
            r15 = 0
            r10 = r2
            r11 = r21
            r10.a(r11, r13, r15, r16)     // Catch:{ all -> 0x0031 }
        L_0x0062:
            com.my.tracker.obfuscated.d1 r2 = r0.a     // Catch:{ all -> 0x0031 }
            r5 = r21
            long r10 = r2.g(r5)     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r4)     // Catch:{ all -> 0x0031 }
            r2.append(r10)     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            int r2 = r0.d     // Catch:{ all -> 0x0031 }
            long r12 = (long) r2     // Catch:{ all -> 0x0031 }
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            com.my.tracker.obfuscated.d1 r2 = r0.a     // Catch:{ all -> 0x0031 }
            long r10 = r10 - r12
            long r8 = r2.b((long) r5, (long) r10)     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r2.<init>(r3)     // Catch:{ all -> 0x0031 }
            r2.append(r8)     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
        L_0x0096:
            java.lang.String r2 = "MyTrackerRepository: start new session"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.d1 r10 = r0.a     // Catch:{ all -> 0x0031 }
            long r15 = r18 + r8
            r11 = r5
            r13 = r24
            r10.a((long) r11, (long) r13, (long) r15)     // Catch:{ all -> 0x0031 }
            goto L_0x00d0
        L_0x00a6:
            r0 = move-exception
            r20 = r6
            goto L_0x00d6
        L_0x00aa:
            r20 = r6
            java.lang.String r3 = "MyTrackerRepository: insert session"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r3)     // Catch:{ all -> 0x0031 }
            com.my.tracker.obfuscated.d1 r3 = r0.a     // Catch:{ all -> 0x0031 }
            r4 = r24
            long r2 = r3.a((java.lang.String) r2, (long) r4)     // Catch:{ all -> 0x0031 }
            long r10 = com.my.tracker.obfuscated.d1.y     // Catch:{ all -> 0x0031 }
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x00c7
            com.my.tracker.obfuscated.x2.b(r1)     // Catch:{ all -> 0x0031 }
            r20.close()
            r1 = 0
            return r1
        L_0x00c7:
            long r2 = r0.f     // Catch:{ all -> 0x0031 }
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x00d0
            r23.c(r24)     // Catch:{ all -> 0x0031 }
        L_0x00d0:
            r20.close()
            r0 = 1
            return r0
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            com.my.tracker.obfuscated.x2.b(r1, r0)     // Catch:{ all -> 0x00e0 }
            if (r6 == 0) goto L_0x00de
            r6.close()
        L_0x00de:
            r1 = 0
            return r1
        L_0x00e0:
            r0 = move-exception
            r1 = r0
            if (r6 == 0) goto L_0x00e7
            r6.close()
        L_0x00e7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.f1.a(long, long):boolean");
    }

    public static f1 a(d1 d1Var) {
        return a(d1Var, 1000, 500, 500, 100);
    }

    public static f1 a(d1 d1Var, int i, int i2, int i3, int i4) {
        try {
            return new f1(d1Var, i, i2, i3, i4);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.i(14);
            this.a.a(bArr);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }
}
