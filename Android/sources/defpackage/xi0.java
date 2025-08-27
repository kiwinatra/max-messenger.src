package defpackage;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import ru.ok.tamtam.android.ssl.SslProviderVerifier$InvalidSslSessionException;

/* renamed from: xi0  reason: default package */
public abstract class xi0 implements r23 {
    public static final Pattern i = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public final fn4 a;
    public final ni3 b;
    public final cm c;
    public final die d;
    public Socket e;
    public ube f;
    public final List g;
    public eh3 h = new eh3(false);

    public xi0(fn4 fn4, rh3 rh3, ni3 ni3, cm cmVar, die die) {
        this.a = fn4;
        this.b = ni3;
        this.c = cmVar;
        this.d = die;
        fz7 fz7 = (fz7) cmVar;
        this.g = Collections.singletonList(new ph3(fz7.c, fz7.d));
    }

    public static Socket m(pfe pfe) {
        z68.c("xi0", "createSocket", new Object[0]);
        Socket createSocket = pfe.createSocket();
        if (createSocket != null) {
            try {
                TrafficStats.tagSocket(createSocket);
            } catch (IOException e2) {
                o(createSocket);
                throw e2;
            } catch (Throwable th) {
                o(createSocket);
                throw new IOException("Failed to create socket", th);
            }
        }
        createSocket.setKeepAlive(false);
        createSocket.setTcpNoDelay(true);
        return createSocket;
    }

    public static long n(int i2, boolean z) {
        if (i2 > 6) {
            i2 = 6;
        }
        double pow = (double) ((long) (Math.pow(2.0d, (double) i2) * 1000.0d));
        long random = (long) (((pow / 2.0d) * Math.random()) + pow);
        if (z && random > 15000) {
            random = 15000;
        }
        z68.a("xi0", "getConnectionTimeout: errorsCount: " + i2 + " timeout: " + random + " app visible: " + z);
        return random;
    }

