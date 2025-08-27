package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* renamed from: ti6  reason: default package */
public abstract class ti6 {
    public static final Regex a = new Regex("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");

    public static ri6 a(String str) {
        ri6 ri6 = null;
        if (StringsKt.isBlank(str)) {
            return null;
        }
        String k = tld.k(str);
        String upperCase = str.toUpperCase(Locale.getDefault());
        Regex regex = a;
        String replace = regex.replace((CharSequence) k, "");
        ri6 ri62 = replace.length() > 0 ? new ri6(replace, regex.replace((CharSequence) upperCase, ""), (ri6) null) : null;
        if (!Intrinsics.areEqual((Object) ri62 != null ? ri62.b : null, (Object) upperCase) || !Intrinsics.areEqual((Object) ri62.a, (Object) k)) {
            ri6 = ri62;
        }
        return new ri6(k, upperCase, ri6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ri6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ri6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: ri6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: ri6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ri6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ri6 b(java.util.Collection r10) {
        /*
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x000b:
            boolean r1 = r10.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r10.next()
            pm3 r1 = (defpackage.pm3) r1
            pm3 r3 = defpackage.pm3.e
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            java.lang.String r1 = r1.a()
            int r3 = r1.length()
            if (r3 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            if (r2 == 0) goto L_0x000b
            r0.add(r2)
            goto L_0x000b
        L_0x0033:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x003b
            goto L_0x0110
        L_0x003b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            ri6 r1 = a(r1)
            if (r1 == 0) goto L_0x0044
            r10.add(r1)
            goto L_0x0044
        L_0x005a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0062
            goto L_0x0110
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r5 = r10.iterator()
            r6 = 0
        L_0x007b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00e7
            int r7 = r6 + 1
            java.lang.Object r8 = r5.next()
            ri6 r8 = (defpackage.ri6) r8
            java.lang.String r9 = r8.a
            r0.append(r9)
            java.lang.String r9 = r8.b
            r1.append(r9)
            ri6 r8 = r8.c
            if (r8 == 0) goto L_0x009a
            java.lang.String r9 = r8.b
            goto L_0x009b
        L_0x009a:
            r9 = r2
        L_0x009b:
            if (r9 == 0) goto L_0x00ad
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00a4
            goto L_0x00ad
        L_0x00a4:
            if (r8 == 0) goto L_0x00a9
            java.lang.String r9 = r8.b
            goto L_0x00aa
        L_0x00a9:
            r9 = r2
        L_0x00aa:
            r4.append(r9)
        L_0x00ad:
            if (r8 == 0) goto L_0x00b2
            java.lang.String r9 = r8.a
            goto L_0x00b3
        L_0x00b2:
            r9 = r2
        L_0x00b3:
            if (r9 == 0) goto L_0x00c5
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00bc
            goto L_0x00c5
        L_0x00bc:
            if (r8 == 0) goto L_0x00c1
            java.lang.String r8 = r8.a
            goto L_0x00c2
        L_0x00c1:
            r8 = r2
        L_0x00c2:
            r3.append(r8)
        L_0x00c5:
            int r8 = kotlin.collections.CollectionsKt.getLastIndex(r10)
            if (r6 == r8) goto L_0x00e5
            r6 = 44
            r0.append(r6)
            r1.append(r6)
            int r8 = r4.length()
            if (r8 <= 0) goto L_0x00dc
            r4.append(r6)
        L_0x00dc:
            int r8 = r3.length()
            if (r8 <= 0) goto L_0x00e5
            r3.append(r6)
        L_0x00e5:
            r6 = r7
            goto L_0x007b
        L_0x00e7:
            int r10 = r3.length()
            if (r10 <= 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            int r10 = r4.length()
            if (r10 <= 0) goto L_0x0102
        L_0x00f4:
            ri6 r10 = new ri6
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r4.toString()
            r10.<init>(r3, r4, r2)
            r2 = r10
        L_0x0102:
            ri6 r10 = new ri6
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            r10.<init>(r0, r1, r2)
            r2 = r10
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti6.b(java.util.Collection):ri6");
    }

    public static String c(String str) {
        return wj6.k("*", str, "*");
    }

    public static String d(String str) {
        return wj6.k("%", str, "%");
    }

    public static si6 e(String str) {
        ri6 a2 = a(str);
        ri6 ri6 = null;
        if (a2 == null) {
            return null;
        }
        String str2 = a2.b;
        String c = c(str2);
        String str3 = a2.a;
        String c2 = c(str3);
        ri6 ri62 = a2.c;
        ri6 ri63 = new ri6(c2, c, ri62 != null ? ri6.a(ri62, c(ri62.b)) : null);
        String d = d(str2);
        String d2 = d(str3);
        if (ri62 != null) {
            ri6 = ri6.a(ri62, d(ri62.b));
        }
        return new si6(ri63, new ri6(d2, d, ri6));
    }
}
