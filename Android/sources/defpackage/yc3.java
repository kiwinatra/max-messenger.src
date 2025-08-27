package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.ArraysKt;

/* renamed from: yc3  reason: default package */
public final class yc3 implements X509TrustManager {
    public final X509TrustManager[] a;
    public final ArrayList b;

    public yc3(X509TrustManager[] x509TrustManagerArr) {
        this.a = x509TrustManagerArr;
        ArrayList arrayList = new ArrayList(x509TrustManagerArr.length);
        for (X509TrustManager x509TrustManagerExtensions : x509TrustManagerArr) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManagerExtensions));
        }
        this.b = arrayList;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager[] x509TrustManagerArr = this.a;
        int length = x509TrustManagerArr.length;
        int i = 0;
        while (i < length) {
            try {
                x509TrustManagerArr[i].checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
                i++;
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager[] x509TrustManagerArr = this.a;
        int length = x509TrustManagerArr.length;
        int i = 0;
        while (i < length) {
            try {
                x509TrustManagerArr[i].checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
                i++;
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager acceptedIssuers : this.a) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, ArraysKt.toList((T[]) acceptedIssuers.getAcceptedIssuers()));
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                return ((X509TrustManagerExtensions) it.next()).checkServerTrusted(x509CertificateArr, str, str2);
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
