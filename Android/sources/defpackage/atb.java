package defpackage;

import androidx.preference.Preference;

/* renamed from: atb  reason: default package */
public final class atb {
    public final int a;
    public final int b;
    public final String c;

    public atb(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.N0;
        this.b = preference.O0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.atb) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.atb
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            atb r4 = (defpackage.atb) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x001f
            int r0 = r3.b
            int r2 = r4.b
            if (r0 != r2) goto L_0x001f
            java.lang.String r3 = r3.c
            java.lang.String r4 = r4.c
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((527 + this.a) * 31) + this.b) * 31);
    }
}
