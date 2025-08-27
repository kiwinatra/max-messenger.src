package defpackage;

/* renamed from: zd  reason: default package */
public final class zd {
    public static final zd b = new zd();
    public static final int c;
    public static final int d;
    public final ep4 a = new ep4(3);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }
}
