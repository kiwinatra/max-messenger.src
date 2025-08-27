package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* renamed from: x70  reason: default package */
public final class x70 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public c7f J;
    public final wie a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public v70 f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public x70(wie wie) {
        this.a = wie;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.J = c7f.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0221 A[Catch:{ Exception -> 0x023a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(boolean r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = 0
            r2 = 1
            android.media.AudioTrack r3 = r0.c
            r3.getClass()
            int r3 = r3.getPlayState()
            r8 = 1000(0x3e8, double:4.94E-321)
            wie r10 = r0.a
            r11 = 2
            r12 = 0
            r14 = 3
            if (r3 != r14) goto L_0x023e
            c7f r3 = r0.J
            r3.getClass()
            long r15 = java.lang.System.nanoTime()
            long r4 = r15 / r8
            long r6 = r0.m
            long r6 = r4 - r6
            r19 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r3 < 0) goto L_0x0070
            long r6 = r28.b()
            int r3 = r0.g
            long r6 = defpackage.v0g.Y(r3, r6)
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x003c
            goto L_0x023e
        L_0x003c:
            int r3 = r0.w
            float r15 = r0.j
            long r6 = defpackage.v0g.E(r6, r15)
            long r6 = r6 - r4
            long[] r15 = r0.b
            r15[r3] = r6
            int r3 = r0.w
            int r3 = r3 + r2
            r6 = 10
            int r3 = r3 % r6
            r0.w = r3
            int r3 = r0.x
            if (r3 >= r6) goto L_0x0058
            int r3 = r3 + r2
            r0.x = r3
        L_0x0058:
            r0.m = r4
            r0.l = r12
            r3 = r1
        L_0x005d:
            int r6 = r0.x
            if (r3 >= r6) goto L_0x0070
            long r12 = r0.l
            r21 = r15[r3]
            long r6 = (long) r6
            long r21 = r21 / r6
            long r6 = r21 + r12
            r0.l = r6
            int r3 = r3 + r2
            r12 = 0
            goto L_0x005d
        L_0x0070:
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x0076
            goto L_0x023e
        L_0x0076:
            v70 r3 = r0.f
            r3.getClass()
            java.lang.Object r6 = r3.g
            u70 r6 = (defpackage.u70) r6
            if (r6 == 0) goto L_0x0120
            long r12 = r3.e
            long r12 = r4 - r12
            long r8 = r3.d
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x008d
            goto L_0x0120
        L_0x008d:
            r3.e = r4
            android.media.AudioTrack r8 = r6.a
            android.media.AudioTimestamp r9 = r6.b
            boolean r8 = r8.getTimestamp(r9)
            if (r8 == 0) goto L_0x00c4
            long r12 = r9.framePosition
            r23 = r8
            long r7 = r6.d
            int r24 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r24 <= 0) goto L_0x00b6
            boolean r15 = r6.f
            if (r15 == 0) goto L_0x00af
            long r14 = r6.g
            long r14 = r14 + r7
            r6.g = r14
            r6.f = r1
            goto L_0x00b6
        L_0x00af:
            long r7 = r6.c
            r14 = 1
            long r7 = r7 + r14
            r6.c = r7
        L_0x00b6:
            r6.d = r12
            long r7 = r6.g
            long r12 = r12 + r7
            long r7 = r6.c
            r14 = 32
            long r7 = r7 << r14
            long r12 = r12 + r7
            r6.e = r12
            goto L_0x00c6
        L_0x00c4:
            r23 = r8
        L_0x00c6:
            int r7 = r3.b
            if (r7 == 0) goto L_0x00f9
            if (r7 == r2) goto L_0x00e7
            if (r7 == r11) goto L_0x00e1
            r8 = 3
            if (r7 == r8) goto L_0x00db
            r8 = 4
            if (r7 != r8) goto L_0x00d5
            goto L_0x011d
        L_0x00d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00db:
            if (r23 == 0) goto L_0x011d
            r3.a()
            goto L_0x011d
        L_0x00e1:
            if (r23 != 0) goto L_0x011d
            r3.a()
            goto L_0x011d
        L_0x00e7:
            if (r23 == 0) goto L_0x00f5
            long r7 = r6.e
            long r12 = r3.f
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x011d
            r3.b(r11)
            goto L_0x011d
        L_0x00f5:
            r3.a()
            goto L_0x011d
        L_0x00f9:
            if (r23 == 0) goto L_0x010e
            long r7 = r9.nanoTime
            r12 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r12
            long r12 = r3.c
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x0120
            long r7 = r6.e
            r3.f = r7
            r3.b(r2)
            goto L_0x011d
        L_0x010e:
            long r7 = r3.c
            long r7 = r4 - r7
            r12 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x011d
            r7 = 3
            r3.b(r7)
        L_0x011d:
            r8 = r23
            goto L_0x0121
        L_0x0120:
            r8 = r1
        L_0x0121:
            r12 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r8 != 0) goto L_0x0128
            goto L_0x01e7
        L_0x0128:
            if (r6 == 0) goto L_0x0133
            android.media.AudioTimestamp r7 = r6.b
            long r7 = r7.nanoTime
            r21 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r21
            goto L_0x0138
        L_0x0133:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0138:
            if (r6 == 0) goto L_0x013d
            long r1 = r6.e
            goto L_0x013f
        L_0x013d:
            r1 = -1
        L_0x013f:
            long r14 = r28.b()
            int r6 = r0.g
            long r14 = defpackage.v0g.Y(r6, r14)
            long r25 = r7 - r4
            long r25 = java.lang.Math.abs(r25)
            int r6 = (r25 > r12 ? 1 : (r25 == r12 ? 0 : -1))
            java.lang.String r9 = ", "
            if (r6 <= 0) goto L_0x0192
            r10.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "Spurious audio timestamp (system clock mismatch): "
            r6.<init>(r11)
            r6.append(r1)
            r6.append(r9)
            r6.append(r7)
            defpackage.tr1.v(r6, r9, r4, r9)
            r6.append(r14)
            r6.append(r9)
            java.lang.Object r1 = r10.b
            sc4 r1 = (defpackage.sc4) r1
            long r7 = r1.g()
            r6.append(r7)
            r6.append(r9)
            long r1 = r1.h()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            defpackage.i8b.V(r1)
            r1 = 4
            r3.b(r1)
            goto L_0x01e7
        L_0x0192:
            int r6 = r0.g
            long r26 = defpackage.v0g.Y(r6, r1)
            long r26 = r26 - r14
            long r26 = java.lang.Math.abs(r26)
            int r6 = (r26 > r12 ? 1 : (r26 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x01df
            r10.getClass()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "Spurious audio timestamp (frame position mismatch): "
            r6.<init>(r11)
            r6.append(r1)
            r6.append(r9)
            r6.append(r7)
            defpackage.tr1.v(r6, r9, r4, r9)
            r6.append(r14)
            r6.append(r9)
            java.lang.Object r1 = r10.b
            sc4 r1 = (defpackage.sc4) r1
            long r7 = r1.g()
            r6.append(r7)
            r6.append(r9)
            long r1 = r1.h()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            defpackage.i8b.V(r1)
            r1 = 4
            r3.b(r1)
            goto L_0x01e7
        L_0x01df:
            r1 = 4
            int r2 = r3.b
            if (r2 != r1) goto L_0x01e7
            r3.a()
        L_0x01e7:
            boolean r1 = r0.q
            if (r1 == 0) goto L_0x023e
            java.lang.reflect.Method r1 = r0.n
            if (r1 == 0) goto L_0x023e
            long r2 = r0.r
            long r2 = r4 - r2
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x023e
            r2 = 0
            android.media.AudioTrack r3 = r0.c     // Catch:{ Exception -> 0x023a }
            r3.getClass()     // Catch:{ Exception -> 0x023a }
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch:{ Exception -> 0x023a }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x023a }
            int r3 = defpackage.v0g.a     // Catch:{ Exception -> 0x023a }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x023a }
            long r6 = (long) r1     // Catch:{ Exception -> 0x023a }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r0.i     // Catch:{ Exception -> 0x023a }
            long r6 = r6 - r8
            r0.o = r6     // Catch:{ Exception -> 0x023a }
            r8 = 0
            long r6 = java.lang.Math.max(r6, r8)     // Catch:{ Exception -> 0x023a }
            r0.o = r6     // Catch:{ Exception -> 0x023a }
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x023c
            r10.getClass()     // Catch:{ Exception -> 0x023a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x023a }
            java.lang.String r3 = "Ignoring impossibly large audio latency: "
            r1.<init>(r3)     // Catch:{ Exception -> 0x023a }
            r1.append(r6)     // Catch:{ Exception -> 0x023a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x023a }
            defpackage.i8b.V(r1)     // Catch:{ Exception -> 0x023a }
            r6 = 0
            r0.o = r6     // Catch:{ Exception -> 0x023a }
            goto L_0x023c
        L_0x023a:
            r0.n = r2
        L_0x023c:
            r0.r = r4
        L_0x023e:
            c7f r1 = r0.J
            r1.getClass()
            long r1 = java.lang.System.nanoTime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            v70 r3 = r0.f
            r3.getClass()
            int r4 = r3.b
            r5 = 2
            if (r4 != r5) goto L_0x0256
            r4 = 1
            goto L_0x0257
        L_0x0256:
            r4 = 0
        L_0x0257:
            if (r4 == 0) goto L_0x0285
            java.lang.Object r3 = r3.g
            u70 r3 = (defpackage.u70) r3
            if (r3 == 0) goto L_0x0262
            long r5 = r3.e
            goto L_0x0264
        L_0x0262:
            r5 = -1
        L_0x0264:
            int r7 = r0.g
            long r5 = defpackage.v0g.Y(r7, r5)
            if (r3 == 0) goto L_0x0276
            android.media.AudioTimestamp r3 = r3.b
            long r7 = r3.nanoTime
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r11
            r19 = r7
            goto L_0x027b
        L_0x0276:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x027b:
            long r7 = r1 - r19
            float r3 = r0.j
            long r7 = defpackage.v0g.A(r7, r3)
            long r7 = r7 + r5
            goto L_0x02aa
        L_0x0285:
            int r3 = r0.x
            if (r3 != 0) goto L_0x0295
            long r5 = r28.b()
            int r3 = r0.g
            long r5 = defpackage.v0g.Y(r3, r5)
        L_0x0293:
            r7 = r5
            goto L_0x029f
        L_0x0295:
            long r5 = r0.l
            long r5 = r5 + r1
            float r3 = r0.j
            long r5 = defpackage.v0g.A(r5, r3)
            goto L_0x0293
        L_0x029f:
            if (r29 != 0) goto L_0x02aa
            long r5 = r0.o
            long r7 = r7 - r5
            r5 = 0
            long r7 = java.lang.Math.max(r5, r7)
        L_0x02aa:
            boolean r3 = r0.E
            if (r3 == r4) goto L_0x02b6
            long r5 = r0.D
            r0.G = r5
            long r5 = r0.C
            r0.F = r5
        L_0x02b6:
            long r5 = r0.G
            long r5 = r1 - r5
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x02d7
            long r13 = r0.F
            float r3 = r0.j
            long r17 = defpackage.v0g.A(r5, r3)
            long r17 = r17 + r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r13
            long r5 = r5 / r11
            long r7 = r7 * r5
            long r5 = r13 - r5
            long r5 = r5 * r17
            long r5 = r5 + r7
            long r7 = r5 / r13
        L_0x02d7:
            boolean r3 = r0.k
            if (r3 != 0) goto L_0x031b
            long r5 = r0.C
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x031b
            r3 = 1
            r0.k = r3
            long r5 = r7 - r5
            long r5 = defpackage.v0g.h0(r5)
            float r3 = r0.j
            long r5 = defpackage.v0g.E(r5, r3)
            c7f r3 = r0.J
            r3.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            long r5 = defpackage.v0g.h0(r5)
            long r11 = r11 - r5
            java.lang.Object r3 = r10.b
            sc4 r3 = (defpackage.sc4) r3
            e4 r3 = r3.s
            if (r3 == 0) goto L_0x031b
            java.lang.Object r3 = r3.b
            ln8 r3 = (defpackage.ln8) r3
            p7d r3 = r3.P1
            java.lang.Object r5 = r3.b
            android.os.Handler r5 = (android.os.Handler) r5
            if (r5 == 0) goto L_0x031b
            z60 r6 = new z60
            r9 = 0
            r6.<init>(r3, r11, r9)
            r5.post(r6)
        L_0x031b:
            r0.D = r1
            r0.C = r7
            r0.E = r4
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x70.a(boolean):long");
    }

    public final long b() {
        this.J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.y != -9223372036854775807L) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.A;
            }
            return Math.min(this.B, this.A + v0g.a0(v0g.A(v0g.S(elapsedRealtime) - this.y, this.j), (long) this.g, 1000000, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack2 = this.c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (v0g.a <= 29) {
                    if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                        this.z = -9223372036854775807L;
                    } else if (this.z == -9223372036854775807L) {
                        this.z = elapsedRealtime;
                    }
                }
                long j2 = this.t;
                if (j2 > playbackHeadPosition) {
                    if (this.H) {
                        this.I += j2;
                        this.H = false;
                    } else {
                        this.u++;
                    }
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + this.I + (this.u << 32);
    }

    public final boolean c(long j2) {
        long a2 = a(false);
        int i2 = this.g;
        int i3 = v0g.a;
        if (j2 <= v0g.a0(a2, (long) i2, 1000000, RoundingMode.CEILING)) {
            if (!this.h) {
                return false;
            }
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (!(audioTrack.getPlayState() == 2 && b() == 0)) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.l = 0;
        this.x = 0;
        this.w = 0;
        this.m = 0;
        this.D = 0;
        this.G = 0;
        this.k = false;
    }
}
