package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: qwd  reason: default package */
public final class qwd {
    public static final uob k;
    public static final qwd l;
    public static final String m = Integer.toString(0, 36);
    public static final String n = Integer.toString(1, 36);
    public static final String o = Integer.toString(2, 36);
    public static final String p = Integer.toString(3, 36);
    public static final String q = Integer.toString(4, 36);
    public static final String r = Integer.toString(5, 36);
    public static final String s = Integer.toString(6, 36);
    public static final String t = Integer.toString(7, 36);
    public static final String u = Integer.toString(8, 36);
    public static final String v = Integer.toString(9, 36);
    public final uob a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        uob uob = r0;
        uob uob2 = new uob((Object) null, 0, (ir8) null, (Object) null, 0, 0, 0, -1, -1);
        k = uob2;
        l = new qwd(uob, false, -9223372036854775807L, -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0);
        int i2 = v0g.a;
    }

    public qwd(uob uob, boolean z, long j2, long j3, long j4, int i2, long j5, long j6, long j7, long j8) {
        uob uob2 = uob;
        boolean z2 = z;
        n79.g(z2 == (uob2.h != -1));
        this.a = uob2;
        this.b = z2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i2;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
    }

    public static qwd b(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2.getBundle(m);
        return new qwd(bundle3 == null ? k : uob.c(bundle3), bundle2.getBoolean(n, false), bundle2.getLong(o, -9223372036854775807L), bundle2.getLong(p, -9223372036854775807L), bundle2.getLong(q, 0), bundle2.getInt(r, 0), bundle2.getLong(s, 0), bundle2.getLong(t, -9223372036854775807L), bundle2.getLong(u, -9223372036854775807L), bundle2.getLong(v, 0));
    }

    public final qwd a(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        if (z3 && z4) {
            return this;
        }
        uob b2 = this.a.b(z3, z4);
        int i2 = 0;
        boolean z5 = z3 && this.b;
        long j2 = z3 ? this.d : -9223372036854775807L;
        long j3 = z3 ? this.e : 0;
        if (z3) {
            i2 = this.f;
        }
        return new qwd(b2, z5, this.c, j2, j3, i2, z3 ? this.g : 0, z3 ? this.h : -9223372036854775807L, z3 ? this.i : -9223372036854775807L, z3 ? this.j : 0);
    }

    public final Bundle c(int i2) {
        Bundle bundle = new Bundle();
        uob uob = this.a;
        if (i2 < 3 || !k.a(uob)) {
            bundle.putBundle(m, uob.d(i2));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(o, j2);
        }
        long j3 = this.d;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(p, j3);
        }
        long j4 = this.e;
        if (i2 < 3 || j4 != 0) {
            bundle.putLong(q, j4);
        }
        int i3 = this.f;
        if (i3 != 0) {
            bundle.putInt(r, i3);
        }
        long j5 = this.g;
        if (j5 != 0) {
            bundle.putLong(s, j5);
        }
        long j6 = this.h;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(t, j6);
        }
        long j7 = this.i;
        if (j7 != -9223372036854775807L) {
            bundle.putLong(u, j7);
        }
        long j8 = this.j;
        if (i2 < 3 || j8 != 0) {
            bundle.putLong(v, j8);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qwd.class != obj.getClass()) {
            return false;
        }
        qwd qwd = (qwd) obj;
        return this.c == qwd.c && this.a.equals(qwd.a) && this.b == qwd.b && this.d == qwd.d && this.e == qwd.e && this.f == qwd.f && this.g == qwd.g && this.h == qwd.h && this.i == qwd.i && this.j == qwd.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        uob uob = this.a;
        sb.append(uob.b);
        sb.append(", periodIndex=");
        sb.append(uob.e);
        sb.append(", positionMs=");
        sb.append(uob.f);
        sb.append(", contentPositionMs=");
        sb.append(uob.g);
        sb.append(", adGroupIndex=");
        sb.append(uob.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(uob.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return wj6.m(sb, this.j, "}");
    }
}