    public static void o(Socket socket) {
        z68.c("xi0", "releaseSocketSafely", new Object[0]);
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable th) {
                z68.o("xi0", "failed to close socket", th);
            }
        }
    }

    public final ni3 a() {
        return this.b;
    }

    public final void b(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public Socket connect() {
        SSLSessionCache sSLSessionCache;
        int i2;
        long j;
        String str;
        z68.c("xi0", "connect ->", new Object[0]);
        this.h = new eh3(true);
        TrafficStats.setThreadStatsTag((h() + c()).hashCode());
        this.a.e();
        eie eie = (eie) this.d;
        String str2 = eie.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str2, "createSocketFactory ->", (Throwable) null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        Context context = eie.b;
        try {
            sSLSessionCache = new SSLSessionCache(context.getDir("tamtam_sslcache", 0));
        } catch (IOException unused) {
            sSLSessionCache = new SSLSessionCache(context);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(5000, sSLSessionCache);
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            sSLCertificateSocketFactory.setTrustManagers((TrustManager[]) new adf[]{new adf((X509TrustManager) instance.getTrustManagers()[0])});
        } catch (NoSuchAlgorithmException e2) {
            z68.f(eie.a, "failed to prepare default ssl socket factory", e2);
        } catch (KeyStoreException e3) {
            z68.f(eie.a, "failed to prepare default ssl socket factory", e3);
        }
        pfe pfe = new pfe(sSLCertificateSocketFactory);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        fie fie = eie.c;
        if (currentTimeMillis2 >= 0) {
            fie.a = currentTimeMillis2;
            fie.b += currentTimeMillis2;
            fie.c++;
        } else {
            fie.getClass();
        }
        String str3 = eie.a;
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            a672.d(w78.o, str3, wj6.j(currentTimeMillis2, "<- createSocketFactory, took=", "ms"), (Throwable) null);
        }
        String h2 = h();
        int c2 = c();
        eh3 eh3 = this.h;
        eh3.g = h2;
        eh3.h = c2;
        Socket l = l(pfe, h2, c2);
        this.e = l;
        if (!(l instanceof SSLSocket)) {
            eh3 eh32 = this.h;
            eh32.getClass();
            eh32.b = System.currentTimeMillis();
            return this.e;
        }
        die die = this.d;
        SSLSocket sSLSocket = (SSLSocket) l;
        String str4 = i.matcher(h2).matches() ? ((fz7) this.c).c : h2;
        eie eie2 = (eie) die;
        String str5 = eie2.a;
        a67 a673 = z68.b;
        if (a673 != null && a673.c()) {
            a673.d(w78.o, str5, wj6.k("verifySocket, host=", str4, " ->"), (Throwable) null);
        }
        long currentTimeMillis3 = System.currentTimeMillis();
        fie fie2 = (fie) eie2.d.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            SSLSession session = sSLSocket.getSession();
            if (!session.isValid()) {
                throw new SslProviderVerifier$InvalidSslSessionException((String) null, 3);
            } else if (!StringsKt__StringsJVMKt.equals("SSL_NULL_WITH_NULL_NULL", session.getCipherSuite(), true)) {
                SSLSocket sSLSocket2 = sSLSocket;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 >= 0) {
                    fie2.g = elapsedRealtime2;
                    fie2.h += elapsedRealtime2;
                    fie2.i++;
                } else {
                    fie2.getClass();
                }
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                long currentTimeMillis5 = System.currentTimeMillis();
                fie fie3 = (fie) eie2.d.b;
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                try {
                    if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str4, sSLSocket2.getSession())) {
                        fie3.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                        String str6 = eie2.a;
                        a67 a674 = z68.b;
                        if (a674 != null && a674.c()) {
                            a674.d(w78.o, str6, wj6.j(currentTimeMillis4 + currentTimeMillis6, "<- verifySocket, took=", "ms"), (Throwable) null);
                        }
                        eh3 eh33 = this.h;
                        eh33.getClass();
                        eh33.b = System.currentTimeMillis();
                        z68.c("xi0", "ssl session is ok", new Object[0]);
                        ube ube = this.f;
                        if (ube == null || !((pbe) ube).f()) {
                            fie fie4 = ((eie) this.d).c;
                            long j2 = fie4.a;
                            int i3 = fie4.c;
                            long j3 = fie4.b;
                            if (i3 > 1) {
                                j3 /= (long) fie4.c;
                            }
                            long j4 = j3;
                            int i4 = fie4.c;
                            long j5 = fie4.d;
                            long j6 = fie4.f > 1 ? fie4.e / ((long) fie4.f) : fie4.e;
                            int i5 = fie4.f;
                            long j7 = fie4.g;
                            if (fie4.i > 1) {
                                str = h2;
                                i2 = c2;
                                j = fie4.h / ((long) fie4.i);
                            } else {
                                str = h2;
                                i2 = c2;
                                j = fie4.h;
                            }
                            gie gie = new gie(j2, j4, i4, j5, j6, i5, j7, j, fie4.i);
                            eh3 eh34 = this.h;
                            long j8 = gie.k;
                            eh34.getClass();
                            eh34.f = Math.max(j8, 0);
                            z68.c("xi0", "<- connect, socket connected to %s:%d, ssl_metrics=%s", str, Integer.valueOf(i2), gie.toString());
                            return this.e;
                        }
                        String str7 = "emitter was disposed " + h2 + ":" + c2;
                        z68.c("xi0", str7, new Object[0]);
                        throw new IOException(str7);
                    }
                    throw new SSLPeerUnverifiedException("Failed to verify host=" + str4);
                } catch (SSLPeerUnverifiedException e4) {
                    SSLSocket sSLSocket3 = sSLSocket2;
                    fie3.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                    z68.f(eie2.a, y7e.i(sSLSocket3, str4), (Throwable) null);
                    Unit unit = Unit.INSTANCE;
                    throw e4;
                } catch (Throwable th) {
                    fie3.a(SystemClock.elapsedRealtime() - elapsedRealtime3);
                    z68.f(eie2.a, y7e.i(sSLSocket2, str4), (Throwable) null);
                    Unit unit2 = Unit.INSTANCE;
                    SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(a81.m("Failed to verify host=", str4));
                    sSLPeerUnverifiedException.initCause(th);
                    throw sSLPeerUnverifiedException;
                }
            } else {
                throw new SslProviderVerifier$InvalidSslSessionException("Bad session cipher suite", 2);
            }
        } catch (SslProviderVerifier$InvalidSslSessionException e5) {
            throw e5;
        } catch (Throwable th2) {
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime4 >= 0) {
                fie2.g = elapsedRealtime4;
                fie2.h += elapsedRealtime4;
                fie2.i++;
            } else {
                fie2.getClass();
            }
            throw th2;
        }
    }

    public final boolean d() {
        return true;
    }

    public final void e() {
        ni3 ni3 = this.b;
        ((AtomicInteger) ni3.e).incrementAndGet();
        String name = ni3.class.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, wj6.h(((AtomicInteger) ni3.e).get(), "tryNextRequestTimeout "), (Throwable) null);
        }
    }

    public final long g(int i2) {
        return n(i2, this.a.d());
    }

    public final eh3 j() {
        return this.h;
    }

    public final void k(Socket socket, String str, int i2, int i3) {
        z68.c("xi0", "connectSocket, socket=%s, host=%s:%d, timeout=%dms", socket.toString(), str, Integer.valueOf(i2), Integer.valueOf(i3));
        long currentTimeMillis = System.currentTimeMillis();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
        if (inetSocketAddress.getAddress() != null) {
            eh3 eh3 = this.h;
            eh3.getClass();
            eh3.d = Math.max(System.currentTimeMillis() - currentTimeMillis, 0);
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        socket.connect(inetSocketAddress, i3);
        eh3 eh32 = this.h;
        eh32.getClass();
        eh32.e = Math.max(System.currentTimeMillis() - currentTimeMillis2, 0);
    }

    public Socket l(pfe pfe, String str, int i2) {
        z68.c("xi0", "createConnection", new Object[0]);
        Socket m = m(pfe);
        try {
            k(m, str, i2, i());
            return m;
        } catch (IOException e2) {
            o(m);
            throw e2;
        } catch (Throwable th) {
            o(m);
            throw new IOException("Failed to create connection", th);
        }
    }
}
