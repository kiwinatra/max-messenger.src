package ru.ok.messages.views.fragments.base;

public abstract class FrgBaseProfileLinkDescription extends FrgBaseProfile implements ny7 {
    public abstract String B3();

    public abstract String C3();

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X(java.lang.String r16, defpackage.sy7 r17, android.text.style.ClickableSpan r18, android.view.View r19) {
        /*
            r15 = this;
            r0 = r15
            r3 = r16
            vk3 r1 = r15.l3()
            a32 r2 = r15.k3()
            int r4 = r17.ordinal()
            r5 = 1
            if (r4 == 0) goto L_0x00da
            if (r4 == r5) goto L_0x00ae
            r5 = 2
            if (r4 == r5) goto L_0x0019
            goto L_0x0225
        L_0x0019:
            if (r2 == 0) goto L_0x0059
            sjd r1 = r0.q1
            r62 r1 = r1.g()
            m5 r4 = r15.X2()
            sjd r0 = r0.q1
            jqg r0 = r0.A()
            long r11 = r2.a
            a32 r1 = r1.G(r11)
            if (r1 == 0) goto L_0x0225
            java.util.regex.Pattern r1 = defpackage.hhf.f
            java.util.regex.Pattern r2 = defpackage.nab.a
            java.lang.String r8 = defpackage.hhf.d(r3, r1)
            kvd r1 = new kvd
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            r9 = 0
            r5 = r1
            r6 = r11
            r5.<init>(r6, r8, r9, r10)
            mvd r2 = new mvd
            r2.<init>(r1)
            r0.a(r2)
            t5 r0 = new t5
            r0.<init>(r11)
            defpackage.q5.T(r4, r0)
            goto L_0x0225
        L_0x0059:
            if (r1 == 0) goto L_0x00a5
            sjd r2 = r0.q1
            r62 r6 = r2.g()
            long r7 = r1.r()
            m5 r4 = r15.X2()
            sjd r0 = r0.q1
            jqg r5 = r0.A()
            a32 r0 = r6.K(r7)
            if (r0 != 0) goto L_0x0083
            cr0 r9 = new cr0
            r0 = r9
            r1 = r7
            r3 = r16
            r0.<init>(r1, r3, r4, r5)
            r6.P(r7, r9)
            goto L_0x0225
        L_0x0083:
            java.util.regex.Pattern r1 = defpackage.hhf.d
            java.util.regex.Pattern r2 = defpackage.nab.a
            java.lang.String r12 = defpackage.hhf.d(r3, r1)
            kvd r1 = new kvd
            java.util.List r14 = kotlin.collections.CollectionsKt.emptyList()
            r13 = 0
            long r10 = r0.a
            r9 = r1
            r9.<init>(r10, r12, r13, r14)
            mvd r0 = new mvd
            r0.<init>(r1)
            r5.a(r0)
            defpackage.q5.U(r4, r7)
            goto L_0x0225
        L_0x00a5:
            java.lang.String r0 = r0.B1
            java.lang.String r1 = "onLinkClick: didn't find contact or chat for handle click on botCommand in Profile"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x0225
        L_0x00ae:
            androidx.fragment.app.b r4 = r15.M1()
            if (r2 == 0) goto L_0x00c2
            t5 r0 = new t5
            long r1 = r2.a
            r0.<init>(r1)
            r0.g = r3
            defpackage.q5.T(r4, r0)
            goto L_0x0225
        L_0x00c2:
            if (r1 == 0) goto L_0x0225
            sjd r0 = r0.q1
            r62 r0 = r0.g()
            long r1 = r1.r()
            ib4 r5 = new ib4
            r6 = 19
            r5.<init>(r6, r4, r3)
            r0.P(r1, r5)
            goto L_0x0225
        L_0x00da:
            if (r2 != 0) goto L_0x00ec
            if (r1 == 0) goto L_0x00ec
            sjd r2 = r0.q1
            r62 r2 = r2.g()
            long r6 = r1.r()
            a32 r2 = r2.K(r6)
        L_0x00ec:
            r1 = 0
            if (r2 != 0) goto L_0x010f
            ig6 r2 = new ig6
            java.lang.String r4 = "chat is null when clicked on link "
            java.lang.String r3 = defpackage.a81.m(r4, r3)
            r2.<init>(r3)
            dm4 r0 = r0.p1
            java.lang.Object r0 = r0.b
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            f8f r0 = r0.E()
            e24 r0 = r0.d()
            r0.a(r1, r2)
            goto L_0x0225
        L_0x010f:
            m5 r4 = r15.X2()
            sjd r0 = r0.q1
            nd r6 = r0.c()
            java.lang.String r7 = "MESSAGE_LINK_OPEN"
            java.lang.String r8 = "text"
            r6.f(r7, r8)
            fz7 r6 = defpackage.fz7.q
            boolean r7 = android.text.TextUtils.isEmpty(r16)
            if (r7 == 0) goto L_0x0129
            goto L_0x014d
        L_0x0129:
            java.util.regex.Pattern r7 = defpackage.hhf.a
            java.util.regex.Matcher r7 = r7.matcher(r3)
            boolean r8 = r7.matches()
            if (r8 != 0) goto L_0x0136
            goto L_0x014d
        L_0x0136:
            java.lang.String r7 = r7.group()
            int r7 = r7.length()
            int r8 = r16.length()
            if (r7 != r8) goto L_0x014d
            java.lang.String r3 = r6.a(r3)
            android.net.Uri r7 = android.net.Uri.parse(r3)
            goto L_0x0151
        L_0x014d:
            android.net.Uri r7 = android.net.Uri.parse(r16)
        L_0x0151:
            boolean r8 = r6.e(r7)
            r9 = 0
            if (r8 != 0) goto L_0x015e
            defpackage.gsg.s(r4, r9, r3)
            goto L_0x0225
        L_0x015e:
            java.lang.String r7 = r7.getScheme()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0180
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "https://"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.toString()
        L_0x0180:
            r62 r7 = r0.g()
            km3 r8 = r0.i()
            q4 r11 = r0.getAccessor()
            java.lang.Class<u82> r12 = defpackage.u82.class
            java.lang.Object r11 = r11.g(r12)
            u82 r11 = (defpackage.u82) r11
            boolean r12 = defpackage.cvg.A(r3)
            if (r12 == 0) goto L_0x019b
            goto L_0x01a3
        L_0x019b:
            android.net.Uri r1 = android.net.Uri.parse(r3)
            dz7 r1 = r6.c(r1, r7, r8, r11)
        L_0x01a3:
            if (r1 == 0) goto L_0x01f0
            long r6 = r1.c
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x01f0
            boolean r1 = r4.Z
            if (r1 != 0) goto L_0x01b1
            goto L_0x0225
        L_0x01b1:
            boolean r1 = r2.N()
            r3 = 0
            if (r1 == 0) goto L_0x01ce
            vk3 r1 = r2.m()
            long r1 = r1.r()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01ce
            int r0 = defpackage.qad.J3
            java.lang.String r0 = r4.getString(r0)
            defpackage.hi7.b0(r3, r4, r0)
            goto L_0x0225
        L_0x01ce:
            jtb r0 = r0.u()
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            long r0 = r0.s()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01e6
            int r0 = defpackage.q5.z0
            uk2 r0 = defpackage.uk2.DEFAULT
            defpackage.q5.W(r4, r6, r5, r0)
            goto L_0x0225
        L_0x01e6:
            int r0 = defpackage.qad.E8
            java.lang.String r0 = r4.getString(r0)
            defpackage.hi7.b0(r3, r4, r0)
            goto L_0x0225
        L_0x01f0:
            if (r1 == 0) goto L_0x0204
            long r5 = r1.o
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0204
            ype r8 = defpackage.ype.SET
            r9 = 1
            long r0 = r2.a
            r3 = r4
            r4 = r5
            r6 = r0
            defpackage.v6.U(r3, r4, r6, r8, r9)
            goto L_0x0225
        L_0x0204:
            long r5 = r2.a
            if (r1 == 0) goto L_0x0222
            long r0 = r1.a
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0222
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0213
            goto L_0x0222
        L_0x0213:
            boolean r0 = r2.K()
            if (r0 == 0) goto L_0x021c
            int r0 = defpackage.qad.H3
            goto L_0x021e
        L_0x021c:
            int r0 = defpackage.qad.I3
        L_0x021e:
            defpackage.hi7.a0(r0, r4)
            goto L_0x0225
        L_0x0222:
            defpackage.gsg.s(r4, r5, r3)
        L_0x0225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription.X(java.lang.String, sy7, android.text.style.ClickableSpan, android.view.View):void");
    }
}
