package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: e63  reason: default package */
public final class e63 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public final yvd a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final boolean h;

    static {
        int i2 = v0g.a;
    }

    public e63(yvd yvd, int i2, int i3, int i4, Uri uri, CharSequence charSequence, Bundle bundle, boolean z) {
        this.a = yvd;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.h = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    public static k0d a(List list, zvd zvd, pob pob) {
        ? jb7 = new jb7(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e63 e63 = (e63) list.get(i2);
            if (c(e63, zvd, pob)) {
                jb7.a(e63);
            } else {
                if (e63.h) {
                    Bundle bundle = new Bundle(e63.g);
                    e63 = new e63(e63.a, e63.b, e63.c, e63.d, e63.e, e63.f, bundle, false);
                }
                jb7.a(e63);
            }
        }
        return jb7.j();
    }

    public static e63 b(int i2, Bundle bundle) {
        int i3;
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2.getBundle(i);
        yvd a2 = bundle3 == null ? null : yvd.a(bundle3);
        int i4 = bundle2.getInt(j, -1);
        boolean z = false;
        int i5 = bundle2.getInt(k, 0);
        CharSequence charSequence = bundle2.getCharSequence(l, "");
        Bundle bundle4 = bundle2.getBundle(m);
        boolean z2 = i2 < 3 || bundle2.getBoolean(n, true);
        Uri uri = (Uri) bundle2.getParcelable(o);
        int i6 = bundle2.getInt(p, 0);
        Bundle bundle5 = Bundle.EMPTY;
        if (a2 == null) {
            a2 = null;
        }
        if (i4 != -1) {
            n79.f("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", a2 == null);
            i3 = i4;
        } else {
            i3 = -1;
        }
        Uri uri2 = uri != null ? uri : null;
        if (bundle4 == null) {
            bundle4 = Bundle.EMPTY;
        }
        Bundle bundle6 = new Bundle(bundle4);
        if ((a2 == null) != (i3 == -1)) {
            z = true;
        }
        n79.m("Exactly one of sessionCommand and playerCommand should be set", z);
        return new e63(a2, i3, i6, i5, uri2, charSequence, bundle6, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.a.contains(r0) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(defpackage.e63 r1, defpackage.zvd r2, defpackage.pob r3) {
        /*
            yvd r0 = r1.a
            if (r0 == 0) goto L_0x000f
            r2.getClass()
            dc7 r2 = r2.a
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L_0x001a
        L_0x000f:
            r2 = -1
            int r1 = r1.b
            if (r1 == r2) goto L_0x001c
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e63.c(e63, zvd, pob):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e63)) {
            return false;
        }
        e63 e63 = (e63) obj;
        return cjf.n(this.a, e63.a) && this.b == e63.b && this.c == e63.c && this.d == e63.d && cjf.n(this.e, e63.e) && TextUtils.equals(this.f, e63.f) && this.h == e63.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.h), this.e});
    }
}
