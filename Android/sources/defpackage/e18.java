package defpackage;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: e18  reason: default package */
public final /* synthetic */ class e18 implements qk3, zi6, za3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ e18(j18 j18, int i) {
        this.a = i;
        this.b = j18;
    }

    /* JADX WARNING: type inference failed for: r4v23, types: [dc2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a6, code lost:
        r4 = r0.Y;
        r12 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 14
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 4
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x0384;
                case 1: goto L_0x01d5;
                case 5: goto L_0x01b4;
                case 6: goto L_0x019f;
                case 7: goto L_0x0142;
                case 11: goto L_0x0022;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = r23
            a32 r1 = (defpackage.a32) r1
            j18 r0 = r0.b
            r0.getClass()
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            dac r0 = r0.b
            r0.d(r1)
            return
        L_0x0022:
            r1 = r23
            qq3 r1 = (defpackage.qq3) r1
            j18 r0 = r0.b
            r0.getClass()
            defpackage.j18.a()
            pq3 r6 = r0.y
            wbe r6 = r6.a()
            ms1 r7 = new ms1
            r8 = 28
            r7.<init>(r8, r1)
            na3 r8 = new na3
            r8.<init>(r5, r6, r7)
            r8.a()
            long r11 = r1.a
            cc2 r5 = r0.z
            wbe r5 = r5.a()
            v52 r6 = new v52
            java.lang.String r15 = r1.d
            long r13 = r1.b
            r10 = 2
            r9 = r6
            r9.<init>(r10, r11, r13, r15)
            wh8 r7 = new wh8
            r7.<init>(r3, r5, r6)
            q0a r5 = new q0a
            r5.<init>((int) r2)
            oa3 r6 = new oa3
            r6.<init>(r4, r7, r5)
            zb2 r5 = new zb2
            r5.<init>(r2)
            yia r2 = new yia
            r7 = 3
            r2.<init>(r6, r5, r7)
            oha r2 = r2.B()
            zb2 r5 = new zb2
            r5.<init>(r4)
            wh8 r4 = new wh8
            r4.<init>(r3, r2, r5)
            java.util.List r2 = java.util.Collections.emptyList()
            java.lang.Object r2 = r4.c(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x008c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0141
            java.lang.Object r3 = r2.next()
            ec2 r3 = (defpackage.ec2) r3
            long r4 = r3.f
            long r6 = r1.b
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x008c
            long r4 = r3.g
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x008c
            fa9 r4 = r0.Y
            long r12 = r3.c
            ha9 r5 = r4.r(r12)
            if (r5 != 0) goto L_0x00b1
            goto L_0x008c
        L_0x00b1:
            qq3 r5 = r0.d(r5)
            long r8 = r5.b
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x008c
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = defpackage.iq.U(r8)
            s58 r9 = r1.c
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r9, r8}
            java.lang.String r8 = "j18"
            java.lang.String r10 = "handleContactLocation: Update location attach messageId = %d, location = %s, time = %s"
            defpackage.z68.c(r8, r10, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = defpackage.iq.U(r8)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r9, r8}
            java.lang.String r8 = "fa9"
            java.lang.String r10 = "updateLastLocation: messageId = %d, location = %s, long time = %s"
            defpackage.z68.c(r8, r10, r5)
            ha9 r5 = r4.r(r12)
            if (r5 == 0) goto L_0x0134
            qe9 r8 = defpackage.qe9.DELETED
            qe9 r10 = r5.Y
            if (r10 == r8) goto L_0x0134
            boolean r8 = r5.B()
            if (r8 == 0) goto L_0x0134
            u10 r8 = r5.j()
            if (r8 != 0) goto L_0x0104
            goto L_0x0134
        L_0x0104:
            v10 r10 = new v10
            r10.<init>(r9, r6)
            v10 r6 = r8.i
            if (r6 == 0) goto L_0x0114
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x0114
            goto L_0x0134
        L_0x0114:
            g20 r6 = defpackage.g20.v0
            l20 r6 = r5.a(r6)
            java.lang.String r6 = r6.q
            td8 r7 = new td8
            r8 = 13
            r7.<init>(r8, r10)
            r4.x(r12, r6, r7)
            twf r6 = new twf
            r9 = 0
            long r10 = r5.z
            r8 = r6
            r8.<init>(r9, r10, r12)
            sv0 r4 = r4.b
            r4.c(r6)
        L_0x0134:
            long r3 = r3.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            dac r4 = r0.o
            r4.d(r3)
            goto L_0x008c
        L_0x0141:
            return
        L_0x0142:
            j18 r0 = r0.b
            r1 = r23
            java.lang.Long r1 = (java.lang.Long) r1
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = r0.w
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r0.w     // Catch:{ all -> 0x016c }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x016c }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x016c }
            if (r1 == 0) goto L_0x016e
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x016c }
        L_0x015c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x016e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x016c }
            c18 r4 = (defpackage.c18) r4     // Catch:{ all -> 0x016c }
            r4.G0()     // Catch:{ all -> 0x016c }
            goto L_0x015c
        L_0x016c:
            r0 = move-exception
            goto L_0x019d
        L_0x016e:
            java.util.concurrent.ConcurrentHashMap r0 = r0.w     // Catch:{ all -> 0x016c }
            r3 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x016c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x016c }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x019b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x016c }
        L_0x0182:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x016c }
            if (r3 == 0) goto L_0x019b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x016c }
            c18 r3 = (defpackage.c18) r3     // Catch:{ all -> 0x016c }
            if (r1 == 0) goto L_0x0197
            boolean r4 = r1.contains(r3)     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x0197
            goto L_0x0182
        L_0x0197:
            r3.G0()     // Catch:{ all -> 0x016c }
            goto L_0x0182
        L_0x019b:
            monitor-exit(r2)     // Catch:{ all -> 0x016c }
            return
        L_0x019d:
            monitor-exit(r2)     // Catch:{ all -> 0x016c }
            throw r0
        L_0x019f:
            r1 = r23
            ha9 r1 = (defpackage.ha9) r1
            j18 r0 = r0.b
            r0.getClass()
            long r1 = r1.b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            dac r0 = r0.a
            r0.d(r1)
            return
        L_0x01b4:
            j18 r0 = r0.b
            r1 = r23
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.getClass()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            long r2 = r0.J0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't request location for chat = "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "j18"
            defpackage.z68.f(r2, r0, r1)
            return
        L_0x01d5:
            r2 = r23
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            j18 r0 = r0.b
            r0.getClass()
            defpackage.j18.a()
            fa9 r6 = r0.Y
            ha9 r6 = r6.r(r2)
            cc2 r14 = r0.z
            if (r6 != 0) goto L_0x0205
            wbe r4 = r14.a()
            c10 r6 = new c10
            r6.<init>(r2, r1)
            na3 r1 = new na3
            r1.<init>(r5, r4, r6)
            r1.a()
            r0.h()
            goto L_0x037b
        L_0x0205:
            boolean r7 = r0.g(r6)
            if (r7 != 0) goto L_0x020d
            goto L_0x037b
        L_0x020d:
            qe9 r7 = defpackage.qe9.DELETED
            qe9 r8 = r6.Y
            dac r15 = r0.o
            long r12 = r6.z
            if (r8 != r7) goto L_0x0234
            wbe r4 = r14.a()
            c10 r6 = new c10
            r6.<init>(r2, r1)
            na3 r1 = new na3
            r1.<init>(r5, r4, r6)
            r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r15.d(r1)
            r0.h()
            goto L_0x037b
        L_0x0234:
            u10 r1 = r6.j()
            if (r1 == 0) goto L_0x037c
            boolean r5 = r0.f(r6)
            jtb r10 = r0.X
            long r8 = r6.o
            if (r5 == 0) goto L_0x02c3
            r5 = r10
            ltb r5 = (defpackage.ltb) r5
            a33 r7 = r5.a
            long r16 = r7.m()
            r22 = r5
            long r4 = r6.z
            r23 = r10
            long r10 = r6.w
            r7 = r14
            r18 = r2
            r3 = r1
            r1 = r8
            r8 = r4
            r4 = r23
            r20 = r12
            r12 = r16
            wh8 r5 = r7.c(r8, r10, r12)
            java.util.List r7 = java.util.Collections.emptyList()
            java.lang.Object r5 = r5.c(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0273:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c0
            java.lang.Object r7 = r5.next()
            ec2 r7 = (defpackage.ec2) r7
            long r8 = r7.c
            long r10 = r6.b
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x02ba
            ru.ok.tamtam.util.HandledException r8 = new ru.ok.tamtam.util.HandledException
            java.lang.String r9 = "We have old location with with same user in same chat"
            r8.<init>(r9)
            m95 r9 = r0.x0
            uta r9 = (defpackage.uta) r9
            r10 = 1
            r9.c(r8, r10)
            long r8 = r7.d
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x037b
            dc2 r7 = r7.a()
            r8 = r22
            a33 r9 = r8.a
            long r11 = r9.m()
            r7.g = r11
            ec2 r9 = new ec2
            r9.<init>(r7)
            r14.e(r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r20)
            r15.d(r7)
            goto L_0x02bd
        L_0x02ba:
            r10 = 1
            r8 = r22
        L_0x02bd:
            r22 = r8
            goto L_0x0273
        L_0x02c0:
            r7 = r18
            goto L_0x02cb
        L_0x02c3:
            r18 = r2
            r4 = r10
            r20 = r12
            r3 = r1
            r1 = r8
            goto L_0x02c0
        L_0x02cb:
            ai8 r5 = r14.d(r7)
            ec2 r9 = defpackage.ec2.i
            java.lang.Object r5 = r5.c(r9)
            ec2 r5 = (defpackage.ec2) r5
            long r10 = r6.w
            java.lang.String r6 = r3.f
            long r12 = r3.d
            r23 = r4
            if (r5 == r9) goto L_0x02eb
            long r4 = r5.g
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x02e8
            goto L_0x02eb
        L_0x02e8:
            r16 = r10
            goto L_0x032c
        L_0x02eb:
            dc2 r4 = new dc2
            r4.<init>()
            r4.a = r10
            r16 = r10
            r9 = r20
            r4.b = r9
            r4.c = r7
            r4.d = r1
            long r7 = r3.b
            r4.e = r7
            long r7 = r3.c
            r4.f = r7
            r4.g = r12
            r4.h = r6
            ec2 r5 = new ec2
            r5.<init>(r4)
            na3 r4 = r14.e(r5)
            r4.a()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r15.d(r4)
            r0.h()
            pwe r4 = r0.B0
            r4.getClass()
            r10 = r23
            ltb r10 = (defpackage.ltb) r10
            a33 r4 = r10.a
            r4.m()
        L_0x032c:
            qq3 r4 = defpackage.qq3.e
            vy r4 = new vy
            s58 r5 = r3.a
            r4.<init>((defpackage.s58) r5)
            r7 = r16
            r4.b = r7
            r4.c = r1
            r4.o = r6
            qq3 r1 = r4.d()
            dac r0 = r0.c
            r0.d(r1)
            java.util.List r1 = r3.e
            if (r1 == 0) goto L_0x037b
            oj4 r2 = new oj4
            r3 = 11
            r2.<init>(r3)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0358:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037b
            java.lang.Object r2 = r1.next()
            v10 r2 = (defpackage.v10) r2
            s58 r3 = r2.a
            vy r4 = new vy
            r4.<init>((defpackage.s58) r3)
            r4.b = r7
            long r2 = r2.b
            r4.c = r2
            r4.o = r6
            qq3 r2 = r4.d()
            r0.d(r2)
            goto L_0x0358
        L_0x037b:
            return
        L_0x037c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Live location message without location"
            r0.<init>(r1)
            throw r0
        L_0x0384:
            r1 = r23
            java.lang.Long r1 = (java.lang.Long) r1
            long r2 = r1.longValue()
            j18 r0 = r0.b
            r0.getClass()
            defpackage.j18.a()
            r62 r4 = r0.Z
            a32 r4 = r4.G(r2)
            if (r4 == 0) goto L_0x0459
            m72 r6 = r4.b
            k72 r7 = r6.c
            k72 r8 = defpackage.k72.a
            if (r7 == r8) goto L_0x03a6
            goto L_0x0459
        L_0x03a6:
            java.util.Map r1 = r6.n0
            if (r1 == 0) goto L_0x0476
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x03b2
            goto L_0x0476
        L_0x03b2:
            java.util.Collection r2 = r1.values()
            fa9 r3 = r0.Y
            long r4 = r4.a
            java.util.ArrayList r2 = r3.l(r4, r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x03c2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03da
            java.lang.Object r4 = r3.next()
            ha9 r4 = (defpackage.ha9) r4
            long r4 = r4.b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            dac r5 = r0.a
            r5.d(r4)
            goto L_0x03c2
        L_0x03da:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.size()
            int r5 = r1.size()
            java.lang.String r7 = "j18"
            if (r4 == r5) goto L_0x041a
            java.util.HashSet r4 = new java.util.HashSet
            java.util.Collection r1 = r1.values()
            r4.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x03f8:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x040e
            java.lang.Object r5 = r1.next()
            ha9 r5 = (defpackage.ha9) r5
            long r8 = r5.c
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r4.remove(r5)
            goto L_0x03f8
        L_0x040e:
            java.lang.String r1 = "We don't have few messages. Try to get it from server ids = %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r4}
            defpackage.z68.c(r7, r1, r5)
            r3.addAll(r4)
        L_0x041a:
            java.util.Iterator r1 = r2.iterator()
        L_0x041e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0449
            java.lang.Object r2 = r1.next()
            ha9 r2 = (defpackage.ha9) r2
            boolean r4 = r0.g(r2)
            if (r4 != 0) goto L_0x041e
            long r4 = r2.b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "Message %d is not live. Try to update it from server"
            defpackage.z68.c(r7, r5, r4)
            long r4 = r2.c
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.add(r2)
            goto L_0x041e
        L_0x0449:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0476
            rl r0 = r0.v0
            jna r0 = (defpackage.jna) r0
            long r1 = r6.a
            r0.K(r1, r3)
            goto L_0x0476
        L_0x0459:
            cc2 r4 = r0.z
            wbe r4 = r4.a()
            c10 r6 = new c10
            r7 = 12
            r6.<init>(r2, r7)
            na3 r2 = new na3
            r2.<init>(r5, r4, r6)
            r2.a()
            dac r2 = r0.o
            r2.d(r1)
            r0.h()
        L_0x0476:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e18.accept(java.lang.Object):void");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                j18 j18 = this.b;
                Long l = (Long) obj;
                return new yia(new oa3(1, j18.z.b(j18.J0, ((ltb) j18.X).a.m()), new q0a(0)), new e18(j18, 9), 0).B();
            case 3:
                j18 j182 = this.b;
                List<qq3> list = (List) obj;
                a32 G = j182.Z.G(j182.J0);
                if (G == null) {
                    return uh8.a;
                }
                long j = Long.MAX_VALUE;
                for (qq3 qq3 : list) {
                    long j2 = qq3.b;
                    if (j2 < j) {
                        j = j2;
                    }
                }
                if (j == LongCompanionObject.MAX_VALUE) {
                    j = 0;
                }
                long j3 = G.b.a;
                fbf fbf = new fbf((x3b) null);
                fbf.p(j3, ApiProtocol.PARAM_CHAT_ID);
                fbf.p(j, "syncTime");
                return nh8.e(fbf);
            case 4:
                j18 j183 = this.b;
                return ((jna) j183.v0).U((z58) obj, j183.z0);
            case 9:
                ec2 ec2 = (ec2) obj;
                j18 j184 = this.b;
                j184.getClass();
                return new ai8(new wh8(2, j184.y.a(), new nq3(ec2.a, ec2.h)), new zb2(14), 1);
            default:
                ec2 ec22 = (ec2) obj;
                j18 j185 = this.b;
                j185.getClass();
                return new ai8(new ai8(new wh8(2, j185.y.a(), new nq3(ec22.a, ec22.h)), new zb2(14), 1), new bc2(ec22, 1), 1);
        }
    }

    public void b(pa3 pa3) {
        this.b.h();
        pa3.b();
    }
}
