package defpackage;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: am0  reason: default package */
public final class am0 implements gtf {
    public final LinkedHashMap a;

    public am0(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.security.cert.X509Certificate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.security.cert.X509Certificate} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate r4) {
        /*
            r3 = this;
            javax.security.auth.x500.X500Principal r0 = r4.getIssuerX500Principal()
            java.util.LinkedHashMap r3 = r3.a
            java.lang.Object r3 = r3.get(r0)
            java.util.Set r3 = (java.util.Set) r3
            r0 = 0
            if (r3 == 0) goto L_0x002a
            java.util.Iterator r3 = r3.iterator()
        L_0x0013:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r3.next()
            r2 = r1
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.PublicKey r2 = r2.getPublicKey()     // Catch:{ Exception -> 0x0013 }
            r4.verify(r2)     // Catch:{ Exception -> 0x0013 }
            r0 = r1
        L_0x0028:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am0.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof am0) && Intrinsics.areEqual((Object) ((am0) obj).a, (Object) this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
