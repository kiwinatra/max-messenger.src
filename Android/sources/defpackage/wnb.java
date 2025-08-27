package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: wnb  reason: default package */
public class wnb {
    public static volatile wnb a;
    public static final Logger b = Logger.getLogger(rla.class.getName());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: wnb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: wnb} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r0 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r0 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r0 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (java.lang.Integer.parseInt(java.lang.System.getProperty("java.specification.version", "unknown")) >= 9) goto L_0x0134;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0138  */
    static {
        /*
            boolean r0 = defpackage.djd.g()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0073
            java.util.Map r0 = defpackage.ie.b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0058
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ie.a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x0012
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0043
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x004f
        L_0x0043:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x004d
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x004f
        L_0x004d:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x004f:
            r4.setLevel(r3)
            je r3 = defpackage.je.a
            r4.addHandler(r3)
            goto L_0x0012
        L_0x0058:
            boolean r0 = defpackage.vd.d
            if (r0 == 0) goto L_0x0062
            vd r0 = new vd
            r0.<init>()
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            if (r0 == 0) goto L_0x0067
            goto L_0x013d
        L_0x0067:
            boolean r0 = defpackage.le.e
            if (r0 == 0) goto L_0x0070
            le r1 = new le
            r1.<init>()
        L_0x0070:
            r0 = r1
            goto L_0x013d
        L_0x0073:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "Conscrypt"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0094
            boolean r0 = defpackage.qi3.d
            if (r0 == 0) goto L_0x008f
            qi3 r0 = new qi3
            r0.<init>()
            goto L_0x0090
        L_0x008f:
            r0 = r1
        L_0x0090:
            if (r0 == 0) goto L_0x0094
            goto L_0x013d
        L_0x0094:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "BC"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = defpackage.cs0.d
            if (r0 == 0) goto L_0x00b0
            cs0 r0 = new cs0
            r0.<init>()
            goto L_0x00b1
        L_0x00b0:
            r0 = r1
        L_0x00b1:
            if (r0 == 0) goto L_0x00b5
            goto L_0x013d
        L_0x00b5:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "OpenJSSE"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x00d5
            boolean r0 = defpackage.k4b.d
            if (r0 == 0) goto L_0x00d1
            k4b r0 = new k4b
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d5
            goto L_0x013d
        L_0x00d5:
            boolean r0 = defpackage.nm7.c
            if (r0 == 0) goto L_0x00df
            nm7 r0 = new nm7
            r0.<init>()
            goto L_0x00e0
        L_0x00df:
            r0 = r1
        L_0x00e0:
            if (r0 == 0) goto L_0x00e3
            goto L_0x013d
        L_0x00e3:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x00f6 }
            r3 = 9
            if (r2 < r3) goto L_0x00f6
            goto L_0x0134
        L_0x00f6:
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r3 = "put"
            java.lang.Class[] r4 = new java.lang.Class[]{r0, r4}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.reflect.Method r7 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r3 = "get"
            java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.reflect.Method r8 = r2.getMethod(r3, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.String r3 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            java.lang.reflect.Method r9 = r2.getMethod(r3, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            mm7 r0 = new mm7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0134 }
            r1 = r0
        L_0x0134:
            if (r1 == 0) goto L_0x0138
            goto L_0x0070
        L_0x0138:
            wnb r0 = new wnb
            r0.<init>()
        L_0x013d:
            a = r0
            java.lang.Class<rla> r0 = defpackage.rla.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnb.<clinit>():void");
    }

    public static void i(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public iq b(X509TrustManager x509TrustManager) {
        return new tl0(c(x509TrustManager));
    }

    public gtf c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new am0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        return true;
    }

    public void j(Object obj, String str) {
        if (obj == null) {
            str = tr1.j(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() {
        return SSLContext.getInstance("TLS");
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k = k();
            k.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return k.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}
