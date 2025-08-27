package defpackage;

import java.util.Collections;

/* renamed from: yud  reason: default package */
public final class yud extends ivd {
    public final /* synthetic */ int x0 = 0;
    public final long y0;

    public yud(long j, long j2) {
        super(new xud(0, j, j2));
        this.y0 = j2;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, m20] */
    public final ga9 A() {
        switch (this.x0) {
            case 0:
                return null;
            default:
                hud hud = this.a;
                if (hud == null) {
                    hud = null;
                }
                f20 s = qe8.s(((moe) hud.r.getValue()).c(this.y0));
                ? obj = new Object();
                obj.f = s;
                obj.a = g20.w;
                l20 a = obj.a();
                ? obj2 = new Object();
                obj2.a = Collections.singletonList(a);
                w28 c = obj2.c();
                ga9 ga9 = new ga9();
                ga9.n = c;
                return ga9;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [cbe] */
    /* JADX WARNING: type inference failed for: r13v6, types: [q6g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r28 = this;
            r0 = r28
            r1 = 3
            r2 = 2
            r3 = 1
            int r4 = r0.x0
            switch(r4) {
                case 0: goto L_0x000e;
                default: goto L_0x000a;
            }
        L_0x000a:
            super.z()
            return
        L_0x000e:
            fa9 r4 = r28.o()
            long r5 = r0.y0
            ha9 r4 = r4.r(r5)
            if (r4 == 0) goto L_0x01e9
            qe9 r7 = defpackage.qe9.DELETED
            qe9 r8 = r4.Y
            if (r8 != r7) goto L_0x0022
            goto L_0x01e9
        L_0x0022:
            r62 r7 = r28.e()
            long r8 = r0.c
            a32 r7 = r7.G(r8)
            if (r7 != 0) goto L_0x0040
            m95 r0 = r28.j()
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            java.lang.String r2 = "chat is null"
            r1.<init>(r2)
            uta r0 = (defpackage.uta) r0
            r0.c(r1, r3)
            goto L_0x01f0
        L_0x0040:
            boolean r8 = r4.o()
            if (r8 == 0) goto L_0x01bb
            boolean r8 = r4.q()
            if (r8 != 0) goto L_0x01bb
            w28 r8 = r4.x0
            if (r8 == 0) goto L_0x01bb
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x01bb
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x005c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01bb
            java.lang.Object r10 = r8.next()
            l20 r10 = (defpackage.l20) r10
            x10 r11 = r10.b
            if (r11 == 0) goto L_0x007e
            java.lang.String r11 = r11.x
            if (r11 == 0) goto L_0x007e
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            r26 = r4
            r27 = r8
            r8 = r2
            goto L_0x01b3
        L_0x007e:
            hud r11 = r0.a
            if (r11 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r11 = 0
        L_0x0084:
            kotlin.Lazy r11 = r11.J
            java.lang.Object r11 = r11.getValue()
            hje r11 = (defpackage.hje) r11
            r11.getClass()
            g20 r12 = r10.a
            if (r12 != 0) goto L_0x0095
            r13 = -1
            goto L_0x009d
        L_0x0095:
            int[] r13 = defpackage.gje.$EnumSwitchMapping$0
            int r14 = r12.ordinal()
            r13 = r13[r14]
        L_0x009d:
            if (r13 == r3) goto L_0x00af
            if (r13 == r2) goto L_0x00ad
            if (r13 == r1) goto L_0x00ab
            r14 = 4
            if (r13 == r14) goto L_0x00a9
            r13 = 0
            goto L_0x010e
        L_0x00a9:
            r13 = 7
            goto L_0x00b0
        L_0x00ab:
            r13 = r2
            goto L_0x00b0
        L_0x00ad:
            r13 = r1
            goto L_0x00b0
        L_0x00af:
            r13 = r3
        L_0x00b0:
            java.lang.String r14 = r10.r
            if (r13 != r1) goto L_0x00dc
            k20 r15 = r10.d
            j20 r9 = r15.k
            if (r9 == 0) goto L_0x00dc
            q6g r13 = new q6g
            i20 r1 = new i20
            r1.<init>(r3)
            qac r2 = r9.c
            r1.a = r2
            float r2 = r9.a
            r1.b = r2
            float r2 = r9.b
            r1.c = r2
            boolean r2 = r9.d
            r1.d = r2
            p4g r2 = new p4g
            r2.<init>(r1)
            java.lang.String r1 = r15.c
            r13.<init>(r14, r2, r1)
            goto L_0x010e
        L_0x00dc:
            if (r13 != r3) goto L_0x0108
            x10 r1 = r10.b
            java.lang.String r2 = r1.X
            boolean r2 = defpackage.cvg.A(r2)
            if (r2 != 0) goto L_0x0108
            df5 r13 = new df5
            java.lang.String r22 = r1.a()
            java.lang.String r2 = r10.r
            int r9 = r1.c
            java.lang.String r14 = r1.z
            int r15 = r1.o
            java.lang.String r1 = r1.X
            r16 = r13
            r17 = r9
            r18 = r15
            r19 = r14
            r20 = r2
            r21 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x010e
        L_0x0108:
            cbe r1 = new cbe
            r1.<init>(r13, r14)
            r13 = r1
        L_0x010e:
            if (r13 != 0) goto L_0x0128
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "skipped for type "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = defpackage.hje.f
            defpackage.z68.p(r2, r1)
            r26 = r4
            r27 = r8
            goto L_0x0184
        L_0x0128:
            boolean r1 = r13 instanceof defpackage.df5
            kotlin.reflect.KProperty[] r2 = defpackage.hje.e
            r9 = 0
            hs7 r12 = r11.a
            long r14 = r0.c
            r26 = r4
            long r3 = r0.y0
            r27 = r8
            java.lang.String r8 = r10.q
            if (r1 == 0) goto L_0x0187
            r1 = r2[r9]
            java.lang.Object r1 = r12.get()
            fa9 r1 = (defpackage.fa9) r1
            mqd r9 = new mqd
            r12 = 2
            r9.<init>(r12)
            r1.x(r3, r8, r9)
            r1 = 1
            r8 = r2[r1]
            hs7 r8 = r11.b
            java.lang.Object r8 = r8.get()
            jqg r8 = (defpackage.jqg) r8
            ff5 r9 = new ff5
            r12 = 3
            r2 = r2[r12]
            hs7 r2 = r11.d
            java.lang.Object r2 = r2.get()
            x23 r2 = (defpackage.x23) r2
            qjd r2 = (defpackage.qjd) r2
            long r17 = r2.n()
            df5 r13 = (defpackage.df5) r13
            java.lang.String r2 = r10.q
            java.lang.String r10 = r13.w
            java.lang.String r11 = r13.b
            r16 = r9
            r19 = r11
            r20 = r2
            r21 = r3
            r23 = r14
            r25 = r10
            r16.<init>(r17, r19, r20, r21, r23, r25)
            r8.b(r9)
        L_0x0184:
            r1 = 3
            r8 = 2
            goto L_0x01b3
        L_0x0187:
            r1 = 1
            r9 = r2[r9]
            java.lang.Object r9 = r12.get()
            fa9 r9 = (defpackage.fa9) r9
            mqd r12 = new mqd
            r1 = 3
            r12.<init>(r1)
            r9.x(r3, r8, r12)
            r8 = 2
            r2 = r2[r8]
            hs7 r2 = r11.c
            java.lang.Object r2 = r2.get()
            r16 = r2
            gl5 r16 = (defpackage.gl5) r16
            java.lang.String r2 = r10.q
            r17 = r13
            r18 = r3
            r20 = r14
            r22 = r2
            r16.c(r17, r18, r20, r22)
        L_0x01b3:
            r2 = r8
            r4 = r26
            r8 = r27
            r3 = 1
            goto L_0x005c
        L_0x01bb:
            r26 = r4
            fa9 r1 = r28.o()
            oa9 r2 = defpackage.oa9.SENDING
            r3 = r26
            r1.z(r3, r2)
            r0.B(r5, r7)
            hud r1 = r0.a
            if (r1 == 0) goto L_0x01d1
            r9 = r1
            goto L_0x01d2
        L_0x01d1:
            r9 = 0
        L_0x01d2:
            kotlin.Lazy r1 = r9.c
            java.lang.Object r1 = r1.getValue()
            sv0 r1 = (defpackage.sv0) r1
            twf r8 = new twf
            long r6 = r0.y0
            r3 = 0
            long r4 = r0.c
            r2 = r8
            r2.<init>(r3, r4, r6)
            r1.c(r8)
            goto L_0x01f0
        L_0x01e9:
            java.lang.String r0 = "yud"
            java.lang.String r1 = "process: skip deleted message"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yud.z():void");
    }

    public yud(xud xud) {
        super(xud);
        this.y0 = xud.m;
    }
}
