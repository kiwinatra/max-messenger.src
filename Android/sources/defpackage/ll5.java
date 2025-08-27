package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.a;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: ll5  reason: default package */
public final class ll5 extends f0 {
    public String X;
    public boolean Y;
    public o5h Z;
    public final nd v;
    public int v0;
    public final jqg w;
    public boolean w0;
    public final po5 x;
    public ao1 x0;
    public long y;
    public final or7 y0;
    public long z;
    public final fa9 z0;

    public ll5(nd ndVar, jqg jqg, po5 po5, Context context, FrgBase frgBase, jb9 jb9, dac dac, fa9 fa9) {
        super(context, frgBase, jb9, 848);
        this.v = ndVar;
        this.w = jqg;
        this.x = po5;
        this.z0 = fa9;
        ci5 ci5 = new ci5(20);
        dac.getClass();
        or7 or7 = new or7(new jl5(this, 1), m58.g, m58.e);
        Objects.requireNonNull(or7, "observer is null");
        try {
            dac.a(new qia(or7, ci5, 0));
            this.y0 = or7;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void P(a89 a89, l20 l20, a aVar, boolean z2, boolean z3, int i, o5h o5h) {
        a89 a892 = a89;
        l20 l202 = l20;
        boolean z4 = z3;
        o5h o5h2 = o5h;
        if (a892.a.A()) {
            this.X = null;
            this.Y = false;
            this.Z = null;
            this.w0 = false;
            this.v0 = 0;
            this.y = 0;
            if (!z4 || !ld8.Y(l20) || l202.n.c()) {
                boolean e = l202.n.e();
                fa9 fa9 = this.z0;
                ha9 ha9 = a892.a;
                s10 s10 = l202.j;
                String str = l202.q;
                if (!e) {
                    d20 d20 = l202.n;
                    if (!d20.a() && !d20.b()) {
                        if (d20.c()) {
                            R(a89, l20, z4, o5h2);
                            return;
                        } else if (!d20.d()) {
                            return;
                        } else {
                            if (s10.a == 0) {
                                long j = ha9.z;
                                CollectionsKt.emptyList();
                                bk3 bk3 = bl4.o;
                                this.w.a(new nud(j, CollectionsKt.listOf(Long.valueOf(ha9.b)), (z93) null, true, ha9.S0));
                                return;
                            }
                            fa9.w(ha9, str, d20.b);
                            return;
                        }
                    }
                }
                this.v.e("ACTION_FILE_DOWNLOAD");
                this.Y = z2;
                this.X = str;
                this.w0 = z4;
                this.v0 = i;
                this.Z = o5h2;
                if (n54.e((Context) this.a, n54.n())) {
                    fa9.w(ha9, str, d20.v);
                    rl d = ((sjd) ((z9f) this.b)).d();
                    long j2 = s10.a;
                    long j3 = ha9.b;
                    this.y = ((jna) d).B(s10.c, l202.q, j2, j3);
                    return;
                }
                n54.N(aVar, n54.n(), 167);
                return;
            }
            R(a89, l20, true, o5h2);
        }
    }

    public final void Q(Bundle bundle) {
        if (bundle != null) {
            this.y = bundle.getLong("ru.ok.tamtam.extra.FILE_DOWNLOAD_REQUEST_ID", 0);
            this.X = bundle.getString("ru.ok.tamtam.extra.FILE_TO_OPEN_FILE_ATTACH_ID", (String) null);
            this.Y = bundle.getBoolean("ru.ok.tamtam.extra.TO_OPEN_FILE_ON_FINISH_DOWNLOAD", false);
            this.v0 = bundle.getInt("ru.ok.tamtam.extra.FILE_TO_OPEN_CLICK_SOURCE", 0);
            this.w0 = bundle.getBoolean("ru.ok.tamtam.extra.FILE_TO_OPEN_IN_APP", false);
            this.z = bundle.getLong("ru.ok.tamtam.extra.SHARED_FILE_MESSAGE_ID", 0);
        }
    }

    public final void R(a89 a89, l20 l20, boolean z2, o5h o5h) {
        kl5 kl5 = new kl5(this, l20, z2, a89, o5h);
        ci5 ci5 = new ci5(23);
        jbf z3 = ((sjd) ((z9f) this.b)).z();
        z3.getClass();
        jbd.a(kl5, ((kbf) z3).a(), (x6) null, ci5, (lfd) null);
    }

    public final void S(String str, boolean z2) {
        if (str != null && str.equals(this.X) && f() && ((w57) this.o).isActive() && ((FrgBase) this.c).X2() != null) {
            mka h = lbe.h(((w57) this.o).U());
            sjd sjd = (sjd) ((z9f) this.b);
            fce n = h.n(((kbf) sjd.z()).c());
            jbf z3 = sjd.z();
            z3.getClass();
            fce j = new wbe(n.j(((kbf) z3).a()), new ib4(16, this, str), 0).j(((kbf) sjd.z()).c());
            ao1 ao1 = new ao1(3, new ij5(this, str, z2, 1), new ci5(24));
            j.l(ao1);
            this.x0 = ao1;
        }
    }

    @SuppressLint({"CheckResult"})
    @oye
    public void onEvent(twf twf) {
        if (twf.c == this.z) {
            StringBuilder sb = new StringBuilder("UpdateMessageEvent: messageId = ");
            long j = twf.c;
            sb.append(j);
            z68.c("ll5", sb.toString(), new Object[0]);
            sjd sjd = (sjd) ((z9f) this.b);
            ai8 ai8 = new ai8(new wh8(0, sjd.q().a(j, false), new jl5(this, 3)), new ci5(21), 1);
            jbf z2 = sjd.z();
            z2.getClass();
            ai8.h(((kbf) z2).a()).f(((kbf) sjd.z()).c()).a(new oh8(new jl5(this, 0), new ci5(22), m58.e));
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        int i;
        if (this.y == hj0.a) {
            String str = hj0.b.b;
            int i2 = fhf.a;
            if ("file.not.found".equals(str)) {
                i = qad.z2;
            } else {
                i = qad.y2;
            }
            Context context = (Context) this.a;
            hi7.b0(0, context, context.getString(i));
            if (f()) {
                ((w57) this.o).getClass();
            }
        }
    }

    @oye
    public void onEvent(tr4 tr4) {
        if (tr4.v != this.z) {
            S(tr4.o, false);
        } else if (f()) {
            if (!((w57) this.o).isActive()) {
                ((w57) this.o).T0(tr4);
            } else if (this.z != 0) {
                sjd sjd = (sjd) ((z9f) this.b);
                mka a = sjd.q().a(this.z, false);
                jbf z2 = sjd.z();
                z2.getClass();
                new ai8(new wh8(0, a.n(((kbf) z2).a()), new ci5(25)), new ci5(26), 1).f(((kbf) sjd.z()).c()).a(new oh8(new jl5(this, 2), new ci5(27), m58.e));
                this.z = 0;
            }
        }
    }

    @oye
    public void onEvent(vr4 vr4) {
        if (vr4.o == this.z && f()) {
            if (((w57) this.o).isActive()) {
                this.z = 0;
                ((w57) this.o).n0();
                return;
            }
            ((w57) this.o).T0(vr4);
        }
    }
}
