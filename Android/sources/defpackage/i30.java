package defpackage;

import android.os.Bundle;

/* renamed from: i30  reason: default package */
public final class i30 {
    public static final i30 g = new i30(0, 0, 1, 1, 0);
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public vs6 f;

    static {
        int i2 = v0g.a;
    }

    public i30(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static i30 a(Bundle bundle) {
        String str = h;
        int i2 = 0;
        int i3 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = i;
        int i4 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = j;
        int i5 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = k;
        int i6 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = l;
        if (bundle.containsKey(str5)) {
            i2 = bundle.getInt(str5);
        }
        return new i30(i3, i4, i5, i6, i2);
    }

    public final vs6 b() {
        if (this.f == null) {
            this.f = new vs6(this);
        }
        return this.f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i30.class != obj.getClass()) {
            return false;
        }
        i30 i30 = (i30) obj;
        return this.a == i30.a && this.b == i30.b && this.c == i30.c && this.d == i30.d && this.e == i30.e;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
