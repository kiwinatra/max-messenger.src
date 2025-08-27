package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jb0  reason: default package */
public final class jb0 extends y78 {
    public final long a;
    public final long b;
    public final v23 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final lac g;

    public jb0(long j, long j2, ka0 ka0, Integer num, String str, ArrayList arrayList) {
        lac lac = lac.a;
        this.a = j;
        this.b = j2;
        this.c = ka0;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = lac;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y78)) {
            return false;
        }
        y78 y78 = (y78) obj;
        if (this.a == ((jb0) y78).a) {
            jb0 jb0 = (jb0) y78;
            if (this.b == jb0.b) {
                v23 v23 = jb0.c;
                v23 v232 = this.c;
                if (v232 != null ? v232.equals(v23) : v23 == null) {
                    Integer num = jb0.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = jb0.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = jb0.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                lac lac = jb0.g;
                                lac lac2 = this.g;
                                if (lac2 == null) {
                                    if (lac == null) {
                                        return true;
                                    }
                                } else if (lac2.equals(lac)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i2 = 0;
        v23 v23 = this.c;
        int hashCode = (i ^ (v23 == null ? 0 : v23.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        lac lac = this.g;
        if (lac != null) {
            i2 = lac.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
