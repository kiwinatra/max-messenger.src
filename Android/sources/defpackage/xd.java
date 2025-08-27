package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: xd  reason: default package */
public final class xd extends iq {
    public final X509TrustManager e;
    public final X509TrustManagerExtensions f;

    public xd(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.e = x509TrustManager;
        this.f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xd) && ((xd) obj).e == this.e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.e);
    }

    public final List w(String str, List list) {
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                return this.f.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            } catch (CertificateException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
