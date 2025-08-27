package defpackage;

import java.util.Objects;

/* renamed from: kxf  reason: default package */
public final class kxf {
    public final String a;
    public final long b;
    public final xyf c;
    public final String d;

    public kxf(u05 u05) {
        this.a = (String) u05.b;
        this.b = u05.a;
        this.c = (xyf) u05.c;
        this.d = (String) u05.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kxf.class != obj.getClass()) {
            return false;
        }
        kxf kxf = (kxf) obj;
        if (this.b != kxf.b) {
            return false;
        }
        String str = kxf.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!Objects.equals(this.d, kxf.d)) {
            return false;
        }
        return this.c == kxf.c;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        xyf xyf = this.c;
        int hashCode2 = (i2 + (xyf != null ? xyf.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "UploadData{path='" + this.a + "'attachLocalId='" + this.d + "', lastModified=" + this.b + ", uploadType=" + this.c + '}';
    }
}
