package defpackage;

import java.io.File;

/* renamed from: l5a  reason: default package */
public enum l5a {
    ;
    
    public static boolean a = false;

    public static void a() {
        File[] listFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new k5a(0));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static int b() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return 2;
        }
        if (property.contains("Mac")) {
            return 3;
        }
        if (property.contains("Windows")) {
            return 1;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return 4;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(property));
    }

    public static String c() {
        String str;
        int b2 = b();
        StringBuilder p = tr1.p("/", l5a.class.getPackage().getName().replace('.', '/'), "/");
        if (b2 == 1) {
            str = "win32";
        } else if (b2 == 2) {
            str = "linux";
        } else if (b2 == 3) {
            str = "darwin";
        } else if (b2 == 4) {
            str = "solaris";
        } else {
            throw null;
        }
        p.append(str);
        p.append("/");
        p.append(System.getProperty("os.arch"));
        p.append("/liblz4-java.");
        p.append(i2a.c(b2));
        return p.toString();
    }
}
