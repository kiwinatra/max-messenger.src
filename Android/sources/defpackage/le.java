package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;

/* renamed from: le  reason: default package */
public final class le extends wnb {
    public static final boolean e;
    public final ArrayList c;
    public final g6d d;

    static {
        boolean z = false;
        if (djd.g() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public le() {
        re reVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            reVar = new re(cls);
        } catch (Exception e2) {
            wnb.a.getClass();
            wnb.i(5, "unable to load android socket classes", e2);
            reVar = null;
        }
        ofe[] ofeArr = {reVar, new tk4(re.f), new tk4(si3.a), new tk4(es0.a)};
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt.listOfNotNull((T[]) ofeArr)) {
            if (((ofe) next).b()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", (Class[]) null);
            method = cls2.getMethod("open", new Class[]{String.class});
            method2 = cls2.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.d = new g6d(method3, method, method2, 5);
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

    public final gtf c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new ke(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
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

    public final Object g() {
        g6d g6d = this.d;
        Method method = (Method) g6d.b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, (Object[]) null);
            ((Method) g6d.c).invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void j(Object obj, String str) {
        g6d g6d = this.d;
        g6d.getClass();
        if (obj != null) {
            try {
                ((Method) g6d.o).invoke(obj, (Object[]) null);
                return;
            } catch (Exception unused) {
            }
        }
        wnb.i(5, str, (Throwable) null);
    }
}
