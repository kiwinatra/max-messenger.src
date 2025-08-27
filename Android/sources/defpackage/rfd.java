package defpackage;

/* renamed from: rfd  reason: default package */
public abstract class rfd {
    public static final boolean a;

    static {
        boolean z = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z = "true".equals(property);
            }
        } catch (Throwable th) {
            hd8.Z(th);
        }
        a = z;
    }
}
