package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: q18  reason: default package */
public final class q18 extends hnf implements t18, c18, c68 {
    public long A0;
    public final lfd X;
    public final yva Y;
    public final p18 Z;
    public final Context b;
    public final d18 c;
    public final jtb o;
    public final km3 v;
    public a32 v0;
    public final taf w;
    public List w0;
    public final g68 x;
    public oh8 x0;
    public final fn4 y;
    public or7 y0;
    public final lfd z;
    public s58 z0 = s58.x;

    public q18(Context context, d18 d18, jtb jtb, km3 km3, taf taf, g68 g68, fn4 fn4, lfd lfd, lfd lfd2, yva yva, p18 p18, a32 a32) {
        this.b = context;
        this.c = d18;
        this.o = jtb;
        this.v = km3;
        this.w = taf;
        this.x = g68;
        this.y = fn4;
        this.z = lfd;
        this.X = lfd2;
        this.Y = yva;
        this.Z = p18;
        e(a32);
        f();
    }

    public final void G0() {
        f();
    }

    public final void K(long j) {
        p18 p18 = this.Z;
        if (p18 != null) {
            p18.K(j);
        }
    }

    public final void L(s58 s58) {
        this.z0 = s58;
        f();
    }

    public final void a(boolean z2) {
        this.Z.a(z2);
    }

    public final void b() {
        a32 a32 = this.v0;
        if (a32 != null) {
            ((j18) this.c).o(this, a32.a);
        }
        jbd.c(this.x0);
        jbd.c(this.y0);
    }

    public final void c() {
        a32 a32 = this.v0;
        if (a32 != null) {
            ((j18) this.c).i(this, a32.a);
        }
        f();
        jbd.c(this.y0);
        long q = (long) ((ltb) this.o).b.q();
        lja s = jha.o(q, q, TimeUnit.SECONDS, xfd.a()).s(qe.a());
        or7 or7 = new or7(new o18(this, 3), new n77(22), m58.e);
        s.a(or7);
        this.y0 = or7;
    }

    public final List d() {
        List list = this.w0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.w0;
    }

    public final void e(a32 a32) {
        a32 a322 = this.v0;
        d18 d18 = this.c;
        if (a322 != null && (a32 == null || a322.a != a32.a)) {
            ((j18) d18).o(this, a322.a);
        }
        this.v0 = a32;
        if (a32 != null) {
            ((j18) d18).i(this, a32.a);
        }
    }

    public final void f() {
        jbd.c(this.x0);
        if (this.v0 != null) {
            cud cud = ((ltb) this.o).b;
            cud.getClass();
            if (cud.m(PmsKey.f55livelocationenabled, true)) {
                oi8 f = new ai8(((j18) this.c).c(this.v0.a).h(this.z).f(this.X), new o18(this, 0), 0).f(qe.a());
                oh8 oh8 = new oh8(new o18(this, 1), new o18(this, 2), new b5(22, this));
                f.a(oh8);
                this.x0 = oh8;
                return;
            }
        }
        this.w0 = null;
        gnf gnf = this.a;
        if (gnf != null) {
            gnf.j();
        }
    }

    public final void l0(long j) {
        p18 p18 = this.Z;
        if (p18 != null) {
            p18.l0(j);
        }
    }

    public final void o(boolean z2, boolean z3, long j, long j2) {
        p18 p18 = this.Z;
        if (p18 != null) {
            p18.o(z2, z3, j, j2);
        }
    }

    public final void w() {
    }
}
