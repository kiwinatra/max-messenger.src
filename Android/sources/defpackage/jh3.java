package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jh3  reason: default package */
public final /* synthetic */ class jh3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ jh3(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.v = obj4;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x045d A[Catch:{ all -> 0x0462, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0465 A[Catch:{ all -> 0x0462, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0471 A[Catch:{ all -> 0x0462, all -> 0x0498 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0478 A[SYNTHETIC, Splitter:B:157:0x0478] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x029a  */
    private final void a() {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            java.lang.Object r2 = r0.b
            rof r2 = (defpackage.rof) r2
            java.lang.Object r3 = r0.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.o
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r0 = r0.v
            java.lang.String r0 = (java.lang.String) r0
            xof r5 = r2.a
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x001c
            r0 = r1
            goto L_0x04cd
        L_0x001c:
            zof r6 = r5.a()
            if (r6 == 0) goto L_0x04ca
            boolean r6 = r6.isDisabled()
            if (r6 != 0) goto L_0x04ca
            l15 r5 = r2.e
            r6 = 32
            r7 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0048
            int r8 = r0.length()
            if (r8 <= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r7
        L_0x0041:
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = kotlin.text.StringsKt.take((java.lang.String) r0, (int) r6)
            goto L_0x0049
        L_0x0048:
            r0 = r7
        L_0x0049:
            y35 r8 = r2.c
            java.lang.Object r9 = r8.b
            kotlin.collections.ArrayDeque r9 = (kotlin.collections.ArrayDeque) r9
            monitor-enter(r9)
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x04c7 }
            kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8     // Catch:{ all -> 0x04c7 }
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r8)     // Catch:{ all -> 0x04c7 }
            monitor-exit(r9)
            xof r2 = r2.a
            ni0 r2 = r2.g
            r2.getClass()
            java.util.List r9 = kotlin.collections.CollectionsKt.createListBuilder()
            java.lang.Object r10 = r2.c
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            monitor-enter(r10)
            java.lang.Object r2 = r2.c     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x00a8 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x0075:
            boolean r11 = r2.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r11 == 0) goto L_0x00ab
            java.lang.Object r11 = r2.next()     // Catch:{ all -> 0x00a8 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x00a8 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x00a8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00a8 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00a8 }
            r13 = r9
            java.util.Collection r13 = (java.util.Collection) r13     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r14.<init>()     // Catch:{ all -> 0x00a8 }
            r14.append(r12)     // Catch:{ all -> 0x00a8 }
            r12 = 61
            r14.append(r12)     // Catch:{ all -> 0x00a8 }
            r14.append(r11)     // Catch:{ all -> 0x00a8 }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x00a8 }
            r13.add(r11)     // Catch:{ all -> 0x00a8 }
            goto L_0x0075
        L_0x00a8:
            r0 = move-exception
            goto L_0x04c5
        L_0x00ab:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a8 }
            monitor-exit(r10)
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r9)
            java.lang.Object r9 = r5.a
            xof r9 = (defpackage.xof) r9
            xe8 r10 = r9.b     // Catch:{ Exception -> 0x04cf }
            java.lang.Object r10 = r10.c     // Catch:{ Exception -> 0x04cf }
            fbe r10 = (defpackage.fbe) r10     // Catch:{ Exception -> 0x04cf }
            java.lang.Object r10 = r10.a     // Catch:{ Exception -> 0x04cf }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x04cf }
            if (r10 != 0) goto L_0x00d9
            zof r10 = r9.a()     // Catch:{ Exception -> 0x04cf }
            if (r10 == 0) goto L_0x00d8
            boolean r11 = r10.isDisabled()     // Catch:{ Exception -> 0x04cf }
            r11 = r11 ^ r1
            if (r11 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00d0:
            r10 = r7
        L_0x00d1:
            if (r10 == 0) goto L_0x00d8
            java.lang.String r10 = r10.appToken()     // Catch:{ Exception -> 0x04cf }
            goto L_0x00d9
        L_0x00d8:
            r10 = r7
        L_0x00d9:
            if (r10 == 0) goto L_0x04b9
            android.content.Context r11 = r9.d
            java.lang.Class<kof> r12 = defpackage.kof.class
            kof r13 = defpackage.kof.a     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r13 = "INSTANCE"
            java.lang.reflect.Field r13 = r12.getField(r13)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r14 = "getAppToken"
            java.lang.reflect.Method r12 = r12.getMethod(r14, r7)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r13 = r13.get(r7)     // Catch:{ Exception -> 0x00f8 }
            java.lang.Object r12 = r12.invoke(r13, r7)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00f8 }
            goto L_0x011b
        L_0x00f8:
            java.lang.String r12 = r11.getPackageName()
            apf r12 = defpackage.j4b.p(r12)
            if (r12 == 0) goto L_0x0107
            java.lang.String r12 = r12.appToken()
            goto L_0x011b
        L_0x0107:
            java.lang.String r12 = "tracer_app_token"
            java.lang.String r11 = defpackage.ev0.p(r11, r12)
            if (r11 != 0) goto L_0x0111
        L_0x010f:
            r12 = r7
            goto L_0x011b
        L_0x0111:
            java.lang.String r12 = "0000000000000000000000000000000000000000000"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x011a
            goto L_0x010f
        L_0x011a:
            r12 = r11
        L_0x011b:
            android.content.Context r11 = r9.d
            kotlin.Lazy r13 = r9.f
            java.lang.Object r13 = r13.getValue()
            tof r13 = (defpackage.tof) r13
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            r15 = r2
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ r1
            if (r15 == 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r2 = r7
        L_0x0136:
            android.content.pm.PackageManager r15 = r11.getPackageManager()
            java.lang.String r6 = r11.getPackageName()
            android.content.pm.PackageInfo r6 = defpackage.ld8.M(r15, r6)
            java.lang.String r15 = r11.getPackageName()
            apf r15 = defpackage.j4b.p(r15)
            if (r15 == 0) goto L_0x0151
            java.lang.String r15 = r15.buildUuid()
            goto L_0x0164
        L_0x0151:
            java.lang.String r15 = "tracer_mapping_uuid"
            java.lang.String r15 = defpackage.ev0.p(r11, r15)
            if (r15 != 0) goto L_0x015b
            r15 = r7
            goto L_0x0164
        L_0x015b:
            java.lang.String r7 = "00000000-0000-0000-0000-000000000000"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0164
            r15 = 0
        L_0x0164:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r1 = r6.packageName
            r17 = r3
            java.lang.String r3 = "packageName"
            r7.put((java.lang.String) r3, (java.lang.Object) r1)
            java.lang.String r1 = r6.versionName
            r18 = r12
            java.lang.String r12 = "versionName"
            r7.put((java.lang.String) r12, (java.lang.Object) r1)
            r1 = r9
            r19 = r10
            long r9 = r6.getLongVersionCode()
            java.lang.String r6 = "versionCode"
            r7.put((java.lang.String) r6, (long) r9)
            java.lang.String r6 = "buildUuid"
            r7.put((java.lang.String) r6, (java.lang.Object) r15)
            java.lang.String r9 = defpackage.rxd.a
            java.lang.String r10 = "sessionUuid"
            r7.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = "device"
            r7.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r15 = defpackage.i8b.u(r11)
            r20 = r1
            java.lang.String r1 = "deviceId"
            r7.put((java.lang.String) r1, (java.lang.Object) r15)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "vendor"
            r7.put((java.lang.String) r15, (java.lang.Object) r1)
            int r15 = android.os.Build.VERSION.SDK_INT
            r21 = r5
            java.lang.String r5 = java.lang.String.valueOf(r15)
            r22 = r8
            java.lang.String r8 = "osVersion"
            r7.put((java.lang.String) r8, (java.lang.Object) r5)
            android.app.ActivityManager$RunningAppProcessInfo r5 = new android.app.ActivityManager$RunningAppProcessInfo
            r5.<init>()
            android.app.ActivityManager.getMyMemoryState(r5)
            int r5 = r5.importance
            r8 = 100
            r23 = r4
            r4 = 200(0xc8, float:2.8E-43)
            if (r5 == r8) goto L_0x01d4
            if (r5 != r4) goto L_0x01d0
            goto L_0x01d4
        L_0x01d0:
            r5 = 1
            r16 = 0
            goto L_0x01d7
        L_0x01d4:
            r5 = 1
            r16 = 1
        L_0x01d7:
            r8 = r16 ^ 1
            java.lang.String r5 = "inBackground"
            r7.put((java.lang.String) r5, (boolean) r8)
            android.content.ContentResolver r5 = r11.getContentResolver()
            java.lang.String r8 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r8)
            java.lang.String r8 = android.os.Build.PRODUCT
            java.lang.String r11 = "sdk"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r8)
            if (r11 != 0) goto L_0x01ff
            java.lang.String r11 = "google_sdk"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r8)
            if (r8 != 0) goto L_0x01ff
            if (r5 != 0) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            r5 = 0
            goto L_0x0200
        L_0x01ff:
            r5 = 1
        L_0x0200:
            java.lang.String r8 = android.os.Build.TAGS
            if (r5 != 0) goto L_0x0210
            if (r8 == 0) goto L_0x0210
            java.lang.String r11 = "test-keys"
            boolean r8 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, false, 2, (java.lang.Object) null)
            if (r8 == 0) goto L_0x0210
        L_0x020e:
            r5 = 1
            goto L_0x022f
        L_0x0210:
            java.io.File r8 = new java.io.File
            java.lang.String r11 = "/system/app/Superuser.apk"
            r8.<init>(r11)
            boolean r8 = r8.exists()
            if (r8 == 0) goto L_0x021e
            goto L_0x020e
        L_0x021e:
            java.io.File r8 = new java.io.File
            java.lang.String r11 = "/system/xbin/su"
            r8.<init>(r11)
            if (r5 != 0) goto L_0x022e
            boolean r5 = r8.exists()
            if (r5 == 0) goto L_0x022e
            goto L_0x020e
        L_0x022e:
            r5 = 0
        L_0x022f:
            java.lang.String r8 = "isRooted"
            r7.put((java.lang.String) r8, (boolean) r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r8 = "date"
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd'T'HH:mm:ssXXX"
            r24 = r6
            java.util.Locale r6 = java.util.Locale.US
            r11.<init>(r4, r6)
            java.lang.String r4 = r11.format(r14)
            r5.put((java.lang.String) r8, (java.lang.Object) r4)
            java.lang.String r4 = "board"
            java.lang.String r6 = android.os.Build.BOARD
            r5.put((java.lang.String) r4, (java.lang.Object) r6)
            java.lang.String r4 = "brand"
            java.lang.String r6 = android.os.Build.BRAND
            r5.put((java.lang.String) r4, (java.lang.Object) r6)
            java.lang.String r4 = ", "
            java.lang.String[] r6 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r4 = android.text.TextUtils.join(r4, r6)
            java.lang.String r6 = "cpuABI"
            r5.put((java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = android.os.Build.DEVICE
            r5.put((java.lang.String) r10, (java.lang.Object) r4)
            java.lang.String r4 = "manufacturer"
            r5.put((java.lang.String) r4, (java.lang.Object) r1)
            java.lang.String r1 = "model"
            r5.put((java.lang.String) r1, (java.lang.Object) r9)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "cpuCount"
            r5.put((java.lang.String) r4, (java.lang.Object) r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r4 = "osVersionSdkInt"
            r5.put((java.lang.String) r4, (java.lang.Object) r1)
            java.lang.String r1 = "osVersionRelease"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r5.put((java.lang.String) r1, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x029f
            java.lang.String r1 = "issueKey"
            r5.put((java.lang.String) r1, (java.lang.Object) r0)
        L_0x029f:
            java.lang.String r0 = "properties"
            r7.put((java.lang.String) r0, (java.lang.Object) r5)
            if (r2 == 0) goto L_0x02bf
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x02af:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02c0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.put((java.lang.Object) r2)
            goto L_0x02af
        L_0x02bf:
            r0 = 0
        L_0x02c0:
            java.lang.String r1 = "tags"
            r7.put((java.lang.String) r1, (java.lang.Object) r0)
            if (r13 != 0) goto L_0x02c9
            r0 = 0
            goto L_0x02e6
        L_0x02c9:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r13.a
            r0.put((java.lang.String) r3, (java.lang.Object) r1)
            java.lang.String r1 = r13.b
            r0.put((java.lang.String) r12, (java.lang.Object) r1)
            java.lang.String r1 = r13.c
            r2 = r24
            r0.put((java.lang.String) r2, (java.lang.Object) r1)
            java.lang.String r1 = "environment"
            java.lang.String r2 = r13.d
            r0.put((java.lang.String) r1, (java.lang.Object) r2)
        L_0x02e6:
            java.lang.String r1 = "libraryInfo"
            r7.put((java.lang.String) r1, (java.lang.Object) r0)
            java.lang.String r0 = r7.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = r23
            defpackage.kv0.e(r4, r1)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r1)
            r4.close()
            byte[] r1 = r3.toByteArray()
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x031f
            r3 = 0
            goto L_0x0332
        L_0x031f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r4 = r22.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x04b0
            java.lang.String r3 = r3.toString()
        L_0x0332:
            if (r3 == 0) goto L_0x034f
            byte[] r2 = r3.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r2)
            r4.close()
            byte[] r2 = r3.toByteArray()
            r3 = r21
            goto L_0x0352
        L_0x034f:
            r3 = r21
            r2 = 0
        L_0x0352:
            java.lang.Object r4 = r3.a
            xof r4 = (defpackage.xof) r4
            g93 r4 = r4.h
            kotlin.Lazy r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            gx4 r4 = (defpackage.gx4) r4
            java.util.Collection r4 = r4.d()
            boolean r5 = r4.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x036e
            r5 = r4
            goto L_0x036f
        L_0x036e:
            r5 = 0
        L_0x036f:
            if (r5 == 0) goto L_0x03ab
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x037a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x03a4
            java.lang.Object r7 = r5.next()
            ix4 r7 = (defpackage.ix4) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = r7.a
            java.lang.String r10 = "event"
            r8.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r9 = "reason"
            java.lang.String r10 = r7.b
            r8.put((java.lang.String) r9, (java.lang.Object) r10)
            java.lang.String r9 = "count"
            int r7 = r7.c
            r8.put((java.lang.String) r9, (int) r7)
            r6.put((java.lang.Object) r8)
            goto L_0x037a
        L_0x03a4:
            java.lang.String r5 = r6.toString()
            r9 = r20
            goto L_0x03ae
        L_0x03ab:
            r9 = r20
            r5 = 0
        L_0x03ae:
            xe8 r6 = r9.b
            java.lang.Object r6 = r6.b
            fbe r6 = (defpackage.fbe) r6
            java.lang.Object r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r7 = "api/crash/upload"
            android.net.Uri$Builder r6 = r6.appendEncodedPath(r7)
            java.lang.String r7 = "crashToken"
            r10 = r19
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r7, r10)
            if (r18 == 0) goto L_0x03d7
            java.lang.String r7 = "crashHostAppToken"
            r12 = r18
            r6.appendQueryParameter(r7, r12)
        L_0x03d7:
            java.lang.String r6 = r6.toString()
            xv1 r7 = new xv1
            r8 = 23
            r7.<init>((int) r8)
            java.lang.String r8 = "type"
            java.lang.String r9 = "NON_FATAL"
            r7.j(r8, r9)
            java.lang.String r8 = "format"
            java.lang.String r9 = "JVM_STACKTRACE"
            r7.j(r8, r9)
            java.lang.String r8 = "severity"
            r9 = r17
            r7.j(r8, r9)
            mm5 r8 = new mm5
            java.lang.String r9 = "application/octet-stream"
            r10 = 1
            r8.<init>(r10, r9, r1)
            java.lang.String r1 = "stackTrace"
            java.lang.String r10 = "stack.gzip"
            r7.i(r1, r10, r8)
            java.lang.String r1 = "application/json; charset=utf-8"
            mm5 r0 = defpackage.pf6.i(r1, r0)
            java.lang.String r1 = "uploadBean"
            r8 = 0
            r7.i(r1, r8, r0)
            if (r2 == 0) goto L_0x0421
            mm5 r0 = new mm5
            r1 = 1
            r0.<init>(r1, r9, r2)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r7.i(r1, r2, r0)
        L_0x0421:
            if (r5 == 0) goto L_0x0430
            java.lang.String r0 = "application/json"
            mm5 r0 = defpackage.pf6.i(r0, r5)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r7.i(r1, r2, r0)
        L_0x0430:
            u05 r0 = r7.n()
            d19 r1 = new d19
            r1.<init>((java.lang.String) r6, (defpackage.h57) r0)
            java.lang.Object r0 = r3.b     // Catch:{ IOException -> 0x049e }
            f7a r0 = (defpackage.f7a) r0     // Catch:{ IOException -> 0x049e }
            java.lang.Object r0 = r0.b     // Catch:{ IOException -> 0x049e }
            kotlin.Lazy r0 = (kotlin.Lazy) r0     // Catch:{ IOException -> 0x049e }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x049e }
            n57 r0 = (defpackage.n57) r0     // Catch:{ IOException -> 0x049e }
            i57 r1 = r0.b(r1)     // Catch:{ IOException -> 0x049e }
            int r0 = r1.b     // Catch:{ all -> 0x0462 }
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0462 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0462 }
            java.io.Closeable r5 = r1.o     // Catch:{ all -> 0x0462 }
            mm5 r5 = (defpackage.mm5) r5     // Catch:{ all -> 0x0462 }
            if (r5 == 0) goto L_0x0465
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x0462 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0462 }
            if (r5 == 0) goto L_0x0465
            java.lang.String r5 = kotlin.text.StringsKt.decodeToString(r5)     // Catch:{ all -> 0x0462 }
            goto L_0x0466
        L_0x0462:
            r0 = move-exception
            r2 = r0
            goto L_0x0497
        L_0x0465:
            r5 = 0
        L_0x0466:
            java.lang.Object r6 = r3.c     // Catch:{ all -> 0x0462 }
            npg r6 = (defpackage.npg) r6     // Catch:{ all -> 0x0462 }
            r6.J(r5)     // Catch:{ all -> 0x0462 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x0478
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0462 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r0)     // Catch:{ IOException -> 0x049e }
            goto L_0x04cf
        L_0x0478:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0462 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0462 }
            r6.<init>()     // Catch:{ all -> 0x0462 }
            java.lang.String r7 = "HTTP "
            r6.append(r7)     // Catch:{ all -> 0x0462 }
            r6.append(r0)     // Catch:{ all -> 0x0462 }
            r0 = 32
            r6.append(r0)     // Catch:{ all -> 0x0462 }
            r6.append(r2)     // Catch:{ all -> 0x0462 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0462 }
            r5.<init>(r0)     // Catch:{ all -> 0x0462 }
            throw r5     // Catch:{ all -> 0x0462 }
        L_0x0497:
            throw r2     // Catch:{ all -> 0x0498 }
        L_0x0498:
            r0 = move-exception
            r5 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r2)     // Catch:{ IOException -> 0x049e }
            throw r5     // Catch:{ IOException -> 0x049e }
        L_0x049e:
            java.lang.Object r0 = r3.a
            xof r0 = (defpackage.xof) r0
            g93 r0 = r0.h
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            gx4 r0 = (defpackage.gx4) r0
            r0.a(r4)
            goto L_0x04cf
        L_0x04b0:
            java.lang.Object r0 = r4.next()
            defpackage.rae.w(r0)
            r0 = 0
            throw r0
        L_0x04b9:
            java.lang.String r0 = "No lib token"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04cf }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04cf }
            r1.<init>(r0)     // Catch:{ Exception -> 0x04cf }
            throw r1     // Catch:{ Exception -> 0x04cf }
        L_0x04c5:
            monitor-exit(r10)
            throw r0
        L_0x04c7:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x04ca:
            r0 = r1
            r5.c = r0
        L_0x04cd:
            r2.f = r0
        L_0x04cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh3.a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224 A[SYNTHETIC, Splitter:B:113:0x0224] */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0209 A[SYNTHETIC, Splitter:B:99:0x0209] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0142=Splitter:B:43:0x0142, B:80:0x01cf=Splitter:B:80:0x01cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x0418;
                case 1: goto L_0x03a6;
                case 2: goto L_0x0384;
                case 3: goto L_0x0362;
                case 4: goto L_0x033c;
                case 5: goto L_0x02e0;
                case 6: goto L_0x028a;
                case 7: goto L_0x0245;
                case 8: goto L_0x0228;
                case 9: goto L_0x0121;
                case 10: goto L_0x00f9;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00c7;
                case 13: goto L_0x00b1;
                case 14: goto L_0x009d;
                case 15: goto L_0x0089;
                case 16: goto L_0x0073;
                case 17: goto L_0x0049;
                case 18: goto L_0x0045;
                case 19: goto L_0x0031;
                case 20: goto L_0x001b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.o
            com.my.tracker.obfuscated.e0 r1 = (com.my.tracker.obfuscated.e0) r1
            java.lang.Object r2 = r0.v
            com.my.tracker.obfuscated.w1 r2 = (com.my.tracker.obfuscated.w1) r2
            java.lang.Object r3 = r0.b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r0.c
            com.my.tracker.obfuscated.y2 r0 = (com.my.tracker.obfuscated.y2) r0
            com.my.tracker.obfuscated.w0.a((android.content.Context) r3, (com.my.tracker.obfuscated.y2) r0, (com.my.tracker.obfuscated.e0) r1, (com.my.tracker.obfuscated.w1) r2)
            return
        L_0x001b:
            java.lang.Object r1 = r0.c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.b
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.o
            com.my.tracker.obfuscated.m0$b r3 = (com.my.tracker.obfuscated.m0.b) r3
            java.lang.Object r0 = r0.v
            android.content.Context r0 = (android.content.Context) r0
            com.my.tracker.obfuscated.m0.a((java.util.List) r2, (java.lang.String) r1, (com.my.tracker.obfuscated.m0.b) r3, (android.content.Context) r0)
            return
        L_0x0031:
            java.lang.Object r1 = r0.o
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r2 = r0.v
            com.my.tracker.obfuscated.b3 r2 = (com.my.tracker.obfuscated.b3) r2
            java.lang.Object r3 = r0.b
            com.my.tracker.obfuscated.l2 r3 = (com.my.tracker.obfuscated.l2) r3
            java.lang.Object r0 = r0.c
            com.my.tracker.obfuscated.q2 r0 = (com.my.tracker.obfuscated.q2) r0
            r3.a(r0, r1, r2)
            return
        L_0x0045:
            r20.a()
            return
        L_0x0049:
            java.lang.Object r1 = r0.b
            mhf r1 = (defpackage.mhf) r1
            u00 r2 = r1.l
            r3 = 0
            if (r2 == 0) goto L_0x0057
            r2.j()
            r1.l = r3
        L_0x0057:
            java.lang.Object r2 = r0.c
            android.view.Surface r2 = (android.view.Surface) r2
            r2.release()
            go1 r2 = r1.g
            java.lang.Object r4 = r0.o
            zz7 r4 = (defpackage.zz7) r4
            if (r2 != r4) goto L_0x0068
            r1.g = r3
        L_0x0068:
            z3f r2 = r1.h
            java.lang.Object r0 = r0.v
            z3f r0 = (defpackage.z3f) r0
            if (r2 != r0) goto L_0x0072
            r1.h = r3
        L_0x0072:
            return
        L_0x0073:
            java.lang.Object r1 = r0.c
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.b
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl r2 = (ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl) r2
            java.lang.Object r3 = r0.o
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.v
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.resolveIdsAndThen$lambda$10(r2, r1, r3, r0)
            return
        L_0x0089:
            java.lang.Object r1 = r0.o
            com.my.tracker.personalize.PersonalizeRequest r1 = (com.my.tracker.personalize.PersonalizeRequest) r1
            java.lang.Object r2 = r0.v
            com.my.tracker.personalize.PersonalizeResponse r2 = (com.my.tracker.personalize.PersonalizeResponse) r2
            java.lang.Object r3 = r0.b
            com.my.tracker.personalize.PersonalizeApiClient r3 = (com.my.tracker.personalize.PersonalizeApiClient) r3
            java.lang.Object r0 = r0.c
            com.my.tracker.personalize.PersonalizeApiClient$OnCompleteListener r0 = (com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r0
            r3.a((com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r0, (com.my.tracker.personalize.PersonalizeRequest) r1, (com.my.tracker.personalize.PersonalizeResponse) r2)
            return
        L_0x009d:
            java.lang.Object r1 = r0.o
            com.my.tracker.personalize.PersonalizeRequest r1 = (com.my.tracker.personalize.PersonalizeRequest) r1
            java.lang.Object r2 = r0.v
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.b
            com.my.tracker.personalize.PersonalizeApiClient r3 = (com.my.tracker.personalize.PersonalizeApiClient) r3
            java.lang.Object r0 = r0.c
            com.my.tracker.personalize.PersonalizeApiClient$OnCompleteListener r0 = (com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r0
            r3.a((com.my.tracker.personalize.PersonalizeApiClient.OnCompleteListener) r0, (com.my.tracker.personalize.PersonalizeRequest) r1, (java.lang.String) r2)
            return
        L_0x00b1:
            java.lang.Object r1 = r0.b
            cs r1 = (defpackage.cs) r1
            int r1 = r1.b
            java.lang.Object r2 = r0.c
            wz8 r2 = (defpackage.wz8) r2
            java.lang.Object r3 = r0.o
            nz8 r3 = (defpackage.nz8) r3
            java.lang.Object r0 = r0.v
            es8 r0 = (defpackage.es8) r0
            r2.C(r1, r3, r0)
            return
        L_0x00c7:
            java.lang.Object r1 = r0.b
            uz8 r1 = (defpackage.uz8) r1
            int r1 = r1.a
            java.lang.Object r2 = r0.c
            vz8 r2 = (defpackage.vz8) r2
            java.lang.Object r3 = r0.o
            mz8 r3 = (defpackage.mz8) r3
            java.lang.Object r0 = r0.v
            es8 r0 = (defpackage.es8) r0
            r2.D(r1, r3, r0)
            return
        L_0x00dd:
            java.lang.Object r1 = r0.b
            yx8 r1 = (defpackage.yx8) r1
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x00f8
            ypb r1 = r1.s
            java.lang.Object r2 = r0.o
            cx8 r2 = (defpackage.cx8) r2
            java.lang.Object r3 = r0.v
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.c
            fz8 r0 = (defpackage.fz8) r0
            r0.b(r1, r2, r3)
        L_0x00f8:
            return
        L_0x00f9:
            java.lang.Object r1 = r0.o
            pk3 r1 = (defpackage.pk3) r1
            java.lang.Object r2 = r0.v
            zz7 r2 = (defpackage.zz7) r2
            java.lang.Object r3 = r0.b
            yx8 r3 = (defpackage.yx8) r3
            boolean r3 = r3.i()
            java.lang.Object r0 = r0.c
            r4 = r0
            byd r4 = (defpackage.byd) r4
            r0 = 0
            if (r3 == 0) goto L_0x0115
            r4.l(r0)
            goto L_0x0120
        L_0x0115:
            r1.accept(r2)     // Catch:{ all -> 0x011c }
            r4.l(r0)     // Catch:{ all -> 0x011c }
            goto L_0x0120
        L_0x011c:
            r0 = move-exception
            r4.m(r0)
        L_0x0120:
            return
        L_0x0121:
            java.lang.Object r1 = r0.c
            cx8 r1 = (defpackage.cx8) r1
            java.lang.Object r2 = r0.o
            yx8 r2 = (defpackage.yx8) r2
            java.lang.Object r3 = r0.v
            c67 r3 = (defpackage.c67) r3
            java.lang.Object r0 = r0.b
            r7 = r0
            hz8 r7 = (defpackage.hz8) r7
            m7f r0 = r7.e
            java.lang.String r4 = "Controller "
            r15 = 0
            java.util.Set r5 = r7.f     // Catch:{ all -> 0x0173 }
            r5.remove(r1)     // Catch:{ all -> 0x0173 }
            boolean r5 = r2.i()     // Catch:{ all -> 0x0173 }
            if (r5 == 0) goto L_0x0147
        L_0x0142:
            r3.d(r15)     // Catch:{ RemoteException -> 0x021e }
            goto L_0x021e
        L_0x0147:
            bx8 r5 = r1.d     // Catch:{ all -> 0x021f }
            dz8 r5 = (defpackage.dz8) r5     // Catch:{ all -> 0x0173 }
            defpackage.n79.o(r5)     // Catch:{ all -> 0x0173 }
            c67 r5 = r5.a     // Catch:{ all -> 0x021f }
            android.os.IBinder r5 = r5.asBinder()     // Catch:{ all -> 0x021f }
            ax8 r6 = r2.l(r1)     // Catch:{ all -> 0x0173 }
            boolean r8 = r0.p(r1)     // Catch:{ all -> 0x0173 }
            if (r8 == 0) goto L_0x0177
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r8.<init>(r4)     // Catch:{ all -> 0x0173 }
            r8.append(r1)     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = " has sent connection request multiple times"
            r8.append(r4)     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0173 }
            defpackage.i8b.V(r4)     // Catch:{ all -> 0x0173 }
            goto L_0x0177
        L_0x0173:
            r0 = move-exception
            r1 = r15
            goto L_0x0222
        L_0x0177:
            zvd r4 = r6.a     // Catch:{ all -> 0x0173 }
            pob r8 = r6.b     // Catch:{ all -> 0x0173 }
            r0.c(r5, r1, r4, r8)     // Catch:{ all -> 0x0173 }
            bs6 r0 = r0.l(r1)     // Catch:{ all -> 0x0173 }
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "Ignoring connection request from unknown controller info"
            defpackage.i8b.V(r0)     // Catch:{ all -> 0x0173 }
            goto L_0x0142
        L_0x018a:
            ypb r4 = r2.s     // Catch:{ all -> 0x021f }
            ppb r5 = r4.F0()     // Catch:{ all -> 0x0173 }
            ppb r16 = r7.H0(r5)     // Catch:{ all -> 0x0173 }
            gi3 r14 = new gi3     // Catch:{ all -> 0x0173 }
            android.app.PendingIntent r8 = r2.t     // Catch:{ all -> 0x021f }
            tb7 r5 = r6.c     // Catch:{ all -> 0x0173 }
            if (r5 == 0) goto L_0x019e
        L_0x019c:
            r9 = r5
            goto L_0x01a1
        L_0x019e:
            tb7 r5 = r2.A     // Catch:{ all -> 0x021f }
            goto L_0x019c
        L_0x01a1:
            zvd r10 = r6.a     // Catch:{ all -> 0x0173 }
            pob r11 = r6.b     // Catch:{ all -> 0x0173 }
            pob r12 = r4.o()     // Catch:{ all -> 0x0173 }
            oxd r4 = r2.j     // Catch:{ all -> 0x021f }
            nxd r4 = r4.a     // Catch:{ all -> 0x021f }
            android.os.Bundle r13 = r4.getExtras()     // Catch:{ all -> 0x021f }
            android.os.Bundle r6 = r2.B     // Catch:{ all -> 0x021f }
            r5 = 1004001300(0x3bd7d814, float:0.006587038)
            r17 = 4
            r4 = r14
            r18 = r6
            r6 = r17
            r19 = r14
            r14 = r18
            r17 = r1
            r1 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0204 }
            boolean r4 = r2.i()     // Catch:{ all -> 0x0204 }
            if (r4 == 0) goto L_0x01d3
        L_0x01cf:
            r3.d(r1)     // Catch:{ RemoteException -> 0x021e }
            goto L_0x021e
        L_0x01d3:
            int r0 = r0.g()     // Catch:{ RemoteException -> 0x01f2 }
            boolean r4 = r3 instanceof defpackage.wp8     // Catch:{ RemoteException -> 0x01f2 }
            if (r4 == 0) goto L_0x01f5
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x01f2 }
            r4.<init>()     // Catch:{ RemoteException -> 0x01f2 }
            fi3 r5 = new fi3     // Catch:{ RemoteException -> 0x01f2 }
            r6 = r19
            r5.<init>(r6)     // Catch:{ RemoteException -> 0x01f2 }
            java.lang.String r6 = defpackage.gi3.w     // Catch:{ RemoteException -> 0x01f2 }
            r4.putBinder(r6, r5)     // Catch:{ RemoteException -> 0x01f2 }
            r5 = r4
            r4 = r17
            goto L_0x01ff
        L_0x01f0:
            r15 = r1
            goto L_0x0222
        L_0x01f2:
            r4 = r17
            goto L_0x0206
        L_0x01f5:
            r4 = r17
            r6 = r19
            int r5 = r4.c     // Catch:{ RemoteException -> 0x0206 }
            android.os.Bundle r5 = r6.b(r5)     // Catch:{ RemoteException -> 0x0206 }
        L_0x01ff:
            r3.r(r0, r5)     // Catch:{ RemoteException -> 0x0206 }
            r15 = 1
            goto L_0x0207
        L_0x0204:
            r0 = move-exception
            goto L_0x01f0
        L_0x0206:
            r15 = r1
        L_0x0207:
            if (r15 == 0) goto L_0x021b
            boolean r0 = r2.z     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0216
            boolean r0 = defpackage.yx8.j(r4)     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0216
            goto L_0x021b
        L_0x0214:
            r0 = move-exception
            goto L_0x0222
        L_0x0216:
            o9a r0 = r2.e     // Catch:{ all -> 0x0214 }
            r0.getClass()     // Catch:{ all -> 0x0214 }
        L_0x021b:
            if (r15 != 0) goto L_0x021e
            goto L_0x01cf
        L_0x021e:
            return
        L_0x021f:
            r0 = move-exception
            r1 = r15
            goto L_0x01f0
        L_0x0222:
            if (r15 != 0) goto L_0x0227
            r3.d(r1)     // Catch:{ RemoteException -> 0x0227 }
        L_0x0227:
            throw r0
        L_0x0228:
            java.lang.Object r1 = r0.b
            sy8 r1 = (defpackage.sy8) r1
            yx8 r1 = r1.X
            java.lang.Object r2 = r0.o
            cx8 r2 = (defpackage.cx8) r2
            ax8 r1 = r1.l(r2)
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            r2.set(r1)
            java.lang.Object r0 = r0.v
            bv1 r0 = (defpackage.bv1) r0
            r0.g()
            return
        L_0x0245:
            java.lang.Object r1 = r0.c
            zz7 r1 = (defpackage.zz7) r1
            java.lang.Object r2 = r0.o
            dt8 r2 = (defpackage.dt8) r2
            java.lang.Object r3 = r0.v
            ex8 r3 = (defpackage.ex8) r3
            java.lang.Object r0 = r0.b
            ef r0 = (defpackage.ef) r0
            r0.getClass()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            r5 = 0
            java.lang.Object r1 = r1.get(r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            qo8 r1 = (defpackage.qo8) r1     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            qo8 r4 = r0.b(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            if (r4 == 0) goto L_0x027a
            jkf r5 = r4.l0()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            boolean r5 = r5.q()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            if (r5 != 0) goto L_0x027a
            int r4 = r4.getPlaybackState()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            r5 = 1
            if (r4 == r5) goto L_0x027a
            goto L_0x027b
        L_0x027a:
            r5 = 0
        L_0x027b:
            r2.t(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            r1.v(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x0282 }
            goto L_0x0289
        L_0x0282:
            java.lang.Object r0 = r0.c
            ry8 r0 = (defpackage.ry8) r0
            r0.g(r3)
        L_0x0289:
            return
        L_0x028a:
            java.lang.Object r1 = r0.c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.v
            r97 r3 = (defpackage.r97) r3
            java.lang.Object r0 = r0.b
            s97 r0 = (defpackage.s97) r0
            r0.getClass()
            boolean r4 = defpackage.cjf.p(r2)     // Catch:{ all -> 0x02dc }
            if (r4 == 0) goto L_0x02b0
            if (r3 == 0) goto L_0x02df
            uo5 r1 = new uo5     // Catch:{ all -> 0x02dc }
            r4 = 11
            r1.<init>((int) r4, (java.lang.Object) r3, (java.lang.Object) r2)     // Catch:{ all -> 0x02dc }
            r0.c(r1)     // Catch:{ all -> 0x02dc }
            goto L_0x02df
        L_0x02b0:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02dc }
            if (r2 == 0) goto L_0x02ba
            r0.b(r3)     // Catch:{ all -> 0x02dc }
            goto L_0x02df
        L_0x02ba:
            if (r3 == 0) goto L_0x02c5
            p97 r2 = new p97     // Catch:{ all -> 0x02dc }
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02dc }
            r0.c(r2)     // Catch:{ all -> 0x02dc }
        L_0x02c5:
            qa7 r1 = defpackage.qa7.b(r1)     // Catch:{ all -> 0x02dc }
            ba7 r2 = defpackage.ld9.B()     // Catch:{ all -> 0x02dc }
            i0 r2 = r2.c(r1)     // Catch:{ all -> 0x02dc }
            wj r4 = new wj     // Catch:{ all -> 0x02dc }
            r4.<init>((defpackage.s97) r0, (defpackage.r97) r3, (defpackage.qa7) r1)     // Catch:{ all -> 0x02dc }
            io1 r1 = defpackage.io1.a     // Catch:{ all -> 0x02dc }
            r2.m(r4, r1)     // Catch:{ all -> 0x02dc }
            goto L_0x02df
        L_0x02dc:
            r0.b(r3)
        L_0x02df:
            return
        L_0x02e0:
            long r13 = java.lang.System.nanoTime()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r2 = r0.b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x02f5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0307
            java.lang.Object r3 = r2.next()
            w96 r3 = (defpackage.w96) r3
            x96 r3 = r3.b
            r1.add(r3)
            goto L_0x02f5
        L_0x0307:
            java.util.concurrent.ForkJoinTask.invokeAll(r1)
            long r1 = java.lang.System.nanoTime()
            java.lang.Object r3 = r0.c
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r3.invoke()
            java.lang.Object r3 = r0.o
            z96 r3 = (defpackage.z96) r3
            java.util.concurrent.ConcurrentSkipListSet r3 = r3.a
            zi8 r4 = new zi8
            long r7 = r1 - r13
            long r5 = java.lang.System.nanoTime()
            long r9 = r5 - r1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r12 = r1.getName()
            java.lang.Object r0 = r0.v
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r5 = r4
            r5.<init>(r6, r7, r9, r11, r12, r13)
            r3.add(r4)
            return
        L_0x033c:
            java.lang.Object r1 = r0.b
            ll5 r1 = (defpackage.ll5) r1
            r1.getClass()
            java.lang.Object r2 = r0.c
            r6 = r2
            a89 r6 = (defpackage.a89) r6
            ha9 r2 = r6.a
            long r4 = r2.z
            java.lang.Object r2 = r0.o
            l20 r2 = (defpackage.l20) r2
            java.lang.String r7 = r2.q
            java.lang.Object r0 = r0.v
            r8 = r0
            o5h r8 = (defpackage.o5h) r8
            r10 = 1
            java.lang.Object r0 = r1.c
            r3 = r0
            ru.ok.messages.views.fragments.base.FrgBase r3 = (ru.ok.messages.views.fragments.base.FrgBase) r3
            r9 = 1
            ru.ok.messages.media.attaches.ActAttachesView.d0(r3, r4, r6, r7, r8, r9, r10)
            return
        L_0x0362:
            java.lang.Object r1 = r0.c
            vy4 r1 = (defpackage.vy4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.v
            do1 r3 = (defpackage.do1) r3
            java.lang.Object r0 = r0.b
            px4 r0 = (defpackage.px4) r0
            r0.getClass()
            nx4 r0 = r0.a     // Catch:{ RuntimeException -> 0x037f }
            r0.m(r1, r2)     // Catch:{ RuntimeException -> 0x037f }
            r0 = 0
            r3.b(r0)     // Catch:{ RuntimeException -> 0x037f }
            goto L_0x0383
        L_0x037f:
            r0 = move-exception
            r3.d(r0)
        L_0x0383:
            return
        L_0x0384:
            java.lang.Object r1 = r0.c
            vy4 r1 = (defpackage.vy4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.v
            do1 r3 = (defpackage.do1) r3
            java.lang.Object r0 = r0.b
            ti4 r0 = (defpackage.ti4) r0
            r0.getClass()
            nr4 r0 = r0.a     // Catch:{ RuntimeException -> 0x03a1 }
            r0.m(r1, r2)     // Catch:{ RuntimeException -> 0x03a1 }
            r0 = 0
            r3.b(r0)     // Catch:{ RuntimeException -> 0x03a1 }
            goto L_0x03a5
        L_0x03a1:
            r0 = move-exception
            r3.d(r0)
        L_0x03a5:
            return
        L_0x03a6:
            java.lang.Object r1 = r0.c
            tc0 r1 = (defpackage.tc0) r1
            java.lang.Object r2 = r0.o
            ts1 r2 = (defpackage.ts1) r2
            java.lang.Object r3 = r0.v
            ua0 r3 = (defpackage.ua0) r3
            java.lang.Object r0 = r0.b
            ci4 r0 = (defpackage.ci4) r0
            r0.getClass()
            java.util.logging.Logger r4 = defpackage.ci4.f
            java.lang.String r5 = "Transport backend '"
            tp9 r6 = r0.c     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r7 = r1.a     // Catch:{ Exception -> 0x03e6 }
            nsf r6 = r6.a(r7)     // Catch:{ Exception -> 0x03e6 }
            if (r6 != 0) goto L_0x03e8
            java.lang.String r0 = r1.a     // Catch:{ Exception -> 0x03e6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x03e6 }
            r1.append(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = "' is not registered"
            r1.append(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03e6 }
            r4.warning(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03e6 }
            r2.getClass()     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0417
        L_0x03e6:
            r0 = move-exception
            goto L_0x03ff
        L_0x03e8:
            zx1 r6 = (defpackage.zx1) r6     // Catch:{ Exception -> 0x03e6 }
            ua0 r3 = r6.a(r3)     // Catch:{ Exception -> 0x03e6 }
            q6f r5 = r0.e     // Catch:{ Exception -> 0x03e6 }
            u00 r6 = new u00     // Catch:{ Exception -> 0x03e6 }
            r7 = 4
            r6.<init>((java.lang.Object) r0, (java.lang.Object) r1, (java.lang.Object) r3, (int) r7)     // Catch:{ Exception -> 0x03e6 }
            nbd r5 = (defpackage.nbd) r5     // Catch:{ Exception -> 0x03e6 }
            r5.e0(r6)     // Catch:{ Exception -> 0x03e6 }
            r2.getClass()     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0417
        L_0x03ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Error scheduling event "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.warning(r0)
            r2.getClass()
        L_0x0417:
            return
        L_0x0418:
            java.lang.Object r1 = r0.b
            m7f r1 = (defpackage.m7f) r1
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r3 = r0.v
            lh3 r3 = (defpackage.lh3) r3
            java.lang.Object r0 = r0.o
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r4 = r1.a
            monitor-enter(r4)
            boolean r2 = r2.get()     // Catch:{ all -> 0x0435 }
            if (r2 != 0) goto L_0x0437
            r1.f(r3)     // Catch:{ all -> 0x0435 }
            goto L_0x043b
        L_0x0435:
            r0 = move-exception
            goto L_0x043d
        L_0x0437:
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x0435 }
        L_0x043b:
            monitor-exit(r4)     // Catch:{ all -> 0x0435 }
            return
        L_0x043d:
            monitor-exit(r4)     // Catch:{ all -> 0x0435 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh3.run():void");
    }

    public /* synthetic */ jh3(s97 s97, String str, r97 r97) {
        this.a = 6;
        this.b = s97;
        this.c = str;
        this.o = null;
        this.v = r97;
    }

    public /* synthetic */ jh3(m7f m7f, AtomicBoolean atomicBoolean, lh3 lh3, AtomicBoolean atomicBoolean2) {
        this.a = 0;
        this.b = m7f;
        this.c = atomicBoolean;
        this.v = lh3;
        this.o = atomicBoolean2;
    }

    public /* synthetic */ jh3(rof rof, Throwable th, String str) {
        this.a = 18;
        this.b = rof;
        this.c = "NON_FATAL";
        this.o = th;
        this.v = str;
    }
}
