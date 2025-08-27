package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: zif  reason: default package */
public final class zif extends rpc {
    public static final String d = Integer.toString(1, 36);
    public static final String e = Integer.toString(2, 36);
    public final boolean b;
    public final boolean c;

    static {
        int i = v0g.a;
    }

    public zif() {
        this.b = false;
        this.c = false;
    }

    public final boolean b() {
        return this.b;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(rpc.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.zif) r4;
        r0 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.zif
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            zif r4 = (defpackage.zif) r4
            boolean r0 = r4.c
            boolean r2 = r3.c
            if (r2 != r0) goto L_0x0015
            boolean r3 = r3.b
            boolean r4 = r4.b
            if (r3 != r4) goto L_0x0015
            r1 = 1
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zif.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public zif(boolean z) {
        this.b = true;
        this.c = z;
    }
}
