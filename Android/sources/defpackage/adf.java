package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.ArrayIteratorKt;

/* renamed from: adf  reason: default package */
public final class adf implements X509TrustManager {
    public final X509TrustManager a;
    public final ejd b;
    public final String c = adf.class.getName();

    public adf(X509TrustManager x509TrustManager) {
        ejd ejd = ejd.y;
        this.a = x509TrustManager;
        this.b = ejd;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.b.getClass();
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.b.getClass();
        try {
            this.a.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            if (x509CertificateArr != null) {
                String str2 = this.c;
                StringBuilder sb = new StringBuilder("\n");
                for (X509Certificate l : x509CertificateArr) {
                    sb.append(0);
                    sb.append(". ");
                    y7e.l(sb, l);
                }
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str2, "logServerChain: " + sb, (Throwable) null);
                }
            }
            String str3 = this.c;
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                Locale locale = Locale.getDefault();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = ArrayIteratorKt.iterator(((X509TrustManager) instance.getTrustManagers()[0]).getAcceptedIssuers());
                while (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    Principal issuerDN = x509Certificate.getIssuerDN();
                    String name = issuerDN != null ? issuerDN.getName() : null;
                    Principal subjectDN = x509Certificate.getSubjectDN();
                    String name2 = subjectDN != null ? subjectDN.getName() : null;
                    if (name != null) {
                        String lowerCase = name.toLowerCase(locale);
                        if (lowerCase != null && StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "comodo", false, 2, (Object) null)) {
                            y7e.l(sb2, x509Certificate);
                        }
                    }
                    if (name2 != null) {
                        String lowerCase2 = name2.toLowerCase(locale);
                        if (lowerCase2 != null) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "comodo", false, 2, (Object) null)) {
                            }
                            y7e.l(sb2, x509Certificate);
                        }
                    }
                }
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, str3, "logDefaultTrustedStore: " + sb2, (Throwable) null);
                }
            } catch (NoSuchAlgorithmException e2) {
                a67 a673 = z68.b;
                if (a673 != null && a673.c()) {
                    a673.d(w78.x, str3, a81.m("logDefaultTrustedStore: ", e2.getMessage()), (Throwable) null);
                }
            } catch (KeyStoreException e3) {
                a67 a674 = z68.b;
                if (a674 != null && a674.c()) {
                    a674.d(w78.x, str3, a81.m("logDefaultTrustedStore: ", e3.getMessage()), (Throwable) null);
                }
            }
            throw e;
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }
}
