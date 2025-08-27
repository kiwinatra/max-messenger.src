package defpackage;

/* renamed from: aq8  reason: default package */
public abstract class aq8 {
    public static final cgd a;

    static {
        fwf fwf = new fwf("media-gallery-scope");
        cgd cgd = bs0.l;
        if (cgd != null) {
            fwf.c.add(cgd);
            a = fwf.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
