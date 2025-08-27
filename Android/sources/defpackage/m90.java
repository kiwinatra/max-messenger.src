package defpackage;

import org.apache.commons.logging.LogFactory;

/* renamed from: m90  reason: default package */
public final class m90 implements dha {
    public static final m90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;
    public static final mk5 d;
    public static final mk5 e;
    public static final mk5 f;
    public static final mk5 g;
    public static final mk5 h;
    public static final mk5 i;
    public static final mk5 j;
    public static final mk5 k;
    public static final mk5 l;
    public static final mk5 m;
    public static final mk5 n;
    public static final mk5 o;
    public static final mk5 p;

    /* JADX WARNING: type inference failed for: r0v0, types: [m90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("projectNumber", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("messageId", tr1.t(tr1.s(cls, new oy(2))));
        d = new mk5("instanceId", tr1.t(tr1.s(cls, new oy(3))));
        e = new mk5("messageType", tr1.t(tr1.s(cls, new oy(4))));
        f = new mk5("sdkPlatform", tr1.t(tr1.s(cls, new oy(5))));
        g = new mk5("packageName", tr1.t(tr1.s(cls, new oy(6))));
        h = new mk5("collapseKey", tr1.t(tr1.s(cls, new oy(7))));
        i = new mk5(LogFactory.PRIORITY_KEY, tr1.t(tr1.s(cls, new oy(8))));
        j = new mk5("ttl", tr1.t(tr1.s(cls, new oy(9))));
        k = new mk5("topic", tr1.t(tr1.s(cls, new oy(10))));
        l = new mk5("bulkId", tr1.t(tr1.s(cls, new oy(11))));
        m = new mk5("event", tr1.t(tr1.s(cls, new oy(12))));
        n = new mk5("analyticsLabel", tr1.t(tr1.s(cls, new oy(13))));
        o = new mk5("campaignId", tr1.t(tr1.s(cls, new oy(14))));
        p = new mk5("composerLabel", tr1.t(tr1.s(cls, new oy(15))));
    }

    public final void a(Object obj, Object obj2) {
        lp9 lp9 = (lp9) obj;
        eha eha = (eha) obj2;
        eha.e(b, lp9.a);
        eha.a(c, lp9.b);
        eha.a(d, lp9.c);
        eha.a(e, lp9.d);
        eha.a(f, lp9.e);
        eha.a(g, lp9.f);
        eha.a(h, lp9.g);
        eha.d(i, 0);
        eha.d(j, lp9.h);
        eha.a(k, lp9.i);
        eha.e(l, 0);
        eha.a(m, lp9.j);
        eha.a(n, lp9.k);
        eha.e(o, 0);
        eha.a(p, lp9.l);
    }
}
