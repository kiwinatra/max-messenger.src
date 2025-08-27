package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;

/* renamed from: mtc  reason: default package */
public final class mtc extends q37 {
    public Socket b;
    public Socket c;
    public jw6 d;
    public y8c e;
    public a47 f;
    public gtc g;
    public ftc h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final ArrayList o = new ArrayList();
    public long p = LongCompanionObject.MAX_VALUE;
    public final c9d q;

    public mtc(c9d c9d) {
        this.q = c9d;
    }

    public static void d(rla rla, c9d c9d, IOException iOException) {
        if (c9d.b.type() != Proxy.Type.DIRECT) {
            za zaVar = c9d.a;
            zaVar.k.connectFailed(zaVar.a.h(), c9d.b.address(), iOException);
        }
        d6a d6a = rla.L0;
        synchronized (d6a) {
            ((LinkedHashSet) d6a.b).add(c9d);
        }
    }

    public final synchronized void a(a0e a0e) {
        this.n = (a0e.a & 16) != 0 ? a0e.b[4] : IntCompanionObject.MAX_VALUE;
    }

    public final void b(h47 h47) {
        h47.c(8, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7, int r8, int r9, int r10, boolean r11, defpackage.bk3 r12) {
        /*
            r6 = this;
            y8c r0 = r6.e
            if (r0 != 0) goto L_0x011c
            c9d r0 = r6.q
            za r0 = r0.a
            java.util.List r1 = r0.c
            ei3 r2 = new ei3
            r2.<init>(r1)
            javax.net.ssl.SSLSocketFactory r3 = r0.f
            if (r3 != 0) goto L_0x004e
            di3 r0 = defpackage.di3.f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0041
            c9d r0 = r6.q
            za r0 = r0.a
            m57 r0 = r0.a
            java.lang.String r0 = r0.e
            wnb r1 = defpackage.wnb.a
            wnb r1 = defpackage.wnb.a
            boolean r1 = r1.h(r0)
            if (r1 == 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication to "
            java.lang.String r9 = " not permitted by network security policy"
            java.lang.String r8 = defpackage.wj6.k(r8, r0, r9)
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x0041:
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication not enabled for client"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x004e:
            java.util.List r0 = r0.b
            y8c r1 = defpackage.y8c.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x010f
        L_0x0058:
            r0 = 0
            r1 = r0
        L_0x005a:
            r3 = 1
            c9d r4 = r6.q     // Catch:{ IOException -> 0x007a }
            za r5 = r4.a     // Catch:{ IOException -> 0x007a }
            javax.net.ssl.SSLSocketFactory r5 = r5.f     // Catch:{ IOException -> 0x007a }
            if (r5 == 0) goto L_0x006f
            java.net.Proxy r4 = r4.b     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r4 = r4.type()     // Catch:{ IOException -> 0x007a }
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x007a }
            if (r4 != r5) goto L_0x006f
            r4 = r3
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x007c
            r6.f(r7, r8, r9, r12)     // Catch:{ IOException -> 0x007a }
            java.net.Socket r4 = r6.b     // Catch:{ IOException -> 0x007a }
            if (r4 != 0) goto L_0x007f
            goto L_0x0089
        L_0x007a:
            r4 = move-exception
            goto L_0x00b4
        L_0x007c:
            r6.e(r7, r8, r12)     // Catch:{ IOException -> 0x007a }
        L_0x007f:
            r6.g(r2, r10, r12)     // Catch:{ IOException -> 0x007a }
            c9d r4 = r6.q     // Catch:{ IOException -> 0x007a }
            java.net.InetSocketAddress r4 = r4.c     // Catch:{ IOException -> 0x007a }
            r12.getClass()     // Catch:{ IOException -> 0x007a }
        L_0x0089:
            c9d r7 = r6.q
            za r8 = r7.a
            javax.net.ssl.SSLSocketFactory r8 = r8.f
            if (r8 == 0) goto L_0x00ad
            java.net.Proxy r7 = r7.b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.HTTP
            if (r7 != r8) goto L_0x00ad
            java.net.Socket r7 = r6.b
            if (r7 == 0) goto L_0x00a0
            goto L_0x00ad
        L_0x00a0:
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.String r8 = "Too many tunnel connections attempted: 21"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x00ad:
            long r7 = java.lang.System.nanoTime()
            r6.p = r7
            return
        L_0x00b4:
            java.net.Socket r5 = r6.c
            if (r5 == 0) goto L_0x00bb
            defpackage.u0g.d(r5)
        L_0x00bb:
            java.net.Socket r5 = r6.b
            if (r5 == 0) goto L_0x00c2
            defpackage.u0g.d(r5)
        L_0x00c2:
            r6.c = r0
            r6.b = r0
            r6.g = r0
            r6.h = r0
            r6.d = r0
            r6.e = r0
            r6.f = r0
            r6.n = r3
            c9d r5 = r6.q
            java.net.InetSocketAddress r5 = r5.c
            r12.getClass()
            if (r1 != 0) goto L_0x00e1
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r4)
            goto L_0x00e8
        L_0x00e1:
            java.io.IOException r5 = r1.b
            kotlin.ExceptionsKt.addSuppressed(r5, r4)
            r1.a = r4
        L_0x00e8:
            if (r11 == 0) goto L_0x010e
            r2.c = r3
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x010e
            boolean r3 = r4 instanceof java.net.ProtocolException
            if (r3 != 0) goto L_0x010e
            boolean r3 = r4 instanceof java.io.InterruptedIOException
            if (r3 != 0) goto L_0x010e
            boolean r3 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0104
            java.lang.Throwable r3 = r4.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 != 0) goto L_0x010e
        L_0x0104:
            boolean r3 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 != 0) goto L_0x010e
            boolean r3 = r4 instanceof javax.net.ssl.SSLException
            if (r3 == 0) goto L_0x010e
            goto L_0x005a
        L_0x010e:
            throw r1
        L_0x010f:
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L_0x011c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "already connected"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtc.c(int, int, int, int, boolean, bk3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r5 = defpackage.ktc.$EnumSwitchMapping$0[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(int r8, int r9, defpackage.bk3 r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            c9d r3 = r7.q
            java.net.Proxy r4 = r3.b
            za r3 = r3.a
            java.net.Proxy$Type r5 = r4.type()
            if (r5 != 0) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            int[] r6 = defpackage.ktc.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r2) goto L_0x0022
            if (r5 == r1) goto L_0x0022
        L_0x001c:
            java.net.Socket r3 = new java.net.Socket
            r3.<init>(r4)
            goto L_0x0028
        L_0x0022:
            javax.net.SocketFactory r3 = r3.e
            java.net.Socket r3 = r3.createSocket()
        L_0x0028:
            r7.b = r3
            c9d r4 = r7.q
            java.net.InetSocketAddress r4 = r4.c
            r10.getClass()
            r3.setSoTimeout(r9)
            wnb r9 = defpackage.wnb.a     // Catch:{ ConnectException -> 0x008a }
            wnb r9 = defpackage.wnb.a     // Catch:{ ConnectException -> 0x008a }
            c9d r10 = r7.q     // Catch:{ ConnectException -> 0x008a }
            java.net.InetSocketAddress r10 = r10.c     // Catch:{ ConnectException -> 0x008a }
            r9.e(r3, r10, r8)     // Catch:{ ConnectException -> 0x008a }
            java.util.logging.Logger r8 = defpackage.ula.a     // Catch:{ NullPointerException -> 0x0076 }
            g47 r8 = new g47     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            ay r9 = new ay     // Catch:{ NullPointerException -> 0x0076 }
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r2, r10, r8)     // Catch:{ NullPointerException -> 0x0076 }
            ay r10 = new ay     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r0, r8, r9)     // Catch:{ NullPointerException -> 0x0076 }
            gtc r8 = new gtc     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.g = r8     // Catch:{ NullPointerException -> 0x0076 }
            g47 r8 = new g47     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r1, r3)     // Catch:{ NullPointerException -> 0x0076 }
            zx r9 = new zx     // Catch:{ NullPointerException -> 0x0076 }
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch:{ NullPointerException -> 0x0076 }
            r9.<init>(r2, r10, r8)     // Catch:{ NullPointerException -> 0x0076 }
            zx r10 = new zx     // Catch:{ NullPointerException -> 0x0076 }
            r10.<init>(r0, r8, r9)     // Catch:{ NullPointerException -> 0x0076 }
            ftc r8 = new ftc     // Catch:{ NullPointerException -> 0x0076 }
            r8.<init>(r10)     // Catch:{ NullPointerException -> 0x0076 }
            r7.h = r8     // Catch:{ NullPointerException -> 0x0076 }
            goto L_0x0083
        L_0x0076:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "throw with null exception"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 != 0) goto L_0x0084
        L_0x0083:
            return
        L_0x0084:
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L_0x008a:
            r8 = move-exception
            java.net.ConnectException r9 = new java.net.ConnectException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to connect to "
            r10.<init>(r0)
            c9d r7 = r7.q
            java.net.InetSocketAddress r7 = r7.c
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.<init>(r7)
            r9.initCause(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtc.e(int, int, bk3):void");
    }

    public final void f(int i2, int i3, int i4, bk3 bk3) {
        hr6 hr6 = new hr6();
        c9d c9d = this.q;
        hr6.a = c9d.a.a;
        hr6.r("CONNECT", (hd8) null);
        za zaVar = c9d.a;
        ((e4) hr6.c).y(HTTP.TARGET_HOST, u0g.u(zaVar.a, true));
        ((e4) hr6.c).y("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        ((e4) hr6.c).y(HTTP.USER_AGENT, "okhttp/4.9.2");
        y2d c2 = hr6.c();
        j4d j4d = new j4d();
        j4d.a = c2;
        j4d.b = y8c.HTTP_1_1;
        j4d.c = HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED;
        j4d.d = "Preemptive Authenticate";
        j4d.g = u0g.c;
        j4d.k = -1;
        j4d.l = -1;
        j4d.f.y(AUTH.PROXY_AUTH, "OkHttp-Preemptive");
        j4d.a();
        zaVar.i.getClass();
        e(i2, i3, bk3);
        gtc gtc = this.g;
        ftc ftc = this.h;
        u9 u9Var = new u9((rla) null, this, (xu0) gtc, (wu0) ftc);
        lkf q2 = gtc.c.q();
        long j2 = (long) i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        q2.g(j2, timeUnit);
        ftc.c.q().g((long) i4, timeUnit);
        u9Var.J(c2.d, "CONNECT " + u0g.u(c2.b, true) + " HTTP/1.1");
        u9Var.b();
        j4d e2 = u9Var.e(false);
        e2.a = c2;
        k4d a = e2.a();
        long j3 = u0g.j(a);
        if (j3 != -1) {
            l37 C = u9Var.C(j3);
            u0g.s(C, IntCompanionObject.MAX_VALUE, timeUnit);
            C.close();
        }
        int i5 = a.o;
        if (i5 != 200) {
            if (i5 == 407) {
                zaVar.i.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(wj6.h(i5, "Unexpected response code for CONNECT: "));
        } else if (!gtc.a.C() || !ftc.a.C()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.ei3 r17, int r18, defpackage.bk3 r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = 2
            r3 = 0
            r4 = 1
            c9d r5 = r0.q
            za r5 = r5.a
            javax.net.ssl.SSLSocketFactory r6 = r5.f
            y8c r7 = defpackage.y8c.HTTP_1_1
            if (r6 != 0) goto L_0x002c
            java.util.List r2 = r5.b
            y8c r3 = defpackage.y8c.H2_PRIOR_KNOWLEDGE
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0025
            java.net.Socket r2 = r0.b
            r0.c = r2
            r0.e = r3
            r0.l(r1)
            return
        L_0x0025:
            java.net.Socket r1 = r0.b
            r0.c = r1
            r0.e = r7
            return
        L_0x002c:
            r19.getClass()
            java.lang.String r5 = "Hostname "
            java.lang.String r6 = "\n              |Hostname "
            c9d r8 = r0.q
            za r8 = r8.a
            javax.net.ssl.SSLSocketFactory r9 = r8.f
            java.net.Socket r11 = r0.b     // Catch:{ all -> 0x018b }
            m57 r12 = r8.a     // Catch:{ all -> 0x018b }
            java.lang.String r13 = r12.e     // Catch:{ all -> 0x018b }
            int r12 = r12.f     // Catch:{ all -> 0x018b }
            java.net.Socket r9 = r9.createSocket(r11, r13, r12, r4)     // Catch:{ all -> 0x018b }
            if (r9 == 0) goto L_0x018e
            javax.net.ssl.SSLSocket r9 = (javax.net.ssl.SSLSocket) r9     // Catch:{ all -> 0x018b }
            r11 = r17
            di3 r11 = r11.a(r9)     // Catch:{ all -> 0x0061 }
            boolean r12 = r11.b     // Catch:{ all -> 0x0061 }
            if (r12 == 0) goto L_0x0065
            wnb r12 = defpackage.wnb.a     // Catch:{ all -> 0x0061 }
            wnb r12 = defpackage.wnb.a     // Catch:{ all -> 0x0061 }
            m57 r13 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r13 = r13.e     // Catch:{ all -> 0x0061 }
            java.util.List r14 = r8.b     // Catch:{ all -> 0x0061 }
            r12.d(r9, r13, r14)     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r10 = r9
            goto L_0x0196
        L_0x0065:
            r9.startHandshake()     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLSession r12 = r9.getSession()     // Catch:{ all -> 0x0061 }
            jw6 r13 = defpackage.vzg.u(r12)     // Catch:{ all -> 0x0061 }
            javax.net.ssl.HostnameVerifier r14 = r8.g     // Catch:{ all -> 0x0061 }
            m57 r15 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r15 = r15.e     // Catch:{ all -> 0x0061 }
            boolean r12 = r14.verify(r15, r12)     // Catch:{ all -> 0x0061 }
            if (r12 != 0) goto L_0x010b
            java.util.List r0 = r13.a()     // Catch:{ all -> 0x0061 }
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x00f0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0098
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0098:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ all -> 0x0061 }
            javax.net.ssl.SSLPeerUnverifiedException r1 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>(r6)     // Catch:{ all -> 0x0061 }
            m57 r4 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.e     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = " not verified:\n              |    certificate: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            wy1 r4 = defpackage.wy1.c     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = defpackage.ct.E(r0)     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    DN: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.security.Principal r4 = r0.getSubjectDN()     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0061 }
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "\n              |    subjectAltNames: "
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            r4 = 7
            java.util.List r4 = defpackage.pla.a(r0, r4)     // Catch:{ all -> 0x0061 }
            java.util.List r0 = defpackage.pla.a(r0, r2)     // Catch:{ all -> 0x0061 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x0061 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0061 }
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r4, r0)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "\n              "
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r0, (java.lang.String) null, 1, (java.lang.Object) null)     // Catch:{ all -> 0x0061 }
            r1.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x00f0:
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r1.<init>(r5)     // Catch:{ all -> 0x0061 }
            m57 r2 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0061 }
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = " not verified (no certificates)"
            r1.append(r2)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0061 }
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x010b:
            wy1 r5 = r8.h     // Catch:{ all -> 0x0061 }
            jw6 r6 = new jw6     // Catch:{ all -> 0x0061 }
            ylf r12 = r13.b     // Catch:{ all -> 0x0061 }
            x03 r14 = r13.c     // Catch:{ all -> 0x0061 }
            java.util.List r15 = r13.d     // Catch:{ all -> 0x0061 }
            vy1 r10 = new vy1     // Catch:{ all -> 0x0061 }
            r10.<init>(r5, r13, r8, r4)     // Catch:{ all -> 0x0061 }
            r6.<init>(r12, r14, r15, r10)     // Catch:{ all -> 0x0061 }
            r0.d = r6     // Catch:{ all -> 0x0061 }
            m57 r6 = r8.a     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0061 }
            ve r8 = new ve     // Catch:{ all -> 0x0061 }
            r10 = 4
            r8.<init>((int) r10, (java.lang.Object) r0)     // Catch:{ all -> 0x0061 }
            r5.a(r6, r8)     // Catch:{ all -> 0x0061 }
            boolean r5 = r11.b     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0139
            wnb r5 = defpackage.wnb.a     // Catch:{ all -> 0x0061 }
            wnb r5 = defpackage.wnb.a     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r5.f(r9)     // Catch:{ all -> 0x0061 }
            goto L_0x013a
        L_0x0139:
            r10 = 0
        L_0x013a:
            r0.c = r9     // Catch:{ all -> 0x0061 }
            java.util.logging.Logger r5 = defpackage.ula.a     // Catch:{ all -> 0x0061 }
            g47 r5 = new g47     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            ay r6 = new ay     // Catch:{ all -> 0x0061 }
            java.io.InputStream r8 = r9.getInputStream()     // Catch:{ all -> 0x0061 }
            r6.<init>(r4, r8, r5)     // Catch:{ all -> 0x0061 }
            ay r8 = new ay     // Catch:{ all -> 0x0061 }
            r8.<init>(r3, r5, r6)     // Catch:{ all -> 0x0061 }
            gtc r5 = new gtc     // Catch:{ all -> 0x0061 }
            r5.<init>(r8)     // Catch:{ all -> 0x0061 }
            r0.g = r5     // Catch:{ all -> 0x0061 }
            g47 r5 = new g47     // Catch:{ all -> 0x0061 }
            r5.<init>(r2, r9)     // Catch:{ all -> 0x0061 }
            zx r2 = new zx     // Catch:{ all -> 0x0061 }
            java.io.OutputStream r6 = r9.getOutputStream()     // Catch:{ all -> 0x0061 }
            r2.<init>(r4, r6, r5)     // Catch:{ all -> 0x0061 }
            zx r4 = new zx     // Catch:{ all -> 0x0061 }
            r4.<init>(r3, r5, r2)     // Catch:{ all -> 0x0061 }
            ftc r2 = new ftc     // Catch:{ all -> 0x0061 }
            r2.<init>(r4)     // Catch:{ all -> 0x0061 }
            r0.h = r2     // Catch:{ all -> 0x0061 }
            if (r10 == 0) goto L_0x0178
            y8c r7 = defpackage.hd8.v(r10)     // Catch:{ all -> 0x0061 }
        L_0x0178:
            r0.e = r7     // Catch:{ all -> 0x0061 }
            wnb r2 = defpackage.wnb.a
            wnb r2 = defpackage.wnb.a
            r2.a(r9)
            y8c r2 = r0.e
            y8c r3 = defpackage.y8c.HTTP_2
            if (r2 != r3) goto L_0x018a
            r0.l(r1)
        L_0x018a:
            return
        L_0x018b:
            r0 = move-exception
            r10 = 0
            goto L_0x0196
        L_0x018e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x018b }
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r0.<init>(r1)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x0196:
            if (r10 == 0) goto L_0x019f
            wnb r1 = defpackage.wnb.a
            wnb r1 = defpackage.wnb.a
            r1.a(r10)
        L_0x019f:
            if (r10 == 0) goto L_0x01a4
            defpackage.u0g.d(r10)
        L_0x01a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtc.g(ei3, int, bk3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (defpackage.pla.c(r1, (java.security.cert.X509Certificate) r10) != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.za r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = defpackage.u0g.a
            java.util.ArrayList r1 = r8.o
            int r1 = r1.size()
            int r2 = r8.n
            if (r1 >= r2) goto L_0x00c9
            boolean r1 = r8.i
            if (r1 == 0) goto L_0x0013
            goto L_0x00c9
        L_0x0013:
            c9d r1 = r8.q
            za r2 = r1.a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L_0x001e
            return r0
        L_0x001e:
            m57 r2 = r9.a
            java.lang.String r3 = r2.e
            za r4 = r1.a
            m57 r5 = r4.a
            java.lang.String r5 = r5.e
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            r5 = 1
            if (r3 == 0) goto L_0x0030
            return r5
        L_0x0030:
            a47 r3 = r8.f
            if (r3 != 0) goto L_0x0035
            return r0
        L_0x0035:
            if (r10 == 0) goto L_0x00c9
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L_0x003f
            goto L_0x00c9
        L_0x003f:
            java.util.Iterator r10 = r10.iterator()
        L_0x0043:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r10.next()
            c9d r3 = (defpackage.c9d) r3
            java.net.Proxy r6 = r3.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L_0x0043
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L_0x0043
            java.net.InetSocketAddress r3 = r3.c
            java.net.InetSocketAddress r6 = r1.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0043
            pla r10 = defpackage.pla.a
            javax.net.ssl.HostnameVerifier r1 = r9.g
            if (r1 == r10) goto L_0x0072
            return r0
        L_0x0072:
            byte[] r10 = defpackage.u0g.a
            m57 r10 = r4.a
            int r1 = r10.f
            int r3 = r2.f
            if (r3 == r1) goto L_0x007d
            goto L_0x00c9
        L_0x007d:
            java.lang.String r10 = r10.e
            java.lang.String r1 = r2.e
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0088
            goto L_0x00ac
        L_0x0088:
            boolean r10 = r8.j
            if (r10 != 0) goto L_0x00c9
            jw6 r10 = r8.d
            if (r10 == 0) goto L_0x00c9
            java.util.List r10 = r10.a()
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r10 = r10.get(r0)
            if (r10 == 0) goto L_0x00c1
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = defpackage.pla.c(r1, r10)
            if (r10 == 0) goto L_0x00c9
        L_0x00ac:
            wy1 r9 = r9.h     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            jw6 r8 = r8.d     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            java.util.List r8 = r8.a()     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            r9.getClass()     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            vy1 r10 = new vy1     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            r10.<init>(r9, r8, r1, r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            r9.a(r1, r10)     // Catch:{ SSLPeerUnverifiedException -> 0x00c0 }
            return r5
        L_0x00c0:
            return r0
        L_0x00c1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        L_0x00c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtc.h(za, java.util.ArrayList):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = defpackage.u0g.a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.b
            java.net.Socket r3 = r9.c
            gtc r4 = r9.g
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0075
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x0026
            goto L_0x0075
        L_0x0026:
            a47 r2 = r9.f
            r6 = 1
            if (r2 == 0) goto L_0x0049
            monitor-enter(r2)
            boolean r9 = r2.x     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x0032
            monitor-exit(r2)
            goto L_0x0046
        L_0x0032:
            long r9 = r2.y0     // Catch:{ all -> 0x0042 }
            long r3 = r2.x0     // Catch:{ all -> 0x0042 }
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0044
            long r9 = r2.z0     // Catch:{ all -> 0x0042 }
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0044
            monitor-exit(r2)
            goto L_0x0046
        L_0x0042:
            r9 = move-exception
            goto L_0x0047
        L_0x0044:
            monitor-exit(r2)
            r5 = r6
        L_0x0046:
            return r5
        L_0x0047:
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x0049:
            monitor-enter(r9)
            long r7 = r9.p     // Catch:{ all -> 0x0072 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0071
            if (r10 == 0) goto L_0x0071
            int r9 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x006a }
            boolean r10 = r4.C()     // Catch:{ all -> 0x006a }
            r10 = r10 ^ r6
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            r5 = r10
            goto L_0x0070
        L_0x006a:
            r10 = move-exception
            r3.setSoTimeout(r9)     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
            throw r10     // Catch:{ SocketTimeoutException -> 0x006f, IOException -> 0x0070 }
        L_0x006f:
            r5 = r6
        L_0x0070:
            return r5
        L_0x0071:
            return r6
        L_0x0072:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtc.i(boolean):boolean");
    }

    public final s95 j(rla rla, otc otc) {
        Socket socket = this.c;
        gtc gtc = this.g;
        ftc ftc = this.h;
        a47 a47 = this.f;
        if (a47 != null) {
            return new b47(rla, this, otc, a47);
        }
        int i2 = otc.h;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gtc.c.q().g((long) i2, timeUnit);
        ftc.c.q().g((long) otc.i, timeUnit);
        return new u9(rla, this, (xu0) gtc, (wu0) ftc);
    }

    public final synchronized void k() {
        this.i = true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [sb0, java.lang.Object] */
    public final void l(int i2) {
        Socket socket = this.c;
        gtc gtc = this.g;
        ftc ftc = this.h;
        socket.setSoTimeout(0);
        fef fef = fef.h;
        ? obj = new Object();
        obj.g = fef;
        obj.f = q37.a;
        String str = this.q.a.a.e;
        obj.c = socket;
        obj.b = u0g.g + ' ' + str;
        obj.d = gtc;
        obj.e = ftc;
        obj.f = this;
        obj.a = i2;
        a47 a47 = new a47(obj);
        this.f = a47;
        a0e a0e = a47.K0;
        this.n = (a0e.a & 16) != 0 ? a0e.b[4] : IntCompanionObject.MAX_VALUE;
        i47 i47 = a47.H0;
        synchronized (i47) {
            try {
                if (i47.c) {
                    throw new IOException("closed");
                } else if (i47.w) {
                    Logger logger = i47.x;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(u0g.h(">> CONNECTION " + n37.a.d(), new Object[0]));
                    }
                    i47.v.N(n37.a);
                    i47.v.flush();
                }
            } finally {
            }
        }
        i47 i472 = a47.H0;
        a0e a0e2 = a47.A0;
        synchronized (i472) {
            try {
                if (!i472.c) {
                    i472.d(0, Integer.bitCount(a0e2.a) * 6, 4, 0);
                    int i3 = 0;
                    while (i3 < 10) {
                        boolean z = true;
                        if (((1 << i3) & a0e2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            i472.v.z(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                            i472.v.B(a0e2.b[i3]);
                        }
                        i3++;
                    }
                    i472.v.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        int a = a47.A0.a();
        if (a != 65535) {
            a47.H0.n(0, (long) (a - 65535));
        }
        fef.f().c(new y37(a47.I0, 2, a47.o), 0);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        c9d c9d = this.q;
        sb.append(c9d.a.a.e);
        sb.append(':');
        sb.append(c9d.a.a.f);
        sb.append(", proxy=");
        sb.append(c9d.b);
        sb.append(" hostAddress=");
        sb.append(c9d.c);
        sb.append(" cipherSuite=");
        jw6 jw6 = this.d;
        if (jw6 == null || (obj = jw6.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
