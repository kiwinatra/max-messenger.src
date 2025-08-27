package defpackage;

/* renamed from: ivd  reason: default package */
public abstract class ivd extends gud {
    public long X;
    public final long Y;
    public final String Z;
    public final String b = getClass().getName();
    public final long c;
    public final mc9 o;
    public final zf7 v;
    public final long v0;
    public final long w;
    public final cl4 w0;
    public final boolean x;
    public final String y;
    public final int z;

    public ivd(long j, mc9 mc9, zf7 zf7, long j2, boolean z2, int i, String str, long j3, String str2, long j4, cl4 cl4) {
        this.c = j;
        this.o = mc9;
        this.v = zf7;
        this.w = j2;
        this.x = z2;
        this.z = i;
        this.y = str;
        this.Y = j3;
        this.Z = str2;
        this.v0 = j4;
        this.w0 = cl4;
    }

    public abstract ga9 A();

    public long B(long j, a32 a32) {
        long j2;
        long j3;
        long j4;
        a32 a322 = a32;
        m72 m72 = a322.b;
        long j5 = m72.a;
        long s = ((qjd) i()).s();
        if (a32.N()) {
            if (m72.h(s)) {
                j4 = s;
            } else {
                vk3 m = a32.m();
                j4 = m != null ? m.r() : 0;
            }
            j3 = j4 != 0 ? 0 : j5;
            j2 = j4;
        } else {
            j3 = j5;
            j2 = 0;
        }
        r62 e = e();
        jbd.a(new y52(e, a322.a, ((ltb) e.n).a.m(), 1), e.z, (x6) null, new fm0(23), (lfd) null);
        if (!m72.h(s)) {
            r62 e2 = e();
            e2.getClass();
            e2.i(this.c, false, new vz0(false, 1));
        }
        jna jna = (jna) a();
        if (!jna.s(j)) {
            return 0;
        }
        return jna.E().c(new cw9(((ltb) jna.D()).a.n(), j, a322.a, j3, j2, this.x, this.v0), false, this.w, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.lang.Object, m20] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.lang.Object, m20] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05b2  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r81 = this;
            r0 = r81
            r62 r7 = r81.e()
            long r8 = r0.c
            a32 r7 = r7.G(r8)
            if (r7 != 0) goto L_0x000f
            return
        L_0x000f:
            long r10 = java.lang.System.currentTimeMillis()
            boolean r12 = r7.N()
            r13 = 0
            a89 r15 = r7.c
            m72 r1 = r7.b
            if (r12 != 0) goto L_0x002a
            long r4 = r1.a
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x002a
            if (r15 != 0) goto L_0x002a
            long r4 = r1.l
            goto L_0x0038
        L_0x002a:
            long r4 = java.lang.System.nanoTime()
            java.util.UUID r16 = java.util.UUID.randomUUID()
            int r12 = r16.hashCode()
            long r13 = (long) r12
            long r4 = r4 ^ r13
        L_0x0038:
            ga9 r13 = r81.A()
            if (r13 != 0) goto L_0x0046
            java.lang.String r0 = r0.b
            java.lang.String r1 = "message is null. skipping task"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            return
        L_0x0046:
            r13.f = r4
            cl4 r12 = r0.w0
            r13.H = r12
            java.lang.String r12 = r13.g
            boolean r12 = defpackage.cvg.A(r12)
            if (r12 != 0) goto L_0x020b
            jtb r12 = r81.q()
            ltb r12 = (defpackage.ltb) r12
            cud r12 = r12.b
            r12.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r14 = ru.ok.tamtam.android.prefs.PmsKey.f68maxmsglength
            r6 = 4000(0xfa0, float:5.605E-42)
            long r2 = (long) r6
            long r2 = r12.r(r14, r2)
            int r2 = (int) r2
            java.lang.String r3 = r13.g
            int r3 = r3.length()
            if (r3 <= r2) goto L_0x020b
            java.lang.String r3 = r13.g
            java.util.regex.Pattern r6 = defpackage.hhf.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r12 = r3.length()
            if (r12 >= r2) goto L_0x0089
            r6.add(r3)
            r21 = r4
            r23 = r8
            goto L_0x0102
        L_0x0089:
            r12 = 300(0x12c, float:4.2E-43)
            if (r12 > r2) goto L_0x0203
            r14 = 50
            if (r14 > r2) goto L_0x01fb
            int r14 = r2 + -300
            java.lang.String r14 = r3.substring(r14, r2)
            java.lang.String[] r12 = defpackage.hhf.j
            r21 = r4
            int r4 = r12.length
            r23 = r8
            r5 = 0
        L_0x009f:
            r8 = -1
            if (r5 >= r4) goto L_0x00ae
            r9 = r12[r5]
            int r9 = r14.lastIndexOf(r9)
            if (r9 <= r8) goto L_0x00ab
            goto L_0x00af
        L_0x00ab:
            r9 = 1
            int r5 = r5 + r9
            goto L_0x009f
        L_0x00ae:
            r9 = r8
        L_0x00af:
            if (r9 != r8) goto L_0x00d2
            r4 = 50
            int r5 = r2 + -50
            java.lang.String r5 = r3.substring(r5, r2)
            java.lang.String[] r9 = defpackage.hhf.k
            int r12 = r9.length
            r14 = 0
        L_0x00bd:
            if (r14 >= r12) goto L_0x00ce
            r4 = r9[r14]
            int r4 = r5.lastIndexOf(r4)
            if (r4 <= r8) goto L_0x00c9
            r9 = r4
            goto L_0x00cf
        L_0x00c9:
            r4 = 1
            int r14 = r14 + r4
            r4 = 50
            goto L_0x00bd
        L_0x00ce:
            r9 = r8
        L_0x00cf:
            r19 = 50
            goto L_0x00d4
        L_0x00d2:
            r19 = 300(0x12c, float:4.2E-43)
        L_0x00d4:
            if (r9 != r8) goto L_0x00e6
            r4 = 0
            java.lang.String r5 = r3.substring(r4, r2)
            r6.add(r5)
            java.lang.String r2 = r3.substring(r2)
            r6.add(r2)
            goto L_0x0102
        L_0x00e6:
            r4 = 0
            int r2 = r2 - r19
            java.lang.String r2 = r3.substring(r4, r2)
            int r2 = r2.length()
            int r2 = r2 + r9
            java.lang.String r5 = r3.substring(r4, r2)
            r6.add(r5)
            r4 = 1
            int r2 = r2 + r4
            java.lang.String r2 = r3.substring(r2)
            r6.add(r2)
        L_0x0102:
            int r2 = r6.size()
            r4 = 2
            if (r2 == r4) goto L_0x0120
            int r2 = r6.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "oe9"
            java.lang.String r4 = "Wrong message split! Size is %d"
            defpackage.z68.g(r3, r4, r2)
            r20 = r1
            goto L_0x0211
        L_0x0120:
            r2 = 0
            java.lang.Object r4 = r6.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4)
            java.lang.String r4 = r4.toString()
            r5 = 1
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.CharSequence r5 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r6)
            java.lang.String r5 = r5.toString()
            r13.g = r4
            r13.u = r2
            java.util.List r2 = r13.F
            if (r2 == 0) goto L_0x01cf
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r3 = r3.length()
            int r9 = r4.length()
            int r14 = r5.length()
            int r14 = r14 + r9
            int r3 = r3 - r14
            java.util.Iterator r2 = r2.iterator()
        L_0x0162:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x01cc
            java.lang.Object r9 = r2.next()
            ta9 r9 = (defpackage.ta9) r9
            int r14 = r9.d
            int r12 = r4.length()
            r19 = r2
            int r2 = r9.d
            if (r14 <= r12) goto L_0x0190
            int r12 = r4.length()
            int r2 = r2 - r12
            r12 = 55
            r14 = 0
            ta9 r2 = defpackage.ta9.a(r9, r2, r14, r12)
            ta9 r2 = r2.b()
            r8.add(r2)
            r2 = r19
            goto L_0x0162
        L_0x0190:
            r14 = 0
            int r12 = r9.e
            int r14 = r2 + r12
            r20 = r1
            int r1 = r4.length()
            if (r14 <= r1) goto L_0x01c0
            int r1 = r4.length()
            int r1 = r1 - r2
            r2 = 47
            r14 = 0
            ta9 r2 = defpackage.ta9.a(r9, r14, r1, r2)
            ta9 r2 = r2.b()
            r6.add(r2)
            int r12 = r12 - r3
            int r12 = r12 - r1
            r1 = 39
            ta9 r1 = defpackage.ta9.a(r9, r14, r12, r1)
            ta9 r1 = r1.b()
            r8.add(r1)
            goto L_0x01c7
        L_0x01c0:
            ta9 r1 = r9.b()
            r6.add(r1)
        L_0x01c7:
            r2 = r19
            r1 = r20
            goto L_0x0162
        L_0x01cc:
            r20 = r1
            goto L_0x01d3
        L_0x01cf:
            r20 = r1
            r6 = 0
            r8 = 0
        L_0x01d3:
            if (r6 == 0) goto L_0x01da
            java.util.List r1 = kotlin.collections.CollectionsKt.filterNotNull(r6)
            goto L_0x01db
        L_0x01da:
            r1 = 0
        L_0x01db:
            r13.F = r1
            ga9 r1 = new ga9
            r1.<init>()
            r1.g = r5
            if (r8 == 0) goto L_0x01eb
            java.util.List r2 = kotlin.collections.CollectionsKt.filterNotNull(r8)
            goto L_0x01ec
        L_0x01eb:
            r2 = 0
        L_0x01ec:
            r1.F = r2
            ha9 r2 = r13.r
            r1.r = r2
            boolean r2 = r13.u
            r1.u = r2
            cl4 r2 = r13.H
            r1.H = r2
            goto L_0x0212
        L_0x01fb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "deltaForSpaceSeparator should be less then maxLength"
            r0.<init>(r1)
            throw r0
        L_0x0203:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "deltaForNewLineSeparator should be less then maxLength"
            r0.<init>(r1)
            throw r0
        L_0x020b:
            r20 = r1
            r21 = r4
            r23 = r8
        L_0x0211:
            r1 = 0
        L_0x0212:
            mc9 r2 = r0.o
            if (r2 == 0) goto L_0x026d
            a89 r3 = r2.c
            int r4 = r2.a
            r5 = 2
            if (r4 != r5) goto L_0x024f
            ha9 r5 = r3.a
            boolean r5 = r5.r()
            ha9 r6 = r3.a
            if (r5 != 0) goto L_0x0231
            boolean r5 = r6.t()
            if (r5 == 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r13.r = r6
            goto L_0x0253
        L_0x0231:
            w28 r5 = r6.x0
            ga9 r6 = r6.I()
            m20 r8 = new m20
            r8.<init>()
            java.lang.Object r5 = r5.b
            java.util.List r5 = (java.util.List) r5
            r8.a = r5
            w28 r5 = r8.c()
            r6.n = r5
            ha9 r5 = r6.a()
            r13.r = r5
            goto L_0x0253
        L_0x024f:
            ha9 r5 = r3.a
            r13.r = r5
        L_0x0253:
            r13.p = r4
            long r4 = r2.b
            r13.q = r4
            ha9 r3 = r3.a
            long r3 = r3.c
            java.lang.String r3 = r2.d
            r13.s = r3
            java.lang.String r3 = r2.e
            r13.t = r3
            long r3 = r2.f
            r13.x = r3
            long r3 = r2.g
            r13.y = r3
        L_0x026d:
            jtb r3 = r81.q()
            ltb r3 = (defpackage.ltb) r3
            a33 r3 = r3.a
            java.lang.String r4 = "server.timeDelta"
            r5 = 0
            long r3 = r3.e(r4, r5)
            long r3 = r3 + r10
            if (r15 != 0) goto L_0x0282
            r5 = r3
            goto L_0x0286
        L_0x0282:
            ha9 r5 = r15.a
            long r5 = r5.o
        L_0x0286:
            r13.k = r3
            r13.c = r5
            boolean r3 = r7.K()
            if (r3 == 0) goto L_0x029a
            r3 = r20
            b72 r3 = r3.H
            boolean r3 = r3.a
            if (r3 != 0) goto L_0x029a
            r3 = 4
            goto L_0x029b
        L_0x029a:
            r3 = 2
        L_0x029b:
            r13.I = r3
            r3 = r23
            r13.h = r3
            boolean r5 = r7.H()
            if (r5 != 0) goto L_0x02b4
            jtb r5 = r81.q()
            ltb r5 = (defpackage.ltb) r5
            a33 r5 = r5.a
            long r5 = r5.s()
            goto L_0x02b6
        L_0x02b4:
            r5 = 0
        L_0x02b6:
            r13.e = r5
            w28 r5 = r13.n
            if (r5 != 0) goto L_0x02c7
            m20 r5 = new m20
            r5.<init>()
            w28 r5 = r5.c()
            r13.n = r5
        L_0x02c7:
            zf7 r5 = r0.v
            if (r5 != 0) goto L_0x02cc
            goto L_0x02da
        L_0x02cc:
            w28 r6 = r13.n
            m20 r6 = r6.Q()
            r6.b = r5
            w28 r5 = r6.c()
            r13.n = r5
        L_0x02da:
            ha9 r5 = r13.a()
            hud r6 = r0.a
            if (r6 == 0) goto L_0x02e3
            goto L_0x02e4
        L_0x02e3:
            r6 = 0
        L_0x02e4:
            kotlin.Lazy r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            gvc r6 = (defpackage.gvc) r6
            r6.getClass()
            java.util.List r8 = r5.P0
            boolean r9 = defpackage.cjf.B(r8)
            if (r9 == 0) goto L_0x02fc
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x031b
        L_0x02fc:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r8.iterator()
        L_0x0305:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x031b
            java.lang.Object r11 = r10.next()
            ta9 r11 = (defpackage.ta9) r11
            sa9 r13 = r11.c
            sa9 r14 = defpackage.sa9.Y
            if (r13 != r14) goto L_0x0305
            r9.add(r11)
            goto L_0x0305
        L_0x031b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r9 = kotlin.collections.CollectionsKt.toMutableList(r9)
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            r13 = 1
            r11 = r11 ^ r13
            java.lang.String r13 = r5.y
            kotlin.Lazy r14 = r6.b
            if (r11 == 0) goto L_0x03c4
            java.lang.Object r11 = r14.getValue()
            yva r11 = (defpackage.yva) r11
            u25 r11 = r11.k
            java.util.List r11 = r11.d(r13)
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.List r11 = kotlin.collections.CollectionsKt.toMutableList(r11)
            r14 = r11
            java.util.Collection r14 = (java.util.Collection) r14
            int r14 = r14.size()
            r15 = 0
        L_0x034f:
            if (r15 >= r14) goto L_0x03bd
            java.lang.Object r17 = r11.get(r15)
            kotlin.Pair r17 = (kotlin.Pair) r17
            java.lang.Object r19 = r17.component1()
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            java.lang.Object r17 = r17.component2()
            kotlin.ranges.IntRange r17 = (kotlin.ranges.IntRange) r17
            r20 = r9
            java.lang.Iterable r20 = (java.lang.Iterable) r20
            java.util.Iterator r20 = r20.iterator()
        L_0x036b:
            boolean r23 = r20.hasNext()
            if (r23 == 0) goto L_0x0387
            java.lang.Object r23 = r20.next()
            r12 = r23
            ta9 r12 = (defpackage.ta9) r12
            int r12 = r12.d
            r25 = r7
            int r7 = r17.getFirst()
            if (r12 != r7) goto L_0x0384
            goto L_0x038b
        L_0x0384:
            r7 = r25
            goto L_0x036b
        L_0x0387:
            r25 = r7
            r23 = 0
        L_0x038b:
            r7 = r23
            ta9 r7 = (defpackage.ta9) r7
            if (r7 == 0) goto L_0x03a4
            mj r12 = new mj
            r17 = r1
            r29 = r2
            long r1 = r7.a
            r12.<init>(r1)
            r10.add(r12)
            r9.remove(r7)
        L_0x03a2:
            r1 = 1
            goto L_0x03b5
        L_0x03a4:
            r17 = r1
            r29 = r2
            d35 r1 = new d35
            java.lang.String r2 = r19.toString()
            r1.<init>(r2)
            r10.add(r1)
            goto L_0x03a2
        L_0x03b5:
            int r15 = r15 + r1
            r1 = r17
            r7 = r25
            r2 = r29
            goto L_0x034f
        L_0x03bd:
            r17 = r1
            r29 = r2
            r25 = r7
            goto L_0x040f
        L_0x03c4:
            r17 = r1
            r29 = r2
            r25 = r7
            java.lang.Object r1 = r14.getValue()
            yva r1 = (defpackage.yva) r1
            u25 r1 = r1.k
            java.util.List r1 = r1.a(r13)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r7 = 1
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x040f
            defpackage.cjf.N(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r2.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x03f3:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x040c
            java.lang.Object r7 = r1.next()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            d35 r9 = new d35
            java.lang.String r7 = r7.toString()
            r9.<init>(r7)
            r2.add(r9)
            goto L_0x03f3
        L_0x040c:
            r10.addAll(r2)
        L_0x040f:
            w28 r1 = r5.x0
            if (r1 == 0) goto L_0x0418
            java.lang.Object r2 = r1.b
            java.util.List r2 = (java.util.List) r2
            goto L_0x0419
        L_0x0418:
            r2 = 0
        L_0x0419:
            if (r2 != 0) goto L_0x041f
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x041f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0423:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0444
            java.lang.Object r7 = r2.next()
            l20 r7 = (defpackage.l20) r7
            f20 r7 = r7.f
            if (r7 == 0) goto L_0x0423
            long r11 = r7.a
            r14 = 0
            int r7 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0423
            vpe r7 = new vpe
            r7.<init>(r11, r11)
            r10.add(r7)
            goto L_0x0423
        L_0x0444:
            r14 = 0
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x044d
            goto L_0x0486
        L_0x044d:
            wuc r2 = r6.b()
            j6d r7 = r2.a
            mka r7 = r7.n()
            vuc r9 = new vuc
            r11 = 2
            r9.<init>(r2, r10, r11)
            na3 r2 = new na3
            r10 = 4
            r2.<init>(r10, r7, r9)
            kotlin.Lazy r7 = r6.c
            java.lang.Object r7 = r7.getValue()
            lfd r7 = (defpackage.lfd) r7
            xa3 r2 = r2.l(r7)
            ue4 r7 = new ue4
            r9 = 12
            r7.<init>(r9)
            js9 r9 = defpackage.js9.w
            ao1 r10 = new ao1
            r11 = 0
            r10.<init>(r11, r9, r7)
            r2.j(r10)
            ifg r2 = r6.g
            r2.a(r10)
        L_0x0486:
            fa9 r2 = r81.o()
            s74 r2 = r2.a
            a74 r2 = (defpackage.a74) r2
            z6d r2 = r2.c
            r2.getClass()
            ha9 r6 = r5.A0
            if (r6 == 0) goto L_0x04f5
            int r7 = r5.y0
            r9 = 2
            if (r7 != r9) goto L_0x04f5
            w28 r1 = r6.x0
            if (r1 == 0) goto L_0x04e3
            java.lang.Object r7 = r1.b
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x04a7
            goto L_0x04e4
        L_0x04a7:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, 10)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x04b6:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x04d8
            java.lang.Object r9 = r7.next()
            l20 r9 = (defpackage.l20) r9
            j10 r9 = r9.j()
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            r9.l = r10
            l20 r9 = r9.a()
            r8.add(r9)
            goto L_0x04b6
        L_0x04d8:
            m20 r1 = r1.Q()
            r1.a = r8
            w28 r1 = r1.c()
            goto L_0x04e4
        L_0x04e3:
            r1 = 0
        L_0x04e4:
            java.util.List r7 = r6.P0
            if (r7 != 0) goto L_0x04ec
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x04ec:
            java.lang.String r13 = r6.y
            r50 = r1
            r77 = r7
        L_0x04f2:
            r43 = r13
            goto L_0x0500
        L_0x04f5:
            if (r8 != 0) goto L_0x04fb
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L_0x04fb:
            r50 = r1
            r77 = r8
            goto L_0x04f2
        L_0x0500:
            int r51 = defpackage.qe8.c(r50)
            if (r6 == 0) goto L_0x050b
            long r13 = r6.b
            r54 = r13
            goto L_0x050d
        L_0x050b:
            r54 = r14
        L_0x050d:
            cl4 r1 = r5.R0
            if (r1 == 0) goto L_0x051a
            long r6 = r1.a
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r79 = r6
            goto L_0x051c
        L_0x051a:
            r79 = 0
        L_0x051c:
            if (r1 == 0) goto L_0x0527
            boolean r1 = r1.b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r80 = r1
            goto L_0x0529
        L_0x0527:
            r80 = 0
        L_0x0529:
            oa9 r44 = defpackage.oa9.SENDING
            qe9 r45 = defpackage.qe9.ACTIVE
            ya9 r1 = new ya9
            r30 = r1
            r73 = 0
            int r6 = r5.N0
            r74 = r6
            r31 = 0
            r33 = 0
            long r6 = r5.o
            r35 = r6
            r37 = 0
            long r6 = r5.w
            r39 = r6
            long r6 = r5.x
            r41 = r6
            long r6 = r5.Z
            r46 = r6
            r48 = 0
            r49 = 0
            boolean r6 = r5.E0
            r52 = r6
            int r6 = r5.y0
            r53 = r6
            r56 = 0
            long r6 = r5.z0
            r57 = r6
            java.lang.String r6 = r5.B0
            r59 = r6
            java.lang.String r6 = r5.C0
            r60 = r6
            long r6 = r5.H0
            r61 = r6
            long r6 = r5.I0
            r63 = r6
            int r6 = r5.T0
            r65 = r6
            long r6 = r5.z
            r66 = r6
            int r6 = r5.K0
            r68 = r6
            r69 = 0
            r70 = 0
            long r6 = r5.L0
            r71 = r6
            long r6 = r5.O0
            r75 = r6
            xd9 r5 = r5.Q0
            r78 = r5
            r30.<init>(r31, r33, r35, r37, r39, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r53, r54, r56, r57, r59, r60, r61, r63, r65, r66, r68, r69, r70, r71, r73, r74, r75, r77, r78, r79, r80)
            aj9 r2 = r2.d()
            long r1 = r2.f(r1)
            fa9 r5 = r81.o()
            ha9 r1 = r5.r(r1)
            boolean r2 = r1.p()
            if (r2 != 0) goto L_0x05ae
            r62 r2 = r81.e()
            r5 = 1
            a32 r7 = r2.u0(r3, r1, r5)
            goto L_0x05b0
        L_0x05ae:
            r7 = r25
        L_0x05b0:
            if (r7 == 0) goto L_0x0638
            boolean r2 = r7.N()
            if (r2 == 0) goto L_0x05be
            boolean r2 = r7.E()
            if (r2 == 0) goto L_0x05c4
        L_0x05be:
            boolean r2 = r7.S()
            if (r2 == 0) goto L_0x05cd
        L_0x05c4:
            r62 r2 = r81.e()
            k72 r5 = defpackage.k72.a
            r2.k(r3, r5)
        L_0x05cd:
            hud r2 = r0.a
            if (r2 == 0) goto L_0x05d3
            r14 = r2
            goto L_0x05d4
        L_0x05d3:
            r14 = 0
        L_0x05d4:
            kotlin.Lazy r2 = r14.c
            java.lang.Object r2 = r2.getValue()
            sv0 r2 = (defpackage.sv0) r2
            w5b r3 = new w5b
            long r4 = r1.w
            bl4 r6 = r1.S0
            long r8 = r0.c
            long r10 = r1.b
            java.lang.String r12 = r0.y
            r18 = r3
            r19 = r8
            r23 = r10
            r25 = r12
            r26 = r4
            r28 = r6
            r18.<init>(r19, r21, r23, r25, r26, r28)
            r2.c(r3)
            long r1 = r1.b
            long r1 = r0.B(r1, r7)
            r0.X = r1
            if (r17 == 0) goto L_0x0638
            r3 = r17
            java.lang.String r7 = r3.g
            java.util.List r4 = r3.F
            kvd r10 = new kvd
            if (r4 != 0) goto L_0x0612
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0612:
            r9 = r4
            long r5 = r0.c
            r8 = 0
            r4 = r10
            r4.<init>(r5, r7, r8, r9)
            r4 = r29
            r10.b = r4
            r10.d = r1
            boolean r1 = r0.x
            r10.e = r1
            long r1 = r0.v0
            r10.f = r1
            cl4 r1 = r3.H
            r10.k = r1
            mvd r1 = new mvd
            r1.<init>(r10)
            jqg r0 = r81.v()
            r0.a(r1)
        L_0x0638:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivd.z():void");
    }

    public ivd(hvd hvd) {
        this.c = hvd.a;
        this.o = hvd.b;
        this.v = hvd.c;
        this.w = hvd.d;
        this.x = hvd.e;
        this.z = hvd.g;
        this.y = hvd.h;
        this.Y = hvd.i;
        this.Z = hvd.j;
        this.v0 = hvd.f;
        this.w0 = hvd.k;
    }
}
