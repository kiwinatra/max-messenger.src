package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: fy0  reason: default package */
public final class fy0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public od4 e;

    public fy0(int i, String str, od4 od4) {
        this.a = i;
        this.b = str;
        this.e = od4;
    }

    public final long a(long j, long j2) {
        n79.g(j >= 0);
        n79.g(j2 >= 0);
        wae b2 = b(j, j2);
        boolean z = true ^ b2.o;
        long j3 = LongCompanionObject.MAX_VALUE;
        long j4 = b2.c;
        if (z) {
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = b2.b + j4;
        if (j6 < j3) {
            for (wae wae : this.c.tailSet(b2, false)) {
                long j7 = wae.b;
                if (j7 <= j6) {
                    j6 = Math.max(j6, j7 + wae.c);
                    if (j6 >= j3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final wae b(long j, long j2) {
        yx0 yx0 = new yx0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        wae wae = (wae) treeSet.floor(yx0);
        if (wae != null && wae.b + wae.c > j) {
            return wae;
        }
        wae wae2 = (wae) treeSet.ceiling(yx0);
        if (wae2 != null) {
            long j3 = wae2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new yx0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            dy0 dy0 = (dy0) arrayList.get(i);
            long j3 = dy0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = dy0.a;
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
        if (obj == null || fy0.class != obj.getClass()) {
            return false;
        }
        fy0 fy0 = (fy0) obj;
        return this.a == fy0.a && this.b.equals(fy0.b) && this.c.equals(fy0.c) && this.e.equals(fy0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g63.d(this.a * 31, 31, this.b);
    }
}
