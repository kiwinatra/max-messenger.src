package defpackage;

import android.os.Bundle;

/* renamed from: ds8  reason: default package */
public final class ds8 {
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public static final String h = Integer.toString(3, 36);
    public final Bundle a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    static {
        int i = v0g.a;
    }

    public ds8(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = new Bundle(bundle);
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static ds8 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(e);
        boolean z = bundle.getBoolean(f, false);
        boolean z2 = bundle.getBoolean(g, false);
        boolean z3 = bundle.getBoolean(h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new ds8(bundle2, z, z2, z3);
    }
}
