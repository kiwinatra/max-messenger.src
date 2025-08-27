package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* renamed from: ag4  reason: default package */
public final class ag4 extends cj0 implements o47 {
    public long A0;
    public long B0;
    public final dm4 X;
    public final boolean Y;
    public final msb Z;
    public final boolean v = false;
    public p74 v0;
    public final int w;
    public HttpURLConnection w0;
    public final int x;
    public InputStream x0;
    public final String y;
    public boolean y0;
    public final dm4 z;
    public int z0;

    public ag4(String str, int i, int i2, dm4 dm4) {
        super(true);
        this.y = str;
        this.w = i;
        this.x = i2;
        this.z = dm4;
        this.Z = null;
        this.X = new dm4(15);
        this.Y = false;
    }

    public static void k(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = t0g.a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", (Class[]) null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, (Object[]) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.p74 r20) {
        /*
            r19 = this;
            r1 = r19
            r6 = r20
            r1.v0 = r6
            r2 = 0
            r1.B0 = r2
            r1.A0 = r2
            r19.c()
            java.net.HttpURLConnection r0 = r19.g(r20)     // Catch:{ IOException -> 0x01c5 }
            r1.w0 = r0     // Catch:{ IOException -> 0x01c5 }
            int r5 = r0.getResponseCode()     // Catch:{ IOException -> 0x01c5 }
            r1.z0 = r5     // Catch:{ IOException -> 0x01c5 }
            java.lang.String r5 = r0.getResponseMessage()     // Catch:{ IOException -> 0x01c5 }
            int r7 = r1.z0
            java.lang.String r8 = "Content-Range"
            r9 = 200(0xc8, float:2.8E-43)
            r10 = -1
            long r12 = r6.f
            long r14 = r6.g
            if (r7 < r9) goto L_0x013b
            r4 = 299(0x12b, float:4.19E-43)
            if (r7 <= r4) goto L_0x0033
            goto L_0x013b
        L_0x0033:
            java.lang.String r4 = r0.getContentType()
            msb r5 = r1.Z
            if (r5 == 0) goto L_0x004b
            boolean r5 = r5.apply(r4)
            if (r5 == 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            r19.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r4, r6)
            throw r0
        L_0x004b:
            int r4 = r1.z0
            if (r4 != r9) goto L_0x0054
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r12 = r2
        L_0x0055:
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r0.getHeaderField(r4)
            java.lang.String r5 = "gzip"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x00f9
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x006b
            r1.A0 = r14
            goto L_0x00fb
        L_0x006b:
            java.lang.String r5 = "Content-Length"
            java.lang.String r5 = r0.getHeaderField(r5)
            java.lang.String r7 = r0.getHeaderField(r8)
            java.util.regex.Pattern r8 = defpackage.r57.a
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x008d
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0082 }
            goto L_0x008e
        L_0x0082:
            r8 = 28
            int r8 = defpackage.g63.f(r8, r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
        L_0x008d:
            r8 = r10
        L_0x008e:
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L_0x00f0
            java.util.regex.Pattern r14 = defpackage.r57.a
            java.util.regex.Matcher r14 = r14.matcher(r7)
            boolean r15 = r14.matches()
            if (r15 == 0) goto L_0x00f0
            r15 = 2
            java.lang.String r15 = r14.group(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15.getClass()     // Catch:{ NumberFormatException -> 0x00e5 }
            long r17 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15 = 1
            java.lang.String r14 = r14.group(r15)     // Catch:{ NumberFormatException -> 0x00e5 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x00e5 }
            long r14 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x00e5 }
            long r17 = r17 - r14
            r14 = 1
            long r14 = r17 + r14
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c4
            r8 = r14
            goto L_0x00f0
        L_0x00c4:
            int r2 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x00f0
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2.length()     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2 + 26
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x00e5 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e5 }
            r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x00e5 }
            long r8 = java.lang.Math.max(r8, r14)     // Catch:{ NumberFormatException -> 0x00e5 }
            goto L_0x00f0
        L_0x00e5:
            r2 = 27
            int r2 = defpackage.g63.f(r2, r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L_0x00f0:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00f6
            long r10 = r8 - r12
        L_0x00f6:
            r1.A0 = r10
            goto L_0x00fb
        L_0x00f9:
            r1.A0 = r14
        L_0x00fb:
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0110 }
            r1.x0 = r0     // Catch:{ IOException -> 0x0110 }
            if (r4 == 0) goto L_0x010e
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0110 }
            java.io.InputStream r3 = r1.x0     // Catch:{ IOException -> 0x0110 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            r1.x0 = r0     // Catch:{ IOException -> 0x0110 }
        L_0x010e:
            r3 = 1
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            r4 = 1
            goto L_0x0132
        L_0x0113:
            r1.y0 = r3
            r19.d(r20)
            r1.l(r12, r6)     // Catch:{ IOException -> 0x011e }
            long r0 = r1.A0
            return r0
        L_0x011e:
            r0 = move-exception
            r3 = r0
            r19.e()
            boolean r0 = r3 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            if (r0 == 0) goto L_0x012b
            r0 = r3
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = (com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException) r0
            throw r0
        L_0x012b:
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r4 = 1
            r0.<init>((java.io.IOException) r3, (defpackage.p74) r6, (int) r2, (int) r4)
            throw r0
        L_0x0132:
            r19.e()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1.<init>((java.io.IOException) r0, (defpackage.p74) r6, (int) r2, (int) r4)
            throw r1
        L_0x013b:
            java.util.Map r7 = r0.getHeaderFields()
            int r4 = r1.z0
            r9 = 416(0x1a0, float:5.83E-43)
            if (r4 != r9) goto L_0x0180
            java.lang.String r4 = r0.getHeaderField(r8)
            java.util.regex.Pattern r8 = defpackage.r57.a
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 == 0) goto L_0x0155
            r16 = r10
            r8 = 1
            goto L_0x0171
        L_0x0155:
            java.util.regex.Pattern r8 = defpackage.r57.b
            java.util.regex.Matcher r4 = r8.matcher(r4)
            boolean r8 = r4.matches()
            if (r8 == 0) goto L_0x016e
            r8 = 1
            java.lang.String r4 = r4.group(r8)
            r4.getClass()
            long r16 = java.lang.Long.parseLong(r4)
            goto L_0x0171
        L_0x016e:
            r8 = 1
            r16 = r10
        L_0x0171:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0180
            r1.y0 = r8
            r19.d(r20)
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x017f
            r2 = r14
        L_0x017f:
            return r2
        L_0x0180:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x01a1
            int r2 = defpackage.t0g.a     // Catch:{ IOException -> 0x01a4 }
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x01a4 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x01a4 }
            r3.<init>()     // Catch:{ IOException -> 0x01a4 }
        L_0x0191:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x01a4 }
            r8 = -1
            if (r4 == r8) goto L_0x019d
            r8 = 0
            r3.write(r2, r8, r4)     // Catch:{ IOException -> 0x01a4 }
            goto L_0x0191
        L_0x019d:
            r3.toByteArray()     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a6
        L_0x01a1:
            int r0 = defpackage.t0g.a     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a6
        L_0x01a4:
            int r0 = defpackage.t0g.a
        L_0x01a6:
            r19.e()
            int r0 = r1.z0
            if (r0 != r9) goto L_0x01b6
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException
            r2 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r2)
        L_0x01b4:
            r4 = r0
            goto L_0x01b8
        L_0x01b6:
            r0 = 0
            goto L_0x01b4
        L_0x01b8:
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            int r2 = r1.z0
            r1 = r0
            r3 = r5
            r5 = r7
            r6 = r20
            r1.<init>(r2, r3, r4, r5, r6)
            throw r0
        L_0x01c5:
            r0 = move-exception
            r19.e()
            r1 = 1
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r0 = com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException.b(r0, r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag4.N(p74):long");
    }

    public final void close() {
        try {
            InputStream inputStream = this.x0;
            if (inputStream != null) {
                long j = this.A0;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.B0;
                }
                k(this.w0, j2);
                inputStream.close();
            }
            this.x0 = null;
            e();
            if (this.y0) {
                this.y0 = false;
                b();
            }
        } catch (IOException e) {
            p74 p74 = this.v0;
            int i = t0g.a;
            throw new HttpDataSource$HttpDataSourceException(e, p74, 2000, 3);
        } catch (Throwable th) {
            this.x0 = null;
            e();
            if (this.y0) {
                this.y0 = false;
                b();
            }
            throw th;
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.w0;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                iq.a("Unexpected error while disconnecting", e);
            }
            this.w0 = null;
        }
    }

    public final URL f(URL url, String str, p74 p74) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new HttpDataSource$HttpDataSourceException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), p74, 2001);
                } else if (this.v || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(protocol.length() + g63.f(41, protocol2));
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new HttpDataSource$HttpDataSourceException(sb.toString(), p74, 2001);
                }
            } catch (MalformedURLException e) {
                throw new HttpDataSource$HttpDataSourceException((IOException) e, p74, 2001, 1);
            }
        } else {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", p74, 2001);
        }
    }

    public final HttpURLConnection g(p74 p74) {
        HttpURLConnection i;
        ag4 ag4;
        URL url;
        p74 p742 = p74;
        URL url2 = new URL(p742.a.toString());
        int i2 = 0;
        boolean z2 = (p742.i & 1) == 1;
        boolean z3 = this.v;
        boolean z4 = this.Y;
        int i3 = p742.c;
        byte[] bArr = p742.d;
        long j = p742.f;
        long j2 = p742.g;
        if (!z3 && !z4) {
            return i(url2, i3, bArr, j, j2, z2, true, p742.e);
        }
        URL url3 = url2;
        byte[] bArr2 = bArr;
        int i4 = i3;
        while (true) {
            int i5 = i2 + 1;
            if (i2 <= 20) {
                int i6 = i4;
                int i7 = i5;
                long j3 = j2;
                URL url4 = url3;
                long j4 = j;
                i = i(url3, i4, bArr2, j, j2, z2, false, p742.e);
                int responseCode = i.getResponseCode();
                String headerField = i.getHeaderField("Location");
                if ((i6 == 1 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    ag4 = this;
                    i4 = i6;
                    URL url5 = url4;
                    i.disconnect();
                    url = ag4.f(url5, headerField, p742);
                } else if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return i;
                } else {
                    i.disconnect();
                    if (!z4 || responseCode != 302) {
                        bArr2 = null;
                        ag4 = this;
                        i4 = 1;
                    } else {
                        ag4 = this;
                        i4 = i6;
                    }
                    url = ag4.f(url4, headerField, p742);
                }
                url3 = url;
                ag4 ag42 = ag4;
                i2 = i7;
                j2 = j3;
                j = j4;
            } else {
                throw new HttpDataSource$HttpDataSourceException((IOException) new NoRouteToHostException(i2a.h(31, i5, "Too many redirects: ")), p742, 2001, 1);
            }
        }
        return i;
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.w0;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection i(URL url, int i, byte[] bArr, long j, long j2, boolean z2, boolean z3, Map map) {
        String str;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.w);
        httpURLConnection.setReadTimeout(this.x);
        HashMap hashMap = new HashMap();
        dm4 dm4 = this.z;
        if (dm4 != null) {
            hashMap.putAll(dm4.n());
        }
        hashMap.putAll(this.X.n());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = r57.a;
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder n = tr1.n(j, "bytes=", "-");
            if (j2 != -1) {
                n.append((j + j2) - 1);
            }
            str = n.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str3 = this.y;
        if (str3 != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str3);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = p74.k;
        if (i == 1) {
            str2 = HttpGet.METHOD_NAME;
        } else if (i == 2) {
            str2 = HttpPost.METHOD_NAME;
        } else if (i == 3) {
            str2 = HttpHead.METHOD_NAME;
        } else {
            throw new IllegalStateException();
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void l(long j, p74 p74) {
        if (j != 0) {
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            while (j > 0) {
                InputStream inputStream = this.x0;
                int i = t0g.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, (long) ConstantsKt.DEFAULT_BLOCK_SIZE));
                if (Thread.currentThread().isInterrupted()) {
                    throw new HttpDataSource$HttpDataSourceException((IOException) new InterruptedIOException(), p74, 2000, 1);
                } else if (read != -1) {
                    j -= (long) read;
                    a(read);
                } else {
                    throw new DataSourceException(2008);
                }
            }
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.A0;
            if (j != -1) {
                long j2 = j - this.B0;
                if (j2 != 0) {
                    i2 = (int) Math.min((long) i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.x0;
            int i3 = t0g.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.B0 += (long) read;
            a(read);
            return read;
        } catch (IOException e) {
            p74 p74 = this.v0;
            int i4 = t0g.a;
            throw HttpDataSource$HttpDataSourceException.b(e, p74, 2);
        }
    }

    public final Map x() {
        HttpURLConnection httpURLConnection = this.w0;
        return httpURLConnection == null ? p0d.y : new zf4(0, httpURLConnection.getHeaderFields());
    }
}
