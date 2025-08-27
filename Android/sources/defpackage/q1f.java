package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: q1f  reason: default package */
public final /* synthetic */ class q1f implements qk3, wze {
    public final /* synthetic */ r1f a;

    public /* synthetic */ q1f(r1f r1f) {
        this.a = r1f;
    }

    public void accept(Object obj) {
        d42 d42 = (d42) obj;
        r1f r1f = this.a;
        r1f.getClass();
        nq0 nq0 = new nq0(d42.c, d42.o);
        long j = r1f.n.a;
        mq0 mq0 = r1f.d;
        mq0.getClass();
        jbd.a.r(new a6(mq0, j, nq0), new fm0(3));
        List list = d42.c;
        HashMap hashMap = d42.o;
        rt6 rt6 = r1f.f;
        rt6.getClass();
        r1f.g(list == null ? Collections.emptyList() : cjf.F(list, new ba(3, rt6, hashMap)));
    }

    public List c() {
        r1f r1f = this.a;
        ArrayList k = r1f.n.k();
        ((ns3) r1f.m.getValue()).b(k);
        return k;
    }
}
