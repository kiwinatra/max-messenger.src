package defpackage;

/* renamed from: bk9  reason: default package */
public abstract class bk9 {
    public static final cgd a;

    static {
        fwf fwf = new fwf("messages-list-scope");
        cgd cgd = bs0.l;
        if (cgd != null) {
            fwf.c.add(cgd);
            fwf.e(zj9.class, new xs7(7));
            fwf.e(ak9.class, new fm8(6));
            fwf.e(sq6.class, new fm8(7));
            fwf.e(ap9.class, new fm8(8));
            a = fwf.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
