package defpackage;

/* renamed from: l90  reason: default package */
public final class l90 implements dha {
    public static final l90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [l90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("logSource", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("logEventDropped", tr1.t(tr1.s(cls, new oy(2))));
    }

    public final void a(Object obj, Object obj2) {
        z78 z78 = (z78) obj;
        eha eha = (eha) obj2;
        eha.a(b, z78.a);
        eha.a(c, z78.b);
    }
}
