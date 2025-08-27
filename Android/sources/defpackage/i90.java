package defpackage;

/* renamed from: i90  reason: default package */
public final class i90 implements dha {
    public static final i90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;
    public static final mk5 d;
    public static final mk5 e;

    /* JADX WARNING: type inference failed for: r0v0, types: [i90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("window", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("logSourceMetrics", tr1.t(tr1.s(cls, new oy(2))));
        d = new mk5("globalMetrics", tr1.t(tr1.s(cls, new oy(3))));
        e = new mk5("appNamespace", tr1.t(tr1.s(cls, new oy(4))));
    }

    public final void a(Object obj, Object obj2) {
        w23 w23 = (w23) obj;
        eha eha = (eha) obj2;
        eha.a(b, w23.a);
        eha.a(c, w23.b);
        eha.a(d, w23.c);
        eha.a(e, w23.d);
    }
}
