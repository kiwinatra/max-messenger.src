package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: dl2  reason: default package */
public final class dl2 {
    public static final /* synthetic */ KProperty[] h;
    public static final String i;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;

    static {
        Class<dl2> cls = dl2.class;
        h = new KProperty[]{wj6.p(cls, "localRepository", "getLocalRepository()Lru/ok/tamtam/android/notifications/messages/newpush/repos/data/LocalChatNotificationsDataRepository;", 0), wj6.p(cls, "fcmRepository", "getFcmRepository()Lru/ok/tamtam/android/notifications/messages/newpush/repos/data/FcmChatNotificationsDataRepository;", 0), wj6.p(cls, "fcmNotificationsHistoryRepository", "getFcmNotificationsHistoryRepository()Lru/ok/tamtam/android/notifications/messages/newpush/fcm/history/FcmNotificationsHistoryRepository;", 0), wj6.p(cls, "prefs", "getPrefs()Lru/ok/tamtam/Prefs;", 0), wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0), wj6.p(cls, "messagesNotificationsSettings", "getMessagesNotificationsSettings()Lru/ok/tamtam/android/notifications/messages/MessagesNotificationsSettings;", 0)};
        i = cls.getName();
    }

    public dl2(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
        this.g = hs77;
    }

    public static fea e(fea fea) {
        fea fea2 = fea;
        Map map = fea2.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sequence map2 = SequencesKt.map(CollectionsKt.asSequence(((yk2) entry.getValue()).f), new gl1(16));
            Iterable<jga> iterable = ((yk2) entry.getValue()).g;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (jga jga : iterable) {
                long j = jga.a;
                hx4 hx4 = hx4.DO_NOT_DISTURB_MODE;
                long j2 = jga.b;
                long j3 = jga.c;
                jga jga2 = r9;
                jga jga3 = new jga(j, j2, j3, hx4);
                arrayList.add(jga2);
            }
            linkedHashMap.put(key, yk2.a((yk2) entry.getValue(), CollectionsKt.emptyList(), SequencesKt.toList(SequencesKt___SequencesKt.plus(map2, arrayList)), false, 32415));
        }
        return new fea(linkedHashMap, fea2.b, 0, fea2.d, fea2.e, fea2.f, fea2.g);
    }

    public final r62 a() {
        KProperty kProperty = h[4];
        return (r62) this.e.get();
    }

    public final synchronized fea b(Set set) {
        fea d2;
        try {
            Set set2 = SequencesKt.toSet(SequencesKt.map(SequencesKt.filterNot(CollectionsKt.asSequence(a().J(set)), new l(26, this)), new gl1(15)));
            long o = ((ltb) c()).a.o();
            r62 a2 = a();
            a2.f();
            long max = Math.max(o, ((Long) a2.o0("getMaxLastEventTime", new b62(a2, 3))).longValue()) - 1;
            String str = i;
            z68.c(str, "getChatsNotifications: chatServerIds=" + set2 + ", maxCacheSyncTime=" + max, new Object[0]);
            KProperty[] kPropertyArr = h;
            boolean z = false;
            KProperty kProperty = kPropertyArr[0];
            bl2 q = ((h38) this.a.get()).q(set2);
            KProperty kProperty2 = kPropertyArr[1];
            bl2 s = ((kj5) this.b.get()).s(set2, max);
            z68.c(str, "fcmNotificationData = %s", s);
            Set set3 = CollectionsKt.toSet(CollectionsKt.sortedWith(SetsKt.plus(q.a.keySet(), s.a.keySet()), new gt(q, s)));
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new s2(19, (Object) this, (Object) set3));
            d2 = d(set3, q, s, new ur(11, lazy));
            long z2 = ((ltb) c()).c.z();
            long m = ((ltb) c()).a.m();
            if (z2 == -1 || m < z2) {
                z = true;
            }
            if (!z) {
                g(s, lazy);
                f(q);
            }
            if (z) {
                d2 = e(d2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return d2;
    }

    public final jtb c() {
        KProperty kProperty = h[3];
        return (jtb) this.d.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: yk2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fea d(java.util.Set r49, defpackage.bl2 r50, defpackage.bl2 r51, defpackage.ur r52) {
        /*
            r48 = this;
            r0 = r48
            r1 = r49
            r2 = r50
            r3 = r51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "merge: starting for "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = i
            defpackage.z68.c(r5, r4, new java.lang.Object[0])
            boolean r4 = r49.isEmpty()
            if (r4 == 0) goto L_0x002b
            java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
            r0 = r2
            r2 = r5
            r3 = 0
            r5 = r4
            goto L_0x0363
        L_0x002b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r9 = r49.size()
            r4.<init>(r9)
            java.util.Iterator r9 = r49.iterator()
        L_0x0038:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x035d
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.util.Map r13 = r2.a
            java.lang.Object r12 = r13.get(r12)
            yk2 r12 = (defpackage.yk2) r12
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.util.Map r14 = r3.a
            java.lang.Object r13 = r14.get(r13)
            yk2 r13 = (defpackage.yk2) r13
            java.lang.String r8 = " "
            java.lang.String r15 = "mergeNotificationsMap: chatServerId="
            if (r13 == 0) goto L_0x00fe
            if (r12 != 0) goto L_0x00fe
            boolean r12 = r13.j
            if (r12 == 0) goto L_0x00d8
            r62 r12 = r48.a()
            a32 r12 = r12.D(r10)
            if (r12 == 0) goto L_0x0085
            m72 r12 = r12.b
            if (r12 == 0) goto L_0x0085
            d72 r12 = r12.a()
            if (r12 == 0) goto L_0x0085
            long r6 = r12.d
            r19 = r15
            goto L_0x0089
        L_0x0085:
            r19 = r15
            r6 = -1
        L_0x0089:
            long r14 = r13.l
            int r12 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            r20 = r9
            if (r12 <= 0) goto L_0x0093
            r12 = 1
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            r0 = 0
            r1 = 32255(0x7dff, float:4.5199E-41)
            yk2 r1 = defpackage.yk2.a(r13, r0, r0, r12, r1)
            r4.put(r9, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = defpackage.f6e.i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r9 = r19
            r1.<init>(r9)
            r1.append(r10)
            java.lang.String r9 = ". using fcmNotification, needNotify="
            r1.append(r9)
            r1.append(r12)
            java.lang.String r9 = ", fcmLastNotifiedMessageId="
            defpackage.tr1.v(r1, r9, r14, r8)
            r1.append(r0)
            java.lang.String r0 = " cacheLastNotifiedMessageId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            goto L_0x00f6
        L_0x00d8:
            r20 = r9
            r9 = r15
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r4.put(r0, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r10)
            java.lang.String r1 = ". using fcmNotification, no notify needed"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
        L_0x00f6:
            r0 = r48
            r1 = r49
            r9 = r20
            goto L_0x0038
        L_0x00fe:
            r20 = r9
            r9 = r15
            java.lang.String r0 = " fcmLastNotifiedMessageId="
            java.lang.String r1 = ", cacheLastNotifiedMessageId="
            if (r12 == 0) goto L_0x01a9
            if (r13 != 0) goto L_0x01a9
            boolean r6 = r12.j
            if (r6 == 0) goto L_0x0180
            java.lang.Object r6 = r52.invoke()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0117:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x012b
            java.lang.Object r7 = r6.next()
            r13 = r7
            oj5 r13 = (defpackage.oj5) r13
            long r13 = r13.a
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0117
            goto L_0x012c
        L_0x012b:
            r7 = 0
        L_0x012c:
            oj5 r7 = (defpackage.oj5) r7
            if (r7 == 0) goto L_0x0133
            long r6 = r7.b
            goto L_0x0135
        L_0x0133:
            r6 = -1
        L_0x0135:
            long r13 = r12.l
            int r15 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x013d
            r15 = 1
            goto L_0x013e
        L_0x013d:
            r15 = 0
        L_0x013e:
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r16 = r5
            r2 = 0
            r5 = 32255(0x7dff, float:4.5199E-41)
            yk2 r5 = defpackage.yk2.a(r12, r2, r2, r15, r5)
            r4.put(r3, r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r2 = defpackage.f6e.i(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r10)
            java.lang.String r5 = ". using cacheNotification, needNotify="
            r3.append(r5)
            r3.append(r15)
            defpackage.tr1.v(r3, r1, r13, r8)
            r3.append(r2)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            r2 = r16
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            goto L_0x019c
        L_0x0180:
            r2 = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r4.put(r0, r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r10)
            java.lang.String r1 = ". using cacheNotification, no notify needed"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
        L_0x019c:
            r0 = r48
            r1 = r49
            r3 = r51
            r5 = r2
            r9 = r20
        L_0x01a5:
            r2 = r50
            goto L_0x0038
        L_0x01a9:
            r2 = r5
            if (r13 == 0) goto L_0x01ae
            if (r12 != 0) goto L_0x01b2
        L_0x01ae:
            r0 = r4
            r5 = r10
            goto L_0x034a
        L_0x01b2:
            long r5 = r12.l
            long r14 = r13.l
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x01bd
            boolean r7 = r12.j
            goto L_0x01bf
        L_0x01bd:
            boolean r7 = r13.j
        L_0x01bf:
            if (r3 < 0) goto L_0x01c8
            r16 = r2
            int r2 = r12.i
        L_0x01c5:
            r32 = r2
            goto L_0x01cd
        L_0x01c8:
            r16 = r2
            int r2 = r13.i
            goto L_0x01c5
        L_0x01cd:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r17 = r0
            r18 = r1
            long r0 = r13.a
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            r21 = 0
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x01e4
            r0 = r19
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            if (r0 == 0) goto L_0x01ec
            long r0 = r0.longValue()
            goto L_0x01ee
        L_0x01ec:
            long r0 = r12.a
        L_0x01ee:
            if (r3 < 0) goto L_0x01f7
            r19 = r8
            java.lang.String r8 = r12.d
        L_0x01f4:
            r27 = r8
            goto L_0x01fc
        L_0x01f7:
            r19 = r8
            java.lang.String r8 = r13.d
            goto L_0x01f4
        L_0x01fc:
            java.util.ArrayList r8 = new java.util.ArrayList
            r42 = r10
            java.util.List r10 = r12.f
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            r8.<init>(r11)
            java.util.List r11 = r13.f
            java.util.Iterator r11 = r11.iterator()
        L_0x020e:
            boolean r23 = r11.hasNext()
            if (r23 == 0) goto L_0x027e
            java.lang.Object r23 = r11.next()
            r24 = r11
            r11 = r23
            bd9 r11 = (defpackage.bd9) r11
            r44 = r9
            r9 = r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r23 = r10
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x0239
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0239
        L_0x0232:
            r33 = r0
            r45 = r4
            r46 = r5
            goto L_0x027a
        L_0x0239:
            java.util.Iterator r9 = r9.iterator()
        L_0x023d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0232
            java.lang.Object r10 = r9.next()
            bd9 r10 = (defpackage.bd9) r10
            r33 = r0
            long r0 = r10.c
            r45 = r4
            r46 = r5
            long r4 = r11.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0273
            long r0 = r10.e
            long r4 = r11.e
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0273
            android.graphics.Bitmap r0 = r11.h
            if (r0 == 0) goto L_0x0266
            r0.recycle()
        L_0x0266:
            r10 = r23
            r11 = r24
            r0 = r33
            r9 = r44
            r4 = r45
            r5 = r46
            goto L_0x020e
        L_0x0273:
            r0 = r33
            r4 = r45
            r5 = r46
            goto L_0x023d
        L_0x027a:
            r8.add(r11)
            goto L_0x0266
        L_0x027e:
            r33 = r0
            r45 = r4
            r46 = r5
            r44 = r9
            cx4 r0 = new cx4
            r1 = 12
            r0.<init>(r1)
            java.util.List r29 = kotlin.collections.CollectionsKt.sortedWith(r8, r0)
            android.graphics.Bitmap r0 = r12.h
            android.graphics.Bitmap r1 = r13.h
            if (r3 < 0) goto L_0x029f
            if (r1 == 0) goto L_0x029c
            r1.recycle()
        L_0x029c:
            r31 = r0
            goto L_0x02a6
        L_0x029f:
            if (r0 == 0) goto L_0x02a4
            r0.recycle()
        L_0x02a4:
            r31 = r1
        L_0x02a6:
            boolean r0 = r12.k
            if (r0 == 0) goto L_0x02b2
            boolean r0 = r13.k
            if (r0 == 0) goto L_0x02b2
            r3 = r46
            r0 = 1
            goto L_0x02b5
        L_0x02b2:
            r3 = r46
            r0 = 0
        L_0x02b5:
            long r35 = java.lang.Math.max(r3, r14)
            long r5 = r12.m
            long r8 = r13.m
            long r37 = java.lang.Math.max(r5, r8)
            long r5 = r12.o
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 == 0) goto L_0x02cc
            goto L_0x02cd
        L_0x02cc:
            r1 = 0
        L_0x02cd:
            if (r1 == 0) goto L_0x02d6
            long r5 = r1.longValue()
        L_0x02d3:
            r40 = r5
            goto L_0x02d9
        L_0x02d6:
            long r5 = r13.o
            goto L_0x02d3
        L_0x02d9:
            java.lang.String r1 = r13.n
            if (r1 != 0) goto L_0x02df
            java.lang.String r1 = r12.n
        L_0x02df:
            r39 = r1
            yk2 r1 = new yk2
            r21 = r1
            java.lang.String r5 = r13.b
            r24 = r5
            long r5 = r12.c
            r25 = r5
            zk2 r5 = r12.e
            r28 = r5
            java.util.List r5 = r12.g
            r30 = r5
            r22 = r33
            r33 = r7
            r34 = r0
            r21.<init>(r22, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r40)
            r0 = r45
            r0.put(r2, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            java.lang.String r1 = defpackage.f6e.i(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r5 = r44
            r2.<init>(r5)
            r5 = r42
            r2.append(r5)
            java.lang.String r5 = ". using both, needNotify="
            r2.append(r5)
            r2.append(r7)
            r6 = r18
            r5 = r19
            defpackage.tr1.v(r2, r6, r3, r5)
            r2.append(r1)
            r1 = r17
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r2 = r16
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
        L_0x033e:
            r1 = r49
            r3 = r51
            r4 = r0
            r5 = r2
            r9 = r20
            r0 = r48
            goto L_0x01a5
        L_0x034a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "mergeNotificationsMap: failed, no notification data for chatServerId="
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r3 = 0
            defpackage.z68.f(r2, r1, r3)
            goto L_0x033e
        L_0x035d:
            r0 = r4
            r2 = r5
            r3 = 0
            r5 = r0
            r0 = r50
        L_0x0363:
            int r0 = r0.b
            r1 = r51
            int r1 = r1.b
            int r7 = r0 + r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "merge: finished for "
            r0.<init>(r1)
            r1 = r49
            r0.append(r1)
            java.lang.String r1 = ", totalUnreadMessagesCount="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            java.util.Collection r0 = r5.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0398
            r0 = r3
            goto L_0x03bf
        L_0x0398:
            java.lang.Object r1 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x03a4
        L_0x03a2:
            r0 = r1
            goto L_0x03bf
        L_0x03a4:
            r4 = r1
            yk2 r4 = (defpackage.yk2) r4
            long r8 = r4.m
        L_0x03a9:
            java.lang.Object r4 = r0.next()
            r6 = r4
            yk2 r6 = (defpackage.yk2) r6
            long r10 = r6.m
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x03b8
            r1 = r4
            r8 = r10
        L_0x03b8:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x055f
            goto L_0x03a2
        L_0x03bf:
            r1 = r0
            yk2 r1 = (defpackage.yk2) r1
            if (r1 == 0) goto L_0x03c7
            boolean r1 = r1.j
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            if (r1 == 0) goto L_0x03cb
            goto L_0x03cc
        L_0x03cb:
            r0 = r3
        L_0x03cc:
            yk2 r0 = (defpackage.yk2) r0
            kotlin.reflect.KProperty[] r1 = h
            if (r0 != 0) goto L_0x03e8
            java.lang.String r0 = "buildNotificationSettings: no alert"
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            vea r0 = new vea
            r13 = 0
            java.lang.String r10 = "_NONE_"
            r8 = r0
            r9 = r13
            r11 = r13
            r12 = r13
            r8.<init>(r9, r10, r11, r12, r13)
            r4 = r48
            r6 = 1
            goto L_0x04d7
        L_0x03e8:
            java.lang.String r3 = "buildNotificationSettings: need alert"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            zk2 r2 = defpackage.zk2.a
            zk2 r0 = r0.e
            r9 = 1
            if (r0 != r2) goto L_0x03f6
            r0 = r9
            goto L_0x03f7
        L_0x03f6:
            r0 = 0
        L_0x03f7:
            if (r0 == 0) goto L_0x0408
            jtb r2 = r48.c()
            ltb r2 = (defpackage.ltb) r2
            hq r2 = r2.c
            java.lang.String r3 = "app.notification.ringtone"
            java.lang.String r2 = r2.D(r3)
            goto L_0x0416
        L_0x0408:
            jtb r2 = r48.c()
            ltb r2 = (defpackage.ltb) r2
            hq r2 = r2.c
            java.lang.String r3 = "app.notification.chats.ringtone"
            java.lang.String r2 = r2.D(r3)
        L_0x0416:
            r3 = 5
            r4 = r1[r3]
            r4 = r48
            hs7 r6 = r4.f
            java.lang.Object r8 = r6.get()
            fn4 r8 = (defpackage.fn4) r8
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x043c
            jtb r8 = r48.c()
            ltb r8 = (defpackage.ltb) r8
            hq r8 = r8.c
            java.lang.String r10 = "app.notification.in.app.sound"
            r11 = 1
            boolean r8 = r8.c(r10, r11)
            if (r8 != 0) goto L_0x043c
            java.lang.String r2 = "_NONE_"
        L_0x043c:
            r10 = r2
            if (r0 == 0) goto L_0x044c
            jtb r2 = r48.c()
            ltb r2 = (defpackage.ltb) r2
            hq r2 = r2.c
            boolean r2 = r2.C()
            goto L_0x045d
        L_0x044c:
            jtb r2 = r48.c()
            ltb r2 = (defpackage.ltb) r2
            hq r2 = r2.c
            ls7 r2 = r2.g
            java.lang.String r8 = "app.notification.chats.vibrate"
            r11 = 1
            boolean r2 = r2.getBoolean(r8, r11)
        L_0x045d:
            r8 = r1[r3]
            java.lang.Object r8 = r6.get()
            fn4 r8 = (defpackage.fn4) r8
            boolean r8 = r8.d()
            if (r8 == 0) goto L_0x0480
            jtb r8 = r48.c()
            ltb r8 = (defpackage.ltb) r8
            hq r8 = r8.c
            ls7 r8 = r8.g
            java.lang.String r11 = "app.notification.in.app.vibrate"
            r12 = 1
            boolean r8 = r8.getBoolean(r11, r12)
            if (r8 != 0) goto L_0x0480
            r12 = 0
            goto L_0x0481
        L_0x0480:
            r12 = r2
        L_0x0481:
            if (r0 == 0) goto L_0x0497
            jtb r0 = r48.c()
            ltb r0 = (defpackage.ltb) r0
            hq r0 = r0.c
            int r2 = r0.v()
            java.lang.String r8 = "app.notification.led.color"
            int r0 = r0.d(r8, r2)
        L_0x0495:
            r11 = r0
            goto L_0x04ac
        L_0x0497:
            jtb r0 = r48.c()
            ltb r0 = (defpackage.ltb) r0
            hq r0 = r0.c
            int r2 = r0.v()
            ls7 r0 = r0.g
            java.lang.String r8 = "app.notification.chats.led.color"
            int r0 = r0.getInt(r8, r2)
            goto L_0x0495
        L_0x04ac:
            r0 = r1[r3]
            java.lang.Object r0 = r6.get()
            fn4 r0 = (defpackage.fn4) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x04cf
            jtb r0 = r48.c()
            ltb r0 = (defpackage.ltb) r0
            hq r0 = r0.c
            ls7 r0 = r0.g
            java.lang.String r2 = "app.notification.important.priority"
            r6 = 1
            boolean r0 = r0.getBoolean(r2, r6)
            if (r0 == 0) goto L_0x04d0
            r13 = r9
            goto L_0x04d1
        L_0x04cf:
            r6 = 1
        L_0x04d0:
            r13 = 0
        L_0x04d1:
            vea r0 = new vea
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x04d7:
            r2 = 6
            r3 = r1[r2]
            hs7 r3 = r4.g
            java.lang.Object r4 = r3.get()
            jwa r4 = (defpackage.jwa) r4
            r4.getClass()
            r4 = r1[r2]
            java.lang.Object r4 = r3.get()
            jwa r4 = (defpackage.jwa) r4
            kotlin.Lazy r4 = r4.d
            java.lang.Object r4 = r4.getValue()
            eta r4 = (defpackage.eta) r4
            r4.getClass()
            java.util.Collection r4 = r5.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r8 = r4 instanceof java.util.Collection
            if (r8 == 0) goto L_0x050d
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x050d
        L_0x050b:
            r10 = 0
            goto L_0x0548
        L_0x050d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0511:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x050b
            java.lang.Object r8 = r4.next()
            yk2 r8 = (defpackage.yk2) r8
            java.util.List r8 = r8.f
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0530
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0530
        L_0x052e:
            r11 = 0
            goto L_0x0545
        L_0x0530:
            java.util.Iterator r8 = r8.iterator()
        L_0x0534:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x052e
            java.lang.Object r9 = r8.next()
            bd9 r9 = (defpackage.bd9) r9
            boolean r9 = r9.n
            if (r9 == 0) goto L_0x0534
            r11 = r6
        L_0x0545:
            if (r11 == 0) goto L_0x0511
            r10 = r6
        L_0x0548:
            r1 = r1[r2]
            java.lang.Object r1 = r3.get()
            jwa r1 = (defpackage.jwa) r1
            r1.getClass()
            fea r1 = new fea
            java.lang.String r9 = "ru.oneme.app.notifications"
            r11 = 0
            r8 = 1
            r4 = r1
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x055f:
            r4 = r48
            goto L_0x03a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl2.d(java.util.Set, bl2, bl2, ur):fea");
    }

    public final void f(bl2 bl2) {
        Map map = bl2.a;
        if (!map.isEmpty()) {
            for (a32 a32 : a().J(map.keySet())) {
                yk2 yk2 = (yk2) map.get(Long.valueOf(a32.b.a));
                if (yk2 != null) {
                    long j = a32.b.a().d;
                    long j2 = yk2.l;
                    if (j < j2) {
                        r62 a2 = a();
                        a2.getClass();
                        long j3 = a32.a;
                        z68.c("r62", "changeLastNotifMessageId, chatId = %d, lastNotifMessageId = %d", Long.valueOf(j3), Long.valueOf(j2));
                        a2.i(j3, false, new c10(j2, 10));
                    }
                }
            }
        }
    }

    public final void g(bl2 bl2, Lazy lazy) {
        Object obj;
        Map map = bl2.a;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : map.values()) {
                yk2 yk2 = (yk2) next;
                long j = yk2.l;
                Iterator it = ((List) lazy.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((oj5) obj).a == yk2.c) {
                        break;
                    }
                }
                oj5 oj5 = (oj5) obj;
                if (j > (oj5 != null ? oj5.b : 0)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                yk2 yk22 = (yk2) it2.next();
                arrayList2.add(new oj5(yk22.c, yk22.l));
            }
            KProperty kProperty = h[2];
            new na3(new na3(4, ((qj5) this.c.get()).a.n().i(v02.c), new fj5(arrayList2, 1)).h(v9a.c)).a();
        }
    }
}
