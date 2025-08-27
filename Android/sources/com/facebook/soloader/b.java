package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class b extends nfe implements oyc {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c;

    public b(Context context) {
        HashSet hashSet = new HashSet();
        String h = h(context.getApplicationInfo().sourceDir);
        if (h != null) {
            hashSet.add(h);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String h2 : context.getApplicationInfo().splitSourceDirs) {
                String h3 = h(h2);
                if (h3 != null) {
                    hashSet.add(h3);
                }
            }
        }
        this.c = hashSet;
    }

    public static String h(String str) {
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        if (str == null || str.isEmpty() || supportedAbis == null || supportedAbis.length == 0) {
            return null;
        }
        StringBuilder m = g63.m(str, "!/lib/");
        m.append(supportedAbis[0]);
        return m.toString();
    }

    public final nfe a(Context context) {
        b bVar = new b(context);
        try {
            bVar.i();
            return bVar;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String b() {
        throw null;
    }

    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        a15 a15;
        if (SoLoader.b != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Set set = (Set) this.a.get(str2);
                if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                    Set<String> g = g(str2, str);
                    if (g == null) {
                        ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                        try {
                            Enumeration<? extends ZipEntry> entries = zipFile.entries();
                            while (entries.hasMoreElements()) {
                                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                                if (zipEntry != null) {
                                    if (zipEntry.getName().endsWith("/" + str)) {
                                        a15 = new a15(zipFile, zipEntry);
                                        for (String str3 : d.a(str, a15)) {
                                            if (!str3.startsWith("/")) {
                                                e(str2, str, str3);
                                            }
                                        }
                                        a15.close();
                                    }
                                }
                            }
                            zipFile.close();
                            g = g(str2, str);
                        } catch (Throwable th) {
                            try {
                                zipFile.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (g != null) {
                        for (String i2 : g) {
                            SoLoader.i(i2, (String) null, i | 1, threadPolicy);
                        }
                    }
                    try {
                        i |= 4;
                        SoLoader.b.G(i, str2 + File.separator + str);
                        return 1;
                    } catch (UnsatisfiedLinkError unused) {
                        continue;
                    }
                }
            }
            return 0;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
        throw th;
    }

    public final void d(int i) {
        i();
    }

    public final void e(String str, String str2, String str3) {
        synchronized (this.b) {
            try {
                String str4 = str + str2;
                if (!this.b.containsKey(str4)) {
                    this.b.put(str4, new HashSet());
                }
                ((Set) this.b.get(str4)).add(str3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, String str2) {
        synchronized (this.a) {
            try {
                if (!this.a.containsKey(str)) {
                    this.a.put(str, new HashSet());
                }
                ((Set) this.a.get(str)).add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set g(String str, String str2) {
        Set set;
        synchronized (this.b) {
            set = (Set) this.b.get(str + str2);
        }
        return set;
    }

    public final void i() {
        int indexOf;
        int i;
        Iterator it = this.c.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf(33)) >= 0 && (i = indexOf + 2) < str2.length()) {
                str = str2.substring(i);
            }
            if (!TextUtils.isEmpty(str)) {
                ZipFile zipFile = new ZipFile(str2.substring(0, str2.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry != null && zipEntry.getMethod() == 0 && zipEntry.getName().startsWith(str) && zipEntry.getName().endsWith(".so")) {
                            f(str2, zipEntry.getName().substring(str.length() + 1));
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        return;
        throw th;
    }

    public final String toString() {
        return "DirectApkSoSource[root = " + this.c.toString() + ']';
    }
}
