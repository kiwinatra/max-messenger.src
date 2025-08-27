package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.uuid.Uuid;
import org.apache.http.HttpStatus;

/* renamed from: org  reason: default package */
public final class org extends AsyncTask {
    public static String g;
    public static String h;
    public static String i;
    public static final Pattern j = Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)( |\\z|&)");
    public static final Pattern k = Pattern.compile("(http|https)://(www\\.|)youtu.be/(.+?)( |\\z|&)");
    public static final Pattern l = Pattern.compile("var ytInitialPlayerResponse\\s*=\\s*(\\{.+?\\})\\s*;");
    public static final Pattern m = Pattern.compile("url=(.+?)(\\u0026|$)");
    public static final Pattern n = Pattern.compile("s=(.+?)(\\u0026|$)");
    public static final Pattern o = Pattern.compile("([{; =])([a-zA-Z$][a-zA-Z0-9$]{0,2})\\.([a-zA-Z$][a-zA-Z0-9$]{0,2})\\(");
    public static final Pattern p = Pattern.compile("([{; =])([a-zA-Z$_][a-zA-Z0-9$]{0,2})\\(");
    public static final Pattern q = Pattern.compile("\\\\/s\\\\/player\\\\/([^\"]+?)\\.js");
    public static final Pattern r = Pattern.compile("/s/player/([^\"]+?).js");
    public static final Pattern s = Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)");
    public static final SparseArray t;
    public final WeakReference a;
    public String b;
    public final String c;
    public volatile String d;
    public final ReentrantLock e;
    public final Condition f;

    static {
        SparseArray sparseArray = new SparseArray();
        t = sparseArray;
        sparseArray.put(17, new da6(17, 144, 24, 0, "3gp"));
        sparseArray.put(36, new da6(36, 240, 32, 0, "3gp"));
        sparseArray.put(5, new da6(5, 240, 64, 0, "flv"));
        sparseArray.put(43, new da6(43, 360, Uuid.SIZE_BITS, 0, "webm"));
        sparseArray.put(18, new da6(18, 360, 96, 0, "mp4"));
        sparseArray.put(22, new da6(22, 720, 192, 0, "mp4"));
        sparseArray.put(160, new da6(160, 144, "mp4"));
        sparseArray.put(133, new da6(133, 240, "mp4"));
        sparseArray.put(134, new da6(134, 360, "mp4"));
        sparseArray.put(135, new da6(135, 480, "mp4"));
        sparseArray.put(136, new da6(136, 720, "mp4"));
        sparseArray.put(137, new da6(137, 1080, "mp4"));
        sparseArray.put(264, new da6(264, 1440, "mp4"));
        sparseArray.put(266, new da6(266, 2160, "mp4"));
        sparseArray.put(298, new da6("mp4", 298, 720, (Object) null));
        sparseArray.put(299, new da6("mp4", 299, 1080, (Object) null));
        sparseArray.put(140, new da6(140, "m4a", (int) Uuid.SIZE_BITS, 0));
        sparseArray.put(141, new da6(141, "m4a", 256, 0));
        sparseArray.put(256, new da6(256, "m4a", 192, 0));
        sparseArray.put(258, new da6(258, "m4a", 384, 0));
        sparseArray.put(278, new da6(278, 144, "webm"));
        sparseArray.put(242, new da6(242, 240, "webm"));
        sparseArray.put(243, new da6(243, 360, "webm"));
        sparseArray.put(244, new da6(244, 480, "webm"));
        sparseArray.put(247, new da6(247, 720, "webm"));
        sparseArray.put(248, new da6(248, 1080, "webm"));
        sparseArray.put(271, new da6(271, 1440, "webm"));
        sparseArray.put(313, new da6(313, 2160, "webm"));
        sparseArray.put(HttpStatus.SC_MOVED_TEMPORARILY, new da6("webm", (int) HttpStatus.SC_MOVED_TEMPORARILY, 720, (Object) null));
        sparseArray.put(308, new da6("webm", 308, 1440, (Object) null));
        sparseArray.put(HttpStatus.SC_SEE_OTHER, new da6("webm", (int) HttpStatus.SC_SEE_OTHER, 1080, (Object) null));
        sparseArray.put(315, new da6("webm", 315, 2160, (Object) null));
        sparseArray.put(171, new da6(171, "webm", (int) Uuid.SIZE_BITS, 0));
        sparseArray.put(249, new da6(249, "webm", 48, 0));
        sparseArray.put(250, new da6(250, "webm", 64, 0));
        sparseArray.put(251, new da6(251, "webm", 160, 0));
        sparseArray.put(91, new da6(91, 144, 48));
        sparseArray.put(92, new da6(92, 240, 48));
        sparseArray.put(93, new da6(93, 360, (int) Uuid.SIZE_BITS));
        sparseArray.put(94, new da6(94, 480, (int) Uuid.SIZE_BITS));
        sparseArray.put(95, new da6(95, 720, 256));
        sparseArray.put(96, new da6(96, 1080, 256));
    }

    public org(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
        this.a = new WeakReference(context);
        this.c = context.getCacheDir().getAbsolutePath();
    }

    public final void a(SparseArray sparseArray) {
        Context context = (Context) this.a.get();
        if (context != null) {
            StringBuilder sb = new StringBuilder(wj6.n(new StringBuilder(), h, " function decipher("));
            sb.append("){return ");
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt = sparseArray.keyAt(i2);
                if (i2 < sparseArray.size() - 1) {
                    sb.append(i);
                    sb.append("('");
                    sb.append((String) sparseArray.get(keyAt));
                    sb.append("')+\"\\n\"+");
                } else {
                    sb.append(i);
                    sb.append("('");
                    sb.append((String) sparseArray.get(keyAt));
                    sb.append("')");
                }
            }
            sb.append("};decipher();");
            new Handler(Looper.getMainLooper()).post(new ij3(this, context, sb));
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0546 A[SYNTHETIC, Splitter:B:198:0x0546] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0566 A[SYNTHETIC, Splitter:B:208:0x0566] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0574 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0259 A[SYNTHETIC, Splitter:B:81:0x0259] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025f A[SYNTHETIC, Splitter:B:84:0x025f] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.SparseArray b() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36"
            java.lang.String r3 = "User-Agent"
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.net.URL r0 = new java.net.URL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "https://youtube.com/watch?v="
            r6.<init>(r7)
            java.lang.String r7 = r1.b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x05ca }
            r7 = r0
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x05ca }
            r7.setRequestProperty(r3, r2)     // Catch:{ all -> 0x05c6 }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x05c6 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x05c6 }
            java.io.InputStream r9 = r7.getInputStream()     // Catch:{ all -> 0x05c6 }
            r0.<init>(r9)     // Catch:{ all -> 0x05c6 }
            r8.<init>(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
        L_0x0042:
            java.lang.String r9 = r8.readLine()     // Catch:{ all -> 0x004c }
            if (r9 == 0) goto L_0x0050
            r0.append(r9)     // Catch:{ all -> 0x004c }
            goto L_0x0042
        L_0x004c:
            r0 = move-exception
            r6 = r8
            goto L_0x05ce
        L_0x0050:
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x004c }
            r8.close()
            r7.disconnect()
            java.util.regex.Pattern r0 = l
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r7 = r0.find()
            r8 = 1
            java.lang.String r11 = "UTF-8"
            if (r7 == 0) goto L_0x01e2
            org.json.JSONObject r7 = new org.json.JSONObject
            java.lang.String r0 = r0.group(r8)
            r7.<init>((java.lang.String) r0)
            java.lang.String r0 = "streamingData"
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            java.lang.String r12 = "formats"
            org.json.JSONArray r12 = r0.getJSONArray(r12)
            r13 = 0
        L_0x007f:
            int r14 = r12.length()
            java.lang.String r15 = "&"
            java.lang.String r6 = "\\u0026"
            java.lang.String r10 = "itag"
            java.lang.String r8 = "url"
            r16 = r2
            java.lang.String r2 = "signatureCipher"
            if (r13 >= r14) goto L_0x0111
            org.json.JSONObject r14 = r12.getJSONObject(r13)
            int r10 = r14.getInt(r10)
            r17 = r12
            android.util.SparseArray r12 = t
            java.lang.Object r18 = r12.get(r10)
            if (r18 == 0) goto L_0x0108
            boolean r18 = r14.has(r8)
            if (r18 == 0) goto L_0x00c0
            java.lang.String r2 = r14.getString(r8)
            java.lang.String r2 = r2.replace(r6, r15)
            qrg r6 = new qrg
            java.lang.Object r8 = r12.get(r10)
            da6 r8 = (defpackage.da6) r8
            r6.<init>(r8, r2)
            r5.append(r10, r6)
            goto L_0x0108
        L_0x00c0:
            boolean r6 = r14.has(r2)
            if (r6 == 0) goto L_0x0108
            java.util.regex.Pattern r6 = m
            java.lang.String r8 = r14.getString(r2)
            java.util.regex.Matcher r6 = r6.matcher(r8)
            java.util.regex.Pattern r8 = n
            java.lang.String r2 = r14.getString(r2)
            java.util.regex.Matcher r2 = r8.matcher(r2)
            boolean r8 = r6.find()
            if (r8 == 0) goto L_0x0108
            boolean r8 = r2.find()
            if (r8 == 0) goto L_0x0108
            r8 = 1
            java.lang.String r6 = r6.group(r8)
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r11)
            java.lang.String r2 = r2.group(r8)
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r11)
            qrg r8 = new qrg
            java.lang.Object r12 = r12.get(r10)
            da6 r12 = (defpackage.da6) r12
            r8.<init>(r12, r6)
            r5.append(r10, r8)
            r4.append(r10, r2)
        L_0x0108:
            int r13 = r13 + 1
            r2 = r16
            r12 = r17
            r8 = 1
            goto L_0x007f
        L_0x0111:
            java.lang.String r12 = "adaptiveFormats"
            org.json.JSONArray r0 = r0.getJSONArray(r12)
            r12 = 0
        L_0x0118:
            int r13 = r0.length()
            if (r12 >= r13) goto L_0x01ab
            org.json.JSONObject r13 = r0.getJSONObject(r12)
            int r14 = r13.getInt(r10)
            r17 = r0
            android.util.SparseArray r0 = t
            java.lang.Object r18 = r0.get(r14)
            if (r18 == 0) goto L_0x019e
            boolean r18 = r13.has(r8)
            if (r18 == 0) goto L_0x0151
            java.lang.String r13 = r13.getString(r8)
            java.lang.String r13 = r13.replace(r6, r15)
            r18 = r6
            qrg r6 = new qrg
            java.lang.Object r0 = r0.get(r14)
            da6 r0 = (defpackage.da6) r0
            r6.<init>(r0, r13)
            r5.append(r14, r6)
        L_0x014e:
            r19 = r8
            goto L_0x01a1
        L_0x0151:
            r18 = r6
            boolean r6 = r13.has(r2)
            if (r6 == 0) goto L_0x014e
            java.util.regex.Pattern r6 = m
            r19 = r8
            java.lang.String r8 = r13.getString(r2)
            java.util.regex.Matcher r6 = r6.matcher(r8)
            java.util.regex.Pattern r8 = n
            java.lang.String r13 = r13.getString(r2)
            java.util.regex.Matcher r8 = r8.matcher(r13)
            boolean r13 = r6.find()
            if (r13 == 0) goto L_0x01a1
            boolean r13 = r8.find()
            if (r13 == 0) goto L_0x01a1
            r13 = 1
            java.lang.String r6 = r6.group(r13)
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r11)
            java.lang.String r8 = r8.group(r13)
            java.lang.String r8 = java.net.URLDecoder.decode(r8, r11)
            qrg r13 = new qrg
            java.lang.Object r0 = r0.get(r14)
            da6 r0 = (defpackage.da6) r0
            r13.<init>(r0, r6)
            r5.append(r14, r13)
            r4.append(r14, r8)
            goto L_0x01a1
        L_0x019e:
            r18 = r6
            goto L_0x014e
        L_0x01a1:
            int r12 = r12 + 1
            r0 = r17
            r6 = r18
            r8 = r19
            goto L_0x0118
        L_0x01ab:
            java.lang.String r0 = "videoDetails"
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            java.lang.String r2 = "videoId"
            r0.getString(r2)
            java.lang.String r2 = "title"
            r0.getString(r2)
            java.lang.String r2 = "author"
            r0.getString(r2)
            java.lang.String r2 = "channelId"
            r0.getString(r2)
            java.lang.String r2 = "lengthSeconds"
            java.lang.String r2 = r0.getString(r2)
            java.lang.Long.parseLong(r2)
            java.lang.String r2 = "viewCount"
            java.lang.String r2 = r0.getString(r2)
            java.lang.Long.parseLong(r2)
            java.lang.String r2 = "isLiveContent"
            r0.getBoolean(r2)
            java.lang.String r2 = "shortDescription"
            r0.getString(r2)
            goto L_0x01e4
        L_0x01e2:
            r16 = r2
        L_0x01e4:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x05bd
            java.lang.String r0 = g
            java.lang.String r2 = "/decipher_js_funct"
            if (r0 == 0) goto L_0x01f8
            java.lang.String r0 = h
            if (r0 == 0) goto L_0x01f8
            java.lang.String r0 = i
            if (r0 != 0) goto L_0x0269
        L_0x01f8:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r1.c
            java.lang.String r6 = defpackage.wj6.n(r6, r7, r2)
            r0.<init>(r6)
            boolean r6 = r0.exists()
            if (r6 == 0) goto L_0x0269
            long r6 = java.lang.System.currentTimeMillis()
            long r12 = r0.lastModified()
            long r6 = r6 - r12
            r12 = 1209600000(0x48190800, double:5.97621805E-315)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0269
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            r7.<init>(r8, r11)     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0252, all -> 0x024e }
            java.lang.String r0 = r6.readLine()     // Catch:{ Exception -> 0x024c }
            g = r0     // Catch:{ Exception -> 0x024c }
            java.lang.String r0 = r6.readLine()     // Catch:{ Exception -> 0x024c }
            i = r0     // Catch:{ Exception -> 0x024c }
            java.lang.String r0 = r6.readLine()     // Catch:{ Exception -> 0x024c }
            h = r0     // Catch:{ Exception -> 0x024c }
            r6.close()     // Catch:{ IOException -> 0x0243 }
            goto L_0x0269
        L_0x0243:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()
            goto L_0x0269
        L_0x0249:
            r0 = move-exception
            r1 = r0
            goto L_0x025d
        L_0x024c:
            r0 = move-exception
            goto L_0x0254
        L_0x024e:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x025d
        L_0x0252:
            r0 = move-exception
            r6 = 0
        L_0x0254:
            r0.printStackTrace()     // Catch:{ all -> 0x0249 }
            if (r6 == 0) goto L_0x0269
            r6.close()     // Catch:{ IOException -> 0x0243 }
            goto L_0x0269
        L_0x025d:
            if (r6 == 0) goto L_0x0268
            r6.close()     // Catch:{ IOException -> 0x0263 }
            goto L_0x0268
        L_0x0263:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x0268:
            throw r1
        L_0x0269:
            java.util.regex.Pattern r0 = q
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r6 = r0.find()
            if (r6 != 0) goto L_0x027b
            java.util.regex.Pattern r0 = r
            java.util.regex.Matcher r0 = r0.matcher(r9)
        L_0x027b:
            boolean r6 = r0.find()
            if (r6 == 0) goto L_0x02a3
            r6 = 0
            java.lang.String r0 = r0.group(r6)
            java.lang.String r7 = "\\/"
            java.lang.String r8 = "/"
            java.lang.String r0 = r0.replace(r7, r8)
            java.lang.String r7 = g
            if (r7 == 0) goto L_0x0298
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x029a
        L_0x0298:
            r7 = 0
            goto L_0x029c
        L_0x029a:
            r7 = 0
            goto L_0x02a0
        L_0x029c:
            h = r7
            i = r7
        L_0x02a0:
            g = r0
            goto L_0x02a5
        L_0x02a3:
            r6 = 0
            r7 = 0
        L_0x02a5:
            r1.d = r7
            java.lang.String r0 = i
            java.lang.String r7 = "\n"
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = h
            if (r0 != 0) goto L_0x02b2
            goto L_0x02b7
        L_0x02b2:
            r1.a(r4)
            goto L_0x0549
        L_0x02b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "https://youtube.com"
            r0.<init>(r8)
            java.lang.String r8 = g
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.net.URL r8 = new java.net.URL
            r8.<init>(r0)
            java.net.URLConnection r0 = r8.openConnection()
            r8 = r0
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            r9 = r16
            r8.setRequestProperty(r3, r9)
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x05b2 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x05b2 }
            java.io.InputStream r9 = r8.getInputStream()     // Catch:{ all -> 0x05b2 }
            r0.<init>(r9)     // Catch:{ all -> 0x05b2 }
            r3.<init>(r0)     // Catch:{ all -> 0x05b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02fa }
            r0.<init>()     // Catch:{ all -> 0x02fa }
        L_0x02eb:
            java.lang.String r9 = r3.readLine()     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x02fe
            r0.append(r9)     // Catch:{ all -> 0x02fa }
            java.lang.String r9 = " "
            r0.append(r9)     // Catch:{ all -> 0x02fa }
            goto L_0x02eb
        L_0x02fa:
            r0 = move-exception
            r6 = r3
            goto L_0x05b4
        L_0x02fe:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02fa }
            r3.close()
            r8.disconnect()
            java.util.regex.Pattern r3 = s
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x0570
            r8 = 1
            java.lang.String r3 = r3.group(r8)
            i = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "(var |\\s|,|;)"
            r3.<init>(r9)
            java.lang.String r9 = i
            java.lang.String r10 = "$"
            java.lang.String r12 = "\\$"
            java.lang.String r9 = r9.replace(r10, r12)
            r3.append(r9)
            java.lang.String r9 = "(=function\\((.{1,3})\\)\\{)"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r9 = r3.find()
            java.lang.String r13 = "var "
            java.lang.String r14 = "function "
            r15 = 2
            if (r9 == 0) goto L_0x0361
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r13)
            java.lang.String r10 = i
            r9.append(r10)
            java.lang.String r10 = r3.group(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x039d
        L_0x0361:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            java.lang.String r9 = i
            java.lang.String r9 = r9.replace(r10, r12)
            r3.append(r9)
            java.lang.String r9 = "(\\((.{1,3})\\)\\{)"
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r9 = r3.find()
            if (r9 != 0) goto L_0x0388
            goto L_0x0570
        L_0x0388:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r14)
            java.lang.String r10 = i
            r9.append(r10)
            java.lang.String r10 = r3.group(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
        L_0x039d:
            int r3 = r3.end()
            r12 = r3
            r10 = r8
        L_0x03a3:
            int r6 = r0.length()
            r15 = 123(0x7b, float:1.72E-43)
            java.lang.String r8 = ";"
            if (r12 >= r6) goto L_0x03de
            if (r10 != 0) goto L_0x03c6
            int r6 = r3 + 5
            if (r6 >= r12) goto L_0x03c6
            java.lang.StringBuilder r6 = defpackage.tr1.o(r9)
            java.lang.String r3 = r0.substring(r3, r12)
            r6.append(r3)
            r6.append(r8)
            java.lang.String r9 = r6.toString()
            goto L_0x03de
        L_0x03c6:
            char r6 = r0.charAt(r12)
            if (r6 != r15) goto L_0x03cf
            int r10 = r10 + 1
            goto L_0x03d9
        L_0x03cf:
            char r6 = r0.charAt(r12)
            r8 = 125(0x7d, float:1.75E-43)
            if (r6 != r8) goto L_0x03d9
            int r10 = r10 + -1
        L_0x03d9:
            int r12 = r12 + 1
            r8 = 1
            r15 = 2
            goto L_0x03a3
        L_0x03de:
            h = r9
            java.util.regex.Pattern r3 = o
            java.util.regex.Matcher r3 = r3.matcher(r9)
        L_0x03e6:
            boolean r6 = r3.find()
            if (r6 == 0) goto L_0x045f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r13)
            r10 = 2
            java.lang.String r12 = r3.group(r10)
            r6.append(r12)
            java.lang.String r10 = "={"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = h
            boolean r10 = r10.contains(r6)
            if (r10 == 0) goto L_0x040b
            goto L_0x03e6
        L_0x040b:
            int r10 = r0.indexOf(r6)
            int r12 = r6.length()
            int r12 = r12 + r10
            r19 = r3
            r15 = r12
            r10 = 1
        L_0x0418:
            int r3 = r0.length()
            if (r15 >= r3) goto L_0x045a
            if (r10 != 0) goto L_0x043e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = h
            r3.append(r10)
            r3.append(r6)
            java.lang.String r6 = r0.substring(r12, r15)
            r3.append(r6)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            h = r3
            goto L_0x045a
        L_0x043e:
            char r3 = r0.charAt(r15)
            r20 = r6
            r6 = 123(0x7b, float:1.72E-43)
            if (r3 != r6) goto L_0x044b
            int r10 = r10 + 1
            goto L_0x0455
        L_0x044b:
            char r3 = r0.charAt(r15)
            r6 = 125(0x7d, float:1.75E-43)
            if (r3 != r6) goto L_0x0455
            int r10 = r10 + -1
        L_0x0455:
            int r15 = r15 + 1
            r6 = r20
            goto L_0x0418
        L_0x045a:
            r3 = r19
            r15 = 123(0x7b, float:1.72E-43)
            goto L_0x03e6
        L_0x045f:
            java.util.regex.Pattern r3 = p
            java.util.regex.Matcher r3 = r3.matcher(r9)
        L_0x0465:
            boolean r6 = r3.find()
            if (r6 == 0) goto L_0x04dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r9 = 2
            java.lang.String r10 = r3.group(r9)
            r6.append(r10)
            java.lang.String r10 = "("
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = h
            boolean r10 = r10.contains(r6)
            if (r10 == 0) goto L_0x048a
            goto L_0x0465
        L_0x048a:
            int r10 = r0.indexOf(r6)
            int r12 = r6.length()
            int r12 = r12 + r10
            r10 = r12
            r13 = 0
        L_0x0495:
            int r15 = r0.length()
            if (r10 >= r15) goto L_0x04be
            if (r13 != 0) goto L_0x04c1
            int r15 = r12 + 5
            if (r15 >= r10) goto L_0x04c1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = h
            r13.append(r15)
            r13.append(r6)
            java.lang.String r6 = r0.substring(r12, r10)
            r13.append(r6)
            r13.append(r8)
            java.lang.String r6 = r13.toString()
            h = r6
        L_0x04be:
            r9 = 125(0x7d, float:1.75E-43)
            goto L_0x0465
        L_0x04c1:
            char r15 = r0.charAt(r10)
            r9 = 123(0x7b, float:1.72E-43)
            if (r15 != r9) goto L_0x04ce
            int r13 = r13 + 1
            r9 = 125(0x7d, float:1.75E-43)
            goto L_0x04d8
        L_0x04ce:
            char r15 = r0.charAt(r10)
            r9 = 125(0x7d, float:1.75E-43)
            if (r15 != r9) goto L_0x04d8
            int r13 = r13 + -1
        L_0x04d8:
            int r10 = r10 + 1
            r9 = 2
            goto L_0x0495
        L_0x04dc:
            r1.a(r4)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r1.c
            java.lang.String r2 = defpackage.wj6.n(r3, r6, r2)
            r0.<init>(r2)
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            r6.<init>(r0)     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            r3.<init>(r6, r11)     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x053f, all -> 0x053b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0539 }
            r0.<init>()     // Catch:{ Exception -> 0x0539 }
            java.lang.String r3 = g     // Catch:{ Exception -> 0x0539 }
            r0.append(r3)     // Catch:{ Exception -> 0x0539 }
            r0.append(r7)     // Catch:{ Exception -> 0x0539 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0539 }
            r2.write(r0)     // Catch:{ Exception -> 0x0539 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0539 }
            r0.<init>()     // Catch:{ Exception -> 0x0539 }
            java.lang.String r3 = i     // Catch:{ Exception -> 0x0539 }
            r0.append(r3)     // Catch:{ Exception -> 0x0539 }
            r0.append(r7)     // Catch:{ Exception -> 0x0539 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0539 }
            r2.write(r0)     // Catch:{ Exception -> 0x0539 }
            java.lang.String r0 = h     // Catch:{ Exception -> 0x0539 }
            r2.write(r0)     // Catch:{ Exception -> 0x0539 }
            r2.close()     // Catch:{ IOException -> 0x052f }
            goto L_0x0549
        L_0x052f:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
            goto L_0x0549
        L_0x0535:
            r0 = move-exception
            r1 = r0
            r6 = r2
            goto L_0x0564
        L_0x0539:
            r0 = move-exception
            goto L_0x0541
        L_0x053b:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x0564
        L_0x053f:
            r0 = move-exception
            r2 = 0
        L_0x0541:
            r0.printStackTrace()     // Catch:{ all -> 0x0535 }
            if (r2 == 0) goto L_0x0549
            r2.close()     // Catch:{ IOException -> 0x052f }
        L_0x0549:
            java.util.concurrent.locks.ReentrantLock r0 = r1.e
            r0.lock()
            java.util.concurrent.locks.Condition r0 = r1.f     // Catch:{ all -> 0x055d }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x055d }
            r8 = 7
            r0.await(r8, r2)     // Catch:{ all -> 0x055d }
            java.util.concurrent.locks.ReentrantLock r0 = r1.e
            r0.unlock()
            goto L_0x0570
        L_0x055d:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r1.e
            r1.unlock()
            throw r0
        L_0x0564:
            if (r6 == 0) goto L_0x056f
            r6.close()     // Catch:{ IOException -> 0x056a }
            goto L_0x056f
        L_0x056a:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()
        L_0x056f:
            throw r1
        L_0x0570:
            java.lang.String r0 = r1.d
            if (r0 != 0) goto L_0x0576
            r1 = 0
            return r1
        L_0x0576:
            java.lang.String[] r0 = r0.split(r7)
            r10 = 0
        L_0x057b:
            int r1 = r4.size()
            if (r10 >= r1) goto L_0x05bd
            int r1 = r0.length
            if (r10 >= r1) goto L_0x05bd
            int r1 = r4.keyAt(r10)
            java.lang.Object r2 = r5.get(r1)
            qrg r2 = (defpackage.qrg) r2
            java.lang.String r2 = r2.b
            java.lang.String r3 = "&sig="
            java.lang.StringBuilder r2 = defpackage.g63.m(r2, r3)
            r3 = r0[r10]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            qrg r3 = new qrg
            android.util.SparseArray r6 = t
            java.lang.Object r6 = r6.get(r1)
            da6 r6 = (defpackage.da6) r6
            r3.<init>(r6, r2)
            r5.put(r1, r3)
            int r10 = r10 + 1
            goto L_0x057b
        L_0x05b2:
            r0 = move-exception
            r6 = 0
        L_0x05b4:
            if (r6 == 0) goto L_0x05b9
            r6.close()
        L_0x05b9:
            r8.disconnect()
            throw r0
        L_0x05bd:
            int r0 = r5.size()
            if (r0 != 0) goto L_0x05c5
            r1 = 0
            return r1
        L_0x05c5:
            return r5
        L_0x05c6:
            r0 = move-exception
            r1 = 0
            r6 = r1
            goto L_0x05ce
        L_0x05ca:
            r0 = move-exception
            r1 = 0
            r6 = r1
            r7 = r6
        L_0x05ce:
            if (r6 == 0) goto L_0x05d3
            r6.close()
        L_0x05d3:
            if (r7 == 0) goto L_0x05d8
            r7.disconnect()
        L_0x05d8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.org.b():android.util.SparseArray");
    }

    public final Object doInBackground(Object[] objArr) {
        this.b = null;
        String str = ((String[]) objArr)[0];
        if (str == null) {
            return null;
        }
        Matcher matcher = j.matcher(str);
        if (matcher.find()) {
            this.b = matcher.group(3);
        } else {
            Matcher matcher2 = k.matcher(str);
            if (matcher2.find()) {
                this.b = matcher2.group(3);
            } else if (str.matches("\\p{Graph}+?")) {
                this.b = str;
            }
        }
        if (this.b == null) {
            return null;
        }
        try {
            return b();
        } catch (Exception unused) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
    }
}
