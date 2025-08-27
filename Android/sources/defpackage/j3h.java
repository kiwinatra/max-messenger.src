package defpackage;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: j3h  reason: default package */
public abstract class j3h implements hp, vob {
    public final Object a;

    public /* synthetic */ j3h(Object obj) {
        this.a = obj;
    }

    public void A() {
        c1(((tc5) this).d0(), -9223372036854775807L, false);
    }

    public ir8 C0() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            return null;
        }
        return l0.n(tc5.d0(), (hkf) this.a, 0).c;
    }

    public boolean G() {
        int i;
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            i = -1;
        } else {
            int d0 = tc5.d0();
            tc5.K1();
            int i2 = tc5.O0;
            if (i2 == 1) {
                i2 = 0;
            }
            tc5.K1();
            i = l0.l(d0, i2, tc5.P0);
        }
        return i != -1;
    }

    public boolean G0() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        return !l0.q() && l0.n(tc5.d0(), (hkf) this.a, 0).h;
    }

    public abstract int I();

    public boolean J0(int i) {
        tc5 tc5 = (tc5) this;
        tc5.K1();
        return tc5.U0.a(i);
    }

    public void K(int i) {
        ((tc5) this).L(i, i + 1);
    }

    public void M() {
        tc5 tc5 = (tc5) this;
        if (tc5.l0().q() || tc5.k()) {
            Z0();
            return;
        }
        boolean G = G();
        if (!T0() || G0()) {
            if (G) {
                long h = tc5.h();
                tc5.K1();
                if (h <= tc5.F0) {
                    f1(7);
                    return;
                }
            }
            d1(7, 0);
        } else if (G) {
            f1(7);
        } else {
            Z0();
        }
    }

    public boolean N0() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        return !l0.q() && l0.n(tc5.d0(), (hkf) this.a, 0).i;
    }

    public void P(int i) {
        c1(i, -9223372036854775807L, false);
    }

    public abstract long R();

    public void S0(int i, float f) {
    }

    public boolean T0() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        return !l0.q() && l0.n(tc5.d0(), (hkf) this.a, 0).a();
    }

    public void U() {
        int i;
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            i = -1;
        } else {
            int d0 = tc5.d0();
            tc5.K1();
            int i2 = tc5.O0;
            if (i2 == 1) {
                i2 = 0;
            }
            tc5.K1();
            i = l0.e(d0, i2, tc5.P0);
        }
        if (i == -1) {
            Z0();
        } else if (i == tc5.d0()) {
            c1(tc5.d0(), -9223372036854775807L, true);
        } else {
            c1(i, -9223372036854775807L, false);
        }
    }

    public abstract boolean U0();

    public abstract ikf V0();

    public ta4 W0() {
        return (ta4) ((Lazy) this.a).getValue();
    }

    public boolean X() {
        int i;
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            i = -1;
        } else {
            int d0 = tc5.d0();
            tc5.K1();
            int i2 = tc5.O0;
            if (i2 == 1) {
                i2 = 0;
            }
            tc5.K1();
            i = l0.e(d0, i2, tc5.P0);
        }
        return i != -1;
    }

    public abstract void X0();

    public void Y0(pa4 pa4) {
        W0().b(pa4.b, (Bundle) null);
    }

    public void Z0() {
        ((tc5) this).K1();
    }

    public boolean a() {
        tc5 tc5 = (tc5) this;
        return tc5.getPlaybackState() == 3 && tc5.q() && tc5.j0() == 0;
    }

    public boolean a1(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        yef yef = (yef) this.a;
        if (yef == null) {
            return U0();
        }
        int c = yef.c(charSequence, i);
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return U0();
        }
        return false;
    }

    public boolean b1() {
        int i;
        qge qge = (qge) this.a;
        View view = qge.c.S0;
        if (view != null) {
            i = 4;
            if (!(view.getAlpha() == c44.DEFAULT_ASPECT_RATIO && view.getVisibility() == 0)) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i = 2;
                } else if (visibility != 4) {
                    if (visibility == 8) {
                        i = 3;
                    } else {
                        throw new IllegalArgumentException(wj6.h(visibility, "Unknown visibility "));
                    }
                }
            }
        } else {
            i = 0;
        }
        int i2 = qge.a;
        return i == i2 || !(i == 2 || i2 == 2);
    }

    public abstract int c0();

    public abstract void c1(int i, long j, boolean z);

    public abstract int d0();

    public void d1(int i, long j) {
        c1(((tc5) this).d0(), j, false);
    }

    public void e1(int i, long j) {
        tc5 tc5 = (tc5) this;
        long h = tc5.h() + j;
        long e = tc5.e();
        if (e != -9223372036854775807L) {
            h = Math.min(h, e);
        }
        d1(i, Math.max(h, 0));
    }

    public void f1(int i) {
        int i2;
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            i2 = -1;
        } else {
            int d0 = tc5.d0();
            tc5.K1();
            int i3 = tc5.O0;
            if (i3 == 1) {
                i3 = 0;
            }
            tc5.K1();
            i2 = l0.l(d0, i3, tc5.P0);
        }
        if (i2 == -1) {
            Z0();
        } else if (i2 == tc5.d0()) {
            c1(tc5.d0(), -9223372036854775807L, true);
        } else {
            c1(i2, -9223372036854775807L, false);
        }
    }

    public abstract double g1(long j, Object obj);

    public abstract int getRepeatMode();

    public abstract long h();

    public void h0(int i, int i2) {
        if (i != i2) {
            ((tc5) this).i0(i, i + 1, i2);
        }
    }

    public abstract float h1(long j, Object obj);

    public abstract void i1(Object obj, long j, boolean z);

    public abstract void j1(Object obj, long j, byte b);

    public abstract boolean k();

    public void k0(List list) {
        ((tc5) this).S(IntCompanionObject.MAX_VALUE, list);
    }

    public abstract void k1(Object obj, long j, double d);

    public long l() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            return -9223372036854775807L;
        }
        int d0 = tc5.d0();
        hkf hkf = (hkf) this.a;
        if (l0.n(d0, hkf, 0).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (v0g.B(hkf.g) - hkf.f) - tc5.R();
    }

    public abstract void l1(Object obj, long j, float f);

    public abstract long m();

    public abstract boolean m1(long j, Object obj);

    public void n(int i, long j) {
        c1(i, j, false);
    }

    public void n0(int i, ir8 ir8) {
        tc5 tc5 = (tc5) this;
        tc5.g0(tb7.t(ir8), i, i + 1);
    }

    public void o0(ir8 ir8) {
        ((tc5) this).z0(tb7.t(ir8));
    }

    public void p(ir8 ir8, long j) {
        ((tc5) this).t0(0, j, tb7.t(ir8));
    }

    public void pause() {
        ((tc5) this).O(false);
    }

    public void play() {
        ((tc5) this).O(true);
    }

    public void r() {
        ((tc5) this).L(0, IntCompanionObject.MAX_VALUE);
    }

    public void seekTo(long j) {
        d1(5, j);
    }

    public void setPlaybackSpeed(float f) {
        tc5 tc5 = (tc5) this;
        tc5.f(new gob(f, tc5.c().b));
    }

    public int t() {
        tc5 tc5 = (tc5) this;
        long T = tc5.T();
        long e = tc5.e();
        if (T == -9223372036854775807L || e == -9223372036854775807L) {
            return 0;
        }
        if (e == 0) {
            return 100;
        }
        return v0g.j((int) ((T * 100) / e), 0, 100);
    }

    public void v0() {
        int i;
        tc5 tc5 = (tc5) this;
        if (tc5.l0().q() || tc5.k()) {
            Z0();
        } else if (X()) {
            jkf l0 = tc5.l0();
            if (l0.q()) {
                i = -1;
            } else {
                int d0 = tc5.d0();
                tc5.K1();
                int i2 = tc5.O0;
                if (i2 == 1) {
                    i2 = 0;
                }
                tc5.K1();
                i = l0.e(d0, i2, tc5.P0);
            }
            if (i == -1) {
                Z0();
            } else if (i == tc5.d0()) {
                c1(tc5.d0(), -9223372036854775807L, true);
            } else {
                c1(i, -9223372036854775807L, false);
            }
        } else if (!T0() || !N0()) {
            Z0();
        } else {
            c1(tc5.d0(), -9223372036854775807L, false);
        }
    }

    public long w() {
        tc5 tc5 = (tc5) this;
        jkf l0 = tc5.l0();
        if (l0.q()) {
            return -9223372036854775807L;
        }
        return v0g.h0(l0.n(tc5.d0(), (hkf) this.a, 0).m);
    }

    public void w0() {
        tc5 tc5 = (tc5) this;
        tc5.K1();
        e1(12, tc5.E0);
    }

    public abstract int x();

    public void x0() {
        tc5 tc5 = (tc5) this;
        tc5.K1();
        e1(11, -tc5.D0);
    }

    public void z() {
        f1(6);
    }

    public j3h(int i) {
        switch (i) {
            case 3:
                this.a = new hkf();
                return;
            case 6:
                na7 na7 = na7.a;
                this.a = new ArrayList();
                return;
            case 7:
                this.a = new BitSet(20);
                return;
            case 8:
                this.a = ua4.a.getAccessor().h(ta4.class);
                return;
            default:
                this.a = new gkf();
                return;
        }
    }

    public j3h(MediaCodecInfo mediaCodecInfo, String str) {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.a = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new Exception(a81.m("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
