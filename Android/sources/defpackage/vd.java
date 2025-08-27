package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;

/* renamed from: vd  reason: default package */
public final class vd extends wnb {
    public static final boolean d = djd.g();
    public final ArrayList c;

    public vd() {
        Object[] objArr = {djd.g() ? new Object() : null, new tk4(re.f), new tk4(si3.a), new tk4(es0.a)};
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt.listOfNotNull((T[]) objArr)) {
            if (((ofe) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    public final iq b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        xd xdVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            xdVar = new xd(x509TrustManager, x509TrustManagerExtensions);
        }
        return xdVar != null ? xdVar : super.b(x509TrustManager);
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ofe) obj).a(sSLSocket)) {
                break;
            }
        }
        ofe ofe = (ofe) obj;
        if (ofe != null) {
            ofe.d(sSLSocket, str, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ofe) obj).a(sSLSocket)) {
                break;
            }
        }
        ofe ofe = (ofe) obj;
        if (ofe != null) {
            return ofe.c(sSLSocket);
        }
        return null;
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
