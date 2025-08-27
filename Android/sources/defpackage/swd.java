package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: swd  reason: default package */
public final class swd {
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public static final String h = Integer.toString(3, 36);
    public final int a;
    public final Bundle b;
    public final long c;
    public final iwd d;

    static {
        int i = v0g.a;
    }

    public swd(int i) {
        this(i, Bundle.EMPTY);
    }

    public static swd a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        iwd a2 = bundle3 != null ? iwd.a(bundle3) : i != 0 ? new iwd(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new swd(i, bundle2, j, a2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        iwd iwd = this.d;
        if (iwd != null) {
            bundle.putBundle(h, iwd.b());
        }
        return bundle;
    }

    public swd(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), (iwd) null);
    }

    public swd(int i, Bundle bundle, long j, iwd iwd) {
        n79.g(iwd == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (iwd == null && i < 0) {
            iwd = new iwd(i);
        }
        this.d = iwd;
    }
}
