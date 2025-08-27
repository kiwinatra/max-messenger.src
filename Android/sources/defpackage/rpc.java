package defpackage;

import android.os.Bundle;

/* renamed from: rpc  reason: default package */
public abstract class rpc {
    public static final String a = Integer.toString(0, 36);

    static {
        int i = v0g.a;
    }

    public static rpc a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            String str2 = xx6.d;
            if (bundle.getInt(str, -1) != 0) {
                z2 = false;
            }
            n79.g(z2);
            return bundle.getBoolean(xx6.d, false) ? new xx6(bundle.getBoolean(xx6.e, false)) : new xx6();
        } else if (i == 1) {
            String str3 = sbb.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            n79.g(z);
            float f = bundle.getFloat(sbb.c, -1.0f);
            return f == -1.0f ? new sbb() : new sbb(f);
        } else if (i == 2) {
            String str4 = fje.d;
            if (bundle.getInt(str, -1) == 2) {
                z = true;
            }
            n79.g(z);
            int i2 = bundle.getInt(fje.d, 5);
            float f2 = bundle.getFloat(fje.e, -1.0f);
            return f2 == -1.0f ? new fje(i2) : new fje(i2, f2);
        } else if (i == 3) {
            String str5 = zif.d;
            if (bundle.getInt(str, -1) != 3) {
                z2 = false;
            }
            n79.g(z2);
            return bundle.getBoolean(zif.d, false) ? new zif(bundle.getBoolean(zif.e, false)) : new zif();
        } else {
            throw new IllegalArgumentException(wj6.h(i, "Unknown RatingType: "));
        }
    }

    public abstract boolean b();

    public abstract Bundle c();
}
