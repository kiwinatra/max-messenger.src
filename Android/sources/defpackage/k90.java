package defpackage;

/* renamed from: k90  reason: default package */
public final class k90 implements dha {
    public static final k90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [k90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("eventsDroppedCount", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("reason", tr1.t(tr1.s(cls, new oy(3))));
    }

    public final void a(Object obj, Object obj2) {
        u78 u78 = (u78) obj;
        eha eha = (eha) obj2;
        eha.e(b, u78.a);
        eha.a(c, u78.b);
    }
}
