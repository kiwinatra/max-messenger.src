package com.my.tracker.obfuscated;

import com.my.tracker.MyTrackerConfig;

public final class j1 extends s0 {
    final MyTrackerConfig.OkHttpClientProvider a;

    public j1(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.a = okHttpClientProvider;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: k4d} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.s0.b a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "OkHttpGetRequest error: error while sending data"
            java.lang.String r1 = "OkHttpGetRequest error: response code "
            java.lang.String r2 = "OkHttpGetRequest: send request to "
            com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d()
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r6.<init>(r2)     // Catch:{ all -> 0x007b }
            r6.append(r8)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x007b }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x007b }
            hr6 r2 = new hr6     // Catch:{ all -> 0x007b }
            r2.<init>()     // Catch:{ all -> 0x007b }
            r2.C(r8)     // Catch:{ all -> 0x007b }
            java.lang.String r8 = "GET"
            r2.r(r8, r4)     // Catch:{ all -> 0x007f }
            y2d r8 = r2.c()     // Catch:{ all -> 0x007b }
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r7 = r7.a     // Catch:{ all -> 0x007b }
            rla r7 = r7.getOkHttpClient()     // Catch:{ all -> 0x007b }
            jtc r7 = r7.b(r8)     // Catch:{ all -> 0x007b }
            k4d r7 = r7.h()     // Catch:{ all -> 0x007b }
            int r8 = r7.o     // Catch:{ all -> 0x0049 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r8 != r2) goto L_0x004c
            java.lang.String r1 = "OkHttpGetRequest: response successfully received"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x0049 }
            r1 = 1
            r3.a = r1     // Catch:{ all -> 0x0049 }
            goto L_0x005d
        L_0x0049:
            r8 = move-exception
            r4 = r7
            goto L_0x0081
        L_0x004c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r6.<init>(r1)     // Catch:{ all -> 0x0049 }
            r6.append(r8)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0049 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x0049 }
            r3.a = r5     // Catch:{ all -> 0x0049 }
        L_0x005d:
            if (r8 != r2) goto L_0x008b
            java.lang.String r8 = "OkHttpGetRequest: processing server response"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r8)     // Catch:{ all -> 0x0049 }
            ptc r8 = r7.x     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x006c
            java.lang.String r4 = r8.V()     // Catch:{ all -> 0x0049 }
        L_0x006c:
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r8 != 0) goto L_0x0075
            r3.b = r4     // Catch:{ all -> 0x0049 }
            goto L_0x008b
        L_0x0075:
            java.lang.String r8 = "OkHttpGetRequest: response data is empty"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r8)     // Catch:{ all -> 0x0049 }
            goto L_0x008b
        L_0x007b:
            r8 = move-exception
            goto L_0x0081
        L_0x007d:
            r8 = r7
            goto L_0x0081
        L_0x007f:
            r7 = move-exception
            goto L_0x007d
        L_0x0081:
            com.my.tracker.obfuscated.x2.a(r0, r8)     // Catch:{ all -> 0x008f }
            r3.a = r5     // Catch:{ all -> 0x008f }
            r3.c = r0     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x008e
            r7 = r4
        L_0x008b:
            r7.close()
        L_0x008e:
            return r3
        L_0x008f:
            r7 = move-exception
            if (r4 == 0) goto L_0x0095
            r4.close()
        L_0x0095:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.j1.a(java.lang.String):com.my.tracker.obfuscated.s0$b");
    }
}
