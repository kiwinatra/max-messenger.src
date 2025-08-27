package defpackage;

import android.content.Context;
import kotlin.reflect.KProperty;

/* renamed from: h38  reason: default package */
public final class h38 extends b8 {
    public static final /* synthetic */ KProperty[] Z;
    public static final String v0;
    public final hs7 X;
    public final hs7 Y;
    public final Context c;
    public final jtb o;
    public final hs7 v;
    public final hs7 w;
    public final hs7 x;
    public final hs7 y;
    public final hs7 z;

    static {
        Class<h38> cls = h38.class;
        Z = new KProperty[]{wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), wj6.p(cls, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0), wj6.p(cls, "messagesNotificationsSettings", "getMessagesNotificationsSettings()Lru/ok/tamtam/android/notifications/messages/MessagesNotificationsSettings;", 0), wj6.p(cls, "notificationTextNotBundledHelper", "getNotificationTextNotBundledHelper()Lru/ok/tamtam/android/notifications/messages/newpush/NotificationTextNotBundledHelper;", 0), wj6.p(cls, "notificationTextBundledHelper", "getNotificationTextBundledHelper()Lru/ok/tamtam/android/notifications/messages/newpush/NotificationTextBundledHelper;", 0), wj6.p(cls, "notificationsReadMarksRepository", "getNotificationsReadMarksRepository()Lru/ok/tamtam/android/notifications/messages/newpush/readmarks/NotificationsReadMarksRepository;", 0)};
        v0 = cls.getName();
    }

    public h38(Context context, jtb jtb, hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78) {
        super(hs78);
        this.c = context;
        this.o = jtb;
        this.v = hs7;
        this.w = hs72;
        this.x = hs73;
        this.y = hs74;
        this.z = hs75;
        this.X = hs76;
        this.Y = hs77;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x063d, code lost:
        if (defpackage.cvg.A(r6.f) != false) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0664, code lost:
        if (r6.c.contains(java.lang.Long.valueOf(r9)) == false) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0ae0, code lost:
        if (r8 == null) goto L_0x0aa4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x08de  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0901  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0907  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0926  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0a53  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0a58  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0af3  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0afa  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0bf6  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0bf9  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0c04  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0c16  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0c23  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0c28  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0c32  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0c37  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0c5a  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0c61  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c6d  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c6f  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0c97  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0c9e  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0ca8  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0cad  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0cbb  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0cc0  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0cde  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0ce4  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x070f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bl2 q(java.util.Set r125) {
        /*
            r124 = this;
            r1 = r124
            r3 = 0
            r4 = 1
            kotlin.reflect.KProperty[] r5 = Z
            r0 = r5[r3]
            hs7 r0 = r1.v
            java.lang.Object r6 = r0.get()
            r62 r6 = (defpackage.r62) r6
            r7 = r5[r3]
            java.lang.Object r0 = r0.get()
            r62 r0 = (defpackage.r62) r0
            r0.getClass()
            t52 r7 = new t52
            r7.<init>(r0, r4, r4)
            java.util.EnumSet r0 = defpackage.r62.L
            r8 = 0
            java.util.ArrayList r0 = r6.H(r0, r3, r8)
            java.util.Iterator r6 = r0.iterator()
            r9 = r8
        L_0x002c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r6.next()
            a32 r0 = (defpackage.a32) r0
            boolean r10 = r7.test(r0)     // Catch:{ Exception -> 0x0047 }
            if (r10 == 0) goto L_0x002c
            if (r9 != 0) goto L_0x0049
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x0047 }
            r10.<init>()     // Catch:{ Exception -> 0x0047 }
            r9 = r10
            goto L_0x0049
        L_0x0047:
            r0 = move-exception
            goto L_0x004d
        L_0x0049:
            r9.add(r0)     // Catch:{ Exception -> 0x0047 }
            goto L_0x002c
        L_0x004d:
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r10 = "r62"
            java.lang.String r11 = "exception in traverse predicate: %s"
            defpackage.z68.g(r10, r11, r0)
            goto L_0x002c
        L_0x005d:
            if (r9 != 0) goto L_0x0063
            java.util.List r9 = java.util.Collections.emptyList()
        L_0x0063:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r0 = kotlin.collections.CollectionsKt.sorted(r9)
            boolean r6 = r125.isEmpty()
            r6 = r6 ^ r4
            jtb r7 = r1.o
            if (r6 == 0) goto L_0x009f
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x007e:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00ca
            java.lang.Object r10 = r6.next()
            r11 = r10
            a32 r11 = (defpackage.a32) r11
            m72 r11 = r11.b
            long r11 = r11.a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = r125
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x007e
            r9.add(r10)
            goto L_0x007e
        L_0x009f:
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00ab:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00ca
            java.lang.Object r10 = r6.next()
            r11 = r10
            a32 r11 = (defpackage.a32) r11
            r12 = r7
            ltb r12 = (defpackage.ltb) r12
            a33 r13 = r12.a
            hq r12 = r12.c
            boolean r11 = r11.P(r13, r12)
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x00ab
            r9.add(r10)
            goto L_0x00ab
        L_0x00ca:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            ltb r7 = (defpackage.ltb) r7
            a33 r10 = r7.a
            long r10 = r10.s()
            boolean r12 = r1.a
            if (r12 == 0) goto L_0x00de
            r13 = 50
            goto L_0x00e0
        L_0x00de:
            r13 = 35
        L_0x00e0:
            hq r14 = r7.c
            int r15 = r14.o()
            int r14 = r14.n()
            r8 = 6
            r16 = r5[r8]
            hs7 r8 = r1.Y
            java.lang.Object r8 = r8.get()
            mfa r8 = (defpackage.mfa) r8
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r4.<init>(r2)
            java.util.Iterator r2 = r9.iterator()
        L_0x0102:
            boolean r18 = r2.hasNext()
            if (r18 == 0) goto L_0x0121
            java.lang.Object r18 = r2.next()
            r3 = r18
            a32 r3 = (defpackage.a32) r3
            m72 r3 = r3.b
            r18 = r2
            long r2 = r3.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.add(r2)
            r2 = r18
            r3 = 0
            goto L_0x0102
        L_0x0121:
            r8.getClass()
            kotlin.reflect.KProperty[] r2 = defpackage.mfa.c
            r3 = 0
            r2 = r2[r3]
            hs7 r2 = r8.a
            java.lang.Object r2 = r2.get()
            j6d r2 = (defpackage.j6d) r2
            mka r2 = r2.n()
            u9a r3 = defpackage.u9a.w
            wbe r2 = r2.i(r3)
            ej5 r3 = new ej5
            r8 = 2
            r3.<init>(r8, r4)
            wbe r4 = new wbe
            r8 = 0
            r4.<init>(r2, r3, r8)
            mz4 r2 = defpackage.mz4.o
            tbe r3 = new tbe
            r8 = 1
            r3.<init>(r4, r2, r8)
            n77 r2 = new n77
            r4 = 23
            r2.<init>(r4)
            hce r4 = new hce
            r8 = 0
            r4.<init>(r3, r2, r8)
            java.lang.Object r2 = r4.f()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
            r4 = 16
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast((int) r3, (int) r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0179:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x019d
            java.lang.Object r3 = r2.next()
            uea r3 = (defpackage.uea) r3
            r18 = r14
            r8 = r15
            long r14 = r3.a
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = r2
            long r2 = r3.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r14, r2)
            r2 = r15
            r14 = r18
            r15 = r8
            goto L_0x0179
        L_0x019d:
            r18 = r14
            r8 = r15
            java.util.Iterator r2 = r9.iterator()
        L_0x01a4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0804
            java.lang.Object r3 = r2.next()
            a32 r3 = (defpackage.a32) r3
            boolean r21 = r3.N()
            if (r21 == 0) goto L_0x01b9
            r9 = r8
        L_0x01b7:
            r14 = 2
            goto L_0x01bc
        L_0x01b9:
            r9 = r18
            goto L_0x01b7
        L_0x01bc:
            if (r9 != r14) goto L_0x01c6
            r14 = 2147483647(0x7fffffff, float:NaN)
            r22 = r12
            r23 = r13
            goto L_0x01cb
        L_0x01c6:
            r22 = r12
            r14 = r13
            r23 = r14
        L_0x01cb:
            long r12 = r3.o()
            m72 r15 = r3.b
            r25 = r10
            long r10 = r15.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = r4.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x01e6
            long r10 = r10.longValue()
            goto L_0x01e8
        L_0x01e6:
            r10 = -9223372036854775808
        L_0x01e8:
            long r10 = java.lang.Math.max(r12, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 2
            r17 = r5[r13]
            hs7 r13 = r1.x
            java.lang.Object r27 = r13.get()
            r28 = r2
            r2 = r27
            fa9 r2 = (defpackage.fa9) r2
            r27 = r4
            hs7 r4 = r2.g
            java.lang.Object r4 = r4.get()
            gb9 r4 = (defpackage.gb9) r4
            r29 = r8
            s74 r8 = r2.a
            a74 r8 = (defpackage.a74) r8
            z6d r8 = r8.c
            jtb r2 = r2.c
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            r30 = r0
            long r0 = r2.s()
            aj9 r2 = r8.d()
            sq6 r31 = defpackage.qe9.b
            r2.getClass()
            r31 = r6
            java.lang.String r6 = "SELECT * FROM messages WHERE chat_id = ? AND time > ? AND sender != ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC LIMIT ?"
            r32 = r13
            r13 = 5
            d7d r6 = defpackage.d7d.a(r13, r6)
            r24 = r14
            long r13 = r3.a
            r34 = r5
            r5 = 1
            r6.k(r5, r13)
            r5 = 2
            r6.k(r5, r10)
            r5 = 3
            defpackage.i2a.o(r6, r5, r0, r2)
            r0 = 10
            long r0 = (long) r0
            r5 = 4
            r6.k(r5, r0)
            r35 = r0
            r5 = r24
            long r0 = (long) r5
            r37 = r10
            r10 = 5
            r6.k(r10, r0)
            i6d r0 = r2.a
            r0.b()
            r1 = 0
            android.database.Cursor r10 = r0.o(r6, r1)
            java.lang.String r0 = "id"
            int r0 = defpackage.kne.u(r10, r0)     // Catch:{ all -> 0x07fa }
            java.lang.String r1 = "server_id"
            int r1 = defpackage.kne.u(r10, r1)     // Catch:{ all -> 0x07fa }
            java.lang.String r11 = "time"
            int r11 = defpackage.kne.u(r10, r11)     // Catch:{ all -> 0x07fa }
            r24 = r5
            java.lang.String r5 = "update_time"
            int r5 = defpackage.kne.u(r10, r5)     // Catch:{ all -> 0x07fa }
            r39 = r13
            java.lang.String r13 = "sender"
            int r13 = defpackage.kne.u(r10, r13)     // Catch:{ all -> 0x07fa }
            java.lang.String r14 = "cid"
            int r14 = defpackage.kne.u(r10, r14)     // Catch:{ all -> 0x07fa }
            r33 = r7
            java.lang.String r7 = "text"
            int r7 = defpackage.kne.u(r10, r7)     // Catch:{ all -> 0x07fa }
            r41 = r9
            java.lang.String r9 = "delivery_status"
            int r9 = defpackage.kne.u(r10, r9)     // Catch:{ all -> 0x07fa }
            r42 = r3
            java.lang.String r3 = "status"
            int r3 = defpackage.kne.u(r10, r3)     // Catch:{ all -> 0x07fa }
            r43 = r12
            java.lang.String r12 = "time_local"
            int r12 = defpackage.kne.u(r10, r12)     // Catch:{ all -> 0x07fa }
            r44 = r15
            java.lang.String r15 = "error"
            int r15 = defpackage.kne.u(r10, r15)     // Catch:{ all -> 0x07fa }
            r45 = r4
            java.lang.String r4 = "localized_error"
            int r4 = defpackage.kne.u(r10, r4)     // Catch:{ all -> 0x07fa }
            r46 = r8
            java.lang.String r8 = "attaches"
            int r8 = defpackage.kne.u(r10, r8)     // Catch:{ all -> 0x07fa }
            r47 = r6
            java.lang.String r6 = "media_type"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r48 = r6
            java.lang.String r6 = "detect_share"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r49 = r6
            java.lang.String r6 = "msg_link_type"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r50 = r6
            java.lang.String r6 = "msg_link_id"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r51 = r6
            java.lang.String r6 = "inserted_from_msg_link"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r52 = r6
            java.lang.String r6 = "msg_link_chat_id"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r53 = r6
            java.lang.String r6 = "msg_link_chat_name"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r54 = r6
            java.lang.String r6 = "msg_link_chat_link"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r55 = r6
            java.lang.String r6 = "msg_link_out_chat_id"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r56 = r6
            java.lang.String r6 = "msg_link_out_msg_id"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r57 = r6
            java.lang.String r6 = "type"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r58 = r6
            java.lang.String r6 = "chat_id"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r59 = r6
            java.lang.String r6 = "ttl"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r60 = r6
            java.lang.String r6 = "channel_views"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r61 = r6
            java.lang.String r6 = "channel_forwards"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r62 = r6
            java.lang.String r6 = "view_time"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r63 = r6
            java.lang.String r6 = "zoom"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r64 = r6
            java.lang.String r6 = "options"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r65 = r6
            java.lang.String r6 = "live_until"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r66 = r6
            java.lang.String r6 = "elements"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r67 = r6
            java.lang.String r6 = "reactions"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r68 = r6
            java.lang.String r6 = "delayed_attrs_time_to_fire"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r69 = r6
            java.lang.String r6 = "delayed_attrs_notify_sender"
            int r6 = defpackage.kne.u(r10, r6)     // Catch:{ all -> 0x0587 }
            r70 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0587 }
            r71 = r8
            int r8 = r10.getCount()     // Catch:{ all -> 0x0587 }
            r6.<init>(r8)     // Catch:{ all -> 0x0587 }
        L_0x0385:
            boolean r8 = r10.moveToNext()     // Catch:{ all -> 0x0587 }
            if (r8 == 0) goto L_0x058a
            long r73 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            long r75 = r10.getLong(r1)     // Catch:{ all -> 0x0587 }
            long r77 = r10.getLong(r11)     // Catch:{ all -> 0x0587 }
            long r79 = r10.getLong(r5)     // Catch:{ all -> 0x0587 }
            long r81 = r10.getLong(r13)     // Catch:{ all -> 0x0587 }
            long r83 = r10.getLong(r14)     // Catch:{ all -> 0x0587 }
            boolean r8 = r10.isNull(r7)     // Catch:{ all -> 0x0587 }
            if (r8 == 0) goto L_0x03ac
            r85 = 0
            goto L_0x03b2
        L_0x03ac:
            java.lang.String r8 = r10.getString(r7)     // Catch:{ all -> 0x0587 }
            r85 = r8
        L_0x03b2:
            int r8 = r10.getInt(r9)     // Catch:{ all -> 0x0587 }
            hp9 r72 = r2.a()     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            cd4 r72 = defpackage.oa9.b     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            oa9 r86 = defpackage.cd4.n(r8)     // Catch:{ all -> 0x0587 }
            int r8 = r10.getInt(r3)     // Catch:{ all -> 0x0587 }
            hp9 r72 = r2.a()     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            sq6 r72 = defpackage.qe9.b     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            qe9 r87 = defpackage.sq6.D(r8)     // Catch:{ all -> 0x0587 }
            long r88 = r10.getLong(r12)     // Catch:{ all -> 0x0587 }
            boolean r8 = r10.isNull(r15)     // Catch:{ all -> 0x0587 }
            if (r8 == 0) goto L_0x03e7
            r90 = 0
            goto L_0x03ed
        L_0x03e7:
            java.lang.String r8 = r10.getString(r15)     // Catch:{ all -> 0x0587 }
            r90 = r8
        L_0x03ed:
            boolean r8 = r10.isNull(r4)     // Catch:{ all -> 0x0587 }
            if (r8 == 0) goto L_0x03f8
            r8 = r71
            r91 = 0
            goto L_0x0400
        L_0x03f8:
            java.lang.String r8 = r10.getString(r4)     // Catch:{ all -> 0x0587 }
            r91 = r8
            r8 = r71
        L_0x0400:
            boolean r71 = r10.isNull(r8)     // Catch:{ all -> 0x0587 }
            if (r71 == 0) goto L_0x0409
            r71 = 0
            goto L_0x040d
        L_0x0409:
            byte[] r71 = r10.getBlob(r8)     // Catch:{ all -> 0x0587 }
        L_0x040d:
            hp9 r72 = r2.a()     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            w28 r92 = defpackage.qe8.b(r71)     // Catch:{ all -> 0x0587 }
            r71 = r0
            r0 = r48
            int r93 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r48 = r0
            r0 = r49
            int r49 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            if (r49 == 0) goto L_0x0431
            r49 = r0
            r0 = r50
            r94 = 1
            goto L_0x0437
        L_0x0431:
            r49 = r0
            r0 = r50
            r94 = 0
        L_0x0437:
            int r95 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r50 = r0
            r0 = r51
            long r96 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r51 = r0
            r0 = r52
            int r52 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            if (r52 == 0) goto L_0x0454
            r52 = r0
            r0 = r53
            r98 = 1
            goto L_0x045a
        L_0x0454:
            r52 = r0
            r0 = r53
            r98 = 0
        L_0x045a:
            long r99 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r53 = r0
            r0 = r54
            boolean r54 = r10.isNull(r0)     // Catch:{ all -> 0x0587 }
            if (r54 == 0) goto L_0x046f
            r54 = r0
            r0 = r55
            r101 = 0
            goto L_0x0479
        L_0x046f:
            java.lang.String r54 = r10.getString(r0)     // Catch:{ all -> 0x0587 }
            r101 = r54
            r54 = r0
            r0 = r55
        L_0x0479:
            boolean r55 = r10.isNull(r0)     // Catch:{ all -> 0x0587 }
            if (r55 == 0) goto L_0x0486
            r55 = r0
            r0 = r56
            r102 = 0
            goto L_0x0490
        L_0x0486:
            java.lang.String r55 = r10.getString(r0)     // Catch:{ all -> 0x0587 }
            r102 = r55
            r55 = r0
            r0 = r56
        L_0x0490:
            long r103 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r56 = r0
            r0 = r57
            long r105 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r57 = r0
            r0 = r58
            int r58 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            hp9 r72 = r2.a()     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            int r107 = defpackage.wj6.c(r58)     // Catch:{ all -> 0x0587 }
            r58 = r0
            r0 = r59
            long r108 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r59 = r0
            r0 = r60
            int r110 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r60 = r0
            r0 = r61
            int r111 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r61 = r0
            r0 = r62
            int r112 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r62 = r0
            r0 = r63
            long r113 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r63 = r0
            r0 = r64
            int r115 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r64 = r0
            r0 = r65
            int r116 = r10.getInt(r0)     // Catch:{ all -> 0x0587 }
            r65 = r0
            r0 = r66
            long r117 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            r66 = r0
            r0 = r67
            boolean r67 = r10.isNull(r0)     // Catch:{ all -> 0x0587 }
            if (r67 == 0) goto L_0x04fc
            r67 = 0
            goto L_0x0500
        L_0x04fc:
            byte[] r67 = r10.getBlob(r0)     // Catch:{ all -> 0x0587 }
        L_0x0500:
            hp9 r72 = r2.a()     // Catch:{ all -> 0x0587 }
            r72.getClass()     // Catch:{ all -> 0x0587 }
            java.util.List r119 = defpackage.hp9.a(r67)     // Catch:{ all -> 0x0587 }
            r67 = r0
            r0 = r68
            boolean r68 = r10.isNull(r0)     // Catch:{ all -> 0x0587 }
            if (r68 == 0) goto L_0x051b
            r123 = r0
            r68 = r1
            r0 = 0
            goto L_0x0525
        L_0x051b:
            byte[] r68 = r10.getBlob(r0)     // Catch:{ all -> 0x0587 }
            r123 = r0
            r0 = r68
            r68 = r1
        L_0x0525:
            hp9 r1 = r2.a()     // Catch:{ all -> 0x0587 }
            xd9 r120 = r1.b(r0)     // Catch:{ all -> 0x0587 }
            r0 = r69
            boolean r1 = r10.isNull(r0)     // Catch:{ all -> 0x0587 }
            if (r1 == 0) goto L_0x053a
            r1 = r70
            r121 = 0
            goto L_0x0546
        L_0x053a:
            long r121 = r10.getLong(r0)     // Catch:{ all -> 0x0587 }
            java.lang.Long r1 = java.lang.Long.valueOf(r121)     // Catch:{ all -> 0x0587 }
            r121 = r1
            r1 = r70
        L_0x0546:
            boolean r69 = r10.isNull(r1)     // Catch:{ all -> 0x0587 }
            if (r69 == 0) goto L_0x054f
            r69 = 0
            goto L_0x0557
        L_0x054f:
            int r69 = r10.getInt(r1)     // Catch:{ all -> 0x0587 }
            java.lang.Integer r69 = java.lang.Integer.valueOf(r69)     // Catch:{ all -> 0x0587 }
        L_0x0557:
            if (r69 != 0) goto L_0x055e
            r69 = r0
            r122 = 0
            goto L_0x0571
        L_0x055e:
            int r69 = r69.intValue()     // Catch:{ all -> 0x0587 }
            if (r69 == 0) goto L_0x0567
            r69 = 1
            goto L_0x0569
        L_0x0567:
            r69 = 0
        L_0x0569:
            java.lang.Boolean r69 = java.lang.Boolean.valueOf(r69)     // Catch:{ all -> 0x0587 }
            r122 = r69
            r69 = r0
        L_0x0571:
            ya9 r0 = new ya9     // Catch:{ all -> 0x0587 }
            r72 = r0
            r72.<init>(r73, r75, r77, r79, r81, r83, r85, r86, r87, r88, r90, r91, r92, r93, r94, r95, r96, r98, r99, r101, r102, r103, r105, r107, r108, r110, r111, r112, r113, r115, r116, r117, r119, r120, r121, r122)     // Catch:{ all -> 0x0587 }
            r6.add(r0)     // Catch:{ all -> 0x0587 }
            r70 = r1
            r1 = r68
            r0 = r71
            r68 = r123
            r71 = r8
            goto L_0x0385
        L_0x0587:
            r0 = move-exception
            goto L_0x07fd
        L_0x058a:
            r10.close()
            r47.o()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r6, 10)
            r0.<init>(r1)
            java.util.Iterator r1 = r6.iterator()
        L_0x059d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05b3
            java.lang.Object r2 = r1.next()
            ya9 r2 = (defpackage.ya9) r2
            r3 = r46
            ha9 r2 = r3.b(r2)
            r0.add(r2)
            goto L_0x059d
        L_0x05b3:
            r4 = r45
            java.util.ArrayList r0 = r4.b(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x05c2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0719
            java.lang.Object r2 = r0.next()
            r3 = r2
            a89 r3 = (defpackage.a89) r3
            cd9 r4 = r3.w
            r4.getClass()
            ha9 r5 = r3.a
            boolean r6 = r5.z()
            hs7 r4 = r4.a
            if (r6 == 0) goto L_0x05fe
            q10 r6 = r5.f()
            p10 r6 = r6.a
            p10 r7 = defpackage.p10.y
            if (r6 != r7) goto L_0x05fe
            java.lang.Object r6 = r4.get()
            jtb r6 = (defpackage.jtb) r6
            ltb r6 = (defpackage.ltb) r6
            hq r6 = r6.c
            ls7 r6 = r6.g
            java.lang.String r7 = "app.notification.show.new.users"
            r8 = 1
            boolean r6 = r6.getBoolean(r7, r8)
            if (r6 != 0) goto L_0x05fe
            goto L_0x0612
        L_0x05fe:
            java.lang.Object r6 = r4.get()
            jtb r6 = (defpackage.jtb) r6
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            boolean r6 = r5.H(r6)
            if (r6 == 0) goto L_0x0614
        L_0x0612:
            r8 = 6
            goto L_0x0667
        L_0x0614:
            boolean r6 = r5.z()
            if (r6 == 0) goto L_0x068a
            q10 r6 = r5.f()
            p10 r7 = r6.a
            int r7 = r7.ordinal()
            r8 = 1
            if (r7 == r8) goto L_0x0645
            r8 = 2
            if (r7 == r8) goto L_0x0645
            r8 = 3
            if (r7 == r8) goto L_0x0645
            r8 = 6
            if (r7 == r8) goto L_0x0637
            r7 = r42
            r6 = r43
            r4 = r44
            goto L_0x0691
        L_0x0637:
            java.lang.String r4 = r6.f
            boolean r4 = defpackage.cvg.A(r4)
            if (r4 == 0) goto L_0x0640
            goto L_0x0667
        L_0x0640:
            r6 = r43
            r4 = r44
            goto L_0x068f
        L_0x0645:
            r8 = 6
            java.lang.Object r4 = r4.get()
            jtb r4 = (defpackage.jtb) r4
            ltb r4 = (defpackage.ltb) r4
            a33 r4 = r4.a
            long r9 = r4.s()
            long r11 = r6.b
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0640
            java.util.ArrayList r4 = r6.c
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L_0x0667
            goto L_0x0640
        L_0x0667:
            hx4 r52 = defpackage.hx4.SKIPPED_NOTIF_MESSAGE
            jga r3 = new jga
            r4 = r44
            long r6 = r4.a
            long r9 = r5.c
            long r11 = r5.o
            r45 = r3
            r46 = r6
            r48 = r9
            r50 = r11
            r45.<init>(r46, r48, r50, r52)
            r6 = r43
            r6.add(r3)
            r11 = r41
            r7 = r42
            r3 = 0
            goto L_0x070a
        L_0x068a:
            r6 = r43
            r4 = r44
            r8 = 6
        L_0x068f:
            r7 = r42
        L_0x0691:
            a89 r9 = r7.o
            if (r9 == 0) goto L_0x06a5
            ha9 r9 = r9.a
            long r9 = r9.b
            long r11 = r5.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x06a5
            r9 = r33
            r11 = r41
        L_0x06a3:
            r3 = 1
            goto L_0x06eb
        L_0x06a5:
            if (r41 != 0) goto L_0x06b7
            r9 = r33
            a33 r3 = r9.a
            boolean r3 = r7.X(r3)
            r10 = 1
            r16 = r3 ^ 1
            r3 = r16
            r11 = r41
            goto L_0x06eb
        L_0x06b7:
            r9 = r33
            r11 = r41
            r10 = 1
            r12 = 2
            if (r11 != r12) goto L_0x06e7
            mc9 r3 = r3.c
            if (r3 == 0) goto L_0x06d4
            a89 r12 = r3.c
            if (r12 == 0) goto L_0x06d4
            int r3 = r3.a
            if (r3 != r10) goto L_0x06d4
            ha9 r3 = r12.a
            long r12 = r3.w
            int r3 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r3 != 0) goto L_0x06d4
            goto L_0x06e4
        L_0x06d4:
            boolean r3 = r5.z()
            if (r3 == 0) goto L_0x06e5
            q10 r3 = r5.f()
            p10 r3 = r3.a
            p10 r10 = defpackage.p10.X
            if (r3 != r10) goto L_0x06e5
        L_0x06e4:
            goto L_0x06a3
        L_0x06e5:
            r3 = 0
            goto L_0x06eb
        L_0x06e7:
            r3 = r10
            if (r11 != r3) goto L_0x06a3
            goto L_0x06e5
        L_0x06eb:
            if (r3 != 0) goto L_0x0708
            hx4 r48 = defpackage.hx4.CHAT_MUTED
            jga r10 = new jga
            long r12 = r4.a
            long r14 = r5.c
            r33 = r9
            long r8 = r5.o
            r41 = r10
            r42 = r12
            r44 = r14
            r46 = r8
            r41.<init>(r42, r44, r46, r48)
            r6.add(r10)
            goto L_0x070a
        L_0x0708:
            r33 = r9
        L_0x070a:
            if (r3 == 0) goto L_0x070f
            r1.add(r2)
        L_0x070f:
            r44 = r4
            r43 = r6
            r42 = r7
            r41 = r11
            goto L_0x05c2
        L_0x0719:
            r7 = r42
            r6 = r43
            ui0 r0 = new ui0
            r2 = 11
            r0.<init>(r2)
            xm4 r2 = new xm4
            r3 = 1
            r2.<init>(r0, r3)
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r1, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x075f
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x075f
            java.lang.String r0 = "no messages to notify for chat "
            r1 = r39
            java.lang.String r0 = defpackage.wj6.i(r1, r0)
            java.lang.String r1 = v0
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            r1 = r124
            r12 = r22
            r13 = r23
            r10 = r25
            r4 = r27
            r2 = r28
            r8 = r29
            r0 = r30
            r6 = r31
            r7 = r33
            r5 = r34
            goto L_0x01a4
        L_0x075f:
            r1 = r39
            int r3 = r0.size()
            r14 = r24
            if (r3 < r14) goto L_0x07c6
            r3 = 2
            r4 = r34[r3]
            java.lang.Object r3 = r32.get()
            fa9 r3 = (defpackage.fa9) r3
            s74 r3 = r3.a
            a74 r3 = (defpackage.a74) r3
            z6d r3 = r3.c
            aj9 r3 = r3.d()
            sq6 r4 = defpackage.qe9.b
            r3.getClass()
            java.lang.String r4 = "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time > ? AND sender != ? AND inserted_from_msg_link = 0 AND status <> ?"
            r5 = 4
            d7d r4 = defpackage.d7d.a(r5, r4)
            r8 = 1
            r4.k(r8, r1)
            r1 = r37
            r8 = 2
            r4.k(r8, r1)
            r1 = r25
            r8 = 3
            defpackage.i2a.o(r4, r8, r1, r3)
            r8 = r35
            r4.k(r5, r8)
            i6d r3 = r3.a
            r3.b()
            r5 = 0
            android.database.Cursor r3 = r3.o(r4, r5)
            boolean r5 = r3.moveToFirst()     // Catch:{ all -> 0x07b3 }
            if (r5 == 0) goto L_0x07b5
            r5 = 0
            long r14 = r3.getLong(r5)     // Catch:{ all -> 0x07b3 }
            goto L_0x07b7
        L_0x07b3:
            r0 = move-exception
            goto L_0x07bf
        L_0x07b5:
            r14 = 0
        L_0x07b7:
            r3.close()
            r4.o()
            int r3 = (int) r14
            goto L_0x07cc
        L_0x07bf:
            r3.close()
            r4.o()
            throw r0
        L_0x07c6:
            r1 = r25
            int r3 = r0.size()
        L_0x07cc:
            int r4 = r0.size()
            r13 = r23
            if (r4 <= r13) goto L_0x07d8
            java.util.List r0 = kotlin.collections.CollectionsKt.takeLast(r0, r13)
        L_0x07d8:
            kotlin.Triple r4 = new kotlin.Triple
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r0, r6, r3)
            r0 = r31
            r0.put(r7, r4)
            r6 = r0
            r10 = r1
            r12 = r22
            r4 = r27
            r2 = r28
            r8 = r29
            r0 = r30
            r7 = r33
            r5 = r34
            r1 = r124
            goto L_0x01a4
        L_0x07fa:
            r0 = move-exception
            r47 = r6
        L_0x07fd:
            r10.close()
            r47.o()
            throw r0
        L_0x0804:
            r30 = r0
            r34 = r5
            r0 = r6
            r33 = r7
            r22 = r12
            jwa r1 = r124.r()
            kotlin.Lazy r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            jtb r1 = (defpackage.jtb) r1
            ltb r1 = (defpackage.ltb) r1
            hq r1 = r1.c
            boolean r1 = r1.B()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0832:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0cf4
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            a32 r4 = (defpackage.a32) r4
            java.lang.Object r3 = r3.getValue()
            kotlin.Triple r3 = (kotlin.Triple) r3
            java.lang.Object r5 = r3.getFirst()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r3.getSecond()
            r12 = r6
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r3 = r3.getThird()
            java.lang.Number r3 = (java.lang.Number) r3
            int r46 = r3.intValue()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r5.size()
            r3.<init>(r6)
            java.util.Iterator r13 = r5.iterator()
            r5 = 0
        L_0x086f:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0b91
            java.lang.Object r6 = r13.next()
            a89 r6 = (defpackage.a89) r6
            ha9 r14 = r6.a
            long r7 = r14.w
            r19 = 0
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L_0x0899
            r7 = 1
            r8 = r34[r7]
            r15 = r124
            hs7 r8 = r15.w
            java.lang.Object r8 = r8.get()
            km3 r8 = (defpackage.km3) r8
            long r9 = r14.w
            vk3 r8 = r8.p(r9, r7)
            goto L_0x089c
        L_0x0899:
            r15 = r124
            r8 = 0
        L_0x089c:
            if (r8 == 0) goto L_0x08b6
            jwa r7 = r124.r()
            r7.getClass()
            iwa r9 = new iwa
            r10 = 0
            r9.<init>(r7, r8, r10)
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.Object r7 = defpackage.ev0.C(r7, r9)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
        L_0x08b3:
            r59 = r7
            goto L_0x08dc
        L_0x08b6:
            boolean r7 = r4.R()
            if (r7 != 0) goto L_0x08c6
            boolean r7 = r4.K()
            if (r7 == 0) goto L_0x08c3
            goto L_0x08c6
        L_0x08c3:
            r59 = 0
            goto L_0x08dc
        L_0x08c6:
            jwa r7 = r124.r()
            r7.getClass()
            gwa r8 = new gwa
            r9 = 0
            r8.<init>(r7, r4, r9)
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.Object r7 = defpackage.ev0.C(r7, r8)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            goto L_0x08b3
        L_0x08dc:
            if (r5 != 0) goto L_0x08e2
            boolean r5 = r14.v()
        L_0x08e2:
            r18 = r5
            m72 r5 = r4.b
            long r10 = r5.a
            if (r22 == 0) goto L_0x08f6
            boolean r5 = r14.z()
            if (r5 == 0) goto L_0x08f6
            q10 r5 = r14.f()
            p10 r5 = r5.a
        L_0x08f6:
            java.lang.String r5 = r6.d(r4)
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x0901
            r56 = r7
            goto L_0x0903
        L_0x0901:
            r56 = r5
        L_0x0903:
            m72 r9 = r4.b
            if (r22 == 0) goto L_0x0926
            r23 = 5
            r5 = r34[r23]
            hs7 r5 = r15.X
            java.lang.Object r5 = r5.get()
            bfa r5 = (defpackage.bfa) r5
            android.content.Context r7 = r15.c
            lf6 r5 = r5.a(r7, r6, r4)
            r125 = r0
            r29 = r2
            r62 = r5
            r27 = r10
            r26 = r13
            r13 = r9
            goto L_0x0a38
        L_0x0926:
            r5 = 4
            r23 = 5
            r8 = r34[r5]
            hs7 r5 = r15.z
            java.lang.Object r5 = r5.get()
            r8 = r5
            efa r8 = (defpackage.efa) r8
            r8.getClass()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.ArrayList r24 = r4.k()
            java.util.Iterator r24 = r24.iterator()
        L_0x0944:
            boolean r25 = r24.hasNext()
            if (r25 == 0) goto L_0x098e
            java.lang.Object r25 = r24.next()
            vk3 r25 = (defpackage.vk3) r25
            java.lang.String r25 = r25.f()
            r125 = r0
            java.lang.String r0 = defpackage.ghf.n(r25)
            boolean r25 = r5.containsKey(r0)
            if (r25 == 0) goto L_0x097b
            java.lang.Object r25 = r5.get(r0)
            java.lang.Number r25 = (java.lang.Number) r25
            int r25 = r25.intValue()
            r26 = r7
            r7 = 1
            int r25 = r25 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r25)
            r5.put(r0, r7)
            r0 = r125
            r7 = r26
            goto L_0x0944
        L_0x097b:
            r26 = r7
            r27 = r10
            r7 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r5.put(r0, r10)
            r0 = r125
            r7 = r26
            r10 = r27
            goto L_0x0944
        L_0x098e:
            r125 = r0
            r26 = r7
            r27 = r10
            r7 = 1
            java.lang.String r0 = r6.d(r4)
            java.lang.String r10 = defpackage.ghf.n(r0)
            boolean r11 = r5.containsKey(r10)
            if (r11 == 0) goto L_0x09b1
            java.lang.Object r5 = r5.get(r10)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= r7) goto L_0x09b1
            r11 = r0
            goto L_0x09b2
        L_0x09b1:
            r11 = r10
        L_0x09b2:
            android.content.Context r5 = r8.a
            if (r1 != 0) goto L_0x09e0
            boolean r0 = r4.N()
            vk3 r6 = r6.b
            vm3 r6 = r6.a
            um3 r6 = r6.c
            int r6 = r6.l
            java.lang.String r7 = r9.g
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x09cd
            r7 = r26
            goto L_0x09cf
        L_0x09cd:
            java.lang.String r7 = r9.g
        L_0x09cf:
            java.lang.String r0 = defpackage.ghf.q(r5, r11, r0, r6, r7)
            lf6 r5 = new lf6
            r6 = 0
            r5.<init>((java.lang.String) r0, (boolean) r6)
            r29 = r2
            r26 = r13
            r13 = r9
            goto L_0x0a36
        L_0x09e0:
            bfa r7 = r8.b
            lf6 r5 = r7.a(r5, r6, r4)
            boolean r7 = r4.N()
            if (r7 != 0) goto L_0x0a03
            boolean r7 = r4.K()
            if (r7 == 0) goto L_0x09f9
            boolean r6 = r6.e()
            if (r6 == 0) goto L_0x09f9
            goto L_0x0a03
        L_0x09f9:
            boolean r6 = r4.R()
            if (r6 == 0) goto L_0x0a00
            goto L_0x0a03
        L_0x0a00:
            r24 = 0
            goto L_0x0a05
        L_0x0a03:
            r24 = 1
        L_0x0a05:
            cfa r10 = new cfa
            java.lang.Object r5 = r5.c
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            r5 = r10
            r6 = r24
            r25 = r7
            r7 = r0
            r0 = r8
            r8 = r25
            r26 = r13
            r13 = r9
            r9 = r0
            r29 = r2
            r2 = r10
            r10 = r4
            r31 = r11
            r5.<init>((boolean) r6, (java.lang.String) r7, (java.lang.String) r8, (defpackage.efa) r9, (defpackage.a32) r10, (java.lang.String) r11)
            dfa r11 = new dfa
            r5 = r11
            r7 = r25
            r8 = r0
            r9 = r4
            r10 = r31
            r5.<init>((boolean) r6, (java.lang.String) r7, (defpackage.efa) r8, (defpackage.a32) r9, (java.lang.String) r10)
            lf6 r5 = new lf6
            r0 = r25
            r6 = 0
            r5.<init>(r0, r6, r11, r2)
        L_0x0a36:
            r62 = r5
        L_0x0a38:
            jwa r0 = r124.r()
            java.lang.Object r2 = r15.b
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.getClass()
            qe9 r5 = defpackage.qe9.DELETED
            qe9 r6 = r14.Y
            if (r6 != r5) goto L_0x0a58
            r5 = 0
        L_0x0a54:
            r64 = 0
            goto L_0x0aef
        L_0x0a58:
            boolean r5 = r14.C()
            if (r5 == 0) goto L_0x0aad
            w28 r5 = r14.x0
            if (r5 == 0) goto L_0x0a69
            g20 r6 = defpackage.g20.c
            l20 r5 = r5.I(r6)
            goto L_0x0a6a
        L_0x0a69:
            r5 = 0
        L_0x0a6a:
            if (r5 == 0) goto L_0x0a76
            x10 r6 = r5.b
            boolean r7 = r6.v
            if (r7 != 0) goto L_0x0a76
            boolean r7 = r5.y
            if (r7 == 0) goto L_0x0a78
        L_0x0a76:
            r5 = 0
            goto L_0x0aa4
        L_0x0a78:
            java.lang.String r5 = r5.r
            boolean r7 = defpackage.cjf.p(r5)
            if (r7 == 0) goto L_0x0a9d
            hea r8 = new hea
            kotlin.Lazy r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            po5 r2 = (defpackage.po5) r2
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            android.content.Context r0 = r0.a
            android.net.Uri r0 = r2.f(r0, r6)
            o9a r2 = defpackage.sq9.b
            r2 = 0
            r5 = 0
            r8.<init>(r2, r5, r0)
            goto L_0x0aaa
        L_0x0a9d:
            r5 = 0
            java.lang.String r6 = r6.a()
            if (r6 != 0) goto L_0x0aa6
        L_0x0aa4:
            r8 = 0
            goto L_0x0aaa
        L_0x0aa6:
            hea r8 = r0.d(r6, r2)
        L_0x0aaa:
            r64 = r8
            goto L_0x0aef
        L_0x0aad:
            r5 = 0
            boolean r6 = r14.F()
            if (r6 == 0) goto L_0x0a54
            f20 r6 = r14.l()
            if (r6 != 0) goto L_0x0abb
        L_0x0aba:
            goto L_0x0aa4
        L_0x0abb:
            java.lang.String r8 = r6.h
            if (r8 == 0) goto L_0x0ac5
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0ac6
        L_0x0ac5:
            r8 = 0
        L_0x0ac6:
            if (r8 != 0) goto L_0x0ae3
            java.lang.String r8 = r6.b
            if (r8 == 0) goto L_0x0ad2
            int r7 = r8.length()
            if (r7 != 0) goto L_0x0ad3
        L_0x0ad2:
            r8 = 0
        L_0x0ad3:
            if (r8 != 0) goto L_0x0ae3
            java.lang.String r8 = r6.f
            if (r8 == 0) goto L_0x0adf
            int r6 = r8.length()
            if (r6 != 0) goto L_0x0ae0
        L_0x0adf:
            r8 = 0
        L_0x0ae0:
            if (r8 != 0) goto L_0x0ae3
            goto L_0x0aba
        L_0x0ae3:
            int r6 = r8.length()
            if (r6 != 0) goto L_0x0aea
            goto L_0x0aba
        L_0x0aea:
            hea r8 = r0.d(r8, r2)
            goto L_0x0aaa
        L_0x0aef:
            cl4 r0 = r14.R0
            if (r0 == 0) goto L_0x0afa
            pj5 r0 = defpackage.pj5.SCHEDULED
        L_0x0af5:
            r63 = r0
            r2 = 4
            goto L_0x0b5d
        L_0x0afa:
            l72 r0 = r13.b
            l72 r2 = defpackage.l72.a
            if (r0 != r2) goto L_0x0b03
            pj5 r0 = defpackage.pj5.MESSAGE
            goto L_0x0af5
        L_0x0b03:
            if (r0 == r2) goto L_0x0b0e
            boolean r0 = r14.u()
            if (r0 == 0) goto L_0x0b0e
            pj5 r0 = defpackage.pj5.CHAT_REPLY
            goto L_0x0af5
        L_0x0b0e:
            boolean r0 = r14.z()
            if (r0 == 0) goto L_0x0b17
            pj5 r0 = defpackage.pj5.CHAT_SYSTEM_MESSAGE
            goto L_0x0af5
        L_0x0b17:
            int r0 = r14.T0
            int r0 = defpackage.tr1.y(r0)
            if (r0 == 0) goto L_0x0b59
            r2 = 1
            if (r0 == r2) goto L_0x0b38
            r2 = 2
            if (r0 == r2) goto L_0x0b34
            r2 = 3
            if (r0 == r2) goto L_0x0b30
            r2 = 4
            if (r0 == r2) goto L_0x0b31
            pj5 r0 = defpackage.pj5.UNKNOWN
        L_0x0b2d:
            r63 = r0
            goto L_0x0b5d
        L_0x0b30:
            r2 = 4
        L_0x0b31:
            pj5 r0 = defpackage.pj5.CHANNEL_MESSAGE
            goto L_0x0b2d
        L_0x0b34:
            r2 = 4
            pj5 r0 = defpackage.pj5.GROUP_CHAT
            goto L_0x0b2d
        L_0x0b38:
            r2 = 4
            l72 r0 = r13.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0b56
            r6 = 1
            if (r0 == r6) goto L_0x0b53
            r6 = 2
            if (r0 == r6) goto L_0x0b50
            r6 = 3
            if (r0 == r6) goto L_0x0b4d
            pj5 r0 = defpackage.pj5.UNKNOWN
            goto L_0x0b2d
        L_0x0b4d:
            pj5 r0 = defpackage.pj5.GROUP_CHAT
            goto L_0x0b2d
        L_0x0b50:
            pj5 r0 = defpackage.pj5.CHANNEL_MESSAGE
            goto L_0x0b2d
        L_0x0b53:
            pj5 r0 = defpackage.pj5.CHAT_MESSAGE
            goto L_0x0b2d
        L_0x0b56:
            pj5 r0 = defpackage.pj5.MESSAGE
            goto L_0x0b2d
        L_0x0b59:
            r2 = 4
            pj5 r0 = defpackage.pj5.UNKNOWN
            goto L_0x0b2d
        L_0x0b5d:
            bd9 r0 = new bd9
            r47 = r0
            long r6 = r4.a
            java.lang.Long r53 = java.lang.Long.valueOf(r6)
            r65 = 0
            r68 = 28672(0x7000, float:4.0178E-41)
            long r6 = r14.c
            r54 = r6
            r48 = r6
            r50 = 0
            long r6 = r14.w
            r57 = r6
            long r6 = r14.o
            r60 = r6
            r66 = 0
            r67 = 0
            r51 = r27
            r47.<init>(r48, r50, r51, r53, r54, r56, r57, r59, r60, r62, r63, r64, r65, r66, r67, r68)
            r3.add(r0)
            r0 = r125
            r5 = r18
            r13 = r26
            r2 = r29
            goto L_0x086f
        L_0x0b91:
            r15 = r124
            r125 = r0
            r29 = r2
            r2 = 4
            r5 = 0
            r19 = 0
            r23 = 5
            java.util.Iterator r0 = r3.iterator()
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L_0x0ba9
            r8 = 0
            goto L_0x0bcf
        L_0x0ba9:
            java.lang.Object r6 = r0.next()
            bd9 r6 = (defpackage.bd9) r6
            long r6 = r6.e
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x0bb5:
            r8 = r6
        L_0x0bb6:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0bcf
            java.lang.Object r6 = r0.next()
            bd9 r6 = (defpackage.bd9) r6
            long r6 = r6.e
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r7 = r8.compareTo(r6)
            if (r7 >= 0) goto L_0x0bb6
            goto L_0x0bb5
        L_0x0bcf:
            if (r8 == 0) goto L_0x0bee
            long r6 = r8.longValue()
            m72 r0 = r4.b
            int r9 = r0.m
            if (r9 > 0) goto L_0x0be1
            boolean r9 = r4.j0()
            if (r9 == 0) goto L_0x0bee
        L_0x0be1:
            d72 r0 = r0.a()
            long r9 = r0.d
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0bee
            r47 = 1
            goto L_0x0bf0
        L_0x0bee:
            r47 = r5
        L_0x0bf0:
            m72 r0 = r4.b
            l72 r0 = r0.b
            if (r0 != 0) goto L_0x0bf9
            r0 = -1
        L_0x0bf7:
            r6 = 1
            goto L_0x0c02
        L_0x0bf9:
            int[] r6 = defpackage.g38.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r6[r0]
            goto L_0x0bf7
        L_0x0c02:
            if (r0 == r6) goto L_0x0c16
            r7 = 2
            if (r0 == r7) goto L_0x0c12
            r9 = 3
            if (r0 == r9) goto L_0x0c0f
            zk2 r0 = defpackage.zk2.b
        L_0x0c0c:
            r42 = r0
            goto L_0x0c1b
        L_0x0c0f:
            zk2 r0 = defpackage.zk2.o
            goto L_0x0c0c
        L_0x0c12:
            r9 = 3
            zk2 r0 = defpackage.zk2.c
            goto L_0x0c0c
        L_0x0c16:
            r7 = 2
            r9 = 3
            zk2 r0 = defpackage.zk2.a
            goto L_0x0c0c
        L_0x0c1b:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            bd9 r0 = (defpackage.bd9) r0
            if (r0 == 0) goto L_0x0c28
            long r10 = r0.a
            r36 = r10
            goto L_0x0c2a
        L_0x0c28:
            r36 = r19
        L_0x0c2a:
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            bd9 r0 = (defpackage.bd9) r0
            if (r0 == 0) goto L_0x0c37
            java.lang.String r0 = r0.b
            r38 = r0
            goto L_0x0c39
        L_0x0c37:
            r38 = 0
        L_0x0c39:
            m72 r0 = r4.b
            long r10 = r0.a
            java.lang.String r41 = r4.r()
            jwa r13 = r124.r()
            r13.getClass()
            gwa r14 = new gwa
            r2 = 0
            r14.<init>(r13, r4, r2)
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.Object r4 = defpackage.ev0.C(r4, r14)
            r45 = r4
            android.graphics.Bitmap r45 = (android.graphics.Bitmap) r45
            if (r8 == 0) goto L_0x0c61
            long r13 = r8.longValue()
            r49 = r13
            goto L_0x0c63
        L_0x0c61:
            r49 = r19
        L_0x0c63:
            java.util.Iterator r4 = r3.iterator()
            boolean r8 = r4.hasNext()
            if (r8 != 0) goto L_0x0c6f
            r8 = r2
            goto L_0x0c95
        L_0x0c6f:
            java.lang.Object r8 = r4.next()
            bd9 r8 = (defpackage.bd9) r8
            long r13 = r8.i
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
        L_0x0c7b:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0c95
            java.lang.Object r13 = r4.next()
            bd9 r13 = (defpackage.bd9) r13
            long r13 = r13.i
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            int r14 = r8.compareTo(r13)
            if (r14 >= 0) goto L_0x0c7b
            r8 = r13
            goto L_0x0c7b
        L_0x0c95:
            if (r8 == 0) goto L_0x0c9e
            long r13 = r8.longValue()
            r51 = r13
            goto L_0x0ca0
        L_0x0c9e:
            r51 = r19
        L_0x0ca0:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            bd9 r4 = (defpackage.bd9) r4
            if (r4 == 0) goto L_0x0cad
            long r13 = r4.i
            r54 = r13
            goto L_0x0caf
        L_0x0cad:
            r54 = r19
        L_0x0caf:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            bd9 r4 = (defpackage.bd9) r4
            if (r4 == 0) goto L_0x0cc0
            pj5 r4 = r4.k
            if (r4 == 0) goto L_0x0cc0
            java.lang.String r8 = r4.a
            r53 = r8
            goto L_0x0cc2
        L_0x0cc0:
            r53 = r2
        L_0x0cc2:
            yk2 r4 = new yk2
            r35 = r4
            r39 = r10
            r43 = r3
            r44 = r12
            r48 = r1
            r35.<init>(r36, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r54)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0ce4
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0cde
            goto L_0x0ce4
        L_0x0cde:
            r0 = r125
            r2 = r29
            goto L_0x0832
        L_0x0ce4:
            long r10 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r3 = r29
            r3.put(r0, r4)
            r0 = r125
            r2 = r3
            goto L_0x0832
        L_0x0cf4:
            r3 = r2
            r5 = 0
            r6 = 1
            r0 = r30
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = r5
        L_0x0d00:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0d2d
            java.lang.Object r2 = r0.next()
            a32 r2 = (defpackage.a32) r2
            r7 = r33
            a33 r4 = r7.a
            boolean r4 = r2.X(r4)
            if (r4 != 0) goto L_0x0d1b
            m72 r4 = r2.b
            int r4 = r4.m
            goto L_0x0d24
        L_0x0d1b:
            boolean r4 = r2.C()
            if (r4 == 0) goto L_0x0d23
            r4 = r6
            goto L_0x0d24
        L_0x0d23:
            r4 = r5
        L_0x0d24:
            boolean r2 = r2.j0()
            int r2 = r2 + r4
            int r1 = r1 + r2
            r33 = r7
            goto L_0x0d00
        L_0x0d2d:
            bl2 r0 = new bl2
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h38.q(java.util.Set):bl2");
    }

    public final jwa r() {
        KProperty kProperty = Z[3];
        return (jwa) this.y.get();
    }
}
