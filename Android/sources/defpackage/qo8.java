package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* renamed from: qo8  reason: default package */
public final class qo8 implements vob {
    public final hkf a = new hkf();
    public boolean b;
    public final po8 c;
    public final oo8 o;
    public final Handler v;
    public final long w = -9223372036854775807L;
    public boolean x;
    public final no8 y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: tp8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: np8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: tp8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: tp8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qo8(android.content.Context r7, defpackage.oxd r8, android.os.Bundle r9, defpackage.oo8 r10, android.os.Looper r11, defpackage.yo8 r12, defpackage.ox0 r13) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.n79.k(r7, r0)
            java.lang.String r0 = "token must not be null"
            defpackage.n79.k(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Init "
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " [AndroidXMedia3/1.4.1] ["
            r0.append(r1)
            java.lang.String r1 = defpackage.v0g.e
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.i8b.F(r0)
            hkf r0 = new hkf
            r0.<init>()
            r6.a = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.w = r0
            r6.o = r10
            android.os.Handler r10 = new android.os.Handler
            r10.<init>(r11)
            r6.v = r10
            r6.y = r12
            nxd r10 = r8.a
            boolean r10 = r10.e()
            if (r10 == 0) goto L_0x0065
            tp8 r9 = new tp8
            r13.getClass()
            r0 = r9
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r11
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0071
        L_0x0065:
            np8 r10 = new np8
            r0 = r10
            r1 = r7
            r2 = r6
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r10
        L_0x0071:
            r6.c = r9
            r9.connect()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo8.<init>(android.content.Context, oxd, android.os.Bundle, oo8, android.os.Looper, yo8, ox0):void");
    }

