package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: ey0  reason: default package */
public final class ey0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public nd4 e;

    public ey0(int i, String str, nd4 nd4) {
        this.a = i;
        this.b = str;
        this.e = nd4;
    }

    public final vae a(long j, long j2) {
        xx0 xx0 = new xx0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        vae vae = (vae) treeSet.floor(xx0);
        if (vae != null && vae.b + vae.c > j) {
            return vae;
        }
        vae vae2 = (vae) treeSet.ceiling(xx0);
        if (vae2 != null) {
            long j3 = vae2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new xx0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean b(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            cy0 cy0 = (cy0) arrayList.get(i);
            long j3 = cy0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = cy0.a;
            if (i2 == 0) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ey0.class != obj.getClass()) {
            return false;
        }
        ey0 ey0 = (ey0) obj;
        return this.a == ey0.a && this.b.equals(ey0.b) && this.c.equals(ey0.c) && this.e.equals(ey0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g63.d(this.a * 31, 31, this.b);
    }
}
