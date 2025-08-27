package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: vqe  reason: default package */
public final class vqe implements s98 {
    public final ere a;
    public final nre b;
    public final rl c;
    public final lfd o;
    public final lfd v;
    public final gcf w;

    public vqe(ere ere, nre nre, rl rlVar, lfd lfd, lfd lfd2, gcf gcf) {
        this.a = ere;
        this.b = nre;
        this.c = rlVar;
        this.o = lfd;
        this.v = lfd2;
        this.w = gcf;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, zpe] */
    public static fqe g(cqe cqe) {
        long j = cqe.a;
        ? obj = new Object();
        obj.a = j;
        obj.b = cqe.b;
        obj.c = cqe.c;
        obj.d = cqe.d;
        obj.e = cqe.e;
        obj.f = cqe.f;
        obj.g = cqe.g;
        obj.h = cqe.h;
        obj.i = cqe.i;
        return new fqe(obj);
    }

    public final void a() {
        z68.c("vqe", "clear: ", new Object[0]);
        ryg.k0(new na3(4, this.a.a.n().i(new dre(2)), new mqd(28)).m(), m58.f, new mqd(27), new ue4(16));
    }

    public final pka b(long j) {
        qh8 qh8 = new qh8(new ti8[]{new ai8(this.a.a(new long[]{j}), new mqd(29), 0), new wh8(2, d(Collections.singletonList(Long.valueOf(j))), new mqd(24))}, 0);
        sqe sqe = new sqe(this, 2);
        iq.h0(2, "prefetch");
        return new gia(new gb3(6, new dw5(qh8, sqe)), 0).x(this.v);
    }

    public final wbe c(List list) {
        return new oa3(4, new wbe(new hb3(1, this.a.a(cjf.i(list)), new mka(2, new oe(1))), new rqe(this, list, 1), 0), new q0a(0)).h(new sqe(this, 2)).C(new fcf(list, new mqd(26)));
    }

    public final fce d(List list) {
        z68.c("vqe", "getStickersSetsFromNetwork: %s", list);
        yt ytVar = new yt(cjf.i(list), 3);
        lfd lfd = this.o;
        tbe tbe = new tbe(new yia(new oa3(4, ((jna) this.c).U(ytVar, lfd).i(new ch2(12, du.class)).i(new mqd(25)), new q0a(0)), new sqe(this, 0), 3).B(), new sqe(this, 1), 3);
        gcf gcf = this.w;
        gcf.getClass();
        return tbe.k(new ecf(gcf, 2, 0)).n(lfd);
    }
}
