package defpackage;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: o9g  reason: default package */
public final class o9g implements mx3 {
    public final Object a;
    public Object b;

    public /* synthetic */ o9g(m9d m9d, Bundle bundle) {
        this.a = m9d;
        this.b = bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r3 == null) goto L_0x0042;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aqg a(org.webrtc.RTCStats r7, org.webrtc.RTCStatsReport r8) {
        /*
            r0 = -1
            kotlin.reflect.KProperty[] r1 = defpackage.zoc.a
            java.util.Map r8 = r8.getStatsMap()
            java.util.Map r1 = r7.getMembers()
            java.lang.String r2 = "codecId"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object r8 = r8.get(r1)
            org.webrtc.RTCStats r8 = (org.webrtc.RTCStats) r8
            r1 = 1
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x0042
            a62 r3 = defpackage.zoc.b
            kotlin.reflect.KProperty[] r4 = defpackage.zoc.a
            r5 = 0
            r4 = r4[r5]
            java.lang.Object r3 = r3.getValue(r8, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0042
            int r4 = kotlin.text.StringsKt.getLastIndex(r3)
        L_0x002f:
            if (r0 >= r4) goto L_0x0040
            char r5 = r3.charAt(r4)
            r6 = 47
            if (r5 == r6) goto L_0x003b
            int r4 = r4 + r0
            goto L_0x002f
        L_0x003b:
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4)
        L_0x0040:
            if (r3 != 0) goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            a62 r0 = defpackage.zoc.d
            kotlin.reflect.KProperty[] r4 = defpackage.zoc.a
            r5 = 2
            r5 = r4[r5]
            java.lang.Object r0 = r0.getValue(r7, r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0060
            a62 r0 = defpackage.zoc.c
            r1 = r4[r1]
            java.lang.Object r7 = r0.getValue(r7, r1)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0060
            r0 = r2
        L_0x0060:
            if (r8 == 0) goto L_0x0071
            a62 r7 = defpackage.zoc.e
            r1 = 3
            r1 = r4[r1]
            java.lang.Object r7 = r7.getValue(r8, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r2 = r7
        L_0x0071:
            if (r8 == 0) goto L_0x007e
            a62 r7 = defpackage.zoc.f
            r1 = 4
            r1 = r4[r1]
            java.lang.Object r7 = r7.getValue(r8, r1)
            java.lang.Long r7 = (java.lang.Long) r7
        L_0x007e:
            aqg r7 = new aqg
            r7.<init>(r3, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.a(org.webrtc.RTCStats, org.webrtc.RTCStatsReport):aqg");
    }

    public View b(int i, int i2, int i3, int i4) {
        n9g n9g = (n9g) this.a;
        int e = n9g.e();
        int m = n9g.m();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View n = n9g.n(i);
            int d = n9g.d(n);
            int p = n9g.p(n);
            ff ffVar = (ff) this.b;
            ffVar.b = e;
            ffVar.c = m;
            ffVar.d = d;
            ffVar.e = p;
            if (i3 != 0) {
                ffVar.a = i3;
                if (ffVar.a()) {
                    return n;
                }
            }
            if (i4 != 0) {
                ffVar.a = i4;
                if (ffVar.a()) {
                    view = n;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean c(View view) {
        n9g n9g = (n9g) this.a;
        int e = n9g.e();
        int m = n9g.m();
        int d = n9g.d(view);
        int p = n9g.p(view);
        ff ffVar = (ff) this.b;
        ffVar.b = e;
        ffVar.c = m;
        ffVar.d = d;
        ffVar.e = p;
        ffVar.a = 24579;
        return ffVar.a();
    }

    /* JADX WARNING: type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: type inference failed for: r29v5, types: [mie] */
    /* JADX WARNING: type inference failed for: r27v9, types: [kie] */
    /* JADX WARNING: type inference failed for: r29v6, types: [lie] */
    /* JADX WARNING: type inference failed for: r22v7, types: [hie] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x075c  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0851  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0671 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.xoc d(defpackage.nne r63) {
        /*
            r62 = this;
            r0 = r62
            r1 = r63
            org.webrtc.RTCStatsReport r1 = r1.a
            xoc r9 = new xoc
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            double r3 = r1.getTimestampUs()
            long r3 = (long) r3
            long r3 = r2.toMillis(r3)
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Map r2 = r1.getStatsMap()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r8 = -1
            r10 = -1
        L_0x002a:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x0623
            java.lang.Object r11 = r2.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            org.webrtc.RTCStats r11 = (org.webrtc.RTCStats) r11
            java.lang.String r14 = r11.getType()
            java.lang.String r15 = "inbound-rtp"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            java.lang.String r5 = "jitter"
            java.lang.String r12 = "bytesReceived"
            java.lang.String r13 = "packetsDiscarded"
            r16 = r2
            java.lang.String r2 = "packetsReceived"
            r17 = r6
            java.lang.String r6 = "audio"
            r18 = 0
            r20 = 0
            if (r14 == 0) goto L_0x01a6
            java.lang.String r14 = defpackage.zoc.e(r11)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r6)
            if (r14 == 0) goto L_0x01a6
            java.lang.Long r6 = defpackage.zoc.g(r11)
            if (r6 == 0) goto L_0x0074
            long r23 = r6.longValue()
            java.lang.String r25 = defpackage.zoc.i(r11)
            if (r25 != 0) goto L_0x0080
        L_0x0074:
            r6 = r0
            r5 = r1
            r22 = r3
            r26 = r7
            r25 = r8
            r24 = r9
            goto L_0x05c9
        L_0x0080:
            java.util.Map r6 = r11.getMembers()
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto L_0x0091
            java.math.BigInteger r2 = defpackage.zoc.a(r2)
            r26 = r2
            goto L_0x0093
        L_0x0091:
            r26 = 0
        L_0x0093:
            java.math.BigInteger r27 = defpackage.zoc.f(r11)
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x00a4
            defpackage.zoc.a(r2)
        L_0x00a4:
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x00b5
            java.math.BigInteger r2 = defpackage.zoc.a(r2)
            r28 = r2
            goto L_0x00b7
        L_0x00b5:
            r28 = 0
        L_0x00b7:
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r5)
            if (r2 == 0) goto L_0x00c6
            java.lang.Double r2 = defpackage.zoc.b(r2)
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            if (r2 == 0) goto L_0x00cd
            double r18 = r2.doubleValue()
        L_0x00cd:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 1
            long r5 = r2.toMillis(r5)
            double r5 = (double) r5
            double r5 = r5 * r18
            long r5 = (long) r5
            java.lang.String r33 = defpackage.zoc.h(r11)
            if (r33 != 0) goto L_0x00e0
            goto L_0x0074
        L_0x00e0:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "totalSamplesReceived"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x00f1
            java.lang.Long r2 = defpackage.zoc.c(r2)
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            if (r2 == 0) goto L_0x00fb
            long r12 = r2.longValue()
            r34 = r12
            goto L_0x00fd
        L_0x00fb:
            r34 = r20
        L_0x00fd:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "insertedSamplesForDeceleration"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x010e
            java.lang.Long r2 = defpackage.zoc.c(r2)
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            if (r2 == 0) goto L_0x0118
            long r12 = r2.longValue()
            r36 = r12
            goto L_0x011a
        L_0x0118:
            r36 = r20
        L_0x011a:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "removedSamplesForAcceleration"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x012b
            java.lang.Long r2 = defpackage.zoc.c(r2)
            goto L_0x012c
        L_0x012b:
            r2 = 0
        L_0x012c:
            if (r2 == 0) goto L_0x0135
            long r12 = r2.longValue()
            r38 = r12
            goto L_0x0137
        L_0x0135:
            r38 = r20
        L_0x0137:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "concealedSamples"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0148
            java.lang.Long r2 = defpackage.zoc.c(r2)
            goto L_0x0149
        L_0x0148:
            r2 = 0
        L_0x0149:
            if (r2 == 0) goto L_0x0152
            long r12 = r2.longValue()
            r40 = r12
            goto L_0x0154
        L_0x0152:
            r40 = r20
        L_0x0154:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "silentConcealedSamples"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0165
            java.lang.Long r2 = defpackage.zoc.c(r2)
            goto L_0x0166
        L_0x0165:
            r2 = 0
        L_0x0166:
            if (r2 == 0) goto L_0x016f
            long r12 = r2.longValue()
            r42 = r12
            goto L_0x0171
        L_0x016f:
            r42 = r20
        L_0x0171:
            java.util.Map r2 = r11.getMembers()
            java.lang.String r12 = "concealmentEvents"
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0182
            java.lang.Long r14 = defpackage.zoc.c(r2)
            goto L_0x0183
        L_0x0182:
            r14 = 0
        L_0x0183:
            if (r14 == 0) goto L_0x0189
            long r20 = r14.longValue()
        L_0x0189:
            r44 = r20
            aqg r46 = a(r11, r1)
            hie r14 = new hie
            r22 = r14
            r29 = -1
            r31 = r5
            r22.<init>(r23, r25, r26, r27, r28, r29, r31, r33, r34, r36, r38, r40, r42, r44, r46)
            r6 = r0
            r5 = r1
            r22 = r3
            r26 = r7
            r25 = r8
            r24 = r9
            goto L_0x05ca
        L_0x01a6:
            java.lang.String r14 = r11.getType()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
            java.lang.String r15 = "frameHeight"
            r22 = r3
            java.lang.String r3 = "frameWidth"
            java.lang.String r4 = "firCount"
            r24 = r9
            java.lang.String r9 = "pliCount"
            r25 = r8
            java.lang.String r8 = "nackCount"
            r26 = r7
            java.lang.String r7 = "video"
            r27 = -1
            if (r14 == 0) goto L_0x03a6
            java.lang.String r14 = defpackage.zoc.e(r11)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r7)
            if (r14 == 0) goto L_0x03a6
            java.lang.Long r6 = defpackage.zoc.g(r11)
            if (r6 == 0) goto L_0x03a1
            long r30 = r6.longValue()
            java.lang.String r32 = defpackage.zoc.i(r11)
            if (r32 != 0) goto L_0x01e4
            r6 = r0
            r5 = r1
            goto L_0x05c9
        L_0x01e4:
            java.util.Map r6 = r11.getMembers()
            java.lang.Object r2 = r6.get(r2)
            if (r2 == 0) goto L_0x01f5
            java.math.BigInteger r2 = defpackage.zoc.a(r2)
            r33 = r2
            goto L_0x01f7
        L_0x01f5:
            r33 = 0
        L_0x01f7:
            java.math.BigInteger r34 = defpackage.zoc.f(r11)
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x0208
            defpackage.zoc.a(r2)
        L_0x0208:
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0219
            java.math.BigInteger r2 = defpackage.zoc.a(r2)
            r35 = r2
            goto L_0x021b
        L_0x0219:
            r35 = 0
        L_0x021b:
            java.util.Map r2 = r11.getMembers()
            java.lang.Object r2 = r2.get(r5)
            if (r2 == 0) goto L_0x022a
            java.lang.Double r2 = defpackage.zoc.b(r2)
            goto L_0x022b
        L_0x022a:
            r2 = 0
        L_0x022b:
            if (r2 == 0) goto L_0x0232
            double r5 = r2.doubleValue()
            goto L_0x0234
        L_0x0232:
            r5 = r18
        L_0x0234:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r14 = r1
            r12 = 1
            long r0 = r2.toMillis(r12)
            double r0 = (double) r0
            double r5 = r5 * r0
            long r0 = (long) r5
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r5 = r5.get(r8)
            if (r5 == 0) goto L_0x024f
            java.lang.Long r5 = defpackage.zoc.c(r5)
            goto L_0x0250
        L_0x024f:
            r5 = 0
        L_0x0250:
            if (r5 == 0) goto L_0x0259
            long r5 = r5.longValue()
            r38 = r5
            goto L_0x025b
        L_0x0259:
            r38 = r20
        L_0x025b:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r5 = r5.get(r9)
            if (r5 == 0) goto L_0x026a
            java.lang.Long r5 = defpackage.zoc.c(r5)
            goto L_0x026b
        L_0x026a:
            r5 = 0
        L_0x026b:
            if (r5 == 0) goto L_0x0274
            long r5 = r5.longValue()
            r40 = r5
            goto L_0x0276
        L_0x0274:
            r40 = r20
        L_0x0276:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r4 = r5.get(r4)
            if (r4 == 0) goto L_0x0285
            java.lang.Long r4 = defpackage.zoc.c(r4)
            goto L_0x0286
        L_0x0285:
            r4 = 0
        L_0x0286:
            if (r4 == 0) goto L_0x028f
            long r4 = r4.longValue()
            r42 = r4
            goto L_0x0291
        L_0x028f:
            r42 = r20
        L_0x0291:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r5 = "framesDecoded"
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x02a2
            java.lang.Long r4 = defpackage.zoc.c(r4)
            goto L_0x02a3
        L_0x02a2:
            r4 = 0
        L_0x02a3:
            if (r4 == 0) goto L_0x02ac
            long r4 = r4.longValue()
            r44 = r4
            goto L_0x02ae
        L_0x02ac:
            r44 = r20
        L_0x02ae:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r5 = "framesReceived"
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x02bf
            java.lang.Long r4 = defpackage.zoc.c(r4)
            goto L_0x02c0
        L_0x02bf:
            r4 = 0
        L_0x02c0:
            if (r4 == 0) goto L_0x02c9
            long r4 = r4.longValue()
            r46 = r4
            goto L_0x02cb
        L_0x02c9:
            r46 = r20
        L_0x02cb:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r5 = "framesDropped"
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x02dc
            java.lang.Long r4 = defpackage.zoc.c(r4)
            goto L_0x02dd
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            if (r4 == 0) goto L_0x02e6
            long r4 = r4.longValue()
            r53 = r4
            goto L_0x02e8
        L_0x02e6:
            r53 = r20
        L_0x02e8:
            java.util.Map r4 = r11.getMembers()
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L_0x02f7
            java.lang.Long r3 = defpackage.zoc.c(r3)
            goto L_0x02f8
        L_0x02f7:
            r3 = 0
        L_0x02f8:
            if (r3 == 0) goto L_0x0301
            long r3 = r3.longValue()
            r50 = r3
            goto L_0x0303
        L_0x0301:
            r50 = r27
        L_0x0303:
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r15)
            if (r3 == 0) goto L_0x0312
            java.lang.Long r3 = defpackage.zoc.c(r3)
            goto L_0x0313
        L_0x0312:
            r3 = 0
        L_0x0313:
            if (r3 == 0) goto L_0x0319
            long r27 = r3.longValue()
        L_0x0319:
            r48 = r27
            java.lang.String r52 = defpackage.zoc.h(r11)
            if (r52 != 0) goto L_0x0326
            r6 = r62
            r5 = r14
            goto L_0x05c9
        L_0x0326:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalSquaredInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0339
            java.lang.Double r3 = defpackage.zoc.b(r3)
            r55 = r3
            goto L_0x033b
        L_0x0339:
            r55 = 0
        L_0x033b:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x034f
            java.lang.Double r3 = defpackage.zoc.b(r3)
            r56 = r3
            r5 = r14
            goto L_0x0352
        L_0x034f:
            r5 = r14
            r56 = 0
        L_0x0352:
            aqg r57 = a(r11, r5)
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "freezeCount"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0367
            java.lang.Long r3 = defpackage.zoc.c(r3)
            goto L_0x0368
        L_0x0367:
            r3 = 0
        L_0x0368:
            if (r3 == 0) goto L_0x036e
            long r20 = r3.longValue()
        L_0x036e:
            r58 = r20
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalFreezesDuration"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0381
            java.lang.Double r14 = defpackage.zoc.b(r3)
            goto L_0x0382
        L_0x0381:
            r14 = 0
        L_0x0382:
            if (r14 == 0) goto L_0x0388
            double r18 = r14.doubleValue()
        L_0x0388:
            r3 = 1
            long r2 = r2.toMillis(r3)
            double r2 = (double) r2
            double r2 = r2 * r18
            long r2 = (long) r2
            r60 = r2
            lie r14 = new lie
            r29 = r14
            r36 = r0
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r55, r56, r57, r58, r60)
            r6 = r62
            goto L_0x05ca
        L_0x03a1:
            r5 = r1
        L_0x03a2:
            r6 = r62
            goto L_0x05c9
        L_0x03a6:
            r5 = r1
            java.lang.String r0 = r11.getType()
            java.lang.String r1 = "outbound-rtp"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            java.lang.String r2 = "mediaSourceId"
            java.lang.String r12 = "remoteId"
            java.lang.String r13 = "bytesSent"
            java.lang.String r14 = "packetsSent"
            if (r0 == 0) goto L_0x046d
            java.lang.String r0 = defpackage.zoc.e(r11)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r6)
            if (r0 == 0) goto L_0x046d
            java.lang.Long r0 = defpackage.zoc.g(r11)
            if (r0 == 0) goto L_0x03a2
            long r29 = r0.longValue()
            java.lang.String r31 = defpackage.zoc.i(r11)
            if (r31 != 0) goto L_0x03d6
        L_0x03d5:
            goto L_0x03a2
        L_0x03d6:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r14)
            if (r0 == 0) goto L_0x03e7
            java.math.BigInteger r0 = defpackage.zoc.a(r0)
            r32 = r0
            goto L_0x03e9
        L_0x03e7:
            r32 = 0
        L_0x03e9:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r13)
            if (r0 == 0) goto L_0x03fa
            java.math.BigInteger r0 = defpackage.zoc.a(r0)
            r34 = r0
            goto L_0x03fc
        L_0x03fa:
            r34 = 0
        L_0x03fc:
            java.util.Map r0 = r5.getStatsMap()
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.RTCStats r0 = (org.webrtc.RTCStats) r0
            if (r0 == 0) goto L_0x0417
            java.math.BigInteger r0 = defpackage.zoc.f(r0)
            r33 = r0
            goto L_0x0419
        L_0x0417:
            r33 = 0
        L_0x0419:
            java.util.Map r0 = r5.getStatsMap()
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.RTCStats r0 = (org.webrtc.RTCStats) r0
            if (r0 != 0) goto L_0x042e
            goto L_0x03d5
        L_0x042e:
            java.lang.String r0 = defpackage.zoc.h(r0)
            if (r0 != 0) goto L_0x0435
            goto L_0x03d5
        L_0x0435:
            aqg r36 = a(r11, r5)
            r6 = r62
            java.lang.Object r1 = r6.b
            t48 r1 = (defpackage.t48) r1
            if (r1 == 0) goto L_0x045e
            v48 r1 = r1.a
            java.lang.String r2 = r1.k
            boolean r2 = r0.equals(r2)
            java.lang.String r1 = r1.l
            boolean r1 = r0.equals(r1)
            if (r2 != 0) goto L_0x0456
            if (r1 == 0) goto L_0x0454
            goto L_0x0456
        L_0x0454:
            r12 = 0
            goto L_0x0457
        L_0x0456:
            r12 = 1
        L_0x0457:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r37 = r14
            goto L_0x0460
        L_0x045e:
            r37 = 0
        L_0x0460:
            iie r14 = new iie
            r28 = 1
            r27 = r14
            r35 = r0
            r27.<init>(r28, r29, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x05ca
        L_0x046d:
            r6 = r62
            java.lang.String r0 = r11.getType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x05c9
            java.lang.String r0 = defpackage.zoc.e(r11)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r0 == 0) goto L_0x05c9
            java.lang.Long r0 = defpackage.zoc.g(r11)
            if (r0 == 0) goto L_0x05c9
            long r30 = r0.longValue()
            java.lang.String r32 = defpackage.zoc.i(r11)
            if (r32 != 0) goto L_0x0495
            goto L_0x05c9
        L_0x0495:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r14)
            if (r0 == 0) goto L_0x04a6
            java.math.BigInteger r0 = defpackage.zoc.a(r0)
            r33 = r0
            goto L_0x04a8
        L_0x04a6:
            r33 = 0
        L_0x04a8:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r13)
            if (r0 == 0) goto L_0x04b9
            java.math.BigInteger r0 = defpackage.zoc.a(r0)
            r35 = r0
            goto L_0x04bb
        L_0x04b9:
            r35 = 0
        L_0x04bb:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x04ca
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x04cb
        L_0x04ca:
            r0 = 0
        L_0x04cb:
            if (r0 == 0) goto L_0x04d4
            long r0 = r0.longValue()
            r36 = r0
            goto L_0x04d6
        L_0x04d4:
            r36 = r20
        L_0x04d6:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x04e5
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x04e6
        L_0x04e5:
            r0 = 0
        L_0x04e6:
            if (r0 == 0) goto L_0x04ef
            long r0 = r0.longValue()
            r38 = r0
            goto L_0x04f1
        L_0x04ef:
            r38 = r20
        L_0x04f1:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L_0x0500
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x0501
        L_0x0500:
            r0 = 0
        L_0x0501:
            if (r0 == 0) goto L_0x050a
            long r0 = r0.longValue()
            r40 = r0
            goto L_0x050c
        L_0x050a:
            r40 = r20
        L_0x050c:
            java.util.Map r0 = r11.getMembers()
            java.lang.String r1 = "framesEncoded"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x051d
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x051e
        L_0x051d:
            r0 = 0
        L_0x051e:
            if (r0 == 0) goto L_0x0524
            long r20 = r0.longValue()
        L_0x0524:
            r42 = r20
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r15)
            if (r0 == 0) goto L_0x0535
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x0536
        L_0x0535:
            r0 = 0
        L_0x0536:
            if (r0 == 0) goto L_0x053f
            long r0 = r0.longValue()
            r50 = r0
            goto L_0x0541
        L_0x053f:
            r50 = r27
        L_0x0541:
            java.util.Map r0 = r11.getMembers()
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0550
            java.lang.Long r0 = defpackage.zoc.c(r0)
            goto L_0x0551
        L_0x0550:
            r0 = 0
        L_0x0551:
            if (r0 == 0) goto L_0x0557
            long r27 = r0.longValue()
        L_0x0557:
            r48 = r27
            java.util.Map r0 = r5.getStatsMap()
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.RTCStats r0 = (org.webrtc.RTCStats) r0
            if (r0 == 0) goto L_0x0574
            java.math.BigInteger r0 = defpackage.zoc.f(r0)
            r34 = r0
            goto L_0x0576
        L_0x0574:
            r34 = 0
        L_0x0576:
            java.util.Map r0 = r5.getStatsMap()
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object r0 = r0.get(r1)
            org.webrtc.RTCStats r0 = (org.webrtc.RTCStats) r0
            if (r0 != 0) goto L_0x058b
            goto L_0x05c9
        L_0x058b:
            java.lang.String r0 = defpackage.zoc.h(r0)
            if (r0 != 0) goto L_0x0592
            goto L_0x05c9
        L_0x0592:
            aqg r53 = a(r11, r5)
            java.lang.Object r1 = r6.b
            t48 r1 = (defpackage.t48) r1
            if (r1 == 0) goto L_0x05b9
            v48 r1 = r1.a
            java.lang.String r2 = r1.k
            boolean r2 = r0.equals(r2)
            java.lang.String r1 = r1.l
            boolean r1 = r0.equals(r1)
            if (r2 != 0) goto L_0x05b1
            if (r1 == 0) goto L_0x05af
            goto L_0x05b1
        L_0x05af:
            r12 = 0
            goto L_0x05b2
        L_0x05b1:
            r12 = 1
        L_0x05b2:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r54 = r14
            goto L_0x05bb
        L_0x05b9:
            r54 = 0
        L_0x05bb:
            mie r14 = new mie
            r29 = r14
            r44 = -1
            r46 = -1
            r52 = r0
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            goto L_0x05ca
        L_0x05c9:
            r14 = 0
        L_0x05ca:
            if (r14 == 0) goto L_0x0612
            boolean r0 = r14 instanceof defpackage.mie
            if (r0 == 0) goto L_0x05ff
            r0 = -1
            if (r10 != r0) goto L_0x05e4
            r1 = r14
            mie r1 = (defpackage.mie) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r1 = r1.k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x05e4
            int r10 = r26.size()
        L_0x05e4:
            r1 = r25
            if (r1 != r0) goto L_0x05fd
            r0 = r14
            mie r0 = (defpackage.mie) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r0.k
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x05fd
            int r0 = r26.size()
            r8 = r0
        L_0x05fa:
            r0 = r26
            goto L_0x0602
        L_0x05fd:
            r8 = r1
            goto L_0x05fa
        L_0x05ff:
            r1 = r25
            goto L_0x05fd
        L_0x0602:
            r0.add(r14)
            r7 = r0
            r1 = r5
            r0 = r6
            r2 = r16
            r6 = r17
            r3 = r22
            r9 = r24
            goto L_0x002a
        L_0x0612:
            r1 = r25
            r8 = r1
            r1 = r5
            r0 = r6
            r2 = r16
            r6 = r17
            r3 = r22
            r9 = r24
            r7 = r26
            goto L_0x002a
        L_0x0623:
            r5 = r1
            r22 = r3
            r17 = r6
            r1 = r8
            r24 = r9
            r6 = r0
            r0 = r7
            if (r1 >= r10) goto L_0x0642
            r2 = -1
            if (r1 == r2) goto L_0x0642
            java.lang.Object r2 = r0.get(r10)
            nie r2 = (defpackage.nie) r2
            java.lang.Object r3 = r0.get(r1)
            r0.set(r10, r3)
            r0.set(r1, r2)
        L_0x0642:
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " ssrcs parsed"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r2 = r6.a
            voc r2 = (defpackage.voc) r2
            java.lang.String r3 = "WebRTCToInternalStatsMapper"
            r2.log(r3, r1)
            java.util.Map r1 = r5.getStatsMap()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0671:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0856
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            org.webrtc.RTCStats r4 = (org.webrtc.RTCStats) r4
            java.lang.String r6 = r4.getType()
            java.lang.String r7 = "candidate-pair"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x0690
            goto L_0x0671
        L_0x0690:
            kotlin.reflect.KProperty[] r6 = defpackage.zoc.a
            java.util.Map r6 = r5.getStatsMap()
            java.util.Map r7 = r4.getMembers()
            java.lang.String r9 = "localCandidateId"
            java.lang.Object r7 = r7.get(r9)
            java.lang.Object r6 = r6.get(r7)
            org.webrtc.RTCStats r6 = (org.webrtc.RTCStats) r6
            if (r6 != 0) goto L_0x06ac
        L_0x06a8:
            r12 = 1
            goto L_0x078c
        L_0x06ac:
            java.util.Map r7 = r5.getStatsMap()
            java.util.Map r9 = r4.getMembers()
            java.lang.String r10 = "remoteCandidateId"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Object r7 = r7.get(r9)
            org.webrtc.RTCStats r7 = (org.webrtc.RTCStats) r7
            if (r7 != 0) goto L_0x06c3
            goto L_0x06a8
        L_0x06c3:
            java.util.Map r9 = r6.getMembers()
            java.lang.String r10 = "candidateType"
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x06d4
            java.lang.String r9 = r9.toString()
            goto L_0x06d5
        L_0x06d4:
            r9 = 0
        L_0x06d5:
            java.lang.String r11 = "protocol"
            java.lang.String r12 = "address"
            if (r9 != 0) goto L_0x06dc
            goto L_0x0708
        L_0x06dc:
            java.lang.String r13 = defpackage.zoc.d(r6)
            if (r13 != 0) goto L_0x06e3
            goto L_0x0708
        L_0x06e3:
            java.util.Map r14 = r6.getMembers()
            java.lang.Object r14 = r14.get(r12)
            if (r14 == 0) goto L_0x06f2
            java.lang.String r14 = r14.toString()
            goto L_0x06f3
        L_0x06f2:
            r14 = 0
        L_0x06f3:
            if (r14 != 0) goto L_0x06f6
            goto L_0x0708
        L_0x06f6:
            java.util.Map r6 = r6.getMembers()
            java.lang.Object r6 = r6.get(r11)
            if (r6 == 0) goto L_0x0705
            java.lang.String r6 = r6.toString()
            goto L_0x0706
        L_0x0705:
            r6 = 0
        L_0x0706:
            if (r6 != 0) goto L_0x070a
        L_0x0708:
            r15 = 0
            goto L_0x070f
        L_0x070a:
            tgg r15 = new tgg
            r15.<init>(r9, r13, r14, r6)
        L_0x070f:
            if (r15 != 0) goto L_0x0712
            goto L_0x06a8
        L_0x0712:
            java.util.Map r6 = r7.getMembers()
            java.lang.Object r6 = r6.get(r10)
            if (r6 == 0) goto L_0x0721
            java.lang.String r6 = r6.toString()
            goto L_0x0722
        L_0x0721:
            r6 = 0
        L_0x0722:
            if (r6 != 0) goto L_0x0725
            goto L_0x0751
        L_0x0725:
            java.lang.String r9 = defpackage.zoc.d(r7)
            if (r9 != 0) goto L_0x072c
            goto L_0x0751
        L_0x072c:
            java.util.Map r10 = r7.getMembers()
            java.lang.Object r10 = r10.get(r12)
            if (r10 == 0) goto L_0x073b
            java.lang.String r10 = r10.toString()
            goto L_0x073c
        L_0x073b:
            r10 = 0
        L_0x073c:
            if (r10 != 0) goto L_0x073f
            goto L_0x0751
        L_0x073f:
            java.util.Map r7 = r7.getMembers()
            java.lang.Object r7 = r7.get(r11)
            if (r7 == 0) goto L_0x074e
            java.lang.String r7 = r7.toString()
            goto L_0x074f
        L_0x074e:
            r7 = 0
        L_0x074f:
            if (r7 != 0) goto L_0x0753
        L_0x0751:
            r11 = 0
            goto L_0x0758
        L_0x0753:
            tgg r11 = new tgg
            r11.<init>(r6, r9, r10, r7)
        L_0x0758:
            if (r11 != 0) goto L_0x075c
            goto L_0x06a8
        L_0x075c:
            java.util.Map r6 = r4.getMembers()
            java.lang.String r7 = "currentRoundTripTime"
            java.lang.Object r6 = r6.get(r7)
            if (r6 == 0) goto L_0x076d
            java.lang.Double r6 = defpackage.zoc.b(r6)
            goto L_0x076e
        L_0x076d:
            r6 = 0
        L_0x076e:
            if (r6 == 0) goto L_0x0783
            double r6 = r6.doubleValue()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r12 = 1
            long r9 = r9.toMillis(r12)
            double r9 = (double) r9
            double r6 = r6 * r9
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            goto L_0x0786
        L_0x0783:
            r12 = 1
            r6 = 0
        L_0x0786:
            java.lang.String r35 = defpackage.zoc.i(r4)
            if (r35 != 0) goto L_0x078f
        L_0x078c:
            r7 = 0
            goto L_0x084f
        L_0x078f:
            java.util.Map r7 = r5.getStatsMap()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r7.size()
            r9.<init>(r10)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x07a4:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x07ba
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            org.webrtc.RTCStats r10 = (org.webrtc.RTCStats) r10
            r9.add(r10)
            goto L_0x07a4
        L_0x07ba:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x07c3:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x07e2
            java.lang.Object r10 = r9.next()
            r14 = r10
            org.webrtc.RTCStats r14 = (org.webrtc.RTCStats) r14
            java.lang.String r14 = r14.getType()
            java.lang.String r12 = "transport"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r12)
            if (r12 == 0) goto L_0x07df
            r7.add(r10)
        L_0x07df:
            r12 = 1
            goto L_0x07c3
        L_0x07e2:
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x07e9
            goto L_0x0814
        L_0x07e9:
            java.util.Iterator r7 = r7.iterator()
        L_0x07ed:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0814
            java.lang.Object r9 = r7.next()
            org.webrtc.RTCStats r9 = (org.webrtc.RTCStats) r9
            java.lang.String r10 = "selectedCandidatePairId"
            java.lang.Object r9 = defpackage.cjf.a(r9, r10)
            if (r9 == 0) goto L_0x0806
            java.lang.String r9 = r9.toString()
            goto L_0x0807
        L_0x0806:
            r9 = 0
        L_0x0807:
            java.lang.String r10 = r4.getId()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x07ed
            r36 = 1
            goto L_0x0816
        L_0x0814:
            r36 = 0
        L_0x0816:
            uw1 r7 = new uw1
            java.lang.String r26 = r4.getId()
            java.lang.String r33 = java.lang.String.valueOf(r6)
            java.lang.Object r4 = r11.a
            r30 = r4
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r4 = r11.b
            r31 = r4
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r4 = r15.a
            r27 = r4
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r4 = r15.b
            r28 = r4
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r4 = r15.c
            r29 = r4
            java.lang.String r29 = (java.lang.String) r29
            java.lang.Object r4 = r11.c
            r32 = r4
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r4 = r15.o
            r34 = r4
            java.lang.String r34 = (java.lang.String) r34
            r25 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x084f:
            if (r7 == 0) goto L_0x0671
            r8.add(r7)
            goto L_0x0671
        L_0x0856:
            int r1 = r8.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " candidatePairs parsed"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.log(r3, r1)
            r5 = 0
            r2 = r24
            r3 = r22
            r6 = r17
            r7 = r0
            r2.<init>(r3, r5, r6, r7, r8)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.d(nne):xoc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = (android.os.Bundle) r4.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object n(com.google.android.gms.tasks.Task r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            m9d r0 = (defpackage.m9d) r0
            r0.getClass()
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            java.lang.Object r1 = r4.f()
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "google.messenger"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x002e
            java.lang.Object r3 = r3.b
            android.os.Bundle r3 = (android.os.Bundle) r3
            s7h r3 = r0.a(r3)
            ep4 r4 = defpackage.ep4.o
            dbe r0 = defpackage.dbe.x
            s7h r4 = r3.l(r4, r0)
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9g.n(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    public o9g(voc voc) {
        this.a = voc;
    }

    public o9g() {
        dt6 dt6 = dt6.d;
        this.a = new SparseIntArray();
        this.b = dt6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ff, java.lang.Object] */
    public o9g(n9g n9g) {
        this.a = n9g;
        ? obj = new Object();
        obj.a = 0;
        this.b = obj;
    }
}
