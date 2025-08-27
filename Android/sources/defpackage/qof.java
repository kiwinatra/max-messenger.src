package defpackage;

/* renamed from: qof  reason: default package */
public final /* synthetic */ class qof implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qof(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x026e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0272, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r0 = 1021(0x3fd, float:1.431E-42)
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r12.a
            switch(r4) {
                case 0: goto L_0x043b;
                case 1: goto L_0x022a;
                case 2: goto L_0x0208;
                case 3: goto L_0x0200;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01e8;
                case 7: goto L_0x01dc;
                case 8: goto L_0x01d4;
                case 9: goto L_0x01ae;
                case 10: goto L_0x0188;
                case 11: goto L_0x012a;
                case 12: goto L_0x00ee;
                case 13: goto L_0x00df;
                case 14: goto L_0x00c9;
                case 15: goto L_0x00b1;
                case 16: goto L_0x009d;
                case 17: goto L_0x0095;
                case 18: goto L_0x008d;
                case 19: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r12 = r12.b
            com.my.tracker.obfuscated.v0 r12 = (com.my.tracker.obfuscated.v0) r12
            r12.a()
            return
        L_0x0012:
            java.lang.String r0 = "x"
            java.lang.String r1 = "OKRTCLmsAdapter"
            java.lang.String r2 = "Screen size did change"
            java.lang.Object r12 = r12.b
            haf r12 = (defpackage.haf) r12
            java.lang.Object r12 = r12.b
            qpg r12 = (defpackage.qpg) r12
            java.lang.Object r3 = r12.a
            y48 r3 = (defpackage.y48) r3
            java.lang.Object r4 = r12.o
            v48 r4 = (defpackage.v48) r4
            if (r3 != 0) goto L_0x002b
            goto L_0x008c
        L_0x002b:
            r4.e()     // Catch:{ all -> 0x003f }
            org.webrtc.Size r3 = r4.B
            android.util.DisplayMetrics r5 = r4.A
            int r6 = r5.widthPixels     // Catch:{ all -> 0x003f }
            int r7 = r3.width     // Catch:{ all -> 0x003f }
            if (r6 != r7) goto L_0x0041
            int r6 = r5.heightPixels     // Catch:{ all -> 0x003f }
            int r7 = r3.height     // Catch:{ all -> 0x003f }
            if (r6 == r7) goto L_0x0085
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            goto L_0x007e
        L_0x0041:
            voc r6 = r4.n     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r7.<init>(r2)     // Catch:{ all -> 0x003f }
            int r2 = r3.width     // Catch:{ all -> 0x003f }
            r7.append(r2)     // Catch:{ all -> 0x003f }
            r7.append(r0)     // Catch:{ all -> 0x003f }
            int r2 = r3.height     // Catch:{ all -> 0x003f }
            r7.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "->"
            r7.append(r2)     // Catch:{ all -> 0x003f }
            int r2 = r5.widthPixels     // Catch:{ all -> 0x003f }
            r7.append(r2)     // Catch:{ all -> 0x003f }
            r7.append(r0)     // Catch:{ all -> 0x003f }
            int r0 = r5.heightPixels     // Catch:{ all -> 0x003f }
            r7.append(r0)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x003f }
            r6.log(r1, r0)     // Catch:{ all -> 0x003f }
            int r0 = r5.widthPixels     // Catch:{ all -> 0x003f }
            r3.width = r0     // Catch:{ all -> 0x003f }
            int r2 = r5.heightPixels     // Catch:{ all -> 0x003f }
            r3.height = r2     // Catch:{ all -> 0x003f }
            java.lang.Object r3 = r12.a     // Catch:{ all -> 0x003f }
            y48 r3 = (defpackage.y48) r3     // Catch:{ all -> 0x003f }
            r3.a(r0, r2)     // Catch:{ all -> 0x003f }
            goto L_0x0085
        L_0x007e:
            voc r2 = r4.n
            java.lang.String r3 = "Error on screen share size update"
            r2.reportException(r1, r3, r0)
        L_0x0085:
            java.lang.Object r12 = r12.a
            y48 r12 = (defpackage.y48) r12
            r4.b(r12)
        L_0x008c:
            return
        L_0x008d:
            java.lang.Object r12 = r12.b
            com.my.tracker.obfuscated.m2 r12 = (com.my.tracker.obfuscated.m2) r12
            r12.a()
            return
        L_0x0095:
            java.lang.Object r12 = r12.b
            com.my.tracker.obfuscated.e r12 = (com.my.tracker.obfuscated.e) r12
            r12.b()
            return
        L_0x009d:
            java.lang.Object r12 = r12.b
            bug r12 = (defpackage.bug) r12
            fa4 r0 = r12.g
            if (r0 != 0) goto L_0x00a6
            goto L_0x00ad
        L_0x00a6:
            r0.a()
            r12.g = r3
            r12.D = r1
        L_0x00ad:
            r12.b()
            return
        L_0x00b1:
            java.lang.Object r12 = r12.b
            lsg r12 = (defpackage.lsg) r12
            r12.getClass()
            o9d r0 = r12.d     // Catch:{ all -> 0x00be }
            r0.getClass()     // Catch:{ all -> 0x00be }
            goto L_0x00c8
        L_0x00be:
            r0 = move-exception
            java.lang.String r1 = "rtc.command.handle.command.onsent"
            voc r12 = r12.a
            java.lang.String r2 = "ProtocolInfo"
            r12.reportException(r2, r1, r0)
        L_0x00c8:
            return
        L_0x00c9:
            java.lang.Object r12 = r12.b
            zog r12 = (defpackage.zog) r12
            r12.getClass()
            jrf r0 = new jrf
            r1 = 16
            r0.<init>((int) r1, (java.lang.Object) r12)
            q6f r12 = r12.d
            nbd r12 = (defpackage.nbd) r12
            r12.e0(r0)
            return
        L_0x00df:
            java.lang.Object r12 = r12.b
            nog r12 = (defpackage.nog) r12
            android.content.Intent r0 = r12.a
            r0.getAction()
            qdf r12 = r12.b
            r12.d(r3)
            return
        L_0x00ee:
            java.lang.Object r12 = r12.b
            meg r12 = (defpackage.meg) r12
            java.lang.String r0 = r12.h
            boolean r2 = r12.k
            if (r2 == 0) goto L_0x010b
            long r2 = r12.l
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0101
            goto L_0x010b
        L_0x0101:
            java.lang.String r4 = "recoverTs"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = defpackage.meg.e(r0, r4, r2)
        L_0x010b:
            xe8 r2 = r12.q
            java.lang.String r3 = "transport.reconnect"
            r2.v(r3)
            java.lang.Object r3 = r12.b
            monitor-enter(r3)
            r12.h = r0     // Catch:{ all -> 0x0127 }
            monitor-exit(r3)     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = r12.e
            monitor-enter(r0)
            r12.f = r1     // Catch:{ all -> 0x0124 }
            java.lang.String r1 = "reconnect"
            r12.a(r1)     // Catch:{ all -> 0x0124 }
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            return
        L_0x0124:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0124 }
            throw r12
        L_0x0127:
            r12 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0127 }
            throw r12
        L_0x012a:
            java.lang.Object r12 = r12.b
            d9d r12 = (defpackage.d9d) r12
            java.lang.Object r12 = r12.b
            ce r12 = (defpackage.ce) r12
            java.lang.Object r0 = r12.c
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0143
            goto L_0x0187
        L_0x0143:
            boolean r0 = r12.a
            if (r0 != 0) goto L_0x017e
            java.lang.String r0 = "OwnTalkingReporter"
            java.lang.String r1 = "on voice start detected and reported"
            java.lang.Object r3 = r12.b
            voc r3 = (defpackage.voc) r3
            r3.log(r0, r1)
            java.lang.Object r0 = r12.w
            d9d r0 = (defpackage.d9d) r0
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r0.b
            ef1 r0 = (defpackage.ef1) r0
            ye1 r1 = r0.a
            boolean r3 = r1.d()
            r1.n = r2
            boolean r1 = r1.d()
            if (r3 == r1) goto L_0x017c
            ye1 r1 = r0.a
            ue1 r3 = r1.a
            if (r3 != 0) goto L_0x0171
            goto L_0x017c
        L_0x0171:
            zwd r3 = r0.c(r3)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            r0.e(r3, r1)
        L_0x017c:
            r12.a = r2
        L_0x017e:
            java.lang.Object r12 = r12.o
            dac r12 = (defpackage.dac) r12
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r12.d(r0)
        L_0x0187:
            return
        L_0x0188:
            java.lang.Object r12 = r12.b
            npg r12 = (defpackage.npg) r12
            r12.getClass()
            int r1 = defpackage.t0g.a
            java.lang.Object r12 = r12.c
            mc5 r12 = (defpackage.mc5) r12
            sc5 r12 = r12.a
            vb4 r12 = r12.z0
            kwd r1 = r12.o
            java.lang.Object r1 = r1.e
            mz8 r1 = (defpackage.mz8) r1
            sd r1 = r12.M(r1)
            nb4 r2 = new nb4
            r3 = 10
            r2.<init>((int) r3)
            r12.Q(r1, r0, r2)
            return
        L_0x01ae:
            java.lang.Object r12 = r12.b
            m8g r12 = (defpackage.m8g) r12
            r12.getClass()
            int r1 = defpackage.v0g.a
            java.lang.Object r12 = r12.b
            nc5 r12 = (defpackage.nc5) r12
            tc5 r12 = r12.a
            wb4 r12 = r12.A0
            q40 r1 = r12.o
            java.lang.Object r1 = r1.v
            nz8 r1 = (defpackage.nz8) r1
            td r1 = r12.g(r1)
            db4 r2 = new db4
            r3 = 21
            r2.<init>(r3)
            r12.K(r1, r0, r2)
            return
        L_0x01d4:
            java.lang.Object r12 = r12.b
            org.webrtc.VideoFileRenderer r12 = (org.webrtc.VideoFileRenderer) r12
            r12.lambda$release$3()
            return
        L_0x01dc:
            java.lang.Object r12 = r12.b
            nr4 r12 = (defpackage.nr4) r12
            java.lang.Object r12 = r12.l
            do1 r12 = (defpackage.do1) r12
            r12.b(r3)
            return
        L_0x01e8:
            java.lang.Object r12 = r12.b
            r3g r12 = (defpackage.r3g) r12
            r12.o()
            return
        L_0x01f0:
            java.lang.Object r12 = r12.b
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl r12 = (ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl) r12
            ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl.saveUrlSharing$lambda$1(r12)
            return
        L_0x01f8:
            java.lang.Object r12 = r12.b
            java.lang.String r12 = (java.lang.String) r12
            ru.ok.android.externcalls.analytics.internal.upload.UploadStarter.startUpload$lambda$0(r12)
            return
        L_0x0200:
            java.lang.Object r12 = r12.b
            android.os.HandlerThread r12 = (android.os.HandlerThread) r12
            r12.quitSafely()
            return
        L_0x0208:
            java.lang.Object r12 = r12.b
            wbb r12 = (defpackage.wbb) r12
            epf r0 = defpackage.fpf.b
            boolean r1 = r0 instanceof defpackage.cpf
            if (r1 == 0) goto L_0x021a
            cpf r0 = (defpackage.cpf) r0
            java.util.LinkedList r0 = r0.a
            r0.add(r12)
            goto L_0x0229
        L_0x021a:
            boolean r1 = r0 instanceof defpackage.dpf
            if (r1 == 0) goto L_0x0226
            dpf r0 = (defpackage.dpf) r0
            ila r0 = r0.a
            r0.d(r12)
            goto L_0x0229
        L_0x0226:
            java.util.Objects.toString(r0)
        L_0x0229:
            return
        L_0x022a:
            kxd r0 = defpackage.kof.e
            if (r0 == 0) goto L_0x022f
            goto L_0x0230
        L_0x022f:
            r0 = r3
        L_0x0230:
            r0.b()
            g8f r0 = r0.h
            if (r0 == 0) goto L_0x043a
            kof r1 = defpackage.kof.a
            java.util.Map r1 = defpackage.kof.c()
            frg r4 = defpackage.n54.b
            java.lang.Object r1 = r1.get(r4)
            boolean r5 = r1 instanceof defpackage.dcb
            if (r5 == 0) goto L_0x0249
            dcb r1 = (defpackage.dcb) r1
        L_0x0249:
            java.lang.Object r12 = r12.b
            java.io.File r12 = (java.io.File) r12
            if (r12 != 0) goto L_0x0254
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x027a
        L_0x0254:
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0273 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0273 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0273 }
            r6.<init>(r12)     // Catch:{ IOException -> 0x0273 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0273 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0273 }
            java.util.List r5 = defpackage.nfd.g(r1)     // Catch:{ all -> 0x026c }
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ IOException -> 0x0273 }
            r1 = r5
            goto L_0x027a
        L_0x026c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x026e }
        L_0x026e:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r5)     // Catch:{ IOException -> 0x0273 }
            throw r6     // Catch:{ IOException -> 0x0273 }
        L_0x0273:
            java.util.Objects.toString(r12)
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x027a:
            r12.delete()
            boolean r12 = defpackage.pf6.l(r4)
            if (r12 == 0) goto L_0x0285
            goto L_0x043a
        L_0x0285:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L_0x028d
            goto L_0x043a
        L_0x028d:
            r1.size()
            kof r12 = defpackage.kof.a
            java.lang.String r12 = defpackage.kof.a()
            if (r12 != 0) goto L_0x029a
            goto L_0x043a
        L_0x029a:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "versionName"
            java.lang.String r6 = r0.a
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "versionCode"
            long r6 = r0.b
            r4.put((java.lang.String) r5, (long) r6)
            java.lang.String r5 = "buildUuid"
            java.lang.String r6 = r0.e
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "sessionUuid"
            java.lang.String r6 = r0.f
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "deviceId"
            java.lang.String r6 = r0.h
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "device"
            java.lang.String r6 = r0.g
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "vendor"
            java.lang.String r6 = r0.i
            r4.put((java.lang.String) r5, (java.lang.Object) r6)
            java.lang.String r5 = "osVersion"
            java.lang.String r0 = r0.j
            r4.put((java.lang.String) r5, (java.lang.Object) r0)
            long r5 = defpackage.jsb.a
            long r7 = android.os.SystemClock.elapsedRealtimeNanos()
            long r7 = r7 + r5
            long r5 = defpackage.jsb.b
            long r7 = r7 - r5
            java.lang.String r0 = "clientTimeUnixNano"
            r4.put((java.lang.String) r0, (long) r7)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x02ef:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x03b4
            java.lang.Object r5 = r1.next()
            wbb r5 = (defpackage.wbb) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            long r7 = r5.a
            java.lang.String r9 = "timeUnixNano"
            r6.put((java.lang.String) r9, (long) r7)
            java.lang.String r7 = "name"
            java.lang.String r8 = r5.b
            r6.put((java.lang.String) r7, (java.lang.Object) r8)
            java.lang.String r7 = "value"
            long r8 = r5.c
            r6.put((java.lang.String) r7, (long) r8)
            java.lang.String r7 = "unit"
            java.lang.String r8 = r5.d
            r6.put((java.lang.String) r7, (java.lang.Object) r8)
            java.util.Map r5 = r5.e
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x03af
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0332:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x03a8
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            boolean r10 = r8 instanceof java.lang.String
            if (r10 == 0) goto L_0x0350
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x0332
        L_0x0350:
            boolean r10 = r8 instanceof java.lang.Boolean
            if (r10 == 0) goto L_0x035e
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r7.put((java.lang.String) r9, (boolean) r8)
            goto L_0x0332
        L_0x035e:
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L_0x036c
            java.lang.Number r8 = (java.lang.Number) r8
            long r10 = r8.longValue()
            r7.put((java.lang.String) r9, (long) r10)
            goto L_0x0332
        L_0x036c:
            boolean r10 = r8 instanceof java.lang.Double
            if (r10 == 0) goto L_0x037a
            java.lang.Number r8 = (java.lang.Number) r8
            double r10 = r8.doubleValue()
            r7.put((java.lang.String) r9, (double) r10)
            goto L_0x0332
        L_0x037a:
            boolean r10 = r8 instanceof java.lang.Byte
            if (r10 == 0) goto L_0x0382
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x0332
        L_0x0382:
            boolean r10 = r8 instanceof java.lang.Short
            if (r10 == 0) goto L_0x038a
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x0332
        L_0x038a:
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x0398
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.put((java.lang.String) r9, (int) r8)
            goto L_0x0332
        L_0x0398:
            boolean r10 = r8 instanceof java.lang.Float
            if (r10 == 0) goto L_0x03a0
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x0332
        L_0x03a0:
            java.lang.String r8 = r8.toString()
            r7.put((java.lang.String) r9, (java.lang.Object) r8)
            goto L_0x0332
        L_0x03a8:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.String r5 = "attributes"
            r6.put((java.lang.String) r5, (java.lang.Object) r7)
        L_0x03af:
            r0.put((java.lang.Object) r6)
            goto L_0x02ef
        L_0x03b4:
            java.lang.String r1 = "samples"
            r4.put((java.lang.String) r1, (java.lang.Object) r0)
            kof r0 = defpackage.kof.a
            java.util.Map r0 = defpackage.kof.c()
            frg r1 = defpackage.iq.c
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof defpackage.l04
            if (r1 == 0) goto L_0x03cc
            l04 r0 = (defpackage.l04) r0
            goto L_0x03cd
        L_0x03cc:
            r0 = r3
        L_0x03cd:
            if (r0 != 0) goto L_0x03d7
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            kotlin.collections.MapsKt.toMap(r0)
        L_0x03d7:
            java.lang.String r0 = defpackage.l04.b()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "api/perf/upload"
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r1)
            java.lang.String r1 = "crashToken"
            android.net.Uri$Builder r12 = r0.appendQueryParameter(r1, r12)
            java.lang.String r12 = r12.toString()
            d19 r0 = new d19
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "application/json; charset=utf-8"
            mm5 r1 = defpackage.pf6.i(r2, r1)
            r0.<init>((java.lang.String) r12, (defpackage.h57) r1)
            kotlin.Lazy r12 = defpackage.kof.h     // Catch:{ Exception -> 0x043a }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x043a }
            n57 r12 = (defpackage.n57) r12     // Catch:{ Exception -> 0x043a }
            i57 r12 = r12.b(r0)     // Catch:{ Exception -> 0x043a }
            int r0 = r12.b     // Catch:{ all -> 0x0421 }
            java.io.Closeable r1 = r12.o     // Catch:{ all -> 0x0421 }
            mm5 r1 = (defpackage.mm5) r1     // Catch:{ all -> 0x0421 }
            if (r1 == 0) goto L_0x0423
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x0421 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0421 }
            if (r1 == 0) goto L_0x0423
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r1)     // Catch:{ all -> 0x0421 }
            goto L_0x0424
        L_0x0421:
            r0 = move-exception
            goto L_0x0434
        L_0x0423:
            r1 = r3
        L_0x0424:
            java.lang.String r2 = "PERFORMANCE_METRICS"
            defpackage.s9a.i(r1, r2, r3)     // Catch:{ all -> 0x0421 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L_0x042e
            goto L_0x0430
        L_0x042e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0421 }
        L_0x0430:
            kotlin.io.CloseableKt.closeFinally(r12, r3)     // Catch:{ Exception -> 0x043a }
            goto L_0x043a
        L_0x0434:
            throw r0     // Catch:{ all -> 0x0435 }
        L_0x0435:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r12, r0)     // Catch:{ Exception -> 0x043a }
            throw r1     // Catch:{ Exception -> 0x043a }
        L_0x043a:
            return
        L_0x043b:
            java.lang.Object r12 = r12.b
            rof r12 = (defpackage.rof) r12
            xof r12 = r12.a
            g93 r12 = r12.h
            kotlin.Lazy r12 = r12.a
            java.lang.Object r12 = r12.getValue()
            gx4 r12 = (defpackage.gx4) r12
            r12.getClass()
            ix4 r0 = new ix4
            java.lang.String r1 = "max_non_fatals_per_session_reached"
            java.lang.String r3 = "non_fatal"
            r0.<init>(r3, r1, r2)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r12.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qof.run():void");
    }

    public /* synthetic */ qof(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
