package defpackage;

import java.util.List;

/* renamed from: tr7  reason: default package */
public final class tr7 {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;
    public final int i;
    public final List j;
    public final String k;

    public tr7(sr7 sr7) {
        this.a = sr7.a;
        this.b = sr7.b;
        this.c = sr7.c;
        this.d = sr7.d;
        this.e = sr7.e;
        this.f = sr7.f;
        this.g = sr7.g;
        this.h = sr7.h;
        this.i = sr7.i;
        this.j = sr7.j;
        this.k = sr7.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tr7.class != obj.getClass()) {
            return false;
        }
        tr7 tr7 = (tr7) obj;
        if (this.a != tr7.a || this.d != tr7.d || this.e != tr7.e || this.g != tr7.g || this.i != tr7.i) {
            return false;
        }
        String str = tr7.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = tr7.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = tr7.f;
        String str6 = this.f;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = tr7.h;
        String str8 = this.h;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = tr7.j;
        List list2 = this.j;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        String str9 = tr7.k;
        String str10 = this.k;
        return str10 != null ? str10.equals(str9) : str9 == null;
    }

    public final int hashCode() {
        long j2 = this.a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        int i3 = 0;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j3 = this.e;
        int i4 = (((((hashCode + hashCode2) * 31) + this.d) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str3 = this.f;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j4 = this.g;
        int i5 = (((i4 + hashCode3) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str4 = this.h;
        int hashCode4 = (((i5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.k;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return hashCode5 + i3;
    }
}
