package com.my.tracker.obfuscated;

import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import java.util.regex.Pattern;

public final class k1 extends s0 {
    static final f19 d;
    final s0.a a;
    final MyTrackerConfig.OkHttpClientProvider b;
    final boolean c;

    static {
        f19 f19;
        Pattern pattern = f19.d;
        try {
            f19 = ct.l("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            f19 = null;
        }
        d = f19;
    }

    public k1(s0.a aVar, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, boolean z) {
        this.a = aVar;
        this.b = okHttpClientProvider;
        this.c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: k4d} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[SYNTHETIC, Splitter:B:47:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de A[Catch:{ all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.my.tracker.obfuscated.s0.b a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "OkHttpPostRequest error: error while sending data"
            java.lang.String r1 = "OkHttpPostRequest error: response code "
            java.lang.String r2 = "OkHttpPostRequest: send request to "
            com.my.tracker.obfuscated.s0$b r3 = com.my.tracker.obfuscated.s0.b.d()
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r6.<init>(r2)     // Catch:{ all -> 0x0079 }
            r6.append(r11)     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0079 }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0079 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00d4 }
            r2.<init>()     // Catch:{ all -> 0x00d4 }
            boolean r6 = r10.c     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x003e
            java.lang.String r6 = "OkHttpPostRequest: populating post request body using gzip"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x003a }
            r6.<init>(r2)     // Catch:{ all -> 0x003a }
            com.my.tracker.obfuscated.s0$a r7 = r10.a     // Catch:{ all -> 0x0037 }
            r7.a(r6)     // Catch:{ all -> 0x0037 }
            r6.finish()     // Catch:{ all -> 0x0037 }
            goto L_0x004c
        L_0x0037:
            r10 = move-exception
            goto L_0x00d7
        L_0x003a:
            r10 = move-exception
            r6 = r5
            goto L_0x00d7
        L_0x003e:
            java.lang.String r6 = "OkHttpPostRequest: populating post request body without using gzip"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            com.my.tracker.obfuscated.s0$a r6 = r10.a     // Catch:{ all -> 0x003a }
            r6.a(r2)     // Catch:{ all -> 0x003a }
            r2.flush()     // Catch:{ all -> 0x003a }
            r6 = r5
        L_0x004c:
            hr6 r7 = new hr6     // Catch:{ all -> 0x0037 }
            r7.<init>()     // Catch:{ all -> 0x0037 }
            r7.C(r11)     // Catch:{ all -> 0x0037 }
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            java.lang.Object r9 = r7.c     // Catch:{ all -> 0x0037 }
            e4 r9 = (defpackage.e4) r9     // Catch:{ all -> 0x0037 }
            r9.y(r11, r8)     // Catch:{ all -> 0x0037 }
            byte[] r11 = r2.toByteArray()     // Catch:{ all -> 0x0037 }
            f19 r8 = d     // Catch:{ all -> 0x0037 }
            r9 = 6
            a3d r11 = defpackage.sq6.t(r11, r8, r9)     // Catch:{ all -> 0x0037 }
            java.lang.String r8 = "POST"
            r7.r(r8, r11)     // Catch:{ all -> 0x0037 }
            y2d r11 = r7.c()     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x007c
            r6.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007c
        L_0x0079:
            r10 = move-exception
            goto L_0x00e2
        L_0x007c:
            r2.close()     // Catch:{ all -> 0x0079 }
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r10 = r10.b     // Catch:{ all -> 0x0079 }
            rla r10 = r10.getOkHttpClient()     // Catch:{ all -> 0x0079 }
            jtc r10 = r10.b(r11)     // Catch:{ all -> 0x0079 }
            k4d r10 = r10.h()     // Catch:{ all -> 0x0079 }
            int r11 = r10.o     // Catch:{ all -> 0x00aa }
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 == r2) goto L_0x00ae
            r6 = 204(0xcc, float:2.86E-43)
            if (r11 != r6) goto L_0x0098
            goto L_0x00ae
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            r6.<init>(r1)     // Catch:{ all -> 0x00aa }
            r6.append(r11)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00aa }
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00aa }
            r3.a = r4     // Catch:{ all -> 0x00aa }
            goto L_0x00b6
        L_0x00aa:
            r11 = move-exception
            r5 = r10
            r10 = r11
            goto L_0x00e2
        L_0x00ae:
            java.lang.String r1 = "OkHttpPostRequest: response successfully received"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r1)     // Catch:{ all -> 0x00aa }
            r1 = 1
            r3.a = r1     // Catch:{ all -> 0x00aa }
        L_0x00b6:
            if (r11 != r2) goto L_0x00ec
            java.lang.String r11 = "OkHttpPostRequest: processing server response"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r11)     // Catch:{ all -> 0x00aa }
            ptc r11 = r10.x     // Catch:{ all -> 0x00aa }
            if (r11 == 0) goto L_0x00c5
            java.lang.String r5 = r11.V()     // Catch:{ all -> 0x00aa }
        L_0x00c5:
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00aa }
            if (r11 != 0) goto L_0x00ce
            r3.b = r5     // Catch:{ all -> 0x00aa }
            goto L_0x00ec
        L_0x00ce:
            java.lang.String r11 = "OkHttpPostRequest: response data is empty"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r11)     // Catch:{ all -> 0x00aa }
            goto L_0x00ec
        L_0x00d4:
            r10 = move-exception
            r2 = r5
            r6 = r2
        L_0x00d7:
            if (r6 == 0) goto L_0x00dc
            r6.close()     // Catch:{ all -> 0x0079 }
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()     // Catch:{ all -> 0x0079 }
        L_0x00e1:
            throw r10     // Catch:{ all -> 0x0079 }
        L_0x00e2:
            com.my.tracker.obfuscated.x2.a(r0, r10)     // Catch:{ all -> 0x00f0 }
            r3.a = r4     // Catch:{ all -> 0x00f0 }
            r3.c = r0     // Catch:{ all -> 0x00f0 }
            if (r5 == 0) goto L_0x00ef
            r10 = r5
        L_0x00ec:
            r10.close()
        L_0x00ef:
            return r3
        L_0x00f0:
            r10 = move-exception
            if (r5 == 0) goto L_0x00f6
            r5.close()
        L_0x00f6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.k1.a(java.lang.String):com.my.tracker.obfuscated.s0$b");
    }
}
