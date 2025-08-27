package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: gs2  reason: default package */
public final class gs2 extends r75 {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs2(Object obj, OneMeRoomDatabase oneMeRoomDatabase, int i) {
        super((i6d) oneMeRoomDatabase);
        this.o = i;
        this.v = obj;
    }

    public final String F() {
        switch (this.o) {
            case 0:
                return "INSERT OR REPLACE INTO `chats` (`id`,`server_id`,`data`,`favourite_index`,`sort_time`,`cid`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `messages` (`id`,`server_id`,`time`,`update_time`,`sender`,`cid`,`text`,`delivery_status`,`status`,`time_local`,`error`,`localized_error`,`attaches`,`media_type`,`detect_share`,`msg_link_type`,`msg_link_id`,`inserted_from_msg_link`,`msg_link_chat_id`,`msg_link_chat_name`,`msg_link_chat_link`,`msg_link_out_chat_id`,`msg_link_out_msg_id`,`type`,`chat_id`,`ttl`,`channel_views`,`channel_forwards`,`view_time`,`zoom`,`options`,`live_until`,`elements`,`reactions`,`delayed_attrs_time_to_fire`,`delayed_attrs_notify_sender`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `tasks` (`id`,`type`,`status`,`fails_count`,`depends_request_id`,`dependency_type`,`data`,`created_time`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x061e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0657  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x067f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(defpackage.gf6 r19, java.lang.Object r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            java.lang.Object r10 = r0.v
            r11 = 1
            int r0 = r0.o
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x005b;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = r20
            vdf r0 = (defpackage.vdf) r0
            long r12 = r0.a
            r1.k(r11, r12)
            hef r10 = (defpackage.hef) r10
            o9a r2 = r10.c
            r2.getClass()
            idb r2 = r0.b
            int r2 = r2.a
            long r11 = (long) r2
            r1.k(r9, r11)
            o9a r2 = r10.c
            r2.getClass()
            gef r2 = r0.c
            int r2 = r2.a
            long r9 = (long) r2
            r1.k(r8, r9)
            int r2 = r0.d
            long r8 = (long) r2
            r1.k(r7, r8)
            long r7 = r0.e
            r1.k(r6, r7)
            int r2 = r0.f
            long r6 = (long) r2
            r1.k(r5, r6)
            byte[] r2 = r0.g
            if (r2 != 0) goto L_0x0052
            r1.X(r4)
            goto L_0x0055
        L_0x0052:
            r1.l(r4, r2)
        L_0x0055:
            long r4 = r0.h
            r1.k(r3, r4)
            return
        L_0x005b:
            r0 = r20
            ya9 r0 = (defpackage.ya9) r0
            long r12 = r0.a
            r1.k(r11, r12)
            long r11 = r0.b
            r1.k(r9, r11)
            long r11 = r0.c
            r1.k(r8, r11)
            long r8 = r0.d
            r1.k(r7, r8)
            long r7 = r0.e
            r1.k(r6, r7)
            long r6 = r0.f
            r1.k(r5, r6)
            java.lang.String r5 = r0.g
            if (r5 != 0) goto L_0x0085
            r1.X(r4)
            goto L_0x0088
        L_0x0085:
            r1.h(r4, r5)
        L_0x0088:
            aj9 r10 = (defpackage.aj9) r10
            hp9 r4 = r10.a()
            r4.getClass()
            oa9 r4 = r0.h
            int r4 = r4.a
            long r4 = (long) r4
            r1.k(r3, r4)
            hp9 r3 = r10.a()
            r3.getClass()
            qe9 r3 = r0.i
            int r3 = r3.a
            r4 = 9
            long r5 = (long) r3
            r1.k(r4, r5)
            r3 = 10
            long r4 = r0.j
            r1.k(r3, r4)
            r3 = 11
            java.lang.String r4 = r0.k
            if (r4 != 0) goto L_0x00bb
            r1.X(r3)
            goto L_0x00be
        L_0x00bb:
            r1.h(r3, r4)
        L_0x00be:
            r3 = 12
            java.lang.String r4 = r0.l
            if (r4 != 0) goto L_0x00c8
            r1.X(r3)
            goto L_0x00cb
        L_0x00c8:
            r1.h(r3, r4)
        L_0x00cb:
            hp9 r3 = r10.a()
            r3.getClass()
            w28 r3 = r0.m
            if (r3 == 0) goto L_0x00df
            ru.ok.tamtam.nano.Protos$Attaches r3 = ru.ok.tamtam.nano.b.f(r3)
            byte[] r3 = defpackage.ad9.toByteArray(r3)
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            r4 = 13
            if (r3 != 0) goto L_0x00e8
            r1.X(r4)
            goto L_0x00eb
        L_0x00e8:
            r1.l(r4, r3)
        L_0x00eb:
            int r3 = r0.n
            long r3 = (long) r3
            r5 = 14
            r1.k(r5, r3)
            boolean r3 = r0.o
            long r3 = (long) r3
            r5 = 15
            r1.k(r5, r3)
            int r3 = r0.p
            long r3 = (long) r3
            r5 = 16
            r1.k(r5, r3)
            r3 = 17
            long r4 = r0.q
            r1.k(r3, r4)
            boolean r3 = r0.r
            long r3 = (long) r3
            r5 = 18
            r1.k(r5, r3)
            r3 = 19
            long r4 = r0.s
            r1.k(r3, r4)
            r3 = 20
            java.lang.String r4 = r0.t
            if (r4 != 0) goto L_0x0123
            r1.X(r3)
            goto L_0x0126
        L_0x0123:
            r1.h(r3, r4)
        L_0x0126:
            r3 = 21
            java.lang.String r4 = r0.u
            if (r4 != 0) goto L_0x0130
            r1.X(r3)
            goto L_0x0133
        L_0x0130:
            r1.h(r3, r4)
        L_0x0133:
            r3 = 22
            long r4 = r0.v
            r1.k(r3, r4)
            r3 = 23
            long r4 = r0.w
            r1.k(r3, r4)
            hp9 r3 = r10.a()
            r3.getClass()
            int r3 = r0.J
            int r3 = defpackage.wj6.d(r3)
            r4 = 24
            long r5 = (long) r3
            r1.k(r4, r5)
            r3 = 25
            long r4 = r0.x
            r1.k(r3, r4)
            int r3 = r0.y
            long r3 = (long) r3
            r5 = 26
            r1.k(r5, r3)
            int r3 = r0.z
            long r3 = (long) r3
            r5 = 27
            r1.k(r5, r3)
            int r3 = r0.A
            long r3 = (long) r3
            r5 = 28
            r1.k(r5, r3)
            r3 = 29
            long r4 = r0.B
            r1.k(r3, r4)
            int r3 = r0.C
            long r3 = (long) r3
            r5 = 30
            r1.k(r5, r3)
            int r3 = r0.D
            long r3 = (long) r3
            r5 = 31
            r1.k(r5, r3)
            r3 = 32
            long r4 = r0.E
            r1.k(r3, r4)
            hp9 r3 = r10.a()
            r3.getClass()
            java.util.List r3 = r0.F
            byte[] r3 = defpackage.ua9.b(r3)
            r4 = 33
            if (r3 != 0) goto L_0x01a6
            r1.X(r4)
            goto L_0x01a9
        L_0x01a6:
            r1.l(r4, r3)
        L_0x01a9:
            hp9 r3 = r10.a()
            r3.getClass()
            xd9 r3 = r0.G
            byte[] r3 = defpackage.hp9.c(r3)
            r4 = 34
            if (r3 != 0) goto L_0x01be
            r1.X(r4)
            goto L_0x01c1
        L_0x01be:
            r1.l(r4, r3)
        L_0x01c1:
            r3 = 35
            java.lang.Long r4 = r0.H
            if (r4 != 0) goto L_0x01cb
            r1.X(r3)
            goto L_0x01d2
        L_0x01cb:
            long r4 = r4.longValue()
            r1.k(r3, r4)
        L_0x01d2:
            java.lang.Boolean r0 = r0.I
            if (r0 != 0) goto L_0x01d8
            r2 = 0
            goto L_0x01e0
        L_0x01d8:
            boolean r0 = r0.booleanValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x01e0:
            r0 = 36
            if (r2 != 0) goto L_0x01e8
            r1.X(r0)
            goto L_0x01f0
        L_0x01e8:
            int r2 = r2.intValue()
            long r2 = (long) r2
            r1.k(r0, r2)
        L_0x01f0:
            return
        L_0x01f1:
            r0 = r20
            n82 r0 = (defpackage.n82) r0
            long r3 = r0.a
            r1.k(r11, r3)
            long r3 = r0.b
            r1.k(r9, r3)
            hs2 r10 = (defpackage.hs2) r10
            wy2 r3 = r10.a()
            r3.getClass()
            byte[] r4 = ru.ok.tamtam.nano.b.a
            ru.ok.tamtam.nano.Protos$Chat r4 = new ru.ok.tamtam.nano.Protos$Chat
            r4.<init>()
            m72 r10 = r0.c
            long r12 = r10.a
            r4.serverId = r12
            l72 r12 = r10.b
            int r12 = r12.ordinal()
            r13 = 0
            if (r12 == 0) goto L_0x0224
            if (r12 == r11) goto L_0x022a
            if (r12 == r9) goto L_0x0228
            if (r12 == r8) goto L_0x0226
        L_0x0224:
            r12 = r13
            goto L_0x022b
        L_0x0226:
            r12 = r8
            goto L_0x022b
        L_0x0228:
            r12 = r9
            goto L_0x022b
        L_0x022a:
            r12 = r11
        L_0x022b:
            r4.type = r12
            k72 r12 = r10.c
            int r12 = r12.ordinal()
            switch(r12) {
                case 1: goto L_0x0242;
                case 2: goto L_0x0240;
                case 3: goto L_0x023e;
                case 4: goto L_0x023c;
                case 5: goto L_0x023a;
                case 6: goto L_0x0238;
                default: goto L_0x0236;
            }
        L_0x0236:
            r12 = r13
            goto L_0x0243
        L_0x0238:
            r12 = r5
            goto L_0x0243
        L_0x023a:
            r12 = r6
            goto L_0x0243
        L_0x023c:
            r12 = r7
            goto L_0x0243
        L_0x023e:
            r12 = r8
            goto L_0x0243
        L_0x0240:
            r12 = r9
            goto L_0x0243
        L_0x0242:
            r12 = r11
        L_0x0243:
            r4.status = r12
            long r14 = r10.d
            r4.owner = r14
            java.util.Map r12 = r10.e
            r4.participants = r12
            long r14 = r10.f
            r4.created = r14
            java.lang.String r12 = ""
            java.lang.String r14 = r10.g
            if (r14 != 0) goto L_0x0258
            r14 = r12
        L_0x0258:
            r4.title = r14
            java.lang.String r14 = r10.h
            if (r14 != 0) goto L_0x025f
            r14 = r12
        L_0x025f:
            r4.baseIconUrl = r14
            java.lang.String r14 = r10.i
            if (r14 != 0) goto L_0x0266
            r14 = r12
        L_0x0266:
            r4.baseRawIconUrl = r14
            long r14 = r10.j
            r4.lastMessageId = r14
            long r14 = r10.k
            r4.lastEventTime = r14
            long r14 = r10.P
            r4.joinTime = r14
            long r14 = r10.l
            r4.cid = r14
            int r14 = r10.m
            r4.newMessages = r14
            boolean r14 = r10.k0
            r4.markedAsUnread = r14
            bl4 r14 = defpackage.bl4.REGULAR
            g72 r15 = r10.n
            java.util.ArrayList r14 = r15.d(r14)
            int r5 = r14.size()
            if (r5 <= 0) goto L_0x02a6
            ru.ok.tamtam.nano.Protos$Chat$Chunk[] r6 = new ru.ok.tamtam.nano.Protos.Chat.Chunk[r5]
            r4.chunk = r6
            r6 = r13
        L_0x0293:
            if (r6 >= r5) goto L_0x02a6
            ru.ok.tamtam.nano.Protos$Chat$Chunk[] r7 = r4.chunk
            java.lang.Object r16 = r14.get(r6)
            f72 r16 = (defpackage.f72) r16
            ru.ok.tamtam.nano.Protos$Chat$Chunk r16 = ru.ok.tamtam.nano.b.j(r16)
            r7[r6] = r16
            int r6 = r6 + r11
            r7 = 4
            goto L_0x0293
        L_0x02a6:
            bl4 r5 = defpackage.bl4.DELAYED
            java.util.ArrayList r5 = r15.d(r5)
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x02c9
            ru.ok.tamtam.nano.Protos$Chat$Chunk[] r7 = new ru.ok.tamtam.nano.Protos.Chat.Chunk[r6]
            r4.delayedChunk = r7
            r7 = r13
        L_0x02b7:
            if (r7 >= r6) goto L_0x02c9
            ru.ok.tamtam.nano.Protos$Chat$Chunk[] r14 = r4.delayedChunk
            java.lang.Object r15 = r5.get(r7)
            f72 r15 = (defpackage.f72) r15
            ru.ok.tamtam.nano.Protos$Chat$Chunk r15 = ru.ok.tamtam.nano.b.j(r15)
            r14[r7] = r15
            int r7 = r7 + r11
            goto L_0x02b7
        L_0x02c9:
            java.lang.String r5 = r10.o
            if (r5 != 0) goto L_0x02ce
            r5 = r12
        L_0x02ce:
            r4.lastInput = r5
            d72 r5 = r10.a()
            if (r5 == 0) goto L_0x032d
            ru.ok.tamtam.nano.Protos$Chat$ChatSettings r6 = new ru.ok.tamtam.nano.Protos$Chat$ChatSettings
            r6.<init>()
            long r14 = r5.c
            r6.lastNotifMark = r14
            long r14 = r5.d
            r6.lastNotifMessageId = r14
            long r14 = r5.a
            r6.dontDisturbUntil = r14
            java.util.List r7 = r5.b
            int r14 = r7.size()
            if (r14 <= 0) goto L_0x031f
            int r14 = r7.size()
            int[] r14 = new int[r14]
            r6.options = r14
            r14 = r13
        L_0x02f8:
            int r15 = r7.size()
            if (r14 >= r15) goto L_0x031f
            java.lang.Object r15 = r7.get(r14)
            a72 r15 = (defpackage.a72) r15
            int r15 = r15.ordinal()
            if (r15 == 0) goto L_0x0319
            if (r15 == r11) goto L_0x0314
            if (r15 == r9) goto L_0x030f
            goto L_0x031d
        L_0x030f:
            int[] r15 = r6.options
            r15[r14] = r9
            goto L_0x031d
        L_0x0314:
            int[] r15 = r6.options
            r15[r14] = r11
            goto L_0x031d
        L_0x0319:
            int[] r15 = r6.options
            r15[r14] = r13
        L_0x031d:
            int r14 = r14 + r11
            goto L_0x02f8
        L_0x031f:
            long r14 = r5.e
            r6.favoriteIndex = r14
            long r14 = r5.f
            r6.hideMyLiveLocationPanelBeforeTime = r14
            long r14 = r5.g
            r6.hideLiveLocationPanelBeforeTime = r14
            r4.chatSettings = r6
        L_0x032d:
            z62 r5 = r10.q
            if (r5 == 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            z62 r5 = defpackage.z62.g
        L_0x0334:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaAll = r5
            z62 r5 = r10.r
            if (r5 == 0) goto L_0x033f
            goto L_0x0341
        L_0x033f:
            z62 r5 = defpackage.z62.g
        L_0x0341:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaPhotoVideo = r5
            z62 r5 = r10.t
            if (r5 == 0) goto L_0x034c
            goto L_0x034e
        L_0x034c:
            z62 r5 = defpackage.z62.g
        L_0x034e:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaMusic = r5
            z62 r5 = r10.u
            if (r5 == 0) goto L_0x0359
            goto L_0x035b
        L_0x0359:
            z62 r5 = defpackage.z62.g
        L_0x035b:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaAudio = r5
            z62 r5 = r10.v
            if (r5 == 0) goto L_0x0366
            goto L_0x0368
        L_0x0366:
            z62 r5 = defpackage.z62.g
        L_0x0368:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaFiles = r5
            z62 r5 = r10.w
            if (r5 == 0) goto L_0x0373
            goto L_0x0375
        L_0x0373:
            z62 r5 = defpackage.z62.g
        L_0x0375:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaLocations = r5
            z62 r5 = r10.s
            if (r5 == 0) goto L_0x0380
            goto L_0x0382
        L_0x0380:
            z62 r5 = defpackage.z62.g
        L_0x0382:
            ru.ok.tamtam.nano.Protos$Chat$ChatMedia r5 = ru.ok.tamtam.nano.b.h(r5)
            r4.mediaShare = r5
            long r5 = r10.x
            r4.firstMessageId = r5
            java.util.List r5 = r10.y
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x03d3
            int r6 = r5.size()
            ru.ok.tamtam.nano.Protos$Chat$Section[] r6 = new ru.ok.tamtam.nano.Protos.Chat.Section[r6]
            r4.sections = r6
            r6 = r13
        L_0x039d:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x03d3
            java.lang.Object r7 = r5.get(r6)
            j72 r7 = (defpackage.j72) r7
            ru.ok.tamtam.nano.Protos$Chat$Section r14 = new ru.ok.tamtam.nano.Protos$Chat$Section
            r14.<init>()
            java.lang.String r15 = r7.a
            r14.id = r15
            java.lang.String r15 = r7.b
            if (r15 != 0) goto L_0x03b7
            r15 = r12
        L_0x03b7:
            r14.title = r15
            java.util.List r15 = r7.c
            long[] r15 = defpackage.cjf.i(r15)
            r14.stickers = r15
            r18 = r3
            long r2 = r7.d
            r14.marker = r2
            boolean r2 = r7.e
            r14.collapsed = r2
            ru.ok.tamtam.nano.Protos$Chat$Section[] r2 = r4.sections
            r2[r6] = r14
            int r6 = r6 + r11
            r3 = r18
            goto L_0x039d
        L_0x03d3:
            r18 = r3
            java.util.List r2 = r10.B
            if (r2 == 0) goto L_0x03e9
            java.util.List r3 = r10.z
            int r5 = r3.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r3 = r3.toArray(r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r4.stickersOrder = r3
        L_0x03e9:
            long r5 = r10.A
            r4.stickersSyncTime = r5
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x042a
            int r3 = r2.size()
            int[] r3 = new int[r3]
            r4.localChanges = r3
            r3 = r13
        L_0x03fc:
            int r5 = r2.size()
            if (r3 >= r5) goto L_0x042a
            java.lang.Object r5 = r2.get(r3)
            x62 r5 = (defpackage.x62) r5
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0424
            if (r5 == r11) goto L_0x041f
            if (r5 == r9) goto L_0x041a
            if (r5 == r8) goto L_0x0415
            goto L_0x0428
        L_0x0415:
            int[] r5 = r4.localChanges
            r5[r3] = r8
            goto L_0x0428
        L_0x041a:
            int[] r5 = r4.localChanges
            r5[r3] = r9
            goto L_0x0428
        L_0x041f:
            int[] r5 = r4.localChanges
            r5[r3] = r11
            goto L_0x0428
        L_0x0424:
            int[] r5 = r4.localChanges
            r5[r3] = r13
        L_0x0428:
            int r3 = r3 + r11
            goto L_0x03fc
        L_0x042a:
            e72 r2 = r10.C
            if (r2 == 0) goto L_0x043c
            long[] r2 = r2.a
            int r3 = r2.length
            if (r3 <= 0) goto L_0x043c
            ru.ok.tamtam.nano.Protos$Chat$ChatSubject r3 = new ru.ok.tamtam.nano.Protos$Chat$ChatSubject
            r3.<init>()
            r3.organizationIds = r2
            r4.chatSubject = r3
        L_0x043c:
            int r2 = r10.r0
            int r2 = defpackage.tr1.y(r2)
            if (r2 == 0) goto L_0x044a
            if (r2 == r11) goto L_0x0447
            goto L_0x044c
        L_0x0447:
            r4.accessType = r11
            goto L_0x044c
        L_0x044a:
            r4.accessType = r13
        L_0x044c:
            int r2 = r10.c()
            r4.participantsCount = r2
            java.lang.String r2 = r10.E
            if (r2 != 0) goto L_0x0457
            r2 = r12
        L_0x0457:
            r4.description = r2
            java.util.List r2 = r10.F
            long[] r2 = defpackage.cjf.i(r2)
            r4.admins = r2
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map r3 = r10.R
            int r5 = r3.size()
            r2.<init>(r5)
            java.util.Set r5 = r3.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0474:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04a4
            java.lang.Object r6 = r5.next()
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.Object r7 = r3.get(r6)
            v62 r7 = (defpackage.v62) r7
            ru.ok.tamtam.nano.Protos$Chat$AdminParticipant r14 = new ru.ok.tamtam.nano.Protos$Chat$AdminParticipant
            r14.<init>()
            long r8 = r7.a
            r14.id = r8
            int r8 = r7.b
            r14.permissions = r8
            long r8 = r7.c
            r14.inviterId = r8
            java.lang.String r7 = r7.d
            if (r7 != 0) goto L_0x049c
            r7 = r12
        L_0x049c:
            r14.alias = r7
            r2.put(r6, r14)
            r8 = 3
            r9 = 2
            goto L_0x0474
        L_0x04a4:
            r4.adminParticipants = r2
            int r2 = r10.G
            r4.blockedParticipantsCount = r2
            b72 r2 = r10.H
            if (r2 == 0) goto L_0x04d9
            ru.ok.tamtam.nano.Protos$Chat$ChatOptions r3 = new ru.ok.tamtam.nano.Protos$Chat$ChatOptions
            r3.<init>()
            r4.chatOptions = r3
            boolean r5 = r2.a
            r3.signAdmin = r5
            boolean r5 = r2.b
            r3.onlyOwnerCanChangeIconTitle = r5
            boolean r5 = r2.c
            r3.official = r5
            boolean r5 = r2.e
            r3.allCanPinMessage = r5
            boolean r5 = r2.d
            r3.onlyAdminCanAddMember = r5
            boolean r5 = r2.f
            r3.onlyAdminCanCall = r5
            boolean r5 = r2.g
            r3.sentByPhone = r5
            boolean r5 = r2.h
            r3.serviceChat = r5
            boolean r2 = r2.i
            r3.membersCanSeePrivateLink = r2
        L_0x04d9:
            r2 = 0
            r4.channelInfo = r2
            java.lang.String r3 = r10.I
            if (r3 != 0) goto L_0x04e1
            r3 = r12
        L_0x04e1:
            r4.link = r3
            jq5 r3 = r10.J
            if (r3 == 0) goto L_0x04ea
            int r3 = r3.b
            goto L_0x04eb
        L_0x04ea:
            r3 = r13
        L_0x04eb:
            r4.restrictions = r3
            h72 r3 = r10.K
            if (r3 == 0) goto L_0x0543
            ru.ok.tamtam.nano.Protos$Chat$GroupChatInfo r5 = new ru.ok.tamtam.nano.Protos$Chat$GroupChatInfo
            r5.<init>()
            long r6 = r3.a
            r5.groupId = r6
            boolean r6 = r3.b
            r5.isAnswered = r6
            boolean r6 = r3.c
            r5.isModerator = r6
            boolean r6 = r3.d
            r5.isImportant = r6
            java.lang.String r6 = r3.e
            if (r6 != 0) goto L_0x050b
            r6 = r12
        L_0x050b:
            r5.name = r6
            java.lang.String r6 = r3.f
            if (r6 != 0) goto L_0x0512
            r6 = r12
        L_0x0512:
            r5.baseIconUrl = r6
            boolean r6 = r3.g
            r5.isCustomTitle = r6
            boolean r6 = r3.h
            r5.isMember = r6
            ru.ok.tamtam.nano.Protos$Chat$GroupChatInfo$GroupOptions r6 = new ru.ok.tamtam.nano.Protos$Chat$GroupChatInfo$GroupOptions
            r6.<init>()
            hv6 r7 = r3.j
            boolean r7 = r7.a
            r6.groupPremium = r7
            r5.groupOptions = r6
            int r3 = r3.i
            if (r3 == 0) goto L_0x0541
            int r3 = defpackage.tr1.y(r3)
            if (r3 == 0) goto L_0x053f
            if (r3 == r11) goto L_0x053c
            r6 = 2
            if (r3 == r6) goto L_0x0539
            goto L_0x0541
        L_0x0539:
            r5.messagingPermissions = r6
            goto L_0x0541
        L_0x053c:
            r5.messagingPermissions = r11
            goto L_0x0541
        L_0x053f:
            r5.messagingPermissions = r13
        L_0x0541:
            r4.groupChatInfo = r5
        L_0x0543:
            long r5 = r10.L
            r4.pinnedMessageId = r5
            boolean r3 = r10.M
            r4.hidePinnedMessage = r3
            boolean r3 = r10.N
            r4.unreadReply = r3
            boolean r3 = r10.O
            r4.unreadPin = r3
            int r3 = r10.Q
            r4.messagesTtlSec = r3
            int r3 = r10.S
            r4.flagsSettings = r3
            nl r3 = r10.T
            if (r3 == 0) goto L_0x0575
            ru.ok.tamtam.nano.Protos$Chat$VideoConversation r5 = new ru.ok.tamtam.nano.Protos$Chat$VideoConversation
            r5.<init>()
            r4.videoConversation = r5
            java.lang.String r6 = r3.b
            if (r6 != 0) goto L_0x056b
            r6 = r12
        L_0x056b:
            r5.conversationId = r6
            long r6 = r3.a
            r5.startedAt = r6
            java.lang.String r3 = r3.c
            r5.joinLink = r3
        L_0x0575:
            long r5 = r10.U
            r4.lastOpenPositionTime = r5
            int r3 = r10.V
            r4.lastOpenPositionOffset = r3
            long r5 = r10.W
            r4.lastOpenReadMark = r5
            int r3 = r10.X
            long r5 = (long) r3
            r4.lastOpenNewMessages = r5
            long r5 = r10.Y
            r4.lastSearchClickTime = r5
            long r5 = r10.Z
            r4.lastWriteTime = r5
            java.util.List r3 = r10.a0
            if (r3 == 0) goto L_0x0607
            int r5 = r3.size()
            ru.ok.tamtam.nano.Protos$Chat$LastInputMedia[] r5 = new ru.ok.tamtam.nano.Protos.Chat.LastInputMedia[r5]
            r6 = r13
        L_0x0599:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0605
            java.lang.Object r7 = r3.get(r6)
            tr7 r7 = (defpackage.tr7) r7
            ru.ok.tamtam.nano.Protos$Chat$LastInputMedia r8 = new ru.ok.tamtam.nano.Protos$Chat$LastInputMedia
            r8.<init>()
            long r14 = r7.a
            r8.originalId = r14
            java.lang.String r9 = r7.b
            if (r9 != 0) goto L_0x05b3
            r9 = r12
        L_0x05b3:
            r8.originalUri = r9
            java.lang.String r9 = r7.c
            if (r9 != 0) goto L_0x05ba
            r9 = r12
        L_0x05ba:
            r8.thumbnailUri = r9
            int r9 = r7.d
            r8.originalOrientation = r9
            long r14 = r7.e
            r8.originalDuration = r14
            java.lang.String r9 = r7.f
            if (r9 != 0) goto L_0x05c9
            r9 = r12
        L_0x05c9:
            r8.mimeType = r9
            long r14 = r7.g
            r8.dateModified = r14
            java.lang.String r9 = r7.h
            if (r9 != 0) goto L_0x05d4
            r9 = r12
        L_0x05d4:
            r8.editedUri = r9
            int r9 = r7.i
            r8.type = r9
            java.util.List r9 = r7.j
            if (r9 != 0) goto L_0x05e0
            r15 = r2
            goto L_0x05f7
        L_0x05e0:
            int r14 = r9.size()
            int[] r15 = new int[r14]
            r2 = r13
        L_0x05e7:
            if (r2 >= r14) goto L_0x05f7
            java.lang.Object r17 = r9.get(r2)
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r17 = r17.intValue()
            r15[r2] = r17
            int r2 = r2 + r11
            goto L_0x05e7
        L_0x05f7:
            r8.wave = r15
            java.lang.String r2 = r7.k
            if (r2 != 0) goto L_0x05fe
            r2 = r12
        L_0x05fe:
            r8.attachLocalId = r2
            r5[r6] = r8
            int r6 = r6 + r11
            r2 = 0
            goto L_0x0599
        L_0x0605:
            r4.lastInputMedia = r5
        L_0x0607:
            long r2 = r10.b0
            r4.lastInputEditMessageId = r2
            long r2 = r10.c0
            r4.lastInputReplyMessageId = r2
            pt4 r2 = r10.f0
            if (r2 == 0) goto L_0x061e
            r3 = r18
            xt4 r3 = r3.a
            byte[] r2 = r3.b(r2)
            r4.draft = r2
            goto L_0x0622
        L_0x061e:
            byte[] r2 = ru.ok.tamtam.nano.b.a
            r4.draft = r2
        L_0x0622:
            long r2 = r10.g0
            r4.draftUpdateTime = r2
            long r2 = r10.h0
            r4.draftUpdateTimeForSyncLogic = r2
            zq0 r2 = r10.e0
            if (r2 != 0) goto L_0x0630
            zq0 r2 = defpackage.zq0.c
        L_0x0630:
            ru.ok.tamtam.nano.Protos$Chat$BotsInfo r3 = new ru.ok.tamtam.nano.Protos$Chat$BotsInfo
            r3.<init>()
            boolean r5 = r2.a
            r3.hasBots = r5
            boolean r2 = r2.b
            r3.suspendedBot = r2
            r4.botsInfo = r3
            long r2 = r10.d0
            r4.modified = r2
            java.util.Map r2 = r10.n0
            r4.liveLocationMessageIds = r2
            boolean r2 = r10.i0
            r4.subscribedToUpdates = r2
            long r2 = r10.j0
            r4.lastMentionMessageId = r2
            long r2 = r10.l0
            r4.lastReactedMessageId = r2
            java.lang.String r2 = r10.m0
            if (r2 == 0) goto L_0x0658
            r12 = r2
        L_0x0658:
            r4.lastReaction = r12
            i72 r2 = r10.o0
            if (r2 == 0) goto L_0x0671
            ru.ok.tamtam.nano.Protos$Chat$PushMessage r3 = new ru.ok.tamtam.nano.Protos$Chat$PushMessage
            r3.<init>()
            long r5 = r2.c
            r3.id = r5
            long r5 = r2.b
            r3.time = r5
            java.lang.String r2 = r2.a
            r3.text = r2
            r4.lastPushMessage = r3
        L_0x0671:
            long r2 = r10.p0
            r4.lastDelayedUpdateTime = r2
            long r2 = r10.q0
            r4.lastFireDelayedErrorTime = r2
            byte[] r2 = defpackage.ad9.toByteArray(r4)
            if (r2 != 0) goto L_0x0684
            r3 = 3
            r1.X(r3)
            goto L_0x0688
        L_0x0684:
            r3 = 3
            r1.l(r3, r2)
        L_0x0688:
            long r2 = r0.d
            r4 = 4
            r1.k(r4, r2)
            long r2 = r0.e
            r4 = 5
            r1.k(r4, r2)
            long r2 = r0.f
            r0 = 6
            r1.k(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs2.Z(gf6, java.lang.Object):void");
    }
}
