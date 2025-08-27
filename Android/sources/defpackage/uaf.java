package defpackage;

/* renamed from: uaf  reason: default package */
public final class uaf implements vi7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vaf b;

    public /* synthetic */ uaf(vaf vaf, int i) {
        this.a = i;
        this.b = vaf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.k4d a(defpackage.otc r12) {
        /*
            r11 = this;
            java.lang.String r0 = "ClassCastException"
            java.lang.String r1 = "Host"
            r2 = 0
            int r3 = r11.a
            switch(r3) {
                case 0: goto L_0x009d;
                default: goto L_0x000a;
            }
        L_0x000a:
            r3 = 61453(0xf00d, float:8.6114E-41)
            android.net.TrafficStats.setThreadStatsTag(r3)
            y2d r3 = r12.f
            hr6 r4 = r3.a()
            vaf r5 = r11.b
            java.lang.String r5 = r5.h
            java.lang.Object r6 = r4.c
            e4 r6 = (defpackage.e4) r6
            java.lang.String r7 = "User-Agent"
            r6.y(r7, r5)
            vaf r5 = r11.b
            boolean r5 = r5.c
            if (r5 == 0) goto L_0x008e
            m57 r5 = r3.b
            java.lang.String r6 = r5.e
            vaf r7 = r11.b
            boolean r7 = r7.d(r6)
            if (r7 != 0) goto L_0x004d
            ru.ok.tamtam.util.HandledException r7 = new ru.ok.tamtam.util.HandledException
            java.lang.String r8 = r5.b()
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}
            java.lang.String r9 = "Http request behind the proxy. Host = %s, path = %s"
            r7.<init>(r9, r8)
            vaf r8 = r11.b
            m95 r8 = r8.b
            uta r8 = (defpackage.uta) r8
            r8.c(r7, r2)
        L_0x004d:
            vaf r7 = r11.b
            java.lang.String r7 = r7.f
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x006f
            ru.ok.tamtam.util.HandledException r7 = new ru.ok.tamtam.util.HandledException
            java.lang.String r8 = r5.b()
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}
            java.lang.String r9 = "Http request with direct proxy Host = %s, path = %s"
            r7.<init>(r9, r8)
            vaf r8 = r11.b
            m95 r8 = r8.b
            uta r8 = (defpackage.uta) r8
            r8.c(r7, r2)
        L_0x006f:
            vaf r2 = r11.b
            sd3 r5 = r5.f()
            m57 r3 = r3.b
            boolean r3 = r3.a
            defpackage.vaf.c(r2, r5, r3)
            m57 r2 = r5.c()
            vaf r11 = r11.b
            r11.getClass()
            java.lang.Object r11 = r4.c
            e4 r11 = (defpackage.e4) r11
            r11.y(r1, r6)
            r4.a = r2
        L_0x008e:
            y2d r11 = r4.c()     // Catch:{ ClassCastException -> 0x0097 }
            k4d r11 = r12.b(r11)     // Catch:{ ClassCastException -> 0x0097 }
            return r11
        L_0x0097:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r0)
            throw r11
        L_0x009d:
            y2d r3 = r12.f
            m57 r4 = r3.b
            vaf r5 = r11.b
            boolean r5 = r5.c
            r6 = 0
            java.lang.String r7 = "TAM_TAM_ORIGINAL_HOST"
            if (r5 == 0) goto L_0x0110
            java.util.List r5 = r4.h
            if (r5 != 0) goto L_0x00b0
        L_0x00ae:
            r2 = r6
            goto L_0x00e9
        L_0x00b0:
            int r8 = r5.size()
            kotlin.ranges.IntRange r2 = kotlin.ranges.RangesKt.until((int) r2, (int) r8)
            r8 = 2
            kotlin.ranges.IntProgression r2 = kotlin.ranges.RangesKt.step((kotlin.ranges.IntProgression) r2, (int) r8)
            int r8 = r2.getFirst()
            int r9 = r2.getLast()
            int r2 = r2.getStep()
            if (r2 < 0) goto L_0x00ce
            if (r8 > r9) goto L_0x00ae
            goto L_0x00d0
        L_0x00ce:
            if (r8 < r9) goto L_0x00ae
        L_0x00d0:
            java.lang.Object r10 = r5.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00e5
            int r8 = r8 + 1
            java.lang.Object r2 = r5.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00e9
        L_0x00e5:
            if (r8 == r9) goto L_0x00ae
            int r8 = r8 + r2
            goto L_0x00d0
        L_0x00e9:
            boolean r5 = defpackage.cvg.A(r2)
            if (r5 != 0) goto L_0x0110
            sd3 r4 = r4.f()
            r4.q(r7)
            m57 r4 = r4.c()
            vaf r5 = r11.b
            hr6 r3 = r3.a()
            r5.getClass()
            java.lang.Object r5 = r3.c
            e4 r5 = (defpackage.e4) r5
            r5.y(r1, r2)
            r3.a = r4
            y2d r3 = r3.c()
        L_0x0110:
            k4d r12 = r12.b(r3)     // Catch:{ ClassCastException -> 0x018f }
            vaf r0 = r11.b
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x018e
            int r0 = r12.o
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0128
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0128
            switch(r0) {
                case 300: goto L_0x0128;
                case 301: goto L_0x0128;
                case 302: goto L_0x0128;
                case 303: goto L_0x0128;
                default: goto L_0x0127;
            }
        L_0x0127:
            goto L_0x018e
        L_0x0128:
            lx6 r0 = r12.w
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.b(r1)
            if (r0 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = r6
        L_0x0134:
            boolean r2 = defpackage.cvg.A(r0)
            java.lang.String r4 = "vaf"
            if (r2 == 0) goto L_0x0142
            java.lang.String r11 = "Redirect, but Location is empty"
            defpackage.z68.f(r4, r11, r6)
            goto L_0x018e
        L_0x0142:
            sd3 r2 = new sd3     // Catch:{ IllegalArgumentException -> 0x014f }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x014f }
            r2.n(r6, r0)     // Catch:{ IllegalArgumentException -> 0x014f }
            m57 r2 = r2.c()     // Catch:{ IllegalArgumentException -> 0x014f }
            goto L_0x0150
        L_0x014f:
            r2 = r6
        L_0x0150:
            if (r2 != 0) goto L_0x0166
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't parse location "
            r11.<init>(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            defpackage.z68.f(r4, r11, r6)
            goto L_0x018e
        L_0x0166:
            java.lang.String r0 = r2.e
            vaf r11 = r11.b
            sd3 r2 = r2.f()
            m57 r3 = r3.b
            boolean r3 = r3.a
            defpackage.vaf.c(r11, r2, r3)
            r2.q(r7)
            r2.b(r7, r0)
            m57 r11 = r2.c()
            j4d r12 = r12.m()
            java.lang.String r11 = r11.j
            e4 r0 = r12.f
            r0.y(r1, r11)
            k4d r12 = r12.a()
        L_0x018e:
            return r12
        L_0x018f:
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uaf.a(otc):k4d");
    }
}
