package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: m48  reason: default package */
public final class m48 implements ju8 {
    public final nu8 a;
    public final sb5 b;
    public final mu8 c;
    public final Context d;
    public iu8 e;
    public f4g f;
    public hu8 g;
    public float h;
    public boolean i;
    public boolean j;
    public PowerManager k;
    public PowerManager.WakeLock l;

    public m48(nu8 nu8, sb5 sb5, mu8 mu8, Context context, float f2, boolean z, boolean z2) {
        this.a = nu8;
        this.b = sb5;
        this.c = mu8;
        this.d = context;
        this.h = f2;
        this.i = z;
        this.j = z2;
    }

    public final void a() {
        nu8 nu8 = nu8.a;
        nu8 nu82 = this.a;
        if (nu82 != nu8 && nu82 != nu8.b && l()) {
            if (this.l == null) {
                if (this.k == null) {
                    this.k = (PowerManager) this.d.getSystemService("power");
                }
                PowerManager powerManager = this.k;
                Locale locale = Locale.ENGLISH;
                this.l = powerManager.newWakeLock(536870922, "tamtam:media_player_controller_" + nu82);
            }
            if (!this.l.isHeld()) {
                try {
                    this.l.acquire();
                    z68.c("m48", "New wake lock acquire %s", nu82);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String b(String str) {
        Locale locale = Locale.ENGLISH;
        StringBuilder m = g63.m(str, "-");
        m.append(this.a);
        return m.toString();
    }

    public final boolean c() {
        if (this.f == null) {
            return false;
        }
        mu8 mu8 = this.c;
        mu8.getClass();
        nu8 nu8 = nu8.c;
        nu8 nu82 = this.a;
        if ((nu82 != nu8 || !mu8.v()) && nu82 != nu8.b) {
            return false;
        }
        j0a j0a = mu8.X.z0;
        if (j0a != null && j0a.a()) {
            return false;
        }
        f40 f40 = mu8.x;
        return !f40.c.z && f40.v0 == null;
    }

    public final long d() {
        long j2;
        if (this.f == null) {
            return 0;
        }
        sb5 sb5 = this.b;
        if (sb5.x == null) {
            return 0;
        }
        zae zae = sb5.a;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        if (sc5.k()) {
            dob dob = sc5.i1;
            j2 = dob.k.equals(dob.b) ? t0g.M(sc5.i1.q) : sc5.e();
        } else {
            sc5.G1();
            if (sc5.i1.a.q()) {
                j2 = sc5.k1;
            } else {
                dob dob2 = sc5.i1;
                if (dob2.k.d != dob2.b.d) {
                    j2 = t0g.M(dob2.a.n(sc5.d0(), (gkf) sc5.a, 0).w0);
                } else {
                    long j3 = dob2.q;
                    if (sc5.i1.k.a()) {
                        dob dob3 = sc5.i1;
                        dkf h2 = dob3.a.h(dob3.k.a, sc5.w0);
                        long j4 = h2.x.a(sc5.i1.k.b).a;
                        j3 = j4 == Long.MIN_VALUE ? h2.o : j4;
                    }
                    dob dob4 = sc5.i1;
                    ikf ikf = dob4.a;
                    Object obj = dob4.k.a;
                    dkf dkf = sc5.w0;
                    ikf.h(obj, dkf);
                    j2 = t0g.M(j3 + dkf.v);
                }
            }
        }
        return j2 - sb5.x.i();
    }

    public final mpf e() {
        int intValue;
        f4g f4g = this.f;
        mpf mpf = mpf.X;
        if (f4g == null) {
            return mpf;
        }
        ic3 ic3 = this.b.b;
        rj4 rj4 = (rj4) ic3.a;
        me8 me8 = rj4.c;
        if (me8 == null || (intValue = ((Integer) ic3.r(me8).second).intValue()) < 0) {
            return mpf;
        }
        gj4 a2 = ((dj4) rj4.e.get()).a(intValue, me8.c[intValue]);
        if (a2 != null) {
            for (mpf mpf2 : ic3.p().b) {
                if (mpf2.y == a2.a && mpf2.z == a2.b[0]) {
                    return mpf2;
                }
            }
        }
        zae zae = (zae) ic3.b;
        zae.n1();
        sc5 sc5 = zae.b;
        sc5.G1();
        ld5[] ld5Arr = (ld5[]) sc5.i1.i.v;
        int length = ld5Arr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ca6 ca6 = null;
            if (i2 < length) {
                ld5 ld5 = ld5Arr[i2];
                if (ld5 instanceof ld5) {
                    ca6 = ld5.j();
                }
            }
            if (ca6 != null && uq9.g(ca6.Z) == 1) {
                for (npf npf : (List) ic3.o) {
                    Iterator it = npf.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            mpf mpf3 = (mpf) it.next();
                            if (ic3.d(mpf3, ca6)) {
                                return mpf3;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return mpf;
    }

    public final long f() {
        if (this.f == null) {
            return 0;
        }
        sb5 sb5 = this.b;
        if (sb5.x == null) {
            return 0;
        }
        return sb5.a.h() - sb5.x.i();
    }

    public final long g() {
        if (this.f == null) {
            return 0;
        }
        return this.b.v();
    }

    public final int h() {
        if (this.f == null) {
            return 0;
        }
        sb5 sb5 = this.b;
        if (sb5.x == null) {
            return 0;
        }
        return sb5.Y;
    }

    public final int i() {
        if (this.f == null) {
            return 0;
        }
        return this.b.Z;
    }

    public final int j() {
        if (this.f == null) {
            return 0;
        }
        sb5 sb5 = this.b;
        if (sb5.x == null) {
            return 0;
        }
        return sb5.X;
    }

    public final boolean k() {
        if (this.f == null) {
            return false;
        }
        return this.b.a();
    }

    public final boolean l() {
        return this.h == 1.0f;
    }

    public final void m() {
        this.c.u(this);
        iu8 iu8 = this.e;
        if (iu8 != null) {
            iu8.b();
        }
        a();
    }

    public final void n() {
        if (this.f != null) {
            z68.c("m48", "Pause %s", this.a);
            this.j = false;
            this.b.pause();
        }
    }

    public final void o() {
        if (this.f != null) {
            z68.c("m48", "Play %s", this.a);
            this.j = true;
            this.b.play();
        }
    }

    public final void p() {
        PowerManager.WakeLock wakeLock = this.l;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.l.release();
            z68.c("m48", "Release wake lock %s", this.a);
        }
    }

    public final void q(wie wie) {
        String b2 = b("MediaPlayerController.Volume");
        float f2 = this.h;
        Bundle bundle = (Bundle) wie.b;
        bundle.putFloat(b2, f2);
        bundle.putBoolean(b("MediaPlayerController.Looping"), this.i);
        bundle.putBoolean(b("MediaPlayerController.PlayWhenReady"), this.j);
    }

    public final void r(long j2) {
        if (this.f != null) {
            sb5 sb5 = this.b;
            sb5.getClass();
            sb5.u();
            if (sb5.x != null) {
                zae zae = sb5.a;
                zae.n1();
                sc5 sc5 = zae.b;
                if (sc5.e() != 0) {
                    zae.n1();
                    if (j2 > sc5.e() - sb5.x.i()) {
                        return;
                    }
                }
                zae.n(zae.d0(), sb5.x.i() + j2);
            }
        }
    }

    public final void s(Surface surface) {
        z68.c("m48", "Set surface %s", this.a);
        sb5 sb5 = this.b;
        sb5.getClass();
        sb5.u();
        z68.c("sb5", "Set surface %s", surface);
        zae zae = sb5.a;
        if (surface == null) {
            zae.n1();
            sc5 sc5 = zae.b;
            sc5.G1();
            sc5.A1((Surface) null);
            sc5.w1(0, 0);
            return;
        }
        zae.n1();
        sc5 sc52 = zae.b;
        sc52.G1();
        sc52.A1(surface);
        sc52.w1(-1, -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: h8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: h8c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: h8c} */
    /* JADX WARNING: type inference failed for: r6v11, types: [xj0] */
    /* JADX WARNING: type inference failed for: r11v17, types: [h8c] */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r16v4, types: [d17] */
    /* JADX WARNING: type inference failed for: r16v5, types: [n64] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(defpackage.f4g r29, defpackage.hu8 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            r2 = 18
            r3 = 1
            r4 = 0
            nu8 r5 = r0.a
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "m48"
            java.lang.String r7 = "Set video content %s"
            defpackage.z68.c(r6, r7, r5)
            r5 = r29
            r0.f = r5
            hu8 r5 = r0.g
            if (r5 == 0) goto L_0x0022
            if (r5 == r1) goto L_0x0022
            r5.C()
        L_0x0022:
            r0.g = r1
            sb5 r1 = r0.b
            r1.getClass()
            defpackage.sb5.u()
            r1.w = r0
            f4g r5 = r0.f
            ol0 r5 = (defpackage.ol0) r5
            boolean r5 = r5.g
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x003a
        L_0x0038:
            float r5 = r0.h
        L_0x003a:
            r1.g(r5)
            boolean r5 = r0.i
            defpackage.sb5.u()
            zae r6 = r1.a
            r6.n1()
            sc5 r6 = r6.b
            r6.G1()
            int r7 = r6.K0
            if (r7 == r5) goto L_0x007c
            r6.K0 = r5
            ed5 r7 = r6.Y
            j7f r7 = r7.y
            r7.getClass()
            h7f r8 = defpackage.j7f.b()
            android.os.Handler r7 = r7.a
            r9 = 11
            android.os.Message r7 = r7.obtainMessage(r9, r5, r4)
            r8.a = r7
            r8.b()
            ob4 r7 = new ob4
            r7.<init>(r5, r3)
            d23 r5 = r6.Z
            r8 = 8
            r5.q(r8, r7)
            r6.C1()
            r5.h()
        L_0x007c:
            f4g r5 = r0.f
            boolean r0 = r0.j
            defpackage.sb5.u()
            f4g r6 = r1.x
            java.lang.String r7 = "sb5"
            zae r8 = r1.a
            r9 = 4
            if (r6 == 0) goto L_0x00e4
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x00e4
            r8.n1()
            sc5 r6 = r8.b
            r6.G1()
            dob r6 = r6.i1
            int r6 = r6.e
            if (r6 != r3) goto L_0x00a1
            goto L_0x00e4
        L_0x00a1:
            zae r2 = r1.a
            r2.n1()
            sc5 r2 = r2.b
            r2.G1()
            dob r2 = r2.i1
            int r2 = r2.e
            if (r2 != r9) goto L_0x00b9
            java.lang.String r2 = "Video ended. Seek to start"
            defpackage.z68.c(r7, r2, new java.lang.Object[0])
            r1.A()
        L_0x00b9:
            r8.n1()
            sc5 r2 = r8.b
            r2.G1()
            dob r2 = r2.i1
            int r2 = r2.e
            r3 = 3
            if (r2 != r3) goto L_0x00d3
            m48 r2 = r1.w
            if (r2 == 0) goto L_0x00d3
            iu8 r2 = r2.e
            if (r2 == 0) goto L_0x00d3
            r2.F()
        L_0x00d3:
            r8.O(r0)
            if (r0 == 0) goto L_0x0367
            m48 r0 = r1.w
            if (r0 == 0) goto L_0x00df
            r0.m()
        L_0x00df:
            r1.w()
            goto L_0x0367
        L_0x00e4:
            java.lang.String r6 = "Prepare new video content"
            defpackage.z68.c(r7, r6, new java.lang.Object[0])
            r1.X = r4
            r1.Y = r4
            r1.Z = r4
            r1.v0 = r4
            m48 r6 = r1.w
            if (r6 == 0) goto L_0x00fc
            iu8 r6 = r6.e
            if (r6 == 0) goto L_0x00fc
            r6.M()
        L_0x00fc:
            r1.x = r5
            int r6 = r5.getWidth()
            float r6 = (float) r6
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r6 / r5
            r1.y = r6
            f4g r5 = r1.x
            ic3 r6 = r1.b
            r6.c = r5
            java.util.List r5 = java.util.Collections.emptyList()
            r6.o = r5
            java.lang.Object r5 = r6.a
            rj4 r5 = (defpackage.rj4) r5
            fj4 r7 = r5.b()
            android.util.SparseArray r10 = r7.M
            int r11 = r10.size()
            if (r11 != 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r10.clear()
        L_0x012b:
            r5.h(r7)
            r6.s()
            f4g r5 = r1.x
            android.net.Uri r6 = r5.h()
            r7 = r5
            ol0 r7 = (defpackage.ol0) r7
            boolean r7 = r7.c
            r7 = r7 ^ r3
            kb5 r10 = r1.o
            f74 r7 = r10.a(r6, r7)
            boolean r10 = r5 instanceof defpackage.r64
            if (r10 == 0) goto L_0x0193
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            r2.<init>(r7)
            gr8 r5 = defpackage.gr8.a(r6)
            zq8 r6 = r5.b
            r6.getClass()
            b64 r7 = new b64
            r7.<init>()
            java.util.List r6 = r6.c
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x016c
            zqd r10 = new zqd
            r11 = 12
            r10.<init>(r11, r7, r6)
            r19 = r10
            goto L_0x016e
        L_0x016c:
            r19 = r7
        L_0x016e:
            n64 r6 = new n64
            ata r7 = r2.c
            ow4 r22 = r7.u(r5)
            long r10 = r2.f
            o9a r7 = r2.d
            gga r12 = r2.e
            f74 r13 = r2.b
            grg r2 = r2.a
            r16 = r6
            r17 = r5
            r18 = r13
            r20 = r2
            r21 = r7
            r23 = r12
            r24 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0298
        L_0x0193:
            boolean r10 = r5 instanceof defpackage.k27
            if (r10 == 0) goto L_0x01f0
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r2 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r2.<init>(r7)
            gr8 r5 = defpackage.gr8.a(r6)
            zq8 r6 = r5.b
            r6.getClass()
            u9a r7 = r2.c
            java.util.List r6 = r6.c
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x01b5
            wsb r10 = new wsb
            r10.<init>(r7, r6)
            r7 = r10
        L_0x01b5:
            d17 r6 = new d17
            sx6 r10 = r2.b
            ata r11 = r2.f
            ow4 r21 = r11.u(r5)
            ts1 r11 = r2.d
            r11.getClass()
            vf4 r11 = new vf4
            gga r12 = r2.g
            vs6 r13 = r2.a
            r11.<init>((defpackage.vs6) r13, (defpackage.gga) r12, (defpackage.p17) r7)
            o9a r7 = r2.e
            long r13 = r2.j
            boolean r9 = r2.h
            int r15 = r2.i
            vs6 r2 = r2.a
            r16 = r6
            r17 = r5
            r18 = r2
            r19 = r10
            r20 = r7
            r22 = r12
            r23 = r11
            r24 = r13
            r26 = r9
            r27 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27)
            goto L_0x0298
        L_0x01f0:
            boolean r9 = r5 instanceof defpackage.wu9
            if (r9 == 0) goto L_0x026a
            r6 = r5
            wu9 r6 = (defpackage.wu9) r6
            java.util.List r9 = r6.j
            int r10 = r9.size()
            xj0[] r10 = new defpackage.xj0[r10]
            r15 = r4
        L_0x0200:
            int r11 = r9.size()
            if (r15 >= r11) goto L_0x0264
            java.lang.Object r11 = r9.get(r15)
            uu9 r11 = (defpackage.uu9) r11
            if4 r12 = new if4
            r12.<init>()
            y3a r14 = new y3a
            r14.<init>((int) r2, (java.lang.Object) r12)
            gga r13 = new gga
            r13.<init>((boolean) r4)
            java.lang.String r11 = r11.a
            android.net.Uri r11 = android.net.Uri.parse(r11)
            gr8 r12 = defpackage.gr8.a(r11)
            zq8 r11 = r12.b
            r11.getClass()
            h8c r11 = new h8c
            zq8 r4 = r12.b
            r4.getClass()
            zq8 r4 = r12.b
            r4.getClass()
            jw4 r4 = defpackage.ow4.a
            r30 = r11
            r11 = r30
            r16 = r13
            r13 = r7
            r18 = r15
            r15 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            boolean r4 = r5 instanceof defpackage.atf
            if (r4 == 0) goto L_0x025b
            l33 r11 = new l33
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r12 = r6.g()
            long r12 = r4.toMicros(r12)
            r4 = r30
            r11.<init>(r4, r12)
            goto L_0x025e
        L_0x025b:
            r4 = r30
            r11 = r4
        L_0x025e:
            r10[r18] = r11
            int r15 = r18 + 1
            r4 = 0
            goto L_0x0200
        L_0x0264:
            x79 r6 = new x79
            r6.<init>(r10)
            goto L_0x0298
        L_0x026a:
            if4 r4 = new if4
            r4.<init>()
            y3a r14 = new y3a
            r14.<init>((int) r2, (java.lang.Object) r4)
            gga r2 = new gga
            r4 = 0
            r2.<init>((boolean) r4)
            gr8 r12 = defpackage.gr8.a(r6)
            zq8 r4 = r12.b
            r4.getClass()
            h8c r6 = new h8c
            zq8 r4 = r12.b
            r4.getClass()
            zq8 r4 = r12.b
            r4.getClass()
            jw4 r15 = defpackage.ow4.a
            r11 = r6
            r13 = r7
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0298:
            r1.z = r6
            r8.O(r0)
            f4g r2 = r1.x
            r4 = r2
            ol0 r4 = (defpackage.ol0) r4
            long r4 = r4.b
            long r6 = r2.i()
            long r12 = java.lang.Math.max(r4, r6)
            f4g r2 = r1.x
            ol0 r2 = (defpackage.ol0) r2
            boolean r2 = r2.c
            sc5 r4 = r8.b
            if (r2 != 0) goto L_0x02d3
            r5 = 0
            int r2 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x02bd
            goto L_0x02d3
        L_0x02bd:
            xj0 r2 = r1.z
            r8.n1()
            r4.G1()
            java.util.List r10 = java.util.Collections.singletonList(r2)
            r4.G1()
            r14 = 0
            r11 = 0
            r9 = r4
            r9.z1(r10, r11, r12, r14)
            goto L_0x02f3
        L_0x02d3:
            xj0 r2 = r1.z
            r8.n1()
            r4.G1()
            java.util.List r19 = java.util.Collections.singletonList(r2)
            r4.G1()
            r4.G1()
            r23 = 1
            r20 = -1
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = r4
            r18.z1(r19, r20, r21, r23)
        L_0x02f3:
            r8.n1()
            r4.G1()
            boolean r2 = r4.q()
            n40 r5 = r4.F0
            r6 = 2
            int r5 = r5.d(r6, r2)
            if (r2 == 0) goto L_0x030a
            if (r5 == r3) goto L_0x030a
            r7 = r6
            goto L_0x030b
        L_0x030a:
            r7 = r3
        L_0x030b:
            r4.D1(r5, r7, r2)
            dob r2 = r4.i1
            int r5 = r2.e
            if (r5 == r3) goto L_0x0315
            goto L_0x035b
        L_0x0315:
            r5 = 0
            dob r2 = r2.e(r5)
            ikf r5 = r2.a
            boolean r5 = r5.q()
            if (r5 == 0) goto L_0x0324
            r9 = 4
            goto L_0x0325
        L_0x0324:
            r9 = r6
        L_0x0325:
            dob r19 = r2.f(r9)
            int r2 = r4.L0
            int r2 = r2 + r3
            r4.L0 = r2
            ed5 r2 = r4.Y
            j7f r2 = r2.y
            r2.getClass()
            h7f r3 = defpackage.j7f.b()
            android.os.Handler r2 = r2.a
            r5 = 0
            android.os.Message r2 = r2.obtainMessage(r5)
            r3.a = r2
            r3.b()
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = -1
            r20 = 1
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 5
            r18 = r4
            r18.E1(r19, r20, r21, r22, r23, r24, r25, r27)
        L_0x035b:
            if (r0 == 0) goto L_0x0367
            m48 r0 = r1.w
            if (r0 == 0) goto L_0x0364
            r0.m()
        L_0x0364:
            r1.w()
        L_0x0367:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m48.t(f4g, hu8):void");
    }

    public final void u(float f2) {
        f4g f4g = this.f;
        if (f4g == null || !((ol0) f4g).g) {
            this.h = f2;
            this.b.g(f2);
            if (l() && this.f != null && l()) {
                this.c.u(this);
            }
        }
    }

    public final void v() {
        if (this.f != null) {
            z68.c("m48", "Stop %s", this.a);
            this.b.C();
        }
    }

    public final void w() {
        u(c44.DEFAULT_ASPECT_RATIO);
    }
}
