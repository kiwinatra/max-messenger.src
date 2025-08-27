package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: gsb  reason: default package */
public final class gsb {
    public final yva a;
    public final km3 b;
    public final jtb c;
    public final ha9 d;
    public final rk e;
    public a32 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public String m;
    public d84 n;
    public boolean o;
    public boolean p;
    public boolean q;

    public gsb(yva yva, km3 km3, jtb jtb, ha9 ha9, a32 a32, rk rkVar) {
        this.a = yva;
        this.b = km3;
        this.c = jtb;
        this.d = ha9;
        this.e = rkVar;
        if (a32 != null) {
            i(a32);
            return;
        }
        e();
        g();
        f();
        d(yva.i());
    }

    public final String a(a32 a32, ha9 ha9) {
        boolean q2 = ((ltb) this.c).c.q();
        boolean o2 = ha9.o();
        String str = ha9.y;
        if (!o2) {
            return str;
        }
        if (!ha9.F() && !cvg.A(str)) {
            return str;
        }
        yva yva = this.a;
        if (a32 == null || a32.K() || a32.N() || a32.R()) {
            return yva.f.f(yva.a, yva, ha9, false, false, false, q2, yva.c.s(), true);
        }
        String f2 = yva.f.f(yva.a, yva, ha9, false, false, false, q2, yva.c.s(), true);
        yva.f.f(yva.a, yva, ha9, false, false, false, q2, yva.c.s(), true);
        return f2;
    }

    public final CharSequence b() {
        d(this.a.i());
        return this.h;
    }

    public final CharSequence c(a32 a32) {
        this.f = a32;
        yva yva = this.a;
        j(a32, yva.h(), yva.e());
        return this.i;
    }

    public final void d(int i2) {
        vk3 p2 = this.b.p(this.d.w, true);
        if (this.h == null) {
            this.h = this.a.k.e(p2.f(), i2);
        }
    }

    public final void e() {
        if (this.n == null) {
            ha9 ha9 = this.d;
            this.n = d84.g(ha9.p() ? ha9.R0.a : ha9.m(), TimeZone.getDefault());
        }
    }

    public final void f() {
        String str;
        if (this.l == null) {
            e();
            d84 d84 = this.n;
            yva yva = this.a;
            Locale u = yva.c.u();
            d84 g2 = d84.g(System.currentTimeMillis(), TimeZone.getDefault());
            boolean U = j4b.U(g2, d84);
            Context context = yva.a;
            if (U) {
                str = context.getString(tmc.tt_dates_today);
            } else {
                d84.f();
                Integer num = d84.c;
                d84.f();
                d84 l2 = new d84(d84.a, d84.b, num, (Integer) null, (Integer) null, (Integer) null, 0).l(1);
                g2.f();
                Integer num2 = g2.c;
                g2.f();
                if (l2.equals(new d84(g2.a, g2.b, num2, (Integer) null, (Integer) null, (Integer) null, 0))) {
                    str = context.getString(tmc.tt_dates_yesterday);
                } else {
                    long h2 = d84.h(TimeZone.getDefault());
                    str = g2.a.equals(d84.a) ? j4b.A(u, h2, false) : j4b.A(u, h2, true);
                }
            }
            this.l = str;
        }
    }

