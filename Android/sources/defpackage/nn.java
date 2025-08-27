package defpackage;

import android.content.Context;

/* renamed from: nn  reason: default package */
public final /* synthetic */ class nn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nn(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: gy8} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x036a, code lost:
        if (r2 != null) goto L_0x036f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0379  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            r1 = 9
            r2 = 6
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x0312;
                case 1: goto L_0x02e8;
                case 2: goto L_0x022f;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00ae;
                case 6: goto L_0x0014;
                default: goto L_0x000e;
            }
        L_0x000e:
            android.content.Context r0 = r0.b
            com.my.tracker.obfuscated.b1.d(r0)
            return
        L_0x0014:
            android.content.Context r0 = r0.b
            java.lang.String r1 = defpackage.o54.r()     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r2 = r0.getPackageName()     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x0027
            java.lang.String r1 = "tracer"
            goto L_0x0041
        L_0x0027:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00a9 }
            r3 = 58
            r4 = 45
            java.lang.String r1 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r1, (char) r3, (char) r4, false, 4, (java.lang.Object) null)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = android.net.Uri.encode(r1)     // Catch:{ Exception -> 0x00a9 }
            r2.append(r1)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00a9 }
        L_0x0041:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00a9 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r0 = "perf-old.bin"
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r1 = "perf-current.bin"
            java.io.File r1 = kotlin.io.FilesKt.resolve((java.io.File) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x005f
            defpackage.f6e.m(r0)     // Catch:{ Exception -> 0x00a9 }
        L_0x005f:
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x0079
            java.io.File r2 = r0.getParentFile()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x006e
            defpackage.f6e.y(r2)     // Catch:{ Exception -> 0x00a9 }
        L_0x006e:
            defpackage.f6e.B(r1, r0)     // Catch:{ Exception -> 0x00a9 }
            qof r2 = new qof     // Catch:{ Exception -> 0x00a9 }
            r2.<init>(r6, r0)     // Catch:{ Exception -> 0x00a9 }
            defpackage.ipf.b(r2)     // Catch:{ Exception -> 0x00a9 }
        L_0x0079:
            ila r0 = new ila     // Catch:{ Exception -> 0x00a9 }
            r0.<init>((java.io.File) r1)     // Catch:{ Exception -> 0x00a9 }
            epf r1 = defpackage.fpf.b     // Catch:{ Exception -> 0x00a9 }
            boolean r2 = r1 instanceof defpackage.cpf     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x009c
            cpf r1 = (defpackage.cpf) r1     // Catch:{ Exception -> 0x00a9 }
            java.util.LinkedList r1 = r1.a     // Catch:{ Exception -> 0x00a9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00a9 }
        L_0x008c:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00a9 }
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00a9 }
            wbb r2 = (defpackage.wbb) r2     // Catch:{ Exception -> 0x00a9 }
            r0.d(r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x008c
        L_0x009c:
            epf r1 = defpackage.fpf.b     // Catch:{ Exception -> 0x00a9 }
            java.util.Objects.toString(r1)     // Catch:{ Exception -> 0x00a9 }
        L_0x00a1:
            dpf r1 = new dpf     // Catch:{ Exception -> 0x00a9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a9 }
            defpackage.fpf.b = r1     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            sx6 r0 = defpackage.sx6.y
            defpackage.fpf.b = r0
        L_0x00ad:
            return
        L_0x00ae:
            fs r1 = new fs
            r1.<init>(r3)
            s9a r2 = defpackage.tf6.d
            android.content.Context r0 = r0.b
            defpackage.tf6.v0(r0, r1, r2, r5)
            return
        L_0x00bb:
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r12 = new java.util.concurrent.LinkedBlockingQueue
            r12.<init>()
            r7 = 0
            r8 = 1
            r9 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r11, r12)
            nn r2 = new nn
            android.content.Context r0 = r0.b
            r3 = 5
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        L_0x00d8:
            rx6 r1 = defpackage.rx6.a
            java.lang.String r1 = "HEAP_DUMP_"
            android.content.Context r0 = r0.b
            defpackage.rx6.c = r0
            java.io.File r0 = defpackage.sq6.y(r0)
            kof r3 = defpackage.kof.a
            java.util.Map r3 = defpackage.kof.c()
            frg r7 = defpackage.kv0.b
            java.lang.Object r3 = r3.get(r7)
            boolean r7 = r3 instanceof defpackage.nx6
            if (r7 == 0) goto L_0x00f7
            nx6 r3 = (defpackage.nx6) r3
            goto L_0x00f8
        L_0x00f7:
            r3 = r4
        L_0x00f8:
            if (r3 != 0) goto L_0x0107
            grg r3 = new grg
            r7 = 22
            r3.<init>((int) r7)
            nx6 r7 = new nx6
            r7.<init>(r3)
            r3 = r7
        L_0x0107:
            java.lang.String r7 = "dump-tmp.hprof"
            java.io.File r7 = kotlin.io.FilesKt.resolve((java.io.File) r0, (java.lang.String) r7)
            defpackage.rx6.a(r7)
            java.lang.String r7 = "dump-tmp-meta.json"
            java.io.File r7 = kotlin.io.FilesKt.resolve((java.io.File) r0, (java.lang.String) r7)
            defpackage.rx6.a(r7)
            boolean r3 = r3.a
            java.lang.String r7 = "dump-meta.json"
            java.lang.String r8 = "dump.hprof"
            if (r3 != 0) goto L_0x0136
            java.io.File r1 = kotlin.io.FilesKt.resolve((java.io.File) r0, (java.lang.String) r8)
            defpackage.rx6.a(r1)
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r0, (java.lang.String) r7)
            defpackage.rx6.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.rx6.b
            r0.set(r5)
            goto L_0x022e
        L_0x0136:
            vd3 r0 = new vd3
            r0.<init>(r6)
            defpackage.vzg.D(r0)
            java.lang.String r0 = "Dump from different buildUuid. Current "
            android.content.Context r3 = defpackage.rx6.c
            if (r3 != 0) goto L_0x0146
            goto L_0x022e
        L_0x0146:
            java.io.File r5 = defpackage.sq6.y(r3)
            java.io.File r8 = kotlin.io.FilesKt.resolve((java.io.File) r5, (java.lang.String) r8)
            java.io.File r5 = kotlin.io.FilesKt.resolve((java.io.File) r5, (java.lang.String) r7)
            boolean r7 = r8.exists()
            if (r7 != 0) goto L_0x0160
            boolean r7 = r5.exists()
            if (r7 != 0) goto L_0x0160
            goto L_0x022e
        L_0x0160:
            java.lang.String r7 = kotlin.io.FilesKt__FileReadWriteKt.readText$default(r5, (java.nio.charset.Charset) null, 1, (java.lang.Object) null)     // Catch:{ Exception -> 0x0228 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0221 }
            r9.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = "buildUuid"
            java.lang.String r7 = r9.optString(r7)     // Catch:{ Exception -> 0x0221 }
            boolean r10 = kotlin.text.StringsKt.isBlank(r7)     // Catch:{ Exception -> 0x0221 }
            r10 = r10 ^ r6
            if (r10 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r7 = r4
        L_0x0178:
            java.lang.String r10 = "tag"
            java.lang.String r9 = r9.optString(r10)     // Catch:{ Exception -> 0x0221 }
            boolean r10 = kotlin.text.StringsKt.isBlank(r9)     // Catch:{ Exception -> 0x0221 }
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r9 = r4
        L_0x0187:
            defpackage.f6e.m(r5)     // Catch:{ Exception -> 0x0228 }
            gy8 r6 = defpackage.kof.c     // Catch:{ Exception -> 0x0228 }
            if (r6 == 0) goto L_0x018f
            r4 = r6
        L_0x018f:
            java.lang.Object r4 = r4.c     // Catch:{ Exception -> 0x0228 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0228 }
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)     // Catch:{ Exception -> 0x0228 }
            if (r6 == 0) goto L_0x0203
            java.lang.String r0 = ".bin"
            java.io.File r4 = defpackage.sq6.y(r3)     // Catch:{ Exception -> 0x0228 }
            defpackage.f6e.y(r4)     // Catch:{ Exception -> 0x0228 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0228 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0228 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0228 }
            r6.append(r10)     // Catch:{ Exception -> 0x0228 }
            r6.append(r0)     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0228 }
            java.io.File r0 = kotlin.io.FilesKt.resolve((java.io.File) r4, (java.lang.String) r0)     // Catch:{ Exception -> 0x0228 }
            defpackage.f6e.B(r8, r0)     // Catch:{ Exception -> 0x0228 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0228 }
            r1.<init>()     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0228 }
            java.lang.String r4 = "param_dump_path"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = "param_tag"
            r1.put(r0, r9)     // Catch:{ Exception -> 0x0228 }
            t64 r0 = new t64     // Catch:{ Exception -> 0x0228 }
            r0.<init>((java.util.Map) r1)     // Catch:{ Exception -> 0x0228 }
            defpackage.t64.f(r0)     // Catch:{ Exception -> 0x0228 }
            v3b r1 = new v3b     // Catch:{ Exception -> 0x0228 }
            java.lang.Class<ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker> r4 = ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker.class
            r1.<init>(r4)     // Catch:{ Exception -> 0x0228 }
            androidx.work.WorkRequest$Builder r0 = r1.setInputData(r0)     // Catch:{ Exception -> 0x0228 }
            v3b r0 = (defpackage.v3b) r0     // Catch:{ Exception -> 0x0228 }
            androidx.work.WorkRequest r0 = r0.build()     // Catch:{ Exception -> 0x0228 }
            w3b r0 = (defpackage.w3b) r0     // Catch:{ Exception -> 0x0228 }
            kotlin.Lazy r1 = defpackage.ipf.a     // Catch:{ Exception -> 0x0228 }
            uo5 r1 = new uo5     // Catch:{ Exception -> 0x0228 }
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0228 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0228 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0228 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0228 }
            i40 r3 = new i40     // Catch:{ Exception -> 0x0228 }
            r3.<init>(r1, r2)     // Catch:{ Exception -> 0x0228 }
            r0.post(r3)     // Catch:{ Exception -> 0x0228 }
            goto L_0x022e
        L_0x0203:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0228 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0228 }
            r1.append(r4)     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = " != "
            r1.append(r0)     // Catch:{ Exception -> 0x0228 }
            r1.append(r7)     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0228 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0228 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0228 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0228 }
            throw r1     // Catch:{ Exception -> 0x0228 }
        L_0x0221:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0228 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0228 }
            throw r1     // Catch:{ Exception -> 0x0228 }
        L_0x0228:
            defpackage.rx6.a(r8)
            defpackage.rx6.a(r5)
        L_0x022e:
            return
        L_0x022f:
            android.content.Context r0 = r0.b
            defpackage.js9.c = r0
            kof r0 = defpackage.kof.a
            java.util.Map r0 = defpackage.kof.c()
            frg r2 = defpackage.ev0.g
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof defpackage.vp4
            if (r2 == 0) goto L_0x0246
            vp4 r0 = (defpackage.vp4) r0
            goto L_0x0247
        L_0x0246:
            r0 = r4
        L_0x0247:
            if (r0 != 0) goto L_0x0256
            y35 r0 = new y35
            r2 = 18
            r0.<init>((int) r2, (boolean) r5)
            vp4 r2 = new vp4
            r2.<init>(r0)
            r0 = r2
        L_0x0256:
            boolean r0 = r0.a
            java.lang.String r2 = "tracer.disk.usage.worker"
            if (r0 != 0) goto L_0x0275
            android.content.Context r0 = defpackage.js9.c
            if (r0 != 0) goto L_0x0261
            goto L_0x0262
        L_0x0261:
            r4 = r0
        L_0x0262:
            dpg r0 = defpackage.dpg.d(r4)
            r0.getClass()
            fw1 r1 = new fw1
            r1.<init>(r0, r2, r6)
            wdf r0 = r0.d
            r0.h(r1)
            goto L_0x02e7
        L_0x0275:
            java.util.Map r0 = defpackage.kof.c()
            frg r5 = defpackage.iq.c
            java.lang.Object r0 = r0.get(r5)
            boolean r6 = r0 instanceof defpackage.l04
            if (r6 == 0) goto L_0x0286
            l04 r0 = (defpackage.l04) r0
            goto L_0x0287
        L_0x0286:
            r0 = r4
        L_0x0287:
            if (r0 != 0) goto L_0x0291
            xe8 r0 = new xe8
            r0.<init>((int) r1)
            r0.f()
        L_0x0291:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map r6 = defpackage.kof.c()
            java.lang.Object r5 = r6.get(r5)
            boolean r6 = r5 instanceof defpackage.l04
            if (r6 == 0) goto L_0x02a5
            l04 r5 = (defpackage.l04) r5
            goto L_0x02a6
        L_0x02a5:
            r5 = r4
        L_0x02a6:
            if (r5 != 0) goto L_0x02b0
            xe8 r5 = new xe8
            r5.<init>((int) r1)
            r5.f()
        L_0x02b0:
            java.util.Set r16 = kotlin.collections.CollectionsKt.toSet(r0)
            wj3 r0 = new wj3
            r12 = -1
            r14 = -1
            r7 = 3
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16)
            hcb r1 = new hcb
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.DAYS
            java.lang.Class<ru.ok.tracer.disk.usage.DiskUsageWorker> r6 = ru.ok.tracer.disk.usage.DiskUsageWorker.class
            r7 = 1
            r1.<init>(r6, r7, r5)
            androidx.work.WorkRequest$Builder r0 = r1.setConstraints(r0)
            hcb r0 = (defpackage.hcb) r0
            androidx.work.WorkRequest r0 = r0.build()
            icb r0 = (defpackage.icb) r0
            android.content.Context r1 = defpackage.js9.c
            if (r1 != 0) goto L_0x02df
            goto L_0x02e0
        L_0x02df:
            r4 = r1
        L_0x02e0:
            dpg r1 = defpackage.dpg.d(r4)
            r1.b(r2, r3, r0)
        L_0x02e7:
            return
        L_0x02e8:
            cg8 r1 = new cg8
            android.content.Context r0 = r0.b
            r1.<init>(r0)
            int r2 = defpackage.qad.aa
            r1.r(r2)
            int r2 = defpackage.qad.o
            r1.i(r2)
            int r2 = defpackage.qad.W6
            d10 r3 = new d10
            r3.<init>((int) r5, (java.lang.Object) r0)
            cg8 r0 = r1.n(r2, r3)
            int r1 = defpackage.qad.m0
            e10 r2 = new e10
            r2.<init>(r5)
            r0.l(r1, r2)
            r0.g()
            return
        L_0x0312:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x0391
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r0 = r0.b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r0, r5)
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r6) goto L_0x0391
            java.lang.String r5 = "locale"
            if (r1 < r2) goto L_0x0368
            ws r1 = defpackage.rn.x
            r1.getClass()
            ps r2 = new ps
            r2.<init>((defpackage.ws) r1)
        L_0x0339:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0357
            java.lang.Object r1 = r2.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            rn r1 = (defpackage.rn) r1
            if (r1 == 0) goto L_0x0339
            eo r1 = (defpackage.eo) r1
            android.content.Context r1 = r1.Y
            if (r1 == 0) goto L_0x0339
            java.lang.Object r4 = r1.getSystemService(r5)
        L_0x0357:
            if (r4 == 0) goto L_0x036d
            android.os.LocaleList r1 = defpackage.pn.a(r4)
            j58 r2 = new j58
            k58 r4 = new k58
            r4.<init>(r1)
            r2.<init>(r4)
            goto L_0x036f
        L_0x0368:
            j58 r2 = defpackage.rn.c
            if (r2 == 0) goto L_0x036d
            goto L_0x036f
        L_0x036d:
            j58 r2 = defpackage.j58.b
        L_0x036f:
            k58 r1 = r2.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x038a
            java.lang.String r1 = defpackage.y64.A(r0)
            java.lang.Object r2 = r0.getSystemService(r5)
            if (r2 == 0) goto L_0x038a
            android.os.LocaleList r1 = defpackage.on.a(r1)
            defpackage.pn.b(r2, r1)
        L_0x038a:
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r0.setComponentEnabledSetting(r3, r6, r6)
        L_0x0391:
            defpackage.rn.w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.run():void");
    }
}
