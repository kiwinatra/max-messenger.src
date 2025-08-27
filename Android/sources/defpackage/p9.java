package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: p9  reason: default package */
public final class p9 implements jv0 {
    public static final p9 w = new p9(new n9[0], 0, -9223372036854775807L, 0);
    public static final n9 x;
    public static final rx0 y = new rx0(15);
    public final int a;
    public final long b;
    public final long c;
    public final int o;
    public final n9[] v;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        x = new n9(0, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0, false);
    }

    public p9(n9[] n9VarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = n9VarArr.length + i;
        this.v = n9VarArr;
        this.o = i;
    }

    public final n9 a(int i) {
        int i2 = this.o;
        return i < i2 ? x : this.v[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p9.class != obj.getClass()) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return t0g.a((Object) null, (Object) null) && this.a == p9Var.a && this.b == p9Var.b && this.c == p9Var.c && this.o == p9Var.o && Arrays.equals(this.v, p9Var.v);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.o) * 31) + Arrays.hashCode(this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            n9[] n9VarArr = this.v;
            if (i < n9VarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(n9VarArr[i].a);
                sb.append(", ads=[");
                for (int i2 = 0; i2 < n9VarArr[i].o.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = n9VarArr[i].o[i2];
                    if (i3 == 0) {
                        sb.append('_');
                    } else if (i3 == 1) {
                        sb.append('R');
                    } else if (i3 == 2) {
                        sb.append('S');
                    } else if (i3 == 3) {
                        sb.append('P');
                    } else if (i3 != 4) {
                        sb.append('?');
                    } else {
                        sb.append('!');
                    }
                    sb.append(", durationUs=");
                    sb.append(n9VarArr[i].v[i2]);
                    sb.append(')');
                    if (i2 < n9VarArr[i].o.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < n9VarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
