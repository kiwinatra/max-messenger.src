package defpackage;

import java.io.File;

/* renamed from: xa0  reason: default package */
public final class xa0 {
    public final long a;
    public final long b;
    public final File c;

    public xa0(long j, long j2, File file) {
        this.a = j;
        this.b = j2;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0 = (xa0) obj;
        return this.a == xa0.a && this.b == xa0.b && this.c.equals(xa0.c);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * -721379959);
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=null, file=" + this.c + "}";
    }
}