    public final void A() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekTo().");
        } else {
            po8.A();
        }
    }

    public final long A0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.A0();
        }
        return 0;
    }

    public final i30 B() {
        I0();
        po8 po8 = this.c;
        return !po8.isConnected() ? i30.g : po8.B();
    }

    public final int B0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.E0();
        }
        return -1;
    }

    public final void C(int i, boolean z) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            po8.C(i, z);
        }
    }

    public final ir8 C0() {
        jkf l0 = l0();
        if (l0.q()) {
            return null;
        }
        return l0.n(d0(), this.a, 0).c;
    }

    public final in4 D() {
        I0();
        po8 po8 = this.c;
        return !po8.isConnected() ? in4.e : po8.D();
    }

    public final int D0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.C0();
        }
        return -1;
    }

    public final void E() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            po8.E();
        }
    }

    public final void E0() {
        n79.n(Looper.myLooper() == this.v.getLooper());
        n79.n(!this.x);
        this.x = true;
        yo8 yo8 = (yo8) this.y;
        yo8.X = true;
        qo8 qo8 = yo8.z;
        if (qo8 != null) {
            yo8.l(qo8);
        }
    }

    public final void F(int i, int i2) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            po8.F(i, i2);
        }
    }

    public final void F0(pk3 pk3) {
        n79.n(Looper.myLooper() == this.v.getLooper());
        pk3.accept(this.o);
    }

    public final boolean G() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.G();
    }

    public final boolean G0() {
        I0();
        jkf l0 = l0();
        return !l0.q() && l0.n(d0(), this.a, 0).h;
    }

    public final void H(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            po8.H(i);
        }
    }

    public final void H0(Runnable runnable) {
        v0g.W(this.v, runnable);
    }

    public final int I() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.I();
        }
        return -1;
    }

    public final void I0() {
        n79.m("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.v.getLooper());
    }

    public final void J(kqf kqf) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        po8.J(kqf);
    }

    public final boolean J0(int i) {
        return o().a(i);
    }

    public final void K(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring removeMediaItem().");
        } else {
            po8.K(i);
        }
    }

    public final void L(int i, int i2) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring removeMediaItems().");
        } else {
            po8.L(i, i2);
        }
    }

    public final void M() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekToPrevious().");
        } else {
            po8.M();
        }
    }

    public final PlaybackException N() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.N();
        }
        return null;
    }

    public final boolean N0() {
        I0();
        jkf l0 = l0();
        return !l0.q() && l0.n(d0(), this.a, 0).i;
    }

    public final void O(boolean z) {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            po8.O(z);
        }
    }

    public final Looper O0() {
        return this.v.getLooper();
    }

    public final void P(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekTo().");
        } else {
            po8.P(i);
        }
    }

    public final long Q() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.Q();
        }
        return 0;
    }

    public final long R() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.R();
        }
        return 0;
    }

    public final void S(int i, List list) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring addMediaItems().");
        } else {
            po8.S(i, list);
        }
    }

    public final long T() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.T();
        }
        return 0;
    }

    public final boolean T0() {
        I0();
        jkf l0 = l0();
        return !l0.q() && l0.n(d0(), this.a, 0).a();
    }

    public final void U() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else {
            po8.U();
        }
    }

    public final void V(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            po8.V(i);
        }
    }

    public final qqf W() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.W() : qqf.b;
    }

    public final boolean X() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.X();
    }

    public final us8 Y() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.Y() : us8.J;
    }

    public final o44 Z() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.Z() : o44.c;
    }

    public final boolean a() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.a();
    }

    public final void a0(i30 i30, boolean z) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setAudioAttributes().");
        } else {
            po8.a0(i30, z);
        }
    }

    public final float b() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.b();
        }
        return 1.0f;
    }

    public final void b0(us8 us8) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setPlaylistMetadata().");
        } else {
            po8.b0(us8);
        }
    }

    public final gob c() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.c() : gob.d;
    }

    public final int c0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.c0();
        }
        return -1;
    }

    public final boolean d() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.d();
    }

    public final int d0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.d0();
        }
        return -1;
    }

    public final long e() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.e();
        }
        return -9223372036854775807L;
    }

    public final void e0(boolean z) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            po8.e0(z);
        }
    }

    public final void f(gob gob) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setPlaybackParameters().");
        } else {
            po8.f(gob);
        }
    }

    public final void f0(sob sob) {
        I0();
        n79.k(sob, "listener must not be null");
        this.c.f0(sob);
    }

    public final void g(float f) {
        I0();
        n79.f("volume must be between 0 and 1", f >= c44.DEFAULT_ASPECT_RATIO && f <= 1.0f);
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setVolume().");
        } else {
            po8.g(f);
        }
    }

    public final void g0(List list, int i, int i2) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring replaceMediaItems().");
        } else {
            po8.g0(list, i, i2);
        }
    }

    public final int getPlaybackState() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.getPlaybackState();
        }
        return 1;
    }

    public final int getRepeatMode() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.getRepeatMode();
        }
        return 0;
    }

    public final long h() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.h();
        }
        return 0;
    }

    public final void h0(int i, int i2) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring moveMediaItem().");
        } else {
            po8.h0(i, i2);
        }
    }

    public final int i() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            return 0;
        }
        return po8.i();
    }

    public final void i0(int i, int i2, int i3) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring moveMediaItems().");
        } else {
            po8.i0(i, i2, i3);
        }
    }

    public final void j(Surface surface) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setVideoSurface().");
        } else {
            po8.j(surface);
        }
    }

    public final int j0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.j0();
        }
        return 0;
    }

    public final boolean k() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.k();
    }

    public final void k0(List list) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring addMediaItems().");
        } else {
            po8.k0(list);
        }
    }

    public final long l() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.l();
        }
        return -9223372036854775807L;
    }

    public final jkf l0() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.l0() : jkf.a;
    }

    public final long m() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.m();
        }
        return 0;
    }

    public final boolean m0() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            return false;
        }
        return po8.m0();
    }

    public final void n(int i, long j) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekTo().");
        } else {
            po8.n(i, j);
        }
    }

    public final void n0(int i, ir8 ir8) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring replaceMediaItem().");
        } else {
            po8.n0(i, ir8);
        }
    }

    public final pob o() {
        I0();
        po8 po8 = this.c;
        return !po8.isConnected() ? pob.b : po8.o();
    }

    public final void o0(ir8 ir8) {
        I0();
        n79.k(ir8, "mediaItems must not be null");
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setMediaItems().");
        } else {
            po8.o0(ir8);
        }
    }

    public final void p(ir8 ir8, long j) {
        I0();
        n79.k(ir8, "mediaItems must not be null");
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setMediaItem().");
        } else {
            po8.p(ir8, j);
        }
    }

    public final void p0() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            po8.p0();
        }
    }

    public final void pause() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring pause().");
        } else {
            po8.pause();
        }
    }

    public final void play() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring play().");
        } else {
            po8.play();
        }
    }

    public final void prepare() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring prepare().");
        } else {
            po8.prepare();
        }
    }

    public final boolean q() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.q();
    }

    public final boolean q0() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() && po8.q0();
    }

    public final void r() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring clearMediaItems().");
        } else {
            po8.r();
        }
    }

    public final kqf r0() {
        I0();
        po8 po8 = this.c;
        return !po8.isConnected() ? kqf.C : po8.r0();
    }

    public final void release() {
        I0();
        if (!this.b) {
            i8b.F("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + v0g.e + "] [" + cs8.b() + "]");
            boolean z = true;
            this.b = true;
            Handler handler = this.v;
            handler.removeCallbacksAndMessages((Object) null);
            try {
                this.c.release();
            } catch (Exception e) {
                i8b.l(e, "Exception while releasing impl");
            }
            if (this.x) {
                if (Looper.myLooper() != handler.getLooper()) {
                    z = false;
                }
                n79.n(z);
                this.o.onDisconnected();
                return;
            }
            this.x = true;
            yo8 yo8 = (yo8) this.y;
            yo8.getClass();
            yo8.m(new SecurityException("Session rejected the connection request."));
        }
    }

    public final void s(boolean z) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setShuffleMode().");
        } else {
            po8.s(z);
        }
    }

    public final long s0() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.s0();
        }
        return 0;
    }

    public final void seekTo(long j) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekTo().");
        } else {
            po8.seekTo(j);
        }
    }

    public final void setPlaybackSpeed(float f) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setPlaybackSpeed().");
        } else {
            po8.setPlaybackSpeed(f);
        }
    }

    public final void setRepeatMode(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setRepeatMode().");
        } else {
            po8.setRepeatMode(i);
        }
    }

    public final void stop() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring stop().");
        } else {
            po8.stop();
        }
    }

    public final int t() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.t();
        }
        return 0;
    }

    public final void t0(int i, long j, List list) {
        I0();
        n79.k(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            n79.f("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setMediaItems().");
        } else {
            po8.t0(i, j, list);
        }
    }

    public final long u() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.u();
        }
        return 0;
    }

    public final void u0(int i) {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            po8.u0(i);
        }
    }

    public final void v(sob sob) {
        this.c.v(sob);
    }

    public final void v0() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekToNext().");
        } else {
            po8.v0();
        }
    }

    public final long w() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.w();
        }
        return -9223372036854775807L;
    }

    public final void w0() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekForward().");
        } else {
            po8.w0();
        }
    }

    public final int x() {
        I0();
        po8 po8 = this.c;
        if (po8.isConnected()) {
            return po8.x();
        }
        return -1;
    }

    public final void x0() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekBack().");
        } else {
            po8.x0();
        }
    }

    public final v8g y() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.y() : v8g.e;
    }

    public final us8 y0() {
        I0();
        po8 po8 = this.c;
        return po8.isConnected() ? po8.y0() : us8.J;
    }

    public final void z() {
        I0();
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else {
            po8.z();
        }
    }

    public final void z0(List list) {
        I0();
        n79.k(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            n79.f("items must not contain null, index=" + i, list.get(i) != null);
        }
        po8 po8 = this.c;
        if (!po8.isConnected()) {
            i8b.V("The controller is not connected. Ignoring setMediaItems().");
        } else {
            po8.z0(list);
        }
    }
}
