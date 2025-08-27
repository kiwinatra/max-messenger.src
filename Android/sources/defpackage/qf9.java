package defpackage;

import java.util.Objects;

/* renamed from: qf9  reason: default package */
public final class qf9 {
    public final xc9 a;
    public final String b;
    public final long c;
    public final xyf d;
    public final p4g e;
    public final String f;

    public qf9(we8 we8) {
        this.a = (xc9) we8.c;
        this.b = (String) we8.b;
        this.c = we8.a;
        this.d = (xyf) we8.d;
        this.e = (p4g) we8.e;
        this.f = (String) we8.f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, we8] */
    public final we8 a() {
        ? obj = new Object();
        obj.c = this.a;
        obj.b = this.b;
        obj.f = this.f;
        obj.a = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qf9.class != obj.getClass()) {
            return false;
        }
        qf9 qf9 = (qf9) obj;
        if (this.c != qf9.c) {
            return false;
        }
        xc9 xc9 = qf9.a;
        xc9 xc92 = this.a;
        if (xc92 == null ? xc9 != null : !xc92.equals(xc9)) {
            return false;
        }
        String str = qf9.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (this.d != qf9.d || !Objects.equals(this.f, qf9.f)) {
            return false;
        }
        p4g p4g = qf9.e;
        p4g p4g2 = this.e;
        return p4g2 != null ? p4g2.equals(p4g) : p4g == null;
    }

    public final int hashCode() {
        int i = 0;
        xc9 xc9 = this.a;
        int hashCode = (xc9 != null ? xc9.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.c;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        xyf xyf = this.d;
        int hashCode3 = (i2 + (xyf != null ? xyf.hashCode() : 0)) * 31;
        p4g p4g = this.e;
        int hashCode4 = (hashCode3 + (p4g != null ? p4g.hashCode() : 0)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MessageUpload{messageMediaUploadKey=" + this.a + ", path='" + this.b + "', attachLocalId='" + this.f + "', lastModified=" + this.c + ", uploadType=" + this.d + ", videoConvertOptions=" + this.e + '}';
    }
}
