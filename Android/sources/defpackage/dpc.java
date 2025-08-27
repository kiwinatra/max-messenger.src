package defpackage;

import android.net.Uri;

/* renamed from: dpc  reason: default package */
public final class dpc {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public dpc(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final dpc a(dpc dpc, String str) {
        long j;
        dpc dpc2 = dpc;
        String str2 = str;
        String T = hi7.T(str2, this.c);
        if (dpc2 == null || !T.equals(hi7.T(str2, dpc2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = dpc2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == dpc2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new dpc(j5, T, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = dpc2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new dpc(j6, T, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return hi7.V(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dpc.class != obj.getClass()) {
            return false;
        }
        dpc dpc = (dpc) obj;
        return this.a == dpc.a && this.b == dpc.b && this.c.equals(dpc.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return wj6.m(sb, this.b, ")");
    }
}
