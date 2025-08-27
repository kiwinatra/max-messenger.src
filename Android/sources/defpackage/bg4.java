package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
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

/* renamed from: bg4  reason: default package */
public final class bg4 extends dj0 {
    public long A0;
    public long B0;
    public final fj X;
    public final fj Y;
    public final msb Z;
    public final boolean v;
    public final boolean v0;
    public final boolean w = false;
    public HttpURLConnection w0;
    public final int x;
    public InputStream x0;
    public final int y;
    public boolean y0;
    public final String z;
    public int z0;

    public bg4(String str, int i, int i2, boolean z2, fj fjVar) {
        super(true);
        this.z = str;
        this.x = i;
        this.y = i2;
        this.v = z2;
        this.X = fjVar;
        this.Z = null;
        this.Y = new fj(12, (byte) 0);
        this.v0 = false;
    }

    public static void k(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection != null && v0g.a <= 20) {
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

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long G(defpackage.q74 r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = 0
            r1.B0 = r2
            r1.A0 = r2
            r22.c()
            r4 = 1
            java.net.HttpURLConnection r5 = r22.g(r23)     // Catch:{ IOException -> 0x01cc }
            r1.w0 = r5     // Catch:{ IOException -> 0x01cc }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x01cc }
            r1.z0 = r6     // Catch:{ IOException -> 0x01cc }
            r5.getResponseMessage()     // Catch:{ IOException -> 0x01cc }
            int r6 = r1.z0
            java.lang.String r7 = "Content-Range"
            r8 = 200(0xc8, float:2.8E-43)
            r9 = -1
            long r11 = r0.f
            long r13 = r0.g
            if (r6 < r8) goto L_0x002f
            r15 = 299(0x12b, float:4.19E-43)
            if (r6 <= r15) goto L_0x0033
        L_0x002f:
            r18 = r2
            goto L_0x0161
        L_0x0033:
            java.lang.String r6 = r5.getContentType()
            msb r15 = r1.Z
            if (r15 == 0) goto L_0x0053
            boolean r15 = r15.apply(r6)
            if (r15 == 0) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            r22.e()
            androidx.media3.datasource.HttpDataSource$InvalidContentTypeException r0 = new androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
            java.lang.String r1 = "Invalid content type: "
            java.lang.String r1 = defpackage.a81.m(r1, r6)
            r2 = 2003(0x7d3, float:2.807E-42)
            r0.<init>(r1, r2)
            throw r0
        L_0x0053:
            int r6 = r1.z0
            if (r6 != r8) goto L_0x005c
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r11 = r2
        L_0x005d:
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r6 = r5.getHeaderField(r6)
            java.lang.String r8 = "gzip"
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 != 0) goto L_0x0122
            int r8 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0073
            r1.A0 = r13
            goto L_0x0124
        L_0x0073:
            java.lang.String r8 = "Content-Length"
            java.lang.String r8 = r5.getHeaderField(r8)
            java.lang.String r7 = r5.getHeaderField(r7)
            java.util.regex.Pattern r13 = defpackage.s57.a
            java.lang.String r13 = "Inconsistent headers ["
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r15 = "]"
            if (r14 != 0) goto L_0x00a4
            long r16 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0090 }
            r9 = r16
            goto L_0x00a6
        L_0x0090:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected Content-Length ["
            r14.<init>(r9)
            r14.append(r8)
            r14.append(r15)
            java.lang.String r9 = r14.toString()
            defpackage.i8b.o(r9)
        L_0x00a4:
            r9 = -1
        L_0x00a6:
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            if (r14 != 0) goto L_0x00ff
            java.util.regex.Pattern r14 = defpackage.s57.a
            java.util.regex.Matcher r14 = r14.matcher(r7)
            boolean r18 = r14.matches()
            if (r18 == 0) goto L_0x00ff
            r2 = 2
            java.lang.String r2 = r14.group(r2)     // Catch:{ NumberFormatException -> 0x0102 }
            r2.getClass()     // Catch:{ NumberFormatException -> 0x0102 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0102 }
            java.lang.String r14 = r14.group(r4)     // Catch:{ NumberFormatException -> 0x0102 }
            r14.getClass()     // Catch:{ NumberFormatException -> 0x0102 }
            long r20 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x0102 }
            long r2 = r2 - r20
            r20 = 1
            long r2 = r2 + r20
            r18 = 0
            int r14 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x00dd
            r9 = r2
            goto L_0x00ff
        L_0x00dd:
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x00ff
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0102 }
            r14.<init>(r13)     // Catch:{ NumberFormatException -> 0x0102 }
            r14.append(r8)     // Catch:{ NumberFormatException -> 0x0102 }
            java.lang.String r8 = "] ["
            r14.append(r8)     // Catch:{ NumberFormatException -> 0x0102 }
            r14.append(r7)     // Catch:{ NumberFormatException -> 0x0102 }
            r14.append(r15)     // Catch:{ NumberFormatException -> 0x0102 }
            java.lang.String r8 = r14.toString()     // Catch:{ NumberFormatException -> 0x0102 }
            defpackage.i8b.V(r8)     // Catch:{ NumberFormatException -> 0x0102 }
            long r9 = java.lang.Math.max(r9, r2)     // Catch:{ NumberFormatException -> 0x0102 }
        L_0x00ff:
            r2 = -1
            goto L_0x0117
        L_0x0102:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected Content-Range ["
            r2.<init>(r3)
            r2.append(r7)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            defpackage.i8b.o(r2)
            goto L_0x00ff
        L_0x0117:
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x011d
            long r9 = r9 - r11
            goto L_0x011f
        L_0x011d:
            r9 = -1
        L_0x011f:
            r1.A0 = r9
            goto L_0x0124
        L_0x0122:
            r1.A0 = r13
        L_0x0124:
            r2 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r3 = r5.getInputStream()     // Catch:{ IOException -> 0x0138 }
            r1.x0 = r3     // Catch:{ IOException -> 0x0138 }
            if (r6 == 0) goto L_0x013a
            java.util.zip.GZIPInputStream r3 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0138 }
            java.io.InputStream r5 = r1.x0     // Catch:{ IOException -> 0x0138 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0138 }
            r1.x0 = r3     // Catch:{ IOException -> 0x0138 }
            goto L_0x013a
        L_0x0138:
            r0 = move-exception
            goto L_0x0158
        L_0x013a:
            r1.y0 = r4
            r22.d(r23)
            r1.l(r11)     // Catch:{ IOException -> 0x0145 }
            long r0 = r1.A0
            return r0
        L_0x0145:
            r0 = move-exception
            r3 = r0
            r22.e()
            boolean r0 = r3 instanceof androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            if (r0 == 0) goto L_0x0152
            r0 = r3
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r0 = (androidx.media3.datasource.HttpDataSource$HttpDataSourceException) r0
            throw r0
        L_0x0152:
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r0 = new androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            r0.<init>((int) r2, (int) r4, (java.io.IOException) r3)
            throw r0
        L_0x0158:
            r22.e()
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r1 = new androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            r1.<init>((int) r2, (int) r4, (java.io.IOException) r0)
            throw r1
        L_0x0161:
            java.util.Map r2 = r5.getHeaderFields()
            int r3 = r1.z0
            r6 = 416(0x1a0, float:5.83E-43)
            if (r3 != r6) goto L_0x01a5
            java.lang.String r3 = r5.getHeaderField(r7)
            java.util.regex.Pattern r7 = defpackage.s57.a
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L_0x017a
        L_0x0177:
            r7 = -1
            goto L_0x0191
        L_0x017a:
            java.util.regex.Pattern r7 = defpackage.s57.b
            java.util.regex.Matcher r3 = r7.matcher(r3)
            boolean r7 = r3.matches()
            if (r7 == 0) goto L_0x0177
            java.lang.String r3 = r3.group(r4)
            r3.getClass()
            long r7 = java.lang.Long.parseLong(r3)
        L_0x0191:
            int r3 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x01a5
            r1.y0 = r4
            r22.d(r23)
            r0 = -1
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a2
            r2 = r13
            goto L_0x01a4
        L_0x01a2:
            r2 = r18
        L_0x01a4:
            return r2
        L_0x01a5:
            java.io.InputStream r0 = r5.getErrorStream()
            if (r0 == 0) goto L_0x01af
            defpackage.uw0.b(r0)     // Catch:{ IOException -> 0x01b2 }
            goto L_0x01b4
        L_0x01af:
            int r0 = defpackage.v0g.a     // Catch:{ IOException -> 0x01b2 }
            goto L_0x01b4
        L_0x01b2:
            int r0 = defpackage.v0g.a
        L_0x01b4:
            r22.e()
            int r0 = r1.z0
            if (r0 != r6) goto L_0x01c3
            androidx.media3.datasource.DataSourceException r0 = new androidx.media3.datasource.DataSourceException
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)
            goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r3 = new androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            int r1 = r1.z0
            r3.<init>(r1, r0, r2)
            throw r3
        L_0x01cc:
            r0 = move-exception
            r22.e()
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r0 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.b(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg4.G(q74):long");
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
            int i = v0g.a;
            throw new HttpDataSource$HttpDataSourceException(2000, 3, e);
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
                i8b.p("Unexpected error while disconnecting", e);
            }
            this.w0 = null;
        }
    }

    public final URL f(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !HttpHost.DEFAULT_SCHEME_NAME.equals(protocol)) {
                    throw new HttpDataSource$HttpDataSourceException(a81.m("Unsupported protocol redirect: ", protocol), 2001);
                } else if (this.v || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    if (this.w) {
                        try {
                            return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                        } catch (MalformedURLException e) {
                            throw new HttpDataSource$HttpDataSourceException(2001, 1, (IOException) e);
                        }
                    } else {
                        throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                    }
                }
            } catch (MalformedURLException e2) {
                throw new HttpDataSource$HttpDataSourceException(2001, 1, (IOException) e2);
            }
        } else {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
        }
    }

    public final HttpURLConnection g(q74 q74) {
        HttpURLConnection i;
        q74 q742 = q74;
        URL url = new URL(q742.a.toString());
        int i2 = 0;
        boolean z2 = (q742.i & 1) == 1;
        boolean z3 = this.v;
        boolean z4 = this.v0;
        int i3 = q742.c;
        byte[] bArr = q742.d;
        long j = q742.f;
        long j2 = q742.g;
        if (!z3 && !this.w && !z4) {
            return i(url, i3, bArr, j, j2, z2, true, q742.e);
        }
        URL url2 = url;
        byte[] bArr2 = bArr;
        int i4 = i3;
        while (true) {
            int i5 = i2 + 1;
            if (i2 <= 20) {
                Map map = q742.e;
                int i6 = i4;
                int i7 = i5;
                long j3 = j2;
                URL url3 = url2;
                long j4 = j;
                i = i(url2, i4, bArr2, j, j2, z2, false, map);
                int responseCode = i.getResponseCode();
                String headerField = i.getHeaderField("Location");
                if ((i6 == 1 || i6 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    URL url4 = url3;
                    i.disconnect();
                    url2 = f(url4, headerField);
                    i4 = i6;
                } else if (i6 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return i;
                } else {
                    i.disconnect();
                    if (!z4 || responseCode != 302) {
                        bArr2 = null;
                        i4 = 1;
                    } else {
                        i4 = i6;
                    }
                    url2 = f(url3, headerField);
                }
                q742 = q74;
                i2 = i7;
                j2 = j3;
                j = j4;
            } else {
                throw new HttpDataSource$HttpDataSourceException(2001, 1, (IOException) new NoRouteToHostException(wj6.h(i5, "Too many redirects: ")));
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
        httpURLConnection.setConnectTimeout(this.x);
        httpURLConnection.setReadTimeout(this.y);
        HashMap hashMap = new HashMap();
        fj fjVar = this.X;
        if (fjVar != null) {
            hashMap.putAll(fjVar.s());
        }
        hashMap.putAll(this.Y.s());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = s57.a;
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
        String str3 = this.z;
        if (str3 != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str3);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = q74.k;
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

    public final void l(long j) {
        if (j != 0) {
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            while (j > 0) {
                InputStream inputStream = this.x0;
                int i = v0g.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, (long) ConstantsKt.DEFAULT_BLOCK_SIZE));
                if (Thread.currentThread().isInterrupted()) {
                    throw new HttpDataSource$HttpDataSourceException(2000, 1, (IOException) new InterruptedIOException());
                } else if (read != -1) {
                    j -= (long) read;
                    a(read);
                } else {
                    throw new HttpDataSource$HttpDataSourceException();
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
            int i3 = v0g.a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.B0 += (long) read;
            a(read);
            return read;
        } catch (IOException e) {
            int i4 = v0g.a;
            throw HttpDataSource$HttpDataSourceException.b(2, e);
        }
    }

    public final Map x() {
        HttpURLConnection httpURLConnection = this.w0;
        return httpURLConnection == null ? p0d.y : new zf4(1, httpURLConnection.getHeaderFields());
    }
}
