package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ei7  reason: default package */
public final class ei7 extends pl0 {
    public static final Pattern b = Pattern.compile("https?://www.instagram.com/p/([a-zA-Z_\\d-]+)", 2);
    public static final String[] c = {"PostPage", "EmbedPostlude", "EmbedRichEntrypoint", "EmbedSimpleEntrypoint"};
    public final String a;

    public ei7(String str) {
        this.a = str;
    }

    public static String b(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        z68.a("ei7", "Instagram video id = " + matcher.group(1));
        return matcher.group(1);
    }

    public final lbe a() {
        return new mka(1, new lc5(22, (Object) this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136 A[SYNTHETIC, Splitter:B:73:0x0136] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hk5 c(java.lang.String r23, defpackage.pbe r24) {
        /*
            r22 = this;
            r1 = 1
            java.util.Locale r0 = java.util.Locale.US
            r2 = r22
            java.lang.String r2 = r2.a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = r23
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            int r2 = defpackage.m5a.e
            java.lang.String r2 = "ISO-8859-1,utf-8;q=0.7,*;q=0.7"
            java.lang.String r3 = "Accept-Charset"
            java.lang.String r4 = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
            java.lang.String r5 = "Accept"
            java.lang.String r6 = "en-us,en;q=0.5"
            java.lang.String r7 = "Accept-Language"
            java.lang.String r8 = "gzip, deflate"
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r10 = "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)"
            java.lang.String r11 = "User-Agent"
            java.lang.String r12 = "m5a"
            r13 = 0
            java.net.URL r15 = new java.net.URL     // Catch:{ all -> 0x009f }
            r15.<init>(r0)     // Catch:{ all -> 0x009f }
            java.net.URLConnection r15 = r15.openConnection()     // Catch:{ all -> 0x009f }
            r15.addRequestProperty(r11, r10)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r9, r8)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r7, r6)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r5, r4)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r3, r2)     // Catch:{ all -> 0x008e }
            r0 = 5000(0x1388, float:7.006E-42)
            r15.setConnectTimeout(r0)     // Catch:{ all -> 0x008e }
            r15.setReadTimeout(r0)     // Catch:{ all -> 0x008e }
            boolean r0 = r15 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0090
            r0 = r15
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x008e }
            r0.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x008e }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x008e }
            r14 = 302(0x12e, float:4.23E-43)
            if (r1 == r14) goto L_0x0064
            r14 = 301(0x12d, float:4.22E-43)
            if (r1 == r14) goto L_0x0064
            r14 = 303(0x12f, float:4.25E-43)
            if (r1 != r14) goto L_0x0090
        L_0x0064:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.getHeaderField(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r14 = "Set-Cookie"
            java.lang.String r0 = r0.getHeaderField(r14)     // Catch:{ all -> 0x008e }
            java.net.URL r14 = new java.net.URL     // Catch:{ all -> 0x008e }
            r14.<init>(r1)     // Catch:{ all -> 0x008e }
            java.net.URLConnection r15 = r14.openConnection()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Cookie"
            r15.setRequestProperty(r1, r0)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r11, r10)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r9, r8)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r7, r6)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r5, r4)     // Catch:{ all -> 0x008e }
            r15.addRequestProperty(r3, r2)     // Catch:{ all -> 0x008e }
            goto L_0x0090
        L_0x008e:
            r0 = move-exception
            goto L_0x00a1
        L_0x0090:
            r15.connect()     // Catch:{ all -> 0x008e }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x008e }
            java.io.InputStream r1 = r15.getInputStream()     // Catch:{ all -> 0x008e }
            r0.<init>(r1)     // Catch:{ all -> 0x008e }
            r1 = r0
            r0 = 1
            goto L_0x00d2
        L_0x009f:
            r0 = move-exception
            r15 = r13
        L_0x00a1:
            boolean r1 = r0 instanceof java.net.SocketTimeoutException
            if (r1 == 0) goto L_0x00a7
        L_0x00a5:
            r1 = 0
            goto L_0x00c9
        L_0x00a7:
            boolean r1 = r0 instanceof java.net.UnknownHostException
            if (r1 == 0) goto L_0x00ac
            goto L_0x00a5
        L_0x00ac:
            boolean r1 = r0 instanceof java.net.SocketException
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "ECONNRESET"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x00c8
            goto L_0x00a5
        L_0x00c3:
            boolean r1 = r0 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L_0x00c8
            goto L_0x00a5
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r12, r0, r13)
            r0 = r1
            r1 = r13
        L_0x00d2:
            if (r0 == 0) goto L_0x0144
            if (r15 == 0) goto L_0x00e8
            boolean r0 = r15 instanceof java.net.HttpURLConnection     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00e8
            java.net.HttpURLConnection r15 = (java.net.HttpURLConnection) r15     // Catch:{ Exception -> 0x00e0 }
            r15.getResponseCode()     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e8
        L_0x00e0:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r12, r0, r13)
        L_0x00e8:
            if (r1 == 0) goto L_0x0132
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0127 }
            r2 = r13
        L_0x00f0:
            boolean r3 = r24.f()     // Catch:{ all -> 0x0106 }
            if (r3 == 0) goto L_0x00f7
            goto L_0x011b
        L_0x00f7:
            int r3 = r1.read(r0)     // Catch:{ Exception -> 0x0108 }
            if (r3 <= 0) goto L_0x0116
            if (r2 != 0) goto L_0x010a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0108 }
            r4.<init>()     // Catch:{ Exception -> 0x0108 }
            r2 = r4
            goto L_0x010a
        L_0x0106:
            r0 = move-exception
            goto L_0x0129
        L_0x0108:
            r0 = move-exception
            goto L_0x011d
        L_0x010a:
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x0108 }
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r4.<init>(r0, r6, r3, r5)     // Catch:{ Exception -> 0x0108 }
            r2.append(r4)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00f0
        L_0x0116:
            r0 = -1
            if (r3 != r0) goto L_0x011b
            r0 = 1
            goto L_0x0125
        L_0x011b:
            r0 = 0
            goto L_0x0125
        L_0x011d:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0106 }
            defpackage.z68.f(r12, r0, r13)     // Catch:{ all -> 0x0106 }
            goto L_0x011b
        L_0x0125:
            r6 = r0
            goto L_0x0134
        L_0x0127:
            r0 = move-exception
            r2 = r13
        L_0x0129:
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r12, r0, r13)
        L_0x0130:
            r6 = 0
            goto L_0x0134
        L_0x0132:
            r2 = r13
            goto L_0x0130
        L_0x0134:
            if (r1 == 0) goto L_0x0146
            r1.close()     // Catch:{ all -> 0x013a }
            goto L_0x0146
        L_0x013a:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.toString()
            defpackage.z68.f(r12, r0, r13)
            goto L_0x0146
        L_0x0144:
            r2 = r13
            r6 = 0
        L_0x0146:
            if (r6 == 0) goto L_0x014d
            java.lang.String r0 = r2.toString()
            goto L_0x014e
        L_0x014d:
            r0 = r13
        L_0x014e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0155
            return r13
        L_0x0155:
            java.lang.String r1 = "window\\._sharedData\\s*=\\s*(.*);"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x01e5
            int r1 = r0.groupCount()
            r2 = 1
            if (r1 < r2) goto L_0x01e5
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = r0.group(r2)
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = "entry_data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x01e5 }
            java.lang.String[] r1 = c
            int r2 = r1.length
            r6 = 0
        L_0x017f:
            if (r6 >= r2) goto L_0x01e5
            r3 = r1[r6]
            java.lang.String r4 = "dimensions"
            org.json.JSONArray r3 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x01d2 }
            r5 = 0
            java.lang.Object r3 = r3.get(r5)     // Catch:{ JSONException -> 0x01d3 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ JSONException -> 0x01d3 }
            java.lang.String r7 = "graphql"
            org.json.JSONObject r3 = r3.getJSONObject(r7)     // Catch:{ JSONException -> 0x01d3 }
            java.lang.String r7 = "shortcode_media"
            org.json.JSONObject r3 = r3.getJSONObject(r7)     // Catch:{ JSONException -> 0x01d3 }
            if (r3 == 0) goto L_0x01d3
            java.lang.String r7 = "video_url"
            java.lang.String r21 = r3.getString(r7)     // Catch:{ JSONException -> 0x01d3 }
            org.json.JSONObject r7 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x01d3 }
            if (r7 == 0) goto L_0x01b3
            java.lang.String r8 = "width"
            int r7 = r7.optInt(r8)     // Catch:{ JSONException -> 0x01d3 }
            r18 = r7
            goto L_0x01b5
        L_0x01b3:
            r18 = r5
        L_0x01b5:
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x01d3 }
            if (r3 == 0) goto L_0x01c4
            java.lang.String r4 = "height"
            int r3 = r3.optInt(r4)     // Catch:{ JSONException -> 0x01d3 }
            r19 = r3
            goto L_0x01c6
        L_0x01c4:
            r19 = r5
        L_0x01c6:
            hk5 r3 = new hk5     // Catch:{ JSONException -> 0x01d3 }
            r20 = 0
            r17 = 3
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x01d3 }
            goto L_0x01d4
        L_0x01d2:
            r5 = 0
        L_0x01d3:
            r3 = r13
        L_0x01d4:
            if (r3 == 0) goto L_0x01e2
            int r4 = defpackage.m5a.e
            java.lang.String r4 = r3.b
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 == 0) goto L_0x01e2
            r13 = r3
            goto L_0x01e5
        L_0x01e2:
            r3 = 1
            int r6 = r6 + r3
            goto L_0x017f
        L_0x01e5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei7.c(java.lang.String, pbe):hk5");
    }
}
