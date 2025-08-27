package defpackage;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* renamed from: k4b  reason: default package */
public final class k4b extends wnb {
    public static final boolean d;
    public final Provider c = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, j4b.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        d = z;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
    }

    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    public final SSLContext k() {
        return SSLContext.getInstance("TLSv1.3", this.c);
    }

    public final X509TrustManager m() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        throw new IllegalStateException(("Unexpected default trust managers: " + Arrays.toString(trustManagers)).toString());
    }
}
