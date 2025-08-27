package defpackage;

/* renamed from: oy0  reason: default package */
public final /* synthetic */ class oy0 implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz0 b;

    public /* synthetic */ oy0(hz0 hz0, int i) {
        this.a = i;
        this.b = hz0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0319, code lost:
        r26 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.json.JSONObject r35) {
        /*
            r34 = this;
            r7 = r35
            r0 = 14
            r2 = r34
            hz0 r10 = r2.b
            r10.getClass()
            c r2 = new c
            r2.<init>(r0, r10, r7)
            java.util.concurrent.ExecutorService r3 = defpackage.hz0.n2
            r3.execute(r2)
            jz2 r2 = r10.M1
            r2.getClass()
            long r3 = java.lang.System.nanoTime()
            r2.b = r3
            java.lang.String r2 = "notification"
            java.lang.String r11 = r7.getString(r2)
            r11.getClass()
            b51 r12 = defpackage.b51.X
            jme r13 = defpackage.jme.callAcceptedOutgoing
            b51 r2 = defpackage.b51.Z
            xwd r3 = defpackage.xwd.a
            b51 r4 = defpackage.b51.G0
            java.lang.String r5 = "denoiseAnn"
            java.lang.String r6 = "denoise"
            java.lang.String r14 = "reason"
            java.lang.String r0 = "participantId"
            java.lang.String r18 = "audio"
            java.lang.String r19 = "video"
            java.lang.String r9 = "participant"
            java.lang.String r1 = "VideoStreamsParser"
            java.lang.String r15 = "isConcurrent"
            java.lang.String r8 = "mediaModifiers"
            r20 = r15
            java.lang.String r15 = "conversation.ended"
            r21 = r14
            java.lang.String r14 = "ENDED"
            r22 = r4
            java.lang.String r4 = "conversation"
            r23 = r0
            java.lang.String r0 = "roomId"
            r24 = r12
            java.lang.String r12 = "state"
            r25 = r13
            java.lang.String r13 = "OKRTCCall"
            r26 = -1
            int r27 = r11.hashCode()
            switch(r27) {
                case -1970255734: goto L_0x032a;
                case -1946759356: goto L_0x031c;
                case -1837281659: goto L_0x030d;
                case -1824193402: goto L_0x0300;
                case -1326342510: goto L_0x02f3;
                case -1206103903: goto L_0x02e6;
                case -1183787100: goto L_0x02d9;
                case -1136546043: goto L_0x02cb;
                case -1123680175: goto L_0x02bc;
                case -1009634793: goto L_0x02ac;
                case -952973404: goto L_0x029c;
                case -891376444: goto L_0x028c;
                case -855742144: goto L_0x027c;
                case -776083981: goto L_0x026c;
                case -775651618: goto L_0x025c;
                case -615745013: goto L_0x024c;
                case -555091700: goto L_0x023c;
                case -318071351: goto L_0x022c;
                case -299374874: goto L_0x021c;
                case -191501435: goto L_0x020c;
                case -130352389: goto L_0x01fc;
                case -109284890: goto L_0x01ec;
                case -53726114: goto L_0x01dc;
                case -6349260: goto L_0x01cc;
                case 6516608: goto L_0x01bc;
                case 45361494: goto L_0x01ac;
                case 65959073: goto L_0x019c;
                case 148230891: goto L_0x018c;
                case 335380875: goto L_0x017c;
                case 378271103: goto L_0x016c;
                case 540816845: goto L_0x015c;
                case 614369236: goto L_0x014c;
                case 778113871: goto L_0x013c;
                case 1037842889: goto L_0x012c;
                case 1094077426: goto L_0x011c;
                case 1128844070: goto L_0x010c;
                case 1145321190: goto L_0x00fc;
                case 1175114531: goto L_0x00ec;
                case 1323654813: goto L_0x00dc;
                case 1467147485: goto L_0x00cc;
                case 1685715486: goto L_0x00bc;
                case 1736968659: goto L_0x00ac;
                case 1885175990: goto L_0x009c;
                case 1898041858: goto L_0x008c;
                case 2022715558: goto L_0x007c;
                case 2138278323: goto L_0x006c;
                default: goto L_0x0068;
            }
        L_0x0068:
            r27 = r9
            goto L_0x0337
        L_0x006c:
            r27 = r9
            java.lang.String r9 = "settings-update"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0078
            goto L_0x0337
        L_0x0078:
            r9 = 45
            goto L_0x0319
        L_0x007c:
            r27 = r9
            java.lang.String r9 = "promote-participant"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0088
            goto L_0x0337
        L_0x0088:
            r9 = 44
            goto L_0x0319
        L_0x008c:
            r27 = r9
            java.lang.String r9 = "movie-share-stopped"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0098
            goto L_0x0337
        L_0x0098:
            r9 = 43
            goto L_0x0319
        L_0x009c:
            r27 = r9
            java.lang.String r9 = "movie-share-started"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00a8
            goto L_0x0337
        L_0x00a8:
            r9 = 42
            goto L_0x0319
        L_0x00ac:
            r27 = r9
            java.lang.String r9 = "media-settings-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00b8
            goto L_0x0337
        L_0x00b8:
            r9 = 41
            goto L_0x0319
        L_0x00bc:
            r27 = r9
            java.lang.String r9 = "chat-room-updated"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00c8
            goto L_0x0337
        L_0x00c8:
            r9 = 40
            goto L_0x0319
        L_0x00cc:
            r27 = r9
            java.lang.String r9 = "stalled-activity"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00d8
            goto L_0x0337
        L_0x00d8:
            r9 = 39
            goto L_0x0319
        L_0x00dc:
            r27 = r9
            java.lang.String r9 = "features-per-role-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00e8
            goto L_0x0337
        L_0x00e8:
            r9 = 38
            goto L_0x0319
        L_0x00ec:
            r27 = r9
            java.lang.String r9 = "participant-joined"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00f8
            goto L_0x0337
        L_0x00f8:
            r9 = 37
            goto L_0x0319
        L_0x00fc:
            r27 = r9
            java.lang.String r9 = "speaker-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0108
            goto L_0x0337
        L_0x0108:
            r9 = 36
            goto L_0x0319
        L_0x010c:
            r27 = r9
            java.lang.String r9 = "audio-activity"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0118
            goto L_0x0337
        L_0x0118:
            r9 = 35
            goto L_0x0319
        L_0x011c:
            r27 = r9
            java.lang.String r9 = "feature-set-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0128
            goto L_0x0337
        L_0x0128:
            r9 = 34
            goto L_0x0319
        L_0x012c:
            r27 = r9
            java.lang.String r9 = "room-updated"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0138
            goto L_0x0337
        L_0x0138:
            r9 = 33
            goto L_0x0319
        L_0x013c:
            r27 = r9
            java.lang.String r9 = "force-media-settings-change"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0148
            goto L_0x0337
        L_0x0148:
            r9 = 32
            goto L_0x0319
        L_0x014c:
            r27 = r9
            java.lang.String r9 = "transmitted-data"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0158
            goto L_0x0337
        L_0x0158:
            r9 = 31
            goto L_0x0319
        L_0x015c:
            r27 = r9
            java.lang.String r9 = "registered-peer"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0168
            goto L_0x0337
        L_0x0168:
            r9 = 30
            goto L_0x0319
        L_0x016c:
            r27 = r9
            java.lang.String r9 = "mute-participant"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0178
            goto L_0x0337
        L_0x0178:
            r9 = 29
            goto L_0x0319
        L_0x017c:
            r27 = r9
            java.lang.String r9 = "url-sharing-info-updated"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0188
            goto L_0x0337
        L_0x0188:
            r9 = 28
            goto L_0x0319
        L_0x018c:
            r27 = r9
            java.lang.String r9 = "switch-micro"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0198
            goto L_0x0337
        L_0x0198:
            r9 = 27
            goto L_0x0319
        L_0x019c:
            r27 = r9
            java.lang.String r9 = "promotion-approved"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01a8
            goto L_0x0337
        L_0x01a8:
            r9 = 26
            goto L_0x0319
        L_0x01ac:
            r27 = r9
            java.lang.String r9 = "topology-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01b8
            goto L_0x0337
        L_0x01b8:
            r9 = 25
            goto L_0x0319
        L_0x01bc:
            r27 = r9
            java.lang.String r9 = "asr-stopped"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01c8
            goto L_0x0337
        L_0x01c8:
            r9 = 24
            goto L_0x0319
        L_0x01cc:
            r27 = r9
            java.lang.String r9 = "asr-started"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01d8
            goto L_0x0337
        L_0x01d8:
            r9 = 23
            goto L_0x0319
        L_0x01dc:
            r27 = r9
            java.lang.String r9 = "participant-state-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01e8
            goto L_0x0337
        L_0x01e8:
            r9 = 22
            goto L_0x0319
        L_0x01ec:
            r27 = r9
            java.lang.String r9 = "participant-added"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x01f8
            goto L_0x0337
        L_0x01f8:
            r9 = 21
            goto L_0x0319
        L_0x01fc:
            r27 = r9
            java.lang.String r9 = "pin-participant"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0208
            goto L_0x0337
        L_0x0208:
            r9 = 20
            goto L_0x0319
        L_0x020c:
            r27 = r9
            java.lang.String r9 = "feedback"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0218
            goto L_0x0337
        L_0x0218:
            r9 = 19
            goto L_0x0319
        L_0x021c:
            r27 = r9
            java.lang.String r9 = "rooms-updated"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0228
            goto L_0x0337
        L_0x0228:
            r9 = 18
            goto L_0x0319
        L_0x022c:
            r27 = r9
            java.lang.String r9 = "decorative-participant-id-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0238
            goto L_0x0337
        L_0x0238:
            r9 = 17
            goto L_0x0319
        L_0x023c:
            r27 = r9
            java.lang.String r9 = "rate-call-data"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0248
            goto L_0x0337
        L_0x0248:
            r26 = 16
            goto L_0x0337
        L_0x024c:
            r27 = r9
            java.lang.String r9 = "participants-state-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0258
            goto L_0x0337
        L_0x0258:
            r9 = 15
            goto L_0x0319
        L_0x025c:
            r27 = r9
            java.lang.String r9 = "connection"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0268
            goto L_0x0337
        L_0x0268:
            r26 = 14
            goto L_0x0337
        L_0x026c:
            r27 = r9
            java.lang.String r9 = "multiparty-chat-created"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0278
            goto L_0x0337
        L_0x0278:
            r9 = 13
            goto L_0x0319
        L_0x027c:
            r27 = r9
            java.lang.String r9 = "room-participants-updated"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0288
            goto L_0x0337
        L_0x0288:
            r9 = 12
            goto L_0x0319
        L_0x028c:
            r27 = r9
            java.lang.String r9 = "accepted-call"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0298
            goto L_0x0337
        L_0x0298:
            r9 = 11
            goto L_0x0319
        L_0x029c:
            r27 = r9
            java.lang.String r9 = "roles-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02a8
            goto L_0x0337
        L_0x02a8:
            r9 = 10
            goto L_0x0319
        L_0x02ac:
            r27 = r9
            java.lang.String r9 = "realloc-con"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02b8
            goto L_0x0337
        L_0x02b8:
            r9 = 9
            goto L_0x0319
        L_0x02bc:
            r27 = r9
            java.lang.String r9 = "record-stopped"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02c8
            goto L_0x0337
        L_0x02c8:
            r9 = 8
            goto L_0x0319
        L_0x02cb:
            r27 = r9
            java.lang.String r9 = "record-started"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02d7
            goto L_0x0337
        L_0x02d7:
            r9 = 7
            goto L_0x0319
        L_0x02d9:
            r27 = r9
            java.lang.String r9 = "join-link-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02e4
            goto L_0x0337
        L_0x02e4:
            r9 = 6
            goto L_0x0319
        L_0x02e6:
            r27 = r9
            java.lang.String r9 = "hungup"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02f1
            goto L_0x0337
        L_0x02f1:
            r9 = 5
            goto L_0x0319
        L_0x02f3:
            r27 = r9
            java.lang.String r9 = "chat-message"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x02fe
            goto L_0x0337
        L_0x02fe:
            r9 = 4
            goto L_0x0319
        L_0x0300:
            r27 = r9
            java.lang.String r9 = "custom-data"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x030b
            goto L_0x0337
        L_0x030b:
            r9 = 3
            goto L_0x0319
        L_0x030d:
            r27 = r9
            java.lang.String r9 = "options-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0318
            goto L_0x0337
        L_0x0318:
            r9 = 2
        L_0x0319:
            r26 = r9
            goto L_0x0337
        L_0x031c:
            r27 = r9
            java.lang.String r9 = "closed-conversation"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0327
            goto L_0x0337
        L_0x0327:
            r26 = 1
            goto L_0x0337
        L_0x032a:
            r27 = r9
            java.lang.String r9 = "participant-animoji-changed"
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x0335
            goto L_0x0337
        L_0x0335:
            r26 = 0
        L_0x0337:
            switch(r26) {
                case 0: goto L_0x0f04;
                case 1: goto L_0x0eb7;
                case 2: goto L_0x0ead;
                case 3: goto L_0x0ea9;
                case 4: goto L_0x0e9f;
                case 5: goto L_0x0e06;
                case 6: goto L_0x0df7;
                case 7: goto L_0x0df0;
                case 8: goto L_0x0de9;
                case 9: goto L_0x0db6;
                case 10: goto L_0x0d2c;
                case 11: goto L_0x0c1a;
                case 12: goto L_0x0c0f;
                case 13: goto L_0x0bfc;
                case 14: goto L_0x0b4d;
                case 15: goto L_0x0b2b;
                case 16: goto L_0x0b20;
                case 17: goto L_0x0b15;
                case 18: goto L_0x0b0a;
                case 19: goto L_0x0aff;
                case 20: goto L_0x0aa9;
                case 21: goto L_0x0a87;
                case 22: goto L_0x0a72;
                case 23: goto L_0x0a6b;
                case 24: goto L_0x0a64;
                case 25: goto L_0x0a40;
                case 26: goto L_0x0a35;
                case 27: goto L_0x0a12;
                case 28: goto L_0x0a07;
                case 29: goto L_0x09f0;
                case 30: goto L_0x09cf;
                case 31: goto L_0x08c8;
                case 32: goto L_0x088e;
                case 33: goto L_0x0883;
                case 34: goto L_0x082e;
                case 35: goto L_0x081f;
                case 36: goto L_0x080a;
                case 37: goto L_0x06bd;
                case 38: goto L_0x06b2;
                case 39: goto L_0x06a6;
                case 40: goto L_0x069b;
                case 41: goto L_0x05d1;
                case 42: goto L_0x052c;
                case 43: goto L_0x0488;
                case 44: goto L_0x03cd;
                case 45: goto L_0x033c;
                default: goto L_0x033a;
            }
        L_0x033a:
            goto L_0x0f09
        L_0x033c:
            java.lang.String r0 = "screenSharing"
            kbb r0 = defpackage.tf6.G(r7, r0)
            r10.j2 = r0
            java.lang.String r0 = "camera"
            kbb r0 = defpackage.tf6.G(r7, r0)
            r10.k2 = r0
            gm1 r1 = r10.r1
            if (r1 != 0) goto L_0x0351
            goto L_0x0381
        L_0x0351:
            mz9 r2 = r10.w1
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x035d
            boolean r2 = r10.b2
            if (r2 != 0) goto L_0x035d
            kbb r0 = r10.j2
        L_0x035d:
            if (r0 != 0) goto L_0x0360
            goto L_0x0381
        L_0x0360:
            boolean r1 = r1.I()
            if (r1 == 0) goto L_0x0372
            gm1 r1 = r10.r1
            r1.z0 = r0
            jj8 r1 = r1.v0
            if (r1 == 0) goto L_0x0381
            r1.e(r0)
            goto L_0x0381
        L_0x0372:
            gm1 r1 = r10.r1
            r1.z0 = r0
            jj8 r2 = r1.v0
            if (r2 == 0) goto L_0x037e
            r2.e(r0)
            goto L_0x0381
        L_0x037e:
            r1.T(r0)
        L_0x0381:
            boolean r0 = r10.V0
            if (r0 == 0) goto L_0x0f09
            fg0 r0 = r10.U0
            r0.getClass()
            java.lang.String r1 = "settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 == 0) goto L_0x0f09
            java.lang.String r2 = "badNet"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            etg r3 = r0.j
            r3.getClass()
            java.lang.String r4 = "loss"
            java.lang.String r5 = "rtt"
            if (r2 != 0) goto L_0x03a4
            goto L_0x03b0
        L_0x03a4:
            int r6 = r2.optInt(r5)
            r3.a = r6
            double r6 = r2.optDouble(r4)
            r3.b = r6
        L_0x03b0:
            java.lang.String r2 = "goodNet"
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            etg r0 = r0.i
            r0.getClass()
            if (r1 != 0) goto L_0x03bf
            goto L_0x0f09
        L_0x03bf:
            int r2 = r1.optInt(r5)
            r0.a = r2
            double r1 = r1.optDouble(r4)
            r0.b = r1
            goto L_0x0f09
        L_0x03cd:
            java.lang.String r0 = "demote"
            boolean r0 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x03f8 }
            r1 = 1
            r9 = r0 ^ 1
            r10.I1 = r0     // Catch:{ JSONException -> 0x03f8 }
            if (r9 == 0) goto L_0x043d
            org.json.JSONObject r1 = r7.getJSONObject(r4)     // Catch:{ JSONException -> 0x03f8 }
            java.lang.String r4 = r1.getString(r12)     // Catch:{ JSONException -> 0x03f8 }
            boolean r4 = r14.equals(r4)     // Catch:{ JSONException -> 0x03f8 }
            if (r4 == 0) goto L_0x03fb
            zqd r0 = r10.i2     // Catch:{ JSONException -> 0x03f8 }
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ConversationAlreadyEnded r1 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded.INSTANCE     // Catch:{ JSONException -> 0x03f8 }
            r0.B(r1)     // Catch:{ JSONException -> 0x03f8 }
            r1 = 0
            r10.k(r2, r1)     // Catch:{ JSONException -> 0x03f8 }
            r10.p(r1, r15)     // Catch:{ JSONException -> 0x03f8 }
            goto L_0x0f09
        L_0x03f8:
            r0 = move-exception
            goto L_0x046f
        L_0x03fb:
            org.json.JSONObject r2 = r7.optJSONObject(r8)     // Catch:{ JSONException -> 0x03f8 }
            zq0 r4 = r10.x1     // Catch:{ JSONException -> 0x03f8 }
            r4.getClass()     // Catch:{ JSONException -> 0x03f8 }
            if (r2 != 0) goto L_0x0407
            goto L_0x0413
        L_0x0407:
            boolean r6 = r2.optBoolean(r6)     // Catch:{ JSONException -> 0x03f8 }
            r4.a = r6     // Catch:{ JSONException -> 0x03f8 }
            boolean r2 = r2.optBoolean(r5)     // Catch:{ JSONException -> 0x03f8 }
            r4.b = r2     // Catch:{ JSONException -> 0x03f8 }
        L_0x0413:
            r10.g(r1)     // Catch:{ JSONException -> 0x03f8 }
            mc1 r14 = r10.J1     // Catch:{ JSONException -> 0x03f8 }
            java.lang.String r16 = "handlePromoteParticipant"
            kc1 r17 = defpackage.kc1.a     // Catch:{ JSONException -> 0x03f8 }
            r19 = 1
            r9 = r20
            r15 = r1
            r18 = r3
            r14.m(r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x03f8 }
            r2 = 0
            boolean r2 = r7.optBoolean(r9, r2)     // Catch:{ JSONException -> 0x03f8 }
            r3 = 1
            r10.h(r1, r2, r3)     // Catch:{ JSONException -> 0x03f8 }
            r10.l(r7)     // Catch:{ JSONException -> 0x03f8 }
            mz9 r1 = r10.w1     // Catch:{ JSONException -> 0x03f8 }
            boolean r1 = r1.f     // Catch:{ JSONException -> 0x03f8 }
            r10.B(r1)     // Catch:{ JSONException -> 0x03f8 }
            r10.w()     // Catch:{ JSONException -> 0x03f8 }
            goto L_0x045e
        L_0x043d:
            wsb r1 = r10.e2     // Catch:{ JSONException -> 0x03f8 }
            gz0 r2 = defpackage.gz0.v     // Catch:{ JSONException -> 0x03f8 }
            java.lang.Object r1 = r1.a     // Catch:{ JSONException -> 0x03f8 }
            hz0 r1 = (defpackage.hz0) r1     // Catch:{ JSONException -> 0x03f8 }
            java.util.EnumSet r1 = r1.x0     // Catch:{ JSONException -> 0x03f8 }
            boolean r1 = r1.contains(r2)     // Catch:{ JSONException -> 0x03f8 }
            if (r1 != 0) goto L_0x0452
            ef1 r1 = r10.n1     // Catch:{ JSONException -> 0x03f8 }
            r1.h()     // Catch:{ JSONException -> 0x03f8 }
        L_0x0452:
            mc1 r1 = r10.J1     // Catch:{ JSONException -> 0x03f8 }
            r1.getClass()     // Catch:{ JSONException -> 0x03f8 }
            kz9 r2 = new kz9     // Catch:{ JSONException -> 0x03f8 }
            r2.<init>()     // Catch:{ JSONException -> 0x03f8 }
            r1.i = r2     // Catch:{ JSONException -> 0x03f8 }
        L_0x045e:
            mc1 r1 = r10.J1     // Catch:{ JSONException -> 0x03f8 }
            r1.k()     // Catch:{ JSONException -> 0x03f8 }
            jc1 r1 = r10.U1     // Catch:{ JSONException -> 0x03f8 }
            peg r1 = r1.d     // Catch:{ JSONException -> 0x03f8 }
            r1.onMeInWaitingRoomChanged(r0)     // Catch:{ JSONException -> 0x03f8 }
            r10.x()     // Catch:{ JSONException -> 0x03f8 }
            goto L_0x0f09
        L_0x046f:
            voc r1 = r10.T0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handlePromoteParticipant "
            r2.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.logException(r13, r2, r0)
            goto L_0x0f09
        L_0x0488:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.b
            r2 = r0
            aqg r2 = (defpackage.aqg) r2
            java.lang.Object r0 = r2.b
            r3 = r0
            u6h r3 = (defpackage.u6h) r3
            r3.getClass()
            fu9 r0 = defpackage.u6h.f(r35)     // Catch:{ all -> 0x049c }
            goto L_0x04a8
        L_0x049c:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "Can't parse stop movie notification"
            java.lang.Object r3 = r3.b
            voc r3 = (defpackage.voc) r3
            r3.logException(r1, r0, r4)
            r0 = 0
        L_0x04a8:
            if (r0 != 0) goto L_0x04ac
            goto L_0x0f09
        L_0x04ac:
            java.lang.Object r1 = r2.a
            ef1 r1 = (defpackage.ef1) r1
            ue1 r3 = r0.a
            ye1 r3 = r1.j(r3)
            if (r3 == 0) goto L_0x0521
            java.util.List r3 = r3.q
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x04c3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x04e5
            java.lang.Object r5 = r3.next()
            r6 = r5
            st9 r6 = (defpackage.st9) r6
            vt9 r7 = r6.a
            vt9 r8 = r0.c
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x04e1
            au9 r6 = r6.d
            au9 r7 = r0.d
            if (r6 != r7) goto L_0x04e1
            goto L_0x04c3
        L_0x04e1:
            r4.add(r5)
            goto L_0x04c3
        L_0x04e5:
            v9a r3 = new v9a
            r5 = 16
            r3.<init>((int) r5)
            v9a r6 = new v9a
            r6.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r8 = new v9a
            r8.<init>((int) r5)
            v9a r9 = new v9a
            r9.<init>((int) r5)
            xga r5 = new xga
            r12 = 1
            r5.<init>(r12, r4)
            v8b r4 = new v8b
            ue1 r12 = r0.a
            r20 = r4
            r21 = r12
            r22 = r3
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r3 = 0
            r1.f(r4, r3)
        L_0x0521:
            b51 r1 = defpackage.b51.T0
            java.lang.Object r2 = r2.c
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r2.invoke(r1, r0)
            goto L_0x0f09
        L_0x052c:
            n09 r2 = r10.S1
            java.lang.Object r2 = r2.b
            aqg r2 = (defpackage.aqg) r2
            java.lang.String r4 = "Can't parse movie"
            java.lang.Object r5 = r2.b
            u6h r5 = (defpackage.u6h) r5
            java.lang.Object r5 = r5.b
            voc r5 = (defpackage.voc) r5
            java.lang.String r6 = "movieShareInfo"
            org.json.JSONObject r6 = r7.getJSONObject(r6)     // Catch:{ all -> 0x055e }
            boolean r8 = r7.has(r0)     // Catch:{ all -> 0x055e }
            if (r8 == 0) goto L_0x0551
            int r0 = r7.optInt(r0)     // Catch:{ all -> 0x055e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x055e }
            goto L_0x0552
        L_0x0551:
            r0 = 0
        L_0x0552:
            if (r0 == 0) goto L_0x0560
            int r0 = r0.intValue()     // Catch:{ all -> 0x055e }
            ywd r3 = new ywd     // Catch:{ all -> 0x055e }
            r3.<init>(r0)     // Catch:{ all -> 0x055e }
            goto L_0x0560
        L_0x055e:
            r0 = move-exception
            goto L_0x056c
        L_0x0560:
            cu9 r0 = defpackage.u6h.d(r6, r3)     // Catch:{ all -> 0x0565 }
            goto L_0x0570
        L_0x0565:
            r0 = move-exception
            r3 = r0
            r5.logException(r1, r4, r3)     // Catch:{ all -> 0x055e }
        L_0x056a:
            r0 = 0
            goto L_0x0570
        L_0x056c:
            r5.logException(r1, r4, r0)
            goto L_0x056a
        L_0x0570:
            if (r0 != 0) goto L_0x0574
            goto L_0x0f09
        L_0x0574:
            java.lang.Object r1 = r2.a
            ef1 r1 = (defpackage.ef1) r1
            ue1 r3 = r0.a
            ye1 r3 = r1.j(r3)
            if (r3 != 0) goto L_0x0582
            goto L_0x0f09
        L_0x0582:
            java.util.List r3 = r3.q
            st9 r4 = r0.c
            java.util.List r3 = kotlin.collections.CollectionsKt.plus(r3, r4)
            v9a r4 = new v9a
            r5 = 16
            r4.<init>((int) r5)
            v9a r6 = new v9a
            r6.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r8 = new v9a
            r8.<init>((int) r5)
            v9a r9 = new v9a
            r9.<init>((int) r5)
            xga r5 = new xga
            r12 = 1
            r5.<init>(r12, r3)
            v8b r3 = new v8b
            ue1 r12 = r0.a
            r20 = r3
            r21 = r12
            r22 = r4
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r4 = 0
            r1.f(r3, r4)
            b51 r1 = defpackage.b51.R0
            java.lang.Object r2 = r2.c
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r2.invoke(r1, r0)
            goto L_0x0f09
        L_0x05d1:
            java.lang.String r0 = "handleMediaSettingsChanged"
            voc r1 = r10.T0
            r1.log(r13, r0)
            ue1 r3 = defpackage.tf6.E(r35)
            ef1 r0 = r10.n1
            ye1 r0 = r0.a
            ue1 r0 = r0.a
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05ea
            goto L_0x0f09
        L_0x05ea:
            ef1 r0 = r10.n1
            ye1 r0 = r0.j(r3)
            if (r0 != 0) goto L_0x0602
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "participant.is.null"
            r1.<init>(r2)
            java.lang.String r2 = "ms.changed.npe"
            r0.reportException(r13, r2, r1)
            goto L_0x0f09
        L_0x0602:
            mz9 r1 = defpackage.tf6.q(r35)
            if (r1 != 0) goto L_0x0618
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "no.mediasettings.in.notification"
            r1.<init>(r2)
            java.lang.String r2 = "ms.changed.absent"
            r0.reportException(r13, r2, r1)
            goto L_0x0f09
        L_0x0618:
            kz9 r2 = new kz9
            kz9 r4 = r0.b
            ft8 r5 = r4.a
            ft8 r6 = r4.b
            ft8 r7 = r4.c
            ft8 r4 = r4.d
            r2.<init>(r5, r6, r7, r4)
            ft8 r4 = defpackage.ft8.o
            if (r5 != r4) goto L_0x0639
            mz9 r5 = r0.c
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x0639
            boolean r5 = r1.e
            if (r5 != 0) goto L_0x0639
            ft8 r5 = defpackage.ft8.c
            r2.a = r5
        L_0x0639:
            if (r6 != r4) goto L_0x0649
            mz9 r5 = r0.c
            boolean r5 = r5.f
            if (r5 == 0) goto L_0x0649
            boolean r5 = r1.f
            if (r5 != 0) goto L_0x0649
            ft8 r5 = defpackage.ft8.c
            r2.b = r5
        L_0x0649:
            if (r7 != r4) goto L_0x0659
            mz9 r4 = r0.c
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x0659
            boolean r4 = r1.b
            if (r4 != 0) goto L_0x0659
            ft8 r4 = defpackage.ft8.c
            r2.c = r4
        L_0x0659:
            mz9 r0 = r0.c
            boolean r0 = r0.g
            boolean r4 = r1.g
            if (r0 == r4) goto L_0x0666
            hr6 r0 = r10.C1
            r0.getClass()
        L_0x0666:
            ef1 r0 = r10.n1
            v9a r4 = new v9a
            r5 = 16
            r4.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r8 = new v9a
            r8.<init>((int) r5)
            v9a r9 = new v9a
            r9.<init>((int) r5)
            xga r5 = new xga
            r6 = 1
            r5.<init>(r6, r2)
            xga r12 = new xga
            r12.<init>(r6, r1)
            v8b r1 = new v8b
            r2 = r1
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r0.f(r1, r2)
            b51 r0 = defpackage.b51.w
            r10.k(r0, r2)
            goto L_0x0f09
        L_0x069b:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.v
            m8g r0 = (defpackage.m8g) r0
            r0.a(r7)
            goto L_0x0f09
        L_0x06a6:
            java.lang.String r0 = "stalledParticipants"
            java.util.ArrayList r0 = defpackage.tf6.R(r7, r0)
            if (r0 == 0) goto L_0x0f09
            r10.H1 = r0
            goto L_0x0f09
        L_0x06b2:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.c
            eud r0 = (defpackage.eud) r0
            r0.H(r7)
            goto L_0x0f09
        L_0x06bd:
            java.lang.String r0 = "handleParticipantJoined"
            voc r1 = r10.T0
            r1.log(r13, r0)
            r0 = r27
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            ue1 r1 = defpackage.tf6.F(r0)
            ef1 r2 = r10.n1
            ye1 r2 = r2.a
            ue1 r2 = r2.a
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0f09
            mc1 r4 = r10.J1
            kz9 r2 = r4.h(r3)
            java.util.EnumMap r8 = r2.a()
            java.lang.String r7 = "handleParticipantJoined"
            r9 = 1
            r5 = r0
            r6 = r1
            kz9 r2 = r4.f(r5, r6, r7, r8, r9)
            mz9 r4 = defpackage.tf6.q(r0)
            java.lang.String r5 = "joined.notify"
            if (r4 != 0) goto L_0x0701
            voc r6 = r10.T0
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "joined.notify.mediaSettings.is.null"
            r7.<init>(r8)
            r6.logException(r13, r5, r7)
        L_0x0701:
            kotlin.Pair r6 = defpackage.tf6.s(r0)
            ef1 r7 = r10.n1
            ye1 r7 = r7.j(r1)
            if (r6 == 0) goto L_0x0735
            if (r7 == 0) goto L_0x0735
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x0735
            kotlin.Pair r8 = r7.j
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0735
            kotlin.Pair r8 = defpackage.ye1.r
            kotlin.Pair r7 = r7.j
            boolean r7 = java.util.Objects.equals(r8, r7)
            if (r7 != 0) goto L_0x0735
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "joined.notify.participant.aready.exist"
            r1.<init>(r2)
            r0.logException(r13, r5, r1)
            goto L_0x0f09
        L_0x0735:
            ef1 r5 = r10.n1
            v9a r7 = new v9a
            r8 = 16
            r7.<init>((int) r8)
            v9a r9 = new v9a
            r9.<init>((int) r8)
            xga r8 = new xga
            r14 = 1
            r8.<init>(r14, r6)
            xga r6 = new xga
            r6.<init>(r14, r2)
            if (r4 == 0) goto L_0x0758
            xga r2 = new xga
            r2.<init>(r14, r4)
            r30 = r2
            goto L_0x075a
        L_0x0758:
            r30 = r7
        L_0x075a:
            java.util.ArrayList r2 = defpackage.tf6.A(r0)
            xga r4 = new xga
            r4.<init>(r14, r2)
            e51 r2 = defpackage.tf6.m(r0)
            if (r2 == 0) goto L_0x0771
            xga r7 = new xga
            r7.<init>(r14, r2)
            r32 = r7
            goto L_0x0773
        L_0x0771:
            r32 = r9
        L_0x0773:
            bae r2 = r10.R1
            u6h r2 = r2.a
            java.util.List r2 = r2.p(r0, r3)
            xga r7 = new xga
            r7.<init>(r14, r2)
            v8b r2 = new v8b
            r26 = r2
            r27 = r1
            r28 = r8
            r29 = r6
            r31 = r4
            r33 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            ye1 r1 = r5.f(r2, r3)
            java.lang.String r0 = r0.optString(r12)
            boolean r2 = r1.b()
            if (r2 != 0) goto L_0x07ac
            java.lang.String r2 = "ACCEPTED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07ac
            kotlin.Pair r0 = defpackage.ye1.r
            r1.e(r0)
        L_0x07ac:
            gm1 r0 = r10.r1
            r2 = 1
            r0.u(r1, r2)
            boolean r0 = r10.z0
            if (r0 == 0) goto L_0x0f09
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Opponent accepted (joined) call: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            voc r2 = r10.T0
            r2.log(r13, r0)
            mz9 r0 = r1.c
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x07d4
            r0 = r19
        L_0x07d1:
            r8 = r25
            goto L_0x07d7
        L_0x07d4:
            r0 = r18
            goto L_0x07d1
        L_0x07d7:
            r10.u(r8, r0)
            boolean r0 = r10.I0
            if (r0 != 0) goto L_0x07f6
            android.os.Handler r0 = r10.y
            haf r1 = r10.H0
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r10.y
            haf r1 = r10.H0
            te1 r2 = r10.X
            se1 r2 = r2.b
            r2.getClass()
            r2 = 30000(0x7530, float:4.2039E-41)
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L_0x07f6:
            r1 = 1
            r10.q1 = r1
            pv0 r0 = r10.R0
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0802
            r0.b()
        L_0x0802:
            r9 = r24
            r1 = 0
            r10.k(r9, r1)
            goto L_0x0f09
        L_0x080a:
            java.lang.String r0 = "speaker"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0815 }
            ue1 r15 = defpackage.ue1.b(r0)     // Catch:{ JSONException -> 0x0815 }
            goto L_0x0816
        L_0x0815:
            r15 = 0
        L_0x0816:
            if (r15 == 0) goto L_0x0f09
            ef1 r0 = r10.n1
            r0.o(r15)
            goto L_0x0f09
        L_0x081f:
            java.lang.String r0 = "activeParticipants"
            java.util.ArrayList r0 = defpackage.tf6.R(r7, r0)
            if (r0 == 0) goto L_0x0f09
            ef1 r1 = r10.n1
            r1.q(r0)
            goto L_0x0f09
        L_0x082e:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.c
            eud r0 = (defpackage.eud) r0
            r0.z(r7)
            java.lang.String r0 = "handleFeatureSetChanged"
            voc r1 = r10.T0
            r1.log(r13, r0)
            java.lang.String r0 = "features"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            if (r0 == 0) goto L_0x085e
            r1 = 0
        L_0x0847:
            int r2 = r0.length()
            if (r1 >= r2) goto L_0x085e
            java.lang.String r2 = r0.optString(r1)
            java.lang.String r3 = "ADD_PARTICIPANT"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x085b
            r1 = 1
            goto L_0x085f
        L_0x085b:
            r2 = 1
            int r1 = r1 + r2
            goto L_0x0847
        L_0x085e:
            r1 = 0
        L_0x085f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "setFeatureAddParticipantEnabled, "
            r0.<init>(r2)
            boolean r2 = defpackage.ur9.a
            if (r1 == 0) goto L_0x086d
            java.lang.String r2 = "yes"
            goto L_0x086f
        L_0x086d:
            java.lang.String r2 = "no"
        L_0x086f:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            voc r2 = r10.T0
            r2.log(r13, r0)
            boolean r0 = r10.v1
            if (r0 == r1) goto L_0x0f09
            r10.v1 = r1
            goto L_0x0f09
        L_0x0883:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.a
            pv0 r0 = (defpackage.pv0) r0
            r0.e(r7)
            goto L_0x0f09
        L_0x088e:
            java.lang.String r0 = "handleForceChangeMediaSettings"
            voc r1 = r10.T0
            r1.log(r13, r0)
            mz9 r0 = defpackage.tf6.q(r35)
            if (r0 != 0) goto L_0x08ab
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "ms.force.change.no.mediasettings"
            r1.<init>(r2)
            java.lang.String r2 = "ms.force.change.npe"
            r0.reportException(r13, r2, r1)
            goto L_0x0f09
        L_0x08ab:
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x0f09
            mz9 r0 = r10.w1
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0f09
            if (r1 == 0) goto L_0x08bd
            r1 = 0
            r0.e = r1
            r0.a()
        L_0x08bd:
            b51 r0 = defpackage.b51.z0
            r1 = 0
            r10.k(r0, r1)
            r10.x()
            goto L_0x0f09
        L_0x08c8:
            java.lang.String r0 = "handleTransmittedDataNotification"
            voc r1 = r10.T0
            r1.log(r13, r0)
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            java.lang.String r1 = "sdp"
            org.json.JSONObject r2 = r0.optJSONObject(r1)
            if (r2 == 0) goto L_0x08f1
            org.webrtc.SessionDescription r15 = new org.webrtc.SessionDescription
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)
            org.webrtc.SessionDescription$Type r4 = org.webrtc.SessionDescription.Type.fromCanonicalForm(r4)
            java.lang.String r1 = r2.getString(r1)
            r15.<init>(r4, r1)
            goto L_0x08f2
        L_0x08f1:
            r15 = 0
        L_0x08f2:
            if (r15 == 0) goto L_0x09af
            ue1 r0 = defpackage.tf6.E(r35)
            kotlin.Pair r1 = defpackage.tf6.s(r35)
            org.webrtc.SessionDescription$Type r2 = r15.type
            org.webrtc.SessionDescription$Type r4 = org.webrtc.SessionDescription.Type.OFFER
            if (r2 != r4) goto L_0x0921
            ef1 r1 = r10.n1
            ye1 r1 = r1.j(r0)
            if (r1 != 0) goto L_0x091a
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "td.sdp.unknown.participant"
            r1.<init>(r2)
            java.lang.String r2 = "td.sdp.npe"
            r0.logException(r13, r2, r1)
            goto L_0x0f09
        L_0x091a:
            gm1 r1 = r10.r1
            r1.t(r0, r15)
            goto L_0x0f09
        L_0x0921:
            org.webrtc.SessionDescription$Type r4 = org.webrtc.SessionDescription.Type.ANSWER
            if (r2 != r4) goto L_0x0f09
            if (r1 == 0) goto L_0x0f09
            ef1 r2 = r10.n1
            v9a r4 = new v9a
            r5 = 16
            r4.<init>((int) r5)
            v9a r6 = new v9a
            r6.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r8 = new v9a
            r8.<init>((int) r5)
            v9a r9 = new v9a
            r9.<init>((int) r5)
            v9a r12 = new v9a
            r12.<init>((int) r5)
            v8b r5 = new v8b
            r20 = r5
            r21 = r0
            r22 = r4
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            ye1 r2 = r2.f(r5, r3)
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x0f09
            kotlin.Pair r4 = defpackage.ye1.r
            kotlin.Pair r2 = r2.j
            boolean r2 = java.util.Objects.equals(r4, r2)
            if (r2 == 0) goto L_0x0f09
            ef1 r2 = r10.n1
            v9a r4 = new v9a
            r5 = 16
            r4.<init>((int) r5)
            v9a r6 = new v9a
            r6.<init>((int) r5)
            v9a r7 = new v9a
            r7.<init>((int) r5)
            v9a r8 = new v9a
            r8.<init>((int) r5)
            v9a r9 = new v9a
            r9.<init>((int) r5)
            xga r5 = new xga
            r12 = 1
            r5.<init>(r12, r1)
            v8b r1 = new v8b
            r20 = r1
            r21 = r0
            r22 = r5
            r23 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r2.f(r1, r3)
            goto L_0x0f09
        L_0x09af:
            java.lang.String r1 = "candidate"
            boolean r1 = r0.has(r1)
            if (r1 != 0) goto L_0x0f09
            java.lang.String r1 = "candidates-removed"
            boolean r0 = r0.has(r1)
            if (r0 != 0) goto L_0x0f09
            voc r0 = r10.T0
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "transmitted.data.has.unknown.type"
            r1.<init>(r2)
            java.lang.String r2 = "unhandled.transmitted.data"
            r0.logException(r13, r2, r1)
            goto L_0x0f09
        L_0x09cf:
            b51 r0 = defpackage.b51.Y
            r1 = 0
            r10.k(r0, r1)
            ef1 r0 = r10.n1
            ue1 r1 = defpackage.tf6.E(r35)
            kotlin.Pair r2 = defpackage.tf6.s(r35)
            java.lang.String r3 = "platform"
            java.lang.String r3 = r7.optString(r3)
            java.lang.String r4 = "clientType"
            java.lang.String r4 = r7.optString(r4)
            r0.l(r1, r2, r3, r4)
            goto L_0x0f09
        L_0x09f0:
            mc1 r1 = r10.J1
            r1.getClass()
            r1.b(r7)     // Catch:{ JSONException -> 0x09fa }
            goto L_0x0f09
        L_0x09fa:
            r0 = move-exception
            r2 = r0
            voc r0 = r1.b
            java.lang.String r1 = "CallMediaOptionsDelegate"
            java.lang.String r3 = "can't handle mute participant"
            r0.logException(r1, r3, r2)
            goto L_0x0f09
        L_0x0a07:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.y
            npg r0 = (defpackage.npg) r0
            r0.O(r7)
            goto L_0x0f09
        L_0x0a12:
            java.lang.String r0 = "mute"
            boolean r1 = r7.has(r0)
            if (r1 == 0) goto L_0x0a2c
            boolean r0 = r7.getBoolean(r0)
            if (r0 == 0) goto L_0x0a24
            b51 r0 = defpackage.b51.A0
        L_0x0a22:
            r1 = 0
            goto L_0x0a27
        L_0x0a24:
            b51 r0 = defpackage.b51.B0
            goto L_0x0a22
        L_0x0a27:
            r10.k(r0, r1)
            goto L_0x0f09
        L_0x0a2c:
            java.lang.String r0 = "switch-micro without 'mute'"
            voc r1 = r10.T0
            r1.log(r13, r0)
            goto L_0x0f09
        L_0x0a35:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.v
            m8g r0 = (defpackage.m8g) r0
            r0.b(r7)
            goto L_0x0f09
        L_0x0a40:
            java.lang.String r0 = "handleNewTopology"
            voc r1 = r10.T0
            r1.log(r13, r0)
            java.lang.String r0 = "topology"
            java.lang.String r0 = r7.getString(r0)
            xnf r0 = defpackage.xnf.a(r0)
            gm1 r1 = r10.r1
            boolean r1 = r1.H(r0)
            if (r1 != 0) goto L_0x0a5d
            r1 = 0
            r10.e(r0, r1)
        L_0x0a5d:
            gm1 r0 = r10.r1
            r10.c(r0)
            goto L_0x0f09
        L_0x0a64:
            d01 r0 = r10.Y1
            r0.c(r7)
            goto L_0x0f09
        L_0x0a6b:
            d01 r0 = r10.Y1
            r0.b(r7)
            goto L_0x0f09
        L_0x0a72:
            bae r0 = r10.R1
            dd4 r0 = r0.e
            we1 r0 = r0.d(r7)
            if (r0 == 0) goto L_0x0f09
            jc1 r1 = r10.U1
            a9b r1 = r1.n
            ue1 r2 = r0.b
            r1.onStateChanged(r2, r0)
            goto L_0x0f09
        L_0x0a87:
            r0 = r27
            java.lang.String r1 = "handleParticipantAdded"
            voc r2 = r10.T0
            r2.log(r13, r1)
            ue1 r1 = defpackage.tf6.E(r35)
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            ef1 r2 = r10.n1
            ye1 r2 = r2.a
            ue1 r2 = r2.a
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0f09
            r10.y(r1, r0)
            goto L_0x0f09
        L_0x0aa9:
            r1 = r23
            java.lang.String r1 = r7.optString(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0ab7
            goto L_0x0f09
        L_0x0ab7:
            ue1 r1 = defpackage.ue1.a(r1)
            java.lang.String r2 = "unpin"
            r3 = 0
            boolean r2 = r7.optBoolean(r2, r3)
            mc1 r3 = r10.J1
            r3.i(r1, r2)
            boolean r3 = r7.has(r0)
            if (r3 == 0) goto L_0x0ad6
            int r0 = r7.optInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0ad7
        L_0x0ad6:
            r0 = 0
        L_0x0ad7:
            if (r0 == 0) goto L_0x0aee
            int r3 = r0.intValue()
            if (r3 <= 0) goto L_0x0aee
            yj1 r3 = r10.W1
            ywd r4 = new ywd
            int r0 = r0.intValue()
            r4.<init>(r0)
            r3.b(r2, r1, r4)
            goto L_0x0af6
        L_0x0aee:
            if (r2 == 0) goto L_0x0af4
            r2 = 0
            r10.G1 = r2
            goto L_0x0af6
        L_0x0af4:
            r10.G1 = r1
        L_0x0af6:
            ue1 r0 = r10.G1
            r1 = r22
            r10.k(r1, r0)
            goto L_0x0f09
        L_0x0aff:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.o
            m7f r0 = (defpackage.m7f) r0
            r0.n(r7)
            goto L_0x0f09
        L_0x0b0a:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.a
            pv0 r0 = (defpackage.pv0) r0
            r0.f(r7)
            goto L_0x0f09
        L_0x0b15:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.x
            o5h r0 = (defpackage.o5h) r0
            r0.z(r7)
            goto L_0x0f09
        L_0x0b20:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.w
            ppc r0 = (defpackage.ppc) r0
            r0.onRateCall(r7)
            goto L_0x0f09
        L_0x0b2b:
            bae r0 = r10.R1
            dd4 r0 = r0.e
            java.util.List r0 = r0.c(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0b37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0f09
            java.lang.Object r1 = r0.next()
            we1 r1 = (defpackage.we1) r1
            jc1 r2 = r10.U1
            a9b r2 = r2.n
            ue1 r3 = r1.b
            r2.onStateChanged(r3, r1)
            goto L_0x0b37
        L_0x0b4d:
            r9 = r20
            r1 = 0
            java.lang.String r0 = "handleConnection"
            voc r1 = r10.T0
            r1.log(r13, r0)
            org.json.JSONObject r0 = r7.getJSONObject(r4)
            org.json.JSONObject r1 = r7.optJSONObject(r8)
            zq0 r4 = r10.x1
            r4.getClass()
            if (r1 != 0) goto L_0x0b67
            goto L_0x0b73
        L_0x0b67:
            boolean r6 = r1.optBoolean(r6)
            r4.a = r6
            boolean r1 = r1.optBoolean(r5)
            r4.b = r1
        L_0x0b73:
            r10.g(r0)
            mc1 r1 = r10.J1
            kc1 r17 = defpackage.kc1.a
            java.lang.String r16 = "handleConnection"
            r19 = 1
            r4 = r14
            r14 = r1
            r1 = r15
            r6 = 0
            r15 = r0
            r18 = r3
            r14.m(r15, r16, r17, r18, r19)
            boolean r3 = r7.getBoolean(r9)
            r5 = 0
            r10.h(r0, r3, r5)
            r10.l(r7)
            java.lang.String r3 = "stamp"
            r8 = 0
            long r7 = r7.optLong(r3, r8)
            rjf r3 = r10.D1
            defpackage.y64.F(r3, r7)
            boolean r3 = r10.I1
            if (r3 != 0) goto L_0x0bbd
            java.lang.String r0 = r0.getString(r12)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0bbd
            zqd r0 = r10.i2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ConversationAlreadyEnded r3 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded.INSTANCE
            r0.B(r3)
            r10.k(r2, r6)
            r10.p(r6, r1)
            goto L_0x0f09
        L_0x0bbd:
            ru.ok.android.externcalls.sdk.b r0 = r10.Z0
            if (r0 == 0) goto L_0x0bc4
            r0.a(r10)
        L_0x0bc4:
            boolean r0 = r10.I1
            if (r0 == 0) goto L_0x0bd4
            mc1 r0 = r10.J1
            r0.getClass()
            kz9 r1 = new kz9
            r1.<init>()
            r0.i = r1
        L_0x0bd4:
            mc1 r0 = r10.J1
            r0.k()
            b51 r0 = defpackage.b51.D0
            r10.k(r0, r6)
            boolean r0 = r10.G0
            if (r0 != 0) goto L_0x0bf2
            boolean r0 = r10.z0
            if (r0 == 0) goto L_0x0bf2
            te1 r0 = r10.X
            re1 r0 = r0.B
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0bf2
            r10.C()
            goto L_0x0bf5
        L_0x0bf2:
            r10.x()
        L_0x0bf5:
            sp5 r0 = r10.a2
            r0.d()
            goto L_0x0f09
        L_0x0bfc:
            java.lang.String r0 = "chatId"
            long r0 = r7.getLong(r0)
            r10.d1 = r0
            b51 r2 = defpackage.b51.x0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.k(r2, r0)
            goto L_0x0f09
        L_0x0c0f:
            n09 r0 = r10.S1
            java.lang.Object r0 = r0.a
            pv0 r0 = (defpackage.pv0) r0
            r0.d(r7)
            goto L_0x0f09
        L_0x0c1a:
            r9 = r24
            r8 = r25
            r6 = 0
            java.lang.String r0 = "handleAcceptCallNotification"
            voc r1 = r10.T0
            r1.log(r13, r0)
            ue1 r0 = defpackage.tf6.E(r35)
            ef1 r1 = r10.n1
            ye1 r1 = r1.a
            ue1 r1 = r1.a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0c42
            b51 r0 = defpackage.b51.o
            r10.k(r0, r6)
            java.lang.String r0 = "accepted.on.other.device"
            r10.p(r6, r0)
            goto L_0x0f09
        L_0x0c42:
            boolean r1 = r10.I0
            if (r1 != 0) goto L_0x0c63
            android.os.Handler r1 = r10.y
            haf r2 = r10.H0
            r1.removeCallbacks(r2)
            android.os.Handler r1 = r10.y
            haf r2 = r10.H0
            te1 r3 = r10.X
            se1 r3 = r3.b
            r3.getClass()
            r3 = 30000(0x7530, float:4.2039E-41)
            long r3 = (long) r3
            r1.postDelayed(r2, r3)
            gm1 r1 = r10.r1
            r1.J()
        L_0x0c63:
            pv0 r1 = r10.R0
            boolean r2 = r1.b
            if (r2 != 0) goto L_0x0c6d
            r1.b()
            goto L_0x0c80
        L_0x0c6d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "New accept from participantId="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            voc r2 = r10.T0
            r2.log(r13, r1)
        L_0x0c80:
            mc1 r1 = r10.J1
            ef1 r2 = r10.n1
            zwd r2 = r2.k
            kz9 r2 = r1.h(r2)
            java.util.EnumMap r5 = r2.a()
            java.lang.String r4 = "handleAcceptCall"
            r12 = 1
            r2 = r35
            r3 = r0
            r14 = r6
            r6 = r12
            kz9 r1 = r1.f(r2, r3, r4, r5, r6)
            mz9 r2 = defpackage.tf6.q(r35)
            if (r2 == 0) goto L_0x0d22
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x0ca7
            r3 = r19
            goto L_0x0ca9
        L_0x0ca7:
            r3 = r18
        L_0x0ca9:
            r10.u(r8, r3)
            ef1 r3 = r10.n1     // Catch:{ IllegalStateException -> 0x0d09 }
            v9a r4 = new v9a     // Catch:{ IllegalStateException -> 0x0d09 }
            r5 = 16
            r4.<init>((int) r5)     // Catch:{ IllegalStateException -> 0x0d09 }
            kotlin.Pair r5 = defpackage.tf6.s(r35)     // Catch:{ IllegalStateException -> 0x0d09 }
            xga r6 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r8 = 1
            r6.<init>(r8, r5)     // Catch:{ IllegalStateException -> 0x0d09 }
            xga r5 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r5.<init>(r8, r1)     // Catch:{ IllegalStateException -> 0x0d09 }
            xga r1 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r1.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d09 }
            java.util.ArrayList r2 = defpackage.tf6.A(r35)     // Catch:{ IllegalStateException -> 0x0d09 }
            xga r12 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r12.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d09 }
            e51 r2 = defpackage.tf6.m(r35)     // Catch:{ IllegalStateException -> 0x0d09 }
            if (r2 == 0) goto L_0x0cdd
            xga r4 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r4.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d09 }
        L_0x0cdd:
            r26 = r4
            bae r2 = r10.R1     // Catch:{ IllegalStateException -> 0x0d09 }
            u6h r2 = r2.a     // Catch:{ IllegalStateException -> 0x0d09 }
            ef1 r4 = r10.n1     // Catch:{ IllegalStateException -> 0x0d09 }
            zwd r4 = r4.k     // Catch:{ IllegalStateException -> 0x0d09 }
            java.util.List r2 = r2.p(r7, r4)     // Catch:{ IllegalStateException -> 0x0d09 }
            xga r4 = new xga     // Catch:{ IllegalStateException -> 0x0d09 }
            r7 = 1
            r4.<init>(r7, r2)     // Catch:{ IllegalStateException -> 0x0d09 }
            v8b r2 = new v8b     // Catch:{ IllegalStateException -> 0x0d09 }
            r20 = r2
            r21 = r0
            r22 = r6
            r23 = r5
            r24 = r1
            r25 = r12
            r27 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IllegalStateException -> 0x0d09 }
            r3.f(r2, r14)     // Catch:{ IllegalStateException -> 0x0d09 }
        L_0x0d07:
            r1 = 1
            goto L_0x0d12
        L_0x0d09:
            r0 = move-exception
            voc r1 = r10.T0
            java.lang.String r2 = "accept.call.add"
            r1.reportException(r13, r2, r0)
            goto L_0x0d07
        L_0x0d12:
            r10.q1 = r1
            boolean r0 = r10.z0
            if (r0 == 0) goto L_0x0d1b
            r10.k(r9, r14)
        L_0x0d1b:
            sp5 r0 = r10.a2
            r0.c()
            goto L_0x0f09
        L_0x0d22:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = r35.toString()
            r0.<init>(r1)
            throw r0
        L_0x0d2c:
            r1 = r23
            java.lang.String r0 = r7.optString(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0d3a
            goto L_0x0f09
        L_0x0d3a:
            ue1 r1 = defpackage.ue1.a(r0)
            java.lang.String r0 = "roles"
            org.json.JSONArray r2 = r7.optJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r2 == 0) goto L_0x0d6d
            r4 = 0
        L_0x0d4c:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0d5f }
            if (r4 >= r0) goto L_0x0d6d
            java.lang.String r0 = r2.getString(r4)     // Catch:{ JSONException -> 0x0d5f }
            xe1 r0 = defpackage.xe1.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0d62 }
            r3.add(r0)     // Catch:{ IllegalArgumentException -> 0x0d62 }
        L_0x0d5d:
            r5 = 1
            goto L_0x0d6b
        L_0x0d5f:
            r0 = move-exception
            r5 = 1
            goto L_0x0d6f
        L_0x0d62:
            r0 = move-exception
            voc r5 = r10.T0     // Catch:{ JSONException -> 0x0d5f }
            java.lang.String r6 = "invalid ROLE in handleRolesChanged"
            r5.logException(r13, r6, r0)     // Catch:{ JSONException -> 0x0d5f }
            goto L_0x0d5d
        L_0x0d6b:
            int r4 = r4 + r5
            goto L_0x0d4c
        L_0x0d6d:
            r5 = 1
            goto L_0x0d76
        L_0x0d6f:
            voc r2 = r10.T0
            java.lang.String r4 = "handleRolesChanged"
            r2.logException(r13, r4, r0)
        L_0x0d76:
            mc1 r0 = r10.J1
            r0.j(r3, r1)
            ef1 r0 = r10.n1
            ye1 r0 = r0.j(r1)
            if (r0 == 0) goto L_0x0daf
            java.util.ArrayList r1 = r0.d
            r1.clear()
            r1.addAll(r3)
            ef1 r1 = r10.n1
            ye1 r1 = r1.a
            if (r0 != r1) goto L_0x0daf
            yj1 r2 = r10.W1
            java.util.List r1 = r1.e
            java.util.Iterator r1 = r1.iterator()
        L_0x0d99:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0dab
            java.lang.Object r3 = r1.next()
            xe1 r3 = (defpackage.xe1) r3
            xe1 r4 = defpackage.xe1.b
            if (r3 != r4) goto L_0x0d99
            r1 = r5
            goto L_0x0dac
        L_0x0dab:
            r1 = 0
        L_0x0dac:
            r2.c(r1)
        L_0x0daf:
            b51 r1 = defpackage.b51.E0
            r10.k(r1, r0)
            goto L_0x0f09
        L_0x0db6:
            java.lang.String r0 = "target"
            java.lang.String r1 = "CONSUMER"
            java.lang.String r0 = r7.optString(r0, r1)
            boolean r0 = r1.equals(r0)
            te1 r1 = r10.X
            boolean r1 = r1.m
            if (r1 == 0) goto L_0x0dca
            goto L_0x0f09
        L_0x0dca:
            gm1 r1 = r10.r1
            xnf r2 = defpackage.xnf.o
            boolean r1 = r1.H(r2)
            if (r1 == 0) goto L_0x0f09
            if (r0 == 0) goto L_0x0ddb
            r1 = 0
            r10.e(r2, r1)
            goto L_0x0de2
        L_0x0ddb:
            gm1 r0 = r10.r1
            ktd r0 = (defpackage.ktd) r0
            r0.V()
        L_0x0de2:
            gm1 r0 = r10.r1
            r10.c(r0)
            goto L_0x0f09
        L_0x0de9:
            lg1 r0 = r10.X1
            r0.c(r7)
            goto L_0x0f09
        L_0x0df0:
            lg1 r0 = r10.X1
            r0.b(r7)
            goto L_0x0f09
        L_0x0df7:
            java.lang.String r0 = "joinLink"
            java.lang.String r0 = r7.optString(r0)
            r10.D0 = r0
            b51 r1 = defpackage.b51.Q0
            r10.k(r1, r0)
            goto L_0x0f09
        L_0x0e06:
            r1 = r22
            r14 = 0
            java.lang.String r0 = "handleHungup"
            voc r2 = r10.T0
            r2.log(r13, r0)
            ue1 r0 = defpackage.tf6.E(r35)
            ef1 r2 = r10.n1
            ye1 r2 = r2.a
            ue1 r2 = r2.a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0e69
            r3 = r21
            java.lang.String r1 = r7.getString(r3)
            java.lang.String r0 = "explanationHtml"
            java.lang.String r2 = r7.optString(r0)
            java.lang.String r0 = "We were removed from the conversation, reason = "
            java.lang.String r0 = defpackage.a81.m(r0, r1)
            voc r3 = r10.T0
            r3.log(r13, r0)
            nw6 r15 = defpackage.nw6.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0e3c }
            goto L_0x0e42
        L_0x0e3c:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
            r15 = r14
        L_0x0e42:
            r10.O0 = r15
            y9e r0 = defpackage.y9e.a(r1)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r0 = defpackage.y64.s(r0)
            zqd r1 = r10.i2
            r1.B(r0)
            java.util.HashSet r0 = defpackage.tf6.a0(r35)
            b51 r1 = defpackage.b51.c
            lw6 r3 = new lw6
            r3.<init>(r0, r2)
            r10.k(r1, r3)
            r1 = 0
            r10.I1 = r1
            java.lang.String r0 = "removed"
            r10.p(r14, r0)
            goto L_0x0f09
        L_0x0e69:
            pt6 r2 = r10.h1
            ef1 r3 = r10.n1
            ye1 r3 = r3.j(r0)
            if (r3 == 0) goto L_0x0e7b
            java.lang.Object r2 = r2.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            r2.remove(r3)
            goto L_0x0e7e
        L_0x0e7b:
            r2.getClass()
        L_0x0e7e:
            ef1 r2 = r10.n1
            r2.getClass()
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r0)
            java.util.List r2 = r2.m(r14, r3)
            java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
            ye1 r2 = (defpackage.ye1) r2
            ue1 r2 = r10.G1
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0f09
            r10.G1 = r14
            r10.k(r1, r14)
            goto L_0x0f09
        L_0x0e9f:
            n09 r0 = r10.S1
            xe8 r0 = r0.e()
            r0.s(r7)
            goto L_0x0f09
        L_0x0ea9:
            r10.n(r7)
            goto L_0x0f09
        L_0x0ead:
            java.lang.String r0 = "options"
            org.json.JSONArray r0 = r7.getJSONArray(r0)
            r10.f(r0)
            goto L_0x0f09
        L_0x0eb7:
            r3 = r21
            r14 = 0
            java.lang.String r0 = "handleCloseConversation"
            voc r1 = r10.T0
            r1.log(r13, r0)
            r1 = 0
            r10.q1 = r1
            java.lang.String r1 = r7.optString(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0eee
            nw6 r15 = defpackage.nw6.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0ed3 }
            goto L_0x0ed9
        L_0x0ed3:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ IllegalArgumentException -> 0x0edc }
            r15 = r14
        L_0x0ed9:
            r10.O0 = r15     // Catch:{ IllegalArgumentException -> 0x0edc }
            goto L_0x0eee
        L_0x0edc:
            voc r0 = r10.T0
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "close.conversation.notify.unknown.reason."
            java.lang.String r4 = defpackage.a81.m(r4, r1)
            r3.<init>(r4)
            java.lang.String r4 = "close.conversation.notify"
            r0.logException(r13, r4, r3)
        L_0x0eee:
            y9e r0 = defpackage.y9e.a(r1)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r0 = defpackage.y64.s(r0)
            zqd r1 = r10.i2
            r1.B(r0)
            r10.k(r2, r14)
            java.lang.String r0 = "conversation_closed"
            r10.p(r14, r0)
            goto L_0x0f09
        L_0x0f04:
            hr6 r0 = r10.C1
            r0.getClass()
        L_0x0f09:
            jz2 r0 = r10.M1
            java.lang.String r1 = "notification handling of "
            java.lang.String r1 = r1.concat(r11)
            r0.X(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy0.a(org.json.JSONObject):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        if (r8.contains(r10) != false) goto L_0x020b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.json.JSONObject r13) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            r12.a(r13)
            return
        L_0x0009:
            hz0 r12 = r12.b
            voc r13 = r12.T0
            java.lang.String r0 = "OKRTCCall"
            java.lang.String r1 = "onAcceptedCommandSent"
            r13.log(r0, r1)
            pv0 r13 = r12.R0
            boolean r0 = r13.b
            if (r0 != 0) goto L_0x001d
            r13.b()
        L_0x001d:
            gm1 r13 = r12.r1
            r12.c(r13)
            boolean r13 = r12.I0
            if (r13 != 0) goto L_0x003c
            android.os.Handler r13 = r12.y
            te1 r0 = r12.X
            se1 r0 = r0.b
            r0.getClass()
            r0 = 30000(0x7530, float:4.2039E-41)
            long r0 = (long) r0
            haf r2 = r12.H0
            r13.postDelayed(r2, r0)
            gm1 r13 = r12.r1
            r13.J()
        L_0x003c:
            b51 r13 = defpackage.b51.X
            r0 = 0
            r12.k(r13, r0)
            sp5 r12 = r12.a2
            j50 r13 = r12.d
            r13.e()
            em4 r12 = r12.f
            boolean r13 = r12.b
            if (r13 == 0) goto L_0x0050
            goto L_0x006c
        L_0x0050:
            boolean r13 = r12.a
            if (r13 == 0) goto L_0x0055
            goto L_0x006c
        L_0x0055:
            java.lang.Object r13 = r12.c
            rjf r13 = (defpackage.rjf) r13
            sjf r13 = (defpackage.sjf) r13
            r13.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r12.h = r13
            java.lang.String r13 = "server_incoming"
            r12.g = r13
        L_0x006c:
            return
        L_0x006d:
            hz0 r12 = r12.b
            r12.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleSignalingError, "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            voc r1 = r12.T0
            java.lang.String r2 = "OKRTCCall"
            r1.log(r2, r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.optString(r0)
            java.lang.String r3 = "error"
            java.lang.String r4 = r13.optString(r3)
            java.lang.String r5 = "reason"
            java.lang.String r5 = r13.optString(r5)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "rtc.error."
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12.v(r0)
            java.lang.String r0 = "conversation-ended"
            boolean r0 = r0.equals(r4)
            r3 = 0
            zqd r6 = r12.i2
            java.lang.String r7 = "signaling.error."
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "conversation-not-found"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "illegal-conversation-state"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "no-call"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "call-unfeasible"
            boolean r8 = r0.equals(r4)
            java.lang.String r9 = "status"
            if (r8 == 0) goto L_0x00ff
            k51 r8 = defpackage.k51.c
            k51 r10 = defpackage.k51.a
            k51 r11 = defpackage.k51.b
            k51[] r8 = new defpackage.k51[]{r8, r10, r11}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.String r10 = r13.optString(r9)
            k51 r10 = defpackage.k51.valueOf(r10)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
            r10 = r3
        L_0x00f7:
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x00ff
            goto L_0x020b
        L_0x00ff:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = r13.optString(r9)
            defpackage.k51.valueOf(r0)     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            b51 r0 = defpackage.b51.C0
            ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError r1 = new ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError
            java.lang.String r2 = "message"
            java.lang.String r2 = r13.optString(r2)
            java.lang.String r3 = "stamp"
            r13.getLong(r3)
            java.lang.String r3 = "sequence"
            r13.getLong(r3)
            r1.<init>(r2)
            r12.k(r0, r1)
            goto L_0x0232
        L_0x0128:
            java.lang.String r0 = "invalid-token"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013c
            o9e r13 = r12.x
            r13.g()
            b51 r13 = defpackage.b51.z
            r12.k(r13, r3)
            goto L_0x0232
        L_0x013c:
            java.lang.String r0 = "service-unavailable"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0155
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
            goto L_0x0232
        L_0x0155:
            java.lang.String r0 = "illegal-participant-state"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "state"
            java.lang.String r13 = r13.optString(r0)
            java.lang.String r0 = "ACCEPTED"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x0177
            b51 r13 = defpackage.b51.o
            r12.k(r13, r3)
            java.lang.String r13 = "accepted.on.other.device.error"
            r12.p(r3, r13)
            goto L_0x0232
        L_0x0177:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
            goto L_0x0232
        L_0x0188:
            java.lang.String r0 = "conversation-recording"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x019f
            rk3 r12 = r12.b1
            if (r12 == 0) goto L_0x0232
            java.lang.String r0 = "description"
            java.lang.String r13 = r13.optString(r0)
            r12.accept(r13)
            goto L_0x0232
        L_0x019f:
            java.lang.String r0 = "invalid-request"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r13 = "invalid.request"
            r12.o(r13)
            goto L_0x0232
        L_0x01ae:
            java.lang.String r0 = "gen.obsoleteClient"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01fb
            nw6 r0 = defpackage.nw6.w
            r12.O0 = r0
            java.lang.String r0 = "explanationHtml"
            java.lang.String r13 = r13.optString(r0)
            if (r13 == 0) goto L_0x01c8
            lw6 r0 = new lw6
            r0.<init>(r3, r13)
            goto L_0x01c9
        L_0x01c8:
            r0 = r3
        L_0x01c9:
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ObsoleteClient r1 = new ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ObsoleteClient
            r1.<init>(r13)
            r6.B(r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            b51 r1 = defpackage.b51.c
            r12.k(r1, r0)
            o9e r0 = r12.x
            if (r0 == 0) goto L_0x01e9
            r0.g()
        L_0x01e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "conversation_ended."
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.p(r3, r13)
            goto L_0x0232
        L_0x01fb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r7)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r1.log(r2, r12)
            goto L_0x0232
        L_0x020b:
            if (r5 == 0) goto L_0x0223
            nw6 r3 = defpackage.nw6.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0212 }
            goto L_0x0216
        L_0x0212:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0216:
            r12.O0 = r3
            y9e r13 = defpackage.y9e.a(r5)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r13 = defpackage.y64.s(r13)
            r6.B(r13)
        L_0x0223:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy0.k(org.json.JSONObject):void");
    }
}
