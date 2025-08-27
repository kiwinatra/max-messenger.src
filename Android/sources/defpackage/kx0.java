package defpackage;

import java.io.File;

/* renamed from: kx0  reason: default package */
public final class kx0 {
    public final File a;
    public final long b;
    public final long c;
    public final zx0 d;

    public kx0(File file, zx0 zx0) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = zx0;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
