package defpackage;

/* renamed from: lif  reason: default package */
public abstract class lif {
    public static final ThreadLocal a = new ThreadLocal();

    public static a95 a() {
        ThreadLocal threadLocal = a;
        a95 a95 = (a95) threadLocal.get();
        if (a95 != null) {
            return a95;
        }
        sp0 sp0 = new sp0(Thread.currentThread());
        threadLocal.set(sp0);
        return sp0;
    }
}
