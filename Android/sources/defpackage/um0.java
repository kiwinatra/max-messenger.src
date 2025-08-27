package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: um0  reason: default package */
public final class um0 {
    public static final String d = Character.toString(8206);
    public static final String e = Character.toString(8207);
    public static final um0 f = new um0(false);
    public static final um0 g = new um0(true);
    public final boolean a;
    public final int b = 2;
    public final j3h c;

    static {
        zef zef = bff.c;
    }

    public um0(boolean z) {
        zef zef = bff.c;
        this.a = z;
        this.c = zef;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            tm0 r0 = new tm0
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        L_0x000b:
            int r4 = r0.c
            int r5 = r0.b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L_0x0070
            if (r1 != 0) goto L_0x0070
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.c
            int r4 = r4 + r6
            r0.c = r4
            char r4 = r0.d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = defpackage.tm0.e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x006a
            if (r4 == r6) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006e
        L_0x005a:
            int r3 = r3 + -1
            r2 = r9
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = r6
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = r7
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006e
        L_0x0068:
            r9 = r6
            goto L_0x008f
        L_0x006a:
            if (r3 != 0) goto L_0x006e
        L_0x006c:
            r9 = r7
            goto L_0x008f
        L_0x006e:
            r1 = r3
            goto L_0x000b
        L_0x0070:
            if (r1 != 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            if (r2 == 0) goto L_0x0077
            r9 = r2
            goto L_0x008f
        L_0x0077:
            int r2 = r0.c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x008c;
                case 15: goto L_0x008c;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0086:
            if (r1 != r3) goto L_0x0089
            goto L_0x0068
        L_0x0089:
            int r3 = r3 + -1
            goto L_0x0077
        L_0x008c:
            if (r1 != r3) goto L_0x0089
            goto L_0x006c
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um0.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r7) {
        /*
            tm0 r0 = new tm0
            r0.<init>(r7)
            int r7 = r0.b
            r0.c = r7
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.c
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L_0x003b
            r5 = 1
            if (r3 == r5) goto L_0x0035
            r6 = 2
            if (r3 == r6) goto L_0x0035
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x0031;
                case 15: goto L_0x0031;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 != r1) goto L_0x002e
        L_0x002c:
            r7 = r5
            goto L_0x0041
        L_0x002e:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0031:
            if (r2 != r1) goto L_0x002e
        L_0x0033:
            r7 = r4
            goto L_0x0041
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            if (r2 != 0) goto L_0x000c
        L_0x0040:
            goto L_0x000b
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um0.b(java.lang.CharSequence):int");
    }

    public static um0 c() {
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            z = false;
        }
        return z ? g : f;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, j3h j3h) {
        if (charSequence == null) {
            return null;
        }
        boolean a1 = j3h.a1(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.b & 2;
        String str = "";
        String str2 = e;
        String str3 = d;
        boolean z = this.a;
        if (i != 0) {
            boolean a12 = (a1 ? bff.b : bff.a).a1(charSequence, charSequence.length());
            spannableStringBuilder.append((z || (!a12 && a(charSequence) != 1)) ? (!z || (a12 && a(charSequence) != -1)) ? str : str2 : str3);
        }
        if (a1 != z) {
            spannableStringBuilder.append(a1 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean a13 = (a1 ? bff.b : bff.a).a1(charSequence, charSequence.length());
        if (!z && (a13 || b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!a13 || b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
