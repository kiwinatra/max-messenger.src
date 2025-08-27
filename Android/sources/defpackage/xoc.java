package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: xoc  reason: default package */
public final class xoc {
    public final lc2 a;
    public final List b;
    public final List c;
    public final List d;
    public final HashMap e = new HashMap();

    public xoc(long j, lc2 lc2, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = lc2;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
    }

    public static BigInteger a(String str, voc voc) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e2) {
            voc.logException("RTCStat", "stat.parse", e2);
            return null;
        }
    }

    public static long b(String str, voc voc) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            voc.logException("RTCStat", "stat.parse", e2);
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [nie] */
    /* JADX WARNING: type inference failed for: r1v23, types: [java.lang.Object, lc2] */
    /* JADX WARNING: type inference failed for: r27v6, types: [lie] */
    /* JADX WARNING: type inference failed for: r27v7, types: [hie] */
    /* JADX WARNING: type inference failed for: r27v8, types: [mie] */
    /* JADX WARNING: type inference failed for: r27v9, types: [kie] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0590, code lost:
        r6 = r19 + 1;
        r1 = r62;
        r15 = r5;
        r13 = r20;
        r10 = r21;
        r11 = r22;
        r14 = r24;
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        r1 = new java.util.HashMap();
        r2 = r7.values;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        if (r5 >= r3) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014a, code lost:
        r6 = r2[r5];
        r1.put(r6.name, r6.value);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0156, code lost:
        r11.put(r7.id, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015b, code lost:
        r21 = r10;
        r22 = r11;
        r24 = r14;
        r5 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02b1 A[LOOP:4: B:123:0x02af->B:124:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x058b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xoc d(defpackage.voc r61, org.webrtc.StatsReport[] r62) {
        /*
            r0 = r61
            r1 = r62
            java.lang.String r4 = "ssrc"
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r10 = r1.length
            r16 = 0
            r18 = 0
            r2 = r16
            r6 = r18
            r16 = 0
        L_0x0025:
            if (r6 >= r10) goto L_0x05a1
            r7 = r1[r6]
            r19 = r6
            double r5 = r7.timestamp
            r20 = r13
            double r12 = (double) r2
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0035
            long r2 = (long) r5
        L_0x0035:
            java.lang.String r5 = r7.type
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case 3540113: goto L_0x0064;
                case 292608541: goto L_0x0059;
                case 1216004181: goto L_0x004e;
                case 1452734571: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r5 = -1
            goto L_0x006d
        L_0x0043:
            java.lang.String r6 = "googTrack"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r5 = 3
            goto L_0x006d
        L_0x004e:
            java.lang.String r6 = "VideoBwe"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r5 = 2
            goto L_0x006d
        L_0x0059:
            java.lang.String r6 = "googCandidatePair"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0062
            goto L_0x0041
        L_0x0062:
            r5 = 1
            goto L_0x006d
        L_0x0064:
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x006b
            goto L_0x0041
        L_0x006b:
            r5 = r18
        L_0x006d:
            switch(r5) {
                case 0: goto L_0x0254;
                case 1: goto L_0x0165;
                case 2: goto L_0x0081;
                case 3: goto L_0x0074;
                default: goto L_0x0070;
            }
        L_0x0070:
            r25 = r2
            goto L_0x013e
        L_0x0074:
            org.webrtc.StatsReport$Value[] r5 = r7.values
            r5 = r5[r18]
            java.lang.String r5 = r5.value
            r14.add(r5)
            r25 = r2
            goto L_0x015b
        L_0x0081:
            org.webrtc.StatsReport$Value[] r5 = r7.values
            int r6 = r5.length
            r12 = -1
            r21 = r12
            r23 = r21
            r8 = r18
        L_0x008c:
            if (r8 >= r6) goto L_0x012b
            r9 = r5[r8]
            java.lang.String r1 = r9.name
            r1.getClass()
            int r16 = r1.hashCode()
            r25 = r2
            switch(r16) {
                case -1997975273: goto L_0x00e2;
                case -1709278787: goto L_0x00d7;
                case -1197172950: goto L_0x00cc;
                case -414492000: goto L_0x00c1;
                case 210522329: goto L_0x00b6;
                case 1074688577: goto L_0x00ab;
                case 1093751428: goto L_0x00a0;
                default: goto L_0x009e;
            }
        L_0x009e:
            r1 = -1
            goto L_0x00ed
        L_0x00a0:
            java.lang.String r2 = "googTargetEncBitrate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a9
            goto L_0x00ea
        L_0x00a9:
            r1 = 6
            goto L_0x00ed
        L_0x00ab:
            java.lang.String r2 = "googActualEncBitrate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b4
            goto L_0x00ea
        L_0x00b4:
            r1 = 5
            goto L_0x00ed
        L_0x00b6:
            java.lang.String r2 = "googBucketDelay"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00bf
            goto L_0x00ea
        L_0x00bf:
            r1 = 4
            goto L_0x00ed
        L_0x00c1:
            java.lang.String r2 = "googAvailableSendBandwidth"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ca
            goto L_0x00ea
        L_0x00ca:
            r1 = 3
            goto L_0x00ed
        L_0x00cc:
            java.lang.String r2 = "googRetransmitBitrate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d5
            goto L_0x00ea
        L_0x00d5:
            r1 = 2
            goto L_0x00ed
        L_0x00d7:
            java.lang.String r2 = "googTransmitBitrate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e0
            goto L_0x00ea
        L_0x00e0:
            r1 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r2 = "googAvailableReceiveBandwidth"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00eb
        L_0x00ea:
            goto L_0x009e
        L_0x00eb:
            r1 = r18
        L_0x00ed:
            switch(r1) {
                case 0: goto L_0x011e;
                case 1: goto L_0x0115;
                case 2: goto L_0x010c;
                case 3: goto L_0x0106;
                case 4: goto L_0x0100;
                case 5: goto L_0x00f8;
                case 6: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            r1 = 1
            goto L_0x0124
        L_0x00f2:
            java.lang.String r1 = r9.value
            b(r1, r0)
            goto L_0x00f0
        L_0x00f8:
            java.lang.String r1 = r9.value
            long r1 = b(r1, r0)
            r12 = r1
            goto L_0x00f0
        L_0x0100:
            java.lang.String r1 = r9.value
            b(r1, r0)
            goto L_0x00f0
        L_0x0106:
            java.lang.String r1 = r9.value
            b(r1, r0)
            goto L_0x00f0
        L_0x010c:
            java.lang.String r1 = r9.value
            long r1 = b(r1, r0)
            r21 = r1
            goto L_0x00f0
        L_0x0115:
            java.lang.String r1 = r9.value
            long r1 = b(r1, r0)
            r23 = r1
            goto L_0x00f0
        L_0x011e:
            java.lang.String r1 = r9.value
            b(r1, r0)
            goto L_0x00f0
        L_0x0124:
            int r8 = r8 + r1
            r1 = r62
            r2 = r25
            goto L_0x008c
        L_0x012b:
            r25 = r2
            lc2 r1 = new lc2
            r1.<init>()
            r1.a = r12
            r12 = r21
            r1.b = r12
            r12 = r23
            r1.c = r12
            r16 = r1
        L_0x013e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            org.webrtc.StatsReport$Value[] r2 = r7.values
            int r3 = r2.length
            r5 = r18
        L_0x0148:
            if (r5 >= r3) goto L_0x0156
            r6 = r2[r5]
            java.lang.String r8 = r6.name
            java.lang.String r6 = r6.value
            r1.put(r8, r6)
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0148
        L_0x0156:
            java.lang.String r2 = r7.id
            r11.put(r2, r1)
        L_0x015b:
            r21 = r10
            r22 = r11
            r24 = r14
            r5 = r15
        L_0x0162:
            r1 = 1
            goto L_0x0590
        L_0x0165:
            r25 = r2
            java.lang.String r1 = r7.id
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.webrtc.StatsReport$Value[] r3 = r7.values
            int r5 = r3.length
            r6 = r18
            r38 = r6
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
        L_0x0187:
            if (r6 >= r5) goto L_0x023f
            r7 = r3[r6]
            java.lang.String r8 = r7.name
            r8.getClass()
            java.lang.String r9 = ":"
            int r12 = r8.hashCode()
            switch(r12) {
                case -1553358190: goto L_0x01e9;
                case -747991196: goto L_0x01de;
                case -244374237: goto L_0x01d3;
                case -200882018: goto L_0x01c8;
                case 207096210: goto L_0x01bd;
                case 230681321: goto L_0x01b2;
                case 585525230: goto L_0x01a7;
                case 930973655: goto L_0x019c;
                default: goto L_0x0199;
            }
        L_0x0199:
            r8 = -1
            goto L_0x01f4
        L_0x019c:
            java.lang.String r12 = "googRemoteCandidateType"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01a5
            goto L_0x0199
        L_0x01a5:
            r8 = 7
            goto L_0x01f4
        L_0x01a7:
            java.lang.String r12 = "googRemoteAddress"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01b0
            goto L_0x0199
        L_0x01b0:
            r8 = 6
            goto L_0x01f4
        L_0x01b2:
            java.lang.String r12 = "googLocalAddress"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01bb
            goto L_0x0199
        L_0x01bb:
            r8 = 5
            goto L_0x01f4
        L_0x01bd:
            java.lang.String r12 = "googRtt"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01c6
            goto L_0x0199
        L_0x01c6:
            r8 = 4
            goto L_0x01f4
        L_0x01c8:
            java.lang.String r12 = "googChannelId"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01d1
            goto L_0x0199
        L_0x01d1:
            r8 = 3
            goto L_0x01f4
        L_0x01d3:
            java.lang.String r12 = "googTransportType"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01dc
            goto L_0x0199
        L_0x01dc:
            r8 = 2
            goto L_0x01f4
        L_0x01de:
            java.lang.String r12 = "googActiveConnection"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01e7
            goto L_0x0199
        L_0x01e7:
            r8 = 1
            goto L_0x01f4
        L_0x01e9:
            java.lang.String r12 = "googLocalCandidateType"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01f2
            goto L_0x0199
        L_0x01f2:
            r8 = r18
        L_0x01f4:
            switch(r8) {
                case 0: goto L_0x0237;
                case 1: goto L_0x022e;
                case 2: goto L_0x0229;
                case 3: goto L_0x0224;
                case 4: goto L_0x021f;
                case 5: goto L_0x0212;
                case 6: goto L_0x0205;
                case 7: goto L_0x0200;
                default: goto L_0x01f7;
            }
        L_0x01f7:
            java.lang.String r8 = r7.name
            java.lang.String r7 = r7.value
            r2.put(r8, r7)
        L_0x01fe:
            r7 = 1
            goto L_0x023c
        L_0x0200:
            java.lang.String r7 = r7.value
            r32 = r7
            goto L_0x01fe
        L_0x0205:
            java.lang.String r7 = r7.value
            if (r7 == 0) goto L_0x020f
            java.lang.String[] r8 = r7.split(r9)
            r34 = r8[r18]
        L_0x020f:
            r33 = r7
            goto L_0x01fe
        L_0x0212:
            java.lang.String r7 = r7.value
            if (r7 == 0) goto L_0x021c
            java.lang.String[] r8 = r7.split(r9)
            r31 = r8[r18]
        L_0x021c:
            r30 = r7
            goto L_0x01fe
        L_0x021f:
            java.lang.String r7 = r7.value
            r35 = r7
            goto L_0x01fe
        L_0x0224:
            java.lang.String r7 = r7.value
            r37 = r7
            goto L_0x01fe
        L_0x0229:
            java.lang.String r7 = r7.value
            r36 = r7
            goto L_0x01fe
        L_0x022e:
            java.lang.String r7 = r7.value
            java.lang.String r8 = "true"
            boolean r38 = r8.equalsIgnoreCase(r7)
            goto L_0x01fe
        L_0x0237:
            java.lang.String r7 = r7.value
            r29 = r7
            goto L_0x01fe
        L_0x023c:
            int r6 = r6 + r7
            goto L_0x0187
        L_0x023f:
            uw1 r3 = new uw1
            r27 = r3
            r28 = r1
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.util.HashMap r1 = r3.l
            r1.putAll(r2)
            r1 = r20
            r1.add(r3)
            goto L_0x015b
        L_0x0254:
            r25 = r2
            r1 = r20
            java.lang.String r2 = r7.id
            int r3 = r2.length()
            r5 = 4
            int r3 = r3 - r5
            java.lang.String r2 = r2.substring(r3)
            r2.getClass()
            java.lang.String r3 = "recv"
            boolean r3 = r2.equals(r3)
            java.lang.String r6 = "stat.parse"
            java.lang.String r8 = "CallsSsrc"
            if (r3 != 0) goto L_0x02a1
            java.lang.String r3 = "send"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x029f
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "ssrc type '"
            r3.<init>(r9)
            java.lang.String r7 = r7.id
            java.lang.String r9 = "' is not send/recv"
            java.lang.String r3 = defpackage.wj6.n(r3, r7, r9)
            r2.<init>(r3)
            r0.logException(r8, r6, r2)
            r20 = r1
            r21 = r10
            r22 = r11
            r24 = r14
            r60 = r15
        L_0x029c:
            r1 = 0
            goto L_0x0587
        L_0x029f:
            r2 = 2
            goto L_0x02a2
        L_0x02a1:
            r2 = 1
        L_0x02a2:
            java.util.HashMap r3 = new java.util.HashMap
            org.webrtc.StatsReport$Value[] r9 = r7.values
            int r9 = r9.length
            r3.<init>(r9)
            org.webrtc.StatsReport$Value[] r7 = r7.values
            int r9 = r7.length
            r12 = r18
        L_0x02af:
            if (r12 >= r9) goto L_0x02be
            r13 = r7[r12]
            java.lang.String r5 = r13.name
            java.lang.String r13 = r13.value
            r3.put(r5, r13)
            r5 = 1
            int r12 = r12 + r5
            r5 = 4
            goto L_0x02af
        L_0x02be:
            java.lang.String r5 = "mediaType"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            aqg r7 = new aqg
            java.lang.String r9 = "googCodecName"
            java.lang.Object r9 = r3.remove(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x02d5
            r9 = r12
        L_0x02d5:
            java.lang.String r13 = "codecImplementationName"
            java.lang.Object r13 = r3.remove(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x02e4
            r20 = r1
            r13 = r12
        L_0x02e2:
            r1 = 0
            goto L_0x02e7
        L_0x02e4:
            r20 = r1
            goto L_0x02e2
        L_0x02e7:
            r7.<init>(r9, r13, r1)
            java.lang.String r9 = "' is not video/audio"
            java.lang.String r13 = "media type '"
            java.lang.String r1 = "video"
            r21 = r10
            java.lang.String r10 = "audio"
            r22 = r11
            java.lang.String r11 = "googTrackId"
            r23 = r12
            java.lang.String r12 = "packetsLost"
            r24 = r14
            java.lang.String r14 = "transportId"
            r60 = r15
            r15 = 2
            if (r2 != r15) goto L_0x0423
            boolean r2 = r10.equalsIgnoreCase(r5)
            java.lang.String r10 = "bytesSent"
            java.lang.String r15 = "packetsSent"
            if (r2 == 0) goto L_0x0360
            iie r1 = new iie
            java.lang.Object r2 = r3.remove(r4)
            java.lang.String r2 = (java.lang.String) r2
            long r29 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0326
            r31 = r23
            goto L_0x0328
        L_0x0326:
            r31 = r2
        L_0x0328:
            java.lang.Object r2 = r3.remove(r15)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r32 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r12)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r33 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r34 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0351
            r35 = r23
            goto L_0x0353
        L_0x0351:
            r35 = r2
        L_0x0353:
            r28 = 1
            r37 = 0
            r27 = r1
            r36 = r7
            r27.<init>(r28, r29, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x056f
        L_0x0360:
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0415
            mie r1 = new mie
            java.lang.Object r2 = r3.remove(r4)
            java.lang.String r2 = (java.lang.String) r2
            long r28 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x037d
            r30 = r23
            goto L_0x037f
        L_0x037d:
            r30 = r2
        L_0x037f:
            java.lang.Object r2 = r3.remove(r15)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r31 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r12)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r32 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r33 = a(r2, r0)
            java.lang.String r2 = "googNacksReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r34 = b(r2, r0)
            java.lang.String r2 = "googPlisReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r36 = b(r2, r0)
            java.lang.String r2 = "googFirsReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r38 = b(r2, r0)
            java.lang.String r2 = "framesEncoded"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r40 = b(r2, r0)
            java.lang.String r2 = "googAdaptationChanges"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r42 = b(r2, r0)
            java.lang.String r2 = "googAvgEncodeMs"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r44 = b(r2, r0)
            java.lang.String r2 = "googFrameWidthSent"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r46 = b(r2, r0)
            java.lang.String r2 = "googFrameHeightSent"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r48 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0408
            r50 = r23
            goto L_0x040a
        L_0x0408:
            r50 = r2
        L_0x040a:
            r52 = 0
            r27 = r1
            r51 = r7
            r27.<init>(r28, r30, r31, r32, r33, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52)
            goto L_0x056f
        L_0x0415:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = defpackage.wj6.k(r13, r5, r9)
            r1.<init>(r2)
            r0.logException(r8, r6, r1)
            goto L_0x029c
        L_0x0423:
            boolean r2 = r10.equalsIgnoreCase(r5)
            java.lang.String r10 = "googJitterBufferMs"
            java.lang.String r15 = "bytesReceived"
            r27 = r6
            java.lang.String r6 = "packetsDiscarded"
            r28 = r8
            java.lang.String r8 = "packetsReceived"
            if (r2 == 0) goto L_0x04ad
            hie r1 = new hie
            java.lang.Object r2 = r3.remove(r4)
            java.lang.String r2 = (java.lang.String) r2
            long r28 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x044c
            r30 = r23
            goto L_0x044e
        L_0x044c:
            r30 = r2
        L_0x044e:
            java.lang.Object r2 = r3.remove(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r31 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r12)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r32 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r6)
            java.lang.String r2 = (java.lang.String) r2
            a(r2, r0)
            java.lang.Object r2 = r3.remove(r15)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r33 = a(r2, r0)
            java.lang.String r2 = "audioOutputLevel"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r34 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r10)
            java.lang.String r2 = (java.lang.String) r2
            long r36 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0496
            r38 = r23
            goto L_0x0498
        L_0x0496:
            r38 = r2
        L_0x0498:
            r43 = -1
            r45 = -1
            r39 = -1
            r41 = -1
            r47 = -1
            r49 = -1
            r27 = r1
            r51 = r7
            r27.<init>(r28, r30, r31, r32, r33, r34, r36, r38, r39, r41, r43, r45, r47, r49, r51)
            goto L_0x056f
        L_0x04ad:
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0575
            lie r1 = new lie
            java.lang.Object r2 = r3.remove(r4)
            java.lang.String r2 = (java.lang.String) r2
            long r28 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r14)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x04ca
            r30 = r23
            goto L_0x04cc
        L_0x04ca:
            r30 = r2
        L_0x04cc:
            java.lang.Object r2 = r3.remove(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r31 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r12)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r32 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r6)
            java.lang.String r2 = (java.lang.String) r2
            a(r2, r0)
            java.lang.Object r2 = r3.remove(r15)
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigInteger r33 = a(r2, r0)
            java.lang.Object r2 = r3.remove(r10)
            java.lang.String r2 = (java.lang.String) r2
            long r34 = b(r2, r0)
            java.lang.String r2 = "googNacksSent"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r36 = b(r2, r0)
            java.lang.String r2 = "googPlisSent"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r38 = b(r2, r0)
            java.lang.String r2 = "googFirsSent"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r40 = b(r2, r0)
            java.lang.String r2 = "framesDecoded"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r42 = b(r2, r0)
            java.lang.String r2 = "framesReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r44 = b(r2, r0)
            java.lang.String r2 = "googFrameHeightReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r46 = b(r2, r0)
            java.lang.String r2 = "googFrameWidthReceived"
            java.lang.Object r2 = r3.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r48 = b(r2, r0)
            java.lang.Object r2 = r3.remove(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x055c
            r50 = r23
            goto L_0x055e
        L_0x055c:
            r50 = r2
        L_0x055e:
            r53 = 0
            r54 = 0
            r51 = 0
            r56 = 0
            r58 = 0
            r27 = r1
            r55 = r7
            r27.<init>(r28, r30, r31, r32, r33, r34, r36, r38, r40, r42, r44, r46, r48, r50, r51, r53, r54, r55, r56, r58)
        L_0x056f:
            java.util.HashMap r2 = r1.g
            r2.putAll(r3)
            goto L_0x0587
        L_0x0575:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = defpackage.wj6.k(r13, r5, r9)
            r1.<init>(r2)
            r2 = r27
            r3 = r28
            r0.logException(r3, r2, r1)
            goto L_0x029c
        L_0x0587:
            r5 = r60
            if (r1 == 0) goto L_0x0162
            r5.add(r1)
            goto L_0x0162
        L_0x0590:
            int r6 = r19 + 1
            r1 = r62
            r15 = r5
            r13 = r20
            r10 = r21
            r11 = r22
            r14 = r24
            r2 = r25
            goto L_0x0025
        L_0x05a1:
            r22 = r11
            r20 = r13
            r24 = r14
            r5 = r15
            xoc r0 = new xoc
            r10 = r0
            r1 = r22
            r11 = r2
            r2 = r20
            r13 = r16
            r16 = r2
            r10.<init>(r11, r13, r14, r15, r16)
            java.util.HashMap r2 = r0.e
            r2.putAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xoc.d(voc, org.webrtc.StatsReport[]):xoc");
    }

    public final uw1 c() {
        for (uw1 uw1 : this.d) {
            if (uw1.k) {
                return uw1;
            }
        }
        return null;
    }
}
