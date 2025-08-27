package defpackage;

import android.content.Context;

/* renamed from: lua  reason: default package */
public final class lua {
    public final Context a;
    public final yva b;

    public lua(Context context, yva yva) {
        this.a = context;
        this.b = yva;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.CharSequence[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.String r12, java.util.List r13, boolean r14, java.lang.String... r15) {
        /*
            r11 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            int r3 = r15.length
            r4 = 0
            r5 = r4
        L_0x0006:
            java.lang.String r6 = ""
            java.lang.String r7 = " "
            yva r8 = r11.b
            if (r5 >= r3) goto L_0x0060
            r9 = r15[r5]
            if (r9 == 0) goto L_0x005e
            int r10 = r9.length()
            if (r10 != 0) goto L_0x0019
            goto L_0x005e
        L_0x0019:
            boolean r10 = defpackage.n54.v(r9, r13)
            if (r10 == 0) goto L_0x005e
            u25 r14 = r8.k
            java.lang.CharSequence r12 = r14.c(r12)
            java.lang.String r14 = r9.toString()
            boolean r14 = defpackage.n54.v(r14, r13)
            if (r14 == 0) goto L_0x0051
            java.lang.String r14 = r9.toString()
            js9 r15 = defpackage.fu4.k
            android.content.Context r11 = r11.a
            fu4 r11 = r15.e(r11)
            k2b r11 = r11.f()
            sjd r15 = defpackage.sjd.a
            tld r15 = r15.w()
            java.lang.String r3 = r14.toString()
            java.util.List r13 = r15.d(r3, r13)
            android.text.SpannableString r6 = defpackage.n54.o(r14, r13, r11)
        L_0x0051:
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r1]
            r11[r4] = r12
            r11[r2] = r7
            r11[r0] = r6
            java.lang.CharSequence r11 = android.text.TextUtils.concat(r11)
            return r11
        L_0x005e:
            int r5 = r5 + r2
            goto L_0x0006
        L_0x0060:
            if (r14 == 0) goto L_0x0081
            int r11 = r15.length
            if (r11 != 0) goto L_0x0067
            r11 = r2
            goto L_0x0068
        L_0x0067:
            r11 = r4
        L_0x0068:
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x0081
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r1]
            u25 r13 = r8.k
            java.lang.CharSequence r12 = r13.c(r12)
            r11[r4] = r12
            r11[r2] = r7
            java.lang.Object r12 = kotlin.collections.ArraysKt.first((T[]) r15)
            r11[r0] = r12
            java.lang.CharSequence r6 = android.text.TextUtils.concat(r11)
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lua.a(java.lang.String, java.util.List, boolean, java.lang.String[]):java.lang.CharSequence");
    }
}
