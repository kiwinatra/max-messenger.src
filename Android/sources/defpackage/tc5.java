package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.webrtc.MediaStreamTrack;

/* renamed from: tc5  reason: default package */
public final class tc5 extends j3h {
    public final wb4 A0;
    public final Looper B0;
    public final zg0 C0;
    public final long D0;
    public final long E0;
    public final long F0;
    public final c7f G0;
    public final nc5 H0;
    public final pc5 I0;
    public final he J0;
    public final n40 K0;
    public final gga L0;
    public final bv1 M0;
    public final long N0;
    public int O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public b9e T0;
    public pob U0;
    public us8 V0;
    public us8 W0;
    public final gc5 X;
    public AudioTrack X0;
    public final fd5 Y;
    public Object Y0;
    public final m56 Z;
    public Surface Z0;
    public final int a1;
    public final mqf b;
    public ode b1;
    public final pob c;
    public final int c1;
    public i30 d1;
    public float e1;
    public boolean f1;
    public o44 g1;
    public final boolean h1;
    public boolean i1;
    public final int j1;
    public boolean k1;
    public final in4 l1;
    public v8g m1;
    public us8 n1;
    public final bv1 o;
    public eob o1;
    public int p1;
    public long q1;
    public final Context v;
    public final CopyOnWriteArraySet v0;
    public final vob w;
    public final ekf w0;
    public final pk0[] x;
    public final ArrayList x0;
    public final pe8 y;
    public final boolean y0;
    public final k7f z;
    public final lz8 z0;

