package defpackage;

import java.util.Objects;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;

/* renamed from: r0a  reason: default package */
public final class r0a extends w1 implements c18 {
    public oh8 X;
    public or7 Y;
    public final FrgLiveLocationSettings Z;
    public final jtb b;
    public final r62 c;
    public final d18 o;
    public final sv0 v;
    public boolean v0;
    public final nd w;
    public final eud x;
    public final lfd y;
    public final fn4 z;

    public r0a(z2a z2a, ltb ltb, r62 r62, d18 d18, jd8 jd8, nd ndVar, eud eud, lfd lfd, fn4 fn4, FrgLiveLocationSettings frgLiveLocationSettings) {
        super(z2a);
        this.b = ltb;
        this.c = r62;
        this.o = d18;
        this.v = jd8;
        this.w = ndVar;
        this.Z = frgLiveLocationSettings;
        this.x = eud;
        this.y = lfd;
        this.z = fn4;
    }

    public final void G0() {
        W();
    }

    public final void W() {
        jbd.c(this.X);
        oha B = new yia(new oa3(1, ((j18) this.o).b(((ltb) this.b).a.s(), this.z.a()).h(this.y).f(qe.a()), new q0a(0)), new p0a(this, 1), 3).B();
        q0a q0a = new q0a(1);
        oh8 oh8 = new oh8(new p0a(this, 2), new p0a(this, 3), new b5(26, this));
        Objects.requireNonNull(oh8, "observer is null");
        try {
            B.l(new zh8(oh8, q0a, 1));
            this.X = oh8;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @oye
    public void onEvent(zu3 zu3) {
        ((z2a) this.a).y.m();
    }
}
