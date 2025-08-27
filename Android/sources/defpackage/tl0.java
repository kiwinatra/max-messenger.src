package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tl0  reason: default package */
public final class tl0 extends iq {
    public final gtf e;

    public tl0(gtf gtf) {
        this.e = gtf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof tl0) && Intrinsics.areEqual((Object) ((tl0) obj).e, (Object) this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final List w(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object h = a81.h(1, arrayList);
            if (h != null) {
                X509Certificate x509Certificate = (X509Certificate) h;
                X509Certificate a = this.e.a(x509Certificate);
                if (a != null) {
                    if (arrayList.size() > 1 || (!Intrinsics.areEqual((Object) x509Certificate, (Object) a))) {
                        arrayList.add(a);
                    }
                    if (!(!Intrinsics.areEqual((Object) a.getIssuerDN(), (Object) a.getSubjectDN()))) {
                        try {
                            a.verify(a.getPublicKey());
                            return arrayList;
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                    z = true;
                } else {
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            X509Certificate x509Certificate2 = (X509Certificate) next;
                            if (!(!Intrinsics.areEqual((Object) x509Certificate.getIssuerDN(), (Object) x509Certificate2.getSubjectDN()))) {
                                try {
                                    x509Certificate.verify(x509Certificate2.getPublicKey());
                                    it.remove();
                                    arrayList.add(x509Certificate2);
                                } catch (GeneralSecurityException unused2) {
                                    continue;
                                }
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                        }
                    }
                    if (z) {
                        return arrayList;
                    }
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
