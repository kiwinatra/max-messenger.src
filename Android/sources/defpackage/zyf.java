package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: zyf  reason: default package */
public final class zyf {
    public final Context a;
    public final tp9 b;
    public final g95 c;
    public final rm7 d;
    public final Executor e;
    public final q6f f;
    public final lzf g;
    public final lzf h;
    public final s23 i;

    public zyf(Context context, tp9 tp9, g95 g95, rm7 rm7, Executor executor, q6f q6f, lzf lzf, lzf lzf2, s23 s23) {
        this.a = context;
        this.b = tp9;
        this.c = g95;
        this.d = rm7;
        this.e = executor;
        this.f = q6f;
        this.g = lzf;
        this.h = lzf2;
        this.i = s23;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r5v13, types: [kq9, java.lang.Object] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:219:0x052f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0418 A[SYNTHETIC, Splitter:B:124:0x0418] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x042e A[Catch:{ all -> 0x04a6, all -> 0x04ae, all -> 0x049d, all -> 0x04ba, IOException -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0455 A[Catch:{ all -> 0x04a6, all -> 0x04ae, all -> 0x049d, all -> 0x04ba, IOException -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0457 A[Catch:{ all -> 0x04a6, all -> 0x04ae, all -> 0x049d, all -> 0x04ba, IOException -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0519 A[SYNTHETIC, Splitter:B:210:0x0519] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x055d A[Catch:{ IOException -> 0x05d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0573 A[Catch:{ IOException -> 0x05d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0576 A[Catch:{ IOException -> 0x05d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x058f A[Catch:{ IOException -> 0x05d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0522 A[EDGE_INSN: B:297:0x0522->B:216:0x0522 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0588 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x037d A[Catch:{ IOException -> 0x05c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03c1 A[Catch:{ IOException -> 0x05c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.tc0 r47, int r48) {
        /*
            r46 = this;
            r8 = r46
            r9 = r47
            r10 = 1
            r2 = 0
            r3 = 2
            tp9 r0 = r8.b
            java.lang.String r4 = r9.a
            nsf r4 = r0.a(r4)
            r11 = 0
        L_0x0011:
            yyf r0 = new yyf
            r0.<init>(r8, r9, r2)
            q6f r7 = r8.f
            r13 = r7
            nbd r13 = (defpackage.nbd) r13
            java.lang.Object r0 = r13.e0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0689
            yyf r0 = new yyf
            r0.<init>(r8, r9, r10)
            java.lang.Object r0 = r13.e0(r0)
            r7 = r0
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r0 = r7.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            r14 = 3
            r5 = -1
            byte[] r15 = r9.b
            if (r4 != 0) goto L_0x0060
            java.lang.String r0 = "Uploader"
            java.lang.String r10 = "Unknown backend for %s, deleting event batch for it..."
            defpackage.y64.q(r9, r0, r10)
            ca0 r0 = new ca0
            r0.<init>(r14, r5)
            r5 = r3
            r30 = r4
            r34 = r7
            r32 = r11
            r31 = r13
            r22 = r15
            r1 = 0
            goto L_0x05db
        L_0x0060:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r7.iterator()
        L_0x0069:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x007d
            java.lang.Object r16 = r10.next()
            r1 = r16
            rb0 r1 = (defpackage.rb0) r1
            ua0 r1 = r1.c
            r0.add(r1)
            goto L_0x0069
        L_0x007d:
            if (r15 == 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0081:
            r1 = r2
        L_0x0082:
            java.lang.String r10 = "proto"
            if (r1 == 0) goto L_0x00ec
            s23 r1 = r8.i
            java.util.Objects.requireNonNull(r1)
            jrf r5 = new jrf
            r5.<init>((int) r3, (java.lang.Object) r1)
            java.lang.Object r1 = r13.e0(r5)
            w23 r1 = (defpackage.w23) r1
            kq9 r5 = new kq9
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.w = r6
            lzf r6 = r8.g
            long r17 = r6.a()
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            r5.o = r6
            lzf r6 = r8.h
            long r17 = r6.a()
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            r5.v = r6
            java.lang.String r6 = "GDT_CLIENT_METRICS"
            r5.a = r6
            l55 r6 = new l55
            l65 r14 = new l65
            r14.<init>(r10)
            r1.getClass()
            g6d r3 = defpackage.r8c.a
            r3.getClass()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3.m(r1, r2)     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            byte[] r1 = r2.toByteArray()
            r6.<init>(r14, r1)
            r5.c = r6
            ua0 r1 = r5.b()
            r2 = r4
            zx1 r2 = (defpackage.zx1) r2
            ua0 r1 = r2.a(r1)
            r0.add(r1)
        L_0x00ec:
            r1 = r4
            zx1 r1 = (defpackage.zx1) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00f8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0122
            java.lang.Object r3 = r0.next()
            ua0 r3 = (defpackage.ua0) r3
            java.lang.String r5 = r3.a
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0118
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r3)
            r2.put(r5, r6)
            goto L_0x00f8
        L_0x0118:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L_0x00f8
        L_0x0122:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x012f:
            boolean r3 = r2.hasNext()
            java.lang.String r5 = "TRuntime."
            java.lang.String r6 = "CctTransportBackend"
            if (r3 == 0) goto L_0x0333
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r20 = r3.getValue()
            r14 = r20
            java.util.List r14 = (java.util.List) r14
            r20 = r2
            r2 = 0
            java.lang.Object r14 = r14.get(r2)
            ua0 r14 = (defpackage.ua0) r14
            lac r2 = defpackage.lac.a
            lzf r2 = r1.f
            long r22 = r2.a()
            lzf r2 = r1.e
            long r24 = r2.a()
            java.lang.String r2 = "sdk-version"
            int r2 = r14.b(r2)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "model"
            java.lang.String r28 = r14.a(r2)
            java.lang.String r2 = "hardware"
            java.lang.String r29 = r14.a(r2)
            java.lang.String r2 = "device"
            java.lang.String r30 = r14.a(r2)
            java.lang.String r2 = "product"
            java.lang.String r31 = r14.a(r2)
            java.lang.String r2 = "os-uild"
            java.lang.String r32 = r14.a(r2)
            java.lang.String r2 = "manufacturer"
            java.lang.String r33 = r14.a(r2)
            java.lang.String r2 = "fingerprint"
            java.lang.String r34 = r14.a(r2)
            java.lang.String r2 = "country"
            java.lang.String r36 = r14.a(r2)
            java.lang.String r2 = "locale"
            java.lang.String r35 = r14.a(r2)
            java.lang.String r2 = "mcc_mnc"
            java.lang.String r37 = r14.a(r2)
            java.lang.String r2 = "application_build"
            java.lang.String r38 = r14.a(r2)
            v90 r2 = new v90
            r26 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            ka0 r14 = new ka0
            r14.<init>(r2)
            java.lang.Object r2 = r3.getKey()     // Catch:{ NumberFormatException -> 0x01c9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x01c9 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01c9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01c9 }
            r27 = r2
            r28 = 0
            goto L_0x01d3
        L_0x01c9:
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r28 = r2
            r27 = 0
        L_0x01d3:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x01e2:
            boolean r19 = r3.hasNext()
            if (r19 == 0) goto L_0x0315
            java.lang.Object r19 = r3.next()
            r21 = r3
            r3 = r19
            ua0 r3 = (defpackage.ua0) r3
            r30 = r4
            l55 r4 = r3.c
            l65 r9 = r4.a
            l65 r8 = new l65
            r8.<init>(r10)
            boolean r8 = r9.equals(r8)
            byte[] r4 = r4.b
            if (r8 == 0) goto L_0x0210
            ay2 r8 = new ay2
            r9 = 2
            r8.<init>((int) r9)
            r8.w = r4
            r31 = r10
            goto L_0x0233
        L_0x0210:
            l65 r8 = new l65
            r31 = r10
            java.lang.String r10 = "json"
            r8.<init>(r10)
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0306
            java.lang.String r8 = new java.lang.String
            java.lang.String r9 = "UTF-8"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r9)
            r8.<init>(r4, r9)
            ay2 r4 = new ay2
            r9 = 2
            r4.<init>((int) r9)
            r4.b = r8
            r8 = r4
        L_0x0233:
            long r9 = r3.d
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r8.c = r4
            long r9 = r3.e
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r8.v = r4
            java.util.Map r4 = r3.f
            java.lang.String r9 = "tz-offset"
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0252
            r9 = 0
            goto L_0x025a
        L_0x0252:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r9 = r4.longValue()
        L_0x025a:
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r8.x = r4
            java.lang.String r4 = "net-type"
            int r4 = r3.b(r4)
            android.util.SparseArray r9 = defpackage.r6a.a
            java.lang.Object r4 = r9.get(r4)
            r6a r4 = (defpackage.r6a) r4
            java.lang.String r9 = "mobile-subtype"
            int r9 = r3.b(r9)
            android.util.SparseArray r10 = defpackage.q6a.a
            java.lang.Object r9 = r10.get(r9)
            q6a r9 = (defpackage.q6a) r9
            mb0 r10 = new mb0
            r10.<init>(r4, r9)
            r8.y = r10
            java.lang.Integer r3 = r3.b
            if (r3 == 0) goto L_0x0289
            r8.o = r3
        L_0x0289:
            java.lang.Object r3 = r8.c
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L_0x0292
            java.lang.String r3 = " eventTimeMs"
            goto L_0x0294
        L_0x0292:
            java.lang.String r3 = ""
        L_0x0294:
            java.lang.Object r4 = r8.v
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02a0
            java.lang.String r4 = " eventUptimeMs"
            java.lang.String r3 = r3.concat(r4)
        L_0x02a0:
            java.lang.Object r4 = r8.x
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02ac
            java.lang.String r4 = " timezoneOffsetSeconds"
            java.lang.String r3 = defpackage.tr1.j(r3, r4)
        L_0x02ac:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02fa
            ib0 r3 = new ib0
            java.lang.Object r4 = r8.c
            java.lang.Long r4 = (java.lang.Long) r4
            long r33 = r4.longValue()
            java.lang.Object r4 = r8.o
            r35 = r4
            java.lang.Integer r35 = (java.lang.Integer) r35
            java.lang.Object r4 = r8.v
            java.lang.Long r4 = (java.lang.Long) r4
            long r36 = r4.longValue()
            java.lang.Object r4 = r8.w
            r38 = r4
            byte[] r38 = (byte[]) r38
            java.lang.Object r4 = r8.b
            r39 = r4
            java.lang.String r39 = (java.lang.String) r39
            java.lang.Object r4 = r8.x
            java.lang.Long r4 = (java.lang.Long) r4
            long r40 = r4.longValue()
            java.lang.Object r4 = r8.y
            s6a r4 = (defpackage.s6a) r4
            r42 = r4
            mb0 r42 = (defpackage.mb0) r42
            r32 = r3
            r32.<init>(r33, r35, r36, r38, r39, r40, r42)
            r2.add(r3)
        L_0x02ee:
            r8 = r46
            r9 = r47
            r3 = r21
            r4 = r30
            r10 = r31
            goto L_0x01e2
        L_0x02fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x0306:
            java.lang.String r3 = r5.concat(r6)
            r4 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x02ee
            r9.toString()
            goto L_0x02ee
        L_0x0315:
            r30 = r4
            r31 = r10
            jb0 r3 = new jb0
            r21 = r3
            r26 = r14
            r29 = r2
            r21.<init>(r22, r24, r26, r27, r28, r29)
            r0.add(r3)
            r8 = r46
            r9 = r47
            r2 = r20
            r4 = r30
            r10 = r31
            goto L_0x012f
        L_0x0333:
            r30 = r4
            r4 = 5
            da0 r2 = new da0
            r2.<init>(r0)
            java.net.URL r0 = r1.d
            if (r15 == 0) goto L_0x0367
            ax0 r3 = defpackage.ax0.a(r15)     // Catch:{ IllegalArgumentException -> 0x0352 }
            java.lang.String r8 = r3.b     // Catch:{ IllegalArgumentException -> 0x0352 }
            if (r8 == 0) goto L_0x0348
            goto L_0x0349
        L_0x0348:
            r8 = 0
        L_0x0349:
            java.lang.String r3 = r3.a     // Catch:{ IllegalArgumentException -> 0x0352 }
            if (r3 == 0) goto L_0x0368
            java.net.URL r0 = defpackage.zx1.b(r3)     // Catch:{ IllegalArgumentException -> 0x0352 }
            goto L_0x0368
        L_0x0352:
            ca0 r0 = new ca0
            r1 = 3
            r2 = -1
            r0.<init>(r1, r2)
            r34 = r7
            r32 = r11
            r31 = r13
            r22 = r15
            r1 = 0
        L_0x0364:
            r5 = 2
            goto L_0x05db
        L_0x0367:
            r8 = 0
        L_0x0368:
            jk3 r3 = new jk3     // Catch:{ IOException -> 0x05c6 }
            r3.<init>(r0, r2, r8)     // Catch:{ IOException -> 0x05c6 }
            r14 = r4
        L_0x036e:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05c6 }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r2 = r5.concat(r6)     // Catch:{ IOException -> 0x05c6 }
            r4 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ IOException -> 0x05c6 }
            if (r2 == 0) goto L_0x0380
            java.util.Objects.toString(r0)     // Catch:{ IOException -> 0x05c6 }
        L_0x0380:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05c6 }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05c6 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x05c6 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x05c6 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)     // Catch:{ IOException -> 0x05c6 }
            int r2 = r1.g     // Catch:{ IOException -> 0x05c6 }
            r0.setReadTimeout(r2)     // Catch:{ IOException -> 0x05c6 }
            r2 = 1
            r0.setDoOutput(r2)     // Catch:{ IOException -> 0x05c6 }
            r2 = 0
            r0.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = "datatransport/3.1.9 android/"
            r0.setRequestProperty(r4, r8)     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r0.setRequestProperty(r4, r8)     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "application/json"
            r0.setRequestProperty(r9, r10)     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r10 = "Accept-Encoding"
            r0.setRequestProperty(r10, r8)     // Catch:{ IOException -> 0x05c6 }
            java.lang.Object r10 = r3.c     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x05c6 }
            if (r10 == 0) goto L_0x03c6
            java.lang.String r2 = "X-Goog-Api-Key"
            r0.setRequestProperty(r2, r10)     // Catch:{ IOException -> 0x05c6 }
        L_0x03c6:
            java.io.OutputStream r10 = r0.getOutputStream()     // Catch:{ ConnectException | UnknownHostException -> 0x053e, EncodingException | IOException -> 0x0523 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0509 }
            r2.<init>(r10)     // Catch:{ all -> 0x0509 }
            r22 = r15
            xv1 r15 = r1.a     // Catch:{ all -> 0x04f5 }
            r23 = r1
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x04ed }
            gm0 r1 = (defpackage.gm0) r1     // Catch:{ all -> 0x04ed }
            r31 = r13
            java.io.BufferedWriter r13 = new java.io.BufferedWriter     // Catch:{ all -> 0x04e7 }
            r32 = r11
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x04e1 }
            r11.<init>(r2)     // Catch:{ all -> 0x04e1 }
            r13.<init>(r11)     // Catch:{ all -> 0x04e1 }
            xp7 r11 = new xp7     // Catch:{ all -> 0x04db }
            java.lang.Object r12 = r15.b     // Catch:{ all -> 0x04db }
            ep7 r12 = (defpackage.ep7) r12     // Catch:{ all -> 0x04db }
            java.util.HashMap r15 = r12.a     // Catch:{ all -> 0x04db }
            r34 = r7
            java.util.HashMap r7 = r12.b     // Catch:{ all -> 0x04d9 }
            r35 = r14
            bp7 r14 = r12.c     // Catch:{ all -> 0x04d7 }
            boolean r12 = r12.d     // Catch:{ all -> 0x04d7 }
            r24 = r11
            r25 = r13
            r26 = r15
            r27 = r7
            r28 = r14
            r29 = r12
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x04d7 }
            r11.f(r1)     // Catch:{ all -> 0x04d7 }
            r11.h()     // Catch:{ all -> 0x04d7 }
            android.util.JsonWriter r1 = r11.b     // Catch:{ all -> 0x04d7 }
            r1.flush()     // Catch:{ all -> 0x04d7 }
            r2.close()     // Catch:{ all -> 0x04d4 }
            if (r10 == 0) goto L_0x041b
            r10.close()     // Catch:{ ConnectException | UnknownHostException -> 0x054a, EncodingException | IOException -> 0x052f }
        L_0x041b:
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x05ce }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x05ce }
            java.lang.String r7 = r5.concat(r6)     // Catch:{ IOException -> 0x05ce }
            r10 = 4
            boolean r7 = android.util.Log.isLoggable(r7, r10)     // Catch:{ IOException -> 0x05ce }
            if (r7 == 0) goto L_0x0437
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x05ce }
            java.lang.String r7 = "Status Code: %d"
            java.lang.String.format(r7, r2)     // Catch:{ IOException -> 0x05ce }
        L_0x0437:
            java.lang.String r2 = "Content-Type: %s"
            java.lang.String r7 = r0.getHeaderField(r9)     // Catch:{ IOException -> 0x05ce }
            defpackage.y64.q(r7, r6, r2)     // Catch:{ IOException -> 0x05ce }
            java.lang.String r2 = "Content-Encoding: %s"
            java.lang.String r7 = r0.getHeaderField(r4)     // Catch:{ IOException -> 0x05ce }
            defpackage.y64.q(r7, r6, r2)     // Catch:{ IOException -> 0x05ce }
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 == r2) goto L_0x04c0
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 == r2) goto L_0x04c0
            r2 = 307(0x133, float:4.3E-43)
            if (r1 != r2) goto L_0x0457
            goto L_0x04c0
        L_0x0457:
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x046b
            gv1 r0 = new gv1     // Catch:{ IOException -> 0x05ce }
            r2 = 0
            r7 = 0
            r0.<init>(r1, r2, r7)     // Catch:{ IOException -> 0x0468 }
        L_0x0463:
            r1 = 0
            r4 = 0
            goto L_0x0557
        L_0x0468:
            r1 = r7
            goto L_0x05d0
        L_0x046b:
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x05ce }
            java.lang.String r0 = r0.getHeaderField(r4)     // Catch:{ all -> 0x049d }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x049d }
            if (r0 == 0) goto L_0x0480
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x049d }
            r0.<init>(r2)     // Catch:{ all -> 0x049d }
            r4 = r0
            goto L_0x0481
        L_0x0480:
            r4 = r2
        L_0x0481:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x04a6 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x04a6 }
            r7.<init>(r4)     // Catch:{ all -> 0x04a6 }
            r0.<init>(r7)     // Catch:{ all -> 0x04a6 }
            kb0 r0 = defpackage.kb0.a(r0)     // Catch:{ all -> 0x04a6 }
            long r7 = r0.a     // Catch:{ all -> 0x04a6 }
            gv1 r0 = new gv1     // Catch:{ all -> 0x04a6 }
            r11 = 0
            r0.<init>(r1, r11, r7)     // Catch:{ all -> 0x04a6 }
            if (r4 == 0) goto L_0x04a0
            r4.close()     // Catch:{ all -> 0x049d }
            goto L_0x04a0
        L_0x049d:
            r0 = move-exception
            r1 = r0
            goto L_0x04b4
        L_0x04a0:
            if (r2 == 0) goto L_0x0463
            r2.close()     // Catch:{ IOException -> 0x05ce }
            goto L_0x0463
        L_0x04a6:
            r0 = move-exception
            r1 = r0
            if (r4 == 0) goto L_0x04b3
            r4.close()     // Catch:{ all -> 0x04ae }
            goto L_0x04b3
        L_0x04ae:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ all -> 0x049d }
        L_0x04b3:
            throw r1     // Catch:{ all -> 0x049d }
        L_0x04b4:
            if (r2 == 0) goto L_0x04bf
            r2.close()     // Catch:{ all -> 0x04ba }
            goto L_0x04bf
        L_0x04ba:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x05ce }
        L_0x04bf:
            throw r1     // Catch:{ IOException -> 0x05ce }
        L_0x04c0:
            java.lang.String r2 = "Location"
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ IOException -> 0x05ce }
            gv1 r2 = new gv1     // Catch:{ IOException -> 0x05ce }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x05ce }
            r4.<init>(r0)     // Catch:{ IOException -> 0x05ce }
            r7 = 0
            r2.<init>(r1, r4, r7)     // Catch:{ IOException -> 0x05ce }
            r0 = r2
            goto L_0x0463
        L_0x04d4:
            r0 = move-exception
        L_0x04d5:
            r1 = r0
            goto L_0x0517
        L_0x04d7:
            r0 = move-exception
            goto L_0x04df
        L_0x04d9:
            r0 = move-exception
            goto L_0x04e4
        L_0x04db:
            r0 = move-exception
            r34 = r7
            goto L_0x04e4
        L_0x04df:
            r1 = r0
            goto L_0x04ff
        L_0x04e1:
            r0 = move-exception
            r34 = r7
        L_0x04e4:
            r35 = r14
            goto L_0x04df
        L_0x04e7:
            r0 = move-exception
            r34 = r7
            r32 = r11
            goto L_0x04e4
        L_0x04ed:
            r0 = move-exception
            r34 = r7
            r32 = r11
            r31 = r13
            goto L_0x04e4
        L_0x04f5:
            r0 = move-exception
            r23 = r1
            r34 = r7
            r32 = r11
            r31 = r13
            goto L_0x04e4
        L_0x04ff:
            r2.close()     // Catch:{ all -> 0x0503 }
            goto L_0x0508
        L_0x0503:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ all -> 0x04d4 }
        L_0x0508:
            throw r1     // Catch:{ all -> 0x04d4 }
        L_0x0509:
            r0 = move-exception
            r23 = r1
            r34 = r7
            r32 = r11
            r31 = r13
            r35 = r14
            r22 = r15
            goto L_0x04d5
        L_0x0517:
            if (r10 == 0) goto L_0x0522
            r10.close()     // Catch:{ all -> 0x051d }
            goto L_0x0522
        L_0x051d:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x054a, EncodingException | IOException -> 0x052f }
        L_0x0522:
            throw r1     // Catch:{ ConnectException | UnknownHostException -> 0x054a, EncodingException | IOException -> 0x052f }
        L_0x0523:
            r23 = r1
            r34 = r7
            r32 = r11
            r31 = r13
            r35 = r14
            r22 = r15
        L_0x052f:
            defpackage.y64.u(r6)     // Catch:{ IOException -> 0x05ce }
            gv1 r0 = new gv1     // Catch:{ IOException -> 0x05ce }
            r1 = 0
            r4 = 0
            r7 = 400(0x190, float:5.6E-43)
            r0.<init>(r7, r4, r1)     // Catch:{ IOException -> 0x05ce }
            goto L_0x0463
        L_0x053e:
            r23 = r1
            r34 = r7
            r32 = r11
            r31 = r13
            r35 = r14
            r22 = r15
        L_0x054a:
            defpackage.y64.u(r6)     // Catch:{ IOException -> 0x05ce }
            gv1 r0 = new gv1     // Catch:{ IOException -> 0x05ce }
            r1 = 0
            r4 = 0
            r7 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r7, r4, r1)     // Catch:{ IOException -> 0x05d0 }
        L_0x0557:
            java.lang.Object r7 = r0.c     // Catch:{ IOException -> 0x05d0 }
            java.net.URL r7 = (java.net.URL) r7     // Catch:{ IOException -> 0x05d0 }
            if (r7 == 0) goto L_0x0573
            java.lang.String r8 = "Following redirect to: %s"
            defpackage.y64.q(r7, r6, r8)     // Catch:{ IOException -> 0x05d0 }
            jk3 r8 = new jk3     // Catch:{ IOException -> 0x05d0 }
            java.lang.Object r9 = r3.b     // Catch:{ IOException -> 0x05d0 }
            gm0 r9 = (defpackage.gm0) r9     // Catch:{ IOException -> 0x05d0 }
            java.lang.Object r3 = r3.c     // Catch:{ IOException -> 0x05d0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x05d0 }
            da0 r9 = (defpackage.da0) r9     // Catch:{ IOException -> 0x05d0 }
            r8.<init>(r7, r9, r3)     // Catch:{ IOException -> 0x05d0 }
            r3 = r8
            goto L_0x0574
        L_0x0573:
            r3 = r4
        L_0x0574:
            if (r3 == 0) goto L_0x0588
            int r14 = r35 + -1
            r7 = 1
            if (r14 >= r7) goto L_0x057c
            goto L_0x0589
        L_0x057c:
            r15 = r22
            r1 = r23
            r13 = r31
            r11 = r32
            r7 = r34
            goto L_0x036e
        L_0x0588:
            r7 = 1
        L_0x0589:
            int r3 = r0.a     // Catch:{ IOException -> 0x05d0 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0598
            long r3 = r0.b     // Catch:{ IOException -> 0x05d0 }
            ca0 r0 = new ca0     // Catch:{ IOException -> 0x05d0 }
            r0.<init>(r7, r3)     // Catch:{ IOException -> 0x05d0 }
            goto L_0x0364
        L_0x0598:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r4) goto L_0x05a0
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x05a3
        L_0x05a0:
            r3 = -1
            goto L_0x05be
        L_0x05a3:
            r4 = 400(0x190, float:5.6E-43)
            if (r3 != r4) goto L_0x05b4
            ca0 r0 = new ca0     // Catch:{ IOException -> 0x05b1 }
            r3 = -1
            r5 = 4
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05d0 }
            goto L_0x0364
        L_0x05b1:
            r3 = -1
            goto L_0x05d0
        L_0x05b4:
            r3 = -1
            ca0 r0 = new ca0     // Catch:{ IOException -> 0x05d0 }
            r5 = 3
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05d0 }
            goto L_0x0364
        L_0x05be:
            ca0 r0 = new ca0     // Catch:{ IOException -> 0x05d0 }
            r5 = 2
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05d0 }
            goto L_0x0364
        L_0x05c6:
            r34 = r7
            r32 = r11
            r31 = r13
            r22 = r15
        L_0x05ce:
            r1 = 0
        L_0x05d0:
            defpackage.y64.u(r6)
            ca0 r0 = new ca0
            r3 = -1
            r5 = 2
            r0.<init>(r5, r3)
        L_0x05db:
            int r3 = r0.a
            if (r3 != r5) goto L_0x0600
            cr0 r0 = new cr0
            r7 = 6
            r1 = r0
            r2 = r46
            r3 = r34
            r4 = r47
            r5 = r32
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (long) r5, (int) r7)
            r7 = r31
            r7.e0(r0)
            r4 = 1
            int r0 = r48 + 1
            r6 = r46
            rm7 r1 = r6.d
            r8 = r47
            r1.a(r8, r0, r4)
            return
        L_0x0600:
            r6 = r46
            r8 = r47
            r7 = r31
            r4 = 1
            pbb r9 = new pbb
            r10 = 27
            r11 = r34
            r9.<init>(r10, r6, r11)
            r7.e0(r9)
            if (r3 != r4) goto L_0x062d
            long r3 = r0.b
            r9 = r32
            long r11 = java.lang.Math.max(r9, r3)
            if (r22 == 0) goto L_0x0629
            jrf r0 = new jrf
            r4 = 4
            r0.<init>((int) r4, (java.lang.Object) r6)
            r7.e0(r0)
            goto L_0x062a
        L_0x0629:
            r4 = 4
        L_0x062a:
            r9 = r11
        L_0x062b:
            r12 = 1
            goto L_0x0679
        L_0x062d:
            r9 = r32
            r4 = 4
            if (r3 != r4) goto L_0x062b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x063b:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x066e
            java.lang.Object r11 = r3.next()
            rb0 r11 = (defpackage.rb0) r11
            ua0 r11 = r11.c
            java.lang.String r11 = r11.a
            boolean r12 = r0.containsKey(r11)
            if (r12 != 0) goto L_0x065a
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r0.put(r11, r13)
            goto L_0x063b
        L_0x065a:
            r12 = 1
            java.lang.Object r13 = r0.get(r11)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r13 = r13 + r12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.put(r11, r13)
            goto L_0x063b
        L_0x066e:
            r12 = 1
            pbb r3 = new pbb
            r11 = 28
            r3.<init>(r11, r6, r0)
            r7.e0(r3)
        L_0x0679:
            r3 = r5
            r4 = r30
            r2 = 0
            r43 = r8
            r8 = r6
            r44 = r9
            r9 = r43
            r10 = r12
            r11 = r44
            goto L_0x0011
        L_0x0689:
            r6 = r8
            r8 = r9
            r9 = r11
            r7 = r13
            u52 r0 = new u52
            r11 = 15
            r1 = r0
            r2 = r46
            r3 = r47
            r4 = r9
            r6 = r11
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (long) r4, (int) r6)
            r7.e0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyf.a(tc0, int):void");
    }
}
