package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* renamed from: c2a  reason: default package */
public final class c2a extends w1 implements iu8, hu8, e9g {
    public final dac X = new dac();
    public or7 Y;
    public or7 Z;
    public final FrgTrimVideo b;
    public final nd c;
    public final String o;
    public final ju8 v;
    public boolean v0 = true;
    public final long w;
    public long x;
    public long y;
    public long z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c2a(m4a m4a, FrgTrimVideo frgTrimVideo, nd ndVar, String str, ju8 ju8, long j, long j2, boolean z2) {
        super(m4a);
        String str2 = str;
        ju8 ju82 = ju8;
        this.b = frgTrimVideo;
        this.c = ndVar;
        this.o = str2;
        this.v = ju82;
        this.x = j;
        this.y = j2;
        m4a.R(this);
        m48 m48 = (m48) ju82;
        m48.e = this;
        long B = o5a.B(frgTrimVideo.O1(), Uri.parse(str));
        this.w = B;
        long j3 = j;
        wu9 wu9 = r1;
        wu9 wu92 = new wu9(j3, B, Collections.singletonList(new uu9(str2, 0, 0, 0)), z2);
        m48.t(wu9, this);
        m4a.Z(j3, j, j2, B);
        a0();
    }

    public final int B() {
        return ((m48) this.v).h();
    }

    public final void C() {
    }

    public final void D() {
    }

    public final int E() {
        return ((m48) this.v).i();
    }

    public final void O(Throwable th) {
        int i = qad.ja;
        FrgTrimVideo frgTrimVideo = this.b;
        Context O1 = frgTrimVideo.O1();
        if (O1 != null) {
            hi7.b0(0, O1, frgTrimVideo.S1(i));
        }
    }

    public final void W() {
        jbd.c(this.Z);
        this.Z = null;
        ((m48) this.v).n();
    }

    public final void X() {
        if (this.Y == null) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            lfd a = qe.a();
            dac dac = this.X;
            dac.getClass();
            Objects.requireNonNull(timeUnit, "unit is null");
            lja s = new ika(dac, 300, timeUnit, a, false).s(qe.a());
            ju8 ju8 = this.v;
            Objects.requireNonNull(ju8);
            td8 td8 = new td8(26, ju8);
            gga gga = m58.f;
            dj6 dj6 = m58.e;
            iia iia = new iia(s, td8, gga, dj6);
            or7 or7 = new or7(gga, m58.g, dj6);
            iia.a(or7);
            this.Y = or7;
        }
    }

    public final void Y() {
        W();
        ((m48) this.v).r(this.x);
        ((m4a) this.a).w0.setPointerPosition(this.x);
    }

    public final void Z() {
        jbd.c(this.Y);
        this.Y = null;
    }

    public final void a0() {
        int i = (this.x > 0 ? 1 : (this.x == 0 ? 0 : -1));
        f2a f2a = this.a;
        if (i == 0 && this.y == this.w) {
            ((m4a) f2a).a0(false);
        } else {
            ((m4a) f2a).a0(true);
        }
    }

    public final void b() {
        m4a m4a = (m4a) this.a;
        ((View) m4a.c).setKeepScreenOn(true);
        m4a.Y.setVisibility(0);
        m4a.X.setVisibility(4);
    }

    public final int f() {
        f4g f4g = ((m48) this.v).f;
        if (f4g == null) {
            return 0;
        }
        return f4g.f();
    }

    public final void j(Surface surface) {
        ((m48) this.v).s(surface);
    }

    public final void k(int i, int i2, int i3) {
        ((m4a) this.a).z.d();
    }

    public final int p() {
        return ((m48) this.v).j();
    }

    public final void q() {
        m4a m4a = (m4a) this.a;
        ((View) m4a.c).setKeepScreenOn(false);
        jbd.c(this.Z);
        this.Z = null;
        m4a.X.setVisibility(0);
        m4a.Y.setVisibility(4);
        m4a.c0(true, ((m48) this.v).k());
    }

    public final void s() {
        Y();
    }

    public final void y() {
        z68.a("c2a", "onMediaPlayerControllerDetach");
    }
}
