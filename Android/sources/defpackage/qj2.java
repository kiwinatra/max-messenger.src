package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: qj2  reason: default package */
public final class qj2 implements m23 {
    public final ptb a;
    public final tj2 b;
    public final ij2 c;
    public final kc3 d = new Object();
    public oj2 e;
    public String f;
    public boolean g = false;
    public boolean h = false;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, kc3] */
    public qj2(ptb ptb, tj2 tj2, ij2 ij2) {
        this.a = ptb;
        this.b = tj2;
        this.c = ij2;
    }

    public static String c(ij2 ij2) {
        Locale locale = Locale.ENGLISH;
        String name = qj2.class.getName();
        return name + "-" + ij2;
    }

    public final void a() {
        this.e = null;
        jbd.c(this.d);
        tj2 tj2 = this.b;
        tj2.f.clear();
        tj2.h = 0;
        jbd.c(tj2.g);
        tj2.g = null;
    }

    public final void b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vk3 vk3 = (vk3) it.next();
            vk3.getClass();
            arrayList2.add(new bj2(qe8.t(vk3), qe8.m(this.a.b(vk3.r())), 0));
        }
        this.b.a(arrayList2);
        oj2 oj2 = this.e;
        if (oj2 != null) {
            oj2.s();
        } else {
            this.g = true;
        }
    }

    public final void d() {
        nh8 nh8;
        String str = this.f;
        tj2 tj2 = this.b;
        a32 G = tj2.b.G(tj2.a);
        if (G == null) {
            nh8 = new sh8(2, new RuntimeException("Chat cannot be null"));
        } else if (!jbd.d(tj2.g)) {
            nh8 = uh8.a;
        } else {
            wbe wbe = new wbe(((jna) tj2.c).U(new yt(G.b.a, this.c.a, tj2.h, 100, str), tj2.d), new sj2(tj2, 2), 0);
            gcf gcf = tj2.e;
            gcf.getClass();
            tbe tbe = new tbe(new tbe(wbe.k(new ecf(gcf, 1, 0)), new sj2(tj2, 0), 3), new sj2(tj2, 1), 2);
            nh8 = tbe instanceof jj6 ? ((jj6) tbe).e() : new sh8(3, tbe);
        }
        oh8 oh8 = new oh8(new ms1(13, this), m58.g, m58.e);
        nh8.a(oh8);
        this.d.a(oh8);
    }

    public final void e() {
        this.h = false;
        tj2 tj2 = this.b;
        tj2.f.clear();
        tj2.h = 0;
        jbd.c(tj2.g);
        tj2.g = null;
        d();
    }

    public final void f(long j) {
        Iterator it = this.b.f.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((bj2) it.next()).a.a == j) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        oj2 oj2 = this.e;
        if (oj2 != null) {
            oj2.s();
        } else {
            this.g = true;
        }
    }

    public final void g(List list) {
        for (bj2 bj2 : cjf.q(this.b.f, new x52(5, list))) {
            f(bj2.a.a);
        }
    }

    public final void h(oj2 oj2) {
        this.e = oj2;
        if (this.g && oj2 != null) {
            oj2.s();
            this.g = false;
        }
    }
}
