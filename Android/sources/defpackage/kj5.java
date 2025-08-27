package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: kj5  reason: default package */
public final class kj5 extends b8 {
    public static final /* synthetic */ KProperty[] x0;
    public static final String y0;
    public final hs7 X;
    public final hs7 Y;
    public final hs7 Z;
    public final Context c;
    public final jtb o;
    public final hs7 v;
    public final hs7 v0;
    public final hs7 w;
    public final hs7 w0;
    public final hs7 x;
    public final hs7 y;
    public final hs7 z;

    static {
        Class<kj5> cls = kj5.class;
        x0 = new KProperty[]{wj6.p(cls, "fcmNotificationsRepository", "getFcmNotificationsRepository()Lru/ok/tamtam/android/notifications/messages/newpush/fcm/storage/FcmNotificationsRepository;", 0), wj6.p(cls, "fcmNotificationsHistoryRepository", "getFcmNotificationsHistoryRepository()Lru/ok/tamtam/android/notifications/messages/newpush/fcm/history/FcmNotificationsHistoryRepository;", 0), wj6.p(cls, "notificationsReadMarksRepository", "getNotificationsReadMarksRepository()Lru/ok/tamtam/android/notifications/messages/newpush/readmarks/NotificationsReadMarksRepository;", 0), wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), wj6.p(cls, "messagesNotificationsSettings", "getMessagesNotificationsSettings()Lru/ok/tamtam/android/notifications/messages/MessagesNotificationsSettings;", 0), wj6.p(cls, "notificationTextNotBundledHelper", "getNotificationTextNotBundledHelper()Lru/ok/tamtam/android/notifications/messages/newpush/NotificationTextNotBundledHelper;", 0), wj6.p(cls, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0), wj6.p(cls, "messageTextProcessor", "getMessageTextProcessor()Lru/ok/tamtam/MessageTextProcessor;", 0), wj6.p(cls, "texts", "getTexts()Lru/ok/tamtam/android/util/Texts;", 0)};
        y0 = cls.getName();
    }

    public kj5(Context context, jtb jtb, hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77, hs7 hs78, hs7 hs79, hs7 hs710, hs7 hs711) {
        super(hs7);
        this.c = context;
        this.o = jtb;
        this.v = hs72;
        this.w = hs73;
        this.x = hs74;
        this.y = hs75;
        this.z = hs76;
        this.X = hs77;
        this.Y = hs78;
        this.Z = hs79;
        this.v0 = hs710;
        this.w0 = hs711;
    }

    public final r62 q() {
        KProperty kProperty = x0[3];
        return (r62) this.y.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r7 = r7.d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap r(defpackage.mj5 r7) {
        /*
            r6 = this;
            long r0 = r7.a
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L_0x0028
            r62 r2 = r6.q()
            a32 r2 = r2.D(r0)
            if (r2 == 0) goto L_0x0028
            jwa r4 = r6.t()
            r4.getClass()
            gwa r5 = new gwa
            r5.<init>(r4, r2, r3)
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.Object r2 = defpackage.ev0.C(r2, r5)
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x0028:
            if (r3 != 0) goto L_0x0041
            java.lang.String r7 = r7.d
            if (r7 == 0) goto L_0x0041
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0035
            goto L_0x0041
        L_0x0035:
            jwa r6 = r6.t()
            jca r6 = r6.b()
            android.graphics.Bitmap r3 = r6.e(r7, r0)
        L_0x0041:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj5.r(mj5):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: mj5} */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0475, code lost:
        if (r10 != 0) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0286, code lost:
        if (r9.l == false) goto L_0x028d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bl2 s(java.util.Set r63, long r64) {
        /*
            r62 = this;
            r1 = r62
            kotlin.reflect.KProperty[] r2 = x0
            java.lang.String r3 = y0
            r4 = 0
            r0 = r2[r4]     // Catch:{ all -> 0x0032 }
            hs7 r0 = r1.v     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            rj5 r0 = (defpackage.rj5) r0     // Catch:{ all -> 0x0032 }
            j6d r0 = r0.a     // Catch:{ all -> 0x0032 }
            mka r0 = r0.n()     // Catch:{ all -> 0x0032 }
            mz4 r5 = defpackage.mz4.c     // Catch:{ all -> 0x0032 }
            wbe r0 = r0.i(r5)     // Catch:{ all -> 0x0032 }
            yl4 r5 = new yl4     // Catch:{ all -> 0x0032 }
            r6 = 5
            r7 = r64
            r5.<init>((long) r7, (int) r6)     // Catch:{ all -> 0x0032 }
            wbe r6 = new wbe     // Catch:{ all -> 0x0032 }
            r7 = 0
            r6.<init>(r0, r5, r7)     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r6.f()     // Catch:{ all -> 0x0032 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0032 }
            goto L_0x003c
        L_0x0032:
            r0 = move-exception
            java.lang.String r5 = "failed to read fcm notifications"
            defpackage.z68.f(r3, r5, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x003c:
            r5 = r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r0.<init>(r6)
            java.util.Iterator r6 = r5.iterator()
        L_0x004c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r6.next()
            mj5 r7 = (defpackage.mj5) r7
            long r7 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.add(r7)
            goto L_0x004c
        L_0x0062:
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.distinct(r0)
            r6 = 2
            r7 = r2[r6]     // Catch:{ all -> 0x00d2 }
            hs7 r7 = r1.x     // Catch:{ all -> 0x00d2 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00d2 }
            mfa r7 = (defpackage.mfa) r7     // Catch:{ all -> 0x00d2 }
            r7.getClass()     // Catch:{ all -> 0x00d2 }
            kotlin.reflect.KProperty[] r8 = defpackage.mfa.c     // Catch:{ all -> 0x00d2 }
            r8 = r8[r4]     // Catch:{ all -> 0x00d2 }
            hs7 r7 = r7.a     // Catch:{ all -> 0x00d2 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00d2 }
            j6d r7 = (defpackage.j6d) r7     // Catch:{ all -> 0x00d2 }
            mka r7 = r7.n()     // Catch:{ all -> 0x00d2 }
            u9a r8 = defpackage.u9a.w     // Catch:{ all -> 0x00d2 }
            wbe r7 = r7.i(r8)     // Catch:{ all -> 0x00d2 }
            ej5 r8 = new ej5     // Catch:{ all -> 0x00d2 }
            r9 = 2
            r8.<init>(r9, r0)     // Catch:{ all -> 0x00d2 }
            wbe r0 = new wbe     // Catch:{ all -> 0x00d2 }
            r9 = 0
            r0.<init>(r7, r8, r9)     // Catch:{ all -> 0x00d2 }
            java.lang.Object r0 = r0.f()     // Catch:{ all -> 0x00d2 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00d2 }
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)     // Catch:{ all -> 0x00d2 }
            int r7 = kotlin.collections.MapsKt.mapCapacity(r7)     // Catch:{ all -> 0x00d2 }
            r8 = 16
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast((int) r7, (int) r8)     // Catch:{ all -> 0x00d2 }
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00d2 }
            r8.<init>(r7)     // Catch:{ all -> 0x00d2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00d2 }
        L_0x00b3:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x00d2 }
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x00d2 }
            r9 = r7
            uea r9 = (defpackage.uea) r9     // Catch:{ all -> 0x00d2 }
            long r9 = r9.a     // Catch:{ all -> 0x00d2 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00d2 }
            uea r7 = (defpackage.uea) r7     // Catch:{ all -> 0x00d2 }
            long r10 = r7.b     // Catch:{ all -> 0x00d2 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00d2 }
            r8.put(r9, r7)     // Catch:{ all -> 0x00d2 }
            goto L_0x00b3
        L_0x00d2:
            r0 = move-exception
            java.lang.String r7 = "getSystemReadMarks: failed"
            defpackage.z68.f(r3, r7, r0)
            java.util.Map r8 = kotlin.collections.MapsKt.emptyMap()
        L_0x00dc:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r5.iterator()
        L_0x00e5:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0111
            java.lang.Object r5 = r0.next()
            r9 = r5
            mj5 r9 = (defpackage.mj5) r9
            long r10 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = r8.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x0105
            long r10 = r10.longValue()
            goto L_0x0107
        L_0x0105:
            r10 = -9223372036854775808
        L_0x0107:
            long r12 = r9.g
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x00e5
            r7.add(r5)
            goto L_0x00e5
        L_0x0111:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x011f
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r35 = r7
            goto L_0x0730
        L_0x011f:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r0 = r7.iterator()
        L_0x0128:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0165
            java.lang.Object r8 = r0.next()
            mj5 r8 = (defpackage.mj5) r8
            boolean r9 = r63.isEmpty()
            if (r9 != 0) goto L_0x0149
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = r63
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x0128
            goto L_0x014b
        L_0x0149:
            r10 = r63
        L_0x014b:
            long r11 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.lang.Object r11 = r5.get(r9)
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L_0x0161
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r5.put(r9, r11)
        L_0x0161:
            r11.add(r8)
            goto L_0x0128
        L_0x0165:
            java.util.Set r8 = r5.keySet()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r0 = r8.size()
            r9.<init>(r0)
            r10 = 1
            r0 = r2[r10]     // Catch:{ all -> 0x01a0 }
            hs7 r0 = r1.w     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01a0 }
            qj5 r0 = (defpackage.qj5) r0     // Catch:{ all -> 0x01a0 }
            java.util.List r11 = kotlin.collections.CollectionsKt.toList(r8)     // Catch:{ all -> 0x01a0 }
            j6d r0 = r0.a     // Catch:{ all -> 0x01a0 }
            mka r0 = r0.n()     // Catch:{ all -> 0x01a0 }
            v02 r12 = defpackage.v02.c     // Catch:{ all -> 0x01a0 }
            wbe r0 = r0.i(r12)     // Catch:{ all -> 0x01a0 }
            ej5 r12 = new ej5     // Catch:{ all -> 0x01a0 }
            r13 = 1
            r12.<init>(r13, r11)     // Catch:{ all -> 0x01a0 }
            wbe r11 = new wbe     // Catch:{ all -> 0x01a0 }
            r13 = 0
            r11.<init>(r0, r12, r13)     // Catch:{ all -> 0x01a0 }
            java.lang.Object r0 = r11.f()     // Catch:{ all -> 0x01a0 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01a0 }
            goto L_0x01aa
        L_0x01a0:
            r0 = move-exception
            java.lang.String r11 = "failed to get notifications history items"
            defpackage.z68.f(r3, r11, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x01aa:
            jwa r3 = r62.t()
            kotlin.Lazy r3 = r3.b
            java.lang.Object r3 = r3.getValue()
            jtb r3 = (defpackage.jtb) r3
            ltb r3 = (defpackage.ltb) r3
            hq r3 = r3.c
            boolean r3 = r3.B()
            jtb r11 = r1.o
            r15 = r11
            ltb r15 = (defpackage.ltb) r15
            hq r11 = r15.c
            int r32 = r11.o()
            hq r11 = r15.c
            int r33 = r11.n()
            java.util.Iterator r8 = r8.iterator()
        L_0x01d3:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x072c
            java.lang.Object r11 = r8.next()
            r14 = r11
            java.lang.Long r14 = (java.lang.Long) r14
            java.lang.Object r11 = r5.get(r14)
            java.util.List r11 = (java.util.List) r11
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            if (r12 == 0) goto L_0x01f1
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0200
        L_0x01f1:
            r60 = r2
            r37 = r3
            r65 = r5
            r35 = r7
            r34 = r8
            r2 = r9
            r7 = r10
            r4 = r15
            goto L_0x070f
        L_0x0200:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r11.size()
            r12.<init>(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            kotlin.LazyThreadSafetyMode r4 = kotlin.LazyThreadSafetyMode.NONE
            u75 r10 = new u75
            r6 = 3
            r10.<init>(r6, r11)
            kotlin.Lazy r4 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r10)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.last(r11)
            mj5 r6 = (defpackage.mj5) r6
            pj5 r10 = r6.c
            int r10 = r10.ordinal()
            r65 = r5
            if (r10 == 0) goto L_0x023f
            r5 = 2
            if (r10 == r5) goto L_0x023c
            r5 = 5
            if (r10 == r5) goto L_0x0239
            r5 = 6
            if (r10 == r5) goto L_0x0236
            zk2 r5 = defpackage.zk2.b
            goto L_0x0241
        L_0x0236:
            zk2 r5 = defpackage.zk2.v
            goto L_0x0241
        L_0x0239:
            zk2 r5 = defpackage.zk2.o
            goto L_0x0241
        L_0x023c:
            zk2 r5 = defpackage.zk2.c
            goto L_0x0241
        L_0x023f:
            zk2 r5 = defpackage.zk2.a
        L_0x0241:
            pj5 r10 = defpackage.pj5.MESSAGE
            r34 = r8
            pj5 r8 = r6.c
            r35 = r7
            java.lang.String r7 = r6.d
            if (r8 != r10) goto L_0x0250
            java.lang.String r8 = r6.e
            goto L_0x0251
        L_0x0250:
            r8 = r7
        L_0x0251:
            java.lang.String r10 = ""
            if (r8 != 0) goto L_0x0256
            r8 = r10
        L_0x0256:
            java.util.Iterator r24 = r11.iterator()
            r25 = 0
            r26 = r10
            r10 = r25
        L_0x0260:
            boolean r17 = r24.hasNext()
            r18 = 0
            if (r17 == 0) goto L_0x058b
            java.lang.Object r17 = r24.next()
            r36 = r9
            r9 = r17
            mj5 r9 = (defpackage.mj5) r9
            r37 = r3
            r27 = r4
            if (r10 == 0) goto L_0x0289
            long r3 = r9.g
            r28 = r7
            r29 = r8
            long r7 = r10.g
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x028e
            boolean r3 = r9.l
            if (r3 != 0) goto L_0x028e
            goto L_0x028d
        L_0x0289:
            r28 = r7
            r29 = r8
        L_0x028d:
            r10 = r9
        L_0x028e:
            boolean r3 = r9.l
            boolean r4 = r1.a
            a33 r7 = r15.a
            if (r3 == 0) goto L_0x03b8
            r62 r3 = r62.q()
            r30 = r10
            r8 = r11
            long r10 = r14.longValue()
            a32 r3 = r3.D(r10)
            if (r3 == 0) goto L_0x02c1
            r10 = 7
            r10 = r2[r10]
            hs7 r10 = r1.Z
            java.lang.Object r10 = r10.get()
            fa9 r10 = (defpackage.fa9) r10
            r31 = r5
            r11 = r6
            long r5 = r3.a
            r38 = r11
            r3 = r12
            long r11 = r9.b
            ha9 r5 = r10.k(r5, r11)
            goto L_0x02c8
        L_0x02c1:
            r31 = r5
            r38 = r6
            r3 = r12
            r5 = r25
        L_0x02c8:
            java.lang.String r6 = r9.h
            if (r5 != 0) goto L_0x02cd
            goto L_0x0316
        L_0x02cd:
            int r10 = r6.length()
            hs7 r11 = r1.v0
            r12 = 8
            if (r10 <= 0) goto L_0x02e6
            r7 = r2[r12]
            java.lang.Object r7 = r11.get()
            yva r7 = (defpackage.yva) r7
            r7.getClass()
            r5.F()
            goto L_0x0316
        L_0x02e6:
            r6 = 9
            r6 = r2[r6]
            hs7 r6 = r1.w0
            java.lang.Object r6 = r6.get()
            r39 = r6
            ghf r39 = (defpackage.ghf) r39
            r6 = r2[r12]
            java.lang.Object r6 = r11.get()
            r41 = r6
            yva r41 = (defpackage.yva) r41
            long r47 = r7.s()
            r44 = 0
            r49 = 1
            android.content.Context r6 = r1.c
            r43 = 1
            r45 = 1
            r46 = 0
            r40 = r6
            r42 = r5
            java.lang.String r6 = r39.f(r40, r41, r42, r43, r44, r45, r46, r47, r49)
        L_0x0316:
            boolean r7 = r9.m
            android.content.Context r10 = r1.c
            if (r7 == 0) goto L_0x032b
            int r7 = defpackage.tmc.tt_scheduled_message_send_failure
            if (r6 != 0) goto L_0x0322
            r6 = r26
        L_0x0322:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r10.getString(r7, r6)
            goto L_0x0339
        L_0x032b:
            int r7 = defpackage.tmc.tt_scheduled_message_send_success
            if (r6 != 0) goto L_0x0331
            r6 = r26
        L_0x0331:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r10.getString(r7, r6)
        L_0x0339:
            android.content.res.Resources r7 = r10.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.getLayoutDirection()
            r10 = 1
            if (r7 != r10) goto L_0x034f
            java.lang.String r7 = " ⏱️"
            java.lang.String r6 = defpackage.tr1.j(r6, r7)
            goto L_0x0355
        L_0x034f:
            java.lang.String r7 = "⏱ ️"
            java.lang.String r6 = defpackage.a81.m(r7, r6)
        L_0x0355:
            long r43 = r14.longValue()
            if (r5 == 0) goto L_0x0364
            long r10 = r5.z
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r45 = r5
            goto L_0x0366
        L_0x0364:
            r45 = r25
        L_0x0366:
            jwa r5 = r62.t()
            r5.getClass()
            android.graphics.Bitmap r51 = r1.r(r9)
            lf6 r5 = new lf6
            r5.<init>((java.lang.String) r6, (boolean) r4)
            bd9 r4 = new bd9
            r39 = r4
            r57 = 1
            r60 = 2048(0x800, float:2.87E-42)
            long r6 = r9.i
            r40 = r6
            java.lang.String r6 = r9.j
            r42 = r6
            long r6 = r9.b
            r46 = r6
            java.lang.String r48 = ""
            long r6 = r9.f
            r49 = r6
            long r6 = r9.g
            r52 = r6
            pj5 r6 = r9.c
            r55 = r6
            r56 = 0
            r58 = 1
            boolean r6 = r9.m
            r59 = r6
            r54 = r5
            r39.<init>(r40, r42, r43, r45, r46, r48, r49, r51, r52, r54, r55, r56, r57, r58, r59, r60)
            r3.add(r4)
            r60 = r2
            r12 = r8
        L_0x03ab:
            r61 = r15
            r8 = r29
            r15 = r31
            r7 = r38
            r2 = 0
            r38 = r13
            goto L_0x0575
        L_0x03b8:
            r31 = r5
            r38 = r6
            r30 = r10
            r8 = r11
            r3 = r12
            r62 r5 = r62.q()
            long r10 = r9.a
            a32 r5 = r5.D(r10)
            if (r5 == 0) goto L_0x03e3
            boolean r6 = r5.N()
            if (r6 == 0) goto L_0x03d5
            r6 = r32
            goto L_0x03d7
        L_0x03d5:
            r6 = r33
        L_0x03d7:
            if (r6 == 0) goto L_0x03dd
            r10 = 1
            if (r6 == r10) goto L_0x03e5
            goto L_0x03e3
        L_0x03dd:
            boolean r6 = r5.X(r7)
            if (r6 != 0) goto L_0x03e5
        L_0x03e3:
            r12 = r8
            goto L_0x0401
        L_0x03e5:
            hx4 r46 = defpackage.hx4.CHAT_MUTED
            jga r4 = new jga
            long r5 = r9.a
            long r10 = r9.b
            r12 = r8
            long r7 = r9.g
            r39 = r4
            r40 = r5
            r42 = r10
            r44 = r7
            r39.<init>(r40, r42, r44, r46)
            r13.add(r4)
            r60 = r2
            goto L_0x03ab
        L_0x0401:
            pj5 r6 = defpackage.pj5.GROUP_CHAT
            pj5 r7 = r9.c
            long r10 = r9.f
            if (r7 != r6) goto L_0x040a
            goto L_0x040e
        L_0x040a:
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 != 0) goto L_0x0410
        L_0x040e:
            r6 = 1
            goto L_0x0411
        L_0x0410:
            r6 = 0
        L_0x0411:
            if (r6 == 0) goto L_0x0427
            r7 = r38
            android.graphics.Bitmap r8 = r1.u(r7)
            r38 = r13
            if (r28 != 0) goto L_0x0420
            r13 = r26
            goto L_0x0422
        L_0x0420:
            r13 = r28
        L_0x0422:
            kotlin.Pair r8 = kotlin.TuplesKt.to(r8, r13)
            goto L_0x0449
        L_0x0427:
            r7 = r38
            r38 = r13
            java.lang.Object r8 = r27.getValue()
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r8 = kotlin.collections.MapsKt.getValue(r8, r13)
            mj5 r8 = (defpackage.mj5) r8
            android.graphics.Bitmap r13 = r1.u(r8)
            java.lang.String r8 = r8.e
            if (r8 != 0) goto L_0x0445
            r8 = r26
        L_0x0445:
            kotlin.Pair r8 = kotlin.TuplesKt.to(r13, r8)
        L_0x0449:
            java.lang.Object r13 = r8.component1()
            r51 = r13
            android.graphics.Bitmap r51 = (android.graphics.Bitmap) r51
            java.lang.Object r8 = r8.component2()
            r48 = r8
            java.lang.String r48 = (java.lang.String) r48
            if (r6 == 0) goto L_0x045d
        L_0x045b:
            r10 = 1
            goto L_0x0478
        L_0x045d:
            r8 = 4
            r8 = r2[r8]
            hs7 r8 = r1.z
            java.lang.Object r8 = r8.get()
            km3 r8 = (defpackage.km3) r8
            r13 = 0
            vk3 r8 = r8.p(r10, r13)
            if (r8 == 0) goto L_0x045b
            vm3 r8 = r8.a
            um3 r8 = r8.c
            int r10 = r8.l
            if (r10 != 0) goto L_0x0478
            goto L_0x045b
        L_0x0478:
            jwa r8 = r62.t()
            kotlin.Lazy r8 = r8.b
            java.lang.Object r8 = r8.getValue()
            jtb r8 = (defpackage.jtb) r8
            ltb r8 = (defpackage.ltb) r8
            hq r8 = r8.c
            boolean r8 = r8.B()
            r6 = r6 ^ 1
            java.lang.String r11 = r9.h
            if (r4 == 0) goto L_0x04a5
            lf6 r4 = new lf6
            r13 = 1
            r4.<init>((java.lang.String) r11, (boolean) r13)
            r60 = r2
            r54 = r4
            r61 = r15
            r8 = r29
            r15 = r31
            r2 = 0
            goto L_0x0514
        L_0x04a5:
            r4 = 6
            r13 = 1
            r16 = r2[r4]
            hs7 r4 = r1.Y
            java.lang.Object r4 = r4.get()
            efa r4 = (defpackage.efa) r4
            r4.getClass()
            java.lang.String r13 = defpackage.ghf.n(r48)
            r60 = r2
            zk2 r2 = defpackage.zk2.a
            r61 = r15
            r15 = r31
            if (r15 != r2) goto L_0x04c4
            r2 = 1
            goto L_0x04c5
        L_0x04c4:
            r2 = 0
        L_0x04c5:
            if (r8 != 0) goto L_0x04d7
            android.content.Context r4 = r4.a
            r8 = r29
            java.lang.String r2 = defpackage.ghf.q(r4, r13, r2, r10, r8)
            lf6 r4 = new lf6
            r6 = 0
            r4.<init>((java.lang.String) r2, (boolean) r6)
            r2 = r6
            goto L_0x0512
        L_0x04d7:
            r8 = r29
            if (r2 != 0) goto L_0x04e9
            zk2 r2 = defpackage.zk2.c
            if (r15 != r2) goto L_0x04e2
            if (r6 != 0) goto L_0x04e2
            goto L_0x04e9
        L_0x04e2:
            zk2 r2 = defpackage.zk2.o
            if (r15 != r2) goto L_0x04e7
            goto L_0x04e9
        L_0x04e7:
            r2 = 0
            goto L_0x04ea
        L_0x04e9:
            r2 = 1
        L_0x04ea:
            cfa r6 = new cfa
            r17 = r6
            r18 = r2
            r19 = r48
            r20 = r11
            r21 = r4
            r22 = r8
            r23 = r13
            r17.<init>((boolean) r18, (java.lang.String) r19, (java.lang.String) r20, (defpackage.efa) r21, (java.lang.String) r22, (java.lang.String) r23)
            dfa r10 = new dfa
            r17 = r10
            r19 = r11
            r20 = r4
            r21 = r8
            r22 = r13
            r17.<init>((boolean) r18, (java.lang.String) r19, (defpackage.efa) r20, (java.lang.String) r21, (java.lang.String) r22)
            lf6 r4 = new lf6
            r2 = 0
            r4.<init>(r11, r2, r10, r6)
        L_0x0512:
            r54 = r4
        L_0x0514:
            long r43 = r14.longValue()
            if (r5 == 0) goto L_0x0523
            long r4 = r5.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r45 = r4
            goto L_0x0525
        L_0x0523:
            r45 = r25
        L_0x0525:
            java.lang.String r4 = r9.k
            if (r4 == 0) goto L_0x0549
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0530
            goto L_0x0549
        L_0x0530:
            jwa r5 = r62.t()
            java.lang.Object r6 = r1.b
            kotlin.Lazy r6 = (kotlin.Lazy) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            hea r4 = r5.d(r4, r6)
            r56 = r4
            goto L_0x054b
        L_0x0549:
            r56 = r25
        L_0x054b:
            bd9 r4 = new bd9
            r39 = r4
            r57 = 1
            r58 = 0
            long r5 = r9.i
            r40 = r5
            java.lang.String r5 = r9.j
            r42 = r5
            long r5 = r9.b
            r46 = r5
            long r5 = r9.f
            r49 = r5
            long r5 = r9.g
            r52 = r5
            pj5 r5 = r9.c
            r55 = r5
            boolean r5 = r9.m
            r59 = r5
            r39.<init>(r40, r42, r43, r45, r46, r48, r49, r51, r52, r54, r55, r56, r57, r58, r59)
            r3.add(r4)
        L_0x0575:
            r6 = r7
            r11 = r12
            r5 = r15
            r4 = r27
            r7 = r28
            r10 = r30
            r9 = r36
            r13 = r38
            r2 = r60
            r15 = r61
            r12 = r3
            r3 = r37
            goto L_0x0260
        L_0x058b:
            r60 = r2
            r37 = r3
            r7 = r6
            r36 = r9
            r3 = r12
            r38 = r13
            r61 = r15
            r2 = 0
            r15 = r5
            r12 = r11
            long r4 = r14.longValue()
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x05a5:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x05bd
            java.lang.Object r9 = r6.next()
            r11 = r9
            oj5 r11 = (defpackage.oj5) r11
            r13 = r3
            long r2 = r11.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x05ba
            goto L_0x05c0
        L_0x05ba:
            r3 = r13
            r2 = 0
            goto L_0x05a5
        L_0x05bd:
            r13 = r3
            r9 = r25
        L_0x05c0:
            oj5 r9 = (defpackage.oj5) r9
            if (r9 == 0) goto L_0x05c7
            long r2 = r9.b
            goto L_0x05c9
        L_0x05c7:
            r2 = r18
        L_0x05c9:
            r11 = r12
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r4 = r11.iterator()
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0726
            java.lang.Object r5 = r4.next()
            mj5 r5 = (defpackage.mj5) r5
            long r5 = r5.b
        L_0x05de:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x05f6
            java.lang.Object r9 = r4.next()
            mj5 r9 = (defpackage.mj5) r9
            r29 = r8
            long r8 = r9.b
            int r16 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x05f3
            r5 = r8
        L_0x05f3:
            r8 = r29
            goto L_0x05de
        L_0x05f6:
            r29 = r8
            java.util.Iterator r4 = r11.iterator()
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0720
            java.lang.Object r8 = r4.next()
            mj5 r8 = (defpackage.mj5) r8
            long r8 = r8.g
        L_0x060a:
            r27 = r8
        L_0x060c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x061f
            java.lang.Object r8 = r4.next()
            mj5 r8 = (defpackage.mj5) r8
            long r8 = r8.g
            int r11 = (r27 > r8 ? 1 : (r27 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x060c
            goto L_0x060a
        L_0x061f:
            if (r10 == 0) goto L_0x0624
            long r8 = r10.i
            goto L_0x0649
        L_0x0624:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            mj5 r4 = (defpackage.mj5) r4
            if (r4 == 0) goto L_0x062f
            long r8 = r4.i
            goto L_0x0649
        L_0x062f:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r13)
            bd9 r4 = (defpackage.bd9) r4
            if (r4 == 0) goto L_0x063e
            long r8 = r4.a
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            goto L_0x0640
        L_0x063e:
            r4 = r25
        L_0x0640:
            if (r4 == 0) goto L_0x0647
            long r8 = r4.longValue()
            goto L_0x0649
        L_0x0647:
            r8 = r18
        L_0x0649:
            if (r10 == 0) goto L_0x064f
            java.lang.String r4 = r10.j
            if (r4 != 0) goto L_0x066b
        L_0x064f:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            mj5 r4 = (defpackage.mj5) r4
            if (r4 == 0) goto L_0x065a
            java.lang.String r4 = r4.j
            goto L_0x065c
        L_0x065a:
            r4 = r25
        L_0x065c:
            if (r4 != 0) goto L_0x066b
            java.lang.Object r4 = kotlin.collections.CollectionsKt.lastOrNull(r13)
            bd9 r4 = (defpackage.bd9) r4
            if (r4 == 0) goto L_0x0669
            java.lang.String r4 = r4.b
            goto L_0x066b
        L_0x0669:
            r4 = r25
        L_0x066b:
            long r16 = r14.longValue()
            android.graphics.Bitmap r21 = r1.r(r7)
            int r22 = r12.size()
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x067e
            r23 = 1
            goto L_0x0680
        L_0x067e:
            r23 = 0
        L_0x0680:
            if (r10 == 0) goto L_0x0687
            long r2 = r10.g
        L_0x0684:
            r30 = r2
            goto L_0x06ac
        L_0x0687:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            mj5 r2 = (defpackage.mj5) r2
            if (r2 == 0) goto L_0x0692
            long r2 = r2.g
            goto L_0x0684
        L_0x0692:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r13)
            bd9 r2 = (defpackage.bd9) r2
            if (r2 == 0) goto L_0x06a1
            long r2 = r2.i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x06a3
        L_0x06a1:
            r2 = r25
        L_0x06a3:
            if (r2 == 0) goto L_0x06aa
            long r2 = r2.longValue()
            goto L_0x0684
        L_0x06aa:
            r30 = r18
        L_0x06ac:
            if (r10 == 0) goto L_0x06b6
            pj5 r2 = r10.c
            if (r2 == 0) goto L_0x06b6
            java.lang.String r2 = r2.a
            if (r2 != 0) goto L_0x06d6
        L_0x06b6:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            mj5 r2 = (defpackage.mj5) r2
            if (r2 == 0) goto L_0x06c5
            pj5 r2 = r2.c
            if (r2 == 0) goto L_0x06c5
            java.lang.String r2 = r2.a
            goto L_0x06d6
        L_0x06c5:
            java.lang.Object r2 = kotlin.collections.CollectionsKt.lastOrNull(r13)
            bd9 r2 = (defpackage.bd9) r2
            if (r2 == 0) goto L_0x06d4
            pj5 r2 = r2.k
            if (r2 == 0) goto L_0x06d4
            java.lang.String r2 = r2.a
            goto L_0x06d6
        L_0x06d4:
            r2 = r25
        L_0x06d6:
            yk2 r3 = new yk2
            r11 = r3
            r19 = r13
            r20 = r38
            r7 = 1
            r12 = r8
            r8 = r14
            r14 = r4
            r9 = r15
            r4 = r61
            r15 = r16
            r17 = r29
            r18 = r9
            r24 = r37
            r25 = r5
            r29 = r2
            r11.<init>(r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            r2 = r36
            r2.put(r8, r3)
            if (r10 == 0) goto L_0x070f
            r62 r11 = r62.q()
            long r12 = r8.longValue()
            long r5 = r10.g
            long r14 = r10.b
            java.lang.String r3 = r10.h
            r16 = r5
            r18 = r3
            r11.w0(r12, r14, r16, r18)
        L_0x070f:
            r5 = r65
            r9 = r2
            r15 = r4
            r10 = r7
            r8 = r34
            r7 = r35
            r3 = r37
            r2 = r60
            r4 = 0
            r6 = 2
            goto L_0x01d3
        L_0x0720:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0726:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x072c:
            r35 = r7
            r2 = r9
            r0 = r2
        L_0x0730:
            bl2 r1 = new bl2
            int r2 = r35.size()
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj5.s(java.util.Set, long):bl2");
    }

    public final jwa t() {
        KProperty kProperty = x0[5];
        return (jwa) this.X.get();
    }

    public final Bitmap u(mj5 mj5) {
        int i = jj5.$EnumSwitchMapping$0[mj5.c.ordinal()];
        long j = mj5.f;
        if (i != 1) {
            return j != 0 ? v(mj5) : r(mj5);
        }
        if (j != 0) {
            return v(mj5);
        }
        return null;
    }

    public final Bitmap v(mj5 mj5) {
        KProperty kProperty = x0[4];
        vk3 p = ((km3) this.z.get()).p(mj5.f, false);
        if (p == null) {
            jwa t = t();
            String str = mj5.e;
            if (str == null) {
                str = "";
            }
            return t.b().e(str, mj5.f);
        }
        jwa t2 = t();
        t2.getClass();
        return (Bitmap) ev0.C(EmptyCoroutineContext.INSTANCE, new iwa(t2, p, (Continuation) null));
    }
}
