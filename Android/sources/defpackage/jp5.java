package defpackage;

import android.content.Context;
import android.util.JsonReader;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jp5  reason: default package */
public final class jp5 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final m9c b;
    public final e3d c = new e3d();

    public jp5(Context context, m9c m9c) {
        this.a = context;
        this.b = m9c;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.io.InputStream r5 = r3.getErrorStream()
            r6 = 0
            if (r5 != 0) goto L_0x0008
            goto L_0x0048
        L_0x0008:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r2 = e
            r1.<init>(r5, r2)
            r0.<init>(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r5.<init>()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0019:
            java.lang.String r1 = r0.readLine()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            if (r1 == 0) goto L_0x002a
            r5.append(r1)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r1 = 10
            r5.append(r1)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            goto L_0x0019
        L_0x0028:
            r3 = move-exception
            goto L_0x0044
        L_0x002a:
            java.lang.String r1 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r3 = r3.getResponseMessage()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3, r5}     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r6 = java.lang.String.format(r1, r3)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0040:
            r0.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0044:
            r0.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r3
        L_0x0048:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x005f
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L_0x0055
            goto L_0x005f
        L_0x0055:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = ", "
            r3.<init>(r5)
            r3.append(r4)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp5.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        vzg.f("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static eb0 e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        cs a2 = sc0.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        sc0 sc0 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(ApiProtocol.KEY_TOKEN)) {
                        a2.c = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.o = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                sc0 d2 = a2.d();
                jsonReader.endObject();
                sc0 = d2;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new eb0(str, str2, str3, sc0, 1);
    }

    public static sc0 f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        cs a2 = sc0.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(ApiProtocol.KEY_TOKEN)) {
                a2.c = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.o = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b = 1;
        return a2.d();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", (Object) str);
            jSONObject.put("appId", (Object) str2);
            jSONObject.put("authVersion", (Object) "FIS_v2");
            jSONObject.put("sdkVersion", (Object) "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", (Object) "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", (Object) jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a A[Catch:{ NameNotFoundException -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e A[Catch:{ NameNotFoundException -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection c(java.net.URL r8, java.lang.String r9) {
        /*
            r7 = this;
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ IOException -> 0x00d4 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x00d4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r8.setConnectTimeout(r0)
            r1 = 0
            r8.setUseCaches(r1)
            r8.setReadTimeout(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/json"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Accept"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r8.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r8.addRequestProperty(r0, r2)
            android.content.Context r0 = r7.a
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r8.addRequestProperty(r3, r2)
            m9c r7 = r7.b
            java.lang.Object r7 = r7.get()
            tx6 r7 = (defpackage.tx6) r7
            if (r7 == 0) goto L_0x005a
            java.lang.String r2 = "x-firebase-client"
            pf4 r7 = (defpackage.pf4) r7     // Catch:{ ExecutionException -> 0x005a, InterruptedException -> 0x0053 }
            s7h r7 = r7.a()     // Catch:{ ExecutionException -> 0x005a, InterruptedException -> 0x0053 }
            java.lang.Object r7 = defpackage.hsg.c(r7)     // Catch:{ ExecutionException -> 0x005a, InterruptedException -> 0x0053 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ ExecutionException -> 0x005a, InterruptedException -> 0x0053 }
            r8.addRequestProperty(r2, r7)     // Catch:{ ExecutionException -> 0x005a, InterruptedException -> 0x0053 }
            goto L_0x005a
        L_0x0053:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
        L_0x005a:
            r7 = 0
            java.lang.String r2 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c6 }
            xg4 r3 = defpackage.rqg.a(r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.Context r3 = r3.a     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c6 }
            r4 = 64
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.Signature[] r3 = r2.signatures     // Catch:{ NameNotFoundException -> 0x00c6 }
            if (r3 == 0) goto L_0x0097
            int r3 = r3.length     // Catch:{ NameNotFoundException -> 0x00c6 }
            r4 = 1
            if (r3 != r4) goto L_0x0097
            java.lang.String r3 = "SHA1"
            r4 = r1
        L_0x007a:
            r5 = 2
            if (r4 >= r5) goto L_0x0086
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0083 }
            if (r5 != 0) goto L_0x0087
        L_0x0083:
            int r4 = r4 + 1
            goto L_0x007a
        L_0x0086:
            r5 = r7
        L_0x0087:
            if (r5 != 0) goto L_0x008a
            goto L_0x0097
        L_0x008a:
            android.content.pm.Signature[] r2 = r2.signatures     // Catch:{ NameNotFoundException -> 0x00c6 }
            r2 = r2[r1]     // Catch:{ NameNotFoundException -> 0x00c6 }
            byte[] r2 = r2.toByteArray()     // Catch:{ NameNotFoundException -> 0x00c6 }
            byte[] r2 = r5.digest(r2)     // Catch:{ NameNotFoundException -> 0x00c6 }
            goto L_0x0098
        L_0x0097:
            r2 = r7
        L_0x0098:
            if (r2 != 0) goto L_0x009e
            r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c6 }
            goto L_0x00c9
        L_0x009e:
            int r3 = r2.length     // Catch:{ NameNotFoundException -> 0x00c6 }
            int r4 = r3 + r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00c6 }
            r5.<init>(r4)     // Catch:{ NameNotFoundException -> 0x00c6 }
        L_0x00a6:
            if (r1 >= r3) goto L_0x00c1
            char[] r4 = defpackage.te8.f     // Catch:{ NameNotFoundException -> 0x00c6 }
            byte r6 = r2[r1]     // Catch:{ NameNotFoundException -> 0x00c6 }
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r4[r6]     // Catch:{ NameNotFoundException -> 0x00c6 }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00c6 }
            byte r6 = r2[r1]     // Catch:{ NameNotFoundException -> 0x00c6 }
            r6 = r6 & 15
            char r4 = r4[r6]     // Catch:{ NameNotFoundException -> 0x00c6 }
            r5.append(r4)     // Catch:{ NameNotFoundException -> 0x00c6 }
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00c1:
            java.lang.String r7 = r5.toString()     // Catch:{ NameNotFoundException -> 0x00c6 }
            goto L_0x00c9
        L_0x00c6:
            r0.getPackageName()
        L_0x00c9:
            java.lang.String r0 = "X-Android-Cert"
            r8.addRequestProperty(r0, r7)
            java.lang.String r7 = "x-goog-api-key"
            r8.addRequestProperty(r7, r9)
            return r8
        L_0x00d4:
            com.google.firebase.installations.FirebaseInstallationsException r7 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r8 = "Firebase Installations Service is unavailable. Please try again later."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp5.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
