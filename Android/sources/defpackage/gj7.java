package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: gj7  reason: default package */
public final class gj7 extends pl0 {
    public final nh3 a;
    public final gcf b;
    public final jbf c;
    public final sv0 d;
    public final rl e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public volatile long j;
    public final wx k = new wx();
    public final AtomicBoolean l = new AtomicBoolean(false);

    public gj7(nh3 nh3, gcf gcf, jbf jbf, sv0 sv0, rl rlVar, long j2, long j3, long j4, String str) {
        this.a = nh3;
        this.b = gcf;
        this.c = jbf;
        this.d = sv0;
        this.e = rlVar;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = str;
    }

    public final lbe a() {
        wx wxVar = this.k;
        Object obj = wxVar.a.get();
        Object obj2 = wx.v;
        if (obj != obj2 || wxVar.c == null) {
            wx wxVar2 = this.k;
            e4 e4Var = new e4(22, (Object) this);
            wxVar2.getClass();
            iia iia = new iia(wxVar2, new u6h(18, e4Var), new grg(21, e4Var), new hj6(e4Var));
            gcf gcf = this.b;
            gcf.getClass();
            mka mka = new mka(0, new yia(iia, new ecf(gcf, 1, 2), 6));
            if (this.l.get()) {
                return mka;
            }
            if (!this.a.f()) {
                return lbe.g(new FetcherException(2, "No internet connection"));
            }
            this.d.d(this);
            this.l.compareAndSet(false, true);
            this.j = ((jna) this.e).W(false, this.f, this.g, this.h, 0, "", false, this.i);
            return mka;
        }
        wx wxVar3 = this.k;
        return lbe.h(wxVar3.a.get() == obj2 ? wxVar3.c : null);
    }

    @oye
    public final void onEvent(l7g l7g) {
        if (l7g.a == this.j) {
            wx wxVar = this.k;
            if (wxVar.a.get() != wx.v || wxVar.b != null) {
                ((kbf) this.c).a().c(new uo5(15, (Object) l7g, (Object) this));
            }
        }
    }

    @oye
    public final void onEvent(hj0 hj0) {
        if (hj0.a == this.j) {
            wx wxVar = this.k;
            if (wxVar.a.get() != wx.v || wxVar.b != null) {
                ((kbf) this.c).a().c(new uo5(14, (Object) hj0, (Object) this));
            }
        }
    }
}
