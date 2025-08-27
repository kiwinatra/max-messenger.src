package com.my.tracker.obfuscated;

public final class q0 extends s0 {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bc A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.s0.b a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r5 = "HttpGetRequest: response received with response code: "
            java.lang.String r0 = "HttpGetRequest: send request to "
            com.my.tracker.obfuscated.s0$b r1 = com.my.tracker.obfuscated.s0.b.d()
            r2 = 0
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r4.<init>(r0)     // Catch:{ all -> 0x00ae }
            r4.append(r6)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ae }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r0)     // Catch:{ all -> 0x00ae }
            r0 = 27498374(0x1a39786, float:6.009417E-38)
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x00ae }
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00ae }
            r0.<init>(r6)     // Catch:{ all -> 0x00ae }
            java.net.URLConnection r6 = r0.openConnection()     // Catch:{ all -> 0x00ae }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x00ae }
            r0 = 3000(0xbb8, float:4.204E-42)
            r6.setConnectTimeout(r0)     // Catch:{ all -> 0x00a5 }
            r6.setReadTimeout(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "GET"
            r6.setRequestMethod(r0)     // Catch:{ all -> 0x00a5 }
            int r0 = r6.getResponseCode()     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r4.<init>(r5)     // Catch:{ all -> 0x00a5 }
            r4.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x00a5 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x00a5 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = r2
        L_0x0051:
            r1.a = r5     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = "HttpGetRequest: processing server response"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x006c }
            boolean r5 = r1.a     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x006e
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }
            java.io.InputStream r4 = r6.getInputStream()     // Catch:{ all -> 0x006c }
            r0.<init>(r4)     // Catch:{ all -> 0x006c }
            r5.<init>(r0)     // Catch:{ all -> 0x006c }
        L_0x006a:
            r3 = r5
            goto L_0x007d
        L_0x006c:
            r5 = move-exception
            goto L_0x00a8
        L_0x006e:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x006c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x006c }
            java.io.InputStream r4 = r6.getErrorStream()     // Catch:{ all -> 0x006c }
            r0.<init>(r4)     // Catch:{ all -> 0x006c }
            r5.<init>(r0)     // Catch:{ all -> 0x006c }
            goto L_0x006a
        L_0x007d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r5.<init>()     // Catch:{ all -> 0x006c }
        L_0x0082:
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x008c
            r5.append(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0082
        L_0x008c:
            int r0 = r5.length()     // Catch:{ all -> 0x006c }
            if (r0 <= 0) goto L_0x0099
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x006c }
            r1.b = r5     // Catch:{ all -> 0x006c }
            goto L_0x009e
        L_0x0099:
            java.lang.String r5 = "HttpGetRequest: response data is empty"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r5)     // Catch:{ all -> 0x006c }
        L_0x009e:
            r3.close()     // Catch:{ all -> 0x00a5 }
            r6.disconnect()
            goto L_0x00bf
        L_0x00a5:
            r5 = move-exception
            r3 = r6
            goto L_0x00af
        L_0x00a8:
            if (r3 == 0) goto L_0x00ad
            r3.close()     // Catch:{ all -> 0x00a5 }
        L_0x00ad:
            throw r5     // Catch:{ all -> 0x00a5 }
        L_0x00ae:
            r5 = move-exception
        L_0x00af:
            java.lang.String r6 = "HttpGetRequest: error"
            com.my.tracker.obfuscated.x2.a(r6, r5)     // Catch:{ all -> 0x00c0 }
            r1.a = r2     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "HttpGetRequest: error while sending data"
            r1.c = r5     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00bf
            r3.disconnect()
        L_0x00bf:
            return r1
        L_0x00c0:
            r5 = move-exception
            if (r3 == 0) goto L_0x00c6
            r3.disconnect()
        L_0x00c6:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.q0.a(java.lang.String):com.my.tracker.obfuscated.s0$b");
    }
}
