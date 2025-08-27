package defpackage;

import java.util.Objects;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: ure  reason: default package */
public final class ure implements m23 {
    public final long a;
    public final rl b;
    public final moe c;
    public final jbf d;
    public final gcf e;
    public final dac f;
    public final pha g;
    public volatile long h = -1;
    public ao1 i;

    public ure(long j, rl rlVar, moe moe, jbf jbf, gcf gcf) {
        dac dac = new dac();
        this.f = dac;
        this.g = new pha(new lka(dac, new dre(8), 0).t());
        this.a = j;
        this.b = rlVar;
        this.c = moe;
        this.d = jbf;
        this.e = gcf;
    }

    public final void a() {
        o54.k(this.i);
    }

    public final void b() {
        if (o54.y(this.i)) {
            long j = 0;
            if (this.h != 0) {
                rl rlVar = this.b;
                long j2 = this.a;
                if (this.h != -1) {
                    j = this.h;
                }
                jw9 jw9 = new jw9((x3b) null, 13);
                jw9.p(j2, "stickerId");
                jw9.p(j, "marker");
                jw9.h(50, NewHtcHomeBadger.COUNT);
                wbe i2 = new tbe(((jna) rlVar).U(jw9, ((kbf) this.d).a()).i(new ch2(12, tre.class)), new nqd(13, this), 3).i(new dre(9));
                moe moe = this.c;
                Objects.requireNonNull(moe);
                tbe tbe = new tbe(new wbe(i2, new joe(moe, 6), 0), new dre(10), 1);
                gcf gcf = this.e;
                gcf.getClass();
                dx5 k = tbe.k(new ecf(gcf, 3, 0));
                dac dac = this.f;
                Objects.requireNonNull(dac);
                ol2 ol2 = new ol2(dac, 1);
                dac dac2 = this.f;
                Objects.requireNonNull(dac2);
                ao1 ao1 = new ao1(3, ol2, new ol2(dac2, 2));
                k.l(ao1);
                this.i = ao1;
            }
        }
    }
}
