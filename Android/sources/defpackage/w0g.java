package defpackage;

import java.nio.ByteOrder;

/* renamed from: w0g  reason: default package */
public enum w0g {
    ;
    
    public static final ByteOrder a = null;
    public static final boolean b = false;

    static {
        boolean z;
        a = ByteOrder.nativeOrder();
        String property = System.getProperty("os.arch");
        if (property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le")) {
            z = true;
        }
        b = z;
    }
}
