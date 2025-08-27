package defpackage;

/* renamed from: q90  reason: default package */
public final class q90 implements dha {
    public static final q90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [q90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("currentCacheSizeBytes", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("maxCacheSizeBytes", tr1.t(tr1.s(cls, new oy(2))));
    }

    public final void a(Object obj, Object obj2) {
        zwe zwe = (zwe) obj;
        eha eha = (eha) obj2;
        eha.e(b, zwe.a);
        eha.e(c, zwe.b);
    }
}
