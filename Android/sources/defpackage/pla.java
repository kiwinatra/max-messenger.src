package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pla  reason: default package */
public final class pla implements HostnameVerifier {
    public static final pla a = new Object();

    public static List a(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!Intrinsics.areEqual(next.get(0), (Object) Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(a81.j(length2, "endIndex < beginIndex: ", " < 0").toString());
        } else if (length2 <= str.length()) {
            long j = 0;
            int i2 = 0;
            while (i2 < length2) {
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    j++;
                } else {
                    if (charAt < 2048) {
                        i = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i = 3;
                    } else {
                        int i3 = i2 + 1;
                        char charAt2 = i3 < length2 ? str.charAt(i3) : 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j++;
                            i2 = i3;
                        } else {
                            j += (long) 4;
                            i2 += 2;
                        }
                    }
                    j += (long) i;
                }
                i2++;
            }
            return length == ((int) j);
        } else {
            StringBuilder o = wj6.o(length2, "endIndex > string.length: ", " > ");
            o.append(str.length());
            throw new IllegalArgumentException(o.toString().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x011c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r9, java.security.cert.X509Certificate r10) {
        /*
            kotlin.text.Regex r0 = defpackage.u0g.f
            boolean r0 = r0.matches(r9)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0041
            java.lang.String r9 = defpackage.o54.O(r9)
            r0 = 7
            java.util.List r10 = a(r10, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0025
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r1 = r2
            goto L_0x011c
        L_0x0025:
            java.util.Iterator r10 = r10.iterator()
        L_0x0029:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.o54.O(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x011c
        L_0x0041:
            boolean r0 = b(r9)
            if (r0 == 0) goto L_0x004d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
        L_0x004d:
            r0 = 2
            java.util.List r10 = a(r10, r0)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0062
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0062
            goto L_0x0022
        L_0x0062:
            java.util.Iterator r10 = r10.iterator()
        L_0x0066:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto L_0x00ef
            int r3 = r9.length()
            if (r3 != 0) goto L_0x007c
            goto L_0x00ef
        L_0x007c:
            java.lang.String r3 = "."
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r9, r3, false, 2, (java.lang.Object) null)
            if (r4 != 0) goto L_0x00ef
            java.lang.String r4 = ".."
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r9, r4, false, 2, (java.lang.Object) null)
            if (r5 == 0) goto L_0x008d
            goto L_0x00ef
        L_0x008d:
            if (r0 == 0) goto L_0x00ef
            int r5 = r0.length()
            if (r5 != 0) goto L_0x0096
            goto L_0x00ef
        L_0x0096:
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r0, r3, false, 2, (java.lang.Object) null)
            if (r5 != 0) goto L_0x00ef
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r0, r4, false, 2, (java.lang.Object) null)
            if (r4 == 0) goto L_0x00a3
            goto L_0x00ef
        L_0x00a3:
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r9, r3, false, 2, (java.lang.Object) null)
            if (r4 != 0) goto L_0x00ae
            java.lang.String r4 = r9.concat(r3)
            goto L_0x00af
        L_0x00ae:
            r4 = r9
        L_0x00af:
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r0, r3, false, 2, (java.lang.Object) null)
            if (r5 != 0) goto L_0x00b9
            java.lang.String r0 = r0.concat(r3)
        L_0x00b9:
            boolean r3 = b(r0)
            if (r3 == 0) goto L_0x00c5
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
        L_0x00c5:
            java.lang.String r3 = "*"
            boolean r3 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r3, false, 2, (java.lang.Object) null)
            if (r3 != 0) goto L_0x00d2
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            goto L_0x011a
        L_0x00d2:
            java.lang.String r3 = "*."
            boolean r5 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r0, r3, false, 2, (java.lang.Object) null)
            if (r5 == 0) goto L_0x00ef
            r5 = 42
            r6 = 4
            int r5 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (char) r5, (int) r1, false, (int) r6, (java.lang.Object) null)
            r7 = -1
            if (r5 == r7) goto L_0x00e5
            goto L_0x00ef
        L_0x00e5:
            int r5 = r4.length()
            int r8 = r0.length()
            if (r5 >= r8) goto L_0x00f1
        L_0x00ef:
            r0 = r2
            goto L_0x011a
        L_0x00f1:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r3 == 0) goto L_0x00f8
            goto L_0x00ef
        L_0x00f8:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = kotlin.text.StringsKt__StringsJVMKt.endsWith$default(r4, r0, false, 2, (java.lang.Object) null)
            if (r3 != 0) goto L_0x0103
            goto L_0x00ef
        L_0x0103:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x0119
            int r3 = r3 + -1
            r0 = 46
            int r0 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r4, (char) r0, (int) r3, false, (int) r6, (java.lang.Object) null)
            if (r0 == r7) goto L_0x0119
            goto L_0x00ef
        L_0x0119:
            r0 = r1
        L_0x011a:
            if (r0 == 0) goto L_0x0066
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pla.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
