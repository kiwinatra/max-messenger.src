package defpackage;

/* renamed from: fu0  reason: default package */
public abstract class fu0 {
    public static final fj a;
    public static final ThreadLocal b = new ThreadLocal();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? jif.a : null;
    }
}
