package defpackage;

import kotlin.Lazy;

/* renamed from: uq7  reason: default package */
public final class uq7 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public volatile boolean e;

    public uq7(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            moe moe = (moe) this.a.getValue();
            moe.getClass();
            jbd.a(new loe(moe, 1), moe.i, (x6) null, new mqd(17), (lfd) null);
            vi5 vi5 = (vi5) this.b.getValue();
            vi5.getClass();
            pka x = new cia(new ti5(0, vi5), 0).x((lfd) vi5.d.get());
            hs7 hs7 = vi5.c;
            lja s = x.s((lfd) hs7.get());
            si5 si5 = new si5(vi5, 1);
            ci5 ci5 = new ci5(12);
            dj6 dj6 = m58.e;
            s.a(new or7(si5, ci5, dj6));
            lja s2 = vi5.i.s((lfd) hs7.get());
            ci5 ci52 = new ci5(13);
            gga gga = m58.f;
            new iia(s2, ci52, gga, dj6).h(new si5(vi5, 2)).a(new or7(new si5(vi5, 3), new ci5(14), dj6));
            ai5 ai5 = (ai5) this.c.getValue();
            oa3 oa3 = new oa3(4, ai5.b(), new lw4(21));
            Lazy lazy = ai5.o;
            oa3.x((lfd) lazy.getValue()).s((lfd) lazy.getValue()).a(new or7(new sh5(ai5, 2), new lw4(22), dj6));
            new iia(ai5.x.s((lfd) lazy.getValue()), new lw4(23), gga, dj6).h(new sh5(ai5, 3)).a(new or7(new sh5(ai5, 4), new lw4(24), dj6));
            due due = (due) this.d.getValue();
        }
    }
}
