package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* renamed from: ke3  reason: default package */
public final class ke3 extends qm implements lcf, hdb {
    public final List X;
    public final List Y;
    public final long o;
    public final boolean v;
    public final n0g w;
    public final boolean x;
    public final long[] y;
    public final boolean z;

    public ke3(long j, long j2, boolean z2, n0g n0g, boolean z3, long[] jArr, boolean z4, ArrayList arrayList, ArrayList arrayList2) {
        super(j);
        this.o = j2;
        this.v = z2;
        this.w = n0g;
        this.x = z3;
        this.y = jArr;
        this.z = z4;
        this.X = arrayList;
        this.Y = arrayList2;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [l0g, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026f, code lost:
        if (r10.equals("3M") == false) goto L_0x025c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ke3 u(byte[] r30) {
        /*
            r1 = 1
            ru.ok.tamtam.nano.Tasks$Config r2 = new ru.ok.tamtam.nano.Tasks$Config
            r2.<init>()
            r3 = r30
            ad9 r2 = defpackage.ad9.mergeFrom(r2, r3)     // Catch:{ InvalidProtocolBufferNanoException -> 0x02de }
            ru.ok.tamtam.nano.Tasks$Config r2 = (ru.ok.tamtam.nano.Tasks.Config) r2     // Catch:{ InvalidProtocolBufferNanoException -> 0x02de }
            java.util.ArrayList r14 = new java.util.ArrayList
            java.lang.String[] r3 = r2.excludedFolders
            java.util.List r3 = java.util.Arrays.asList(r3)
            r14.<init>(r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            ru.ok.tamtam.nano.a[] r3 = r2.folders
            int r3 = r3.length
            r13.<init>(r3)
            r3 = 0
        L_0x0022:
            ru.ok.tamtam.nano.a[] r4 = r2.folders
            int r5 = r4.length
            r6 = 0
            if (r3 >= r5) goto L_0x00e6
            r4 = r4[r3]
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            long[] r7 = r4.d
            int r8 = r7.length
            r9 = 0
        L_0x0033:
            if (r9 >= r8) goto L_0x0040
            r10 = r7[r9]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r5.add(r10)
            int r9 = r9 + r1
            goto L_0x0033
        L_0x0040:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            long[] r8 = r4.e
            int r9 = r8.length
            r10 = 0
        L_0x0049:
            if (r10 >= r9) goto L_0x0056
            r11 = r8[r10]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7.add(r11)
            int r10 = r10 + r1
            goto L_0x0049
        L_0x0056:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String[] r9 = r4.f
            int r10 = r9.length
            r11 = 0
        L_0x005f:
            if (r11 >= r10) goto L_0x006c
            r12 = r9[r11]
            q82 r12 = defpackage.q82.valueOf(r12)
            r8.add(r12)
            int r11 = r11 + r1
            goto L_0x005f
        L_0x006c:
            java.lang.String r9 = r4.c
            java.lang.String r10 = "NO_EMOJI"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0079
            r18 = r6
            goto L_0x007b
        L_0x0079:
            r18 = r9
        L_0x007b:
            ru.ok.tamtam.nano.Protos$MessageElements r6 = r4.h
            java.util.ArrayList r6 = defpackage.ua9.a(r6)
            java.util.ArrayList r6 = defpackage.qe8.v(r6)
            r82 r9 = new r82
            java.lang.String r10 = r4.a
            java.lang.String r11 = r4.b
            boolean r12 = r4.g
            if (r6 == 0) goto L_0x0092
        L_0x008f:
            r23 = r6
            goto L_0x0097
        L_0x0092:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x008f
        L_0x0097:
            long r0 = r4.i
            n86 r6 = r4.j
            java.util.EnumMap r15 = new java.util.EnumMap
            r30 = r14
            java.lang.Class<q82> r14 = defpackage.q82.class
            r15.<init>(r14)
            java.io.Serializable r6 = r6.b
            long[] r6 = (long[]) r6
            int r14 = r6.length
            if (r14 != 0) goto L_0x00af
            r14 = 1
            r29 = 1
            goto L_0x00b2
        L_0x00af:
            r14 = 1
            r29 = 0
        L_0x00b2:
            r16 = r29 ^ 1
            if (r16 == 0) goto L_0x00bb
            q82 r14 = defpackage.q82.z0
            r15.put(r14, r6)
        L_0x00bb:
            n86 r6 = r4.k
            java.util.ArrayList r27 = defpackage.m58.t(r6)
            n86 r4 = r4.l
            java.util.EnumSet r28 = defpackage.m58.s(r4)
            r4 = r15
            r15 = r9
            r16 = r10
            r17 = r11
            r19 = r5
            r20 = r7
            r21 = r8
            r22 = r12
            r24 = r0
            r26 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            r13.add(r9)
            r0 = 1
            int r3 = r3 + r0
            r14 = r30
            r1 = r0
            goto L_0x0022
        L_0x00e6:
            r0 = r1
            r30 = r14
            ke3 r1 = new ke3
            long r4 = r2.requestId
            long r7 = r2.chatId
            boolean r9 = r2.isPushToken
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.userSettings
            if (r3 == 0) goto L_0x02cd
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L_0x00fd
            goto L_0x02cd
        L_0x00fd:
            l0g r6 = new l0g
            r6.<init>()
            java.lang.String r10 = "pushNewContacts"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x011a
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.a = r10
        L_0x011a:
            java.lang.String r10 = "dontDustirbUntil"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0132
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            long r10 = java.lang.Long.parseLong(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.b = r10
        L_0x0132:
            java.lang.String r10 = "dialogsPushNotification"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0142
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.c = r10
        L_0x0142:
            java.lang.String r10 = "chatsPushNotification"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0152
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.d = r10
        L_0x0152:
            java.lang.String r10 = "pushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0162
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.e = r10
        L_0x0162:
            java.lang.String r10 = "dialogsPushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0172
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.f = r10
        L_0x0172:
            java.lang.String r10 = "chatsPushSound"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0182
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r6.g = r10
        L_0x0182:
            java.lang.String r10 = "hiddenOnline"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0196
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.h = r10
        L_0x0196:
            java.lang.String r10 = "led"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01aa
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.i = r10
        L_0x01aa:
            java.lang.String r10 = "dialogsLed"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01be
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.j = r10
        L_0x01be:
            java.lang.String r10 = "chatsLed"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01d2
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6.k = r10
        L_0x01d2:
            java.lang.String r10 = "vibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x01ea
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.l = r10
        L_0x01ea:
            java.lang.String r10 = "dialogsVibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0202
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.m = r10
        L_0x0202:
            java.lang.String r10 = "chatsVibration"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x021a
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.n = r10
        L_0x021a:
            java.lang.String r10 = "chatsInvite"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x022e
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = defpackage.wzf.b(r10)
            r6.o = r10
        L_0x022e:
            java.lang.String r10 = "incomingCall"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0242
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = defpackage.wzf.b(r10)
            r6.p = r10
        L_0x0242:
            java.lang.String r10 = "inactiveTTL"
            boolean r11 = r3.containsKey(r10)
            if (r11 == 0) goto L_0x0287
            java.lang.Object r10 = r3.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            m0g r11 = defpackage.m0g.TTL_6M
            if (r10 == 0) goto L_0x0285
            r12 = -1
            int r14 = r10.hashCode()
            switch(r14) {
                case 1596: goto L_0x0272;
                case 1658: goto L_0x0269;
                case 1751: goto L_0x025e;
                default: goto L_0x025c;
            }
        L_0x025c:
            r0 = r12
            goto L_0x027c
        L_0x025e:
            java.lang.String r0 = "6M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0267
            goto L_0x025c
        L_0x0267:
            r0 = 2
            goto L_0x027c
        L_0x0269:
            java.lang.String r14 = "3M"
            boolean r10 = r10.equals(r14)
            if (r10 != 0) goto L_0x027c
            goto L_0x025c
        L_0x0272:
            java.lang.String r0 = "1M"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x027b
            goto L_0x025c
        L_0x027b:
            r0 = 0
        L_0x027c:
            switch(r0) {
                case 0: goto L_0x0283;
                case 1: goto L_0x0280;
                case 2: goto L_0x0285;
                default: goto L_0x027f;
            }
        L_0x027f:
            goto L_0x0285
        L_0x0280:
            m0g r11 = defpackage.m0g.TTL_3M
            goto L_0x0285
        L_0x0283:
            m0g r11 = defpackage.m0g.TTL_1M
        L_0x0285:
            r6.q = r11
        L_0x0287:
            java.lang.String r0 = "groupChatCallNotificationStatus"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x029b
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.wzf.a(r0)
            r6.r = r0
        L_0x029b:
            java.lang.String r0 = "suggestStickersStatus"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x02af
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = defpackage.wzf.c(r0)
            r6.s = r0
        L_0x02af:
            java.lang.String r0 = "audioTranscriptionEnabled"
            boolean r10 = r3.containsKey(r0)
            if (r10 == 0) goto L_0x02c7
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.t = r0
        L_0x02c7:
            n0g r0 = new n0g
            r0.<init>(r6)
            goto L_0x02ce
        L_0x02cd:
            r0 = r6
        L_0x02ce:
            boolean r10 = r2.reset
            long[] r11 = r2.syncChatIds
            boolean r12 = r2.isForFolders
            r3 = r1
            r6 = r7
            r8 = r9
            r9 = r0
            r14 = r30
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L_0x02de:
            r0 = move-exception
            ru.ok.tamtam.nano.ProtoException r1 = new ru.ok.tamtam.nano.ProtoException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke3.u(byte[]):ke3");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r7 = this;
            rm r0 = r7.c
            eef r0 = r0.e()
            idb r1 = defpackage.idb.TYPE_CONFIG
            long r2 = r7.a
            java.util.List r0 = r0.h(r2, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "ke3"
            r3 = 3
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()
            tdf r1 = (defpackage.tdf) r1
            hdb r4 = r1.f
            ke3 r4 = (defpackage.ke3) r4
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0012
            gef r4 = defpackage.gef.FAILED
            gef r1 = r1.b
            if (r1 == r4) goto L_0x0012
            java.lang.String r7 = "onPreExecute: removed existent config task"
            defpackage.z68.c(r2, r7, new java.lang.Object[0])
            return r3
        L_0x0037:
            boolean r0 = r7.x
            r1 = 1
            if (r0 == 0) goto L_0x003d
            return r1
        L_0x003d:
            boolean r0 = r7.v
            if (r0 == 0) goto L_0x005f
            java.lang.String r7 = r7.t()
            boolean r7 = defpackage.cvg.A(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onPreExecute: tokenEmpty="
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            if (r7 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = r1
        L_0x005e:
            return r3
        L_0x005f:
            n0g r0 = r7.w
            if (r0 == 0) goto L_0x0064
            return r1
        L_0x0064:
            long[] r0 = r7.y
            if (r0 == 0) goto L_0x006c
            int r0 = r0.length
            if (r0 <= 0) goto L_0x006c
            return r1
        L_0x006c:
            boolean r0 = r7.z
            if (r0 == 0) goto L_0x0071
            return r1
        L_0x0071:
            rm r0 = r7.c
            r62 r0 = r0.c()
            long r4 = r7.o
            a32 r7 = r0.G(r4)
            if (r7 == 0) goto L_0x00af
            boolean r0 = r7.E()
            if (r0 != 0) goto L_0x0086
            goto L_0x00af
        L_0x0086:
            m72 r7 = r7.b
            l72 r0 = r7.b
            int r0 = r0.ordinal()
            r2 = 2
            if (r0 == 0) goto L_0x00a7
            if (r0 == r1) goto L_0x009e
            if (r0 != r2) goto L_0x0096
            goto L_0x009e
        L_0x0096:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid chat type"
            r7.<init>(r0)
            throw r7
        L_0x009e:
            long r3 = r7.a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00ae
            goto L_0x00ad
        L_0x00a7:
            k72 r0 = defpackage.k72.x
            k72 r7 = r7.c
            if (r7 != r0) goto L_0x00ae
        L_0x00ad:
            return r2
        L_0x00ae:
            return r1
        L_0x00af:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke3.b():int");
    }

    public final void c() {
        this.c.e().d(this.a);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [qae, java.util.Map<java.lang.String, java.lang.String>] */
    public final byte[] d() {
        List list;
        Tasks.Config config = new Tasks.Config();
        config.requestId = this.a;
        config.chatId = this.o;
        config.isPushToken = this.v;
        config.reset = this.x;
        config.isForFolders = this.z;
        n0g n0g = this.w;
        if (n0g == null) {
            config.userSettings = new HashMap();
        } else {
            ? qae = new qae(0);
            Boolean bool = n0g.a;
            if (bool != null) {
                qae.put("pushNewContacts", String.valueOf(bool));
            }
            Long l = n0g.b;
            if (l != null) {
                qae.put("dontDustirbUntil", String.valueOf(l));
            }
            String str = n0g.c;
            if (str != null) {
                qae.put("dialogsPushNotification", str);
            }
            String str2 = n0g.d;
            if (str2 != null) {
                qae.put("chatsPushNotification", str2);
            }
            String str3 = n0g.e;
            if (str3 != null) {
                qae.put("pushSound", str3);
            }
            String str4 = n0g.f;
            if (str4 != null) {
                qae.put("dialogsPushSound", str4);
            }
            String str5 = n0g.g;
            if (str5 != null) {
                qae.put("chatsPushSound", str5);
            }
            Boolean bool2 = n0g.h;
            if (bool2 != null) {
                qae.put("hiddenOnline", String.valueOf(bool2));
            }
            Integer num = n0g.i;
            if (num != null) {
                qae.put("led", String.valueOf(num));
            }
            Integer num2 = n0g.j;
            if (num2 != null) {
                qae.put("dialogsLed", String.valueOf(num2));
            }
            Integer num3 = n0g.k;
            if (num3 != null) {
                qae.put("chatsLed", String.valueOf(num3));
            }
            Boolean bool3 = n0g.l;
            if (bool3 != null) {
                qae.put("vibration", String.valueOf(bool3));
            }
            Boolean bool4 = n0g.m;
            if (bool4 != null) {
                qae.put("dialogsVibration", String.valueOf(bool4));
            }
            Boolean bool5 = n0g.n;
            if (bool5 != null) {
                qae.put("chatsVibration", String.valueOf(bool5));
            }
            int i = n0g.o;
            if (i != 0) {
                qae.put("chatsInvite", wzf.f(i));
            }
            int i2 = n0g.p;
            if (i2 != 0) {
                qae.put("incomingCall", wzf.f(i2));
            }
            m0g m0g = n0g.q;
            if (m0g != null) {
                qae.put("inactiveTTL", m0g.a);
            }
            int i3 = n0g.r;
            if (i3 != 0) {
                qae.put("groupChatCallNotificationStatus", wzf.e(i3));
            }
            int i4 = n0g.s;
            if (i4 != 0) {
                qae.put("suggestStickersStatus", wzf.g(i4));
            }
            Boolean bool6 = n0g.t;
            if (bool6 != null) {
                qae.put("audioTranscriptionEnabled", String.valueOf(bool6));
            }
            Boolean bool7 = n0g.u;
            if (bool7 != null) {
                qae.put("safeMode", String.valueOf(bool7));
            }
            config.userSettings = qae;
        }
        List list2 = this.Y;
        if (!(list2 == null || (list = this.X) == null)) {
            a[] aVarArr = new a[list.size()];
            String[] strArr = new String[list2.size()];
            for (int i5 = 0; i5 < list2.size(); i5++) {
                strArr[i5] = (String) list2.get(i5);
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                a aVar = new a();
                r82 r82 = (r82) list.get(i6);
                aVar.a = r82.a;
                aVar.b = r82.b;
                Set set = r82.w;
                String[] strArr2 = new String[set.size()];
                q82[] q82Arr = (q82[]) set.toArray(new q82[0]);
                for (int i7 = 0; i7 < set.size(); i7++) {
                    strArr2[i7] = q82Arr[i7].name();
                }
                aVar.f = strArr2;
                aVar.g = r82.x;
                Set set2 = r82.v;
                long[] jArr = new long[set2.size()];
                Long[] lArr = (Long[]) set2.toArray(new Long[0]);
                for (int i8 = 0; i8 < set2.size(); i8++) {
                    jArr[i8] = lArr[i8].longValue();
                }
                aVar.e = jArr;
                String str6 = r82.c;
                if (str6 == null || str6.isEmpty()) {
                    str6 = "NO_EMOJI";
                }
                aVar.c = str6;
                Set set3 = r82.o;
                long[] jArr2 = new long[set3.size()];
                Long[] lArr2 = (Long[]) set3.toArray(new Long[0]);
                for (int i9 = 0; i9 < set3.size(); i9++) {
                    jArr2[i9] = lArr2[i9].longValue();
                }
                aVar.d = jArr2;
                aVar.h = ua9.c(qe8.u(r82.y));
                aVar.i = r82.z;
                aVar.j = m58.p(r82.X);
                aVar.k = m58.r(r82.Y);
                aVar.l = m58.q(r82.Z);
                aVarArr[i6] = aVar;
            }
            config.folders = aVarArr;
            config.excludedFolders = strArr;
        }
        config.syncChatIds = this.y;
        return ad9.toByteArray(config);
    }

    public final void e(ibf ibf) {
        List list;
        if (ibf instanceof me3) {
            me3 me3 = (me3) ibf;
            cud cud = ((ltb) ((jtb) this.c.c.getValue())).b;
            String str = me3.c;
            cud.getClass();
            zjd zjd = zjd.a;
            cud.l("hash", str);
            this.c.b().c(new n6f(true));
            if (me3.o != null) {
                ((ltb) ((jtb) this.c.c.getValue())).c.H(me3.o);
                if (Boolean.FALSE.equals(me3.o.u)) {
                    a33 a33 = (a33) ((x23) this.c.e.getValue());
                    a33.l("app.pin_" + a33.s(), (String) null);
                }
                this.c.b().c(new ij0());
            }
            List list2 = this.Y;
            if (list2 != null && (list = this.X) != null && ((u82) this.c.z.getValue()) != null && this.z) {
                ((ia2) ((u82) this.c.z.getValue())).i(list, new HashSet(list2));
            }
        }
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj == null || ke3.class != obj.getClass()) {
            return false;
        }
        ke3 ke3 = (ke3) obj;
        if (this.o != ke3.o || this.v != ke3.v || this.x != ke3.x || this.z != ke3.z) {
            return false;
        }
        List list3 = this.Y;
        if (list3 != null && (list2 = ke3.Y) != null && !list3.equals(list2)) {
            return false;
        }
        List list4 = this.X;
        if (list4 != null && (list = ke3.X) != null && !list4.equals(list)) {
            return false;
        }
        n0g n0g = ke3.w;
        n0g n0g2 = this.w;
        return n0g2 != null ? n0g2.equals(n0g) : n0g == null;
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [no5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v14, types: [no5, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fbf g() {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            long r2 = r0.o
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 0
            java.lang.String r8 = "ke3"
            if (r6 <= 0) goto L_0x0081
            rm r6 = r0.c
            r62 r6 = r6.c()
            a32 r6 = r6.G(r2)
            if (r6 != 0) goto L_0x0045
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "chat is null, chatId = "
            r6.<init>(r9)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            defpackage.z68.f(r8, r2, r7)
            rm r2 = r0.c
            kotlin.Lazy r2 = r2.y
            java.lang.Object r2 = r2.getValue()
            m95 r2 = (defpackage.m95) r2
            ru.ok.tamtam.util.HandledException r3 = new ru.ok.tamtam.util.HandledException
            java.lang.String r6 = "chat is null"
            r3.<init>(r6)
            uta r2 = (defpackage.uta) r2
            r2.c(r3, r1)
        L_0x0041:
            r19 = r7
            goto L_0x0154
        L_0x0045:
            no5 r1 = new no5
            r1.<init>()
            m72 r2 = r6.b
            d72 r3 = r2.a()
            java.util.List r3 = r3.b
            java.util.ArrayList r3 = defpackage.qe8.o(r3)
            r1.b = r3
            d72 r3 = r2.a()
            long r9 = r3.a
            r1.a = r9
            d72 r3 = r2.a()
            long r9 = r3.e
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r1.c = r3
            rp2 r3 = new rp2
            r3.<init>(r1)
            android.util.ArrayMap r1 = new android.util.ArrayMap
            r1.<init>()
            long r9 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.put(r2, r3)
            r13 = r1
            goto L_0x00d4
        L_0x0081:
            long[] r2 = r0.y
            if (r2 == 0) goto L_0x00d3
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00d3
            android.util.ArrayMap r3 = new android.util.ArrayMap
            r3.<init>()
            int r6 = r2.length
            r9 = 0
        L_0x008f:
            if (r9 >= r6) goto L_0x00d1
            r10 = r2[r9]
            rm r12 = r0.c
            r62 r12 = r12.c()
            a32 r10 = r12.G(r10)
            if (r10 == 0) goto L_0x00cf
            boolean r11 = r10.E()
            if (r11 != 0) goto L_0x00a6
            goto L_0x00cf
        L_0x00a6:
            no5 r11 = new no5
            r11.<init>()
            m72 r10 = r10.b
            d72 r12 = r10.a()
            java.util.List r12 = r12.b
            java.util.ArrayList r12 = defpackage.qe8.o(r12)
            r11.b = r12
            d72 r12 = r10.a()
            long r12 = r12.a
            r11.a = r12
            rp2 r12 = new rp2
            r12.<init>(r11)
            long r10 = r10.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.put(r10, r12)
        L_0x00cf:
            int r9 = r9 + r1
            goto L_0x008f
        L_0x00d1:
            r13 = r3
            goto L_0x00d4
        L_0x00d3:
            r13 = r7
        L_0x00d4:
            if (r13 == 0) goto L_0x00dc
            int r1 = r13.size()
            if (r1 > 0) goto L_0x00e0
        L_0x00dc:
            n0g r1 = r0.w
            if (r1 == 0) goto L_0x00ee
        L_0x00e0:
            ue3 r1 = new ue3
            r11 = 0
            r12 = 0
            n0g r14 = r0.w
            r15 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x00eb:
            r19 = r1
            goto L_0x0154
        L_0x00ee:
            boolean r1 = r0.z
            if (r1 == 0) goto L_0x0041
            java.util.List r1 = r0.X
            if (r1 == 0) goto L_0x0041
            java.util.List r2 = r0.Y
            if (r2 == 0) goto L_0x0041
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0108:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x011f
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0118 }
            r6.add(r9)     // Catch:{ all -> 0x0118 }
            goto L_0x0108
        L_0x0118:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x011f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0123:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r1.next()
            r82 r2 = (defpackage.r82) r2     // Catch:{ all -> 0x013d }
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "all.chat.folder"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x013d }
            if (r9 != 0) goto L_0x0123
            r3.add(r2)     // Catch:{ all -> 0x013d }
            goto L_0x0123
        L_0x013d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0144:
            ue3 r1 = new ue3
            t82 r14 = new t82
            r14.<init>(r3, r6)
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x00eb
        L_0x0154:
            java.lang.String r16 = r21.t()
            if (r19 != 0) goto L_0x016a
            boolean r1 = defpackage.cvg.A(r16)
            if (r1 == 0) goto L_0x016a
            boolean r1 = r0.x
            if (r1 != 0) goto L_0x016a
            java.lang.String r0 = "config is null and token is empty"
            defpackage.z68.c(r8, r0, new java.lang.Object[0])
            goto L_0x017e
        L_0x016a:
            boolean r1 = defpackage.cvg.A(r16)
            if (r1 != 0) goto L_0x0172
            r4 = 16384(0x4000, double:8.0948E-320)
        L_0x0172:
            r17 = r4
            np2 r7 = new np2
            boolean r0 = r0.x
            r15 = r7
            r20 = r0
            r15.<init>(r16, r17, r19, r20)
        L_0x017e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke3.g():fbf");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_CONFIG;
    }

    public final void h(qaf qaf) {
        this.c.b().c(new n6f(false));
        if ("favorite.chats.limit".equals(qaf.b)) {
            this.c.c().f0(this.o, false);
        }
        String str = qaf.b;
        if (cvg.D(str) && (str.equals("wrong.device.token") || str.equals("WRONG_DEVICE_TOKEN"))) {
            ((qjd) ((x23) this.c.e.getValue())).l("user.fcmToken", "");
            ((f8f) ((hn4) ((fn4) this.c.b.getValue())).i.getValue()).g();
        }
        if (!(qaf instanceof aaf)) {
            c();
        }
    }

    public final String t() {
        if (!this.v || !((xt6) ((hn4) ((fn4) this.c.b.getValue())).g).a()) {
            return null;
        }
        String g = ((f8f) ((hn4) ((fn4) this.c.b.getValue())).i.getValue()).g();
        if (!cvg.A(g)) {
            return g;
        }
        return null;
    }
}
