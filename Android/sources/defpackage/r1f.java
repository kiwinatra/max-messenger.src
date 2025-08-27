package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: r1f  reason: default package */
public final class r1f implements o1f {
    public final rl a;
    public final sv0 b;
    public final r62 c;
    public final mq0 d;
    public final p3a e;
    public final rt6 f;
    public final lfd g;
    public final tld h;
    public final zqd i;
    public final jtb j;
    public final ptb k;
    public final hxd l;
    public final Lazy m;
    public a32 n;
    public w1f o;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public ao1 r;
    public ao1 s;
    public final Lazy t;

    public r1f(rl rlVar, sv0 sv0, r62 r62, mq0 mq0, a32 a32, lfd lfd, tld tld, yva yva, jtb jtb, ptb ptb, hxd hxd, Lazy lazy, Lazy lazy2, w1f w1f) {
        this.b = sv0;
        this.c = r62;
        this.d = mq0;
        l72 l72 = a32.b.b;
        this.f = new rt6(6, (Object) l72);
        this.n = a32;
        this.a = rlVar;
        this.e = new p3a((Object) l72);
        this.g = lfd;
        this.h = tld;
        this.j = jtb;
        this.k = ptb;
        this.l = hxd;
        this.i = new zqd(26, tld, yva);
        this.t = lazy;
        this.m = lazy2;
        this.o = w1f;
        sv0.d(this);
        e();
    }

    public final void a() {
        this.o = null;
    }

    public final mka b(int i2, String str) {
        return new mka(1, new oj0((Object) this, (Object) str, i2, 11));
    }

    public final List c(LinkedHashSet linkedHashSet) {
        yze d2 = d();
        this.e.getClass();
        return d2.l(linkedHashSet);
    }

    public final void clear() {
        this.p.clear();
        this.q.clear();
        try {
            this.b.f(this);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [yze, gy8, java.lang.Object] */
    public final yze d() {
        if (((jxd) this.l).h != 3 || this.n.b.e.size() >= this.n.b.c()) {
            return new kq9(this.h, this.i, this.j, this.k, this.t, new q1f(this));
        }
        long j2 = this.n.b.a;
        rl rlVar = this.a;
        zqd zqd = this.i;
        lfd lfd = this.g;
        Lazy lazy = this.t;
        ? obj = new Object();
        obj.o = j2;
        obj.a = rlVar;
        obj.b = zqd;
        obj.c = lfd;
        obj.v = lazy;
        return obj;
    }

    public final void e() {
        jbd.c(this.s);
        if (f()) {
            long j2 = this.n.b.a;
            yt ytVar = new yt((x3b) null, 12);
            ytVar.p(j2, ApiProtocol.PARAM_CHAT_ID);
            fce U = ((jna) this.a).U(ytVar, xfd.b());
            ao1 ao1 = new ao1(3, new q1f(this), new dre(14));
            U.l(ao1);
            this.s = ao1;
        }
    }

    public final boolean f() {
        a32 a32 = this.n;
        return a32.b.a != 0 && a32.f0() && this.n.E() && this.n.o0();
    }

    public final synchronized void g(List list) {
        this.q.clear();
        this.q.addAll(list);
        w1f w1f = this.o;
        if (w1f != null) {
            int i2 = SuggestsViewModel.I;
            SuggestsViewModel suggestsViewModel = w1f.a;
            ev0.v(b0h.C(suggestsViewModel), ((osa) suggestsViewModel.d).c().t0(), (f14) null, new e2f(suggestsViewModel, (Continuation) null), 2);
        }
    }

    @oye
    public void onEvent(xy2 xy2) {
        a32 a32 = this.n;
        if (a32 != null && xy2.b.contains(Long.valueOf(a32.a))) {
            jbd.c(this.r);
            this.r = jbd.a(new ivc(5, this), this.g, (x6) null, new dre(13), (lfd) null);
        }
    }
}
