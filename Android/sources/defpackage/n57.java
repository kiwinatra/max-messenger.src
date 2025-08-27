package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.UnknownHostException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n57  reason: default package */
public final class n57 {
    public final Context a;
    public final String b;
    public final int c;
    public final int d = 0;
    public final int e = 0;

    public n57(int i, Context context, String str) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    public static void a(HttpURLConnection httpURLConnection, int i, int i2, int i3) {
        int i4;
        if (i != -1) {
            i4 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i);
        } else {
            i4 = -1;
        }
        if (i2 > 0) {
            try {
                httpURLConnection.setConnectTimeout(i2);
            } catch (SecurityException e2) {
                Throwable cause = e2.getCause();
                if (cause != null) {
                    String name = cause.getClass().getName();
                    if (Intrinsics.areEqual((Object) name, (Object) "libcore.io.GaiException") || Intrinsics.areEqual((Object) name, (Object) "android.system.GaiException")) {
                        throw new UnknownHostException();
                    }
                    throw e2;
                }
                throw e2;
            } catch (IllegalArgumentException e3) {
                throw e3;
            } catch (NullPointerException e4) {
                throw e4;
            } catch (Throwable th) {
                if (i4 != -1) {
                    TrafficStats.setThreadStatsTag(i4);
                }
                throw th;
            }
        }
        if (i3 > 0) {
            httpURLConnection.setReadTimeout(i3);
        }
        httpURLConnection.connect();
        if (i4 != -1) {
            TrafficStats.setThreadStatsTag(i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009c, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009f, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0161, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0165, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x009b, code lost:
        r12 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.i57 b(defpackage.d19 r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r12.c
            java.lang.String r2 = (java.lang.String) r2
            java.net.URL r3 = new java.net.URL
            java.lang.Object r4 = r12.b
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r4)
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            boolean r4 = r3 instanceof javax.net.ssl.HttpsURLConnection
            r5 = 0
            if (r4 == 0) goto L_0x00a0
            r4 = r3
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
            java.lang.String r6 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r6 = javax.net.ssl.TrustManagerFactory.getInstance(r6)
            r6.init(r5)
            javax.net.ssl.TrustManager[] r6 = r6.getTrustManagers()
            java.lang.Object r6 = kotlin.collections.ArraysKt.first((T[]) r6)
            javax.net.ssl.X509TrustManager r6 = (javax.net.ssl.X509TrustManager) r6
            int r7 = defpackage.okc.rootca_ssl_rsa2022
            android.content.Context r8 = r11.a
            android.content.Context r8 = r8.getApplicationContext()
            android.content.res.Resources r8 = r8.getResources()
            java.io.InputStream r9 = r8.openRawResource(r7)
            java.lang.String r10 = "X509"
            java.security.cert.CertificateFactory r10 = java.security.cert.CertificateFactory.getInstance(r10)     // Catch:{ all -> 0x0099 }
            java.security.cert.Certificate r10 = r10.generateCertificate(r9)     // Catch:{ all -> 0x0099 }
            kotlin.io.CloseableKt.closeFinally(r9, r5)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            java.lang.String r7 = r8.getResourceEntryName(r7)
            java.lang.String r8 = java.security.KeyStore.getDefaultType()
            java.security.KeyStore r8 = java.security.KeyStore.getInstance(r8)
            r8.load(r5, r5)
            r8.setCertificateEntry(r7, r10)
            java.lang.String r7 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r7 = javax.net.ssl.TrustManagerFactory.getInstance(r7)
            r7.init(r8)
            javax.net.ssl.TrustManager[] r7 = r7.getTrustManagers()
            java.lang.Object r7 = kotlin.collections.ArraysKt.first((T[]) r7)
            javax.net.ssl.X509TrustManager r7 = (javax.net.ssl.X509TrustManager) r7
            r8 = 2
            javax.net.ssl.X509TrustManager[] r8 = new javax.net.ssl.X509TrustManager[r8]
            r8[r0] = r6
            r8[r1] = r7
            yc3 r6 = new yc3
            r6.<init>(r8)
            java.lang.String r7 = "SSL"
            javax.net.ssl.SSLContext r7 = javax.net.ssl.SSLContext.getInstance(r7)
            javax.net.ssl.TrustManager[] r8 = new javax.net.ssl.TrustManager[r1]
            r8[r0] = r6
            r7.init(r5, r8, r5)
            javax.net.ssl.SSLSocketFactory r6 = r7.getSocketFactory()
            r4.setSSLSocketFactory(r6)
            goto L_0x00a0
        L_0x0099:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x009b }
        L_0x009b:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r11)
            throw r12
        L_0x00a0:
            r3.setRequestMethod(r2)     // Catch:{ IOException -> 0x00ad }
            java.lang.String r2 = r11.b     // Catch:{ IOException -> 0x00ad }
            if (r2 == 0) goto L_0x00b0
            java.lang.String r4 = "User-Agent"
            r3.setRequestProperty(r4, r2)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b0
        L_0x00ad:
            r11 = move-exception
            goto L_0x0183
        L_0x00b0:
            java.lang.String r2 = "Content-Type"
            java.lang.Object r12 = r12.a
            h57 r12 = (defpackage.h57) r12
            if (r12 == 0) goto L_0x00d9
            java.lang.String r4 = r12.getContentType()     // Catch:{ IOException -> 0x00ad }
            r3.setRequestProperty(r2, r4)     // Catch:{ IOException -> 0x00ad }
            r3.setDoOutput(r1)     // Catch:{ IOException -> 0x00ad }
            long r6 = r12.getContentLength()     // Catch:{ IOException -> 0x00ad }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00d4
            long r6 = r12.getContentLength()     // Catch:{ IOException -> 0x00ad }
            r3.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00d9
        L_0x00d4:
            r4 = 4096(0x1000, float:5.74E-42)
            r3.setChunkedStreamingMode(r4)     // Catch:{ IOException -> 0x00ad }
        L_0x00d9:
            int r4 = r11.c     // Catch:{ IOException -> 0x00ad }
            int r6 = r11.d     // Catch:{ IOException -> 0x00ad }
            int r11 = r11.e     // Catch:{ IOException -> 0x00ad }
            a(r3, r4, r6, r11)     // Catch:{ IOException -> 0x00ad }
            if (r12 == 0) goto L_0x00f8
            java.io.OutputStream r11 = r3.getOutputStream()     // Catch:{ IOException -> 0x00ad }
            r12.writeTo(r11)     // Catch:{ all -> 0x00f1 }
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f1 }
            kotlin.io.CloseableKt.closeFinally(r11, r5)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00f8
        L_0x00f1:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r11, r12)     // Catch:{ IOException -> 0x00ad }
            throw r0     // Catch:{ IOException -> 0x00ad }
        L_0x00f8:
            int r11 = r3.getResponseCode()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x017c, NullPointerException -> 0x0166 }
            java.lang.String r12 = r3.getResponseMessage()     // Catch:{ IOException -> 0x00ad }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00ad }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ IOException -> 0x00ad }
            java.util.List r2 = (java.util.List) r2     // Catch:{ IOException -> 0x00ad }
            if (r2 == 0) goto L_0x0114
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)     // Catch:{ IOException -> 0x00ad }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00ad }
            if (r2 != 0) goto L_0x0116
        L_0x0114:
            java.lang.String r2 = "application/octet-stream"
        L_0x0116:
            r4 = 400(0x190, float:5.6E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r11 >= r4) goto L_0x013c
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ IOException -> 0x00ad }
            boolean r7 = r4 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ad }
            if (r7 == 0) goto L_0x0127
            java.io.BufferedInputStream r4 = (java.io.BufferedInputStream) r4     // Catch:{ IOException -> 0x00ad }
            goto L_0x012d
        L_0x0127:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ad }
            r7.<init>(r4, r6)     // Catch:{ IOException -> 0x00ad }
            r4 = r7
        L_0x012d:
            byte[] r6 = kotlin.io.ByteStreamsKt.readBytes(r4)     // Catch:{ all -> 0x0135 }
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch:{ IOException -> 0x00ad }
            goto L_0x0154
        L_0x0135:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r11)     // Catch:{ IOException -> 0x00ad }
            throw r12     // Catch:{ IOException -> 0x00ad }
        L_0x013c:
            java.io.InputStream r4 = r3.getErrorStream()     // Catch:{ IOException -> 0x00ad }
            boolean r7 = r4 instanceof java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ad }
            if (r7 == 0) goto L_0x0147
            java.io.BufferedInputStream r4 = (java.io.BufferedInputStream) r4     // Catch:{ IOException -> 0x00ad }
            goto L_0x014d
        L_0x0147:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00ad }
            r7.<init>(r4, r6)     // Catch:{ IOException -> 0x00ad }
            r4 = r7
        L_0x014d:
            byte[] r6 = kotlin.io.ByteStreamsKt.readBytes(r4)     // Catch:{ all -> 0x015f }
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch:{ IOException -> 0x00ad }
        L_0x0154:
            i57 r4 = new i57     // Catch:{ IOException -> 0x00ad }
            mm5 r5 = new mm5     // Catch:{ IOException -> 0x00ad }
            r5.<init>(r1, r2, r6)     // Catch:{ IOException -> 0x00ad }
            r4.<init>(r11, r12, r5, r0)     // Catch:{ IOException -> 0x00ad }
            return r4
        L_0x015f:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r12 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r11)     // Catch:{ IOException -> 0x00ad }
            throw r12     // Catch:{ IOException -> 0x00ad }
        L_0x0166:
            r11 = move-exception
            java.lang.String r12 = r11.getMessage()     // Catch:{ IOException -> 0x00ad }
            if (r12 == 0) goto L_0x017b
            java.lang.String r0 = "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'"
            boolean r12 = kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r12, r0, false, 2, (java.lang.Object) null)     // Catch:{ IOException -> 0x00ad }
            if (r12 == 0) goto L_0x017b
            java.io.IOException r12 = new java.io.IOException     // Catch:{ IOException -> 0x00ad }
            r12.<init>(r11)     // Catch:{ IOException -> 0x00ad }
            throw r12     // Catch:{ IOException -> 0x00ad }
        L_0x017b:
            throw r11     // Catch:{ IOException -> 0x00ad }
        L_0x017c:
            r11 = move-exception
            java.io.IOException r12 = new java.io.IOException     // Catch:{ IOException -> 0x00ad }
            r12.<init>(r11)     // Catch:{ IOException -> 0x00ad }
            throw r12     // Catch:{ IOException -> 0x00ad }
        L_0x0183:
            r3.disconnect()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n57.b(d19):i57");
    }
}
