package defpackage;

import org.webrtc.IceCandidate;

/* renamed from: uab  reason: default package */
public final /* synthetic */ class uab implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;
    public final /* synthetic */ IceCandidate c;

    public /* synthetic */ uab(fbb fbb, IceCandidate iceCandidate, int i) {
        this.a = i;
        this.b = fbb;
        this.c = iceCandidate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "PCRTCClient"
            java.lang.String r1 = "srflx"
            r2 = 2
            java.lang.String r3 = "relay"
            org.webrtc.IceCandidate r4 = r14.c
            fbb r5 = r14.b
            r6 = 1
            int r14 = r14.a
            org.webrtc.PeerConnection r15 = (org.webrtc.PeerConnection) r15
            switch(r14) {
                case 0: goto L_0x01d9;
                default: goto L_0x0013;
            }
        L_0x0013:
            q67 r14 = r5.M0
            boolean r15 = r14.g
            if (r15 == 0) goto L_0x001b
            goto L_0x0152
        L_0x001b:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r9 = r14.e
            long r7 = r7 - r9
            java.lang.String r15 = r4.sdp
            java.util.regex.Pattern r9 = defpackage.q67.i
            java.util.regex.Matcher r15 = r9.matcher(r15)
            boolean r9 = r15.matches()
            if (r9 != 0) goto L_0x0032
            goto L_0x0152
        L_0x0032:
            java.lang.String r15 = r15.group(r6)
            if (r15 != 0) goto L_0x003a
            goto L_0x0152
        L_0x003a:
            r9 = 0
            r10 = -1
            int r11 = r15.hashCode()
            switch(r11) {
                case 3208616: goto L_0x0061;
                case 106932016: goto L_0x0056;
                case 108397201: goto L_0x004d;
                case 109702579: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x006b
        L_0x0044:
            boolean r11 = r15.equals(r1)
            if (r11 != 0) goto L_0x004b
            goto L_0x006b
        L_0x004b:
            r10 = 3
            goto L_0x006b
        L_0x004d:
            boolean r11 = r15.equals(r3)
            if (r11 != 0) goto L_0x0054
            goto L_0x006b
        L_0x0054:
            r10 = r2
            goto L_0x006b
        L_0x0056:
            java.lang.String r11 = "prflx"
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            r10 = r6
            goto L_0x006b
        L_0x0061:
            java.lang.String r11 = "host"
            boolean r11 = r15.equals(r11)
            if (r11 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r10 = 0
        L_0x006b:
            switch(r10) {
                case 0: goto L_0x0152;
                case 1: goto L_0x0070;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            r10 = r9
            goto L_0x008f
        L_0x0070:
            java.lang.String r10 = r4.serverUrl
            if (r10 == 0) goto L_0x0085
            java.util.regex.Pattern r11 = defpackage.q67.j
            java.util.regex.Matcher r10 = r11.matcher(r10)
            boolean r11 = r10.matches()
            if (r11 == 0) goto L_0x0085
            java.lang.String r10 = r10.group(r6)
            goto L_0x0086
        L_0x0085:
            r10 = r9
        L_0x0086:
            if (r10 != 0) goto L_0x008b
            java.lang.String r10 = "udp"
            goto L_0x008f
        L_0x008b:
            java.lang.String r10 = r10.toLowerCase()
        L_0x008f:
            boolean r3 = r3.equals(r15)
            java.lang.String r11 = "CandidateLog"
            voc r12 = r14.b
            if (r3 == 0) goto L_0x00bb
            java.lang.String r15 = "tcp"
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto L_0x00a4
            jug r15 = defpackage.jug.TCP_RELAY
            goto L_0x00a6
        L_0x00a4:
            jug r15 = defpackage.jug.UDP_RELAY
        L_0x00a6:
            java.util.regex.Pattern r1 = defpackage.q67.k
            java.lang.String r3 = r4.sdp
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r3 = r1.matches()
            if (r3 == 0) goto L_0x00b9
            java.lang.String r1 = r1.group(r6)
            goto L_0x00c4
        L_0x00b9:
            r1 = r9
            goto L_0x00c4
        L_0x00bb:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0149
            jug r15 = defpackage.jug.SRFLX
            goto L_0x00b9
        L_0x00c4:
            java.util.HashMap r3 = r14.d
            java.lang.Object r10 = r3.get(r15)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r13 = r10 + 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.put(r15, r13)
            java.lang.String r3 = r14.h
            int r13 = r14.c
            if (r3 == 0) goto L_0x00e0
            goto L_0x00f9
        L_0x00e0:
            r14.h = r9
            if (r13 == 0) goto L_0x00f3
            if (r13 == r6) goto L_0x00ee
            if (r13 == r2) goto L_0x00e9
            goto L_0x00f7
        L_0x00e9:
            java.lang.String r2 = "server_recv"
            r14.h = r2
            goto L_0x00f7
        L_0x00ee:
            java.lang.String r2 = "server_send"
            r14.h = r2
            goto L_0x00f7
        L_0x00f3:
            java.lang.String r2 = "direct"
            r14.h = r2
        L_0x00f7:
            java.lang.String r3 = r14.h
        L_0x00f9:
            if (r3 != 0) goto L_0x010d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "not logging (unknown?) schema: "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            r12.log(r11, r14)
            goto L_0x0152
        L_0x010d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r10)
            r2.append(r3)
            java.lang.String r15 = r15.a
            r2.append(r15)
            r2.append(r3)
            r2.append(r7)
            r2.append(r3)
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = "0.0.0.0"
        L_0x0132:
            r2.append(r1)
            java.lang.String r15 = r2.toString()
            java.lang.String r1 = "param"
            java.util.Map r15 = java.util.Collections.singletonMap(r1, r15)
            java.lang.String r1 = defpackage.yoc.COLLECTOR_VIDEO
            java.lang.String r2 = "callCandidatesGenerate"
            yoc r14 = r14.a
            r14.log((java.lang.String) r1, (java.lang.String) r2, (java.util.Map) r15)
            goto L_0x0152
        L_0x0149:
            java.lang.String r14 = "not logging (unknown?) type: "
            java.lang.String r14 = r14.concat(r15)
            r12.log(r11, r14)
        L_0x0152:
            long r14 = r5.T0
            r1 = -1
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L_0x015b
            goto L_0x01b4
        L_0x015b:
            android.content.Context r14 = r5.H0
            java.lang.String r15 = "connectivity"
            java.lang.Object r15 = r14.getSystemService(r15)
            android.net.ConnectivityManager r15 = (android.net.ConnectivityManager) r15
            java.lang.String r1 = "phone"
            java.lang.Object r14 = r14.getSystemService(r1)
            android.telephony.TelephonyManager r14 = (android.telephony.TelephonyManager) r14
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r6 = r5.T0
            long r1 = r1 - r6
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            yoc r6 = r5.I0
            java.lang.String r7 = r6.conversationId
            java.lang.String r8 = "vcid"
            r3.put(r8, r7)
            java.lang.String r7 = r4.sdp
            java.lang.String r8 = "candidate_sdp"
            r3.put(r8, r7)
            java.lang.String r7 = r4.sdpMid
            java.lang.String r8 = "candidate_sdp_mid"
            r3.put(r8, r7)
            int r7 = r4.sdpMLineIndex
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "candidate_sdp_m_line_index"
            r3.put(r8, r7)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "stat_time_delta"
            r3.put(r2, r1)
            java.lang.String r14 = defpackage.ur9.b(r15, r14)
            java.lang.String r15 = "network_type"
            r3.put(r15, r14)
            java.lang.String r14 = defpackage.yoc.COLLECTOR_WEBRTC
            java.lang.String r15 = "callStatCandidate"
            r6.log((java.lang.String) r14, (java.lang.String) r15, (java.util.Map) r3)
        L_0x01b4:
            java.util.ArrayList r14 = r5.e1
            r14.add(r4)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "❄ -> ice candidate: "
            r14.<init>(r15)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            voc r15 = r5.J0
            r15.log(r0, r14)
            android.os.Handler r14 = r5.B0
            sx8 r15 = new sx8
            r0 = 19
            r15.<init>(r0, r5, r4)
            r14.post(r15)
            return
        L_0x01d9:
            r5.getClass()
            boolean r14 = r15.addIceCandidate(r4)
            q67 r15 = r5.M0
            long r1 = r15.f
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01f0
            long r1 = android.os.SystemClock.elapsedRealtime()
            r15.f = r1
        L_0x01f0:
            if (r14 != 0) goto L_0x0216
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r5.toString()
            r14.append(r15)
            java.lang.String r15 = ": ❄️ FAILED to add remote ice candidate "
            r14.append(r15)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            java.lang.Exception r15 = new java.lang.Exception
            java.lang.String r1 = "add.ice.candidate.fail"
            r15.<init>(r1)
            voc r1 = r5.J0
            r1.reportException(r0, r14, r15)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uab.accept(java.lang.Object):void");
    }
}