    static {
        cs8.a("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [tc5, vob, j3h] */
    /* JADX WARNING: type inference failed for: r14v0, types: [pc5, java.lang.Object] */
    public tc5(vb5 vb5) {
        tc5 tc5;
        tc5 tc52;
        mpb mpb;
        vb5 vb52 = vb5;
        ? j3h = new j3h(3);
        j3h.o = new bv1(2, false, false);
        try {
            tc52 = j3h;
            i8b.F("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + v0g.e + "]");
            Context context = vb52.a;
            Context applicationContext = context.getApplicationContext();
            j3h.v = applicationContext;
            wb4 wb4 = (wb4) vb52.h.apply(vb52.b);
            j3h.A0 = wb4;
            j3h.j1 = vb52.j;
            j3h.d1 = vb52.k;
            j3h.a1 = vb52.l;
            j3h.f1 = false;
            j3h.N0 = vb52.t;
            nc5 nc5 = new nc5(j3h);
            j3h.H0 = nc5;
            j3h.I0 = new Object();
            Handler handler = new Handler(vb52.i);
            pk0[] a = ((t1d) vb52.c.get()).a(handler, nc5, nc5, nc5, nc5);
            j3h.x = a;
            n79.n(a.length > 0);
            pe8 pe8 = (pe8) vb52.e.get();
            j3h.y = pe8;
            j3h.z0 = (lz8) vb52.d.get();
            zg0 zg0 = (zg0) vb52.g.get();
            j3h.C0 = zg0;
            j3h.y0 = vb52.m;
            und und = vb52.n;
            j3h.D0 = vb52.o;
            j3h.E0 = vb52.p;
            j3h.F0 = vb52.q;
            Looper looper = vb52.i;
            j3h.B0 = looper;
            c7f c7f = vb52.b;
            j3h.G0 = c7f;
            j3h.w = j3h;
            j3h.Z = new m56(looper, c7f, (k08) new gc5(j3h, 0));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            j3h.v0 = copyOnWriteArraySet;
            j3h.x0 = new ArrayList();
            j3h.T0 = new b9e();
            Context context2 = context;
            mqf mqf = new mqf(new s1d[a.length], new md5[a.length], qqf.b, (ne8) null);
            j3h.b = mqf;
            j3h.w0 = new ekf();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = length;
                int i3 = iArr[i];
                n79.n(!false);
                sparseBooleanArray.append(i3, true);
                i++;
                length = i2;
                iArr = iArr;
            }
            pe8.getClass();
            n79.n(!false);
            sparseBooleanArray.append(29, true);
            n79.n(!false);
            xq5 xq5 = new xq5(sparseBooleanArray);
            j3h.c = new pob(xq5);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            int i4 = 0;
            while (i4 < xq5.a.size()) {
                int b2 = xq5.b(i4);
                n79.n(!false);
                sparseBooleanArray2.append(b2, true);
                i4++;
                xq5 = xq5;
            }
            n79.n(!false);
            sparseBooleanArray2.append(4, true);
            n79.n(!false);
            sparseBooleanArray2.append(10, true);
            n79.n(!false);
            j3h.U0 = new pob(new xq5(sparseBooleanArray2));
            j3h.z = c7f.a(looper, (Handler.Callback) null);
            gc5 gc5 = new gc5(j3h, 3);
            j3h.X = gc5;
            j3h.o1 = eob.i(mqf);
            wb4.L(j3h, looper);
            int i5 = v0g.a;
            String str = vb52.w;
            if (i5 < 31) {
                tc52 = j3h;
                mpb = new mpb(str);
            } else {
                mpb = kc5.a(applicationContext, j3h, vb52.u, str);
            }
            tg4 tg4 = (tg4) vb52.f.get();
            int i6 = j3h.O0;
            boolean z2 = j3h.P0;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            try {
                Handler handler2 = handler;
                tc5 tc53 = this;
                tc52 = tc53;
                tc53.Y = new fd5(a, pe8, mqf, tg4, zg0, i6, z2, wb4, und, vb52.r, vb52.s, looper, c7f, gc5, mpb);
                tc53.e1 = 1.0f;
                tc53.O0 = 0;
                us8 us8 = us8.J;
                tc53.V0 = us8;
                tc53.W0 = us8;
                tc53.n1 = us8;
                tc53.p1 = -1;
                if (i5 < 21) {
                    AudioTrack audioTrack = tc53.X0;
                    if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                        tc53.X0.release();
                        tc53.X0 = null;
                    }
                    if (tc53.X0 == null) {
                        tc53.X0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    tc53.c1 = tc53.X0.getAudioSessionId();
                } else {
                    AudioManager audioManager = (AudioManager) tc53.v.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    tc53.c1 = audioManager == null ? -1 : audioManager.generateAudioSessionId();
                }
                tc53.g1 = o44.c;
                tc53.h1 = true;
                tc53.v(tc53.A0);
                Handler handler3 = new Handler(looper);
                wb4 wb42 = tc53.A0;
                wc4 wc4 = (wc4) zg0;
                wc4.getClass();
                wb42.getClass();
                xg0 xg0 = wc4.b;
                xg0.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = xg0.a;
                tc52 = tc53;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    wg0 wg0 = (wg0) it.next();
                    if (wg0.b == wb42) {
                        wg0.c = true;
                        copyOnWriteArrayList.remove(wg0);
                    }
                }
                copyOnWriteArrayList.add(new wg0(handler3, wb42));
                copyOnWriteArraySet2.add(tc53.H0);
                Context context3 = context2;
                Handler handler4 = handler2;
                he heVar = new he(context3, handler4, tc53.H0);
                tc53.J0 = heVar;
                heVar.t();
                n40 n40 = new n40(context3, handler4, tc53.H0);
                tc53.K0 = n40;
                n40.b((i30) null);
                gga gga = new gga(21);
                context3.getApplicationContext();
                tc53.L0 = gga;
                bv1 bv1 = new bv1(context3);
                tc53.M0 = bv1;
                bv1.h();
                he3 he3 = new he3(0);
                he3.b = 0;
                he3.c = 0;
                tc53.l1 = he3.b();
                tc53.m1 = v8g.e;
                tc53.b1 = ode.c;
                tc53.y.a(tc53.d1);
                tc53.B1(1, 10, Integer.valueOf(tc53.c1));
                tc53.B1(2, 10, Integer.valueOf(tc53.c1));
                tc53.B1(1, 3, tc53.d1);
                tc53.B1(2, 4, Integer.valueOf(tc53.a1));
                tc53.B1(2, 5, 0);
                tc53.B1(1, 9, Boolean.valueOf(tc53.f1));
                tc53.B1(2, 7, tc53.I0);
                tc53.B1(6, 8, tc53.I0);
                tc53.B1(-1, 16, Integer.valueOf(tc53.j1));
                tc53.o.g();
            } catch (Throwable th) {
                th = th;
                tc5 = this;
                tc5.o.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tc5 = tc52;
            tc5.o.g();
            throw th;
        }
    }

    public static long v1(eob eob) {
        hkf hkf = new hkf();
        ekf ekf = new ekf();
        eob.a.h(eob.b.a, ekf);
        long j = eob.c;
        if (j != -9223372036854775807L) {
            return ekf.e + j;
        }
        return eob.a.n(ekf.c, hkf, 0).l;
    }

    public final long A0() {
        K1();
        return this.D0;
    }

    public final void A1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.x0.remove(i3);
        }
        b9e b9e = this.T0;
        int i4 = i2 - i;
        int[] iArr = b9e.b;
        int[] iArr2 = new int[(iArr.length - i4)];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.T0 = new b9e(iArr2, new Random(b9e.a.nextLong()));
    }

    public final i30 B() {
        K1();
        return this.d1;
    }

    public final void B1(int i, int i2, Object obj) {
        for (pk0 pk0 : this.x) {
            if (i == -1 || pk0.b == i) {
                int t1 = t1(this.o1);
                jkf jkf = this.o1.a;
                int i3 = t1 == -1 ? 0 : t1;
                fd5 fd5 = this.Y;
                upb upb = new upb(fd5, pk0, jkf, i3, this.G0, fd5.X);
                n79.n(!upb.g);
                upb.d = i2;
                n79.n(!upb.g);
                upb.e = obj;
                upb.c();
            }
        }
    }

    public final void C(int i, boolean z2) {
        K1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C1(java.util.List r16, int r17, long r18, boolean r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            eob r2 = r0.o1
            int r2 = r15.t1(r2)
            long r3 = r15.h()
            int r5 = r0.Q0
            r6 = 1
            int r5 = r5 + r6
            r0.Q0 = r5
            java.util.ArrayList r5 = r0.x0
            boolean r7 = r5.isEmpty()
            r8 = 0
            if (r7 != 0) goto L_0x0023
            int r7 = r5.size()
            r15.A1(r8, r7)
        L_0x0023:
            r7 = r16
            java.util.ArrayList r10 = r15.n1(r8, r7)
            cqb r7 = new cqb
            b9e r9 = r0.T0
            r7.<init>(r5, r9)
            boolean r5 = r7.q()
            int r9 = r7.g
            if (r5 != 0) goto L_0x0041
            if (r1 >= r9) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>()
            throw r0
        L_0x0041:
            r5 = -1
            if (r20 == 0) goto L_0x0051
            boolean r1 = r0.P0
            int r1 = r7.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004f:
            r12 = r1
            goto L_0x0059
        L_0x0051:
            if (r1 != r5) goto L_0x0056
            r12 = r2
            r2 = r3
            goto L_0x0059
        L_0x0056:
            r2 = r18
            goto L_0x004f
        L_0x0059:
            eob r1 = r0.o1
            android.util.Pair r4 = r15.x1(r7, r12, r2)
            eob r1 = r15.w1(r1, r7, r4)
            int r4 = r1.e
            if (r12 == r5) goto L_0x0075
            if (r4 == r6) goto L_0x0075
            boolean r4 = r7.q()
            if (r4 != 0) goto L_0x0074
            if (r12 < r9) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r4 = 2
            goto L_0x0075
        L_0x0074:
            r4 = 4
        L_0x0075:
            eob r1 = r1.g(r4)
            long r13 = defpackage.v0g.S(r2)
            b9e r11 = r0.T0
            fd5 r2 = r0.Y
            k7f r2 = r2.y
            xc5 r3 = new xc5
            r9 = r3
            r9.<init>(r10, r11, r12, r13)
            r4 = 17
            i7f r2 = r2.a(r4, r3)
            r2.b()
            eob r2 = r0.o1
            nz8 r2 = r2.b
            java.lang.Object r2 = r2.a
            nz8 r3 = r1.b
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00ae
            eob r2 = r0.o1
            jkf r2 = r2.a
            boolean r2 = r2.q()
            if (r2 != 0) goto L_0x00ae
            r3 = r6
            goto L_0x00af
        L_0x00ae:
            r3 = r8
        L_0x00af:
            long r5 = r15.s1(r1)
            r2 = 0
            r4 = 4
            r7 = -1
            r8 = 0
            r0 = r15
            r0.H1(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc5.C1(java.util.List, int, long, boolean):void");
    }

    public final in4 D() {
        K1();
        return this.l1;
    }

    public final void D1(Object obj) {
        boolean z2;
        Object obj2 = obj;
        ArrayList arrayList = new ArrayList();
        for (pk0 pk0 : this.x) {
            if (pk0.b == 2) {
                int t1 = t1(this.o1);
                jkf jkf = this.o1.a;
                int i = t1 == -1 ? 0 : t1;
                fd5 fd5 = this.Y;
                upb upb = r9;
                upb upb2 = new upb(fd5, pk0, jkf, i, this.G0, fd5.X);
                n79.n(!upb.g);
                upb.d = 1;
                n79.n(!upb.g);
                upb.e = obj2;
                upb.c();
                arrayList.add(upb);
            }
        }
        Object obj3 = this.Y0;
        if (obj3 == null || obj3 == obj2) {
            z2 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((upb) it.next()).a(this.N0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            z2 = false;
            Object obj4 = this.Y0;
            Surface surface = this.Z0;
            if (obj4 == surface) {
                surface.release();
                this.Z0 = null;
            }
        }
        this.Y0 = obj2;
        if (z2) {
            E1(new ExoPlaybackException(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    public final void E() {
        K1();
    }

    public final void E1(ExoPlaybackException exoPlaybackException) {
        eob eob = this.o1;
        eob b2 = eob.b(eob.b);
        b2.q = b2.s;
        b2.r = 0;
        eob g = b2.g(1);
        if (exoPlaybackException != null) {
            g = g.e(exoPlaybackException);
        }
        eob eob2 = g;
        this.Q0++;
        k7f k7f = this.Y.y;
        k7f.getClass();
        i7f c2 = k7f.c();
        c2.a = k7f.a.obtainMessage(6);
        c2.b();
        H1(eob2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void F(int i, int i2) {
        K1();
    }

    public final void F1() {
        boolean z2 = true;
        pob pob = this.U0;
        int i = v0g.a;
        vob vob = this.w;
        boolean k = vob.k();
        boolean G02 = vob.G0();
        boolean G = vob.G();
        boolean X2 = vob.X();
        boolean T02 = vob.T0();
        boolean N02 = vob.N0();
        boolean q = vob.l0().q();
        y35 y35 = new y35(1);
        xq5 xq5 = this.c.a;
        vq5 vq5 = (vq5) y35.b;
        vq5.b(xq5);
        boolean z3 = !k;
        y35.n(4, z3);
        y35.n(5, G02 && !k);
        y35.n(6, G && !k);
        y35.n(7, !q && (G || !T02 || G02) && !k);
        y35.n(8, X2 && !k);
        y35.n(9, !q && (X2 || (T02 && N02)) && !k);
        y35.n(10, z3);
        y35.n(11, G02 && !k);
        if (!G02 || k) {
            z2 = false;
        }
        y35.n(12, z2);
        pob pob2 = new pob(vq5.e());
        this.U0 = pob2;
        if (!pob2.equals(pob)) {
            this.Z.j(13, new gc5(this, 2));
        }
    }

    public final void G1(int i, int i2, boolean z2) {
        int i3 = 0;
        boolean z3 = z2 && i != -1;
        if (i == 0) {
            i3 = 1;
        }
        eob eob = this.o1;
        if (eob.l != z3 || eob.n != i3 || eob.m != i2) {
            I1(i2, i3, z3);
        }
    }

    public final void H(int i) {
        K1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0299  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H1(defpackage.eob r41, int r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r44
            eob r3 = r0.o1
            r0.o1 = r1
            jkf r4 = r3.a
            jkf r5 = r1.a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            jkf r6 = r3.a
            jkf r7 = r1.a
            boolean r8 = r7.q()
            r9 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12 = 3
            r13 = 0
            if (r8 == 0) goto L_0x0035
            boolean r8 = r6.q()
            if (r8 == 0) goto L_0x0035
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
            goto L_0x00cd
        L_0x0035:
            boolean r8 = r7.q()
            boolean r9 = r6.q()
            if (r8 == r9) goto L_0x004c
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r6.<init>(r7, r8)
            goto L_0x00cd
        L_0x004c:
            nz8 r8 = r3.b
            java.lang.Object r9 = r8.a
            ekf r12 = r0.w0
            ekf r9 = r6.h(r9, r12)
            int r9 = r9.c
            java.lang.Object r11 = r0.a
            hkf r11 = (defpackage.hkf) r11
            hkf r6 = r6.n(r9, r11, r13)
            java.lang.Object r6 = r6.a
            nz8 r9 = r1.b
            java.lang.Object r15 = r9.a
            ekf r12 = r7.h(r15, r12)
            int r12 = r12.c
            hkf r7 = r7.n(r12, r11, r13)
            java.lang.Object r7 = r7.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009a
            if (r43 == 0) goto L_0x007e
            if (r2 != 0) goto L_0x007e
            r6 = r5
            goto L_0x0087
        L_0x007e:
            if (r43 == 0) goto L_0x0084
            if (r2 != r5) goto L_0x0084
            r6 = 2
            goto L_0x0087
        L_0x0084:
            if (r4 == 0) goto L_0x0094
            r6 = 3
        L_0x0087:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r8, r6)
            r6 = r7
            goto L_0x00cd
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x009a:
            if (r43 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x00b3
            long r6 = r8.d
            long r8 = r9.d
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b3
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00b3:
            if (r43 == 0) goto L_0x00c6
            if (r2 != r5) goto L_0x00c6
            if (r48 == 0) goto L_0x00c6
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.<init>(r7, r9)
            goto L_0x00cd
        L_0x00c6:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.<init>(r7, r10)
        L_0x00cd:
            java.lang.Object r7 = r6.first
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r7 == 0) goto L_0x0108
            jkf r9 = r1.a
            boolean r9 = r9.q()
            if (r9 != 0) goto L_0x0102
            jkf r9 = r1.a
            nz8 r10 = r1.b
            java.lang.Object r10 = r10.a
            ekf r11 = r0.w0
            ekf r9 = r9.h(r10, r11)
            int r9 = r9.c
            jkf r10 = r1.a
            java.lang.Object r11 = r0.a
            hkf r11 = (defpackage.hkf) r11
            hkf r9 = r10.n(r9, r11, r13)
            ir8 r9 = r9.c
            goto L_0x0103
        L_0x0102:
            r9 = 0
        L_0x0103:
            us8 r10 = defpackage.us8.J
            r0.n1 = r10
            goto L_0x0109
        L_0x0108:
            r9 = 0
        L_0x0109:
            if (r7 != 0) goto L_0x0115
            java.util.List r10 = r3.j
            java.util.List r11 = r1.j
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0144
        L_0x0115:
            us8 r10 = r0.n1
            ss8 r10 = r10.a()
            java.util.List r11 = r1.j
            r12 = 0
        L_0x011e:
            int r15 = r11.size()
            if (r12 >= r15) goto L_0x013d
            java.lang.Object r15 = r11.get(r12)
            sp9 r15 = (defpackage.sp9) r15
            r8 = 0
        L_0x012b:
            qp9[] r13 = r15.a
            int r14 = r13.length
            if (r8 >= r14) goto L_0x0138
            r13 = r13[r8]
            r13.u(r10)
            int r8 = r8 + 1
            goto L_0x012b
        L_0x0138:
            int r12 = r12 + 1
            r13 = 0
            goto L_0x011e
        L_0x013d:
            us8 r8 = new us8
            r8.<init>(r10)
            r0.n1 = r8
        L_0x0144:
            us8 r8 = r40.p1()
            us8 r10 = r0.V0
            boolean r10 = r8.equals(r10)
            r10 = r10 ^ r5
            r0.V0 = r8
            boolean r8 = r3.l
            boolean r11 = r1.l
            if (r8 == r11) goto L_0x0159
            r8 = r5
            goto L_0x015a
        L_0x0159:
            r8 = 0
        L_0x015a:
            int r11 = r3.e
            int r12 = r1.e
            if (r11 == r12) goto L_0x0162
            r11 = r5
            goto L_0x0163
        L_0x0162:
            r11 = 0
        L_0x0163:
            if (r11 != 0) goto L_0x0167
            if (r8 == 0) goto L_0x016a
        L_0x0167:
            r40.J1()
        L_0x016a:
            boolean r12 = r3.g
            boolean r13 = r1.g
            if (r12 == r13) goto L_0x0172
            r12 = r5
            goto L_0x0173
        L_0x0172:
            r12 = 0
        L_0x0173:
            if (r4 == 0) goto L_0x0183
            m56 r4 = r0.Z
            ud0 r13 = new ud0
            r14 = 4
            r15 = r42
            r13.<init>(r1, r15, r14)
            r14 = 0
            r4.j(r14, r13)
        L_0x0183:
            if (r43 == 0) goto L_0x02bc
            ekf r4 = new ekf
            r4.<init>()
            jkf r13 = r3.a
            boolean r13 = r13.q()
            if (r13 != 0) goto L_0x01c8
            nz8 r13 = r3.b
            java.lang.Object r13 = r13.a
            jkf r14 = r3.a
            r14.h(r13, r4)
            int r14 = r4.c
            jkf r15 = r3.a
            int r15 = r15.b(r13)
            jkf r5 = r3.a
            r42 = r13
            java.lang.Object r13 = r0.a
            hkf r13 = (defpackage.hkf) r13
            r16 = r11
            r17 = r12
            r11 = 0
            hkf r5 = r5.n(r14, r13, r11)
            java.lang.Object r5 = r5.a
            java.lang.Object r11 = r0.a
            hkf r11 = (defpackage.hkf) r11
            ir8 r11 = r11.c
            r22 = r42
            r19 = r5
            r21 = r11
            r20 = r14
            r23 = r15
            goto L_0x01d6
        L_0x01c8:
            r16 = r11
            r17 = r12
            r20 = r47
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = -1
        L_0x01d6:
            if (r2 != 0) goto L_0x0204
            nz8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x01ef
            nz8 r5 = r3.b
            int r11 = r5.b
            int r5 = r5.c
            long r4 = r4.a(r11, r5)
            long r11 = v1(r3)
            goto L_0x0219
        L_0x01ef:
            nz8 r5 = r3.b
            int r5 = r5.e
            r11 = -1
            if (r5 == r11) goto L_0x01fe
            eob r4 = r0.o1
            long r4 = v1(r4)
        L_0x01fc:
            r11 = r4
            goto L_0x0219
        L_0x01fe:
            long r11 = r4.e
            long r4 = r4.d
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0204:
            nz8 r5 = r3.b
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x0213
            long r4 = r3.s
            long r11 = v1(r3)
            goto L_0x0219
        L_0x0213:
            long r4 = r4.e
            long r11 = r3.s
            long r4 = r4 + r11
            goto L_0x01fc
        L_0x0219:
            uob r13 = new uob
            long r24 = defpackage.v0g.h0(r4)
            long r26 = defpackage.v0g.h0(r11)
            nz8 r4 = r3.b
            int r5 = r4.b
            int r4 = r4.c
            r18 = r13
            r28 = r5
            r29 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r29)
            int r4 = r40.d0()
            eob r5 = r0.o1
            jkf r5 = r5.a
            boolean r5 = r5.q()
            if (r5 != 0) goto L_0x0273
            eob r5 = r0.o1
            nz8 r11 = r5.b
            java.lang.Object r11 = r11.a
            jkf r5 = r5.a
            ekf r12 = r0.w0
            r5.h(r11, r12)
            eob r5 = r0.o1
            jkf r5 = r5.a
            int r5 = r5.b(r11)
            eob r12 = r0.o1
            jkf r12 = r12.a
            java.lang.Object r14 = r0.a
            hkf r14 = (defpackage.hkf) r14
            r15 = r10
            r18 = r11
            r10 = 0
            hkf r10 = r12.n(r4, r14, r10)
            java.lang.Object r10 = r10.a
            ir8 r11 = r14.c
            r33 = r5
            r29 = r10
            r31 = r11
            r32 = r18
            goto L_0x027c
        L_0x0273:
            r15 = r10
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = -1
        L_0x027c:
            long r34 = defpackage.v0g.h0(r45)
            uob r5 = new uob
            eob r10 = r0.o1
            nz8 r10 = r10.b
            boolean r10 = r10.b()
            if (r10 == 0) goto L_0x0299
            eob r10 = r0.o1
            long r10 = v1(r10)
            long r10 = defpackage.v0g.h0(r10)
            r36 = r10
            goto L_0x029b
        L_0x0299:
            r36 = r34
        L_0x029b:
            eob r10 = r0.o1
            nz8 r10 = r10.b
            int r11 = r10.b
            int r10 = r10.c
            r28 = r5
            r30 = r4
            r38 = r11
            r39 = r10
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            m56 r4 = r0.Z
            oj0 r10 = new oj0
            r11 = 5
            r10.<init>((int) r2, (java.lang.Object) r13, (java.lang.Object) r5, (int) r11)
            r2 = 11
            r4.j(r2, r10)
            goto L_0x02c1
        L_0x02bc:
            r15 = r10
            r16 = r11
            r17 = r12
        L_0x02c1:
            if (r7 == 0) goto L_0x02cf
            m56 r2 = r0.Z
            ud0 r4 = new ud0
            r5 = 6
            r4.<init>(r9, r6, r5)
            r5 = 1
            r2.j(r5, r4)
        L_0x02cf:
            androidx.media3.exoplayer.ExoPlaybackException r2 = r3.f
            androidx.media3.exoplayer.ExoPlaybackException r4 = r1.f
            if (r2 == r4) goto L_0x02f1
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 0
            r4.<init>(r1, r5)
            r5 = 10
            r2.j(r5, r4)
            androidx.media3.exoplayer.ExoPlaybackException r2 = r1.f
            if (r2 == 0) goto L_0x02f1
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r6 = 1
            r4.<init>(r1, r6)
            r2.j(r5, r4)
        L_0x02f1:
            mqf r2 = r3.i
            mqf r4 = r1.i
            if (r2 == r4) goto L_0x030c
            pe8 r2 = r0.y
            java.lang.Object r4 = r4.c
            r2.getClass()
            ne8 r4 = (defpackage.ne8) r4
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 2
            r4.<init>(r1, r5)
            r5 = 2
            r2.j(r5, r4)
        L_0x030c:
            if (r15 == 0) goto L_0x031d
            us8 r2 = r0.V0
            m56 r4 = r0.Z
            dc5 r5 = new dc5
            r6 = 0
            r5.<init>(r2, r6)
            r2 = 14
            r4.j(r2, r5)
        L_0x031d:
            if (r17 == 0) goto L_0x032b
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 3
            r4.<init>(r1, r5)
            r5 = 3
            r2.j(r5, r4)
        L_0x032b:
            if (r16 != 0) goto L_0x032f
            if (r8 == 0) goto L_0x033b
        L_0x032f:
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 4
            r4.<init>(r1, r5)
            r5 = -1
            r2.j(r5, r4)
        L_0x033b:
            if (r16 == 0) goto L_0x0349
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 5
            r4.<init>(r1, r5)
            r5 = 4
            r2.j(r5, r4)
        L_0x0349:
            if (r8 != 0) goto L_0x0351
            int r2 = r3.m
            int r4 = r1.m
            if (r2 == r4) goto L_0x035d
        L_0x0351:
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 6
            r4.<init>(r1, r5)
            r5 = 5
            r2.j(r5, r4)
        L_0x035d:
            int r2 = r3.n
            int r4 = r1.n
            if (r2 == r4) goto L_0x036f
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 7
            r4.<init>(r1, r5)
            r5 = 6
            r2.j(r5, r4)
        L_0x036f:
            boolean r2 = r3.k()
            boolean r4 = r41.k()
            if (r2 == r4) goto L_0x0386
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 8
            r4.<init>(r1, r5)
            r5 = 7
            r2.j(r5, r4)
        L_0x0386:
            gob r2 = r3.o
            gob r4 = r1.o
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x039e
            m56 r2 = r0.Z
            bc5 r4 = new bc5
            r5 = 9
            r4.<init>(r1, r5)
            r5 = 12
            r2.j(r5, r4)
        L_0x039e:
            r40.F1()
            m56 r2 = r0.Z
            r2.h()
            boolean r2 = r3.p
            boolean r1 = r1.p
            if (r2 == r1) goto L_0x03c4
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.v0
            java.util.Iterator r0 = r0.iterator()
        L_0x03b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03c4
            java.lang.Object r1 = r0.next()
            nc5 r1 = (defpackage.nc5) r1
            tc5 r1 = r1.a
            r1.J1()
            goto L_0x03b2
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc5.H1(eob, int, boolean, int, long, int, boolean):void");
    }

    public final int I() {
        K1();
        if (k()) {
            return this.o1.b.c;
        }
        return -1;
    }

    public final void I1(int i, int i2, boolean z2) {
        this.Q0++;
        eob eob = this.o1;
        if (eob.p) {
            eob = eob.a();
        }
        eob d = eob.d(i, i2, z2);
        int i3 = i | (i2 << 4);
        k7f k7f = this.Y.y;
        k7f.getClass();
        i7f c2 = k7f.c();
        c2.a = k7f.a.obtainMessage(1, z2 ? 1 : 0, i3);
        c2.b();
        H1(d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void J(kqf kqf) {
        K1();
        pe8 pe8 = this.y;
        pe8.getClass();
        if (!kqf.equals(((sj4) pe8).f())) {
            pe8.b(kqf);
            this.Z.m(19, new ic5(kqf, 0));
        }
    }

    public final void J1() {
        int playbackState = getPlaybackState();
        bv1 bv1 = this.M0;
        gga gga = this.L0;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                K1();
                boolean z2 = this.o1.p;
                boolean q = q();
                gga.getClass();
                q();
                bv1.getClass();
                bv1.getClass();
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        gga.getClass();
        bv1.getClass();
        bv1.getClass();
    }

    public final void K1() {
        this.o.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.B0;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = v0g.a;
            Locale locale = Locale.US;
            String p = rae.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.h1) {
                i8b.W(p, this.i1 ? null : new IllegalStateException());
                this.i1 = true;
                return;
            }
            throw new IllegalStateException(p);
        }
    }

    public final void L(int i, int i2) {
        K1();
        n79.g(i >= 0 && i2 >= i);
        int size = this.x0.size();
        int min = Math.min(i2, size);
        if (i < size && i != min) {
            eob z1 = z1(this.o1, i, min);
            H1(z1, 0, !z1.b.a.equals(this.o1.b.a), 4, s1(z1), -1, false);
        }
    }

    public final PlaybackException N() {
        K1();
        return this.o1.f;
    }

    public final void O(boolean z2) {
        K1();
        int d = this.K0.d(getPlaybackState(), z2);
        G1(d, d == -1 ? 2 : 1, z2);
    }

    public final Looper O0() {
        return this.B0;
    }

    public final long Q() {
        K1();
        return this.E0;
    }

    public final long R() {
        K1();
        return r1(this.o1);
    }

    public final void S(int i, List list) {
        K1();
        ArrayList q12 = q1(list);
        K1();
        n79.g(i >= 0);
        ArrayList arrayList = this.x0;
        int min = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            boolean z2 = this.p1 == -1;
            K1();
            C1(q12, -1, -9223372036854775807L, z2);
            return;
        }
        H1(o1(this.o1, min, q12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final long T() {
        K1();
        if (!k()) {
            return s0();
        }
        eob eob = this.o1;
        return eob.k.equals(eob.b) ? v0g.h0(this.o1.q) : e();
    }

    public final void V(int i) {
        K1();
    }

    public final qqf W() {
        K1();
        return (qqf) this.o1.i.w;
    }

    public final us8 Y() {
        K1();
        return this.W0;
    }

    public final o44 Z() {
        K1();
        return this.g1;
    }

    public final void a0(i30 i30, boolean z2) {
        K1();
        if (!this.k1) {
            boolean a = v0g.a(this.d1, i30);
            int i = 1;
            m56 m56 = this.Z;
            if (!a) {
                this.d1 = i30;
                B1(1, 3, i30);
                m56.j(20, new hc5(i30, 0));
            }
            i30 i302 = z2 ? i30 : null;
            n40 n40 = this.K0;
            n40.b(i302);
            this.y.a(i30);
            boolean q = q();
            int d = n40.d(getPlaybackState(), q);
            if (d == -1) {
                i = 2;
            }
            G1(d, i, q);
            m56.h();
        }
    }

    public final float b() {
        K1();
        return this.e1;
    }

    public final void b0(us8 us8) {
        K1();
        if (!us8.equals(this.W0)) {
            this.W0 = us8;
            this.Z.m(15, new gc5(this, 1));
        }
    }

    public final gob c() {
        K1();
        return this.o1.o;
    }

    public final int c0() {
        K1();
        if (k()) {
            return this.o1.b.b;
        }
        return -1;
    }

    public final void c1(int i, long j, boolean z2) {
        K1();
        if (i != -1) {
            n79.g(i >= 0);
            jkf jkf = this.o1.a;
            if (jkf.q() || i < jkf.p()) {
                wb4 wb4 = this.A0;
                if (!wb4.z) {
                    td a = wb4.a();
                    wb4.z = true;
                    wb4.K(a, -1, new nb4(0));
                }
                this.Q0++;
                if (k()) {
                    i8b.V("seekTo ignored because an ad is playing");
                    ad5 ad5 = new ad5(this.o1);
                    ad5.d(1);
                    tc5 tc5 = this.X.b;
                    tc5.z.d(new bk4(22, tc5, ad5));
                    return;
                }
                eob eob = this.o1;
                int i2 = eob.e;
                if (i2 == 3 || (i2 == 4 && !jkf.q())) {
                    eob = this.o1.g(2);
                }
                int d0 = d0();
                eob w1 = w1(eob, jkf, x1(jkf, i, j));
                this.Y.y.a(3, new dd5(jkf, i, v0g.S(j))).b();
                H1(w1, 0, true, 1, s1(w1), d0, z2);
            }
        }
    }

    public final boolean d() {
        K1();
        return this.o1.g;
    }

    public final int d0() {
        K1();
        int t1 = t1(this.o1);
        if (t1 == -1) {
            return 0;
        }
        return t1;
    }

    public final long e() {
        K1();
        if (!k()) {
            return w();
        }
        eob eob = this.o1;
        nz8 nz8 = eob.b;
        jkf jkf = eob.a;
        Object obj = nz8.a;
        ekf ekf = this.w0;
        jkf.h(obj, ekf);
        return v0g.h0(ekf.a(nz8.b, nz8.c));
    }

    public final void e0(boolean z2) {
        K1();
    }

    public final void f(gob gob) {
        K1();
        if (!this.o1.o.equals(gob)) {
            eob f = this.o1.f(gob);
            this.Q0++;
            this.Y.y.a(4, gob).b();
            H1(f, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void f0(sob sob) {
        K1();
        sob.getClass();
        this.Z.l(sob);
    }

    public final void g(float f) {
        K1();
        float i = v0g.i(f, c44.DEFAULT_ASPECT_RATIO, 1.0f);
        if (this.e1 != i) {
            this.e1 = i;
            B1(1, 2, Float.valueOf(this.K0.e * i));
            this.Z.m(22, new zb5(i, 1));
        }
    }

    public final void g0(List list, int i, int i2) {
        K1();
        n79.g(i >= 0 && i2 >= i);
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        if (i <= size) {
            int min = Math.min(i2, size);
            if (min - i == list.size()) {
                int i3 = i;
                while (i3 < min) {
                    if (((rc5) arrayList.get(i3)).b.k.a((ir8) list.get(i3 - i))) {
                        i3++;
                    }
                }
                this.Q0++;
                this.Y.y.b(list, 27, i, min).b();
                for (int i4 = i; i4 < min; i4++) {
                    rc5 rc5 = (rc5) arrayList.get(i4);
                    rc5.c = new aqb(rc5.c, (ir8) list.get(i4 - i));
                }
                H1(this.o1.h(new cqb(arrayList, this.T0)), 0, false, 4, -9223372036854775807L, -1, false);
                return;
            }
            ArrayList q12 = q1(list);
            if (arrayList.isEmpty()) {
                boolean z2 = this.p1 == -1;
                K1();
                C1(q12, -1, -9223372036854775807L, z2);
                return;
            }
            eob z1 = z1(o1(this.o1, min, q12), i, min);
            H1(z1, 0, !z1.b.a.equals(this.o1.b.a), 4, s1(z1), -1, false);
        }
    }

    public final int getPlaybackState() {
        K1();
        return this.o1.e;
    }

    public final int getRepeatMode() {
        K1();
        return this.O0;
    }

    public final long h() {
        K1();
        return v0g.h0(s1(this.o1));
    }

    public final int i() {
        K1();
        return 0;
    }

    public final void i0(int i, int i2, int i3) {
        K1();
        n79.g(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        int min = Math.min(i2, size);
        int min2 = Math.min(i3, size - (min - i));
        if (i < size && i != min && i != min2) {
            jkf l0 = l0();
            this.Q0++;
            v0g.R(arrayList, i, min, min2);
            cqb cqb = new cqb(arrayList, this.T0);
            eob eob = this.o1;
            eob w1 = w1(eob, cqb, u1(l0, cqb, t1(eob), r1(this.o1)));
            b9e b9e = this.T0;
            fd5 fd5 = this.Y;
            fd5.getClass();
            fd5.y.a(19, new yc5(i, min, min2, b9e)).b();
            H1(w1, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void j(Surface surface) {
        K1();
        D1(surface);
        int i = surface == null ? 0 : -1;
        y1(i, i);
    }

    public final int j0() {
        K1();
        return this.o1.n;
    }

    public final boolean k() {
        K1();
        return this.o1.b.b();
    }

    public final jkf l0() {
        K1();
        return this.o1.a;
    }

    public final long m() {
        K1();
        return v0g.h0(this.o1.r);
    }

    public final boolean m0() {
        K1();
        return false;
    }

    public final ArrayList n1(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            h09 h09 = new h09((yj0) list.get(i2), this.y0);
            arrayList.add(h09);
            this.x0.add(i2 + i, new rc5(h09.b, h09.a));
        }
        this.T0 = this.T0.a(i, arrayList.size());
        return arrayList;
    }

    public final pob o() {
        K1();
        return this.U0;
    }

    public final eob o1(eob eob, int i, ArrayList arrayList) {
        jkf jkf = eob.a;
        this.Q0++;
        ArrayList n12 = n1(i, arrayList);
        cqb cqb = new cqb(this.x0, this.T0);
        eob w1 = w1(eob, cqb, u1(jkf, cqb, t1(eob), r1(eob)));
        this.Y.y.b(new xc5(n12, this.T0, -1, -9223372036854775807L), 18, i, 0).b();
        return w1;
    }

    public final void p0() {
        K1();
    }

    public final us8 p1() {
        jkf l0 = l0();
        if (l0.q()) {
            return this.n1;
        }
        ir8 ir8 = l0.n(d0(), (hkf) this.a, 0).c;
        ss8 a = this.n1.a();
        us8 us8 = ir8.d;
        if (us8 != null) {
            CharSequence charSequence = us8.a;
            if (charSequence != null) {
                a.a = charSequence;
            }
            CharSequence charSequence2 = us8.b;
            if (charSequence2 != null) {
                a.b = charSequence2;
            }
            CharSequence charSequence3 = us8.c;
            if (charSequence3 != null) {
                a.c = charSequence3;
            }
            CharSequence charSequence4 = us8.d;
            if (charSequence4 != null) {
                a.d = charSequence4;
            }
            CharSequence charSequence5 = us8.e;
            if (charSequence5 != null) {
                a.e = charSequence5;
            }
            CharSequence charSequence6 = us8.f;
            if (charSequence6 != null) {
                a.f = charSequence6;
            }
            CharSequence charSequence7 = us8.g;
            if (charSequence7 != null) {
                a.g = charSequence7;
            }
            Long l = us8.h;
            if (l != null) {
                a.i(l);
            }
            rpc rpc = us8.i;
            if (rpc != null) {
                a.i = rpc;
            }
            rpc rpc2 = us8.j;
            if (rpc2 != null) {
                a.j = rpc2;
            }
            byte[] bArr = us8.k;
            Uri uri = us8.m;
            if (!(uri == null && bArr == null)) {
                a.m = uri;
                a.f(bArr, us8.l);
            }
            Integer num = us8.n;
            if (num != null) {
                a.n = num;
            }
            Integer num2 = us8.o;
            if (num2 != null) {
                a.o = num2;
            }
            Integer num3 = us8.p;
            if (num3 != null) {
                a.p = num3;
            }
            Boolean bool = us8.q;
            if (bool != null) {
                a.q = bool;
            }
            Boolean bool2 = us8.r;
            if (bool2 != null) {
                a.r = bool2;
            }
            Integer num4 = us8.s;
            if (num4 != null) {
                a.s = num4;
            }
            Integer num5 = us8.t;
            if (num5 != null) {
                a.s = num5;
            }
            Integer num6 = us8.u;
            if (num6 != null) {
                a.t = num6;
            }
            Integer num7 = us8.v;
            if (num7 != null) {
                a.u = num7;
            }
            Integer num8 = us8.w;
            if (num8 != null) {
                a.v = num8;
            }
            Integer num9 = us8.x;
            if (num9 != null) {
                a.w = num9;
            }
            Integer num10 = us8.y;
            if (num10 != null) {
                a.x = num10;
            }
            CharSequence charSequence8 = us8.z;
            if (charSequence8 != null) {
                a.y = charSequence8;
            }
            CharSequence charSequence9 = us8.A;
            if (charSequence9 != null) {
                a.z = charSequence9;
            }
            CharSequence charSequence10 = us8.B;
            if (charSequence10 != null) {
                a.A = charSequence10;
            }
            Integer num11 = us8.C;
            if (num11 != null) {
                a.B = num11;
            }
            Integer num12 = us8.D;
            if (num12 != null) {
                a.C = num12;
            }
            CharSequence charSequence11 = us8.E;
            if (charSequence11 != null) {
                a.D = charSequence11;
            }
            CharSequence charSequence12 = us8.F;
            if (charSequence12 != null) {
                a.E = charSequence12;
            }
            CharSequence charSequence13 = us8.G;
            if (charSequence13 != null) {
                a.F = charSequence13;
            }
            Integer num13 = us8.H;
            if (num13 != null) {
                a.G = num13;
            }
            Bundle bundle = us8.I;
            if (bundle != null) {
                a.H = bundle;
            }
        }
        return new us8(a);
    }

    public final void prepare() {
        K1();
        boolean q = q();
        int i = 2;
        int d = this.K0.d(2, q);
        G1(d, d == -1 ? 2 : 1, q);
        eob eob = this.o1;
        if (eob.e == 1) {
            eob e = eob.e((ExoPlaybackException) null);
            if (e.a.q()) {
                i = 4;
            }
            eob g = e.g(i);
            this.Q0++;
            k7f k7f = this.Y.y;
            k7f.getClass();
            i7f c2 = k7f.c();
            c2.a = k7f.a.obtainMessage(29);
            c2.b();
            H1(g, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final boolean q() {
        K1();
        return this.o1.l;
    }

    public final boolean q0() {
        K1();
        return this.P0;
    }

    public final ArrayList q1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.z0.d((ir8) list.get(i)));
        }
        return arrayList;
    }

    public final kqf r0() {
        K1();
        return ((sj4) this.y).f();
    }

    public final long r1(eob eob) {
        if (!eob.b.b()) {
            return v0g.h0(s1(eob));
        }
        Object obj = eob.b.a;
        jkf jkf = eob.a;
        ekf ekf = this.w0;
        jkf.h(obj, ekf);
        long j = eob.c;
        return j == -9223372036854775807L ? v0g.h0(jkf.n(t1(eob), (hkf) this.a, 0).l) : v0g.h0(ekf.e) + v0g.h0(j);
    }

    public final void release() {
        boolean z2;
        hj4 hj4;
        AudioTrack audioTrack;
        i8b.F("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + v0g.e + "] [" + cs8.b() + "]");
        K1();
        int i = v0g.a;
        if (i < 21 && (audioTrack = this.X0) != null) {
            audioTrack.release();
            this.X0 = null;
        }
        this.J0.t();
        this.L0.getClass();
        bv1 bv1 = this.M0;
        bv1.getClass();
        bv1.getClass();
        n40 n40 = this.K0;
        n40.h = null;
        n40.a();
        n40.c(0);
        fd5 fd5 = this.Y;
        synchronized (fd5) {
            if (!fd5.J0) {
                if (fd5.X.getThread().isAlive()) {
                    fd5.y.f(7);
                    fd5.i0(new ch4(8, fd5), fd5.E0);
                    z2 = fd5.J0;
                }
            }
            z2 = true;
        }
        if (!z2) {
            this.Z.m(10, new lw4(10));
        }
        this.Z.k();
        this.z.a.removeCallbacksAndMessages((Object) null);
        zg0 zg0 = this.C0;
        wb4 wb4 = this.A0;
        CopyOnWriteArrayList copyOnWriteArrayList = ((wc4) zg0).b.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            wg0 wg0 = (wg0) it.next();
            if (wg0.b == wb4) {
                wg0.c = true;
                copyOnWriteArrayList.remove(wg0);
            }
        }
        eob eob = this.o1;
        if (eob.p) {
            this.o1 = eob.a();
        }
        eob g = this.o1.g(1);
        this.o1 = g;
        eob b2 = g.b(g.b);
        this.o1 = b2;
        b2.q = b2.s;
        this.o1.r = 0;
        wb4 wb42 = this.A0;
        k7f k7f = wb42.y;
        n79.o(k7f);
        k7f.d(new pr1(26, wb42));
        sj4 sj4 = (sj4) this.y;
        synchronized (sj4.c) {
            if (i >= 32) {
                try {
                    lf6 lf6 = sj4.h;
                    if (!(lf6 == null || (hj4 = (hj4) lf6.v) == null)) {
                        if (((Handler) lf6.o) != null) {
                            ((Spatializer) lf6.c).removeOnSpatializerStateChangedListener(hj4);
                            ((Handler) lf6.o).removeCallbacksAndMessages((Object) null);
                            lf6.o = null;
                            lf6.v = null;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        sj4.a = null;
        sj4.b = null;
        Surface surface = this.Z0;
        if (surface != null) {
            surface.release();
            this.Z0 = null;
        }
        this.g1 = o44.c;
        this.k1 = true;
    }

    public final void s(boolean z2) {
        K1();
        if (this.P0 != z2) {
            this.P0 = z2;
            k7f k7f = this.Y.y;
            k7f.getClass();
            i7f c2 = k7f.c();
            c2.a = k7f.a.obtainMessage(12, z2 ? 1 : 0, 0);
            c2.b();
            vz0 vz0 = new vz0(z2, 2);
            m56 m56 = this.Z;
            m56.j(9, vz0);
            F1();
            m56.h();
        }
    }

    public final long s0() {
        K1();
        if (this.o1.a.q()) {
            return this.q1;
        }
        eob eob = this.o1;
        if (eob.k.d != eob.b.d) {
            return v0g.h0(eob.a.n(d0(), (hkf) this.a, 0).m);
        }
        long j = eob.q;
        if (this.o1.k.b()) {
            eob eob2 = this.o1;
            ekf h = eob2.a.h(eob2.k.a, this.w0);
            long d = h.d(this.o1.k.b);
            j = d == Long.MIN_VALUE ? h.d : d;
        }
        eob eob3 = this.o1;
        jkf jkf = eob3.a;
        Object obj = eob3.k.a;
        ekf ekf = this.w0;
        jkf.h(obj, ekf);
        return v0g.h0(j + ekf.e);
    }

    public final long s1(eob eob) {
        if (eob.a.q()) {
            return v0g.S(this.q1);
        }
        long j = eob.p ? eob.j() : eob.s;
        if (eob.b.b()) {
            return j;
        }
        jkf jkf = eob.a;
        Object obj = eob.b.a;
        ekf ekf = this.w0;
        jkf.h(obj, ekf);
        return j + ekf.e;
    }

    public final void setRepeatMode(int i) {
        K1();
        if (this.O0 != i) {
            this.O0 = i;
            k7f k7f = this.Y.y;
            k7f.getClass();
            i7f c2 = k7f.c();
            c2.a = k7f.a.obtainMessage(11, i, 0);
            c2.b();
            ob4 ob4 = new ob4(i, 2);
            m56 m56 = this.Z;
            m56.j(8, ob4);
            F1();
            m56.h();
        }
    }

    public final void stop() {
        K1();
        this.K0.d(1, q());
        E1((ExoPlaybackException) null);
        this.g1 = new o44(this.o1.s, k0d.v);
    }

    public final void t0(int i, long j, List list) {
        K1();
        ArrayList q12 = q1(list);
        K1();
        C1(q12, i, j, false);
    }

    public final int t1(eob eob) {
        if (eob.a.q()) {
            return this.p1;
        }
        return eob.a.h(eob.b.a, this.w0).c;
    }

    public final long u() {
        K1();
        return this.F0;
    }

    public final void u0(int i) {
        K1();
    }

    public final Pair u1(jkf jkf, cqb cqb, int i, long j) {
        cqb cqb2 = cqb;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (jkf.q() || cqb.q()) {
            boolean z2 = !jkf.q() && cqb.q();
            if (!z2) {
                i2 = i;
            }
            if (!z2) {
                j2 = j;
            }
            return x1(cqb, i2, j2);
        }
        Pair j3 = jkf.j((hkf) this.a, this.w0, i, v0g.S(j));
        Object obj = j3.first;
        if (cqb.b(obj) != -1) {
            return j3;
        }
        int G = fd5.G((hkf) this.a, this.w0, this.O0, this.P0, obj, jkf, cqb);
        if (G == -1) {
            return x1(cqb, -1, -9223372036854775807L);
        }
        hkf hkf = (hkf) this.a;
        cqb.n(G, hkf, 0);
        return x1(cqb, G, v0g.h0(hkf.l));
    }

    public final void v(sob sob) {
        sob.getClass();
        this.Z.c(sob);
    }

    public final eob w1(eob eob, jkf jkf, Pair pair) {
        List list;
        int i;
        jkf jkf2 = jkf;
        Pair pair2 = pair;
        n79.g(jkf.q() || pair2 != null);
        jkf jkf3 = eob.a;
        long r1 = r1(eob);
        eob h = eob.h(jkf);
        if (jkf.q()) {
            nz8 nz8 = eob.u;
            long S = v0g.S(this.q1);
            eob b2 = h.c(nz8, S, S, S, 0, upf.d, this.b, k0d.v).b(nz8);
            b2.q = b2.s;
            return b2;
        }
        Object obj = h.b.a;
        int i2 = v0g.a;
        boolean z2 = !obj.equals(pair2.first);
        nz8 nz82 = z2 ? new nz8(pair2.first) : h.b;
        long longValue = ((Long) pair2.second).longValue();
        long S2 = v0g.S(r1);
        if (!jkf3.q()) {
            S2 -= jkf3.h(obj, this.w0).e;
        }
        if (z2 || longValue < S2) {
            long j = longValue;
            nz8 nz83 = nz82;
            n79.n(!nz83.b());
            upf upf = z2 ? upf.d : h.h;
            mqf mqf = z2 ? this.b : h.i;
            if (z2) {
                lx5 lx5 = tb7.b;
                list = k0d.v;
            } else {
                list = h.j;
            }
            eob b3 = h.c(nz83, j, j, j, 0, upf, mqf, list).b(nz83);
            b3.q = j;
            return b3;
        } else if (i == 0) {
            int b4 = jkf2.b(h.k.a);
            if (b4 != -1 && jkf2.g(b4, this.w0, false).c == jkf2.h(nz82.a, this.w0).c) {
                return h;
            }
            jkf2.h(nz82.a, this.w0);
            long a = nz82.b() ? this.w0.a(nz82.b, nz82.c) : this.w0.d;
            eob b5 = h.c(nz82, h.s, h.s, h.d, a - h.s, h.h, h.i, h.j).b(nz82);
            b5.q = a;
            return b5;
        } else {
            nz8 nz84 = nz82;
            n79.n(!nz84.b());
            long max = Math.max(0, h.r - (longValue - S2));
            long j2 = h.q;
            if (h.k.equals(h.b)) {
                j2 = longValue + max;
            }
            eob c2 = h.c(nz84, longValue, longValue, longValue, max, h.h, h.i, h.j);
            c2.q = j2;
            return c2;
        }
    }

    public final int x() {
        K1();
        if (this.o1.a.q()) {
            return 0;
        }
        eob eob = this.o1;
        return eob.a.b(eob.b.a);
    }

    public final Pair x1(jkf jkf, int i, long j) {
        if (jkf.q()) {
            this.p1 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.q1 = j;
            return null;
        }
        if (i == -1 || i >= jkf.p()) {
            i = jkf.a(this.P0);
            j = v0g.h0(jkf.n(i, (hkf) this.a, 0).l);
        }
        return jkf.j((hkf) this.a, this.w0, i, v0g.S(j));
    }

    public final v8g y() {
        K1();
        return this.m1;
    }

    public final us8 y0() {
        K1();
        return this.V0;
    }

    public final void y1(int i, int i2) {
        ode ode = this.b1;
        if (i != ode.a || i2 != ode.b) {
            this.b1 = new ode(i, i2);
            this.Z.m(24, new fc5(i, i2, 0));
            B1(2, 14, new ode(i, i2));
        }
    }

    public final void z0(List list) {
        K1();
        ArrayList q12 = q1(list);
        K1();
        C1(q12, -1, -9223372036854775807L, true);
    }

    public final eob z1(eob eob, int i, int i2) {
        int t1 = t1(eob);
        long r1 = r1(eob);
        ArrayList arrayList = this.x0;
        int size = arrayList.size();
        this.Q0++;
        A1(i, i2);
        cqb cqb = new cqb(arrayList, this.T0);
        eob w1 = w1(eob, cqb, u1(eob.a, cqb, t1, r1));
        int i3 = w1.e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && t1 >= w1.a.p()) {
            w1 = w1.g(4);
        }
        this.Y.y.b(this.T0, 20, i, i2).b();
        return w1;
    }
}
