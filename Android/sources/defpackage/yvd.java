package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: yvd  reason: default package */
public final class yvd {
    public static final k0d d = tb7.t(40010);
    public static final k0d e;
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        f6e.g(7, objArr);
        e = tb7.n(7, objArr);
        int i = v0g.a;
    }

    public yvd(int i) {
        n79.f("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static yvd a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new yvd(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new yvd(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.yvd) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.yvd
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            yvd r4 = (defpackage.yvd) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0019
            java.lang.String r3 = r3.b
            java.lang.String r4 = r4.b
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0019
            r1 = 1
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.a)});
    }

    public yvd(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
