package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.Regex;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.apache.http.HttpStatus;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* renamed from: js0  reason: default package */
public final class js0 implements vi7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ js0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static int d(k4d k4d, int i) {
        String a2 = k4d.a(k4d, "Retry-After");
        return a2 != null ? new Regex("\\d+").matches(a2) ? Integer.valueOf(a2).intValue() : IntCompanionObject.MAX_VALUE : i;
    }

    public final k4d a(otc otc) {
        int i;
        int i2;
        ptc ptc;
        boolean z;
        int i3;
        List list;
        wy1 wy1;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        otc otc2 = otc;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                y2d y2d = otc2.f;
                hr6 a2 = y2d.a();
                hd8 hd8 = y2d.e;
                if (hd8 != null) {
                    f19 l = hd8.l();
                    if (l != null) {
                        ((e4) a2.c).y(HTTP.CONTENT_TYPE, l.a);
                    }
                    long k = hd8.k();
                    if (k != -1) {
                        ((e4) a2.c).y(HTTP.CONTENT_LEN, String.valueOf(k));
                        a2.s(HTTP.TRANSFER_ENCODING);
                    } else {
                        ((e4) a2.c).y(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                        a2.s(HTTP.CONTENT_LEN);
                    }
                }
                lx6 lx6 = y2d.d;
                String b2 = lx6.b(HTTP.TARGET_HOST);
                m57 m57 = y2d.b;
                if (b2 == null) {
                    i = 0;
                    ((e4) a2.c).y(HTTP.TARGET_HOST, u0g.u(m57, false));
                } else {
                    i = 0;
                }
                if (lx6.b(HTTP.CONN_DIRECTIVE) == null) {
                    ((e4) a2.c).y(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                }
                if (lx6.b("Accept-Encoding") == null && lx6.b("Range") == null) {
                    ((e4) a2.c).y("Accept-Encoding", "gzip");
                    i2 = 1;
                } else {
                    i2 = i;
                }
                ejd ejd = (ejd) this.b;
                ejd.getClass();
                List emptyList = CollectionsKt.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Object next : emptyList) {
                        int i4 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        qz3 qz3 = (qz3) next;
                        if (i > 0) {
                            sb.append("; ");
                        }
                        sb.append(qz3.a);
                        sb.append('=');
                        sb.append(qz3.b);
                        i = i4;
                    }
                    ((e4) a2.c).y(SM.COOKIE, sb.toString());
                }
                if (lx6.b(HTTP.USER_AGENT) == null) {
                    ((e4) a2.c).y(HTTP.USER_AGENT, "okhttp/4.9.2");
                }
                k4d b3 = otc2.b(a2.c());
                lx6 lx62 = b3.w;
                d57.b(ejd, m57, lx62);
                j4d m = b3.m();
                m.a = y2d;
                if (i2 != 0) {
                    String b4 = lx62.b(HTTP.CONTENT_ENCODING);
                    if (b4 == null) {
                        b4 = null;
                    }
                    if (StringsKt__StringsJVMKt.equals("gzip", b4, true) && d57.a(b3) && (ptc = b3.x) != null) {
                        kv6 kv6 = new kv6(ptc.U());
                        e4 e = lx62.e();
                        e.u(HTTP.CONTENT_ENCODING);
                        e.u(HTTP.CONTENT_LEN);
                        m.f = e.n().e();
                        String b5 = lx62.b(HTTP.CONTENT_TYPE);
                        if (b5 == null) {
                            b5 = null;
                        }
                        m.g = new ptc(b5, -1, new gtc(kv6));
                    }
                }
                return m.a();
            case 1:
                y2d y2d2 = otc2.f;
                Class<Object> cls = Object.class;
                String str = cls.cast(y2d2.f.get(cls)) instanceof String ? (String) cls.cast(y2d2.f.get(cls)) : "NO_TAG";
                long nanoTime = System.nanoTime();
                Locale locale = Locale.US;
                ce ceVar = otc2.e;
                mtc mtc = ceVar != null ? (mtc) ceVar.b : null;
                String str2 = (String) this.b;
                z68.c(str2, "Sending request: url = " + y2d2.b + ", tag = " + str + ", connection = " + mtc + ", headers = {" + y2d2.d.toString().replace("\n", ", ") + "}", new Object[0]);
                try {
                    k4d b6 = otc2.b(y2d2);
                    long convert = TimeUnit.MILLISECONDS.convert(Math.abs(System.nanoTime() - nanoTime), TimeUnit.NANOSECONDS);
                    m57 m572 = b6.a.b;
                    int i5 = b6.o;
                    if (!(i5 == 307 || i5 == 308)) {
                        switch (i5) {
                            case HttpStatus.SC_MULTIPLE_CHOICES /*300*/:
                            case HttpStatus.SC_MOVED_PERMANENTLY /*301*/:
                            case HttpStatus.SC_MOVED_TEMPORARILY /*302*/:
                            case HttpStatus.SC_SEE_OTHER /*303*/:
                                break;
                            default:
                                z = false;
                                break;
                        }
                    }
                    z = true;
                    String str3 = "Received response: url = " + m572 + ", tag = " + str + ", code = " + i5 + ", isRedirect=" + z + ". Takes " + convert + "ms, headers = {" + b6.w.toString().replace("\n", ", ") + "}";
                    if (b6.isSuccessful()) {
                        z68.c(str2, str3, new Object[0]);
                    } else {
                        z68.f(str2, str3, (Throwable) null);
                    }
                    return b6;
                } catch (ClassCastException unused) {
                    throw new IOException("ClassCastException");
                }
            default:
                y2d y2d3 = otc2.f;
                jtc jtc = otc2.b;
                List emptyList2 = CollectionsKt.emptyList();
                k4d k4d = null;
                int i6 = 0;
                y2d y2d4 = y2d3;
                boolean z3 = true;
                while (jtc.z == null) {
                    synchronized (jtc) {
                        if (!(jtc.Y ^ z2)) {
                            throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                        } else if (jtc.X ^ z2) {
                            Unit unit = Unit.INSTANCE;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    if (z3) {
                        ntc ntc = jtc.a;
                        m57 m573 = y2d4.b;
                        boolean z4 = m573.a;
                        rla rla = jtc.y0;
                        if (z4) {
                            SSLSocketFactory sSLSocketFactory2 = rla.y0;
                            if (sSLSocketFactory2 != null) {
                                HostnameVerifier hostnameVerifier2 = rla.C0;
                                wy1 = rla.D0;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                        } else {
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            wy1 = null;
                        }
                        list = emptyList2;
                        i3 = i6;
                        jtc.w = new t95(ntc, new za(m573.e, m573.f, rla.Y, rla.x0, sSLSocketFactory, hostnameVerifier, wy1, rla.w0, rla.Z, rla.B0, rla.A0, rla.v0), jtc);
                    } else {
                        list = emptyList2;
                        i3 = i6;
                    }
                    try {
                        if (!jtc.v0) {
                            k4d b7 = otc2.b(y2d4);
                            if (k4d != null) {
                                j4d m2 = b7.m();
                                j4d m3 = k4d.m();
                                m3.g = null;
                                k4d a3 = m3.a();
                                if (a3.x == null) {
                                    m2.j = a3;
                                    b7 = m2.a();
                                } else {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                            }
                            k4d = b7;
                            ce ceVar2 = jtc.z;
                            y2d4 = b(k4d, ceVar2);
                            if (y2d4 == null) {
                                if (ceVar2 != null && ceVar2.a) {
                                    if (!jtc.y) {
                                        jtc.y = true;
                                        jtc.c.j();
                                    } else {
                                        throw new IllegalStateException("Check failed.".toString());
                                    }
                                }
                                jtc.i(false);
                                return k4d;
                            }
                            ptc ptc2 = k4d.x;
                            if (ptc2 != null) {
                                u0g.c(ptc2);
                            }
                            i6 = i3 + 1;
                            if (i6 <= 20) {
                                jtc.i(true);
                                emptyList2 = list;
                                z3 = true;
                                z2 = true;
                            } else {
                                throw new ProtocolException("Too many follow-up requests: " + i6);
                            }
                        } else {
                            throw new IOException("Canceled");
                        }
                    } catch (RouteException e2) {
                        List list2 = list;
                        RouteException routeException = e2;
                        if (c(routeException.a, jtc, y2d4, false)) {
                            emptyList2 = CollectionsKt.plus(list2, routeException.b);
                            jtc.i(true);
                            z2 = true;
                            i6 = i3;
                            z3 = false;
                        } else {
                            IOException iOException = routeException.b;
                            u0g.y(iOException, list2);
                            throw iOException;
                        }
                    } catch (IOException e3) {
                        IOException iOException2 = e3;
                        if (c(iOException2, jtc, y2d4, !(iOException2 instanceof ConnectionShutdownException))) {
                            emptyList2 = CollectionsKt.plus(list, iOException2);
                            jtc.i(true);
                            z2 = true;
                            i6 = i3;
                            z3 = false;
                        } else {
                            u0g.y(iOException2, list);
                            throw iOException2;
                        }
                    } catch (Throwable th) {
                        jtc.i(true);
                        throw th;
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = (defpackage.mtc) r11.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.y2d b(defpackage.k4d r10, defpackage.ce r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 == 0) goto L_0x000c
            java.lang.Object r1 = r11.b
            mtc r1 = (defpackage.mtc) r1
            if (r1 == 0) goto L_0x000c
            c9d r1 = r1.q
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r2 = r10.o
            y2d r3 = r10.a
            java.lang.String r3 = r3.c
            r4 = 0
            r5 = 308(0x134, float:4.32E-43)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 1
            if (r2 == r6) goto L_0x00bc
            if (r2 == r5) goto L_0x00bc
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto L_0x00b2
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L_0x0083
            r11 = 503(0x1f7, float:7.05E-43)
            if (r2 == r11) goto L_0x006d
            r11 = 407(0x197, float:5.7E-43)
            if (r2 == r11) goto L_0x0051
            r11 = 408(0x198, float:5.72E-43)
            if (r2 == r11) goto L_0x0035
            switch(r2) {
                case 300: goto L_0x00bc;
                case 301: goto L_0x00bc;
                case 302: goto L_0x00bc;
                case 303: goto L_0x00bc;
                default: goto L_0x0034;
            }
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.Object r9 = r9.b
            rla r9 = (defpackage.rla) r9
            boolean r9 = r9.w
            if (r9 != 0) goto L_0x003e
            return r0
        L_0x003e:
            k4d r9 = r10.X
            if (r9 == 0) goto L_0x0047
            int r9 = r9.o
            if (r9 != r11) goto L_0x0047
            return r0
        L_0x0047:
            int r9 = d(r10, r4)
            if (r9 <= 0) goto L_0x004e
            return r0
        L_0x004e:
            y2d r9 = r10.a
            return r9
        L_0x0051:
            java.net.Proxy r10 = r1.b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x0065
            java.lang.Object r9 = r9.b
            rla r9 = (defpackage.rla) r9
            sq6 r9 = r9.w0
            r9.getClass()
            return r0
        L_0x0065:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r9.<init>(r10)
            throw r9
        L_0x006d:
            k4d r9 = r10.X
            if (r9 == 0) goto L_0x0076
            int r9 = r9.o
            if (r9 != r11) goto L_0x0076
            return r0
        L_0x0076:
            r9 = 2147483647(0x7fffffff, float:NaN)
            int r9 = d(r10, r9)
            if (r9 != 0) goto L_0x0082
            y2d r9 = r10.a
            return r9
        L_0x0082:
            return r0
        L_0x0083:
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r9 = r11.v
            t95 r9 = (defpackage.t95) r9
            za r9 = r9.h
            m57 r9 = r9.a
            java.lang.String r9 = r9.e
            java.lang.Object r1 = r11.b
            mtc r1 = (defpackage.mtc) r1
            c9d r1 = r1.q
            za r1 = r1.a
            m57 r1 = r1.a
            java.lang.String r1 = r1.e
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r1)
            r9 = r9 ^ r7
            if (r9 != 0) goto L_0x00a3
            goto L_0x00b1
        L_0x00a3:
            java.lang.Object r9 = r11.b
            mtc r9 = (defpackage.mtc) r9
            monitor-enter(r9)
            r9.j = r7     // Catch:{ all -> 0x00ae }
            monitor-exit(r9)
            y2d r9 = r10.a
            return r9
        L_0x00ae:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00ae }
            throw r10
        L_0x00b1:
            return r0
        L_0x00b2:
            java.lang.Object r9 = r9.b
            rla r9 = (defpackage.rla) r9
            sq6 r9 = r9.x
            r9.getClass()
            return r0
        L_0x00bc:
            java.lang.Object r9 = r9.b
            rla r9 = (defpackage.rla) r9
            boolean r11 = r9.y
            if (r11 != 0) goto L_0x00c6
            goto L_0x0155
        L_0x00c6:
            java.lang.String r11 = "Location"
            lx6 r1 = r10.w
            java.lang.String r11 = r1.b(r11)
            if (r11 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            if (r11 == 0) goto L_0x0155
            y2d r1 = r10.a
            m57 r2 = r1.b
            r2.getClass()
            sd3 r8 = new sd3     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x00e4 }
            r8.n(r2, r11)     // Catch:{ IllegalArgumentException -> 0x00e4 }
            goto L_0x00e5
        L_0x00e4:
            r8 = r0
        L_0x00e5:
            if (r8 == 0) goto L_0x00ec
            m57 r11 = r8.c()
            goto L_0x00ed
        L_0x00ec:
            r11 = r0
        L_0x00ed:
            if (r11 == 0) goto L_0x0155
            m57 r2 = r1.b
            java.lang.String r2 = r2.b
            java.lang.String r8 = r11.b
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x0100
            boolean r9 = r9.z
            if (r9 != 0) goto L_0x0100
            goto L_0x0155
        L_0x0100:
            hr6 r9 = r1.a()
            boolean r2 = defpackage.tf6.d0(r3)
            if (r2 == 0) goto L_0x0142
            java.lang.String r2 = "PROPFIND"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            int r10 = r10.o
            if (r8 != 0) goto L_0x0118
            if (r10 == r5) goto L_0x0118
            if (r10 != r6) goto L_0x0119
        L_0x0118:
            r4 = r7
        L_0x0119:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x012a
            if (r10 == r5) goto L_0x012a
            if (r10 == r6) goto L_0x012a
            java.lang.String r10 = "GET"
            r9.r(r10, r0)
            goto L_0x0131
        L_0x012a:
            if (r4 == 0) goto L_0x012e
            hd8 r0 = r1.e
        L_0x012e:
            r9.r(r3, r0)
        L_0x0131:
            if (r4 != 0) goto L_0x0142
            java.lang.String r10 = "Transfer-Encoding"
            r9.s(r10)
            java.lang.String r10 = "Content-Length"
            r9.s(r10)
            java.lang.String r10 = "Content-Type"
            r9.s(r10)
        L_0x0142:
            m57 r10 = r1.b
            boolean r10 = defpackage.u0g.a(r10, r11)
            if (r10 != 0) goto L_0x014f
            java.lang.String r10 = "Authorization"
            r9.s(r10)
        L_0x014f:
            r9.a = r11
            y2d r0 = r9.c()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js0.b(k4d, ce):y2d");
    }

    public boolean c(IOException iOException, jtc jtc, y2d y2d, boolean z) {
        boolean z2;
        sb0 sb0;
        mtc mtc;
        if (!((rla) this.b).w) {
            return false;
        }
        if (z) {
            hd8 hd8 = y2d.e;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        t95 t95 = jtc.w;
        int i = t95.c;
        if (i == 0 && t95.d == 0 && t95.e == 0) {
            z2 = false;
        } else {
            if (t95.f == null) {
                c9d c9d = null;
                if (i <= 1 && t95.d <= 1 && t95.e <= 0 && (mtc = t95.i.x) != null) {
                    synchronized (mtc) {
                        if (mtc.k == 0) {
                            if (u0g.a(mtc.q.a.a, t95.h.a)) {
                                c9d = mtc.q;
                            }
                        }
                    }
                }
                if (c9d != null) {
                    t95.f = c9d;
                } else {
                    kk3 kk3 = t95.a;
                    if ((kk3 == null || !kk3.f()) && (sb0 = t95.b) != null) {
                        z2 = sb0.c();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }
}
