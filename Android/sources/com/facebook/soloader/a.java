package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class a extends e {
    public rf5[] a;
    public final ZipFile b;
    public final zvf c;
    public final /* synthetic */ cg0 o;
    public final boolean v;
    public final File w;
    public final int x;

    public a(cg0 cg0, cg0 cg02, boolean z) {
        this.o = cg0;
        this.b = new ZipFile(cg0.e);
        this.c = cg02;
        this.v = z;
        this.w = new File(cg0.d.getApplicationInfo().nativeLibraryDir);
        this.x = cg0.g;
    }

    public final rf5[] U() {
        rf5[] rf5Arr = this.a;
        if (rf5Arr != null) {
            return rf5Arr;
        }
        rf5[] o2 = o();
        this.a = o2;
        if (this.v || (this.x & 1) == 0) {
            return o2;
        }
        for (rf5 rf5 : o2) {
            ZipEntry zipEntry = rf5.v;
            zipEntry.getName();
            File file = this.w;
            File file2 = new File(file, (String) rf5.b);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        if (file2.length() != zipEntry.getSize()) {
                            file2.toString();
                        }
                    }
                    return this.a;
                }
                continue;
            } catch (IOException e) {
                e.toString();
            }
        }
        rf5[] rf5Arr2 = new rf5[0];
        this.a = rf5Arr2;
        return rf5Arr2;
    }

    public final void close() {
        this.b.close();
    }

    public final fbf[] m() {
        return U();
    }

    public final void n(File file) {
        mm5 mm5;
        rf5[] U = U();
        byte[] bArr = new byte[32768];
        int length = U.length;
        int i = 0;
        while (i < length) {
            rf5 rf5 = U[i];
            InputStream inputStream = this.b.getInputStream(rf5.v);
            try {
                mm5 = new mm5(2, rf5, inputStream);
                inputStream = null;
                e.a(mm5, bArr, file);
                mm5.close();
                i++;
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
        return;
        throw th;
    }

    public final rf5[] o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        Pattern compile = Pattern.compile(this.o.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> entries = this.b.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            Matcher matcher = compile.matcher(zipEntry.getName());
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && group.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(group);
                    rf5 rf5 = (rf5) hashMap.get(group2);
                    if (rf5 == null || i < rf5.w) {
                        hashMap.put(group2, new rf5(group2, zipEntry, i));
                    }
                }
            }
        }
        String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        this.c.getClass();
        rf5[] rf5Arr = (rf5[]) hashMap.values().toArray(new rf5[hashMap.size()]);
        Arrays.sort(rf5Arr);
        return rf5Arr;
    }
}
