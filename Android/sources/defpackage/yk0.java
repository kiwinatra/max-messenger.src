package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: yk0  reason: default package */
public abstract class yk0 implements ld5 {
    public final rpf a;
    public final int b;
    public final int[] c;
    public final ca6[] d;
    public final long[] e;
    public int f;

    public yk0(rpf rpf, int[] iArr) {
        int i = 0;
        y64.j(iArr.length > 0);
        rpf.getClass();
        this.a = rpf;
        int length = iArr.length;
        this.b = length;
        this.d = new ca6[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = rpf.c[iArr[i2]];
        }
        Arrays.sort(this.d, new v00(1));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = rpf.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final rpf a() {
        return this.a;
    }

    public final ca6 d(int i) {
        return this.d[i];
    }

    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yk0 yk0 = (yk0) obj;
        return this.a == yk0.a && Arrays.equals(this.c, yk0.c);
    }

    public final int f(int i) {
        return this.c[i];
    }

    public int g(long j, List list) {
        return list.size();
    }

    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    public final int i() {
        return this.c[b()];
    }

    public final ca6 j() {
        return this.d[b()];
    }

    public void l(float f2) {
    }

    public final int length() {
        return this.c.length;
    }

    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int q(ca6 ca6) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == ca6) {
                return i;
            }
        }
        return -1;
    }

    public final boolean r(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean s = s(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !s) {
            s = i2 != i && !s(i2, elapsedRealtime);
            i2++;
        }
        if (!s) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = t0g.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = LongCompanionObject.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final boolean s(int i, long j) {
        return this.e[i] > j;
    }
}
