package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: fd8  reason: default package */
public final class fd8 {
    public final r62 a;
    public final lfd b;
    public final lfd c;
    public final pbf d;
    public final sv0 e;
    public final gcf f;
    public final m95 g;
    public vc8 h;
    public pr7 i;
    public ao1 j;
    public ao1 k;
    public ao1 l;
    public ArrayList m = new ArrayList();
    public volatile List n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public String q;
    public String r = "";
    public final gm4 s;

    public fd8(r62 r62, km3 km3, tld tld, ns3 ns3, lfd lfd, lfd lfd2, pbf pbf, sv0 sv0, gcf gcf, boolean z, m95 m95, bud bud) {
        this.a = r62;
        this.b = lfd2;
        this.c = lfd;
        this.d = pbf;
        this.e = sv0;
        this.f = gcf;
        this.g = m95;
        this.s = new gm4((Object) new bd8(r62, km3, ns3, tld, z, bud));
    }

    public final void a() {
        if (!jbd.d(this.i)) {
            pr7 pr7 = this.i;
            pr7.getClass();
            tye.a(pr7);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.m.clear();
        this.q = null;
        this.r = "";
    }

    public final void b() {
        if (!jbd.d(this.j)) {
            ao1 ao1 = this.j;
            ao1.getClass();
            qq4.a(ao1);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.o.clear();
        this.n.clear();
    }

    public final void c() {
        if (!jbd.d(this.k)) {
            ao1 ao1 = this.k;
            ao1.getClass();
            qq4.a(ao1);
        }
        this.p.clear();
        this.r = "";
    }

    public final void d() {
        z68.c("fd8", "clear", new Object[0]);
        a();
        b();
        c();
    }

    public final fce e(String str) {
        jw9 jw9 = new jw9((x3b) null, 6);
        jw9.t("query", str);
        jw9.h(5, NewHtcHomeBadger.COUNT);
        jw9.t("type", "ALL");
        wbf wbf = (wbf) this.d;
        wbf.getClass();
        mka mka = new mka(1, new pbb(20, wbf, jw9));
        lfd lfd = this.c;
        return new hce(mka.j(lfd).i(new xc8(this, 2)).i(new n77(28)), new n77(29), (List) null).n(lfd);
    }

    public final void f(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        z68.j("fd8", "searchChats start", new Object[0]);
        b();
        fce j2 = new mka(2, new z52(7, this, str)).n(this.c).j(this.b);
        ao1 ao1 = new ao1(3, new ad8(this, currentTimeMillis, str, 1), new yc8(this, str, 2));
        j2.l(ao1);
        this.j = ao1;
    }

    @oye
    public void onEvent(xy2 xy2) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            a32 a32 = ((ald) it.next()).o;
            if (a32 != null && xy2.b.contains(Long.valueOf(a32.a))) {
                jbd.c(this.l);
                this.l = jbd.a(new b5(23, this), this.c, (x6) null, new zc8(6), (lfd) null);
                return;
            }
        }
    }
}
