package defpackage;

/* renamed from: r90  reason: default package */
public final class r90 implements dha {
    public static final r90 a = new Object();
    public static final mk5 b;
    public static final mk5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [r90, java.lang.Object] */
    static {
        Class<v8c> cls = v8c.class;
        b = new mk5("startMs", tr1.t(tr1.s(cls, new oy(1))));
        c = new mk5("endMs", tr1.t(tr1.s(cls, new oy(2))));
    }

    public final void a(Object obj, Object obj2) {
        wjf wjf = (wjf) obj;
        eha eha = (eha) obj2;
        eha.e(b, wjf.a);
        eha.e(c, wjf.b);
    }
}
