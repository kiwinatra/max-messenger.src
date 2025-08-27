package defpackage;

import java.util.ArrayList;

/* renamed from: mme  reason: default package */
public final class mme implements xne {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ j09 b;
    public final /* synthetic */ nme c;

    public mme(j09 j09, nme nme) {
        this.b = j09;
        this.c = nme;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: k09} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.webrtc.StatsReport[] r30, org.webrtc.StatsReport[] r31, defpackage.qr0[] r32, java.util.Map r33, defpackage.gm1 r34) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            j09 r3 = r0.b
            java.lang.Object r3 = r3.i
            py0 r3 = (defpackage.py0) r3
            xnf r4 = r34.y()
            hz0 r3 = r3.a
            boolean r5 = r3.W0
            r6 = 1
            r5 = r5 ^ r6
            pt6 r7 = r3.h1
            r7.getClass()
            r9 = 0
        L_0x001c:
            int r10 = r2.length
            java.lang.String r12 = "StatsReportHandler"
            if (r9 >= r10) goto L_0x01f5
            r10 = r32[r9]
            java.lang.Object r13 = r10.b
            ye1 r13 = (defpackage.ye1) r13
            boolean r14 = r10.a
            if (r13 != 0) goto L_0x004e
            if (r14 != 0) goto L_0x004e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "incorrect mapping skipped "
            r10.<init>(r11)
            r11 = r2[r9]
            java.lang.String r11 = r11.id
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.Object r11 = r7.h
            voc r11 = (defpackage.voc) r11
            r11.log(r12, r10)
        L_0x0046:
            r16 = r4
            r17 = r5
            r18 = r7
            goto L_0x01e4
        L_0x004e:
            r12 = r2[r9]
            org.webrtc.StatsReport$Value[] r12 = r12.values
            int r13 = r12.length
            r8 = 0
            r11 = 0
            r17 = -9223372036854775808
            r19 = -9223372036854775808
            r21 = -9223372036854775808
            r23 = -9223372036854775808
            r25 = -9223372036854775808
            r27 = -9223372036854775808
        L_0x0061:
            if (r8 >= r13) goto L_0x0102
            r6 = r12[r8]
            java.lang.String r15 = r6.name
            java.lang.String r2 = "bytesSent"
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r21 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x0077:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "bytesReceived"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r19 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x0089:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "audioOutputLevel"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r17 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x009a:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "mediaType"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00a8
            java.lang.String r2 = r6.value
            r11 = r2
            goto L_0x00fb
        L_0x00a8:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "ssrc"
            boolean r2 = r15.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00b3
            goto L_0x00fb
        L_0x00b3:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "googCodecName"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00be
            goto L_0x00fb
        L_0x00be:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "codecImplementationName"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00c9
            goto L_0x00fb
        L_0x00c9:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "packetsLost"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00da
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r23 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00da:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "googRtt"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00eb
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r27 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00eb:
            java.lang.String r2 = r6.name
            java.lang.String r15 = "packetsSent"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r6.value     // Catch:{ Exception -> 0x00fb }
            long r25 = java.lang.Long.parseLong(r2)     // Catch:{ Exception -> 0x00fb }
        L_0x00fb:
            int r8 = r8 + 1
            r2 = r31
            r6 = 1
            goto L_0x0061
        L_0x0102:
            if (r14 == 0) goto L_0x0109
            java.lang.Object r2 = r7.e
            k09 r2 = (defpackage.k09) r2
            goto L_0x0122
        L_0x0109:
            java.lang.Object r2 = r7.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.lang.Object r6 = r10.b
            ye1 r6 = (defpackage.ye1) r6
            java.lang.Object r8 = r2.get(r6)
            k09 r8 = (defpackage.k09) r8
            if (r8 != 0) goto L_0x0121
            k09 r8 = new k09
            r8.<init>()
            r2.put(r6, r8)
        L_0x0121:
            r2 = r8
        L_0x0122:
            java.lang.Object r6 = r7.f
            te1 r6 = (defpackage.te1) r6
            ig0 r6 = r6.A
            gg0 r6 = r6.b
            java.lang.String r8 = "audio"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x0191
            r14 = r17
            r12 = -9223372036854775808
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x014c
            l60 r8 = r2.a
            float r10 = r8.c
            float r11 = (float) r14
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x014c
            r8.a(r14)
            long r10 = android.os.SystemClock.elapsedRealtime()
            r2.b = r10
        L_0x014c:
            r12 = r19
            r10 = -9223372036854775808
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0160
            r6.getClass()
            no5 r8 = r2.d
            java.lang.Object r8 = r8.b
            u05 r8 = (defpackage.u05) r8
            r8.a(r12)
        L_0x0160:
            r14 = r21
            int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0172
            r6.getClass()
            no5 r8 = r2.c
            java.lang.Object r8 = r8.b
            u05 r8 = (defpackage.u05) r8
            r8.a(r14)
        L_0x0172:
            r12 = r23
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x017d
            r6.getClass()
            r2.f = r12
        L_0x017d:
            r12 = r25
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0188
            r6.getClass()
            r2.h = r12
        L_0x0188:
            r2.getClass()
            r10 = r27
            r2.j = r10
            goto L_0x0046
        L_0x0191:
            r16 = r4
            r17 = r5
            r18 = r7
            r12 = r19
            r14 = r21
            r7 = r23
            r0 = r25
            r4 = r27
            java.lang.String r10 = "video"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x01e4
            r10 = -9223372036854775808
            int r19 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r19 == 0) goto L_0x01bd
            r6.getClass()
            no5 r10 = r2.d
            java.lang.Object r10 = r10.c
            u05 r10 = (defpackage.u05) r10
            r10.a(r12)
            r10 = -9223372036854775808
        L_0x01bd:
            int r12 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x01cd
            r6.getClass()
            no5 r12 = r2.c
            java.lang.Object r12 = r12.c
            u05 r12 = (defpackage.u05) r12
            r12.a(r14)
        L_0x01cd:
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x01d6
            r6.getClass()
            r2.e = r7
        L_0x01d6:
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x01df
            r6.getClass()
            r2.g = r0
        L_0x01df:
            r2.getClass()
            r2.i = r4
        L_0x01e4:
            int r9 = r9 + 1
            r6 = 1
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r16
            r5 = r17
            r7 = r18
            goto L_0x001c
        L_0x01f5:
            r16 = r4
            r17 = r5
            pt6 r0 = r3.h1
            ef1 r1 = r3.n1
            gm1 r2 = r3.r1
            xnf r4 = defpackage.xnf.o
            boolean r2 = r2.H(r4)
            java.util.List r4 = r3.H1
            java.lang.Object r5 = r0.h
            voc r5 = (defpackage.voc) r5
            java.lang.Object r6 = r0.f
            te1 r6 = (defpackage.te1) r6
            if (r2 == 0) goto L_0x02d1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r13 = r0.e
            k09 r13 = (defpackage.k09) r13
            r13.getClass()
            long r14 = android.os.SystemClock.elapsedRealtime()
            no5 r7 = r13.d
            long r7 = r7.a
            no5 r11 = r13.c
            long r9 = r11.a
            long r7 = java.lang.Math.max(r7, r9)
            long r14 = r14 - r7
            se1 r6 = r6.b
            long r6 = r6.a
            r8 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x023a
            r7 = r6
            goto L_0x023c
        L_0x023a:
            r7 = 3000(0xbb8, double:1.482E-320)
        L_0x023c:
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0242
            r6 = 1
            goto L_0x0243
        L_0x0242:
            r6 = 0
        L_0x0243:
            boolean r7 = r0.c
            if (r7 == r6) goto L_0x0271
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "audio-mix track isConnected "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = " timeout ms "
            r7.append(r8)
            long r8 = android.os.SystemClock.elapsedRealtime()
            no5 r10 = r13.d
            long r10 = r10.a
            no5 r13 = r13.c
            long r13 = r13.a
            long r10 = java.lang.Math.max(r10, r13)
            long r8 = r8 - r10
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.log(r12, r7)
        L_0x0271:
            r0.c = r6
            if (r6 == 0) goto L_0x02b4
            java.util.Collection r0 = r1.i()
            java.util.Iterator r0 = r0.iterator()
        L_0x027d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0295
            java.lang.Object r6 = r0.next()
            ye1 r6 = (defpackage.ye1) r6
            boolean r7 = r6.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2.put(r6, r7)
            goto L_0x027d
        L_0x0295:
            if (r4 != 0) goto L_0x0298
            goto L_0x02ce
        L_0x0298:
            java.util.Iterator r0 = r4.iterator()
        L_0x029c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02ce
            java.lang.Object r4 = r0.next()
            ue1 r4 = (defpackage.ue1) r4
            ye1 r4 = r1.j(r4)
            if (r4 == 0) goto L_0x029c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.put(r4, r6)
            goto L_0x029c
        L_0x02b4:
            java.util.Collection r0 = r1.i()
            java.util.Iterator r0 = r0.iterator()
        L_0x02bc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02ce
            java.lang.Object r4 = r0.next()
            ye1 r4 = (defpackage.ye1) r4
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r2.put(r4, r6)
            goto L_0x02bc
        L_0x02ce:
            r15 = r3
            goto L_0x0398
        L_0x02d1:
            java.lang.Object r2 = r0.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x02e2:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0396
            java.lang.Object r7 = r2.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            ye1 r8 = (defpackage.ye1) r8
            java.lang.Object r7 = r7.getValue()
            k09 r7 = (defpackage.k09) r7
            boolean r9 = r1.k(r8)
            if (r9 != 0) goto L_0x030e
            java.lang.Object r9 = r0.i
            ye1 r9 = (defpackage.ye1) r9
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x030e
            r2.remove()
            goto L_0x02e2
        L_0x030e:
            r7.getClass()
            long r9 = android.os.SystemClock.elapsedRealtime()
            no5 r11 = r7.d
            long r13 = r11.a
            no5 r11 = r7.c
            r21 = r2
            r15 = r3
            long r2 = r11.a
            long r2 = java.lang.Math.max(r13, r2)
            long r9 = r9 - r2
            se1 r2 = r6.b
            long r2 = r2.a
            r13 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r2 = 3000(0xbb8, double:1.482E-320)
        L_0x0332:
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0338
            r2 = 1
            goto L_0x0339
        L_0x0338:
            r2 = 0
        L_0x0339:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4.put(r8, r2)
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x034f
            if (r17 == 0) goto L_0x034f
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.b = r2
            r2 = 1
            r0.b = r2
        L_0x034f:
            if (r17 == 0) goto L_0x0391
            boolean r2 = r0.a
            if (r2 != 0) goto L_0x0391
            se1 r2 = r6.b
            r2.getClass()
            boolean r2 = r8.b()
            if (r2 == 0) goto L_0x0391
            mz9 r2 = r8.c
            boolean r2 = r2.e
            if (r2 == 0) goto L_0x0391
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r9 = r7.b
            long r2 = r2 - r9
            se1 r7 = r6.b
            r7.getClass()
            r9 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 < 0) goto L_0x0391
            xnf r2 = defpackage.xnf.c
            r3 = r16
            if (r3 != r2) goto L_0x0381
            java.lang.String r2 = "DIRECT_VOLUME_TIMEOUT"
            goto L_0x0383
        L_0x0381:
            java.lang.String r2 = "SERVER_VOLUME_TIMEOUT"
        L_0x0383:
            java.lang.String r7 = r8.k
            java.lang.Object r8 = r0.g
            yoc r8 = (defpackage.yoc) r8
            defpackage.ur9.d(r8, r2, r7)
            r2 = 1
            r0.a = r2
            r16 = r3
        L_0x0391:
            r3 = r15
            r2 = r21
            goto L_0x02e2
        L_0x0396:
            r15 = r3
            r2 = r4
        L_0x0398:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x03a0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03f2
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            ye1 r4 = (defpackage.ye1) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r6 = r4.g
            if (r3 == r6) goto L_0x03a0
            if (r3 == 0) goto L_0x03d4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "CONNECTED: "
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.log(r12, r3)
            goto L_0x03a0
        L_0x03d4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "DISCONNECTED: "
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r6 = " isCallAccepted"
            r3.append(r6)
            boolean r4 = r4.b()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.log(r12, r3)
            goto L_0x03a0
        L_0x03f2:
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0402:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0428
            java.lang.Object r4 = r3.next()
            ye1 r4 = (defpackage.ye1) r4
            java.lang.Object r5 = r2.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            boolean r6 = r1.k(r4)
            if (r6 == 0) goto L_0x0402
            boolean r6 = r4.g
            if (r6 == r5) goto L_0x0402
            r4.g = r5
            r0.add(r4)
            goto L_0x0402
        L_0x0428:
            zwd r2 = r1.k
            r1.e(r2, r0)
            r0 = r15
            pt6 r1 = r0.h1
            ef1 r2 = r0.n1
            r1.getClass()
            if (r33 == 0) goto L_0x047f
            boolean r3 = r33.isEmpty()
            if (r3 == 0) goto L_0x043e
            goto L_0x047f
        L_0x043e:
            java.util.Set r3 = r33.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0446:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x047f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            jhd r5 = (defpackage.jhd) r5
            java.lang.Object r4 = r4.getKey()
            ue1 r4 = (defpackage.ue1) r4
            if (r5 == 0) goto L_0x0446
            if (r4 != 0) goto L_0x0463
            goto L_0x0446
        L_0x0463:
            ye1 r4 = r2.j(r4)
            if (r4 != 0) goto L_0x046a
            goto L_0x0446
        L_0x046a:
            java.lang.Object r5 = r1.d
            java.util.Hashtable r5 = (java.util.Hashtable) r5
            java.lang.Object r6 = r5.get(r4)
            k09 r6 = (defpackage.k09) r6
            if (r6 != 0) goto L_0x0446
            k09 r6 = new k09
            r6.<init>()
            r5.put(r4, r6)
            goto L_0x0446
        L_0x047f:
            pt6 r1 = r0.h1
            gm1 r2 = r0.r1
            xnf r3 = defpackage.xnf.o
            boolean r2 = r2.H(r3)
            r3 = 0
            if (r2 == 0) goto L_0x04af
            java.lang.Object r1 = r1.e
            k09 r1 = (defpackage.k09) r1
            r1.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            no5 r2 = r1.d
            long r7 = r2.a
            no5 r1 = r1.c
            long r1 = r1.a
            long r1 = java.lang.Math.max(r7, r1)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x04a9
            goto L_0x050f
        L_0x04a9:
            long r5 = r5 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L_0x0515
        L_0x04af:
            java.lang.Object r2 = r1.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x04c0:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0506
            java.lang.Object r10 = r5.next()
            ye1 r10 = (defpackage.ye1) r10
            java.lang.Object r11 = r1.i
            ye1 r11 = (defpackage.ye1) r11
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x04d7
            goto L_0x04c0
        L_0x04d7:
            java.lang.Object r10 = r2.get(r10)
            k09 r10 = (defpackage.k09) r10
            r10.getClass()
            long r11 = android.os.SystemClock.elapsedRealtime()
            no5 r13 = r10.d
            long r13 = r13.a
            no5 r10 = r10.c
            long r6 = r10.a
            long r6 = java.lang.Math.max(r13, r6)
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x04f6
            r6 = 0
            goto L_0x04fb
        L_0x04f6:
            long r11 = r11 - r6
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
        L_0x04fb:
            if (r6 == 0) goto L_0x04c0
            long r6 = r6.longValue()
            long r8 = java.lang.Math.min(r6, r8)
            goto L_0x04c0
        L_0x0506:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0511
        L_0x050f:
            r1 = 0
            goto L_0x0515
        L_0x0511:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
        L_0x0515:
            if (r1 == 0) goto L_0x0522
            jc1 r2 = r0.U1
            wne r2 = r2.t
            long r5 = r1.longValue()
            r2.onMediaDataReceived(r5)
        L_0x0522:
            boolean r1 = r0.V0
            if (r1 == 0) goto L_0x0627
            pt6 r1 = r0.h1
            ef1 r2 = r0.n1
            ye1 r2 = r2.a
            if (r2 == 0) goto L_0x053a
            java.lang.Object r1 = r1.d
            java.util.Hashtable r1 = (java.util.Hashtable) r1
            java.lang.Object r1 = r1.get(r2)
            r11 = r1
            k09 r11 = (defpackage.k09) r11
            goto L_0x053e
        L_0x053a:
            r1.getClass()
            r11 = 0
        L_0x053e:
            if (r11 == 0) goto L_0x0627
            voc r1 = r0.T0
            r2 = r30
            xoc r1 = defpackage.xoc.d(r1, r2)
            uw1 r1 = r1.c()
            if (r1 == 0) goto L_0x0557
            java.lang.String r1 = r1.i
            java.lang.String r5 = "tcp"
            boolean r8 = r1.equals(r5)
            goto L_0x0558
        L_0x0557:
            r8 = 0
        L_0x0558:
            fg0 r0 = r0.U0
            r0.getClass()
            long r5 = r11.j
            long r9 = r11.i
            long r5 = java.lang.Math.max(r5, r9)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x056f
            c15 r1 = r0.b
            double r5 = (double) r5
            r1.a(r5)
        L_0x056f:
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0588
            lc2 r1 = r0.g
            long r9 = r11.f
            long r12 = r11.h
            double r9 = r1.a(r9, r12)
            lc2 r1 = r0.h
            long r12 = r11.e
            long r14 = r11.g
            double r12 = r1.a(r12, r14)
            goto L_0x05c9
        L_0x0588:
            ap0 r1 = r0.e
            long r9 = r11.f
            long r12 = r11.h
            long r14 = r1.b
            long r14 = r9 - r14
            long r5 = r1.c
            long r5 = r12 - r5
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x059f
            double r3 = (double) r14
            long r5 = r5 + r14
            double r5 = (double) r5
            double r3 = r3 / r5
            goto L_0x05a1
        L_0x059f:
            r3 = 0
        L_0x05a1:
            r1.b = r9
            r1.c = r12
            ap0 r1 = r0.f
            long r5 = r11.e
            long r9 = r11.g
            long r12 = r1.b
            long r12 = r5 - r12
            long r14 = r1.c
            long r14 = r9 - r14
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r16 = r3
            if (r7 == 0) goto L_0x05c1
            double r3 = (double) r12
            long r14 = r14 + r12
            double r12 = (double) r14
            double r3 = r3 / r12
            r12 = r3
            goto L_0x05c3
        L_0x05c1:
            r12 = 0
        L_0x05c3:
            r1.b = r5
            r1.c = r9
            r9 = r16
        L_0x05c9:
            double r3 = java.lang.Math.max(r9, r12)
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x05d8
            c15 r1 = r0.c
            r1.a(r3)
        L_0x05d8:
            r0.a()
            boolean r1 = r0.l
            if (r1 == 0) goto L_0x0624
            if (r8 == 0) goto L_0x05f7
            no5 r1 = r11.c
            java.lang.Object r3 = r1.b
            u05 r3 = (defpackage.u05) r3
            java.lang.Object r3 = r3.b
            d15 r3 = (defpackage.d15) r3
            double r3 = r3.b
            java.lang.Object r1 = r1.c
            u05 r1 = (defpackage.u05) r1
            java.lang.Object r1 = r1.b
            d15 r1 = (defpackage.d15) r1
            double r3 = r1.b
        L_0x05f7:
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.k
            java.util.Iterator r1 = r1.iterator()
        L_0x05fd:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0624
            java.lang.Object r3 = r1.next()
            eg0 r3 = (defpackage.eg0) r3
            c15 r4 = r0.b
            double r4 = r4.b
            c15 r4 = r0.c
            double r4 = r4.b
            tug r3 = (defpackage.tug) r3
            hz0 r3 = r3.b
            te1 r3 = r3.X
            ig0 r3 = r3.A
            hg0 r4 = r3.a
            r4.getClass()
            gg0 r3 = r3.b
            r3.getClass()
            goto L_0x05fd
        L_0x0624:
            r0 = r29
            goto L_0x062a
        L_0x0627:
            r2 = r30
            goto L_0x0624
        L_0x062a:
            j09 r1 = r0.b
            java.lang.Object r1 = r1.f
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0634:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0656
            java.lang.Object r3 = r1.next()
            hug r3 = (defpackage.hug) r3
            nme r4 = r0.c
            long r4 = r4.b
            r3.getClass()
            r6 = 5
            long r4 = r4 % r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0634
            java.util.ArrayList r4 = r0.a
            r4.add(r3)
            goto L_0x0634
        L_0x0656:
            java.util.ArrayList r1 = r0.a
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x068d
            j09 r1 = r0.b
            java.lang.Object r1 = r1.h
            voc r1 = (defpackage.voc) r1
            xoc r1 = defpackage.xoc.d(r1, r2)
            java.util.ArrayList r2 = r0.a
            java.util.Iterator r2 = r2.iterator()
        L_0x0670:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0688
            java.lang.Object r3 = r2.next()
            hug r3 = (defpackage.hug) r3
            nme r4 = r0.c
            long r4 = r4.b
            hz0 r3 = r3.a
            gm1 r3 = r3.r1
            r3.M(r1)
            goto L_0x0670
        L_0x0688:
            java.util.ArrayList r0 = r0.a
            r0.clear()
        L_0x068d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mme.a(org.webrtc.StatsReport[], org.webrtc.StatsReport[], qr0[], java.util.Map, gm1):void");
    }
}
