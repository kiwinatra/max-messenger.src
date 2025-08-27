package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.s0;

public final class r0 extends s0 {
    final s0.a a;
    final boolean b;

    public r0(s0.a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[Catch:{ all -> 0x0071, all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111 A[Catch:{ all -> 0x0071, all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.s0.b a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "HttpPostRequest error: error while sending data"
            java.lang.String r1 = "HttpPostRequest error: response code "
            java.lang.String r2 = "HttpPostRequest: send request to "
            com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d()
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r6.<init>(r2)     // Catch:{ all -> 0x0115 }
            r6.append(r10)     // Catch:{ all -> 0x0115 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0115 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0115 }
            r2 = 27498374(0x1a39786, float:6.009417E-38)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ all -> 0x0115 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0115 }
            r2.<init>(r10)     // Catch:{ all -> 0x0115 }
            java.net.URLConnection r10 = r2.openConnection()     // Catch:{ all -> 0x0115 }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x0115 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r2)     // Catch:{ all -> 0x00bb }
            r10.setReadTimeout(r2)     // Catch:{ all -> 0x00bb }
            r2 = 1
            r10.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "POST"
            r10.setRequestMethod(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "Connection"
            java.lang.String r7 = "close"
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "Content-Type"
            com.my.tracker.obfuscated.s0$a r7 = r9.a     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r7.a()     // Catch:{ all -> 0x00bb }
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x00bb }
            r10.setUseCaches(r4)     // Catch:{ all -> 0x00bb }
            r10.setDoOutput(r2)     // Catch:{ all -> 0x00bb }
            boolean r6 = r9.b     // Catch:{ all -> 0x0074 }
            if (r6 == 0) goto L_0x0077
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r10.setRequestProperty(r6, r7)     // Catch:{ all -> 0x0074 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0074 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0074 }
            java.io.OutputStream r8 = r10.getOutputStream()     // Catch:{ all -> 0x0074 }
            r7.<init>(r8)     // Catch:{ all -> 0x0074 }
            r6.<init>(r7)     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = "HttpPostRequest: populating post request body using gzip"
            goto L_0x0082
        L_0x0071:
            r9 = move-exception
            goto L_0x010b
        L_0x0074:
            r9 = move-exception
            goto L_0x010d
        L_0x0077:
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0074 }
            java.io.OutputStream r7 = r10.getOutputStream()     // Catch:{ all -> 0x0074 }
            r6.<init>(r7)     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = "HttpPostRequest: populating post request body without using gzip"
        L_0x0082:
            com.my.tracker.obfuscated.x2.a((java.lang.String) r7)     // Catch:{ all -> 0x0071 }
            com.my.tracker.obfuscated.s0$a r7 = r9.a     // Catch:{ all -> 0x0095 }
            r7.a(r6)     // Catch:{ all -> 0x0095 }
            boolean r9 = r9.b     // Catch:{ all -> 0x0095 }
            if (r9 == 0) goto L_0x0099
            r9 = r6
            java.util.zip.GZIPOutputStream r9 = (java.util.zip.GZIPOutputStream) r9     // Catch:{ all -> 0x0095 }
            r9.finish()     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r9 = move-exception
            r5 = r6
            goto L_0x010d
        L_0x0099:
            r6.close()     // Catch:{ all -> 0x00bb }
            int r9 = r10.getResponseCode()     // Catch:{ all -> 0x00bb }
            r6 = 200(0xc8, float:2.8E-43)
            if (r9 == r6) goto L_0x00be
            r7 = 204(0xcc, float:2.86E-43)
            if (r9 != r7) goto L_0x00a9
            goto L_0x00be
        L_0x00a9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r2.<init>(r1)     // Catch:{ all -> 0x00bb }
            r2.append(r9)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00bb }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00bb }
            r3.a = r4     // Catch:{ all -> 0x00bb }
            goto L_0x00c5
        L_0x00bb:
            r9 = move-exception
            r5 = r10
            goto L_0x0116
        L_0x00be:
            java.lang.String r1 = "HttpPostRequest: response successfully received"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00bb }
            r3.a = r2     // Catch:{ all -> 0x00bb }
        L_0x00c5:
            if (r9 != r6) goto L_0x0120
            java.lang.String r9 = "HttpPostRequest: processing server response"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r9)     // Catch:{ all -> 0x0103 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ all -> 0x0103 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0103 }
            java.io.InputStream r2 = r10.getInputStream()     // Catch:{ all -> 0x0103 }
            r1.<init>(r2)     // Catch:{ all -> 0x0103 }
            r9.<init>(r1)     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e9 }
            r1.<init>()     // Catch:{ all -> 0x00e9 }
        L_0x00df:
            java.lang.String r2 = r9.readLine()     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00eb
            r1.append(r2)     // Catch:{ all -> 0x00e9 }
            goto L_0x00df
        L_0x00e9:
            r1 = move-exception
            goto L_0x0101
        L_0x00eb:
            int r2 = r1.length()     // Catch:{ all -> 0x00e9 }
            if (r2 <= 0) goto L_0x00f8
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e9 }
            r3.b = r1     // Catch:{ all -> 0x00e9 }
            goto L_0x00fd
        L_0x00f8:
            java.lang.String r1 = "HttpPostRequest: response data is empty"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00e9 }
        L_0x00fd:
            r9.close()     // Catch:{ all -> 0x00bb }
            goto L_0x0120
        L_0x0101:
            r5 = r9
            goto L_0x0105
        L_0x0103:
            r9 = move-exception
            r1 = r9
        L_0x0105:
            if (r5 == 0) goto L_0x0114
            r5.close()     // Catch:{ all -> 0x00bb }
            goto L_0x0114
        L_0x010b:
            r1 = r9
            goto L_0x010f
        L_0x010d:
            r1 = r9
            r6 = r5
        L_0x010f:
            if (r6 == 0) goto L_0x0114
            r6.close()     // Catch:{ all -> 0x00bb }
        L_0x0114:
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x0115:
            r9 = move-exception
        L_0x0116:
            com.my.tracker.obfuscated.x2.a(r0, r9)     // Catch:{ all -> 0x0124 }
            r3.a = r4     // Catch:{ all -> 0x0124 }
            r3.c = r0     // Catch:{ all -> 0x0124 }
            if (r5 == 0) goto L_0x0123
            r10 = r5
        L_0x0120:
            r10.disconnect()
        L_0x0123:
            return r3
        L_0x0124:
            r9 = move-exception
            if (r5 == 0) goto L_0x012a
            r5.disconnect()
        L_0x012a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.r0.a(java.lang.String):com.my.tracker.obfuscated.s0$b");
    }
}
