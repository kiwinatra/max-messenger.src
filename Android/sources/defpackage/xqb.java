package defpackage;

/* renamed from: xqb  reason: default package */
public final class xqb extends wqb {
    public final Object c = new Object();

    public xqb(int i) {
        super(i);
    }

    public final boolean b(Object obj) {
        boolean b;
        synchronized (this.c) {
            b = super.b(obj);
        }
        return b;
    }

    public final Object c() {
        Object c2;
        synchronized (this.c) {
            c2 = super.c();
        }
        return c2;
    }
}
