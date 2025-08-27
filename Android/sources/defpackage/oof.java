package defpackage;

import android.content.Context;

/* renamed from: oof  reason: default package */
public final /* synthetic */ class oof implements Runnable {
    public final /* synthetic */ d24 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kxd c;
    public final /* synthetic */ c9f o;
    public final /* synthetic */ b88 v;
    public final /* synthetic */ f24 w;
    public final /* synthetic */ kl x;
    public final /* synthetic */ lxd y;
    public final /* synthetic */ ejd z;

    public /* synthetic */ oof(d24 d24, Context context, kxd kxd, c9f c9f, b88 b88, f24 f24, kl klVar, lxd lxd, ejd ejd) {
        this.a = d24;
        this.b = context;
        this.c = kxd;
        this.o = c9f;
        this.v = b88;
        this.w = f24;
        this.x = klVar;
        this.y = lxd;
        this.z = ejd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: b24} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: b24} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: b24} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x021f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r0 = r31
            d24 r3 = r0.a
            android.content.Context r4 = r0.b
            kxd r5 = r0.c
            c9f r6 = r0.o
            b88 r7 = r0.v
            f24 r14 = r0.w
            kl r15 = r0.x
            lxd r13 = r0.y
            ejd r12 = r0.z
            boolean r0 = r3.b
            java.lang.String r16 = "Cannot get prev tags after clear"
            java.lang.String r17 = "Cannot get prev logs after clear"
            r10 = 0
            if (r0 == 0) goto L_0x022d
            int r0 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r0 >= r8) goto L_0x0025
            goto L_0x022d
        L_0x0025:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)     // Catch:{ Exception -> 0x022d }
            java.lang.String r8 = defpackage.o54.r()
            java.util.Iterator r19 = r0.iterator()
        L_0x0039:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r0 = r19.next()
            android.app.ApplicationExitInfo r20 = defpackage.x3.e(r0)
            int r0 = r20.getReason()
            r11 = 6
            if (r0 == r11) goto L_0x004f
            goto L_0x0039
        L_0x004f:
            java.lang.String r0 = r20.getProcessName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r8)
            if (r0 != 0) goto L_0x005d
            r20.getProcessName()
            goto L_0x0039
        L_0x005d:
            r5.b()
            r22 = r12
            long r11 = r5.g
            long r23 = r20.getTimestamp()
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            r20.getTimestamp()
        L_0x006f:
            r12 = r22
            goto L_0x0039
        L_0x0072:
            java.io.InputStream r0 = r20.getTraceInputStream()     // Catch:{ Exception -> 0x0098 }
            if (r0 == 0) goto L_0x0098
            java.nio.charset.Charset r11 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x0098 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0098 }
            r12.<init>(r0, r11)     // Catch:{ Exception -> 0x0098 }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0098 }
            r0 = 8192(0x2000, float:1.14794E-41)
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r0 = kotlin.io.TextStreamsKt.readText(r11)     // Catch:{ all -> 0x008e }
            kotlin.io.CloseableKt.closeFinally(r11, r10)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0099
        L_0x008e:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r23 = r0
            kotlin.io.CloseableKt.closeFinally(r11, r12)     // Catch:{ Exception -> 0x0098 }
            throw r23     // Catch:{ Exception -> 0x0098 }
        L_0x0098:
            r0 = r10
        L_0x0099:
            if (r0 == 0) goto L_0x00a1
            int r11 = r0.length()
            if (r11 != 0) goto L_0x00ab
        L_0x00a1:
            r21 = r8
            r18 = r10
            r30 = r13
            r1 = 2
            r2 = 3
            goto L_0x0229
        L_0x00ab:
            r20.getTimestamp()
            r5.b()
            g8f r11 = r5.h
            if (r11 != 0) goto L_0x00b6
            goto L_0x006f
        L_0x00b6:
            long r23 = r20.getTimestamp()
            java.io.File r12 = r15.a()
            boolean r20 = r12.exists()
            if (r20 == 0) goto L_0x00ca
            boolean r20 = r12.isDirectory()
            if (r20 != 0) goto L_0x00d0
        L_0x00ca:
            r26 = r8
            r29 = r13
            goto L_0x0157
        L_0x00d0:
            java.io.File[] r10 = r12.listFiles()     // Catch:{ all -> 0x0133 }
            if (r10 == 0) goto L_0x013f
            r20 = r10
            java.lang.Comparable[] r20 = (java.lang.Comparable[]) r20     // Catch:{ all -> 0x0133 }
            kotlin.collections.ArraysKt.sort((T[]) r20)     // Catch:{ all -> 0x0133 }
            kotlin.collections.ArraysKt.reverse((T[]) r10)     // Catch:{ all -> 0x0133 }
            java.util.List r20 = kotlin.collections.CollectionsKt.createListBuilder()     // Catch:{ all -> 0x0133 }
            int r9 = r10.length     // Catch:{ all -> 0x0133 }
            r1 = 0
        L_0x00e6:
            if (r1 >= r9) goto L_0x0136
            r25 = r10[r1]     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = r25.getName()     // Catch:{ all -> 0x0133 }
            r26 = r8
            kotlin.text.Regex r8 = defpackage.kl.b     // Catch:{ all -> 0x0130 }
            kotlin.text.MatchResult r2 = r8.matchEntire(r2)     // Catch:{ all -> 0x0130 }
            if (r2 != 0) goto L_0x0100
            r27 = r9
            r28 = r10
            r29 = r13
        L_0x00fe:
            r2 = 1
            goto L_0x0126
        L_0x0100:
            java.util.List r2 = r2.getGroupValues()     // Catch:{ all -> 0x0130 }
            r8 = 1
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x0130 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0130 }
            r27 = r9
            long r8 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0130 }
            r2 = r20
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0130 }
            r28 = r10
            jl r10 = new jl     // Catch:{ all -> 0x0130 }
            r29 = r13
            java.lang.String r13 = kotlin.io.FilesKt__FileReadWriteKt.readText$default(r25, (java.nio.charset.Charset) null, 1, (java.lang.Object) null)     // Catch:{ all -> 0x014f }
            r10.<init>(r8, r13)     // Catch:{ all -> 0x014f }
            r2.add(r10)     // Catch:{ all -> 0x014f }
            goto L_0x00fe
        L_0x0126:
            int r1 = r1 + r2
            r8 = r26
            r9 = r27
            r10 = r28
            r13 = r29
            goto L_0x00e6
        L_0x0130:
            r29 = r13
            goto L_0x014f
        L_0x0133:
            r26 = r8
            goto L_0x0130
        L_0x0136:
            r26 = r8
            r29 = r13
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r20)     // Catch:{ all -> 0x014f }
            goto L_0x015b
        L_0x013f:
            r26 = r8
            r29 = r13
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x014f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x014f }
            r2.<init>(r1)     // Catch:{ all -> 0x014f }
            throw r2     // Catch:{ all -> 0x014f }
        L_0x014f:
            kotlin.io.FilesKt.deleteRecursively(r12)
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x015b
        L_0x0157:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x015b:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0166
            r9 = 10
            r10 = 4
            goto L_0x01df
        L_0x0166:
            java.lang.String r2 = "\nDALVIK THREADS"
            r8 = 6
            r9 = 0
            int r2 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (java.lang.String) r2, (int) r9, false, (int) r8, (java.lang.Object) null)
            r8 = -1
            if (r2 >= 0) goto L_0x0173
            r10 = 4
            goto L_0x0195
        L_0x0173:
            java.lang.String r9 = "\n\"main\""
            r10 = 4
            int r9 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (java.lang.String) r9, (int) r2, false, (int) r10, (java.lang.Object) null)
            if (r9 >= 0) goto L_0x018a
            r12 = 1
            int r2 = r2 + r12
            java.lang.String r9 = "\n"
            int r2 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (java.lang.String) r9, (int) r2, false, (int) r10, (java.lang.Object) null)
            if (r2 >= 0) goto L_0x0187
            goto L_0x0195
        L_0x0187:
            int r8 = r2 + 1
            goto L_0x0195
        L_0x018a:
            r12 = 1
            int r9 = r9 + r12
            java.lang.String r2 = "\n\n\""
            int r2 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0, (java.lang.String) r2, (int) r9, false, (int) r10, (java.lang.Object) null)
            r8 = 2
            int r2 = r2 + r8
            r8 = r2
        L_0x0195:
            if (r8 >= 0) goto L_0x019a
            r9 = 10
            goto L_0x01df
        L_0x019a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r9 = 0
            r2.append(r0, r9, r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x01a7:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x01cf
            java.lang.Object r9 = r1.next()
            jl r9 = (defpackage.jl) r9
            java.lang.String r12 = "\"SNAPSHOT main\" tid=1 ("
            r2.append(r12)
            long r12 = r9.a
            long r12 = r23 - r12
            r2.append(r12)
            java.lang.String r12 = "ms before)\n"
            r2.append(r12)
            java.lang.String r9 = r9.b
            r2.append(r9)
            r9 = 10
            r2.append(r9)
            goto L_0x01a7
        L_0x01cf:
            r9 = 10
            r2.append(r9)
            int r1 = r0.length()
            r2.append(r0, r8, r1)
            java.lang.String r0 = r2.toString()
        L_0x01df:
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r0 = r0.getBytes(r1)
            r1 = 3
            r7.a(r1)
            kotlin.collections.ArrayDeque r13 = r7.d
            if (r13 == 0) goto L_0x021f
            r2 = 2
            r6.a(r2)
            java.util.List r12 = r6.d
            if (r12 == 0) goto L_0x0215
            r18 = 10
            r21 = r26
            r8 = r14
            r1 = r9
            r9 = r18
            r1 = r10
            r2 = 3
            r18 = 0
            r10 = r0
            r1 = 2
            r30 = r29
            r8.c(r9, r10, r11, r12, kotlin.collections.MapsKt.emptyMap(), r13)
            r5.g(r2)
        L_0x020b:
            r10 = r18
            r8 = r21
            r12 = r22
            r13 = r30
            goto L_0x0039
        L_0x0215:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        L_0x021f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x0229:
            r20.getDescription()
            goto L_0x020b
        L_0x022d:
            r18 = r10
            r22 = r12
            r30 = r13
            r1 = 2
            r2 = 3
            boolean r0 = r3.a
            r3 = 45
            r15 = 58
            java.lang.String r13 = "tracer-"
            java.lang.String r19 = "tracer"
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = defpackage.o54.r()
            java.lang.String r8 = r4.getPackageName()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r8)
            if (r8 == 0) goto L_0x0252
            r0 = r19
            goto L_0x0266
        L_0x0252:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r13)
            java.lang.String r0 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r0, (char) r15, (char) r3, false, 4, (java.lang.Object) null)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
        L_0x0266:
            java.io.File r8 = new java.io.File
            java.io.File r4 = r4.getCacheDir()
            r8.<init>(r4, r0)
            java.lang.String r0 = "minidump"
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r8, (java.lang.String) r0)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x027d
            goto L_0x02ee
        L_0x027d:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x02ee
            int r4 = r0.length
            if (r4 != 0) goto L_0x0288
            goto L_0x02ee
        L_0x0288:
            r5.b()
            g8f r4 = r5.h
            if (r4 != 0) goto L_0x0290
            goto L_0x02ee
        L_0x0290:
            int r12 = r0.length
            r11 = 0
        L_0x0292:
            if (r11 >= r12) goto L_0x02ee
            r8 = r0[r11]
            byte[] r10 = kotlin.io.FilesKt.readBytes(r8)     // Catch:{ Exception -> 0x02a3 }
            defpackage.f6e.m(r8)     // Catch:{ Exception -> 0x02a3 }
            int r9 = r10.length
            if (r9 != 0) goto L_0x02aa
            r8.toString()
        L_0x02a3:
            r20 = r11
            r24 = r12
            r1 = r13
        L_0x02a8:
            r8 = 1
            goto L_0x02e7
        L_0x02aa:
            r6.a(r1)
            java.util.List r9 = r6.d
            if (r9 == 0) goto L_0x02dd
            r7.a(r2)
            kotlin.collections.ArrayDeque r8 = r7.d
            if (r8 == 0) goto L_0x02d3
            r20 = 9
            r21 = r8
            r8 = r14
            r23 = r9
            r9 = r20
            r20 = r11
            r11 = r4
            r24 = r12
            r12 = r23
            r1 = r13
            r13 = r21
            r8.c(r9, r10, r11, r12, kotlin.collections.MapsKt.emptyMap(), r13)
            r8 = 4
            r5.g(r8)
            goto L_0x02a8
        L_0x02d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r17.toString()
            r0.<init>(r1)
            throw r0
        L_0x02dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r16.toString()
            r0.<init>(r1)
            throw r0
        L_0x02e7:
            int r11 = r20 + 1
            r13 = r1
            r12 = r24
            r1 = 2
            goto L_0x0292
        L_0x02ee:
            r1 = r13
            kof r0 = defpackage.kof.a
            java.util.Map r0 = defpackage.kof.c()
            frg r4 = defpackage.ct.b
            java.lang.Object r0 = r0.get(r4)
            boolean r8 = r0 instanceof defpackage.b24
            if (r8 == 0) goto L_0x0303
            r10 = r0
            b24 r10 = (defpackage.b24) r10
            goto L_0x0305
        L_0x0303:
            r10 = r18
        L_0x0305:
            if (r10 != 0) goto L_0x0315
            e4 r0 = new e4
            r8 = 11
            r9 = 0
            r0.<init>((int) r8, (boolean) r9)
            b24 r10 = new b24
            r10.<init>(r0)
            goto L_0x0316
        L_0x0315:
            r9 = 0
        L_0x0316:
            boolean r0 = r10.a
            if (r0 == 0) goto L_0x036d
            r5.b()
            g8f r0 = r5.h
            if (r0 == 0) goto L_0x036d
            boolean r4 = defpackage.pf6.l(r4)
            if (r4 == 0) goto L_0x032c
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x035d
        L_0x032c:
            r5.b()
            java.util.List r4 = r5.j
            r8 = 1
            java.util.List r4 = kotlin.collections.CollectionsKt.dropLast(r4, r8)
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x033d
            goto L_0x035d
        L_0x033d:
            int r8 = r4.size()
            r10 = 10
            if (r8 < r10) goto L_0x0346
            goto L_0x035d
        L_0x0346:
            r5.b()
            long r10 = r5.i
            long r12 = java.lang.System.currentTimeMillis()
            r8 = 14400000(0xdbba00, float:2.0178698E-38)
            long r2 = (long) r8
            long r10 = r10 + r2
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0359
            goto L_0x035d
        L_0x0359:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x035d:
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x036d
            r2 = r30
            r2.a(r0, r4, r5)     // Catch:{ Exception -> 0x036d }
        L_0x036d:
            boolean r0 = defpackage.kof.b
            java.lang.String r2 = "crashes"
            if (r0 == 0) goto L_0x03b7
            android.content.Context r0 = r14.a
            java.lang.String r3 = defpackage.o54.r()
            java.lang.String r4 = r0.getPackageName()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0386
        L_0x0383:
            r1 = r19
            goto L_0x039d
        L_0x0386:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r1 = 45
            java.lang.String r1 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r3, (char) r15, (char) r1, false, 4, (java.lang.Object) null)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r4.append(r1)
            java.lang.String r19 = r4.toString()
            goto L_0x0383
        L_0x039d:
            java.io.File r3 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            r3.<init>(r0, r1)
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x03b2
            goto L_0x049d
        L_0x03b2:
            kotlin.io.FilesKt.deleteRecursively(r0)
            goto L_0x049d
        L_0x03b7:
            android.content.Context r0 = r14.a
            java.lang.String r3 = defpackage.o54.r()
            java.lang.String r4 = r0.getPackageName()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x03ca
        L_0x03c7:
            r1 = r19
            goto L_0x03e1
        L_0x03ca:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r1 = 45
            java.lang.String r1 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r3, (char) r15, (char) r1, false, 4, (java.lang.Object) null)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r4.append(r1)
            java.lang.String r19 = r4.toString()
            goto L_0x03c7
        L_0x03e1:
            java.io.File r3 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            r3.<init>(r0, r1)
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r3, (java.lang.String) r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x03fa
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0484
        L_0x03fa:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0480
            int r1 = r0.length
            if (r1 != 0) goto L_0x0405
            goto L_0x0480
        L_0x0405:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
        L_0x040b:
            if (r9 >= r2) goto L_0x0419
            r3 = r0[r9]
            a24 r3 = defpackage.f24.a(r3)     // Catch:{ Exception -> 0x0416 }
            r1.add(r3)     // Catch:{ Exception -> 0x0416 }
        L_0x0416:
            r3 = 1
            int r9 = r9 + r3
            goto L_0x040b
        L_0x0419:
            r3 = 1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0425
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0484
        L_0x0425:
            long r4 = java.lang.System.currentTimeMillis()
            r8 = 14400000(0xdbba00, double:7.1145453E-317)
            long r4 = r4 - r8
            int r0 = r1.size()
            if (r0 <= r3) goto L_0x043d
            cx4 r0 = new cx4
            r2 = 20
            r0.<init>(r2)
            kotlin.collections.CollectionsKt.sortWith(r1, r0)
        L_0x043d:
            int r0 = r1.size()
            r2 = 10
            if (r0 <= r2) goto L_0x0459
            java.lang.Object r0 = kotlin.collections.CollectionsKt__MutableCollectionsKt.removeFirst(r1)
            a24 r0 = (defpackage.a24) r0
            r0.getClass()
            java.io.File r3 = new java.io.File
            java.lang.String r0 = r0.c
            r3.<init>(r0)
            kotlin.io.FilesKt.deleteRecursively(r3)
            goto L_0x043d
        L_0x0459:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r1)
            a24 r0 = (defpackage.a24) r0
            long r2 = r0.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x047e
            java.lang.Object r0 = kotlin.collections.CollectionsKt__MutableCollectionsKt.removeFirst(r1)
            a24 r0 = (defpackage.a24) r0
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.lang.String r0 = r0.c
            r2.<init>(r0)
            kotlin.io.FilesKt.deleteRecursively(r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0459
        L_0x047e:
            r0 = r1
            goto L_0x0484
        L_0x0480:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0484:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0495
            r22.getClass()
            defpackage.ejd.e(r0)
        L_0x0495:
            r1 = 4
            r7.a(r1)
            r1 = 3
            r6.a(r1)
        L_0x049d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oof.run():void");
    }
}
