package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jw6  reason: default package */
public final class jw6 {
    public final Lazy a;
    public final ylf b;
    public final x03 c;
    public final List d;

    public jw6(ylf ylf, x03 x03, List list, Function0 function0) {
        this.b = ylf;
        this.c = x03;
        this.d = list;
        this.a = LazyKt.lazy(new uc(9, function0));
    }

    public final List a() {
        return (List) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jw6) {
            jw6 jw6 = (jw6) obj;
            return jw6.b == this.b && Intrinsics.areEqual((Object) jw6.c, (Object) this.c) && Intrinsics.areEqual((Object) jw6.a(), (Object) a()) && Intrinsics.areEqual((Object) jw6.d, (Object) this.d);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = a().hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Iterable<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(a2, 10));
        for (Certificate certificate : a2) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.b);
        sb.append(" cipherSuite=");
        sb.append(this.c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        Iterable<Certificate> iterable = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Certificate certificate2 : iterable) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
