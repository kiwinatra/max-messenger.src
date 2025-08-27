package defpackage;

import java.io.Serializable;

/* renamed from: ck3  reason: default package */
public final class ck3 implements Serializable {
    public final long a;
    public final String b;
    public final String c;
    public final String o;
    public final String v;
    public final boolean w;

    public ck3(long j, String str, String str2, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = str4;
        this.w = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ck3.class != obj.getClass()) {
            return false;
        }
        ck3 ck3 = (ck3) obj;
        if (this.a == ck3.a && cvg.c(this.b, ck3.b) && cvg.c(this.c, ck3.c) && cvg.c(this.o, ck3.o) && cvg.c(this.v, ck3.v)) {
            return this.w == ck3.w;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.v;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return ((hashCode3 + i2) * 31) + (this.w ? 1 : 0);
    }
}