    public final void g() {
        if (this.k == null) {
            ha9 ha9 = this.d;
            long m2 = ha9.p() ? ha9.R0.a : ha9.m();
            yva yva = this.a;
            this.k = j4b.s(yva.a, m2, yva.c.u());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.a32 r17) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r0.p
            if (r1 != 0) goto L_0x006c
            ha9 r1 = r0.d
            boolean r2 = r1.z()
            jtb r3 = r0.c
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x001f
            if (r2 == 0) goto L_0x001d
            r6 = r3
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            r6.getClass()
            goto L_0x001f
        L_0x001d:
            r6 = r4
            goto L_0x0020
        L_0x001f:
            r6 = r5
        L_0x0020:
            java.lang.CharSequence r7 = r0.g
            boolean r7 = defpackage.cvg.A(r7)
            if (r7 != 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            java.lang.CharSequence r9 = r0.g
            if (r17 == 0) goto L_0x003c
            boolean r6 = r17.L()
            if (r6 != 0) goto L_0x003a
            boolean r6 = r17.R()
            if (r6 == 0) goto L_0x003c
        L_0x003a:
            r10 = r5
            goto L_0x003d
        L_0x003c:
            r10 = r4
        L_0x003d:
            if (r17 == 0) goto L_0x0047
            boolean r6 = r17.o0()
            if (r6 == 0) goto L_0x0047
            r12 = r5
            goto L_0x0048
        L_0x0047:
            r12 = r4
        L_0x0048:
            r13 = r2 ^ 1
            java.util.List r14 = r1.P0
            long r1 = r1.w
            ltb r3 = (defpackage.ltb) r3
            a33 r3 = r3.a
            long r6 = r3.s()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x005c
            r15 = r5
            goto L_0x005d
        L_0x005c:
            r15 = r4
        L_0x005d:
            yva r8 = r0.a
            r11 = 1
            java.lang.CharSequence r1 = r8.a(r9, r10, r11, r12, r13, r14, r15)
            java.lang.CharSequence r1 = defpackage.ld8.p0(r1)
            r0.g = r1
        L_0x006a:
            r0.p = r5
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.h(a32):void");
    }

    public final void i(a32 a32) {
        this.f = a32;
        yva yva = this.a;
        j(a32, yva.h(), yva.e());
        h(a32);
        e();
        g();
        f();
        d(yva.i());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.a32 r24, int r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            ha9 r2 = r0.d
            boolean r3 = r2.z()
            r13 = 0
            km3 r14 = r0.b
            r15 = 1
            yva r11 = r0.a
            long r9 = r2.w
            if (r3 == 0) goto L_0x004d
            if (r1 == 0) goto L_0x0047
            boolean r6 = r24.K()
            vk3 r8 = r14.p(r9, r15)
            kotlin.Lazy r3 = r11.d
            java.lang.Object r3 = r3.getValue()
            r5 = r3
            km3 r5 = (defpackage.km3) r5
            a33 r3 = r11.c
            long r16 = r3.s()
            r12 = 0
            android.content.Context r3 = r11.a
            r18 = 0
            r4 = r11
            r7 = r2
            r19 = r9
            r9 = r18
            r10 = r12
            r18 = r11
            r11 = r16
            java.lang.CharSequence r3 = defpackage.ghf.k(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0055
        L_0x0047:
            r19 = r9
            r18 = r11
            r3 = r13
            goto L_0x0055
        L_0x004d:
            r19 = r9
            r18 = r11
            java.lang.String r3 = r0.a(r1, r2)
        L_0x0055:
            boolean r4 = r2.z()
            r10 = 0
            if (r4 == 0) goto L_0x009a
            boolean r4 = defpackage.cvg.A(r3)
            if (r4 != 0) goto L_0x009a
            java.lang.String r4 = r3.toString()
            q10 r5 = r2.f()
            r3 = 0
            r11 = r19
            vk3 r6 = r14.p(r11, r3)
            r18.getClass()
            p10 r3 = r5.a
            int r3 = r3.ordinal()
            switch(r3) {
                case 1: goto L_0x0093;
                case 2: goto L_0x0081;
                case 3: goto L_0x0081;
                case 4: goto L_0x0093;
                case 5: goto L_0x0093;
                case 6: goto L_0x0093;
                case 7: goto L_0x007d;
                case 8: goto L_0x0093;
                default: goto L_0x007d;
            }
        L_0x007d:
            r3 = r4
            r14 = r18
            goto L_0x009e
        L_0x0081:
            r14 = r18
            kotlin.Lazy r3 = r14.d
            java.lang.Object r3 = r3.getValue()
            r8 = r3
            km3 r8 = (defpackage.km3) r8
            r7 = r14
            r9 = r10
            android.text.SpannableStringBuilder r3 = defpackage.ghf.b(r4, r5, r6, r7, r8, r9)
            goto L_0x009e
        L_0x0093:
            r14 = r18
            java.lang.CharSequence r3 = defpackage.ghf.a(r4, r6, r14, r10)
            goto L_0x009e
        L_0x009a:
            r14 = r18
            r11 = r19
        L_0x009e:
            boolean r4 = defpackage.cvg.A(r3)
            if (r4 != 0) goto L_0x0134
            r2.z()
            u25 r4 = r14.k
            r5 = r25
            java.lang.CharSequence r4 = r4.e(r3, r5)
            java.lang.CharSequence r4 = defpackage.ld8.q0(r4)
            r0.g = r4
            boolean r4 = r2.o()
            if (r4 != 0) goto L_0x00dc
            java.lang.CharSequence r4 = r0.g
            u25 r6 = r14.k
            java.util.List r4 = r6.a(r4)
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x00dc
            int r4 = r4.size()
            r6 = 3
            if (r4 > r6) goto L_0x00dc
            java.lang.CharSequence r4 = r0.g
            u25 r6 = r14.k
            boolean r4 = r6.f(r4)
            if (r4 == 0) goto L_0x00dc
            r4 = r15
            goto L_0x00dd
        L_0x00dc:
            r4 = r10
        L_0x00dd:
            jtb r6 = r0.c
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00ee
            r20 = r15
            goto L_0x00f0
        L_0x00ee:
            r20 = r10
        L_0x00f0:
            java.lang.CharSequence r6 = r0.g
            rk r7 = r0.e
            boolean r22 = r7.a()
            r14.getClass()
            if (r6 != 0) goto L_0x00ff
            r5 = r13
            goto L_0x0111
        L_0x00ff:
            wa9 r19 = defpackage.wa9.a
            xva r7 = r14.o
            java.util.List r8 = r2.P0
            r16 = r7
            r17 = r6
            r18 = r8
            r21 = r25
            java.lang.CharSequence r5 = r16.a(r17, r18, r19, r20, r21, r22)
        L_0x0111:
            java.lang.CharSequence r5 = defpackage.ld8.q0(r5)
            r0.g = r5
            boolean r5 = r2.o()
            if (r5 != 0) goto L_0x0131
            if (r4 == 0) goto L_0x012e
            java.util.List r2 = r2.P0
            r4 = r26
            java.lang.CharSequence r2 = r14.l(r4, r3, r2)
            java.lang.CharSequence r2 = defpackage.ld8.q0(r2)
            r0.i = r2
            goto L_0x013a
        L_0x012e:
            r0.i = r13
            goto L_0x013a
        L_0x0131:
            r0.i = r13
            goto L_0x013a
        L_0x0134:
            java.lang.String r2 = ""
            r0.g = r2
            r0.i = r13
        L_0x013a:
            java.lang.CharSequence r2 = r0.g
            if (r1 == 0) goto L_0x01c6
            boolean r3 = r24.o0()
            if (r3 == 0) goto L_0x01c6
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 != 0) goto L_0x01c6
            boolean r1 = r24.N()
            if (r1 == 0) goto L_0x0153
            java.util.regex.Pattern r1 = defpackage.hhf.d
            goto L_0x0155
        L_0x0153:
            java.util.regex.Pattern r1 = defpackage.hhf.f
        L_0x0155:
            r14.getClass()
            java.util.regex.Pattern r3 = defpackage.nab.a
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r2)
            java.util.regex.Matcher r1 = r1.matcher(r4)
            r2 = r10
        L_0x0164:
            boolean r2 = r1.find(r2)
            if (r2 == 0) goto L_0x01c0
            java.util.regex.Matcher r2 = r3.matcher(r4)
            r5 = r10
        L_0x016f:
            boolean r6 = r2.find()
            if (r6 == 0) goto L_0x018f
            int r6 = r2.start()
            int r7 = r1.end()
            if (r6 > r7) goto L_0x018f
            java.lang.String r6 = r2.group()
            java.lang.String r7 = r1.group()
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x016f
            r5 = r15
            goto L_0x016f
        L_0x018f:
            if (r5 == 0) goto L_0x0196
            int r2 = r1.end()
            goto L_0x0164
        L_0x0196:
            java.lang.String r2 = r1.group()
            java.lang.String r5 = "/﻿"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x01bb
            java.lang.String r2 = r1.group()
            r6 = 47
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = r2.replace(r6, r5)
            int r5 = r1.start()
            int r6 = r1.end()
            r4.replace(r5, r6, r2)
        L_0x01bb:
            int r2 = r1.end()
            goto L_0x0164
        L_0x01c0:
            int r1 = defpackage.gge.a
            gge r2 = defpackage.sq6.A(r4, r15)
        L_0x01c6:
            r0.g = r2
            r0.o = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.j(a32, int, int):void");
    }
}
