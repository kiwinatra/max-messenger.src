package defpackage;

import android.net.Uri;

/* renamed from: cpc  reason: default package */
public final class cpc {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public cpc(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final cpc a(cpc cpc, String str) {
        long j;
        cpc cpc2 = cpc;
        String str2 = str;
        String j0 = tf6.j0(str2, this.c);
        if (cpc2 == null || !j0.equals(tf6.j0(str2, cpc2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = cpc2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == cpc2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new cpc(j5, j0, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = cpc2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new cpc(j6, j0, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return tf6.k0(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cpc.class != obj.getClass()) {
            return false;
        }
        cpc cpc = (cpc) obj;
        return this.a == cpc.a && this.b == cpc.b && this.c.equals(cpc.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(g63.f(81, str));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return wj6.m(sb, this.b, ")");
    }
}
