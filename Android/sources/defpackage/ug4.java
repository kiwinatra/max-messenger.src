package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;
import kotlin.io.CloseableKt;
import one.me.rlottie.network.LottieFetchCall;
import org.apache.http.client.methods.HttpGet;

/* renamed from: ug4  reason: default package */
public final class ug4 implements LottieFetchCall {
    public static final Pattern b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"", 2);
    public final HttpURLConnection a;

    public ug4(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.a = httpURLConnection;
        httpURLConnection.setRequestMethod(HttpGet.METHOD_NAME);
        httpURLConnection.connect();
    }

    public final InputStream bodyByteStream() {
        return this.a.getInputStream();
    }

    public final void close() {
        this.a.disconnect();
    }

    public final String error() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.a.getErrorStream()));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    String sb2 = sb.toString();
                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                    return sb2;
                }
            }
        } catch (Throwable th) {
            CloseableKt.closeFinally(bufferedReader, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, '/', 0, false, 6, (java.lang.Object) null) + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String fileName() {
        /*
            r4 = this;
            java.net.HttpURLConnection r4 = r4.a
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r4 = r4.getHeaderField(r0)
            r0 = 0
            if (r4 == 0) goto L_0x0034
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0012
            goto L_0x0034
        L_0x0012:
            r1 = 1
            java.util.regex.Pattern r2 = b     // Catch:{ IllegalStateException -> 0x0023 }
            java.util.regex.Matcher r4 = r2.matcher(r4)     // Catch:{ IllegalStateException -> 0x0023 }
            boolean r2 = r4.find()     // Catch:{ IllegalStateException -> 0x0023 }
            if (r2 == 0) goto L_0x0023
            java.lang.String r0 = r4.group(r1)     // Catch:{ IllegalStateException -> 0x0023 }
        L_0x0023:
            if (r0 == 0) goto L_0x0034
            r4 = 47
            r2 = 0
            r3 = 6
            int r4 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, (char) r4, (int) r2, false, (int) r3, (java.lang.Object) null)
            int r4 = r4 + r1
            if (r4 <= 0) goto L_0x0034
            java.lang.String r0 = r0.substring(r4)
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug4.fileName():java.lang.String");
    }

    public final boolean isSuccessful() {
        try {
            return this.a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public final int resultCode() {
        return this.a.getResponseCode();
    }
}
